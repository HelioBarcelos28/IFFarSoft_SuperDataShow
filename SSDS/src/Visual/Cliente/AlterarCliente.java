/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AlterarCliente.java
 *
 * Created on 20/06/2014, 20:11:04
 */
package Visual;
import Controle.ClienteControle;
import Model.cliente;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author helio
 */
public class AlterarCliente extends javax.swing.JPanel {

    /** Creates new form AlterarCliente */
    public AlterarCliente() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jRadioButtonSexoF = new javax.swing.JRadioButton();
        jRadioButtonSexoM = new javax.swing.JRadioButton();
        jButtonLimpar = new javax.swing.JButton();
        jComboBoxDia = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jComboBoxAno = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTipoServico = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldIdcliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonLimparBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true), "Alterar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 102, 0))); // NOI18N

        jLabel1.setText("<html>Nome:<font color=\"red\"><b>*</b></font>");

        jLabel2.setText("<html>Cpf:<font color=\"red\"><b>*</b></font>");

        jLabel3.setText("<html>Sexo:<font color=\"red\"><b>*</b></font>");

        jLabel4.setText("<html>Data de Nascimento:<font color=\"red\"><b>*</b></font>");

        jLabel5.setText("<html>Cidade:<font color=\"red\"><b>*</b></font>");

        jLabel6.setText("Endereço:");

        jLabel7.setText("Telefone:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jTextFieldCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCidadeKeyTyped(evt);
            }
        });

        jTextFieldEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEnderecoKeyTyped(evt);
            }
        });

        jTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefoneKeyTyped(evt);
            }
        });

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });
        jFormattedTextFieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCPFKeyTyped(evt);
            }
        });

        buttonGroupSexo.add(jRadioButtonSexoF);
        jRadioButtonSexoF.setSelected(true);
        jRadioButtonSexoF.setText("F");

        buttonGroupSexo.add(jRadioButtonSexoM);
        jRadioButtonSexoM.setText("M");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ano" }));

        jLabel9.setText("<html><font color=\"red\"><b>*</b></font>Campos Obrigatórios");

        jLabel8.setText("Tipo de Serviço:");

        jComboBoxTipoServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Elétricista", "Bombeiro Hidráulico", "Pintura", "Pedreiro", "Marceneiro", "Jardinagem", "Montagem e Reparos", " " }));
        jComboBoxTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoServicoActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar_1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setText("Código:");

        jTextFieldIdcliente.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSexoF)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonSexoM))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addComponent(jComboBoxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonSexoF)
                    .addComponent(jRadioButtonSexoM)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButtonLimpar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        GregorianCalendar data = new GregorianCalendar();
        int ano = data.get (GregorianCalendar.YEAR);

        while (ano>=1900){

            jComboBoxAno.addItem(""+ano);
            ano--;
        }

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));

        jButtonLimparBusca.setText("Limpar Busca");
        jButtonLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparBuscaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idcliente", "Nome", "Tipo de Serviço", "Cpf", "Sexo", "Data de Nascimento", "Cidade", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(7).setMinWidth(0);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(8).setMinWidth(0);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jLabel11.setText("Buscar Cliente");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButtonLimparBusca))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimparBusca)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("AlterarCliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldNomeActionPerformed

private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
    if (jTextFieldNome.getText().length() >= 50) {
        evt.consume();
    }
}//GEN-LAST:event_jTextFieldNomeKeyTyped

private void jTextFieldCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCidadeKeyTyped
    if (jTextFieldCidade.getText().length() >= 30) {
        evt.consume();
    }
}//GEN-LAST:event_jTextFieldCidadeKeyTyped

private void jTextFieldEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoKeyTyped
    if (jTextFieldEndereco.getText().length() >= 30) {
        evt.consume();
    }
}//GEN-LAST:event_jTextFieldEnderecoKeyTyped

private void jTextFieldTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneKeyTyped
    if (jTextFieldTelefone.getText().length() >= 15) {
        evt.consume();
    }
    
    String caracteres = "0987654321";
    if (!caracteres.contains(evt.getKeyChar() + "")) {
        evt.consume();
    }
}//GEN-LAST:event_jTextFieldTelefoneKeyTyped

private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

private void jFormattedTextFieldCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFKeyTyped

}//GEN-LAST:event_jFormattedTextFieldCPFKeyTyped

private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
    jTextFieldIdcliente.setText("");
    jTextFieldNome.setText("");
    jFormattedTextFieldCPF.setText("");
    jRadioButtonSexoF.setSelected(true);
    jComboBoxDia.setSelectedIndex(0);
    jComboBoxMes.setSelectedIndex(0);
    jComboBoxAno.setSelectedIndex(0);
    jComboBoxTipoServico.setSelectedIndex(0);
    jTextFieldCidade.setText("");
    jTextFieldEndereco.setText("");
    jTextFieldTelefone.setText("");
}//GEN-LAST:event_jButtonLimparActionPerformed

private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBoxDiaActionPerformed

private void jComboBoxTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoServicoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBoxTipoServicoActionPerformed

private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

    JanelaPrincipal.colocarPanelPrincipal();// TODO add your handling code here:
}//GEN-LAST:event_jLabel10MouseClicked

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String validacao = "Campos Obrigatórios";
    int flag = 0;

    if (jTextFieldNome.getText().isEmpty()) {
        validacao = validacao + "\n * Preencha o campo nome";
        flag = 1;
    }
    
    if (jFormattedTextFieldCPF.getText().equals("   .   .   -  ")){
        validacao = validacao + "\n * Preencha o campo CPF";
        flag = 1;
    }
    
    if (jComboBoxDia.getSelectedIndex() == 0){
        validacao = validacao + "\n * Preencha o campo dia de nascimento";
        flag = 1;
    }
    
    if (jComboBoxMes.getSelectedIndex() == 0){
        validacao = validacao + "\n * Preencha o campo mês de nascimento";
        flag = 1;
    }
    
    if (jComboBoxAno.getSelectedIndex() == 0){
        validacao = validacao + "\n * Preencha o campo ano de nascimento";
        flag = 1;
    }

    if (jTextFieldCidade.getText().isEmpty()) {
        validacao = validacao + "\n * Preencha o campo cidade";
        flag = 1;
    }
    
        if (flag == 1){
        JOptionPane.showMessageDialog(null, validacao);
    } else {
        }
   
            
           try {
        if (jTable1.getSelectedRow() != -1) {
            cliente   X = new cliente();
            ClienteControle    BancoDados = new ClienteControle();
           
            X.setIdcliente(Integer.parseInt(jTextFieldIdcliente.getText()));
            
            X.setNome(jTextFieldNome.getText());
            
            X.setTiposervico(jComboBoxTipoServico.getSelectedItem()+"");
            
            X.setCpf(jFormattedTextFieldCPF.getText());
            
            if (jRadioButtonSexoF.isSelected()) {
        X.setSexo("F");
        } else {
        X.setSexo("M");
        }
           
             
           X.setDatanasc(jComboBoxDia.getSelectedItem()+"/"+jComboBoxMes.getSelectedItem()+"/"+jComboBoxAno.getSelectedItem()+"");
            
            X.setCidade(jTextFieldCidade.getText());
            
            X.setEndereco(jTextFieldEndereco.getText());
            
            X.setTelefone(jTextFieldTelefone.getText());
            
            
                 

            //COPIE O COMANDO ACIMA E COLE UM PARA CAMPO DO FORM

           BancoDados.altera(X);
            javax.swing.table.DefaultTableModel dtm = // para atualizar a tabela
                    (javax.swing.table.DefaultTableModel) jTable1.getModel();
            dtm.setValueAt(Integer.parseInt(jTextFieldIdcliente.getText()), jTable1.getSelectedRow(), 0);
            dtm.setValueAt(jTextFieldNome.getText(), jTable1.getSelectedRow(), 1);
            dtm.setValueAt(jComboBoxTipoServico.getSelectedItem(), jTable1.getSelectedRow(), 2);
            dtm.setValueAt(jFormattedTextFieldCPF.getText(), jTable1.getSelectedRow(), 3);
            if (jRadioButtonSexoF.isSelected()){
                dtm.setValueAt("sexo", jTable1.getSelectedRow(), 4);
            } else{
                dtm.setValueAt("sexo", jTable1.getSelectedRow(), 4);
            }
            
            dtm.setValueAt(jComboBoxDia.getSelectedItem()+"/"+jComboBoxMes.getSelectedItem()+"/"+jComboBoxAno.getSelectedItem(), jTable1.getSelectedRow(), 5);
           
            dtm.setValueAt(jTextFieldCidade.getText(), jTable1.getSelectedRow(), 6);
            dtm.setValueAt(jTextFieldEndereco.getText(), jTable1.getSelectedRow(), 7);
            dtm.setValueAt(jTextFieldTelefone.getText(), jTable1.getSelectedRow(), 8);
//COPIE O COMANDO ACIMA E COLE UM PARA CAMPO DO FORM

              JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro no banco:\n" + ex.getMessage());
    }
        
        
    
        

    // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void jButtonLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparBuscaActionPerformed
jTextFieldBusca.setText("");
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    for (int i = dtm.getRowCount(); i > 0; i--) {
        dtm.removeRow(i - 1);
    }
   // TODO add your handling code here:
}//GEN-LAST:event_jButtonLimparBuscaActionPerformed

private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
  try {
        ClienteControle   X = new ClienteControle();
      
        List<cliente> cliente = X.getLista("%" + jTextFieldBusca.getText() + "%");
      
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        for (int i = dtm.getRowCount(); i > 0; i--) {
            dtm.removeRow(i - 1);
        }
        if (cliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados para essa busca");
        }
        for (int i = 0; i < cliente.size(); i++) {
            dtm.addRow(new Object[]{
                        cliente.get(i).getIdcliente(),
                        cliente.get(i).getNome(),
                        cliente.get(i).getTiposervico(),
                        cliente.get(i).getCpf(),
                        cliente.get(i).getSexo(),
                        cliente.get(i).getDatanasc(),
                        
                        cliente.get(i).getCidade(),
                        cliente.get(i).getEndereco(),
                        cliente.get(i).getTelefone(),

                        //COPIE E COLE O COMANDO ACIMA PARA CADA CAMPO
            });
        }
   }catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    // TODO add your handling code here:
}//GEN-LAST:event_jButtonPesquisarActionPerformed

private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
jTable1MouseClicked(null);
    // TODO add your handling code here:
}//GEN-LAST:event_jTable1KeyReleased

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int[] l = jTable1.getSelectedRows();
    if (l.length == 1) {
        try {

            jTextFieldIdcliente.setText(jTable1.getValueAt(l[0], 0) + "");
            
            jTextFieldNome.setText(jTable1.getValueAt(l[0], 1) + "");
            
            jComboBoxTipoServico.setSelectedItem(jTable1.getValueAt(l[0], 2)+ "");
            
            jFormattedTextFieldCPF.setText(jTable1.getValueAt(l[0], 3) + "");
            String sexo=jTable1.getValueAt(l[0], 4) + "";
             
               if (sexo.equals("M")) {
                    jRadioButtonSexoM.setSelected(true);
                } else {
                    jRadioButtonSexoF.setSelected(true);
                }
          
              
               String data=jTable1.getValueAt(l[0], 5) + "";
                String dia=data.substring(0,data.indexOf("/"));
               jComboBoxDia.setSelectedItem(dia);
                     String mes=data.substring(data.indexOf("/")+1,data.lastIndexOf("/"));
               jComboBoxMes.setSelectedItem(mes);
               String ano=data.substring(data.lastIndexOf("/")+1,data.length());
               jComboBoxAno.setSelectedItem(ano);
               
               
            jTextFieldCidade.setText(jTable1.getValueAt(l[0], 6) + "");
            
            jTextFieldEndereco.setText(jTable1.getValueAt(l[0], 7) + "");
            
            jTextFieldTelefone.setText(jTable1.getValueAt(l[0], 8) + "");
            
            
           
//copie e cole o comando acima para cada componente TextField do form. (Não esqueça de seguir a numeração no final)
            
           } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n" + e.getMessage());
        }
    }
    
    // TODO add your handling code here:
}//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLimparBusca;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxAno;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JComboBox jComboBoxTipoServico;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonSexoF;
    private javax.swing.JRadioButton jRadioButtonSexoM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdcliente;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
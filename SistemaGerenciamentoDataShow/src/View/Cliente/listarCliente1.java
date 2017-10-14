/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cliente;

import Controller.ClienteController;
import Controller.Conexao;
import Model.Cliente;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LucasMarcon
 */
public class listarCliente1 extends javax.swing.JPanel {

	/**
	 * Creates new form listarCliente1
	 */
	public listarCliente1() {

		initComponents();

		jTextField2.setVisible(false);
		jSeparator2.setVisible(false);

	}

	/**
	 * This method is called from within the
	 * constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The
	 * content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setBackground(new java.awt.Color(224, 224, 224));
        labelTitulo.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(224, 224, 224));
        labelTitulo.setText("Listagem de Clientes");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 230, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um campo", "Nome", "ID", "Estado", "Cep", "Razão Social", "CNPJ", "E-mail", "Telefone", "Rua", "Cidade" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 370, -1));

        jSeparator1.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 230, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Contato", "Razão Social", "CNPJ", "E-mail", "Telefone", "Estado", "Cidade", "Cep", "Rua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 490, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Buscar cliente: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel3.setText("ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 370, -1));

        jSeparator2.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 370, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel4.setText("Nome: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 153, 153));
        jTextField3.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 230, -1));

        jSeparator3.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 230, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel5.setText("Razão: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 153, 153));
        jTextField4.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 230, -1));

        jSeparator4.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 230, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel6.setText("Cnpj: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 153, 153));
        jTextField5.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 230, -1));

        jSeparator5.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 230, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel7.setText("E-mail: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(0, 153, 153));
        jTextField6.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 230, -1));

        jSeparator6.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 230, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel8.setText("Tel: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(0, 153, 153));
        jTextField7.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 230, -1));

        jSeparator7.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 230, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel9.setText("Estado: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(0, 153, 153));
        jTextField8.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 230, -1));

        jSeparator8.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 230, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel10.setText("Cidade: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(0, 153, 153));
        jTextField9.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField9.setBorder(null);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 230, -1));

        jSeparator9.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 230, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel11.setText("Cep: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(0, 153, 153));
        jTextField10.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 230, -1));

        jSeparator10.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 230, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jLabel12.setText("Rua: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(0, 153, 153));
        jTextField11.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextField11.setBorder(null);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 230, -1));

        jSeparator11.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 230, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

      private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

		if (!"Selecione um campo".equals(jComboBox1.getSelectedItem() + "")) { // Castzinho maroto

			jComboBox1.setVisible(false);
			jTextField2.setVisible(true);
			jSeparator2.setVisible(true);
		}
      }//GEN-LAST:event_jComboBox1ActionPerformed

	/* Essa função ao pressionar Enter depois de digitar no campo de texto para fazer uma busca, retorna uma lista ou vazio caso não haja resultados
	   Para retornar ao ComboBox de seleção de diferentes tipos de busca, basta pressionar F1 no teclado.*/
      private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed

		AbstractAction acaoEnter = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					Connection con = new Conexao().AbrirConexao();
					ClienteController cc = new ClienteController(con);
					List<Cliente> cliente = null;

					switch (jComboBox1.getSelectedItem().toString()) {

						case "": case "ID":

							cliente = cc.listarTodosClientes();
							break;
						case "Nome":

							cliente = cc.listarClientesEspecificosNomeContato(jTextField2.getText(), 0);
							break;
						case "Estado":

							cliente = cc.listarClientesEspecificosEstado(jTextField2.getText(), 0);
							break;
						case "Cep":

							cliente = cc.listarClientesEspecificosCep(jTextField2.getText(), 0);
							break;
						case "Razão Social":

							cliente = cc.listarClientesEspecificosRazaoSocial(jTextField2.getText(), 0);
							break;
						case "CNPJ":

							cliente = cc.listarClientesEspecificosCnpj(jTextField2.getText(), 0);
							break;
						case "E-mail":

							cliente = cc.listarClientesEspecificosEmail(jTextField2.getText(), 0);
							break;
						case "Telefone":

							cliente = cc.listarClientesEspecificosTelefone(jTextField2.getText(), 0);
							break;
						case "Rua":

							cliente = cc.listarClientesEspecificosRua(jTextField2.getText(), 0);
							break;
						case "Cidade":

							cliente = cc.listarClientesEspecificosCidade(jTextField2.getText(), 0);
							break;
					}

					if (cliente.isEmpty()) {

						JOptionPane.showMessageDialog(null, "Não existem dados para essa busca");
					} else {

						DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
						for (int i = dtm.getRowCount(); i > 0; i--) {

							dtm.removeRow(i - 1);
						}

						for (int i = 0; i < cliente.size(); i++) {

							dtm.addRow(new Object[]{
								cliente.get(i).getIdCliente(),
								cliente.get(i).getNomeContato(),
								cliente.get(i).getRazaoSocial(),
								cliente.get(i).getCnpj(),
								cliente.get(i).getEmail(),
								cliente.get(i).getTelefone(),
								cliente.get(i).getEstado(),
								cliente.get(i).getCidade(),
								cliente.get(i).getCep(),
								cliente.get(i).getRua(),});
						}
						
						jTextField2.setText("");
					}

				} catch (HeadlessException ex) {
					
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		};
		
		AbstractAction acaoF1 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jComboBox1.setVisible(true);
				jTextField2.setVisible(false);
				jSeparator2.setVisible(false);
			}
		};

		JTextField enter = jTextField2;
		enter.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "acaoEnter");
		enter.getActionMap().put("acaoEnter", acaoEnter);
		
		JTextField f1 = jTextField2;
		f1.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "acaoF1");
		f1.getActionMap().put("acaoF1", acaoF1);
      }//GEN-LAST:event_jTextField2KeyPressed
	
      private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

		int[] linha = jTable1.getSelectedRows();

		if (linha.length == 1) {

			try {

				jTextField1.setText(jTable1.getValueAt(linha[0], 0) + "");
				jTextField3.setText(jTable1.getValueAt(linha[0], 1) + "");
				jTextField4.setText(jTable1.getValueAt(linha[0], 2) + "");
				jTextField5.setText(jTable1.getValueAt(linha[0], 3) + "");
				jTextField6.setText(jTable1.getValueAt(linha[0], 4) + "");
				jTextField7.setText(jTable1.getValueAt(linha[0], 5) + "");
				jTextField8.setText(jTable1.getValueAt(linha[0], 6) + "");
				jTextField9.setText(jTable1.getValueAt(linha[0], 7) + "");
				jTextField10.setText(jTable1.getValueAt(linha[0], 8) + "");
				jTextField11.setText(jTable1.getValueAt(linha[0], 9) + "");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao popular tabela! " + e.getMessage());
			}
		}
      }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

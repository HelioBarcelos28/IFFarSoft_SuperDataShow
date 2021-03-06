/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Projetor;

import Controller.Conexao;
import Controller.ProjetorController;
import Model.Projetor;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author LucasMarcon
 */
public class inserirProjetor extends javax.swing.JPanel {

	/**
	 * Creates new form inserirProjetor
	 */
	public inserirProjetor() {
		initComponents();
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

            painelPrincipal = new javax.swing.JPanel();
            labelTitulo = new javax.swing.JLabel();
            labelMarca = new javax.swing.JLabel();
            textFieldMarca = new javax.swing.JTextField();
            separadorMarca = new javax.swing.JSeparator();
            labelModelo = new javax.swing.JLabel();
            textFieldModelo = new javax.swing.JTextField();
            separadorModelo = new javax.swing.JSeparator();
            labelNumeroSerie = new javax.swing.JLabel();
            textFieldNumeroSerie = new javax.swing.JTextField();
            separadorNumeroSerie = new javax.swing.JSeparator();
            labelEstado = new javax.swing.JLabel();
            separadorEstado = new javax.swing.JSeparator();
            labelPreco = new javax.swing.JLabel();
            textFieldPreco = new javax.swing.JTextField();
            separadorPreco = new javax.swing.JSeparator();
            labelDataCompra = new javax.swing.JLabel();
            textFieldDataCompra = new javax.swing.JTextField();
            separadorDataCompra = new javax.swing.JSeparator();
            separadorAnsiLumens = new javax.swing.JSeparator();
            textFieldAnsiLumens = new javax.swing.JTextField();
            labelAnsiLumens = new javax.swing.JLabel();
            comboBoxEstado = new javax.swing.JComboBox<>();
            botaoCadastrar = new javax.swing.JButton();
            botaoLimpar = new javax.swing.JButton();

            painelPrincipal.setBackground(new java.awt.Color(0, 153, 153));
            painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            labelTitulo.setBackground(new java.awt.Color(224, 224, 224));
            labelTitulo.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
            labelTitulo.setForeground(new java.awt.Color(224, 224, 224));
            labelTitulo.setText("Cadastro de Projetores");
            painelPrincipal.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

            labelMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelMarca.setText("Marca: ");
            painelPrincipal.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

            textFieldMarca.setBackground(new java.awt.Color(0, 153, 153));
            textFieldMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldMarca.setBorder(null);
            painelPrincipal.add(textFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 250, -1));

            separadorMarca.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 250, 10));

            labelModelo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelModelo.setText("Modelo: ");
            painelPrincipal.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

            textFieldModelo.setBackground(new java.awt.Color(0, 153, 153));
            textFieldModelo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldModelo.setBorder(null);
            painelPrincipal.add(textFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, -1));

            separadorModelo.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 250, 10));

            labelNumeroSerie.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelNumeroSerie.setText("Numero de série: ");
            painelPrincipal.add(labelNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

            textFieldNumeroSerie.setBackground(new java.awt.Color(0, 153, 153));
            textFieldNumeroSerie.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldNumeroSerie.setBorder(null);
            painelPrincipal.add(textFieldNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 250, -1));

            separadorNumeroSerie.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 250, 10));

            labelEstado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelEstado.setText("Estado: ");
            painelPrincipal.add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

            separadorEstado.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 250, 10));

            labelPreco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelPreco.setText("Preço: ");
            painelPrincipal.add(labelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

            textFieldPreco.setBackground(new java.awt.Color(0, 153, 153));
            textFieldPreco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldPreco.setBorder(null);
            painelPrincipal.add(textFieldPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 250, -1));

            separadorPreco.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 250, 10));

            labelDataCompra.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelDataCompra.setText("Data de compra: ");
            painelPrincipal.add(labelDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

            textFieldDataCompra.setBackground(new java.awt.Color(0, 153, 153));
            textFieldDataCompra.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldDataCompra.setBorder(null);
            painelPrincipal.add(textFieldDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 250, -1));

            separadorDataCompra.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorDataCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 250, 10));

            separadorAnsiLumens.setBackground(new java.awt.Color(224, 224, 224));
            painelPrincipal.add(separadorAnsiLumens, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 250, 10));

            textFieldAnsiLumens.setBackground(new java.awt.Color(0, 153, 153));
            textFieldAnsiLumens.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            textFieldAnsiLumens.setBorder(null);
            painelPrincipal.add(textFieldAnsiLumens, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 250, -1));

            labelAnsiLumens.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            labelAnsiLumens.setText("Ansi Lumens");
            painelPrincipal.add(labelAnsiLumens, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

            comboBoxEstado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o estado", "Disponível", "Locado", "Manutenção", "Fora de estoque" }));
            painelPrincipal.add(comboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 250, -1));

            botaoCadastrar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            botaoCadastrar.setText("Cadastrar");
            botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoCadastrarActionPerformed(evt);
                  }
            });
            painelPrincipal.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 120, -1));

            botaoLimpar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            botaoLimpar.setText("Limpar");
            botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        botaoLimparActionPerformed(evt);
                  }
            });
            painelPrincipal.add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 120, -1));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                        .addContainerGap())
            );
      }// </editor-fold>//GEN-END:initComponents

      private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
		
		textFieldAnsiLumens.setText("");
		textFieldDataCompra.setText("");
		textFieldMarca.setText("");
		textFieldModelo.setText("");
		textFieldNumeroSerie.setText("");
		textFieldPreco.setText("");
		comboBoxEstado.setSelectedIndex(0);
      }//GEN-LAST:event_botaoLimparActionPerformed

      private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
		
		Projetor projetor = new Projetor();
		Connection con = new Conexao().AbrirConexao();
		ProjetorController pc = new ProjetorController(con);
		
		boolean campoVazio = (textFieldAnsiLumens.getText().isEmpty() ? 
			               (textFieldDataCompra.getText().isEmpty() ? 
			               (textFieldMarca.getText().isEmpty() ? 
			               (textFieldModelo.getText().isEmpty() ? 
			               (textFieldNumeroSerie.getText().isEmpty() ? 
			               (textFieldPreco.getText().isEmpty()) : false) : false) : false) : false) : false);
		
		if (campoVazio) {
			
			JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
		} else {
			
			projetor.setMarca(textFieldMarca.getText());
			projetor.setModelo(textFieldModelo.getText());
			projetor.setNumeroSerie(textFieldNumeroSerie.getText());
			projetor.setDataCompra(textFieldDataCompra.getText());
			projetor.setAnsiLumens(textFieldAnsiLumens.getText());

			switch (comboBoxEstado.getSelectedIndex()) {
				
				case 1: 
					
					projetor.setEstado("D");
					break;
				case 2: 
					
					projetor.setEstado("L");
					break;
				case 3: 
					
					projetor.setEstado("M");
					break;
				case 4: 
					
					projetor.setEstado("FE");
					break;
			}
			
			projetor.setPreco(textFieldPreco.getText());
			projetor.setNumeroHorasUso("100");
			
			try {
				
				pc.inserirProjetor(projetor);
				JOptionPane.showMessageDialog(null, "Projetor cadastrado com sucesso!");
			} catch (HeadlessException e) { System.out.println("deu merda"); }
		}
      }//GEN-LAST:event_botaoCadastrarActionPerformed

	

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton botaoCadastrar;
      private javax.swing.JButton botaoLimpar;
      private javax.swing.JComboBox<String> comboBoxEstado;
      private javax.swing.JLabel labelAnsiLumens;
      private javax.swing.JLabel labelDataCompra;
      private javax.swing.JLabel labelEstado;
      private javax.swing.JLabel labelMarca;
      private javax.swing.JLabel labelModelo;
      private javax.swing.JLabel labelNumeroSerie;
      private javax.swing.JLabel labelPreco;
      private javax.swing.JLabel labelTitulo;
      private javax.swing.JPanel painelPrincipal;
      private javax.swing.JSeparator separadorAnsiLumens;
      private javax.swing.JSeparator separadorDataCompra;
      private javax.swing.JSeparator separadorEstado;
      private javax.swing.JSeparator separadorMarca;
      private javax.swing.JSeparator separadorModelo;
      private javax.swing.JSeparator separadorNumeroSerie;
      private javax.swing.JSeparator separadorPreco;
      private javax.swing.JTextField textFieldAnsiLumens;
      private javax.swing.JTextField textFieldDataCompra;
      private javax.swing.JTextField textFieldMarca;
      private javax.swing.JTextField textFieldModelo;
      private javax.swing.JTextField textFieldNumeroSerie;
      private javax.swing.JTextField textFieldPreco;
      // End of variables declaration//GEN-END:variables
}

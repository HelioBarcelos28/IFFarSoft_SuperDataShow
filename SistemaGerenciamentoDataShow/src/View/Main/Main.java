/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Main;

import View.Cliente.alterarCliente;
import View.Cliente.excluirCliente;
import View.Cliente.inserirCliente;
import View.Cliente.listarCliente;
import View.Projetor.alterarProjetor;
import View.Projetor.excluirProjetor;
import View.Projetor.inserirProjetor;
import View.Projetor.listarProjetor;
import javax.swing.JPanel;

/**
 *
 * @author LucasMarcon
 */
public class Main extends javax.swing.JFrame {

	/**
	 * Creates new form Main3
	 */
	public Main() {
		initComponents();
		navegarEntreTelas(new painelCorpo());
	}

	private void navegarEntreTelas(JPanel painel) {

		painelCorpo.removeAll();
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(painelCorpo);
		painelCorpo.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				 .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				 .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
            painelCabecalho = new javax.swing.JPanel();
            painelCabecalhoImagemProjetor = new javax.swing.JLabel();
            painelCabecalhoBotaoMenu = new javax.swing.JButton();
            painelCorpo = new javax.swing.JPanel();
            barraMenu = new javax.swing.JMenuBar();
            menuCadastrar = new javax.swing.JMenu();
            menuCadastrarClientes = new javax.swing.JMenuItem();
            menuCadastrarProjetores = new javax.swing.JMenuItem();
            menuCadastrarLocacoes = new javax.swing.JMenuItem();
            menuEdicao = new javax.swing.JMenu();
            menuEdicaoClientes = new javax.swing.JMenuItem();
            menuEdicaoProjetores = new javax.swing.JMenuItem();
            menuEdicaoLocacoes = new javax.swing.JMenuItem();
            menuListagem = new javax.swing.JMenu();
            menuListagemClientes = new javax.swing.JMenuItem();
            menuListagemProjetores = new javax.swing.JMenuItem();
            menuListagemLocacoes = new javax.swing.JMenuItem();
            menuExclusao = new javax.swing.JMenu();
            menuExclusaoClientes = new javax.swing.JMenuItem();
            menuExclusaoProjetores = new javax.swing.JMenuItem();
            menuExclusaoLocacao = new javax.swing.JMenuItem();
            menuAjuda = new javax.swing.JMenu();
            menuAjudaSobreSistema = new javax.swing.JMenuItem();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            painelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

            painelCabecalho.setBackground(new java.awt.Color(36, 46, 68));

            painelCabecalhoImagemProjetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/projector_white.png"))); // NOI18N

            painelCabecalhoBotaoMenu.setBackground(new java.awt.Color(36, 46, 68));
            painelCabecalhoBotaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menu_white.png"))); // NOI18N
            painelCabecalhoBotaoMenu.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        painelCabecalhoBotaoMenuActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
            painelCabecalho.setLayout(painelCabecalhoLayout);
            painelCabecalhoLayout.setHorizontalGroup(
                  painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCabecalhoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(painelCabecalhoBotaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(441, 441, 441)
                        .addComponent(painelCabecalhoImagemProjetor)
                        .addContainerGap(520, Short.MAX_VALUE))
            );
            painelCabecalhoLayout.setVerticalGroup(
                  painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(painelCabecalhoImagemProjetor, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCabecalhoBotaoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            painelCorpo.setBackground(new java.awt.Color(0, 0, 0));

            javax.swing.GroupLayout painelCorpoLayout = new javax.swing.GroupLayout(painelCorpo);
            painelCorpo.setLayout(painelCorpoLayout);
            painelCorpoLayout.setHorizontalGroup(
                  painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 0, Short.MAX_VALUE)
            );
            painelCorpoLayout.setVerticalGroup(
                  painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 476, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
            painelPrincipal.setLayout(painelPrincipalLayout);
            painelPrincipalLayout.setHorizontalGroup(
                  painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(painelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            painelPrincipalLayout.setVerticalGroup(
                  painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            menuCadastrar.setText("Cadastro");

            menuCadastrarClientes.setText("Clientes");
            menuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuCadastrarClientesActionPerformed(evt);
                  }
            });
            menuCadastrar.add(menuCadastrarClientes);

            menuCadastrarProjetores.setText("Projetores");
            menuCadastrarProjetores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuCadastrarProjetoresActionPerformed(evt);
                  }
            });
            menuCadastrar.add(menuCadastrarProjetores);

            menuCadastrarLocacoes.setText("Locações");
            menuCadastrar.add(menuCadastrarLocacoes);

            barraMenu.add(menuCadastrar);

            menuEdicao.setText("Edição");

            menuEdicaoClientes.setText("Clientes");
            menuEdicaoClientes.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuEdicaoClientesActionPerformed(evt);
                  }
            });
            menuEdicao.add(menuEdicaoClientes);

            menuEdicaoProjetores.setText("Projetores");
            menuEdicaoProjetores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuEdicaoProjetoresActionPerformed(evt);
                  }
            });
            menuEdicao.add(menuEdicaoProjetores);

            menuEdicaoLocacoes.setText("Locações");
            menuEdicao.add(menuEdicaoLocacoes);

            barraMenu.add(menuEdicao);

            menuListagem.setText("Listagem");

            menuListagemClientes.setText("Clientes");
            menuListagemClientes.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuListagemClientesActionPerformed(evt);
                  }
            });
            menuListagem.add(menuListagemClientes);

            menuListagemProjetores.setText("Projetores");
            menuListagemProjetores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuListagemProjetoresActionPerformed(evt);
                  }
            });
            menuListagem.add(menuListagemProjetores);

            menuListagemLocacoes.setText("Locações");
            menuListagem.add(menuListagemLocacoes);

            barraMenu.add(menuListagem);

            menuExclusao.setText("Exclusão");

            menuExclusaoClientes.setText("Clientes");
            menuExclusaoClientes.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuExclusaoClientesActionPerformed(evt);
                  }
            });
            menuExclusao.add(menuExclusaoClientes);

            menuExclusaoProjetores.setText("Projetores");
            menuExclusaoProjetores.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuExclusaoProjetoresActionPerformed(evt);
                  }
            });
            menuExclusao.add(menuExclusaoProjetores);

            menuExclusaoLocacao.setText("Locações");
            menuExclusaoLocacao.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        menuExclusaoLocacaoActionPerformed(evt);
                  }
            });
            menuExclusao.add(menuExclusaoLocacao);

            barraMenu.add(menuExclusao);

            menuAjuda.setText("Ajuda");

            menuAjudaSobreSistema.setText("Sobre o sistema");
            menuAjuda.add(menuAjudaSobreSistema);

            barraMenu.add(menuAjuda);

            setJMenuBar(barraMenu);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void menuCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClientesActionPerformed

            navegarEntreTelas(new inserirCliente());
      }//GEN-LAST:event_menuCadastrarClientesActionPerformed

      private void menuEdicaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEdicaoClientesActionPerformed

            navegarEntreTelas(new alterarCliente());
      }//GEN-LAST:event_menuEdicaoClientesActionPerformed

      private void menuEdicaoProjetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEdicaoProjetoresActionPerformed
		
		navegarEntreTelas(new alterarProjetor());
      }//GEN-LAST:event_menuEdicaoProjetoresActionPerformed

      private void menuListagemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListagemClientesActionPerformed

            navegarEntreTelas(new listarCliente());
      }//GEN-LAST:event_menuListagemClientesActionPerformed

      private void menuExclusaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExclusaoClientesActionPerformed

            navegarEntreTelas(new excluirCliente());
      }//GEN-LAST:event_menuExclusaoClientesActionPerformed

      private void menuExclusaoLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExclusaoLocacaoActionPerformed
      }//GEN-LAST:event_menuExclusaoLocacaoActionPerformed

      private void painelCabecalhoBotaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelCabecalhoBotaoMenuActionPerformed

            navegarEntreTelas(new painelCorpo());
      }//GEN-LAST:event_painelCabecalhoBotaoMenuActionPerformed

      private void menuCadastrarProjetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProjetoresActionPerformed
            
		navegarEntreTelas(new inserirProjetor());
      }//GEN-LAST:event_menuCadastrarProjetoresActionPerformed

      private void menuListagemProjetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListagemProjetoresActionPerformed
           
		navegarEntreTelas(new listarProjetor());
      }//GEN-LAST:event_menuListagemProjetoresActionPerformed

      private void menuExclusaoProjetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExclusaoProjetoresActionPerformed
            
		navegarEntreTelas(new excluirProjetor());
      }//GEN-LAST:event_menuExclusaoProjetoresActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JMenuBar barraMenu;
      private javax.swing.JMenu menuAjuda;
      private javax.swing.JMenuItem menuAjudaSobreSistema;
      private javax.swing.JMenu menuCadastrar;
      private javax.swing.JMenuItem menuCadastrarClientes;
      private javax.swing.JMenuItem menuCadastrarLocacoes;
      private javax.swing.JMenuItem menuCadastrarProjetores;
      private javax.swing.JMenu menuEdicao;
      private javax.swing.JMenuItem menuEdicaoClientes;
      private javax.swing.JMenuItem menuEdicaoLocacoes;
      private javax.swing.JMenuItem menuEdicaoProjetores;
      private javax.swing.JMenu menuExclusao;
      private javax.swing.JMenuItem menuExclusaoClientes;
      private javax.swing.JMenuItem menuExclusaoLocacao;
      private javax.swing.JMenuItem menuExclusaoProjetores;
      private javax.swing.JMenu menuListagem;
      private javax.swing.JMenuItem menuListagemClientes;
      private javax.swing.JMenuItem menuListagemLocacoes;
      private javax.swing.JMenuItem menuListagemProjetores;
      private javax.swing.JPanel painelCabecalho;
      private javax.swing.JButton painelCabecalhoBotaoMenu;
      private javax.swing.JLabel painelCabecalhoImagemProjetor;
      private javax.swing.JPanel painelCorpo;
      private javax.swing.JPanel painelPrincipal;
      // End of variables declaration//GEN-END:variables
}

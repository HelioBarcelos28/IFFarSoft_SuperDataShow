/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Main;

/**
 *
 * @author LucasMarcon
 */
public class Main2 extends javax.swing.JFrame {

	/**
	 * Creates new form Main2
	 */
	public Main2() {
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
            painelCabecalho = new javax.swing.JPanel();
            painelCabecalhoImagemProjetor = new javax.swing.JLabel();
            painelCabecalhoImagemMenu = new javax.swing.JLabel();
            painelCorpo = new javax.swing.JPanel();
            painelCorpo1 = new javax.swing.JPanel();
            painelCorpo2 = new javax.swing.JPanel();
            painelCorpo2LabelTitulo = new javax.swing.JLabel();
            painelCorpo2LabelImagemCasa = new javax.swing.JLabel();
            painelCorpo2LabelMensagem1 = new javax.swing.JLabel();
            painelCorpo1LabelImagemProjetor = new javax.swing.JLabel();
            painelCorpo1LabelMensagem1 = new javax.swing.JLabel();
            painelCorpo1LabelImagemCorcao = new javax.swing.JLabel();
            painelCorpo1LabelMensagem2 = new javax.swing.JLabel();
            barraMenu = new javax.swing.JMenuBar();
            menuCadastrar = new javax.swing.JMenu();
            menuCadastrarClientes = new javax.swing.JMenuItem();
            menuCadastrarProjetores = new javax.swing.JMenuItem();
            menuCadastrarLocacoes = new javax.swing.JMenuItem();
            menuAjuda = new javax.swing.JMenu();
            menuAjudaSobreSistema = new javax.swing.JMenuItem();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            painelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

            painelCabecalho.setBackground(new java.awt.Color(36, 46, 68));

            painelCabecalhoImagemProjetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/projector_white.png"))); // NOI18N

            painelCabecalhoImagemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menu_white.png"))); // NOI18N

            javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
            painelCabecalho.setLayout(painelCabecalhoLayout);
            painelCabecalhoLayout.setHorizontalGroup(
                  painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCabecalhoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(painelCabecalhoImagemMenu)
                        .addGap(443, 443, 443)
                        .addComponent(painelCabecalhoImagemProjetor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            painelCabecalhoLayout.setVerticalGroup(
                  painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(painelCabecalhoImagemProjetor, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                  .addGroup(painelCabecalhoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(painelCabecalhoImagemMenu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            painelCorpo.setBackground(new java.awt.Color(0, 153, 153));

            painelCorpo1.setBackground(new java.awt.Color(0, 204, 204));

            painelCorpo2.setBackground(new java.awt.Color(36, 46, 68));

            painelCorpo2LabelTitulo.setFont(new java.awt.Font("Bebas Neue Bold", 0, 24)); // NOI18N
            painelCorpo2LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
            painelCorpo2LabelTitulo.setText("Bem-vindo ao DataShow Locator");

            painelCorpo2LabelImagemCasa.setFont(new java.awt.Font("Bebas Neue Bold", 0, 10)); // NOI18N
            painelCorpo2LabelImagemCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N

            painelCorpo2LabelMensagem1.setFont(new java.awt.Font("Bebas Neue Bold", 1, 12)); // NOI18N
            painelCorpo2LabelMensagem1.setForeground(new java.awt.Color(255, 255, 255));
            painelCorpo2LabelMensagem1.setText("Conecte a sua vida ao presente e projete seu futuro com a gente");

            javax.swing.GroupLayout painelCorpo2Layout = new javax.swing.GroupLayout(painelCorpo2);
            painelCorpo2.setLayout(painelCorpo2Layout);
            painelCorpo2Layout.setHorizontalGroup(
                  painelCorpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCorpo2Layout.createSequentialGroup()
                        .addContainerGap(99, Short.MAX_VALUE)
                        .addGroup(painelCorpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelCorpo2LabelTitulo)
                                    .addGroup(painelCorpo2Layout.createSequentialGroup()
                                          .addComponent(painelCorpo2LabelMensagem1)
                                          .addGap(66, 66, 66)))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorpo2Layout.createSequentialGroup()
                                    .addComponent(painelCorpo2LabelImagemCasa)
                                    .addGap(229, 229, 229))))
            );
            painelCorpo2Layout.setVerticalGroup(
                  painelCorpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCorpo2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(painelCorpo2LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(painelCorpo2LabelImagemCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(painelCorpo2LabelMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
            );

            painelCorpo1LabelImagemProjetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/projector.png"))); // NOI18N

            painelCorpo1LabelMensagem1.setFont(new java.awt.Font("Bebas Neue Bold", 0, 10)); // NOI18N
            painelCorpo1LabelMensagem1.setText("Feito com ");

            painelCorpo1LabelImagemCorcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/heart.png"))); // NOI18N

            painelCorpo1LabelMensagem2.setFont(new java.awt.Font("Bebas Neue Bold", 0, 10)); // NOI18N
            painelCorpo1LabelMensagem2.setText(" por IFFarSoft");

            javax.swing.GroupLayout painelCorpo1Layout = new javax.swing.GroupLayout(painelCorpo1);
            painelCorpo1.setLayout(painelCorpo1Layout);
            painelCorpo1Layout.setHorizontalGroup(
                  painelCorpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorpo1Layout.createSequentialGroup()
                        .addGroup(painelCorpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(painelCorpo1Layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(painelCorpo1LabelImagemProjetor))
                              .addGroup(painelCorpo1Layout.createSequentialGroup()
                                    .addGap(187, 187, 187)
                                    .addComponent(painelCorpo1LabelMensagem1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(painelCorpo1LabelImagemCorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(painelCorpo1LabelMensagem2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(painelCorpo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            painelCorpo1Layout.setVerticalGroup(
                  painelCorpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCorpo1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelCorpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(painelCorpo1Layout.createSequentialGroup()
                                    .addComponent(painelCorpo1LabelImagemProjetor)
                                    .addGap(57, 57, 57)
                                    .addGroup(painelCorpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(painelCorpo1LabelImagemCorcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(painelCorpo1LabelMensagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(painelCorpo1LabelMensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addComponent(painelCorpo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );

            javax.swing.GroupLayout painelCorpoLayout = new javax.swing.GroupLayout(painelCorpo);
            painelCorpo.setLayout(painelCorpoLayout);
            painelCorpoLayout.setHorizontalGroup(
                  painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCorpo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            painelCorpoLayout.setVerticalGroup(
                  painelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCorpo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
            painelPrincipal.setLayout(painelPrincipalLayout);
            painelPrincipalLayout.setHorizontalGroup(
                  painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            menuCadastrar.add(menuCadastrarClientes);

            menuCadastrarProjetores.setText("Projetores");
            menuCadastrar.add(menuCadastrarProjetores);

            menuCadastrarLocacoes.setText("Locações");
            menuCadastrar.add(menuCadastrarLocacoes);

            barraMenu.add(menuCadastrar);

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
			java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main2().setVisible(true);
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
      private javax.swing.JPanel painelCabecalho;
      private javax.swing.JLabel painelCabecalhoImagemMenu;
      private javax.swing.JLabel painelCabecalhoImagemProjetor;
      private javax.swing.JPanel painelCorpo;
      private javax.swing.JPanel painelCorpo1;
      private javax.swing.JLabel painelCorpo1LabelImagemCorcao;
      private javax.swing.JLabel painelCorpo1LabelImagemProjetor;
      private javax.swing.JLabel painelCorpo1LabelMensagem1;
      private javax.swing.JLabel painelCorpo1LabelMensagem2;
      private javax.swing.JPanel painelCorpo2;
      private javax.swing.JLabel painelCorpo2LabelImagemCasa;
      private javax.swing.JLabel painelCorpo2LabelMensagem1;
      private javax.swing.JLabel painelCorpo2LabelTitulo;
      private javax.swing.JPanel painelPrincipal;
      // End of variables declaration//GEN-END:variables
}

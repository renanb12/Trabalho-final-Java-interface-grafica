

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author aluno tds
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuRegistrar = new javax.swing.JMenuItem();
        jMenuServicos = new javax.swing.JMenu();
        jMenuVerServicos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Petshop");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/10cd90_9cae3ffb6b8f42b38178c56a00315392~mv2 (1).png"))); // NOI18N

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jMenuRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuRegistrar.setText("Registrar pet");
        jMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuRegistrar);

        jMenuBar1.add(jMenuCadastro);

        jMenuServicos.setText("Serviços");
        jMenuServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServicosActionPerformed(evt);
            }
        });

        jMenuVerServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuVerServicos.setText("Ver serviços");
        jMenuVerServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVerServicosActionPerformed(evt);
            }
        });
        jMenuServicos.add(jMenuVerServicos);

        jMenuBar1.add(jMenuServicos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarActionPerformed
        // TODO add your handling code here:

        Cadastro cadastro1 = new Cadastro();
        jDesktop.add(cadastro1);
        cadastro1.setVisible(true);
    }//GEN-LAST:event_jMenuRegistrarActionPerformed

    private void jMenuServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuServicosActionPerformed

    private void jMenuVerServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVerServicosActionPerformed
        // TODO add your handling code here:

        Servicos servico1 = new Servicos();
        jDesktop.add(servico1);
        servico1.setVisible(true);
    }//GEN-LAST:event_jMenuVerServicosActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuRegistrar;
    private javax.swing.JMenu jMenuServicos;
    private javax.swing.JMenuItem jMenuVerServicos;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import javax.swing.JOptionPane;



/**
 *
 * @author pc
 */
public final class JPrincipal extends javax.swing.JFrame {
    
    private final String mensagem=" !! ACESSO NEGADO AO SERVIÇO !! "; 
    private final Object[]opcao={"SIM","NÃO"};
    public static Integer codigo_usuario;
    public static String nome_usuario;
    public static Integer perfil_usuario;

    /**
     * Creates new form JPrincipal
     */
    public JPrincipal() {
        initComponents();
        confirmarUtilizador();
        inicializar();
        codigo_usuario = JLogin.codigo_usuario;
        nome_usuario = JLogin.nome_usuario;
        perfil_usuario = JLogin.perfil_usuario;
        
        txtnomefunc.setText("Funcionário(a) : "+nome_usuario);
        txtcodfunc.setText("Perfil : "+ codigo_usuario);
        txttipofunc.setText("Perfil : "+ perfil_usuario);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        txtcodfunc = new javax.swing.JTextField();
        txtnomefunc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttipofunc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MVenda = new javax.swing.JMenu();
        MFornecedor = new javax.swing.JMenu();
        MProduto = new javax.swing.JMenu();
        MFuncionario = new javax.swing.JMenu();
        MSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1350, 655));

        jDesktopPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Codigo Func:");

        jLabel2.setText("Nome Func:");

        jLabel3.setText("Tipo Func:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        jDesktopPane2.setLayer(txtcodfunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtnomefunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txttipofunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnomefunc, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttipofunc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(919, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomefunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodfunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttipofunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(496, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setDoubleBuffered(true);

        MVenda.setBorder(null);
        MVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/contrato.png"))); // NOI18N
        MVenda.setText("Venda            ");
        MVenda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MVenda.setName("MVenda"); // NOI18N
        MVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MVendaMouseClicked(evt);
            }
        });
        jMenuBar1.add(MVenda);

        MFornecedor.setBorder(null);
        MFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cliente.png"))); // NOI18N
        MFornecedor.setText("Fornecedor          ");
        MFornecedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MFornecedor.setName("MFornecedor"); // NOI18N
        MFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MFornecedorMouseClicked(evt);
            }
        });
        jMenuBar1.add(MFornecedor);

        MProduto.setBorder(null);
        MProduto.setText("Produto          ");
        MProduto.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MProduto.setName("MProduto"); // NOI18N
        MProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MProdutoMouseClicked(evt);
            }
        });
        jMenuBar1.add(MProduto);

        MFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/funcionario.png"))); // NOI18N
        MFuncionario.setText("Funcionario               ");
        MFuncionario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MFuncionario.setName("MFuncionario"); // NOI18N
        MFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MFuncionarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(MFuncionario);

        MSair.setBorder(null);
        MSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/sair.png"))); // NOI18N
        MSair.setText("Sair            ");
        MSair.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MSair.setName("MSair"); // NOI18N
        MSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(MSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        jDesktopPane2.getAccessibleContext().setAccessibleParent(jDesktopPane2);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void MFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MFornecedorMouseClicked
        if (perfil_usuario == 3)
        {
        JFornecedores Forne =new JFornecedores();
        Forne.setVisible(true);
        }
        else
           JOptionPane.showMessageDialog(this,"Nao tem permissão de acesso neste formulário!"); 
    }//GEN-LAST:event_MFornecedorMouseClicked

    private void MFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MFuncionarioMouseClicked
        // TODO add your handling code here:
        if (perfil_usuario == 2)
        {
        JFuncionarios Funcionar =new JFuncionarios();
        Funcionar.setVisible(true);
        }
        else
           JOptionPane.showMessageDialog(this,"Nao tem permissão de acesso neste formulário!");                
    }//GEN-LAST:event_MFuncionarioMouseClicked

    private void MProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MProdutoMouseClicked
        // TODO add your handling code here:
        if (perfil_usuario == 3)
        {
        JProdutos Produt =new JProdutos();
        Produt.setVisible(true);
        }
        else
           JOptionPane.showMessageDialog(this,"Nao tem permissão de acesso neste formulário!");                
    }//GEN-LAST:event_MProdutoMouseClicked

    private void MVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MVendaMouseClicked
        // TODO add your handling code here:
        if (perfil_usuario == 1)
        {
         JVenda Vend =new JVenda();
         Vend.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this,"Nao tem permissão de acesso neste formulário!");
    }//GEN-LAST:event_MVendaMouseClicked

    private void MSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MSairMouseClicked
        // TODO add your handling code here:
         int escolha = JOptionPane.showOptionDialog(null, " DESEJA TERMINAR SESSÃO ?", "ESCOLHER OPÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcao, opcao[0]);
                    
                if (escolha == 0) {
                    new JLogin().setVisible(true);
                    this.setVisible(false);
                    
                }
    
    }//GEN-LAST:event_MSairMouseClicked

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
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MFornecedor;
    private javax.swing.JMenu MFuncionario;
    private javax.swing.JMenu MProduto;
    private javax.swing.JMenu MSair;
    private javax.swing.JMenu MVenda;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcodfunc;
    private javax.swing.JTextField txtnomefunc;
    private javax.swing.JTextField txttipofunc;
    // End of variables declaration//GEN-END:variables

    public void inicializar(){
        txtcodfunc.setVisible(false);
        txttipofunc.setVisible(false);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
    }
    public void confirmarUtilizador(){
        codigo_usuario= JLogin.codigo_usuario;
        nome_usuario= JLogin.nome_usuario;
        perfil_usuario= JLogin.perfil_usuario;
         if (perfil_usuario == 1){
             MFornecedor.setEnabled(false);
             MFuncionario.setEnabled(false);
             MProduto.setEnabled(false);
             MVenda.setEnabled(true);
         }
         if (perfil_usuario == 2){
             MFornecedor.setEnabled(false);
             MFuncionario.setEnabled(true);
             MProduto.setEnabled(false);
             MVenda.setEnabled(false);
         }
        if (perfil_usuario == 3){
             MFornecedor.setEnabled(true);
             MFuncionario.setEnabled(false);
             MProduto.setEnabled(true);
             MVenda.setEnabled(true);
         }
       
    }
  
}
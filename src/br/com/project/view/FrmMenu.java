/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.view;

import br.com.project.model.Client;
import br.com.project.model.Provider;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author whoami
 */
public class FrmMenu extends javax.swing.JFrame {

    public String usarioLogado;
    
    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/fundo2.jpg"));
        Image image = icon.getImage();
        pnlDesktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                //g.drawImage(image, 0,0, getWidth().getHeight(),this);
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenu();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuFornecedores = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuControleVenda = new javax.swing.JMenu();
        menuPDV = new javax.swing.JMenuItem();
        menuPosicao = new javax.swing.JMenuItem();
        menuHistorico = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuTrocarDeUsuario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuConsultaProduto = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Estoque");
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuário Logado: ");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 153, 0));
        lblUsuario.setText("Teste");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addGap(0, 1096, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario)))
        );

        javax.swing.GroupLayout pnlDesktopLayout = new javax.swing.GroupLayout(pnlDesktop);
        pnlDesktop.setLayout(pnlDesktopLayout);
        pnlDesktopLayout.setHorizontalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDesktopLayout.setVerticalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDesktopLayout.createSequentialGroup()
                .addGap(0, 646, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(true);

        menuCliente.setBackground(new java.awt.Color(51, 51, 51));
        menuCliente.setForeground(new java.awt.Color(51, 51, 51));
        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cliente.png"))); // NOI18N
        menuCliente.setText("Clientes");

        jMenu5.setText("Controle de Clientes");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        menuCliente.add(jMenu5);

        jMenuBar1.add(menuCliente);

        menuFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        menuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/employee.png"))); // NOI18N
        menuFuncionario.setText("Funcionários");

        menuFuncionarios.setText("Controle de Funcionários");
        menuFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncionariosMouseClicked(evt);
            }
        });
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuFuncionarios);

        jMenuBar1.add(menuFuncionario);

        menuFornecedores.setBackground(new java.awt.Color(0, 0, 0));
        menuFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/truck.png"))); // NOI18N
        menuFornecedores.setText("Fornecedores");

        jMenuItem2.setText("Controle de Fornecedores");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuFornecedores.add(jMenuItem2);

        jMenuBar1.add(menuFornecedores);

        menuControleVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vendas_1.png"))); // NOI18N
        menuControleVenda.setText("Vendas");

        menuPDV.setText("Abrir PDV");
        menuPDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPDVMouseClicked(evt);
            }
        });
        menuPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPDVActionPerformed(evt);
            }
        });
        menuControleVenda.add(menuPDV);

        menuPosicao.setText("Posicição do dia");
        menuPosicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPosicaoMouseClicked(evt);
            }
        });
        menuPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPosicaoActionPerformed(evt);
            }
        });
        menuControleVenda.add(menuPosicao);

        menuHistorico.setText("Histórico de vendas");
        menuHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHistoricoMouseClicked(evt);
            }
        });
        menuHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoricoActionPerformed(evt);
            }
        });
        menuControleVenda.add(menuHistorico);

        jMenuBar1.add(menuControleVenda);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/config.png"))); // NOI18N
        jMenu7.setText("Configurações");

        menuTrocarDeUsuario.setText("Trocar de usuário");
        menuTrocarDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrocarDeUsuarioActionPerformed(evt);
            }
        });
        jMenu7.add(menuTrocarDeUsuario);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Produtos2.png"))); // NOI18N
        jMenu6.setText("Produtos");

        jMenuItem4.setText("Controle de Estoque");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        menuConsultaProduto.setText("Consulta de Produtos");
        menuConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaProdutoActionPerformed(evt);
            }
        });
        jMenu6.add(menuConsultaProduto);

        jMenuBar1.add(jMenu6);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit.png"))); // NOI18N
        menuExit.setText("Sair");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
  
        this.setResizable(false);
        lblUsuario.setText(usarioLogado);
        this.setVisible(true);
       
    }//GEN-LAST:event_formWindowActivated

    private void menuTrocarDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrocarDeUsuarioActionPerformed
        //Logout
        FrmLogin viewLogin = new FrmLogin();
        this.dispose();
        viewLogin.setVisible(true);
    }//GEN-LAST:event_menuTrocarDeUsuarioActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        
        int op;
        
        op = JOptionPane.showConfirmDialog(null, "Você realmente quer encerrar o sistema?");
        if(op == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaProdutoActionPerformed
        FrmProduct viewProduct = new FrmProduct();
        viewProduct.panelProdutos.setSelectedIndex(1);
        viewProduct.setVisible(true);
    }//GEN-LAST:event_menuConsultaProdutoActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        FrmClient viewClient = new FrmClient();
        viewClient.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void menuFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncionariosMouseClicked
        
    }//GEN-LAST:event_menuFuncionariosMouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void menuPDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPDVMouseClicked
        
    }//GEN-LAST:event_menuPDVMouseClicked

    private void menuPosicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPosicaoMouseClicked
        
    }//GEN-LAST:event_menuPosicaoMouseClicked

    private void menuHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHistoricoMouseClicked
        
    }//GEN-LAST:event_menuHistoricoMouseClicked

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        FrmEmployee viewEmployee = new FrmEmployee();
        viewEmployee.setVisible(true);
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmProvider viewProvider = new FrmProvider();
        viewProvider.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPDVActionPerformed
        FrmSale viewSale = new FrmSale();
        viewSale.setVisible(true);
    }//GEN-LAST:event_menuPDVActionPerformed

    private void menuPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPosicaoActionPerformed
        FrmTotalSale viewTotal = new FrmTotalSale();
        viewTotal.setVisible(true);
    }//GEN-LAST:event_menuPosicaoActionPerformed

    private void menuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistoricoActionPerformed
        FrmHistoric viewHistoric = new FrmHistoric();
        viewHistoric.setVisible(true);
    }//GEN-LAST:event_menuHistoricoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmStockControll viewCotroll = new FrmStockControll();
        viewCotroll.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuConsultaProduto;
    public javax.swing.JMenu menuControleVenda;
    private javax.swing.JMenu menuExit;
    public javax.swing.JMenu menuFornecedores;
    public javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenuItem menuFuncionarios;
    public javax.swing.JMenuItem menuHistorico;
    private javax.swing.JMenuItem menuPDV;
    public javax.swing.JMenuItem menuPosicao;
    private javax.swing.JMenuItem menuTrocarDeUsuario;
    private javax.swing.JDesktopPane pnlDesktop;
    // End of variables declaration//GEN-END:variables
}

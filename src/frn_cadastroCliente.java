import javax.swing.*;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author danil
 */
public class frn_cadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frn_cadastroCliente() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        input_nome.setBackground(new Color(0,0,0,0));
        input_cpf.setBackground(new Color(0,0,0,0));
        input_rg.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_fechar = new javax.swing.JButton();
        separador_nome3 = new javax.swing.JSeparator();
        separador_nome1 = new javax.swing.JSeparator();
        separador_nome2 = new javax.swing.JSeparator();
        lbl_sexo1 = new javax.swing.JLabel();
        radioBtn_sexo2 = new javax.swing.JRadioButton();
        lbl_sexo = new javax.swing.JLabel();
        radioBtn_sexo1 = new javax.swing.JRadioButton();
        input_rg = new javax.swing.JTextField();
        separador_rg = new javax.swing.JSeparator();
        lbl_rg = new javax.swing.JLabel();
        input_nome = new javax.swing.JTextField();
        separador_nome = new javax.swing.JSeparator();
        input_cpf = new javax.swing.JTextField();
        lbl_cpf = new javax.swing.JLabel();
        separador_cpf = new javax.swing.JSeparator();
        lbl_nome = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_fechar.setBackground(new java.awt.Color(0, 0, 0));
        btn_fechar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(255, 255, 255));
        btn_fechar.setText("X");
        btn_fechar.setBorderPainted(false);
        btn_fechar.setContentAreaFilled(false);
        btn_fechar.setFocusPainted(false);
        btn_fechar.setFocusable(false);
        btn_fechar.setRolloverEnabled(false);
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });
        jPanel1.add(btn_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 50, 30));

        separador_nome3.setBackground(new java.awt.Color(51, 51, 51));
        separador_nome3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_nome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 350, 20));

        separador_nome1.setBackground(new java.awt.Color(51, 51, 51));
        separador_nome1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 350, 20));

        separador_nome2.setBackground(new java.awt.Color(51, 51, 51));
        separador_nome2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_nome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 350, 20));

        lbl_sexo1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_sexo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sexo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sexo1.setText("Data de Nascimento");
        jPanel1.add(lbl_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 160, 30));

        buttonGroup1.add(radioBtn_sexo2);
        radioBtn_sexo2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        radioBtn_sexo2.setForeground(new java.awt.Color(255, 255, 255));
        radioBtn_sexo2.setText("F");
        radioBtn_sexo2.setOpaque(false);
        radioBtn_sexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_sexo2ActionPerformed(evt);
            }
        });
        jPanel1.add(radioBtn_sexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_sexo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sexo.setText("Sexo");
        jPanel1.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 140, 30));

        buttonGroup1.add(radioBtn_sexo1);
        radioBtn_sexo1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        radioBtn_sexo1.setForeground(new java.awt.Color(255, 255, 255));
        radioBtn_sexo1.setText("M");
        radioBtn_sexo1.setOpaque(false);
        jPanel1.add(radioBtn_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        input_rg.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        input_rg.setForeground(new java.awt.Color(153, 153, 153));
        input_rg.setText("Insira o RG");
        input_rg.setBorder(null);
        input_rg.setOpaque(false);
        input_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_rgActionPerformed(evt);
            }
        });
        jPanel1.add(input_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 350, 30));

        separador_rg.setBackground(new java.awt.Color(51, 51, 51));
        separador_rg.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 350, 20));

        lbl_rg.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_rg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rg.setText("RG");
        jPanel1.add(lbl_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, 30));

        input_nome.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        input_nome.setForeground(new java.awt.Color(153, 153, 153));
        input_nome.setText("Insira o nome");
        input_nome.setBorder(null);
        input_nome.setOpaque(false);
        input_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(input_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 350, 30));

        separador_nome.setBackground(new java.awt.Color(51, 51, 51));
        separador_nome.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 350, 20));

        input_cpf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        input_cpf.setForeground(new java.awt.Color(153, 153, 153));
        input_cpf.setText("Insira o CPF");
        input_cpf.setBorder(null);
        input_cpf.setOpaque(false);
        input_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_cpfActionPerformed(evt);
            }
        });
        jPanel1.add(input_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 350, 30));

        lbl_cpf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_cpf.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cpf.setText("CPF");
        jPanel1.add(lbl_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 30));

        separador_cpf.setBackground(new java.awt.Color(51, 51, 51));
        separador_cpf.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(separador_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 350, 20));

        lbl_nome.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome.setText("Nome");
        jPanel1.add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        lbl_titulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Cadastro de Cliente");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 370, 80));

        lbl_background.setIcon(new javax.swing.ImageIcon("C:\\Users\\danil\\Downloads\\Base (1).png")); // NOI18N
        jPanel1.add(lbl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 970, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 550));

        setSize(new java.awt.Dimension(1001, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nomeActionPerformed

    private void input_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cpfActionPerformed

    private void input_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_rgActionPerformed

    private void radioBtn_sexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_sexo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtn_sexo2ActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        //gitbash
    System.exit(0); //fecha o app
    }//GEN-LAST:event_btn_fecharActionPerformed

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
            java.util.logging.Logger.getLogger(frn_cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frn_cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frn_cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frn_cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frn_cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField input_cpf;
    private javax.swing.JTextField input_nome;
    private javax.swing.JTextField input_rg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_rg;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sexo1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JRadioButton radioBtn_sexo1;
    private javax.swing.JRadioButton radioBtn_sexo2;
    private javax.swing.JSeparator separador_cpf;
    private javax.swing.JSeparator separador_nome;
    private javax.swing.JSeparator separador_nome1;
    private javax.swing.JSeparator separador_nome2;
    private javax.swing.JSeparator separador_nome3;
    private javax.swing.JSeparator separador_rg;
    // End of variables declaration//GEN-END:variables
}

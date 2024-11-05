/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade04.view;

/**
 *
 * @author larissa
 */
public class Genio extends javax.swing.JFrame {

    /**
     * Creates new form Genio
     */
    public Genio() {
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

        lblValor = new javax.swing.JLabel();
        spnValor = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();
        lblFala = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        lblGenio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setText("Valor:");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, -1));

        spnValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(spnValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        btnPalpite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, 30));

        lblFala.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFala.setText("<html> Vou pensar em um valor entre 1 e 5. <br />  Tente adivinhar </html> ");
        lblFala.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblFala, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, 80));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade04/images/balao.png"))); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade04/images/genio.png"))); // NOI18N
        getContentPane().add(lblGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        /* Gera um número aleatório entre 1 e 10. Se o número for maior que 5, 
        subtrai 5 para restringi-lo ao intervalo de 1 a 5. */
        int numRand = (int)(Math.random() * 10) + 1;
        numRand = numRand > 5 ? (numRand - 5) : numRand;
        
        // Insere o número escolhido pelo usuário na variável.
        int numUsuario = Integer.parseInt(spnValor.getValue().toString());
        
        /* Compara o número aleatório gerado com o número escolhido pelo usuário 
        e atualiza o label de fala. */
        if(numRand == numUsuario) {
            lblFala.setText("Acertou!");
        } else {
            lblFala.setText("Errou. Eu pensei no número " + numRand);
        }
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblFala;
    private javax.swing.JLabel lblGenio;
    private javax.swing.JLabel lblValor;
    private javax.swing.JSpinner spnValor;
    // End of variables declaration//GEN-END:variables
}
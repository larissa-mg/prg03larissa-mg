/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author larissa
 */
public class TelaVetor extends javax.swing.JFrame {

    /**
     * Creates new form TelaVetor
     */
    
    int vetor[] = new int[5];
    int selecionado = 0;
    DefaultListModel lista = new DefaultListModel();
    
    public TelaVetor() {
        initComponents();
        // Mostra a lista com os valores do vetor assim que a janela abre
        for(int num: vetor) {
            lista.addElement(num);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnValor = new javax.swing.JSpinner();
        btnOrdenar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        lblIndex = new javax.swing.JLabel();
        lblVetor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        getContentPane().add(spnValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 30));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, 30));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, 30));

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, 30));

        lstVetor.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(lstVetor);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, 210));

        lblIndex.setText("[0]");
        getContentPane().add(lblIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        lblVetor.setText("Vetor:");
        getContentPane().add(lblVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Remove os elementos da lista
        lista.removeAllElements();
        
        // Coloca o valor escolhido na posicão selecionada do vetor
        vetor[selecionado] = (int) spnValor.getValue();
        
        // Atualiza a lista com os valores do vetor
        for(int num: vetor) {
            lista.addElement(num);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // Remove os elementos da lista
        lista.removeAllElements();
       
        // Coloca o valor 0 na posição escolhida
        vetor[selecionado] = 0;
        
        // Atualiza a lista com os valores do vetor
        for(int num: vetor) {
            lista.addElement(num);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // Remove os elementos da lista
        lista.removeAllElements();
        
        // Ordena o vetor
        Arrays.sort(vetor);
        
        // Atualiza a lista com os valores do vetor
        for(int num: vetor) {
            lista.addElement(num);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // Coloca o índice escolhido na variável e atualiza o lblIndex de acordo
        selecionado = lstVetor.getSelectedIndex();
        lblIndex.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblVetor;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JSpinner spnValor;
    // End of variables declaration//GEN-END:variables
}
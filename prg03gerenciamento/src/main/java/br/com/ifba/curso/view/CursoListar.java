package br.com.ifba.curso.view;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author larissa
 */
public class CursoListar extends javax.swing.JFrame {
    
    /**
     * Creates new form CursoListar
     */
    public CursoListar() {
        initComponents();
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tblListaCurso = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnEditarCurso = new javax.swing.JButton();
        btnRemoverCurso = new javax.swing.JButton();
        btnCadastrarCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListaCurso.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblListaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, "", ""},
                {"", null, "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "ID", "Código do curso", "Ativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaCurso.setName(""); // NOI18N
        tblListaCurso.setRowHeight(40);
        tblListaCurso.setSelectionMode(0);
        tblListaCurso.setShowHorizontalLines(true);
        tblListaCurso.setShowVerticalLines(true);
        tblListaCurso.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(tblListaCurso);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 760, 270));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 50));

        btnEditarCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarCurso.setText("Editar");
        btnEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 50));

        btnRemoverCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoverCurso.setText("Remover");
        btnRemoverCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoverCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, 50));

        btnCadastrarCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrarCurso.setText("Cadastrar");
        btnCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCursoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 100, 50));

        setSize(new java.awt.Dimension(840, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCursoActionPerformed
        //Confere se algum curso foi selecionado
        if(tblListaCurso.getSelectedRow() != -1) {
            //Abre janela de confirmação para remoção do curso selecionado
            int resposta = JOptionPane.showConfirmDialog(
                null, 
                "Deseja apagar o curso selecionado?", 
                "Remover curso",
                JOptionPane.YES_NO_OPTION
            );
        
            //Caso a resposta seja sim, remove o curso do banco de dados
            if(resposta == JOptionPane.YES_OPTION) {
                //Recebe o valor do id selecionado pelo usuário
                Long id = (Long) tblListaCurso.getValueAt(tblListaCurso.getSelectedRow(), 1);
            
                //Procura o curso selecionado pelo id no banco de dados e deleta
                CursoIDao cursoDao = new CursoDao();
                cursoDao.delete(cursoDao.findById(id));
            
                //Atualiza a tabela
                carregarTabela();
            
            }
        } else { //Mensagem que aparece se nenhum curso tiver sido selecionado
            JOptionPane.showMessageDialog(
                    null, 
                    "Selecione um curso da tabela"
            );
        }
    }//GEN-LAST:event_btnRemoverCursoActionPerformed

    private void btnCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCursoActionPerformed
        //Abre a janela de cadastro do curso ao clicar no botão btnCadastrarCurso
        CursoCadastrar cursoCadastrar = new CursoCadastrar(this);
        cursoCadastrar.setVisible(true);
    }//GEN-LAST:event_btnCadastrarCursoActionPerformed

    private void btnEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCursoActionPerformed
        // Verifica se um curso foi selecionado
        if(tblListaCurso.getSelectedRow() != -1) {
            //Guarda o id do curso selecionado e envia para a tela cursoEditar
            Long id = (Long) tblListaCurso.getValueAt(tblListaCurso.getSelectedRow(), 1);
            CursoEditar cursoEditar = new CursoEditar(this, id);
            cursoEditar.setVisible(true);
            
        } else { //Mensagem que aparece se nenhum curso tiver sido selecionado
            JOptionPane.showMessageDialog(
                    null, 
                    "Selecione um curso da tabela"
            );
        }
    }//GEN-LAST:event_btnEditarCursoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        DefaultTableModel tabela = (DefaultTableModel) tblListaCurso.getModel();
        tabela.setNumRows(0);
        
        CursoIDao cursoDao = new CursoDao();
        
        try {
            for(Curso curso : cursoDao.findAll()) {
                if(curso.getNome().toLowerCase().contains(txtBuscar.getText().toLowerCase())) {
                    tabela.addRow(new Object[]{
                        curso.getNome(),
                        curso.getId(),
                        curso.getCodigoCurso(),
                        curso.isAtivo() ? "ATIVO" : "INATIVO"
                    }); 
                }
            }
        } catch(Exception ErroListar) {
            JOptionPane.showMessageDialog(
                    null, 
                    "ERRO AO CARREGAR A TABELA\n" + ErroListar, 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    public void carregarTabela() {
        DefaultTableModel tabela = (DefaultTableModel) tblListaCurso.getModel();
        tabela.setNumRows(0);
        
        CursoIDao cursoDao = new CursoDao();
        
        try {
            for(Curso curso : cursoDao.findAll()) {
                tabela.addRow(new Object[]{
                    curso.getNome(),
                    curso.getId(),
                    curso.getCodigoCurso(),
                    curso.isAtivo() ? "ATIVO" : "INATIVO"
                });
            }   
        } catch(Exception ErroListar) {
            JOptionPane.showMessageDialog(
                    null, 
                    "ERRO AO CARREGAR A TABELA\n" + ErroListar, 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCurso;
    private javax.swing.JButton btnEditarCurso;
    private javax.swing.JButton btnRemoverCurso;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblListaCurso;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

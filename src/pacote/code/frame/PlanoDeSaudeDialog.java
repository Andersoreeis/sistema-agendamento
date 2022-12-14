/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pacote.code.frame;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import pacote.code.dao.PlanoDeSaudeDAO;
import pacote.code.model.OperacaoEnum;
import pacote.code.model.PlanoDeSaude;

/**
 *
 * @author 22282173
 */
public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planodesaude;
    private OperacaoEnum operacao;

    /**
     * Creates new form PlanoDeSaudeDialog
     */
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        prencherTitulo();
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, PlanoDeSaude planodesaude, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.planodesaude = planodesaude;
        this.operacao = operacao;
        prencherTitulo();
        prencherFormulario();
    }

    private void prencherFormulario() {
        jtextfieldCodigo.setText(planodesaude.getCodigo().toString());
        jtextfieldOperadora.setText(planodesaude.getOperadora());
        jtextfieldCategoria.setText(planodesaude.getCategoria());
        jtextfieldNumero.setText(planodesaude.getNumero());
        jformattedData.setText(planodesaude.getDataFormatada());

    }

    private void prencherTitulo() {
        jlabelTitleDialog.setText("Especialidade " + operacao);
        if (operacao == OperacaoEnum.Editar) {

            jlabelImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/canetalogo.png")));

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelHeaderDialog = new javax.swing.JPanel();
        jlabelTitleDialog = new javax.swing.JLabel();
        jlabelImgLogo = new javax.swing.JLabel();
        jpanelMainDialog = new javax.swing.JPanel();
        jtextfieldCodigo = new javax.swing.JTextField();
        jtextfieldOperadora = new javax.swing.JTextField();
        jlabelValidade = new javax.swing.JLabel();
        jlabelCodigo = new javax.swing.JLabel();
        jlabelOPeradora = new javax.swing.JLabel();
        btnSalvarDiaolog = new javax.swing.JButton();
        btnCancelarDialog = new javax.swing.JButton();
        jtextfieldCategoria = new javax.swing.JTextField();
        jlabelCategoria = new javax.swing.JLabel();
        jtextfieldNumero = new javax.swing.JTextField();
        jlabelNumero = new javax.swing.JLabel();
        jformattedData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        jpanelHeaderDialog.setBackground(new java.awt.Color(255, 153, 0));
        jpanelHeaderDialog.setLayout(null);

        jlabelTitleDialog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabelTitleDialog.setForeground(new java.awt.Color(255, 255, 255));
        jlabelTitleDialog.setText("Plano de Saude Adicionar ");
        jpanelHeaderDialog.add(jlabelTitleDialog);
        jlabelTitleDialog.setBounds(70, 20, 310, 40);

        jlabelImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/adicionarCoisas.png"))); // NOI18N
        jpanelHeaderDialog.add(jlabelImgLogo);
        jlabelImgLogo.setBounds(30, 20, 40, 40);

        getContentPane().add(jpanelHeaderDialog);
        jpanelHeaderDialog.setBounds(0, 0, 750, 70);

        jpanelMainDialog.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do Plano de Sa??de"));
        jpanelMainDialog.setLayout(null);

        jtextfieldCodigo.setEditable(false);
        jtextfieldCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jtextfieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldCodigoActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(jtextfieldCodigo);
        jtextfieldCodigo.setBounds(50, 60, 80, 30);

        jtextfieldOperadora.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jtextfieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldOperadoraActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(jtextfieldOperadora);
        jtextfieldOperadora.setBounds(50, 130, 290, 30);

        jlabelValidade.setText("VALIDADE");
        jpanelMainDialog.add(jlabelValidade);
        jlabelValidade.setBounds(400, 110, 210, 16);

        jlabelCodigo.setText("CODIGO");
        jpanelMainDialog.add(jlabelCodigo);
        jlabelCodigo.setBounds(50, 40, 50, 20);

        jlabelOPeradora.setText("OPERADORA");
        jpanelMainDialog.add(jlabelOPeradora);
        jlabelOPeradora.setBounds(50, 110, 190, 16);

        btnSalvarDiaolog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/salvar.png"))); // NOI18N
        btnSalvarDiaolog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDiaologActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(btnSalvarDiaolog);
        btnSalvarDiaolog.setBounds(550, 260, 50, 40);

        btnCancelarDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/excluir (4).png"))); // NOI18N
        btnCancelarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDialogActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(btnCancelarDialog);
        btnCancelarDialog.setBounds(490, 260, 50, 40);

        jtextfieldCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jtextfieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldCategoriaActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(jtextfieldCategoria);
        jtextfieldCategoria.setBounds(50, 200, 290, 30);

        jlabelCategoria.setText("CATEGORIA");
        jpanelMainDialog.add(jlabelCategoria);
        jlabelCategoria.setBounds(50, 180, 210, 16);

        jtextfieldNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jtextfieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldNumeroActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(jtextfieldNumero);
        jtextfieldNumero.setBounds(400, 70, 70, 30);

        jlabelNumero.setText("N??MERO");
        jpanelMainDialog.add(jlabelNumero);
        jlabelNumero.setBounds(400, 50, 210, 16);

        jformattedData.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        try {
            jformattedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformattedData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jformattedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformattedDataActionPerformed(evt);
            }
        });
        jpanelMainDialog.add(jformattedData);
        jformattedData.setBounds(400, 130, 70, 30);

        getContentPane().add(jpanelMainDialog);
        jpanelMainDialog.setBounds(40, 90, 650, 310);

        setSize(new java.awt.Dimension(762, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtextfieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldCodigoActionPerformed

    private void jtextfieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldOperadoraActionPerformed

    private void btnSalvarDiaologActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDiaologActionPerformed
        // TODO add your handling code here:

        if (jtextfieldCategoria.getText().isBlank() || jtextfieldNumero.getText().isBlank() || jtextfieldOperadora.getText().isBlank() == true) {

            JOptionPane.showMessageDialog(this, "Por favor insira os caracteres necess??rios");
        } else {
            if (operacao == OperacaoEnum.Adicionar) {
                adicionar();
            } else {
                editar();
            }

        }


    }//GEN-LAST:event_btnSalvarDiaologActionPerformed

    private void btnCancelarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDialogActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarDialogActionPerformed

    private void jtextfieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldCategoriaActionPerformed

    private void jtextfieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldNumeroActionPerformed

    private void jformattedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformattedDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformattedDataActionPerformed

    /**
     * @param args the command line arguments
     */
    private void editar() {
        planodesaude.setCategoria(jtextfieldCategoria.getText());
        planodesaude.setNumero(jtextfieldNumero.getText());
        planodesaude.setOperadora(jtextfieldOperadora.getText());
        planodesaude.setDataFormatada(jformattedData.getText());
        PlanoDeSaudeDAO.atualizar(planodesaude);
        JOptionPane.showMessageDialog(this, "Gravado Com sucesso", " Plano De Sa??de", JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    private void adicionar() {
        PlanoDeSaude NovoPlanoDeSaude = new PlanoDeSaude();
        NovoPlanoDeSaude.setCategoria(jtextfieldCategoria.getText());
        NovoPlanoDeSaude.setNumero(jtextfieldNumero.getText());
        NovoPlanoDeSaude.setOperadora(jtextfieldOperadora.getText());
        NovoPlanoDeSaude.setDataFormatada(jformattedData.getText());
        PlanoDeSaudeDAO.gravar(NovoPlanoDeSaude);
        JOptionPane.showMessageDialog(this, "Gravado Com sucesso", " Plano de Sa??de", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarDialog;
    private javax.swing.JButton btnSalvarDiaolog;
    private javax.swing.JFormattedTextField jformattedData;
    private javax.swing.JLabel jlabelCategoria;
    private javax.swing.JLabel jlabelCodigo;
    private javax.swing.JLabel jlabelImgLogo;
    private javax.swing.JLabel jlabelNumero;
    private javax.swing.JLabel jlabelOPeradora;
    private javax.swing.JLabel jlabelTitleDialog;
    private javax.swing.JLabel jlabelValidade;
    private javax.swing.JPanel jpanelHeaderDialog;
    private javax.swing.JPanel jpanelMainDialog;
    private javax.swing.JTextField jtextfieldCategoria;
    private javax.swing.JTextField jtextfieldCodigo;
    private javax.swing.JTextField jtextfieldNumero;
    private javax.swing.JTextField jtextfieldOperadora;
    // End of variables declaration//GEN-END:variables
}

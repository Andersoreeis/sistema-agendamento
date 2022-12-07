package pacote.code.frame;

import pacote.code.dao.MedicoDAO;
import pacote.code.dao.EspecialidadeDAO;
import static pacote.code.dao.EspecialidadeDAO.getEspecialidades;
import pacote.code.model.Medico;
import pacote.code.model.Especialidade;
import pacote.code.model.OperacaoEnum;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherEspecialidades();
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        medico = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        preencherEspecialidades();
        preencherEspecialidadesDoMedico();

    }

    private void preencherTitulo() {
       labelTitle . setText ( "Médico " + operacao );
        if ( operacao == OperacaoEnum . Editar ) {

            jlabelImgLogo . setIcon ( new  javax . swing . ImageIcon ( getClass (). getResource ( "/pacote/code/frame/canetalogo.png" )));

        }

    }

    private void preencherFormulario() {

        textFieldCodigo.setText(medico.getCodigo().toString());
        fTextFieldCRM.setText(medico.getCrm());
        textFieldNome.setText(medico.getNome());
        textFieldEmail.setText(medico.getEmail());
        fTextFieldNascimento.setText(medico.getDataFormatada());
        fTextFieldTelefone.setText(medico.getTelefone());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                                                                   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jlabelImgLogo = new javax.swing.JLabel();
        panelAdicionarMedico = new javax.swing.JPanel();
        labelNascimento = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        fTextFieldNascimento = new javax.swing.JFormattedTextField();
        labelCodigo = new javax.swing.JLabel();
        labelCRM = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMedico = new javax.swing.JList<>();
        labelListaMedico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        labelEspecialidades = new javax.swing.JLabel();
        buttonMoverParaMedico = new javax.swing.JButton();
        buttonMoverParaLista = new javax.swing.JButton();
        textFieldNome = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        fTextFieldCRM = new javax.swing.JFormattedTextField();
        fTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelHeader.setBackground(new java.awt.Color(255, 153, 0));
        panelHeader.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Plano de Saude Adicionar ");
        panelHeader.add(labelTitle);
        labelTitle.setBounds(70, 20, 310, 40);

        jlabelImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/adicionarCoisas.png"))); // NOI18N
        panelHeader.add(jlabelImgLogo);
        jlabelImgLogo.setBounds(30, 20, 40, 40);

        panelAdicionarMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do Médico"));
        panelAdicionarMedico.setLayout(null);

        labelNascimento.setText("DATA");
        panelAdicionarMedico.add(labelNascimento);
        labelNascimento.setBounds(470, 90, 60, 16);

        labelTelefone.setText("TELEFONE");
        panelAdicionarMedico.add(labelTelefone);
        labelTelefone.setBounds(50, 90, 60, 20);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/salvar.png"))); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonSalvar);
        buttonSalvar.setBounds(550, 260, 50, 40);

        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/excluir (4).png"))); // NOI18N
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonCancel);
        buttonCancel.setBounds(490, 260, 50, 40);

        fTextFieldNascimento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        try {
            fTextFieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fTextFieldNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldNascimentoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(fTextFieldNascimento);
        fTextFieldNascimento.setBounds(470, 110, 70, 30);

        labelCodigo.setText("CODIGO");
        panelAdicionarMedico.add(labelCodigo);
        labelCodigo.setBounds(50, 40, 50, 20);

        labelCRM.setText("CRM");
        panelAdicionarMedico.add(labelCRM);
        labelCRM.setBounds(160, 40, 50, 20);

        labelEmail.setText("EMAIL");
        panelAdicionarMedico.add(labelEmail);
        labelEmail.setBounds(210, 90, 50, 20);

        labelNome.setText("NOME DO(A) MÉDICO(A)");
        panelAdicionarMedico.add(labelNome);
        labelNome.setBounds(260, 40, 150, 20);

        jListMedico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jScrollPane1.setViewportView(jListMedico);

        panelAdicionarMedico.add(jScrollPane1);
        jScrollPane1.setBounds(260, 190, 150, 100);

        labelListaMedico.setText("ESPECIALIDADE DO MÉDICO");
        panelAdicionarMedico.add(labelListaMedico);
        labelListaMedico.setBounds(260, 170, 160, 16);

        jListEspecialidades.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jScrollPane2.setViewportView(jListEspecialidades);

        panelAdicionarMedico.add(jScrollPane2);
        jScrollPane2.setBounds(60, 190, 130, 100);

        labelEspecialidades.setText("LISTA DE ESPECIALIDADE");
        panelAdicionarMedico.add(labelEspecialidades);
        labelEspecialidades.setBounds(60, 170, 140, 16);

        buttonMoverParaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/right-arrow (1).png"))); // NOI18N
        buttonMoverParaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverParaMedicoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonMoverParaMedico);
        buttonMoverParaMedico.setBounds(200, 190, 50, 40);

        buttonMoverParaLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacote/code/frame/excluir (4).png"))); // NOI18N
        buttonMoverParaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverParaListaActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonMoverParaLista);
        buttonMoverParaLista.setBounds(200, 250, 50, 40);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(textFieldNome);
        textFieldNome.setBounds(260, 60, 190, 30);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(textFieldCodigo);
        textFieldCodigo.setBounds(50, 60, 90, 30);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(textFieldEmail);
        textFieldEmail.setBounds(210, 110, 200, 30);

        try {
            fTextFieldCRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelAdicionarMedico.add(fTextFieldCRM);
        fTextFieldCRM.setBounds(160, 60, 80, 30);

        try {
            fTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelAdicionarMedico.add(fTextFieldTelefone);
        fTextFieldTelefone.setBounds(50, 110, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelAdicionarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelAdicionarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(762, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fTextFieldNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldNascimentoActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
 CharSequence branco = " ";

        if (jListMedico.getModel().getSize() == 0||textFieldNome.getText().isBlank() == true || textFieldEmail.getText().isBlank() == true || fTextFieldCRM.getText().contains(branco) == true || fTextFieldNascimento.getText().contains(branco) == true || fTextFieldTelefone.getText().contains(branco) == true) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio!\nPreencha todos!", operacao + " - Médicos", JOptionPane.WARNING_MESSAGE, null);
        } else {
            if (operacao == OperacaoEnum.Adicionar) {
                adicionar();
            } else {
                editar();
            }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonMoverParaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverParaListaActionPerformed
     
        if (jListMedico.isSelectionEmpty() == false) {
            ArrayList<Especialidade> novaLista = new ArrayList<>();
            int tamanho = jListMedico.getModel().getSize();
            for (int o = 0; o < tamanho; o++) {
                novaLista.add(jListMedico.getModel().getElementAt(o));
            }
            novaLista.remove(jListMedico.getSelectedValue());

            DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
            for (Especialidade percorrer : novaLista) {
                especialidadesLista.addElement(percorrer);
            }
            jListMedico.setModel(especialidadesLista);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Nenhuma Especialidade selecionada para ser removida!",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonMoverParaListaActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonMoverParaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverParaMedicoActionPerformed

      
        if (jListEspecialidades.isSelectionEmpty() == false) {

            ArrayList<Especialidade> novaLista = new ArrayList<>();
            int tamanho = jListMedico.getModel().getSize();
            for (int o = 0; o < tamanho; o++) {
                novaLista.add(jListMedico.getModel().getElementAt(o));
            }

            if (novaLista.contains(jListEspecialidades.getSelectedValue()) == false) {
                novaLista.add(jListEspecialidades.getSelectedValue());

                DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
                for (Especialidade percorrer : novaLista) {
                    especialidadesLista.addElement(percorrer);
                }
                jListMedico.setModel(especialidadesLista);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Especialidade já cadastrada!",
                        "Editando Médico",
                        JOptionPane.WARNING_MESSAGE, null);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Nenhuma Especialidade selecionada!",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }

    }//GEN-LAST:event_buttonMoverParaMedicoActionPerformed

    private ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {
        int tamanho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            listaNova.add(lista.getModel().getElementAt(i));
        }
        return listaNova;
    }

    private void adicionar() {
        //Criar objeto especialidade
        Medico novoMedico = new Medico();

        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setNome(textFieldNome.getText());
        novoMedico.setCrm(fTextFieldCRM.getText());
        novoMedico.setDataFormatada(fTextFieldNascimento.getText());
        novoMedico.setTelefone(fTextFieldTelefone.getText());
        novoMedico.setEspecialidade(pegarEspecialidades(jListMedico));

        //Gravar o objeto, através do DAO
        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(this,
                "Médico Cadastrado com Sucesso!",
                "Médico - Adicionar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();

    }

    private void editar() {
        medico.setEmail(textFieldEmail.getText());
        medico.setNome(textFieldNome.getText());
        medico.setCrm(fTextFieldCRM.getText());
        medico.setDataFormatada(fTextFieldNascimento.getText());
        medico.setTelefone(fTextFieldTelefone.getText());
        medico.setEspecialidade(pegarEspecialidades(jListMedico));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(this,
                "Médico Editado com Sucesso!",
                "Médico - Editar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }

    private void preencherEspecialidades() {
        jListEspecialidades.setModel(EspecialidadeDAO.getEspModel());
    }

    private void preencherEspecialidadesDoMedico() {
        
            

            DefaultListModel<Especialidade> medicoEspecialidades = new DefaultListModel<>();
            for (Especialidade percorrer : medico.getEspecialidade()) {
                medicoEspecialidades.addElement(percorrer);
            }
            jListMedico.setModel(medicoEspecialidades);

        

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonMoverParaLista;
    private javax.swing.JButton buttonMoverParaMedico;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField fTextFieldCRM;
    private javax.swing.JFormattedTextField fTextFieldNascimento;
    private javax.swing.JFormattedTextField fTextFieldTelefone;
    private javax.swing.JList<Especialidade> jListEspecialidades;
    private javax.swing.JList<Especialidade> jListMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabelImgLogo;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidades;
    private javax.swing.JLabel labelListaMedico;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdicionarMedico;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables
}

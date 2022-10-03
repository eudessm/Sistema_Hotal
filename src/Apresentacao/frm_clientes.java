package Apresentacao;

import Dados.vclientes;
import Dados.vprodutos;
import Logica.fclientes;
import Logica.fprodutos;
import Logica.fquartos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_clientes extends javax.swing.JInternalFrame {

    public frm_clientes() {
        initComponents();
        desativar();
        mostrar("null");

    }

    private String acao = "salvar";

    void ocultar_coluna() {
        TB_lista.getColumnModel().getColumn(0).setMaxWidth(0);
        TB_lista.getColumnModel().getColumn(0).setMinWidth(0);
        TB_lista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void desativar() {
        txt_id_pessoa.setVisible(false);
        CB_tipo.setEnabled(false);
        txt_nome.setEnabled(false);
        txt_nomepai.setEnabled(false);
        txt_nomemae.setEnabled(false);
        txt_num_doc.setEnabled(false);
        txt_telefone.setEnabled(false);
        txt_email.setEnabled(false);
        txt_codigo_cliente.setEnabled(false);
        txt_endereco.setEnabled(false);

        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);

        txt_num_doc.setText("");
        txt_nomepai.setText("");
        txt_nome.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_endereco.setText("");
    }

    void ativar() {
        txt_id_pessoa.setVisible(false);
        CB_tipo.setEnabled(true);
        txt_nome.setEnabled(true);
        txt_nomepai.setEnabled(true);
        txt_nomemae.setEnabled(true);
        txt_num_doc.setEnabled(true);
        txt_telefone.setEnabled(true);
        txt_email.setEnabled(true);
        txt_codigo_cliente.setEnabled(true);
        txt_endereco.setEnabled(true);

        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);

        txt_num_doc.setText("");
        txt_nomepai.setText("");
        txt_nome.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_endereco.setText("");
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fclientes func = new fclientes();
            modelo = func.mostrar(buscar);
            TB_lista.setModel(modelo);
            ocultar_coluna();
            LB_registros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    void limpar() {
        txt_num_doc.setText("");
        txt_nomepai.setText("");
        txt_nome.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_endereco.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CB_tipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_num_doc = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_id_pessoa = new javax.swing.JTextField();
        txt_nomepai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nomemae = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_endereco = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        txt_codigo_cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_lista = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        btn_sair = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        LB_registros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastro de Clientes");

        jLabel3.setText("Nome");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço");

        CB_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "IDENTIDADE" }));
        CB_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_tipoActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero DOC");

        txt_num_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_docActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Limpar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_nomepai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomepaiActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome Pai");

        jLabel8.setText("E-mail");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel9.setText("Nome Mãe");

        txt_nomemae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomemaeActionPerformed(evt);
            }
        });

        jLabel12.setText("Tipo DOC");

        txt_endereco.setColumns(20);
        txt_endereco.setRows(5);
        jScrollPane1.setViewportView(txt_endereco);

        jLabel13.setText("Telefone");

        txt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefoneActionPerformed(evt);
            }
        });

        txt_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_clienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Cod Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146)
                        .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nome)
                                    .addComponent(txt_nomepai)
                                    .addComponent(CB_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_nomemae, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(txt_num_doc)))))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_nomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CB_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Lista de Produtos");

        TB_lista.setBackground(new java.awt.Color(204, 204, 204));
        TB_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TB_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TB_lista);

        jLabel11.setText("Pesquisar");

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        LB_registros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_registros)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_apagar)
                    .addComponent(btn_sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LB_registros)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        txt_nome.transferFocus();
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void CB_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_tipoActionPerformed
        CB_tipo.transferFocus();
    }//GEN-LAST:event_CB_tipoActionPerformed

    private void txt_num_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_docActionPerformed
        txt_num_doc.transferFocus();
    }//GEN-LAST:event_txt_num_docActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        ativar();
        btn_salvar.setText("Salvar");
        acao = "salvar";

    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_nome.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira o nome do cliente");
            txt_nome.requestFocus();
            return;
        }

        vclientes dts = new vclientes();
        fclientes func = new fclientes();

        dts.setNome(txt_nome.getText());
        dts.setCodigo_cliente(txt_codigo_cliente.getText());
        dts.setNome_pai(txt_nomepai.getText());
        dts.setNome_mae(txt_nomemae.getText());
        dts.setNum_documento(txt_num_doc.getText());
        dts.setEndereco(txt_endereco.getText());
        dts.setEmail(txt_email.getText());
        dts.setTelefone(txt_telefone.getText());

        int selecionado = CB_tipo.getSelectedIndex();
        dts.setTipo_documento((String) CB_tipo.getItemAt(selecionado));

        if (acao.equals("salvar")) {
            if (func.inserir(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O cliente foi registrado com sucesso!");
                mostrar("");
                desativar();
            }
        } else if (acao.equals("editar")) {
            dts.setId_pessoa(Integer.parseInt(txt_id_pessoa.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "O Cliente foi editado com sucesso!");
                mostrar("");
                desativar();
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void TB_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_listaMouseClicked
        btn_salvar.setText("Editar");
        ativar();
        btn_apagar.setEnabled(true);
        acao = "editar";
        int linha = TB_lista.rowAtPoint(evt.getPoint());

        txt_id_pessoa.setText(TB_lista.getValueAt(linha, 0).toString());
        txt_nome.setText(TB_lista.getValueAt(linha, 1).toString());
        txt_nomepai.setText(TB_lista.getValueAt(linha, 2).toString());
        txt_nomemae.setText(TB_lista.getValueAt(linha, 3).toString());
        CB_tipo.setSelectedItem(TB_lista.getValueAt(linha, 4).toString());
        txt_num_doc.setText(TB_lista.getValueAt(linha, 5).toString());
        txt_endereco.setText(TB_lista.getValueAt(linha, 6).toString());
        txt_telefone.setText(TB_lista.getValueAt(linha, 7).toString());
        txt_email.setText(TB_lista.getValueAt(linha, 8).toString());
        txt_codigo_cliente.setText(TB_lista.getValueAt(linha, 9).toString());
    }//GEN-LAST:event_TB_listaMouseClicked

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (!txt_id_pessoa.getText().equals("")) {
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro", "Exluir", 2);
            if (confirmacao == 0) {
                vclientes dts = new vclientes();
                fclientes func = new fclientes();
                dts.setId_pessoa(Integer.parseInt(txt_id_pessoa.getText()));
                func.deletar(dts);
                mostrar("");
                desativar();
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_pesquisar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_nomepaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomepaiActionPerformed
        txt_nomepai.transferFocus();
    }//GEN-LAST:event_txt_nomepaiActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
       txt_email.transferFocus();
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_nomemaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomemaeActionPerformed
        txt_nomemae.transferFocus();
    }//GEN-LAST:event_txt_nomemaeActionPerformed

    private void txt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefoneActionPerformed
        txt_telefone.transferFocus();
    }//GEN-LAST:event_txt_telefoneActionPerformed

    private void txt_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_clienteActionPerformed
        txt_codigo_cliente.transferFocus();
    }//GEN-LAST:event_txt_codigo_clienteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_tipo;
    private javax.swing.JLabel LB_registros;
    private javax.swing.JTable TB_lista;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txt_codigo_cliente;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextArea txt_endereco;
    private javax.swing.JTextField txt_id_pessoa;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomemae;
    private javax.swing.JTextField txt_nomepai;
    private javax.swing.JTextField txt_num_doc;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}

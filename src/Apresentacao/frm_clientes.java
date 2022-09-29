package Apresentacao;

import Dados.vClientes;
import Logica.fClientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_clientes extends javax.swing.JFrame {

    public frm_clientes() {
        initComponents();
        desativar();
        mostrar("");
        this.setLocationRelativeTo(null);
    }

    private String acao = "Salvar";

    void ocultar_coluna() {
        tb_lista.getColumnModel().getColumn(0).setMaxWidth(0);
        tb_lista.getColumnModel().getColumn(0).setMinWidth(0);
        tb_lista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void desativar() {
        txt_id_pessoa.setVisible(false);
        txt_nome.setEnabled(false);
        txt_cod_cliente.setEnabled(false);
        txt_nome_pai.setEnabled(false);
        txt_nome_mae.setEnabled(false);
        cb_tipo_doc.setEnabled(false);
        txt_num_doc.setEnabled(false);
        txt_email.setEnabled(false);
        txt_telefone.setEnabled(false);
        txt_endereco.setEnabled(false);

        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);

        txt_nome.setText("");
       txt_nome.setText("");
       txt_cod_cliente.setText("");
        txt_nome_pai.setText("");
       txt_nome_mae.setText("");
        cb_tipo_doc.setSelectedItem("");
        txt_num_doc.setText("");
       txt_email.setText("");
       txt_telefone.setText("");
       txt_endereco.setText("");
    }

    void ativar() {
        txt_nome.setEnabled(true);
        txt_cod_cliente.setEnabled(true);
        txt_nome_pai.setEnabled(true);
        txt_nome_mae.setEnabled(true);
        cb_tipo_doc.setEnabled(true);
        txt_num_doc.setEnabled(true);
        txt_email.setEnabled(true);
        txt_telefone.setEnabled(true);
        txt_endereco.setEnabled(true);

        btn_salvar.setEnabled(true);
        btn_novo.setEnabled(true);
        btn_cancelar.setEnabled(true);

        txt_nome.setText("");
        txt_nome.setText("");
        txt_cod_cliente.setText("");
        txt_nome_pai.setText("");
        txt_nome_mae.setText("");
        cb_tipo_doc.setSelectedItem("");
        txt_num_doc.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_endereco.setText("");
    }

    void limpar() {
        txt_id_pessoa.setText("");
        txt_nome.setText("");
        txt_nome.setText("");
        txt_cod_cliente.setText("");
        txt_nome_pai.setText("");
        txt_nome_mae.setText("");
        cb_tipo_doc.setSelectedItem("");
        txt_num_doc.setText("");
        txt_email.setText("");
        txt_telefone.setText("");
        txt_endereco.setText("");
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fClientes func = new fClientes();
            modelo = func.mostrar(buscar);
            tb_lista.setModel(modelo);
            ocultar_coluna();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_tipo_doc = new javax.swing.JComboBox();
        txt_id_pessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_num_doc = new javax.swing.JTextField();
        txt_nome_pai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nome_mae = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_endereco = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txt_cod_cliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastro de Clientes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("Nome Pai");

        cb_tipo_doc.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cb_tipo_doc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CPF", "RG" }));
        cb_tipo_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipo_docActionPerformed(evt);
            }
        });

        txt_id_pessoa.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("Numero");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("Tipo Doc");

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/novo01.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/salvar01.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/cancelar01.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_num_doc.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_num_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_docActionPerformed(evt);
            }
        });

        txt_nome_pai.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_nome_pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_paiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setText("Nome Mãe");

        txt_nome_mae.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_nome_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_maeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel9.setText("Endereço");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("Telefone");

        txt_telefone.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefoneActionPerformed(evt);
            }
        });

        txt_endereco.setColumns(20);
        txt_endereco.setRows(5);
        jScrollPane1.setViewportView(txt_endereco);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel13.setText("Código Cliente");

        txt_cod_cliente.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_cod_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_tipo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(196, 196, 196)
                        .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(txt_num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Lista de Clientes");

        jLabel1.setText("Pesquisar");

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/sair01.jpg"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/buscar01.jpg"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Imagens/Icones/deletar.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        tb_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_lista.setColumnSelectionAllowed(true);
        tb_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_lista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_apagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_sair)
                    .addComponent(btn_buscar)
                    .addComponent(btn_apagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        txt_nome.transferFocus();
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void cb_tipo_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipo_docActionPerformed
        cb_tipo_doc.transferFocus();
    }//GEN-LAST:event_cb_tipo_docActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        ativar();
        btn_salvar.setText("Salvar");
        acao = "Salvar";
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        if (txt_nome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o nome do Cliente");
            txt_nome.requestFocus();
            return;
        }
        if (cb_tipo_doc.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Insira o tipo do documento");
            txt_num_doc.requestFocus();
            return;
        }
        if (txt_num_doc.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o número do documento");
            txt_num_doc.requestFocus();
            return;
        }
        if (txt_telefone.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o número de telefone");
            txt_telefone.requestFocus();
            return;
        }
        if (txt_email.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o e-mial ");
            txt_email.requestFocus();
            return;
        }

        fClientes func = new fClientes();
        vClientes dts = new vClientes();

        dts.setNome(txt_nome.getText());
        dts.setNome_pai(txt_nome_pai.getText());
        dts.setNome_mae(txt_nome_mae.getText());
        dts.setNum_documento(txt_num_doc.getText());
        dts.setEmail(txt_email.getText());
        dts.setTelefone(txt_telefone.getText());
        dts.setEndereco(txt_endereco.getText());
        dts.setCodigo_cliente(txt_cod_cliente.getText());

        int selecionado = cb_tipo_doc.getSelectedIndex();
        dts.setTipo_documento((String) cb_tipo_doc.getItemAt(selecionado));

        switch (acao) {
            case "Salvar":
                if (func.inserir(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente foi registrado com sucesso");
                    mostrar("");
                    desativar();
                    break;
                }
            case "Editar":
                dts.setId_pessoa(Integer.parseInt(txt_id_pessoa.getText()));
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente foi alterado com sucesso");
                    mostrar("");
                    desativar();
                    break;
                }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_num_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_docActionPerformed
        txt_num_doc.transferFocus();
    }//GEN-LAST:event_txt_num_docActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_pesquisar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        
        if (!txt_id_pessoa.getText().equals("")) {
            int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente apagar o registro?");
            if (confirma == 0) {
                vClientes dts = new vClientes();
                fClientes func = new fClientes();
                dts.setId_pessoa(Integer.parseInt(txt_id_pessoa.getText()));
                func.deletar(dts);
                mostrar("");
                desativar();

            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void tb_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_listaMouseClicked
        btn_salvar.setText("Editar");
        ativar();
        btn_apagar.setEnabled(true);
        acao = "editar";
        int linha = tb_lista.rowAtPoint(evt.getPoint());

        //Seguir ordem da tabela
        txt_id_pessoa.setText(tb_lista.getValueAt(linha, 0).toString());
        txt_nome.setText(tb_lista.getValueAt(linha, 1).toString());
        txt_nome_pai.setText(tb_lista.getValueAt(linha, 2).toString());
        txt_nome_mae.setText(tb_lista.getValueAt(linha, 3).toString());
        cb_tipo_doc.setSelectedItem(tb_lista.getValueAt(linha, 4).toString());
        txt_num_doc.setText(tb_lista.getValueAt(linha, 5).toString());
        txt_endereco.setText(tb_lista.getValueAt(linha, 6).toString());
        txt_telefone.setText(tb_lista.getValueAt(linha, 7).toString());
        txt_email.setText(tb_lista.getValueAt(linha, 8).toString());
        txt_cod_cliente.setText(tb_lista.getValueAt(linha, 9).toString());
        

    }//GEN-LAST:event_tb_listaMouseClicked

    private void txt_nome_paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_paiActionPerformed
        txt_nome_pai.transferFocus();
    }//GEN-LAST:event_txt_nome_paiActionPerformed

    private void txt_nome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_maeActionPerformed
        txt_nome_mae.transferFocus();
    }//GEN-LAST:event_txt_nome_maeActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        txt_email.transferFocus();
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefoneActionPerformed
        txt_telefone.transferFocus();
    }//GEN-LAST:event_txt_telefoneActionPerformed

    private void txt_cod_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_clienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cb_tipo_doc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_lista;
    private javax.swing.JTextField txt_cod_cliente;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextArea txt_endereco;
    private javax.swing.JTextField txt_id_pessoa;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nome_mae;
    private javax.swing.JTextField txt_nome_pai;
    private javax.swing.JTextField txt_num_doc;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}

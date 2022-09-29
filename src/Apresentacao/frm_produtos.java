package Apresentacao;

import Dados.vProdutos;
import Logica.fProdutos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frm_produtos extends javax.swing.JFrame {

    public frm_produtos() {
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
        txt_id_produto.setVisible(false);
        cb_unidade.setVisible(false);
        txt_nome.setVisible(false);
        txt_descricao.setVisible(false);
        txt_valorProduto.setVisible(false);
        txt_id_produto.setVisible(false);

        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);

        txt_nome.setText("");
        txt_descricao.setText("");
        txt_valorProduto.setText("");
    }

    void ativar() {
        cb_unidade.setVisible(true);
        txt_nome.setVisible(true);
        txt_descricao.setVisible(true);
        txt_valorProduto.setVisible(true);
        txt_id_produto.setVisible(false);

        btn_salvar.setVisible(true);
        btn_novo.setVisible(true);
        btn_cancelar.setVisible(true);

        txt_nome.setText("");
        txt_descricao.setText("");
        txt_valorProduto.setText("");
    }

    void limpar() {
        txt_id_produto.setText("");
        txt_nome.setText("");
        txt_descricao.setText("");
        txt_valorProduto.setText("");
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fProdutos func = new fProdutos();
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
        cb_unidade = new javax.swing.JComboBox();
        txt_id_produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextPane();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_valorProduto = new javax.swing.JTextField();
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
        setTitle("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastro de Produtos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("Nome");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("Descrição");

        cb_unidade.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cb_unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KG", "UNIDADE", "LITRO", "MINUTO", "GLOBAL" }));
        cb_unidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_unidadeActionPerformed(evt);
            }
        });

        txt_id_produto.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("Valor Produto");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("Unidade Medida");

        jScrollPane2.setViewportView(txt_descricao);

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

        txt_valorProduto.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt_valorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_novo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addGap(0, 56, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Lista de Produtos");

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
        tb_lista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        txt_nome.transferFocus();
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void cb_unidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_unidadeActionPerformed
        cb_unidade.transferFocus();
    }//GEN-LAST:event_cb_unidadeActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        ativar();
        btn_salvar.setText("Salvar");
        acao = "Salvar";
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        if (txt_nome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o nome do produto");
            txt_nome.requestFocus();
            return;
        }
        if (txt_valorProduto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira o valor do produto");
            txt_descricao.requestFocus();
            return;
        }

        if (txt_descricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Insira a descrição do produto");
            txt_descricao.requestFocus();
            return;
        }

        fProdutos func = new fProdutos();
        vProdutos dts = new vProdutos();

        dts.setNome(txt_nome.getText());
        dts.setDescricao(txt_descricao.getText());
        dts.setValor_produto(Double.parseDouble(txt_valorProduto.getText()));

        int selecionado = cb_unidade.getSelectedIndex();
        dts.setUnidade_medida((String) cb_unidade.getItemAt(selecionado));

        switch (acao) {
            case "Salvar":
                if (func.inserir(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Produto foi registrado com sucesso");
                    mostrar("");
                    desativar();
                    break;
                }
            case "Editar":
                dts.setIdProduto(Integer.parseInt(txt_id_produto.getText()));
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Produto foi alterado com sucesso");
                    mostrar("");
                    desativar();
                    break;
                }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        limpar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_valorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorProdutoActionPerformed
        txt_valorProduto.transferFocus();
    }//GEN-LAST:event_txt_valorProdutoActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_pesquisar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (!txt_id_produto.getText().equals("")) {
            int confirma = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente apagar o registro?");
            if (confirma == 0) {
                vProdutos dts = new vProdutos();
                fProdutos func = new fProdutos();
                dts.setIdProduto(Integer.parseInt(txt_id_produto.getText()));
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

        txt_id_produto.setText(tb_lista.getValueAt(linha, 0).toString());
        txt_nome.setText(tb_lista.getValueAt(linha, 1).toString());
        cb_unidade.setSelectedItem(tb_lista.getValueAt(linha, 3).toString());
        txt_descricao.setText(tb_lista.getValueAt(linha, 2).toString());
        txt_valorProduto.setText(tb_lista.getValueAt(linha, 4).toString());

    }//GEN-LAST:event_tb_listaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_produtos().setVisible(true);
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
    private javax.swing.JComboBox cb_unidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_lista;
    private javax.swing.JTextPane txt_descricao;
    private javax.swing.JTextField txt_id_produto;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_valorProduto;
    // End of variables declaration//GEN-END:variables
}

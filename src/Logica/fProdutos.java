package Logica;

import Dados.vProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fProdutos {

    private Conexao mysql = new Conexao();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        // vai aparecer no cabeçalho da lista  "titulo"
        String[] titulo = {"id", "Produto", "descrição", "Unidade Medida", "Preço Venda"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulo);
        sSQL = "Select * from tb_produtos where nome like '%" + buscar + "%' order by id_produtos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("id_produtos");
                registro[1] = rs.getString("nome");
                registro[2] = rs.getString("descricao");
                registro[3] = rs.getString("unidade_medida");
                registro[4] = rs.getString("preco_venda");
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    // Metodo para adicionar as informações das variaves no banco
    public boolean inserir(vProdutos dts) {

        sSQL = "insert into tb_produtos (nome, descricao, unidade_medida, preco_venda) "
                + "values(?,?,?,?) ";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getNome());
            pst.setString(2, dts.getDescricao());
            pst.setString(3, dts.getUnidade_medida());
            pst.setDouble(4, dts.getValor_produto());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    // Metodo para editar as variaves no banco
    public boolean editar(vProdutos dts) {

        sSQL = "update tb_produtos set nome=?, descricao=? ,unidade_medida=? ,preco_venda=? "
                + "where id_produtos=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNome());
            pst.setString(2, dts.getDescricao());
            pst.setString(3, dts.getUnidade_medida());
            pst.setDouble(4, dts.getValor_produto());
            pst.setInt(5, dts.getIdProduto());
            
            
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    // Metodo para exluir as informações das variaves no banco
    public boolean deletar(vProdutos dts) {

        sSQL = "delete from tb_produtos where id_produtos=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(0, dts.getIdProduto());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}

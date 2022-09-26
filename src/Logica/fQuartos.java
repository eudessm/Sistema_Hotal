
package Logica;

import Dados.vQuartos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fQuartos {

    private Conexao mysql = new Conexao();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        // vai aparecer no cabeçalho da lista  "titulo"
        String[] titulo = {"id", "numero", "andar", "descrição", "caracteristicas", "preço", "Status", "Tipo de Quarto"};
        String[] registro = new String[8];

        modelo = new DefaultTableModel(null, titulo);
        sSQL = "Select * from tb_quartos where andar like '$" + buscar + "%' order by id_quartos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("id_quartos");
                registro[1] = rs.getString("numero");
                registro[2] = rs.getString("andar");
                registro[3] = rs.getString("descricao");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("preco_diaria");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipo_quarto");
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
    public boolean inserir(vQuartos dts) {

        sSQL = "insert into tb_quartos (numero, andar, descricao ,caracteristicas ,preco_diaria, estado ,tipo_quarto) "
                + "values(?,?,?,?,?,?,?) ";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getAndar());
            pst.setString(3, dts.getDescricao());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecoDiaria());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipoQuarto());

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
    public boolean editar(vQuartos dts) {

        sSQL = "update tb_quartos set numero=?, andar=?, descricao=? ,caracteristicas=? ,preco_diaria=? , estado=? ,tipo_quarto=? "
                + "where id_quartos=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getAndar());
            pst.setString(3, dts.getDescricao());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPrecoDiaria());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipoQuarto());
            pst.setInt(8, dts.getIdQuartos());
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
    public boolean deletar(vQuartos dts) {

        sSQL = "deletar from tb_quartos where id_quartos=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(0, dts.getIdQuartos());
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

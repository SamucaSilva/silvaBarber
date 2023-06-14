package dao;

import apoio.ConexaoBD;
import apoio.IDAO_T;
import entidade.Cidade;
import entidade.Estado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CidadeDAO implements IDAO_T<Cidade> {

    ResultSet resultadoQ = null;
    private Cidade Cidade;

    public String salvar(Cidade o) {

        try {
            String sql = ""
                    + "INSERT INTO cidades (estado_id, descricao) VALUES ("
                    + "'" + o.getEstado_id() + "',"
                    + "'" + o.getDescricao() + "' "
                    + ")";

            System.out.println("sql: " + sql);

            ConexaoBD.executeUpdate(sql);

            return null;
        } catch (SQLException e) {
            System.out.println("Erro inserir cidade = " + e);
            return e.toString();
        }

    }


    @Override
    public String atualizar(Cidade o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cidade> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cidade> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cidade consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @param o
     * @return
     */
//    public String atualizar(Estado o) {
//        try {
//            String sql = ""
//                    + "UPDATE cidade "
//                    + "SET "
//                    + "Descricao = '" + o.getDescricao() + "',"
//                    + "cidade_id = '" + o.getEstado_id() + "' "
//                    + "WHERE id = " + o.getId();
//
//            System.out.println("sql: " + sql);
//
//            ConexaoBD.executeUpdate(sql);
//
//            return null;
//        } catch (SQLException e) {
//            System.out.println("Erro atualizar cidade = " + e);
//            return e.toString();
//        }
//    }
//
//    @Override
//    public String excluir(int id) {
//        try {
//            String sql = ""
//                    + "DELETE FROM cidades"
//                    + "WHERE id = " + id + "";
//
//            System.out.println("sql: " + sql);
//
//            ConexaoBD.executeUpdate(sql);
//
//            return null;
//        } catch (SQLException e) {
//            System.out.println("Erro excluir/inativar cidade = " + e);
//            return e.toString();
//        }
//    }
//
//    @Override
//    public ArrayList<Cidade> consultarTodos() {
//        ArrayList<Cidade> cidades = new ArrayList<>();
//
//        try {
//            String sql = ""
//                    + "SELECT * FROM descricao ";
//
//            resultadoQ = ConexaoBD.executeQuery(sql);
//
//            while (resultadoQ.next()) {
//                Cidade cidade = new Cidade();
//
//                cidade.setId(resultadoQ.getInt("id"));
//                cidade.setDescricao(resultadoQ.getString("descricao"));
//                cidade.setEstado_id(resultadoQ.getString("estado_id"));
//
//                cidades.add(cidade);
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro consultar todos cidades = " + e);
//        }
//
//        return cidades;
//    }
//
//    @Override
//    public ArrayList<Cidade> consultar(String criterio) {
//        ArrayList<Cidade> cidades = new ArrayList<>();
//
//        try {
//            String sql = ""
//                    + "SELECT * FROM cidade "
//                    + "WHERE  "
//                    + "descricao ILIKE '%" + criterio + "%' "
//                    + "ORDER BY descricao";
//
//            resultadoQ = ConexaoBD.executeQuery(sql);
//
//            while (resultadoQ.next()) {
//                Cidade cidade = new Cidade();
//
//                cidade.setId(resultadoQ.getInt("id"));
//                cidade.setDescricao(resultadoQ.getString("descricao"));
//                cidade.setEstado_id(resultadoQ.getString("estado_id"));
//
//                cidades.add(cidade);
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro consultar todos cidades = " + e);
//        }
//
//        return cidades;
//    }
//
//    @Override
//    public Cidade consultarId(int id) {
//        Estado u = null;
//
//        try {
//            String sql = ""
//                    + "SELECT * FROM cidades "
//                    + "WHERE  "
//                    + "id = " + id;
//
//            System.out.println("sql: " + sql);
//
//            resultadoQ = ConexaoBD.executeQuery(sql);
//
//            if (resultadoQ.next()) {
//                u = new Estado();
//
//                u.setId(id);
//                u.setDescricao(resultadoQ.getString("descricao"));
//                u.setUf(resultadoQ.getString("uf"));
//
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Erro consultar cidade = " + e);
//        }
//
//        return Cidade;
//    }
//
//    /**
//     * Consulta no banco de dados e popula uma tabela
//     *
//     * @param tabela: nome da tabela a ser populada
//     * @param criterio: criterio de busca no banco
//     */
//    public void popularTabela(JTable tabela, String criterio) {
//        // dados da tabela
//        Object[][] dadosTabela = null;
//        int colunas = 3;
//
//        // cabecalho da tabela
//        Object[] cabecalho = new Object[colunas];
//        cabecalho[0] = "Código";
//        cabecalho[1] = "Descrição";
//        cabecalho[2] = "Uf";
//
//        // cria matriz de acordo com nº de registros da tabela
//        try {
//            String sql = ""
//                    + "SELECT count(*) FROM cidades "
//                    + "WHERE  "
//                    + "descricao ILIKE '%" + criterio + "%'";
//
//            resultadoQ = ConexaoBD.executeQuery(sql);
//
//            resultadoQ.next();
//
//            dadosTabela = new Object[resultadoQ.getInt(1)][colunas];
//
//        } catch (Exception e) {
//            System.out.println("Erro ao consultar cidade: " + e);
//        }
//
//        int lin = 0;
//
//        // efetua consulta na tabela
//        try {
//            String sql = ""
//                    + "SELECT id, descricao, estado_id FROM cidades "
//                    + "WHERE  "
//                    + "descricao ILIKE '%" + criterio + "%' "
//                    + "ORDER BY estado_id";
//
//            resultadoQ = ConexaoBD.executeQuery(sql);
//
//            while (resultadoQ.next()) {
//
//                dadosTabela[lin][0] = resultadoQ.getInt("id");
//                dadosTabela[lin][1] = resultadoQ.getString("descricao");
//                dadosTabela[lin][2] = resultadoQ.getString("estado_id");
//
//                // caso a coluna precise exibir uma imagem
////                if (resultadoQ.getBoolean("Situacao")) {
////                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
////                } else {
////                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
////                }
//                lin++;
//            }
//        } catch (SQLException e) {
//            System.out.println("problemas para popular tabela...");
//            System.err.println(e);
//        }
//
//        // configuracoes adicionais no componente tabela
//        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
//            @Override
//            // quando retorno for FALSE, a tabela nao é editavel
//            public boolean isCellEditable(int row, int column) {
//                return false;
//                /*  
//                 if (column == 3) {  // apenas a coluna 3 sera editavel
//                 return true;
//                 } else {
//                 return false;
//                 }
//                 */
//            }
//
//            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
//            @Override
//            public Class getColumnClass(int column) {
//
//                if (column == 2) {
////                    return ImageIcon.class;
//                }
//                return Object.class;
//            }
//        });
//
//        // permite seleção de apenas uma linha da tabela
//        tabela.setSelectionMode(0);
//
//        // redimensiona as colunas de uma tabela
//        TableColumn column = null;
//        for (int i = 0; i < tabela.getColumnCount(); i++) {
//            column = tabela.getColumnModel().getColumn(i);
//            switch (i) {
//                case 0:
//                    column.setPreferredWidth(17);
//                    break;
//                case 1:
//                    column.setPreferredWidth(140);
//                    break;
////                case 2:
////                    column.setPreferredWidth(14);
////                    break;
//            }
//        }
//        // renderizacao das linhas da tabela = mudar a cor
////        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
////
////            @Override
////            public Component getTableCellRendererComponent(JTable table, Object value,
////                    boolean isSelected, boolean hasFocus, int row, int column) {
////                super.getTableCellRendererComponent(table, value, isSelected,
////                        hasFocus, row, column);
////                if (row % 2 == 0) {
////                    setBackground(Color.GREEN);
////                } else {
////                    setBackground(Color.LIGHT_GRAY);
////                }
////                return this;
////            }
////        });
//    }
//
//    @Override
//    public String salvar(Cidade o) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public String atualizar(Cidade o) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}

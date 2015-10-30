/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sqlconexao.ConectaBanco;

/**
 *
 * @author Weslley
 */
public class FuncoesTelaEntrada {

    ConectaBanco conecta = new ConectaBanco();

    public boolean validaQuantidadeMaxima(int idProduto, int qtdItem) {

        int qtdAtual = 0, somaQtd = 0, qtdMaxima;
        boolean validar = false;
        conecta.conexao();
        conecta.executaSQL("select * from produto where id_produto =" + idProduto + "");
        try {
            conecta.rs.first();
            qtdAtual = conecta.rs.getInt("QTD_ESTOQUE");
            qtdMaxima = conecta.rs.getInt("QTD_MAXIMO");
            somaQtd = qtdAtual + qtdItem;

            if (qtdMaxima > somaQtd) {
                validar = true;
            } else {

            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncoesTelaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return validar;
    }


    /*
     public void preencherIdEntrada() {
     conecta.conexao();
     conecta.executaSQL("select max(id_entrada + 1)[max] from movimentacao_entrada");
     try {
     conecta.rs.first();
     idEntrada = conecta.rs.getInt("max");
     } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Falha ao buscar ultimo  IdEntrada.\n" + ex);
     }
     conecta.desconecta();
     }
     */
}

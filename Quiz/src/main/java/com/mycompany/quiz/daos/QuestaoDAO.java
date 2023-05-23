/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz.daos;

/**
 *
 * @author mathe
 */
import com.mycompany.quiz.ConnectionFactory;
import com.mycompany.quiz.Questao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

public class QuestaoDAO {
    private Connection connection;
    
    public QuestaoDAO(){
        this.connection = new ConnectionFactory().obtemConexao();
    }
    
    public Questao [] obterQuestoes () throws Exception {
        String sql = "SELECT * FROM tb_questao";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            int totalQuestoes = rs.last() ? rs.getRow() : 0;
            Questao [] questoes = new Questao[totalQuestoes];
            rs.beforeFirst();
            int contador = 0;
            while(rs.next()){
                int id = rs.getInt("id");
                String pergunta = rs.getString("Pergunta");
                String alternativaA = rs.getString("alternativaA");
                String alternativaB = rs.getString("alternativaB");
                String alternativaC = rs.getString("alternativaC");
                String alternativaD = rs.getString("alternativaD");
                String justificativa = rs.getString("justificativa");
                String alternativaCorreta = rs.getString("alternativaCorreta");
                questoes[contador++] = new Questao(id, pergunta, alternativaA, alternativaB, alternativaC, alternativaD, alternativaCorreta, justificativa);
            }
            return questoes;
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    
    }
}

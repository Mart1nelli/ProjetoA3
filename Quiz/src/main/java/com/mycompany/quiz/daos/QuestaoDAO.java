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
    
    public void criaQuestao(Questao questao) {
        String sql = "INSERT INTO tb_questao (pergunta, alternativaA, alternativaB," + 
                 " alternativaC, alternativaD, alternativaCorreta, justificativa) VALUES"
                 + " (?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, questao.getPergunta());
            ps.setString(2, questao.getAlternativaA());
            ps.setString(3,questao.getAlternativaB());
            ps.setString(4,questao.getAlternativaC());
            ps.setString(5,questao.getAlternativaD());
            ps.setString(6,questao.getAlternativaCorreta());
            ps.setString(7, questao.getJustificativa());
            ps.execute();
            ps.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void removeQuestao(Questao questao) {
        String sql = "DELETE FROM tb_questao WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, questao.getId());
            ps.execute();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void atualizaQuestao(Questao questao){
        String sql = "UPDATE tb_questao SET pergunta = ?, alternativaA = ?, "
        + "alternativaB = ?, alternativaC = ?, alternativaD = ?, alternativaCorreta = ?, "
        + "justificativa = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, questao.getPergunta());
            ps.setString(2, questao.getAlternativaA());
            ps.setString(3, questao.getAlternativaB());
            ps.setString(4, questao.getAlternativaC());
            ps.setString(5, questao.getAlternativaD());
            ps.setString(6, questao.getAlternativaCorreta());
            ps.setString(7, questao.getJustificativa());
            ps.setInt(8, questao.getId());
            ps.execute();
        
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
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

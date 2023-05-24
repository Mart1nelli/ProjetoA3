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
import com.mycompany.quiz.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

public class UsuarioDAO {
  private Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().obtemConexao();
    }
    public void adicionaUser(Usuario usuario){
        String sql = "INSERT INTO tb_usuario(nome,senha,email) VALUES(?,?,?)";
        try { 
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3,usuario.getEmail());
            ps.execute();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    
    }
    
    public void removeUser(Usuario usuario){
        String sql = "DELETE FROM tb_usuario WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            ps.execute();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void atualizaUser(Usuario usuario){
        String sql = "UPDATE tb_usuario SET nome = ?, senha = ?, email = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setInt(4, usuario.getId());
            ps.execute();
        
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public boolean existeUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2,usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    
    }
    
    public boolean existeNomeUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    
    }
    
    public boolean existeEmailUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE email = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    
    }
    
    public void setUserByNome(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPontuacao(rs.getInt("pontuacao"));
                usuario.setId(rs.getInt("id"));
            }
        
        
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    
    
    }
    
    public String getEmailUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String email = rs.getString("email");
                return email;
            }else{
                return null;
            }
        }catch(SQLException u){
            throw new RuntimeException(u); 
        }
       
    }
    
    public void atualizaPontuacaoUser(Usuario usuario){
        String sql = "UPDATE tb_usuario SET pontuacao = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            int pontuacao = usuario.getPontuacao();
            pontuacao = pontuacao + 1;
            ps.setInt(1, pontuacao);
            ps.setInt(2, usuario.getId());
            ps.execute();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
                
    
    }
    
    public void resetPontuacaoUser(Usuario usuario){
        String sql = "UPDATE tb_usuario SET pontuacao = 0 WHERE id = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, usuario.getId());
            ps.execute();
            
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    
    
    }
    
    public int getPontuacaoUser(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int pontuacao = rs.getInt("pontuacao");
                return pontuacao;
            }else{
                return 0;
            }
        }catch(SQLException u){
            throw new RuntimeException(u); 
        }
       
    }
    
    public Usuario [] obterUsuarios () throws Exception {
        String sql = "SELECT * FROM tb_usuario";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            int totalUsuarios = rs.last() ? rs.getRow() : 0;
            Usuario [] usuarios = new Usuario[totalUsuarios];
            rs.beforeFirst();
            int contador = 0;
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                int pontuacao  = rs.getInt("pontuacao");
                usuarios[contador++] = new Usuario(id, nome, email, pontuacao);
            }
            return usuarios;
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
}  


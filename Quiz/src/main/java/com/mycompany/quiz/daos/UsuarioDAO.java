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
            ps.close();
        } 
        catch (SQLException u) { 
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
    
}  


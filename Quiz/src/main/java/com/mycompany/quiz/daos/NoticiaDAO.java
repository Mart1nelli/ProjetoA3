/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz.daos;

/**
 *
 * @author 823159187
 */
import com.mycompany.quiz.ConnectionFactory;
import com.mycompany.quiz.Noticia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

public class NoticiaDAO {
    private Connection connection;
    
    public NoticiaDAO(){
        this.connection = new ConnectionFactory().obtemConexao();
    }
    
    public void criaNoticia(Noticia noticia){
        String sql = "INSERT INTO tb_noticia (titulo, resumo, url) VALUES (?, ?, ?)";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, noticia.getTitulo());
            ps.setString(2, noticia.getResumo());
            ps.setString(3, noticia.getUrl());
            ps.execute();
            
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void atualizaNoticia(Noticia noticia){
        String sql = "UPDATE tb_noticia SET titulo = ?, resumo = ?, url = ? WHERE id = ?";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, noticia.getTitulo());
            ps.setString(2, noticia.getResumo());
            ps.setString(3, noticia.getUrl());
            ps.setInt(4, noticia.getId());
            ps.execute();
            
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void deletaNoticia(Noticia noticia){
        String sql = "DELETE FROM tb_noticia WHERE id = ?";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, noticia.getId());
            ps.execute();
            
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public Noticia [] obterNoticias () throws Exception {
        String sql = "SELECT * FROM tb_noticia";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            int totalNoticias = rs.last() ? rs.getRow() : 0;
            Noticia [] noticias = new Noticia[totalNoticias];
            rs.beforeFirst();
            int contador = 0;
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String resumo = rs.getString("resumo");
                String url  = rs.getString("url");
                noticias[contador++] = new Noticia(id, titulo, resumo, url);
            }
            return noticias;
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    
}

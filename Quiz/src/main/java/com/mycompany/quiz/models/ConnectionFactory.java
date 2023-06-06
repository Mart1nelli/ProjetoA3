/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz.models;

/**
 *
 * @author mathe
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_quiz";
    
    public Connection obtemConexao(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+bd+"?user="+usuario+"&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        } 
    }
}

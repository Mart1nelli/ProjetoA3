/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author mathe
 */
public class Sessao {
    // Variável estática que conterá a instancia da classe
    private static Sessao instance;
    private String nomeLogin;

    // Construtor privado (suprime o construtor público padrão).
    private Sessao() {}

    // Método público estático de acesso único ao objeto!
    public static Sessao getInstance() {
        if (instance == null)
            instance = new Sessao();
        return instance;
    }
    public void setNomeLogin(String nomeLogin){
        this.nomeLogin = nomeLogin;
    }
    public String getNomeLogin(){
        return nomeLogin;
    }

}

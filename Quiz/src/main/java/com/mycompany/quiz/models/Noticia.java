package com.mycompany.quiz.models;

public class Noticia {
    
    private int id;
    private String titulo;
    private String resumo;
    private String url;
    
    public Noticia(){
    
    }
    
    public Noticia(int id, String titulo, String resumo, String url){
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.url = url;
    
    }
    
    public Noticia(String titulo, String resumo, String url){
        this.titulo = titulo;
        this.resumo = resumo;
        this.url = url;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public String toString(){
        return this.titulo;
    }
    
    

    
}

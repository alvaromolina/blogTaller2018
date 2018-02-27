package com.ucbcba;

public class Articulo {

    private Comentario[] comentarios;
    private String texto;


    public Comentario[] getComentarios() {
        return comentarios;
    }

    public void setComentarios(Comentario[] comentarios) {
        this.comentarios = comentarios;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

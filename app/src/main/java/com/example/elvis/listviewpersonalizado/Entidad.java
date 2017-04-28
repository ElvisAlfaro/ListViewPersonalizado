package com.example.elvis.listviewpersonalizado;

/**
 * Created by Elvis on 27 abr 2017.
 */

public class Entidad {

    private int imgFoto;
    private String titulo;
    private String contenido;

    public Entidad(int imgFoto, String titulo, String contenido) {
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}

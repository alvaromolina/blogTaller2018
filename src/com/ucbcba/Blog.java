package com.ucbcba;

import java.util.List;

public class Blog extends SitioWeb  {

    private List articulos;

    public Blog(String url){
        this.url = url;
    }
    public void anadirArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    public void getArticulo(int index){
        articulos.get(index);
    }



}

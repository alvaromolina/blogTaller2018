package com.ucbcba;

public abstract class SitioWeb {
    protected String url="www.google.com";
    protected String nombre="google";

    public String getCompleteUrl(){
        return "http://"+url;
    };
}

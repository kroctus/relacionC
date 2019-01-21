/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionc;

/**
 *
 * @author gabriel
 */
public class Cancion {
    
    private String titulo;
    private String autor;

    
    // Constructor parametrizado
    public Cancion(String tit, String aut){
        
        autor=aut;
        titulo=tit;
    
    }
    
    // Constructor por defecto
    public Cancion(){
        autor="";
        titulo="";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
    
    
    
}



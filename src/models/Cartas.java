package models;

public class Cartas {
    public int vida;
    public int ataque;
    int elixir;
    String personaje;
    String imagen;
    
    //Getters y Setters
    public Cartas(int vida, int ataque, int elixir, String personajes, String imagen) {
        this.vida = vida;
        this.ataque = ataque;
        this.elixir = elixir;
        this.personaje = personajes;
        this.imagen = imagen;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getElixir() {
        return elixir;
    }
    public void setElixir(int elixir) {
        this.elixir = elixir;
    }
    public String getPersonaje() {
        return personaje;
    }
    public void setPersonaje(String personajes) {
        this.personaje = personajes;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    //El 0 la personaje tiene X pts. de vida y X pts. de ataque
    @Override
    public String toString() {
        return "\""+personaje + "\" tiene: " + vida + " pts. de vida y " + ataque + " pts. de ataque";
    }
    
}

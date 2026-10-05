package com.example.riberafernandezdenisse.modelo;

public class Juegos {
String titulo;
String genero;
double precio;
int horasJugadas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Juegos(String titulo, String genero, int horasJugadas, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
        this.precio = precio;
    }
}

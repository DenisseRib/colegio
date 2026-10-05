package com.example.riberafernandezdenisse.modelo;

import java.time.LocalDate;

public class Usuario
{
    private String Nick;
    private String Pais;
    private LocalDate FechaRegistro;


    public String getNick() {
        return Nick;
    }

    public void setNick(String nick) {
        Nick = nick;
    }

    public LocalDate getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public Usuario(String nick, LocalDate fechaRegistro, String pais) {
        Nick = nick;
        FechaRegistro = fechaRegistro;
        Pais = pais;
    }


}
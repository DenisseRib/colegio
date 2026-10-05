package com.example.riberafernandezdenisse.controlador;

import com.example.riberafernandezdenisse.modelo.Juegos;
import com.example.riberafernandezdenisse.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class ControladorPrincipal {

    @RequestMapping("/perfil")

    public String perfil(Model model) {
        Usuario usuario = new Usuario("Denisse", LocalDate.of(2020, 9, 15), "España");

        // Calcula los años exactos transcurridos desde la fecha de registro
        int permanencia = LocalDate.now().getYear() - usuario.getFechaRegistro().getYear();

        model.addAttribute("usuario", usuario);
        model.addAttribute("permanencia", permanencia);
        return "perfil";
    }

    @RequestMapping ("/juego")
    public String juego(Model model)
    {
        Juegos juego = new Juegos("Warhammer 40K: Rogue Trader", "CRPG", 120, 24.5);
        double costeHoras = juego.getPrecio() / juego.getHorasJugadas();
        String tipoJugador;
        if (juego.getHorasJugadas() < 10) {
            tipoJugador = "Casual";
        } else if (juego.getHorasJugadas() < 100) {
            tipoJugador = "Habitual";
        } else {
            tipoJugador = "Adicto";
        }

        model.addAttribute("juego", juego);
        model.addAttribute("costeHoras", costeHoras);
        model.addAttribute("tipoJugador", tipoJugador);

        return "juego";
    }

}


package com.pi.lix;

import com.pi.model.usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class controllerDetalhes {
    /////////////////////////////////////////////////////////////////////LOGIN
     @GetMapping("/login")
    public String mostraLogin(Model model) {
        model.addAttribute("usuario", new usuario());
        return "login";
    }


    /////////////////////////////////////////////////////////////////////DESCARTE
     @GetMapping("/cadDescarte")
    public String mostraDescarte(Model model) {
        return "cadDescarte";
    }
   
    
        @GetMapping("/detDescarte")
    public String detalheDescarte(Model model) {
        return "detDescarte";
    }
    /////////////////////////////////////////////////////////////////////DESTINO
     @GetMapping("/cadDestino")
    public String mostraDestino(Model model) {
        return "cadDestino";
    }

    
        @GetMapping("/detDestino")
    public String detalheDestino(Model model) {
        return "detDestino";
    }
     /////////////////////////////////////////////////////////////////////USUARIO
     @GetMapping("/cadUsuario")
    public String mostraUsuario(Model model) {
        return "cadUsuario";
    }
   
    
        @GetMapping("/detUsuario")
    public String detalheUsuario(Model model) {
        return "detUsuario";
    }   
    
}

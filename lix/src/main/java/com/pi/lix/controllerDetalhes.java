
package com.pi.lix;
import com.pi.model.descarte;
import com.pi.model.destino;
import com.pi.model.usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class controllerDetalhes {
    private List<descarte> descartes = new ArrayList();
    private List<destino> destinos = new ArrayList();
    private List<usuario> usuarios = new ArrayList();
    private int id;
    /////////////////////////////////////////////////////////////////////LOGIN
     @GetMapping("/login")
    public String mostraLogin(Model model) {
        model.addAttribute("usuario", new usuario());
        return "login";
    }

    @PostMapping("/login")
    public String recebeCadastro(Model model, @ModelAttribute usuario u) {
        String func = u.getFuncao();
       /* 
        if(func.equals("")){
        return "cadDescarte";
        }
        else{
        return "login";    
        }
*/
        return "redirect:cadDescarte";
    }
    /////////////////////////////////////////////////////////////////////DESCARTE
     @GetMapping("/cadDescarte")
    public String mostraDescarte(Model model) {
        model.addAttribute("descarte", new descarte());
        return "cadDescarte";
    }
    
    @PostMapping("/cadDescarte")
    public String recebeDescarte(Model model, @ModelAttribute descarte d) {
        id++;
         d.setId(id);
        descartes.add(d);
        return "cadDescarte";
    }
    
        @GetMapping("/detDescarte")
    public String detalheDescarte(Model model) {
         model.addAttribute("descartes", descartes);   
         model.addAttribute("descarte", new descarte());
        return "detDescarte";
    }
    /////////////////////////////////////////////////////////////////////DESTINO
     @GetMapping("/cadDestino")
    public String mostraDestino(Model model) {
        model.addAttribute("destino", new destino());
        return "cadDestino";
    }
    
    @PostMapping("/cadDestino")
    public String recebeDestino(Model model, @ModelAttribute destino d) {
        id++;
         d.setId(id);
        destinos.add(d);
        return "cadDestino";
    }
    
        @GetMapping("/detDestino")
    public String detalheDestino(Model model) {
         model.addAttribute("destinos", destinos);   
         model.addAttribute("destino", new destino());
        return "detDestino";
    }
     /////////////////////////////////////////////////////////////////////USUARIO
     @GetMapping("/cadUsuario")
    public String mostraUsuario(Model model) {
        model.addAttribute("usuario", new usuario());
        return "cadUsuario";
    }
    
    @PostMapping("/cadUsuario")
    public String recebeUsuario(Model model, @ModelAttribute usuario u) {
        id++;
         u.setId(id);
        usuarios.add(u);
        return "cadUsuario";
    }
    
        @GetMapping("/detUsuario")
    public String detalheUsuario(Model model) {
         model.addAttribute("usuarios", usuarios);   
         model.addAttribute("usuario", new usuario());
        return "detUsuario";
    }   
    
}

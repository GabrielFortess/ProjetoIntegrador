
package com.UC14.A1;
import com.uc14.model.analise;
import com.uc14.model.filme;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class controllerDetalhes {
    private List<filme> filmes = new ArrayList();
    private List<analise> analises = new ArrayList();
    private filme detalhesFilme;
    
    @GetMapping("/cadastro")
    public String mostraCadastro(Model model) {
        model.addAttribute("filme", new filme());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String recebeCadastro(Model model, @ModelAttribute filme filme) {
        filmes.add(filme);
        return "cadastro";
    }

    @GetMapping("/detalhes")
    public String mostraDetalhes(Model model) {
        model.addAttribute("filme", new filme());
        return "detalhes";
    }

    @PostMapping("/detalhes")
    public String recebeDetalhes(Model model, @ModelAttribute filme filme) {
        for (filme f : filmes) {
            if (f.getTitulo().equals(filme.getTitulo())) {
                model.addAttribute("busca", f);
                detalhesFilme=f;
                break;
            }
        }
        model.addAttribute("analise", new analise());
        return "detalhesFilme";
    }

        @GetMapping("/detalhesFilme")
    public String mostraDetalhesFilme(Model model) {
        return "detalhesFilme";
    }
    
        @PostMapping("/detalhesFilme")
    public String recebeDetalhesFilme(Model model, @ModelAttribute analise analise) {
        analise.setFilme(detalhesFilme);
        analises.add(analise);
        return "detalhesFinalizado";
    }
    
    @GetMapping("/filmes")
    public String mostraFilmes(Model model) {
         model.addAttribute("filmes", filmes);   
        return "filmes";
    }
}

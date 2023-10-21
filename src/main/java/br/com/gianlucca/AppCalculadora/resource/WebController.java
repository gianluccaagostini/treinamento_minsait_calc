package br.com.gianlucca.AppCalculadora.resource;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WebController {
	
	public String ShowForm(Model model) {
		//adicionar uma lista de operações
		model.addAttribute("modelOperacoes", List.of("Soma","Subtracao"));
		return "form";
	}
}

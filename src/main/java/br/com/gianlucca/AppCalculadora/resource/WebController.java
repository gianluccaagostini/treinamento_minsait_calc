package br.com.gianlucca.AppCalculadora.resource;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/")
	public String ShowForm(Model model) {
		//adicionar uma lista de operações
		model.addAttribute("modelOperacoes", List.of("Soma","Subtracao"));
		return "form";
	}
	
	@PostMapping("/")
	public String handleFormSubmission(@RequestParam String modelOperacao, 
									   @RequestParam String valor01,
			                           @RequestParam String valor02,
									   Model model) {
		if(modelOperacao.isEmpty() || valor01.isEmpty() || valor02.isEmpty()) {
			return null;
			
			String resposta = "";
			switch (modelOperacao) {
			case "Soma";
				int resp = Integer.parseInt(valor01) + Integer.parseInt(valor02);
				resposta = String.valueOf(resp);
				break;
			case "Subtracao";
			int resp = Integer.parseInt(valor01) - Integer.parseInt(valor02);
			resposta = String.valueOf(resp);
			break;
			}
		}

	}
}

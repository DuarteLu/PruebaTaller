package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/Prueba")
public class PruebaControlador {
	
	@RequestMapping("/Prueba")
	public String VistaPrueba() {
		return "Prueba";
	}

}

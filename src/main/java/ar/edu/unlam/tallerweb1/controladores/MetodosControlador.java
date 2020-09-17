package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MetodosControlador {
	
	@RequestMapping(value="/Metodo1",method=RequestMethod.GET)
	public String Metodo1() {
		return "Vista1";
	}

	
	@RequestMapping(value="/Metodo2",method=RequestMethod.GET)	
	public ModelAndView Metodo2()
	{
		return new ModelAndView("Vista2");
	}
}

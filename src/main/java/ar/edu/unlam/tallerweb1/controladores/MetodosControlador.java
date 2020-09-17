package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Controller
@RequestMapping("/")
public class MetodosControlador {
	
	@RequestMapping(value="/Metodo1",method=RequestMethod.GET)
	public String Metodo1(Model model ) {
		model.addAttribute("Persona", new Persona("Mariano","25"));
		return "Vista1";
	}

	
	@RequestMapping(value="/Metodo2",method=RequestMethod.GET)	
	public ModelAndView Metodo2()
	{  ModelAndView mav = new ModelAndView("Vista2");
			mav.addObject("Persona",new Persona("Susana","30"));
		return mav;
	}
	
	
	/*@RequestMapping(value="/Metodo2",method=RequestMethod.GET)	
	public ModelAndView Metodo2()
	{  ModelAndView mav = new ModelAndView("Vista2");
			mav.addObject(p,GetPersonas());
		return mav;
	}*/
	
	
	@RequestMapping(value="/Metodo3",method=RequestMethod.GET)
	public String Metodo3(Model model ) {
		model.addAttribute("p", GetPersonas());
		return "Vista3";
	}
	
	private List<Persona> GetPersonas(){
		List<Persona> p = new ArrayList();
	
	p.add(new Persona("Maria","20"));
	p.add(new Persona("Pepe","60"));
	p.add(new Persona("Soledad","25"));
	return p;
	
	}
}

package com.TODO.TODOSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("email")
public class Login {


		
		private final AuthenticateService aut;
		Login(AuthenticateService aut){
			this.aut= aut;
		}
		
			@GetMapping("/login")
			public String LoginPage() {
				
				return "login";
			}
			
			
			@RequestMapping(value="/Welcome", method= RequestMethod.GET)
			public String logData(@RequestParam String email ,@RequestParam String password, Model model) {
				
				if(aut.check(email,password)) {
				
				model.addAttribute("email", email);
				model.addAttribute("password", password);
				return "Welcome";
				}
				else  return "login";
				
			}


	}




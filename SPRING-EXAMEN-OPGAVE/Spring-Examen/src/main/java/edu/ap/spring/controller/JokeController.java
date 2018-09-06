package edu.ap.spring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.ap.spring.jpa.Grade;

@Controller
@Scope("session")
public class JokeController {
   
   public JokeController() {
   }
       
   @RequestMapping("/joke")
   public String joke() {
	   return "joke";
   }
		   
   @RequestMapping("/joke_post")
   public String joke_post() {
	   return "result";
   }
   
   @RequestMapping("/")
   public String root() {
	   return "redirect:/joke";
   }
   
   @PostMapping("joke")
   
 public String getJoke(@RequestParam("firstName") String firstName, 
		   				 @RequestParam("lastName") String lastName) {

      String url =  "http://api.icndb.com/jokes/random?firstName=";
    	url += firstName;
      	url+= "&lastName=";
      	url+= lastName;
      	
      	String joke = http.get(url).
      	
      
      repository.save(new Joke(joke));
      
      return "result";
   }
}

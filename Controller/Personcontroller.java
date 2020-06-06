package com.learning.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBoot.PersonRepository;
import com.learning.SpringBoot.model.Person;
import com.learning.SpringBoot.service.PersonService;


@RestController // This means that this class is a Controller
@RequestMapping(path="/person") // This means URL's start with /person (after Application path)
public class Personcontroller {
  
  @Autowired
  private PersonService service;

  @RequestMapping(method=RequestMethod.POST ,value="/add") 
  public @ResponseBody String addNewPerson (@RequestBody Person person) {  
     
    System.out.println(person);
    service.save(person);
    return "Saved";
  }
  
  @RequestMapping(method=RequestMethod.PUT ,value="/update") 
  public @ResponseBody String updatePerson (@RequestBody Person person) {  
     
    System.out.println(person);
    service.update(person);
    return "updated";
  }
  
  @RequestMapping("/{id}")
  public Person getPerson(@PathVariable int id) {
      return service.get(id);
  }
  
  @RequestMapping("/all")
  public List<Person> list() {
      return service.listAll();
  }
  
  @RequestMapping(method=RequestMethod.DELETE ,value="/{id}") // Map ONLY POST Requests
  public @ResponseBody String deletePerson (@PathVariable int id) {  
     
    System.out.println(id);
    service.delete(id);
    return "Deleted";
  }

}
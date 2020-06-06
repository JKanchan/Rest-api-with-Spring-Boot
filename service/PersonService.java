package com.learning.SpringBoot.service;

import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.SpringBoot.*;
import com.learning.SpringBoot.model.Person;
@Service
@Transactional
public class PersonService {
 
    @Autowired
    private PersonRepository repo;
     
    public List<Person> listAll() {
        return (List<Person>) repo.findAll();
    }
     
    public void save(Person person) {
        repo.save(person);
    }
    
    public void update(Person person) {
        repo.save(person);
    }
     
    public Person get(Integer id) {
        return repo.findById(id).get();
    }
    
         
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
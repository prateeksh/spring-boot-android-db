package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserRepository repository;


  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<UserData> get(@PathVariable("id") Long id) {
    UserData user = repository.findOne(id);
    if (null == user) {
      return new ResponseEntity<UserData>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<UserData>(user, HttpStatus.OK);
  }

  @RequestMapping(value = "/addnew", method = RequestMethod.POST)
  public ResponseEntity<UserData> update(@RequestBody UserData user) {
      repository.save(user);
    return get(user.getId());
  }

  @RequestMapping(value = "/result", method = RequestMethod.GET)
  public List<UserData> all() {
    return repository.findAll();
  }

    @RequestMapping("/datacheck")
    @ResponseBody
    String data(){
        return "check data";
    }
}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserRepository repository;

  @Autowired
  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<UserData> get(@PathVariable("id") Long id) {
    UserData user = repository.findOne(id);
    if (null == user) {
      return new ResponseEntity<UserData>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<UserData>(user, HttpStatus.OK);
  }

  @RequestMapping(value = "/new", method = RequestMethod.POST)
  public ResponseEntity<UserData> update(@RequestBody UserData user) {
    return new ResponseEntity<UserData>(repository.save(user),HttpStatus.CREATED);
  }

  @RequestMapping(method = RequestMethod.GET)
  public List<UserData> all() {
    return repository.findAll();
  }

    @RequestMapping("/data")
    @ResponseBody
    String data(){
        return "check data";
    }
}

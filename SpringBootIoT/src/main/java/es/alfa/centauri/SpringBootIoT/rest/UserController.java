package es.alfa.centauri.SpringBootIoT.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.alfa.centauri.SpringBootIoT.user.User;
import es.alfa.centauri.SpringBootIoT.user.UserRepository;



@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public User getUser(@PathVariable(name="name") String name){
		return userRepository.findByName(name);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public User addUser(@RequestBody  User user){
		 return userRepository.insert(user);
	}
	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	public void addUser(@PathVariable(name="name")  String name){
		  userRepository.deleteByName(name);
	}

}

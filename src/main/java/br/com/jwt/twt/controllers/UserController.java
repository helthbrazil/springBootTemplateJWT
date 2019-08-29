package br.com.jwt.twt.controllers;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/users",  produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
	public String getUsers() {
		return "[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
		           "{\"name\":\"Jackie\",\"country\":\"China\"}]";
	}
	
	@RequestMapping(value = "/isLogged",  produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
	public ResponseEntity<Object> isLogged() {
		return ResponseEntity.ok(true);
	}
}

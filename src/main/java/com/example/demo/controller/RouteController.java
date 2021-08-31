package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.model.Admin;
//import com.example.demo.model.Customer;
import com.example.demo.model.Route;
import com.example.demo.repository.IRouteRepository;
import com.example.demo.service.IRouteService;
import com.example.demo.repository.IAdminRepository;

@RestController
public class RouteController {
	@Autowired
    private IRouteService service;	
	@PostMapping("admin/addroutes")
	public  ResponseEntity<Route> saveRoute(@RequestBody Route r) {
				
		return new ResponseEntity<Route>(service.addRoute(r), HttpStatus.CREATED);
	}
	
	@GetMapping("/routes")
	public ResponseEntity<List<Route>>getRoute()
	{    return  new ResponseEntity<List<Route>>(service.viewRouteList(),HttpStatus.OK);
		
	}
	@GetMapping("/routes/{id}")
	public ResponseEntity<Route> get(@PathVariable Long id) {
		return new ResponseEntity<Route>(service.searchRoute(id), HttpStatus.OK);   
	}
	@DeleteMapping("/deleteRoutes/{id}")
	public ResponseEntity<String> deleteRoute(@PathVariable Long id)
	{	service.removeRoute(id);
		return new ResponseEntity<String>("Route "+id+" deleted successfully!.", HttpStatus.OK);
			
		
	}
	
	
	
}




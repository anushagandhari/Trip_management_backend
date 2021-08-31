package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Route;
import com.example.demo.repository.IRouteRepository;

@Service 

public class IRouteService {
	
	@Autowired
	private IRouteRepository repo;
	
	
	public Route  addRoute(Route iroute) {
	       return  repo.save(iroute);
	    }
	public Route searchRoute(Long routeId ) {
        return repo.findById(routeId).orElseThrow(()->
                                           new ResourceNotFoundException("Route not found with id :" + routeId));
    }
	public void removeRoute(Long routeId) {
        repo.findById(routeId).orElseThrow(()->
        new ResourceNotFoundException("Route not found with id :" + routeId));
        repo.deleteById(routeId);
    }
	
	public  List<Route> viewRouteList() {
        return repo.findAll();
    }

}

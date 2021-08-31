package com.example.demo.repository;

import com.example.demo.model.Route;

import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.*;
//import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

@Repository
public interface IRouteRepository extends JpaRepository<Route,Long >{
	//Route findByRouteId(String routeId);	
}






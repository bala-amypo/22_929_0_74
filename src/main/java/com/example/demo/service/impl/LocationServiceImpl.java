package com.example.demo.service.impl;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    LocationRepository lrp;
    public Location createLocation(Location loc){
         if(loc.getLatitude()>90){


         } 
    }

    public List<Location> getAllLocations(){

    }

   
    
}

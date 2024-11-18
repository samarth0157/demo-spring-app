package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.repository.LocationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pricing")
public class PricingController {

    private final LocationRepository locationRepository;

    public PricingController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("/locations")
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/calculate")
    public String calculatePricing(@RequestParam Long originId, @RequestParam Long destinationId) {
        return "The shipping price from origin " + originId + " to destination " + destinationId + " is $50";
    }
}

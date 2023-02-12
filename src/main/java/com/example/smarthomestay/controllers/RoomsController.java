package com.example.smarthomestay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smarthomestay.models.Rooms;
import com.example.smarthomestay.repositories.RoomsRepository;

@RestController
@RequestMapping(value = "/rooms", produces = { MediaType.APPLICATION_JSON_VALUE })
public class RoomsController {

    @Autowired
    private RoomsRepository roomsRepository;
    
    public RoomsRepository getRepository() {
        return roomsRepository;
    }

    public void setRepository(RoomsRepository repository) {
        this.roomsRepository = roomsRepository;
    }

    @GetMapping(value = "")
    public List<Rooms> getAllRooms() {
        return roomsRepository.findAll();
    }
    
}

package com.example.smarthomestay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smarthomestay.models.Bills;
import com.example.smarthomestay.repositories.BillsRepository;

@RestController
@RequestMapping(value = "/bills", produces = { MediaType.APPLICATION_JSON_VALUE })
public class BillsController {

    @Autowired
    private BillsRepository billsRepository;
    
    public BillsRepository getRepository() {
        return billsRepository;
    }

    public void setRepository(BillsRepository repository) {
        this.billsRepository = billsRepository;
    }

    @GetMapping(value = "")
    public List<Bills> getAllBills() {
        return billsRepository.findAll();
    }

    @PostMapping("")
    Bills createOrSaveBills(@RequestBody Bills newBills) {
        return billsRepository.save(newBills);
    }

    @GetMapping("/{id}")
    Bills getBillsById(@PathVariable Long id) {
        return billsRepository.findById(id).get();
    }

    @PutMapping("/check-in/{id}")
    Bills checkIn(@RequestBody Bills newBills, @PathVariable int id) {
    
        return billsRepository.findById((long) id).map(bills -> {
            bills.setCheck_in_status(1);
            bills.setDate_checked_in(newBills.getDate_checked_in());
            return billsRepository.save(bills);
        }).orElseGet(() -> {
            newBills.setId(id);
            return billsRepository.save(newBills);
          });
    }

    @PutMapping("/check-out/{id}")
    Bills checkOut(@RequestBody Bills newBills, @PathVariable int id) {
    
        return billsRepository.findById((long) id).map(bills -> {
            bills.setCheck_in_status(2);
            bills.setDate_checked_out(newBills.getDate_checked_out());
            return billsRepository.save(bills);
        }).orElseGet(() -> {
            newBills.setId(id);
            return billsRepository.save(newBills);
          });
    }
    
}

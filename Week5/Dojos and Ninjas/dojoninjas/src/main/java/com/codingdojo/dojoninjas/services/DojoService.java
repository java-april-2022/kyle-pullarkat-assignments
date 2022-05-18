package com.codingdojo.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
// 1. Find all Dojos
// 2. Make/save new Dojos
// 3. Find Dojo ID#
    
    
	// cant work without repo , injection
    @Autowired
    private DojoRepository dojoRepo;
    
    
    
    // 1
    public List<Dojo> getAllDojos() {
        return dojoRepo.findAll();
    }
    
    // 2
    public Dojo make(Dojo dojo) {
        return dojoRepo.save(dojo);
    }
    
    // 3
    public Dojo find(Long id) {
        Optional<Dojo> result = dojoRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}
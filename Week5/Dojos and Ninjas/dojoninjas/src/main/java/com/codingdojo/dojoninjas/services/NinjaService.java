package com.codingdojo.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	// 1. find/get all ninjas
	// 2. make/save new Ninja
	// 3. find ninja id
	// 4. find all ninjas by dojo
    
	// cant work without repo , injection
    @Autowired
    private NinjaRepository ninjaRepo;
    
    
    // 1
    public List<Ninja> getAllNinjas() {
        return ninjaRepo.findAll();
    }
    
    // 2
    public Ninja make(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
    
    // 3
    public Ninja find(Long id) {
        Optional<Ninja> result = ninjaRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    
    //4 
    public List<Ninja> byDojo(Dojo dojo) {
    	return ninjaRepo.findAllByDojo(dojo);
    }
}
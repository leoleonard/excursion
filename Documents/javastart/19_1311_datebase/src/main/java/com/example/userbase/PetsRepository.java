package com.example.userbase;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetsRepository {

    private List<Pets> pets = new ArrayList<>();

    public PetsRepository() {
        pets.add(new Pets("Cheester", "Dobrerman"));
        pets.add(new Pets("Filon", "Weimar"));
    }

    public PetsRepository(List<Pets> pets) {
        this.pets = pets;
    }

    public List<Pets> getPets() {
        return pets;
    }

    public void setPets(List<Pets> pets) {
        this.pets = pets;
    }
}

package com.jxau.service.impl;

import com.jxau.entity.Pet;
import com.jxau.mapper.PetMapper;
import com.jxau.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 那年
 */
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;

    @Override
    public int addPet(Pet pet) {
        int i = petMapper.addPet(pet);
        return i;
    }

    @Override
    public int deletePet(Integer id) {
        int i = petMapper.deletePet(id);
        return i;
    }

    @Override
    public int updatePet(Pet pet) {
        System.out.println("=====================pet"+pet);
        int i = petMapper.updatePet(pet);
        System.out.println("实打实看见爱上看来大家---------========================================"+i);
        return i;
    }

    @Override
    public int updateState(Pet pet) {
        int i = petMapper.updateState(pet);
        return i;
    }

    @Override
    public List<Pet> getPets() {
        List<Pet> pets = petMapper.getPets();
        return pets;
    }

    @Override
    public List<Pet> findByState(Integer state) {
        List<Pet> pets = petMapper.findByState(state);
        return pets;
    }

    @Override
    public Pet findById(Integer id) {
        Pet byId = petMapper.findById(id);
        return byId;
    }

    @Override
    public List<Pet> findByPetType(String petType) {
        List<Pet> pets = petMapper.findByPetType(petType);
        return pets;
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        petMapper.deleteBatch(ids);
    }
}

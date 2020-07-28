package org.test.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.test.model.PetModel;
import org.test.repository.RepositoryTest;


@Component
public class ResponseBuilder {
    private RepositoryTest repositoryTestPetImpl;


    @Autowired
    public void setRepositoryTestPetImpl(RepositoryTest repositoryTestPetImpl) {
        this.repositoryTestPetImpl = repositoryTestPetImpl;
    }

    public PetModel getPet(int i)
    {
       return repositoryTestPetImpl.getAllLine(i);
    }

    public void soutPet(int i){
        repositoryTestPetImpl.sout(i);
    }

    public void soutPet1(){
        repositoryTestPetImpl.sout1();
    }

    public void insert(){
        repositoryTestPetImpl.insert();
    }
    public void printEnum(){
        repositoryTestPetImpl.printAllPet();
    }
}

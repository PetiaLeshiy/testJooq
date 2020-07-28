package org.test.repository;


import jooqGenerate.tables.Pet;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.test.model.PetModel;

//import org.test.model.PetEnumConverter;

@Repository
public class RepositoryTestPetImpl implements RepositoryTest {
    private DSLContext dsl;

    @Autowired
    public RepositoryTestPetImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public PetModel getAllLine(int i) {
        return dsl.selectFrom(Pet.PET).where(Pet.PET.ID.eq(i)).fetchAny().into(PetModel.class);
    }

    @Override
    public void sout(int i) {
        System.out.println(dsl.selectFrom(Pet.PET).where(Pet.PET.ID.eq(i)).fetch());
    }

    @Override
    public void sout1() {
        System.out.println(dsl.selectFrom("Select * from pet"));

    }

    @Override
    public void insert() {
        System.out.println(dsl.insertInto(Pet.PET).values(4, "DOG").returning());
    }

    @Override
    public void printAllPet() {
//        for (org.jooq.genetate.tables.records.PetRecord pet : dsl.selectFrom(org.jooq.genetate.tables.Pet.PET).fetch()) {
//            switch (pet.getValue(org.jooq.genetate.tables.Pet.PET.TYPEANIMAL.getQualifiedName(), new PetEnumConverter())) {
//
//                case DOG:
//                    System.out.println("DOG");
//                    break;
//                case CAT:
//                    System.out.println("CAT");
//                    break;
//                case TROLOLO:
//                    System.out.println("TROLOLO");
////                    break;
//            }
//        }
    }
}


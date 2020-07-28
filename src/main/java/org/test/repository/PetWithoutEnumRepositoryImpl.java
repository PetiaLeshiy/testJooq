//package org.test.repository;
//
//
//import org.jooq.DSLContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.test.model.PetModel;
//
//@Component
//public class PetWithoutEnumRepositoryImpl implements RepositoryTest {
//    private DSLContext dsl;
//
//    @Autowired
//    public void setDsl(DSLContext dsl) {
//        this.dsl = dsl;
//    }
//
//    @Override
//    public PetModel getAllLine(int i) {
//        return dsl.selectFrom(org.jooq.genetate.tables.Petwithoutenum.PETWITHOUTENUM).where(org.jooq.genetate.tables.Petwithoutenum.PETWITHOUTENUM.ID.eq(i)).fetchAny().into(PetModel.class);
//    }
//
//    @Override
//    public void sout(int i) {
//
//    }
//
//    @Override
//    public void sout1() {
//
//    }
//
//    @Override
//    public void insert() {
//
//    }
//
//    @Override
//    public void printAllPet() {
//
//    }
//}

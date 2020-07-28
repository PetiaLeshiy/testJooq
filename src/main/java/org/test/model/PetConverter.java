//package org.test.model;
//
//import org.jooq.Converter;
//
//public class PetConverter implements Converter<String, TypeAnimal> {
//    @Override
//    public TypeAnimal from(String databaseObject) {
//        return TypeAnimal.valueOf(databaseObject);
//    }
//
//    @Override
//    public String to(TypeAnimal userObject) {
//        return userObject.name();
//    }
//
//    @Override
//    public Class<String> fromType() {
//        return String.class;
//    }
//
//    @Override
//    public Class<TypeAnimal> toType() {
//        return TypeAnimal.class;
//    }
//}

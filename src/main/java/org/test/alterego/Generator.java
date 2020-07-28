//package org.test.alterego;
//
//import org.jooq.DSLContext;
//import org.jooq.genetate.tables.Pet;
//import org.jooq.genetate.tables.Petwithoutenum;
//import org.jooq.impl.DSL;
//import org.test.model.PetModel;
//import org.test.model.PetModel2;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Generator {
//    private static String url = "jdbc:postgresql://localhost:5432/testdb";
//    private static String login = "postgres";
//    private static String pas = "pas";
//
//    public static void main(String[] args) {
//
//        try (Connection connection = DriverManager.getConnection(url, login, pas)) {
//            DSLContext dsl = DSL.using(connection);
//
//            System.out.println(dsl.fetch("select * from petwithoutenum"));
//
//            System.out.println(dsl.selectFrom(Petwithoutenum.PETWITHOUTENUM)
//                                  .where(Petwithoutenum.PETWITHOUTENUM.ID.eq(2)).fetchAny().into(PetModel.class));
//            System.out.println(dsl.selectFrom(Pet.PET).where(Pet.PET.ID.eq(1)).fetchAny().into(PetModel2.class));
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//}
//

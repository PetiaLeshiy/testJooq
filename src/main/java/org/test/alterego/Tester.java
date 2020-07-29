package org.test.alterego;

import jooqGenerate.tables.Testtable;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.test.model.TestTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tester {
    private static String url = "jdbc:postgresql://localhost:5432/test1";
    private static String login = "postgres";
    private static String pas = "password";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(url, login, pas)) {
            DSLContext dsl = DSL.using(connection);

            System.out.println(dsl.fetch("select * from testtable"));
            System.out.println(dsl.selectFrom(Testtable.TESTTABLE).where(Testtable.TESTTABLE.NAME.eq("pavlik"))
                                  .fetchAny().into(TestTableModel.class));


//            System.out.println(dsl.fetch("select * from test.testtable"));
//            System.out.println(dsl.selectFrom(Testtable.TESTTABLE).where(Testtable.TESTTABLE.NAME.eq("pavlik"))
//                                  .fetchAny().into(TestTableModel.class));


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}


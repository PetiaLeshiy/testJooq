package org.test.model;

import jooqGenerate.tables.Testtable;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

public enum TestType2 implements EnumType {
   TEST("TEST");

   private String literal;

   private TestType2 (String literal) {
       this.literal= literal;
   }

    @Override
    public String getLiteral() {
        return literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Testtable.TESTTABLE.getSchema();
    }

    @Override
    public String getName() {
        return "testtype";
    }
}


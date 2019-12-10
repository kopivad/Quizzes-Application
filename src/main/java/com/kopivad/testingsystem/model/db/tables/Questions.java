/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.model.db.tables;


import com.kopivad.testingsystem.model.db.Indexes;
import com.kopivad.testingsystem.model.db.Keys;
import com.kopivad.testingsystem.model.db.TestingSystem;
import com.kopivad.testingsystem.model.db.tables.records.QuestionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Questions extends TableImpl<QuestionsRecord> {

    private static final long serialVersionUID = -1237211696;

    /**
     * The reference instance of <code>testing_system.questions</code>
     */
    public static final Questions QUESTIONS = new Questions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestionsRecord> getRecordType() {
        return QuestionsRecord.class;
    }

    /**
     * The column <code>testing_system.questions.id</code>.
     */
    public final TableField<QuestionsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>testing_system.questions.title</code>.
     */
    public final TableField<QuestionsRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>testing_system.questions.quiz_id</code>.
     */
    public final TableField<QuestionsRecord, Long> QUIZ_ID = createField(DSL.name("quiz_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>testing_system.questions</code> table reference
     */
    public Questions() {
        this(DSL.name("questions"), null);
    }

    /**
     * Create an aliased <code>testing_system.questions</code> table reference
     */
    public Questions(String alias) {
        this(DSL.name(alias), QUESTIONS);
    }

    /**
     * Create an aliased <code>testing_system.questions</code> table reference
     */
    public Questions(Name alias) {
        this(alias, QUESTIONS);
    }

    private Questions(Name alias, Table<QuestionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Questions(Name alias, Table<QuestionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Questions(Table<O> child, ForeignKey<O, QuestionsRecord> key) {
        super(child, key, QUESTIONS);
    }

    @Override
    public Schema getSchema() {
        return TestingSystem.TESTING_SYSTEM;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QUESTIONS_FKN3GVCO4B0KEWXC0BYWF1IGFMS, Indexes.QUESTIONS_PRIMARY);
    }

    @Override
    public Identity<QuestionsRecord, Long> getIdentity() {
        return Keys.IDENTITY_QUESTIONS;
    }

    @Override
    public UniqueKey<QuestionsRecord> getPrimaryKey() {
        return Keys.KEY_QUESTIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<QuestionsRecord>> getKeys() {
        return Arrays.<UniqueKey<QuestionsRecord>>asList(Keys.KEY_QUESTIONS_PRIMARY);
    }

    @Override
    public List<ForeignKey<QuestionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QuestionsRecord, ?>>asList(Keys.FKN3GVCO4B0KEWXC0BYWF1IGFMS);
    }

    public Quizzes quizzes() {
        return new Quizzes(this, Keys.FKN3GVCO4B0KEWXC0BYWF1IGFMS);
    }

    @Override
    public Questions as(String alias) {
        return new Questions(DSL.name(alias), this);
    }

    @Override
    public Questions as(Name alias) {
        return new Questions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Questions rename(String name) {
        return new Questions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Questions rename(Name name) {
        return new Questions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
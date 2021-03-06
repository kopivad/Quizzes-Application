/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.domain.db.tables;


import com.kopivad.testingsystem.domain.db.Indexes;
import com.kopivad.testingsystem.domain.db.Keys;
import com.kopivad.testingsystem.domain.db.Public;
import com.kopivad.testingsystem.domain.db.tables.records.QuestionsRecord;

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

    private static final long serialVersionUID = 116568770;

    /**
     * The reference instance of <code>public.questions</code>
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
     * The column <code>public.questions.id</code>.
     */
    public final TableField<QuestionsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('questions_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.questions.title</code>.
     */
    public final TableField<QuestionsRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.questions.quiz_id</code>.
     */
    public final TableField<QuestionsRecord, Long> QUIZ_ID = createField(DSL.name("quiz_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.questions</code> table reference
     */
    public Questions() {
        this(DSL.name("questions"), null);
    }

    /**
     * Create an aliased <code>public.questions</code> table reference
     */
    public Questions(String alias) {
        this(DSL.name(alias), QUESTIONS);
    }

    /**
     * Create an aliased <code>public.questions</code> table reference
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
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QUESTIONS_PKEY);
    }

    @Override
    public Identity<QuestionsRecord, Long> getIdentity() {
        return Keys.IDENTITY_QUESTIONS;
    }

    @Override
    public UniqueKey<QuestionsRecord> getPrimaryKey() {
        return Keys.QUESTIONS_PKEY;
    }

    @Override
    public List<UniqueKey<QuestionsRecord>> getKeys() {
        return Arrays.<UniqueKey<QuestionsRecord>>asList(Keys.QUESTIONS_PKEY);
    }

    @Override
    public List<ForeignKey<QuestionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QuestionsRecord, ?>>asList(Keys.QUESTIONS__FKN3GVCO4B0KEWXC0BYWF1IGFMS);
    }

    public Quizzes quizzes() {
        return new Quizzes(this, Keys.QUESTIONS__FKN3GVCO4B0KEWXC0BYWF1IGFMS);
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

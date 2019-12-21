/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.model.db.tables;


import com.kopivad.testingsystem.model.db.Indexes;
import com.kopivad.testingsystem.model.db.Keys;
import com.kopivad.testingsystem.model.db.TestingSystem;
import com.kopivad.testingsystem.model.db.tables.records.QuizSessionsRecord;

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
public class QuizSessions extends TableImpl<QuizSessionsRecord> {

    private static final long serialVersionUID = 1234320001;

    /**
     * The reference instance of <code>testing_system.quiz_sessions</code>
     */
    public static final QuizSessions QUIZ_SESSIONS = new QuizSessions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuizSessionsRecord> getRecordType() {
        return QuizSessionsRecord.class;
    }

    /**
     * The column <code>testing_system.quiz_sessions.id</code>.
     */
    public final TableField<QuizSessionsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>testing_system.quiz_sessions.quiz_id</code>.
     */
    public final TableField<QuizSessionsRecord, Long> QUIZ_ID = createField(DSL.name("quiz_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>testing_system.quiz_sessions.user_id</code>.
     */
    public final TableField<QuizSessionsRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>testing_system.quiz_sessions</code> table reference
     */
    public QuizSessions() {
        this(DSL.name("quiz_sessions"), null);
    }

    /**
     * Create an aliased <code>testing_system.quiz_sessions</code> table reference
     */
    public QuizSessions(String alias) {
        this(DSL.name(alias), QUIZ_SESSIONS);
    }

    /**
     * Create an aliased <code>testing_system.quiz_sessions</code> table reference
     */
    public QuizSessions(Name alias) {
        this(alias, QUIZ_SESSIONS);
    }

    private QuizSessions(Name alias, Table<QuizSessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private QuizSessions(Name alias, Table<QuizSessionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> QuizSessions(Table<O> child, ForeignKey<O, QuizSessionsRecord> key) {
        super(child, key, QUIZ_SESSIONS);
    }

    @Override
    public Schema getSchema() {
        return TestingSystem.TESTING_SYSTEM;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QUIZ_SESSIONS_FKKFLYTH3D76ARXN7V9C0FYSKQO, Indexes.QUIZ_SESSIONS_FKTH8OXREKWMQH63RA9VR84CN17, Indexes.QUIZ_SESSIONS_PRIMARY);
    }

    @Override
    public Identity<QuizSessionsRecord, Long> getIdentity() {
        return Keys.IDENTITY_QUIZ_SESSIONS;
    }

    @Override
    public UniqueKey<QuizSessionsRecord> getPrimaryKey() {
        return Keys.KEY_QUIZ_SESSIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<QuizSessionsRecord>> getKeys() {
        return Arrays.<UniqueKey<QuizSessionsRecord>>asList(Keys.KEY_QUIZ_SESSIONS_PRIMARY);
    }

    @Override
    public List<ForeignKey<QuizSessionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QuizSessionsRecord, ?>>asList(Keys.FKTH8OXREKWMQH63RA9VR84CN17, Keys.FKKFLYTH3D76ARXN7V9C0FYSKQO);
    }

    public Quizzes quizzes() {
        return new Quizzes(this, Keys.FKTH8OXREKWMQH63RA9VR84CN17);
    }

    public Users users() {
        return new Users(this, Keys.FKKFLYTH3D76ARXN7V9C0FYSKQO);
    }

    @Override
    public QuizSessions as(String alias) {
        return new QuizSessions(DSL.name(alias), this);
    }

    @Override
    public QuizSessions as(Name alias) {
        return new QuizSessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QuizSessions rename(String name) {
        return new QuizSessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QuizSessions rename(Name name) {
        return new QuizSessions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

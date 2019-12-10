/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.model.db.tables.records;


import com.kopivad.testingsystem.model.db.tables.Quizzes;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class QuizzesRecord extends UpdatableRecordImpl<QuizzesRecord> implements Record4<Long, String, String, Long> {

    private static final long serialVersionUID = 1006913148;

    /**
     * Setter for <code>testing_system.quizzes.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>testing_system.quizzes.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>testing_system.quizzes.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>testing_system.quizzes.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>testing_system.quizzes.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>testing_system.quizzes.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>testing_system.quizzes.user_id</code>.
     */
    public void setUserId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>testing_system.quizzes.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Quizzes.QUIZZES.ID;
    }

    @Override
    public Field<String> field2() {
        return Quizzes.QUIZZES.DESCRIPTION;
    }

    @Override
    public Field<String> field3() {
        return Quizzes.QUIZZES.TITLE;
    }

    @Override
    public Field<Long> field4() {
        return Quizzes.QUIZZES.USER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getDescription();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public Long component4() {
        return getUserId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getDescription();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public Long value4() {
        return getUserId();
    }

    @Override
    public QuizzesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public QuizzesRecord value2(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public QuizzesRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public QuizzesRecord value4(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public QuizzesRecord values(Long value1, String value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuizzesRecord
     */
    public QuizzesRecord() {
        super(Quizzes.QUIZZES);
    }

    /**
     * Create a detached, initialised QuizzesRecord
     */
    public QuizzesRecord(Long id, String description, String title, Long userId) {
        super(Quizzes.QUIZZES);

        set(0, id);
        set(1, description);
        set(2, title);
        set(3, userId);
    }
}

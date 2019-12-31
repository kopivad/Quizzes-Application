/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.model.db.tables.records;


import com.kopivad.testingsystem.model.db.tables.UserRoles;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class UserRolesRecord extends TableRecordImpl<UserRolesRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1327686892;

    /**
     * Setter for <code>public.user_roles.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_roles.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user_roles.roles</code>.
     */
    public void setRoles(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_roles.roles</code>.
     */
    public String getRoles() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserRoles.USER_ROLES.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return UserRoles.USER_ROLES.ROLES;
    }

    @Override
    public Long component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getRoles();
    }

    @Override
    public Long value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getRoles();
    }

    @Override
    public UserRolesRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserRolesRecord value2(String value) {
        setRoles(value);
        return this;
    }

    @Override
    public UserRolesRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRolesRecord
     */
    public UserRolesRecord() {
        super(UserRoles.USER_ROLES);
    }

    /**
     * Create a detached, initialised UserRolesRecord
     */
    public UserRolesRecord(Long userId, String roles) {
        super(UserRoles.USER_ROLES);

        set(0, userId);
        set(1, roles);
    }
}

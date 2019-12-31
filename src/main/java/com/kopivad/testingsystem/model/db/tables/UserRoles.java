/*
 * This file is generated by jOOQ.
 */
package com.kopivad.testingsystem.model.db.tables;


import com.kopivad.testingsystem.model.db.Keys;
import com.kopivad.testingsystem.model.db.Public;
import com.kopivad.testingsystem.model.db.tables.records.UserRolesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class UserRoles extends TableImpl<UserRolesRecord> {

    private static final long serialVersionUID = 483039481;

    /**
     * The reference instance of <code>public.user_roles</code>
     */
    public static final UserRoles USER_ROLES = new UserRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRolesRecord> getRecordType() {
        return UserRolesRecord.class;
    }

    /**
     * The column <code>public.user_roles.user_id</code>.
     */
    public final TableField<UserRolesRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_roles.roles</code>.
     */
    public final TableField<UserRolesRecord, String> ROLES = createField(DSL.name("roles"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.user_roles</code> table reference
     */
    public UserRoles() {
        this(DSL.name("user_roles"), null);
    }

    /**
     * Create an aliased <code>public.user_roles</code> table reference
     */
    public UserRoles(String alias) {
        this(DSL.name(alias), USER_ROLES);
    }

    /**
     * Create an aliased <code>public.user_roles</code> table reference
     */
    public UserRoles(Name alias) {
        this(alias, USER_ROLES);
    }

    private UserRoles(Name alias, Table<UserRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoles(Name alias, Table<UserRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserRoles(Table<O> child, ForeignKey<O, UserRolesRecord> key) {
        super(child, key, USER_ROLES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<UserRolesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRolesRecord, ?>>asList(Keys.USER_ROLES__FKHFH9DX7W3UBF1CO1VDEV94G3F);
    }

    public Users users() {
        return new Users(this, Keys.USER_ROLES__FKHFH9DX7W3UBF1CO1VDEV94G3F);
    }

    @Override
    public UserRoles as(String alias) {
        return new UserRoles(DSL.name(alias), this);
    }

    @Override
    public UserRoles as(Name alias) {
        return new UserRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoles rename(String name) {
        return new UserRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoles rename(Name name) {
        return new UserRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

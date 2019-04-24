// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Collection;

public interface InternalAdapter
{

	public abstract void bindToContentValues(ContentValues contentvalues, Object obj);

	public abstract void bindToInsertStatement(DatabaseStatement databasestatement, Object obj);

	public abstract void bindToInsertStatement(DatabaseStatement databasestatement, Object obj, int i);

	public abstract void bindToInsertValues(ContentValues contentvalues, Object obj);

	public abstract void bindToStatement(DatabaseStatement databasestatement, Object obj);

	public abstract boolean cachingEnabled();

	public abstract void delete(Object obj);

	public abstract void delete(Object obj, DatabaseWrapper databasewrapper);

	public abstract void deleteAll(Collection collection);

	public abstract void deleteAll(Collection collection, DatabaseWrapper databasewrapper);

	public abstract Number getAutoIncrementingId(Object obj);

	public abstract String getTableName();

	public abstract long insert(Object obj);

	public abstract long insert(Object obj, DatabaseWrapper databasewrapper);

	public abstract void insertAll(Collection collection);

	public abstract void insertAll(Collection collection, DatabaseWrapper databasewrapper);

	public abstract void save(Object obj);

	public abstract void save(Object obj, DatabaseWrapper databasewrapper);

	public abstract void saveAll(Collection collection);

	public abstract void saveAll(Collection collection, DatabaseWrapper databasewrapper);

	public abstract void update(Object obj);

	public abstract void update(Object obj, DatabaseWrapper databasewrapper);

	public abstract void updateAll(Collection collection);

	public abstract void updateAll(Collection collection, DatabaseWrapper databasewrapper);

	public abstract void updateAutoIncrement(Object obj, Number number);
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import android.database.Cursor;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public interface Queriable
	extends Query
{

	public abstract DatabaseStatement compileStatement();

	public abstract DatabaseStatement compileStatement(DatabaseWrapper databasewrapper);

	public abstract long count();

	public abstract long count(DatabaseWrapper databasewrapper);

	public abstract void execute();

	public abstract void execute(DatabaseWrapper databasewrapper);

	public abstract long executeUpdateDelete();

	public abstract long executeUpdateDelete(DatabaseWrapper databasewrapper);

	public abstract boolean hasData();

	public abstract boolean hasData(DatabaseWrapper databasewrapper);

	public abstract Cursor query();

	public abstract Cursor query(DatabaseWrapper databasewrapper);
}

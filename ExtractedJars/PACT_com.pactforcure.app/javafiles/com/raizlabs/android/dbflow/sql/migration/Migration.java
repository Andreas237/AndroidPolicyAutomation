// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

public interface Migration
{

	public abstract void migrate(DatabaseWrapper databasewrapper);

	public abstract void onPostMigrate();

	public abstract void onPreMigrate();
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.listener;

import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;

public interface SQLiteStatementListener
{

	public abstract void onBindToInsertStatement(DatabaseStatement databasestatement);

	public abstract void onBindToStatement(DatabaseStatement databasestatement);
}

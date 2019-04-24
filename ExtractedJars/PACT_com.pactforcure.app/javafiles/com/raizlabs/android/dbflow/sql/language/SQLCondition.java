// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.QueryBuilder;

public interface SQLCondition
{

	public abstract void appendConditionToQuery(QueryBuilder querybuilder);

	public abstract String columnName();

	public abstract boolean hasSeparator();

	public abstract String operation();

	public abstract SQLCondition separator(String s);

	public abstract String separator();

	public abstract Object value();
}

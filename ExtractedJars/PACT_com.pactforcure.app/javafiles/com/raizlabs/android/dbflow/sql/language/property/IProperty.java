// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.language.NameAlias;

public interface IProperty
	extends Query
{

	public abstract IProperty as(String s);

	public abstract IProperty concatenate(IProperty iproperty);

	public abstract IProperty distinct();

	public abstract IProperty dividedBy(IProperty iproperty);

	public abstract String getCursorKey();

	public abstract NameAlias getNameAlias();

	public abstract Class getTable();

	public abstract IProperty minus(IProperty iproperty);

	public abstract IProperty mod(IProperty iproperty);

	public abstract IProperty multipliedBy(IProperty iproperty);

	public abstract IProperty plus(IProperty iproperty);

	public abstract IProperty withTable();

	public abstract IProperty withTable(NameAlias namealias);
}

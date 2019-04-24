// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

public interface ManyToMany
	extends Annotation
{

	public abstract boolean generateAutoIncrement();

	public abstract String generatedTableClassName();

	public abstract Class referencedTable();

	public abstract String referencedTableColumnName();

	public abstract boolean saveForeignKeyModels();

	public abstract String thisTableColumnName();
}

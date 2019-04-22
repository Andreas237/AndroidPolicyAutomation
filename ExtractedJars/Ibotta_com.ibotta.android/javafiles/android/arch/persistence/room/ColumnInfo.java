// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.annotation.Annotation;

public interface ColumnInfo
	extends Annotation
{
	public static interface Collate
		extends Annotation
	{
	}

	public static interface SQLiteTypeAffinity
		extends Annotation
	{
	}


	public abstract int collate();

	public abstract boolean index();

	public abstract String name();

	public abstract int typeAffinity();
}

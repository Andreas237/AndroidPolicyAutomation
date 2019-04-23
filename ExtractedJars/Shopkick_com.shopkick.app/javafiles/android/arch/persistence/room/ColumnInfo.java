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

	public static final int BINARY = 2;
	public static final int BLOB = 5;
	public static final String INHERIT_FIELD_NAME = "[field-name]";
	public static final int INTEGER = 3;
	public static final int LOCALIZED = 5;
	public static final int NOCASE = 3;
	public static final int REAL = 4;
	public static final int RTRIM = 4;
	public static final int TEXT = 2;
	public static final int UNDEFINED = 1;
	public static final int UNICODE = 6;
	public static final int UNSPECIFIED = 1;
}

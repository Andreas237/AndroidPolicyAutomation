// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.annotation.Annotation;

public interface OnConflictStrategy
	extends Annotation
{

	public static final int ABORT = 3;
	public static final int FAIL = 4;
	public static final int IGNORE = 5;
	public static final int REPLACE = 1;
	public static final int ROLLBACK = 2;
}

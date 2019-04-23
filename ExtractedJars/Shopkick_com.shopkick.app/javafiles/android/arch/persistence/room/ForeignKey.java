// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.annotation.Annotation;

public interface ForeignKey
	extends Annotation
{
	public static interface Action
		extends Annotation
	{
	}


	public abstract String[] childColumns();

	public abstract boolean deferred();

	public abstract Class entity();

	public abstract int onDelete();

	public abstract int onUpdate();

	public abstract String[] parentColumns();

	public static final int CASCADE = 5;
	public static final int NO_ACTION = 1;
	public static final int RESTRICT = 2;
	public static final int SET_DEFAULT = 4;
	public static final int SET_NULL = 3;
}

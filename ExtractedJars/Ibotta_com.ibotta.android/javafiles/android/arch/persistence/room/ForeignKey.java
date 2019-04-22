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
}

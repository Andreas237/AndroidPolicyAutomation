// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.annotation.Annotation;

public interface Relation
	extends Annotation
{

	public abstract Class entity();

	public abstract String entityColumn();

	public abstract String parentColumn();

	public abstract String[] projection();
}

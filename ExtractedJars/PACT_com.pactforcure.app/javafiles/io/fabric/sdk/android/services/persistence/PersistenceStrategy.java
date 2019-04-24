// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;


public interface PersistenceStrategy
{

	public abstract void clear();

	public abstract Object restore();

	public abstract void save(Object obj);
}

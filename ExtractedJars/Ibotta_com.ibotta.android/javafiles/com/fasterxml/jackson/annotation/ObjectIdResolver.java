// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


public interface ObjectIdResolver
{

	public abstract void bindItem(ObjectIdGenerator.IdKey idkey, Object obj);

	public abstract boolean canUseFor(ObjectIdResolver objectidresolver);

	public abstract ObjectIdResolver newForDeserialization(Object obj);

	public abstract Object resolveId(ObjectIdGenerator.IdKey idkey);
}

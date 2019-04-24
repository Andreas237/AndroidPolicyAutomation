// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;

public interface TypeIdResolver
{

	public abstract String getDescForKnownTypeIds();

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism();

	public abstract String idFromBaseType();

	public abstract String idFromValue(Object obj);

	public abstract String idFromValueAndType(Object obj, Class class1);

	public abstract void init(JavaType javatype);

	public abstract JavaType typeFromId(DatabindContext databindcontext, String s);

	public abstract JavaType typeFromId(String s);
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.cache;


public abstract class ModelCache
{

	public ModelCache(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		cache = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object cache>
	//    5    9:return          
	}

	public abstract void addModel(Object obj, Object obj1);

	public abstract void clear();

	public abstract Object get(Object obj);

	public Object getCache()
	{
		return cache;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object cache>
	//    2    4:areturn         
	}

	public abstract Object removeModel(Object obj);

	public abstract void setCacheSize(int i);

	private Object cache;
}

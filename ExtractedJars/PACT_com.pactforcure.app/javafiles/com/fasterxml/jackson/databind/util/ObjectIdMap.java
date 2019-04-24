// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.util.IdentityHashMap;

public class ObjectIdMap extends IdentityHashMap
{

	public ObjectIdMap()
	{
		super(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokespecial   #10  <Method void IdentityHashMap(int)>
	//    3    6:return          
	}

	public Object findId(Object obj)
	{
		return get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method Object get(Object)>
	//    3    5:areturn         
	}

	public void insertId(Object obj, Object obj1)
	{
		put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #22  <Method Object put(Object, Object)>
	//    4    6:pop             
	//    5    7:return          
	}
}

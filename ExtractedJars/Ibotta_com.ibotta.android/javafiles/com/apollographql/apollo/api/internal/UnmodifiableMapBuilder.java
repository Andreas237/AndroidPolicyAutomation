// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.internal;

import java.util.*;

public class UnmodifiableMapBuilder
{

	public UnmodifiableMapBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		map = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map map>
	//    7   15:return          
	}

	public UnmodifiableMapBuilder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		map = ((Map) (new HashMap(i)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #21  <Method void HashMap(int)>
	//    7   13:putfield        #17  <Field Map map>
	//    8   16:return          
	}

	public Map build()
	{
		return Collections.unmodifiableMap(map);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map map>
	//    2    4:invokestatic    #29  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public UnmodifiableMapBuilder put(Object obj, Object obj1)
	{
		map.put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	private final Map map;
}

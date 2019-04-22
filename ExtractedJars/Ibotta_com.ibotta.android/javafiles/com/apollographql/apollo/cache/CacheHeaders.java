// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache;

import java.util.Collections;
import java.util.Map;

public final class CacheHeaders
{

	CacheHeaders(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		headerMap = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Map headerMap>
	//    5    9:return          
	}

	public boolean hasHeader(String s)
	{
		return headerMap.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map headerMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method boolean Map.containsKey(Object)>
	//    4   10:ireturn         
	}

	public static final CacheHeaders NONE = new CacheHeaders(Collections.emptyMap());
	private final Map headerMap;

	static 
	{
	//    0    0:new             #2   <Class CacheHeaders>
	//    1    3:dup             
	//    2    4:invokestatic    #17  <Method Map Collections.emptyMap()>
	//    3    7:invokespecial   #21  <Method void CacheHeaders(Map)>
	//    4   10:putstatic       #23  <Field CacheHeaders NONE>
	//*   5   13:return          
	}
}

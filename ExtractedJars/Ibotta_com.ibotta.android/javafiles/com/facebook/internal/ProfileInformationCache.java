// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class ProfileInformationCache
{

	public static JSONObject getProfileInformation(String s)
	{
		return (JSONObject)infoCache.get(((Object) (s)));
	//    0    0:getstatic       #16  <Field ConcurrentHashMap infoCache>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #23  <Method Object ConcurrentHashMap.get(Object)>
	//    3    7:checkcast       #25  <Class JSONObject>
	//    4   10:areturn         
	}

	public static void putProfileInformation(String s, JSONObject jsonobject)
	{
		infoCache.put(((Object) (s)), ((Object) (jsonobject)));
	//    0    0:getstatic       #16  <Field ConcurrentHashMap infoCache>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Object ConcurrentHashMap.put(Object, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final ConcurrentHashMap infoCache = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #11  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #16  <Field ConcurrentHashMap infoCache>
	//*   4   10:return          
	}
}

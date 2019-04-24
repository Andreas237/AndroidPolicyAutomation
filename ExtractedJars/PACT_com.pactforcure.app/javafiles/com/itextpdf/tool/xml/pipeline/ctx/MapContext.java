// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.ctx;

import com.itextpdf.tool.xml.CustomContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapContext
	implements CustomContext
{

	public MapContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #18  <Field Map map>
	//    7   15:return          
	}

	public Object get(String s)
	{
		return map.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokeinterface #26  <Method Object Map.get(Object)>
	//    4   10:areturn         
	}

	public void put(String s, Object obj)
	{
		map.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final Map map = new ConcurrentHashMap();
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import java.util.*;

public class FM_Collection
{

	public FM_Collection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		data = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map data>
	//    7   15:return          
	}

	public Object get(Object obj)
	{
		return data.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map data>
	//    2    4:aload_1         
	//    3    5:invokeinterface #24  <Method Object Map.get(Object)>
	//    4   10:areturn         
	}

	public Iterator iterator()
	{
		return data.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map data>
	//    2    4:invokeinterface #32  <Method Set Map.keySet()>
	//    3    9:invokeinterface #36  <Method Iterator Set.iterator()>
	//    4   14:areturn         
	}

	public void put(Object obj, Object obj1)
	{
		data.put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map data>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	private Map data;
}

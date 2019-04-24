// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package co.touchlab.squeaky.dao:
//			DaoHelper

public static class DaoHelper$ValBuilder
{

	public DaoHelper$ValBuilder add(String s, Object obj)
	{
		vals.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map vals>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #28  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Map build()
	{
		return vals;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map vals>
	//    2    4:areturn         
	}

	Map vals;

	public DaoHelper$ValBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		vals = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map vals>
	//    7   15:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class bw
	implements Serializable
{

	public bw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		e = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map e>
	//    7   15:return          
	}

	public void b(String s, String s1)
	{
		e.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map e>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #27  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public String e(String s)
	{
		return (String)e.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map e>
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method Object Map.get(Object)>
	//    4   10:checkcast       #34  <Class String>
	//    5   13:areturn         
	}

	private Map e;
}

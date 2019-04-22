// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import java.util.*;

public class ServerValue
{

	public ServerValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private static Map createServerValuePlaceholder(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put(".sv", ((Object) (s)));
	//    4    8:aload_1         
	//    5    9:ldc1            #26  <String ".sv">
	//    6   11:aload_0         
	//    7   12:invokeinterface #32  <Method Object Map.put(Object, Object)>
	//    8   17:pop             
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//    9   18:aload_1         
	//   10   19:invokestatic    #38  <Method Map Collections.unmodifiableMap(Map)>
	//   11   22:areturn         
	}

	public static final Map TIMESTAMP = createServerValuePlaceholder("timestamp");

	static 
	{
	//    0    0:ldc1            #11  <String "timestamp">
	//    1    2:invokestatic    #15  <Method Map createServerValuePlaceholder(String)>
	//    2    5:putstatic       #17  <Field Map TIMESTAMP>
	//*   3    8:return          
	}
}

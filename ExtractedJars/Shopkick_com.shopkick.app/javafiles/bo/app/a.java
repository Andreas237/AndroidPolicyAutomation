// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.HashMap;
import java.util.Map;

public class a
{

	public a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public Map a()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #13  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("Accept-Encoding", "gzip, deflate");
	//    4    8:aload_1         
	//    5    9:ldc1            #16  <String "Accept-Encoding">
	//    6   11:ldc1            #18  <String "gzip, deflate">
	//    7   13:invokeinterface #24  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("Content-Type", "application/json");
	//    9   19:aload_1         
	//   10   20:ldc1            #26  <String "Content-Type">
	//   11   22:ldc1            #28  <String "application/json">
	//   12   24:invokeinterface #24  <Method Object Map.put(Object, Object)>
	//   13   29:pop             
		return ((Map) (hashmap));
	//   14   30:aload_1         
	//   15   31:areturn         
	}
}

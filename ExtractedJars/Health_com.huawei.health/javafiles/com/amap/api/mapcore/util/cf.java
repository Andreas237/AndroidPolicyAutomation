// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.Hashtable;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj

public class cf extends jj
{

	public cf(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void jj()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String a>
	//    5    9:return          
	}

	public Map a()
	{
		Hashtable hashtable = new Hashtable(32);
	//    0    0:new             #17  <Class Hashtable>
	//    1    3:dup             
	//    2    4:bipush          32
	//    3    6:invokespecial   #20  <Method void Hashtable(int)>
	//    4    9:astore_1        
		((Map) (hashtable)).put("User-Agent", "MAC=channel:amapapi");
	//    5   10:aload_1         
	//    6   11:ldc1            #22  <String "User-Agent">
	//    7   13:ldc1            #24  <String "MAC=channel:amapapi">
	//    8   15:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    9   20:pop             
		return ((Map) (hashtable));
	//   10   21:aload_1         
	//   11   22:areturn         
	}

	public Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String a>
	//    2    4:areturn         
	}

	private String a;
}

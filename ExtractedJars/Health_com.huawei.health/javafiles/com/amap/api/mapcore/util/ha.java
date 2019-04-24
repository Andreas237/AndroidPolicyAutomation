// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj

class ha extends jj
{

	ha()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void jj()>
		a = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map a>
		c = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #17  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void HashMap()>
	//   11   23:putfield        #22  <Field Map c>
	//   12   26:return          
	}

	public Map a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map a>
	//    2    4:areturn         
	}

	void a(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String b>
	//    3    5:return          
	}

	void a(Map map)
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map a>
	//    2    4:invokeinterface #35  <Method void Map.clear()>
		a.putAll(map);
	//    3    9:aload_0         
	//    4   10:getfield        #20  <Field Map a>
	//    5   13:aload_1         
	//    6   14:invokeinterface #38  <Method void Map.putAll(Map)>
	//    7   19:return          
	}

	public Map b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map c>
	//    2    4:areturn         
	}

	void b(Map map)
	{
		c.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map c>
	//    2    4:invokeinterface #35  <Method void Map.clear()>
		c.putAll(map);
	//    3    9:aload_0         
	//    4   10:getfield        #22  <Field Map c>
	//    5   13:aload_1         
	//    6   14:invokeinterface #38  <Method void Map.putAll(Map)>
	//    7   19:return          
	}

	public String c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String b>
	//    2    4:areturn         
	}

	private Map a;
	private String b;
	private Map c;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			ib, if, hq

public static class ib$a
{

	public static if a(hq hq1, String s)
	{
		hq1 = ((hq) (hq1.b(com.amap.api.mapcore.util.if.b(s), com/amap/api/mapcore/util/if)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #14  <Method String if.b(String)>
	//    3    5:ldc1            #10  <Class if>
	//    4    7:invokevirtual   #19  <Method List hq.b(String, Class)>
	//    5   10:astore_0        
		if(hq1 != null && ((List) (hq1)).size() > 0)
	//*   6   11:aload_0         
	//*   7   12:ifnull          35
	//*   8   15:aload_0         
	//*   9   16:invokeinterface #25  <Method int List.size()>
	//*  10   21:ifle            35
			return (if)((List) (hq1)).get(0);
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #29  <Method Object List.get(int)>
	//   14   31:checkcast       #10  <Class if>
	//   15   34:areturn         
		else
			return null;
	//   16   35:aconst_null     
	//   17   36:areturn         
	}

	public static List a(hq hq1, String s, String s1)
	{
		return hq1.b(com.amap.api.mapcore.util.if.b(s, s1), com/amap/api/mapcore/util/if);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #34  <Method String if.b(String, String)>
	//    4    6:ldc1            #10  <Class if>
	//    5    8:invokevirtual   #19  <Method List hq.b(String, Class)>
	//    6   11:areturn         
	}

	public static void a(hq hq1, if if1, String s)
	{
		hq1.a(((Object) (if1)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #40  <Method void hq.a(Object, String)>
	//    4    6:return          
	}
}

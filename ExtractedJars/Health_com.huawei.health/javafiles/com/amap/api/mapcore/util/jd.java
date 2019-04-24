// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj

public class jd extends jj
{

	public jd(byte abyte0[], Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void jj()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field byte[] a>
		b = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field Map b>
	//    8   14:return          
	}

	public Map a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Map b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map b>
	//    2    4:areturn         
	}

	public String c()
	{
		return "https://adiu.amap.com/ws/device/adius";
	//    0    0:ldc1            #27  <String "https://adiu.amap.com/ws/device/adius">
	//    1    2:areturn         
	}

	public byte[] g()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] a>
	//    2    4:areturn         
	}

	private byte a[];
	private Map b;
}

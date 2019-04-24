// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			hd, gu, gz

public class hc extends hd
{

	hc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void hd()>
	//    2    4:return          
	}

	public hc(hd hd1)
	{
		super(hd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void hd(hd)>
	//    3    5:return          
	}

	protected byte[] a(byte abyte0[])
	{
		return gz.a(gu.c(abyte0));
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method String gu.c(byte[])>
	//    2    4:invokestatic    #25  <Method byte[] gz.a(String)>
	//    3    7:areturn         
	}
}

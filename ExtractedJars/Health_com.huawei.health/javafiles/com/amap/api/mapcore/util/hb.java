// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			hd, gz

public class hb extends hd
{

	hb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void hd()>
	//    2    4:return          
	}

	public hb(hd hd1)
	{
		super(hd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void hd(hd)>
	//    3    5:return          
	}

	protected byte[] a(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #16  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(gz.a(abyte0)).append("||").append(1);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokestatic    #22  <Method String gz.a(byte[])>
	//    7   13:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:ldc1            #28  <String "||">
	//    9   18:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//   12   25:pop             
		return gz.a(stringbuilder.toString());
	//   13   26:aload_2         
	//   14   27:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #38  <Method byte[] gz.a(String)>
	//   16   33:areturn         
	}
}

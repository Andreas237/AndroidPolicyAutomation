// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			and, aoi

public final class ajh
{

	public ajh(Object obj, byte abyte0[], and and, aoi aoi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Object a>
		b = Arrays.copyOf(abyte0, abyte0.length);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:arraylength     
	//    9   13:invokestatic    #25  <Method byte[] Arrays.copyOf(byte[], int)>
	//   10   16:putfield        #27  <Field byte[] b>
		c = and;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #29  <Field and c>
		d = aoi;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #31  <Field aoi d>
	//   17   30:return          
	}

	public final Object a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object a>
	//    2    4:areturn         
	}

	public final byte[] b()
	{
		byte abyte0[] = b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field byte[] b>
	//    2    4:astore_1        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Arrays.copyOf(abyte0, abyte0.length);
	//    7   11:aload_1         
	//    8   12:aload_1         
	//    9   13:arraylength     
	//   10   14:invokestatic    #25  <Method byte[] Arrays.copyOf(byte[], int)>
	//   11   17:areturn         
	}

	private final Object a;
	private final byte b[];
	private final and c;
	private final aoi d;
}

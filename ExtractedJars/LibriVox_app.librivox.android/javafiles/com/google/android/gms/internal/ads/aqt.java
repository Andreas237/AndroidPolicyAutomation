// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqv, aqr

final class aqt
	implements aqv
{

	private aqt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	aqt(aqr aqr)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void aqt()>
	//    2    4:return          
	}

	public final byte[] a(byte abyte0[], int i, int j)
	{
		return Arrays.copyOfRange(abyte0, i, j + i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload_2         
	//    4    4:iadd            
	//    5    5:invokestatic    #20  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//    6    8:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztk, zztf

final class zzti
	implements zztk
{

	private zzti()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	zzti(zztf zztf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzti()>
	//    2    4:return          
	}

	public final byte[] zzc(byte abyte0[], int i, int j)
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

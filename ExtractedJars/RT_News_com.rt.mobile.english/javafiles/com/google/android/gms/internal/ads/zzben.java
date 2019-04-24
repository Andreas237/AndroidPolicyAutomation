// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


abstract class zzben
{

	zzben()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	abstract int zzb(int i, byte abyte0[], int j, int k);

	abstract int zzb(CharSequence charsequence, byte abyte0[], int i, int j);

	final boolean zzf(byte abyte0[], int i, int j)
	{
		return zzb(0, abyte0, i, j) == 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokevirtual   #16  <Method int zzb(int, byte[], int, int)>
	//    6    8:ifne            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}
}

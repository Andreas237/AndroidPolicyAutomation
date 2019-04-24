// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbal, zzbai

final class zzbap
	implements zzbal
{

	private zzbap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	zzbap(zzbai zzbai)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbap()>
	//    2    4:return          
	}

	public final byte[] zzd(byte abyte0[], int i, int j)
	{
		byte abyte1[] = new byte[j];
	//    0    0:iload_3         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload           4
	//    6    9:iconst_0        
	//    7   10:iload_3         
	//    8   11:invokestatic    #21  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//    9   14:aload           4
	//   10   16:areturn         
	}
}

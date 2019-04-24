// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazo, zzayl, zzazn

public final class zzaym extends zzazo
{

	public zzaym(byte abyte0[])
		throws InvalidKeyException
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void zzazo(byte[])>
	//    3    5:return          
	}

	final zzazn zzc(byte abyte0[], int i)
		throws InvalidKeyException
	{
		return ((zzazn) (new zzayl(abyte0, i)));
	//    0    0:new             #16  <Class zzayl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #19  <Method void zzayl(byte[], int)>
	//    5    9:areturn         
	}

	public final volatile byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		return super.zzc(abyte0, abyte1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method byte[] zzazo.zzc(byte[], byte[])>
	//    4    6:areturn         
	}
}

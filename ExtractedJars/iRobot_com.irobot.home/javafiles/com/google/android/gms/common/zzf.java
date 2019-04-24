// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common:
//			zze

final class zzf extends zze
{

	zzf(byte abyte0[])
	{
		super(Arrays.copyOfRange(abyte0, 0, 25));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:bipush          25
	//    4    5:invokestatic    #14  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//    5    8:invokespecial   #16  <Method void zze(byte[])>
		zzu = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #18  <Field byte[] zzu>
	//    9   16:return          
	}

	final byte[] getBytes()
	{
		return zzu;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field byte[] zzu>
	//    2    4:areturn         
	}

	private final byte zzu[];
}

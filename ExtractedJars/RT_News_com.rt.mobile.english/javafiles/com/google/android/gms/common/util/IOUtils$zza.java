// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.android.gms.common.util:
//			IOUtils, zzb

private static final class IOUtils$zza extends ByteArrayOutputStream
{

	final void zza(byte abyte0[], int i)
	{
		System.arraycopy(((Object) (buf)), 0, ((Object) (abyte0)), i, count);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte[] buf>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field int count>
	//    7   11:invokestatic    #29  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    8   14:return          
	}

	private IOUtils$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ByteArrayOutputStream()>
	//    2    4:return          
	}

	IOUtils$zza(zzb zzb)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void IOUtils$zza()>
	//    2    4:return          
	}
}

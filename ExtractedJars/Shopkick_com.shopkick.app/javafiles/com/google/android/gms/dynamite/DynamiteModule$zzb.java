// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.Context;

// Referenced classes of package com.google.android.gms.dynamite:
//			DynamiteModule

private static final class DynamiteModule$zzb
	implements ionPolicy.zza
{

	public final int getLocalVersion(Context context, String s)
	{
		return zzio;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int zzio>
	//    2    4:ireturn         
	}

	public final int zza(Context context, String s, boolean flag)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final int zzio;
	private final int zzip = 0;

	public DynamiteModule$zzb(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzio = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int zzio>
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int zzip>
	//    8   14:return          
	}
}

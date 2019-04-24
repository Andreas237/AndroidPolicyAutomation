// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzy

static final class zzcw$zzu extends zzcw$zzb
{

	public void zza(zzy zzy1)
	{
		zzaa(((Object) (new Status(zzy1.statusCode))));
	//    0    0:aload_0         
	//    1    1:new             #19  <Class Status>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field int zzy.statusCode>
	//    5    9:invokespecial   #28  <Method void Status(int)>
	//    6   12:invokevirtual   #32  <Method void zzaa(Object)>
	//    7   15:return          
	}

	public zzcw$zzu(com.google.android.gms.internal. )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}
}

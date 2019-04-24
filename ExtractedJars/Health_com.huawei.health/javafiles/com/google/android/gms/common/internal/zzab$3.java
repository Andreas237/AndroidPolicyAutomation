// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.zze;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzab

final class zzab$3
	implements a
{

	public zze zze(Result result)
	{
		zzaGB.zzb(result);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zze zzaGB>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void zze.zzb(Result)>
		return zzaGB;
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field zze zzaGB>
	//    6   12:areturn         
	}

	public Object zzf(Result result)
	{
		return ((Object) (zze(result)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method zze zze(Result)>
	//    3    5:areturn         
	}

	final zze zzaGB;

	zzab$3(zze zze1)
	{
		zzaGB = zze1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zze zzaGB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

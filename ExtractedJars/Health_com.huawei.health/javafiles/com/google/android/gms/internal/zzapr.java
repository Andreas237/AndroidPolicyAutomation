// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

public class zzapr extends zzapf.zza
{

	public zzapr(zzaad.zzb zzb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzapf$zza()>
		zzaGN = zzb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field zzaad$zzb zzaGN>
	//    5    9:return          
	}

	public void zzp(Status status)
	{
		zzaGN.setResult(((Object) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaad$zzb zzaGN>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void zzaad$zzb.setResult(Object)>
	//    4   10:return          
	}

	private final zzaad.zzb zzaGN;
}

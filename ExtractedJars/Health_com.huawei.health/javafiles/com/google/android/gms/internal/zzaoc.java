// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.fitness.result.DataSourcesResult;

public class zzaoc extends zzaon.zza
{

	public zzaoc(zzaad.zzb zzb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzaon$zza()>
		zzaUC = zzb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field zzaad$zzb zzaUC>
	//    5    9:return          
	}

	public void zza(DataSourcesResult datasourcesresult)
	{
		zzaUC.setResult(((Object) (datasourcesresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaad$zzb zzaUC>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void zzaad$zzb.setResult(Object)>
	//    4   10:return          
	}

	private final zzaad.zzb zzaUC;
}

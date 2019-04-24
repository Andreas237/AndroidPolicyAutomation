// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzl

public class zzal extends zzl
{

	protected String zzeu()
	{
		return zzaFm.zzeu();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field com.google.android.gms.common.api.Api$zzg zzaFm>
	//    2    4:invokeinterface #16  <Method String com.google.android.gms.common.api.Api$zzg.zzeu()>
	//    3    9:areturn         
	}

	protected String zzev()
	{
		return zzaFm.zzev();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field com.google.android.gms.common.api.Api$zzg zzaFm>
	//    2    4:invokeinterface #20  <Method String com.google.android.gms.common.api.Api$zzg.zzev()>
	//    3    9:areturn         
	}

	protected IInterface zzh(IBinder ibinder)
	{
		return zzaFm.zzh(ibinder);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field com.google.android.gms.common.api.Api$zzg zzaFm>
	//    2    4:aload_1         
	//    3    5:invokeinterface #24  <Method IInterface com.google.android.gms.common.api.Api$zzg.zzh(IBinder)>
	//    4   10:areturn         
	}

	public com.google.android.gms.common.api.Api.zzg zzxG()
	{
		return zzaFm;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field com.google.android.gms.common.api.Api$zzg zzaFm>
	//    2    4:areturn         
	}

	private final com.google.android.gms.common.api.Api.zzg zzaFm;
}

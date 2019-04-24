// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;

// Referenced classes of package com.google.android.gms.internal:
//			zzacl

public class zzacj extends zzl
{

	public zzacj(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 39, zzg, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          39
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #10  <Method void zzl(Context, Looper, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   13:return          
	}

	protected zzacl zzbz(IBinder ibinder)
	{
		return zzacl.zza.zzbB(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method zzacl zzacl$zza.zzbB(IBinder)>
	//    2    4:areturn         
	}

	public String zzeA()
	{
		return "com.google.android.gms.common.internal.service.ICommonService";
	//    0    0:ldc1            #22  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    1    2:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.common.service.START";
	//    0    0:ldc1            #25  <String "com.google.android.gms.common.service.START">
	//    1    2:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzbz(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method zzacl zzbz(IBinder)>
	//    3    5:areturn         
	}
}

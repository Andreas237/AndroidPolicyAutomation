// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.fitness.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzany

public abstract class zzaob extends zzl
{

	protected zzaob(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zzg zzg)
	{
		super(context, looper, i, zzg, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           6
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #10  <Method void zzl(Context, Looper, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   13:return          
	}

	public Set zzc(Set set)
	{
		return zzb.zzj(((java.util.Collection) (set)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method Set zzb.zzj(java.util.Collection)>
	//    2    4:areturn         
	}

	public abstract String zzeA();

	public abstract String zzez();

	public abstract IInterface zzh(IBinder ibinder);

	public boolean zzrd()
	{
		return !zzany.zzbo(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Context getContext()>
	//    2    4:invokestatic    #38  <Method boolean zzany.zzbo(Context)>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean zzxE()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}

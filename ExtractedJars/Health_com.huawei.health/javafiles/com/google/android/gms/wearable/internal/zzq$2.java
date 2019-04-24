// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.internal.zzabh;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzq, zzcx

final class zzq$2
	implements a
{

	public void zza(zzcx zzcx1, com.google.android.gms.internal.zzb zzb, com.google.android.gms.wearable.lApi.ChannelListener channellistener, zzabh zzabh)
		throws RemoteException
	{
		zzcx1.zza(zzb, channellistener, zzabh, ((String) (null)), zzbTK);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:aload_0         
	//    6    7:getfield        #18  <Field IntentFilter[] zzbTK>
	//    7   10:invokevirtual   #30  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.ChannelApi$ChannelListener, zzabh, String, IntentFilter[])>
	//    8   13:return          
	}

	public volatile void zza(zzcx zzcx1, com.google.android.gms.internal.zzb zzb, Object obj, zzabh zzabh)
		throws RemoteException
	{
		zza(zzcx1, zzb, (com.google.android.gms.wearable.lApi.ChannelListener)obj, zzabh);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #36  <Class com.google.android.gms.wearable.ChannelApi$ChannelListener>
	//    5    7:aload           4
	//    6    9:invokevirtual   #38  <Method void zza(zzcx, com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.ChannelApi$ChannelListener, zzabh)>
	//    7   12:return          
	}

	final IntentFilter zzbTK[];

	zzq$2(IntentFilter aintentfilter[])
	{
		zzbTK = aintentfilter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field IntentFilter[] zzbTK>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

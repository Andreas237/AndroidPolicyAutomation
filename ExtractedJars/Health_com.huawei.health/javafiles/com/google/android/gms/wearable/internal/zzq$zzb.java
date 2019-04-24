// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzq, zzcx

static final class zzq$zzb extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzcx)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class zzcx>
	//    3    5:invokevirtual   #39  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.b) (this)), zzbTT, zzaiJ);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbTT>
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field String zzaiJ>
	//    6   10:invokevirtual   #43  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.ChannelApi$ChannelListener, String)>
		zzbTT = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbTT>
	//   10   18:return          
	}

	public Status zzb(Status status)
	{
		zzbTT = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbTT>
		return status;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	private final String zzaiJ;
	private com.google.android.gms.wearable.pi.ChannelListener zzbTT;

	zzq$zzb(GoogleApiClient googleapiclient, com.google.android.gms.wearable.pi.ChannelListener channellistener, String s)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzm(GoogleApiClient)>
		zzbTT = (com.google.android.gms.wearable.pi.ChannelListener)zzac.zzw(((Object) (channellistener)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokestatic    #23  <Method Object zzac.zzw(Object)>
	//    6   10:checkcast       #25  <Class com.google.android.gms.wearable.ChannelApi$ChannelListener>
	//    7   13:putfield        #27  <Field com.google.android.gms.wearable.ChannelApi$ChannelListener zzbTT>
		zzaiJ = s;
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:putfield        #29  <Field String zzaiJ>
	//   11   21:return          
	}
}

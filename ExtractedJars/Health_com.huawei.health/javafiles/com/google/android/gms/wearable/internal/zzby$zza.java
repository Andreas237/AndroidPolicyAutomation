// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzby, zzcx

static final class zzby$zza extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
		throws RemoteException
	{
		zza((zzcx)zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #48  <Class zzcx>
	//    3    5:invokevirtual   #51  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.) (this)), zzbUI, zzaDf, zzbUJ);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field zzabh zzaDf>
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field IntentFilter[] zzbUJ>
	//    8   14:invokevirtual   #55  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.MessageApi$MessageListener, zzabh, IntentFilter[])>
		zzbUI = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
		zzaDf = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #34  <Field zzabh zzaDf>
		zzbUJ = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #37  <Field IntentFilter[] zzbUJ>
	//   18   32:return          
	}

	public Status zzb(Status status)
	{
		zzbUI = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
		zzaDf = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #34  <Field zzabh zzaDf>
		zzbUJ = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #37  <Field IntentFilter[] zzbUJ>
		return status;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	private zzabh zzaDf;
	private com.google.android.gms.wearable.i.MessageListener zzbUI;
	private IntentFilter zzbUJ[];

	private zzby$zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, zzabh zzabh1, IntentFilter aintentfilter[])
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zzm(GoogleApiClient)>
		zzbUI = (com.google.android.gms.wearable.i.MessageListener)zzac.zzw(((Object) (messagelistener)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//    6   10:checkcast       #28  <Class com.google.android.gms.wearable.MessageApi$MessageListener>
	//    7   13:putfield        #30  <Field com.google.android.gms.wearable.MessageApi$MessageListener zzbUI>
		zzaDf = (zzabh)zzac.zzw(((Object) (zzabh1)));
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//   11   21:checkcast       #32  <Class zzabh>
	//   12   24:putfield        #34  <Field zzabh zzaDf>
		zzbUJ = (IntentFilter[])zzac.zzw(((Object) (aintentfilter)));
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:invokestatic    #26  <Method Object zzac.zzw(Object)>
	//   16   33:checkcast       #35  <Class IntentFilter[]>
	//   17   36:putfield        #37  <Field IntentFilter[] zzbUJ>
	//   18   39:return          
	}

	zzby$zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, zzabh zzabh1, IntentFilter aintentfilter[], zzby._cls1 _pcls1)
	{
		this(googleapiclient, messagelistener, zzabh1, aintentfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #43  <Method void zzby$zza(GoogleApiClient, com.google.android.gms.wearable.MessageApi$MessageListener, zzabh, IntentFilter[])>
	//    6    9:return          
	}
}

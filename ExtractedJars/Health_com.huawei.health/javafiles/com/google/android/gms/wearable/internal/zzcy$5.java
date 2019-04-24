// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcy, zzs

final class zzcy$5
	implements com.google.android.gms.internal.zc
{

	public void zzb(com.google.android.gms.wearable.Api.ChannelListener channellistener)
	{
		zzbTv.zza(channellistener);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzs zzbTv>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void zzs.zza(com.google.android.gms.wearable.ChannelApi$ChannelListener)>
	//    4    8:return          
	}

	public void zzs(Object obj)
	{
		zzb((com.google.android.gms.wearable.Api.ChannelListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class com.google.android.gms.wearable.ChannelApi$ChannelListener>
	//    3    5:invokevirtual   #34  <Method void zzb(com.google.android.gms.wearable.ChannelApi$ChannelListener)>
	//    4    8:return          
	}

	public void zzwc()
	{
	//    0    0:return          
	}

	final zzs zzbTv;

	zzcy$5(zzs zzs1)
	{
		zzbTv = zzs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzs zzbTv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

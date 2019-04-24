// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmb

final class zzmc
	implements Runnable
{

	zzmc(zzmb zzmb1, Context context)
	{
		zzath = zzmb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzmb zzath>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Context val$context>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzath.getRewardedVideoAdInstance(val$context);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzmb zzath>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field Context val$context>
	//    4    8:invokevirtual   #27  <Method com.google.android.gms.ads.reward.RewardedVideoAd zzmb.getRewardedVideoAdInstance(Context)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final Context val$context;
	private final zzmb zzath;
}

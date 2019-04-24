// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkd, zzly

final class zzlz extends zzkd
{

	zzlz(zzly zzly1)
	{
		zzatc = zzly1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzly zzatc>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzkd()>
	//    5    9:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzly.zza(zzatc).zza(zzatc.zzbc());
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzly zzatc>
	//    2    4:invokestatic    #22  <Method VideoController zzly.zza(zzly)>
	//    3    7:aload_0         
	//    4    8:getfield        #10  <Field zzly zzatc>
	//    5   11:invokevirtual   #26  <Method zzlo zzly.zzbc()>
	//    6   14:invokevirtual   #31  <Method void VideoController.zza(zzlo)>
		super.onAdFailedToLoad(i);
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:invokespecial   #33  <Method void zzkd.onAdFailedToLoad(int)>
	//   10   22:return          
	}

	public final void onAdLoaded()
	{
		zzly.zza(zzatc).zza(zzatc.zzbc());
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzly zzatc>
	//    2    4:invokestatic    #22  <Method VideoController zzly.zza(zzly)>
	//    3    7:aload_0         
	//    4    8:getfield        #10  <Field zzly zzatc>
	//    5   11:invokevirtual   #26  <Method zzlo zzly.zzbc()>
	//    6   14:invokevirtual   #31  <Method void VideoController.zza(zzlo)>
		super.onAdLoaded();
	//    7   17:aload_0         
	//    8   18:invokespecial   #36  <Method void zzkd.onAdLoaded()>
	//    9   21:return          
	}

	private final zzly zzatc;
}

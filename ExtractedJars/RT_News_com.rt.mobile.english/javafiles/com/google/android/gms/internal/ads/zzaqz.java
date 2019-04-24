// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqx, zzait

final class zzaqz
	implements Runnable
{

	zzaqz(zzaqx zzaqx1, View view, zzait zzait, int i)
	{
		zzdci = zzaqx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzaqx zzdci>
		val$view = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field View val$view>
		zzdcg = zzait;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field zzait zzdcg>
		zzdch = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #24  <Field int zzdch>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		zzaqx.zza(zzdci, val$view, zzdcg, zzdch - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzaqx zzdci>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field View val$view>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field zzait zzdcg>
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field int zzdch>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:invokestatic    #34  <Method void zzaqx.zza(zzaqx, View, zzait, int)>
	//   11   21:return          
	}

	private final View val$view;
	private final zzait zzdcg;
	private final int zzdch;
	private final zzaqx zzdci;
}

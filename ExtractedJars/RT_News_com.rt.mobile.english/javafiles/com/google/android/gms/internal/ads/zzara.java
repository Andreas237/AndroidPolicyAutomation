// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqx, zzait

final class zzara
	implements android.view.View.OnAttachStateChangeListener
{

	zzara(zzaqx zzaqx1, zzait zzait)
	{
		zzdci = zzaqx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzaqx zzdci>
		zzdcg = zzait;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzait zzdcg>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onViewAttachedToWindow(View view)
	{
		zzaqx.zza(zzdci, view, zzdcg, 10);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaqx zzdci>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field zzait zzdcg>
	//    5    9:bipush          10
	//    6   11:invokestatic    #28  <Method void zzaqx.zza(zzaqx, View, zzait, int)>
	//    7   14:return          
	}

	public final void onViewDetachedFromWindow(View view)
	{
	//    0    0:return          
	}

	private final zzait zzdcg;
	private final zzaqx zzdci;
}

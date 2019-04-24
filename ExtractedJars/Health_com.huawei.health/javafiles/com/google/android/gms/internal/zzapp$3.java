// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.fitness.request.OnDataPointListener;

// Referenced classes of package com.google.android.gms.internal:
//			zzapp

class zzapp$3
	implements a
{

	public void zzCJ()
	{
		com.google.android.gms.fitness.request..zzDa().zzc(zzaVd);
	//    0    0:invokestatic    #28  <Method com.google.android.gms.fitness.request.zzao$zza com.google.android.gms.fitness.request.zzao$zza.zzDa()>
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field OnDataPointListener zzaVd>
	//    3    7:invokevirtual   #32  <Method com.google.android.gms.fitness.request.zzao com.google.android.gms.fitness.request.zzao$zza.zzc(OnDataPointListener)>
	//    4   10:pop             
	//    5   11:return          
	}

	final OnDataPointListener zzaVd;

	zzapp$3(zzapp zzapp1, OnDataPointListener ondatapointlistener)
	{
		zzaVd = ondatapointlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field OnDataPointListener zzaVd>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

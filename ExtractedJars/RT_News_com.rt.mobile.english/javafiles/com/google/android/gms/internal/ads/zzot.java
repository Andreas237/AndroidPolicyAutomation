// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzox, zzos

final class zzot
	implements zzox
{

	zzot(zzos zzos1)
	{
		zzbir = zzos1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzos zzbir>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzc(MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public final void zzki()
	{
		zzbir.performClick("_videoMediaView");
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzos zzbir>
	//    2    4:ldc1            #21  <String "_videoMediaView">
	//    3    6:invokevirtual   #27  <Method void zzos.performClick(String)>
	//    4    9:return          
	}

	private final zzos zzbir;
}

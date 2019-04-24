// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzls

public final class zzmt extends zzls
{

	public zzmt(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videolifecyclecallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzls()>
		zzuy = videolifecyclecallbacks;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    5    9:return          
	}

	public final void onVideoEnd()
	{
		zzuy.onVideoEnd();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    2    4:invokevirtual   #19  <Method void com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks.onVideoEnd()>
	//    3    7:return          
	}

	public final void onVideoMute(boolean flag)
	{
		zzuy.onVideoMute(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #23  <Method void com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks.onVideoMute(boolean)>
	//    4    8:return          
	}

	public final void onVideoPause()
	{
		zzuy.onVideoPause();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    2    4:invokevirtual   #26  <Method void com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks.onVideoPause()>
	//    3    7:return          
	}

	public final void onVideoPlay()
	{
		zzuy.onVideoPlay();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    2    4:invokevirtual   #29  <Method void com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks.onVideoPlay()>
	//    3    7:return          
	}

	public final void onVideoStart()
	{
		zzuy.onVideoStart();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks zzuy>
	//    2    4:invokevirtual   #32  <Method void com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks.onVideoStart()>
	//    3    7:return          
	}

	private final com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zzuy;
}

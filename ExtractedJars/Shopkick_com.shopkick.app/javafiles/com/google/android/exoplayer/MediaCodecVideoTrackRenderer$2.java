// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.view.Surface;

// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecVideoTrackRenderer

class MediaCodecVideoTrackRenderer$2
	implements Runnable
{

	public void run()
	{
		MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer.this).onDrawnToSurface(val$surface);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaCodecVideoTrackRenderer this$0>
	//    2    4:invokestatic    #29  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Surface val$surface>
	//    5   11:invokeinterface #35  <Method void MediaCodecVideoTrackRenderer$EventListener.onDrawnToSurface(Surface)>
	//    6   16:return          
	}

	final MediaCodecVideoTrackRenderer this$0;
	final Surface val$surface;

	MediaCodecVideoTrackRenderer$2()
	{
		this$0 = final_mediacodecvideotrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaCodecVideoTrackRenderer this$0>
		val$surface = Surface.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Surface val$surface>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

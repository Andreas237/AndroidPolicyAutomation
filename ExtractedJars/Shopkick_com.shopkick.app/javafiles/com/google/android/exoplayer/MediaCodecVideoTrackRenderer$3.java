// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecVideoTrackRenderer

class MediaCodecVideoTrackRenderer$3
	implements Runnable
{

	public void run()
	{
		MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer.this).onDroppedFrames(val$countToNotify, val$elapsedToNotify);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaCodecVideoTrackRenderer this$0>
	//    2    4:invokestatic    #33  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int val$countToNotify>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field long val$elapsedToNotify>
	//    7   15:invokeinterface #39  <Method void MediaCodecVideoTrackRenderer$EventListener.onDroppedFrames(int, long)>
	//    8   20:return          
	}

	final MediaCodecVideoTrackRenderer this$0;
	final int val$countToNotify;
	final long val$elapsedToNotify;

	MediaCodecVideoTrackRenderer$3()
	{
		this$0 = final_mediacodecvideotrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaCodecVideoTrackRenderer this$0>
		val$countToNotify = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int val$countToNotify>
		val$elapsedToNotify = J.this;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long val$elapsedToNotify>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}

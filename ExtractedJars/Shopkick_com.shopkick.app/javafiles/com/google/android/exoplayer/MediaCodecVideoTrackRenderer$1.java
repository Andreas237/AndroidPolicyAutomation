// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			MediaCodecVideoTrackRenderer

class MediaCodecVideoTrackRenderer$1
	implements Runnable
{

	public void run()
	{
		MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer.this).onVideoSizeChanged(val$currentWidth, val$currentHeight, val$currentUnappliedRotationDegrees, val$currentPixelWidthHeightRatio);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaCodecVideoTrackRenderer this$0>
	//    2    4:invokestatic    #39  <Method MediaCodecVideoTrackRenderer$EventListener MediaCodecVideoTrackRenderer.access$000(MediaCodecVideoTrackRenderer)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int val$currentWidth>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field int val$currentHeight>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field int val$currentUnappliedRotationDegrees>
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field float val$currentPixelWidthHeightRatio>
	//   11   23:invokeinterface #45  <Method void MediaCodecVideoTrackRenderer$EventListener.onVideoSizeChanged(int, int, int, float)>
	//   12   28:return          
	}

	final MediaCodecVideoTrackRenderer this$0;
	final int val$currentHeight;
	final float val$currentPixelWidthHeightRatio;
	final int val$currentUnappliedRotationDegrees;
	final int val$currentWidth;

	MediaCodecVideoTrackRenderer$1()
	{
		this$0 = final_mediacodecvideotrackrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MediaCodecVideoTrackRenderer this$0>
		val$currentWidth = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int val$currentWidth>
		val$currentHeight = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int val$currentHeight>
		val$currentUnappliedRotationDegrees = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int val$currentUnappliedRotationDegrees>
		val$currentPixelWidthHeightRatio = F.this;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #31  <Field float val$currentPixelWidthHeightRatio>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void Object()>
	//   17   31:return          
	}
}

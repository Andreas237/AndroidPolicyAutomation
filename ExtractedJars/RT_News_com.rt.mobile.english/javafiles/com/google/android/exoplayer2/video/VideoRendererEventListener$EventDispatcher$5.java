// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;


// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoRendererEventListener

class VideoRendererEventListener$EventDispatcher$5
	implements Runnable
{

	public void run()
	{
		VideoRendererEventListener.EventDispatcher.access$000(VideoRendererEventListener.EventDispatcher.this).onVideoSizeChanged(val$width, val$height, val$unappliedRotationDegrees, val$pixelWidthHeightRatio);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field VideoRendererEventListener$EventDispatcher this$0>
	//    2    4:invokestatic    #43  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field int val$width>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field int val$height>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field int val$unappliedRotationDegrees>
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field float val$pixelWidthHeightRatio>
	//   11   23:invokeinterface #46  <Method void VideoRendererEventListener.onVideoSizeChanged(int, int, int, float)>
	//   12   28:return          
	}

	final VideoRendererEventListener.EventDispatcher this$0;
	final int val$height;
	final float val$pixelWidthHeightRatio;
	final int val$unappliedRotationDegrees;
	final int val$width;

	VideoRendererEventListener$EventDispatcher$5()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field VideoRendererEventListener$EventDispatcher this$0>
		val$width = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int val$width>
		val$height = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #30  <Field int val$height>
		val$unappliedRotationDegrees = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field int val$unappliedRotationDegrees>
		val$pixelWidthHeightRatio = F.this;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #34  <Field float val$pixelWidthHeightRatio>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}

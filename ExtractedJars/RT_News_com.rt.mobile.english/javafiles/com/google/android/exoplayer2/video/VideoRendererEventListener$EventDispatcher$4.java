// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;


// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoRendererEventListener

class VideoRendererEventListener$EventDispatcher$4
	implements Runnable
{

	public void run()
	{
		VideoRendererEventListener.EventDispatcher.access$000(VideoRendererEventListener.EventDispatcher.this).onDroppedFrames(val$droppedFrameCount, val$elapsedMs);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field VideoRendererEventListener$EventDispatcher this$0>
	//    2    4:invokestatic    #37  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field int val$droppedFrameCount>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field long val$elapsedMs>
	//    7   15:invokeinterface #40  <Method void VideoRendererEventListener.onDroppedFrames(int, long)>
	//    8   20:return          
	}

	final VideoRendererEventListener.EventDispatcher this$0;
	final int val$droppedFrameCount;
	final long val$elapsedMs;

	VideoRendererEventListener$EventDispatcher$4()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field VideoRendererEventListener$EventDispatcher this$0>
		val$droppedFrameCount = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #26  <Field int val$droppedFrameCount>
		val$elapsedMs = J.this;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #28  <Field long val$elapsedMs>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}

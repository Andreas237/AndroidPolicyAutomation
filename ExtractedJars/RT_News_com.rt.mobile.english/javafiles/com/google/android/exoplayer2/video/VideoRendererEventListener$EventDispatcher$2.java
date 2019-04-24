// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;


// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoRendererEventListener

class VideoRendererEventListener$EventDispatcher$2
	implements Runnable
{

	public void run()
	{
		VideoRendererEventListener.EventDispatcher.access$000(VideoRendererEventListener.EventDispatcher.this).onVideoDecoderInitialized(val$decoderName, val$initializedTimestampMs, val$initializationDurationMs);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field VideoRendererEventListener$EventDispatcher this$0>
	//    2    4:invokestatic    #40  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String val$decoderName>
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field long val$initializedTimestampMs>
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field long val$initializationDurationMs>
	//    9   19:invokeinterface #43  <Method void VideoRendererEventListener.onVideoDecoderInitialized(String, long, long)>
	//   10   24:return          
	}

	final VideoRendererEventListener.EventDispatcher this$0;
	final String val$decoderName;
	final long val$initializationDurationMs;
	final long val$initializedTimestampMs;

	VideoRendererEventListener$EventDispatcher$2()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field VideoRendererEventListener$EventDispatcher this$0>
		val$decoderName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field String val$decoderName>
		val$initializedTimestampMs = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #29  <Field long val$initializedTimestampMs>
		val$initializationDurationMs = J.this;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #31  <Field long val$initializationDurationMs>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #34  <Method void Object()>
	//   14   25:return          
	}
}

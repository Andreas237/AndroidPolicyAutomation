// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;

// Referenced classes of package com.google.android.exoplayer2.video:
//			VideoRendererEventListener

class VideoRendererEventListener$EventDispatcher$1
	implements Runnable
{

	public void run()
	{
		VideoRendererEventListener.EventDispatcher.access$000(VideoRendererEventListener.EventDispatcher.this).onVideoEnabled(val$decoderCounters);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
	//    2    4:invokestatic    #33  <Method VideoRendererEventListener VideoRendererEventListener$EventDispatcher.access$000(VideoRendererEventListener$EventDispatcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field DecoderCounters val$decoderCounters>
	//    5   11:invokeinterface #36  <Method void VideoRendererEventListener.onVideoEnabled(DecoderCounters)>
	//    6   16:return          
	}

	final VideoRendererEventListener.EventDispatcher this$0;
	final DecoderCounters val$decoderCounters;

	VideoRendererEventListener$EventDispatcher$1()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field VideoRendererEventListener$EventDispatcher this$0>
		val$decoderCounters = DecoderCounters.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field DecoderCounters val$decoderCounters>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
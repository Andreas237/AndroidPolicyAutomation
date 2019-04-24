// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

class MediaSourceEventListener$EventDispatcher$8
	implements Runnable
{

	public void run()
	{
		val$listener.onUpstreamDiscarded(windowIndex, mediaPeriodId, val$mediaLoadData);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaSourceEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    4    8:getfield        #37  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    7   15:getfield        #41  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
	//   10   22:invokeinterface #45  <Method void MediaSourceEventListener.onUpstreamDiscarded(int, MediaSource$MediaPeriodId, MediaSourceEventListener$MediaLoadData)>
	//   11   27:return          
	}

	final MediaSourceEventListener.EventDispatcher this$0;
	final MediaSourceEventListener val$listener;
	final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

	MediaSourceEventListener$EventDispatcher$8()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaSourceEventListener$EventDispatcher this$0>
		val$listener = mediasourceeventlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field MediaSourceEventListener val$listener>
		val$mediaLoadData = MediaSourceEventListener.MediaLoadData.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}

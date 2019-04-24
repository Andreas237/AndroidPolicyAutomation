// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

class MediaSourceEventListener$EventDispatcher$3
	implements Runnable
{

	public void run()
	{
		val$listener.onLoadStarted(windowIndex, mediaPeriodId, val$loadEventInfo, val$mediaLoadData);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaSourceEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    4    8:getfield        #41  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    7   15:getfield        #45  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
	//   10   22:aload_0         
	//   11   23:getfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
	//   12   26:invokeinterface #49  <Method void MediaSourceEventListener.onLoadStarted(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   13   31:return          
	}

	final MediaSourceEventListener.EventDispatcher this$0;
	final MediaSourceEventListener val$listener;
	final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
	final MediaSourceEventListener.MediaLoadData val$mediaLoadData;

	MediaSourceEventListener$EventDispatcher$3()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaSourceEventListener$EventDispatcher this$0>
		val$listener = mediasourceeventlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaSourceEventListener val$listener>
		val$loadEventInfo = loadeventinfo;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		val$mediaLoadData = MediaSourceEventListener.MediaLoadData.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}

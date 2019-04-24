// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;


// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

class MediaSourceEventListener$EventDispatcher$2
	implements Runnable
{

	public void run()
	{
		val$listener.onMediaPeriodReleased(windowIndex, mediaPeriodId);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field MediaSourceEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    4    8:getfield        #32  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    7   15:getfield        #36  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//    8   18:invokeinterface #40  <Method void MediaSourceEventListener.onMediaPeriodReleased(int, MediaSource$MediaPeriodId)>
	//    9   23:return          
	}

	final MediaSourceEventListener.EventDispatcher this$0;
	final MediaSourceEventListener val$listener;

	MediaSourceEventListener$EventDispatcher$2()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaSourceEventListener$EventDispatcher this$0>
		val$listener = MediaSourceEventListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field MediaSourceEventListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}

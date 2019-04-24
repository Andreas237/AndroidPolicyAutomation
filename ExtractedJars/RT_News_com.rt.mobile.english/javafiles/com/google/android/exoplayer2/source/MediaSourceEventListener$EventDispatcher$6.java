// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

class MediaSourceEventListener$EventDispatcher$6
	implements Runnable
{

	public void run()
	{
		val$listener.onLoadError(windowIndex, mediaPeriodId, val$loadEventInfo, val$mediaLoadData, val$error, val$wasCanceled);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field MediaSourceEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    4    8:getfield        #49  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
	//    7   15:getfield        #53  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
	//   12   26:aload_0         
	//   13   27:getfield        #38  <Field IOException val$error>
	//   14   30:aload_0         
	//   15   31:getfield        #40  <Field boolean val$wasCanceled>
	//   16   34:invokeinterface #57  <Method void MediaSourceEventListener.onLoadError(int, MediaSource$MediaPeriodId, MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData, IOException, boolean)>
	//   17   39:return          
	}

	final MediaSourceEventListener.EventDispatcher this$0;
	final IOException val$error;
	final MediaSourceEventListener val$listener;
	final MediaSourceEventListener.LoadEventInfo val$loadEventInfo;
	final MediaSourceEventListener.MediaLoadData val$mediaLoadData;
	final boolean val$wasCanceled;

	MediaSourceEventListener$EventDispatcher$6()
	{
		this$0 = final_eventdispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field MediaSourceEventListener$EventDispatcher this$0>
		val$listener = mediasourceeventlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field MediaSourceEventListener val$listener>
		val$loadEventInfo = loadeventinfo;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field MediaSourceEventListener$LoadEventInfo val$loadEventInfo>
		val$mediaLoadData = medialoaddata;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #36  <Field MediaSourceEventListener$MediaLoadData val$mediaLoadData>
		val$error = ioexception;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #38  <Field IOException val$error>
		val$wasCanceled = Z.this;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #40  <Field boolean val$wasCanceled>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #43  <Method void Object()>
	//   20   37:return          
	}
}

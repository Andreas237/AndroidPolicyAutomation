// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			DefaultMediaSourceEventListener, SingleSampleMediaSource

private static final class SingleSampleMediaSource$EventListenerWrapper extends DefaultMediaSourceEventListener
{

	public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
		eventListener.onLoadError(eventSourceId, ioexception);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SingleSampleMediaSource$EventListener eventListener>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field int eventSourceId>
	//    4    8:aload           5
	//    5   10:invokeinterface #35  <Method void SingleSampleMediaSource$EventListener.onLoadError(int, IOException)>
	//    6   15:return          
	}

	private final SingleSampleMediaSource.EventListener eventListener;
	private final int eventSourceId;

	public SingleSampleMediaSource$EventListenerWrapper(SingleSampleMediaSource.EventListener eventlistener, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void DefaultMediaSourceEventListener()>
		eventListener = (SingleSampleMediaSource.EventListener)Assertions.checkNotNull(((Object) (eventlistener)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #24  <Class SingleSampleMediaSource$EventListener>
	//    6   12:putfield        #26  <Field SingleSampleMediaSource$EventListener eventListener>
		eventSourceId = i;
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:putfield        #28  <Field int eventSourceId>
	//   10   20:return          
	}
}

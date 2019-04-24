// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			DefaultMediaSourceEventListener, ExtractorMediaSource

private static final class ExtractorMediaSource$EventListenerWrapper extends DefaultMediaSourceEventListener
{

	public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
		eventListener.onLoadError(ioexception);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ExtractorMediaSource$EventListener eventListener>
	//    2    4:aload           5
	//    3    6:invokeinterface #31  <Method void ExtractorMediaSource$EventListener.onLoadError(IOException)>
	//    4   11:return          
	}

	private final ExtractorMediaSource.EventListener eventListener;

	public ExtractorMediaSource$EventListenerWrapper(ExtractorMediaSource.EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DefaultMediaSourceEventListener()>
		eventListener = (ExtractorMediaSource.EventListener)Assertions.checkNotNull(((Object) (eventlistener)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #22  <Class ExtractorMediaSource$EventListener>
	//    6   12:putfield        #24  <Field ExtractorMediaSource$EventListener eventListener>
	//    7   15:return          
	}
}

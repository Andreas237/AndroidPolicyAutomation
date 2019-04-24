// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener

public abstract class DefaultMediaSourceEventListener
	implements MediaSourceEventListener
{

	public DefaultMediaSourceEventListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
	//    0    0:return          
	}

	public void onLoadStarted(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
	//    0    0:return          
	}

	public void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
	//    0    0:return          
	}

	public void onReadingStarted(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
	//    0    0:return          
	}

	public void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}
}

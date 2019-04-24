// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.TrackGroupArray;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			TrackSelectorResult

public abstract class TrackSelector
{
	public static interface InvalidationListener
	{

		public abstract void onTrackSelectionsInvalidated();
	}


	public TrackSelector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public final void init(InvalidationListener invalidationlistener)
	{
		listener = invalidationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TrackSelector$InvalidationListener listener>
	//    3    5:return          
	}

	protected final void invalidate()
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field TrackSelector$InvalidationListener listener>
	//*   2    4:ifnull          16
			listener.onTrackSelectionsInvalidated();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field TrackSelector$InvalidationListener listener>
	//    5   11:invokeinterface #23  <Method void TrackSelector$InvalidationListener.onTrackSelectionsInvalidated()>
	//    6   16:return          
	}

	public abstract void onSelectionActivated(Object obj);

	public abstract TrackSelectorResult selectTracks(RendererCapabilities arenderercapabilities[], TrackGroupArray trackgrouparray)
		throws ExoPlaybackException;

	private InvalidationListener listener;
}

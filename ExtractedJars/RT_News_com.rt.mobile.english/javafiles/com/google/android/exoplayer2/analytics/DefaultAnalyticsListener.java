// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsListener

public abstract class DefaultAnalyticsListener
	implements AnalyticsListener
{

	public DefaultAnalyticsListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void onAudioSessionId(AnalyticsListener.EventTime eventtime, int i)
	{
	//    0    0:return          
	}

	public void onAudioUnderrun(AnalyticsListener.EventTime eventtime, int i, long l, long l1)
	{
	//    0    0:return          
	}

	public void onBandwidthEstimate(AnalyticsListener.EventTime eventtime, int i, long l, long l1)
	{
	//    0    0:return          
	}

	public void onDecoderDisabled(AnalyticsListener.EventTime eventtime, int i, DecoderCounters decodercounters)
	{
	//    0    0:return          
	}

	public void onDecoderEnabled(AnalyticsListener.EventTime eventtime, int i, DecoderCounters decodercounters)
	{
	//    0    0:return          
	}

	public void onDecoderInitialized(AnalyticsListener.EventTime eventtime, int i, String s, long l)
	{
	//    0    0:return          
	}

	public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventtime, int i, Format format)
	{
	//    0    0:return          
	}

	public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onDrmKeysLoaded(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onDrmKeysRemoved(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onDrmKeysRestored(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onDrmSessionManagerError(AnalyticsListener.EventTime eventtime, Exception exception)
	{
	//    0    0:return          
	}

	public void onDroppedVideoFrames(AnalyticsListener.EventTime eventtime, int i, long l)
	{
	//    0    0:return          
	}

	public void onLoadCanceled(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadError(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
	//    0    0:return          
	}

	public void onLoadStarted(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadingChanged(AnalyticsListener.EventTime eventtime, boolean flag)
	{
	//    0    0:return          
	}

	public void onMediaPeriodCreated(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onMediaPeriodReleased(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onMetadata(AnalyticsListener.EventTime eventtime, Metadata metadata)
	{
	//    0    0:return          
	}

	public void onNetworkTypeChanged(AnalyticsListener.EventTime eventtime, NetworkInfo networkinfo)
	{
	//    0    0:return          
	}

	public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventtime, PlaybackParameters playbackparameters)
	{
	//    0    0:return          
	}

	public void onPlayerError(AnalyticsListener.EventTime eventtime, ExoPlaybackException exoplaybackexception)
	{
	//    0    0:return          
	}

	public void onPlayerStateChanged(AnalyticsListener.EventTime eventtime, boolean flag, int i)
	{
	//    0    0:return          
	}

	public void onPositionDiscontinuity(AnalyticsListener.EventTime eventtime, int i)
	{
	//    0    0:return          
	}

	public void onReadingStarted(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onRenderedFirstFrame(AnalyticsListener.EventTime eventtime, Surface surface)
	{
	//    0    0:return          
	}

	public void onRepeatModeChanged(AnalyticsListener.EventTime eventtime, int i)
	{
	//    0    0:return          
	}

	public void onSeekProcessed(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onSeekStarted(AnalyticsListener.EventTime eventtime)
	{
	//    0    0:return          
	}

	public void onShuffleModeChanged(AnalyticsListener.EventTime eventtime, boolean flag)
	{
	//    0    0:return          
	}

	public void onTimelineChanged(AnalyticsListener.EventTime eventtime, int i)
	{
	//    0    0:return          
	}

	public void onTracksChanged(AnalyticsListener.EventTime eventtime, TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
	{
	//    0    0:return          
	}

	public void onUpstreamDiscarded(AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onVideoSizeChanged(AnalyticsListener.EventTime eventtime, int i, int j, int k, float f)
	{
	//    0    0:return          
	}

	public void onViewportSizeChange(AnalyticsListener.EventTime eventtime, int i, int j)
	{
	//    0    0:return          
	}
}

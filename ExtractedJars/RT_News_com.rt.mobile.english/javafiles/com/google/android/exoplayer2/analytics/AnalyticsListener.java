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

public interface AnalyticsListener
{
	public static final class EventTime
	{

		public final long currentPlaybackPositionMs;
		public final long eventPlaybackPositionMs;
		public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
		public final long realtimeMs;
		public final Timeline timeline;
		public final long totalBufferedDurationMs;
		public final int windowIndex;

		public EventTime(long l, Timeline timeline1, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l1, 
				long l2, long l3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			realtimeMs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #26  <Field long realtimeMs>
			timeline = timeline1;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #28  <Field Timeline timeline>
			windowIndex = i;
		//    8   14:aload_0         
		//    9   15:iload           4
		//   10   17:putfield        #30  <Field int windowIndex>
			mediaPeriodId = mediaperiodid;
		//   11   20:aload_0         
		//   12   21:aload           5
		//   13   23:putfield        #32  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
			eventPlaybackPositionMs = l1;
		//   14   26:aload_0         
		//   15   27:lload           6
		//   16   29:putfield        #34  <Field long eventPlaybackPositionMs>
			currentPlaybackPositionMs = l2;
		//   17   32:aload_0         
		//   18   33:lload           8
		//   19   35:putfield        #36  <Field long currentPlaybackPositionMs>
			totalBufferedDurationMs = l3;
		//   20   38:aload_0         
		//   21   39:lload           10
		//   22   41:putfield        #38  <Field long totalBufferedDurationMs>
		//   23   44:return          
		}
	}


	public abstract void onAudioSessionId(EventTime eventtime, int i);

	public abstract void onAudioUnderrun(EventTime eventtime, int i, long l, long l1);

	public abstract void onBandwidthEstimate(EventTime eventtime, int i, long l, long l1);

	public abstract void onDecoderDisabled(EventTime eventtime, int i, DecoderCounters decodercounters);

	public abstract void onDecoderEnabled(EventTime eventtime, int i, DecoderCounters decodercounters);

	public abstract void onDecoderInitialized(EventTime eventtime, int i, String s, long l);

	public abstract void onDecoderInputFormatChanged(EventTime eventtime, int i, Format format);

	public abstract void onDownstreamFormatChanged(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata);

	public abstract void onDrmKeysLoaded(EventTime eventtime);

	public abstract void onDrmKeysRemoved(EventTime eventtime);

	public abstract void onDrmKeysRestored(EventTime eventtime);

	public abstract void onDrmSessionManagerError(EventTime eventtime, Exception exception);

	public abstract void onDroppedVideoFrames(EventTime eventtime, int i, long l);

	public abstract void onLoadCanceled(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata);

	public abstract void onLoadCompleted(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata);

	public abstract void onLoadError(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag);

	public abstract void onLoadStarted(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata);

	public abstract void onLoadingChanged(EventTime eventtime, boolean flag);

	public abstract void onMediaPeriodCreated(EventTime eventtime);

	public abstract void onMediaPeriodReleased(EventTime eventtime);

	public abstract void onMetadata(EventTime eventtime, Metadata metadata);

	public abstract void onNetworkTypeChanged(EventTime eventtime, NetworkInfo networkinfo);

	public abstract void onPlaybackParametersChanged(EventTime eventtime, PlaybackParameters playbackparameters);

	public abstract void onPlayerError(EventTime eventtime, ExoPlaybackException exoplaybackexception);

	public abstract void onPlayerStateChanged(EventTime eventtime, boolean flag, int i);

	public abstract void onPositionDiscontinuity(EventTime eventtime, int i);

	public abstract void onReadingStarted(EventTime eventtime);

	public abstract void onRenderedFirstFrame(EventTime eventtime, Surface surface);

	public abstract void onRepeatModeChanged(EventTime eventtime, int i);

	public abstract void onSeekProcessed(EventTime eventtime);

	public abstract void onSeekStarted(EventTime eventtime);

	public abstract void onShuffleModeChanged(EventTime eventtime, boolean flag);

	public abstract void onTimelineChanged(EventTime eventtime, int i);

	public abstract void onTracksChanged(EventTime eventtime, TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray);

	public abstract void onUpstreamDiscarded(EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata);

	public abstract void onVideoSizeChanged(EventTime eventtime, int i, int j, int k, float f);

	public abstract void onViewportSizeChange(EventTime eventtime, int i, int j);
}

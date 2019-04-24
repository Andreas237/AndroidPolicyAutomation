// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.view.*;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoListener;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2:
//			Timeline, ExoPlaybackException, PlaybackParameters

public interface Player
{
	public static abstract class DefaultEventListener
		implements EventListener
	{

		public void onLoadingChanged(boolean flag)
		{
		//    0    0:return          
		}

		public void onPlaybackParametersChanged(PlaybackParameters playbackparameters)
		{
		//    0    0:return          
		}

		public void onPlayerError(ExoPlaybackException exoplaybackexception)
		{
		//    0    0:return          
		}

		public void onPlayerStateChanged(boolean flag, int i)
		{
		//    0    0:return          
		}

		public void onPositionDiscontinuity(int i)
		{
		//    0    0:return          
		}

		public void onRepeatModeChanged(int i)
		{
		//    0    0:return          
		}

		public void onSeekProcessed()
		{
		//    0    0:return          
		}

		public void onShuffleModeEnabledChanged(boolean flag)
		{
		//    0    0:return          
		}

		public void onTimelineChanged(Timeline timeline, Object obj)
		{
		//    0    0:return          
		}

		public void onTimelineChanged(Timeline timeline, Object obj, int i)
		{
			onTimelineChanged(timeline, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #36  <Method void onTimelineChanged(Timeline, Object)>
		//    4    6:return          
		}

		public void onTracksChanged(TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
		{
		//    0    0:return          
		}

		public DefaultEventListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface DiscontinuityReason
		extends Annotation
	{
	}

	public static interface EventListener
	{

		public abstract void onLoadingChanged(boolean flag);

		public abstract void onPlaybackParametersChanged(PlaybackParameters playbackparameters);

		public abstract void onPlayerError(ExoPlaybackException exoplaybackexception);

		public abstract void onPlayerStateChanged(boolean flag, int i);

		public abstract void onPositionDiscontinuity(int i);

		public abstract void onRepeatModeChanged(int i);

		public abstract void onSeekProcessed();

		public abstract void onShuffleModeEnabledChanged(boolean flag);

		public abstract void onTimelineChanged(Timeline timeline, Object obj, int i);

		public abstract void onTracksChanged(TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray);
	}

	public static interface RepeatMode
		extends Annotation
	{
	}

	public static interface TextComponent
	{

		public abstract void addTextOutput(TextOutput textoutput);

		public abstract void removeTextOutput(TextOutput textoutput);
	}

	public static interface TimelineChangeReason
		extends Annotation
	{
	}

	public static interface VideoComponent
	{

		public abstract void addVideoListener(VideoListener videolistener);

		public abstract void clearVideoSurface();

		public abstract void clearVideoSurface(Surface surface);

		public abstract void clearVideoSurfaceHolder(SurfaceHolder surfaceholder);

		public abstract void clearVideoSurfaceView(SurfaceView surfaceview);

		public abstract void clearVideoTextureView(TextureView textureview);

		public abstract int getVideoScalingMode();

		public abstract void removeVideoListener(VideoListener videolistener);

		public abstract void setVideoScalingMode(int i);

		public abstract void setVideoSurface(Surface surface);

		public abstract void setVideoSurfaceHolder(SurfaceHolder surfaceholder);

		public abstract void setVideoSurfaceView(SurfaceView surfaceview);

		public abstract void setVideoTextureView(TextureView textureview);
	}


	public abstract void addListener(EventListener eventlistener);

	public abstract int getBufferedPercentage();

	public abstract long getBufferedPosition();

	public abstract long getContentPosition();

	public abstract int getCurrentAdGroupIndex();

	public abstract int getCurrentAdIndexInAdGroup();

	public abstract Object getCurrentManifest();

	public abstract int getCurrentPeriodIndex();

	public abstract long getCurrentPosition();

	public abstract Object getCurrentTag();

	public abstract Timeline getCurrentTimeline();

	public abstract TrackGroupArray getCurrentTrackGroups();

	public abstract TrackSelectionArray getCurrentTrackSelections();

	public abstract int getCurrentWindowIndex();

	public abstract long getDuration();

	public abstract int getNextWindowIndex();

	public abstract boolean getPlayWhenReady();

	public abstract ExoPlaybackException getPlaybackError();

	public abstract PlaybackParameters getPlaybackParameters();

	public abstract int getPlaybackState();

	public abstract int getPreviousWindowIndex();

	public abstract int getRendererCount();

	public abstract int getRendererType(int i);

	public abstract int getRepeatMode();

	public abstract boolean getShuffleModeEnabled();

	public abstract TextComponent getTextComponent();

	public abstract VideoComponent getVideoComponent();

	public abstract boolean isCurrentWindowDynamic();

	public abstract boolean isCurrentWindowSeekable();

	public abstract boolean isLoading();

	public abstract boolean isPlayingAd();

	public abstract void release();

	public abstract void removeListener(EventListener eventlistener);

	public abstract void seekTo(int i, long l);

	public abstract void seekTo(long l);

	public abstract void seekToDefaultPosition();

	public abstract void seekToDefaultPosition(int i);

	public abstract void setPlayWhenReady(boolean flag);

	public abstract void setPlaybackParameters(PlaybackParameters playbackparameters);

	public abstract void setRepeatMode(int i);

	public abstract void setShuffleModeEnabled(boolean flag);

	public abstract void stop();

	public abstract void stop(boolean flag);

	public static final int DISCONTINUITY_REASON_AD_INSERTION = 3;
	public static final int DISCONTINUITY_REASON_INTERNAL = 4;
	public static final int DISCONTINUITY_REASON_PERIOD_TRANSITION = 0;
	public static final int DISCONTINUITY_REASON_SEEK = 1;
	public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
	public static final int REPEAT_MODE_ALL = 2;
	public static final int REPEAT_MODE_OFF = 0;
	public static final int REPEAT_MODE_ONE = 1;
	public static final int STATE_BUFFERING = 2;
	public static final int STATE_ENDED = 4;
	public static final int STATE_IDLE = 1;
	public static final int STATE_READY = 3;
	public static final int TIMELINE_CHANGE_REASON_DYNAMIC = 2;
	public static final int TIMELINE_CHANGE_REASON_PREPARED = 0;
	public static final int TIMELINE_CHANGE_REASON_RESET = 1;
}

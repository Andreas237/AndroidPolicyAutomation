// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;

// Referenced classes of package com.google.android.exoplayer2:
//			Player, PlaybackParameters, ExoPlaybackException, Timeline

public static interface Player$EventListener
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

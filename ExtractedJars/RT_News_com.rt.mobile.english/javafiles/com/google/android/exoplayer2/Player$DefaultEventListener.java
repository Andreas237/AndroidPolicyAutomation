// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;

// Referenced classes of package com.google.android.exoplayer2:
//			Player, PlaybackParameters, ExoPlaybackException, Timeline

public static abstract class Player$DefaultEventListener
	implements Player.EventListener
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

	public Player$DefaultEventListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}

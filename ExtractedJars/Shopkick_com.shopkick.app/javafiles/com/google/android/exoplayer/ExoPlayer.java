// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer:
//			MediaFormat, TrackRenderer, ExoPlaybackException, ExoPlayerImpl

public interface ExoPlayer
{
	public static interface ExoPlayerComponent
	{

		public abstract void handleMessage(int i, Object obj)
			throws ExoPlaybackException;
	}

	public static final class Factory
	{

		public static ExoPlayer newInstance(int i)
		{
			return ((ExoPlayer) (new ExoPlayerImpl(i, 2500, 5000)));
		//    0    0:new             #21  <Class ExoPlayerImpl>
		//    1    3:dup             
		//    2    4:iload_0         
		//    3    5:sipush          2500
		//    4    8:sipush          5000
		//    5   11:invokespecial   #24  <Method void ExoPlayerImpl(int, int, int)>
		//    6   14:areturn         
		}

		public static ExoPlayer newInstance(int i, int j, int k)
		{
			return ((ExoPlayer) (new ExoPlayerImpl(i, j, k)));
		//    0    0:new             #21  <Class ExoPlayerImpl>
		//    1    3:dup             
		//    2    4:iload_0         
		//    3    5:iload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #24  <Method void ExoPlayerImpl(int, int, int)>
		//    6   10:areturn         
		}

		public static final int DEFAULT_MIN_BUFFER_MS = 2500;
		public static final int DEFAULT_MIN_REBUFFER_MS = 5000;

		private Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface Listener
	{

		public abstract void onPlayWhenReadyCommitted();

		public abstract void onPlayerError(ExoPlaybackException exoplaybackexception);

		public abstract void onPlayerStateChanged(boolean flag, int i);
	}


	public abstract void addListener(Listener listener);

	public abstract void blockingSendMessage(ExoPlayerComponent exoplayercomponent, int i, Object obj);

	public abstract int getBufferedPercentage();

	public abstract long getBufferedPosition();

	public abstract long getCurrentPosition();

	public abstract long getDuration();

	public abstract boolean getPlayWhenReady();

	public abstract Looper getPlaybackLooper();

	public abstract int getPlaybackState();

	public abstract int getSelectedTrack(int i);

	public abstract int getTrackCount(int i);

	public abstract MediaFormat getTrackFormat(int i, int j);

	public abstract boolean isPlayWhenReadyCommitted();

	public transient abstract void prepare(TrackRenderer atrackrenderer[]);

	public abstract void release();

	public abstract void removeListener(Listener listener);

	public abstract void seekTo(long l);

	public abstract void sendMessage(ExoPlayerComponent exoplayercomponent, int i, Object obj);

	public abstract void setPlayWhenReady(boolean flag);

	public abstract void setSelectedTrack(int i, int j);

	public abstract void stop();

	public static final int STATE_BUFFERING = 3;
	public static final int STATE_ENDED = 5;
	public static final int STATE_IDLE = 1;
	public static final int STATE_PREPARING = 2;
	public static final int STATE_READY = 4;
	public static final int TRACK_DEFAULT = 0;
	public static final int TRACK_DISABLED = -1;
	public static final long UNKNOWN_TIME = -1L;
}

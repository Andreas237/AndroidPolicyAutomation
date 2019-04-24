// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsMasterPlaylist, HlsMediaPlaylist

public interface HlsPlaylistTracker
{
	public static interface PlaylistEventListener
	{

		public abstract void onPlaylistChanged();

		public abstract boolean onPlaylistError(HlsMasterPlaylist.HlsUrl hlsurl, boolean flag);
	}

	public static final class PlaylistResetException extends IOException
	{

		public final String url;

		public PlaylistResetException(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void IOException()>
			url = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field String url>
		//    5    9:return          
		}
	}

	public static final class PlaylistStuckException extends IOException
	{

		public final String url;

		public PlaylistStuckException(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void IOException()>
			url = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field String url>
		//    5    9:return          
		}
	}

	public static interface PrimaryPlaylistListener
	{

		public abstract void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsmediaplaylist);
	}


	public abstract void addListener(PlaylistEventListener playlisteventlistener);

	public abstract long getInitialStartTimeUs();

	public abstract HlsMasterPlaylist getMasterPlaylist();

	public abstract HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl hlsurl);

	public abstract boolean isLive();

	public abstract boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl hlsurl);

	public abstract void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl hlsurl)
		throws IOException;

	public abstract void maybeThrowPrimaryPlaylistRefreshError()
		throws IOException;

	public abstract void refreshPlaylist(HlsMasterPlaylist.HlsUrl hlsurl);

	public abstract void removeListener(PlaylistEventListener playlisteventlistener);

	public abstract void start(Uri uri, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher, PrimaryPlaylistListener primaryplaylistlistener);

	public abstract void stop();
}

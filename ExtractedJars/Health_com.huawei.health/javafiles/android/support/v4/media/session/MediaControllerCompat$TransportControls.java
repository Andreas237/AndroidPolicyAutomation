// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

public static abstract class MediaControllerCompat$TransportControls
{

	public abstract void fastForward();

	public abstract void pause();

	public abstract void play();

	public abstract void playFromMediaId(String s, Bundle bundle);

	public abstract void playFromSearch(String s, Bundle bundle);

	public abstract void playFromUri(Uri uri, Bundle bundle);

	public abstract void prepare();

	public abstract void prepareFromMediaId(String s, Bundle bundle);

	public abstract void prepareFromSearch(String s, Bundle bundle);

	public abstract void prepareFromUri(Uri uri, Bundle bundle);

	public abstract void rewind();

	public abstract void seekTo(long l);

	public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle);

	public abstract void sendCustomAction(String s, Bundle bundle);

	public abstract void setRating(RatingCompat ratingcompat);

	public abstract void setRepeatMode(int i);

	public abstract void setShuffleModeEnabled(boolean flag);

	public abstract void skipToNext();

	public abstract void skipToPrevious();

	public abstract void skipToQueueItem(long l);

	public abstract void stop();

	MediaControllerCompat$TransportControls()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}

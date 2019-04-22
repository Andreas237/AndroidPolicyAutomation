// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

class MediaSessionCompatApi21
{
	static interface Callback
	{

		public abstract void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

		public abstract void onCustomAction(String s, Bundle bundle);

		public abstract void onFastForward();

		public abstract boolean onMediaButtonEvent(Intent intent);

		public abstract void onPause();

		public abstract void onPlay();

		public abstract void onPlayFromMediaId(String s, Bundle bundle);

		public abstract void onPlayFromSearch(String s, Bundle bundle);

		public abstract void onRewind();

		public abstract void onSeekTo(long l);

		public abstract void onSetRating(Object obj);

		public abstract void onSetRating(Object obj, Bundle bundle);

		public abstract void onSkipToNext();

		public abstract void onSkipToPrevious();

		public abstract void onSkipToQueueItem(long l);

		public abstract void onStop();
	}

	static class QueueItem
	{

		public static Object getDescription(Object obj)
		{
			return ((Object) (((android.media.session.MediaSession.QueueItem)obj).getDescription()));
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaSession$QueueItem>
		//    2    4:invokevirtual   #14  <Method android.media.MediaDescription android.media.session.MediaSession$QueueItem.getDescription()>
		//    3    7:areturn         
		}

		public static long getQueueId(Object obj)
		{
			return ((android.media.session.MediaSession.QueueItem)obj).getQueueId();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaSession$QueueItem>
		//    2    4:invokevirtual   #20  <Method long android.media.session.MediaSession$QueueItem.getQueueId()>
		//    3    7:lreturn         
		}
	}

}

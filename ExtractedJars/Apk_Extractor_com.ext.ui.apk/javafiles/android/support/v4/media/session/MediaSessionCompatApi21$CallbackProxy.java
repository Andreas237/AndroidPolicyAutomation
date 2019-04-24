// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.os.ResultReceiver;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi21

static class MediaSessionCompatApi21$CallbackProxy extends android.media.session.MediaSession.Callback
{

	public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		mCallback.onCommand(s, bundle, resultreceiver);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #27  <Method void MediaSessionCompatApi21$Callback.onCommand(String, Bundle, ResultReceiver)>
	//    6   12:return          
	}

	public void onCustomAction(String s, Bundle bundle)
	{
		mCallback.onCustomAction(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #31  <Method void MediaSessionCompatApi21$Callback.onCustomAction(String, Bundle)>
	//    5   11:return          
	}

	public void onFastForward()
	{
		mCallback.onFastForward();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #34  <Method void MediaSessionCompatApi21$Callback.onFastForward()>
	//    3    9:return          
	}

	public boolean onMediaButtonEvent(Intent intent)
	{
		return mCallback.onMediaButtonEvent(intent) || super.onMediaButtonEvent(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method boolean MediaSessionCompatApi21$Callback.onMediaButtonEvent(Intent)>
	//    4   10:ifne            21
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #39  <Method boolean android.media.session.MediaSession$Callback.onMediaButtonEvent(Intent)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public void onPause()
	{
		mCallback.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #42  <Method void MediaSessionCompatApi21$Callback.onPause()>
	//    3    9:return          
	}

	public void onPlay()
	{
		mCallback.onPlay();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #45  <Method void MediaSessionCompatApi21$Callback.onPlay()>
	//    3    9:return          
	}

	public void onPlayFromMediaId(String s, Bundle bundle)
	{
		mCallback.onPlayFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #48  <Method void MediaSessionCompatApi21$Callback.onPlayFromMediaId(String, Bundle)>
	//    5   11:return          
	}

	public void onPlayFromSearch(String s, Bundle bundle)
	{
		mCallback.onPlayFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #51  <Method void MediaSessionCompatApi21$Callback.onPlayFromSearch(String, Bundle)>
	//    5   11:return          
	}

	public void onRewind()
	{
		mCallback.onRewind();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #54  <Method void MediaSessionCompatApi21$Callback.onRewind()>
	//    3    9:return          
	}

	public void onSeekTo(long l)
	{
		mCallback.onSeekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:lload_1         
	//    3    5:invokeinterface #58  <Method void MediaSessionCompatApi21$Callback.onSeekTo(long)>
	//    4   10:return          
	}

	public void onSetRating(Rating rating)
	{
		mCallback.onSetRating(((Object) (rating)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #63  <Method void MediaSessionCompatApi21$Callback.onSetRating(Object)>
	//    4   10:return          
	}

	public void onSkipToNext()
	{
		mCallback.onSkipToNext();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #66  <Method void MediaSessionCompatApi21$Callback.onSkipToNext()>
	//    3    9:return          
	}

	public void onSkipToPrevious()
	{
		mCallback.onSkipToPrevious();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #69  <Method void MediaSessionCompatApi21$Callback.onSkipToPrevious()>
	//    3    9:return          
	}

	public void onSkipToQueueItem(long l)
	{
		mCallback.onSkipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:lload_1         
	//    3    5:invokeinterface #72  <Method void MediaSessionCompatApi21$Callback.onSkipToQueueItem(long)>
	//    4   10:return          
	}

	public void onStop()
	{
		mCallback.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #75  <Method void MediaSessionCompatApi21$Callback.onStop()>
	//    3    9:return          
	}

	protected final MediaSessionCompatApi21.Callback mCallback;

	public MediaSessionCompatApi21$CallbackProxy(MediaSessionCompatApi21.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.media.session.MediaSession$Callback()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    5    9:return          
	}
}

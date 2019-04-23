// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.os.ResultReceiver;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi21, MediaSessionCompat

static class MediaSessionCompatApi21$CallbackProxy extends android.media.session.MediaSession.Callback
{

	public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		mCallback.onCommand(s, bundle, resultreceiver);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #33  <Method void MediaSessionCompatApi21$Callback.onCommand(String, Bundle, ResultReceiver)>
	//    8   16:return          
	}

	public void onCustomAction(String s, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		mCallback.onCustomAction(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #37  <Method void MediaSessionCompatApi21$Callback.onCustomAction(String, Bundle)>
	//    7   15:return          
	}

	public void onFastForward()
	{
		mCallback.onFastForward();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #40  <Method void MediaSessionCompatApi21$Callback.onFastForward()>
	//    3    9:return          
	}

	public boolean onMediaButtonEvent(Intent intent)
	{
		return mCallback.onMediaButtonEvent(intent) || super.onMediaButtonEvent(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method boolean MediaSessionCompatApi21$Callback.onMediaButtonEvent(Intent)>
	//    4   10:ifne            26
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #45  <Method boolean android.media.session.MediaSession$Callback.onMediaButtonEvent(Intent)>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	public void onPause()
	{
		mCallback.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #48  <Method void MediaSessionCompatApi21$Callback.onPause()>
	//    3    9:return          
	}

	public void onPlay()
	{
		mCallback.onPlay();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #51  <Method void MediaSessionCompatApi21$Callback.onPlay()>
	//    3    9:return          
	}

	public void onPlayFromMediaId(String s, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		mCallback.onPlayFromMediaId(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #54  <Method void MediaSessionCompatApi21$Callback.onPlayFromMediaId(String, Bundle)>
	//    7   15:return          
	}

	public void onPlayFromSearch(String s, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		mCallback.onPlayFromSearch(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #57  <Method void MediaSessionCompatApi21$Callback.onPlayFromSearch(String, Bundle)>
	//    7   15:return          
	}

	public void onRewind()
	{
		mCallback.onRewind();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #60  <Method void MediaSessionCompatApi21$Callback.onRewind()>
	//    3    9:return          
	}

	public void onSeekTo(long l)
	{
		mCallback.onSeekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:lload_1         
	//    3    5:invokeinterface #64  <Method void MediaSessionCompatApi21$Callback.onSeekTo(long)>
	//    4   10:return          
	}

	public void onSetRating(Rating rating)
	{
		mCallback.onSetRating(((Object) (rating)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #69  <Method void MediaSessionCompatApi21$Callback.onSetRating(Object)>
	//    4   10:return          
	}

	public void onSkipToNext()
	{
		mCallback.onSkipToNext();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #72  <Method void MediaSessionCompatApi21$Callback.onSkipToNext()>
	//    3    9:return          
	}

	public void onSkipToPrevious()
	{
		mCallback.onSkipToPrevious();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #75  <Method void MediaSessionCompatApi21$Callback.onSkipToPrevious()>
	//    3    9:return          
	}

	public void onSkipToQueueItem(long l)
	{
		mCallback.onSkipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:lload_1         
	//    3    5:invokeinterface #78  <Method void MediaSessionCompatApi21$Callback.onSkipToQueueItem(long)>
	//    4   10:return          
	}

	public void onStop()
	{
		mCallback.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #81  <Method void MediaSessionCompatApi21$Callback.onStop()>
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

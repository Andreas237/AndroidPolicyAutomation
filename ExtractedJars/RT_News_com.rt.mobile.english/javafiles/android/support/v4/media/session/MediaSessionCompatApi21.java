// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.*;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.*;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.*;

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

	static class CallbackProxy extends android.media.session.MediaSession.Callback
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
		//    4   10:ifne            26
		//    5   13:aload_0         
		//    6   14:aload_1         
		//    7   15:invokespecial   #39  <Method boolean android.media.session.MediaSession$Callback.onMediaButtonEvent(Intent)>
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

		protected final Callback mCallback;

		public CallbackProxy(Callback callback)
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

	static class QueueItem
	{

		public static Object createItem(Object obj, long l)
		{
			return ((Object) (new android.media.session.MediaSession.QueueItem((MediaDescription)obj, l)));
		//    0    0:new             #16  <Class android.media.session.MediaSession$QueueItem>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:checkcast       #18  <Class MediaDescription>
		//    4    8:lload_1         
		//    5    9:invokespecial   #21  <Method void android.media.session.MediaSession$QueueItem(MediaDescription, long)>
		//    6   12:areturn         
		}

		public static Object getDescription(Object obj)
		{
			return ((Object) (((android.media.session.MediaSession.QueueItem)obj).getDescription()));
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaSession$QueueItem>
		//    2    4:invokevirtual   #26  <Method MediaDescription android.media.session.MediaSession$QueueItem.getDescription()>
		//    3    7:areturn         
		}

		public static long getQueueId(Object obj)
		{
			return ((android.media.session.MediaSession.QueueItem)obj).getQueueId();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaSession$QueueItem>
		//    2    4:invokevirtual   #31  <Method long android.media.session.MediaSession$QueueItem.getQueueId()>
		//    3    7:lreturn         
		}

		QueueItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaSessionCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaSessionCompatApi21$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void MediaSessionCompatApi21$CallbackProxy(MediaSessionCompatApi21$Callback)>
	//    4    8:areturn         
	}

	public static Object createSession(Context context, String s)
	{
		return ((Object) (new MediaSession(context, s)));
	//    0    0:new             #34  <Class MediaSession>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #37  <Method void MediaSession(Context, String)>
	//    5    9:areturn         
	}

	public static Parcelable getSessionToken(Object obj)
	{
		return ((Parcelable) (((MediaSession)obj).getSessionToken()));
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:invokevirtual   #42  <Method android.media.session.MediaSession$Token MediaSession.getSessionToken()>
	//    3    7:areturn         
	}

	public static boolean hasCallback(Object obj)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Field field = obj.getClass().getDeclaredField("mCallback");
	//    2    2:aload_0         
	//    3    3:invokevirtual   #52  <Method Class Object.getClass()>
	//    4    6:ldc1            #54  <String "mCallback">
	//    5    8:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//    6   11:astore_2        
		if(field == null) goto _L2; else goto _L1
	//    7   12:aload_2         
	//    8   13:ifnull          43
_L1:
		field.setAccessible(true);
	//    9   16:aload_2         
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #66  <Method void Field.setAccessible(boolean)>
		obj = field.get(obj);
	//   12   21:aload_2         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #70  <Method Object Field.get(Object)>
	//   15   26:astore_0        
		if(obj != null)
	//*  16   27:aload_0         
	//*  17   28:ifnull          33
			flag = true;
	//   18   31:iconst_1        
	//   19   32:istore_1        
		return flag;
	//   20   33:iload_1         
	//   21   34:ireturn         
_L4:
		Log.w("MediaSessionCompatApi21", "Failed to get mCallback object.");
	//   22   35:ldc1            #20  <String "MediaSessionCompatApi21">
	//   23   37:ldc1            #72  <String "Failed to get mCallback object.">
	//   24   39:invokestatic    #78  <Method int Log.w(String, String)>
	//   25   42:pop             
_L2:
		return false;
	//   26   43:iconst_0        
	//   27   44:ireturn         
		obj;
	//   28   45:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  29   46:goto            35
	}

	public static boolean isActive(Object obj)
	{
		return ((MediaSession)obj).isActive();
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:invokevirtual   #82  <Method boolean MediaSession.isActive()>
	//    3    7:ireturn         
	}

	public static void release(Object obj)
	{
		((MediaSession)obj).release();
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:invokevirtual   #86  <Method void MediaSession.release()>
	//    3    7:return          
	}

	public static void sendSessionEvent(Object obj, String s, Bundle bundle)
	{
		((MediaSession)obj).sendSessionEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #91  <Method void MediaSession.sendSessionEvent(String, Bundle)>
	//    5    9:return          
	}

	public static void setActive(Object obj, boolean flag)
	{
		((MediaSession)obj).setActive(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method void MediaSession.setActive(boolean)>
	//    4    8:return          
	}

	public static void setCallback(Object obj, Object obj1, Handler handler)
	{
		((MediaSession)obj).setCallback((android.media.session.MediaSession.Callback)obj1, handler);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:checkcast       #99  <Class android.media.session.MediaSession$Callback>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #102 <Method void MediaSession.setCallback(android.media.session.MediaSession$Callback, Handler)>
	//    6   12:return          
	}

	public static void setExtras(Object obj, Bundle bundle)
	{
		((MediaSession)obj).setExtras(bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method void MediaSession.setExtras(Bundle)>
	//    4    8:return          
	}

	public static void setFlags(Object obj, int i)
	{
		((MediaSession)obj).setFlags(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void MediaSession.setFlags(int)>
	//    4    8:return          
	}

	public static void setMediaButtonReceiver(Object obj, PendingIntent pendingintent)
	{
		((MediaSession)obj).setMediaButtonReceiver(pendingintent);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #117 <Method void MediaSession.setMediaButtonReceiver(PendingIntent)>
	//    4    8:return          
	}

	public static void setMetadata(Object obj, Object obj1)
	{
		((MediaSession)obj).setMetadata((MediaMetadata)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:checkcast       #121 <Class MediaMetadata>
	//    4    8:invokevirtual   #124 <Method void MediaSession.setMetadata(MediaMetadata)>
	//    5   11:return          
	}

	public static void setPlaybackState(Object obj, Object obj1)
	{
		((MediaSession)obj).setPlaybackState((PlaybackState)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:checkcast       #127 <Class PlaybackState>
	//    4    8:invokevirtual   #130 <Method void MediaSession.setPlaybackState(PlaybackState)>
	//    5   11:return          
	}

	public static void setPlaybackToLocal(Object obj, int i)
	{
		android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
	//    0    0:new             #133 <Class android.media.AudioAttributes$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void android.media.AudioAttributes$Builder()>
	//    3    7:astore_2        
		builder.setLegacyStreamType(i);
	//    4    8:aload_2         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #138 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setLegacyStreamType(int)>
	//    7   13:pop             
		((MediaSession)obj).setPlaybackToLocal(builder.build());
	//    8   14:aload_0         
	//    9   15:checkcast       #34  <Class MediaSession>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #142 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   12   22:invokevirtual   #145 <Method void MediaSession.setPlaybackToLocal(android.media.AudioAttributes)>
	//   13   25:return          
	}

	public static void setPlaybackToRemote(Object obj, Object obj1)
	{
		((MediaSession)obj).setPlaybackToRemote((VolumeProvider)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:checkcast       #148 <Class VolumeProvider>
	//    4    8:invokevirtual   #151 <Method void MediaSession.setPlaybackToRemote(VolumeProvider)>
	//    5   11:return          
	}

	public static void setQueue(Object obj, List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			((MediaSession)obj).setQueue(((List) (null)));
	//    2    4:aload_0         
	//    3    5:checkcast       #34  <Class MediaSession>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #156 <Method void MediaSession.setQueue(List)>
			return;
	//    6   12:return          
		}
		ArrayList arraylist = new ArrayList();
	//    7   13:new             #158 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #159 <Method void ArrayList()>
	//   10   20:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); arraylist.add(((Object) ((android.media.session.MediaSession.QueueItem)((Iterator) (list)).next()))));
	//   11   21:aload_1         
	//   12   22:invokeinterface #165 <Method Iterator List.iterator()>
	//   13   27:astore_1        
	//   14   28:aload_1         
	//   15   29:invokeinterface #170 <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            54
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokeinterface #174 <Method Object Iterator.next()>
	//   20   44:checkcast       #176 <Class android.media.session.MediaSession$QueueItem>
	//   21   47:invokevirtual   #179 <Method boolean ArrayList.add(Object)>
	//   22   50:pop             
	//*  23   51:goto            28
		((MediaSession)obj).setQueue(((List) (arraylist)));
	//   24   54:aload_0         
	//   25   55:checkcast       #34  <Class MediaSession>
	//   26   58:aload_2         
	//   27   59:invokevirtual   #156 <Method void MediaSession.setQueue(List)>
	//   28   62:return          
	}

	public static void setQueueTitle(Object obj, CharSequence charsequence)
	{
		((MediaSession)obj).setQueueTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method void MediaSession.setQueueTitle(CharSequence)>
	//    4    8:return          
	}

	public static void setSessionActivity(Object obj, PendingIntent pendingintent)
	{
		((MediaSession)obj).setSessionActivity(pendingintent);
	//    0    0:aload_0         
	//    1    1:checkcast       #34  <Class MediaSession>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #189 <Method void MediaSession.setSessionActivity(PendingIntent)>
	//    4    8:return          
	}

	public static Object verifySession(Object obj)
	{
		if(obj instanceof MediaSession)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #34  <Class MediaSession>
	//*   2    4:ifeq            9
			return obj;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
	//    5    9:new             #192 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #194 <String "mediaSession is not a valid MediaSession object">
	//    8   15:invokespecial   #197 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
	}

	public static Object verifyToken(Object obj)
	{
		if(obj instanceof android.media.session.MediaSession.Token)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #200 <Class android.media.session.MediaSession$Token>
	//*   2    4:ifeq            9
			return obj;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
	//    5    9:new             #192 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #202 <String "token is not a valid MediaSession.Token object">
	//    8   15:invokespecial   #197 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
	}

	static final String TAG = "MediaSessionCompatApi21";
}

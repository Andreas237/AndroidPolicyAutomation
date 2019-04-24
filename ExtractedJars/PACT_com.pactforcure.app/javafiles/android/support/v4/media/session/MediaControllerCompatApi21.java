// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.*;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.*;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

class MediaControllerCompatApi21
{
	public static interface Callback
	{

		public abstract void onAudioInfoChanged(int i, int j, int k, int l, int i1);

		public abstract void onExtrasChanged(Bundle bundle);

		public abstract void onMetadataChanged(Object obj);

		public abstract void onPlaybackStateChanged(Object obj);

		public abstract void onQueueChanged(List list);

		public abstract void onQueueTitleChanged(CharSequence charsequence);

		public abstract void onSessionDestroyed();

		public abstract void onSessionEvent(String s, Bundle bundle);
	}

	static class CallbackProxy extends android.media.session.MediaController.Callback
	{

		public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackinfo)
		{
			mCallback.onAudioInfoChanged(playbackinfo.getPlaybackType(), PlaybackInfo.getLegacyAudioStream(((Object) (playbackinfo))), playbackinfo.getVolumeControl(), playbackinfo.getMaxVolume(), playbackinfo.getCurrentVolume());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #29  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
		//    4    8:aload_1         
		//    5    9:invokestatic    #35  <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #38  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #41  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #44  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
		//   12   24:invokeinterface #49  <Method void MediaControllerCompatApi21$Callback.onAudioInfoChanged(int, int, int, int, int)>
		//   13   29:return          
		}

		public void onExtrasChanged(Bundle bundle)
		{
			mCallback.onExtrasChanged(bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #53  <Method void MediaControllerCompatApi21$Callback.onExtrasChanged(Bundle)>
		//    4   10:return          
		}

		public void onMetadataChanged(MediaMetadata mediametadata)
		{
			mCallback.onMetadataChanged(((Object) (mediametadata)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #58  <Method void MediaControllerCompatApi21$Callback.onMetadataChanged(Object)>
		//    4   10:return          
		}

		public void onPlaybackStateChanged(PlaybackState playbackstate)
		{
			mCallback.onPlaybackStateChanged(((Object) (playbackstate)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #62  <Method void MediaControllerCompatApi21$Callback.onPlaybackStateChanged(Object)>
		//    4   10:return          
		}

		public void onQueueChanged(List list)
		{
			mCallback.onQueueChanged(list);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #66  <Method void MediaControllerCompatApi21$Callback.onQueueChanged(List)>
		//    4   10:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
		{
			mCallback.onQueueTitleChanged(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #71  <Method void MediaControllerCompatApi21$Callback.onQueueTitleChanged(CharSequence)>
		//    4   10:return          
		}

		public void onSessionDestroyed()
		{
			mCallback.onSessionDestroyed();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:invokeinterface #74  <Method void MediaControllerCompatApi21$Callback.onSessionDestroyed()>
		//    3    9:return          
		}

		public void onSessionEvent(String s, Bundle bundle)
		{
			mCallback.onSessionEvent(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #78  <Method void MediaControllerCompatApi21$Callback.onSessionEvent(String, Bundle)>
		//    5   11:return          
		}

		protected final Callback mCallback;

		public CallbackProxy(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void android.media.session.MediaController$Callback()>
			mCallback = callback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
		//    5    9:return          
		}
	}

	public static class PlaybackInfo
	{

		public static AudioAttributes getAudioAttributes(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getAudioAttributes();
		//    0    0:aload_0         
		//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #26  <Method AudioAttributes android.media.session.MediaController$PlaybackInfo.getAudioAttributes()>
		//    3    7:areturn         
		}

		public static int getCurrentVolume(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getCurrentVolume();
		//    0    0:aload_0         
		//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #31  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
		//    3    7:ireturn         
		}

		public static int getLegacyAudioStream(Object obj)
		{
			return toLegacyStreamType(getAudioAttributes(obj));
		//    0    0:aload_0         
		//    1    1:invokestatic    #34  <Method AudioAttributes getAudioAttributes(Object)>
		//    2    4:invokestatic    #38  <Method int toLegacyStreamType(AudioAttributes)>
		//    3    7:ireturn         
		}

		public static int getMaxVolume(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getMaxVolume();
		//    0    0:aload_0         
		//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #41  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
		//    3    7:ireturn         
		}

		public static int getPlaybackType(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getPlaybackType();
		//    0    0:aload_0         
		//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #44  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
		//    3    7:ireturn         
		}

		public static int getVolumeControl(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getVolumeControl();
		//    0    0:aload_0         
		//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #47  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
		//    3    7:ireturn         
		}

		private static int toLegacyStreamType(AudioAttributes audioattributes)
		{
			byte byte0 = 3;
		//    0    0:iconst_3        
		//    1    1:istore_1        
			if((audioattributes.getFlags() & 1) != 1) goto _L2; else goto _L1
		//    2    2:aload_0         
		//    3    3:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
		//    4    6:iconst_1        
		//    5    7:iand            
		//    6    8:iconst_1        
		//    7    9:icmpne          17
_L1:
			byte0 = 7;
		//    8   12:bipush          7
		//    9   14:istore_1        
_L4:
			return ((int) (byte0));
		//   10   15:iload_1         
		//   11   16:ireturn         
_L2:
			if((audioattributes.getFlags() & 4) == 4)
		//*  12   17:aload_0         
		//*  13   18:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
		//*  14   21:iconst_4        
		//*  15   22:iand            
		//*  16   23:iconst_4        
		//*  17   24:icmpne          30
				return 6;
		//   18   27:bipush          6
		//   19   29:ireturn         
			switch(audioattributes.getUsage())
		//*  20   30:aload_0         
		//*  21   31:invokevirtual   #55  <Method int AudioAttributes.getUsage()>
			{
		//*  22   34:tableswitch     1 14: default 104
		//		               1 15
		//		               2 106
		//		               3 110
		//		               4 113
		//		               5 117
		//		               6 115
		//		               7 117
		//		               8 117
		//		               9 117
		//		               10 117
		//		               11 15
		//		               12 15
		//		               13 108
		//		               14 15
			default:
				return 3;
		//   23  104:iconst_3        
		//   24  105:ireturn         

			case 2: // '\002'
				return 0;
		//   25  106:iconst_0        
		//   26  107:ireturn         

			case 13: // '\r'
				return 1;
		//   27  108:iconst_1        
		//   28  109:ireturn         

			case 3: // '\003'
				return 8;
		//   29  110:bipush          8
		//   30  112:ireturn         

			case 4: // '\004'
				return 4;
		//   31  113:iconst_4        
		//   32  114:ireturn         

			case 6: // '\006'
				return 2;
		//   33  115:iconst_2        
		//   34  116:ireturn         

			case 5: // '\005'
			case 7: // '\007'
			case 8: // '\b'
			case 9: // '\t'
			case 10: // '\n'
				return 5;
		//   35  117:iconst_5        
		//   36  118:ireturn         

			case 1: // '\001'
			case 11: // '\013'
			case 12: // '\f'
			case 14: // '\016'
				break;
			}
			if(true) goto _L4; else goto _L3
_L3:
		}

		private static final int FLAG_SCO = 4;
		private static final int STREAM_BLUETOOTH_SCO = 6;
		private static final int STREAM_SYSTEM_ENFORCED = 7;

		public PlaybackInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class TransportControls
	{

		public static void fastForward(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).fastForward();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #18  <Method void android.media.session.MediaController$TransportControls.fastForward()>
		//    3    7:return          
		}

		public static void pause(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).pause();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #21  <Method void android.media.session.MediaController$TransportControls.pause()>
		//    3    7:return          
		}

		public static void play(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).play();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #24  <Method void android.media.session.MediaController$TransportControls.play()>
		//    3    7:return          
		}

		public static void playFromMediaId(Object obj, String s, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).playFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #29  <Method void android.media.session.MediaController$TransportControls.playFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public static void playFromSearch(Object obj, String s, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).playFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method void android.media.session.MediaController$TransportControls.playFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public static void rewind(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).rewind();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #35  <Method void android.media.session.MediaController$TransportControls.rewind()>
		//    3    7:return          
		}

		public static void seekTo(Object obj, long l)
		{
			((android.media.session.MediaController.TransportControls)obj).seekTo(l);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #40  <Method void android.media.session.MediaController$TransportControls.seekTo(long)>
		//    4    8:return          
		}

		public static void sendCustomAction(Object obj, String s, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).sendCustomAction(s, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #43  <Method void android.media.session.MediaController$TransportControls.sendCustomAction(String, Bundle)>
		//    5    9:return          
		}

		public static void setRating(Object obj, Object obj1)
		{
			((android.media.session.MediaController.TransportControls)obj).setRating((Rating)obj1);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:checkcast       #47  <Class Rating>
		//    4    8:invokevirtual   #50  <Method void android.media.session.MediaController$TransportControls.setRating(Rating)>
		//    5   11:return          
		}

		public static void skipToNext(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).skipToNext();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #53  <Method void android.media.session.MediaController$TransportControls.skipToNext()>
		//    3    7:return          
		}

		public static void skipToPrevious(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).skipToPrevious();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #56  <Method void android.media.session.MediaController$TransportControls.skipToPrevious()>
		//    3    7:return          
		}

		public static void skipToQueueItem(Object obj, long l)
		{
			((android.media.session.MediaController.TransportControls)obj).skipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #59  <Method void android.media.session.MediaController$TransportControls.skipToQueueItem(long)>
		//    4    8:return          
		}

		public static void stop(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).stop();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #62  <Method void android.media.session.MediaController$TransportControls.stop()>
		//    3    7:return          
		}

		public TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaControllerCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static void adjustVolume(Object obj, int i, int j)
	{
		((MediaController)obj).adjustVolume(i, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #31  <Method void MediaController.adjustVolume(int, int)>
	//    5    9:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaControllerCompatApi21$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void MediaControllerCompatApi21$CallbackProxy(MediaControllerCompatApi21$Callback)>
	//    4    8:areturn         
	}

	public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyevent)
	{
		return ((MediaController)obj).dispatchMediaButtonEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method boolean MediaController.dispatchMediaButtonEvent(KeyEvent)>
	//    4    8:ireturn         
	}

	public static Object fromToken(Context context, Object obj)
	{
		return ((Object) (new MediaController(context, (android.media.session.MediaSession.Token)obj)));
	//    0    0:new             #28  <Class MediaController>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:checkcast       #45  <Class android.media.session.MediaSession$Token>
	//    5    9:invokespecial   #48  <Method void MediaController(Context, android.media.session.MediaSession$Token)>
	//    6   12:areturn         
	}

	public static Bundle getExtras(Object obj)
	{
		return ((MediaController)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #53  <Method Bundle MediaController.getExtras()>
	//    3    7:areturn         
	}

	public static long getFlags(Object obj)
	{
		return ((MediaController)obj).getFlags();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #58  <Method long MediaController.getFlags()>
	//    3    7:lreturn         
	}

	public static Object getMediaController(Activity activity)
	{
		return ((Object) (activity.getMediaController()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method MediaController Activity.getMediaController()>
	//    2    4:areturn         
	}

	public static Object getMetadata(Object obj)
	{
		return ((Object) (((MediaController)obj).getMetadata()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #70  <Method MediaMetadata MediaController.getMetadata()>
	//    3    7:areturn         
	}

	public static String getPackageName(Object obj)
	{
		return ((MediaController)obj).getPackageName();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #75  <Method String MediaController.getPackageName()>
	//    3    7:areturn         
	}

	public static Object getPlaybackInfo(Object obj)
	{
		return ((Object) (((MediaController)obj).getPlaybackInfo()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #79  <Method android.media.session.MediaController$PlaybackInfo MediaController.getPlaybackInfo()>
	//    3    7:areturn         
	}

	public static Object getPlaybackState(Object obj)
	{
		return ((Object) (((MediaController)obj).getPlaybackState()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #83  <Method PlaybackState MediaController.getPlaybackState()>
	//    3    7:areturn         
	}

	public static List getQueue(Object obj)
	{
		obj = ((Object) (((MediaController)obj).getQueue()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #88  <Method List MediaController.getQueue()>
	//    3    7:astore_0        
		if(obj == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return ((List) (new ArrayList(((java.util.Collection) (obj)))));
	//    8   14:new             #90  <Class ArrayList>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #93  <Method void ArrayList(java.util.Collection)>
	//   12   22:areturn         
	}

	public static CharSequence getQueueTitle(Object obj)
	{
		return ((MediaController)obj).getQueueTitle();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #100 <Method CharSequence MediaController.getQueueTitle()>
	//    3    7:areturn         
	}

	public static int getRatingType(Object obj)
	{
		return ((MediaController)obj).getRatingType();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #105 <Method int MediaController.getRatingType()>
	//    3    7:ireturn         
	}

	public static PendingIntent getSessionActivity(Object obj)
	{
		return ((MediaController)obj).getSessionActivity();
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #110 <Method PendingIntent MediaController.getSessionActivity()>
	//    3    7:areturn         
	}

	public static Object getSessionToken(Object obj)
	{
		return ((Object) (((MediaController)obj).getSessionToken()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #114 <Method android.media.session.MediaSession$Token MediaController.getSessionToken()>
	//    3    7:areturn         
	}

	public static Object getTransportControls(Object obj)
	{
		return ((Object) (((MediaController)obj).getTransportControls()));
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:invokevirtual   #118 <Method android.media.session.MediaController$TransportControls MediaController.getTransportControls()>
	//    3    7:areturn         
	}

	public static void registerCallback(Object obj, Object obj1, Handler handler)
	{
		((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)obj1, handler);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:checkcast       #122 <Class android.media.session.MediaController$Callback>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #125 <Method void MediaController.registerCallback(android.media.session.MediaController$Callback, Handler)>
	//    6   12:return          
	}

	public static void sendCommand(Object obj, String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		((MediaController)obj).sendCommand(s, bundle, resultreceiver);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #130 <Method void MediaController.sendCommand(String, Bundle, ResultReceiver)>
	//    6   10:return          
	}

	public static void setMediaController(Activity activity, Object obj)
	{
		activity.setMediaController((MediaController)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class MediaController>
	//    3    5:invokevirtual   #135 <Method void Activity.setMediaController(MediaController)>
	//    4    8:return          
	}

	public static void setVolumeTo(Object obj, int i, int j)
	{
		((MediaController)obj).setVolumeTo(i, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #138 <Method void MediaController.setVolumeTo(int, int)>
	//    5    9:return          
	}

	public static void unregisterCallback(Object obj, Object obj1)
	{
		((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #28  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:checkcast       #122 <Class android.media.session.MediaController$Callback>
	//    4    8:invokevirtual   #143 <Method void MediaController.unregisterCallback(android.media.session.MediaController$Callback)>
	//    5   11:return          
	}
}

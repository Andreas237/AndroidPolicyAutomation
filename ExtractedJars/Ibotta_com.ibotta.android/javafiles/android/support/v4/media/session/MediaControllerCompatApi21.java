// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
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
		//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #14  <Method AudioAttributes android.media.session.MediaController$PlaybackInfo.getAudioAttributes()>
		//    3    7:areturn         
		}

		public static int getCurrentVolume(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getCurrentVolume();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #20  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
		//    3    7:ireturn         
		}

		public static int getLegacyAudioStream(Object obj)
		{
			return toLegacyStreamType(getAudioAttributes(obj));
		//    0    0:aload_0         
		//    1    1:invokestatic    #23  <Method AudioAttributes getAudioAttributes(Object)>
		//    2    4:invokestatic    #27  <Method int toLegacyStreamType(AudioAttributes)>
		//    3    7:ireturn         
		}

		public static int getMaxVolume(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getMaxVolume();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #30  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
		//    3    7:ireturn         
		}

		public static int getPlaybackType(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getPlaybackType();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #33  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
		//    3    7:ireturn         
		}

		public static int getVolumeControl(Object obj)
		{
			return ((android.media.session.MediaController.PlaybackInfo)obj).getVolumeControl();
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
		//    2    4:invokevirtual   #36  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
		//    3    7:ireturn         
		}

		private static int toLegacyStreamType(AudioAttributes audioattributes)
		{
			if((audioattributes.getFlags() & 1) == 1)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #41  <Method int AudioAttributes.getFlags()>
		//*   2    4:iconst_1        
		//*   3    5:iand            
		//*   4    6:iconst_1        
		//*   5    7:icmpne          13
				return 7;
		//    6   10:bipush          7
		//    7   12:ireturn         
			if((audioattributes.getFlags() & 4) == 4)
		//*   8   13:aload_0         
		//*   9   14:invokevirtual   #41  <Method int AudioAttributes.getFlags()>
		//*  10   17:iconst_4        
		//*  11   18:iand            
		//*  12   19:iconst_4        
		//*  13   20:icmpne          26
				return 6;
		//   14   23:bipush          6
		//   15   25:ireturn         
			switch(audioattributes.getUsage())
		//*  16   26:aload_0         
		//*  17   27:invokevirtual   #44  <Method int AudioAttributes.getUsage()>
			{
		//*  18   30:tableswitch     1 14: default 100
		//		               1 115
		//		               2 113
		//		               3 110
		//		               4 108
		//		               5 106
		//		               6 104
		//		               7 106
		//		               8 106
		//		               9 106
		//		               10 106
		//		               11 115
		//		               12 115
		//		               13 102
		//		               14 115
			default:
				return 3;
		//   19  100:iconst_3        
		//   20  101:ireturn         

			case 13: // '\r'
				return 1;
		//   21  102:iconst_1        
		//   22  103:ireturn         

			case 6: // '\006'
				return 2;
		//   23  104:iconst_2        
		//   24  105:ireturn         

			case 5: // '\005'
			case 7: // '\007'
			case 8: // '\b'
			case 9: // '\t'
			case 10: // '\n'
				return 5;
		//   25  106:iconst_5        
		//   26  107:ireturn         

			case 4: // '\004'
				return 4;
		//   27  108:iconst_4        
		//   28  109:ireturn         

			case 3: // '\003'
				return 8;
		//   29  110:bipush          8
		//   30  112:ireturn         

			case 2: // '\002'
				return 0;
		//   31  113:iconst_0        
		//   32  114:ireturn         

			case 1: // '\001'
			case 11: // '\013'
			case 12: // '\f'
			case 14: // '\016'
				return 3;
		//   33  115:iconst_3        
		//   34  116:ireturn         
			}
		}
	}


	public static void adjustVolume(Object obj, int i, int j)
	{
		((MediaController)obj).adjustVolume(i, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #23  <Method void MediaController.adjustVolume(int, int)>
	//    5    9:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaControllerCompatApi21$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void MediaControllerCompatApi21$CallbackProxy(MediaControllerCompatApi21$Callback)>
	//    4    8:areturn         
	}

	public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyevent)
	{
		return ((MediaController)obj).dispatchMediaButtonEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean MediaController.dispatchMediaButtonEvent(KeyEvent)>
	//    4    8:ireturn         
	}

	public static Bundle getExtras(Object obj)
	{
		return ((MediaController)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #40  <Method Bundle MediaController.getExtras()>
	//    3    7:areturn         
	}

	public static long getFlags(Object obj)
	{
		return ((MediaController)obj).getFlags();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #45  <Method long MediaController.getFlags()>
	//    3    7:lreturn         
	}

	public static Object getMetadata(Object obj)
	{
		return ((Object) (((MediaController)obj).getMetadata()));
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #50  <Method MediaMetadata MediaController.getMetadata()>
	//    3    7:areturn         
	}

	public static String getPackageName(Object obj)
	{
		return ((MediaController)obj).getPackageName();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #55  <Method String MediaController.getPackageName()>
	//    3    7:areturn         
	}

	public static Object getPlaybackInfo(Object obj)
	{
		return ((Object) (((MediaController)obj).getPlaybackInfo()));
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #59  <Method android.media.session.MediaController$PlaybackInfo MediaController.getPlaybackInfo()>
	//    3    7:areturn         
	}

	public static Object getPlaybackState(Object obj)
	{
		return ((Object) (((MediaController)obj).getPlaybackState()));
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #63  <Method PlaybackState MediaController.getPlaybackState()>
	//    3    7:areturn         
	}

	public static List getQueue(Object obj)
	{
		obj = ((Object) (((MediaController)obj).getQueue()));
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #68  <Method List MediaController.getQueue()>
	//    3    7:astore_0        
		if(obj == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return ((List) (new ArrayList(((java.util.Collection) (obj)))));
	//    8   14:new             #70  <Class ArrayList>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #73  <Method void ArrayList(java.util.Collection)>
	//   12   22:areturn         
	}

	public static CharSequence getQueueTitle(Object obj)
	{
		return ((MediaController)obj).getQueueTitle();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #80  <Method CharSequence MediaController.getQueueTitle()>
	//    3    7:areturn         
	}

	public static int getRatingType(Object obj)
	{
		return ((MediaController)obj).getRatingType();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #85  <Method int MediaController.getRatingType()>
	//    3    7:ireturn         
	}

	public static PendingIntent getSessionActivity(Object obj)
	{
		return ((MediaController)obj).getSessionActivity();
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #90  <Method PendingIntent MediaController.getSessionActivity()>
	//    3    7:areturn         
	}

	public static Object getTransportControls(Object obj)
	{
		return ((Object) (((MediaController)obj).getTransportControls()));
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:invokevirtual   #94  <Method android.media.session.MediaController$TransportControls MediaController.getTransportControls()>
	//    3    7:areturn         
	}

	public static void registerCallback(Object obj, Object obj1, Handler handler)
	{
		((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)obj1, handler);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:checkcast       #98  <Class android.media.session.MediaController$Callback>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #101 <Method void MediaController.registerCallback(android.media.session.MediaController$Callback, Handler)>
	//    6   12:return          
	}

	public static void sendCommand(Object obj, String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		((MediaController)obj).sendCommand(s, bundle, resultreceiver);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #106 <Method void MediaController.sendCommand(String, Bundle, ResultReceiver)>
	//    6   10:return          
	}

	public static void setVolumeTo(Object obj, int i, int j)
	{
		((MediaController)obj).setVolumeTo(i, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #109 <Method void MediaController.setVolumeTo(int, int)>
	//    5    9:return          
	}

	public static void unregisterCallback(Object obj, Object obj1)
	{
		((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #20  <Class MediaController>
	//    2    4:aload_1         
	//    3    5:checkcast       #98  <Class android.media.session.MediaController$Callback>
	//    4    8:invokevirtual   #114 <Method void MediaController.unregisterCallback(android.media.session.MediaController$Callback)>
	//    5   11:return          
	}
}

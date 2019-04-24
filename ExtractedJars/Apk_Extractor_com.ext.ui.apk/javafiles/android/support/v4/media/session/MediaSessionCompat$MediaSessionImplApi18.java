// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat

static class MediaSessionCompat$MediaSessionImplApi18 extends MediaSessionCompat.MediaSessionImplBase
{

	int getRccTransportControlFlagsFromActions(long l)
	{
		int j = super.getRccTransportControlFlagsFromActions(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #27  <Method int MediaSessionCompat$MediaSessionImplBase.getRccTransportControlFlagsFromActions(long)>
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		if((256L & l) != 0L)
	//*   6   10:ldc2w           #28  <Long 256L>
	//*   7   13:lload_1         
	//*   8   14:land            
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifeq            27
			i = j | 0x100;
	//   12   20:iload           4
	//   13   22:sipush          256
	//   14   25:ior             
	//   15   26:istore_3        
		return i;
	//   16   27:iload_3         
	//   17   28:ireturn         
	}

	void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		if(sIsMbrPendingIntentSupported)
	//*   0    0:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
	//*   1    3:ifeq            14
			try
			{
				mAudioManager.registerMediaButtonEventReceiver(pendingintent);
	//    2    6:aload_0         
	//    3    7:getfield        #37  <Field AudioManager mAudioManager>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #42  <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
			}
	//*   6   14:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
	//*   7   17:ifne            26
	//*   8   20:aload_0         
	//*   9   21:aload_1         
	//*  10   22:aload_2         
	//*  11   23:invokespecial   #44  <Method void MediaSessionCompat$MediaSessionImplBase.registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
	//*  12   26:return          
			catch(NullPointerException nullpointerexception)
	//*  13   27:astore_3        
			{
				Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
	//   14   28:ldc1            #46  <String "MediaSessionCompat">
	//   15   30:ldc1            #48  <String "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.">
	//   16   32:invokestatic    #54  <Method int Log.w(String, String)>
	//   17   35:pop             
				sIsMbrPendingIntentSupported = false;
	//   18   36:iconst_0        
	//   19   37:putstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
			}
		if(!sIsMbrPendingIntentSupported)
			super.registerMediaButtonEventReceiver(pendingintent, componentname);
	//*  20   40:goto            14
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		super.setCallback(callback, handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void MediaSessionCompat$MediaSessionImplBase.setCallback(MediaSessionCompat$Callback, Handler)>
		if(callback == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       19
		{
			mRcc.setPlaybackPositionUpdateListener(((android.media.ateListener) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field RemoteControlClient mRcc>
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #68  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
			return;
	//   10   18:return          
		} else
		{
			callback = ((MediaSessionCompat.Callback) (new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() {

				public void onPlaybackPositionUpdate(long l)
				{
					postToHandler(18, ((Object) (Long.valueOf(l))));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
				//    2    4:bipush          18
				//    3    6:lload_1         
				//    4    7:invokestatic    #32  <Method Long Long.valueOf(long)>
				//    5   10:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplApi18.postToHandler(int, Object)>
				//    6   13:return          
				}

				final MediaSessionCompat.MediaSessionImplApi18 this$0;

			
			{
				this$0 = MediaSessionCompat.MediaSessionImplApi18.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   11   19:new             #9   <Class MediaSessionCompat$MediaSessionImplApi18$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #71  <Method void MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat$MediaSessionImplApi18)>
	//   15   27:astore_1        
			mRcc.setPlaybackPositionUpdateListener(((android.media.ateListener) (callback)));
	//   16   28:aload_0         
	//   17   29:getfield        #62  <Field RemoteControlClient mRcc>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #68  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
			return;
	//   20   36:return          
		}
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		long l1 = playbackstatecompat.getPosition();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #79  <Method long PlaybackStateCompat.getPosition()>
	//    4    6:lstore          5
		float f = playbackstatecompat.getPlaybackSpeed();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #83  <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//    7   12:fstore_2        
		long l2 = playbackstatecompat.getLastPositionUpdateTime();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #86  <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//   10   17:lstore          7
		long l3 = SystemClock.elapsedRealtime();
	//   11   19:invokestatic    #91  <Method long SystemClock.elapsedRealtime()>
	//   12   22:lstore          9
		if(playbackstatecompat.getState() == 3 && l1 > 0L)
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
	//*  15   28:iconst_3        
	//*  16   29:icmpne          101
	//*  17   32:lload           5
	//*  18   34:lconst_0        
	//*  19   35:lcmp            
	//*  20   36:ifle            101
		{
			if(l2 > 0L)
	//*  21   39:lload           7
	//*  22   41:lconst_0        
	//*  23   42:lcmp            
	//*  24   43:ifle            78
			{
				l2 = l3 - l2;
	//   25   46:lload           9
	//   26   48:lload           7
	//   27   50:lsub            
	//   28   51:lstore          7
				l = l2;
	//   29   53:lload           7
	//   30   55:lstore_3        
				if(f > 0.0F)
	//*  31   56:fload_2         
	//*  32   57:fconst_0        
	//*  33   58:fcmpl           
	//*  34   59:ifle            78
				{
					l = l2;
	//   35   62:lload           7
	//   36   64:lstore_3        
					if(f != 1.0F)
	//*  37   65:fload_2         
	//*  38   66:fconst_1        
	//*  39   67:fcmpl           
	//*  40   68:ifeq            78
						l = (long)((float)l2 * f);
	//   41   71:lload           7
	//   42   73:l2f             
	//   43   74:fload_2         
	//   44   75:fmul            
	//   45   76:f2l             
	//   46   77:lstore_3        
				}
			}
			l += l1;
	//   47   78:lload_3         
	//   48   79:lload           5
	//   49   81:ladd            
	//   50   82:lstore_3        
		} else
	//*  51   83:aload_0         
	//*  52   84:getfield        #62  <Field RemoteControlClient mRcc>
	//*  53   87:aload_0         
	//*  54   88:aload_1         
	//*  55   89:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
	//*  56   92:invokevirtual   #99  <Method int getRccStateFromState(int)>
	//*  57   95:lload_3         
	//*  58   96:fload_2         
	//*  59   97:invokevirtual   #103 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
	//*  60  100:return          
		{
			l = l1;
	//   61  101:lload           5
	//   62  103:lstore_3        
		}
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()), l, f);
	//*  63  104:goto            83
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		if(sIsMbrPendingIntentSupported)
	//*   0    0:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
	//*   1    3:ifeq            15
		{
			mAudioManager.unregisterMediaButtonEventReceiver(pendingintent);
	//    2    6:aload_0         
	//    3    7:getfield        #37  <Field AudioManager mAudioManager>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #106 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
			return;
	//    6   14:return          
		} else
		{
			super.unregisterMediaButtonEventReceiver(pendingintent, componentname);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #108 <Method void MediaSessionCompat$MediaSessionImplBase.unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
			return;
	//   11   21:return          
		}
	}

	private static boolean sIsMbrPendingIntentSupported = true;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:putstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
	//*   2    4:return          
	}

	MediaSessionCompat$MediaSessionImplApi18(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
		super(context, s, componentname, pendingintent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #23  <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
	//    6    9:return          
	}
}

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
		long l1 = playbackstatecompat.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #79  <Method long PlaybackStateCompat.getPosition()>
	//    2    4:lstore          5
		float f = playbackstatecompat.getPlaybackSpeed();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #83  <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//    5   10:fstore_2        
		long l2 = playbackstatecompat.getLastPositionUpdateTime();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #86  <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//    8   15:lstore          7
		long l3 = SystemClock.elapsedRealtime();
	//    9   17:invokestatic    #91  <Method long SystemClock.elapsedRealtime()>
	//   10   20:lstore          9
		long l = l1;
	//   11   22:lload           5
	//   12   24:lstore_3        
		if(playbackstatecompat.getState() == 3)
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
	//*  15   29:iconst_3        
	//*  16   30:icmpne          89
		{
			l = l1;
	//   17   33:lload           5
	//   18   35:lstore_3        
			if(l1 > 0L)
	//*  19   36:lload           5
	//*  20   38:lconst_0        
	//*  21   39:lcmp            
	//*  22   40:ifle            89
			{
				l = 0L;
	//   23   43:lconst_0        
	//   24   44:lstore_3        
				if(l2 > 0L)
	//*  25   45:lload           7
	//*  26   47:lconst_0        
	//*  27   48:lcmp            
	//*  28   49:ifle            84
				{
					l2 = l3 - l2;
	//   29   52:lload           9
	//   30   54:lload           7
	//   31   56:lsub            
	//   32   57:lstore          7
					l = l2;
	//   33   59:lload           7
	//   34   61:lstore_3        
					if(f > 0.0F)
	//*  35   62:fload_2         
	//*  36   63:fconst_0        
	//*  37   64:fcmpl           
	//*  38   65:ifle            84
					{
						l = l2;
	//   39   68:lload           7
	//   40   70:lstore_3        
						if(f != 1.0F)
	//*  41   71:fload_2         
	//*  42   72:fconst_1        
	//*  43   73:fcmpl           
	//*  44   74:ifeq            84
							l = (long)((float)l2 * f);
	//   45   77:lload           7
	//   46   79:l2f             
	//   47   80:fload_2         
	//   48   81:fmul            
	//   49   82:f2l             
	//   50   83:lstore_3        
					}
				}
				l = l1 + l;
	//   51   84:lload           5
	//   52   86:lload_3         
	//   53   87:ladd            
	//   54   88:lstore_3        
			}
		}
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()), l, f);
	//   55   89:aload_0         
	//   56   90:getfield        #62  <Field RemoteControlClient mRcc>
	//   57   93:aload_0         
	//   58   94:aload_1         
	//   59   95:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
	//   60   98:invokevirtual   #99  <Method int getRccStateFromState(int)>
	//   61  101:lload_3         
	//   62  102:fload_2         
	//   63  103:invokevirtual   #103 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
	//   64  106:return          
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

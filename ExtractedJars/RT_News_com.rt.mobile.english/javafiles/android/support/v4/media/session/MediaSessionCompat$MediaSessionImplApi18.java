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
	//    2    2:invokespecial   #26  <Method int MediaSessionCompat$MediaSessionImplBase.getRccTransportControlFlagsFromActions(long)>
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		if((l & 256L) != 0L)
	//*   6   10:lload_1         
	//*   7   11:ldc2w           #27  <Long 256L>
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
		NullPointerException nullpointerexception;
		if(sIsMbrPendingIntentSupported)
	//*   0    0:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
	//*   1    3:ifeq            29
			try
			{
				mAudioManager.registerMediaButtonEventReceiver(pendingintent);
	//    2    6:aload_0         
	//    3    7:getfield        #38  <Field AudioManager mAudioManager>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #43  <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
			}
	//*   6   14:goto            29
	//*   7   17:ldc1            #45  <String "MediaSessionCompat">
	//*   8   19:ldc1            #47  <String "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.">
	//*   9   21:invokestatic    #53  <Method int Log.w(String, String)>
	//*  10   24:pop             
	//*  11   25:iconst_0        
	//*  12   26:putstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
	//*  13   29:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
	//*  14   32:ifne            41
	//*  15   35:aload_0         
	//*  16   36:aload_1         
	//*  17   37:aload_2         
	//*  18   38:invokespecial   #55  <Method void MediaSessionCompat$MediaSessionImplBase.registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
	//*  19   41:return          
			// Misplaced declaration of an exception variable
			catch(NullPointerException nullpointerexception)
			{
				Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
				sIsMbrPendingIntentSupported = false;
			}
		if(!sIsMbrPendingIntentSupported)
			super.registerMediaButtonEventReceiver(pendingintent, componentname);
	//*  20   42:astore_3        
	//*  21   43:goto            17
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		super.setCallback(callback, handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method void MediaSessionCompat$MediaSessionImplBase.setCallback(MediaSessionCompat$Callback, Handler)>
		if(callback == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       19
		{
			mRcc.setPlaybackPositionUpdateListener(((android.media.ateListener) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #63  <Field RemoteControlClient mRcc>
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #69  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
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
	//   14   24:invokespecial   #72  <Method void MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat$MediaSessionImplApi18)>
	//   15   27:astore_1        
			mRcc.setPlaybackPositionUpdateListener(((android.media.ateListener) (callback)));
	//   16   28:aload_0         
	//   17   29:getfield        #63  <Field RemoteControlClient mRcc>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #69  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
			return;
	//   20   36:return          
		}
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		long l1 = playbackstatecompat.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method long PlaybackStateCompat.getPosition()>
	//    2    4:lstore          5
		float f = playbackstatecompat.getPlaybackSpeed();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #84  <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//    5   10:fstore_2        
		long l4 = playbackstatecompat.getLastPositionUpdateTime();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #87  <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//    8   15:lstore          9
		long l5 = SystemClock.elapsedRealtime();
	//    9   17:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   10   20:lstore          11
		long l = l1;
	//   11   22:lload           5
	//   12   24:lstore_3        
		if(playbackstatecompat.getState() == 3)
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #96  <Method int PlaybackStateCompat.getState()>
	//*  15   29:iconst_3        
	//*  16   30:icmpne          93
		{
			long l2 = 0L;
	//   17   33:lconst_0        
	//   18   34:lstore          7
			l = l1;
	//   19   36:lload           5
	//   20   38:lstore_3        
			if(l1 > 0L)
	//*  21   39:lload           5
	//*  22   41:lconst_0        
	//*  23   42:lcmp            
	//*  24   43:ifle            93
			{
				l = l2;
	//   25   46:lload           7
	//   26   48:lstore_3        
				if(l4 > 0L)
	//*  27   49:lload           9
	//*  28   51:lconst_0        
	//*  29   52:lcmp            
	//*  30   53:ifle            88
				{
					long l3 = l5 - l4;
	//   31   56:lload           11
	//   32   58:lload           9
	//   33   60:lsub            
	//   34   61:lstore          7
					l = l3;
	//   35   63:lload           7
	//   36   65:lstore_3        
					if(f > 0.0F)
	//*  37   66:fload_2         
	//*  38   67:fconst_0        
	//*  39   68:fcmpl           
	//*  40   69:ifle            88
					{
						l = l3;
	//   41   72:lload           7
	//   42   74:lstore_3        
						if(f != 1.0F)
	//*  43   75:fload_2         
	//*  44   76:fconst_1        
	//*  45   77:fcmpl           
	//*  46   78:ifeq            88
							l = (long)((float)l3 * f);
	//   47   81:lload           7
	//   48   83:l2f             
	//   49   84:fload_2         
	//   50   85:fmul            
	//   51   86:f2l             
	//   52   87:lstore_3        
					}
				}
				l = l1 + l;
	//   53   88:lload           5
	//   54   90:lload_3         
	//   55   91:ladd            
	//   56   92:lstore_3        
			}
		}
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()), l, f);
	//   57   93:aload_0         
	//   58   94:getfield        #63  <Field RemoteControlClient mRcc>
	//   59   97:aload_0         
	//   60   98:aload_1         
	//   61   99:invokevirtual   #96  <Method int PlaybackStateCompat.getState()>
	//   62  102:invokevirtual   #100 <Method int getRccStateFromState(int)>
	//   63  105:lload_3         
	//   64  106:fload_2         
	//   65  107:invokevirtual   #104 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
	//   66  110:return          
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		if(sIsMbrPendingIntentSupported)
	//*   0    0:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
	//*   1    3:ifeq            15
		{
			mAudioManager.unregisterMediaButtonEventReceiver(pendingintent);
	//    2    6:aload_0         
	//    3    7:getfield        #38  <Field AudioManager mAudioManager>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #107 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
			return;
	//    6   14:return          
		} else
		{
			super.unregisterMediaButtonEventReceiver(pendingintent, componentname);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #109 <Method void MediaSessionCompat$MediaSessionImplBase.unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
			return;
	//   11   21:return          
		}
	}

	private static boolean sIsMbrPendingIntentSupported = true;

	static 
	{
	//    0    0:return          
	}

	MediaSessionCompat$MediaSessionImplApi18(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
		super(context, s, componentname, pendingintent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #22  <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
	//    6    9:return          
	}
}

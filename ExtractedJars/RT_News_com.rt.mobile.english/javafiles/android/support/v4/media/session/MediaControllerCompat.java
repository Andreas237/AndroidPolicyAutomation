// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.SupportActivity;
import android.support.v4.media.*;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaControllerCompatApi21, PlaybackStateCompat, ParcelableVolumeInfo, 
//			IMediaSession, IMediaControllerCallback

public final class MediaControllerCompat
{
	public static abstract class Callback
		implements android.os.IBinder.DeathRecipient
	{

		public void binderDied()
		{
			onSessionDestroyed();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #53  <Method void onSessionDestroyed()>
		//    2    4:return          
		}

		public void onAudioInfoChanged(PlaybackInfo playbackinfo)
		{
		//    0    0:return          
		}

		public void onCaptioningEnabledChanged(boolean flag)
		{
		//    0    0:return          
		}

		public void onExtrasChanged(Bundle bundle)
		{
		//    0    0:return          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		{
		//    0    0:return          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		{
		//    0    0:return          
		}

		public void onQueueChanged(List list)
		{
		//    0    0:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void onRepeatModeChanged(int i)
		{
		//    0    0:return          
		}

		public void onSessionDestroyed()
		{
		//    0    0:return          
		}

		public void onSessionEvent(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onSessionReady()
		{
		//    0    0:return          
		}

		public void onShuffleModeChanged(int i)
		{
		//    0    0:return          
		}

		void postToHandler(int i, Object obj, Bundle bundle)
		{
			if(mHandler != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//*   2    4:ifnull          26
			{
				obj = ((Object) (mHandler.obtainMessage(i, obj)));
		//    3    7:aload_0         
		//    4    8:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    5   11:iload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #83  <Method Message MediaControllerCompat$Callback$MessageHandler.obtainMessage(int, Object)>
		//    8   16:astore_2        
				((Message) (obj)).setData(bundle);
		//    9   17:aload_2         
		//   10   18:aload_3         
		//   11   19:invokevirtual   #88  <Method void Message.setData(Bundle)>
				((Message) (obj)).sendToTarget();
		//   12   22:aload_2         
		//   13   23:invokevirtual   #91  <Method void Message.sendToTarget()>
			}
		//   14   26:return          
		}

		void setHandler(Handler handler)
		{
			if(handler == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       33
			{
				if(mHandler != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//*   4    8:ifnull          57
				{
					mHandler.mRegistered = false;
		//    5   11:aload_0         
		//    6   12:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    7   15:iconst_0        
		//    8   16:putfield        #96  <Field boolean MediaControllerCompat$Callback$MessageHandler.mRegistered>
					mHandler.removeCallbacksAndMessages(((Object) (null)));
		//    9   19:aload_0         
		//   10   20:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//   11   23:aconst_null     
		//   12   24:invokevirtual   #100 <Method void MediaControllerCompat$Callback$MessageHandler.removeCallbacksAndMessages(Object)>
					mHandler = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
					return;
		//   16   32:return          
				}
			} else
			{
				mHandler = new MessageHandler(handler.getLooper());
		//   17   33:aload_0         
		//   18   34:new             #11  <Class MediaControllerCompat$Callback$MessageHandler>
		//   19   37:dup             
		//   20   38:aload_0         
		//   21   39:aload_1         
		//   22   40:invokevirtual   #106 <Method Looper Handler.getLooper()>
		//   23   43:invokespecial   #109 <Method void MediaControllerCompat$Callback$MessageHandler(MediaControllerCompat$Callback, Looper)>
		//   24   46:putfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
				mHandler.mRegistered = true;
		//   25   49:aload_0         
		//   26   50:getfield        #79  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//   27   53:iconst_1        
		//   28   54:putfield        #96  <Field boolean MediaControllerCompat$Callback$MessageHandler.mRegistered>
			}
		//   29   57:return          
		}

		private final Object mCallbackObj;
		MessageHandler mHandler;
		boolean mHasExtraCallback;


/*
		static Object access$000(Callback callback)
		{
			return callback.mCallbackObj;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object mCallbackObj>
		//    2    4:areturn         
		}

*/

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   2    4:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          28
			{
				mCallbackObj = MediaControllerCompatApi21.createCallback(((MediaControllerCompatApi21.Callback) (new StubApi21(this))));
		//    5   12:aload_0         
		//    6   13:new             #14  <Class MediaControllerCompat$Callback$StubApi21>
		//    7   16:dup             
		//    8   17:aload_0         
		//    9   18:invokespecial   #37  <Method void MediaControllerCompat$Callback$StubApi21(MediaControllerCompat$Callback)>
		//   10   21:invokestatic    #43  <Method Object MediaControllerCompatApi21.createCallback(MediaControllerCompatApi21$Callback)>
		//   11   24:putfield        #45  <Field Object mCallbackObj>
				return;
		//   12   27:return          
			} else
			{
				mCallbackObj = ((Object) (new StubCompat(this)));
		//   13   28:aload_0         
		//   14   29:new             #17  <Class MediaControllerCompat$Callback$StubCompat>
		//   15   32:dup             
		//   16   33:aload_0         
		//   17   34:invokespecial   #46  <Method void MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback)>
		//   18   37:putfield        #45  <Field Object mCallbackObj>
				return;
		//   19   40:return          
			}
		}
	}

	private class Callback.MessageHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(!mRegistered)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field boolean mRegistered>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #56  <Field int Message.what>
			{
		//*   6   12:tableswitch     1 13: default 80
		//		               1 241
		//		               2 226
		//		               3 211
		//		               4 196
		//		               5 181
		//		               6 166
		//		               7 151
		//		               8 143
		//		               9 125
		//		               10 80
		//		               11 107
		//		               12 89
		//		               13 81
			case 10: // '\n'
			default:
				return;
		//    7   80:return          

			case 13: // '\r'
				onSessionReady();
		//    8   81:aload_0         
		//    9   82:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   10   85:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onSessionReady()>
				return;
		//   11   88:return          

			case 12: // '\f'
				onShuffleModeChanged(((Integer)message.obj).intValue());
		//   12   89:aload_0         
		//   13   90:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   14   93:aload_1         
		//   15   94:getfield        #64  <Field Object Message.obj>
		//   16   97:checkcast       #66  <Class Integer>
		//   17  100:invokevirtual   #70  <Method int Integer.intValue()>
		//   18  103:invokevirtual   #74  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(int)>
				return;
		//   19  106:return          

			case 11: // '\013'
				onCaptioningEnabledChanged(((Boolean)message.obj).booleanValue());
		//   20  107:aload_0         
		//   21  108:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   22  111:aload_1         
		//   23  112:getfield        #64  <Field Object Message.obj>
		//   24  115:checkcast       #76  <Class Boolean>
		//   25  118:invokevirtual   #80  <Method boolean Boolean.booleanValue()>
		//   26  121:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onCaptioningEnabledChanged(boolean)>
				return;
		//   27  124:return          

			case 9: // '\t'
				onRepeatModeChanged(((Integer)message.obj).intValue());
		//   28  125:aload_0         
		//   29  126:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   30  129:aload_1         
		//   31  130:getfield        #64  <Field Object Message.obj>
		//   32  133:checkcast       #66  <Class Integer>
		//   33  136:invokevirtual   #70  <Method int Integer.intValue()>
		//   34  139:invokevirtual   #87  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
				return;
		//   35  142:return          

			case 8: // '\b'
				onSessionDestroyed();
		//   36  143:aload_0         
		//   37  144:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   38  147:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
				return;
		//   39  150:return          

			case 7: // '\007'
				onExtrasChanged((Bundle)message.obj);
		//   40  151:aload_0         
		//   41  152:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   42  155:aload_1         
		//   43  156:getfield        #64  <Field Object Message.obj>
		//   44  159:checkcast       #92  <Class Bundle>
		//   45  162:invokevirtual   #96  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
				return;
		//   46  165:return          

			case 6: // '\006'
				onQueueTitleChanged((CharSequence)message.obj);
		//   47  166:aload_0         
		//   48  167:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   49  170:aload_1         
		//   50  171:getfield        #64  <Field Object Message.obj>
		//   51  174:checkcast       #98  <Class CharSequence>
		//   52  177:invokevirtual   #102 <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
				return;
		//   53  180:return          

			case 5: // '\005'
				onQueueChanged((List)message.obj);
		//   54  181:aload_0         
		//   55  182:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   56  185:aload_1         
		//   57  186:getfield        #64  <Field Object Message.obj>
		//   58  189:checkcast       #104 <Class List>
		//   59  192:invokevirtual   #108 <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
				return;
		//   60  195:return          

			case 4: // '\004'
				onAudioInfoChanged((PlaybackInfo)message.obj);
		//   61  196:aload_0         
		//   62  197:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   63  200:aload_1         
		//   64  201:getfield        #64  <Field Object Message.obj>
		//   65  204:checkcast       #110 <Class MediaControllerCompat$PlaybackInfo>
		//   66  207:invokevirtual   #114 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
				return;
		//   67  210:return          

			case 3: // '\003'
				onMetadataChanged((MediaMetadataCompat)message.obj);
		//   68  211:aload_0         
		//   69  212:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   70  215:aload_1         
		//   71  216:getfield        #64  <Field Object Message.obj>
		//   72  219:checkcast       #116 <Class MediaMetadataCompat>
		//   73  222:invokevirtual   #120 <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
				return;
		//   74  225:return          

			case 2: // '\002'
				onPlaybackStateChanged((PlaybackStateCompat)message.obj);
		//   75  226:aload_0         
		//   76  227:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   77  230:aload_1         
		//   78  231:getfield        #64  <Field Object Message.obj>
		//   79  234:checkcast       #122 <Class PlaybackStateCompat>
		//   80  237:invokevirtual   #126 <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				return;
		//   81  240:return          

			case 1: // '\001'
				onSessionEvent((String)message.obj, message.getData());
		//   82  241:aload_0         
		//   83  242:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   84  245:aload_1         
		//   85  246:getfield        #64  <Field Object Message.obj>
		//   86  249:checkcast       #128 <Class String>
		//   87  252:aload_1         
		//   88  253:invokevirtual   #132 <Method Bundle Message.getData()>
		//   89  256:invokevirtual   #136 <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   90  259:return          
			}
		}

		private static final int MSG_DESTROYED = 8;
		private static final int MSG_EVENT = 1;
		private static final int MSG_SESSION_READY = 13;
		private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
		private static final int MSG_UPDATE_EXTRAS = 7;
		private static final int MSG_UPDATE_METADATA = 3;
		private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
		private static final int MSG_UPDATE_QUEUE = 5;
		private static final int MSG_UPDATE_QUEUE_TITLE = 6;
		private static final int MSG_UPDATE_REPEAT_MODE = 9;
		private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
		private static final int MSG_UPDATE_VOLUME = 4;
		boolean mRegistered;
		final Callback this$0;

		Callback.MessageHandler(Looper looper)
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field MediaControllerCompat$Callback this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #46  <Method void Handler(Looper)>
			mRegistered = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #48  <Field boolean mRegistered>
		//    9   15:return          
		}
	}

	private static class Callback.StubApi21
		implements MediaControllerCompatApi21.Callback
	{

		public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore          6
			if(callback != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          36
				callback.onAudioInfoChanged(new PlaybackInfo(i, j, k, l, i1));
		//    7   17:aload           6
		//    8   19:new             #36  <Class MediaControllerCompat$PlaybackInfo>
		//    9   22:dup             
		//   10   23:iload_1         
		//   11   24:iload_2         
		//   12   25:iload_3         
		//   13   26:iload           4
		//   14   28:iload           5
		//   15   30:invokespecial   #38  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   16   33:invokevirtual   #41  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
		//   17   36:return          
		}

		public void onExtrasChanged(Bundle bundle)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				callback.onExtrasChanged(bundle);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #45  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
		//   10   20:return          
		}

		public void onMetadataChanged(Object obj)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #52  <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
		//   10   20:invokevirtual   #55  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
		//   11   23:return          
		}

		public void onPlaybackStateChanged(Object obj)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          31
			{
				if(callback.mHasExtraCallback)
		//*   7   15:aload_2         
		//*   8   16:getfield        #60  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
		//*   9   19:ifeq            23
					return;
		//   10   22:return          
				callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokestatic    #66  <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//   14   28:invokevirtual   #69  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
		//   15   31:return          
		}

		public void onQueueChanged(List list)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #77  <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
		//   10   20:invokevirtual   #79  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
		//   11   23:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				callback.onQueueTitleChanged(charsequence);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #85  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
		//   10   20:return          
		}

		public void onSessionDestroyed()
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_1        
			if(callback != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          19
				callback.onSessionDestroyed();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #88  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
		//    9   19:return          
		}

		public void onSessionEvent(String s, Bundle bundle)
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore_3        
			if(callback != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          37
			{
				if(callback.mHasExtraCallback && android.os.Build.VERSION.SDK_INT < 23)
		//*   7   15:aload_3         
		//*   8   16:getfield        #60  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
		//*   9   19:ifeq            31
		//*  10   22:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
		//*  11   25:bipush          23
		//*  12   27:icmpge          31
					return;
		//   13   30:return          
				callback.onSessionEvent(s, bundle);
		//   14   31:aload_3         
		//   15   32:aload_1         
		//   16   33:aload_2         
		//   17   34:invokevirtual   #98  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			}
		//   18   37:return          
		}

		private final WeakReference mCallback;

		Callback.StubApi21(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mCallback = new WeakReference(((Object) (callback)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference mCallback>
		//    8   16:return          
		}
	}

	private static class Callback.StubCompat extends IMediaControllerCallback.Stub
	{

		public void onCaptioningEnabledChanged(boolean flag)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				callback.postToHandler(11, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          11
		//    9   18:iload_1         
		//   10   19:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   13   26:return          
		}

		public void onEvent(String s, Bundle bundle)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_3        
			if(callback != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          22
				callback.postToHandler(1, ((Object) (s)), bundle);
		//    7   15:aload_3         
		//    8   16:iconst_1        
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   22:return          
		}

		public void onExtrasChanged(Bundle bundle)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				callback.postToHandler(7, ((Object) (bundle)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          7
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   23:return          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				callback.postToHandler(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_3        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   22:return          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				callback.postToHandler(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_2        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   22:return          
		}

		public void onQueueChanged(List list)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          22
				callback.postToHandler(5, ((Object) (list)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:iconst_5        
		//    9   17:aload_1         
		//   10   18:aconst_null     
		//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   22:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          23
				callback.postToHandler(6, ((Object) (charsequence)), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          6
		//    9   18:aload_1         
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   23:return          
		}

		public void onRepeatModeChanged(int i)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				callback.postToHandler(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          9
		//    9   18:iload_1         
		//   10   19:invokestatic    #66  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   13   26:return          
		}

		public void onSessionDestroyed()
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_1        
			if(callback != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          23
				callback.postToHandler(8, ((Object) (null)), ((Bundle) (null)));
		//    7   15:aload_1         
		//    8   16:bipush          8
		//    9   18:aconst_null     
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   23:return          
		}

		public void onSessionReady()
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_1        
			if(callback != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          23
				callback.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//    7   15:aload_1         
		//    8   16:bipush          13
		//    9   18:aconst_null     
		//   10   19:aconst_null     
		//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   12   23:return          
		}

		public void onShuffleModeChanged(int i)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          26
				callback.postToHandler(12, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    7   15:aload_2         
		//    8   16:bipush          12
		//    9   18:iload_1         
		//   10   19:invokestatic    #66  <Method Integer Integer.valueOf(int)>
		//   11   22:aconst_null     
		//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		//   13   26:return          
		}

		public void onShuffleModeChangedRemoved(boolean flag)
			throws RemoteException
		{
		//    0    0:return          
		}

		public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
			throws RemoteException
		{
			Callback callback = (Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
		//    4   10:astore_2        
			if(callback != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          59
			{
				if(parcelablevolumeinfo != null)
		//*   7   15:aload_1         
		//*   8   16:ifnull          50
					parcelablevolumeinfo = ((ParcelableVolumeInfo) (new PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume)));
		//    9   19:new             #74  <Class MediaControllerCompat$PlaybackInfo>
		//   10   22:dup             
		//   11   23:aload_1         
		//   12   24:getfield        #80  <Field int ParcelableVolumeInfo.volumeType>
		//   13   27:aload_1         
		//   14   28:getfield        #83  <Field int ParcelableVolumeInfo.audioStream>
		//   15   31:aload_1         
		//   16   32:getfield        #86  <Field int ParcelableVolumeInfo.controlType>
		//   17   35:aload_1         
		//   18   36:getfield        #89  <Field int ParcelableVolumeInfo.maxVolume>
		//   19   39:aload_1         
		//   20   40:getfield        #92  <Field int ParcelableVolumeInfo.currentVolume>
		//   21   43:invokespecial   #95  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   22   46:astore_1        
				else
		//*  23   47:goto            52
					parcelablevolumeinfo = null;
		//   24   50:aconst_null     
		//   25   51:astore_1        
				callback.postToHandler(4, ((Object) (parcelablevolumeinfo)), ((Bundle) (null)));
		//   26   52:aload_2         
		//   27   53:iconst_4        
		//   28   54:aload_1         
		//   29   55:aconst_null     
		//   30   56:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
			}
		//   31   59:return          
		}

		private final WeakReference mCallback;

		Callback.StubCompat(Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void IMediaControllerCallback$Stub()>
			mCallback = new WeakReference(((Object) (callback)));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
		//    7   13:putfield        #25  <Field WeakReference mCallback>
		//    8   16:return          
		}
	}

	private static class MediaControllerExtraData extends android.support.v4.app.SupportActivity.ExtraData
	{

		MediaControllerCompat getMediaController()
		{
			return mMediaController;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat mMediaController>
		//    2    4:areturn         
		}

		private final MediaControllerCompat mMediaController;

		MediaControllerExtraData(MediaControllerCompat mediacontrollercompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void android.support.v4.app.SupportActivity$ExtraData()>
			mMediaController = mediacontrollercompat;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field MediaControllerCompat mMediaController>
		//    5    9:return          
		}
	}

	static interface MediaControllerImpl
	{

		public abstract void addQueueItem(MediaDescriptionCompat mediadescriptioncompat);

		public abstract void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i);

		public abstract void adjustVolume(int i, int j);

		public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

		public abstract Bundle getExtras();

		public abstract long getFlags();

		public abstract Object getMediaController();

		public abstract MediaMetadataCompat getMetadata();

		public abstract String getPackageName();

		public abstract PlaybackInfo getPlaybackInfo();

		public abstract PlaybackStateCompat getPlaybackState();

		public abstract List getQueue();

		public abstract CharSequence getQueueTitle();

		public abstract int getRatingType();

		public abstract int getRepeatMode();

		public abstract PendingIntent getSessionActivity();

		public abstract int getShuffleMode();

		public abstract TransportControls getTransportControls();

		public abstract boolean isCaptioningEnabled();

		public abstract boolean isSessionReady();

		public abstract void registerCallback(Callback callback, Handler handler);

		public abstract void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat);

		public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

		public abstract void setVolumeTo(int i, int j);

		public abstract void unregisterCallback(Callback callback);
	}

	static class MediaControllerImplApi21
		implements MediaControllerImpl
	{

		private void processPendingCallbacks()
		{
			if(mExtraBinder == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			List list = mPendingCallbacks;
		//    4    8:aload_0         
		//    5    9:getfield        #40  <Field List mPendingCallbacks>
		//    6   12:astore_1        
			list;
		//    7   13:aload_1         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			Iterator iterator = mPendingCallbacks.iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #40  <Field List mPendingCallbacks>
		//   11   19:invokeinterface #91  <Method Iterator List.iterator()>
		//   12   24:astore_2        
_L2:
			Callback callback;
			ExtraCallback extracallback;
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
		//   13   25:aload_2         
		//   14   26:invokeinterface #97  <Method boolean Iterator.hasNext()>
		//   15   31:ifeq            98
			callback = (Callback)iterator.next();
		//   16   34:aload_2         
		//   17   35:invokeinterface #100 <Method Object Iterator.next()>
		//   18   40:checkcast       #102 <Class MediaControllerCompat$Callback>
		//   19   43:astore_3        
			extracallback = new ExtraCallback(callback);
		//   20   44:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   21   47:dup             
		//   22   48:aload_3         
		//   23   49:invokespecial   #105 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   24   52:astore          4
			mCallbackMap.put(((Object) (callback)), ((Object) (extracallback)));
		//   25   54:aload_0         
		//   26   55:getfield        #45  <Field HashMap mCallbackMap>
		//   27   58:aload_3         
		//   28   59:aload           4
		//   29   61:invokevirtual   #109 <Method Object HashMap.put(Object, Object)>
		//   30   64:pop             
			callback.mHasExtraCallback = true;
		//   31   65:aload_3         
		//   32   66:iconst_1        
		//   33   67:putfield        #113 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
			mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   34   70:aload_0         
		//   35   71:getfield        #66  <Field IMediaSession mExtraBinder>
		//   36   74:aload           4
		//   37   76:invokeinterface #119 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			callback.onSessionReady();
		//   38   81:aload_3         
		//   39   82:invokevirtual   #122 <Method void MediaControllerCompat$Callback.onSessionReady()>
			if(true) goto _L2; else goto _L1
		//   40   85:goto            25
			Object obj;
			obj;
		//   41   88:astore_2        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (obj)));
		//   42   89:ldc1            #124 <String "MediaControllerCompat">
		//   43   91:ldc1            #126 <String "Dead object in registerCallback.">
		//   44   93:aload_2         
		//   45   94:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   46   97:pop             
_L1:
			mPendingCallbacks.clear();
		//   47   98:aload_0         
		//   48   99:getfield        #40  <Field List mPendingCallbacks>
		//   49  102:invokeinterface #135 <Method void List.clear()>
			list;
		//   50  107:aload_1         
			JVM INSTR monitorexit ;
		//   51  108:monitorexit     
			return;
		//   52  109:return          
			obj;
		//   53  110:astore_2        
			list;
		//   54  111:aload_1         
			JVM INSTR monitorexit ;
		//   55  112:monitorexit     
			throw obj;
		//   56  113:aload_2         
		//   57  114:athrow          
		}

		private void requestExtraBinder()
		{
			sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver(this, new Handler()))));
		//    0    0:aload_0         
		//    1    1:ldc1            #137 <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:aconst_null     
		//    3    4:new             #11  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
		//    4    7:dup             
		//    5    8:aload_0         
		//    6    9:new             #139 <Class Handler>
		//    7   12:dup             
		//    8   13:invokespecial   #140 <Method void Handler()>
		//    9   16:invokespecial   #143 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21, Handler)>
		//   10   19:invokevirtual   #147 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   11   22:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #153 <Method long getFlags()>
		//*   2    4:ldc2w           #154 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifne            23
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    7   13:new             #157 <Class UnsupportedOperationException>
		//    8   16:dup             
		//    9   17:ldc1            #159 <String "This session doesn't support queue management operations">
		//   10   19:invokespecial   #162 <Method void UnsupportedOperationException(String)>
		//   11   22:athrow          
			} else
			{
				Bundle bundle = new Bundle();
		//   12   23:new             #164 <Class Bundle>
		//   13   26:dup             
		//   14   27:invokespecial   #165 <Method void Bundle()>
		//   15   30:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   16   31:aload_2         
		//   17   32:ldc1            #167 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   18   34:aload_1         
		//   19   35:invokevirtual   #171 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   20   38:aload_0         
		//   21   39:ldc1            #173 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//   22   41:aload_2         
		//   23   42:aconst_null     
		//   24   43:invokevirtual   #147 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   25   46:return          
			}
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			if((getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #153 <Method long getFlags()>
		//*   2    4:ldc2w           #154 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifne            23
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    7   13:new             #157 <Class UnsupportedOperationException>
		//    8   16:dup             
		//    9   17:ldc1            #159 <String "This session doesn't support queue management operations">
		//   10   19:invokespecial   #162 <Method void UnsupportedOperationException(String)>
		//   11   22:athrow          
			} else
			{
				Bundle bundle = new Bundle();
		//   12   23:new             #164 <Class Bundle>
		//   13   26:dup             
		//   14   27:invokespecial   #165 <Method void Bundle()>
		//   15   30:astore_3        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   16   31:aload_3         
		//   17   32:ldc1            #167 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   18   34:aload_1         
		//   19   35:invokevirtual   #171 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
		//   20   38:aload_3         
		//   21   39:ldc1            #176 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   22   41:iload_2         
		//   23   42:invokevirtual   #180 <Method void Bundle.putInt(String, int)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
		//   24   45:aload_0         
		//   25   46:ldc1            #182 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//   26   48:aload_3         
		//   27   49:aconst_null     
		//   28   50:invokevirtual   #147 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   29   53:return          
			}
		}

		public void adjustVolume(int i, int j)
		{
			MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #187 <Method void MediaControllerCompatApi21.adjustVolume(Object, int, int)>
		//    5    9:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #192 <Method boolean MediaControllerCompatApi21.dispatchMediaButtonEvent(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		public Bundle getExtras()
		{
			return MediaControllerCompatApi21.getExtras(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #197 <Method Bundle MediaControllerCompatApi21.getExtras(Object)>
		//    3    7:areturn         
		}

		public long getFlags()
		{
			return MediaControllerCompatApi21.getFlags(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #200 <Method long MediaControllerCompatApi21.getFlags(Object)>
		//    3    7:lreturn         
		}

		public Object getMediaController()
		{
			return mControllerObj;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:areturn         
		}

		public MediaMetadataCompat getMetadata()
		{
			Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #206 <Method Object MediaControllerCompatApi21.getMetadata(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaMetadataCompat.fromMediaMetadata(obj);
		//    6   12:aload_1         
		//    7   13:invokestatic    #212 <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
		//    8   16:areturn         
			else
				return null;
		//    9   17:aconst_null     
		//   10   18:areturn         
		}

		public String getPackageName()
		{
			return MediaControllerCompatApi21.getPackageName(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #217 <Method String MediaControllerCompatApi21.getPackageName(Object)>
		//    3    7:areturn         
		}

		public PlaybackInfo getPlaybackInfo()
		{
			Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #221 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          40
				return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
		//    6   12:new             #223 <Class MediaControllerCompat$PlaybackInfo>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokestatic    #229 <Method int MediaControllerCompatApi21$PlaybackInfo.getPlaybackType(Object)>
		//   10   20:aload_1         
		//   11   21:invokestatic    #232 <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
		//   12   24:aload_1         
		//   13   25:invokestatic    #235 <Method int MediaControllerCompatApi21$PlaybackInfo.getVolumeControl(Object)>
		//   14   28:aload_1         
		//   15   29:invokestatic    #238 <Method int MediaControllerCompatApi21$PlaybackInfo.getMaxVolume(Object)>
		//   16   32:aload_1         
		//   17   33:invokestatic    #241 <Method int MediaControllerCompatApi21$PlaybackInfo.getCurrentVolume(Object)>
		//   18   36:invokespecial   #244 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   19   39:areturn         
			else
				return null;
		//   20   40:aconst_null     
		//   21   41:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_29;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          29
			PlaybackStateCompat playbackstatecompat = mExtraBinder.getPlaybackState();
		//    3    7:aload_0         
		//    4    8:getfield        #66  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #248 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    6   16:astore_1        
			return playbackstatecompat;
		//    7   17:aload_1         
		//    8   18:areturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_1        
			Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:ldc1            #250 <String "Dead object in getPlaybackState.">
		//   12   24:aload_1         
		//   13   25:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   14   28:pop             
			Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
		//   15   29:aload_0         
		//   16   30:getfield        #59  <Field Object mControllerObj>
		//   17   33:invokestatic    #252 <Method Object MediaControllerCompatApi21.getPlaybackState(Object)>
		//   18   36:astore_1        
			if(obj != null)
		//*  19   37:aload_1         
		//*  20   38:ifnull          46
				return PlaybackStateCompat.fromPlaybackState(obj);
		//   21   41:aload_1         
		//   22   42:invokestatic    #258 <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//   23   45:areturn         
			else
				return null;
		//   24   46:aconst_null     
		//   25   47:areturn         
		}

		public List getQueue()
		{
			List list = MediaControllerCompatApi21.getQueue(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #263 <Method List MediaControllerCompatApi21.getQueue(Object)>
		//    3    7:astore_1        
			if(list != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaSessionCompat.QueueItem.fromQueueItemList(list);
		//    6   12:aload_1         
		//    7   13:invokestatic    #269 <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
		//    8   16:areturn         
			else
				return null;
		//    9   17:aconst_null     
		//   10   18:areturn         
		}

		public CharSequence getQueueTitle()
		{
			return MediaControllerCompatApi21.getQueueTitle(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #276 <Method CharSequence MediaControllerCompatApi21.getQueueTitle(Object)>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			if(android.os.Build.VERSION.SDK_INT >= 22 || mExtraBinder == null)
				break MISSING_BLOCK_LABEL_38;
		//    0    0:getstatic       #284 <Field int android.os.Build$VERSION.SDK_INT>
		//    1    3:bipush          22
		//    2    5:icmpge          38
		//    3    8:aload_0         
		//    4    9:getfield        #66  <Field IMediaSession mExtraBinder>
		//    5   12:ifnull          38
			int i = mExtraBinder.getRatingType();
		//    6   15:aload_0         
		//    7   16:getfield        #66  <Field IMediaSession mExtraBinder>
		//    8   19:invokeinterface #286 <Method int IMediaSession.getRatingType()>
		//    9   24:istore_1        
			return i;
		//   10   25:iload_1         
		//   11   26:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   12   27:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
		//   13   28:ldc1            #124 <String "MediaControllerCompat">
		//   14   30:ldc2            #288 <String "Dead object in getRatingType.">
		//   15   33:aload_2         
		//   16   34:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   17   37:pop             
			return MediaControllerCompatApi21.getRatingType(mControllerObj);
		//   18   38:aload_0         
		//   19   39:getfield        #59  <Field Object mControllerObj>
		//   20   42:invokestatic    #290 <Method int MediaControllerCompatApi21.getRatingType(Object)>
		//   21   45:ireturn         
		}

		public int getRepeatMode()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_30;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          30
			int i = mExtraBinder.getRepeatMode();
		//    3    7:aload_0         
		//    4    8:getfield        #66  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #293 <Method int IMediaSession.getRepeatMode()>
		//    6   16:istore_1        
			return i;
		//    7   17:iload_1         
		//    8   18:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:ldc2            #295 <String "Dead object in getRepeatMode.">
		//   12   25:aload_2         
		//   13   26:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   14   29:pop             
			return -1;
		//   15   30:iconst_m1       
		//   16   31:ireturn         
		}

		public PendingIntent getSessionActivity()
		{
			return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #300 <Method PendingIntent MediaControllerCompatApi21.getSessionActivity(Object)>
		//    3    7:areturn         
		}

		public int getShuffleMode()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_30;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          30
			int i = mExtraBinder.getShuffleMode();
		//    3    7:aload_0         
		//    4    8:getfield        #66  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #303 <Method int IMediaSession.getShuffleMode()>
		//    6   16:istore_1        
			return i;
		//    7   17:iload_1         
		//    8   18:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:ldc2            #305 <String "Dead object in getShuffleMode.">
		//   12   25:aload_2         
		//   13   26:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   14   29:pop             
			return -1;
		//   15   30:iconst_m1       
		//   16   31:ireturn         
		}

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:invokestatic    #309 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi21(obj)));
		//    6   12:new             #311 <Class MediaControllerCompat$TransportControlsApi21>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #314 <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public boolean isCaptioningEnabled()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_30;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          30
			boolean flag = mExtraBinder.isCaptioningEnabled();
		//    3    7:aload_0         
		//    4    8:getfield        #66  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #317 <Method boolean IMediaSession.isCaptioningEnabled()>
		//    6   16:istore_1        
			return flag;
		//    7   17:iload_1         
		//    8   18:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_2        
			Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:ldc2            #319 <String "Dead object in isCaptioningEnabled.">
		//   12   25:aload_2         
		//   13   26:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   14   29:pop             
			return false;
		//   15   30:iconst_0        
		//   16   31:ireturn         
		}

		public boolean isSessionReady()
		{
			return mExtraBinder != null;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public final void registerCallback(Callback callback, Handler handler)
		{
			MediaControllerCompatApi21.registerCallback(mControllerObj, callback.mCallbackObj, handler);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #326 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//    4    8:aload_2         
		//    5    9:invokestatic    #329 <Method void MediaControllerCompatApi21.registerCallback(Object, Object, Handler)>
			if(mExtraBinder != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #66  <Field IMediaSession mExtraBinder>
		//*   8   16:ifnull          65
			{
				handler = ((Handler) (new ExtraCallback(callback)));
		//    9   19:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   10   22:dup             
		//   11   23:aload_1         
		//   12   24:invokespecial   #105 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   13   27:astore_2        
				mCallbackMap.put(((Object) (callback)), ((Object) (handler)));
		//   14   28:aload_0         
		//   15   29:getfield        #45  <Field HashMap mCallbackMap>
		//   16   32:aload_1         
		//   17   33:aload_2         
		//   18   34:invokevirtual   #109 <Method Object HashMap.put(Object, Object)>
		//   19   37:pop             
				callback.mHasExtraCallback = true;
		//   20   38:aload_1         
		//   21   39:iconst_1        
		//   22   40:putfield        #113 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
				try
				{
					mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (handler)));
		//   23   43:aload_0         
		//   24   44:getfield        #66  <Field IMediaSession mExtraBinder>
		//   25   47:aload_2         
		//   26   48:invokeinterface #119 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
					return;
		//   27   53:return          
				}
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  28   54:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (callback)));
		//   29   55:ldc1            #124 <String "MediaControllerCompat">
		//   30   57:ldc1            #126 <String "Dead object in registerCallback.">
		//   31   59:aload_1         
		//   32   60:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   33   63:pop             
				}
				return;
		//   34   64:return          
			}
			synchronized(mPendingCallbacks)
		//*  35   65:aload_0         
		//*  36   66:getfield        #40  <Field List mPendingCallbacks>
		//*  37   69:astore_2        
		//*  38   70:aload_2         
		//*  39   71:monitorenter    
			{
				callback.mHasExtraCallback = false;
		//   40   72:aload_1         
		//   41   73:iconst_0        
		//   42   74:putfield        #113 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
				mPendingCallbacks.add(((Object) (callback)));
		//   43   77:aload_0         
		//   44   78:getfield        #40  <Field List mPendingCallbacks>
		//   45   81:aload_1         
		//   46   82:invokeinterface #333 <Method boolean List.add(Object)>
		//   47   87:pop             
			}
		//   48   88:aload_2         
		//   49   89:monitorexit     
			return;
		//   50   90:return          
			callback;
		//   51   91:astore_1        
			handler;
		//   52   92:aload_2         
			JVM INSTR monitorexit ;
		//   53   93:monitorexit     
			throw callback;
		//   54   94:aload_1         
		//   55   95:athrow          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #153 <Method long getFlags()>
		//*   2    4:ldc2w           #154 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifne            23
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    7   13:new             #157 <Class UnsupportedOperationException>
		//    8   16:dup             
		//    9   17:ldc1            #159 <String "This session doesn't support queue management operations">
		//   10   19:invokespecial   #162 <Method void UnsupportedOperationException(String)>
		//   11   22:athrow          
			} else
			{
				Bundle bundle = new Bundle();
		//   12   23:new             #164 <Class Bundle>
		//   13   26:dup             
		//   14   27:invokespecial   #165 <Method void Bundle()>
		//   15   30:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   16   31:aload_2         
		//   17   32:ldc1            #167 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   18   34:aload_1         
		//   19   35:invokevirtual   #171 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   20   38:aload_0         
		//   21   39:ldc2            #336 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//   22   42:aload_2         
		//   23   43:aconst_null     
		//   24   44:invokevirtual   #147 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   25   47:return          
			}
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #339 <Method void MediaControllerCompatApi21.sendCommand(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public void setVolumeTo(int i, int j)
		{
			MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #342 <Method void MediaControllerCompatApi21.setVolumeTo(Object, int, int)>
		//    5    9:return          
		}

		public final void unregisterCallback(Callback callback)
		{
			MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #326 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//    4    8:invokestatic    #346 <Method void MediaControllerCompatApi21.unregisterCallback(Object, Object)>
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_62;
		//    5   11:aload_0         
		//    6   12:getfield        #66  <Field IMediaSession mExtraBinder>
		//    7   15:ifnull          62
			ExtraCallback extracallback = (ExtraCallback)mCallbackMap.remove(((Object) (callback)));
		//    8   18:aload_0         
		//    9   19:getfield        #45  <Field HashMap mCallbackMap>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #349 <Method Object HashMap.remove(Object)>
		//   12   26:checkcast       #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   13   29:astore_2        
			if(extracallback != null)
		//*  14   30:aload_2         
		//*  15   31:ifnull          88
			{
				try
				{
					callback.mHasExtraCallback = false;
		//   16   34:aload_1         
		//   17   35:iconst_0        
		//   18   36:putfield        #113 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
					mExtraBinder.unregisterCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   19   39:aload_0         
		//   20   40:getfield        #66  <Field IMediaSession mExtraBinder>
		//   21   43:aload_2         
		//   22   44:invokeinterface #352 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
					return;
		//   23   49:return          
				}
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  24   50:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
		//   25   51:ldc1            #124 <String "MediaControllerCompat">
		//   26   53:ldc2            #354 <String "Dead object in unregisterCallback.">
		//   27   56:aload_1         
		//   28   57:invokestatic    #132 <Method int Log.e(String, String, Throwable)>
		//   29   60:pop             
				}
				return;
		//   30   61:return          
			} else
		//*  31   62:aload_0         
		//*  32   63:getfield        #40  <Field List mPendingCallbacks>
		//*  33   66:astore_2        
		//*  34   67:aload_2         
		//*  35   68:monitorenter    
		//*  36   69:aload_0         
		//*  37   70:getfield        #40  <Field List mPendingCallbacks>
		//*  38   73:aload_1         
		//*  39   74:invokeinterface #356 <Method boolean List.remove(Object)>
		//*  40   79:pop             
		//*  41   80:aload_2         
		//*  42   81:monitorexit     
		//*  43   82:return          
		//*  44   83:astore_1        
		//*  45   84:aload_2         
		//*  46   85:monitorexit     
		//*  47   86:aload_1         
		//*  48   87:athrow          
			{
				return;
		//   49   88:return          
			}
			synchronized(mPendingCallbacks)
			{
				mPendingCallbacks.remove(((Object) (callback)));
			}
			return;
			callback;
			list;
			JVM INSTR monitorexit ;
			throw callback;
		}

		private HashMap mCallbackMap;
		protected final Object mControllerObj;
		private IMediaSession mExtraBinder;
		private final List mPendingCallbacks;


/*
		static IMediaSession access$202(MediaControllerImplApi21 mediacontrollerimplapi21, IMediaSession imediasession)
		{
			mediacontrollerimplapi21.mExtraBinder = imediasession;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field IMediaSession mExtraBinder>
			return imediasession;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static void access$300(MediaControllerImplApi21 mediacontrollerimplapi21)
		{
			mediacontrollerimplapi21.processPendingCallbacks();
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method void processPendingCallbacks()>
			return;
		//    2    4:return          
		}

*/

		public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mPendingCallbacks = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #37  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #38  <Method void ArrayList()>
		//    6   12:putfield        #40  <Field List mPendingCallbacks>
			mCallbackMap = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #42  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #43  <Method void HashMap()>
		//   11   23:putfield        #45  <Field HashMap mCallbackMap>
			mControllerObj = MediaControllerCompatApi21.fromToken(context, token.getToken());
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #51  <Method Object MediaSessionCompat$Token.getToken()>
		//   16   32:invokestatic    #57  <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
		//   17   35:putfield        #59  <Field Object mControllerObj>
			if(mControllerObj == null)
		//*  18   38:aload_0         
		//*  19   39:getfield        #59  <Field Object mControllerObj>
		//*  20   42:ifnonnull       53
				throw new RemoteException();
		//   21   45:new             #32  <Class RemoteException>
		//   22   48:dup             
		//   23   49:invokespecial   #60  <Method void RemoteException()>
		//   24   52:athrow          
			mExtraBinder = token.getExtraBinder();
		//   25   53:aload_0         
		//   26   54:aload_2         
		//   27   55:invokevirtual   #64  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   28   58:putfield        #66  <Field IMediaSession mExtraBinder>
			if(mExtraBinder == null)
		//*  29   61:aload_0         
		//*  30   62:getfield        #66  <Field IMediaSession mExtraBinder>
		//*  31   65:ifnonnull       72
				requestExtraBinder();
		//   32   68:aload_0         
		//   33   69:invokespecial   #69  <Method void requestExtraBinder()>
		//   34   72:return          
		}

		public MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mPendingCallbacks = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #37  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #38  <Method void ArrayList()>
		//    6   12:putfield        #40  <Field List mPendingCallbacks>
			mCallbackMap = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #42  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #43  <Method void HashMap()>
		//   11   23:putfield        #45  <Field HashMap mCallbackMap>
			mControllerObj = MediaControllerCompatApi21.fromToken(context, mediasessioncompat.getSessionToken().getToken());
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #78  <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
		//   16   32:invokevirtual   #51  <Method Object MediaSessionCompat$Token.getToken()>
		//   17   35:invokestatic    #57  <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
		//   18   38:putfield        #59  <Field Object mControllerObj>
			mExtraBinder = mediasessioncompat.getSessionToken().getExtraBinder();
		//   19   41:aload_0         
		//   20   42:aload_2         
		//   21   43:invokevirtual   #78  <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
		//   22   46:invokevirtual   #64  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   23   49:putfield        #66  <Field IMediaSession mExtraBinder>
			if(mExtraBinder == null)
		//*  24   52:aload_0         
		//*  25   53:getfield        #66  <Field IMediaSession mExtraBinder>
		//*  26   56:ifnonnull       63
				requestExtraBinder();
		//   27   59:aload_0         
		//   28   60:invokespecial   #69  <Method void requestExtraBinder()>
		//   29   63:return          
		}
	}

	private static class MediaControllerImplApi21.ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerImplApi21)mMediaControllerImpl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mMediaControllerImpl>
		//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
		//    4   10:astore_3        
			if(mediacontrollerimplapi21 != null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          39
			{
				if(bundle == null)
		//*   7   15:aload_2         
		//*   8   16:ifnonnull       20
				{
					return;
		//    9   19:return          
				} else
				{
					mediacontrollerimplapi21.mExtraBinder = IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
		//   10   20:aload_3         
		//   11   21:aload_2         
		//   12   22:ldc1            #34  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   13   24:invokestatic    #40  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   14   27:invokestatic    #46  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
		//   15   30:invokestatic    #50  <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$202(MediaControllerCompat$MediaControllerImplApi21, IMediaSession)>
		//   16   33:pop             
					mediacontrollerimplapi21.processPendingCallbacks();
		//   17   34:aload_3         
		//   18   35:invokestatic    #54  <Method void MediaControllerCompat$MediaControllerImplApi21.access$300(MediaControllerCompat$MediaControllerImplApi21)>
					return;
		//   19   38:return          
				}
			} else
			{
				return;
		//   20   39:return          
			}
		}

		private WeakReference mMediaControllerImpl;

		public MediaControllerImplApi21.ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
		{
			super(handler);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #18  <Method void ResultReceiver(Handler)>
			mMediaControllerImpl = new WeakReference(((Object) (mediacontrollerimplapi21)));
		//    3    5:aload_0         
		//    4    6:new             #20  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
		//    8   14:putfield        #25  <Field WeakReference mMediaControllerImpl>
		//    9   17:return          
		}
	}

	private static class MediaControllerImplApi21.ExtraCallback extends Callback.StubCompat
	{

		public void onExtrasChanged(Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onQueueChanged(List list)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onSessionDestroyed()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #21  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void AssertionError()>
		//    3    7:athrow          
		}

		MediaControllerImplApi21.ExtraCallback(Callback callback)
		{
			super(callback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback)>
		//    3    5:return          
		}
	}

	static class MediaControllerImplApi23 extends MediaControllerImplApi21
	{

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Object mControllerObj>
		//    2    4:invokestatic    #32  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi23(obj)));
		//    6   12:new             #34  <Class MediaControllerCompat$TransportControlsApi23>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #37  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public MediaControllerImplApi23(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
			super(context, token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}

		public MediaControllerImplApi23(Context context, MediaSessionCompat mediasessioncompat)
		{
			super(context, mediasessioncompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat)>
		//    4    6:return          
		}
	}

	static class MediaControllerImplApi24 extends MediaControllerImplApi23
	{

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Object mControllerObj>
		//    2    4:invokestatic    #32  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi24(obj)));
		//    6   12:new             #34  <Class MediaControllerCompat$TransportControlsApi24>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #37  <Method void MediaControllerCompat$TransportControlsApi24(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public MediaControllerImplApi24(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
			super(context, token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}

		public MediaControllerImplApi24(Context context, MediaSessionCompat mediasessioncompat)
		{
			super(context, mediasessioncompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat)>
		//    4    6:return          
		}
	}

	static class MediaControllerImplBase
		implements MediaControllerImpl
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			try
			{
				if((mBinder.getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #49  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.addQueueItem(mediadescriptioncompat);
		//   13   28:aload_0         
		//   14   29:getfield        #34  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:invokeinterface #56  <Method void IMediaSession.addQueueItem(MediaDescriptionCompat)>
					return;
		//   17   38:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  18   39:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in addQueueItem.", ((Throwable) (mediadescriptioncompat)));
		//   19   40:ldc1            #58  <String "MediaControllerCompat">
		//   20   42:ldc1            #60  <String "Dead object in addQueueItem.">
		//   21   44:aload_1         
		//   22   45:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   23   48:pop             
			}
		//   24   49:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			try
			{
				if((mBinder.getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #49  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.addQueueItemAt(mediadescriptioncompat, i);
		//   13   28:aload_0         
		//   14   29:getfield        #34  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:iload_2         
		//   17   34:invokeinterface #70  <Method void IMediaSession.addQueueItemAt(MediaDescriptionCompat, int)>
					return;
		//   18   39:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  19   40:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", ((Throwable) (mediadescriptioncompat)));
		//   20   41:ldc1            #58  <String "MediaControllerCompat">
		//   21   43:ldc1            #72  <String "Dead object in addQueueItemAt.">
		//   22   45:aload_1         
		//   23   46:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   24   49:pop             
			}
		//   25   50:return          
		}

		public void adjustVolume(int i, int j)
		{
			try
			{
				mBinder.adjustVolume(i, j, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokeinterface #77  <Method void IMediaSession.adjustVolume(int, int, String)>
				return;
		//    6   12:return          
			}
			catch(RemoteException remoteexception)
		//*   7   13:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in adjustVolume.", ((Throwable) (remoteexception)));
		//    8   14:ldc1            #58  <String "MediaControllerCompat">
		//    9   16:ldc1            #79  <String "Dead object in adjustVolume.">
		//   10   18:aload_3         
		//   11   19:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   12   22:pop             
			}
		//   13   23:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			if(keyevent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("event may not be null.");
		//    2    4:new             #83  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #85  <String "event may not be null.">
		//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.sendMediaButton(keyevent);
		//    7   14:aload_0         
		//    8   15:getfield        #34  <Field IMediaSession mBinder>
		//    9   18:aload_1         
		//   10   19:invokeinterface #89  <Method boolean IMediaSession.sendMediaButton(KeyEvent)>
		//   11   24:pop             
			}
		//*  12   25:goto            38
			// Misplaced declaration of an exception variable
			catch(KeyEvent keyevent)
		//*  13   28:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", ((Throwable) (keyevent)));
		//   14   29:ldc1            #58  <String "MediaControllerCompat">
		//   15   31:ldc1            #91  <String "Dead object in dispatchMediaButtonEvent.">
		//   16   33:aload_1         
		//   17   34:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   18   37:pop             
			}
			return false;
		//   19   38:iconst_0        
		//   20   39:ireturn         
		}

		public Bundle getExtras()
		{
			Bundle bundle;
			try
			{
				bundle = mBinder.getExtras();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #95  <Method Bundle IMediaSession.getExtras()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getExtras.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #97  <String "Dead object in getExtras.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return bundle;
		}

		public long getFlags()
		{
			long l;
			try
			{
				l = mBinder.getFlags();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//    3    9:lstore_1        
			}
		//*   4   10:lload_1         
		//*   5   11:lreturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in getFlags.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #99  <String "Dead object in getFlags.">
		//    9   17:aload_3         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return 0L;
		//   12   22:lconst_0        
		//   13   23:lreturn         
			}
			return l;
		}

		public Object getMediaController()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public MediaMetadataCompat getMetadata()
		{
			MediaMetadataCompat mediametadatacompat;
			try
			{
				mediametadatacompat = mBinder.getMetadata();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #104 <Method MediaMetadataCompat IMediaSession.getMetadata()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getMetadata.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #106 <String "Dead object in getMetadata.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return mediametadatacompat;
		}

		public String getPackageName()
		{
			String s;
			try
			{
				s = mBinder.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #110 <Method String IMediaSession.getPackageName()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getPackageName.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #112 <String "Dead object in getPackageName.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return s;
		}

		public PlaybackInfo getPlaybackInfo()
		{
			Object obj;
			try
			{
				obj = ((Object) (mBinder.getVolumeAttributes()));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #118 <Method ParcelableVolumeInfo IMediaSession.getVolumeAttributes()>
		//    3    9:astore_1        
				obj = ((Object) (new PlaybackInfo(((ParcelableVolumeInfo) (obj)).volumeType, ((ParcelableVolumeInfo) (obj)).audioStream, ((ParcelableVolumeInfo) (obj)).controlType, ((ParcelableVolumeInfo) (obj)).maxVolume, ((ParcelableVolumeInfo) (obj)).currentVolume)));
		//    4   10:new             #120 <Class MediaControllerCompat$PlaybackInfo>
		//    5   13:dup             
		//    6   14:aload_1         
		//    7   15:getfield        #126 <Field int ParcelableVolumeInfo.volumeType>
		//    8   18:aload_1         
		//    9   19:getfield        #129 <Field int ParcelableVolumeInfo.audioStream>
		//   10   22:aload_1         
		//   11   23:getfield        #132 <Field int ParcelableVolumeInfo.controlType>
		//   12   26:aload_1         
		//   13   27:getfield        #135 <Field int ParcelableVolumeInfo.maxVolume>
		//   14   30:aload_1         
		//   15   31:getfield        #138 <Field int ParcelableVolumeInfo.currentVolume>
		//   16   34:invokespecial   #141 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   17   37:astore_1        
			}
		//*  18   38:aload_1         
		//*  19   39:areturn         
			catch(RemoteException remoteexception)
		//*  20   40:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", ((Throwable) (remoteexception)));
		//   21   41:ldc1            #58  <String "MediaControllerCompat">
		//   22   43:ldc1            #143 <String "Dead object in getPlaybackInfo.">
		//   23   45:aload_1         
		//   24   46:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   25   49:pop             
				return null;
		//   26   50:aconst_null     
		//   27   51:areturn         
			}
			return ((PlaybackInfo) (obj));
		}

		public PlaybackStateCompat getPlaybackState()
		{
			PlaybackStateCompat playbackstatecompat;
			try
			{
				playbackstatecompat = mBinder.getPlaybackState();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #147 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #149 <String "Dead object in getPlaybackState.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return playbackstatecompat;
		}

		public List getQueue()
		{
			List list;
			try
			{
				list = mBinder.getQueue();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #153 <Method List IMediaSession.getQueue()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getQueue.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #155 <String "Dead object in getQueue.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return list;
		}

		public CharSequence getQueueTitle()
		{
			CharSequence charsequence;
			try
			{
				charsequence = mBinder.getQueueTitle();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #161 <Method CharSequence IMediaSession.getQueueTitle()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #163 <String "Dead object in getQueueTitle.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return charsequence;
		}

		public int getRatingType()
		{
			int i;
			try
			{
				i = mBinder.getRatingType();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #167 <Method int IMediaSession.getRatingType()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #169 <String "Dead object in getRatingType.">
		//    9   17:aload_2         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return 0;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			}
			return i;
		}

		public int getRepeatMode()
		{
			int i;
			try
			{
				i = mBinder.getRepeatMode();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #172 <Method int IMediaSession.getRepeatMode()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #174 <String "Dead object in getRepeatMode.">
		//    9   17:aload_2         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return -1;
		//   12   22:iconst_m1       
		//   13   23:ireturn         
			}
			return i;
		}

		public PendingIntent getSessionActivity()
		{
			PendingIntent pendingintent;
			try
			{
				pendingintent = mBinder.getLaunchPendingIntent();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #179 <Method PendingIntent IMediaSession.getLaunchPendingIntent()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #181 <String "Dead object in getSessionActivity.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return null;
		//   12   22:aconst_null     
		//   13   23:areturn         
			}
			return pendingintent;
		}

		public int getShuffleMode()
		{
			int i;
			try
			{
				i = mBinder.getShuffleMode();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #184 <Method int IMediaSession.getShuffleMode()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #186 <String "Dead object in getShuffleMode.">
		//    9   17:aload_2         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return -1;
		//   12   22:iconst_m1       
		//   13   23:ireturn         
			}
			return i;
		}

		public TransportControls getTransportControls()
		{
			if(mTransportControls == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
		//*   2    4:ifnonnull       22
				mTransportControls = ((TransportControls) (new TransportControlsBase(mBinder)));
		//    3    7:aload_0         
		//    4    8:new             #192 <Class MediaControllerCompat$TransportControlsBase>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field IMediaSession mBinder>
		//    8   16:invokespecial   #195 <Method void MediaControllerCompat$TransportControlsBase(IMediaSession)>
		//    9   19:putfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
			return mTransportControls;
		//   10   22:aload_0         
		//   11   23:getfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
		//   12   26:areturn         
		}

		public boolean isCaptioningEnabled()
		{
			boolean flag;
			try
			{
				flag = mBinder.isCaptioningEnabled();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #199 <Method boolean IMediaSession.isCaptioningEnabled()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
		//    7   13:ldc1            #58  <String "MediaControllerCompat">
		//    8   15:ldc1            #201 <String "Dead object in isCaptioningEnabled.">
		//    9   17:aload_2         
		//   10   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			}
			return flag;
		}

		public boolean isSessionReady()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void registerCallback(Callback callback, Handler handler)
		{
			if(callback == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("callback may not be null.");
		//    2    4:new             #83  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #206 <String "callback may not be null.">
		//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//    7   14:aload_0         
		//    8   15:getfield        #34  <Field IMediaSession mBinder>
		//    9   18:invokeinterface #210 <Method IBinder IMediaSession.asBinder()>
		//   10   23:aload_1         
		//   11   24:iconst_0        
		//   12   25:invokeinterface #214 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				mBinder.registerCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//   13   30:aload_0         
		//   14   31:getfield        #34  <Field IMediaSession mBinder>
		//   15   34:aload_1         
		//   16   35:invokestatic    #220 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//   17   38:checkcast       #222 <Class IMediaControllerCallback>
		//   18   41:invokeinterface #226 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
				return;
		//   19   46:return          
			}
			// Misplaced declaration of an exception variable
			catch(Handler handler)
		//*  20   47:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (handler)));
		//   21   48:ldc1            #58  <String "MediaControllerCompat">
		//   22   50:ldc1            #228 <String "Dead object in registerCallback.">
		//   23   52:aload_2         
		//   24   53:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   25   56:pop             
			}
			callback.onSessionDestroyed();
		//   26   57:aload_1         
		//   27   58:invokevirtual   #231 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
		//   28   61:return          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			try
			{
				if((mBinder.getFlags() & 4L) == 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #49  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.removeQueueItem(mediadescriptioncompat);
		//   13   28:aload_0         
		//   14   29:getfield        #34  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:invokeinterface #234 <Method void IMediaSession.removeQueueItem(MediaDescriptionCompat)>
					return;
		//   17   38:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  18   39:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", ((Throwable) (mediadescriptioncompat)));
		//   19   40:ldc1            #58  <String "MediaControllerCompat">
		//   20   42:ldc1            #236 <String "Dead object in removeQueueItem.">
		//   21   44:aload_1         
		//   22   45:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   23   48:pop             
			}
		//   24   49:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			try
			{
				mBinder.sendCommand(s, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultreceiver));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:new             #240 <Class MediaSessionCompat$ResultReceiverWrapper>
		//    5    9:dup             
		//    6   10:aload_3         
		//    7   11:invokespecial   #243 <Method void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver)>
		//    8   14:invokeinterface #246 <Method void IMediaSession.sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
				return;
		//    9   19:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  10   20:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in sendCommand.", ((Throwable) (s)));
		//   11   21:ldc1            #58  <String "MediaControllerCompat">
		//   12   23:ldc1            #248 <String "Dead object in sendCommand.">
		//   13   25:aload_1         
		//   14   26:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   15   29:pop             
			}
		//   16   30:return          
		}

		public void setVolumeTo(int i, int j)
		{
			try
			{
				mBinder.setVolumeTo(i, j, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokeinterface #251 <Method void IMediaSession.setVolumeTo(int, int, String)>
				return;
		//    6   12:return          
			}
			catch(RemoteException remoteexception)
		//*   7   13:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", ((Throwable) (remoteexception)));
		//    8   14:ldc1            #58  <String "MediaControllerCompat">
		//    9   16:ldc1            #253 <String "Dead object in setVolumeTo.">
		//   10   18:aload_3         
		//   11   19:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   12   22:pop             
			}
		//   13   23:return          
		}

		public void unregisterCallback(Callback callback)
		{
			if(callback == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("callback may not be null.");
		//    2    4:new             #83  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #206 <String "callback may not be null.">
		//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.unregisterCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//    7   14:aload_0         
		//    8   15:getfield        #34  <Field IMediaSession mBinder>
		//    9   18:aload_1         
		//   10   19:invokestatic    #220 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//   11   22:checkcast       #222 <Class IMediaControllerCallback>
		//   12   25:invokeinterface #258 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
				mBinder.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//   13   30:aload_0         
		//   14   31:getfield        #34  <Field IMediaSession mBinder>
		//   15   34:invokeinterface #210 <Method IBinder IMediaSession.asBinder()>
		//   16   39:aload_1         
		//   17   40:iconst_0        
		//   18   41:invokeinterface #262 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   19   46:pop             
				return;
		//   20   47:return          
			}
			// Misplaced declaration of an exception variable
			catch(Callback callback)
		//*  21   48:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
		//   22   49:ldc1            #58  <String "MediaControllerCompat">
		//   23   51:ldc2            #264 <String "Dead object in unregisterCallback.">
		//   24   54:aload_1         
		//   25   55:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   26   58:pop             
			}
		//   27   59:return          
		}

		private IMediaSession mBinder;
		private TransportControls mTransportControls;

		public MediaControllerImplBase(MediaSessionCompat.Token token)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mBinder = IMediaSession.Stub.asInterface((IBinder)token.getToken());
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method Object MediaSessionCompat$Token.getToken()>
		//    5    9:checkcast       #26  <Class IBinder>
		//    6   12:invokestatic    #32  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
		//    7   15:putfield        #34  <Field IMediaSession mBinder>
		//    8   18:return          
		}
	}

	public static final class PlaybackInfo
	{

		public int getAudioStream()
		{
			return mAudioStream;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int mAudioStream>
		//    2    4:ireturn         
		}

		public int getCurrentVolume()
		{
			return mCurrentVolume;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int mCurrentVolume>
		//    2    4:ireturn         
		}

		public int getMaxVolume()
		{
			return mMaxVolume;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int mMaxVolume>
		//    2    4:ireturn         
		}

		public int getPlaybackType()
		{
			return mPlaybackType;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int mPlaybackType>
		//    2    4:ireturn         
		}

		public int getVolumeControl()
		{
			return mVolumeControl;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int mVolumeControl>
		//    2    4:ireturn         
		}

		public static final int PLAYBACK_TYPE_LOCAL = 1;
		public static final int PLAYBACK_TYPE_REMOTE = 2;
		private final int mAudioStream;
		private final int mCurrentVolume;
		private final int mMaxVolume;
		private final int mPlaybackType;
		private final int mVolumeControl;

		PlaybackInfo(int i, int j, int k, int l, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mPlaybackType = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #24  <Field int mPlaybackType>
			mAudioStream = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int mAudioStream>
			mVolumeControl = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field int mVolumeControl>
			mMaxVolume = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #30  <Field int mMaxVolume>
			mCurrentVolume = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #32  <Field int mCurrentVolume>
		//   17   31:return          
		}
	}

	public static abstract class TransportControls
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

		public abstract void setCaptioningEnabled(boolean flag);

		public abstract void setRating(RatingCompat ratingcompat);

		public abstract void setRating(RatingCompat ratingcompat, Bundle bundle);

		public abstract void setRepeatMode(int i);

		public abstract void setShuffleMode(int i);

		public abstract void skipToNext();

		public abstract void skipToPrevious();

		public abstract void skipToQueueItem(long l);

		public abstract void stop();

		public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

		TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	static class TransportControlsApi21 extends TransportControls
	{

		public void fastForward()
		{
			MediaControllerCompatApi21.TransportControls.fastForward(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #22  <Method void MediaControllerCompatApi21$TransportControls.fastForward(Object)>
		//    3    7:return          
		}

		public void pause()
		{
			MediaControllerCompatApi21.TransportControls.pause(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #25  <Method void MediaControllerCompatApi21$TransportControls.pause(Object)>
		//    3    7:return          
		}

		public void play()
		{
			MediaControllerCompatApi21.TransportControls.play(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #28  <Method void MediaControllerCompatApi21$TransportControls.play(Object)>
		//    3    7:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
		{
			MediaControllerCompatApi21.TransportControls.playFromMediaId(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #33  <Method void MediaControllerCompatApi21$TransportControls.playFromMediaId(Object, String, Bundle)>
		//    5    9:return          
		}

		public void playFromSearch(String s, Bundle bundle)
		{
			MediaControllerCompatApi21.TransportControls.playFromSearch(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #36  <Method void MediaControllerCompatApi21$TransportControls.playFromSearch(Object, String, Bundle)>
		//    5    9:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
		{
			if(uri != null && !Uri.EMPTY.equals(((Object) (uri))))
		//*   0    0:aload_1         
		//*   1    1:ifnull          47
		//*   2    4:getstatic       #44  <Field Uri Uri.EMPTY>
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #48  <Method boolean Uri.equals(Object)>
		//*   5   11:ifeq            17
		//*   6   14:goto            47
			{
				Bundle bundle1 = new Bundle();
		//    7   17:new             #50  <Class Bundle>
		//    8   20:dup             
		//    9   21:invokespecial   #51  <Method void Bundle()>
		//   10   24:astore_3        
				bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
		//   11   25:aload_3         
		//   12   26:ldc1            #53  <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   13   28:aload_1         
		//   14   29:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", ((android.os.Parcelable) (bundle)));
		//   15   32:aload_3         
		//   16   33:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   17   35:aload_2         
		//   18   36:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle1);
		//   19   39:aload_0         
		//   20   40:ldc1            #61  <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//   21   42:aload_3         
		//   22   43:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
				return;
		//   23   46:return          
			} else
			{
				throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
		//   24   47:new             #66  <Class IllegalArgumentException>
		//   25   50:dup             
		//   26   51:ldc1            #68  <String "You must specify a non-empty Uri for playFromUri.">
		//   27   53:invokespecial   #71  <Method void IllegalArgumentException(String)>
		//   28   56:athrow          
			}
		}

		public void prepare()
		{
			sendCustomAction("android.support.v4.media.session.action.PREPARE", ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:ldc1            #74  <String "android.support.v4.media.session.action.PREPARE">
		//    2    3:aconst_null     
		//    3    4:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//    4    7:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", s);
		//    4    8:aload_3         
		//    5    9:ldc1            #77  <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #86  <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", s);
		//    4    8:aload_3         
		//    5    9:ldc1            #89  <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #91  <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
		//    4    8:aload_3         
		//    5    9:ldc1            #53  <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #94  <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void rewind()
		{
			MediaControllerCompatApi21.TransportControls.rewind(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #97  <Method void MediaControllerCompatApi21$TransportControls.rewind(Object)>
		//    3    7:return          
		}

		public void seekTo(long l)
		{
			MediaControllerCompatApi21.TransportControls.seekTo(mControlsObj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:lload_1         
		//    3    5:invokestatic    #102 <Method void MediaControllerCompatApi21$TransportControls.seekTo(Object, long)>
		//    4    8:return          
		}

		public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
		{
			MediaControllerCompat.validateCustomAction(customaction.getAction(), bundle);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #109 <Method String PlaybackStateCompat$CustomAction.getAction()>
		//    2    4:aload_2         
		//    3    5:invokestatic    #112 <Method void MediaControllerCompat.access$100(String, Bundle)>
			MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, customaction.getAction(), bundle);
		//    4    8:aload_0         
		//    5    9:getfield        #16  <Field Object mControlsObj>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #109 <Method String PlaybackStateCompat$CustomAction.getAction()>
		//    8   16:aload_2         
		//    9   17:invokestatic    #114 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
		//   10   20:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
		{
			MediaControllerCompat.validateCustomAction(s, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #112 <Method void MediaControllerCompat.access$100(String, Bundle)>
			MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, s, bundle);
		//    3    5:aload_0         
		//    4    6:getfield        #16  <Field Object mControlsObj>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokestatic    #114 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
		//    8   14:return          
		}

		public void setCaptioningEnabled(boolean flag)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", flag);
		//    4    8:aload_2         
		//    5    9:ldc1            #118 <String "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #122 <Method void Bundle.putBoolean(String, boolean)>
			sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
		//    8   15:aload_0         
		//    9   16:ldc1            #124 <String "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   12   22:return          
		}

		public void setRating(RatingCompat ratingcompat)
		{
			Object obj = mControlsObj;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:astore_2        
			if(ratingcompat != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          17
				ratingcompat = ((RatingCompat) (ratingcompat.getRating()));
		//    5    9:aload_1         
		//    6   10:invokevirtual   #132 <Method Object RatingCompat.getRating()>
		//    7   13:astore_1        
			else
		//*   8   14:goto            19
				ratingcompat = null;
		//    9   17:aconst_null     
		//   10   18:astore_1        
			MediaControllerCompatApi21.TransportControls.setRating(obj, ((Object) (ratingcompat)));
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:invokestatic    #135 <Method void MediaControllerCompatApi21$TransportControls.setRating(Object, Object)>
		//   14   24:return          
		}

		public void setRating(RatingCompat ratingcompat, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ((android.os.Parcelable) (ratingcompat)));
		//    4    8:aload_3         
		//    5    9:ldc1            #138 <String "android.support.v4.media.session.action.ARGUMENT_RATING">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", ((android.os.Parcelable) (bundle)));
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #140 <String "android.support.v4.media.session.action.SET_RATING">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void setRepeatMode(int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
		//    4    8:aload_2         
		//    5    9:ldc1            #144 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #148 <Method void Bundle.putInt(String, int)>
			sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
		//    8   15:aload_0         
		//    9   16:ldc1            #150 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   12   22:return          
		}

		public void setShuffleMode(int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
		//    4    8:aload_2         
		//    5    9:ldc1            #153 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #148 <Method void Bundle.putInt(String, int)>
			sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
		//    8   15:aload_0         
		//    9   16:ldc1            #155 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #64  <Method void sendCustomAction(String, Bundle)>
		//   12   22:return          
		}

		public void skipToNext()
		{
			MediaControllerCompatApi21.TransportControls.skipToNext(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #158 <Method void MediaControllerCompatApi21$TransportControls.skipToNext(Object)>
		//    3    7:return          
		}

		public void skipToPrevious()
		{
			MediaControllerCompatApi21.TransportControls.skipToPrevious(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #161 <Method void MediaControllerCompatApi21$TransportControls.skipToPrevious(Object)>
		//    3    7:return          
		}

		public void skipToQueueItem(long l)
		{
			MediaControllerCompatApi21.TransportControls.skipToQueueItem(mControlsObj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:lload_1         
		//    3    5:invokestatic    #164 <Method void MediaControllerCompatApi21$TransportControls.skipToQueueItem(Object, long)>
		//    4    8:return          
		}

		public void stop()
		{
			MediaControllerCompatApi21.TransportControls.stop(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #167 <Method void MediaControllerCompatApi21$TransportControls.stop(Object)>
		//    3    7:return          
		}

		protected final Object mControlsObj;

		public TransportControlsApi21(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void MediaControllerCompat$TransportControls()>
			mControlsObj = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Object mControlsObj>
		//    5    9:return          
		}
	}

	static class TransportControlsApi23 extends TransportControlsApi21
	{

		public void playFromUri(Uri uri, Bundle bundle)
		{
			MediaControllerCompatApi23.TransportControls.playFromUri(mControlsObj, uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #26  <Method void MediaControllerCompatApi23$TransportControls.playFromUri(Object, Uri, Bundle)>
		//    5    9:return          
		}

		public TransportControlsApi23(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//    3    5:return          
		}
	}

	static class TransportControlsApi24 extends TransportControlsApi23
	{

		public void prepare()
		{
			MediaControllerCompatApi24.TransportControls.prepare(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mControlsObj>
		//    2    4:invokestatic    #25  <Method void MediaControllerCompatApi24$TransportControls.prepare(Object)>
		//    3    7:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromMediaId(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method void MediaControllerCompatApi24$TransportControls.prepareFromMediaId(Object, String, Bundle)>
		//    5    9:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromSearch(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #33  <Method void MediaControllerCompatApi24$TransportControls.prepareFromSearch(Object, String, Bundle)>
		//    5    9:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromUri(mControlsObj, uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #38  <Method void MediaControllerCompatApi24$TransportControls.prepareFromUri(Object, Uri, Bundle)>
		//    5    9:return          
		}

		public TransportControlsApi24(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
		//    3    5:return          
		}
	}

	static class TransportControlsBase extends TransportControls
	{

		public void fastForward()
		{
			try
			{
				mBinder.fastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #24  <Method void IMediaSession.fastForward()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in fastForward.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #28  <String "Dead object in fastForward.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void pause()
		{
			try
			{
				mBinder.pause();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #37  <Method void IMediaSession.pause()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in pause.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #39  <String "Dead object in pause.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void play()
		{
			try
			{
				mBinder.play();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #42  <Method void IMediaSession.play()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in play.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #44  <String "Dead object in play.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
		{
			try
			{
				mBinder.playFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #48  <Method void IMediaSession.playFromMediaId(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", ((Throwable) (s)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #50  <String "Dead object in playFromMediaId.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void playFromSearch(String s, Bundle bundle)
		{
			try
			{
				mBinder.playFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #53  <Method void IMediaSession.playFromSearch(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in playFromSearch.", ((Throwable) (s)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #55  <String "Dead object in playFromSearch.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
		{
			try
			{
				mBinder.playFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #59  <Method void IMediaSession.playFromUri(Uri, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in playFromUri.", ((Throwable) (uri)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #61  <String "Dead object in playFromUri.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void prepare()
		{
			try
			{
				mBinder.prepare();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #64  <Method void IMediaSession.prepare()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in prepare.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #66  <String "Dead object in prepare.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
		{
			try
			{
				mBinder.prepareFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #69  <Method void IMediaSession.prepareFromMediaId(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", ((Throwable) (s)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #71  <String "Dead object in prepareFromMediaId.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
		{
			try
			{
				mBinder.prepareFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #74  <Method void IMediaSession.prepareFromSearch(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", ((Throwable) (s)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #76  <String "Dead object in prepareFromSearch.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
		{
			try
			{
				mBinder.prepareFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #79  <Method void IMediaSession.prepareFromUri(Uri, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", ((Throwable) (uri)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #81  <String "Dead object in prepareFromUri.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void rewind()
		{
			try
			{
				mBinder.rewind();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #84  <Method void IMediaSession.rewind()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in rewind.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #86  <String "Dead object in rewind.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void seekTo(long l)
		{
			try
			{
				mBinder.seekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:lload_1         
		//    3    5:invokeinterface #90  <Method void IMediaSession.seekTo(long)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in seekTo.", ((Throwable) (remoteexception)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #92  <String "Dead object in seekTo.">
		//    8   16:aload_3         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
		{
			sendCustomAction(customaction.getAction(), bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method String PlaybackStateCompat$CustomAction.getAction()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #102 <Method void sendCustomAction(String, Bundle)>
		//    5    9:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
		{
			MediaControllerCompat.validateCustomAction(s, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #105 <Method void MediaControllerCompat.access$100(String, Bundle)>
			try
			{
				mBinder.sendCustomAction(s, bundle);
		//    3    5:aload_0         
		//    4    6:getfield        #16  <Field IMediaSession mBinder>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #106 <Method void IMediaSession.sendCustomAction(String, Bundle)>
				return;
		//    8   16:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   9   17:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", ((Throwable) (s)));
		//   10   18:ldc1            #26  <String "MediaControllerCompat">
		//   11   20:ldc1            #108 <String "Dead object in sendCustomAction.">
		//   12   22:aload_1         
		//   13   23:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   14   26:pop             
			}
		//   15   27:return          
		}

		public void setCaptioningEnabled(boolean flag)
		{
			try
			{
				mBinder.setCaptioningEnabled(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:invokeinterface #112 <Method void IMediaSession.setCaptioningEnabled(boolean)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", ((Throwable) (remoteexception)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #114 <String "Dead object in setCaptioningEnabled.">
		//    8   16:aload_2         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void setRating(RatingCompat ratingcompat)
		{
			try
			{
				mBinder.rate(ratingcompat);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:invokeinterface #119 <Method void IMediaSession.rate(RatingCompat)>
				return;
		//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(RatingCompat ratingcompat)
		//*   5   11:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in setRating.", ((Throwable) (ratingcompat)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #121 <String "Dead object in setRating.">
		//    8   16:aload_1         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void setRating(RatingCompat ratingcompat, Bundle bundle)
		{
			try
			{
				mBinder.rateWithExtras(ratingcompat, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #125 <Method void IMediaSession.rateWithExtras(RatingCompat, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(RatingCompat ratingcompat)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in setRating.", ((Throwable) (ratingcompat)));
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:ldc1            #121 <String "Dead object in setRating.">
		//    9   17:aload_1         
		//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   11   21:pop             
			}
		//   12   22:return          
		}

		public void setRepeatMode(int i)
		{
			try
			{
				mBinder.setRepeatMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:invokeinterface #129 <Method void IMediaSession.setRepeatMode(int)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", ((Throwable) (remoteexception)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #131 <String "Dead object in setRepeatMode.">
		//    8   16:aload_2         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void setShuffleMode(int i)
		{
			try
			{
				mBinder.setShuffleMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:invokeinterface #134 <Method void IMediaSession.setShuffleMode(int)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_2        
			{
				Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", ((Throwable) (remoteexception)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #136 <String "Dead object in setShuffleMode.">
		//    8   16:aload_2         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void skipToNext()
		{
			try
			{
				mBinder.next();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #140 <Method void IMediaSession.next()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in skipToNext.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #142 <String "Dead object in skipToNext.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void skipToPrevious()
		{
			try
			{
				mBinder.previous();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #146 <Method void IMediaSession.previous()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #148 <String "Dead object in skipToPrevious.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		public void skipToQueueItem(long l)
		{
			try
			{
				mBinder.skipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:lload_1         
		//    3    5:invokeinterface #151 <Method void IMediaSession.skipToQueueItem(long)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", ((Throwable) (remoteexception)));
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:ldc1            #153 <String "Dead object in skipToQueueItem.">
		//    8   16:aload_3         
		//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//   10   20:pop             
			}
		//   11   21:return          
		}

		public void stop()
		{
			try
			{
				mBinder.stop();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #156 <Method void IMediaSession.stop()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in stop.", ((Throwable) (remoteexception)));
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:ldc1            #158 <String "Dead object in stop.">
		//    7   15:aload_1         
		//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
		//    9   19:pop             
			}
		//   10   20:return          
		}

		private IMediaSession mBinder;

		public TransportControlsBase(IMediaSession imediasession)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void MediaControllerCompat$TransportControls()>
			mBinder = imediasession;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field IMediaSession mBinder>
		//    5    9:return          
		}
	}


	public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
		throws RemoteException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		mRegisteredCallbacks = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #100 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #101 <Method void HashSet()>
	//    6   12:putfield        #103 <Field HashSet mRegisteredCallbacks>
		if(token == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("sessionToken must not be null");
	//    9   19:new             #105 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #107 <String "sessionToken must not be null">
	//   12   25:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		mToken = token;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #112 <Field MediaSessionCompat$Token mToken>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  17   34:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   37:bipush          24
	//*  19   39:icmplt          56
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi24(context, token)));
	//   20   42:aload_0         
	//   21   43:new             #36  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   22   46:dup             
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokespecial   #120 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
	//   26   52:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   27   55:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  28   56:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   59:bipush          23
	//*  30   61:icmplt          78
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi23(context, token)));
	//   31   64:aload_0         
	//   32   65:new             #33  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   33   68:dup             
	//   34   69:aload_1         
	//   35   70:aload_2         
	//   36   71:invokespecial   #123 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
	//   37   74:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   38   77:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  39   78:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  40   81:bipush          21
	//*  41   83:icmplt          100
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi21(context, token)));
	//   42   86:aload_0         
	//   43   87:new             #24  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   44   90:dup             
	//   45   91:aload_1         
	//   46   92:aload_2         
	//   47   93:invokespecial   #124 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   48   96:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   49   99:return          
		} else
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplBase(mToken)));
	//   50  100:aload_0         
	//   51  101:new             #39  <Class MediaControllerCompat$MediaControllerImplBase>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:getfield        #112 <Field MediaSessionCompat$Token mToken>
	//   55  109:invokespecial   #127 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   56  112:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   57  115:return          
		}
	}

	public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		mRegisteredCallbacks = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #100 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #101 <Method void HashSet()>
	//    6   12:putfield        #103 <Field HashSet mRegisteredCallbacks>
		if(mediasessioncompat == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("session must not be null");
	//    9   19:new             #105 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #133 <String "session must not be null">
	//   12   25:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		mToken = mediasessioncompat.getSessionToken();
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:invokevirtual   #139 <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
	//   17   34:putfield        #112 <Field MediaSessionCompat$Token mToken>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  18   37:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   40:bipush          24
	//*  20   42:icmplt          59
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi24(context, mediasessioncompat)));
	//   21   45:aload_0         
	//   22   46:new             #36  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   23   49:dup             
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokespecial   #141 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat)>
	//   27   55:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   28   58:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  29   59:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   62:bipush          23
	//*  31   64:icmplt          81
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi23(context, mediasessioncompat)));
	//   32   67:aload_0         
	//   33   68:new             #33  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   34   71:dup             
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:invokespecial   #142 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat)>
	//   38   77:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   39   80:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  40   81:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   84:bipush          21
	//*  42   86:icmplt          103
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi21(context, mediasessioncompat)));
	//   43   89:aload_0         
	//   44   90:new             #24  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   45   93:dup             
	//   46   94:aload_1         
	//   47   95:aload_2         
	//   48   96:invokespecial   #143 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat)>
	//   49   99:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   50  102:return          
		} else
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplBase(mToken)));
	//   51  103:aload_0         
	//   52  104:new             #39  <Class MediaControllerCompat$MediaControllerImplBase>
	//   53  107:dup             
	//   54  108:aload_0         
	//   55  109:getfield        #112 <Field MediaSessionCompat$Token mToken>
	//   56  112:invokespecial   #127 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   57  115:putfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   58  118:return          
		}
	}

	public static MediaControllerCompat getMediaController(Activity activity)
	{
		Object obj;
		boolean flag = activity instanceof SupportActivity;
	//    0    0:aload_0         
	//    1    1:instanceof      #152 <Class SupportActivity>
	//    2    4:istore_1        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            37
		{
			MediaControllerExtraData mediacontrollerextradata = (MediaControllerExtraData)((SupportActivity)activity).getExtraData(android/support/v4/media/session/MediaControllerCompat$MediaControllerExtraData);
	//    7   11:aload_0         
	//    8   12:checkcast       #152 <Class SupportActivity>
	//    9   15:ldc1            #18  <Class MediaControllerCompat$MediaControllerExtraData>
	//   10   17:invokevirtual   #156 <Method android.support.v4.app.SupportActivity$ExtraData SupportActivity.getExtraData(Class)>
	//   11   20:checkcast       #18  <Class MediaControllerCompat$MediaControllerExtraData>
	//   12   23:astore_3        
			activity = ((Activity) (obj));
	//   13   24:aload_2         
	//   14   25:astore_0        
			if(mediacontrollerextradata != null)
	//*  15   26:aload_3         
	//*  16   27:ifnull          35
				activity = ((Activity) (mediacontrollerextradata.getMediaController()));
	//   17   30:aload_3         
	//   18   31:invokevirtual   #159 <Method MediaControllerCompat MediaControllerCompat$MediaControllerExtraData.getMediaController()>
	//   19   34:astore_0        
			return ((MediaControllerCompat) (activity));
	//   20   35:aload_0         
	//   21   36:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_86;
	//   22   37:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//   23   40:bipush          21
	//   24   42:icmplt          86
		obj = MediaControllerCompatApi21.getMediaController(activity);
	//   25   45:aload_0         
	//   26   46:invokestatic    #164 <Method Object MediaControllerCompatApi21.getMediaController(Activity)>
	//   27   49:astore_2        
		if(obj == null)
	//*  28   50:aload_2         
	//*  29   51:ifnonnull       56
			return null;
	//   30   54:aconst_null     
	//   31   55:areturn         
		obj = MediaControllerCompatApi21.getSessionToken(obj);
	//   32   56:aload_2         
	//   33   57:invokestatic    #167 <Method Object MediaControllerCompatApi21.getSessionToken(Object)>
	//   34   60:astore_2        
		activity = ((Activity) (new MediaControllerCompat(((Context) (activity)), MediaSessionCompat.Token.fromToken(obj))));
	//   35   61:new             #2   <Class MediaControllerCompat>
	//   36   64:dup             
	//   37   65:aload_0         
	//   38   66:aload_2         
	//   39   67:invokestatic    #173 <Method MediaSessionCompat$Token MediaSessionCompat$Token.fromToken(Object)>
	//   40   70:invokespecial   #174 <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
	//   41   73:astore_0        
		return ((MediaControllerCompat) (activity));
	//   42   74:aload_0         
	//   43   75:areturn         
		activity;
	//   44   76:astore_0        
		Log.e("MediaControllerCompat", "Dead object in getMediaController.", ((Throwable) (activity)));
	//   45   77:ldc1            #83  <String "MediaControllerCompat">
	//   46   79:ldc1            #176 <String "Dead object in getMediaController.">
	//   47   81:aload_0         
	//   48   82:invokestatic    #182 <Method int Log.e(String, String, Throwable)>
	//   49   85:pop             
		return null;
	//   50   86:aconst_null     
	//   51   87:areturn         
	}

	public static void setMediaController(Activity activity, MediaControllerCompat mediacontrollercompat)
	{
		if(activity instanceof SupportActivity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #152 <Class SupportActivity>
	//*   2    4:ifeq            22
			((SupportActivity)activity).putExtraData(((android.support.v4.app.SupportActivity.ExtraData) (new MediaControllerExtraData(mediacontrollercompat))));
	//    3    7:aload_0         
	//    4    8:checkcast       #152 <Class SupportActivity>
	//    5   11:new             #18  <Class MediaControllerCompat$MediaControllerExtraData>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #187 <Method void MediaControllerCompat$MediaControllerExtraData(MediaControllerCompat)>
	//    9   19:invokevirtual   #191 <Method void SupportActivity.putExtraData(android.support.v4.app.SupportActivity$ExtraData)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  10   22:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   25:bipush          21
	//*  12   27:icmplt          53
		{
			Object obj = null;
	//   13   30:aconst_null     
	//   14   31:astore_2        
			if(mediacontrollercompat != null)
	//*  15   32:aload_1         
	//*  16   33:ifnull          48
				obj = MediaControllerCompatApi21.fromToken(((Context) (activity)), mediacontrollercompat.getSessionToken().getToken());
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #192 <Method MediaSessionCompat$Token getSessionToken()>
	//   20   41:invokevirtual   #196 <Method Object MediaSessionCompat$Token.getToken()>
	//   21   44:invokestatic    #199 <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
	//   22   47:astore_2        
			MediaControllerCompatApi21.setMediaController(activity, obj);
	//   23   48:aload_0         
	//   24   49:aload_2         
	//   25   50:invokestatic    #202 <Method void MediaControllerCompatApi21.setMediaController(Activity, Object)>
		}
	//   26   53:return          
	}

	private static void validateCustomAction(String s, Bundle bundle)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		int i = s.hashCode();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #208 <Method int String.hashCode()>
	//    7   11:istore_3        
		if(i != 0xaf9fc575)
	//*   8   12:iload_3         
	//*   9   13:ldc1            #209 <Int 0xaf9fc575>
	//*  10   15:icmpeq          41
		{
			if(i == 0x1dfb584e && s.equals("android.support.v4.media.session.action.UNFOLLOW"))
	//*  11   18:iload_3         
	//*  12   19:ldc1            #210 <Int 0x1dfb584e>
	//*  13   21:icmpeq          27
	//*  14   24:goto            52
	//*  15   27:aload_0         
	//*  16   28:ldc1            #212 <String "android.support.v4.media.session.action.UNFOLLOW">
	//*  17   30:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  18   33:ifeq            52
				byte0 = 1;
	//   19   36:iconst_1        
	//   20   37:istore_2        
		} else
	//*  21   38:goto            52
		if(s.equals("android.support.v4.media.session.action.FOLLOW"))
	//*  22   41:aload_0         
	//*  23   42:ldc1            #218 <String "android.support.v4.media.session.action.FOLLOW">
	//*  24   44:invokevirtual   #216 <Method boolean String.equals(Object)>
	//*  25   47:ifeq            52
			byte0 = 0;
	//   26   50:iconst_0        
	//   27   51:istore_2        
		switch(byte0)
	//*  28   52:iload_2         
		{
	//*  29   53:tableswitch     0 1: default 76
	//	               0 77
	//	               1 77
		default:
			return;
	//   30   76:return          

		case 0: // '\0'
		case 1: // '\001'
			break;
		}
		if(bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"))
	//*  31   77:aload_1         
	//*  32   78:ifnull          90
	//*  33   81:aload_1         
	//*  34   82:ldc1            #220 <String "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE">
	//*  35   84:invokevirtual   #226 <Method boolean Bundle.containsKey(String)>
	//*  36   87:ifne            130
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   37   90:new             #228 <Class StringBuilder>
	//   38   93:dup             
	//   39   94:invokespecial   #229 <Method void StringBuilder()>
	//   40   97:astore_1        
			((StringBuilder) (bundle)).append("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
	//   41   98:aload_1         
	//   42   99:ldc1            #231 <String "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ">
	//   43  101:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   44  104:pop             
			((StringBuilder) (bundle)).append(s);
	//   45  105:aload_1         
	//   46  106:aload_0         
	//   47  107:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   48  110:pop             
			((StringBuilder) (bundle)).append(".");
	//   49  111:aload_1         
	//   50  112:ldc1            #237 <String ".">
	//   51  114:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   52  117:pop             
			throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   53  118:new             #105 <Class IllegalArgumentException>
	//   54  121:dup             
	//   55  122:aload_1         
	//   56  123:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   57  126:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   58  129:athrow          
		} else
		{
			return;
	//   59  130:return          
		}
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.addQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #245 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		mImpl.addQueueItem(mediadescriptioncompat, i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #248 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat, int)>
	//    5   11:return          
	}

	public void adjustVolume(int i, int j)
	{
		mImpl.adjustVolume(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #252 <Method void MediaControllerCompat$MediaControllerImpl.adjustVolume(int, int)>
	//    5   11:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("KeyEvent may not be null");
	//    2    4:new             #105 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #256 <String "KeyEvent may not be null">
	//    5   11:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		else
			return mImpl.dispatchMediaButtonEvent(keyevent);
	//    7   15:aload_0         
	//    8   16:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    9   19:aload_1         
	//   10   20:invokeinterface #258 <Method boolean MediaControllerCompat$MediaControllerImpl.dispatchMediaButtonEvent(KeyEvent)>
	//   11   25:ireturn         
	}

	public Bundle getExtras()
	{
		return mImpl.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #262 <Method Bundle MediaControllerCompat$MediaControllerImpl.getExtras()>
	//    3    9:areturn         
	}

	public long getFlags()
	{
		return mImpl.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #266 <Method long MediaControllerCompat$MediaControllerImpl.getFlags()>
	//    3    9:lreturn         
	}

	public Object getMediaController()
	{
		return mImpl.getMediaController();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #268 <Method Object MediaControllerCompat$MediaControllerImpl.getMediaController()>
	//    3    9:areturn         
	}

	public MediaMetadataCompat getMetadata()
	{
		return mImpl.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #272 <Method MediaMetadataCompat MediaControllerCompat$MediaControllerImpl.getMetadata()>
	//    3    9:areturn         
	}

	public String getPackageName()
	{
		return mImpl.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #275 <Method String MediaControllerCompat$MediaControllerImpl.getPackageName()>
	//    3    9:areturn         
	}

	public PlaybackInfo getPlaybackInfo()
	{
		return mImpl.getPlaybackInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #279 <Method MediaControllerCompat$PlaybackInfo MediaControllerCompat$MediaControllerImpl.getPlaybackInfo()>
	//    3    9:areturn         
	}

	public PlaybackStateCompat getPlaybackState()
	{
		return mImpl.getPlaybackState();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #283 <Method PlaybackStateCompat MediaControllerCompat$MediaControllerImpl.getPlaybackState()>
	//    3    9:areturn         
	}

	public List getQueue()
	{
		return mImpl.getQueue();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #287 <Method List MediaControllerCompat$MediaControllerImpl.getQueue()>
	//    3    9:areturn         
	}

	public CharSequence getQueueTitle()
	{
		return mImpl.getQueueTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #293 <Method CharSequence MediaControllerCompat$MediaControllerImpl.getQueueTitle()>
	//    3    9:areturn         
	}

	public int getRatingType()
	{
		return mImpl.getRatingType();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #296 <Method int MediaControllerCompat$MediaControllerImpl.getRatingType()>
	//    3    9:ireturn         
	}

	public int getRepeatMode()
	{
		return mImpl.getRepeatMode();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #299 <Method int MediaControllerCompat$MediaControllerImpl.getRepeatMode()>
	//    3    9:ireturn         
	}

	public PendingIntent getSessionActivity()
	{
		return mImpl.getSessionActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #303 <Method PendingIntent MediaControllerCompat$MediaControllerImpl.getSessionActivity()>
	//    3    9:areturn         
	}

	public MediaSessionCompat.Token getSessionToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public int getShuffleMode()
	{
		return mImpl.getShuffleMode();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #306 <Method int MediaControllerCompat$MediaControllerImpl.getShuffleMode()>
	//    3    9:ireturn         
	}

	public TransportControls getTransportControls()
	{
		return mImpl.getTransportControls();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #310 <Method MediaControllerCompat$TransportControls MediaControllerCompat$MediaControllerImpl.getTransportControls()>
	//    3    9:areturn         
	}

	public boolean isCaptioningEnabled()
	{
		return mImpl.isCaptioningEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #314 <Method boolean MediaControllerCompat$MediaControllerImpl.isCaptioningEnabled()>
	//    3    9:ireturn         
	}

	public boolean isSessionReady()
	{
		return mImpl.isSessionReady();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #317 <Method boolean MediaControllerCompat$MediaControllerImpl.isSessionReady()>
	//    3    9:ireturn         
	}

	public void registerCallback(Callback callback)
	{
		registerCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #322 <Method void registerCallback(MediaControllerCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void registerCallback(Callback callback, Handler handler)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("callback must not be null");
	//    2    4:new             #105 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #324 <String "callback must not be null">
	//    5   11:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		Handler handler1 = handler;
	//    7   15:aload_2         
	//    8   16:astore_3        
		if(handler == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       29
			handler1 = new Handler();
	//   11   21:new             #326 <Class Handler>
	//   12   24:dup             
	//   13   25:invokespecial   #327 <Method void Handler()>
	//   14   28:astore_3        
		callback.setHandler(handler1);
	//   15   29:aload_1         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #331 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
		mImpl.registerCallback(callback, handler1);
	//   18   34:aload_0         
	//   19   35:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   20   38:aload_1         
	//   21   39:aload_3         
	//   22   40:invokeinterface #332 <Method void MediaControllerCompat$MediaControllerImpl.registerCallback(MediaControllerCompat$Callback, Handler)>
		mRegisteredCallbacks.add(((Object) (callback)));
	//   23   45:aload_0         
	//   24   46:getfield        #103 <Field HashSet mRegisteredCallbacks>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #335 <Method boolean HashSet.add(Object)>
	//   27   53:pop             
	//   28   54:return          
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.removeQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #338 <Method void MediaControllerCompat$MediaControllerImpl.removeQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void removeQueueItemAt(int i)
	{
		Object obj = ((Object) (getQueue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method List getQueue()>
	//    2    4:astore_2        
		if(obj != null && i >= 0 && i < ((List) (obj)).size())
	//*   3    5:aload_2         
	//*   4    6:ifnull          46
	//*   5    9:iload_1         
	//*   6   10:iflt            46
	//*   7   13:iload_1         
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #347 <Method int List.size()>
	//*  10   20:icmpge          46
		{
			obj = ((Object) ((MediaSessionCompat.QueueItem)((List) (obj)).get(i)));
	//   11   23:aload_2         
	//   12   24:iload_1         
	//   13   25:invokeinterface #351 <Method Object List.get(int)>
	//   14   30:checkcast       #353 <Class MediaSessionCompat$QueueItem>
	//   15   33:astore_2        
			if(obj != null)
	//*  16   34:aload_2         
	//*  17   35:ifnull          46
				removeQueueItem(((MediaSessionCompat.QueueItem) (obj)).getDescription());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #357 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//   21   43:invokevirtual   #358 <Method void removeQueueItem(MediaDescriptionCompat)>
		}
	//   22   46:return          
	}

	public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #367 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
		{
			throw new IllegalArgumentException("command must neither be null nor empty");
	//    3    7:new             #105 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #369 <String "command must neither be null nor empty">
	//    6   14:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		} else
		{
			mImpl.sendCommand(s, bundle, resultreceiver);
	//    8   18:aload_0         
	//    9   19:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokeinterface #371 <Method void MediaControllerCompat$MediaControllerImpl.sendCommand(String, Bundle, ResultReceiver)>
			return;
	//   14   30:return          
		}
	}

	public void setVolumeTo(int i, int j)
	{
		mImpl.setVolumeTo(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #374 <Method void MediaControllerCompat$MediaControllerImpl.setVolumeTo(int, int)>
	//    5   11:return          
	}

	public void unregisterCallback(Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("callback must not be null");
	//    2    4:new             #105 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #324 <String "callback must not be null">
	//    5   11:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		mRegisteredCallbacks.remove(((Object) (callback)));
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field HashSet mRegisteredCallbacks>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #378 <Method boolean HashSet.remove(Object)>
	//   11   23:pop             
		mImpl.unregisterCallback(callback);
	//   12   24:aload_0         
	//   13   25:getfield        #122 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   14   28:aload_1         
	//   15   29:invokeinterface #380 <Method void MediaControllerCompat$MediaControllerImpl.unregisterCallback(MediaControllerCompat$Callback)>
		callback.setHandler(((Handler) (null)));
	//   16   34:aload_1         
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #331 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
		return;
	//   19   39:return          
		Exception exception;
		exception;
	//   20   40:astore_2        
		callback.setHandler(((Handler) (null)));
	//   21   41:aload_1         
	//   22   42:aconst_null     
	//   23   43:invokevirtual   #331 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
		throw exception;
	//   24   46:aload_2         
	//   25   47:athrow          
	}

	static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
	static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
	static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
	static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
	static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
	static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
	static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
	static final String TAG = "MediaControllerCompat";
	private final MediaControllerImpl mImpl;
	private final HashSet mRegisteredCallbacks;
	private final MediaSessionCompat.Token mToken;


/*
	static void access$100(String s, Bundle bundle)
	{
		validateCustomAction(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #148 <Method void validateCustomAction(String, Bundle)>
		return;
	//    3    5:return          
	}

*/
}

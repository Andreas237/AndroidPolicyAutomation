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
//			MediaSessionCompat, MediaControllerCompatApi21, PlaybackStateCompat, IMediaControllerCallback, 
//			ParcelableVolumeInfo, IMediaSession

public final class MediaControllerCompat
{
	public static abstract class Callback
		implements android.os.IBinder.DeathRecipient
	{

		public void binderDied()
		{
			postToHandler(8, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:aconst_null     
		//    3    4:aconst_null     
		//    4    5:invokevirtual   #54  <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public IMediaControllerCallback getIControllerCallback()
		{
			return mIControllerCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field IMediaControllerCallback mIControllerCallback>
		//    2    4:areturn         
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
			MessageHandler messagehandler = mHandler;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    2    4:astore          4
			if(messagehandler != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          28
			{
				obj = ((Object) (messagehandler.obtainMessage(i, obj)));
		//    5   11:aload           4
		//    6   13:iload_1         
		//    7   14:aload_2         
		//    8   15:invokevirtual   #90  <Method Message MediaControllerCompat$Callback$MessageHandler.obtainMessage(int, Object)>
		//    9   18:astore_2        
				((Message) (obj)).setData(bundle);
		//   10   19:aload_2         
		//   11   20:aload_3         
		//   12   21:invokevirtual   #95  <Method void Message.setData(Bundle)>
				((Message) (obj)).sendToTarget();
		//   13   24:aload_2         
		//   14   25:invokevirtual   #98  <Method void Message.sendToTarget()>
			}
		//   15   28:return          
		}

		void setHandler(Handler handler)
		{
			if(handler == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       29
			{
				handler = ((Handler) (mHandler));
		//    2    4:aload_0         
		//    3    5:getfield        #86  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    4    8:astore_1        
				if(handler != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          53
				{
					handler.mRegistered = false;
		//    7   13:aload_1         
		//    8   14:iconst_0        
		//    9   15:putfield        #104 <Field boolean MediaControllerCompat$Callback$MessageHandler.mRegistered>
					((MessageHandler) (handler)).removeCallbacksAndMessages(((Object) (null)));
		//   10   18:aload_1         
		//   11   19:aconst_null     
		//   12   20:invokevirtual   #108 <Method void MediaControllerCompat$Callback$MessageHandler.removeCallbacksAndMessages(Object)>
					mHandler = null;
		//   13   23:aload_0         
		//   14   24:aconst_null     
		//   15   25:putfield        #86  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
					return;
		//   16   28:return          
				}
			} else
			{
				mHandler = new MessageHandler(handler.getLooper());
		//   17   29:aload_0         
		//   18   30:new             #11  <Class MediaControllerCompat$Callback$MessageHandler>
		//   19   33:dup             
		//   20   34:aload_0         
		//   21   35:aload_1         
		//   22   36:invokevirtual   #114 <Method Looper Handler.getLooper()>
		//   23   39:invokespecial   #117 <Method void MediaControllerCompat$Callback$MessageHandler(MediaControllerCompat$Callback, Looper)>
		//   24   42:putfield        #86  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
				mHandler.mRegistered = true;
		//   25   45:aload_0         
		//   26   46:getfield        #86  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//   27   49:iconst_1        
		//   28   50:putfield        #104 <Field boolean MediaControllerCompat$Callback$MessageHandler.mRegistered>
			}
		//   29   53:return          
		}

		final Object mCallbackObj;
		MessageHandler mHandler;
		IMediaControllerCallback mIControllerCallback;

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
				StubCompat stubcompat = new StubCompat(this);
		//   13   28:new             #17  <Class MediaControllerCompat$Callback$StubCompat>
		//   14   31:dup             
		//   15   32:aload_0         
		//   16   33:invokespecial   #46  <Method void MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback)>
		//   17   36:astore_1        
				mIControllerCallback = ((IMediaControllerCallback) (stubcompat));
		//   18   37:aload_0         
		//   19   38:aload_1         
		//   20   39:putfield        #48  <Field IMediaControllerCallback mIControllerCallback>
				mCallbackObj = ((Object) (stubcompat));
		//   21   42:aload_0         
		//   22   43:aload_1         
		//   23   44:putfield        #45  <Field Object mCallbackObj>
				return;
		//   24   47:return          
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
		//		               1 247
		//		               2 232
		//		               3 217
		//		               4 202
		//		               5 187
		//		               6 172
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
				message = ((Message) ((Bundle)message.obj));
		//   40  151:aload_1         
		//   41  152:getfield        #64  <Field Object Message.obj>
		//   42  155:checkcast       #92  <Class Bundle>
		//   43  158:astore_1        
				MediaSessionCompat.ensureClassLoader(((Bundle) (message)));
		//   44  159:aload_1         
		//   45  160:invokestatic    #98  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				onExtrasChanged(((Bundle) (message)));
		//   46  163:aload_0         
		//   47  164:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   48  167:aload_1         
		//   49  168:invokevirtual   #101 <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
				return;
		//   50  171:return          

			case 6: // '\006'
				onQueueTitleChanged((CharSequence)message.obj);
		//   51  172:aload_0         
		//   52  173:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   53  176:aload_1         
		//   54  177:getfield        #64  <Field Object Message.obj>
		//   55  180:checkcast       #103 <Class CharSequence>
		//   56  183:invokevirtual   #107 <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
				return;
		//   57  186:return          

			case 5: // '\005'
				onQueueChanged((List)message.obj);
		//   58  187:aload_0         
		//   59  188:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   60  191:aload_1         
		//   61  192:getfield        #64  <Field Object Message.obj>
		//   62  195:checkcast       #109 <Class List>
		//   63  198:invokevirtual   #113 <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
				return;
		//   64  201:return          

			case 4: // '\004'
				onAudioInfoChanged((PlaybackInfo)message.obj);
		//   65  202:aload_0         
		//   66  203:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   67  206:aload_1         
		//   68  207:getfield        #64  <Field Object Message.obj>
		//   69  210:checkcast       #115 <Class MediaControllerCompat$PlaybackInfo>
		//   70  213:invokevirtual   #119 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
				return;
		//   71  216:return          

			case 3: // '\003'
				onMetadataChanged((MediaMetadataCompat)message.obj);
		//   72  217:aload_0         
		//   73  218:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   74  221:aload_1         
		//   75  222:getfield        #64  <Field Object Message.obj>
		//   76  225:checkcast       #121 <Class MediaMetadataCompat>
		//   77  228:invokevirtual   #125 <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
				return;
		//   78  231:return          

			case 2: // '\002'
				onPlaybackStateChanged((PlaybackStateCompat)message.obj);
		//   79  232:aload_0         
		//   80  233:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   81  236:aload_1         
		//   82  237:getfield        #64  <Field Object Message.obj>
		//   83  240:checkcast       #127 <Class PlaybackStateCompat>
		//   84  243:invokevirtual   #131 <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				return;
		//   85  246:return          

			case 1: // '\001'
				Bundle bundle = message.getData();
		//   86  247:aload_1         
		//   87  248:invokevirtual   #135 <Method Bundle Message.getData()>
		//   88  251:astore_2        
				MediaSessionCompat.ensureClassLoader(bundle);
		//   89  252:aload_2         
		//   90  253:invokestatic    #98  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				onSessionEvent((String)message.obj, bundle);
		//   91  256:aload_0         
		//   92  257:getfield        #43  <Field MediaControllerCompat$Callback this$0>
		//   93  260:aload_1         
		//   94  261:getfield        #64  <Field Object Message.obj>
		//   95  264:checkcast       #137 <Class String>
		//   96  267:aload_2         
		//   97  268:invokevirtual   #141 <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   98  271:return          
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
				if(callback.mIControllerCallback != null)
		//*   7   15:aload_2         
		//*   8   16:getfield        #60  <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
		//*   9   19:ifnull          23
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
				if(callback.mIControllerCallback != null && android.os.Build.VERSION.SDK_INT < 23)
		//*   7   15:aload_3         
		//*   8   16:getfield        #60  <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
		//*   9   19:ifnull          31
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

		private void requestExtraBinder()
		{
			sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver(this))));
		//    0    0:aload_0         
		//    1    1:ldc1            #77  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:aconst_null     
		//    3    4:new             #11  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
		//    4    7:dup             
		//    5    8:aload_0         
		//    6    9:invokespecial   #80  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21)>
		//    7   12:invokevirtual   #84  <Method void sendCommand(String, Bundle, ResultReceiver)>
		//    8   15:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #90  <Method long getFlags()>
		//*   2    4:ldc2w           #91  <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            37
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #94  <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #95  <Method void Bundle()>
		//   10   20:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_2         
		//   12   22:ldc1            #97  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #101 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   15   28:aload_0         
		//   16   29:ldc1            #103 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//   17   31:aload_2         
		//   18   32:aconst_null     
		//   19   33:invokevirtual   #84  <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   20   36:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   21   37:new             #105 <Class UnsupportedOperationException>
		//   22   40:dup             
		//   23   41:ldc1            #107 <String "This session doesn't support queue management operations">
		//   24   43:invokespecial   #110 <Method void UnsupportedOperationException(String)>
		//   25   46:athrow          
			}
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #90  <Method long getFlags()>
		//*   2    4:ldc2w           #91  <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            44
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #94  <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #95  <Method void Bundle()>
		//   10   20:astore_3        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_3         
		//   12   22:ldc1            #97  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #101 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
		//   15   28:aload_3         
		//   16   29:ldc1            #113 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   17   31:iload_2         
		//   18   32:invokevirtual   #117 <Method void Bundle.putInt(String, int)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
		//   19   35:aload_0         
		//   20   36:ldc1            #119 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//   21   38:aload_3         
		//   22   39:aconst_null     
		//   23   40:invokevirtual   #84  <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   24   43:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   25   44:new             #105 <Class UnsupportedOperationException>
		//   26   47:dup             
		//   27   48:ldc1            #107 <String "This session doesn't support queue management operations">
		//   28   50:invokespecial   #110 <Method void UnsupportedOperationException(String)>
		//   29   53:athrow          
			}
		}

		public void adjustVolume(int i, int j)
		{
			MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #124 <Method void MediaControllerCompatApi21.adjustVolume(Object, int, int)>
		//    5    9:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #129 <Method boolean MediaControllerCompatApi21.dispatchMediaButtonEvent(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		public Bundle getExtras()
		{
			return MediaControllerCompatApi21.getExtras(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #134 <Method Bundle MediaControllerCompatApi21.getExtras(Object)>
		//    3    7:areturn         
		}

		public long getFlags()
		{
			return MediaControllerCompatApi21.getFlags(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #137 <Method long MediaControllerCompatApi21.getFlags(Object)>
		//    3    7:lreturn         
		}

		public Object getMediaController()
		{
			return mControllerObj;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:areturn         
		}

		public MediaMetadataCompat getMetadata()
		{
			Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #143 <Method Object MediaControllerCompatApi21.getMetadata(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaMetadataCompat.fromMediaMetadata(obj);
		//    6   12:aload_1         
		//    7   13:invokestatic    #149 <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
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
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #154 <Method String MediaControllerCompatApi21.getPackageName(Object)>
		//    3    7:areturn         
		}

		public PlaybackInfo getPlaybackInfo()
		{
			Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #158 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          40
				return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
		//    6   12:new             #160 <Class MediaControllerCompat$PlaybackInfo>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokestatic    #166 <Method int MediaControllerCompatApi21$PlaybackInfo.getPlaybackType(Object)>
		//   10   20:aload_1         
		//   11   21:invokestatic    #169 <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
		//   12   24:aload_1         
		//   13   25:invokestatic    #172 <Method int MediaControllerCompatApi21$PlaybackInfo.getVolumeControl(Object)>
		//   14   28:aload_1         
		//   15   29:invokestatic    #175 <Method int MediaControllerCompatApi21$PlaybackInfo.getMaxVolume(Object)>
		//   16   32:aload_1         
		//   17   33:invokestatic    #178 <Method int MediaControllerCompatApi21$PlaybackInfo.getCurrentVolume(Object)>
		//   18   36:invokespecial   #181 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   19   39:areturn         
			else
				return null;
		//   20   40:aconst_null     
		//   21   41:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			if(mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_35;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    3    7:ifnull          35
			PlaybackStateCompat playbackstatecompat = mSessionToken.getExtraBinder().getPlaybackState();
		//    4   10:aload_0         
		//    5   11:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    6   14:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    7   17:invokeinterface #187 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    8   22:astore_1        
			return playbackstatecompat;
		//    9   23:aload_1         
		//   10   24:areturn         
			RemoteException remoteexception;
			remoteexception;
		//   11   25:astore_1        
			Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
		//   12   26:ldc1            #189 <String "MediaControllerCompat">
		//   13   28:ldc1            #191 <String "Dead object in getPlaybackState.">
		//   14   30:aload_1         
		//   15   31:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   16   34:pop             
			Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
		//   17   35:aload_0         
		//   18   36:getfield        #65  <Field Object mControllerObj>
		//   19   39:invokestatic    #199 <Method Object MediaControllerCompatApi21.getPlaybackState(Object)>
		//   20   42:astore_1        
			if(obj != null)
		//*  21   43:aload_1         
		//*  22   44:ifnull          52
				return PlaybackStateCompat.fromPlaybackState(obj);
		//   23   47:aload_1         
		//   24   48:invokestatic    #205 <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//   25   51:areturn         
			else
				return null;
		//   26   52:aconst_null     
		//   27   53:areturn         
		}

		public List getQueue()
		{
			List list = MediaControllerCompatApi21.getQueue(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #210 <Method List MediaControllerCompatApi21.getQueue(Object)>
		//    3    7:astore_1        
			if(list != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaSessionCompat.QueueItem.fromQueueItemList(list);
		//    6   12:aload_1         
		//    7   13:invokestatic    #216 <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
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
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #223 <Method CharSequence MediaControllerCompatApi21.getQueueTitle(Object)>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			if(android.os.Build.VERSION.SDK_INT >= 22 || mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_43;
		//    0    0:getstatic       #231 <Field int android.os.Build$VERSION.SDK_INT>
		//    1    3:bipush          22
		//    2    5:icmpge          43
		//    3    8:aload_0         
		//    4    9:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    5   12:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    6   15:ifnull          43
			int i = mSessionToken.getExtraBinder().getRatingType();
		//    7   18:aload_0         
		//    8   19:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    9   22:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   10   25:invokeinterface #233 <Method int IMediaSession.getRatingType()>
		//   11   30:istore_1        
			return i;
		//   12   31:iload_1         
		//   13   32:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   14   33:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
		//   15   34:ldc1            #189 <String "MediaControllerCompat">
		//   16   36:ldc1            #235 <String "Dead object in getRatingType.">
		//   17   38:aload_2         
		//   18   39:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   19   42:pop             
			return MediaControllerCompatApi21.getRatingType(mControllerObj);
		//   20   43:aload_0         
		//   21   44:getfield        #65  <Field Object mControllerObj>
		//   22   47:invokestatic    #237 <Method int MediaControllerCompatApi21.getRatingType(Object)>
		//   23   50:ireturn         
		}

		public int getRepeatMode()
		{
			if(mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_35;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    3    7:ifnull          35
			int i = mSessionToken.getExtraBinder().getRepeatMode();
		//    4   10:aload_0         
		//    5   11:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    6   14:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    7   17:invokeinterface #240 <Method int IMediaSession.getRepeatMode()>
		//    8   22:istore_1        
			return i;
		//    9   23:iload_1         
		//   10   24:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   11   25:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
		//   12   26:ldc1            #189 <String "MediaControllerCompat">
		//   13   28:ldc1            #242 <String "Dead object in getRepeatMode.">
		//   14   30:aload_2         
		//   15   31:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   16   34:pop             
			return -1;
		//   17   35:iconst_m1       
		//   18   36:ireturn         
		}

		public PendingIntent getSessionActivity()
		{
			return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #247 <Method PendingIntent MediaControllerCompatApi21.getSessionActivity(Object)>
		//    3    7:areturn         
		}

		public int getShuffleMode()
		{
			if(mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_35;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    3    7:ifnull          35
			int i = mSessionToken.getExtraBinder().getShuffleMode();
		//    4   10:aload_0         
		//    5   11:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    6   14:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    7   17:invokeinterface #250 <Method int IMediaSession.getShuffleMode()>
		//    8   22:istore_1        
			return i;
		//    9   23:iload_1         
		//   10   24:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   11   25:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
		//   12   26:ldc1            #189 <String "MediaControllerCompat">
		//   13   28:ldc1            #252 <String "Dead object in getShuffleMode.">
		//   14   30:aload_2         
		//   15   31:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   16   34:pop             
			return -1;
		//   17   35:iconst_m1       
		//   18   36:ireturn         
		}

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:invokestatic    #256 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi21(obj)));
		//    6   12:new             #258 <Class MediaControllerCompat$TransportControlsApi21>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #261 <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public boolean isCaptioningEnabled()
		{
			if(mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_36;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    3    7:ifnull          36
			boolean flag = mSessionToken.getExtraBinder().isCaptioningEnabled();
		//    4   10:aload_0         
		//    5   11:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    6   14:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    7   17:invokeinterface #265 <Method boolean IMediaSession.isCaptioningEnabled()>
		//    8   22:istore_1        
			return flag;
		//    9   23:iload_1         
		//   10   24:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   11   25:astore_2        
			Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
		//   12   26:ldc1            #189 <String "MediaControllerCompat">
		//   13   28:ldc2            #267 <String "Dead object in isCaptioningEnabled.">
		//   14   31:aload_2         
		//   15   32:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   16   35:pop             
			return false;
		//   17   36:iconst_0        
		//   18   37:ireturn         
		}

		public boolean isSessionReady()
		{
			return mSessionToken.getExtraBinder() != null;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//    2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//    3    7:ifnull          12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		void processPendingCallbacksLocked()
		{
			Iterator iterator;
			if(mSessionToken.getExtraBinder() == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//*   2    4:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//*   3    7:ifnonnull       11
				return;
		//    4   10:return          
			iterator = mPendingCallbacks.iterator();
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field List mPendingCallbacks>
		//    7   15:invokeinterface #275 <Method Iterator List.iterator()>
		//    8   20:astore_1        
_L2:
			Callback callback;
			ExtraCallback extracallback;
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
		//    9   21:aload_1         
		//   10   22:invokeinterface #280 <Method boolean Iterator.hasNext()>
		//   11   27:ifeq            99
			callback = (Callback)iterator.next();
		//   12   30:aload_1         
		//   13   31:invokeinterface #283 <Method Object Iterator.next()>
		//   14   36:checkcast       #285 <Class MediaControllerCompat$Callback>
		//   15   39:astore_2        
			extracallback = new ExtraCallback(callback);
		//   16   40:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   17   43:dup             
		//   18   44:aload_2         
		//   19   45:invokespecial   #288 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   20   48:astore_3        
			mCallbackMap.put(((Object) (callback)), ((Object) (extracallback)));
		//   21   49:aload_0         
		//   22   50:getfield        #49  <Field HashMap mCallbackMap>
		//   23   53:aload_2         
		//   24   54:aload_3         
		//   25   55:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
		//   26   58:pop             
			callback.mIControllerCallback = ((IMediaControllerCallback) (extracallback));
		//   27   59:aload_2         
		//   28   60:aload_3         
		//   29   61:putfield        #296 <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
			mSessionToken.getExtraBinder().registerCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   30   64:aload_0         
		//   31   65:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   32   68:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   33   71:aload_3         
		//   34   72:invokeinterface #300 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			callback.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//   35   77:aload_2         
		//   36   78:bipush          13
		//   37   80:aconst_null     
		//   38   81:aconst_null     
		//   39   82:invokevirtual   #304 <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
			if(true) goto _L2; else goto _L1
		//   40   85:goto            21
			RemoteException remoteexception;
			remoteexception;
		//   41   88:astore_1        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (remoteexception)));
		//   42   89:ldc1            #189 <String "MediaControllerCompat">
		//   43   91:ldc2            #306 <String "Dead object in registerCallback.">
		//   44   94:aload_1         
		//   45   95:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   46   98:pop             
_L1:
			mPendingCallbacks.clear();
		//   47   99:aload_0         
		//   48  100:getfield        #44  <Field List mPendingCallbacks>
		//   49  103:invokeinterface #309 <Method void List.clear()>
			return;
		//   50  108:return          
		}

		public final void registerCallback(Callback callback, Handler handler)
		{
			MediaControllerCompatApi21.registerCallback(mControllerObj, callback.mCallbackObj, handler);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:getfield        #315 <Field Object MediaControllerCompat$Callback.mCallbackObj>
		//    4    8:aload_2         
		//    5    9:invokestatic    #318 <Method void MediaControllerCompatApi21.registerCallback(Object, Object, Handler)>
			handler = ((Handler) (mLock));
		//    6   12:aload_0         
		//    7   13:getfield        #39  <Field Object mLock>
		//    8   16:astore_2        
			handler;
		//    9   17:aload_2         
			JVM INSTR monitorenter ;
		//   10   18:monitorenter    
			ExtraCallback extracallback;
			if(mSessionToken.getExtraBinder() == null)
				break MISSING_BLOCK_LABEL_91;
		//   11   19:aload_0         
		//   12   20:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   13   23:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   14   26:ifnull          91
			extracallback = new ExtraCallback(callback);
		//   15   29:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:invokespecial   #288 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   19   37:astore_3        
			mCallbackMap.put(((Object) (callback)), ((Object) (extracallback)));
		//   20   38:aload_0         
		//   21   39:getfield        #49  <Field HashMap mCallbackMap>
		//   22   42:aload_1         
		//   23   43:aload_3         
		//   24   44:invokevirtual   #292 <Method Object HashMap.put(Object, Object)>
		//   25   47:pop             
			callback.mIControllerCallback = ((IMediaControllerCallback) (extracallback));
		//   26   48:aload_1         
		//   27   49:aload_3         
		//   28   50:putfield        #296 <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
			try
			{
				mSessionToken.getExtraBinder().registerCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   29   53:aload_0         
		//   30   54:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   31   57:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   32   60:aload_3         
		//   33   61:invokeinterface #300 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
				callback.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//   34   66:aload_1         
		//   35   67:bipush          13
		//   36   69:aconst_null     
		//   37   70:aconst_null     
		//   38   71:invokevirtual   #304 <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
				break MISSING_BLOCK_LABEL_107;
		//   39   74:goto            107
			}
			// Misplaced declaration of an exception variable
			catch(Callback callback) { }
		//   40   77:astore_1        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (callback)));
		//   41   78:ldc1            #189 <String "MediaControllerCompat">
		//   42   80:ldc2            #306 <String "Dead object in registerCallback.">
		//   43   83:aload_1         
		//   44   84:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   45   87:pop             
			break MISSING_BLOCK_LABEL_107;
		//   46   88:goto            107
			callback.mIControllerCallback = null;
		//   47   91:aload_1         
		//   48   92:aconst_null     
		//   49   93:putfield        #296 <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
			mPendingCallbacks.add(((Object) (callback)));
		//   50   96:aload_0         
		//   51   97:getfield        #44  <Field List mPendingCallbacks>
		//   52  100:aload_1         
		//   53  101:invokeinterface #322 <Method boolean List.add(Object)>
		//   54  106:pop             
			handler;
		//   55  107:aload_2         
			JVM INSTR monitorexit ;
		//   56  108:monitorexit     
			return;
		//   57  109:return          
			callback;
		//   58  110:astore_1        
			handler;
		//   59  111:aload_2         
			JVM INSTR monitorexit ;
		//   60  112:monitorexit     
			throw callback;
		//   61  113:aload_1         
		//   62  114:athrow          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #90  <Method long getFlags()>
		//*   2    4:ldc2w           #91  <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            38
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #94  <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #95  <Method void Bundle()>
		//   10   20:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_2         
		//   12   22:ldc1            #97  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #101 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   15   28:aload_0         
		//   16   29:ldc2            #325 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//   17   32:aload_2         
		//   18   33:aconst_null     
		//   19   34:invokevirtual   #84  <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   20   37:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   21   38:new             #105 <Class UnsupportedOperationException>
		//   22   41:dup             
		//   23   42:ldc1            #107 <String "This session doesn't support queue management operations">
		//   24   44:invokespecial   #110 <Method void UnsupportedOperationException(String)>
		//   25   47:athrow          
			}
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #328 <Method void MediaControllerCompatApi21.sendCommand(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public void setVolumeTo(int i, int j)
		{
			MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #331 <Method void MediaControllerCompatApi21.setVolumeTo(Object, int, int)>
		//    5    9:return          
		}

		public final void unregisterCallback(Callback callback)
		{
			MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:getfield        #315 <Field Object MediaControllerCompat$Callback.mCallbackObj>
		//    4    8:invokestatic    #335 <Method void MediaControllerCompatApi21.unregisterCallback(Object, Object)>
			Object obj = mLock;
		//    5   11:aload_0         
		//    6   12:getfield        #39  <Field Object mLock>
		//    7   15:astore_2        
			obj;
		//    8   16:aload_2         
			JVM INSTR monitorenter ;
		//    9   17:monitorenter    
			Object obj1 = ((Object) (mSessionToken.getExtraBinder()));
		//   10   18:aload_0         
		//   11   19:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   12   22:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   13   25:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_81;
		//   14   26:aload_3         
		//   15   27:ifnull          81
			obj1 = ((Object) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
		//   16   30:aload_0         
		//   17   31:getfield        #49  <Field HashMap mCallbackMap>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #338 <Method Object HashMap.remove(Object)>
		//   20   38:checkcast       #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   21   41:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_92;
		//   22   42:aload_3         
		//   23   43:ifnull          92
			try
			{
				callback.mIControllerCallback = null;
		//   24   46:aload_1         
		//   25   47:aconst_null     
		//   26   48:putfield        #296 <Field IMediaControllerCallback MediaControllerCompat$Callback.mIControllerCallback>
				mSessionToken.getExtraBinder().unregisterCallbackListener(((IMediaControllerCallback) (obj1)));
		//   27   51:aload_0         
		//   28   52:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   29   55:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   30   58:aload_3         
		//   31   59:invokeinterface #341 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
				break MISSING_BLOCK_LABEL_92;
		//   32   64:goto            92
			}
			// Misplaced declaration of an exception variable
			catch(Callback callback) { }
		//   33   67:astore_1        
			Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
		//   34   68:ldc1            #189 <String "MediaControllerCompat">
		//   35   70:ldc2            #343 <String "Dead object in unregisterCallback.">
		//   36   73:aload_1         
		//   37   74:invokestatic    #197 <Method int Log.e(String, String, Throwable)>
		//   38   77:pop             
			break MISSING_BLOCK_LABEL_92;
		//   39   78:goto            92
			mPendingCallbacks.remove(((Object) (callback)));
		//   40   81:aload_0         
		//   41   82:getfield        #44  <Field List mPendingCallbacks>
		//   42   85:aload_1         
		//   43   86:invokeinterface #345 <Method boolean List.remove(Object)>
		//   44   91:pop             
			obj;
		//   45   92:aload_2         
			JVM INSTR monitorexit ;
		//   46   93:monitorexit     
			return;
		//   47   94:return          
			callback;
		//   48   95:astore_1        
			obj;
		//   49   96:aload_2         
			JVM INSTR monitorexit ;
		//   50   97:monitorexit     
			throw callback;
		//   51   98:aload_1         
		//   52   99:athrow          
		}

		private HashMap mCallbackMap;
		protected final Object mControllerObj;
		final Object mLock = new Object();
		private final List mPendingCallbacks = new ArrayList();
		final MediaSessionCompat.Token mSessionToken;

		public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #37  <Method void Object()>
		//    6   12:putfield        #39  <Field Object mLock>
		//    7   15:aload_0         
		//    8   16:new             #41  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #42  <Method void ArrayList()>
		//   11   23:putfield        #44  <Field List mPendingCallbacks>
			mCallbackMap = new HashMap();
		//   12   26:aload_0         
		//   13   27:new             #46  <Class HashMap>
		//   14   30:dup             
		//   15   31:invokespecial   #47  <Method void HashMap()>
		//   16   34:putfield        #49  <Field HashMap mCallbackMap>
			mSessionToken = token;
		//   17   37:aload_0         
		//   18   38:aload_2         
		//   19   39:putfield        #51  <Field MediaSessionCompat$Token mSessionToken>
			mControllerObj = MediaControllerCompatApi21.fromToken(context, mSessionToken.getToken());
		//   20   42:aload_0         
		//   21   43:aload_1         
		//   22   44:aload_0         
		//   23   45:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//   24   48:invokevirtual   #57  <Method Object MediaSessionCompat$Token.getToken()>
		//   25   51:invokestatic    #63  <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
		//   26   54:putfield        #65  <Field Object mControllerObj>
			if(mControllerObj != null)
		//*  27   57:aload_0         
		//*  28   58:getfield        #65  <Field Object mControllerObj>
		//*  29   61:ifnull          79
			{
				if(mSessionToken.getExtraBinder() == null)
		//*  30   64:aload_0         
		//*  31   65:getfield        #51  <Field MediaSessionCompat$Token mSessionToken>
		//*  32   68:invokevirtual   #69  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//*  33   71:ifnonnull       78
					requestExtraBinder();
		//   34   74:aload_0         
		//   35   75:invokespecial   #72  <Method void requestExtraBinder()>
				return;
		//   36   78:return          
			} else
			{
				throw new RemoteException();
		//   37   79:new             #34  <Class RemoteException>
		//   38   82:dup             
		//   39   83:invokespecial   #73  <Method void RemoteException()>
		//   40   86:athrow          
			}
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
		//    4   10:astore          4
			if(mediacontrollerimplapi21 != null)
		//*   5   12:aload           4
		//*   6   14:ifnull          74
			{
				if(bundle == null)
		//*   7   17:aload_2         
		//*   8   18:ifnonnull       22
					return;
		//    9   21:return          
				synchronized(mediacontrollerimplapi21.mLock)
		//*  10   22:aload           4
		//*  11   24:getfield        #36  <Field Object MediaControllerCompat$MediaControllerImplApi21.mLock>
		//*  12   27:astore_3        
		//*  13   28:aload_3         
		//*  14   29:monitorenter    
				{
					mediacontrollerimplapi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
		//   15   30:aload           4
		//   16   32:getfield        #40  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.mSessionToken>
		//   17   35:aload_2         
		//   18   36:ldc1            #42  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   19   38:invokestatic    #48  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   20   41:invokestatic    #54  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
		//   21   44:invokevirtual   #60  <Method void MediaSessionCompat$Token.setExtraBinder(IMediaSession)>
					mediacontrollerimplapi21.mSessionToken.setSessionToken2Bundle(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
		//   22   47:aload           4
		//   23   49:getfield        #40  <Field MediaSessionCompat$Token MediaControllerCompat$MediaControllerImplApi21.mSessionToken>
		//   24   52:aload_2         
		//   25   53:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
		//   26   55:invokevirtual   #68  <Method Bundle Bundle.getBundle(String)>
		//   27   58:invokevirtual   #72  <Method void MediaSessionCompat$Token.setSessionToken2Bundle(Bundle)>
					mediacontrollerimplapi21.processPendingCallbacksLocked();
		//   28   61:aload           4
		//   29   63:invokevirtual   #76  <Method void MediaControllerCompat$MediaControllerImplApi21.processPendingCallbacksLocked()>
				}
		//   30   66:aload_3         
		//   31   67:monitorexit     
				return;
		//   32   68:return          
			} else
		//*  33   69:astore_2        
		//*  34   70:aload_3         
		//*  35   71:monitorexit     
		//*  36   72:aload_2         
		//*  37   73:athrow          
			{
				return;
		//   38   74:return          
			}
			bundle;
			obj;
			JVM INSTR monitorexit ;
			throw bundle;
		}

		private WeakReference mMediaControllerImpl;

		MediaControllerImplApi21.ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediacontrollerimplapi21)
		{
			super(((Handler) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
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
		//    1    1:getfield        #24  <Field Object mControllerObj>
		//    2    4:invokestatic    #29  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi23(obj)));
		//    6   12:new             #31  <Class MediaControllerCompat$TransportControlsApi23>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #34  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
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
	}

	static class MediaControllerImplApi24 extends MediaControllerImplApi23
	{

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Object mControllerObj>
		//    2    4:invokestatic    #29  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi24(obj)));
		//    6   12:new             #31  <Class MediaControllerCompat$TransportControlsApi24>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #34  <Method void MediaControllerCompat$TransportControlsApi24(Object)>
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
	}

	static class MediaControllerImplBase
		implements MediaControllerImpl
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((mBinder.getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifeq            29
			{
				mBinder.addQueueItem(mediadescriptioncompat);
		//    8   18:aload_0         
		//    9   19:getfield        #34  <Field IMediaSession mBinder>
		//   10   22:aload_1         
		//   11   23:invokeinterface #49  <Method void IMediaSession.addQueueItem(MediaDescriptionCompat)>
				return;
		//   12   28:return          
			}
			try
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   13   29:new             #51  <Class UnsupportedOperationException>
		//   14   32:dup             
		//   15   33:ldc1            #53  <String "This session doesn't support queue management operations">
		//   16   35:invokespecial   #56  <Method void UnsupportedOperationException(String)>
		//   17   38:athrow          
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
			return;
		//   24   49:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			if((mBinder.getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifeq            30
			{
				mBinder.addQueueItemAt(mediadescriptioncompat, i);
		//    8   18:aload_0         
		//    9   19:getfield        #34  <Field IMediaSession mBinder>
		//   10   22:aload_1         
		//   11   23:iload_2         
		//   12   24:invokeinterface #70  <Method void IMediaSession.addQueueItemAt(MediaDescriptionCompat, int)>
				return;
		//   13   29:return          
			}
			try
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   14   30:new             #51  <Class UnsupportedOperationException>
		//   15   33:dup             
		//   16   34:ldc1            #53  <String "This session doesn't support queue management operations">
		//   17   36:invokespecial   #56  <Method void UnsupportedOperationException(String)>
		//   18   39:athrow          
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
			return;
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
			if(keyevent != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          30
			{
				try
				{
					mBinder.sendMediaButton(keyevent);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field IMediaSession mBinder>
		//    4    8:aload_1         
		//    5    9:invokeinterface #84  <Method boolean IMediaSession.sendMediaButton(KeyEvent)>
		//    6   14:pop             
				}
		//*   7   15:goto            28
				// Misplaced declaration of an exception variable
				catch(KeyEvent keyevent)
		//*   8   18:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", ((Throwable) (keyevent)));
		//    9   19:ldc1            #58  <String "MediaControllerCompat">
		//   10   21:ldc1            #86  <String "Dead object in dispatchMediaButtonEvent.">
		//   11   23:aload_1         
		//   12   24:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   13   27:pop             
				}
				return false;
		//   14   28:iconst_0        
		//   15   29:ireturn         
			} else
			{
				throw new IllegalArgumentException("event may not be null.");
		//   16   30:new             #88  <Class IllegalArgumentException>
		//   17   33:dup             
		//   18   34:ldc1            #90  <String "event may not be null.">
		//   19   36:invokespecial   #91  <Method void IllegalArgumentException(String)>
		//   20   39:athrow          
			}
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
			if(callback != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          64
			{
				try
				{
					mBinder.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field IMediaSession mBinder>
		//    4    8:invokeinterface #208 <Method IBinder IMediaSession.asBinder()>
		//    5   13:aload_1         
		//    6   14:iconst_0        
		//    7   15:invokeinterface #212 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
					mBinder.registerCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//    8   20:aload_0         
		//    9   21:getfield        #34  <Field IMediaSession mBinder>
		//   10   24:aload_1         
		//   11   25:getfield        #218 <Field Object MediaControllerCompat$Callback.mCallbackObj>
		//   12   28:checkcast       #220 <Class IMediaControllerCallback>
		//   13   31:invokeinterface #224 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
					callback.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
		//   14   36:aload_1         
		//   15   37:bipush          13
		//   16   39:aconst_null     
		//   17   40:aconst_null     
		//   18   41:invokevirtual   #228 <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
					return;
		//   19   44:return          
				}
				// Misplaced declaration of an exception variable
				catch(Handler handler)
		//*  20   45:astore_2        
				{
					Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (handler)));
		//   21   46:ldc1            #58  <String "MediaControllerCompat">
		//   22   48:ldc1            #230 <String "Dead object in registerCallback.">
		//   23   50:aload_2         
		//   24   51:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   25   54:pop             
				}
				callback.postToHandler(8, ((Object) (null)), ((Bundle) (null)));
		//   26   55:aload_1         
		//   27   56:bipush          8
		//   28   58:aconst_null     
		//   29   59:aconst_null     
		//   30   60:invokevirtual   #228 <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
				return;
		//   31   63:return          
			} else
			{
				throw new IllegalArgumentException("callback may not be null.");
		//   32   64:new             #88  <Class IllegalArgumentException>
		//   33   67:dup             
		//   34   68:ldc1            #232 <String "callback may not be null.">
		//   35   70:invokespecial   #91  <Method void IllegalArgumentException(String)>
		//   36   73:athrow          
			}
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((mBinder.getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field IMediaSession mBinder>
		//*   2    4:invokeinterface #45  <Method long IMediaSession.getFlags()>
		//*   3    9:ldc2w           #46  <Long 4L>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifeq            29
			{
				mBinder.removeQueueItem(mediadescriptioncompat);
		//    8   18:aload_0         
		//    9   19:getfield        #34  <Field IMediaSession mBinder>
		//   10   22:aload_1         
		//   11   23:invokeinterface #235 <Method void IMediaSession.removeQueueItem(MediaDescriptionCompat)>
				return;
		//   12   28:return          
			}
			try
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   13   29:new             #51  <Class UnsupportedOperationException>
		//   14   32:dup             
		//   15   33:ldc1            #53  <String "This session doesn't support queue management operations">
		//   16   35:invokespecial   #56  <Method void UnsupportedOperationException(String)>
		//   17   38:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  18   39:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", ((Throwable) (mediadescriptioncompat)));
		//   19   40:ldc1            #58  <String "MediaControllerCompat">
		//   20   42:ldc1            #237 <String "Dead object in removeQueueItem.">
		//   21   44:aload_1         
		//   22   45:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   23   48:pop             
			}
			return;
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
		//    4    6:new             #241 <Class MediaSessionCompat$ResultReceiverWrapper>
		//    5    9:dup             
		//    6   10:aload_3         
		//    7   11:invokespecial   #244 <Method void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver)>
		//    8   14:invokeinterface #247 <Method void IMediaSession.sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
				return;
		//    9   19:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  10   20:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in sendCommand.", ((Throwable) (s)));
		//   11   21:ldc1            #58  <String "MediaControllerCompat">
		//   12   23:ldc1            #249 <String "Dead object in sendCommand.">
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
		//    5    7:invokeinterface #252 <Method void IMediaSession.setVolumeTo(int, int, String)>
				return;
		//    6   12:return          
			}
			catch(RemoteException remoteexception)
		//*   7   13:astore_3        
			{
				Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", ((Throwable) (remoteexception)));
		//    8   14:ldc1            #58  <String "MediaControllerCompat">
		//    9   16:ldc1            #254 <String "Dead object in setVolumeTo.">
		//   10   18:aload_3         
		//   11   19:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   12   22:pop             
			}
		//   13   23:return          
		}

		public void unregisterCallback(Callback callback)
		{
			if(callback != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          50
			{
				try
				{
					mBinder.unregisterCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field IMediaSession mBinder>
		//    4    8:aload_1         
		//    5    9:getfield        #218 <Field Object MediaControllerCompat$Callback.mCallbackObj>
		//    6   12:checkcast       #220 <Class IMediaControllerCallback>
		//    7   15:invokeinterface #259 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
					mBinder.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//    8   20:aload_0         
		//    9   21:getfield        #34  <Field IMediaSession mBinder>
		//   10   24:invokeinterface #208 <Method IBinder IMediaSession.asBinder()>
		//   11   29:aload_1         
		//   12   30:iconst_0        
		//   13   31:invokeinterface #263 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   14   36:pop             
					return;
		//   15   37:return          
				}
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  16   38:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
		//   17   39:ldc1            #58  <String "MediaControllerCompat">
		//   18   41:ldc2            #265 <String "Dead object in unregisterCallback.">
		//   19   44:aload_1         
		//   20   45:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
		//   21   48:pop             
				}
				return;
		//   22   49:return          
			} else
			{
				throw new IllegalArgumentException("callback may not be null.");
		//   23   50:new             #88  <Class IllegalArgumentException>
		//   24   53:dup             
		//   25   54:ldc1            #232 <String "callback may not be null.">
		//   26   56:invokespecial   #91  <Method void IllegalArgumentException(String)>
		//   27   59:athrow          
			}
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
		//*   1    1:ifnull          44
		//*   2    4:getstatic       #44  <Field Uri Uri.EMPTY>
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #48  <Method boolean Uri.equals(Object)>
		//*   5   11:ifne            44
			{
				Bundle bundle1 = new Bundle();
		//    6   14:new             #50  <Class Bundle>
		//    7   17:dup             
		//    8   18:invokespecial   #51  <Method void Bundle()>
		//    9   21:astore_3        
				bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
		//   10   22:aload_3         
		//   11   23:ldc1            #53  <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   12   25:aload_1         
		//   13   26:invokevirtual   #57  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//   14   29:aload_3         
		//   15   30:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   16   32:aload_2         
		//   17   33:invokevirtual   #62  <Method void Bundle.putBundle(String, Bundle)>
				sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle1);
		//   18   36:aload_0         
		//   19   37:ldc1            #64  <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//   20   39:aload_3         
		//   21   40:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
				return;
		//   22   43:return          
			} else
			{
				throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
		//   23   44:new             #69  <Class IllegalArgumentException>
		//   24   47:dup             
		//   25   48:ldc1            #71  <String "You must specify a non-empty Uri for playFromUri.">
		//   26   50:invokespecial   #74  <Method void IllegalArgumentException(String)>
		//   27   53:athrow          
			}
		}

		public void prepare()
		{
			sendCustomAction("android.support.v4.media.session.action.PREPARE", ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:ldc1            #77  <String "android.support.v4.media.session.action.PREPARE">
		//    2    3:aconst_null     
		//    3    4:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//    5    9:ldc1            #80  <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #84  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #62  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #86  <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//    7   12:invokevirtual   #84  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #62  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #91  <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//   11   19:invokevirtual   #62  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #94  <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//    3    5:invokestatic    #112 <Method void MediaControllerCompat.validateCustomAction(String, Bundle)>
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
		//    2    2:invokestatic    #112 <Method void MediaControllerCompat.validateCustomAction(String, Bundle)>
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
		//   11   19:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #59  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #62  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #140 <String "android.support.v4.media.session.action.SET_RATING">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//   11   19:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//   11   19:invokevirtual   #67  <Method void sendCustomAction(String, Bundle)>
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
		//    2    2:invokestatic    #105 <Method void MediaControllerCompat.validateCustomAction(String, Bundle)>
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
	//    1    1:invokespecial   #102 <Method void Object()>
		mRegisteredCallbacks = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #104 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #105 <Method void HashSet()>
	//    6   12:putfield        #107 <Field HashSet mRegisteredCallbacks>
		if(token != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          103
		{
			mToken = token;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #109 <Field MediaSessionCompat$Token mToken>
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  12   24:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   27:bipush          24
	//*  14   29:icmplt          46
			{
				mImpl = ((MediaControllerImpl) (new MediaControllerImplApi24(context, token)));
	//   15   32:aload_0         
	//   16   33:new             #36  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   17   36:dup             
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokespecial   #117 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
	//   21   42:putfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
				return;
	//   22   45:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  23   46:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   49:bipush          23
	//*  25   51:icmplt          68
			{
				mImpl = ((MediaControllerImpl) (new MediaControllerImplApi23(context, token)));
	//   26   54:aload_0         
	//   27   55:new             #33  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokespecial   #120 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
	//   32   64:putfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
				return;
	//   33   67:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  34   68:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   71:bipush          21
	//*  36   73:icmplt          90
			{
				mImpl = ((MediaControllerImpl) (new MediaControllerImplApi21(context, token)));
	//   37   76:aload_0         
	//   38   77:new             #24  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   39   80:dup             
	//   40   81:aload_1         
	//   41   82:aload_2         
	//   42   83:invokespecial   #121 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   43   86:putfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
				return;
	//   44   89:return          
			} else
			{
				mImpl = ((MediaControllerImpl) (new MediaControllerImplBase(token)));
	//   45   90:aload_0         
	//   46   91:new             #39  <Class MediaControllerCompat$MediaControllerImplBase>
	//   47   94:dup             
	//   48   95:aload_2         
	//   49   96:invokespecial   #124 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   50   99:putfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
				return;
	//   51  102:return          
			}
		} else
		{
			throw new IllegalArgumentException("sessionToken must not be null");
	//   52  103:new             #126 <Class IllegalArgumentException>
	//   53  106:dup             
	//   54  107:ldc1            #128 <String "sessionToken must not be null">
	//   55  109:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   56  112:athrow          
		}
	}

	public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void Object()>
		mRegisteredCallbacks = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #104 <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #105 <Method void HashSet()>
	//    6   12:putfield        #107 <Field HashSet mRegisteredCallbacks>
		if(mediasessioncompat == null)
			break MISSING_BLOCK_LABEL_134;
	//    7   15:aload_2         
	//    8   16:ifnull          134
		mToken = mediasessioncompat.getSessionToken();
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #141 <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
	//   12   24:putfield        #109 <Field MediaSessionCompat$Token mToken>
		mediasessioncompat = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  15   29:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          24
	//*  17   34:icmplt          53
		{
			context = ((Context) (new MediaControllerImplApi24(context, mToken)));
	//   18   37:new             #36  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   19   40:dup             
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//   23   46:invokespecial   #117 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
	//   24   49:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   25   50:goto            128
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  26   53:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   56:bipush          23
	//*  28   58:icmplt          77
		{
			context = ((Context) (new MediaControllerImplApi23(context, mToken)));
	//   29   61:new             #33  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   30   64:dup             
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//   34   70:invokespecial   #120 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
	//   35   73:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   36   74:goto            128
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  37   77:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  38   80:bipush          21
	//*  39   82:icmplt          101
		{
			context = ((Context) (new MediaControllerImplApi21(context, mToken)));
	//   40   85:new             #24  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   41   88:dup             
	//   42   89:aload_1         
	//   43   90:aload_0         
	//   44   91:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//   45   94:invokespecial   #121 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   46   97:astore_1        
			break MISSING_BLOCK_LABEL_128;
	//   47   98:goto            128
		}
		try
		{
			context = ((Context) (new MediaControllerImplBase(mToken)));
	//   48  101:new             #39  <Class MediaControllerCompat$MediaControllerImplBase>
	//   49  104:dup             
	//   50  105:aload_0         
	//   51  106:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//   52  109:invokespecial   #124 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   53  112:astore_1        
		}
	//*  54  113:goto            128
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55  116:astore_1        
		{
			Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", ((Throwable) (context)));
	//   56  117:ldc1            #87  <String "MediaControllerCompat">
	//   57  119:ldc1            #143 <String "Failed to create MediaControllerImpl.">
	//   58  121:aload_1         
	//   59  122:invokestatic    #149 <Method int Log.w(String, String, Throwable)>
	//   60  125:pop             
			context = ((Context) (mediasessioncompat));
	//   61  126:aload_2         
	//   62  127:astore_1        
		}
		mImpl = ((MediaControllerImpl) (context));
	//   63  128:aload_0         
	//   64  129:aload_1         
	//   65  130:putfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
		return;
	//   66  133:return          
		throw new IllegalArgumentException("session must not be null");
	//   67  134:new             #126 <Class IllegalArgumentException>
	//   68  137:dup             
	//   69  138:ldc1            #151 <String "session must not be null">
	//   70  140:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   71  143:athrow          
	}

	public static MediaControllerCompat getMediaController(Activity activity)
	{
		Object obj;
		boolean flag = activity instanceof SupportActivity;
	//    0    0:aload_0         
	//    1    1:instanceof      #155 <Class SupportActivity>
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
	//    8   12:checkcast       #155 <Class SupportActivity>
	//    9   15:ldc1            #18  <Class MediaControllerCompat$MediaControllerExtraData>
	//   10   17:invokevirtual   #159 <Method android.support.v4.app.SupportActivity$ExtraData SupportActivity.getExtraData(Class)>
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
	//   18   31:invokevirtual   #162 <Method MediaControllerCompat MediaControllerCompat$MediaControllerExtraData.getMediaController()>
	//   19   34:astore_0        
			return ((MediaControllerCompat) (activity));
	//   20   35:aload_0         
	//   21   36:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_86;
	//   22   37:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//   23   40:bipush          21
	//   24   42:icmplt          86
		obj = MediaControllerCompatApi21.getMediaController(activity);
	//   25   45:aload_0         
	//   26   46:invokestatic    #167 <Method Object MediaControllerCompatApi21.getMediaController(Activity)>
	//   27   49:astore_2        
		if(obj == null)
	//*  28   50:aload_2         
	//*  29   51:ifnonnull       56
			return null;
	//   30   54:aconst_null     
	//   31   55:areturn         
		obj = MediaControllerCompatApi21.getSessionToken(obj);
	//   32   56:aload_2         
	//   33   57:invokestatic    #170 <Method Object MediaControllerCompatApi21.getSessionToken(Object)>
	//   34   60:astore_2        
		activity = ((Activity) (new MediaControllerCompat(((Context) (activity)), MediaSessionCompat.Token.fromToken(obj))));
	//   35   61:new             #2   <Class MediaControllerCompat>
	//   36   64:dup             
	//   37   65:aload_0         
	//   38   66:aload_2         
	//   39   67:invokestatic    #176 <Method MediaSessionCompat$Token MediaSessionCompat$Token.fromToken(Object)>
	//   40   70:invokespecial   #177 <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
	//   41   73:astore_0        
		return ((MediaControllerCompat) (activity));
	//   42   74:aload_0         
	//   43   75:areturn         
		activity;
	//   44   76:astore_0        
		Log.e("MediaControllerCompat", "Dead object in getMediaController.", ((Throwable) (activity)));
	//   45   77:ldc1            #87  <String "MediaControllerCompat">
	//   46   79:ldc1            #179 <String "Dead object in getMediaController.">
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
	//*   1    1:instanceof      #155 <Class SupportActivity>
	//*   2    4:ifeq            22
			((SupportActivity)activity).putExtraData(((android.support.v4.app.SupportActivity.ExtraData) (new MediaControllerExtraData(mediacontrollercompat))));
	//    3    7:aload_0         
	//    4    8:checkcast       #155 <Class SupportActivity>
	//    5   11:new             #18  <Class MediaControllerCompat$MediaControllerExtraData>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #187 <Method void MediaControllerCompat$MediaControllerExtraData(MediaControllerCompat)>
	//    9   19:invokevirtual   #191 <Method void SupportActivity.putExtraData(android.support.v4.app.SupportActivity$ExtraData)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  10   22:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
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

	static void validateCustomAction(String s, Bundle bundle)
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
	//    6    8:invokevirtual   #210 <Method int String.hashCode()>
	//    7   11:istore_3        
		if(i != 0xaf9fc575)
	//*   8   12:iload_3         
	//*   9   13:ldc1            #211 <Int 0xaf9fc575>
	//*  10   15:icmpeq          41
		{
			if(i == 0x1dfb584e && s.equals("android.support.v4.media.session.action.UNFOLLOW"))
	//*  11   18:iload_3         
	//*  12   19:ldc1            #212 <Int 0x1dfb584e>
	//*  13   21:icmpeq          27
	//*  14   24:goto            52
	//*  15   27:aload_0         
	//*  16   28:ldc1            #214 <String "android.support.v4.media.session.action.UNFOLLOW">
	//*  17   30:invokevirtual   #218 <Method boolean String.equals(Object)>
	//*  18   33:ifeq            52
				byte0 = 1;
	//   19   36:iconst_1        
	//   20   37:istore_2        
		} else
	//*  21   38:goto            52
		if(s.equals("android.support.v4.media.session.action.FOLLOW"))
	//*  22   41:aload_0         
	//*  23   42:ldc1            #220 <String "android.support.v4.media.session.action.FOLLOW">
	//*  24   44:invokevirtual   #218 <Method boolean String.equals(Object)>
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
		if(bundle != null && bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"))
	//*  31   77:aload_1         
	//*  32   78:ifnull          91
	//*  33   81:aload_1         
	//*  34   82:ldc1            #222 <String "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE">
	//*  35   84:invokevirtual   #228 <Method boolean Bundle.containsKey(String)>
	//*  36   87:ifeq            91
		{
			return;
	//   37   90:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   38   91:new             #230 <Class StringBuilder>
	//   39   94:dup             
	//   40   95:invokespecial   #231 <Method void StringBuilder()>
	//   41   98:astore_1        
			((StringBuilder) (bundle)).append("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
	//   42   99:aload_1         
	//   43  100:ldc1            #233 <String "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ">
	//   44  102:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   45  105:pop             
			((StringBuilder) (bundle)).append(s);
	//   46  106:aload_1         
	//   47  107:aload_0         
	//   48  108:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   49  111:pop             
			((StringBuilder) (bundle)).append(".");
	//   50  112:aload_1         
	//   51  113:ldc1            #239 <String ".">
	//   52  115:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   53  118:pop             
			throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   54  119:new             #126 <Class IllegalArgumentException>
	//   55  122:dup             
	//   56  123:aload_1         
	//   57  124:invokevirtual   #243 <Method String StringBuilder.toString()>
	//   58  127:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   59  130:athrow          
		}
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.addQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #247 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		mImpl.addQueueItem(mediadescriptioncompat, i);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #250 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat, int)>
	//    5   11:return          
	}

	public void adjustVolume(int i, int j)
	{
		mImpl.adjustVolume(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #254 <Method void MediaControllerCompat$MediaControllerImpl.adjustVolume(int, int)>
	//    5   11:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		if(keyevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			return mImpl.dispatchMediaButtonEvent(keyevent);
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    4    8:aload_1         
	//    5    9:invokeinterface #258 <Method boolean MediaControllerCompat$MediaControllerImpl.dispatchMediaButtonEvent(KeyEvent)>
	//    6   14:ireturn         
		else
			throw new IllegalArgumentException("KeyEvent may not be null");
	//    7   15:new             #126 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #260 <String "KeyEvent may not be null">
	//   10   22:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
	}

	public Bundle getExtras()
	{
		return mImpl.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #264 <Method Bundle MediaControllerCompat$MediaControllerImpl.getExtras()>
	//    3    9:areturn         
	}

	public long getFlags()
	{
		return mImpl.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #268 <Method long MediaControllerCompat$MediaControllerImpl.getFlags()>
	//    3    9:lreturn         
	}

	public Object getMediaController()
	{
		return mImpl.getMediaController();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #270 <Method Object MediaControllerCompat$MediaControllerImpl.getMediaController()>
	//    3    9:areturn         
	}

	public MediaMetadataCompat getMetadata()
	{
		return mImpl.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #274 <Method MediaMetadataCompat MediaControllerCompat$MediaControllerImpl.getMetadata()>
	//    3    9:areturn         
	}

	public String getPackageName()
	{
		return mImpl.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #277 <Method String MediaControllerCompat$MediaControllerImpl.getPackageName()>
	//    3    9:areturn         
	}

	public PlaybackInfo getPlaybackInfo()
	{
		return mImpl.getPlaybackInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #281 <Method MediaControllerCompat$PlaybackInfo MediaControllerCompat$MediaControllerImpl.getPlaybackInfo()>
	//    3    9:areturn         
	}

	public PlaybackStateCompat getPlaybackState()
	{
		return mImpl.getPlaybackState();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #285 <Method PlaybackStateCompat MediaControllerCompat$MediaControllerImpl.getPlaybackState()>
	//    3    9:areturn         
	}

	public List getQueue()
	{
		return mImpl.getQueue();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #289 <Method List MediaControllerCompat$MediaControllerImpl.getQueue()>
	//    3    9:areturn         
	}

	public CharSequence getQueueTitle()
	{
		return mImpl.getQueueTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #295 <Method CharSequence MediaControllerCompat$MediaControllerImpl.getQueueTitle()>
	//    3    9:areturn         
	}

	public int getRatingType()
	{
		return mImpl.getRatingType();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #298 <Method int MediaControllerCompat$MediaControllerImpl.getRatingType()>
	//    3    9:ireturn         
	}

	public int getRepeatMode()
	{
		return mImpl.getRepeatMode();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #301 <Method int MediaControllerCompat$MediaControllerImpl.getRepeatMode()>
	//    3    9:ireturn         
	}

	public PendingIntent getSessionActivity()
	{
		return mImpl.getSessionActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #305 <Method PendingIntent MediaControllerCompat$MediaControllerImpl.getSessionActivity()>
	//    3    9:areturn         
	}

	public MediaSessionCompat.Token getSessionToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public Bundle getSessionToken2Bundle()
	{
		return mToken.getSessionToken2Bundle();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field MediaSessionCompat$Token mToken>
	//    2    4:invokevirtual   #310 <Method Bundle MediaSessionCompat$Token.getSessionToken2Bundle()>
	//    3    7:areturn         
	}

	public int getShuffleMode()
	{
		return mImpl.getShuffleMode();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #314 <Method int MediaControllerCompat$MediaControllerImpl.getShuffleMode()>
	//    3    9:ireturn         
	}

	public TransportControls getTransportControls()
	{
		return mImpl.getTransportControls();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #318 <Method MediaControllerCompat$TransportControls MediaControllerCompat$MediaControllerImpl.getTransportControls()>
	//    3    9:areturn         
	}

	public boolean isCaptioningEnabled()
	{
		return mImpl.isCaptioningEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #322 <Method boolean MediaControllerCompat$MediaControllerImpl.isCaptioningEnabled()>
	//    3    9:ireturn         
	}

	public boolean isSessionReady()
	{
		return mImpl.isSessionReady();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #325 <Method boolean MediaControllerCompat$MediaControllerImpl.isSessionReady()>
	//    3    9:ireturn         
	}

	public void registerCallback(Callback callback)
	{
		registerCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #330 <Method void registerCallback(MediaControllerCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void registerCallback(Callback callback, Handler handler)
	{
		if(callback != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          44
		{
			Handler handler1 = handler;
	//    2    4:aload_2         
	//    3    5:astore_3        
			if(handler == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       18
				handler1 = new Handler();
	//    6   10:new             #332 <Class Handler>
	//    7   13:dup             
	//    8   14:invokespecial   #333 <Method void Handler()>
	//    9   17:astore_3        
			callback.setHandler(handler1);
	//   10   18:aload_1         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #337 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
			mImpl.registerCallback(callback, handler1);
	//   13   23:aload_0         
	//   14   24:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   15   27:aload_1         
	//   16   28:aload_3         
	//   17   29:invokeinterface #338 <Method void MediaControllerCompat$MediaControllerImpl.registerCallback(MediaControllerCompat$Callback, Handler)>
			mRegisteredCallbacks.add(((Object) (callback)));
	//   18   34:aload_0         
	//   19   35:getfield        #107 <Field HashSet mRegisteredCallbacks>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #341 <Method boolean HashSet.add(Object)>
	//   22   42:pop             
			return;
	//   23   43:return          
		} else
		{
			throw new IllegalArgumentException("callback must not be null");
	//   24   44:new             #126 <Class IllegalArgumentException>
	//   25   47:dup             
	//   26   48:ldc2            #343 <String "callback must not be null">
	//   27   51:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   28   54:athrow          
		}
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.removeQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #346 <Method void MediaControllerCompat$MediaControllerImpl.removeQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void removeQueueItemAt(int i)
	{
		Object obj = ((Object) (getQueue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #350 <Method List getQueue()>
	//    2    4:astore_2        
		if(obj != null && i >= 0 && i < ((List) (obj)).size())
	//*   3    5:aload_2         
	//*   4    6:ifnull          46
	//*   5    9:iload_1         
	//*   6   10:iflt            46
	//*   7   13:iload_1         
	//*   8   14:aload_2         
	//*   9   15:invokeinterface #355 <Method int List.size()>
	//*  10   20:icmpge          46
		{
			obj = ((Object) ((MediaSessionCompat.QueueItem)((List) (obj)).get(i)));
	//   11   23:aload_2         
	//   12   24:iload_1         
	//   13   25:invokeinterface #359 <Method Object List.get(int)>
	//   14   30:checkcast       #361 <Class MediaSessionCompat$QueueItem>
	//   15   33:astore_2        
			if(obj != null)
	//*  16   34:aload_2         
	//*  17   35:ifnull          46
				removeQueueItem(((MediaSessionCompat.QueueItem) (obj)).getDescription());
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #365 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//   21   43:invokevirtual   #366 <Method void removeQueueItem(MediaDescriptionCompat)>
		}
	//   22   46:return          
	}

	public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #375 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            20
		{
			mImpl.sendCommand(s, bundle, resultreceiver);
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokeinterface #377 <Method void MediaControllerCompat$MediaControllerImpl.sendCommand(String, Bundle, ResultReceiver)>
			return;
	//    9   19:return          
		} else
		{
			throw new IllegalArgumentException("command must neither be null nor empty");
	//   10   20:new             #126 <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:ldc2            #379 <String "command must neither be null nor empty">
	//   13   27:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		}
	}

	public void setVolumeTo(int i, int j)
	{
		mImpl.setVolumeTo(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #382 <Method void MediaControllerCompat$MediaControllerImpl.setVolumeTo(int, int)>
	//    5   11:return          
	}

	public void unregisterCallback(Callback callback)
	{
		if(callback == null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:aload_1         
	//    1    1:ifnull          37
		mRegisteredCallbacks.remove(((Object) (callback)));
	//    2    4:aload_0         
	//    3    5:getfield        #107 <Field HashSet mRegisteredCallbacks>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #386 <Method boolean HashSet.remove(Object)>
	//    6   12:pop             
		mImpl.unregisterCallback(callback);
	//    7   13:aload_0         
	//    8   14:getfield        #119 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    9   17:aload_1         
	//   10   18:invokeinterface #388 <Method void MediaControllerCompat$MediaControllerImpl.unregisterCallback(MediaControllerCompat$Callback)>
		callback.setHandler(((Handler) (null)));
	//   11   23:aload_1         
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #337 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
		return;
	//   14   28:return          
		Exception exception;
		exception;
	//   15   29:astore_2        
		callback.setHandler(((Handler) (null)));
	//   16   30:aload_1         
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #337 <Method void MediaControllerCompat$Callback.setHandler(Handler)>
		throw exception;
	//   19   35:aload_2         
	//   20   36:athrow          
		throw new IllegalArgumentException("callback must not be null");
	//   21   37:new             #126 <Class IllegalArgumentException>
	//   22   40:dup             
	//   23   41:ldc2            #343 <String "callback must not be null">
	//   24   44:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   25   47:athrow          
	}

	public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
	public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
	public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
	public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
	public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
	public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
	public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
	static final String TAG = "MediaControllerCompat";
	private final MediaControllerImpl mImpl;
	private final HashSet mRegisteredCallbacks;
	private final MediaSessionCompat.Token mToken;
}

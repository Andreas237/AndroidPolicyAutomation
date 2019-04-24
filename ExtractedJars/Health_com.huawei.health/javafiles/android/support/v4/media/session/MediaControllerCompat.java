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
//			MediaSessionCompat, MediaControllerCompatApi21, PlaybackStateCompat, MediaControllerCompatApi26, 
//			ParcelableVolumeInfo, IMediaSession, IMediaControllerCallback

public final class MediaControllerCompat
{
	public static abstract class Callback
		implements android.os.IBinder.DeathRecipient
	{

		private void setHandler(Handler handler)
		{
			mHandler = new MessageHandler(handler.getLooper());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class MediaControllerCompat$Callback$MessageHandler>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #75  <Method Looper Handler.getLooper()>
		//    6   10:invokespecial   #78  <Method void MediaControllerCompat$Callback$MessageHandler(MediaControllerCompat$Callback, Looper)>
		//    7   13:putfield        #80  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    8   16:return          
		}

		public void binderDied()
		{
			onSessionDestroyed();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #84  <Method void onSessionDestroyed()>
		//    2    4:return          
		}

		public void onAudioInfoChanged(PlaybackInfo playbackinfo)
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

		public void onShuffleModeChanged(boolean flag)
		{
		//    0    0:return          
		}

		private final Object mCallbackObj;
		MessageHandler mHandler;
		boolean mHasExtraCallback;
		boolean mRegistered;


/*
		static Object access$200(Callback callback)
		{
			return callback.mCallbackObj;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object mCallbackObj>
		//    2    4:areturn         
		}

*/


/*
		static void access$300(Callback callback, Handler handler)
		{
			callback.setHandler(handler);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #69  <Method void setHandler(Handler)>
			return;
		//    3    5:return          
		}

*/

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			mRegistered = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #34  <Field boolean mRegistered>
			if(android.os.Build.VERSION.SDK_INT >= 26)
		//*   5    9:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          26
		//*   7   14:icmplt          34
			{
				mCallbackObj = MediaControllerCompatApi26.createCallback(((MediaControllerCompatApi26.Callback) (new StubApi26())));
		//    8   17:aload_0         
		//    9   18:new             #17  <Class MediaControllerCompat$Callback$StubApi26>
		//   10   21:dup             
		//   11   22:aload_0         
		//   12   23:aconst_null     
		//   13   24:invokespecial   #43  <Method void MediaControllerCompat$Callback$StubApi26(MediaControllerCompat$Callback, MediaControllerCompat$1)>
		//   14   27:invokestatic    #49  <Method Object MediaControllerCompatApi26.createCallback(MediaControllerCompatApi26$Callback)>
		//   15   30:putfield        #51  <Field Object mCallbackObj>
				return;
		//   16   33:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  17   34:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*  18   37:bipush          21
		//*  19   39:icmplt          58
			{
				mCallbackObj = MediaControllerCompatApi21.createCallback(((MediaControllerCompatApi21.Callback) (new StubApi21())));
		//   20   42:aload_0         
		//   21   43:new             #14  <Class MediaControllerCompat$Callback$StubApi21>
		//   22   46:dup             
		//   23   47:aload_0         
		//   24   48:invokespecial   #54  <Method void MediaControllerCompat$Callback$StubApi21(MediaControllerCompat$Callback)>
		//   25   51:invokestatic    #59  <Method Object MediaControllerCompatApi21.createCallback(MediaControllerCompatApi21$Callback)>
		//   26   54:putfield        #51  <Field Object mCallbackObj>
				return;
		//   27   57:return          
			} else
			{
				mCallbackObj = ((Object) (new StubCompat()));
		//   28   58:aload_0         
		//   29   59:new             #20  <Class MediaControllerCompat$Callback$StubCompat>
		//   30   62:dup             
		//   31   63:aload_0         
		//   32   64:invokespecial   #60  <Method void MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback)>
		//   33   67:putfield        #51  <Field Object mCallbackObj>
				return;
		//   34   70:return          
			}
		}
	}

	class Callback.MessageHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(!mRegistered)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//*   2    4:getfield        #47  <Field boolean MediaControllerCompat$Callback.mRegistered>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			switch(message.what)
		//*   5   11:aload_1         
		//*   6   12:getfield        #52  <Field int Message.what>
			{
		//*   7   15:tableswitch     1 10: default 68
		//		               1 69
		//		               2 88
		//		               3 103
		//		               4 199
		//		               5 118
		//		               6 133
		//		               7 184
		//		               8 214
		//		               9 148
		//		               10 166
			default:
				return;
		//    8   68:return          

			case 1: // '\001'
				onSessionEvent((String)message.obj, message.getData());
		//    9   69:aload_0         
		//   10   70:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   11   73:aload_1         
		//   12   74:getfield        #56  <Field Object Message.obj>
		//   13   77:checkcast       #58  <Class String>
		//   14   80:aload_1         
		//   15   81:invokevirtual   #62  <Method Bundle Message.getData()>
		//   16   84:invokevirtual   #66  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   17   87:return          

			case 2: // '\002'
				onPlaybackStateChanged((PlaybackStateCompat)message.obj);
		//   18   88:aload_0         
		//   19   89:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   20   92:aload_1         
		//   21   93:getfield        #56  <Field Object Message.obj>
		//   22   96:checkcast       #68  <Class PlaybackStateCompat>
		//   23   99:invokevirtual   #72  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				return;
		//   24  102:return          

			case 3: // '\003'
				onMetadataChanged((MediaMetadataCompat)message.obj);
		//   25  103:aload_0         
		//   26  104:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   27  107:aload_1         
		//   28  108:getfield        #56  <Field Object Message.obj>
		//   29  111:checkcast       #74  <Class MediaMetadataCompat>
		//   30  114:invokevirtual   #78  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
				return;
		//   31  117:return          

			case 5: // '\005'
				onQueueChanged((List)message.obj);
		//   32  118:aload_0         
		//   33  119:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   34  122:aload_1         
		//   35  123:getfield        #56  <Field Object Message.obj>
		//   36  126:checkcast       #80  <Class List>
		//   37  129:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
				return;
		//   38  132:return          

			case 6: // '\006'
				onQueueTitleChanged((CharSequence)message.obj);
		//   39  133:aload_0         
		//   40  134:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   41  137:aload_1         
		//   42  138:getfield        #56  <Field Object Message.obj>
		//   43  141:checkcast       #86  <Class CharSequence>
		//   44  144:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
				return;
		//   45  147:return          

			case 9: // '\t'
				onRepeatModeChanged(((Integer)message.obj).intValue());
		//   46  148:aload_0         
		//   47  149:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   48  152:aload_1         
		//   49  153:getfield        #56  <Field Object Message.obj>
		//   50  156:checkcast       #92  <Class Integer>
		//   51  159:invokevirtual   #96  <Method int Integer.intValue()>
		//   52  162:invokevirtual   #100 <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
				return;
		//   53  165:return          

			case 10: // '\n'
				onShuffleModeChanged(((Boolean)message.obj).booleanValue());
		//   54  166:aload_0         
		//   55  167:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   56  170:aload_1         
		//   57  171:getfield        #56  <Field Object Message.obj>
		//   58  174:checkcast       #102 <Class Boolean>
		//   59  177:invokevirtual   #106 <Method boolean Boolean.booleanValue()>
		//   60  180:invokevirtual   #110 <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
				return;
		//   61  183:return          

			case 7: // '\007'
				onExtrasChanged((Bundle)message.obj);
		//   62  184:aload_0         
		//   63  185:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   64  188:aload_1         
		//   65  189:getfield        #56  <Field Object Message.obj>
		//   66  192:checkcast       #112 <Class Bundle>
		//   67  195:invokevirtual   #116 <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
				return;
		//   68  198:return          

			case 4: // '\004'
				onAudioInfoChanged((PlaybackInfo)message.obj);
		//   69  199:aload_0         
		//   70  200:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   71  203:aload_1         
		//   72  204:getfield        #56  <Field Object Message.obj>
		//   73  207:checkcast       #118 <Class MediaControllerCompat$PlaybackInfo>
		//   74  210:invokevirtual   #122 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
				return;
		//   75  213:return          

			case 8: // '\b'
				onSessionDestroyed();
		//   76  214:aload_0         
		//   77  215:getfield        #37  <Field MediaControllerCompat$Callback this$0>
		//   78  218:invokevirtual   #126 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
				return;
		//   79  221:return          
			}
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #132 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #135 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #138 <Method void Message.sendToTarget()>
		//   10   16:return          
		}

		private static final int MSG_DESTROYED = 8;
		private static final int MSG_EVENT = 1;
		private static final int MSG_UPDATE_EXTRAS = 7;
		private static final int MSG_UPDATE_METADATA = 3;
		private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
		private static final int MSG_UPDATE_QUEUE = 5;
		private static final int MSG_UPDATE_QUEUE_TITLE = 6;
		private static final int MSG_UPDATE_REPEAT_MODE = 9;
		private static final int MSG_UPDATE_SHUFFLE_MODE = 10;
		private static final int MSG_UPDATE_VOLUME = 4;
		final Callback this$0;

		public Callback.MessageHandler(Looper looper)
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field MediaControllerCompat$Callback this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #40  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	class Callback.StubApi21
		implements MediaControllerCompatApi21.Callback
	{

		public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
		{
			Callback.this.onAudioInfoChanged(new PlaybackInfo(i, j, k, l, i1));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:new             #26  <Class MediaControllerCompat$PlaybackInfo>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:iload           4
		//    8   13:iload           5
		//    9   15:invokespecial   #28  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   10   18:invokevirtual   #31  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
		//   11   21:return          
		}

		public void onExtrasChanged(Bundle bundle)
		{
			Callback.this.onExtrasChanged(bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
		//    4    8:return          
		}

		public void onMetadataChanged(Object obj)
		{
			Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #43  <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
		//    4    8:invokevirtual   #46  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
		//    5   11:return          
		}

		public void onPlaybackStateChanged(Object obj)
		{
			if(mHasExtraCallback)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//*   2    4:getfield        #51  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
		//*   3    7:ifeq            11
			{
				return;
		//    4   10:return          
			} else
			{
				Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    7   15:aload_1         
		//    8   16:invokestatic    #57  <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//    9   19:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				return;
		//   10   22:return          
			}
		}

		public void onQueueChanged(List list)
		{
			Callback.this.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #68  <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
		//    4    8:invokevirtual   #70  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
		//    5   11:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
		{
			Callback.this.onQueueTitleChanged(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #76  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
		//    4    8:return          
		}

		public void onSessionDestroyed()
		{
			Callback.this.onSessionDestroyed();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:invokevirtual   #79  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
		//    3    7:return          
		}

		public void onSessionEvent(String s, Bundle bundle)
		{
			if(mHasExtraCallback && android.os.Build.VERSION.SDK_INT < 23)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//*   2    4:getfield        #51  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
		//*   3    7:ifeq            19
		//*   4   10:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
		//*   5   13:bipush          23
		//*   6   15:icmpge          19
			{
				return;
		//    7   18:return          
			} else
			{
				Callback.this.onSessionEvent(s, bundle);
		//    8   19:aload_0         
		//    9   20:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//   10   23:aload_1         
		//   11   24:aload_2         
		//   12   25:invokevirtual   #89  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   13   28:return          
			}
		}

		final Callback this$0;

		Callback.StubApi21()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class Callback.StubApi26 extends Callback.StubApi21
		implements MediaControllerCompatApi26.Callback
	{

		public void onRepeatModeChanged(int i)
		{
			Callback.this.onRepeatModeChanged(i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #27  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
		//    4    8:return          
		}

		public void onShuffleModeChanged(boolean flag)
		{
			Callback.this.onShuffleModeChanged(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
		//    4    8:return          
		}

		final Callback this$0;

		private Callback.StubApi26()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaControllerCompat$Callback$StubApi21(MediaControllerCompat$Callback)>
		//    6   10:return          
		}

	}

	class Callback.StubCompat extends IMediaControllerCallback.Stub
	{

		public void onEvent(String s, Bundle bundle)
			throws RemoteException
		{
			mHandler.post(1, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:iconst_1        
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   13:return          
		}

		public void onExtrasChanged(Bundle bundle)
			throws RemoteException
		{
			mHandler.post(7, ((Object) (bundle)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:bipush          7
		//    4    9:aload_1         
		//    5   10:aconst_null     
		//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   14:return          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
			throws RemoteException
		{
			mHandler.post(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:iconst_3        
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   13:return          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
			throws RemoteException
		{
			mHandler.post(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:iconst_2        
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   13:return          
		}

		public void onQueueChanged(List list)
			throws RemoteException
		{
			mHandler.post(5, ((Object) (list)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:iconst_5        
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   13:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
			throws RemoteException
		{
			mHandler.post(6, ((Object) (charsequence)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:bipush          6
		//    4    9:aload_1         
		//    5   10:aconst_null     
		//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   14:return          
		}

		public void onRepeatModeChanged(int i)
			throws RemoteException
		{
			mHandler.post(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:bipush          9
		//    4    9:iload_1         
		//    5   10:invokestatic    #55  <Method Integer Integer.valueOf(int)>
		//    6   13:aconst_null     
		//    7   14:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    8   17:return          
		}

		public void onSessionDestroyed()
			throws RemoteException
		{
			mHandler.post(8, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:bipush          8
		//    4    9:aconst_null     
		//    5   10:aconst_null     
		//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    7   14:return          
		}

		public void onShuffleModeChanged(boolean flag)
			throws RemoteException
		{
			mHandler.post(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:bipush          10
		//    4    9:iload_1         
		//    5   10:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
		//    6   13:aconst_null     
		//    7   14:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//    8   17:return          
		}

		public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
			throws RemoteException
		{
			PlaybackInfo playbackinfo = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			if(parcelablevolumeinfo != null)
		//*   2    2:aload_1         
		//*   3    3:ifnull          34
				playbackinfo = new PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
		//    4    6:new             #67  <Class MediaControllerCompat$PlaybackInfo>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:getfield        #73  <Field int ParcelableVolumeInfo.volumeType>
		//    8   14:aload_1         
		//    9   15:getfield        #76  <Field int ParcelableVolumeInfo.audioStream>
		//   10   18:aload_1         
		//   11   19:getfield        #79  <Field int ParcelableVolumeInfo.controlType>
		//   12   22:aload_1         
		//   13   23:getfield        #82  <Field int ParcelableVolumeInfo.maxVolume>
		//   14   26:aload_1         
		//   15   27:getfield        #85  <Field int ParcelableVolumeInfo.currentVolume>
		//   16   30:invokespecial   #88  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   17   33:astore_2        
			mHandler.post(4, ((Object) (playbackinfo)), ((Bundle) (null)));
		//   18   34:aload_0         
		//   19   35:getfield        #16  <Field MediaControllerCompat$Callback this$0>
		//   20   38:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//   21   41:iconst_4        
		//   22   42:aload_2         
		//   23   43:aconst_null     
		//   24   44:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
		//   25   47:return          
		}

		final Callback this$0;

		Callback.StubCompat()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaControllerCallback$Stub()>
		//    5    9:return          
		}
	}

	static class MediaControllerExtraData extends android.support.v4.app.SupportActivity.ExtraData
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

		public abstract TransportControls getTransportControls();

		public abstract boolean isShuffleModeEnabled();

		public abstract void registerCallback(Callback callback, Handler handler);

		public abstract void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat);

		public abstract void removeQueueItemAt(int i);

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
		//*   1    1:getfield        #81  <Field IMediaSession mExtraBinder>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			List list = mPendingCallbacks;
		//    4    8:aload_0         
		//    5    9:getfield        #50  <Field List mPendingCallbacks>
		//    6   12:astore_1        
			list;
		//    7   13:aload_1         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			Iterator iterator = mPendingCallbacks.iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #50  <Field List mPendingCallbacks>
		//   11   19:invokeinterface #94  <Method Iterator List.iterator()>
		//   12   24:astore_2        
_L1:
			ExtraCallback extracallback;
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_114;
		//   13   25:aload_2         
		//   14   26:invokeinterface #100 <Method boolean Iterator.hasNext()>
		//   15   31:ifeq            114
			Callback callback = (Callback)iterator.next();
		//   16   34:aload_2         
		//   17   35:invokeinterface #103 <Method Object Iterator.next()>
		//   18   40:checkcast       #105 <Class MediaControllerCompat$Callback>
		//   19   43:astore_3        
			extracallback = new ExtraCallback(callback);
		//   20   44:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   21   47:dup             
		//   22   48:aload_0         
		//   23   49:aload_3         
		//   24   50:invokespecial   #108 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$MediaControllerImplApi21, MediaControllerCompat$Callback)>
		//   25   53:astore          4
			mCallbackMap.put(((Object) (callback)), ((Object) (extracallback)));
		//   26   55:aload_0         
		//   27   56:getfield        #45  <Field HashMap mCallbackMap>
		//   28   59:aload_3         
		//   29   60:aload           4
		//   30   62:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
		//   31   65:pop             
			callback.mHasExtraCallback = true;
		//   32   66:aload_3         
		//   33   67:iconst_1        
		//   34   68:putfield        #116 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
			mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   35   71:aload_0         
		//   36   72:getfield        #81  <Field IMediaSession mExtraBinder>
		//   37   75:aload           4
		//   38   77:invokeinterface #122 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			  goto _L1
		//*  39   82:goto            131
			Object obj;
			obj;
		//   40   85:astore_2        
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in registerCallback. ").append(obj).toString());
		//   41   86:ldc1            #124 <String "MediaControllerCompat">
		//   42   88:new             #126 <Class StringBuilder>
		//   43   91:dup             
		//   44   92:invokespecial   #127 <Method void StringBuilder()>
		//   45   95:ldc1            #129 <String "Dead object in registerCallback. ">
		//   46   97:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   47  100:aload_2         
		//   48  101:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   49  104:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   50  107:invokestatic    #146 <Method int Log.e(String, String)>
		//   51  110:pop             
		//*  52  111:goto            114
			mPendingCallbacks.clear();
		//   53  114:aload_0         
		//   54  115:getfield        #50  <Field List mPendingCallbacks>
		//   55  118:invokeinterface #149 <Method void List.clear()>
			list;
		//   56  123:aload_1         
			JVM INSTR monitorexit ;
		//   57  124:monitorexit     
			return;
		//   58  125:return          
			obj;
		//   59  126:astore_2        
		//*  60  127:aload_1         
			throw obj;
		//   61  128:monitorexit     
		//   62  129:aload_2         
		//   63  130:athrow          
		//*  64  131:goto            25
		}

		private void requestExtraBinder()
		{
			sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver(this, new Handler()))));
		//    0    0:aload_0         
		//    1    1:ldc1            #151 <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:aconst_null     
		//    3    4:new             #11  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
		//    4    7:dup             
		//    5    8:aload_0         
		//    6    9:new             #153 <Class Handler>
		//    7   12:dup             
		//    8   13:invokespecial   #154 <Method void Handler()>
		//    9   16:invokespecial   #157 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21, Handler)>
		//   10   19:invokevirtual   #161 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   11   22:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #165 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #166 <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//    4    8:aload_2         
		//    5    9:ldc1            #168 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #172 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//    8   15:aload_0         
		//    9   16:ldc1            #174 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//   10   18:aload_2         
		//   11   19:aconst_null     
		//   12   20:invokevirtual   #161 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   13   23:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #165 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #166 <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//    4    8:aload_3         
		//    5    9:ldc1            #168 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #172 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
		//    8   15:aload_3         
		//    9   16:ldc1            #177 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   10   18:iload_2         
		//   11   19:invokevirtual   #181 <Method void Bundle.putInt(String, int)>
			sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
		//   12   22:aload_0         
		//   13   23:ldc1            #183 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//   14   25:aload_3         
		//   15   26:aconst_null     
		//   16   27:invokevirtual   #161 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   17   30:return          
		}

		public void adjustVolume(int i, int j)
		{
			MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #188 <Method void MediaControllerCompatApi21.adjustVolume(Object, int, int)>
		//    5    9:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #193 <Method boolean MediaControllerCompatApi21.dispatchMediaButtonEvent(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		public Bundle getExtras()
		{
			return MediaControllerCompatApi21.getExtras(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #198 <Method Bundle MediaControllerCompatApi21.getExtras(Object)>
		//    3    7:areturn         
		}

		public long getFlags()
		{
			return MediaControllerCompatApi21.getFlags(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #203 <Method long MediaControllerCompatApi21.getFlags(Object)>
		//    3    7:lreturn         
		}

		public Object getMediaController()
		{
			return mControllerObj;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:areturn         
		}

		public MediaMetadataCompat getMetadata()
		{
			Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #209 <Method Object MediaControllerCompatApi21.getMetadata(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaMetadataCompat.fromMediaMetadata(obj);
		//    6   12:aload_1         
		//    7   13:invokestatic    #215 <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
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
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #219 <Method String MediaControllerCompatApi21.getPackageName(Object)>
		//    3    7:areturn         
		}

		public PlaybackInfo getPlaybackInfo()
		{
			Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #223 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          40
				return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
		//    6   12:new             #225 <Class MediaControllerCompat$PlaybackInfo>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokestatic    #231 <Method int MediaControllerCompatApi21$PlaybackInfo.getPlaybackType(Object)>
		//   10   20:aload_1         
		//   11   21:invokestatic    #234 <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
		//   12   24:aload_1         
		//   13   25:invokestatic    #237 <Method int MediaControllerCompatApi21$PlaybackInfo.getVolumeControl(Object)>
		//   14   28:aload_1         
		//   15   29:invokestatic    #240 <Method int MediaControllerCompatApi21$PlaybackInfo.getMaxVolume(Object)>
		//   16   32:aload_1         
		//   17   33:invokestatic    #243 <Method int MediaControllerCompatApi21$PlaybackInfo.getCurrentVolume(Object)>
		//   18   36:invokespecial   #246 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   19   39:areturn         
			else
				return null;
		//   20   40:aconst_null     
		//   21   41:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_45;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          45
			PlaybackStateCompat playbackstatecompat = mExtraBinder.getPlaybackState();
		//    3    7:aload_0         
		//    4    8:getfield        #81  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #250 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    6   16:astore_1        
			return playbackstatecompat;
		//    7   17:aload_1         
		//    8   18:areturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_1        
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackState. ").append(((Object) (remoteexception))).toString());
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:new             #126 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #127 <Method void StringBuilder()>
		//   14   29:ldc1            #252 <String "Dead object in getPlaybackState. ">
		//   15   31:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   16   34:aload_1         
		//   17   35:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   18   38:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   19   41:invokestatic    #146 <Method int Log.e(String, String)>
		//   20   44:pop             
			Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
		//   21   45:aload_0         
		//   22   46:getfield        #64  <Field Object mControllerObj>
		//   23   49:invokestatic    #254 <Method Object MediaControllerCompatApi21.getPlaybackState(Object)>
		//   24   52:astore_1        
			if(obj != null)
		//*  25   53:aload_1         
		//*  26   54:ifnull          62
				return PlaybackStateCompat.fromPlaybackState(obj);
		//   27   57:aload_1         
		//   28   58:invokestatic    #260 <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//   29   61:areturn         
			else
				return null;
		//   30   62:aconst_null     
		//   31   63:areturn         
		}

		public List getQueue()
		{
			List list = MediaControllerCompatApi21.getQueue(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #265 <Method List MediaControllerCompatApi21.getQueue(Object)>
		//    3    7:astore_1        
			if(list != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaSessionCompat.QueueItem.fromQueueItemList(list);
		//    6   12:aload_1         
		//    7   13:invokestatic    #271 <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
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
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #278 <Method CharSequence MediaControllerCompatApi21.getQueueTitle(Object)>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			if(android.os.Build.VERSION.SDK_INT >= 22 || mExtraBinder == null)
				break MISSING_BLOCK_LABEL_54;
		//    0    0:getstatic       #286 <Field int android.os.Build$VERSION.SDK_INT>
		//    1    3:bipush          22
		//    2    5:icmpge          54
		//    3    8:aload_0         
		//    4    9:getfield        #81  <Field IMediaSession mExtraBinder>
		//    5   12:ifnull          54
			int i = mExtraBinder.getRatingType();
		//    6   15:aload_0         
		//    7   16:getfield        #81  <Field IMediaSession mExtraBinder>
		//    8   19:invokeinterface #288 <Method int IMediaSession.getRatingType()>
		//    9   24:istore_1        
			return i;
		//   10   25:iload_1         
		//   11   26:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   12   27:astore_2        
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRatingType. ").append(((Object) (remoteexception))).toString());
		//   13   28:ldc1            #124 <String "MediaControllerCompat">
		//   14   30:new             #126 <Class StringBuilder>
		//   15   33:dup             
		//   16   34:invokespecial   #127 <Method void StringBuilder()>
		//   17   37:ldc2            #290 <String "Dead object in getRatingType. ">
		//   18   40:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   19   43:aload_2         
		//   20   44:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   21   47:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   22   50:invokestatic    #146 <Method int Log.e(String, String)>
		//   23   53:pop             
			return MediaControllerCompatApi21.getRatingType(mControllerObj);
		//   24   54:aload_0         
		//   25   55:getfield        #64  <Field Object mControllerObj>
		//   26   58:invokestatic    #292 <Method int MediaControllerCompatApi21.getRatingType(Object)>
		//   27   61:ireturn         
		}

		public int getRepeatMode()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_46;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          46
			int i = mExtraBinder.getRepeatMode();
		//    3    7:aload_0         
		//    4    8:getfield        #81  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #295 <Method int IMediaSession.getRepeatMode()>
		//    6   16:istore_1        
			return i;
		//    7   17:iload_1         
		//    8   18:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_2        
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRepeatMode. ").append(((Object) (remoteexception))).toString());
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:new             #126 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #127 <Method void StringBuilder()>
		//   14   29:ldc2            #297 <String "Dead object in getRepeatMode. ">
		//   15   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:aload_2         
		//   17   36:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   18   39:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   19   42:invokestatic    #146 <Method int Log.e(String, String)>
		//   20   45:pop             
			return 0;
		//   21   46:iconst_0        
		//   22   47:ireturn         
		}

		public PendingIntent getSessionActivity()
		{
			return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #302 <Method PendingIntent MediaControllerCompatApi21.getSessionActivity(Object)>
		//    3    7:areturn         
		}

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:invokestatic    #306 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi21(obj)));
		//    6   12:new             #308 <Class MediaControllerCompat$TransportControlsApi21>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #311 <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public boolean isShuffleModeEnabled()
		{
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_46;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field IMediaSession mExtraBinder>
		//    2    4:ifnull          46
			boolean flag = mExtraBinder.isShuffleModeEnabled();
		//    3    7:aload_0         
		//    4    8:getfield        #81  <Field IMediaSession mExtraBinder>
		//    5   11:invokeinterface #314 <Method boolean IMediaSession.isShuffleModeEnabled()>
		//    6   16:istore_1        
			return flag;
		//    7   17:iload_1         
		//    8   18:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//    9   19:astore_2        
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in isShuffleModeEnabled. ").append(((Object) (remoteexception))).toString());
		//   10   20:ldc1            #124 <String "MediaControllerCompat">
		//   11   22:new             #126 <Class StringBuilder>
		//   12   25:dup             
		//   13   26:invokespecial   #127 <Method void StringBuilder()>
		//   14   29:ldc2            #316 <String "Dead object in isShuffleModeEnabled. ">
		//   15   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:aload_2         
		//   17   36:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   18   39:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   19   42:invokestatic    #146 <Method int Log.e(String, String)>
		//   20   45:pop             
			return false;
		//   21   46:iconst_0        
		//   22   47:ireturn         
		}

		public final void registerCallback(Callback callback, Handler handler)
		{
			MediaControllerCompatApi21.registerCallback(mControllerObj, callback.mCallbackObj, handler);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #322 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
		//    4    8:aload_2         
		//    5    9:invokestatic    #325 <Method void MediaControllerCompatApi21.registerCallback(Object, Object, Handler)>
			if(mExtraBinder != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #81  <Field IMediaSession mExtraBinder>
		//*   8   16:ifnull          89
			{
				callback.setHandler(handler);
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:invokestatic    #328 <Method void MediaControllerCompat$Callback.access$300(MediaControllerCompat$Callback, Handler)>
				handler = ((Handler) (new ExtraCallback(callback)));
		//   12   24:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   13   27:dup             
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokespecial   #108 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$MediaControllerImplApi21, MediaControllerCompat$Callback)>
		//   17   33:astore_2        
				mCallbackMap.put(((Object) (callback)), ((Object) (handler)));
		//   18   34:aload_0         
		//   19   35:getfield        #45  <Field HashMap mCallbackMap>
		//   20   38:aload_1         
		//   21   39:aload_2         
		//   22   40:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
		//   23   43:pop             
				callback.mHasExtraCallback = true;
		//   24   44:aload_1         
		//   25   45:iconst_1        
		//   26   46:putfield        #116 <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
				try
				{
					mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (handler)));
		//   27   49:aload_0         
		//   28   50:getfield        #81  <Field IMediaSession mExtraBinder>
		//   29   53:aload_2         
		//   30   54:invokeinterface #122 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
				}
		//*  31   59:goto            88
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  32   62:astore_1        
				{
					Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in registerCallback. ").append(((Object) (callback))).toString());
		//   33   63:ldc1            #124 <String "MediaControllerCompat">
		//   34   65:new             #126 <Class StringBuilder>
		//   35   68:dup             
		//   36   69:invokespecial   #127 <Method void StringBuilder()>
		//   37   72:ldc1            #129 <String "Dead object in registerCallback. ">
		//   38   74:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   39   77:aload_1         
		//   40   78:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   41   81:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   42   84:invokestatic    #146 <Method int Log.e(String, String)>
		//   43   87:pop             
				}
				return;
		//   44   88:return          
			}
			callback.setHandler(handler);
		//   45   89:aload_1         
		//   46   90:aload_2         
		//   47   91:invokestatic    #328 <Method void MediaControllerCompat$Callback.access$300(MediaControllerCompat$Callback, Handler)>
			handler = ((Handler) (mPendingCallbacks));
		//   48   94:aload_0         
		//   49   95:getfield        #50  <Field List mPendingCallbacks>
		//   50   98:astore_2        
			handler;
		//   51   99:aload_2         
			JVM INSTR monitorenter ;
		//   52  100:monitorenter    
			mPendingCallbacks.add(((Object) (callback)));
		//   53  101:aload_0         
		//   54  102:getfield        #50  <Field List mPendingCallbacks>
		//   55  105:aload_1         
		//   56  106:invokeinterface #332 <Method boolean List.add(Object)>
		//   57  111:pop             
			handler;
		//   58  112:aload_2         
			JVM INSTR monitorexit ;
		//   59  113:monitorexit     
			return;
		//   60  114:return          
			callback;
		//   61  115:astore_1        
		//*  62  116:aload_2         
			throw callback;
		//   63  117:monitorexit     
		//   64  118:aload_1         
		//   65  119:athrow          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #165 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #166 <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//    4    8:aload_2         
		//    5    9:ldc1            #168 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #172 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//    8   15:aload_0         
		//    9   16:ldc2            #335 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//   10   19:aload_2         
		//   11   20:aconst_null     
		//   12   21:invokevirtual   #161 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   13   24:return          
		}

		public void removeQueueItemAt(int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #165 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #166 <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
		//    4    8:aload_2         
		//    5    9:ldc1            #177 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #181 <Method void Bundle.putInt(String, int)>
			sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
		//    8   15:aload_0         
		//    9   16:ldc2            #339 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
		//   10   19:aload_2         
		//   11   20:aconst_null     
		//   12   21:invokevirtual   #161 <Method void sendCommand(String, Bundle, ResultReceiver)>
		//   13   24:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #342 <Method void MediaControllerCompatApi21.sendCommand(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public void setVolumeTo(int i, int j)
		{
			MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #345 <Method void MediaControllerCompatApi21.setVolumeTo(Object, int, int)>
		//    5    9:return          
		}

		public final void unregisterCallback(Callback callback)
		{
			MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #322 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
		//    4    8:invokestatic    #350 <Method void MediaControllerCompatApi21.unregisterCallback(Object, Object)>
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_73;
		//    5   11:aload_0         
		//    6   12:getfield        #81  <Field IMediaSession mExtraBinder>
		//    7   15:ifnull          73
			try
			{
				callback = ((Callback) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
		//    8   18:aload_0         
		//    9   19:getfield        #45  <Field HashMap mCallbackMap>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #353 <Method Object HashMap.remove(Object)>
		//   12   26:checkcast       #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   13   29:astore_1        
			}
		//*  14   30:aload_1         
		//*  15   31:ifnull          44
		//*  16   34:aload_0         
		//*  17   35:getfield        #81  <Field IMediaSession mExtraBinder>
		//*  18   38:aload_1         
		//*  19   39:invokeinterface #356 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
		//*  20   44:return          
			// Misplaced declaration of an exception variable
			catch(Callback callback)
		//*  21   45:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in unregisterCallback. ").append(((Object) (callback))).toString());
		//   22   46:ldc1            #124 <String "MediaControllerCompat">
		//   23   48:new             #126 <Class StringBuilder>
		//   24   51:dup             
		//   25   52:invokespecial   #127 <Method void StringBuilder()>
		//   26   55:ldc2            #358 <String "Dead object in unregisterCallback. ">
		//   27   58:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
		//   28   61:aload_1         
		//   29   62:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
		//   30   65:invokevirtual   #140 <Method String StringBuilder.toString()>
		//   31   68:invokestatic    #146 <Method int Log.e(String, String)>
		//   32   71:pop             
				return;
		//   33   72:return          
			}
			if(callback == null)
				break MISSING_BLOCK_LABEL_44;
			mExtraBinder.unregisterCallbackListener(((IMediaControllerCallback) (callback)));
			return;
			List list = mPendingCallbacks;
		//   34   73:aload_0         
		//   35   74:getfield        #50  <Field List mPendingCallbacks>
		//   36   77:astore_2        
			list;
		//   37   78:aload_2         
			JVM INSTR monitorenter ;
		//   38   79:monitorenter    
			mPendingCallbacks.remove(((Object) (callback)));
		//   39   80:aload_0         
		//   40   81:getfield        #50  <Field List mPendingCallbacks>
		//   41   84:aload_1         
		//   42   85:invokeinterface #360 <Method boolean List.remove(Object)>
		//   43   90:pop             
			list;
		//   44   91:aload_2         
			JVM INSTR monitorexit ;
		//   45   92:monitorexit     
			return;
		//   46   93:return          
			callback;
		//   47   94:astore_1        
		//*  48   95:aload_2         
			throw callback;
		//   49   96:monitorexit     
		//   50   97:aload_1         
		//   51   98:athrow          
		}

		private HashMap mCallbackMap;
		protected final Object mControllerObj;
		private IMediaSession mExtraBinder;
		private List mPendingCallbacks;


/*
		static IMediaSession access$000(MediaControllerImplApi21 mediacontrollerimplapi21)
		{
			return mediacontrollerimplapi21.mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field IMediaSession mExtraBinder>
		//    2    4:areturn         
		}

*/


/*
		static IMediaSession access$002(MediaControllerImplApi21 mediacontrollerimplapi21, IMediaSession imediasession)
		{
			mediacontrollerimplapi21.mExtraBinder = imediasession;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field IMediaSession mExtraBinder>
			return imediasession;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static void access$400(MediaControllerImplApi21 mediacontrollerimplapi21)
		{
			mediacontrollerimplapi21.processPendingCallbacks();
		//    0    0:aload_0         
		//    1    1:invokespecial   #88  <Method void processPendingCallbacks()>
			return;
		//    2    4:return          
		}

*/

		public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void Object()>
			mCallbackMap = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #42  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #43  <Method void HashMap()>
		//    6   12:putfield        #45  <Field HashMap mCallbackMap>
			mPendingCallbacks = ((List) (new ArrayList()));
		//    7   15:aload_0         
		//    8   16:new             #47  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #48  <Method void ArrayList()>
		//   11   23:putfield        #50  <Field List mPendingCallbacks>
			mControllerObj = MediaControllerCompatApi21.fromToken(context, token.getToken());
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #56  <Method Object MediaSessionCompat$Token.getToken()>
		//   16   32:invokestatic    #62  <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
		//   17   35:putfield        #64  <Field Object mControllerObj>
			if(mControllerObj == null)
		//*  18   38:aload_0         
		//*  19   39:getfield        #64  <Field Object mControllerObj>
		//*  20   42:ifnonnull       53
			{
				throw new RemoteException();
		//   21   45:new             #37  <Class RemoteException>
		//   22   48:dup             
		//   23   49:invokespecial   #65  <Method void RemoteException()>
		//   24   52:athrow          
			} else
			{
				requestExtraBinder();
		//   25   53:aload_0         
		//   26   54:invokespecial   #68  <Method void requestExtraBinder()>
				return;
		//   27   57:return          
			}
		}

		public MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void Object()>
			mCallbackMap = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #42  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #43  <Method void HashMap()>
		//    6   12:putfield        #45  <Field HashMap mCallbackMap>
			mPendingCallbacks = ((List) (new ArrayList()));
		//    7   15:aload_0         
		//    8   16:new             #47  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #48  <Method void ArrayList()>
		//   11   23:putfield        #50  <Field List mPendingCallbacks>
			mControllerObj = MediaControllerCompatApi21.fromToken(context, mediasessioncompat.getSessionToken().getToken());
		//   12   26:aload_0         
		//   13   27:aload_1         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #77  <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
		//   16   32:invokevirtual   #56  <Method Object MediaSessionCompat$Token.getToken()>
		//   17   35:invokestatic    #62  <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
		//   18   38:putfield        #64  <Field Object mControllerObj>
			requestExtraBinder();
		//   19   41:aload_0         
		//   20   42:invokespecial   #68  <Method void requestExtraBinder()>
		//   21   45:return          
		}
	}

	static class MediaControllerImplApi21.ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerImplApi21)mMediaControllerImpl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference mMediaControllerImpl>
		//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaControllerCompat$MediaControllerImplApi21>
		//    4   10:astore_3        
			if(mediacontrollerimplapi21 == null || bundle == null)
		//*   5   11:aload_3         
		//*   6   12:ifnull          19
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
		//   15   30:invokestatic    #50  <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$002(MediaControllerCompat$MediaControllerImplApi21, IMediaSession)>
		//   16   33:pop             
				mediacontrollerimplapi21.processPendingCallbacks();
		//   17   34:aload_3         
		//   18   35:invokestatic    #54  <Method void MediaControllerCompat$MediaControllerImplApi21.access$400(MediaControllerCompat$MediaControllerImplApi21)>
				return;
		//   19   38:return          
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

	class MediaControllerImplApi21.ExtraCallback extends IMediaControllerCallback.Stub
	{

		public void onEvent(final String event, Bundle bundle)
			throws RemoteException
		{
			mCallback.mHandler.post(((_cls1) (bundle)). new Runnable() {

				public void run()
				{
					mCallback.onSessionEvent(event, extras);
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				//    2    4:invokestatic    #40  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #29  <Field String val$event>
				//    5   11:aload_0         
				//    6   12:getfield        #31  <Field Bundle val$extras>
				//    7   15:invokevirtual   #45  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				//    8   18:return          
				}

				final MediaControllerImplApi21.ExtraCallback this$1;
				final String val$event;
				final Bundle val$extras;

			
			{
				this$1 = final_extracallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				event = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field String val$event>
				extras = Bundle.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Bundle val$extras>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #34  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:new             #12  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #47  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, String, Bundle)>
		//    9   17:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		public void onExtrasChanged(Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
			throws RemoteException
		{
			mCallback.mHandler.post(((_cls2) (playbackstatecompat)). new Runnable() {

				public void run()
				{
					mCallback.onPlaybackStateChanged(state);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field PlaybackStateCompat val$state>
				//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				//    6   14:return          
				}

				final MediaControllerImplApi21.ExtraCallback this$1;
				final PlaybackStateCompat val$state;

			
			{
				this$1 = final_extracallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				state = PlaybackStateCompat.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field PlaybackStateCompat val$state>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$2>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #66  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$2(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, PlaybackStateCompat)>
		//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void onQueueChanged(List list)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onRepeatModeChanged(int i)
			throws RemoteException
		{
			mCallback.mHandler.post(((_cls3) (i)). new Runnable() {

				public void run()
				{
					mCallback.onRepeatModeChanged(repeatMode);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field int val$repeatMode>
				//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
				//    6   14:return          
				}

				final MediaControllerImplApi21.ExtraCallback this$1;
				final int val$repeatMode;

			
			{
				this$1 = final_extracallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				repeatMode = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$repeatMode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:new             #16  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$3>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:iload_1         
		//    7   13:invokespecial   #77  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$3(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, int)>
		//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void onSessionDestroyed()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void onShuffleModeChanged(boolean flag)
			throws RemoteException
		{
			mCallback.mHandler.post(((_cls4) (flag)). new Runnable() {

				public void run()
				{
					mCallback.onShuffleModeChanged(enabled);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field boolean val$enabled>
				//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
				//    6   14:return          
				}

				final MediaControllerImplApi21.ExtraCallback this$1;
				final boolean val$enabled;

			
			{
				this$1 = final_extracallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
				enabled = Z.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field boolean val$enabled>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:getfield        #44  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
		//    3    7:new             #18  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:iload_1         
		//    7   13:invokespecial   #83  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, boolean)>
		//    8   16:invokevirtual   #53  <Method boolean MediaControllerCompat$Callback$MessageHandler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #58  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #59  <Method void AssertionError()>
		//    3    7:athrow          
		}

		private Callback mCallback;
		final MediaControllerImplApi21 this$0;


/*
		static Callback access$500(MediaControllerImplApi21.ExtraCallback extracallback)
		{
			return extracallback.mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:areturn         
		}

*/

		MediaControllerImplApi21.ExtraCallback(Callback callback)
		{
			this$0 = MediaControllerImplApi21.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field MediaControllerCompat$MediaControllerImplApi21 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #29  <Method void IMediaControllerCallback$Stub()>
			mCallback = callback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    8   14:return          
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
		//    3    3:invokespecial   #13  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}

		public MediaControllerImplApi23(Context context, MediaSessionCompat mediasessioncompat)
		{
			super(context, mediasessioncompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat)>
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
		//    3    3:invokespecial   #13  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}

		public MediaControllerImplApi24(Context context, MediaSessionCompat mediasessioncompat)
		{
			super(context, mediasessioncompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat)>
		//    4    6:return          
		}
	}

	static class MediaControllerImplApi26 extends MediaControllerImplApi24
	{

		public int getRepeatMode()
		{
			return MediaControllerCompatApi26.getRepeatMode(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Object mControllerObj>
		//    2    4:invokestatic    #29  <Method int MediaControllerCompatApi26.getRepeatMode(Object)>
		//    3    7:ireturn         
		}

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Object mControllerObj>
		//    2    4:invokestatic    #36  <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi26(obj)));
		//    6   12:new             #38  <Class MediaControllerCompat$TransportControlsApi26>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #41  <Method void MediaControllerCompat$TransportControlsApi26(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public boolean isShuffleModeEnabled()
		{
			return MediaControllerCompatApi26.isShuffleModeEnabled(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Object mControllerObj>
		//    2    4:invokestatic    #46  <Method boolean MediaControllerCompatApi26.isShuffleModeEnabled(Object)>
		//    3    7:ireturn         
		}

		MediaControllerImplApi26(Context context, MediaSessionCompat.Token token)
			throws RemoteException
		{
			super(context, token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #13  <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
		//    4    6:return          
		}

		MediaControllerImplApi26(Context context, MediaSessionCompat mediasessioncompat)
		{
			super(context, mediasessioncompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat)>
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
				if((4L & mBinder.getFlags()) == 0L)
		//*   0    0:ldc2w           #44  <Long 4L>
		//*   1    3:aload_0         
		//*   2    4:getfield        #38  <Field IMediaSession mBinder>
		//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #53  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.addQueueItem(mediadescriptioncompat);
		//   13   28:aload_0         
		//   14   29:getfield        #38  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:invokeinterface #60  <Method void IMediaSession.addQueueItem(MediaDescriptionCompat)>
					return;
		//   17   38:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  18   39:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in addQueueItem. ").append(((Object) (mediadescriptioncompat))).toString());
		//   19   40:ldc1            #62  <String "MediaControllerCompat">
		//   20   42:new             #64  <Class StringBuilder>
		//   21   45:dup             
		//   22   46:invokespecial   #65  <Method void StringBuilder()>
		//   23   49:ldc1            #67  <String "Dead object in addQueueItem. ">
		//   24   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   25   54:aload_1         
		//   26   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   27   58:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   28   61:invokestatic    #84  <Method int Log.e(String, String)>
		//   29   64:pop             
			}
		//   30   65:return          
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			try
			{
				if((4L & mBinder.getFlags()) == 0L)
		//*   0    0:ldc2w           #44  <Long 4L>
		//*   1    3:aload_0         
		//*   2    4:getfield        #38  <Field IMediaSession mBinder>
		//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #53  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.addQueueItemAt(mediadescriptioncompat, i);
		//   13   28:aload_0         
		//   14   29:getfield        #38  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:iload_2         
		//   17   34:invokeinterface #88  <Method void IMediaSession.addQueueItemAt(MediaDescriptionCompat, int)>
					return;
		//   18   39:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  19   40:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in addQueueItemAt. ").append(((Object) (mediadescriptioncompat))).toString());
		//   20   41:ldc1            #62  <String "MediaControllerCompat">
		//   21   43:new             #64  <Class StringBuilder>
		//   22   46:dup             
		//   23   47:invokespecial   #65  <Method void StringBuilder()>
		//   24   50:ldc1            #90  <String "Dead object in addQueueItemAt. ">
		//   25   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   26   55:aload_1         
		//   27   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   28   59:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   29   62:invokestatic    #84  <Method int Log.e(String, String)>
		//   30   65:pop             
			}
		//   31   66:return          
		}

		public void adjustVolume(int i, int j)
		{
			try
			{
				mBinder.adjustVolume(i, j, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokeinterface #95  <Method void IMediaSession.adjustVolume(int, int, String)>
				return;
		//    6   12:return          
			}
			catch(RemoteException remoteexception)
		//*   7   13:astore_3        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in adjustVolume. ").append(((Object) (remoteexception))).toString());
		//    8   14:ldc1            #62  <String "MediaControllerCompat">
		//    9   16:new             #64  <Class StringBuilder>
		//   10   19:dup             
		//   11   20:invokespecial   #65  <Method void StringBuilder()>
		//   12   23:ldc1            #97  <String "Dead object in adjustVolume. ">
		//   13   25:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   14   28:aload_3         
		//   15   29:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   16   32:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   17   35:invokestatic    #84  <Method int Log.e(String, String)>
		//   18   38:pop             
			}
		//   19   39:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			if(keyevent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("event may not be null.");
		//    2    4:new             #101 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #103 <String "event may not be null.">
		//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.sendMediaButton(keyevent);
		//    7   14:aload_0         
		//    8   15:getfield        #38  <Field IMediaSession mBinder>
		//    9   18:aload_1         
		//   10   19:invokeinterface #107 <Method boolean IMediaSession.sendMediaButton(KeyEvent)>
		//   11   24:pop             
			}
		//*  12   25:goto            54
			// Misplaced declaration of an exception variable
			catch(KeyEvent keyevent)
		//*  13   28:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in dispatchMediaButtonEvent. ").append(((Object) (keyevent))).toString());
		//   14   29:ldc1            #62  <String "MediaControllerCompat">
		//   15   31:new             #64  <Class StringBuilder>
		//   16   34:dup             
		//   17   35:invokespecial   #65  <Method void StringBuilder()>
		//   18   38:ldc1            #109 <String "Dead object in dispatchMediaButtonEvent. ">
		//   19   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   20   43:aload_1         
		//   21   44:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   22   47:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   23   50:invokestatic    #84  <Method int Log.e(String, String)>
		//   24   53:pop             
			}
			return false;
		//   25   54:iconst_0        
		//   26   55:ireturn         
		}

		public Bundle getExtras()
		{
			Bundle bundle;
			try
			{
				bundle = mBinder.getExtras();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #113 <Method Bundle IMediaSession.getExtras()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getExtras. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #115 <String "Dead object in getExtras. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #51  <Method long IMediaSession.getFlags()>
		//    3    9:lstore_1        
			}
		//*   4   10:lload_1         
		//*   5   11:lreturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_3        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getFlags. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #117 <String "Dead object in getFlags. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_3         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return 0L;
		//   18   38:lconst_0        
		//   19   39:lreturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #122 <Method MediaMetadataCompat IMediaSession.getMetadata()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getMetadata. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #124 <String "Dead object in getMetadata. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #127 <Method String IMediaSession.getPackageName()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPackageName. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #129 <String "Dead object in getPackageName. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #135 <Method ParcelableVolumeInfo IMediaSession.getVolumeAttributes()>
		//    3    9:astore_1        
				obj = ((Object) (new PlaybackInfo(((ParcelableVolumeInfo) (obj)).volumeType, ((ParcelableVolumeInfo) (obj)).audioStream, ((ParcelableVolumeInfo) (obj)).controlType, ((ParcelableVolumeInfo) (obj)).maxVolume, ((ParcelableVolumeInfo) (obj)).currentVolume)));
		//    4   10:new             #137 <Class MediaControllerCompat$PlaybackInfo>
		//    5   13:dup             
		//    6   14:aload_1         
		//    7   15:getfield        #143 <Field int ParcelableVolumeInfo.volumeType>
		//    8   18:aload_1         
		//    9   19:getfield        #146 <Field int ParcelableVolumeInfo.audioStream>
		//   10   22:aload_1         
		//   11   23:getfield        #149 <Field int ParcelableVolumeInfo.controlType>
		//   12   26:aload_1         
		//   13   27:getfield        #152 <Field int ParcelableVolumeInfo.maxVolume>
		//   14   30:aload_1         
		//   15   31:getfield        #155 <Field int ParcelableVolumeInfo.currentVolume>
		//   16   34:invokespecial   #158 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   17   37:astore_1        
			}
		//*  18   38:aload_1         
		//*  19   39:areturn         
			catch(RemoteException remoteexception)
		//*  20   40:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackInfo. ").append(((Object) (remoteexception))).toString());
		//   21   41:ldc1            #62  <String "MediaControllerCompat">
		//   22   43:new             #64  <Class StringBuilder>
		//   23   46:dup             
		//   24   47:invokespecial   #65  <Method void StringBuilder()>
		//   25   50:ldc1            #160 <String "Dead object in getPlaybackInfo. ">
		//   26   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   27   55:aload_1         
		//   28   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   29   59:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   30   62:invokestatic    #84  <Method int Log.e(String, String)>
		//   31   65:pop             
				return null;
		//   32   66:aconst_null     
		//   33   67:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #164 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackState. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #166 <String "Dead object in getPlaybackState. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #170 <Method List IMediaSession.getQueue()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueue. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #172 <String "Dead object in getQueue. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #178 <Method CharSequence IMediaSession.getQueueTitle()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueueTitle. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #180 <String "Dead object in getQueueTitle. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #184 <Method int IMediaSession.getRatingType()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRatingType. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #186 <String "Dead object in getRatingType. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_2         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return 0;
		//   18   38:iconst_0        
		//   19   39:ireturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #189 <Method int IMediaSession.getRepeatMode()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRepeatMode. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #191 <String "Dead object in getRepeatMode. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_2         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return 0;
		//   18   38:iconst_0        
		//   19   39:ireturn         
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
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #196 <Method PendingIntent IMediaSession.getLaunchPendingIntent()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_1         
		//*   5   11:areturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getSessionActivity. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #198 <String "Dead object in getSessionActivity. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return null;
		//   18   38:aconst_null     
		//   19   39:areturn         
			}
			return pendingintent;
		}

		public TransportControls getTransportControls()
		{
			if(mTransportControls == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
		//*   2    4:ifnonnull       22
				mTransportControls = ((TransportControls) (new TransportControlsBase(mBinder)));
		//    3    7:aload_0         
		//    4    8:new             #204 <Class MediaControllerCompat$TransportControlsBase>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #38  <Field IMediaSession mBinder>
		//    8   16:invokespecial   #207 <Method void MediaControllerCompat$TransportControlsBase(IMediaSession)>
		//    9   19:putfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
			return mTransportControls;
		//   10   22:aload_0         
		//   11   23:getfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
		//   12   26:areturn         
		}

		public boolean isShuffleModeEnabled()
		{
			boolean flag;
			try
			{
				flag = mBinder.isShuffleModeEnabled();
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #211 <Method boolean IMediaSession.isShuffleModeEnabled()>
		//    3    9:istore_1        
			}
		//*   4   10:iload_1         
		//*   5   11:ireturn         
			catch(RemoteException remoteexception)
		//*   6   12:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in isShuffleModeEnabled. ").append(((Object) (remoteexception))).toString());
		//    7   13:ldc1            #62  <String "MediaControllerCompat">
		//    8   15:new             #64  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #65  <Method void StringBuilder()>
		//   11   22:ldc1            #213 <String "Dead object in isShuffleModeEnabled. ">
		//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_2         
		//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
		//   17   37:pop             
				return false;
		//   18   38:iconst_0        
		//   19   39:ireturn         
			}
			return flag;
		}

		public void registerCallback(Callback callback, Handler handler)
		{
			if(callback == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("callback may not be null.");
		//    2    4:new             #101 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #217 <String "callback may not be null.">
		//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//    7   14:aload_0         
		//    8   15:getfield        #38  <Field IMediaSession mBinder>
		//    9   18:invokeinterface #221 <Method IBinder IMediaSession.asBinder()>
		//   10   23:aload_1         
		//   11   24:iconst_0        
		//   12   25:invokeinterface #225 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				mBinder.registerCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//   13   30:aload_0         
		//   14   31:getfield        #38  <Field IMediaSession mBinder>
		//   15   34:aload_1         
		//   16   35:invokestatic    #231 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
		//   17   38:checkcast       #233 <Class IMediaControllerCallback>
		//   18   41:invokeinterface #237 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
				callback.setHandler(handler);
		//   19   46:aload_1         
		//   20   47:aload_2         
		//   21   48:invokestatic    #240 <Method void MediaControllerCompat$Callback.access$300(MediaControllerCompat$Callback, Handler)>
				callback.mRegistered = true;
		//   22   51:aload_1         
		//   23   52:iconst_1        
		//   24   53:putfield        #244 <Field boolean MediaControllerCompat$Callback.mRegistered>
				return;
		//   25   56:return          
			}
			// Misplaced declaration of an exception variable
			catch(Handler handler)
		//*  26   57:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in registerCallback. ").append(((Object) (handler))).toString());
		//   27   58:ldc1            #62  <String "MediaControllerCompat">
		//   28   60:new             #64  <Class StringBuilder>
		//   29   63:dup             
		//   30   64:invokespecial   #65  <Method void StringBuilder()>
		//   31   67:ldc1            #246 <String "Dead object in registerCallback. ">
		//   32   69:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   33   72:aload_2         
		//   34   73:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   35   76:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   36   79:invokestatic    #84  <Method int Log.e(String, String)>
		//   37   82:pop             
			}
			callback.onSessionDestroyed();
		//   38   83:aload_1         
		//   39   84:invokevirtual   #249 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
		//   40   87:return          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			try
			{
				if((4L & mBinder.getFlags()) == 0L)
		//*   0    0:ldc2w           #44  <Long 4L>
		//*   1    3:aload_0         
		//*   2    4:getfield        #38  <Field IMediaSession mBinder>
		//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #53  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.removeQueueItem(mediadescriptioncompat);
		//   13   28:aload_0         
		//   14   29:getfield        #38  <Field IMediaSession mBinder>
		//   15   32:aload_1         
		//   16   33:invokeinterface #252 <Method void IMediaSession.removeQueueItem(MediaDescriptionCompat)>
					return;
		//   17   38:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(MediaDescriptionCompat mediadescriptioncompat)
		//*  18   39:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in removeQueueItem. ").append(((Object) (mediadescriptioncompat))).toString());
		//   19   40:ldc1            #62  <String "MediaControllerCompat">
		//   20   42:new             #64  <Class StringBuilder>
		//   21   45:dup             
		//   22   46:invokespecial   #65  <Method void StringBuilder()>
		//   23   49:ldc1            #254 <String "Dead object in removeQueueItem. ">
		//   24   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   25   54:aload_1         
		//   26   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   27   58:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   28   61:invokestatic    #84  <Method int Log.e(String, String)>
		//   29   64:pop             
			}
		//   30   65:return          
		}

		public void removeQueueItemAt(int i)
		{
			try
			{
				if((4L & mBinder.getFlags()) == 0L)
		//*   0    0:ldc2w           #44  <Long 4L>
		//*   1    3:aload_0         
		//*   2    4:getfield        #38  <Field IMediaSession mBinder>
		//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
		//*   4   12:land            
		//*   5   13:lconst_0        
		//*   6   14:lcmp            
		//*   7   15:ifne            28
				{
					throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//    8   18:new             #53  <Class UnsupportedOperationException>
		//    9   21:dup             
		//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
		//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//   12   27:athrow          
				} else
				{
					mBinder.removeQueueItemAt(i);
		//   13   28:aload_0         
		//   14   29:getfield        #38  <Field IMediaSession mBinder>
		//   15   32:iload_1         
		//   16   33:invokeinterface #258 <Method void IMediaSession.removeQueueItemAt(int)>
					return;
		//   17   38:return          
				}
			}
			catch(RemoteException remoteexception)
		//*  18   39:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in removeQueueItemAt. ").append(((Object) (remoteexception))).toString());
		//   19   40:ldc1            #62  <String "MediaControllerCompat">
		//   20   42:new             #64  <Class StringBuilder>
		//   21   45:dup             
		//   22   46:invokespecial   #65  <Method void StringBuilder()>
		//   23   49:ldc2            #260 <String "Dead object in removeQueueItemAt. ">
		//   24   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   25   55:aload_2         
		//   26   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   27   59:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   28   62:invokestatic    #84  <Method int Log.e(String, String)>
		//   29   65:pop             
			}
		//   30   66:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			try
			{
				mBinder.sendCommand(s, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultreceiver));
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:new             #264 <Class MediaSessionCompat$ResultReceiverWrapper>
		//    5    9:dup             
		//    6   10:aload_3         
		//    7   11:invokespecial   #267 <Method void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver)>
		//    8   14:invokeinterface #270 <Method void IMediaSession.sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
				return;
		//    9   19:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  10   20:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCommand. ").append(((Object) (s))).toString());
		//   11   21:ldc1            #62  <String "MediaControllerCompat">
		//   12   23:new             #64  <Class StringBuilder>
		//   13   26:dup             
		//   14   27:invokespecial   #65  <Method void StringBuilder()>
		//   15   30:ldc2            #272 <String "Dead object in sendCommand. ">
		//   16   33:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   17   36:aload_1         
		//   18   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   19   40:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   20   43:invokestatic    #84  <Method int Log.e(String, String)>
		//   21   46:pop             
			}
		//   22   47:return          
		}

		public void setVolumeTo(int i, int j)
		{
			try
			{
				mBinder.setVolumeTo(i, j, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aconst_null     
		//    5    7:invokeinterface #275 <Method void IMediaSession.setVolumeTo(int, int, String)>
				return;
		//    6   12:return          
			}
			catch(RemoteException remoteexception)
		//*   7   13:astore_3        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setVolumeTo. ").append(((Object) (remoteexception))).toString());
		//    8   14:ldc1            #62  <String "MediaControllerCompat">
		//    9   16:new             #64  <Class StringBuilder>
		//   10   19:dup             
		//   11   20:invokespecial   #65  <Method void StringBuilder()>
		//   12   23:ldc2            #277 <String "Dead object in setVolumeTo. ">
		//   13   26:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   14   29:aload_3         
		//   15   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   16   33:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   17   36:invokestatic    #84  <Method int Log.e(String, String)>
		//   18   39:pop             
			}
		//   19   40:return          
		}

		public void unregisterCallback(Callback callback)
		{
			if(callback == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("callback may not be null.");
		//    2    4:new             #101 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #217 <String "callback may not be null.">
		//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			try
			{
				mBinder.unregisterCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
		//    7   14:aload_0         
		//    8   15:getfield        #38  <Field IMediaSession mBinder>
		//    9   18:aload_1         
		//   10   19:invokestatic    #231 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
		//   11   22:checkcast       #233 <Class IMediaControllerCallback>
		//   12   25:invokeinterface #282 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
				mBinder.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
		//   13   30:aload_0         
		//   14   31:getfield        #38  <Field IMediaSession mBinder>
		//   15   34:invokeinterface #221 <Method IBinder IMediaSession.asBinder()>
		//   16   39:aload_1         
		//   17   40:iconst_0        
		//   18   41:invokeinterface #286 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   19   46:pop             
				callback.mRegistered = false;
		//   20   47:aload_1         
		//   21   48:iconst_0        
		//   22   49:putfield        #244 <Field boolean MediaControllerCompat$Callback.mRegistered>
				return;
		//   23   52:return          
			}
			// Misplaced declaration of an exception variable
			catch(Callback callback)
		//*  24   53:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in unregisterCallback. ").append(((Object) (callback))).toString());
		//   25   54:ldc1            #62  <String "MediaControllerCompat">
		//   26   56:new             #64  <Class StringBuilder>
		//   27   59:dup             
		//   28   60:invokespecial   #65  <Method void StringBuilder()>
		//   29   63:ldc2            #288 <String "Dead object in unregisterCallback. ">
		//   30   66:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   31   69:aload_1         
		//   32   70:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   33   73:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   34   76:invokestatic    #84  <Method int Log.e(String, String)>
		//   35   79:pop             
			}
		//   36   80:return          
		}

		private IMediaSession mBinder;
		private MediaSessionCompat.Token mToken;
		private TransportControls mTransportControls;

		public MediaControllerImplBase(MediaSessionCompat.Token token)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mToken = token;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field MediaSessionCompat$Token mToken>
			mBinder = IMediaSession.Stub.asInterface((IBinder)token.getToken());
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #28  <Method Object MediaSessionCompat$Token.getToken()>
		//    8   14:checkcast       #30  <Class IBinder>
		//    9   17:invokestatic    #36  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
		//   10   20:putfield        #38  <Field IMediaSession mBinder>
		//   11   23:return          
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

		public abstract void setRating(RatingCompat ratingcompat);

		public abstract void setRepeatMode(int i);

		public abstract void setShuffleModeEnabled(boolean flag);

		public abstract void skipToNext();

		public abstract void skipToPrevious();

		public abstract void skipToQueueItem(long l);

		public abstract void stop();

		TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
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
			if(uri == null || Uri.EMPTY.equals(((Object) (uri))))
		//*   0    0:aload_1         
		//*   1    1:ifnull          14
		//*   2    4:getstatic       #44  <Field Uri Uri.EMPTY>
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #48  <Method boolean Uri.equals(Object)>
		//*   5   11:ifeq            24
			{
				throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
		//    6   14:new             #50  <Class IllegalArgumentException>
		//    7   17:dup             
		//    8   18:ldc1            #52  <String "You must specify a non-empty Uri for playFromUri.">
		//    9   20:invokespecial   #55  <Method void IllegalArgumentException(String)>
		//   10   23:athrow          
			} else
			{
				Bundle bundle1 = new Bundle();
		//   11   24:new             #57  <Class Bundle>
		//   12   27:dup             
		//   13   28:invokespecial   #58  <Method void Bundle()>
		//   14   31:astore_3        
				bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
		//   15   32:aload_3         
		//   16   33:ldc1            #60  <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   17   35:aload_1         
		//   18   36:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", ((android.os.Parcelable) (bundle)));
		//   19   39:aload_3         
		//   20   40:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   21   42:aload_2         
		//   22   43:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle1);
		//   23   46:aload_0         
		//   24   47:ldc1            #68  <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//   25   49:aload_3         
		//   26   50:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
				return;
		//   27   53:return          
			}
		}

		public void prepare()
		{
			sendCustomAction("android.support.v4.media.session.action.PREPARE", ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:ldc1            #74  <String "android.support.v4.media.session.action.PREPARE">
		//    2    3:aconst_null     
		//    3    4:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
		//    4    7:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #57  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", s);
		//    4    8:aload_3         
		//    5    9:ldc1            #77  <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #86  <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #57  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", s);
		//    4    8:aload_3         
		//    5    9:ldc1            #89  <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #91  <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
		//   16   29:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #57  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void Bundle()>
		//    3    7:astore_3        
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
		//    4    8:aload_3         
		//    5    9:ldc1            #60  <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
		//    8   15:aload_3         
		//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
			sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle1);
		//   12   22:aload_0         
		//   13   23:ldc1            #94  <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//   14   25:aload_3         
		//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
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
			MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, customaction.getAction(), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #109 <Method String PlaybackStateCompat$CustomAction.getAction()>
		//    4    8:aload_2         
		//    5    9:invokestatic    #111 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
		//    6   12:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
		{
			MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #111 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
		//    5    9:return          
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
		//    6   10:invokevirtual   #119 <Method Object RatingCompat.getRating()>
		//    7   13:astore_1        
			else
		//*   8   14:goto            19
				ratingcompat = null;
		//    9   17:aconst_null     
		//   10   18:astore_1        
			MediaControllerCompatApi21.TransportControls.setRating(obj, ((Object) (ratingcompat)));
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:invokestatic    #122 <Method void MediaControllerCompatApi21$TransportControls.setRating(Object, Object)>
		//   14   24:return          
		}

		public void setRepeatMode(int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #57  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
		//    4    8:aload_2         
		//    5    9:ldc1            #126 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #130 <Method void Bundle.putInt(String, int)>
			sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
		//    8   15:aload_0         
		//    9   16:ldc1            #132 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
		//   12   22:return          
		}

		public void setShuffleModeEnabled(boolean flag)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #57  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED", flag);
		//    4    8:aload_2         
		//    5    9:ldc1            #136 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED">
		//    6   11:iload_1         
		//    7   12:invokevirtual   #140 <Method void Bundle.putBoolean(String, boolean)>
			sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED", bundle);
		//    8   15:aload_0         
		//    9   16:ldc1            #142 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED">
		//   10   18:aload_2         
		//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
		//   12   22:return          
		}

		public void skipToNext()
		{
			MediaControllerCompatApi21.TransportControls.skipToNext(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #145 <Method void MediaControllerCompatApi21$TransportControls.skipToNext(Object)>
		//    3    7:return          
		}

		public void skipToPrevious()
		{
			MediaControllerCompatApi21.TransportControls.skipToPrevious(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #148 <Method void MediaControllerCompatApi21$TransportControls.skipToPrevious(Object)>
		//    3    7:return          
		}

		public void skipToQueueItem(long l)
		{
			MediaControllerCompatApi21.TransportControls.skipToQueueItem(mControlsObj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:lload_1         
		//    3    5:invokestatic    #151 <Method void MediaControllerCompatApi21$TransportControls.skipToQueueItem(Object, long)>
		//    4    8:return          
		}

		public void stop()
		{
			MediaControllerCompatApi21.TransportControls.stop(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Object mControlsObj>
		//    2    4:invokestatic    #154 <Method void MediaControllerCompatApi21$TransportControls.stop(Object)>
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
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #23  <Method void MediaControllerCompatApi23$TransportControls.playFromUri(Object, Uri, Bundle)>
		//    5    9:return          
		}

		public TransportControlsApi23(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//    3    5:return          
		}
	}

	static class TransportControlsApi24 extends TransportControlsApi23
	{

		public void prepare()
		{
			MediaControllerCompatApi24.TransportControls.prepare(mControlsObj);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:invokestatic    #22  <Method void MediaControllerCompatApi24$TransportControls.prepare(Object)>
		//    3    7:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromMediaId(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #27  <Method void MediaControllerCompatApi24$TransportControls.prepareFromMediaId(Object, String, Bundle)>
		//    5    9:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromSearch(mControlsObj, s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method void MediaControllerCompatApi24$TransportControls.prepareFromSearch(Object, String, Bundle)>
		//    5    9:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
		{
			MediaControllerCompatApi24.TransportControls.prepareFromUri(mControlsObj, uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #35  <Method void MediaControllerCompatApi24$TransportControls.prepareFromUri(Object, Uri, Bundle)>
		//    5    9:return          
		}

		public TransportControlsApi24(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
		//    3    5:return          
		}
	}

	static class TransportControlsApi26 extends TransportControlsApi24
	{

		public void setRepeatMode(int i)
		{
			MediaControllerCompatApi26.TransportControls.setRepeatMode(mControlsObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #23  <Method void MediaControllerCompatApi26$TransportControls.setRepeatMode(Object, int)>
		//    4    8:return          
		}

		public void setShuffleModeEnabled(boolean flag)
		{
			MediaControllerCompatApi26.TransportControls.setShuffleModeEnabled(mControlsObj, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object mControlsObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #28  <Method void MediaControllerCompatApi26$TransportControls.setShuffleModeEnabled(Object, boolean)>
		//    4    8:return          
		}

		TransportControlsApi26(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void MediaControllerCompat$TransportControlsApi24(Object)>
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
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in fastForward. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #31  <String "Dead object in fastForward. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
		}

		public void pause()
		{
			try
			{
				mBinder.pause();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #51  <Method void IMediaSession.pause()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in pause. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #53  <String "Dead object in pause. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
		}

		public void play()
		{
			try
			{
				mBinder.play();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #56  <Method void IMediaSession.play()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in play. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #58  <String "Dead object in play. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
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
		//    4    6:invokeinterface #62  <Method void IMediaSession.playFromMediaId(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromMediaId. ").append(((Object) (s))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #64  <String "Dead object in playFromMediaId. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
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
		//    4    6:invokeinterface #67  <Method void IMediaSession.playFromSearch(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromSearch. ").append(((Object) (s))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #69  <String "Dead object in playFromSearch. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
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
		//    4    6:invokeinterface #73  <Method void IMediaSession.playFromUri(Uri, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromUri. ").append(((Object) (uri))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #75  <String "Dead object in playFromUri. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
		}

		public void prepare()
		{
			try
			{
				mBinder.prepare();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #78  <Method void IMediaSession.prepare()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepare. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #80  <String "Dead object in prepare. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
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
		//    4    6:invokeinterface #83  <Method void IMediaSession.prepareFromMediaId(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromMediaId. ").append(((Object) (s))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #85  <String "Dead object in prepareFromMediaId. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
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
		//    4    6:invokeinterface #88  <Method void IMediaSession.prepareFromSearch(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromSearch. ").append(((Object) (s))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #90  <String "Dead object in prepareFromSearch. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
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
		//    4    6:invokeinterface #93  <Method void IMediaSession.prepareFromUri(Uri, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromUri. ").append(((Object) (uri))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #95  <String "Dead object in prepareFromUri. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
		}

		public void rewind()
		{
			try
			{
				mBinder.rewind();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #98  <Method void IMediaSession.rewind()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in rewind. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #100 <String "Dead object in rewind. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
		}

		public void seekTo(long l)
		{
			try
			{
				mBinder.seekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:lload_1         
		//    3    5:invokeinterface #104 <Method void IMediaSession.seekTo(long)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_3        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in seekTo. ").append(((Object) (remoteexception))).toString());
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:new             #28  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #29  <Method void StringBuilder()>
		//   10   21:ldc1            #106 <String "Dead object in seekTo. ">
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_3         
		//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
		//   16   36:pop             
			}
		//   17   37:return          
		}

		public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
		{
			sendCustomAction(customaction.getAction(), bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #113 <Method String PlaybackStateCompat$CustomAction.getAction()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #115 <Method void sendCustomAction(String, Bundle)>
		//    5    9:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
		{
			try
			{
				mBinder.sendCustomAction(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #116 <Method void IMediaSession.sendCustomAction(String, Bundle)>
				return;
		//    5   11:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6   12:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCustomAction. ").append(((Object) (s))).toString());
		//    7   13:ldc1            #26  <String "MediaControllerCompat">
		//    8   15:new             #28  <Class StringBuilder>
		//    9   18:dup             
		//   10   19:invokespecial   #29  <Method void StringBuilder()>
		//   11   22:ldc1            #118 <String "Dead object in sendCustomAction. ">
		//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:aload_1         
		//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
		//   17   37:pop             
			}
		//   18   38:return          
		}

		public void setRating(RatingCompat ratingcompat)
		{
			try
			{
				mBinder.rate(ratingcompat);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:aload_1         
		//    3    5:invokeinterface #123 <Method void IMediaSession.rate(RatingCompat)>
				return;
		//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(RatingCompat ratingcompat)
		//*   5   11:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setRating. ").append(((Object) (ratingcompat))).toString());
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:new             #28  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #29  <Method void StringBuilder()>
		//   10   21:ldc1            #125 <String "Dead object in setRating. ">
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
		//   16   36:pop             
			}
		//   17   37:return          
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
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setRepeatMode. ").append(((Object) (remoteexception))).toString());
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:new             #28  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #29  <Method void StringBuilder()>
		//   10   21:ldc1            #131 <String "Dead object in setRepeatMode. ">
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
		//   16   36:pop             
			}
		//   17   37:return          
		}

		public void setShuffleModeEnabled(boolean flag)
		{
			try
			{
				mBinder.setShuffleModeEnabled(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:iload_1         
		//    3    5:invokeinterface #135 <Method void IMediaSession.setShuffleModeEnabled(boolean)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_2        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setShuffleModeEnabled. ").append(((Object) (remoteexception))).toString());
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:new             #28  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #29  <Method void StringBuilder()>
		//   10   21:ldc1            #137 <String "Dead object in setShuffleModeEnabled. ">
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
		//   16   36:pop             
			}
		//   17   37:return          
		}

		public void skipToNext()
		{
			try
			{
				mBinder.next();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #141 <Method void IMediaSession.next()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToNext. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #143 <String "Dead object in skipToNext. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
		}

		public void skipToPrevious()
		{
			try
			{
				mBinder.previous();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #147 <Method void IMediaSession.previous()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToPrevious. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #149 <String "Dead object in skipToPrevious. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
		}

		public void skipToQueueItem(long l)
		{
			try
			{
				mBinder.skipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:lload_1         
		//    3    5:invokeinterface #152 <Method void IMediaSession.skipToQueueItem(long)>
				return;
		//    4   10:return          
			}
			catch(RemoteException remoteexception)
		//*   5   11:astore_3        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToQueueItem. ").append(((Object) (remoteexception))).toString());
		//    6   12:ldc1            #26  <String "MediaControllerCompat">
		//    7   14:new             #28  <Class StringBuilder>
		//    8   17:dup             
		//    9   18:invokespecial   #29  <Method void StringBuilder()>
		//   10   21:ldc1            #154 <String "Dead object in skipToQueueItem. ">
		//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:aload_3         
		//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
		//   16   36:pop             
			}
		//   17   37:return          
		}

		public void stop()
		{
			try
			{
				mBinder.stop();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field IMediaSession mBinder>
		//    2    4:invokeinterface #157 <Method void IMediaSession.stop()>
				return;
		//    3    9:return          
			}
			catch(RemoteException remoteexception)
		//*   4   10:astore_1        
			{
				Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in stop. ").append(((Object) (remoteexception))).toString());
		//    5   11:ldc1            #26  <String "MediaControllerCompat">
		//    6   13:new             #28  <Class StringBuilder>
		//    7   16:dup             
		//    8   17:invokespecial   #29  <Method void StringBuilder()>
		//    9   20:ldc1            #159 <String "Dead object in stop. ">
		//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   11   25:aload_1         
		//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
		//   15   35:pop             
			}
		//   16   36:return          
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
	//    1    1:invokespecial   #113 <Method void Object()>
		if(token == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("sessionToken must not be null");
	//    4    8:new             #115 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #117 <String "sessionToken must not be null">
	//    7   14:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		mToken = token;
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:putfield        #122 <Field MediaSessionCompat$Token mToken>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  12   23:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   26:bipush          26
	//*  14   28:icmplt          45
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi26(context, token)));
	//   15   31:aload_0         
	//   16   32:new             #52  <Class MediaControllerCompat$MediaControllerImplApi26>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #130 <Method void MediaControllerCompat$MediaControllerImplApi26(Context, MediaSessionCompat$Token)>
	//   21   41:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   22   44:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  23   45:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   48:bipush          24
	//*  25   50:icmplt          67
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi24(context, token)));
	//   26   53:aload_0         
	//   27   54:new             #49  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   28   57:dup             
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:invokespecial   #133 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat$Token)>
	//   32   63:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   33   66:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  34   67:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   70:bipush          23
	//*  36   72:icmplt          89
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi23(context, token)));
	//   37   75:aload_0         
	//   38   76:new             #46  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:aload_2         
	//   42   82:invokespecial   #134 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat$Token)>
	//   43   85:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   44   88:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  45   89:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  46   92:bipush          21
	//*  47   94:icmplt          111
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi21(context, token)));
	//   48   97:aload_0         
	//   49   98:new             #29  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   50  101:dup             
	//   51  102:aload_1         
	//   52  103:aload_2         
	//   53  104:invokespecial   #135 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat$Token)>
	//   54  107:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   55  110:return          
		} else
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplBase(mToken)));
	//   56  111:aload_0         
	//   57  112:new             #55  <Class MediaControllerCompat$MediaControllerImplBase>
	//   58  115:dup             
	//   59  116:aload_0         
	//   60  117:getfield        #122 <Field MediaSessionCompat$Token mToken>
	//   61  120:invokespecial   #138 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   62  123:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   63  126:return          
		}
	}

	public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void Object()>
		if(mediasessioncompat == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("session must not be null");
	//    4    8:new             #115 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #143 <String "session must not be null">
	//    7   14:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		mToken = mediasessioncompat.getSessionToken();
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:invokevirtual   #149 <Method MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
	//   12   23:putfield        #122 <Field MediaSessionCompat$Token mToken>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  13   26:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   29:bipush          26
	//*  15   31:icmplt          48
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi26(context, mediasessioncompat)));
	//   16   34:aload_0         
	//   17   35:new             #52  <Class MediaControllerCompat$MediaControllerImplApi26>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokespecial   #151 <Method void MediaControllerCompat$MediaControllerImplApi26(Context, MediaSessionCompat)>
	//   22   44:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   23   47:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  24   48:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   51:bipush          24
	//*  26   53:icmplt          70
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi24(context, mediasessioncompat)));
	//   27   56:aload_0         
	//   28   57:new             #49  <Class MediaControllerCompat$MediaControllerImplApi24>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:aload_2         
	//   32   63:invokespecial   #152 <Method void MediaControllerCompat$MediaControllerImplApi24(Context, MediaSessionCompat)>
	//   33   66:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   34   69:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  35   70:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   73:bipush          23
	//*  37   75:icmplt          92
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi23(context, mediasessioncompat)));
	//   38   78:aload_0         
	//   39   79:new             #46  <Class MediaControllerCompat$MediaControllerImplApi23>
	//   40   82:dup             
	//   41   83:aload_1         
	//   42   84:aload_2         
	//   43   85:invokespecial   #153 <Method void MediaControllerCompat$MediaControllerImplApi23(Context, MediaSessionCompat)>
	//   44   88:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   45   91:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  46   92:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   95:bipush          21
	//*  48   97:icmplt          114
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplApi21(context, mediasessioncompat)));
	//   49  100:aload_0         
	//   50  101:new             #29  <Class MediaControllerCompat$MediaControllerImplApi21>
	//   51  104:dup             
	//   52  105:aload_1         
	//   53  106:aload_2         
	//   54  107:invokespecial   #154 <Method void MediaControllerCompat$MediaControllerImplApi21(Context, MediaSessionCompat)>
	//   55  110:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   56  113:return          
		} else
		{
			mImpl = ((MediaControllerImpl) (new MediaControllerImplBase(mToken)));
	//   57  114:aload_0         
	//   58  115:new             #55  <Class MediaControllerCompat$MediaControllerImplBase>
	//   59  118:dup             
	//   60  119:aload_0         
	//   61  120:getfield        #122 <Field MediaSessionCompat$Token mToken>
	//   62  123:invokespecial   #138 <Method void MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token)>
	//   63  126:putfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
			return;
	//   64  129:return          
		}
	}

	public static MediaControllerCompat getMediaController(Activity activity)
	{
		Object obj;
		if(activity instanceof SupportActivity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #158 <Class SupportActivity>
	//*   2    4:ifeq            31
		{
			activity = ((Activity) ((MediaControllerExtraData)((SupportActivity)activity).getExtraData(android/support/v4/media/session/MediaControllerCompat$MediaControllerExtraData)));
	//    3    7:aload_0         
	//    4    8:checkcast       #158 <Class SupportActivity>
	//    5   11:ldc1            #23  <Class MediaControllerCompat$MediaControllerExtraData>
	//    6   13:invokevirtual   #162 <Method android.support.v4.app.SupportActivity$ExtraData SupportActivity.getExtraData(Class)>
	//    7   16:checkcast       #23  <Class MediaControllerCompat$MediaControllerExtraData>
	//    8   19:astore_0        
			if(activity != null)
	//*   9   20:aload_0         
	//*  10   21:ifnull          29
				return ((MediaControllerExtraData) (activity)).getMediaController();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #165 <Method MediaControllerCompat MediaControllerCompat$MediaControllerExtraData.getMediaController()>
	//   13   28:areturn         
			else
				return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
		}
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_96;
	//   16   31:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
	//   17   34:bipush          21
	//   18   36:icmplt          96
		obj = MediaControllerCompatApi21.getMediaController(activity);
	//   19   39:aload_0         
	//   20   40:invokestatic    #170 <Method Object MediaControllerCompatApi21.getMediaController(Activity)>
	//   21   43:astore_1        
		if(obj == null)
	//*  22   44:aload_1         
	//*  23   45:ifnonnull       50
			return null;
	//   24   48:aconst_null     
	//   25   49:areturn         
		obj = MediaControllerCompatApi21.getSessionToken(obj);
	//   26   50:aload_1         
	//   27   51:invokestatic    #173 <Method Object MediaControllerCompatApi21.getSessionToken(Object)>
	//   28   54:astore_1        
		activity = ((Activity) (new MediaControllerCompat(((Context) (activity)), MediaSessionCompat.Token.fromToken(obj))));
	//   29   55:new             #2   <Class MediaControllerCompat>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:invokestatic    #179 <Method MediaSessionCompat$Token MediaSessionCompat$Token.fromToken(Object)>
	//   34   64:invokespecial   #180 <Method void MediaControllerCompat(Context, MediaSessionCompat$Token)>
	//   35   67:astore_0        
		return ((MediaControllerCompat) (activity));
	//   36   68:aload_0         
	//   37   69:areturn         
		activity;
	//   38   70:astore_0        
		Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getMediaController. ").append(((Object) (activity))).toString());
	//   39   71:ldc1            #102 <String "MediaControllerCompat">
	//   40   73:new             #182 <Class StringBuilder>
	//   41   76:dup             
	//   42   77:invokespecial   #183 <Method void StringBuilder()>
	//   43   80:ldc1            #185 <String "Dead object in getMediaController. ">
	//   44   82:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   45   85:aload_0         
	//   46   86:invokevirtual   #192 <Method StringBuilder StringBuilder.append(Object)>
	//   47   89:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   48   92:invokestatic    #202 <Method int Log.e(String, String)>
	//   49   95:pop             
		return null;
	//   50   96:aconst_null     
	//   51   97:areturn         
	}

	public static void setMediaController(Activity activity, MediaControllerCompat mediacontrollercompat)
	{
		if(activity instanceof SupportActivity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #158 <Class SupportActivity>
	//*   2    4:ifeq            22
			((SupportActivity)activity).putExtraData(((android.support.v4.app.SupportActivity.ExtraData) (new MediaControllerExtraData(mediacontrollercompat))));
	//    3    7:aload_0         
	//    4    8:checkcast       #158 <Class SupportActivity>
	//    5   11:new             #23  <Class MediaControllerCompat$MediaControllerExtraData>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #207 <Method void MediaControllerCompat$MediaControllerExtraData(MediaControllerCompat)>
	//    9   19:invokevirtual   #211 <Method void SupportActivity.putExtraData(android.support.v4.app.SupportActivity$ExtraData)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  10   22:getstatic       #128 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   19   38:invokevirtual   #212 <Method MediaSessionCompat$Token getSessionToken()>
	//   20   41:invokevirtual   #216 <Method Object MediaSessionCompat$Token.getToken()>
	//   21   44:invokestatic    #219 <Method Object MediaControllerCompatApi21.fromToken(Context, Object)>
	//   22   47:astore_2        
			MediaControllerCompatApi21.setMediaController(activity, obj);
	//   23   48:aload_0         
	//   24   49:aload_2         
	//   25   50:invokestatic    #222 <Method void MediaControllerCompatApi21.setMediaController(Activity, Object)>
		}
	//   26   53:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.addQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #226 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		mImpl.addQueueItem(mediadescriptioncompat, i);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #229 <Method void MediaControllerCompat$MediaControllerImpl.addQueueItem(MediaDescriptionCompat, int)>
	//    5   11:return          
	}

	public void adjustVolume(int i, int j)
	{
		mImpl.adjustVolume(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #233 <Method void MediaControllerCompat$MediaControllerImpl.adjustVolume(int, int)>
	//    5   11:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("KeyEvent may not be null");
	//    2    4:new             #115 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #237 <String "KeyEvent may not be null">
	//    5   10:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return mImpl.dispatchMediaButtonEvent(keyevent);
	//    7   14:aload_0         
	//    8   15:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    9   18:aload_1         
	//   10   19:invokeinterface #239 <Method boolean MediaControllerCompat$MediaControllerImpl.dispatchMediaButtonEvent(KeyEvent)>
	//   11   24:ireturn         
	}

	public Bundle getExtras()
	{
		return mImpl.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #243 <Method Bundle MediaControllerCompat$MediaControllerImpl.getExtras()>
	//    3    9:areturn         
	}

	public long getFlags()
	{
		return mImpl.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #247 <Method long MediaControllerCompat$MediaControllerImpl.getFlags()>
	//    3    9:lreturn         
	}

	public Object getMediaController()
	{
		return mImpl.getMediaController();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #249 <Method Object MediaControllerCompat$MediaControllerImpl.getMediaController()>
	//    3    9:areturn         
	}

	public MediaMetadataCompat getMetadata()
	{
		return mImpl.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #253 <Method MediaMetadataCompat MediaControllerCompat$MediaControllerImpl.getMetadata()>
	//    3    9:areturn         
	}

	public String getPackageName()
	{
		return mImpl.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #256 <Method String MediaControllerCompat$MediaControllerImpl.getPackageName()>
	//    3    9:areturn         
	}

	public PlaybackInfo getPlaybackInfo()
	{
		return mImpl.getPlaybackInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #260 <Method MediaControllerCompat$PlaybackInfo MediaControllerCompat$MediaControllerImpl.getPlaybackInfo()>
	//    3    9:areturn         
	}

	public PlaybackStateCompat getPlaybackState()
	{
		return mImpl.getPlaybackState();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #264 <Method PlaybackStateCompat MediaControllerCompat$MediaControllerImpl.getPlaybackState()>
	//    3    9:areturn         
	}

	public List getQueue()
	{
		return mImpl.getQueue();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #268 <Method List MediaControllerCompat$MediaControllerImpl.getQueue()>
	//    3    9:areturn         
	}

	public CharSequence getQueueTitle()
	{
		return mImpl.getQueueTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #274 <Method CharSequence MediaControllerCompat$MediaControllerImpl.getQueueTitle()>
	//    3    9:areturn         
	}

	public int getRatingType()
	{
		return mImpl.getRatingType();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #278 <Method int MediaControllerCompat$MediaControllerImpl.getRatingType()>
	//    3    9:ireturn         
	}

	public int getRepeatMode()
	{
		return mImpl.getRepeatMode();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #281 <Method int MediaControllerCompat$MediaControllerImpl.getRepeatMode()>
	//    3    9:ireturn         
	}

	public PendingIntent getSessionActivity()
	{
		return mImpl.getSessionActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #285 <Method PendingIntent MediaControllerCompat$MediaControllerImpl.getSessionActivity()>
	//    3    9:areturn         
	}

	public MediaSessionCompat.Token getSessionToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public TransportControls getTransportControls()
	{
		return mImpl.getTransportControls();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #289 <Method MediaControllerCompat$TransportControls MediaControllerCompat$MediaControllerImpl.getTransportControls()>
	//    3    9:areturn         
	}

	boolean isExtraBinderReady()
	{
		if(mImpl instanceof MediaControllerImplApi21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//*   2    4:instanceof      #29  <Class MediaControllerCompat$MediaControllerImplApi21>
	//*   3    7:ifeq            27
			return ((MediaControllerImplApi21)mImpl).mExtraBinder != null;
	//    4   10:aload_0         
	//    5   11:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    6   14:checkcast       #29  <Class MediaControllerCompat$MediaControllerImplApi21>
	//    7   17:invokestatic    #296 <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$000(MediaControllerCompat$MediaControllerImplApi21)>
	//    8   20:ifnull          25
	//    9   23:iconst_1        
	//   10   24:ireturn         
	//   11   25:iconst_0        
	//   12   26:ireturn         
		else
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean isShuffleModeEnabled()
	{
		return mImpl.isShuffleModeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:invokeinterface #300 <Method boolean MediaControllerCompat$MediaControllerImpl.isShuffleModeEnabled()>
	//    3    9:ireturn         
	}

	public void registerCallback(Callback callback)
	{
		registerCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #305 <Method void registerCallback(MediaControllerCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void registerCallback(Callback callback, Handler handler)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("callback cannot be null");
	//    2    4:new             #115 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #307 <String "callback cannot be null">
	//    5   11:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		Handler handler1 = handler;
	//    7   15:aload_2         
	//    8   16:astore_3        
		if(handler == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       29
			handler1 = new Handler();
	//   11   21:new             #309 <Class Handler>
	//   12   24:dup             
	//   13   25:invokespecial   #310 <Method void Handler()>
	//   14   28:astore_3        
		mImpl.registerCallback(callback, handler1);
	//   15   29:aload_0         
	//   16   30:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   17   33:aload_1         
	//   18   34:aload_3         
	//   19   35:invokeinterface #311 <Method void MediaControllerCompat$MediaControllerImpl.registerCallback(MediaControllerCompat$Callback, Handler)>
	//   20   40:return          
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		mImpl.removeQueueItem(mediadescriptioncompat);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #314 <Method void MediaControllerCompat$MediaControllerImpl.removeQueueItem(MediaDescriptionCompat)>
	//    4   10:return          
	}

	public void removeQueueItemAt(int i)
	{
		mImpl.removeQueueItemAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #318 <Method void MediaControllerCompat$MediaControllerImpl.removeQueueItemAt(int)>
	//    4   10:return          
	}

	public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #326 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
		{
			throw new IllegalArgumentException("command cannot be null or empty");
	//    3    7:new             #115 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #328 <String "command cannot be null or empty">
	//    6   14:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		} else
		{
			mImpl.sendCommand(s, bundle, resultreceiver);
	//    8   18:aload_0         
	//    9   19:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokeinterface #330 <Method void MediaControllerCompat$MediaControllerImpl.sendCommand(String, Bundle, ResultReceiver)>
			return;
	//   14   30:return          
		}
	}

	public void setVolumeTo(int i, int j)
	{
		mImpl.setVolumeTo(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #333 <Method void MediaControllerCompat$MediaControllerImpl.setVolumeTo(int, int)>
	//    5   11:return          
	}

	public void unregisterCallback(Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("callback cannot be null");
	//    2    4:new             #115 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #307 <String "callback cannot be null">
	//    5   11:invokespecial   #120 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.unregisterCallback(callback);
	//    7   15:aload_0         
	//    8   16:getfield        #132 <Field MediaControllerCompat$MediaControllerImpl mImpl>
	//    9   19:aload_1         
	//   10   20:invokeinterface #336 <Method void MediaControllerCompat$MediaControllerImpl.unregisterCallback(MediaControllerCompat$Callback)>
			return;
	//   11   25:return          
		}
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
	private final MediaSessionCompat.Token mToken;
}

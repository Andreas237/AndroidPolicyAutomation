// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi21, PlaybackStateCompat, ParcelableVolumeInfo, IMediaSession

public final class MediaControllerCompat
{
	public static abstract class Callback
		implements android.os.IBinder.DeathRecipient
	{

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
		//    1    1:getfield        #76  <Field MediaControllerCompat$Callback$MessageHandler mHandler>
		//    2    4:astore          4
			if(messagehandler != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          28
			{
				obj = ((Object) (messagehandler.obtainMessage(i, obj)));
		//    5   11:aload           4
		//    6   13:iload_1         
		//    7   14:aload_2         
		//    8   15:invokevirtual   #80  <Method Message MediaControllerCompat$Callback$MessageHandler.obtainMessage(int, Object)>
		//    9   18:astore_2        
				((Message) (obj)).setData(bundle);
		//   10   19:aload_2         
		//   11   20:aload_3         
		//   12   21:invokevirtual   #85  <Method void Message.setData(Bundle)>
				((Message) (obj)).sendToTarget();
		//   13   24:aload_2         
		//   14   25:invokevirtual   #88  <Method void Message.sendToTarget()>
			}
		//   15   28:return          
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
		//*   1    1:getfield        #18  <Field boolean mRegistered>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #24  <Field int Message.what>
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
		//    9   82:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   10   85:invokevirtual   #30  <Method void MediaControllerCompat$Callback.onSessionReady()>
				return;
		//   11   88:return          

			case 12: // '\f'
				onShuffleModeChanged(((Integer)message.obj).intValue());
		//   12   89:aload_0         
		//   13   90:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   14   93:aload_1         
		//   15   94:getfield        #34  <Field Object Message.obj>
		//   16   97:checkcast       #36  <Class Integer>
		//   17  100:invokevirtual   #40  <Method int Integer.intValue()>
		//   18  103:invokevirtual   #44  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(int)>
				return;
		//   19  106:return          

			case 11: // '\013'
				onCaptioningEnabledChanged(((Boolean)message.obj).booleanValue());
		//   20  107:aload_0         
		//   21  108:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   22  111:aload_1         
		//   23  112:getfield        #34  <Field Object Message.obj>
		//   24  115:checkcast       #46  <Class Boolean>
		//   25  118:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
		//   26  121:invokevirtual   #54  <Method void MediaControllerCompat$Callback.onCaptioningEnabledChanged(boolean)>
				return;
		//   27  124:return          

			case 9: // '\t'
				onRepeatModeChanged(((Integer)message.obj).intValue());
		//   28  125:aload_0         
		//   29  126:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   30  129:aload_1         
		//   31  130:getfield        #34  <Field Object Message.obj>
		//   32  133:checkcast       #36  <Class Integer>
		//   33  136:invokevirtual   #40  <Method int Integer.intValue()>
		//   34  139:invokevirtual   #57  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
				return;
		//   35  142:return          

			case 8: // '\b'
				onSessionDestroyed();
		//   36  143:aload_0         
		//   37  144:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   38  147:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
				return;
		//   39  150:return          

			case 7: // '\007'
				onExtrasChanged((Bundle)message.obj);
		//   40  151:aload_0         
		//   41  152:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   42  155:aload_1         
		//   43  156:getfield        #34  <Field Object Message.obj>
		//   44  159:checkcast       #62  <Class Bundle>
		//   45  162:invokevirtual   #66  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
				return;
		//   46  165:return          

			case 6: // '\006'
				onQueueTitleChanged((CharSequence)message.obj);
		//   47  166:aload_0         
		//   48  167:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   49  170:aload_1         
		//   50  171:getfield        #34  <Field Object Message.obj>
		//   51  174:checkcast       #68  <Class CharSequence>
		//   52  177:invokevirtual   #72  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
				return;
		//   53  180:return          

			case 5: // '\005'
				onQueueChanged((List)message.obj);
		//   54  181:aload_0         
		//   55  182:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   56  185:aload_1         
		//   57  186:getfield        #34  <Field Object Message.obj>
		//   58  189:checkcast       #74  <Class List>
		//   59  192:invokevirtual   #78  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
				return;
		//   60  195:return          

			case 4: // '\004'
				onAudioInfoChanged((PlaybackInfo)message.obj);
		//   61  196:aload_0         
		//   62  197:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   63  200:aload_1         
		//   64  201:getfield        #34  <Field Object Message.obj>
		//   65  204:checkcast       #80  <Class MediaControllerCompat$PlaybackInfo>
		//   66  207:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
				return;
		//   67  210:return          

			case 3: // '\003'
				onMetadataChanged((MediaMetadataCompat)message.obj);
		//   68  211:aload_0         
		//   69  212:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   70  215:aload_1         
		//   71  216:getfield        #34  <Field Object Message.obj>
		//   72  219:checkcast       #86  <Class MediaMetadataCompat>
		//   73  222:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
				return;
		//   74  225:return          

			case 2: // '\002'
				onPlaybackStateChanged((PlaybackStateCompat)message.obj);
		//   75  226:aload_0         
		//   76  227:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   77  230:aload_1         
		//   78  231:getfield        #34  <Field Object Message.obj>
		//   79  234:checkcast       #92  <Class PlaybackStateCompat>
		//   80  237:invokevirtual   #96  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
				return;
		//   81  240:return          

			case 1: // '\001'
				onSessionEvent((String)message.obj, message.getData());
		//   82  241:aload_0         
		//   83  242:getfield        #26  <Field MediaControllerCompat$Callback this$0>
		//   84  245:aload_1         
		//   85  246:getfield        #34  <Field Object Message.obj>
		//   86  249:checkcast       #98  <Class String>
		//   87  252:aload_1         
		//   88  253:invokevirtual   #102 <Method Bundle Message.getData()>
		//   89  256:invokevirtual   #106 <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   90  259:return          
			}
		}

		boolean mRegistered;
		final Callback this$0;
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
		//*   1    1:getfield        #32  <Field IMediaSession mExtraBinder>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			List list = mPendingCallbacks;
		//    4    8:aload_0         
		//    5    9:getfield        #43  <Field List mPendingCallbacks>
		//    6   12:astore_1        
			list;
		//    7   13:aload_1         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			Iterator iterator = mPendingCallbacks.iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #43  <Field List mPendingCallbacks>
		//   11   19:invokeinterface #49  <Method Iterator List.iterator()>
		//   12   24:astore_2        
_L2:
			Callback callback;
			ExtraCallback extracallback;
			if(!iterator.hasNext())
				break; /* Loop/switch isn't completed */
		//   13   25:aload_2         
		//   14   26:invokeinterface #55  <Method boolean Iterator.hasNext()>
		//   15   31:ifeq            98
			callback = (Callback)iterator.next();
		//   16   34:aload_2         
		//   17   35:invokeinterface #59  <Method Object Iterator.next()>
		//   18   40:checkcast       #61  <Class MediaControllerCompat$Callback>
		//   19   43:astore_3        
			extracallback = new ExtraCallback(callback);
		//   20   44:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   21   47:dup             
		//   22   48:aload_3         
		//   23   49:invokespecial   #65  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   24   52:astore          4
			mCallbackMap.put(((Object) (callback)), ((Object) (extracallback)));
		//   25   54:aload_0         
		//   26   55:getfield        #67  <Field HashMap mCallbackMap>
		//   27   58:aload_3         
		//   28   59:aload           4
		//   29   61:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
		//   30   64:pop             
			callback.mHasExtraCallback = true;
		//   31   65:aload_3         
		//   32   66:iconst_1        
		//   33   67:putfield        #77  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
			mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (extracallback)));
		//   34   70:aload_0         
		//   35   71:getfield        #32  <Field IMediaSession mExtraBinder>
		//   36   74:aload           4
		//   37   76:invokeinterface #83  <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			callback.onSessionReady();
		//   38   81:aload_3         
		//   39   82:invokevirtual   #86  <Method void MediaControllerCompat$Callback.onSessionReady()>
			if(true) goto _L2; else goto _L1
		//   40   85:goto            25
			Object obj;
			obj;
		//   41   88:astore_2        
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (obj)));
		//   42   89:ldc1            #88  <String "MediaControllerCompat">
		//   43   91:ldc1            #90  <String "Dead object in registerCallback.">
		//   44   93:aload_2         
		//   45   94:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   46   97:pop             
_L1:
			mPendingCallbacks.clear();
		//   47   98:aload_0         
		//   48   99:getfield        #43  <Field List mPendingCallbacks>
		//   49  102:invokeinterface #99  <Method void List.clear()>
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

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #105 <Method long getFlags()>
		//*   2    4:ldc2w           #106 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            37
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #109 <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #111 <Method void Bundle()>
		//   10   20:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_2         
		//   12   22:ldc1            #113 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #117 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   15   28:aload_0         
		//   16   29:ldc1            #119 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//   17   31:aload_2         
		//   18   32:aconst_null     
		//   19   33:invokevirtual   #123 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   20   36:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   21   37:new             #125 <Class UnsupportedOperationException>
		//   22   40:dup             
		//   23   41:ldc1            #127 <String "This session doesn't support queue management operations">
		//   24   43:invokespecial   #130 <Method void UnsupportedOperationException(String)>
		//   25   46:athrow          
			}
		}

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #105 <Method long getFlags()>
		//*   2    4:ldc2w           #106 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            44
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #109 <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #111 <Method void Bundle()>
		//   10   20:astore_3        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_3         
		//   12   22:ldc1            #113 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #117 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
		//   15   28:aload_3         
		//   16   29:ldc1            #133 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   17   31:iload_2         
		//   18   32:invokevirtual   #137 <Method void Bundle.putInt(String, int)>
				sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
		//   19   35:aload_0         
		//   20   36:ldc1            #139 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//   21   38:aload_3         
		//   22   39:aconst_null     
		//   23   40:invokevirtual   #123 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   24   43:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   25   44:new             #125 <Class UnsupportedOperationException>
		//   26   47:dup             
		//   27   48:ldc1            #127 <String "This session doesn't support queue management operations">
		//   28   50:invokespecial   #130 <Method void UnsupportedOperationException(String)>
		//   29   53:athrow          
			}
		}

		public void adjustVolume(int i, int j)
		{
			MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #148 <Method void MediaControllerCompatApi21.adjustVolume(Object, int, int)>
		//    5    9:return          
		}

		public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
		{
			return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #153 <Method boolean MediaControllerCompatApi21.dispatchMediaButtonEvent(Object, KeyEvent)>
		//    4    8:ireturn         
		}

		public Bundle getExtras()
		{
			return MediaControllerCompatApi21.getExtras(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #158 <Method Bundle MediaControllerCompatApi21.getExtras(Object)>
		//    3    7:areturn         
		}

		public long getFlags()
		{
			return MediaControllerCompatApi21.getFlags(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #161 <Method long MediaControllerCompatApi21.getFlags(Object)>
		//    3    7:lreturn         
		}

		public Object getMediaController()
		{
			return mControllerObj;
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:areturn         
		}

		public MediaMetadataCompat getMetadata()
		{
			Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #167 <Method Object MediaControllerCompatApi21.getMetadata(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaMetadataCompat.fromMediaMetadata(obj);
		//    6   12:aload_1         
		//    7   13:invokestatic    #173 <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
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
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #178 <Method String MediaControllerCompatApi21.getPackageName(Object)>
		//    3    7:areturn         
		}

		public PlaybackInfo getPlaybackInfo()
		{
			Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #182 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          40
				return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
		//    6   12:new             #184 <Class MediaControllerCompat$PlaybackInfo>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokestatic    #190 <Method int MediaControllerCompatApi21$PlaybackInfo.getPlaybackType(Object)>
		//   10   20:aload_1         
		//   11   21:invokestatic    #193 <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
		//   12   24:aload_1         
		//   13   25:invokestatic    #196 <Method int MediaControllerCompatApi21$PlaybackInfo.getVolumeControl(Object)>
		//   14   28:aload_1         
		//   15   29:invokestatic    #199 <Method int MediaControllerCompatApi21$PlaybackInfo.getMaxVolume(Object)>
		//   16   32:aload_1         
		//   17   33:invokestatic    #202 <Method int MediaControllerCompatApi21$PlaybackInfo.getCurrentVolume(Object)>
		//   18   36:invokespecial   #205 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
		//   19   39:areturn         
			else
				return null;
		//   20   40:aconst_null     
		//   21   41:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			Object obj;
			obj = ((Object) (mExtraBinder));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field IMediaSession mExtraBinder>
		//    2    4:astore_1        
			if(obj == null)
				break MISSING_BLOCK_LABEL_28;
		//    3    5:aload_1         
		//    4    6:ifnull          28
			obj = ((Object) (((IMediaSession) (obj)).getPlaybackState()));
		//    5    9:aload_1         
		//    6   10:invokeinterface #209 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
		//    7   15:astore_1        
			return ((PlaybackStateCompat) (obj));
		//    8   16:aload_1         
		//    9   17:areturn         
			RemoteException remoteexception;
			remoteexception;
		//   10   18:astore_1        
			Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
		//   11   19:ldc1            #88  <String "MediaControllerCompat">
		//   12   21:ldc1            #211 <String "Dead object in getPlaybackState.">
		//   13   23:aload_1         
		//   14   24:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   15   27:pop             
			Object obj1 = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
		//   16   28:aload_0         
		//   17   29:getfield        #143 <Field Object mControllerObj>
		//   18   32:invokestatic    #213 <Method Object MediaControllerCompatApi21.getPlaybackState(Object)>
		//   19   35:astore_1        
			if(obj1 != null)
		//*  20   36:aload_1         
		//*  21   37:ifnull          45
				return PlaybackStateCompat.fromPlaybackState(obj1);
		//   22   40:aload_1         
		//   23   41:invokestatic    #219 <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
		//   24   44:areturn         
			else
				return null;
		//   25   45:aconst_null     
		//   26   46:areturn         
		}

		public List getQueue()
		{
			List list = MediaControllerCompatApi21.getQueue(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #224 <Method List MediaControllerCompatApi21.getQueue(Object)>
		//    3    7:astore_1        
			if(list != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          17
				return MediaSessionCompat.QueueItem.fromQueueItemList(list);
		//    6   12:aload_1         
		//    7   13:invokestatic    #230 <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
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
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #237 <Method CharSequence MediaControllerCompatApi21.getQueueTitle(Object)>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			IMediaSession imediasession;
			if(android.os.Build.VERSION.SDK_INT >= 22)
				break MISSING_BLOCK_LABEL_36;
		//    0    0:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
		//    1    3:bipush          22
		//    2    5:icmpge          36
			imediasession = mExtraBinder;
		//    3    8:aload_0         
		//    4    9:getfield        #32  <Field IMediaSession mExtraBinder>
		//    5   12:astore_2        
			if(imediasession == null)
				break MISSING_BLOCK_LABEL_36;
		//    6   13:aload_2         
		//    7   14:ifnull          36
			int i = imediasession.getRatingType();
		//    8   17:aload_2         
		//    9   18:invokeinterface #247 <Method int IMediaSession.getRatingType()>
		//   10   23:istore_1        
			return i;
		//   11   24:iload_1         
		//   12   25:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   13   26:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
		//   14   27:ldc1            #88  <String "MediaControllerCompat">
		//   15   29:ldc1            #249 <String "Dead object in getRatingType.">
		//   16   31:aload_2         
		//   17   32:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   18   35:pop             
			return MediaControllerCompatApi21.getRatingType(mControllerObj);
		//   19   36:aload_0         
		//   20   37:getfield        #143 <Field Object mControllerObj>
		//   21   40:invokestatic    #251 <Method int MediaControllerCompatApi21.getRatingType(Object)>
		//   22   43:ireturn         
		}

		public int getRepeatMode()
		{
			IMediaSession imediasession;
			imediasession = mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field IMediaSession mExtraBinder>
		//    2    4:astore_2        
			if(imediasession == null)
				break MISSING_BLOCK_LABEL_29;
		//    3    5:aload_2         
		//    4    6:ifnull          29
			int i = imediasession.getRepeatMode();
		//    5    9:aload_2         
		//    6   10:invokeinterface #254 <Method int IMediaSession.getRepeatMode()>
		//    7   15:istore_1        
			return i;
		//    8   16:iload_1         
		//    9   17:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   10   18:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
		//   11   19:ldc1            #88  <String "MediaControllerCompat">
		//   12   21:ldc2            #256 <String "Dead object in getRepeatMode.">
		//   13   24:aload_2         
		//   14   25:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   15   28:pop             
			return -1;
		//   16   29:iconst_m1       
		//   17   30:ireturn         
		}

		public PendingIntent getSessionActivity()
		{
			return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #261 <Method PendingIntent MediaControllerCompatApi21.getSessionActivity(Object)>
		//    3    7:areturn         
		}

		public int getShuffleMode()
		{
			IMediaSession imediasession;
			imediasession = mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field IMediaSession mExtraBinder>
		//    2    4:astore_2        
			if(imediasession == null)
				break MISSING_BLOCK_LABEL_29;
		//    3    5:aload_2         
		//    4    6:ifnull          29
			int i = imediasession.getShuffleMode();
		//    5    9:aload_2         
		//    6   10:invokeinterface #264 <Method int IMediaSession.getShuffleMode()>
		//    7   15:istore_1        
			return i;
		//    8   16:iload_1         
		//    9   17:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   10   18:astore_2        
			Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
		//   11   19:ldc1            #88  <String "MediaControllerCompat">
		//   12   21:ldc2            #266 <String "Dead object in getShuffleMode.">
		//   13   24:aload_2         
		//   14   25:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   15   28:pop             
			return -1;
		//   16   29:iconst_m1       
		//   17   30:ireturn         
		}

		public TransportControls getTransportControls()
		{
			Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:invokestatic    #270 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          21
				return ((TransportControls) (new TransportControlsApi21(obj)));
		//    6   12:new             #272 <Class MediaControllerCompat$TransportControlsApi21>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #275 <Method void MediaControllerCompat$TransportControlsApi21(Object)>
		//   10   20:areturn         
			else
				return null;
		//   11   21:aconst_null     
		//   12   22:areturn         
		}

		public boolean isCaptioningEnabled()
		{
			IMediaSession imediasession;
			imediasession = mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field IMediaSession mExtraBinder>
		//    2    4:astore_2        
			if(imediasession == null)
				break MISSING_BLOCK_LABEL_29;
		//    3    5:aload_2         
		//    4    6:ifnull          29
			boolean flag = imediasession.isCaptioningEnabled();
		//    5    9:aload_2         
		//    6   10:invokeinterface #278 <Method boolean IMediaSession.isCaptioningEnabled()>
		//    7   15:istore_1        
			return flag;
		//    8   16:iload_1         
		//    9   17:ireturn         
			RemoteException remoteexception;
			remoteexception;
		//   10   18:astore_2        
			Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
		//   11   19:ldc1            #88  <String "MediaControllerCompat">
		//   12   21:ldc2            #280 <String "Dead object in isCaptioningEnabled.">
		//   13   24:aload_2         
		//   14   25:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   15   28:pop             
			return false;
		//   16   29:iconst_0        
		//   17   30:ireturn         
		}

		public boolean isSessionReady()
		{
			return mExtraBinder != null;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field IMediaSession mExtraBinder>
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
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #287 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//    4    8:aload_2         
		//    5    9:invokestatic    #290 <Method void MediaControllerCompatApi21.registerCallback(Object, Object, Handler)>
			if(mExtraBinder != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #32  <Field IMediaSession mExtraBinder>
		//*   8   16:ifnull          65
			{
				handler = ((Handler) (new ExtraCallback(callback)));
		//    9   19:new             #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   10   22:dup             
		//   11   23:aload_1         
		//   12   24:invokespecial   #65  <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraCallback(MediaControllerCompat$Callback)>
		//   13   27:astore_2        
				mCallbackMap.put(((Object) (callback)), ((Object) (handler)));
		//   14   28:aload_0         
		//   15   29:getfield        #67  <Field HashMap mCallbackMap>
		//   16   32:aload_1         
		//   17   33:aload_2         
		//   18   34:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
		//   19   37:pop             
				callback.mHasExtraCallback = true;
		//   20   38:aload_1         
		//   21   39:iconst_1        
		//   22   40:putfield        #77  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
				try
				{
					mExtraBinder.registerCallbackListener(((IMediaControllerCallback) (handler)));
		//   23   43:aload_0         
		//   24   44:getfield        #32  <Field IMediaSession mExtraBinder>
		//   25   47:aload_2         
		//   26   48:invokeinterface #83  <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
					return;
		//   27   53:return          
				}
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  28   54:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (callback)));
		//   29   55:ldc1            #88  <String "MediaControllerCompat">
		//   30   57:ldc1            #90  <String "Dead object in registerCallback.">
		//   31   59:aload_1         
		//   32   60:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   33   63:pop             
				}
				return;
		//   34   64:return          
			}
			synchronized(mPendingCallbacks)
		//*  35   65:aload_0         
		//*  36   66:getfield        #43  <Field List mPendingCallbacks>
		//*  37   69:astore_2        
		//*  38   70:aload_2         
		//*  39   71:monitorenter    
			{
				mPendingCallbacks.add(((Object) (callback)));
		//   40   72:aload_0         
		//   41   73:getfield        #43  <Field List mPendingCallbacks>
		//   42   76:aload_1         
		//   43   77:invokeinterface #294 <Method boolean List.add(Object)>
		//   44   82:pop             
			}
		//   45   83:aload_2         
		//   46   84:monitorexit     
			return;
		//   47   85:return          
			callback;
		//   48   86:astore_1        
			handler;
		//   49   87:aload_2         
			JVM INSTR monitorexit ;
		//   50   88:monitorexit     
			throw callback;
		//   51   89:aload_1         
		//   52   90:athrow          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			if((getFlags() & 4L) != 0L)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #105 <Method long getFlags()>
		//*   2    4:ldc2w           #106 <Long 4L>
		//*   3    7:land            
		//*   4    8:lconst_0        
		//*   5    9:lcmp            
		//*   6   10:ifeq            38
			{
				Bundle bundle = new Bundle();
		//    7   13:new             #109 <Class Bundle>
		//    8   16:dup             
		//    9   17:invokespecial   #111 <Method void Bundle()>
		//   10   20:astore_2        
				bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
		//   11   21:aload_2         
		//   12   22:ldc1            #113 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   13   24:aload_1         
		//   14   25:invokevirtual   #117 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
		//   15   28:aload_0         
		//   16   29:ldc2            #297 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//   17   32:aload_2         
		//   18   33:aconst_null     
		//   19   34:invokevirtual   #123 <Method void sendCommand(String, Bundle, ResultReceiver)>
				return;
		//   20   37:return          
			} else
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
		//   21   38:new             #125 <Class UnsupportedOperationException>
		//   22   41:dup             
		//   23   42:ldc1            #127 <String "This session doesn't support queue management operations">
		//   24   44:invokespecial   #130 <Method void UnsupportedOperationException(String)>
		//   25   47:athrow          
			}
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokestatic    #300 <Method void MediaControllerCompatApi21.sendCommand(Object, String, Bundle, ResultReceiver)>
		//    6   10:return          
		}

		public void setVolumeTo(int i, int j)
		{
			MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #303 <Method void MediaControllerCompatApi21.setVolumeTo(Object, int, int)>
		//    5    9:return          
		}

		public final void unregisterCallback(Callback callback)
		{
			MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
		//    0    0:aload_0         
		//    1    1:getfield        #143 <Field Object mControllerObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #287 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
		//    4    8:invokestatic    #307 <Method void MediaControllerCompatApi21.unregisterCallback(Object, Object)>
			if(mExtraBinder == null)
				break MISSING_BLOCK_LABEL_57;
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field IMediaSession mExtraBinder>
		//    7   15:ifnull          57
			callback = ((Callback) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
		//    8   18:aload_0         
		//    9   19:getfield        #67  <Field HashMap mCallbackMap>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #310 <Method Object HashMap.remove(Object)>
		//   12   26:checkcast       #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
		//   13   29:astore_1        
			if(callback != null)
		//*  14   30:aload_1         
		//*  15   31:ifnull          83
			{
				try
				{
					mExtraBinder.unregisterCallbackListener(((IMediaControllerCallback) (callback)));
		//   16   34:aload_0         
		//   17   35:getfield        #32  <Field IMediaSession mExtraBinder>
		//   18   38:aload_1         
		//   19   39:invokeinterface #313 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
					return;
		//   20   44:return          
				}
				// Misplaced declaration of an exception variable
				catch(Callback callback)
		//*  21   45:astore_1        
				{
					Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
		//   22   46:ldc1            #88  <String "MediaControllerCompat">
		//   23   48:ldc2            #315 <String "Dead object in unregisterCallback.">
		//   24   51:aload_1         
		//   25   52:invokestatic    #96  <Method int Log.e(String, String, Throwable)>
		//   26   55:pop             
				}
				return;
		//   27   56:return          
			} else
		//*  28   57:aload_0         
		//*  29   58:getfield        #43  <Field List mPendingCallbacks>
		//*  30   61:astore_2        
		//*  31   62:aload_2         
		//*  32   63:monitorenter    
		//*  33   64:aload_0         
		//*  34   65:getfield        #43  <Field List mPendingCallbacks>
		//*  35   68:aload_1         
		//*  36   69:invokeinterface #317 <Method boolean List.remove(Object)>
		//*  37   74:pop             
		//*  38   75:aload_2         
		//*  39   76:monitorexit     
		//*  40   77:return          
		//*  41   78:astore_1        
		//*  42   79:aload_2         
		//*  43   80:monitorexit     
		//*  44   81:aload_1         
		//*  45   82:athrow          
			{
				return;
		//   46   83:return          
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
		//    2    2:putfield        #32  <Field IMediaSession mExtraBinder>
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
		//    1    1:invokespecial   #39  <Method void processPendingCallbacks()>
			return;
		//    2    4:return          
		}

*/
	}

	private static class MediaControllerImplApi21.ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerImplApi21)mMediaControllerImpl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field WeakReference mMediaControllerImpl>
		//    2    4:invokevirtual   #23  <Method Object WeakReference.get()>
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
		//   12   22:ldc1            #25  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   13   24:invokestatic    #31  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
		//   14   27:invokestatic    #37  <Method IMediaSession IMediaSession$Stub.asInterface(android.os.IBinder)>
		//   15   30:invokestatic    #41  <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$202(MediaControllerCompat$MediaControllerImplApi21, IMediaSession)>
		//   16   33:pop             
					mediacontrollerimplapi21.processPendingCallbacks();
		//   17   34:aload_3         
		//   18   35:invokestatic    #45  <Method void MediaControllerCompat$MediaControllerImplApi21.access$300(MediaControllerCompat$MediaControllerImplApi21)>
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

	public static final class PlaybackInfo
	{

		private final int mAudioStream;
		private final int mCurrentVolume;
		private final int mMaxVolume;
		private final int mPlaybackType;
		private final int mVolumeControl;

		PlaybackInfo(int i, int j, int k, int l, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mPlaybackType = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int mPlaybackType>
			mAudioStream = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int mAudioStream>
			mVolumeControl = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int mVolumeControl>
			mMaxVolume = l;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int mMaxVolume>
			mCurrentVolume = i1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #28  <Field int mCurrentVolume>
		//   17   31:return          
		}
	}

	public static abstract class TransportControls
	{

		TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class TransportControlsApi21 extends TransportControls
	{

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

}

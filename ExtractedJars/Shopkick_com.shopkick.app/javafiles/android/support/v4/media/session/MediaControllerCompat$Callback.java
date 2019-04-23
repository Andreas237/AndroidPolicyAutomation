// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi21, IMediaControllerCallback, PlaybackStateCompat, 
//			MediaSessionCompat, ParcelableVolumeInfo

public static abstract class MediaControllerCompat$Callback
	implements android.os.IBinder.DeathRecipient
{
	private class MessageHandler extends Handler
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
				onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
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
		final MediaControllerCompat.Callback this$0;

		MessageHandler(Looper looper)
		{
			this$0 = MediaControllerCompat.Callback.this;
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

	private static class StubApi21
		implements MediaControllerCompatApi21.Callback
	{

		public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
		{
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mCallback>
		//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
		//    4   10:astore          6
			if(callback != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          36
				callback.onAudioInfoChanged(new MediaControllerCompat.PlaybackInfo(i, j, k, l, i1));
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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

		StubApi21(MediaControllerCompat.Callback callback)
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

	private static class StubCompat extends IMediaControllerCallback.Stub
	{

		public void onCaptioningEnabledChanged(boolean flag)
			throws RemoteException
		{
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
			MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
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
					parcelablevolumeinfo = ((ParcelableVolumeInfo) (new MediaControllerCompat.PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume)));
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

		StubCompat(MediaControllerCompat.Callback callback)
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

	public void onAudioInfoChanged(nfo nfo)
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

	public MediaControllerCompat$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          28
		{
			mCallbackObj = MediaControllerCompatApi21.createCallback(((back) (new StubApi21(this))));
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

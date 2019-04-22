// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi21, PlaybackStateCompat, ParcelableVolumeInfo

public static abstract class MediaControllerCompat$Callback
	implements android.os.IBinder.DeathRecipient
{
	private class MessageHandler extends Handler
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
				onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
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
		final MediaControllerCompat.Callback this$0;
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
	static Object access$000(MediaControllerCompat$Callback mediacontrollercompat$callback)
	{
		return mediacontrollercompat$callback.mCallbackObj;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mCallbackObj>
	//    2    4:areturn         
	}

*/

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

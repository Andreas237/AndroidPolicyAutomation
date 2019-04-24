// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi26, MediaControllerCompatApi21, PlaybackStateCompat, 
//			ParcelableVolumeInfo

public static abstract class MediaControllerCompat$Callback
	implements android.os.IBinder.DeathRecipient
{
	class MessageHandler extends Handler
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
				onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
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
		final MediaControllerCompat.Callback this$0;

		public MessageHandler(Looper looper)
		{
			this$0 = MediaControllerCompat.Callback.this;
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

	class StubApi21
		implements MediaControllerCompatApi21.Callback
	{

		public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
		{
			MediaControllerCompat.Callback.this.onAudioInfoChanged(new MediaControllerCompat.PlaybackInfo(i, j, k, l, i1));
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
			MediaControllerCompat.Callback.this.onExtrasChanged(bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
		//    4    8:return          
		}

		public void onMetadataChanged(Object obj)
		{
			MediaControllerCompat.Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
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
				MediaControllerCompat.Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
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
			MediaControllerCompat.Callback.this.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #68  <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
		//    4    8:invokevirtual   #70  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
		//    5   11:return          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
		{
			MediaControllerCompat.Callback.this.onQueueTitleChanged(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #76  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
		//    4    8:return          
		}

		public void onSessionDestroyed()
		{
			MediaControllerCompat.Callback.this.onSessionDestroyed();
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
				MediaControllerCompat.Callback.this.onSessionEvent(s, bundle);
		//    8   19:aload_0         
		//    9   20:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//   10   23:aload_1         
		//   11   24:aload_2         
		//   12   25:invokevirtual   #89  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
				return;
		//   13   28:return          
			}
		}

		final MediaControllerCompat.Callback this$0;

		StubApi21()
		{
			this$0 = MediaControllerCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class StubApi26 extends StubApi21
		implements MediaControllerCompatApi26.Callback
	{

		public void onRepeatModeChanged(int i)
		{
			MediaControllerCompat.Callback.this.onRepeatModeChanged(i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #27  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
		//    4    8:return          
		}

		public void onShuffleModeChanged(boolean flag)
		{
			MediaControllerCompat.Callback.this.onShuffleModeChanged(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
		//    4    8:return          
		}

		final MediaControllerCompat.Callback this$0;

		private StubApi26()
		{
			this$0 = MediaControllerCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaControllerCompat$Callback$StubApi21(MediaControllerCompat$Callback)>
		//    6   10:return          
		}

		StubApi26(MediaControllerCompat._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void MediaControllerCompat$Callback$StubApi26(MediaControllerCompat$Callback)>
		//    3    5:return          
		}
	}

	class StubCompat extends IMediaControllerCallback.Stub
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
			MediaControllerCompat.PlaybackInfo playbackinfo = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			if(parcelablevolumeinfo != null)
		//*   2    2:aload_1         
		//*   3    3:ifnull          34
				playbackinfo = new MediaControllerCompat.PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
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

		final MediaControllerCompat.Callback this$0;

		StubCompat()
		{
			this$0 = MediaControllerCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaControllerCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaControllerCallback$Stub()>
		//    5    9:return          
		}
	}


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

	public void onAudioInfoChanged(nfo nfo)
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
	static Object access$200(MediaControllerCompat$Callback mediacontrollercompat$callback)
	{
		return mediacontrollercompat$callback.mCallbackObj;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object mCallbackObj>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(MediaControllerCompat$Callback mediacontrollercompat$callback, Handler handler)
	{
		mediacontrollercompat$callback.setHandler(handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void setHandler(Handler)>
		return;
	//    3    5:return          
	}

*/

	public MediaControllerCompat$Callback()
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
			mCallbackObj = MediaControllerCompatApi26.createCallback(((back) (new StubApi26(((MediaControllerCompat._cls1) (null))))));
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
			mCallbackObj = MediaControllerCompatApi21.createCallback(((back) (new StubApi21())));
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaControllerCompatApi21, MediaSessionCompat, IMediaSession, 
//			PlaybackStateCompat, ParcelableVolumeInfo

static class MediaControllerCompat$MediaControllerImplApi21
	implements MediaControllerCompat.MediaControllerImpl
{
	static class ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
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
		//   13   24:invokestatic    #40  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
		//   14   27:invokestatic    #46  <Method IMediaSession IMediaSession$Stub.asInterface(android.os.IBinder)>
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

		public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21, Handler handler)
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

	class ExtraCallback extends IMediaControllerCallback.Stub
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

				final ExtraCallback this$1;
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

				final ExtraCallback this$1;
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

				final ExtraCallback this$1;
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

				final ExtraCallback this$1;
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

		private MediaControllerCompat.Callback mCallback;
		final MediaControllerCompat.MediaControllerImplApi21 this$0;


/*
		static MediaControllerCompat.Callback access$500(ExtraCallback extracallback)
		{
			return extracallback.mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaControllerCompat$Callback mCallback>
		//    2    4:areturn         
		}

*/

		ExtraCallback(MediaControllerCompat.Callback callback)
		{
			this$0 = MediaControllerCompat.MediaControllerImplApi21.this;
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
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)iterator.next();
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

	public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
	{
		Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object mControllerObj>
	//    2    4:invokestatic    #223 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          40
			return new MediaControllerCompat.PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
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

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object mControllerObj>
	//    2    4:invokestatic    #306 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi21(obj)));
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

	public final void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
	{
		MediaControllerCompatApi21.registerCallback(mControllerObj, MediaControllerCompat.Callback.access$200(callback), handler);
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
			MediaControllerCompat.Callback.access$300(callback, handler);
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
			catch(MediaControllerCompat.Callback callback)
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
		MediaControllerCompat.Callback.access$300(callback, handler);
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

	public final void unregisterCallback(MediaControllerCompat.Callback callback)
	{
		MediaControllerCompatApi21.unregisterCallback(mControllerObj, MediaControllerCompat.Callback.access$200(callback));
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
			callback = ((MediaControllerCompat.Callback) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
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
		catch(MediaControllerCompat.Callback callback)
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
	static IMediaSession access$000(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21)
	{
		return mediacontrollercompat$mediacontrollerimplapi21.mExtraBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field IMediaSession mExtraBinder>
	//    2    4:areturn         
	}

*/


/*
	static IMediaSession access$002(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21, IMediaSession imediasession)
	{
		mediacontrollercompat$mediacontrollerimplapi21.mExtraBinder = imediasession;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field IMediaSession mExtraBinder>
		return imediasession;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$400(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21)
	{
		mediacontrollercompat$mediacontrollerimplapi21.processPendingCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void processPendingCallbacks()>
		return;
	//    2    4:return          
	}

*/

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
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

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
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

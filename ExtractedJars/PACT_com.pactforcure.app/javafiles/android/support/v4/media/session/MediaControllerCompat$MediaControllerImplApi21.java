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
	private static class ExtraBinderRequestResultReceiver extends ResultReceiver
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
		//   15   30:invokestatic    #50  <Method IMediaSession MediaControllerCompat$MediaControllerImplApi21.access$202(MediaControllerCompat$MediaControllerImplApi21, IMediaSession)>
		//   16   33:pop             
				mediacontrollerimplapi21.processPendingCallbacks();
		//   17   34:aload_3         
		//   18   35:invokestatic    #54  <Method void MediaControllerCompat$MediaControllerImplApi21.access$300(MediaControllerCompat$MediaControllerImplApi21)>
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

	private static class ExtraCallback extends MediaControllerCompat.Callback.StubCompat
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

		ExtraCallback(MediaControllerCompat.Callback callback)
		{
			super(callback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void MediaControllerCompat$Callback$StubCompat(MediaControllerCompat$Callback)>
		//    3    5:return          
		}
	}


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
_L1:
		ExtraCallback extracallback;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_94;
	//   13   25:aload_2         
	//   14   26:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            94
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)iterator.next();
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
		  goto _L1
	//*  38   81:goto            25
		Object obj;
		obj;
	//   39   84:astore_2        
		Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (obj)));
	//   40   85:ldc1            #121 <String "MediaControllerCompat">
	//   41   87:ldc1            #123 <String "Dead object in registerCallback.">
	//   42   89:aload_2         
	//   43   90:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   44   93:pop             
		mPendingCallbacks.clear();
	//   45   94:aload_0         
	//   46   95:getfield        #40  <Field List mPendingCallbacks>
	//   47   98:invokeinterface #132 <Method void List.clear()>
		list;
	//   48  103:aload_1         
		JVM INSTR monitorexit ;
	//   49  104:monitorexit     
		return;
	//   50  105:return          
		obj;
	//   51  106:astore_2        
		list;
	//   52  107:aload_1         
		JVM INSTR monitorexit ;
	//   53  108:monitorexit     
		throw obj;
	//   54  109:aload_2         
	//   55  110:athrow          
	}

	private void requestExtraBinder()
	{
		sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", ((Bundle) (null)), ((ResultReceiver) (new ExtraBinderRequestResultReceiver(this, new Handler()))));
	//    0    0:aload_0         
	//    1    1:ldc1            #134 <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
	//    2    3:aconst_null     
	//    3    4:new             #11  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver>
	//    4    7:dup             
	//    5    8:aload_0         
	//    6    9:new             #136 <Class Handler>
	//    7   12:dup             
	//    8   13:invokespecial   #137 <Method void Handler()>
	//    9   16:invokespecial   #140 <Method void MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21, Handler)>
	//   10   19:invokevirtual   #144 <Method void sendCommand(String, Bundle, ResultReceiver)>
	//   11   22:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		if((4L & getFlags()) == 0L)
	//*   0    0:ldc2w           #147 <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #152 <Method long getFlags()>
	//*   3    7:land            
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            23
		{
			throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    7   13:new             #154 <Class UnsupportedOperationException>
	//    8   16:dup             
	//    9   17:ldc1            #156 <String "This session doesn't support queue management operations">
	//   10   19:invokespecial   #159 <Method void UnsupportedOperationException(String)>
	//   11   22:athrow          
		} else
		{
			Bundle bundle = new Bundle();
	//   12   23:new             #161 <Class Bundle>
	//   13   26:dup             
	//   14   27:invokespecial   #162 <Method void Bundle()>
	//   15   30:astore_2        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
	//   16   31:aload_2         
	//   17   32:ldc1            #164 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #168 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
	//   20   38:aload_0         
	//   21   39:ldc1            #170 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
	//   22   41:aload_2         
	//   23   42:aconst_null     
	//   24   43:invokevirtual   #144 <Method void sendCommand(String, Bundle, ResultReceiver)>
			return;
	//   25   46:return          
		}
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		if((4L & getFlags()) == 0L)
	//*   0    0:ldc2w           #147 <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #152 <Method long getFlags()>
	//*   3    7:land            
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            23
		{
			throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    7   13:new             #154 <Class UnsupportedOperationException>
	//    8   16:dup             
	//    9   17:ldc1            #156 <String "This session doesn't support queue management operations">
	//   10   19:invokespecial   #159 <Method void UnsupportedOperationException(String)>
	//   11   22:athrow          
		} else
		{
			Bundle bundle = new Bundle();
	//   12   23:new             #161 <Class Bundle>
	//   13   26:dup             
	//   14   27:invokespecial   #162 <Method void Bundle()>
	//   15   30:astore_3        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
	//   16   31:aload_3         
	//   17   32:ldc1            #164 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #168 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
	//   20   38:aload_3         
	//   21   39:ldc1            #173 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
	//   22   41:iload_2         
	//   23   42:invokevirtual   #177 <Method void Bundle.putInt(String, int)>
			sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, ((ResultReceiver) (null)));
	//   24   45:aload_0         
	//   25   46:ldc1            #179 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
	//   26   48:aload_3         
	//   27   49:aconst_null     
	//   28   50:invokevirtual   #144 <Method void sendCommand(String, Bundle, ResultReceiver)>
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
	//    4    6:invokestatic    #184 <Method void MediaControllerCompatApi21.adjustVolume(Object, int, int)>
	//    5    9:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #189 <Method boolean MediaControllerCompatApi21.dispatchMediaButtonEvent(Object, KeyEvent)>
	//    4    8:ireturn         
	}

	public Bundle getExtras()
	{
		return MediaControllerCompatApi21.getExtras(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:invokestatic    #194 <Method Bundle MediaControllerCompatApi21.getExtras(Object)>
	//    3    7:areturn         
	}

	public long getFlags()
	{
		return MediaControllerCompatApi21.getFlags(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:invokestatic    #197 <Method long MediaControllerCompatApi21.getFlags(Object)>
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
	//    2    4:invokestatic    #203 <Method Object MediaControllerCompatApi21.getMetadata(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return MediaMetadataCompat.fromMediaMetadata(obj);
	//    6   12:aload_1         
	//    7   13:invokestatic    #209 <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
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
	//    2    4:invokestatic    #214 <Method String MediaControllerCompatApi21.getPackageName(Object)>
	//    3    7:areturn         
	}

	public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
	{
		Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:invokestatic    #218 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          40
			return new MediaControllerCompat.PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
	//    6   12:new             #220 <Class MediaControllerCompat$PlaybackInfo>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokestatic    #226 <Method int MediaControllerCompatApi21$PlaybackInfo.getPlaybackType(Object)>
	//   10   20:aload_1         
	//   11   21:invokestatic    #229 <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
	//   12   24:aload_1         
	//   13   25:invokestatic    #232 <Method int MediaControllerCompatApi21$PlaybackInfo.getVolumeControl(Object)>
	//   14   28:aload_1         
	//   15   29:invokestatic    #235 <Method int MediaControllerCompatApi21$PlaybackInfo.getMaxVolume(Object)>
	//   16   32:aload_1         
	//   17   33:invokestatic    #238 <Method int MediaControllerCompatApi21$PlaybackInfo.getCurrentVolume(Object)>
	//   18   36:invokespecial   #241 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
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
	//    5   11:invokeinterface #245 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
	//    6   16:astore_1        
		return playbackstatecompat;
	//    7   17:aload_1         
	//    8   18:areturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_1        
		Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #121 <String "MediaControllerCompat">
	//   11   22:ldc1            #247 <String "Dead object in getPlaybackState.">
	//   12   24:aload_1         
	//   13   25:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   14   28:pop             
		Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
	//   15   29:aload_0         
	//   16   30:getfield        #59  <Field Object mControllerObj>
	//   17   33:invokestatic    #249 <Method Object MediaControllerCompatApi21.getPlaybackState(Object)>
	//   18   36:astore_1        
		if(obj != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          46
			return PlaybackStateCompat.fromPlaybackState(obj);
	//   21   41:aload_1         
	//   22   42:invokestatic    #255 <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
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
	//    2    4:invokestatic    #260 <Method List MediaControllerCompatApi21.getQueue(Object)>
	//    3    7:astore_1        
		if(list != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return MediaSessionCompat.QueueItem.fromQueueItemList(list);
	//    6   12:aload_1         
	//    7   13:invokestatic    #266 <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
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
	//    2    4:invokestatic    #273 <Method CharSequence MediaControllerCompatApi21.getQueueTitle(Object)>
	//    3    7:areturn         
	}

	public int getRatingType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 22 || mExtraBinder == null)
			break MISSING_BLOCK_LABEL_38;
	//    0    0:getstatic       #281 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          22
	//    2    5:icmpge          38
	//    3    8:aload_0         
	//    4    9:getfield        #66  <Field IMediaSession mExtraBinder>
	//    5   12:ifnull          38
		int i = mExtraBinder.getRatingType();
	//    6   15:aload_0         
	//    7   16:getfield        #66  <Field IMediaSession mExtraBinder>
	//    8   19:invokeinterface #283 <Method int IMediaSession.getRatingType()>
	//    9   24:istore_1        
		return i;
	//   10   25:iload_1         
	//   11   26:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//   12   27:astore_2        
		Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
	//   13   28:ldc1            #121 <String "MediaControllerCompat">
	//   14   30:ldc2            #285 <String "Dead object in getRatingType.">
	//   15   33:aload_2         
	//   16   34:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   17   37:pop             
		return MediaControllerCompatApi21.getRatingType(mControllerObj);
	//   18   38:aload_0         
	//   19   39:getfield        #59  <Field Object mControllerObj>
	//   20   42:invokestatic    #287 <Method int MediaControllerCompatApi21.getRatingType(Object)>
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
	//    5   11:invokeinterface #290 <Method int IMediaSession.getRepeatMode()>
	//    6   16:istore_1        
		return i;
	//    7   17:iload_1         
	//    8   18:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_2        
		Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #121 <String "MediaControllerCompat">
	//   11   22:ldc2            #292 <String "Dead object in getRepeatMode.">
	//   12   25:aload_2         
	//   13   26:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
		return 0;
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public PendingIntent getSessionActivity()
	{
		return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:invokestatic    #297 <Method PendingIntent MediaControllerCompatApi21.getSessionActivity(Object)>
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
	//    5   11:invokeinterface #300 <Method int IMediaSession.getShuffleMode()>
	//    6   16:istore_1        
		return i;
	//    7   17:iload_1         
	//    8   18:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_2        
		Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #121 <String "MediaControllerCompat">
	//   11   22:ldc2            #302 <String "Dead object in getShuffleMode.">
	//   12   25:aload_2         
	//   13   26:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
		return 0;
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
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
	//    5   11:invokeinterface #314 <Method boolean IMediaSession.isCaptioningEnabled()>
	//    6   16:istore_1        
		return flag;
	//    7   17:iload_1         
	//    8   18:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_2        
		Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #121 <String "MediaControllerCompat">
	//   11   22:ldc2            #316 <String "Dead object in isCaptioningEnabled.">
	//   12   25:aload_2         
	//   13   26:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
		return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public boolean isShuffleModeEnabled()
	{
		if(mExtraBinder == null)
			break MISSING_BLOCK_LABEL_30;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field IMediaSession mExtraBinder>
	//    2    4:ifnull          30
		boolean flag = mExtraBinder.isShuffleModeEnabledDeprecated();
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field IMediaSession mExtraBinder>
	//    5   11:invokeinterface #320 <Method boolean IMediaSession.isShuffleModeEnabledDeprecated()>
	//    6   16:istore_1        
		return flag;
	//    7   17:iload_1         
	//    8   18:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_2        
		Log.e("MediaControllerCompat", "Dead object in isShuffleModeEnabled.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #121 <String "MediaControllerCompat">
	//   11   22:ldc2            #322 <String "Dead object in isShuffleModeEnabled.">
	//   12   25:aload_2         
	//   13   26:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   14   29:pop             
		return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public final void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
	{
		MediaControllerCompatApi21.registerCallback(mControllerObj, MediaControllerCompat.Callback.access$000(callback), handler);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #328 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
	//    4    8:aload_2         
	//    5    9:invokestatic    #331 <Method void MediaControllerCompatApi21.registerCallback(Object, Object, Handler)>
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
			catch(MediaControllerCompat.Callback callback)
	//*  28   54:astore_1        
			{
				Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (callback)));
	//   29   55:ldc1            #121 <String "MediaControllerCompat">
	//   30   57:ldc1            #123 <String "Dead object in registerCallback.">
	//   31   59:aload_1         
	//   32   60:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
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
			mPendingCallbacks.add(((Object) (callback)));
	//   40   72:aload_0         
	//   41   73:getfield        #40  <Field List mPendingCallbacks>
	//   42   76:aload_1         
	//   43   77:invokeinterface #335 <Method boolean List.add(Object)>
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
		if((4L & getFlags()) == 0L)
	//*   0    0:ldc2w           #147 <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #152 <Method long getFlags()>
	//*   3    7:land            
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            23
		{
			throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    7   13:new             #154 <Class UnsupportedOperationException>
	//    8   16:dup             
	//    9   17:ldc1            #156 <String "This session doesn't support queue management operations">
	//   10   19:invokespecial   #159 <Method void UnsupportedOperationException(String)>
	//   11   22:athrow          
		} else
		{
			Bundle bundle = new Bundle();
	//   12   23:new             #161 <Class Bundle>
	//   13   26:dup             
	//   14   27:invokespecial   #162 <Method void Bundle()>
	//   15   30:astore_2        
			bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", ((android.os.Parcelable) (mediadescriptioncompat)));
	//   16   31:aload_2         
	//   17   32:ldc1            #164 <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #168 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, ((ResultReceiver) (null)));
	//   20   38:aload_0         
	//   21   39:ldc2            #338 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:invokevirtual   #144 <Method void sendCommand(String, Bundle, ResultReceiver)>
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
	//    5    7:invokestatic    #341 <Method void MediaControllerCompatApi21.sendCommand(Object, String, Bundle, ResultReceiver)>
	//    6   10:return          
	}

	public void setVolumeTo(int i, int j)
	{
		MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #344 <Method void MediaControllerCompatApi21.setVolumeTo(Object, int, int)>
	//    5    9:return          
	}

	public final void unregisterCallback(MediaControllerCompat.Callback callback)
	{
		MediaControllerCompatApi21.unregisterCallback(mControllerObj, MediaControllerCompat.Callback.access$000(callback));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mControllerObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #328 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
	//    4    8:invokestatic    #348 <Method void MediaControllerCompatApi21.unregisterCallback(Object, Object)>
		if(mExtraBinder == null)
			break MISSING_BLOCK_LABEL_57;
	//    5   11:aload_0         
	//    6   12:getfield        #66  <Field IMediaSession mExtraBinder>
	//    7   15:ifnull          57
		try
		{
			callback = ((MediaControllerCompat.Callback) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field HashMap mCallbackMap>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #351 <Method Object HashMap.remove(Object)>
	//   12   26:checkcast       #14  <Class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback>
	//   13   29:astore_1        
		}
	//*  14   30:aload_1         
	//*  15   31:ifnull          44
	//*  16   34:aload_0         
	//*  17   35:getfield        #66  <Field IMediaSession mExtraBinder>
	//*  18   38:aload_1         
	//*  19   39:invokeinterface #354 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
	//*  20   44:return          
		// Misplaced declaration of an exception variable
		catch(MediaControllerCompat.Callback callback)
	//*  21   45:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
	//   22   46:ldc1            #121 <String "MediaControllerCompat">
	//   23   48:ldc2            #356 <String "Dead object in unregisterCallback.">
	//   24   51:aload_1         
	//   25   52:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   26   55:pop             
			return;
	//   27   56:return          
		}
		if(callback == null)
			break MISSING_BLOCK_LABEL_44;
		mExtraBinder.unregisterCallbackListener(((IMediaControllerCallback) (callback)));
		return;
		synchronized(mPendingCallbacks)
	//*  28   57:aload_0         
	//*  29   58:getfield        #40  <Field List mPendingCallbacks>
	//*  30   61:astore_2        
	//*  31   62:aload_2         
	//*  32   63:monitorenter    
		{
			mPendingCallbacks.remove(((Object) (callback)));
	//   33   64:aload_0         
	//   34   65:getfield        #40  <Field List mPendingCallbacks>
	//   35   68:aload_1         
	//   36   69:invokeinterface #358 <Method boolean List.remove(Object)>
	//   37   74:pop             
		}
	//   38   75:aload_2         
	//   39   76:monitorexit     
		return;
	//   40   77:return          
		callback;
	//   41   78:astore_1        
		list;
	//   42   79:aload_2         
		JVM INSTR monitorexit ;
	//   43   80:monitorexit     
		throw callback;
	//   44   81:aload_1         
	//   45   82:athrow          
	}

	private HashMap mCallbackMap;
	protected final Object mControllerObj;
	private IMediaSession mExtraBinder;
	private final List mPendingCallbacks;


/*
	static IMediaSession access$202(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21, IMediaSession imediasession)
	{
		mediacontrollercompat$mediacontrollerimplapi21.mExtraBinder = imediasession;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field IMediaSession mExtraBinder>
		return imediasession;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$300(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21)
	{
		mediacontrollercompat$mediacontrollerimplapi21.processPendingCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void processPendingCallbacks()>
		return;
	//    2    4:return          
	}

*/

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
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

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
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

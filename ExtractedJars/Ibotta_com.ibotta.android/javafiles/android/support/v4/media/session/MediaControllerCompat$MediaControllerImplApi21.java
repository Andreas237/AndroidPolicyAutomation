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
//			MediaControllerCompat, IMediaSession, MediaControllerCompatApi21, PlaybackStateCompat, 
//			ParcelableVolumeInfo

static class MediaControllerCompat$MediaControllerImplApi21
	implements MediaControllerCompat.MediaControllerImpl
{
	private static class ExtraBinderRequestResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
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
		MediaControllerCompat.Callback callback;
		ExtraCallback extracallback;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   13   25:aload_2         
	//   14   26:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            98
		callback = (MediaControllerCompat.Callback)iterator.next();
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

	public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
	{
		Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Object mControllerObj>
	//    2    4:invokestatic    #182 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          40
			return new MediaControllerCompat.PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
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

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Object mControllerObj>
	//    2    4:invokestatic    #270 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi21(obj)));
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

	public final void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
	{
		MediaControllerCompatApi21.registerCallback(mControllerObj, MediaControllerCompat.Callback.access$000(callback), handler);
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
			catch(MediaControllerCompat.Callback callback)
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

	public final void unregisterCallback(MediaControllerCompat.Callback callback)
	{
		MediaControllerCompatApi21.unregisterCallback(mControllerObj, MediaControllerCompat.Callback.access$000(callback));
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
		callback = ((MediaControllerCompat.Callback) ((ExtraCallback)mCallbackMap.remove(((Object) (callback)))));
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
			catch(MediaControllerCompat.Callback callback)
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
	static IMediaSession access$202(MediaControllerCompat$MediaControllerImplApi21 mediacontrollercompat$mediacontrollerimplapi21, IMediaSession imediasession)
	{
		mediacontrollercompat$mediacontrollerimplapi21.mExtraBinder = imediasession;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field IMediaSession mExtraBinder>
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
	//    1    1:invokespecial   #39  <Method void processPendingCallbacks()>
		return;
	//    2    4:return          
	}

*/
}

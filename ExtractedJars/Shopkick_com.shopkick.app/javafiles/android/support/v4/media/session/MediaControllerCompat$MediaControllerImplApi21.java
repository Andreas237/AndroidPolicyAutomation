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
//			MediaControllerCompat, MediaControllerCompatApi21, IMediaSession, PlaybackStateCompat, 
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
		//   19   38:invokestatic    #48  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
		//   20   41:invokestatic    #54  <Method IMediaSession IMediaSession$Stub.asInterface(android.os.IBinder)>
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

		ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 mediacontrollerimplapi21)
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

	public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
	{
		Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object mControllerObj>
	//    2    4:invokestatic    #158 <Method Object MediaControllerCompatApi21.getPlaybackInfo(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          40
			return new MediaControllerCompat.PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
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

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object mControllerObj>
	//    2    4:invokestatic    #256 <Method Object MediaControllerCompatApi21.getTransportControls(Object)>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			return ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsApi21(obj)));
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
		MediaControllerCompat.Callback callback;
		ExtraCallback extracallback;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//    9   21:aload_1         
	//   10   22:invokeinterface #280 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            99
		callback = (MediaControllerCompat.Callback)iterator.next();
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

	public final void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
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
		catch(MediaControllerCompat.Callback callback) { }
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

	public final void unregisterCallback(MediaControllerCompat.Callback callback)
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
		catch(MediaControllerCompat.Callback callback) { }
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

	public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
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

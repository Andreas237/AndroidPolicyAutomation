// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.view.KeyEvent;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi21, MediaSessionCompatApi24, IMediaControllerCallback, 
//			PlaybackStateCompat, MediaSessionCompatApi22, ParcelableVolumeInfo

static class MediaSessionCompat$MediaSessionImplApi21
	implements MediaSessionCompat.MediaSessionImpl
{
	class ExtraSession extends IMediaSession.Stub
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void adjustVolume(int i, int j, String s)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void fastForward()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public Bundle getExtras()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public long getFlags()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public PendingIntent getLaunchPendingIntent()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public MediaMetadataCompat getMetadata()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public String getPackageName()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public PlaybackStateCompat getPlaybackState()
		{
			return MediaSessionCompat.access$500(mPlaybackState, mMetadata);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:invokestatic    #49  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImplApi21.access$800(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    5   11:invokestatic    #53  <Method MediaMetadataCompat MediaSessionCompat$MediaSessionImplApi21.access$900(MediaSessionCompat$MediaSessionImplApi21)>
		//    6   14:invokestatic    #57  <Method PlaybackStateCompat MediaSessionCompat.access$500(PlaybackStateCompat, MediaMetadataCompat)>
		//    7   17:areturn         
		}

		public List getQueue()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getQueueTitle()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public int getRatingType()
		{
			return mRatingType;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #69  <Field int MediaSessionCompat$MediaSessionImplApi21.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #73  <Field int MediaSessionCompat$MediaSessionImplApi21.mRepeatMode>
		//    3    7:ireturn         
		}

		public int getShuffleMode()
		{
			return mShuffleMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #77  <Field int MediaSessionCompat$MediaSessionImplApi21.mShuffleMode>
		//    3    7:ireturn         
		}

		public String getTag()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public ParcelableVolumeInfo getVolumeAttributes()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public boolean isCaptioningEnabled()
		{
			return mCaptioningEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #86  <Field boolean MediaSessionCompat$MediaSessionImplApi21.mCaptioningEnabled>
		//    3    7:ireturn         
		}

		public boolean isShuffleModeEnabledRemoved()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isTransportControlEnabled()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void next()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void pause()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void play()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepare()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void previous()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(!mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//*   2    4:invokestatic    #111 <Method boolean MediaSessionCompat$MediaSessionImplApi21.access$600(MediaSessionCompat$MediaSessionImplApi21)>
		//*   3    7:ifne            22
				mExtraControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    6   14:invokestatic    #115 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #121 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
		//    9   21:pop             
		//   10   22:return          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void removeQueueItemAt(int i)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rewind()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setShuffleModeEnabledRemoved(boolean flag)
			throws RemoteException
		{
		//    0    0:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void skipToQueueItem(long l)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void stop()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mExtraControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:invokestatic    #115 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #144 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//    5   11:pop             
		//    6   12:return          
		}

		final MediaSessionCompat.MediaSessionImplApi21 this$0;

		ExtraSession()
		{
			this$0 = MediaSessionCompat.MediaSessionImplApi21.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaSession$Stub()>
		//    5    9:return          
		}
	}


	public String getCallingPackage()
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		else
			return MediaSessionCompatApi24.getCallingPackage(mSessionObj);
	//    5   10:aload_0         
	//    6   11:getfield        #56  <Field Object mSessionObj>
	//    7   14:invokestatic    #104 <Method String MediaSessionCompatApi24.getCallingPackage(Object)>
	//    8   17:areturn         
	}

	public Object getMediaSession()
	{
		return mSessionObj;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:areturn         
	}

	public PlaybackStateCompat getPlaybackState()
	{
		return mPlaybackState;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field PlaybackStateCompat mPlaybackState>
	//    2    4:areturn         
	}

	public Object getRemoteControlClient()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public MediaSessionCompat.Token getSessionToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public boolean isActive()
	{
		return MediaSessionCompatApi21.isActive(mSessionObj);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:invokestatic    #115 <Method boolean MediaSessionCompatApi21.isActive(Object)>
	//    3    7:ireturn         
	}

	public void release()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #43  <Field boolean mDestroyed>
		MediaSessionCompatApi21.release(mSessionObj);
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Object mSessionObj>
	//    5    9:invokestatic    #118 <Method void MediaSessionCompatApi21.release(Object)>
	//    6   12:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          58
		{
			int i = mExtraControllerCallbacks.beginBroadcast() - 1;
	//    3    8:aload_0         
	//    4    9:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    5   12:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
	//    6   15:iconst_1        
	//    7   16:isub            
	//    8   17:istore_3        
			while(i >= 0) 
	//*   9   18:iload_3         
	//*  10   19:iflt            51
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   13   26:iload_3         
	//   14   27:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   15   30:checkcast       #132 <Class IMediaControllerCallback>
	//   16   33:astore          4
				try
				{
					imediacontrollercallback.onEvent(s, bundle);
	//   17   35:aload           4
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokeinterface #135 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
				}
	//*  21   44:iload_3         
	//*  22   45:iconst_1        
	//*  23   46:isub            
	//*  24   47:istore_3        
	//*  25   48:goto            18
	//*  26   51:aload_0         
	//*  27   52:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  28   55:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
	//*  29   58:aload_0         
	//*  30   59:getfield        #56  <Field Object mSessionObj>
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokestatic    #141 <Method void MediaSessionCompatApi21.sendSessionEvent(Object, String, Bundle)>
	//*  34   67:return          
				catch(RemoteException remoteexception) { }
	//   35   68:astore          4
				i--;
			}
			mExtraControllerCallbacks.finishBroadcast();
		}
		MediaSessionCompatApi21.sendSessionEvent(mSessionObj, s, bundle);
	//*  36   70:goto            44
	}

	public void setActive(boolean flag)
	{
		MediaSessionCompatApi21.setActive(mSessionObj, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #146 <Method void MediaSessionCompatApi21.setActive(Object, boolean)>
	//    4    8:return          
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		Object obj1 = mSessionObj;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:astore          4
		Object obj;
		if(callback == null)
	//*   3    6:aload_1         
	//*   4    7:ifnonnull       15
			obj = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		else
	//*   7   12:goto            20
			obj = callback.mCallbackObj;
	//    8   15:aload_1         
	//    9   16:getfield        #153 <Field Object MediaSessionCompat$Callback.mCallbackObj>
	//   10   19:astore_3        
		MediaSessionCompatApi21.setCallback(obj1, obj, handler);
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokestatic    #156 <Method void MediaSessionCompatApi21.setCallback(Object, Object, Handler)>
		if(callback != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          37
			MediaSessionCompat.Callback.access$300(callback, ((MediaSessionCompat.MediaSessionImpl) (this)), handler);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokestatic    #160 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
	//   21   37:return          
	}

	public void setCaptioningEnabled(boolean flag)
	{
		if(mCaptioningEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field boolean mCaptioningEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			mCaptioningEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #163 <Field boolean mCaptioningEnabled>
			int i = mExtraControllerCallbacks.beginBroadcast() - 1;
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore_2        
			while(i >= 0) 
	//*  13   23:iload_2         
	//*  14   24:iflt            53
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   19   35:checkcast       #132 <Class IMediaControllerCallback>
	//   20   38:astore_3        
				try
				{
					imediacontrollercallback.onCaptioningEnabledChanged(flag);
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokeinterface #166 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
				}
	//*  24   46:iload_2         
	//*  25   47:iconst_1        
	//*  26   48:isub            
	//*  27   49:istore_2        
	//*  28   50:goto            23
	//*  29   53:aload_0         
	//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
	//*  32   60:return          
				catch(RemoteException remoteexception) { }
	//   33   61:astore_3        
				i--;
			}
			mExtraControllerCallbacks.finishBroadcast();
		}
	//*  34   62:goto            46
	}

	public void setExtras(Bundle bundle)
	{
		MediaSessionCompatApi21.setExtras(mSessionObj, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #171 <Method void MediaSessionCompatApi21.setExtras(Object, Bundle)>
	//    4    8:return          
	}

	public void setFlags(int i)
	{
		MediaSessionCompatApi21.setFlags(mSessionObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #176 <Method void MediaSessionCompatApi21.setFlags(Object, int)>
	//    4    8:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
		MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #181 <Method void MediaSessionCompatApi21.setMediaButtonReceiver(Object, PendingIntent)>
	//    4    8:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		mMetadata = mediametadatacompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field MediaMetadataCompat mMetadata>
		Object obj = mSessionObj;
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field Object mSessionObj>
	//    5    9:astore_2        
		if(mediametadatacompat == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			mediametadatacompat = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            24
			mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getMediaMetadata()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #188 <Method Object MediaMetadataCompat.getMediaMetadata()>
	//   13   23:astore_1        
		MediaSessionCompatApi21.setMetadata(obj, ((Object) (mediametadatacompat)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokestatic    #191 <Method void MediaSessionCompatApi21.setMetadata(Object, Object)>
	//   17   29:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		mPlaybackState = playbackstatecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field PlaybackStateCompat mPlaybackState>
		int i = mExtraControllerCallbacks.beginBroadcast() - 1;
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    5    9:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:istore_2        
		while(i >= 0) 
	//*   9   15:iload_2         
	//*  10   16:iflt            45
		{
			Object obj = ((Object) ((IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i)));
	//   11   19:aload_0         
	//   12   20:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   15   27:checkcast       #132 <Class IMediaControllerCallback>
	//   16   30:astore_3        
			try
			{
				((IMediaControllerCallback) (obj)).onPlaybackStateChanged(playbackstatecompat);
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokeinterface #196 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  20   38:iload_2         
	//*  21   39:iconst_1        
	//*  22   40:isub            
	//*  23   41:istore_2        
	//*  24   42:goto            15
	//*  25   45:aload_0         
	//*  26   46:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  27   49:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
	//*  28   52:aload_0         
	//*  29   53:getfield        #56  <Field Object mSessionObj>
	//*  30   56:astore_3        
	//*  31   57:aload_1         
	//*  32   58:ifnonnull       66
	//*  33   61:aconst_null     
	//*  34   62:astore_1        
	//*  35   63:goto            71
	//*  36   66:aload_1         
	//*  37   67:invokevirtual   #200 <Method Object PlaybackStateCompat.getPlaybackState()>
	//*  38   70:astore_1        
	//*  39   71:aload_3         
	//*  40   72:aload_1         
	//*  41   73:invokestatic    #202 <Method void MediaSessionCompatApi21.setPlaybackState(Object, Object)>
	//*  42   76:return          
			catch(RemoteException remoteexception) { }
	//   43   77:astore_3        
			i--;
		}
		mExtraControllerCallbacks.finishBroadcast();
		obj = mSessionObj;
		if(playbackstatecompat == null)
			playbackstatecompat = null;
		else
			playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.getPlaybackState()));
		MediaSessionCompatApi21.setPlaybackState(obj, ((Object) (playbackstatecompat)));
	//*  44   78:goto            38
	}

	public void setPlaybackToLocal(int i)
	{
		MediaSessionCompatApi21.setPlaybackToLocal(mSessionObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #205 <Method void MediaSessionCompatApi21.setPlaybackToLocal(Object, int)>
	//    4    8:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #212 <Method Object VolumeProviderCompat.getVolumeProvider()>
	//    4    8:invokestatic    #214 <Method void MediaSessionCompatApi21.setPlaybackToRemote(Object, Object)>
	//    5   11:return          
	}

	public void setQueue(List list)
	{
		mQueue = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field List mQueue>
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          57
		{
			ArrayList arraylist = new ArrayList();
	//    5    9:new             #218 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #219 <Method void ArrayList()>
	//    8   16:astore_2        
			Iterator iterator = list.iterator();
	//    9   17:aload_1         
	//   10   18:invokeinterface #225 <Method Iterator List.iterator()>
	//   11   23:astore_3        
			do
			{
				list = ((List) (arraylist));
	//   12   24:aload_2         
	//   13   25:astore_1        
				if(!iterator.hasNext())
					break;
	//   14   26:aload_3         
	//   15   27:invokeinterface #230 <Method boolean Iterator.hasNext()>
	//   16   32:ifeq            59
				((List) (arraylist)).add(((MediaSessionCompat.QueueItem)iterator.next()).getQueueItem());
	//   17   35:aload_2         
	//   18   36:aload_3         
	//   19   37:invokeinterface #233 <Method Object Iterator.next()>
	//   20   42:checkcast       #235 <Class MediaSessionCompat$QueueItem>
	//   21   45:invokevirtual   #238 <Method Object MediaSessionCompat$QueueItem.getQueueItem()>
	//   22   48:invokeinterface #241 <Method boolean List.add(Object)>
	//   23   53:pop             
			} while(true);
	//   24   54:goto            24
		} else
		{
			list = null;
	//   25   57:aconst_null     
	//   26   58:astore_1        
		}
		MediaSessionCompatApi21.setQueue(mSessionObj, list);
	//   27   59:aload_0         
	//   28   60:getfield        #56  <Field Object mSessionObj>
	//   29   63:aload_1         
	//   30   64:invokestatic    #244 <Method void MediaSessionCompatApi21.setQueue(Object, List)>
	//   31   67:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #251 <Method void MediaSessionCompatApi21.setQueueTitle(Object, CharSequence)>
	//    4    8:return          
	}

	public void setRatingType(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 22)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmpge          14
		{
			mRatingType = i;
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:putfield        #254 <Field int mRatingType>
			return;
	//    6   13:return          
		} else
		{
			MediaSessionCompatApi22.setRatingType(mSessionObj, i);
	//    7   14:aload_0         
	//    8   15:getfield        #56  <Field Object mSessionObj>
	//    9   18:iload_1         
	//   10   19:invokestatic    #258 <Method void MediaSessionCompatApi22.setRatingType(Object, int)>
			return;
	//   11   22:return          
		}
	}

	public void setRepeatMode(int i)
	{
		if(mRepeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field int mRepeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			mRepeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #261 <Field int mRepeatMode>
			int j = mExtraControllerCallbacks.beginBroadcast() - 1;
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore_2        
			while(j >= 0) 
	//*  13   23:iload_2         
	//*  14   24:iflt            53
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   19   35:checkcast       #132 <Class IMediaControllerCallback>
	//   20   38:astore_3        
				try
				{
					imediacontrollercallback.onRepeatModeChanged(i);
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokeinterface #264 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
				}
	//*  24   46:iload_2         
	//*  25   47:iconst_1        
	//*  26   48:isub            
	//*  27   49:istore_2        
	//*  28   50:goto            23
	//*  29   53:aload_0         
	//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
	//*  32   60:return          
				catch(RemoteException remoteexception) { }
	//   33   61:astore_3        
				j--;
			}
			mExtraControllerCallbacks.finishBroadcast();
		}
	//*  34   62:goto            46
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		MediaSessionCompatApi21.setSessionActivity(mSessionObj, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #267 <Method void MediaSessionCompatApi21.setSessionActivity(Object, PendingIntent)>
	//    4    8:return          
	}

	public void setShuffleMode(int i)
	{
		if(mShuffleMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field int mShuffleMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			mShuffleMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #270 <Field int mShuffleMode>
			int j = mExtraControllerCallbacks.beginBroadcast() - 1;
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore_2        
			while(j >= 0) 
	//*  13   23:iload_2         
	//*  14   24:iflt            53
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   19   35:checkcast       #132 <Class IMediaControllerCallback>
	//   20   38:astore_3        
				try
				{
					imediacontrollercallback.onShuffleModeChanged(i);
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokeinterface #273 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
				}
	//*  24   46:iload_2         
	//*  25   47:iconst_1        
	//*  26   48:isub            
	//*  27   49:istore_2        
	//*  28   50:goto            23
	//*  29   53:aload_0         
	//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
	//*  32   60:return          
				catch(RemoteException remoteexception) { }
	//   33   61:astore_3        
				j--;
			}
			mExtraControllerCallbacks.finishBroadcast();
		}
	//*  34   62:goto            46
	}

	boolean mCaptioningEnabled;
	private boolean mDestroyed;
	private final RemoteCallbackList mExtraControllerCallbacks;
	private MediaMetadataCompat mMetadata;
	private PlaybackStateCompat mPlaybackState;
	private List mQueue;
	int mRatingType;
	int mRepeatMode;
	private final Object mSessionObj;
	int mShuffleMode;
	private final MediaSessionCompat.Token mToken;


/*
	static List access$200(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mQueue;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List mQueue>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

*/


/*
	static RemoteCallbackList access$700(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mExtraControllerCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static PlaybackStateCompat access$800(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mPlaybackState;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field PlaybackStateCompat mPlaybackState>
	//    2    4:areturn         
	}

*/


/*
	static MediaMetadataCompat access$900(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mMetadata;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field MediaMetadataCompat mMetadata>
	//    2    4:areturn         
	}

*/

	public MediaSessionCompat$MediaSessionImplApi21(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mDestroyed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #43  <Field boolean mDestroyed>
		mExtraControllerCallbacks = new RemoteCallbackList();
	//    5    9:aload_0         
	//    6   10:new             #45  <Class RemoteCallbackList>
	//    7   13:dup             
	//    8   14:invokespecial   #46  <Method void RemoteCallbackList()>
	//    9   17:putfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		mSessionObj = MediaSessionCompatApi21.createSession(context, s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #54  <Method Object MediaSessionCompatApi21.createSession(Context, String)>
	//   14   26:putfield        #56  <Field Object mSessionObj>
		mToken = new MediaSessionCompat.Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
	//   15   29:aload_0         
	//   16   30:new             #58  <Class MediaSessionCompat$Token>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #56  <Field Object mSessionObj>
	//   20   38:invokestatic    #62  <Method android.os.Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
	//   21   41:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #65  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
	//   25   49:invokespecial   #68  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
	//   26   52:putfield        #70  <Field MediaSessionCompat$Token mToken>
	//   27   55:return          
	}

	public MediaSessionCompat$MediaSessionImplApi21(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mDestroyed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #43  <Field boolean mDestroyed>
		mExtraControllerCallbacks = new RemoteCallbackList();
	//    5    9:aload_0         
	//    6   10:new             #45  <Class RemoteCallbackList>
	//    7   13:dup             
	//    8   14:invokespecial   #46  <Method void RemoteCallbackList()>
	//    9   17:putfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		mSessionObj = MediaSessionCompatApi21.verifySession(obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #76  <Method Object MediaSessionCompatApi21.verifySession(Object)>
	//   13   25:putfield        #56  <Field Object mSessionObj>
		mToken = new MediaSessionCompat.Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
	//   14   28:aload_0         
	//   15   29:new             #58  <Class MediaSessionCompat$Token>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field Object mSessionObj>
	//   19   37:invokestatic    #62  <Method android.os.Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
	//   20   40:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #65  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
	//   24   48:invokespecial   #68  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
	//   25   51:putfield        #70  <Field MediaSessionCompat$Token mToken>
	//   26   54:return          
	}
}

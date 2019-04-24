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
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi21, MediaSessionCompatApi24, IMediaControllerCallback, 
//			PlaybackStateCompat, MediaSessionCompatApi22, MediaSessionCompatApi26, ParcelableVolumeInfo

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
			return mPlaybackState;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:invokestatic    #49  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImplApi21.access$400(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:areturn         
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
		//    2    4:getfield        #61  <Field int MediaSessionCompat$MediaSessionImplApi21.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #65  <Field int MediaSessionCompat$MediaSessionImplApi21.mRepeatMode>
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

		public boolean isShuffleModeEnabled()
		{
			return mShuffleModeEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #74  <Field boolean MediaSessionCompat$MediaSessionImplApi21.mShuffleModeEnabled>
		//    3    7:ireturn         
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

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(!mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//*   2    4:invokestatic    #96  <Method boolean MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//*   3    7:ifne            22
				mExtraControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    6   14:invokestatic    #100 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$300(MediaSessionCompat$MediaSessionImplApi21)>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #106 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
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

		public void setRepeatMode(int i)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setShuffleModeEnabled(boolean flag)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
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
		//    2    4:invokestatic    #100 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$300(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #127 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		else
			return MediaSessionCompatApi24.getCallingPackage(mSessionObj);
	//    5   10:aload_0         
	//    6   11:getfield        #52  <Field Object mSessionObj>
	//    7   14:invokestatic    #88  <Method String MediaSessionCompatApi24.getCallingPackage(Object)>
	//    8   17:areturn         
	}

	ExtraSession getExtraSessionBinder()
	{
		if(mExtraSessionBinder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field MediaSessionCompat$MediaSessionImplApi21$ExtraSession mExtraSessionBinder>
	//*   2    4:ifnonnull       19
			mExtraSessionBinder = new ExtraSession();
	//    3    7:aload_0         
	//    4    8:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #95  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
	//    8   16:putfield        #92  <Field MediaSessionCompat$MediaSessionImplApi21$ExtraSession mExtraSessionBinder>
		return mExtraSessionBinder;
	//    9   19:aload_0         
	//   10   20:getfield        #92  <Field MediaSessionCompat$MediaSessionImplApi21$ExtraSession mExtraSessionBinder>
	//   11   23:areturn         
	}

	public Object getMediaSession()
	{
		return mSessionObj;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
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
	//    1    1:getfield        #63  <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public boolean isActive()
	{
		return MediaSessionCompatApi21.isActive(mSessionObj);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:invokestatic    #104 <Method boolean MediaSessionCompatApi21.isActive(Object)>
	//    3    7:ireturn         
	}

	public void release()
	{
		mDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean mDestroyed>
		MediaSessionCompatApi21.release(mSessionObj);
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field Object mSessionObj>
	//    5    9:invokestatic    #107 <Method void MediaSessionCompatApi21.release(Object)>
	//    6   12:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          63
		{
			for(int i = mExtraControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   3    8:aload_0         
	//*   4    9:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*   5   12:invokevirtual   #115 <Method int RemoteCallbackList.beginBroadcast()>
	//*   6   15:iconst_1        
	//*   7   16:isub            
	//*   8   17:istore_3        
	//*   9   18:iload_3         
	//*  10   19:iflt            56
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
	//   11   22:aload_0         
	//   12   23:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   13   26:iload_3         
	//   14   27:invokevirtual   #119 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   15   30:checkcast       #121 <Class IMediaControllerCallback>
	//   16   33:astore          4
				try
				{
					imediacontrollercallback.onEvent(s, bundle);
	//   17   35:aload           4
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokeinterface #124 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
				}
	//*  21   44:goto            49
				catch(RemoteException remoteexception) { }
	//   22   47:astore          4
			}

	//   23   49:iload_3         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:istore_3        
	//*  27   53:goto            18
			mExtraControllerCallbacks.finishBroadcast();
	//   28   56:aload_0         
	//   29   57:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   30   60:invokevirtual   #127 <Method void RemoteCallbackList.finishBroadcast()>
		}
		MediaSessionCompatApi21.sendSessionEvent(mSessionObj, s, bundle);
	//   31   63:aload_0         
	//   32   64:getfield        #52  <Field Object mSessionObj>
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:invokestatic    #130 <Method void MediaSessionCompatApi21.sendSessionEvent(Object, String, Bundle)>
	//   36   72:return          
	}

	public void setActive(boolean flag)
	{
		MediaSessionCompatApi21.setActive(mSessionObj, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #135 <Method void MediaSessionCompatApi21.setActive(Object, boolean)>
	//    4    8:return          
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		Object obj1 = mSessionObj;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
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
	//    9   16:getfield        #142 <Field Object MediaSessionCompat$Callback.mCallbackObj>
	//   10   19:astore_3        
		MediaSessionCompatApi21.setCallback(obj1, obj, handler);
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokestatic    #145 <Method void MediaSessionCompatApi21.setCallback(Object, Object, Handler)>
		if(android.os.Build.VERSION.SDK_INT < 26 && callback != null)
	//*  15   27:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   30:bipush          26
	//*  17   32:icmpge          51
	//*  18   35:aload_1         
	//*  19   36:ifnull          51
			callback.mSessionImpl = new WeakReference(((Object) (this)));
	//   20   39:aload_1         
	//   21   40:new             #147 <Class WeakReference>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:invokespecial   #148 <Method void WeakReference(Object)>
	//   25   48:putfield        #152 <Field WeakReference MediaSessionCompat$Callback.mSessionImpl>
	//   26   51:return          
	}

	public void setExtras(Bundle bundle)
	{
		MediaSessionCompatApi21.setExtras(mSessionObj, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #157 <Method void MediaSessionCompatApi21.setExtras(Object, Bundle)>
	//    4    8:return          
	}

	public void setFlags(int i)
	{
		MediaSessionCompatApi21.setFlags(mSessionObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #162 <Method void MediaSessionCompatApi21.setFlags(Object, int)>
	//    4    8:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
		MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #167 <Method void MediaSessionCompatApi21.setMediaButtonReceiver(Object, PendingIntent)>
	//    4    8:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		Object obj = mSessionObj;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:astore_2        
		if(mediametadatacompat == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			mediametadatacompat = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getMediaMetadata()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #174 <Method Object MediaMetadataCompat.getMediaMetadata()>
	//   10   18:astore_1        
		MediaSessionCompatApi21.setMetadata(obj, ((Object) (mediametadatacompat)));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokestatic    #177 <Method void MediaSessionCompatApi21.setMetadata(Object, Object)>
	//   14   24:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		mPlaybackState = playbackstatecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field PlaybackStateCompat mPlaybackState>
		for(int i = mExtraControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*   5    9:invokevirtual   #115 <Method int RemoteCallbackList.beginBroadcast()>
	//*   6   12:iconst_1        
	//*   7   13:isub            
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iflt            49
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #119 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   15   27:checkcast       #121 <Class IMediaControllerCallback>
	//   16   30:astore_3        
			try
			{
				imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokeinterface #182 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  20   38:goto            42
			catch(RemoteException remoteexception) { }
	//   21   41:astore_3        
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:isub            
	//   25   45:istore_2        
	//*  26   46:goto            15
		mExtraControllerCallbacks.finishBroadcast();
	//   27   49:aload_0         
	//   28   50:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   29   53:invokevirtual   #127 <Method void RemoteCallbackList.finishBroadcast()>
		Object obj = mSessionObj;
	//   30   56:aload_0         
	//   31   57:getfield        #52  <Field Object mSessionObj>
	//   32   60:astore_3        
		if(playbackstatecompat == null)
	//*  33   61:aload_1         
	//*  34   62:ifnonnull       70
			playbackstatecompat = null;
	//   35   65:aconst_null     
	//   36   66:astore_1        
		else
	//*  37   67:goto            75
			playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.getPlaybackState()));
	//   38   70:aload_1         
	//   39   71:invokevirtual   #187 <Method Object PlaybackStateCompat.getPlaybackState()>
	//   40   74:astore_1        
		MediaSessionCompatApi21.setPlaybackState(obj, ((Object) (playbackstatecompat)));
	//   41   75:aload_3         
	//   42   76:aload_1         
	//   43   77:invokestatic    #189 <Method void MediaSessionCompatApi21.setPlaybackState(Object, Object)>
	//   44   80:return          
	}

	public void setPlaybackToLocal(int i)
	{
		MediaSessionCompatApi21.setPlaybackToLocal(mSessionObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #192 <Method void MediaSessionCompatApi21.setPlaybackToLocal(Object, int)>
	//    4    8:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #199 <Method Object VolumeProviderCompat.getVolumeProvider()>
	//    4    8:invokestatic    #201 <Method void MediaSessionCompatApi21.setPlaybackToRemote(Object, Object)>
	//    5   11:return          
	}

	public void setQueue(List list)
	{
		ArrayList arraylist = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(list != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          54
		{
			ArrayList arraylist1 = new ArrayList();
	//    4    6:new             #205 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #206 <Method void ArrayList()>
	//    7   13:astore_3        
			list = ((List) (list.iterator()));
	//    8   14:aload_1         
	//    9   15:invokeinterface #212 <Method Iterator List.iterator()>
	//   10   20:astore_1        
			do
			{
				arraylist = arraylist1;
	//   11   21:aload_3         
	//   12   22:astore_2        
				if(!((Iterator) (list)).hasNext())
					break;
	//   13   23:aload_1         
	//   14   24:invokeinterface #217 <Method boolean Iterator.hasNext()>
	//   15   29:ifeq            54
				((List) (arraylist1)).add(((MediaSessionCompat.QueueItem)((Iterator) (list)).next()).getQueueItem());
	//   16   32:aload_3         
	//   17   33:aload_1         
	//   18   34:invokeinterface #220 <Method Object Iterator.next()>
	//   19   39:checkcast       #222 <Class MediaSessionCompat$QueueItem>
	//   20   42:invokevirtual   #225 <Method Object MediaSessionCompat$QueueItem.getQueueItem()>
	//   21   45:invokeinterface #228 <Method boolean List.add(Object)>
	//   22   50:pop             
			} while(true);
	//   23   51:goto            21
		}
		MediaSessionCompatApi21.setQueue(mSessionObj, ((List) (arraylist)));
	//   24   54:aload_0         
	//   25   55:getfield        #52  <Field Object mSessionObj>
	//   26   58:aload_2         
	//   27   59:invokestatic    #231 <Method void MediaSessionCompatApi21.setQueue(Object, List)>
	//   28   62:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #238 <Method void MediaSessionCompatApi21.setQueueTitle(Object, CharSequence)>
	//    4    8:return          
	}

	public void setRatingType(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 22)
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmpge          14
		{
			mRatingType = i;
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:putfield        #241 <Field int mRatingType>
			return;
	//    6   13:return          
		} else
		{
			MediaSessionCompatApi22.setRatingType(mSessionObj, i);
	//    7   14:aload_0         
	//    8   15:getfield        #52  <Field Object mSessionObj>
	//    9   18:iload_1         
	//   10   19:invokestatic    #245 <Method void MediaSessionCompatApi22.setRatingType(Object, int)>
			return;
	//   11   22:return          
		}
	}

	public void setRepeatMode(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          73
		{
			if(mRepeatMode != i)
	//*   3    8:aload_0         
	//*   4    9:getfield        #248 <Field int mRepeatMode>
	//*   5   12:iload_1         
	//*   6   13:icmpeq          81
			{
				mRepeatMode = i;
	//    7   16:aload_0         
	//    8   17:iload_1         
	//    9   18:putfield        #248 <Field int mRepeatMode>
				for(int j = mExtraControllerCallbacks.beginBroadcast() - 1; j >= 0; j--)
	//*  10   21:aload_0         
	//*  11   22:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  12   25:invokevirtual   #115 <Method int RemoteCallbackList.beginBroadcast()>
	//*  13   28:iconst_1        
	//*  14   29:isub            
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:iflt            65
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
	//   18   35:aload_0         
	//   19   36:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   20   39:iload_2         
	//   21   40:invokevirtual   #119 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   22   43:checkcast       #121 <Class IMediaControllerCallback>
	//   23   46:astore_3        
					try
					{
						imediacontrollercallback.onRepeatModeChanged(i);
	//   24   47:aload_3         
	//   25   48:iload_1         
	//   26   49:invokeinterface #251 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
					}
	//*  27   54:goto            58
					catch(RemoteException remoteexception) { }
	//   28   57:astore_3        
				}

	//   29   58:iload_2         
	//   30   59:iconst_1        
	//   31   60:isub            
	//   32   61:istore_2        
	//*  33   62:goto            31
				mExtraControllerCallbacks.finishBroadcast();
	//   34   65:aload_0         
	//   35   66:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   36   69:invokevirtual   #127 <Method void RemoteCallbackList.finishBroadcast()>
				return;
	//   37   72:return          
			}
		} else
		{
			MediaSessionCompatApi26.setRepeatMode(mSessionObj, i);
	//   38   73:aload_0         
	//   39   74:getfield        #52  <Field Object mSessionObj>
	//   40   77:iload_1         
	//   41   78:invokestatic    #255 <Method void MediaSessionCompatApi26.setRepeatMode(Object, int)>
		}
	//   42   81:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		MediaSessionCompatApi21.setSessionActivity(mSessionObj, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object mSessionObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #258 <Method void MediaSessionCompatApi21.setSessionActivity(Object, PendingIntent)>
	//    4    8:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          73
		{
			if(mShuffleModeEnabled != flag)
	//*   3    8:aload_0         
	//*   4    9:getfield        #261 <Field boolean mShuffleModeEnabled>
	//*   5   12:iload_1         
	//*   6   13:icmpeq          81
			{
				mShuffleModeEnabled = flag;
	//    7   16:aload_0         
	//    8   17:iload_1         
	//    9   18:putfield        #261 <Field boolean mShuffleModeEnabled>
				for(int i = mExtraControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*  10   21:aload_0         
	//*  11   22:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//*  12   25:invokevirtual   #115 <Method int RemoteCallbackList.beginBroadcast()>
	//*  13   28:iconst_1        
	//*  14   29:isub            
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:iflt            65
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
	//   18   35:aload_0         
	//   19   36:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   20   39:iload_2         
	//   21   40:invokevirtual   #119 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   22   43:checkcast       #121 <Class IMediaControllerCallback>
	//   23   46:astore_3        
					try
					{
						imediacontrollercallback.onShuffleModeChanged(flag);
	//   24   47:aload_3         
	//   25   48:iload_1         
	//   26   49:invokeinterface #264 <Method void IMediaControllerCallback.onShuffleModeChanged(boolean)>
					}
	//*  27   54:goto            58
					catch(RemoteException remoteexception) { }
	//   28   57:astore_3        
				}

	//   29   58:iload_2         
	//   30   59:iconst_1        
	//   31   60:isub            
	//   32   61:istore_2        
	//*  33   62:goto            31
				mExtraControllerCallbacks.finishBroadcast();
	//   34   65:aload_0         
	//   35   66:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//   36   69:invokevirtual   #127 <Method void RemoteCallbackList.finishBroadcast()>
				return;
	//   37   72:return          
			}
		} else
		{
			MediaSessionCompatApi26.setShuffleModeEnabled(mSessionObj, flag);
	//   38   73:aload_0         
	//   39   74:getfield        #52  <Field Object mSessionObj>
	//   40   77:iload_1         
	//   41   78:invokestatic    #266 <Method void MediaSessionCompatApi26.setShuffleModeEnabled(Object, boolean)>
		}
	//   42   81:return          
	}

	private boolean mDestroyed;
	private final RemoteCallbackList mExtraControllerCallbacks;
	private ExtraSession mExtraSessionBinder;
	private PlaybackStateCompat mPlaybackState;
	int mRatingType;
	int mRepeatMode;
	private final Object mSessionObj;
	boolean mShuffleModeEnabled;
	private final MediaSessionCompat.Token mToken;


/*
	static boolean access$200(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mDestroyed>
	//    2    4:ireturn         
	}

*/


/*
	static RemoteCallbackList access$300(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mExtraControllerCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static PlaybackStateCompat access$400(MediaSessionCompat$MediaSessionImplApi21 mediasessioncompat$mediasessionimplapi21)
	{
		return mediasessioncompat$mediasessionimplapi21.mPlaybackState;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field PlaybackStateCompat mPlaybackState>
	//    2    4:areturn         
	}

*/

	public MediaSessionCompat$MediaSessionImplApi21(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mDestroyed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean mDestroyed>
		mExtraControllerCallbacks = new RemoteCallbackList();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class RemoteCallbackList>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void RemoteCallbackList()>
	//    9   17:putfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
		mSessionObj = MediaSessionCompatApi21.createSession(context, s);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #50  <Method Object MediaSessionCompatApi21.createSession(Context, String)>
	//   14   26:putfield        #52  <Field Object mSessionObj>
		mToken = new MediaSessionCompat.Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))));
	//   15   29:aload_0         
	//   16   30:new             #54  <Class MediaSessionCompat$Token>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #52  <Field Object mSessionObj>
	//   20   38:invokestatic    #58  <Method android.os.Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
	//   21   41:invokespecial   #61  <Method void MediaSessionCompat$Token(Object)>
	//   22   44:putfield        #63  <Field MediaSessionCompat$Token mToken>
	//   23   47:return          
	}

	public MediaSessionCompat$MediaSessionImplApi21(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		mDestroyed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean mDestroyed>
		mExtraControllerCallbacks = new RemoteCallbackList();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class RemoteCallbackList>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void RemoteCallbackList()>
	//    9   17:putfield        #44  <Field RemoteCallbackList mExtraControllerCallbacks>
		mSessionObj = MediaSessionCompatApi21.verifySession(obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #68  <Method Object MediaSessionCompatApi21.verifySession(Object)>
	//   13   25:putfield        #52  <Field Object mSessionObj>
		mToken = new MediaSessionCompat.Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))));
	//   14   28:aload_0         
	//   15   29:new             #54  <Class MediaSessionCompat$Token>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #52  <Field Object mSessionObj>
	//   19   37:invokestatic    #58  <Method android.os.Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
	//   20   40:invokespecial   #61  <Method void MediaSessionCompat$Token(Object)>
	//   21   43:putfield        #63  <Field MediaSessionCompat$Token mToken>
	//   22   46:return          
	}
}

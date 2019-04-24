// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, PlaybackStateCompat, ParcelableVolumeInfo, IMediaControllerCallback

class MediaSessionCompat$MediaSessionImplApi21$ExtraSession extends IMediaSession.Stub
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
		return MediaSessionCompat.access$500(MediaSessionCompat.MediaSessionImplApi21.access$800(MediaSessionCompat.MediaSessionImplApi21.this), MediaSessionCompat.MediaSessionImplApi21.access$900(MediaSessionCompat.MediaSessionImplApi21.this));
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

	public boolean isShuffleModeEnabledDeprecated()
	{
		return mShuffleModeEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
	//    2    4:getfield        #90  <Field boolean MediaSessionCompat$MediaSessionImplApi21.mShuffleModeEnabled>
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
		if(!MediaSessionCompat.MediaSessionImplApi21.access$600(MediaSessionCompat.MediaSessionImplApi21.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
	//*   2    4:invokestatic    #114 <Method boolean MediaSessionCompat$MediaSessionImplApi21.access$600(MediaSessionCompat$MediaSessionImplApi21)>
	//*   3    7:ifne            22
			MediaSessionCompat.MediaSessionImplApi21.access$700(MediaSessionCompat.MediaSessionImplApi21.this).register(((android.os.IInterface) (imediacontrollercallback)));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
	//    6   14:invokestatic    #118 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #124 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
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

	public void setShuffleModeEnabledDeprecated(boolean flag)
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
		MediaSessionCompat.MediaSessionImplApi21.access$700(MediaSessionCompat.MediaSessionImplApi21.this).unregister(((android.os.IInterface) (imediacontrollercallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
	//    2    4:invokestatic    #118 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #147 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
	//    5   11:pop             
	//    6   12:return          
	}

	final MediaSessionCompat.MediaSessionImplApi21 this$0;

	MediaSessionCompat$MediaSessionImplApi21$ExtraSession()
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

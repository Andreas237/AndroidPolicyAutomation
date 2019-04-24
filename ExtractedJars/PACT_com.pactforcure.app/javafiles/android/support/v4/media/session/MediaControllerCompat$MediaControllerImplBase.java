// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, IMediaSession, ParcelableVolumeInfo, IMediaControllerCallback, 
//			PlaybackStateCompat

static class MediaControllerCompat$MediaControllerImplBase
	implements MediaControllerCompat.MediaControllerImpl
{

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #40  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #34  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #47  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            39
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #49  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  13   28:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in addQueueItem.", ((Throwable) (mediadescriptioncompat)));
	//   14   29:ldc1            #56  <String "MediaControllerCompat">
	//   15   31:ldc1            #58  <String "Dead object in addQueueItem.">
	//   16   33:aload_1         
	//   17   34:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
		mBinder.addQueueItem(mediadescriptioncompat);
	//   20   39:aload_0         
	//   21   40:getfield        #34  <Field IMediaSession mBinder>
	//   22   43:aload_1         
	//   23   44:invokeinterface #66  <Method void IMediaSession.addQueueItem(MediaDescriptionCompat)>
		return;
	//   24   49:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #40  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #34  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #47  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            39
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #49  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  13   28:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", ((Throwable) (mediadescriptioncompat)));
	//   14   29:ldc1            #56  <String "MediaControllerCompat">
	//   15   31:ldc1            #69  <String "Dead object in addQueueItemAt.">
	//   16   33:aload_1         
	//   17   34:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
		mBinder.addQueueItemAt(mediadescriptioncompat, i);
	//   20   39:aload_0         
	//   21   40:getfield        #34  <Field IMediaSession mBinder>
	//   22   43:aload_1         
	//   23   44:iload_2         
	//   24   45:invokeinterface #72  <Method void IMediaSession.addQueueItemAt(MediaDescriptionCompat, int)>
		return;
	//   25   50:return          
	}

	public void adjustVolume(int i, int j)
	{
		try
		{
			mBinder.adjustVolume(i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #77  <Method void IMediaSession.adjustVolume(int, int, String)>
			return;
	//    6   12:return          
		}
		catch(RemoteException remoteexception)
	//*   7   13:astore_3        
		{
			Log.e("MediaControllerCompat", "Dead object in adjustVolume.", ((Throwable) (remoteexception)));
	//    8   14:ldc1            #56  <String "MediaControllerCompat">
	//    9   16:ldc1            #79  <String "Dead object in adjustVolume.">
	//   10   18:aload_3         
	//   11   19:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   12   22:pop             
		}
	//   13   23:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("event may not be null.");
	//    2    4:new             #83  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #85  <String "event may not be null.">
	//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.sendMediaButton(keyevent);
	//    7   14:aload_0         
	//    8   15:getfield        #34  <Field IMediaSession mBinder>
	//    9   18:aload_1         
	//   10   19:invokeinterface #89  <Method boolean IMediaSession.sendMediaButton(KeyEvent)>
	//   11   24:pop             
		}
	//*  12   25:iconst_0        
	//*  13   26:ireturn         
		// Misplaced declaration of an exception variable
		catch(KeyEvent keyevent)
	//*  14   27:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", ((Throwable) (keyevent)));
	//   15   28:ldc1            #56  <String "MediaControllerCompat">
	//   16   30:ldc1            #91  <String "Dead object in dispatchMediaButtonEvent.">
	//   17   32:aload_1         
	//   18   33:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   19   36:pop             
		}
		return false;
	//*  20   37:goto            25
	}

	public Bundle getExtras()
	{
		Bundle bundle;
		try
		{
			bundle = mBinder.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #95  <Method Bundle IMediaSession.getExtras()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getExtras.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #97  <String "Dead object in getExtras.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return bundle;
	}

	public long getFlags()
	{
		long l;
		try
		{
			l = mBinder.getFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #47  <Method long IMediaSession.getFlags()>
	//    3    9:lstore_1        
		}
	//*   4   10:lload_1         
	//*   5   11:lreturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_3        
		{
			Log.e("MediaControllerCompat", "Dead object in getFlags.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #99  <String "Dead object in getFlags.">
	//    9   17:aload_3         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return 0L;
	//   12   22:lconst_0        
	//   13   23:lreturn         
		}
		return l;
	}

	public Object getMediaController()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public MediaMetadataCompat getMetadata()
	{
		MediaMetadataCompat mediametadatacompat;
		try
		{
			mediametadatacompat = mBinder.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #104 <Method MediaMetadataCompat IMediaSession.getMetadata()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getMetadata.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #106 <String "Dead object in getMetadata.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return mediametadatacompat;
	}

	public String getPackageName()
	{
		String s;
		try
		{
			s = mBinder.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #110 <Method String IMediaSession.getPackageName()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getPackageName.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #112 <String "Dead object in getPackageName.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return s;
	}

	public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
	{
		Object obj;
		try
		{
			obj = ((Object) (mBinder.getVolumeAttributes()));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #118 <Method ParcelableVolumeInfo IMediaSession.getVolumeAttributes()>
	//    3    9:astore_1        
			obj = ((Object) (new MediaControllerCompat.PlaybackInfo(((ParcelableVolumeInfo) (obj)).volumeType, ((ParcelableVolumeInfo) (obj)).audioStream, ((ParcelableVolumeInfo) (obj)).controlType, ((ParcelableVolumeInfo) (obj)).maxVolume, ((ParcelableVolumeInfo) (obj)).currentVolume)));
	//    4   10:new             #120 <Class MediaControllerCompat$PlaybackInfo>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:getfield        #126 <Field int ParcelableVolumeInfo.volumeType>
	//    8   18:aload_1         
	//    9   19:getfield        #129 <Field int ParcelableVolumeInfo.audioStream>
	//   10   22:aload_1         
	//   11   23:getfield        #132 <Field int ParcelableVolumeInfo.controlType>
	//   12   26:aload_1         
	//   13   27:getfield        #135 <Field int ParcelableVolumeInfo.maxVolume>
	//   14   30:aload_1         
	//   15   31:getfield        #138 <Field int ParcelableVolumeInfo.currentVolume>
	//   16   34:invokespecial   #141 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   17   37:astore_1        
		}
	//*  18   38:aload_1         
	//*  19   39:areturn         
		catch(RemoteException remoteexception)
	//*  20   40:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", ((Throwable) (remoteexception)));
	//   21   41:ldc1            #56  <String "MediaControllerCompat">
	//   22   43:ldc1            #143 <String "Dead object in getPlaybackInfo.">
	//   23   45:aload_1         
	//   24   46:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   25   49:pop             
			return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
		}
		return ((MediaControllerCompat.PlaybackInfo) (obj));
	}

	public PlaybackStateCompat getPlaybackState()
	{
		PlaybackStateCompat playbackstatecompat;
		try
		{
			playbackstatecompat = mBinder.getPlaybackState();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #147 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #149 <String "Dead object in getPlaybackState.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return playbackstatecompat;
	}

	public List getQueue()
	{
		List list;
		try
		{
			list = mBinder.getQueue();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #153 <Method List IMediaSession.getQueue()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getQueue.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #155 <String "Dead object in getQueue.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return list;
	}

	public CharSequence getQueueTitle()
	{
		CharSequence charsequence;
		try
		{
			charsequence = mBinder.getQueueTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #161 <Method CharSequence IMediaSession.getQueueTitle()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #163 <String "Dead object in getQueueTitle.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return charsequence;
	}

	public int getRatingType()
	{
		int i;
		try
		{
			i = mBinder.getRatingType();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #167 <Method int IMediaSession.getRatingType()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in getRatingType.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #169 <String "Dead object in getRatingType.">
	//    9   17:aload_2         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return i;
	}

	public int getRepeatMode()
	{
		int i;
		try
		{
			i = mBinder.getRepeatMode();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #172 <Method int IMediaSession.getRepeatMode()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #174 <String "Dead object in getRepeatMode.">
	//    9   17:aload_2         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return i;
	}

	public PendingIntent getSessionActivity()
	{
		PendingIntent pendingintent;
		try
		{
			pendingintent = mBinder.getLaunchPendingIntent();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #179 <Method PendingIntent IMediaSession.getLaunchPendingIntent()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #181 <String "Dead object in getSessionActivity.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		return pendingintent;
	}

	public int getShuffleMode()
	{
		int i;
		try
		{
			i = mBinder.getShuffleMode();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #184 <Method int IMediaSession.getShuffleMode()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #186 <String "Dead object in getShuffleMode.">
	//    9   17:aload_2         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return i;
	}

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		if(mTransportControls == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
	//*   2    4:ifnonnull       22
			mTransportControls = ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsBase(mBinder)));
	//    3    7:aload_0         
	//    4    8:new             #192 <Class MediaControllerCompat$TransportControlsBase>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field IMediaSession mBinder>
	//    8   16:invokespecial   #195 <Method void MediaControllerCompat$TransportControlsBase(IMediaSession)>
	//    9   19:putfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
		return mTransportControls;
	//   10   22:aload_0         
	//   11   23:getfield        #190 <Field MediaControllerCompat$TransportControls mTransportControls>
	//   12   26:areturn         
	}

	public boolean isCaptioningEnabled()
	{
		boolean flag;
		try
		{
			flag = mBinder.isCaptioningEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #199 <Method boolean IMediaSession.isCaptioningEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #201 <String "Dead object in isCaptioningEnabled.">
	//    9   17:aload_2         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return flag;
	}

	public boolean isShuffleModeEnabled()
	{
		boolean flag;
		try
		{
			flag = mBinder.isShuffleModeEnabledDeprecated();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #205 <Method boolean IMediaSession.isShuffleModeEnabledDeprecated()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in isShuffleModeEnabled.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "MediaControllerCompat">
	//    8   15:ldc1            #207 <String "Dead object in isShuffleModeEnabled.">
	//    9   17:aload_2         
	//   10   18:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return flag;
	}

	public void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("callback may not be null.");
	//    2    4:new             #83  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #211 <String "callback may not be null.">
	//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
	//    7   14:aload_0         
	//    8   15:getfield        #34  <Field IMediaSession mBinder>
	//    9   18:invokeinterface #215 <Method IBinder IMediaSession.asBinder()>
	//   10   23:aload_1         
	//   11   24:iconst_0        
	//   12   25:invokeinterface #219 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			mBinder.registerCallbackListener((IMediaControllerCallback)MediaControllerCompat.Callback.access$000(callback));
	//   13   30:aload_0         
	//   14   31:getfield        #34  <Field IMediaSession mBinder>
	//   15   34:aload_1         
	//   16   35:invokestatic    #225 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
	//   17   38:checkcast       #227 <Class IMediaControllerCallback>
	//   18   41:invokeinterface #231 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			return;
	//   19   46:return          
		}
		// Misplaced declaration of an exception variable
		catch(Handler handler)
	//*  20   47:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in registerCallback.", ((Throwable) (handler)));
	//   21   48:ldc1            #56  <String "MediaControllerCompat">
	//   22   50:ldc1            #233 <String "Dead object in registerCallback.">
	//   23   52:aload_2         
	//   24   53:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   25   56:pop             
		}
		callback.onSessionDestroyed();
	//   26   57:aload_1         
	//   27   58:invokevirtual   #236 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
	//   28   61:return          
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #40  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #34  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #47  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            39
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #49  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #51  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #54  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  13   28:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", ((Throwable) (mediadescriptioncompat)));
	//   14   29:ldc1            #56  <String "MediaControllerCompat">
	//   15   31:ldc1            #239 <String "Dead object in removeQueueItem.">
	//   16   33:aload_1         
	//   17   34:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
		mBinder.removeQueueItem(mediadescriptioncompat);
	//   20   39:aload_0         
	//   21   40:getfield        #34  <Field IMediaSession mBinder>
	//   22   43:aload_1         
	//   23   44:invokeinterface #241 <Method void IMediaSession.removeQueueItem(MediaDescriptionCompat)>
		return;
	//   24   49:return          
	}

	public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		try
		{
			mBinder.sendCommand(s, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultreceiver));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #245 <Class MediaSessionCompat$ResultReceiverWrapper>
	//    5    9:dup             
	//    6   10:aload_3         
	//    7   11:invokespecial   #248 <Method void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver)>
	//    8   14:invokeinterface #251 <Method void IMediaSession.sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
			return;
	//    9   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   20:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in sendCommand.", ((Throwable) (s)));
	//   11   21:ldc1            #56  <String "MediaControllerCompat">
	//   12   23:ldc1            #253 <String "Dead object in sendCommand.">
	//   13   25:aload_1         
	//   14   26:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   15   29:pop             
		}
	//   16   30:return          
	}

	public void setVolumeTo(int i, int j)
	{
		try
		{
			mBinder.setVolumeTo(i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #256 <Method void IMediaSession.setVolumeTo(int, int, String)>
			return;
	//    6   12:return          
		}
		catch(RemoteException remoteexception)
	//*   7   13:astore_3        
		{
			Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", ((Throwable) (remoteexception)));
	//    8   14:ldc1            #56  <String "MediaControllerCompat">
	//    9   16:ldc2            #258 <String "Dead object in setVolumeTo.">
	//   10   19:aload_3         
	//   11   20:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   12   23:pop             
		}
	//   13   24:return          
	}

	public void unregisterCallback(MediaControllerCompat.Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("callback may not be null.");
	//    2    4:new             #83  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #211 <String "callback may not be null.">
	//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.unregisterCallbackListener((IMediaControllerCallback)MediaControllerCompat.Callback.access$000(callback));
	//    7   14:aload_0         
	//    8   15:getfield        #34  <Field IMediaSession mBinder>
	//    9   18:aload_1         
	//   10   19:invokestatic    #225 <Method Object MediaControllerCompat$Callback.access$000(MediaControllerCompat$Callback)>
	//   11   22:checkcast       #227 <Class IMediaControllerCallback>
	//   12   25:invokeinterface #263 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
			mBinder.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
	//   13   30:aload_0         
	//   14   31:getfield        #34  <Field IMediaSession mBinder>
	//   15   34:invokeinterface #215 <Method IBinder IMediaSession.asBinder()>
	//   16   39:aload_1         
	//   17   40:iconst_0        
	//   18   41:invokeinterface #267 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   19   46:pop             
			return;
	//   20   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediaControllerCompat.Callback callback)
	//*  21   48:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", ((Throwable) (callback)));
	//   22   49:ldc1            #56  <String "MediaControllerCompat">
	//   23   51:ldc2            #269 <String "Dead object in unregisterCallback.">
	//   24   54:aload_1         
	//   25   55:invokestatic    #64  <Method int Log.e(String, String, Throwable)>
	//   26   58:pop             
		}
	//   27   59:return          
	}

	private IMediaSession mBinder;
	private MediaControllerCompat.TransportControls mTransportControls;

	public MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat.Token token)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mBinder = IMediaSession.Stub.asInterface((IBinder)token.getToken());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method Object MediaSessionCompat$Token.getToken()>
	//    5    9:checkcast       #26  <Class IBinder>
	//    6   12:invokestatic    #32  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
	//    7   15:putfield        #34  <Field IMediaSession mBinder>
	//    8   18:return          
	}
}

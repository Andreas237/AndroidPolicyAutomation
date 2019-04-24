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
	//*   0    0:ldc2w           #44  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            28
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #53  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
			} else
			{
				mBinder.addQueueItem(mediadescriptioncompat);
	//   13   28:aload_0         
	//   14   29:getfield        #38  <Field IMediaSession mBinder>
	//   15   32:aload_1         
	//   16   33:invokeinterface #60  <Method void IMediaSession.addQueueItem(MediaDescriptionCompat)>
				return;
	//   17   38:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  18   39:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in addQueueItem. ").append(((Object) (mediadescriptioncompat))).toString());
	//   19   40:ldc1            #62  <String "MediaControllerCompat">
	//   20   42:new             #64  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #65  <Method void StringBuilder()>
	//   23   49:ldc1            #67  <String "Dead object in addQueueItem. ">
	//   24   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_1         
	//   26   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   27   58:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   28   61:invokestatic    #84  <Method int Log.e(String, String)>
	//   29   64:pop             
		}
	//   30   65:return          
	}

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #44  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            28
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #53  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
			} else
			{
				mBinder.addQueueItemAt(mediadescriptioncompat, i);
	//   13   28:aload_0         
	//   14   29:getfield        #38  <Field IMediaSession mBinder>
	//   15   32:aload_1         
	//   16   33:iload_2         
	//   17   34:invokeinterface #88  <Method void IMediaSession.addQueueItemAt(MediaDescriptionCompat, int)>
				return;
	//   18   39:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  19   40:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in addQueueItemAt. ").append(((Object) (mediadescriptioncompat))).toString());
	//   20   41:ldc1            #62  <String "MediaControllerCompat">
	//   21   43:new             #64  <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #65  <Method void StringBuilder()>
	//   24   50:ldc1            #90  <String "Dead object in addQueueItemAt. ">
	//   25   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_1         
	//   27   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   28   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #84  <Method int Log.e(String, String)>
	//   30   65:pop             
		}
	//   31   66:return          
	}

	public void adjustVolume(int i, int j)
	{
		try
		{
			mBinder.adjustVolume(i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #95  <Method void IMediaSession.adjustVolume(int, int, String)>
			return;
	//    6   12:return          
		}
		catch(RemoteException remoteexception)
	//*   7   13:astore_3        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in adjustVolume. ").append(((Object) (remoteexception))).toString());
	//    8   14:ldc1            #62  <String "MediaControllerCompat">
	//    9   16:new             #64  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #65  <Method void StringBuilder()>
	//   12   23:ldc1            #97  <String "Dead object in adjustVolume. ">
	//   13   25:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_3         
	//   15   29:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   17   35:invokestatic    #84  <Method int Log.e(String, String)>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
	{
		if(keyevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("event may not be null.");
	//    2    4:new             #101 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #103 <String "event may not be null.">
	//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.sendMediaButton(keyevent);
	//    7   14:aload_0         
	//    8   15:getfield        #38  <Field IMediaSession mBinder>
	//    9   18:aload_1         
	//   10   19:invokeinterface #107 <Method boolean IMediaSession.sendMediaButton(KeyEvent)>
	//   11   24:pop             
		}
	//*  12   25:goto            54
		// Misplaced declaration of an exception variable
		catch(KeyEvent keyevent)
	//*  13   28:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in dispatchMediaButtonEvent. ").append(((Object) (keyevent))).toString());
	//   14   29:ldc1            #62  <String "MediaControllerCompat">
	//   15   31:new             #64  <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #65  <Method void StringBuilder()>
	//   18   38:ldc1            #109 <String "Dead object in dispatchMediaButtonEvent. ">
	//   19   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   22   47:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   23   50:invokestatic    #84  <Method int Log.e(String, String)>
	//   24   53:pop             
		}
		return false;
	//   25   54:iconst_0        
	//   26   55:ireturn         
	}

	public Bundle getExtras()
	{
		Bundle bundle;
		try
		{
			bundle = mBinder.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #113 <Method Bundle IMediaSession.getExtras()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getExtras. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #115 <String "Dead object in getExtras. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #51  <Method long IMediaSession.getFlags()>
	//    3    9:lstore_1        
		}
	//*   4   10:lload_1         
	//*   5   11:lreturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_3        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getFlags. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #117 <String "Dead object in getFlags. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_3         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return 0L;
	//   18   38:lconst_0        
	//   19   39:lreturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #122 <Method MediaMetadataCompat IMediaSession.getMetadata()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getMetadata. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #124 <String "Dead object in getMetadata. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #127 <Method String IMediaSession.getPackageName()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPackageName. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #129 <String "Dead object in getPackageName. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #135 <Method ParcelableVolumeInfo IMediaSession.getVolumeAttributes()>
	//    3    9:astore_1        
			obj = ((Object) (new MediaControllerCompat.PlaybackInfo(((ParcelableVolumeInfo) (obj)).volumeType, ((ParcelableVolumeInfo) (obj)).audioStream, ((ParcelableVolumeInfo) (obj)).controlType, ((ParcelableVolumeInfo) (obj)).maxVolume, ((ParcelableVolumeInfo) (obj)).currentVolume)));
	//    4   10:new             #137 <Class MediaControllerCompat$PlaybackInfo>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:getfield        #143 <Field int ParcelableVolumeInfo.volumeType>
	//    8   18:aload_1         
	//    9   19:getfield        #146 <Field int ParcelableVolumeInfo.audioStream>
	//   10   22:aload_1         
	//   11   23:getfield        #149 <Field int ParcelableVolumeInfo.controlType>
	//   12   26:aload_1         
	//   13   27:getfield        #152 <Field int ParcelableVolumeInfo.maxVolume>
	//   14   30:aload_1         
	//   15   31:getfield        #155 <Field int ParcelableVolumeInfo.currentVolume>
	//   16   34:invokespecial   #158 <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   17   37:astore_1        
		}
	//*  18   38:aload_1         
	//*  19   39:areturn         
		catch(RemoteException remoteexception)
	//*  20   40:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackInfo. ").append(((Object) (remoteexception))).toString());
	//   21   41:ldc1            #62  <String "MediaControllerCompat">
	//   22   43:new             #64  <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #65  <Method void StringBuilder()>
	//   25   50:ldc1            #160 <String "Dead object in getPlaybackInfo. ">
	//   26   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   29   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #84  <Method int Log.e(String, String)>
	//   31   65:pop             
			return null;
	//   32   66:aconst_null     
	//   33   67:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #164 <Method PlaybackStateCompat IMediaSession.getPlaybackState()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackState. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #166 <String "Dead object in getPlaybackState. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #170 <Method List IMediaSession.getQueue()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueue. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #172 <String "Dead object in getQueue. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #178 <Method CharSequence IMediaSession.getQueueTitle()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueueTitle. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #180 <String "Dead object in getQueueTitle. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #184 <Method int IMediaSession.getRatingType()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRatingType. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #186 <String "Dead object in getRatingType. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return 0;
	//   18   38:iconst_0        
	//   19   39:ireturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #189 <Method int IMediaSession.getRepeatMode()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRepeatMode. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #191 <String "Dead object in getRepeatMode. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return 0;
	//   18   38:iconst_0        
	//   19   39:ireturn         
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
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #196 <Method PendingIntent IMediaSession.getLaunchPendingIntent()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getSessionActivity. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #198 <String "Dead object in getSessionActivity. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
		}
		return pendingintent;
	}

	public MediaControllerCompat.TransportControls getTransportControls()
	{
		if(mTransportControls == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
	//*   2    4:ifnonnull       22
			mTransportControls = ((MediaControllerCompat.TransportControls) (new MediaControllerCompat.TransportControlsBase(mBinder)));
	//    3    7:aload_0         
	//    4    8:new             #204 <Class MediaControllerCompat$TransportControlsBase>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field IMediaSession mBinder>
	//    8   16:invokespecial   #207 <Method void MediaControllerCompat$TransportControlsBase(IMediaSession)>
	//    9   19:putfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
		return mTransportControls;
	//   10   22:aload_0         
	//   11   23:getfield        #202 <Field MediaControllerCompat$TransportControls mTransportControls>
	//   12   26:areturn         
	}

	public boolean isShuffleModeEnabled()
	{
		boolean flag;
		try
		{
			flag = mBinder.isShuffleModeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #211 <Method boolean IMediaSession.isShuffleModeEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in isShuffleModeEnabled. ").append(((Object) (remoteexception))).toString());
	//    7   13:ldc1            #62  <String "MediaControllerCompat">
	//    8   15:new             #64  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #65  <Method void StringBuilder()>
	//   11   22:ldc1            #213 <String "Dead object in isShuffleModeEnabled. ">
	//   12   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #84  <Method int Log.e(String, String)>
	//   17   37:pop             
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		}
		return flag;
	}

	public void registerCallback(MediaControllerCompat.Callback callback, Handler handler)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("callback may not be null.");
	//    2    4:new             #101 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #217 <String "callback may not be null.">
	//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
	//    7   14:aload_0         
	//    8   15:getfield        #38  <Field IMediaSession mBinder>
	//    9   18:invokeinterface #221 <Method IBinder IMediaSession.asBinder()>
	//   10   23:aload_1         
	//   11   24:iconst_0        
	//   12   25:invokeinterface #225 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			mBinder.registerCallbackListener((IMediaControllerCallback)MediaControllerCompat.Callback.access$200(callback));
	//   13   30:aload_0         
	//   14   31:getfield        #38  <Field IMediaSession mBinder>
	//   15   34:aload_1         
	//   16   35:invokestatic    #231 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
	//   17   38:checkcast       #233 <Class IMediaControllerCallback>
	//   18   41:invokeinterface #237 <Method void IMediaSession.registerCallbackListener(IMediaControllerCallback)>
			MediaControllerCompat.Callback.access$300(callback, handler);
	//   19   46:aload_1         
	//   20   47:aload_2         
	//   21   48:invokestatic    #240 <Method void MediaControllerCompat$Callback.access$300(MediaControllerCompat$Callback, Handler)>
			callback.mRegistered = true;
	//   22   51:aload_1         
	//   23   52:iconst_1        
	//   24   53:putfield        #244 <Field boolean MediaControllerCompat$Callback.mRegistered>
			return;
	//   25   56:return          
		}
		// Misplaced declaration of an exception variable
		catch(Handler handler)
	//*  26   57:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in registerCallback. ").append(((Object) (handler))).toString());
	//   27   58:ldc1            #62  <String "MediaControllerCompat">
	//   28   60:new             #64  <Class StringBuilder>
	//   29   63:dup             
	//   30   64:invokespecial   #65  <Method void StringBuilder()>
	//   31   67:ldc1            #246 <String "Dead object in registerCallback. ">
	//   32   69:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   33   72:aload_2         
	//   34   73:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   35   76:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   36   79:invokestatic    #84  <Method int Log.e(String, String)>
	//   37   82:pop             
		}
		callback.onSessionDestroyed();
	//   38   83:aload_1         
	//   39   84:invokevirtual   #249 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
	//   40   87:return          
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #44  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            28
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #53  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
			} else
			{
				mBinder.removeQueueItem(mediadescriptioncompat);
	//   13   28:aload_0         
	//   14   29:getfield        #38  <Field IMediaSession mBinder>
	//   15   32:aload_1         
	//   16   33:invokeinterface #252 <Method void IMediaSession.removeQueueItem(MediaDescriptionCompat)>
				return;
	//   17   38:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(MediaDescriptionCompat mediadescriptioncompat)
	//*  18   39:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in removeQueueItem. ").append(((Object) (mediadescriptioncompat))).toString());
	//   19   40:ldc1            #62  <String "MediaControllerCompat">
	//   20   42:new             #64  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #65  <Method void StringBuilder()>
	//   23   49:ldc1            #254 <String "Dead object in removeQueueItem. ">
	//   24   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_1         
	//   26   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   27   58:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   28   61:invokestatic    #84  <Method int Log.e(String, String)>
	//   29   64:pop             
		}
	//   30   65:return          
	}

	public void removeQueueItemAt(int i)
	{
		try
		{
			if((4L & mBinder.getFlags()) == 0L)
	//*   0    0:ldc2w           #44  <Long 4L>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field IMediaSession mBinder>
	//*   3    7:invokeinterface #51  <Method long IMediaSession.getFlags()>
	//*   4   12:land            
	//*   5   13:lconst_0        
	//*   6   14:lcmp            
	//*   7   15:ifne            28
			{
				throw new UnsupportedOperationException("This session doesn't support queue management operations");
	//    8   18:new             #53  <Class UnsupportedOperationException>
	//    9   21:dup             
	//   10   22:ldc1            #55  <String "This session doesn't support queue management operations">
	//   11   24:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//   12   27:athrow          
			} else
			{
				mBinder.removeQueueItemAt(i);
	//   13   28:aload_0         
	//   14   29:getfield        #38  <Field IMediaSession mBinder>
	//   15   32:iload_1         
	//   16   33:invokeinterface #258 <Method void IMediaSession.removeQueueItemAt(int)>
				return;
	//   17   38:return          
			}
		}
		catch(RemoteException remoteexception)
	//*  18   39:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in removeQueueItemAt. ").append(((Object) (remoteexception))).toString());
	//   19   40:ldc1            #62  <String "MediaControllerCompat">
	//   20   42:new             #64  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #65  <Method void StringBuilder()>
	//   23   49:ldc2            #260 <String "Dead object in removeQueueItemAt. ">
	//   24   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_2         
	//   26   56:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   28   62:invokestatic    #84  <Method int Log.e(String, String)>
	//   29   65:pop             
		}
	//   30   66:return          
	}

	public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		try
		{
			mBinder.sendCommand(s, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultreceiver));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #264 <Class MediaSessionCompat$ResultReceiverWrapper>
	//    5    9:dup             
	//    6   10:aload_3         
	//    7   11:invokespecial   #267 <Method void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver)>
	//    8   14:invokeinterface #270 <Method void IMediaSession.sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
			return;
	//    9   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   20:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCommand. ").append(((Object) (s))).toString());
	//   11   21:ldc1            #62  <String "MediaControllerCompat">
	//   12   23:new             #64  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #65  <Method void StringBuilder()>
	//   15   30:ldc2            #272 <String "Dead object in sendCommand. ">
	//   16   33:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   19   40:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   20   43:invokestatic    #84  <Method int Log.e(String, String)>
	//   21   46:pop             
		}
	//   22   47:return          
	}

	public void setVolumeTo(int i, int j)
	{
		try
		{
			mBinder.setVolumeTo(i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokeinterface #275 <Method void IMediaSession.setVolumeTo(int, int, String)>
			return;
	//    6   12:return          
		}
		catch(RemoteException remoteexception)
	//*   7   13:astore_3        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setVolumeTo. ").append(((Object) (remoteexception))).toString());
	//    8   14:ldc1            #62  <String "MediaControllerCompat">
	//    9   16:new             #64  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #65  <Method void StringBuilder()>
	//   12   23:ldc2            #277 <String "Dead object in setVolumeTo. ">
	//   13   26:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_3         
	//   15   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   17   36:invokestatic    #84  <Method int Log.e(String, String)>
	//   18   39:pop             
		}
	//   19   40:return          
	}

	public void unregisterCallback(MediaControllerCompat.Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("callback may not be null.");
	//    2    4:new             #101 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #217 <String "callback may not be null.">
	//    5   10:invokespecial   #104 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		try
		{
			mBinder.unregisterCallbackListener((IMediaControllerCallback)MediaControllerCompat.Callback.access$200(callback));
	//    7   14:aload_0         
	//    8   15:getfield        #38  <Field IMediaSession mBinder>
	//    9   18:aload_1         
	//   10   19:invokestatic    #231 <Method Object MediaControllerCompat$Callback.access$200(MediaControllerCompat$Callback)>
	//   11   22:checkcast       #233 <Class IMediaControllerCallback>
	//   12   25:invokeinterface #282 <Method void IMediaSession.unregisterCallbackListener(IMediaControllerCallback)>
			mBinder.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (callback)), 0);
	//   13   30:aload_0         
	//   14   31:getfield        #38  <Field IMediaSession mBinder>
	//   15   34:invokeinterface #221 <Method IBinder IMediaSession.asBinder()>
	//   16   39:aload_1         
	//   17   40:iconst_0        
	//   18   41:invokeinterface #286 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   19   46:pop             
			callback.mRegistered = false;
	//   20   47:aload_1         
	//   21   48:iconst_0        
	//   22   49:putfield        #244 <Field boolean MediaControllerCompat$Callback.mRegistered>
			return;
	//   23   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediaControllerCompat.Callback callback)
	//*  24   53:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in unregisterCallback. ").append(((Object) (callback))).toString());
	//   25   54:ldc1            #62  <String "MediaControllerCompat">
	//   26   56:new             #64  <Class StringBuilder>
	//   27   59:dup             
	//   28   60:invokespecial   #65  <Method void StringBuilder()>
	//   29   63:ldc2            #288 <String "Dead object in unregisterCallback. ">
	//   30   66:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   76:invokestatic    #84  <Method int Log.e(String, String)>
	//   35   79:pop             
		}
	//   36   80:return          
	}

	private IMediaSession mBinder;
	private MediaSessionCompat.Token mToken;
	private MediaControllerCompat.TransportControls mTransportControls;

	public MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat.Token token)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mToken = token;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field MediaSessionCompat$Token mToken>
		mBinder = IMediaSession.Stub.asInterface((IBinder)token.getToken());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method Object MediaSessionCompat$Token.getToken()>
	//    8   14:checkcast       #30  <Class IBinder>
	//    9   17:invokestatic    #36  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
	//   10   20:putfield        #38  <Field IMediaSession mBinder>
	//   11   23:return          
	}
}

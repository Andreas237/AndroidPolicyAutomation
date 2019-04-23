// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.RatingCompat;
import android.util.Log;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, IMediaSession

static class MediaControllerCompat$TransportControlsBase extends MediaControllerCompat.TransportControls
{

	public void fastForward()
	{
		try
		{
			mBinder.fastForward();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #24  <Method void IMediaSession.fastForward()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in fastForward.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #28  <String "Dead object in fastForward.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void pause()
	{
		try
		{
			mBinder.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #37  <Method void IMediaSession.pause()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in pause.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #39  <String "Dead object in pause.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void play()
	{
		try
		{
			mBinder.play();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #42  <Method void IMediaSession.play()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in play.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #44  <String "Dead object in play.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void playFromMediaId(String s, Bundle bundle)
	{
		try
		{
			mBinder.playFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #48  <Method void IMediaSession.playFromMediaId(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", ((Throwable) (s)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #50  <String "Dead object in playFromMediaId.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void playFromSearch(String s, Bundle bundle)
	{
		try
		{
			mBinder.playFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #53  <Method void IMediaSession.playFromSearch(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in playFromSearch.", ((Throwable) (s)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #55  <String "Dead object in playFromSearch.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void playFromUri(Uri uri, Bundle bundle)
	{
		try
		{
			mBinder.playFromUri(uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #59  <Method void IMediaSession.playFromUri(Uri, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in playFromUri.", ((Throwable) (uri)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #61  <String "Dead object in playFromUri.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void prepare()
	{
		try
		{
			mBinder.prepare();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #64  <Method void IMediaSession.prepare()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in prepare.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #66  <String "Dead object in prepare.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void prepareFromMediaId(String s, Bundle bundle)
	{
		try
		{
			mBinder.prepareFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #69  <Method void IMediaSession.prepareFromMediaId(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", ((Throwable) (s)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #71  <String "Dead object in prepareFromMediaId.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void prepareFromSearch(String s, Bundle bundle)
	{
		try
		{
			mBinder.prepareFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #74  <Method void IMediaSession.prepareFromSearch(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", ((Throwable) (s)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #76  <String "Dead object in prepareFromSearch.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void prepareFromUri(Uri uri, Bundle bundle)
	{
		try
		{
			mBinder.prepareFromUri(uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #79  <Method void IMediaSession.prepareFromUri(Uri, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", ((Throwable) (uri)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #81  <String "Dead object in prepareFromUri.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void rewind()
	{
		try
		{
			mBinder.rewind();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #84  <Method void IMediaSession.rewind()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in rewind.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #86  <String "Dead object in rewind.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void seekTo(long l)
	{
		try
		{
			mBinder.seekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:lload_1         
	//    3    5:invokeinterface #90  <Method void IMediaSession.seekTo(long)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_3        
		{
			Log.e("MediaControllerCompat", "Dead object in seekTo.", ((Throwable) (remoteexception)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #92  <String "Dead object in seekTo.">
	//    8   16:aload_3         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
	{
		sendCustomAction(customaction.getAction(), bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method String PlaybackStateCompat$CustomAction.getAction()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #102 <Method void sendCustomAction(String, Bundle)>
	//    5    9:return          
	}

	public void sendCustomAction(String s, Bundle bundle)
	{
		MediaControllerCompat.validateCustomAction(s, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #105 <Method void MediaControllerCompat.validateCustomAction(String, Bundle)>
		try
		{
			mBinder.sendCustomAction(s, bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field IMediaSession mBinder>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #106 <Method void IMediaSession.sendCustomAction(String, Bundle)>
			return;
	//    8   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   17:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", ((Throwable) (s)));
	//   10   18:ldc1            #26  <String "MediaControllerCompat">
	//   11   20:ldc1            #108 <String "Dead object in sendCustomAction.">
	//   12   22:aload_1         
	//   13   23:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   14   26:pop             
		}
	//   15   27:return          
	}

	public void setCaptioningEnabled(boolean flag)
	{
		try
		{
			mBinder.setCaptioningEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:invokeinterface #112 <Method void IMediaSession.setCaptioningEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", ((Throwable) (remoteexception)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #114 <String "Dead object in setCaptioningEnabled.">
	//    8   16:aload_2         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void setRating(RatingCompat ratingcompat)
	{
		try
		{
			mBinder.rate(ratingcompat);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:invokeinterface #119 <Method void IMediaSession.rate(RatingCompat)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(RatingCompat ratingcompat)
	//*   5   11:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in setRating.", ((Throwable) (ratingcompat)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #121 <String "Dead object in setRating.">
	//    8   16:aload_1         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void setRating(RatingCompat ratingcompat, Bundle bundle)
	{
		try
		{
			mBinder.rateWithExtras(ratingcompat, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #125 <Method void IMediaSession.rateWithExtras(RatingCompat, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(RatingCompat ratingcompat)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in setRating.", ((Throwable) (ratingcompat)));
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:ldc1            #121 <String "Dead object in setRating.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setRepeatMode(int i)
	{
		try
		{
			mBinder.setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:invokeinterface #129 <Method void IMediaSession.setRepeatMode(int)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", ((Throwable) (remoteexception)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #131 <String "Dead object in setRepeatMode.">
	//    8   16:aload_2         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void setShuffleMode(int i)
	{
		try
		{
			mBinder.setShuffleMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:invokeinterface #134 <Method void IMediaSession.setShuffleMode(int)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", ((Throwable) (remoteexception)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #136 <String "Dead object in setShuffleMode.">
	//    8   16:aload_2         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void skipToNext()
	{
		try
		{
			mBinder.next();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #140 <Method void IMediaSession.next()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in skipToNext.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #142 <String "Dead object in skipToNext.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void skipToPrevious()
	{
		try
		{
			mBinder.previous();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #146 <Method void IMediaSession.previous()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #148 <String "Dead object in skipToPrevious.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	public void skipToQueueItem(long l)
	{
		try
		{
			mBinder.skipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:lload_1         
	//    3    5:invokeinterface #151 <Method void IMediaSession.skipToQueueItem(long)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_3        
		{
			Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", ((Throwable) (remoteexception)));
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:ldc1            #153 <String "Dead object in skipToQueueItem.">
	//    8   16:aload_3         
	//    9   17:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public void stop()
	{
		try
		{
			mBinder.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #156 <Method void IMediaSession.stop()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", "Dead object in stop.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:ldc1            #158 <String "Dead object in stop.">
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method int Log.e(String, String, Throwable)>
	//    9   19:pop             
		}
	//   10   20:return          
	}

	private IMediaSession mBinder;

	public MediaControllerCompat$TransportControlsBase(IMediaSession imediasession)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MediaControllerCompat$TransportControls()>
		mBinder = imediasession;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field IMediaSession mBinder>
	//    5    9:return          
	}
}

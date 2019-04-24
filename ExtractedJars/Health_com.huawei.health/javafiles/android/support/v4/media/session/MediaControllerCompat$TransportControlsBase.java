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
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in fastForward. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #31  <String "Dead object in fastForward. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	public void pause()
	{
		try
		{
			mBinder.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #51  <Method void IMediaSession.pause()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in pause. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #53  <String "Dead object in pause. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	public void play()
	{
		try
		{
			mBinder.play();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #56  <Method void IMediaSession.play()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in play. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #58  <String "Dead object in play. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
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
	//    4    6:invokeinterface #62  <Method void IMediaSession.playFromMediaId(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromMediaId. ").append(((Object) (s))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #64  <String "Dead object in playFromMediaId. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
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
	//    4    6:invokeinterface #67  <Method void IMediaSession.playFromSearch(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromSearch. ").append(((Object) (s))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #69  <String "Dead object in playFromSearch. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
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
	//    4    6:invokeinterface #73  <Method void IMediaSession.playFromUri(Uri, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromUri. ").append(((Object) (uri))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #75  <String "Dead object in playFromUri. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	public void prepare()
	{
		try
		{
			mBinder.prepare();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #78  <Method void IMediaSession.prepare()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepare. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #80  <String "Dead object in prepare. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
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
	//    4    6:invokeinterface #83  <Method void IMediaSession.prepareFromMediaId(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromMediaId. ").append(((Object) (s))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #85  <String "Dead object in prepareFromMediaId. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
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
	//    4    6:invokeinterface #88  <Method void IMediaSession.prepareFromSearch(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromSearch. ").append(((Object) (s))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #90  <String "Dead object in prepareFromSearch. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
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
	//    4    6:invokeinterface #93  <Method void IMediaSession.prepareFromUri(Uri, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in prepareFromUri. ").append(((Object) (uri))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #95  <String "Dead object in prepareFromUri. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	public void rewind()
	{
		try
		{
			mBinder.rewind();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #98  <Method void IMediaSession.rewind()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in rewind. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #100 <String "Dead object in rewind. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	public void seekTo(long l)
	{
		try
		{
			mBinder.seekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:lload_1         
	//    3    5:invokeinterface #104 <Method void IMediaSession.seekTo(long)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_3        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in seekTo. ").append(((Object) (remoteexception))).toString());
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:new             #28  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #29  <Method void StringBuilder()>
	//   10   21:ldc1            #106 <String "Dead object in seekTo. ">
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_3         
	//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
	//   16   36:pop             
		}
	//   17   37:return          
	}

	public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
	{
		sendCustomAction(customaction.getAction(), bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method String PlaybackStateCompat$CustomAction.getAction()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #115 <Method void sendCustomAction(String, Bundle)>
	//    5    9:return          
	}

	public void sendCustomAction(String s, Bundle bundle)
	{
		try
		{
			mBinder.sendCustomAction(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #116 <Method void IMediaSession.sendCustomAction(String, Bundle)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   12:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCustomAction. ").append(((Object) (s))).toString());
	//    7   13:ldc1            #26  <String "MediaControllerCompat">
	//    8   15:new             #28  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void StringBuilder()>
	//   11   22:ldc1            #118 <String "Dead object in sendCustomAction. ">
	//   12   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   16   34:invokestatic    #48  <Method int Log.e(String, String)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	public void setRating(RatingCompat ratingcompat)
	{
		try
		{
			mBinder.rate(ratingcompat);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method void IMediaSession.rate(RatingCompat)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(RatingCompat ratingcompat)
	//*   5   11:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setRating. ").append(((Object) (ratingcompat))).toString());
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:new             #28  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #29  <Method void StringBuilder()>
	//   10   21:ldc1            #125 <String "Dead object in setRating. ">
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
	//   16   36:pop             
		}
	//   17   37:return          
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
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setRepeatMode. ").append(((Object) (remoteexception))).toString());
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:new             #28  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #29  <Method void StringBuilder()>
	//   10   21:ldc1            #131 <String "Dead object in setRepeatMode. ">
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
	//   16   36:pop             
		}
	//   17   37:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		try
		{
			mBinder.setShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:iload_1         
	//    3    5:invokeinterface #135 <Method void IMediaSession.setShuffleModeEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setShuffleModeEnabled. ").append(((Object) (remoteexception))).toString());
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:new             #28  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #29  <Method void StringBuilder()>
	//   10   21:ldc1            #137 <String "Dead object in setShuffleModeEnabled. ">
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
	//   16   36:pop             
		}
	//   17   37:return          
	}

	public void skipToNext()
	{
		try
		{
			mBinder.next();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #141 <Method void IMediaSession.next()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToNext. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #143 <String "Dead object in skipToNext. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	public void skipToPrevious()
	{
		try
		{
			mBinder.previous();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #147 <Method void IMediaSession.previous()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToPrevious. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #149 <String "Dead object in skipToPrevious. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	public void skipToQueueItem(long l)
	{
		try
		{
			mBinder.skipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:lload_1         
	//    3    5:invokeinterface #152 <Method void IMediaSession.skipToQueueItem(long)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_3        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToQueueItem. ").append(((Object) (remoteexception))).toString());
	//    6   12:ldc1            #26  <String "MediaControllerCompat">
	//    7   14:new             #28  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #29  <Method void StringBuilder()>
	//   10   21:ldc1            #154 <String "Dead object in skipToQueueItem. ">
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_3         
	//   13   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   30:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #48  <Method int Log.e(String, String)>
	//   16   36:pop             
		}
	//   17   37:return          
	}

	public void stop()
	{
		try
		{
			mBinder.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field IMediaSession mBinder>
	//    2    4:invokeinterface #157 <Method void IMediaSession.stop()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in stop. ").append(((Object) (remoteexception))).toString());
	//    5   11:ldc1            #26  <String "MediaControllerCompat">
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:ldc1            #159 <String "Dead object in stop. ">
	//   10   22:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #48  <Method int Log.e(String, String)>
	//   15   35:pop             
		}
	//   16   36:return          
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

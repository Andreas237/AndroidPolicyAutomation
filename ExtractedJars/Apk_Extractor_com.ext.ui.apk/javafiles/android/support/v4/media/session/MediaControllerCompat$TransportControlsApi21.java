// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$TransportControlsApi21 extends MediaControllerCompat.TransportControls
{

	public void fastForward()
	{
		MediaControllerCompatApi21$TransportControls.fastForward(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #22  <Method void MediaControllerCompatApi21$TransportControls.fastForward(Object)>
	//    3    7:return          
	}

	public void pause()
	{
		MediaControllerCompatApi21$TransportControls.pause(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #25  <Method void MediaControllerCompatApi21$TransportControls.pause(Object)>
	//    3    7:return          
	}

	public void play()
	{
		MediaControllerCompatApi21$TransportControls.play(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #28  <Method void MediaControllerCompatApi21$TransportControls.play(Object)>
	//    3    7:return          
	}

	public void playFromMediaId(String s, Bundle bundle)
	{
		MediaControllerCompatApi21$TransportControls.playFromMediaId(mControlsObj, s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #33  <Method void MediaControllerCompatApi21$TransportControls.playFromMediaId(Object, String, Bundle)>
	//    5    9:return          
	}

	public void playFromSearch(String s, Bundle bundle)
	{
		MediaControllerCompatApi21$TransportControls.playFromSearch(mControlsObj, s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #36  <Method void MediaControllerCompatApi21$TransportControls.playFromSearch(Object, String, Bundle)>
	//    5    9:return          
	}

	public void playFromUri(Uri uri, Bundle bundle)
	{
		if(uri == null || Uri.EMPTY.equals(((Object) (uri))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
	//*   2    4:getstatic       #44  <Field Uri Uri.EMPTY>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #48  <Method boolean Uri.equals(Object)>
	//*   5   11:ifeq            24
		{
			throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
	//    6   14:new             #50  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #52  <String "You must specify a non-empty Uri for playFromUri.">
	//    9   20:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		} else
		{
			Bundle bundle1 = new Bundle();
	//   11   24:new             #57  <Class Bundle>
	//   12   27:dup             
	//   13   28:invokespecial   #58  <Method void Bundle()>
	//   14   31:astore_3        
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
	//   15   32:aload_3         
	//   16   33:ldc1            #60  <String "android.support.v4.media.session.action.ARGUMENT_URI">
	//   17   35:aload_1         
	//   18   36:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", ((android.os.Parcelable) (bundle)));
	//   19   39:aload_3         
	//   20   40:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//   21   42:aload_2         
	//   22   43:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle1);
	//   23   46:aload_0         
	//   24   47:ldc1            #68  <String "android.support.v4.media.session.action.PLAY_FROM_URI">
	//   25   49:aload_3         
	//   26   50:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
			return;
	//   27   53:return          
		}
	}

	public void prepare()
	{
		sendCustomAction("android.support.v4.media.session.action.PREPARE", ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #74  <String "android.support.v4.media.session.action.PREPARE">
	//    2    3:aconst_null     
	//    3    4:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//    4    7:return          
	}

	public void prepareFromMediaId(String s, Bundle bundle)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_3        
		bundle1.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", s);
	//    4    8:aload_3         
	//    5    9:ldc1            #77  <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
		bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
	//    8   15:aload_3         
	//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
		sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle1);
	//   12   22:aload_0         
	//   13   23:ldc1            #86  <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
	//   14   25:aload_3         
	//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   16   29:return          
	}

	public void prepareFromSearch(String s, Bundle bundle)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_3        
		bundle1.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", s);
	//    4    8:aload_3         
	//    5    9:ldc1            #89  <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #81  <Method void Bundle.putString(String, String)>
		bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
	//    8   15:aload_3         
	//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
		sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle1);
	//   12   22:aload_0         
	//   13   23:ldc1            #91  <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
	//   14   25:aload_3         
	//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   16   29:return          
	}

	public void prepareFromUri(Uri uri, Bundle bundle)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_3        
		bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", ((android.os.Parcelable) (uri)));
	//    4    8:aload_3         
	//    5    9:ldc1            #60  <String "android.support.v4.media.session.action.ARGUMENT_URI">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle1.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
	//    8   15:aload_3         
	//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #84  <Method void Bundle.putBundle(String, Bundle)>
		sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle1);
	//   12   22:aload_0         
	//   13   23:ldc1            #94  <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
	//   14   25:aload_3         
	//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   16   29:return          
	}

	public void rewind()
	{
		MediaControllerCompatApi21$TransportControls.rewind(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #97  <Method void MediaControllerCompatApi21$TransportControls.rewind(Object)>
	//    3    7:return          
	}

	public void seekTo(long l)
	{
		MediaControllerCompatApi21$TransportControls.seekTo(mControlsObj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:lload_1         
	//    3    5:invokestatic    #102 <Method void MediaControllerCompatApi21$TransportControls.seekTo(Object, long)>
	//    4    8:return          
	}

	public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
	{
		MediaControllerCompat.access$100(customaction.getAction(), bundle);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method String PlaybackStateCompat$CustomAction.getAction()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #112 <Method void MediaControllerCompat.access$100(String, Bundle)>
		MediaControllerCompatApi21$TransportControls.sendCustomAction(mControlsObj, customaction.getAction(), bundle);
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Object mControlsObj>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #109 <Method String PlaybackStateCompat$CustomAction.getAction()>
	//    8   16:aload_2         
	//    9   17:invokestatic    #114 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
	//   10   20:return          
	}

	public void sendCustomAction(String s, Bundle bundle)
	{
		MediaControllerCompat.access$100(s, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #112 <Method void MediaControllerCompat.access$100(String, Bundle)>
		MediaControllerCompatApi21$TransportControls.sendCustomAction(mControlsObj, s, bundle);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Object mControlsObj>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #114 <Method void MediaControllerCompatApi21$TransportControls.sendCustomAction(Object, String, Bundle)>
	//    8   14:return          
	}

	public void setCaptioningEnabled(boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", flag);
	//    4    8:aload_2         
	//    5    9:ldc1            #118 <String "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED">
	//    6   11:iload_1         
	//    7   12:invokevirtual   #122 <Method void Bundle.putBoolean(String, boolean)>
		sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
	//    8   15:aload_0         
	//    9   16:ldc1            #124 <String "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   12   22:return          
	}

	public void setRating(RatingCompat ratingcompat)
	{
		Object obj = mControlsObj;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:astore_2        
		if(ratingcompat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			ratingcompat = ((RatingCompat) (ratingcompat.getRating()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method Object RatingCompat.getRating()>
	//    7   13:astore_1        
		else
	//*   8   14:aload_2         
	//*   9   15:aload_1         
	//*  10   16:invokestatic    #135 <Method void MediaControllerCompatApi21$TransportControls.setRating(Object, Object)>
	//*  11   19:return          
			ratingcompat = null;
	//   12   20:aconst_null     
	//   13   21:astore_1        
		MediaControllerCompatApi21$TransportControls.setRating(obj, ((Object) (ratingcompat)));
	//*  14   22:goto            14
	}

	public void setRating(RatingCompat ratingcompat, Bundle bundle)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_3        
		bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ((android.os.Parcelable) (ratingcompat)));
	//    4    8:aload_3         
	//    5    9:ldc1            #138 <String "android.support.v4.media.session.action.ARGUMENT_RATING">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle1.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", ((android.os.Parcelable) (bundle)));
	//    8   15:aload_3         
	//    9   16:ldc1            #66  <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #64  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle1);
	//   12   22:aload_0         
	//   13   23:ldc1            #140 <String "android.support.v4.media.session.action.SET_RATING">
	//   14   25:aload_3         
	//   15   26:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   16   29:return          
	}

	public void setRepeatMode(int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
	//    4    8:aload_2         
	//    5    9:ldc1            #144 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
	//    6   11:iload_1         
	//    7   12:invokevirtual   #148 <Method void Bundle.putInt(String, int)>
		sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
	//    8   15:aload_0         
	//    9   16:ldc1            #150 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   12   22:return          
	}

	public void setShuffleMode(int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
	//    4    8:aload_2         
	//    5    9:ldc1            #153 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE">
	//    6   11:iload_1         
	//    7   12:invokevirtual   #148 <Method void Bundle.putInt(String, int)>
		sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
	//    8   15:aload_0         
	//    9   16:ldc1            #155 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   12   22:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED", flag);
	//    4    8:aload_2         
	//    5    9:ldc1            #158 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED">
	//    6   11:iload_1         
	//    7   12:invokevirtual   #122 <Method void Bundle.putBoolean(String, boolean)>
		sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED", bundle);
	//    8   15:aload_0         
	//    9   16:ldc1            #160 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED">
	//   10   18:aload_2         
	//   11   19:invokevirtual   #71  <Method void sendCustomAction(String, Bundle)>
	//   12   22:return          
	}

	public void skipToNext()
	{
		MediaControllerCompatApi21$TransportControls.skipToNext(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #163 <Method void MediaControllerCompatApi21$TransportControls.skipToNext(Object)>
	//    3    7:return          
	}

	public void skipToPrevious()
	{
		MediaControllerCompatApi21$TransportControls.skipToPrevious(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #166 <Method void MediaControllerCompatApi21$TransportControls.skipToPrevious(Object)>
	//    3    7:return          
	}

	public void skipToQueueItem(long l)
	{
		MediaControllerCompatApi21$TransportControls.skipToQueueItem(mControlsObj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:lload_1         
	//    3    5:invokestatic    #169 <Method void MediaControllerCompatApi21$TransportControls.skipToQueueItem(Object, long)>
	//    4    8:return          
	}

	public void stop()
	{
		MediaControllerCompatApi21$TransportControls.stop(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Object mControlsObj>
	//    2    4:invokestatic    #172 <Method void MediaControllerCompatApi21$TransportControls.stop(Object)>
	//    3    7:return          
	}

	protected final Object mControlsObj;

	public MediaControllerCompat$TransportControlsApi21(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void MediaControllerCompat$TransportControls()>
		mControlsObj = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Object mControlsObj>
	//    5    9:return          
	}
}

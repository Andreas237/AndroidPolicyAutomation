// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerYoutubeOverlayController

class APSMediaPlayerYoutubeOverlayController$3
	implements com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener
{

	public void onAdStarted()
	{
		APSMediaPlayer.getInstance().log("YoutubeOverlay: ad started");
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #27  <String "YoutubeOverlay: ad started">
	//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
		APSMediaPlayerYoutubeOverlayController.access$302(APSMediaPlayerYoutubeOverlayController.this, true);
	//    3    8:aload_0         
	//    4    9:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//    5   12:iconst_1        
	//    6   13:invokestatic    #35  <Method boolean APSMediaPlayerYoutubeOverlayController.access$302(APSMediaPlayerYoutubeOverlayController, boolean)>
	//    7   16:pop             
	//    8   17:return          
	}

	public void onError(com.google.android.youtube.player.YouTubePlayer.ErrorReason errorreason)
	{
		APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #39  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #40  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("YoutubeOverlay: playback error:");
	//    6   12:aload_3         
	//    7   13:ldc1            #42  <String "YoutubeOverlay: playback error:">
	//    8   15:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(errorreason.toString());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #52  <Method String com.google.android.youtube.player.YouTubePlayer$ErrorReason.toString()>
	//   13   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		apsmediaplayer.log(stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   18   33:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
	//   19   36:return          
	}

	public void onLoaded(String s)
	{
		APSMediaPlayer.getInstance().log("YoutubeOverlay: video loaded");
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #60  <String "YoutubeOverlay: video loaded">
	//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
		APSMediaPlayer.getInstance().hideHud();
	//    3    8:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   11:invokevirtual   #63  <Method void APSMediaPlayer.hideHud()>
		APSMediaPlayer.getInstance().loadStatePlayable();
	//    5   14:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    6   17:invokevirtual   #66  <Method void APSMediaPlayer.loadStatePlayable()>
		try
		{
			APSMediaPlayer.getInstance().play();
	//    7   20:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    8   23:invokevirtual   #69  <Method void APSMediaPlayer.play()>
			return;
	//    9   26:return          
		}
	//*  10   27:astore_1        
	//*  11   28:goto            32
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   12   31:astore_1        
		// Misplaced declaration of an exception variable
		catch(String s) { }
		((Exception) (s)).printStackTrace();
	//   13   32:aload_1         
	//   14   33:invokevirtual   #74  <Method void Exception.printStackTrace()>
	//   15   36:return          
	}

	public void onLoading()
	{
		APSMediaPlayer.getInstance().log("YoutubeOverlay: video loading");
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #77  <String "YoutubeOverlay: video loading">
	//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
	//    3    8:return          
	}

	public void onVideoEnded()
	{
		APSMediaPlayer.getInstance().log("YoutubeOverlay: video ended");
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #80  <String "YoutubeOverlay: video ended">
	//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
		if(APSMediaPlayerYoutubeOverlayController.access$300(APSMediaPlayerYoutubeOverlayController.this))
	//*   3    8:aload_0         
	//*   4    9:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//*   5   12:invokestatic    #84  <Method boolean APSMediaPlayerYoutubeOverlayController.access$300(APSMediaPlayerYoutubeOverlayController)>
	//*   6   15:ifeq            28
		{
			APSMediaPlayerYoutubeOverlayController.access$302(APSMediaPlayerYoutubeOverlayController.this, false);
	//    7   18:aload_0         
	//    8   19:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//    9   22:iconst_0        
	//   10   23:invokestatic    #35  <Method boolean APSMediaPlayerYoutubeOverlayController.access$302(APSMediaPlayerYoutubeOverlayController, boolean)>
	//   11   26:pop             
			return;
	//   12   27:return          
		} else
		{
			APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController.this, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped);
	//   13   28:aload_0         
	//   14   29:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   15   32:getstatic       #90  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//   16   35:invokestatic    #94  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController, com.appscend.media.APSMediaPlayer$MPMoviePlaybackState)>
	//   17   38:pop             
			APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
	//   18   39:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   19   42:aload_0         
	//   20   43:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   21   46:invokevirtual   #98  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.playbackState()>
	//   22   49:iconst_1        
	//   23   50:invokevirtual   #102 <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
			APSMediaPlayer.getInstance().next();
	//   24   53:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   25   56:invokevirtual   #105 <Method void APSMediaPlayer.next()>
			return;
	//   26   59:return          
		}
	}

	public void onVideoStarted()
	{
		APSMediaPlayer.getInstance().log("YoutubeOverlay: video started");
	//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #108 <String "YoutubeOverlay: video started">
	//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
	//    3    8:return          
	}

	final APSMediaPlayerYoutubeOverlayController this$0;

	APSMediaPlayerYoutubeOverlayController$3()
	{
		this$0 = APSMediaPlayerYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

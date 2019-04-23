// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.*;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.utilities.APSMediaPlayerTrackingEventListener;
import com.google.android.youtube.player.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerYoutubeOverlayController extends APSMediaPlayerOverlayController
	implements APSMediaPlayerTrackingEventListener
{
	public class FragmentContainer extends RelativeLayout
	{

		final APSMediaPlayerYoutubeOverlayController this$0;

		public FragmentContainer(Context context)
		{
			this$0 = APSMediaPlayerYoutubeOverlayController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field APSMediaPlayerYoutubeOverlayController this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void RelativeLayout(Context)>
			setId(com.appscend.vastplayer.R.id.youtubeoverlay);
		//    6   10:aload_0         
		//    7   11:getstatic       #22  <Field int com.appscend.vastplayer.R$id.youtubeoverlay>
		//    8   14:invokevirtual   #26  <Method void setId(int)>
			setGravity(17);
		//    9   17:aload_0         
		//   10   18:bipush          17
		//   11   20:invokevirtual   #29  <Method void setGravity(int)>
			setBackgroundColor(0);
		//   12   23:aload_0         
		//   13   24:iconst_0        
		//   14   25:invokevirtual   #32  <Method void setBackgroundColor(int)>
			setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -1))));
		//   15   28:aload_0         
		//   16   29:new             #34  <Class android.widget.RelativeLayout$LayoutParams>
		//   17   32:dup             
		//   18   33:iconst_m1       
		//   19   34:iconst_m1       
		//   20   35:invokespecial   #37  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
		//   21   38:invokevirtual   #41  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
		//   22   41:return          
		}
	}


	public APSMediaPlayerYoutubeOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void APSMediaPlayerOverlayController()>
		_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped;
	//    2    4:aload_0         
	//    3    5:getstatic       #48  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//    4    8:putfield        #50  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState _currentState>
		_adRunning = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #52  <Field boolean _adRunning>
		initializationListener = new com.google.android.youtube.player.YouTubePlayer.OnInitializedListener() {

			public void onInitializationFailure(com.google.android.youtube.player.YouTubePlayer.Provider provider, YouTubeInitializationResult youtubeinitializationresult)
			{
				APSMediaPlayer.getInstance().log("init failed");
			//    0    0:invokestatic    #26  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:ldc1            #28  <String "init failed">
			//    2    5:invokevirtual   #32  <Method void APSMediaPlayer.log(String)>
			//    3    8:return          
			}

			public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, YouTubePlayer youtubeplayer, boolean flag)
			{
				_youtubePlayer = youtubeplayer;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    2    4:aload_2         
			//    3    5:invokestatic    #38  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$002(APSMediaPlayerYoutubeOverlayController, YouTubePlayer)>
			//    4    8:pop             
				_youtubePlayer.setManageAudioFocus(false);
			//    5    9:aload_0         
			//    6   10:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    7   13:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//    8   16:iconst_0        
			//    9   17:invokeinterface #48  <Method void YouTubePlayer.setManageAudioFocus(boolean)>
				_youtubePlayer.setFullscreenControlFlags(1);
			//   10   22:aload_0         
			//   11   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   12   26:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//   13   29:iconst_1        
			//   14   30:invokeinterface #52  <Method void YouTubePlayer.setFullscreenControlFlags(int)>
				_youtubePlayer.setPlayerStyle(com.google.android.youtube.player.YouTubePlayer.PlayerStyle.MINIMAL);
			//   15   35:aload_0         
			//   16   36:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   17   39:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//   18   42:getstatic       #58  <Field com.google.android.youtube.player.YouTubePlayer$PlayerStyle com.google.android.youtube.player.YouTubePlayer$PlayerStyle.MINIMAL>
			//   19   45:invokeinterface #62  <Method void YouTubePlayer.setPlayerStyle(com.google.android.youtube.player.YouTubePlayer$PlayerStyle)>
				_youtubePlayer.setPlaybackEventListener(playbackEventListener);
			//   20   50:aload_0         
			//   21   51:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   22   54:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//   23   57:aload_0         
			//   24   58:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   25   61:getfield        #66  <Field com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener APSMediaPlayerYoutubeOverlayController.playbackEventListener>
			//   26   64:invokeinterface #70  <Method void YouTubePlayer.setPlaybackEventListener(com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener)>
				_youtubePlayer.setPlayerStateChangeListener(playbackStateListener);
			//   27   69:aload_0         
			//   28   70:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   29   73:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//   30   76:aload_0         
			//   31   77:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   32   80:getfield        #74  <Field com.google.android.youtube.player.YouTubePlayer$PlayerStateChangeListener APSMediaPlayerYoutubeOverlayController.playbackStateListener>
			//   33   83:invokeinterface #78  <Method void YouTubePlayer.setPlayerStateChangeListener(com.google.android.youtube.player.YouTubePlayer$PlayerStateChangeListener)>
				if(!flag)
			//*  34   88:iload_3         
			//*  35   89:ifne            111
					_youtubePlayer.cueVideo(_videoURL);
			//   36   92:aload_0         
			//   37   93:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   38   96:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
			//   39   99:aload_0         
			//   40  100:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   41  103:invokestatic    #82  <Method String APSMediaPlayerYoutubeOverlayController.access$100(APSMediaPlayerYoutubeOverlayController)>
			//   42  106:invokeinterface #85  <Method void YouTubePlayer.cueVideo(String)>
				APSMediaPlayer.getInstance().log("init ok");
			//   43  111:invokestatic    #26  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   44  114:ldc1            #87  <String "init ok">
			//   45  116:invokevirtual   #32  <Method void APSMediaPlayer.log(String)>
			//   46  119:return          
			}

			final APSMediaPlayerYoutubeOverlayController this$0;

			
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
;
	//    8   16:aload_0         
	//    9   17:new             #8   <Class APSMediaPlayerYoutubeOverlayController$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #55  <Method void APSMediaPlayerYoutubeOverlayController$1(APSMediaPlayerYoutubeOverlayController)>
	//   13   25:putfield        #57  <Field com.google.android.youtube.player.YouTubePlayer$OnInitializedListener initializationListener>
		playbackEventListener = new com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener() {

			public void onBuffering(boolean flag)
			{
				_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    2    4:getstatic       #26  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
			//    3    7:invokestatic    #30  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController, com.appscend.media.APSMediaPlayer$MPMoviePlaybackState)>
			//    4   10:pop             
				APSMediaPlayer.getInstance().log("YoutubeOverlay: buffering");
			//    5   11:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    6   14:ldc1            #38  <String "YoutubeOverlay: buffering">
			//    7   16:invokevirtual   #42  <Method void APSMediaPlayer.log(String)>
				APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
			//    8   19:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    9   22:aload_0         
			//   10   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   11   26:invokevirtual   #46  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.playbackState()>
			//   12   29:iconst_1        
			//   13   30:invokevirtual   #50  <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
			//   14   33:return          
			}

			public void onPaused()
			{
				_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    2    4:getstatic       #26  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
			//    3    7:invokestatic    #30  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController, com.appscend.media.APSMediaPlayer$MPMoviePlaybackState)>
			//    4   10:pop             
				APSMediaPlayer.getInstance().log("YoutubeOverlay: paused");
			//    5   11:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    6   14:ldc1            #53  <String "YoutubeOverlay: paused">
			//    7   16:invokevirtual   #42  <Method void APSMediaPlayer.log(String)>
				APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
			//    8   19:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    9   22:aload_0         
			//   10   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   11   26:invokevirtual   #46  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.playbackState()>
			//   12   29:iconst_1        
			//   13   30:invokevirtual   #50  <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
				APSMediaPlayer.getInstance().playerTapped();
			//   14   33:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   15   36:invokevirtual   #56  <Method void APSMediaPlayer.playerTapped()>
			//   16   39:return          
			}

			public void onPlaying()
			{
				APSMediaPlayer.getInstance().log("YoutubeOverlay: playing");
			//    0    0:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:ldc1            #59  <String "YoutubeOverlay: playing">
			//    2    5:invokevirtual   #42  <Method void APSMediaPlayer.log(String)>
				_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying;
			//    3    8:aload_0         
			//    4    9:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    5   12:getstatic       #62  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
			//    6   15:invokestatic    #30  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController, com.appscend.media.APSMediaPlayer$MPMoviePlaybackState)>
			//    7   18:pop             
				APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
			//    8   19:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    9   22:aload_0         
			//   10   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   11   26:invokevirtual   #46  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.playbackState()>
			//   12   29:iconst_1        
			//   13   30:invokevirtual   #50  <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
				APSMediaPlayer.getInstance().playerTapped();
			//   14   33:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   15   36:invokevirtual   #56  <Method void APSMediaPlayer.playerTapped()>
			//   16   39:return          
			}

			public void onSeekTo(int i)
			{
				APSMediaPlayer.getInstance().log("YoutubeOverlay: seeking");
			//    0    0:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:ldc1            #66  <String "YoutubeOverlay: seeking">
			//    2    5:invokevirtual   #42  <Method void APSMediaPlayer.log(String)>
				_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying;
			//    3    8:aload_0         
			//    4    9:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    5   12:getstatic       #62  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
			//    6   15:invokestatic    #30  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController, com.appscend.media.APSMediaPlayer$MPMoviePlaybackState)>
			//    7   18:pop             
				APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
			//    8   19:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    9   22:aload_0         
			//   10   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//   11   26:invokevirtual   #46  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerYoutubeOverlayController.playbackState()>
			//   12   29:iconst_1        
			//   13   30:invokevirtual   #50  <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
			//   14   33:return          
			}

			public void onStopped()
			{
				APSMediaPlayer.getInstance().log("YoutubeOverlay: stopped");
			//    0    0:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:ldc1            #69  <String "YoutubeOverlay: stopped">
			//    2    5:invokevirtual   #42  <Method void APSMediaPlayer.log(String)>
			//    3    8:return          
			}

			final APSMediaPlayerYoutubeOverlayController this$0;

			
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
;
	//   14   28:aload_0         
	//   15   29:new             #10  <Class APSMediaPlayerYoutubeOverlayController$2>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #58  <Method void APSMediaPlayerYoutubeOverlayController$2(APSMediaPlayerYoutubeOverlayController)>
	//   19   37:putfield        #60  <Field com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener playbackEventListener>
		playbackStateListener = new com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener() {

			public void onAdStarted()
			{
				APSMediaPlayer.getInstance().log("YoutubeOverlay: ad started");
			//    0    0:invokestatic    #25  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:ldc1            #27  <String "YoutubeOverlay: ad started">
			//    2    5:invokevirtual   #31  <Method void APSMediaPlayer.log(String)>
				_adRunning = true;
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
				if(_adRunning)
			//*   3    8:aload_0         
			//*   4    9:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//*   5   12:invokestatic    #84  <Method boolean APSMediaPlayerYoutubeOverlayController.access$300(APSMediaPlayerYoutubeOverlayController)>
			//*   6   15:ifeq            28
				{
					_adRunning = false;
			//    7   18:aload_0         
			//    8   19:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
			//    9   22:iconst_0        
			//   10   23:invokestatic    #35  <Method boolean APSMediaPlayerYoutubeOverlayController.access$302(APSMediaPlayerYoutubeOverlayController, boolean)>
			//   11   26:pop             
					return;
			//   12   27:return          
				} else
				{
					_currentState = com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped;
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
;
	//   20   40:aload_0         
	//   21   41:new             #12  <Class APSMediaPlayerYoutubeOverlayController$3>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #61  <Method void APSMediaPlayerYoutubeOverlayController$3(APSMediaPlayerYoutubeOverlayController)>
	//   25   49:putfield        #63  <Field com.google.android.youtube.player.YouTubePlayer$PlayerStateChangeListener playbackStateListener>
	//   26   52:return          
	}

	public static String getYoutubeVideoId(String s)
	{
		if(s != null && s.trim().length() > 0 && s.startsWith("http"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          84
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #88  <Method String String.trim()>
	//*   4    8:invokevirtual   #92  <Method int String.length()>
	//*   5   11:ifle            84
	//*   6   14:aload_0         
	//*   7   15:ldc1            #94  <String "http">
	//*   8   17:invokevirtual   #98  <Method boolean String.startsWith(String)>
	//*   9   20:ifeq            84
		{
			String s1 = "^.*((youtu.be/)|(v/)|(/u/w/)|(embed/)|(watch\\?))\\??v?=?([^#&\\?]*).*";
	//   10   23:ldc1            #100 <String "^.*((youtu.be/)|(v/)|(/u/w/)|(embed/)|(watch\\?))\\??v?=?([^#&\\?]*).*">
	//   11   25:astore_1        
			if(s.contains("youtube.com"))
	//*  12   26:aload_0         
	//*  13   27:ldc1            #102 <String "youtube.com">
	//*  14   29:invokevirtual   #106 <Method boolean String.contains(CharSequence)>
	//*  15   32:ifeq            45
				s1 = "^.*((youtu.be/)|(v/)|(/u/w/)|(embed/)|(watch\\?))\\??v?=?([^#&\\?]*).*".replace("youtu.be", "youtube.com");
	//   16   35:ldc1            #100 <String "^.*((youtu.be/)|(v/)|(/u/w/)|(embed/)|(watch\\?))\\??v?=?([^#&\\?]*).*">
	//   17   37:ldc1            #108 <String "youtu.be">
	//   18   39:ldc1            #102 <String "youtube.com">
	//   19   41:invokevirtual   #112 <Method String String.replace(CharSequence, CharSequence)>
	//   20   44:astore_1        
			s = ((String) (Pattern.compile(s1, 2).matcher(((CharSequence) (s)))));
	//   21   45:aload_1         
	//   22   46:iconst_2        
	//   23   47:invokestatic    #118 <Method Pattern Pattern.compile(String, int)>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #122 <Method Matcher Pattern.matcher(CharSequence)>
	//   26   54:astore_0        
			if(((Matcher) (s)).matches())
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #128 <Method boolean Matcher.matches()>
	//*  29   59:ifeq            84
			{
				s = ((Matcher) (s)).group(7);
	//   30   62:aload_0         
	//   31   63:bipush          7
	//   32   65:invokevirtual   #132 <Method String Matcher.group(int)>
	//   33   68:astore_0        
				if(s != null && s.length() == 11)
	//*  34   69:aload_0         
	//*  35   70:ifnull          84
	//*  36   73:aload_0         
	//*  37   74:invokevirtual   #92  <Method int String.length()>
	//*  38   77:bipush          11
	//*  39   79:icmpne          84
					return s;
	//   40   82:aload_0         
	//   41   83:areturn         
			}
		}
		return "";
	//   42   84:ldc1            #134 <String "">
	//   43   86:areturn         
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_fragmentContainer)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #138 <Field APSMediaPlayerYoutubeOverlayController$FragmentContainer _fragmentContainer>
	//    3    5:invokevirtual   #144 <Method void ViewGroup.addView(View)>
	//    4    8:return          
	}

	public int currentPlaybackTime()
	{
		return _youtubePlayer.getCurrentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #150 <Method int YouTubePlayer.getCurrentTimeMillis()>
	//    3    9:ireturn         
	}

	public int duration()
	{
		return _youtubePlayer.getDurationMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #154 <Method int YouTubePlayer.getDurationMillis()>
	//    3    9:ireturn         
	}

	public void fullscreenEntered()
	{
		APSMediaPlayer.getInstance().log("fullscreen enter");
	//    0    0:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #163 <String "fullscreen enter">
	//    2    5:invokevirtual   #167 <Method void APSMediaPlayer.log(String)>
	//    3    8:return          
	}

	public void fullscreenExited()
	{
		APSMediaPlayer.getInstance().log("fullscreen exit");
	//    0    0:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #170 <String "fullscreen exit">
	//    2    5:invokevirtual   #167 <Method void APSMediaPlayer.log(String)>
	//    3    8:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_fragmentContainer));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field APSMediaPlayerYoutubeOverlayController$FragmentContainer _fragmentContainer>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
	//    0    0:return          
	}

	public void load(Context context)
	{
		APSMediaPlayer.getInstance().log("initializing youtube");
	//    0    0:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:ldc1            #179 <String "initializing youtube">
	//    2    5:invokevirtual   #167 <Method void APSMediaPlayer.log(String)>
		APSMediaPlayer.getInstance().showHud();
	//    3    8:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   11:invokevirtual   #182 <Method void APSMediaPlayer.showHud()>
		APSMediaPlayer.getInstance().playerTapped();
	//    5   14:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    6   17:invokevirtual   #185 <Method void APSMediaPlayer.playerTapped()>
		APSMediaPlayer.getInstance().addTrackingEventListener(((APSMediaPlayerTrackingEventListener) (this)));
	//    7   20:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    8   23:aload_0         
	//    9   24:invokevirtual   #189 <Method void APSMediaPlayer.addTrackingEventListener(APSMediaPlayerTrackingEventListener)>
		_videoURL = getYoutubeVideoId((String)overlay.parameters.get("youtube"));
	//   10   27:aload_0         
	//   11   28:aload_0         
	//   12   29:getfield        #193 <Field APSMediaOverlay overlay>
	//   13   32:getfield        #199 <Field HashMap APSMediaOverlay.parameters>
	//   14   35:ldc1            #22  <String "youtube">
	//   15   37:invokevirtual   #205 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #84  <Class String>
	//   17   43:invokestatic    #207 <Method String getYoutubeVideoId(String)>
	//   18   46:putfield        #74  <Field String _videoURL>
		_youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
	//   19   49:aload_0         
	//   20   50:invokestatic    #213 <Method YouTubePlayerSupportFragment YouTubePlayerSupportFragment.newInstance()>
	//   21   53:putfield        #215 <Field YouTubePlayerSupportFragment _youTubePlayerFragment>
		_fragmentContainer = new FragmentContainer(((Context) (APSMediaPlayer.getInstance().getActivity())));
	//   22   56:aload_0         
	//   23   57:new             #14  <Class APSMediaPlayerYoutubeOverlayController$FragmentContainer>
	//   24   60:dup             
	//   25   61:aload_0         
	//   26   62:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   27   65:invokevirtual   #219 <Method android.app.Activity APSMediaPlayer.getActivity()>
	//   28   68:invokespecial   #222 <Method void APSMediaPlayerYoutubeOverlayController$FragmentContainer(APSMediaPlayerYoutubeOverlayController, Context)>
	//   29   71:putfield        #138 <Field APSMediaPlayerYoutubeOverlayController$FragmentContainer _fragmentContainer>
		context = ((Context) (((FragmentActivity)APSMediaPlayer.getInstance().getActivity()).getSupportFragmentManager().beginTransaction()));
	//   30   74:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   31   77:invokevirtual   #219 <Method android.app.Activity APSMediaPlayer.getActivity()>
	//   32   80:checkcast       #224 <Class FragmentActivity>
	//   33   83:invokevirtual   #228 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   34   86:invokevirtual   #234 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   35   89:astore_1        
		((FragmentTransaction) (context)).replace(_fragmentContainer.getId(), ((android.support.v4.app.Fragment) (_youTubePlayerFragment)));
	//   36   90:aload_1         
	//   37   91:aload_0         
	//   38   92:getfield        #138 <Field APSMediaPlayerYoutubeOverlayController$FragmentContainer _fragmentContainer>
	//   39   95:invokevirtual   #237 <Method int APSMediaPlayerYoutubeOverlayController$FragmentContainer.getId()>
	//   40   98:aload_0         
	//   41   99:getfield        #215 <Field YouTubePlayerSupportFragment _youTubePlayerFragment>
	//   42  102:invokevirtual   #242 <Method FragmentTransaction FragmentTransaction.replace(int, android.support.v4.app.Fragment)>
	//   43  105:pop             
		((FragmentTransaction) (context)).commit();
	//   44  106:aload_1         
	//   45  107:invokevirtual   #245 <Method int FragmentTransaction.commit()>
	//   46  110:pop             
		_youTubePlayerFragment.initialize(APSMediaPlayer.getInstance().getYoutubeApiKey(), initializationListener);
	//   47  111:aload_0         
	//   48  112:getfield        #215 <Field YouTubePlayerSupportFragment _youTubePlayerFragment>
	//   49  115:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   50  118:invokevirtual   #248 <Method String APSMediaPlayer.getYoutubeApiKey()>
	//   51  121:aload_0         
	//   52  122:getfield        #57  <Field com.google.android.youtube.player.YouTubePlayer$OnInitializedListener initializationListener>
	//   53  125:invokevirtual   #252 <Method void YouTubePlayerSupportFragment.initialize(String, com.google.android.youtube.player.YouTubePlayer$OnInitializedListener)>
	//   54  128:return          
	}

	public void onTrackingEventReceived(com.appscend.media.APSMediaTrackingEvents.MediaEventType mediaeventtype, Bundle bundle)
	{
		if(mediaeventtype == com.appscend.media.APSMediaTrackingEvents.MediaEventType.UNIT_FINISHED)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #260 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.UNIT_FINISHED>
	//*   2    4:if_acmpne       74
		{
			APSMediaPlayer.getInstance().removeTrackingEventListener(((APSMediaPlayerTrackingEventListener) (this)));
	//    3    7:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #263 <Method void APSMediaPlayer.removeTrackingEventListener(APSMediaPlayerTrackingEventListener)>
			mediaeventtype = ((com.appscend.media.APSMediaTrackingEvents.MediaEventType) (((FragmentActivity)APSMediaPlayer.getInstance().getActivity()).getSupportFragmentManager().beginTransaction()));
	//    6   14:invokestatic    #161 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    7   17:invokevirtual   #219 <Method android.app.Activity APSMediaPlayer.getActivity()>
	//    8   20:checkcast       #224 <Class FragmentActivity>
	//    9   23:invokevirtual   #228 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   10   26:invokevirtual   #234 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   11   29:astore_1        
			((FragmentTransaction) (mediaeventtype)).remove(((android.support.v4.app.Fragment) (_youTubePlayerFragment)));
	//   12   30:aload_1         
	//   13   31:aload_0         
	//   14   32:getfield        #215 <Field YouTubePlayerSupportFragment _youTubePlayerFragment>
	//   15   35:invokevirtual   #267 <Method FragmentTransaction FragmentTransaction.remove(android.support.v4.app.Fragment)>
	//   16   38:pop             
			((FragmentTransaction) (mediaeventtype)).commit();
	//   17   39:aload_1         
	//   18   40:invokevirtual   #245 <Method int FragmentTransaction.commit()>
	//   19   43:pop             
			_youtubePlayer.setPlaybackEventListener(((com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener) (null)));
	//   20   44:aload_0         
	//   21   45:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//   22   48:aconst_null     
	//   23   49:invokeinterface #271 <Method void YouTubePlayer.setPlaybackEventListener(com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener)>
			_youtubePlayer.setPlayerStateChangeListener(((com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener) (null)));
	//   24   54:aload_0         
	//   25   55:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//   26   58:aconst_null     
	//   27   59:invokeinterface #275 <Method void YouTubePlayer.setPlayerStateChangeListener(com.google.android.youtube.player.YouTubePlayer$PlayerStateChangeListener)>
			_youtubePlayer = null;
	//   28   64:aload_0         
	//   29   65:aconst_null     
	//   30   66:putfield        #68  <Field YouTubePlayer _youtubePlayer>
			_fragmentContainer = null;
	//   31   69:aload_0         
	//   32   70:aconst_null     
	//   33   71:putfield        #138 <Field APSMediaPlayerYoutubeOverlayController$FragmentContainer _fragmentContainer>
		}
	//   34   74:return          
	}

	public void pause()
	{
		_youtubePlayer.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #278 <Method void YouTubePlayer.pause()>
	//    3    9:return          
	}

	public void play()
	{
		_youtubePlayer.play();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #281 <Method void YouTubePlayer.play()>
	//    3    9:return          
	}

	public int playableDuration()
	{
		return _youtubePlayer.getDurationMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #154 <Method int YouTubePlayer.getDurationMillis()>
	//    3    9:ireturn         
	}

	public com.appscend.media.APSMediaPlayer.MPMoviePlaybackState playbackState()
	{
		return _currentState;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState _currentState>
	//    2    4:areturn         
	}

	public void setCurrentPlaybackTime(int i)
	{
		_youtubePlayer.seekToMillis(i);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:iload_1         
	//    3    5:invokeinterface #289 <Method void YouTubePlayer.seekToMillis(int)>
	//    4   10:return          
	}

	public void stop()
	{
		_youtubePlayer.pause();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:invokeinterface #278 <Method void YouTubePlayer.pause()>
	//    3    9:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.youtube";
	//    0    0:ldc1            #19  <String "com.appscend.mp.overlays.youtube">
	//    1    2:areturn         
	}

	public static final String APSYoutubeOverlay = "com.appscend.mp.overlays.youtube";
	public static final String kAPSYoutubeURL = "youtube";
	private boolean _adRunning;
	private com.appscend.media.APSMediaPlayer.MPMoviePlaybackState _currentState;
	private FragmentContainer _fragmentContainer;
	private String _videoURL;
	private YouTubePlayerSupportFragment _youTubePlayerFragment;
	private YouTubePlayer _youtubePlayer;
	public com.google.android.youtube.player.YouTubePlayer.OnInitializedListener initializationListener;
	public com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener playbackEventListener;
	public com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener playbackStateListener;


/*
	static YouTubePlayer access$000(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller)
	{
		return apsmediaplayeryoutubeoverlaycontroller._youtubePlayer;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field YouTubePlayer _youtubePlayer>
	//    2    4:areturn         
	}

*/


/*
	static YouTubePlayer access$002(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller, YouTubePlayer youtubeplayer)
	{
		apsmediaplayeryoutubeoverlaycontroller._youtubePlayer = youtubeplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field YouTubePlayer _youtubePlayer>
		return youtubeplayer;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$100(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller)
	{
		return apsmediaplayeryoutubeoverlaycontroller._videoURL;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String _videoURL>
	//    2    4:areturn         
	}

*/


/*
	static com.appscend.media.APSMediaPlayer.MPMoviePlaybackState access$202(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState mpmovieplaybackstate)
	{
		apsmediaplayeryoutubeoverlaycontroller._currentState = mpmovieplaybackstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState _currentState>
		return mpmovieplaybackstate;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$300(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller)
	{
		return apsmediaplayeryoutubeoverlaycontroller._adRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean _adRunning>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$302(APSMediaPlayerYoutubeOverlayController apsmediaplayeryoutubeoverlaycontroller, boolean flag)
	{
		apsmediaplayeryoutubeoverlaycontroller._adRunning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean _adRunning>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}

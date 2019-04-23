// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerYoutubeOverlayController

class APSMediaPlayerYoutubeOverlayController$2
	implements com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener
{

	public void onBuffering(boolean flag)
	{
		APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController.this, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused);
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
		APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController.this, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused);
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
		APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController.this, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying);
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
		APSMediaPlayerYoutubeOverlayController.access$202(APSMediaPlayerYoutubeOverlayController.this, com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying);
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

	APSMediaPlayerYoutubeOverlayController$2()
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

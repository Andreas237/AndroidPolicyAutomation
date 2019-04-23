// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import com.appscend.media.APSMediaPlayer;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerYoutubeOverlayController

class APSMediaPlayerYoutubeOverlayController$1
	implements com.google.android.youtube.player.YouTubePlayer.OnInitializedListener
{

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
		APSMediaPlayerYoutubeOverlayController.access$002(APSMediaPlayerYoutubeOverlayController.this, youtubeplayer);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//    2    4:aload_2         
	//    3    5:invokestatic    #38  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$002(APSMediaPlayerYoutubeOverlayController, YouTubePlayer)>
	//    4    8:pop             
		APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).setManageAudioFocus(false);
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//    7   13:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
	//    8   16:iconst_0        
	//    9   17:invokeinterface #48  <Method void YouTubePlayer.setManageAudioFocus(boolean)>
		APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).setFullscreenControlFlags(1);
	//   10   22:aload_0         
	//   11   23:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   12   26:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
	//   13   29:iconst_1        
	//   14   30:invokeinterface #52  <Method void YouTubePlayer.setFullscreenControlFlags(int)>
		APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).setPlayerStyle(com.google.android.youtube.player.YouTubePlayer.PlayerStyle.MINIMAL);
	//   15   35:aload_0         
	//   16   36:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   17   39:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
	//   18   42:getstatic       #58  <Field com.google.android.youtube.player.YouTubePlayer$PlayerStyle com.google.android.youtube.player.YouTubePlayer$PlayerStyle.MINIMAL>
	//   19   45:invokeinterface #62  <Method void YouTubePlayer.setPlayerStyle(com.google.android.youtube.player.YouTubePlayer$PlayerStyle)>
		APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).setPlaybackEventListener(playbackEventListener);
	//   20   50:aload_0         
	//   21   51:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   22   54:invokestatic    #42  <Method YouTubePlayer APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController)>
	//   23   57:aload_0         
	//   24   58:getfield        #14  <Field APSMediaPlayerYoutubeOverlayController this$0>
	//   25   61:getfield        #66  <Field com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener APSMediaPlayerYoutubeOverlayController.playbackEventListener>
	//   26   64:invokeinterface #70  <Method void YouTubePlayer.setPlaybackEventListener(com.google.android.youtube.player.YouTubePlayer$PlaybackEventListener)>
		APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).setPlayerStateChangeListener(playbackStateListener);
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
			APSMediaPlayerYoutubeOverlayController.access$000(APSMediaPlayerYoutubeOverlayController.this).cueVideo(APSMediaPlayerYoutubeOverlayController.access$100(APSMediaPlayerYoutubeOverlayController.this));
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

	APSMediaPlayerYoutubeOverlayController$1()
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

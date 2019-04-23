// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerJSYoutubeOverlayController

class APSMediaPlayerJSYoutubeOverlayController$2 extends WebViewClient
{

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(s.startsWith("bridge"))
	//*   0    0:aload_2         
	//*   1    1:ldc1            #23  <String "bridge">
	//*   2    3:invokevirtual   #29  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            66
		{
			if(s.endsWith("playerStateChanged"))
	//*   4    9:aload_2         
	//*   5   10:ldc1            #31  <String "playerStateChanged">
	//*   6   12:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*   7   15:ifeq            40
			{
				APSMediaPlayer.getInstance().loadStatePlayable();
	//    8   18:invokestatic    #40  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    9   21:invokevirtual   #43  <Method void APSMediaPlayer.loadStatePlayable()>
				APSMediaPlayer.getInstance().playbackStateChanged(playbackState(), true);
	//   10   24:invokestatic    #40  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   11   27:aload_0         
	//   12   28:getfield        #15  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//   13   31:invokevirtual   #47  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayerJSYoutubeOverlayController.playbackState()>
	//   14   34:iconst_1        
	//   15   35:invokevirtual   #51  <Method void APSMediaPlayer.playbackStateChanged(com.appscend.media.APSMediaPlayer$MPMoviePlaybackState, boolean)>
				return true;
	//   16   38:iconst_1        
	//   17   39:ireturn         
			}
			if(s.endsWith("videoEnded") || s.endsWith("errorOccured"))
	//*  18   40:aload_2         
	//*  19   41:ldc1            #53  <String "videoEnded">
	//*  20   43:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*  21   46:ifne            58
	//*  22   49:aload_2         
	//*  23   50:ldc1            #55  <String "errorOccured">
	//*  24   52:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*  25   55:ifeq            64
				APSMediaPlayer.getInstance().next();
	//   26   58:invokestatic    #40  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   27   61:invokevirtual   #58  <Method void APSMediaPlayer.next()>
			return true;
	//   28   64:iconst_1        
	//   29   65:ireturn         
		}
		if(!s.startsWith("http") && !s.startsWith("https"))
	//*  30   66:aload_2         
	//*  31   67:ldc1            #60  <String "http">
	//*  32   69:invokevirtual   #29  <Method boolean String.startsWith(String)>
	//*  33   72:ifne            89
	//*  34   75:aload_2         
	//*  35   76:ldc1            #62  <String "https">
	//*  36   78:invokevirtual   #29  <Method boolean String.startsWith(String)>
	//*  37   81:ifeq            87
	//*  38   84:goto            89
		{
			return false;
	//   39   87:iconst_0        
	//   40   88:ireturn         
		} else
		{
			APSMediaPlayer.getInstance().openURL(s);
	//   41   89:invokestatic    #40  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   42   92:aload_2         
	//   43   93:invokevirtual   #65  <Method boolean APSMediaPlayer.openURL(String)>
	//   44   96:pop             
			return true;
	//   45   97:iconst_1        
	//   46   98:ireturn         
		}
	}

	final APSMediaPlayerJSYoutubeOverlayController this$0;

	APSMediaPlayerJSYoutubeOverlayController$2()
	{
		this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}

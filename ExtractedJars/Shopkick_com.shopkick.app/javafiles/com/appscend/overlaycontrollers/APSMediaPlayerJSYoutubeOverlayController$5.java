// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.webkit.WebView;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.media.events.APSMediaUnit;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerJSYoutubeOverlayController

class APSMediaPlayerJSYoutubeOverlayController$5
	implements Runnable
{

	public void run()
	{
		WebView webview = APSMediaPlayerJSYoutubeOverlayController.access$200(APSMediaPlayerJSYoutubeOverlayController.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//    2    4:invokestatic    #26  <Method WebView APSMediaPlayerJSYoutubeOverlayController.access$200(APSMediaPlayerJSYoutubeOverlayController)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #28  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #29  <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("javascript:player.seekTo(");
	//    8   16:aload_2         
	//    9   17:ldc1            #31  <String "javascript:player.seekTo(">
	//   10   19:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(APSMediaPlayerJSYoutubeOverlayController.access$300(APSMediaPlayerJSYoutubeOverlayController.this).parentUnit.initialPlaybackTime);
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//   15   28:invokestatic    #39  <Method APSMediaOverlay APSMediaPlayerJSYoutubeOverlayController.access$300(APSMediaPlayerJSYoutubeOverlayController)>
	//   16   31:getfield        #45  <Field APSMediaUnit APSMediaOverlay.parentUnit>
	//   17   34:getfield        #51  <Field int APSMediaUnit.initialPlaybackTime>
	//   18   37:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		stringbuilder.append(", true)");
	//   20   41:aload_2         
	//   21   42:ldc1            #56  <String ", true)">
	//   22   44:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		webview.loadUrl(stringbuilder.toString());
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   27   53:invokevirtual   #66  <Method void WebView.loadUrl(String)>
	//   28   56:return          
	}

	final APSMediaPlayerJSYoutubeOverlayController this$0;

	APSMediaPlayerJSYoutubeOverlayController$5()
	{
		this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

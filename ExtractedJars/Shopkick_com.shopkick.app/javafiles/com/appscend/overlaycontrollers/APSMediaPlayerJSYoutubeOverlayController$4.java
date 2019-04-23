// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.webkit.WebView;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerJSYoutubeOverlayController

class APSMediaPlayerJSYoutubeOverlayController$4
	implements Runnable
{

	public void run()
	{
		WebView webview = APSMediaPlayerJSYoutubeOverlayController.access$200(APSMediaPlayerJSYoutubeOverlayController.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//    2    4:invokestatic    #30  <Method WebView APSMediaPlayerJSYoutubeOverlayController.access$200(APSMediaPlayerJSYoutubeOverlayController)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #32  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("javascript:");
	//    8   16:aload_2         
	//    9   17:ldc1            #35  <String "javascript:">
	//   10   19:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(val$eval);
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #21  <Field String val$eval>
	//   15   28:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		webview.loadUrl(stringbuilder.toString());
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   20   37:invokevirtual   #49  <Method void WebView.loadUrl(String)>
	//   21   40:return          
	}

	final APSMediaPlayerJSYoutubeOverlayController this$0;
	final String val$eval;

	APSMediaPlayerJSYoutubeOverlayController$4()
	{
		this$0 = final_apsmediaplayerjsyoutubeoverlaycontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		val$eval = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$eval>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

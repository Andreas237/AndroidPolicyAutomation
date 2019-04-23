// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerHTMLOverlayController, DismissActionContainer

class APSMediaPlayerHTMLOverlayController$1 extends WebViewClient
{

	public void onLoadResource(WebView webview, String s)
	{
		super.onLoadResource(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void WebViewClient.onLoadResource(WebView, String)>
		if(APSMediaPlayerHTMLOverlayController.access$000(APSMediaPlayerHTMLOverlayController.this))
	//*   4    6:aload_0         
	//*   5    7:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//*   6   10:invokestatic    #27  <Method boolean APSMediaPlayerHTMLOverlayController.access$000(APSMediaPlayerHTMLOverlayController)>
	//*   7   13:ifeq            74
		{
			webview.stopLoading();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #32  <Method void WebView.stopLoading()>
			if(APSMediaPlayer.getInstance().openURL(s))
	//*  10   20:invokestatic    #38  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #42  <Method boolean APSMediaPlayer.openURL(String)>
	//*  13   27:ifeq            74
			{
				if(APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController.this) == com.appscend.media.ion.APSHideOverlayOnWebviewDismiss)
	//*  14   30:aload_0         
	//*  15   31:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//*  16   34:invokestatic    #46  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController)>
	//*  17   37:getstatic       #52  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//*  18   40:if_acmpne       61
				{
					DismissActionContainer.INSTANCE.setDismissAction(APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController.this), ((APSMediaPlayerOverlayController) (APSMediaPlayerHTMLOverlayController.this)));
	//   19   43:getstatic       #58  <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   20   46:aload_0         
	//   21   47:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   22   50:invokestatic    #46  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController)>
	//   23   53:aload_0         
	//   24   54:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   25   57:invokevirtual   #62  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction, APSMediaPlayerOverlayController)>
					return;
	//   26   60:return          
				}
				DismissActionContainer.INSTANCE.setDismissAction(APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController.this));
	//   27   61:getstatic       #58  <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   28   64:aload_0         
	//   29   65:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   30   68:invokestatic    #46  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController)>
	//   31   71:invokevirtual   #65  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction)>
			}
		}
	//   32   74:return          
	}

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #68  <Method void WebViewClient.onPageFinished(WebView, String)>
		APSMediaPlayerHTMLOverlayController.access$002(APSMediaPlayerHTMLOverlayController.this, true);
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//    6   10:iconst_1        
	//    7   11:invokestatic    #72  <Method boolean APSMediaPlayerHTMLOverlayController.access$002(APSMediaPlayerHTMLOverlayController, boolean)>
	//    8   14:pop             
	//    9   15:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("errorTracking"), "nonlinear load error", com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//    0    0:invokestatic    #38  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//    3    7:getfield        #78  <Field APSMediaOverlay APSMediaPlayerHTMLOverlayController.overlay>
	//    4   10:getfield        #84  <Field HashMap APSMediaOverlay.parameters>
	//    5   13:ldc1            #86  <String "errorTracking">
	//    6   15:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//    7   18:checkcast       #94  <Class ArrayList>
	//    8   21:ldc1            #96  <String "nonlinear load error">
	//    9   23:getstatic       #102 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//   10   26:aload_0         
	//   11   27:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   12   30:getfield        #78  <Field APSMediaOverlay APSMediaPlayerHTMLOverlayController.overlay>
	//   13   33:invokevirtual   #106 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
		((RelativeLayout)APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController.this).getParent()).removeView(((android.view.View) (APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController.this))));
	//   14   36:aload_0         
	//   15   37:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   16   40:invokestatic    #110 <Method WebView APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController)>
	//   17   43:invokevirtual   #114 <Method android.view.ViewParent WebView.getParent()>
	//   18   46:checkcast       #116 <Class RelativeLayout>
	//   19   49:aload_0         
	//   20   50:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
	//   21   53:invokestatic    #110 <Method WebView APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController)>
	//   22   56:invokevirtual   #120 <Method void RelativeLayout.removeView(android.view.View)>
	//   23   59:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		onLoadResource(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #123 <Method void onLoadResource(WebView, String)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	final APSMediaPlayerHTMLOverlayController this$0;

	APSMediaPlayerHTMLOverlayController$1()
	{
		this$0 = APSMediaPlayerHTMLOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}

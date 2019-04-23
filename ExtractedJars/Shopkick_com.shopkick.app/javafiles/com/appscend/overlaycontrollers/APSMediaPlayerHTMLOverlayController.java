// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.*;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerClosableOverlayController, DismissActionContainer

public class APSMediaPlayerHTMLOverlayController extends APSMediaPlayerClosableOverlayController
{

	public APSMediaPlayerHTMLOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void APSMediaPlayerClosableOverlayController()>
	//    2    4:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_viewHolder)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field RelativeLayout _viewHolder>
	//    3    5:invokevirtual   #71  <Method void ViewGroup.addView(View)>
		addCloseButtonWithParameters(((ViewGroup) (_viewHolder)), overlay.parameters);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field RelativeLayout _viewHolder>
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field APSMediaOverlay overlay>
	//    9   17:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//   10   20:invokevirtual   #85  <Method void addCloseButtonWithParameters(ViewGroup, HashMap)>
	//   11   23:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_viewHolder));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field RelativeLayout _viewHolder>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_viewHolder.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field RelativeLayout _viewHolder>
	//    2    4:invokevirtual   #95  <Method void RelativeLayout.removeAllViews()>
	//    3    7:return          
	}

	public void load(Context context)
	{
		_viewHolder = new RelativeLayout(context);
	//    0    0:aload_0         
	//    1    1:new             #92  <Class RelativeLayout>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #102 <Method void RelativeLayout(Context)>
	//    5    9:putfield        #65  <Field RelativeLayout _viewHolder>
		_view = new WebView(context);
	//    6   12:aload_0         
	//    7   13:new             #104 <Class WebView>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #105 <Method void WebView(Context)>
	//   11   21:putfield        #61  <Field WebView _view>
		_view.setBackgroundColor(-1);
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field WebView _view>
	//   14   28:iconst_m1       
	//   15   29:invokevirtual   #109 <Method void WebView.setBackgroundColor(int)>
		_view.clearCache(true);
	//   16   32:aload_0         
	//   17   33:getfield        #61  <Field WebView _view>
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #113 <Method void WebView.clearCache(boolean)>
		_view.getSettings().setJavaScriptEnabled(true);
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field WebView _view>
	//   22   44:invokevirtual   #117 <Method WebSettings WebView.getSettings()>
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #122 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		_view.getSettings().setLoadWithOverviewMode(true);
	//   25   51:aload_0         
	//   26   52:getfield        #61  <Field WebView _view>
	//   27   55:invokevirtual   #117 <Method WebSettings WebView.getSettings()>
	//   28   58:iconst_1        
	//   29   59:invokevirtual   #125 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		_view.getSettings().setUseWideViewPort(true);
	//   30   62:aload_0         
	//   31   63:getfield        #61  <Field WebView _view>
	//   32   66:invokevirtual   #117 <Method WebSettings WebView.getSettings()>
	//   33   69:iconst_1        
	//   34   70:invokevirtual   #128 <Method void WebSettings.setUseWideViewPort(boolean)>
		_view.getSettings().setDomStorageEnabled(true);
	//   35   73:aload_0         
	//   36   74:getfield        #61  <Field WebView _view>
	//   37   77:invokevirtual   #117 <Method WebSettings WebView.getSettings()>
	//   38   80:iconst_1        
	//   39   81:invokevirtual   #131 <Method void WebSettings.setDomStorageEnabled(boolean)>
		_view.getSettings().setPluginState(android.webkit.WebSettings.PluginState.OFF);
	//   40   84:aload_0         
	//   41   85:getfield        #61  <Field WebView _view>
	//   42   88:invokevirtual   #117 <Method WebSettings WebView.getSettings()>
	//   43   91:getstatic       #137 <Field android.webkit.WebSettings$PluginState android.webkit.WebSettings$PluginState.OFF>
	//   44   94:invokevirtual   #141 <Method void WebSettings.setPluginState(android.webkit.WebSettings$PluginState)>
		_view.setHorizontalScrollBarEnabled(false);
	//   45   97:aload_0         
	//   46   98:getfield        #61  <Field WebView _view>
	//   47  101:iconst_0        
	//   48  102:invokevirtual   #144 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
		_view.setVerticalScrollBarEnabled(false);
	//   49  105:aload_0         
	//   50  106:getfield        #61  <Field WebView _view>
	//   51  109:iconst_0        
	//   52  110:invokevirtual   #147 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		_view.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onLoadResource(WebView webview, String s)
			{
				super.onLoadResource(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void WebViewClient.onLoadResource(WebView, String)>
				if(linkClicked)
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
						if(dismissedAction == com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss)
			//*  14   30:aload_0         
			//*  15   31:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
			//*  16   34:invokestatic    #46  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerHTMLOverlayController.access$100(APSMediaPlayerHTMLOverlayController)>
			//*  17   37:getstatic       #52  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
			//*  18   40:if_acmpne       61
						{
							DismissActionContainer.INSTANCE.setDismissAction(dismissedAction, ((APSMediaPlayerOverlayController) (APSMediaPlayerHTMLOverlayController.this)));
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
						DismissActionContainer.INSTANCE.setDismissAction(dismissedAction);
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
				linkClicked = true;
			//    4    6:aload_0         
			//    5    7:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
			//    6   10:iconst_1        
			//    7   11:invokestatic    #72  <Method boolean APSMediaPlayerHTMLOverlayController.access$002(APSMediaPlayerHTMLOverlayController, boolean)>
			//    8   14:pop             
			//    9   15:return          
			}

			public void onReceivedError(WebView webview, int k, String s, String s1)
			{
				APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("errorTracking"), "nonlinear load error", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((com.appscend.media.events.APSMediaEvent) (overlay)));
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
				((RelativeLayout)_view.getParent()).removeView(((View) (_view)));
			//   14   36:aload_0         
			//   15   37:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
			//   16   40:invokestatic    #110 <Method WebView APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController)>
			//   17   43:invokevirtual   #114 <Method android.view.ViewParent WebView.getParent()>
			//   18   46:checkcast       #116 <Class RelativeLayout>
			//   19   49:aload_0         
			//   20   50:getfield        #15  <Field APSMediaPlayerHTMLOverlayController this$0>
			//   21   53:invokestatic    #110 <Method WebView APSMediaPlayerHTMLOverlayController.access$200(APSMediaPlayerHTMLOverlayController)>
			//   22   56:invokevirtual   #120 <Method void RelativeLayout.removeView(View)>
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
)));
	//   53  113:aload_0         
	//   54  114:getfield        #61  <Field WebView _view>
	//   55  117:new             #6   <Class APSMediaPlayerHTMLOverlayController$1>
	//   56  120:dup             
	//   57  121:aload_0         
	//   58  122:invokespecial   #150 <Method void APSMediaPlayerHTMLOverlayController$1(APSMediaPlayerHTMLOverlayController)>
	//   59  125:invokevirtual   #154 <Method void WebView.setWebViewClient(WebViewClient)>
		if(overlay.parameters.get("url") != null)
	//*  60  128:aload_0         
	//*  61  129:getfield        #75  <Field APSMediaOverlay overlay>
	//*  62  132:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//*  63  135:ldc1            #28  <String "url">
	//*  64  137:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//*  65  140:ifnull          168
		{
			_view.loadUrl((String)overlay.parameters.get("url"));
	//   66  143:aload_0         
	//   67  144:getfield        #61  <Field WebView _view>
	//   68  147:aload_0         
	//   69  148:getfield        #75  <Field APSMediaOverlay overlay>
	//   70  151:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//   71  154:ldc1            #28  <String "url">
	//   72  156:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//   73  159:checkcast       #162 <Class String>
	//   74  162:invokevirtual   #166 <Method void WebView.loadUrl(String)>
		} else
	//*  75  165:goto            623
		{
			int i;
			if(overlay.parameters.get("viewportWidth") != null)
	//*  76  168:aload_0         
	//*  77  169:getfield        #75  <Field APSMediaOverlay overlay>
	//*  78  172:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//*  79  175:ldc1            #34  <String "viewportWidth">
	//*  80  177:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//*  81  180:ifnull          205
				i = Integer.parseInt((String)overlay.parameters.get("viewportWidth"));
	//   82  183:aload_0         
	//   83  184:getfield        #75  <Field APSMediaOverlay overlay>
	//   84  187:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//   85  190:ldc1            #34  <String "viewportWidth">
	//   86  192:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//   87  195:checkcast       #162 <Class String>
	//   88  198:invokestatic    #172 <Method int Integer.parseInt(String)>
	//   89  201:istore_2        
			else
	//*  90  202:goto            224
				i = ((Integer)overlay.parameters.get("viewWidth")).intValue();
	//   91  205:aload_0         
	//   92  206:getfield        #75  <Field APSMediaOverlay overlay>
	//   93  209:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//   94  212:ldc1            #174 <String "viewWidth">
	//   95  214:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//   96  217:checkcast       #168 <Class Integer>
	//   97  220:invokevirtual   #178 <Method int Integer.intValue()>
	//   98  223:istore_2        
			int j;
			if(overlay.parameters.get("viewportHeight") != null)
	//*  99  224:aload_0         
	//* 100  225:getfield        #75  <Field APSMediaOverlay overlay>
	//* 101  228:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 102  231:ldc1            #19  <String "viewportHeight">
	//* 103  233:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 104  236:ifnull          261
				j = Integer.parseInt((String)overlay.parameters.get("viewportHeight"));
	//  105  239:aload_0         
	//  106  240:getfield        #75  <Field APSMediaOverlay overlay>
	//  107  243:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  108  246:ldc1            #19  <String "viewportHeight">
	//  109  248:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  110  251:checkcast       #162 <Class String>
	//  111  254:invokestatic    #172 <Method int Integer.parseInt(String)>
	//  112  257:istore_3        
			else
	//* 113  258:goto            280
				j = ((Integer)overlay.parameters.get("viewHeight")).intValue();
	//  114  261:aload_0         
	//  115  262:getfield        #75  <Field APSMediaOverlay overlay>
	//  116  265:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  117  268:ldc1            #180 <String "viewHeight">
	//  118  270:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  119  273:checkcast       #168 <Class Integer>
	//  120  276:invokevirtual   #178 <Method int Integer.intValue()>
	//  121  279:istore_3        
			context = ((Context) (new StringBuilder()));
	//  122  280:new             #182 <Class StringBuilder>
	//  123  283:dup             
	//  124  284:invokespecial   #183 <Method void StringBuilder()>
	//  125  287:astore_1        
			((StringBuilder) (context)).append("<html><head><meta name=\"viewport\" content=\"width=");
	//  126  288:aload_1         
	//  127  289:ldc1            #185 <String "<html><head><meta name=\"viewport\" content=\"width=">
	//  128  291:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  129  294:pop             
			((StringBuilder) (context)).append(i);
	//  130  295:aload_1         
	//  131  296:iload_2         
	//  132  297:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//  133  300:pop             
			((StringBuilder) (context)).append(", height=");
	//  134  301:aload_1         
	//  135  302:ldc1            #194 <String ", height=">
	//  136  304:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  137  307:pop             
			((StringBuilder) (context)).append(j);
	//  138  308:aload_1         
	//  139  309:iload_3         
	//  140  310:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//  141  313:pop             
			((StringBuilder) (context)).append(", initial-scale=1, maximum-scale=1\"></head><body>%%@</body></html>");
	//  142  314:aload_1         
	//  143  315:ldc1            #196 <String ", initial-scale=1, maximum-scale=1\"></head><body>%%@</body></html>">
	//  144  317:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  145  320:pop             
			context = ((Context) (new String(((StringBuilder) (context)).toString())));
	//  146  321:new             #162 <Class String>
	//  147  324:dup             
	//  148  325:aload_1         
	//  149  326:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  150  329:invokespecial   #202 <Method void String(String)>
	//  151  332:astore_1        
			if(overlay.parameters.get("code") != null)
	//* 152  333:aload_0         
	//* 153  334:getfield        #75  <Field APSMediaOverlay overlay>
	//* 154  337:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 155  340:ldc1            #13  <String "code">
	//* 156  342:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 157  345:ifnull          415
			{
				if(((String)overlay.parameters.get("code")).contains("<body"))
	//* 158  348:aload_0         
	//* 159  349:getfield        #75  <Field APSMediaOverlay overlay>
	//* 160  352:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 161  355:ldc1            #13  <String "code">
	//* 162  357:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 163  360:checkcast       #162 <Class String>
	//* 164  363:ldc1            #204 <String "<body">
	//* 165  365:invokevirtual   #208 <Method boolean String.contains(CharSequence)>
	//* 166  368:ifeq            390
					context = ((Context) ((String)overlay.parameters.get("code")));
	//  167  371:aload_0         
	//  168  372:getfield        #75  <Field APSMediaOverlay overlay>
	//  169  375:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  170  378:ldc1            #13  <String "code">
	//  171  380:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  172  383:checkcast       #162 <Class String>
	//  173  386:astore_1        
				else
	//* 174  387:goto            593
					context = ((Context) (((String) (context)).replace("%%@", ((CharSequence) ((String)overlay.parameters.get("code"))))));
	//  175  390:aload_1         
	//  176  391:ldc1            #210 <String "%%@">
	//  177  393:aload_0         
	//  178  394:getfield        #75  <Field APSMediaOverlay overlay>
	//  179  397:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  180  400:ldc1            #13  <String "code">
	//  181  402:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  182  405:checkcast       #162 <Class String>
	//  183  408:invokevirtual   #214 <Method String String.replace(CharSequence, CharSequence)>
	//  184  411:astore_1        
			} else
	//* 185  412:goto            593
			if(overlay.parameters.get("iframe") != null)
	//* 186  415:aload_0         
	//* 187  416:getfield        #75  <Field APSMediaOverlay overlay>
	//* 188  419:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 189  422:ldc1            #22  <String "iframe">
	//* 190  424:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 191  427:ifnull          518
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  192  430:new             #182 <Class StringBuilder>
	//  193  433:dup             
	//  194  434:invokespecial   #183 <Method void StringBuilder()>
	//  195  437:astore          4
				stringbuilder.append("<iframe width='");
	//  196  439:aload           4
	//  197  441:ldc1            #216 <String "<iframe width='">
	//  198  443:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  199  446:pop             
				stringbuilder.append(i);
	//  200  447:aload           4
	//  201  449:iload_2         
	//  202  450:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//  203  453:pop             
				stringbuilder.append("' height='");
	//  204  454:aload           4
	//  205  456:ldc1            #218 <String "' height='">
	//  206  458:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  207  461:pop             
				stringbuilder.append(j);
	//  208  462:aload           4
	//  209  464:iload_3         
	//  210  465:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//  211  468:pop             
				stringbuilder.append("' src='");
	//  212  469:aload           4
	//  213  471:ldc1            #220 <String "' src='">
	//  214  473:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  215  476:pop             
				stringbuilder.append(overlay.parameters.get("iframe"));
	//  216  477:aload           4
	//  217  479:aload_0         
	//  218  480:getfield        #75  <Field APSMediaOverlay overlay>
	//  219  483:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  220  486:ldc1            #22  <String "iframe">
	//  221  488:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  222  491:invokevirtual   #223 <Method StringBuilder StringBuilder.append(Object)>
	//  223  494:pop             
				stringbuilder.append("' seamless frameborder='0' style='margin:0;padding:0;border:0;'></iframe>");
	//  224  495:aload           4
	//  225  497:ldc1            #225 <String "' seamless frameborder='0' style='margin:0;padding:0;border:0;'></iframe>">
	//  226  499:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  227  502:pop             
				context = ((Context) (((String) (context)).replace("%%@", ((CharSequence) (stringbuilder.toString())))));
	//  228  503:aload_1         
	//  229  504:ldc1            #210 <String "%%@">
	//  230  506:aload           4
	//  231  508:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  232  511:invokevirtual   #214 <Method String String.replace(CharSequence, CharSequence)>
	//  233  514:astore_1        
			} else
	//* 234  515:goto            593
			if(overlay.parameters.get("script") != null)
	//* 235  518:aload_0         
	//* 236  519:getfield        #75  <Field APSMediaOverlay overlay>
	//* 237  522:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 238  525:ldc1            #31  <String "script">
	//* 239  527:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 240  530:ifnull          591
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  241  533:new             #182 <Class StringBuilder>
	//  242  536:dup             
	//  243  537:invokespecial   #183 <Method void StringBuilder()>
	//  244  540:astore          4
				stringbuilder1.append("<script src='");
	//  245  542:aload           4
	//  246  544:ldc1            #227 <String "<script src='">
	//  247  546:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  248  549:pop             
				stringbuilder1.append(overlay.parameters.get("script"));
	//  249  550:aload           4
	//  250  552:aload_0         
	//  251  553:getfield        #75  <Field APSMediaOverlay overlay>
	//  252  556:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  253  559:ldc1            #31  <String "script">
	//  254  561:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  255  564:invokevirtual   #223 <Method StringBuilder StringBuilder.append(Object)>
	//  256  567:pop             
				stringbuilder1.append("'></script>");
	//  257  568:aload           4
	//  258  570:ldc1            #229 <String "'></script>">
	//  259  572:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//  260  575:pop             
				context = ((Context) (((String) (context)).replace("%%@", ((CharSequence) (stringbuilder1.toString())))));
	//  261  576:aload_1         
	//  262  577:ldc1            #210 <String "%%@">
	//  263  579:aload           4
	//  264  581:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  265  584:invokevirtual   #214 <Method String String.replace(CharSequence, CharSequence)>
	//  266  587:astore_1        
			} else
	//* 267  588:goto            593
			{
				context = null;
	//  268  591:aconst_null     
	//  269  592:astore_1        
			}
			if(context != null)
	//* 270  593:aload_1         
	//* 271  594:ifnull          612
				_view.loadDataWithBaseURL("file:///android_asset/localwebview/", ((String) (context)), "text/html", "UTF-8", ((String) (null)));
	//  272  597:aload_0         
	//  273  598:getfield        #61  <Field WebView _view>
	//  274  601:ldc1            #231 <String "file:///android_asset/localwebview/">
	//  275  603:aload_1         
	//  276  604:ldc1            #233 <String "text/html">
	//  277  606:ldc1            #235 <String "UTF-8">
	//  278  608:aconst_null     
	//  279  609:invokevirtual   #239 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
			_viewHolder.addView(((View) (_view)));
	//  280  612:aload_0         
	//  281  613:getfield        #65  <Field RelativeLayout _viewHolder>
	//  282  616:aload_0         
	//  283  617:getfield        #61  <Field WebView _view>
	//  284  620:invokevirtual   #240 <Method void RelativeLayout.addView(View)>
		}
		if(overlay.parameters.get("dismissAction") == null)
	//* 285  623:aload_0         
	//* 286  624:getfield        #75  <Field APSMediaOverlay overlay>
	//* 287  627:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 288  630:ldc1            #25  <String "dismissAction">
	//* 289  632:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 290  635:ifnonnull       646
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//  291  638:aload_0         
	//  292  639:getstatic       #245 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//  293  642:putfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//  294  645:return          
		}
		if(overlay.parameters.get("dismissAction") instanceof com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)
	//* 295  646:aload_0         
	//* 296  647:getfield        #75  <Field APSMediaOverlay overlay>
	//* 297  650:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//* 298  653:ldc1            #25  <String "dismissAction">
	//* 299  655:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//* 300  658:instanceof      #242 <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//* 301  661:ifeq            684
		{
			dismissedAction = (com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)overlay.parameters.get("dismissAction");
	//  302  664:aload_0         
	//  303  665:aload_0         
	//  304  666:getfield        #75  <Field APSMediaOverlay overlay>
	//  305  669:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  306  672:ldc1            #25  <String "dismissAction">
	//  307  674:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  308  677:checkcast       #242 <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//  309  680:putfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//  310  683:return          
		}
		context = ((Context) ((String)overlay.parameters.get("dismissAction")));
	//  311  684:aload_0         
	//  312  685:getfield        #75  <Field APSMediaOverlay overlay>
	//  313  688:getfield        #81  <Field HashMap APSMediaOverlay.parameters>
	//  314  691:ldc1            #25  <String "dismissAction">
	//  315  693:invokevirtual   #160 <Method Object HashMap.get(Object)>
	//  316  696:checkcast       #162 <Class String>
	//  317  699:astore_1        
		if(((String) (context)).equals("doNothing"))
	//* 318  700:aload_1         
	//* 319  701:ldc1            #247 <String "doNothing">
	//* 320  703:invokevirtual   #251 <Method boolean String.equals(Object)>
	//* 321  706:ifeq            717
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//  322  709:aload_0         
	//  323  710:getstatic       #245 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//  324  713:putfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//  325  716:return          
		}
		if(((String) (context)).equals("skipUnit"))
	//* 326  717:aload_1         
	//* 327  718:ldc1            #253 <String "skipUnit">
	//* 328  720:invokevirtual   #251 <Method boolean String.equals(Object)>
	//* 329  723:ifeq            734
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss;
	//  330  726:aload_0         
	//  331  727:getstatic       #256 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//  332  730:putfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//  333  733:return          
		}
		if(((String) (context)).equals("closeOverlay"))
	//* 334  734:aload_1         
	//* 335  735:ldc2            #258 <String "closeOverlay">
	//* 336  738:invokevirtual   #251 <Method boolean String.equals(Object)>
	//* 337  741:ifeq            751
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss;
	//  338  744:aload_0         
	//  339  745:getstatic       #261 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//  340  748:putfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//  341  751:return          
	}

	public void setViewDimension(int i, int j)
	{
	//    0    0:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.html";
	//    0    0:ldc1            #10  <String "com.appscend.mp.overlays.html">
	//    1    2:areturn         
	}

	public static final String APSHTMLOverlay = "com.appscend.mp.overlays.html";
	public static final String kAPSHTMLCodeContent = "code";
	public static final String kAPSHTMLErrorURLs = "errorTracking";
	public static final String kAPSHTMLHeight = "viewportHeight";
	public static final String kAPSHTMLIframeSource = "iframe";
	public static final String kAPSHTMLOverlayWebviewDismissAction = "dismissAction";
	public static final String kAPSHTMLPageSource = "url";
	public static final String kAPSHTMLScriptSource = "script";
	public static final String kAPSHTMLWidth = "viewportWidth";
	private WebView _view;
	private RelativeLayout _viewHolder;
	private com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction dismissedAction;
	private boolean linkClicked;


/*
	static boolean access$000(APSMediaPlayerHTMLOverlayController apsmediaplayerhtmloverlaycontroller)
	{
		return apsmediaplayerhtmloverlaycontroller.linkClicked;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean linkClicked>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(APSMediaPlayerHTMLOverlayController apsmediaplayerhtmloverlaycontroller, boolean flag)
	{
		apsmediaplayerhtmloverlaycontroller.linkClicked = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean linkClicked>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction access$100(APSMediaPlayerHTMLOverlayController apsmediaplayerhtmloverlaycontroller)
	{
		return apsmediaplayerhtmloverlaycontroller.dismissedAction;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$200(APSMediaPlayerHTMLOverlayController apsmediaplayerhtmloverlaycontroller)
	{
		return apsmediaplayerhtmloverlaycontroller._view;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field WebView _view>
	//    2    4:areturn         
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.view.*;
import android.webkit.*;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerVimeoOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerVimeoOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void APSMediaPlayerOverlayController()>
		_current_alpha = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #31  <Field float _current_alpha>
	//    5    9:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_webView)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field WebView _webView>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #60  <Method void ViewGroup.addView(View, int)>
	//    5    9:return          
	}

	public float getAlpha()
	{
		return _current_alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float _current_alpha>
	//    2    4:freturn         
	}

	public View getView()
	{
		return ((View) (_webView));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field WebView _webView>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
	//    0    0:return          
	}

	public void load(Context context)
	{
		APSMediaPlayer.getInstance().playerTapped();
	//    0    0:invokestatic    #78  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #81  <Method void APSMediaPlayer.playerTapped()>
		Object obj = ((Object) (new URL((String)overlay.parameters.get("vimeo"))));
	//    2    6:new             #83  <Class URL>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:getfield        #87  <Field APSMediaOverlay overlay>
	//    6   14:getfield        #93  <Field HashMap APSMediaOverlay.parameters>
	//    7   17:ldc1            #17  <String "vimeo">
	//    8   19:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//    9   22:checkcast       #101 <Class String>
	//   10   25:invokespecial   #104 <Method void URL(String)>
	//   11   28:astore_2        
		if(((URL) (obj)).getPath() == null) goto _L2; else goto _L1
	//   12   29:aload_2         
	//   13   30:invokevirtual   #108 <Method String URL.getPath()>
	//   14   33:ifnull          48
_L1:
		obj = ((Object) (((URL) (obj)).getPath().substring(1)));
	//   15   36:aload_2         
	//   16   37:invokevirtual   #108 <Method String URL.getPath()>
	//   17   40:iconst_1        
	//   18   41:invokevirtual   #112 <Method String String.substring(int)>
	//   19   44:astore_2        
		  goto _L3
	//*  20   45:goto            233
_L2:
		StringBuilder stringbuilder;
		try
		{
			obj = ((Object) (((URL) (obj)).toString()));
	//   21   48:aload_2         
	//   22   49:invokevirtual   #115 <Method String URL.toString()>
	//   23   52:astore_2        
		}
	//*  24   53:goto            233
	//*  25   56:aload_0         
	//*  26   57:new             #117 <Class WebView>
	//*  27   60:dup             
	//*  28   61:aload_1         
	//*  29   62:invokespecial   #119 <Method void WebView(Context)>
	//*  30   65:putfield        #42  <Field WebView _webView>
	//*  31   68:aload_0         
	//*  32   69:getfield        #42  <Field WebView _webView>
	//*  33   72:iconst_m1       
	//*  34   73:invokevirtual   #123 <Method void WebView.setBackgroundColor(int)>
	//*  35   76:aload_0         
	//*  36   77:getfield        #42  <Field WebView _webView>
	//*  37   80:iconst_1        
	//*  38   81:invokevirtual   #127 <Method void WebView.clearCache(boolean)>
	//*  39   84:aload_0         
	//*  40   85:getfield        #42  <Field WebView _webView>
	//*  41   88:invokevirtual   #131 <Method WebSettings WebView.getSettings()>
	//*  42   91:iconst_1        
	//*  43   92:invokevirtual   #136 <Method void WebSettings.setJavaScriptEnabled(boolean)>
	//*  44   95:aload_0         
	//*  45   96:getfield        #42  <Field WebView _webView>
	//*  46   99:invokevirtual   #131 <Method WebSettings WebView.getSettings()>
	//*  47  102:iconst_1        
	//*  48  103:invokevirtual   #139 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
	//*  49  106:aload_0         
	//*  50  107:getfield        #42  <Field WebView _webView>
	//*  51  110:invokevirtual   #131 <Method WebSettings WebView.getSettings()>
	//*  52  113:iconst_1        
	//*  53  114:invokevirtual   #142 <Method void WebSettings.setUseWideViewPort(boolean)>
	//*  54  117:aload_0         
	//*  55  118:getfield        #42  <Field WebView _webView>
	//*  56  121:invokevirtual   #131 <Method WebSettings WebView.getSettings()>
	//*  57  124:iconst_1        
	//*  58  125:invokevirtual   #145 <Method void WebSettings.setDomStorageEnabled(boolean)>
	//*  59  128:aload_0         
	//*  60  129:getfield        #42  <Field WebView _webView>
	//*  61  132:iconst_0        
	//*  62  133:invokevirtual   #148 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
	//*  63  136:aload_0         
	//*  64  137:getfield        #42  <Field WebView _webView>
	//*  65  140:iconst_0        
	//*  66  141:invokevirtual   #151 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
	//*  67  144:aload_0         
	//*  68  145:getfield        #42  <Field WebView _webView>
	//*  69  148:new             #6   <Class APSMediaPlayerVimeoOverlayController$1>
	//*  70  151:dup             
	//*  71  152:aload_0         
	//*  72  153:invokespecial   #154 <Method void APSMediaPlayerVimeoOverlayController$1(APSMediaPlayerVimeoOverlayController)>
	//*  73  156:invokevirtual   #158 <Method void WebView.setWebChromeClient(WebChromeClient)>
	//*  74  159:aload_0         
	//*  75  160:getfield        #42  <Field WebView _webView>
	//*  76  163:new             #8   <Class APSMediaPlayerVimeoOverlayController$2>
	//*  77  166:dup             
	//*  78  167:aload_0         
	//*  79  168:invokespecial   #159 <Method void APSMediaPlayerVimeoOverlayController$2(APSMediaPlayerVimeoOverlayController)>
	//*  80  171:invokevirtual   #163 <Method void WebView.setWebViewClient(WebViewClient)>
	//*  81  174:aload_0         
	//*  82  175:getfield        #42  <Field WebView _webView>
	//*  83  178:astore_1        
	//*  84  179:new             #165 <Class StringBuilder>
	//*  85  182:dup             
	//*  86  183:invokespecial   #166 <Method void StringBuilder()>
	//*  87  186:astore_3        
	//*  88  187:aload_3         
	//*  89  188:ldc1            #168 <String "http://player.vimeo.com/video/">
	//*  90  190:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  91  193:pop             
	//*  92  194:aload_3         
	//*  93  195:aload_2         
	//*  94  196:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  95  199:pop             
	//*  96  200:aload_3         
	//*  97  201:ldc1            #174 <String "?title=0&amp;autoplay=1&amp;byline=0&amp;portrait=0&amp;badge=0&amp;api=1&amp;player_id=player">
	//*  98  203:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//*  99  206:pop             
	//* 100  207:aload_1         
	//* 101  208:aload_3         
	//* 102  209:invokevirtual   #175 <Method String StringBuilder.toString()>
	//* 103  212:invokevirtual   #178 <Method void WebView.loadUrl(String)>
	//* 104  215:aload_0         
	//* 105  216:getfield        #42  <Field WebView _webView>
	//* 106  219:new             #10  <Class APSMediaPlayerVimeoOverlayController$3>
	//* 107  222:dup             
	//* 108  223:aload_0         
	//* 109  224:invokespecial   #179 <Method void APSMediaPlayerVimeoOverlayController$3(APSMediaPlayerVimeoOverlayController)>
	//* 110  227:invokevirtual   #183 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
	//* 111  230:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  231:astore_1        
		{
			return;
	//  113  232:return          
		}
		  goto _L3
_L5:
		_webView = new WebView(context);
		_webView.setBackgroundColor(-1);
		_webView.clearCache(true);
		_webView.getSettings().setJavaScriptEnabled(true);
		_webView.getSettings().setLoadWithOverviewMode(true);
		_webView.getSettings().setUseWideViewPort(true);
		_webView.getSettings().setDomStorageEnabled(true);
		_webView.setHorizontalScrollBarEnabled(false);
		_webView.setVerticalScrollBarEnabled(false);
		_webView.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public void onCloseWindow(WebView webview)
			{
				super.onCloseWindow(webview);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #23  <Method void WebChromeClient.onCloseWindow(WebView)>
			//    3    5:return          
			}

			public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
			{
				super.onShowCustomView(view, customviewcallback);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #27  <Method void WebChromeClient.onShowCustomView(View, android.webkit.WebChromeClient$CustomViewCallback)>
			//    4    6:return          
			}

			final APSMediaPlayerVimeoOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerVimeoOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
		_webView.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onLoadResource(WebView webview, String s)
			{
				super.onLoadResource(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void WebViewClient.onLoadResource(WebView, String)>
				if(s.equals("http://code.jquery.com/jquery-latest.min.js") && !_phase2)
			//*   4    6:aload_2         
			//*   5    7:ldc1            #25  <String "http://code.jquery.com/jquery-latest.min.js">
			//*   6    9:invokevirtual   #31  <Method boolean String.equals(Object)>
			//*   7   12:ifeq            34
			//*   8   15:aload_0         
			//*   9   16:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*  10   19:invokestatic    #35  <Method boolean APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController)>
			//*  11   22:ifne            34
					_phase2 = true;
			//   12   25:aload_0         
			//   13   26:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   14   29:iconst_1        
			//   15   30:invokestatic    #39  <Method boolean APSMediaPlayerVimeoOverlayController.access$002(APSMediaPlayerVimeoOverlayController, boolean)>
			//   16   33:pop             
				if(_phase2)
			//*  17   34:aload_0         
			//*  18   35:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*  19   38:invokestatic    #35  <Method boolean APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController)>
			//*  20   41:ifeq            56
					_webView.loadUrl("javascript:$(document).bind('DOMSubtreeModified',function(){if ($('video').length>0) {window.location='bridge://gotvid?'+escape($('video').attr('src')); $(document).unbind('DOMSubtreeModified');} })");
			//   21   44:aload_0         
			//   22   45:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   23   48:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
			//   24   51:ldc1            #45  <String "javascript:$(document).bind('DOMSubtreeModified',function(){if ($('video').length>0) {window.location='bridge://gotvid?'+escape($('video').attr('src')); $(document).unbind('DOMSubtreeModified');} })">
			//   25   53:invokevirtual   #51  <Method void WebView.loadUrl(String)>
			//   26   56:return          
			}

			public void onPageFinished(WebView webview, String s)
			{
				super.onPageFinished(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #54  <Method void WebViewClient.onPageFinished(WebView, String)>
				if(!_phase1)
			//*   4    6:aload_0         
			//*   5    7:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*   6   10:invokestatic    #57  <Method boolean APSMediaPlayerVimeoOverlayController.access$200(APSMediaPlayerVimeoOverlayController)>
			//*   7   13:ifne            38
				{
					_webView.loadUrl("javascript:var script=document.createElement('script');script.src='http://code.jquery.com/jquery-latest.min.js';var head=document.getElementsByTagName('head')[0];head.appendChild(script);");
			//    8   16:aload_0         
			//    9   17:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   10   20:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
			//   11   23:ldc1            #59  <String "javascript:var script=document.createElement('script');script.src='http://code.jquery.com/jquery-latest.min.js';var head=document.getElementsByTagName('head')[0];head.appendChild(script);">
			//   12   25:invokevirtual   #51  <Method void WebView.loadUrl(String)>
					_phase1 = true;
			//   13   28:aload_0         
			//   14   29:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   15   32:iconst_1        
			//   16   33:invokestatic    #62  <Method boolean APSMediaPlayerVimeoOverlayController.access$202(APSMediaPlayerVimeoOverlayController, boolean)>
			//   17   36:pop             
					return;
			//   18   37:return          
				}
				if(!_phase3)
			//*  19   38:aload_0         
			//*  20   39:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*  21   42:invokestatic    #65  <Method boolean APSMediaPlayerVimeoOverlayController.access$300(APSMediaPlayerVimeoOverlayController)>
			//*  22   45:ifne            69
				{
					_webView.loadUrl("javascript:$('button').trigger('click')");
			//   23   48:aload_0         
			//   24   49:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   25   52:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
			//   26   55:ldc1            #67  <String "javascript:$('button').trigger('click')">
			//   27   57:invokevirtual   #51  <Method void WebView.loadUrl(String)>
					_phase3 = true;
			//   28   60:aload_0         
			//   29   61:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   30   64:iconst_1        
			//   31   65:invokestatic    #70  <Method boolean APSMediaPlayerVimeoOverlayController.access$302(APSMediaPlayerVimeoOverlayController, boolean)>
			//   32   68:pop             
				}
			//   33   69:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				if(s.startsWith("bridge"))
			//*   0    0:aload_2         
			//*   1    1:ldc1            #76  <String "bridge">
			//*   2    3:invokevirtual   #80  <Method boolean String.startsWith(String)>
			//*   3    6:ifeq            128
				{
					if(s.contains("gotvid"))
			//*   4    9:aload_2         
			//*   5   10:ldc1            #82  <String "gotvid">
			//*   6   12:invokevirtual   #86  <Method boolean String.contains(CharSequence)>
			//*   7   15:ifeq            126
					{
						_webView.loadDataWithBaseURL(((String) (null)), "", "text/html", "UTF-8", ((String) (null)));
			//    8   18:aload_0         
			//    9   19:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//   10   22:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
			//   11   25:aconst_null     
			//   12   26:ldc1            #88  <String "">
			//   13   28:ldc1            #90  <String "text/html">
			//   14   30:ldc1            #92  <String "UTF-8">
			//   15   32:aconst_null     
			//   16   33:invokevirtual   #96  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
						try
						{
							webview = ((WebView) (URLDecoder.decode(s.replace("bridge://gotvid?", ""), "UTF-8")));
			//   17   36:aload_2         
			//   18   37:ldc1            #98  <String "bridge://gotvid?">
			//   19   39:ldc1            #88  <String "">
			//   20   41:invokevirtual   #102 <Method String String.replace(CharSequence, CharSequence)>
			//   21   44:ldc1            #92  <String "UTF-8">
			//   22   46:invokestatic    #108 <Method String URLDecoder.decode(String, String)>
			//   23   49:astore_1        
						}
			//*  24   50:goto            56
			//*  25   53:ldc1            #88  <String "">
			//*  26   55:astore_1        
			//*  27   56:aload_1         
			//*  28   57:astore_2        
			//*  29   58:aload_1         
			//*  30   59:ldc1            #110 <String "http">
			//*  31   61:invokevirtual   #80  <Method boolean String.startsWith(String)>
			//*  32   64:ifne            93
			//*  33   67:new             #112 <Class StringBuilder>
			//*  34   70:dup             
			//*  35   71:invokespecial   #113 <Method void StringBuilder()>
			//*  36   74:astore_2        
			//*  37   75:aload_2         
			//*  38   76:ldc1            #115 <String "http:">
			//*  39   78:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
			//*  40   81:pop             
			//*  41   82:aload_2         
			//*  42   83:aload_1         
			//*  43   84:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
			//*  44   87:pop             
			//*  45   88:aload_2         
			//*  46   89:invokevirtual   #123 <Method String StringBuilder.toString()>
			//*  47   92:astore_2        
			//*  48   93:invokestatic    #129 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//*  49   96:aload_2         
			//*  50   97:invokevirtual   #132 <Method void APSMediaPlayer.playVideo(String)>
			//*  51  100:invokestatic    #129 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//*  52  103:invokevirtual   #135 <Method void APSMediaPlayer.playerTapped()>
			//*  53  106:aload_0         
			//*  54  107:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*  55  110:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
			//*  56  113:iconst_0        
			//*  57  114:invokevirtual   #139 <Method void WebView.setBackgroundColor(int)>
			//*  58  117:aload_0         
			//*  59  118:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
			//*  60  121:fconst_0        
			//*  61  122:invokestatic    #143 <Method float APSMediaPlayerVimeoOverlayController.access$402(APSMediaPlayerVimeoOverlayController, float)>
			//*  62  125:pop             
			//*  63  126:iconst_1        
			//*  64  127:ireturn         
			//*  65  128:aload_2         
			//*  66  129:ldc1            #110 <String "http">
			//*  67  131:invokevirtual   #80  <Method boolean String.startsWith(String)>
			//*  68  134:ifne            151
			//*  69  137:aload_2         
			//*  70  138:ldc1            #145 <String "https">
			//*  71  140:invokevirtual   #80  <Method boolean String.startsWith(String)>
			//*  72  143:ifeq            149
			//*  73  146:goto            151
			//*  74  149:iconst_0        
			//*  75  150:ireturn         
			//*  76  151:invokestatic    #129 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//*  77  154:aload_2         
			//*  78  155:invokevirtual   #148 <Method boolean APSMediaPlayer.openURL(String)>
			//*  79  158:pop             
			//*  80  159:iconst_1        
			//*  81  160:ireturn         
						// Misplaced declaration of an exception variable
						catch(WebView webview)
						{
							webview = "";
						}
						s = ((String) (webview));
						if(!((String) (webview)).startsWith("http"))
						{
							s = ((String) (new StringBuilder()));
							((StringBuilder) (s)).append("http:");
							((StringBuilder) (s)).append(((String) (webview)));
							s = ((StringBuilder) (s)).toString();
						}
						APSMediaPlayer.getInstance().playVideo(s);
						APSMediaPlayer.getInstance().playerTapped();
						_webView.setBackgroundColor(0);
						_current_alpha = 0.0F;
					}
					return true;
				}
				if(!s.startsWith("http") && !s.startsWith("https"))
				{
					return false;
				} else
				{
					APSMediaPlayer.getInstance().openURL(s);
					return true;
				}
			//*  82  161:astore_1        
			//*  83  162:goto            53
			}

			final APSMediaPlayerVimeoOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerVimeoOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
		context = ((Context) (_webView));
		stringbuilder = new StringBuilder();
		stringbuilder.append("http://player.vimeo.com/video/");
		stringbuilder.append(((String) (obj)));
		stringbuilder.append("?title=0&amp;autoplay=1&amp;byline=0&amp;portrait=0&amp;badge=0&amp;api=1&amp;player_id=player");
		((WebView) (context)).loadUrl(stringbuilder.toString());
		_webView.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				view.performClick();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #33  <Method boolean View.performClick()>
			//    2    4:pop             
				if(motionevent.getAction() != 1)
					break MISSING_BLOCK_LABEL_56;
			//    3    5:aload_2         
			//    4    6:invokevirtual   #39  <Method int MotionEvent.getAction()>
			//    5    9:iconst_1        
			//    6   10:icmpne          56
				if(APSMediaPlayer.getInstance().playbackState() == com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying)
					break MISSING_BLOCK_LABEL_50;
			//    7   13:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    8   16:invokevirtual   #49  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer.playbackState()>
			//    9   19:getstatic       #55  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
			//   10   22:if_acmpeq       50
				APSMediaPlayer.getInstance().play();
			//   11   25:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   12   28:invokevirtual   #58  <Method void APSMediaPlayer.play()>
				return true;
			//   13   31:iconst_1        
			//   14   32:ireturn         
			//*  15   33:astore_1        
			//*  16   34:goto            44
				view;
			//   17   37:astore_1        
				try
				{
					((RootedPhoneException) (view)).printStackTrace();
			//   18   38:aload_1         
			//   19   39:invokevirtual   #61  <Method void RootedPhoneException.printStackTrace()>
				}
				// Misplaced declaration of an exception variable
				catch(View view)
			//*  20   42:iconst_1        
			//*  21   43:ireturn         
				{
					((LicenseInvalidException) (view)).printStackTrace();
			//   22   44:aload_1         
			//   23   45:invokevirtual   #62  <Method void LicenseInvalidException.printStackTrace()>
					return true;
			//   24   48:iconst_1        
			//   25   49:ireturn         
				}
				return true;
				APSMediaPlayer.getInstance().playerTapped();
			//   26   50:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   27   53:invokevirtual   #65  <Method void APSMediaPlayer.playerTapped()>
				return true;
			//   28   56:iconst_1        
			//   29   57:ireturn         
			}

			final APSMediaPlayerVimeoOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerVimeoOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerVimeoOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		return;
_L3:
		if(obj != null) goto _L5; else goto _L4
	//  114  233:aload_2         
	//  115  234:ifnonnull       56
_L4:
	//  116  237:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.vimeo";
	//    0    0:ldc1            #14  <String "com.appscend.mp.overlays.vimeo">
	//    1    2:areturn         
	}

	public static final String APSVimeoOverlay = "com.appscend.mp.overlays.vimeo";
	public static final String kAPSVimeoURL = "vimeo";
	private float _current_alpha;
	private boolean _phase1;
	private boolean _phase2;
	private boolean _phase3;
	private WebView _webView;


/*
	static boolean access$000(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller)
	{
		return apsmediaplayervimeooverlaycontroller._phase2;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean _phase2>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller, boolean flag)
	{
		apsmediaplayervimeooverlaycontroller._phase2 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean _phase2>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static WebView access$100(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller)
	{
		return apsmediaplayervimeooverlaycontroller._webView;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field WebView _webView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller)
	{
		return apsmediaplayervimeooverlaycontroller._phase1;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean _phase1>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$202(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller, boolean flag)
	{
		apsmediaplayervimeooverlaycontroller._phase1 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean _phase1>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$300(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller)
	{
		return apsmediaplayervimeooverlaycontroller._phase3;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean _phase3>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$302(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller, boolean flag)
	{
		apsmediaplayervimeooverlaycontroller._phase3 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean _phase3>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static float access$402(APSMediaPlayerVimeoOverlayController apsmediaplayervimeooverlaycontroller, float f)
	{
		apsmediaplayervimeooverlaycontroller._current_alpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #31  <Field float _current_alpha>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/
}

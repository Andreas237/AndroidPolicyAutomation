// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.*;
import android.webkit.*;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.media.events.APSMediaUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerJSYoutubeOverlayController extends APSMediaPlayerOverlayController
{
	public class JavaScriptInterface
	{

		public void retrievedValue(int i)
		{
			_retrievedValue = i;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		//    2    4:iload_1         
		//    3    5:invokestatic    #24  <Method int APSMediaPlayerJSYoutubeOverlayController.access$102(APSMediaPlayerJSYoutubeOverlayController, int)>
		//    4    8:pop             
		//    5    9:return          
		}

		final APSMediaPlayerJSYoutubeOverlayController this$0;

		public JavaScriptInterface()
		{
			this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}
	}


	public APSMediaPlayerJSYoutubeOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void APSMediaPlayerOverlayController()>
		latch = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #42  <Field CountDownLatch latch>
		_lastCurrent = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field int _lastCurrent>
		_lastDuration = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #46  <Field int _lastDuration>
	//   11   19:return          
	}

	private URL cleanupYoutubeUrl(String s)
		throws MalformedURLException
	{
		if(s.contains("youtu.be"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #69  <String "youtu.be">
	//*   2    3:invokevirtual   #75  <Method boolean String.contains(CharSequence)>
	//*   3    6:ifeq            51
		{
			s = ((String) (s.split("/")));
	//    4    9:aload_1         
	//    5   10:ldc1            #77  <String "/">
	//    6   12:invokevirtual   #81  <Method String[] String.split(String)>
	//    7   15:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #83  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #84  <Method void StringBuilder()>
	//   11   23:astore_2        
			stringbuilder.append("https://www.youtube.com/watch?v=");
	//   12   24:aload_2         
	//   13   25:ldc1            #86  <String "https://www.youtube.com/watch?v=">
	//   14   27:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(((String) (s[3])));
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:iconst_3        
	//   19   34:aaload          
	//   20   35:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			return new URL(stringbuilder.toString());
	//   22   39:new             #92  <Class URL>
	//   23   42:dup             
	//   24   43:aload_2         
	//   25   44:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   26   47:invokespecial   #99  <Method void URL(String)>
	//   27   50:areturn         
		} else
		{
			return new URL(s);
	//   28   51:new             #92  <Class URL>
	//   29   54:dup             
	//   30   55:aload_1         
	//   31   56:invokespecial   #99  <Method void URL(String)>
	//   32   59:areturn         
		}
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_webView)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field WebView _webView>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #108 <Method void ViewGroup.addView(View, int)>
	//    5    9:return          
	}

	public int currentPlaybackTime()
	{
		int i = ((Integer)stringByEvaluatingJavaScriptFromString("getCurrentTime()")).intValue() * 1000;
	//    0    0:aload_0         
	//    1    1:ldc1            #112 <String "getCurrentTime()">
	//    2    3:invokevirtual   #116 <Method Object stringByEvaluatingJavaScriptFromString(String)>
	//    3    6:checkcast       #118 <Class Integer>
	//    4    9:invokevirtual   #121 <Method int Integer.intValue()>
	//    5   12:sipush          1000
	//    6   15:imul            
	//    7   16:istore_1        
		if(_lastCurrent == 0 && i == _lastDuration)
	//*   8   17:aload_0         
	//*   9   18:getfield        #44  <Field int _lastCurrent>
	//*  10   21:ifne            34
	//*  11   24:iload_1         
	//*  12   25:aload_0         
	//*  13   26:getfield        #46  <Field int _lastDuration>
	//*  14   29:icmpne          34
		{
			return 0;
	//   15   32:iconst_0        
	//   16   33:ireturn         
		} else
		{
			_lastCurrent = i;
	//   17   34:aload_0         
	//   18   35:iload_1         
	//   19   36:putfield        #44  <Field int _lastCurrent>
			return i;
	//   20   39:iload_1         
	//   21   40:ireturn         
		}
	}

	public int duration()
	{
		_lastDuration = ((Integer)stringByEvaluatingJavaScriptFromString("getDuration()")).intValue() * 1000;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #124 <String "getDuration()">
	//    3    4:invokevirtual   #116 <Method Object stringByEvaluatingJavaScriptFromString(String)>
	//    4    7:checkcast       #118 <Class Integer>
	//    5   10:invokevirtual   #121 <Method int Integer.intValue()>
	//    6   13:sipush          1000
	//    7   16:imul            
	//    8   17:putfield        #46  <Field int _lastDuration>
		if(_lastDuration == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #46  <Field int _lastDuration>
	//*  11   24:ifne            29
			return 0;
	//   12   27:iconst_0        
	//   13   28:ireturn         
		if(!_started)
	//*  14   29:aload_0         
	//*  15   30:getfield        #51  <Field boolean _started>
	//*  16   33:ifne            71
		{
			if(_parentOverlay != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #63  <Field APSMediaOverlay _parentOverlay>
	//*  19   40:ifnull          60
				APSMediaPlayer.getInstance().getActivity().runOnUiThread(new Runnable() {

					public void run()
					{
						WebView webview = _webView;
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
						stringbuilder.append(_parentOverlay.parentUnit.initialPlaybackTime);
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
);
	//   20   43:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   21   46:invokevirtual   #134 <Method Activity APSMediaPlayer.getActivity()>
	//   22   49:new             #14  <Class APSMediaPlayerJSYoutubeOverlayController$5>
	//   23   52:dup             
	//   24   53:aload_0         
	//   25   54:invokespecial   #137 <Method void APSMediaPlayerJSYoutubeOverlayController$5(APSMediaPlayerJSYoutubeOverlayController)>
	//   26   57:invokevirtual   #143 <Method void Activity.runOnUiThread(Runnable)>
			APSMediaPlayer.getInstance().playerTapped();
	//   27   60:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   28   63:invokevirtual   #146 <Method void APSMediaPlayer.playerTapped()>
			_started = true;
	//   29   66:aload_0         
	//   30   67:iconst_1        
	//   31   68:putfield        #51  <Field boolean _started>
		}
		return _lastDuration;
	//   32   71:aload_0         
	//   33   72:getfield        #46  <Field int _lastDuration>
	//   34   75:ireturn         
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_webView));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WebView _webView>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
	//    0    0:return          
	}

	public void load(Context context)
	{
		int i;
		APSMediaPlayer.getInstance().playerTapped();
	//    0    0:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #146 <Method void APSMediaPlayer.playerTapped()>
		_webView = new WebView(context);
	//    2    6:aload_0         
	//    3    7:new             #158 <Class WebView>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #160 <Method void WebView(Context)>
	//    7   15:putfield        #59  <Field WebView _webView>
		_webView.setBackgroundColor(-1);
	//    8   18:aload_0         
	//    9   19:getfield        #59  <Field WebView _webView>
	//   10   22:iconst_m1       
	//   11   23:invokevirtual   #164 <Method void WebView.setBackgroundColor(int)>
		_webView.clearCache(true);
	//   12   26:aload_0         
	//   13   27:getfield        #59  <Field WebView _webView>
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #168 <Method void WebView.clearCache(boolean)>
		_webView.getSettings().setJavaScriptEnabled(true);
	//   16   34:aload_0         
	//   17   35:getfield        #59  <Field WebView _webView>
	//   18   38:invokevirtual   #172 <Method WebSettings WebView.getSettings()>
	//   19   41:iconst_1        
	//   20   42:invokevirtual   #177 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		_webView.getSettings().setLoadWithOverviewMode(true);
	//   21   45:aload_0         
	//   22   46:getfield        #59  <Field WebView _webView>
	//   23   49:invokevirtual   #172 <Method WebSettings WebView.getSettings()>
	//   24   52:iconst_1        
	//   25   53:invokevirtual   #180 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		_webView.getSettings().setUseWideViewPort(true);
	//   26   56:aload_0         
	//   27   57:getfield        #59  <Field WebView _webView>
	//   28   60:invokevirtual   #172 <Method WebSettings WebView.getSettings()>
	//   29   63:iconst_1        
	//   30   64:invokevirtual   #183 <Method void WebSettings.setUseWideViewPort(boolean)>
		_webView.getSettings().setDomStorageEnabled(true);
	//   31   67:aload_0         
	//   32   68:getfield        #59  <Field WebView _webView>
	//   33   71:invokevirtual   #172 <Method WebSettings WebView.getSettings()>
	//   34   74:iconst_1        
	//   35   75:invokevirtual   #186 <Method void WebSettings.setDomStorageEnabled(boolean)>
		_webView.setHorizontalScrollBarEnabled(false);
	//   36   78:aload_0         
	//   37   79:getfield        #59  <Field WebView _webView>
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #189 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
		_webView.setVerticalScrollBarEnabled(false);
	//   40   86:aload_0         
	//   41   87:getfield        #59  <Field WebView _webView>
	//   42   90:iconst_0        
	//   43   91:invokevirtual   #192 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		_webView.addJavascriptInterface(((Object) (new JavaScriptInterface())), "androidInterface");
	//   44   94:aload_0         
	//   45   95:getfield        #59  <Field WebView _webView>
	//   46   98:new             #16  <Class APSMediaPlayerJSYoutubeOverlayController$JavaScriptInterface>
	//   47  101:dup             
	//   48  102:aload_0         
	//   49  103:invokespecial   #193 <Method void APSMediaPlayerJSYoutubeOverlayController$JavaScriptInterface(APSMediaPlayerJSYoutubeOverlayController)>
	//   50  106:ldc1            #195 <String "androidInterface">
	//   51  108:invokevirtual   #199 <Method void WebView.addJavascriptInterface(Object, String)>
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

			final APSMediaPlayerJSYoutubeOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//   52  111:aload_0         
	//   53  112:getfield        #59  <Field WebView _webView>
	//   54  115:new             #6   <Class APSMediaPlayerJSYoutubeOverlayController$1>
	//   55  118:dup             
	//   56  119:aload_0         
	//   57  120:invokespecial   #200 <Method void APSMediaPlayerJSYoutubeOverlayController$1(APSMediaPlayerJSYoutubeOverlayController)>
	//   58  123:invokevirtual   #204 <Method void WebView.setWebChromeClient(WebChromeClient)>
		_webView.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public boolean shouldOverrideUrlLoading(WebView webview, String s1)
			{
				if(s1.startsWith("bridge"))
			//*   0    0:aload_2         
			//*   1    1:ldc1            #23  <String "bridge">
			//*   2    3:invokevirtual   #29  <Method boolean String.startsWith(String)>
			//*   3    6:ifeq            66
				{
					if(s1.endsWith("playerStateChanged"))
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
					if(s1.endsWith("videoEnded") || s1.endsWith("errorOccured"))
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
				if(!s1.startsWith("http") && !s1.startsWith("https"))
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
					APSMediaPlayer.getInstance().openURL(s1);
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
)));
	//   59  126:aload_0         
	//   60  127:getfield        #59  <Field WebView _webView>
	//   61  130:new             #8   <Class APSMediaPlayerJSYoutubeOverlayController$2>
	//   62  133:dup             
	//   63  134:aload_0         
	//   64  135:invokespecial   #205 <Method void APSMediaPlayerJSYoutubeOverlayController$2(APSMediaPlayerJSYoutubeOverlayController)>
	//   65  138:invokevirtual   #209 <Method void WebView.setWebViewClient(WebViewClient)>
		int j;
		Object obj;
		String as[];
		String s;
		String as1[];
		try
		{
			obj = ((Object) (cleanupYoutubeUrl((String)overlay.parameters.get("youtube"))));
	//   66  141:aload_0         
	//   67  142:aload_0         
	//   68  143:getfield        #212 <Field APSMediaOverlay overlay>
	//   69  146:getfield        #218 <Field HashMap APSMediaOverlay.parameters>
	//   70  149:ldc1            #24  <String "youtube">
	//   71  151:invokevirtual   #224 <Method Object HashMap.get(Object)>
	//   72  154:checkcast       #71  <Class String>
	//   73  157:invokespecial   #226 <Method URL cleanupYoutubeUrl(String)>
	//   74  160:astore          4
		}
	//*  75  162:aconst_null     
	//*  76  163:astore_1        
	//*  77  164:aload           4
	//*  78  166:invokevirtual   #229 <Method String URL.getProtocol()>
	//*  79  169:ifnull          270
	//*  80  172:aload           4
	//*  81  174:invokevirtual   #232 <Method String URL.getQuery()>
	//*  82  177:ldc1            #234 <String "&">
	//*  83  179:invokevirtual   #81  <Method String[] String.split(String)>
	//*  84  182:astore          5
	//*  85  184:new             #220 <Class HashMap>
	//*  86  187:dup             
	//*  87  188:invokespecial   #235 <Method void HashMap()>
	//*  88  191:astore          4
	//*  89  193:aload           5
	//*  90  195:arraylength     
	//*  91  196:istore_3        
	//*  92  197:iconst_0        
	//*  93  198:istore_2        
	//*  94  199:iload_2         
	//*  95  200:iload_3         
	//*  96  201:icmpge          246
	//*  97  204:aload           5
	//*  98  206:iload_2         
	//*  99  207:aaload          
	//* 100  208:astore          6
	//* 101  210:aload           6
	//* 102  212:ldc1            #237 <String "=">
	//* 103  214:invokevirtual   #75  <Method boolean String.contains(CharSequence)>
	//* 104  217:ifeq            350
	//* 105  220:aload           6
	//* 106  222:ldc1            #237 <String "=">
	//* 107  224:invokevirtual   #81  <Method String[] String.split(String)>
	//* 108  227:astore          6
	//* 109  229:aload           4
	//* 110  231:aload           6
	//* 111  233:iconst_0        
	//* 112  234:aaload          
	//* 113  235:aload           6
	//* 114  237:iconst_1        
	//* 115  238:aaload          
	//* 116  239:invokevirtual   #241 <Method Object HashMap.put(Object, Object)>
	//* 117  242:pop             
	//* 118  243:goto            350
	//* 119  246:aload           4
	//* 120  248:ldc1            #243 <String "v">
	//* 121  250:invokevirtual   #224 <Method Object HashMap.get(Object)>
	//* 122  253:ifnull          357
	//* 123  256:aload           4
	//* 124  258:ldc1            #243 <String "v">
	//* 125  260:invokevirtual   #224 <Method Object HashMap.get(Object)>
	//* 126  263:checkcast       #71  <Class String>
	//* 127  266:astore_1        
	//* 128  267:goto            357
	//* 129  270:aload           4
	//* 130  272:invokevirtual   #244 <Method String URL.toString()>
	//* 131  275:astore_1        
	//* 132  276:goto            357
	//* 133  279:new             #83  <Class StringBuilder>
	//* 134  282:dup             
	//* 135  283:invokespecial   #84  <Method void StringBuilder()>
	//* 136  286:astore          4
	//* 137  288:aload           4
	//* 138  290:ldc1            #246 <String "<html><head><meta name='viewport' content='initial-scale=1, maximum-scale=1'><style type='text/css'>.videoWrapper{position: relative;height: 100%%;}.videoWrapper iframe{position: absolute;top: 0;left: 0;width: 100%%;height: 100%%;}</style></head><body style='margin:0px;padding:0px; background-color:black;'><div class='videoWrapper'><div id='player'></div></div><script>var tag=document.createElement('script');tag.src='https://www.youtube.com/iframe_api';var firstScriptTag=document.getElementsByTagName('script')[0];firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);var player;function onYouTubeIframeAPIReady(){player=new YT.Player('player',{height: Math.max(document.documentElement.clientHeight, window.innerHeight || 0), width: Math.max(document.documentElement.clientWidth, window.innerWidth || 0), videoId: '">
	//* 139  292:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//* 140  295:pop             
	//* 141  296:aload           4
	//* 142  298:aload_1         
	//* 143  299:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//* 144  302:pop             
	//* 145  303:aload           4
	//* 146  305:ldc1            #248 <String "', playerVars:{'controls': 0, 'playsinline': 1, 'rel': 0}, events:{'onStateChange': onPlayerStateChange, 'onError': onPlayerError,'onReady': onPlayerReady}});};function onPlayerError(event){window.location='bridge://errorOccured'};function onPlayerStateChange(event){if (event.data == 0) window.location='bridge://videoEnded'; else window.location='bridge://playerStateChanged';}function onPlayerReady(event) {window.location='bridge://playerStateChanged';}function getPlayerState(){androidInterface.retrievedValue(player.getPlayerState())}function getDuration(){ var duration = player.getDuration(); if(duration<10) duration = 200; androidInterface.retrievedValue(duration)}function getCurrentTime(){androidInterface.retrievedValue(player.getCurrentTime())}function getVideoLoadedFraction(){androidInterface.retrievedValue(player.getVideoLoadedFraction())}</script></body></html>">
	//* 147  307:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//* 148  310:pop             
	//* 149  311:aload           4
	//* 150  313:invokevirtual   #96  <Method String StringBuilder.toString()>
	//* 151  316:astore_1        
	//* 152  317:aload_0         
	//* 153  318:getfield        #59  <Field WebView _webView>
	//* 154  321:ldc1            #250 <String "http://www.youtube.com">
	//* 155  323:aload_1         
	//* 156  324:ldc1            #252 <String "text/html">
	//* 157  326:ldc1            #254 <String "UTF-8">
	//* 158  328:aconst_null     
	//* 159  329:invokevirtual   #258 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
	//* 160  332:aload_0         
	//* 161  333:getfield        #59  <Field WebView _webView>
	//* 162  336:new             #10  <Class APSMediaPlayerJSYoutubeOverlayController$3>
	//* 163  339:dup             
	//* 164  340:aload_0         
	//* 165  341:invokespecial   #259 <Method void APSMediaPlayerJSYoutubeOverlayController$3(APSMediaPlayerJSYoutubeOverlayController)>
	//* 166  344:invokevirtual   #263 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
	//* 167  347:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 168  348:astore_1        
		{
			return;
	//  169  349:return          
		}
		context = null;
		if(((URL) (obj)).getProtocol() == null) goto _L2; else goto _L1
_L1:
		as = ((URL) (obj)).getQuery().split("&");
		obj = ((Object) (new HashMap()));
		j = as.length;
		i = 0;
_L10:
		if(i >= j) goto _L4; else goto _L3
_L3:
		s = as[i];
		if(s.contains("="))
		{
			as1 = s.split("=");
			((HashMap) (obj)).put(((Object) (as1[0])), ((Object) (as1[1])));
		}
		  goto _L5
_L4:
		if(((HashMap) (obj)).get("v") != null)
			context = ((Context) ((String)((HashMap) (obj)).get("v")));
		  goto _L6
_L2:
		context = ((Context) (((URL) (obj)).toString()));
		  goto _L6
_L8:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("<html><head><meta name='viewport' content='initial-scale=1, maximum-scale=1'><style type='text/css'>.videoWrapper{position: relative;height: 100%%;}.videoWrapper iframe{position: absolute;top: 0;left: 0;width: 100%%;height: 100%%;}</style></head><body style='margin:0px;padding:0px; background-color:black;'><div class='videoWrapper'><div id='player'></div></div><script>var tag=document.createElement('script');tag.src='https://www.youtube.com/iframe_api';var firstScriptTag=document.getElementsByTagName('script')[0];firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);var player;function onYouTubeIframeAPIReady(){player=new YT.Player('player',{height: Math.max(document.documentElement.clientHeight, window.innerHeight || 0), width: Math.max(document.documentElement.clientWidth, window.innerWidth || 0), videoId: '");
		((StringBuilder) (obj)).append(((String) (context)));
		((StringBuilder) (obj)).append("', playerVars:{'controls': 0, 'playsinline': 1, 'rel': 0}, events:{'onStateChange': onPlayerStateChange, 'onError': onPlayerError,'onReady': onPlayerReady}});};function onPlayerError(event){window.location='bridge://errorOccured'};function onPlayerStateChange(event){if (event.data == 0) window.location='bridge://videoEnded'; else window.location='bridge://playerStateChanged';}function onPlayerReady(event) {window.location='bridge://playerStateChanged';}function getPlayerState(){androidInterface.retrievedValue(player.getPlayerState())}function getDuration(){ var duration = player.getDuration(); if(duration<10) duration = 200; androidInterface.retrievedValue(duration)}function getCurrentTime(){androidInterface.retrievedValue(player.getCurrentTime())}function getVideoLoadedFraction(){androidInterface.retrievedValue(player.getVideoLoadedFraction())}</script></body></html>");
		context = ((Context) (((StringBuilder) (obj)).toString()));
		_webView.loadDataWithBaseURL("http://www.youtube.com", ((String) (context)), "text/html", "UTF-8", ((String) (null)));
		_webView.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				view.performClick();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method boolean View.performClick()>
			//    2    4:pop             
				if(motionevent.getAction() == 1 && _started)
			//*   3    5:aload_2         
			//*   4    6:invokevirtual   #35  <Method int MotionEvent.getAction()>
			//*   5    9:iconst_1        
			//*   6   10:icmpne          29
			//*   7   13:aload_0         
			//*   8   14:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
			//*   9   17:invokestatic    #39  <Method boolean APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController)>
			//*  10   20:ifeq            29
					APSMediaPlayer.getInstance().playerTapped();
			//   11   23:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   12   26:invokevirtual   #48  <Method void APSMediaPlayer.playerTapped()>
				return _started;
			//   13   29:aload_0         
			//   14   30:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
			//   15   33:invokestatic    #39  <Method boolean APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController)>
			//   16   36:ireturn         
			}

			final APSMediaPlayerJSYoutubeOverlayController this$0;

			
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
);
		return;
_L5:
		i++;
	//  170  350:iload_2         
	//  171  351:iconst_1        
	//  172  352:iadd            
	//  173  353:istore_2        
		continue; /* Loop/switch isn't completed */
	//  174  354:goto            199
_L6:
		if(context != null) goto _L8; else goto _L7
	//  175  357:aload_1         
	//  176  358:ifnonnull       279
_L7:
		return;
	//  177  361:return          
		if(true) goto _L10; else goto _L9
_L9:
	}

	public void pause()
	{
		_webView.loadUrl("javascript:player.pauseVideo()");
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WebView _webView>
	//    2    4:ldc2            #267 <String "javascript:player.pauseVideo()">
	//    3    7:invokevirtual   #270 <Method void WebView.loadUrl(String)>
	//    4   10:return          
	}

	public void play()
	{
		if(!_started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean _started>
	//*   2    4:ifne            97
		{
			long l = SystemClock.uptimeMillis();
	//    3    7:invokestatic    #277 <Method long SystemClock.uptimeMillis()>
	//    4   10:lstore          5
			int i = _webView.getWidth() / 2;
	//    5   12:aload_0         
	//    6   13:getfield        #59  <Field WebView _webView>
	//    7   16:invokevirtual   #280 <Method int WebView.getWidth()>
	//    8   19:iconst_2        
	//    9   20:idiv            
	//   10   21:istore_3        
			int j = _webView.getHeight() / 2;
	//   11   22:aload_0         
	//   12   23:getfield        #59  <Field WebView _webView>
	//   13   26:invokevirtual   #283 <Method int WebView.getHeight()>
	//   14   29:iconst_2        
	//   15   30:idiv            
	//   16   31:istore          4
			float f = i;
	//   17   33:iload_3         
	//   18   34:i2f             
	//   19   35:fstore_1        
			float f1 = j;
	//   20   36:iload           4
	//   21   38:i2f             
	//   22   39:fstore_2        
			MotionEvent motionevent = MotionEvent.obtain(l, l, 0, f, f1, 0);
	//   23   40:lload           5
	//   24   42:lload           5
	//   25   44:iconst_0        
	//   26   45:fload_1         
	//   27   46:fload_2         
	//   28   47:iconst_0        
	//   29   48:invokestatic    #289 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   30   51:astore          7
			_webView.dispatchTouchEvent(motionevent);
	//   31   53:aload_0         
	//   32   54:getfield        #59  <Field WebView _webView>
	//   33   57:aload           7
	//   34   59:invokevirtual   #293 <Method boolean WebView.dispatchTouchEvent(MotionEvent)>
	//   35   62:pop             
			motionevent.recycle();
	//   36   63:aload           7
	//   37   65:invokevirtual   #296 <Method void MotionEvent.recycle()>
			motionevent = MotionEvent.obtain(l, l, 1, f, f1, 0);
	//   38   68:lload           5
	//   39   70:lload           5
	//   40   72:iconst_1        
	//   41   73:fload_1         
	//   42   74:fload_2         
	//   43   75:iconst_0        
	//   44   76:invokestatic    #289 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   45   79:astore          7
			_webView.dispatchTouchEvent(motionevent);
	//   46   81:aload_0         
	//   47   82:getfield        #59  <Field WebView _webView>
	//   48   85:aload           7
	//   49   87:invokevirtual   #293 <Method boolean WebView.dispatchTouchEvent(MotionEvent)>
	//   50   90:pop             
			motionevent.recycle();
	//   51   91:aload           7
	//   52   93:invokevirtual   #296 <Method void MotionEvent.recycle()>
			return;
	//   53   96:return          
		} else
		{
			_webView.loadUrl("javascript:player.playVideo()");
	//   54   97:aload_0         
	//   55   98:getfield        #59  <Field WebView _webView>
	//   56  101:ldc2            #298 <String "javascript:player.playVideo()">
	//   57  104:invokevirtual   #270 <Method void WebView.loadUrl(String)>
			return;
	//   58  107:return          
		}
	}

	public int playableDuration()
	{
		return ((Integer)stringByEvaluatingJavaScriptFromString("getVideoLoadedFraction()")).intValue();
	//    0    0:aload_0         
	//    1    1:ldc2            #301 <String "getVideoLoadedFraction()">
	//    2    4:invokevirtual   #116 <Method Object stringByEvaluatingJavaScriptFromString(String)>
	//    3    7:checkcast       #118 <Class Integer>
	//    4   10:invokevirtual   #121 <Method int Integer.intValue()>
	//    5   13:ireturn         
	}

	public com.appscend.media.APSMediaPlayer.MPMoviePlaybackState playbackState()
	{
		Object obj = stringByEvaluatingJavaScriptFromString("getPlayerState()");
	//    0    0:aload_0         
	//    1    1:ldc2            #305 <String "getPlayerState()">
	//    2    4:invokevirtual   #116 <Method Object stringByEvaluatingJavaScriptFromString(String)>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       16
			return com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped;
	//    6   12:getstatic       #311 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//    7   15:areturn         
		int i = ((Integer)obj).intValue();
	//    8   16:aload_2         
	//    9   17:checkcast       #118 <Class Integer>
	//   10   20:invokevirtual   #121 <Method int Integer.intValue()>
	//   11   23:istore_1        
		if(i != 5)
	//*  12   24:iload_1         
	//*  13   25:iconst_5        
	//*  14   26:icmpeq          76
			switch(i)
	//*  15   29:iload_1         
			{
	//*  16   30:tableswitch     -1 3: default 64
	//	               -1 76
	//	               0 76
	//	               1 72
	//	               2 68
	//	               3 76
			default:
				return com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped;
	//   17   64:getstatic       #311 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//   18   67:areturn         

			case 2: // '\002'
				return com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused;
	//   19   68:getstatic       #314 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//   20   71:areturn         

			case 1: // '\001'
				return com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying;
	//   21   72:getstatic       #317 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   22   75:areturn         

			case -1: 
			case 0: // '\0'
			case 3: // '\003'
				break;
			}
		return com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackStopped;
	//   23   76:getstatic       #311 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//   24   79:areturn         
	}

	public void setCurrentPlaybackTime(int i)
	{
		WebView webview = _webView;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WebView _webView>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #83  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("javascript:player.seekTo(");
	//    7   13:aload_3         
	//    8   14:ldc2            #320 <String "javascript:player.seekTo(">
	//    9   17:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(i / 1000);
	//   11   21:aload_3         
	//   12   22:iload_1         
	//   13   23:sipush          1000
	//   14   26:idiv            
	//   15   27:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		stringbuilder.append(", true)");
	//   17   31:aload_3         
	//   18   32:ldc2            #325 <String ", true)">
	//   19   35:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		webview.loadUrl(stringbuilder.toString());
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   24   44:invokevirtual   #270 <Method void WebView.loadUrl(String)>
	//   25   47:return          
	}

	public void setParentOverlay(APSMediaOverlay apsmediaoverlay)
	{
		_parentOverlay = apsmediaoverlay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field APSMediaOverlay _parentOverlay>
	//    3    5:return          
	}

	public void stop()
	{
		pause();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method void pause()>
		APSMediaPlayer.getInstance().next();
	//    2    4:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    3    7:invokevirtual   #333 <Method void APSMediaPlayer.next()>
	//    4   10:return          
	}

	public Object stringByEvaluatingJavaScriptFromString(final String eval)
	{
		if(APSMediaPlayer.getInstance().getActivity() == null)
	//*   0    0:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   1    3:invokevirtual   #134 <Method Activity APSMediaPlayer.getActivity()>
	//*   2    6:ifnonnull       14
			return ((Object) (Integer.valueOf(-1)));
	//    3    9:iconst_m1       
	//    4   10:invokestatic    #339 <Method Integer Integer.valueOf(int)>
	//    5   13:areturn         
		APSMediaPlayer.getInstance().getActivity().runOnUiThread(new Runnable() {

			public void run()
			{
				WebView webview = _webView;
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
				stringbuilder.append(eval);
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

			
			{
				this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
				eval = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$eval>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    6   14:invokestatic    #130 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    7   17:invokevirtual   #134 <Method Activity APSMediaPlayer.getActivity()>
	//    8   20:new             #12  <Class APSMediaPlayerJSYoutubeOverlayController$4>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokespecial   #342 <Method void APSMediaPlayerJSYoutubeOverlayController$4(APSMediaPlayerJSYoutubeOverlayController, String)>
	//   13   29:invokevirtual   #143 <Method void Activity.runOnUiThread(Runnable)>
		latch = new CountDownLatch(1);
	//   14   32:aload_0         
	//   15   33:new             #344 <Class CountDownLatch>
	//   16   36:dup             
	//   17   37:iconst_1        
	//   18   38:invokespecial   #346 <Method void CountDownLatch(int)>
	//   19   41:putfield        #42  <Field CountDownLatch latch>
		try
		{
			latch.await(10L, TimeUnit.MILLISECONDS);
	//   20   44:aload_0         
	//   21   45:getfield        #42  <Field CountDownLatch latch>
	//   22   48:ldc2w           #347 <Long 10L>
	//   23   51:getstatic       #354 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   24   54:invokevirtual   #358 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//   25   57:pop             
		}
	//*  26   58:aload_0         
	//*  27   59:getfield        #55  <Field int _retrievedValue>
	//*  28   62:invokestatic    #339 <Method Integer Integer.valueOf(int)>
	//*  29   65:areturn         
		// Misplaced declaration of an exception variable
		catch(final String eval) { }
	//   30   66:astore_1        
		return ((Object) (Integer.valueOf(_retrievedValue)));
	//*  31   67:goto            58
	}

	public String type()
	{
		return "com.appscend.mp.overlays.js.youtube";
	//    0    0:ldc1            #21  <String "com.appscend.mp.overlays.js.youtube">
	//    1    2:areturn         
	}

	public static final String APSYoutubeOverlay = "com.appscend.mp.overlays.js.youtube";
	public static final String kAPSYoutubeURL = "youtube";
	private int _lastCurrent;
	private int _lastDuration;
	private APSMediaOverlay _parentOverlay;
	private int _retrievedValue;
	private boolean _started;
	private WebView _webView;
	private CountDownLatch latch;


/*
	static boolean access$000(APSMediaPlayerJSYoutubeOverlayController apsmediaplayerjsyoutubeoverlaycontroller)
	{
		return apsmediaplayerjsyoutubeoverlaycontroller._started;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean _started>
	//    2    4:ireturn         
	}

*/


/*
	static int access$102(APSMediaPlayerJSYoutubeOverlayController apsmediaplayerjsyoutubeoverlaycontroller, int i)
	{
		apsmediaplayerjsyoutubeoverlaycontroller._retrievedValue = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int _retrievedValue>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static WebView access$200(APSMediaPlayerJSYoutubeOverlayController apsmediaplayerjsyoutubeoverlaycontroller)
	{
		return apsmediaplayerjsyoutubeoverlaycontroller._webView;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field WebView _webView>
	//    2    4:areturn         
	}

*/


/*
	static APSMediaOverlay access$300(APSMediaPlayerJSYoutubeOverlayController apsmediaplayerjsyoutubeoverlaycontroller)
	{
		return apsmediaplayerjsyoutubeoverlaycontroller._parentOverlay;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field APSMediaOverlay _parentOverlay>
	//    2    4:areturn         
	}

*/
}

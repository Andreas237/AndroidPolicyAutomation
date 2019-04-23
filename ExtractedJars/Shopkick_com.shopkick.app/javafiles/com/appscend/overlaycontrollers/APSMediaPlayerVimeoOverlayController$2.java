// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appscend.media.APSMediaPlayer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerVimeoOverlayController

class APSMediaPlayerVimeoOverlayController$2 extends WebViewClient
{

	public void onLoadResource(WebView webview, String s)
	{
		super.onLoadResource(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void WebViewClient.onLoadResource(WebView, String)>
		if(s.equals("http://code.jquery.com/jquery-latest.min.js") && !APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController.this))
	//*   4    6:aload_2         
	//*   5    7:ldc1            #25  <String "http://code.jquery.com/jquery-latest.min.js">
	//*   6    9:invokevirtual   #31  <Method boolean String.equals(Object)>
	//*   7   12:ifeq            34
	//*   8   15:aload_0         
	//*   9   16:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//*  10   19:invokestatic    #35  <Method boolean APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController)>
	//*  11   22:ifne            34
			APSMediaPlayerVimeoOverlayController.access$002(APSMediaPlayerVimeoOverlayController.this, true);
	//   12   25:aload_0         
	//   13   26:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//   14   29:iconst_1        
	//   15   30:invokestatic    #39  <Method boolean APSMediaPlayerVimeoOverlayController.access$002(APSMediaPlayerVimeoOverlayController, boolean)>
	//   16   33:pop             
		if(APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController.this))
	//*  17   34:aload_0         
	//*  18   35:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//*  19   38:invokestatic    #35  <Method boolean APSMediaPlayerVimeoOverlayController.access$000(APSMediaPlayerVimeoOverlayController)>
	//*  20   41:ifeq            56
			APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController.this).loadUrl("javascript:$(document).bind('DOMSubtreeModified',function(){if ($('video').length>0) {window.location='bridge://gotvid?'+escape($('video').attr('src')); $(document).unbind('DOMSubtreeModified');} })");
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
		if(!APSMediaPlayerVimeoOverlayController.access$200(APSMediaPlayerVimeoOverlayController.this))
	//*   4    6:aload_0         
	//*   5    7:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//*   6   10:invokestatic    #57  <Method boolean APSMediaPlayerVimeoOverlayController.access$200(APSMediaPlayerVimeoOverlayController)>
	//*   7   13:ifne            38
		{
			APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController.this).loadUrl("javascript:var script=document.createElement('script');script.src='http://code.jquery.com/jquery-latest.min.js';var head=document.getElementsByTagName('head')[0];head.appendChild(script);");
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//   10   20:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
	//   11   23:ldc1            #59  <String "javascript:var script=document.createElement('script');script.src='http://code.jquery.com/jquery-latest.min.js';var head=document.getElementsByTagName('head')[0];head.appendChild(script);">
	//   12   25:invokevirtual   #51  <Method void WebView.loadUrl(String)>
			APSMediaPlayerVimeoOverlayController.access$202(APSMediaPlayerVimeoOverlayController.this, true);
	//   13   28:aload_0         
	//   14   29:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//   15   32:iconst_1        
	//   16   33:invokestatic    #62  <Method boolean APSMediaPlayerVimeoOverlayController.access$202(APSMediaPlayerVimeoOverlayController, boolean)>
	//   17   36:pop             
			return;
	//   18   37:return          
		}
		if(!APSMediaPlayerVimeoOverlayController.access$300(APSMediaPlayerVimeoOverlayController.this))
	//*  19   38:aload_0         
	//*  20   39:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//*  21   42:invokestatic    #65  <Method boolean APSMediaPlayerVimeoOverlayController.access$300(APSMediaPlayerVimeoOverlayController)>
	//*  22   45:ifne            69
		{
			APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController.this).loadUrl("javascript:$('button').trigger('click')");
	//   23   48:aload_0         
	//   24   49:getfield        #15  <Field APSMediaPlayerVimeoOverlayController this$0>
	//   25   52:invokestatic    #43  <Method WebView APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController)>
	//   26   55:ldc1            #67  <String "javascript:$('button').trigger('click')">
	//   27   57:invokevirtual   #51  <Method void WebView.loadUrl(String)>
			APSMediaPlayerVimeoOverlayController.access$302(APSMediaPlayerVimeoOverlayController.this, true);
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
				APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController.this).loadDataWithBaseURL(((String) (null)), "", "text/html", "UTF-8", ((String) (null)));
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
				APSMediaPlayerVimeoOverlayController.access$100(APSMediaPlayerVimeoOverlayController.this).setBackgroundColor(0);
				APSMediaPlayerVimeoOverlayController.access$402(APSMediaPlayerVimeoOverlayController.this, 0.0F);
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

	APSMediaPlayerVimeoOverlayController$2()
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

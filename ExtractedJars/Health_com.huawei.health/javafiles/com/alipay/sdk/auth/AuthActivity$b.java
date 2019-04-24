// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.alipay.sdk.auth;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.*;
import o.ga;
import o.hr;

// Referenced classes of package com.alipay.sdk.auth:
//			AuthActivity

public final class AuthActivity$b extends WebViewClient
{

	public final void onPageFinished(WebView webview, String s)
	{
		AuthActivity.f(a);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AuthActivity a>
	//    2    4:invokestatic    #25  <Method void AuthActivity.f(AuthActivity)>
		AuthActivity.g(a).removeCallbacks(AuthActivity.d(a));
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field AuthActivity a>
	//    5   11:invokestatic    #29  <Method Handler AuthActivity.g(AuthActivity)>
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field AuthActivity a>
	//    8   18:invokestatic    #33  <Method Runnable AuthActivity.d(AuthActivity)>
	//    9   21:invokevirtual   #39  <Method void Handler.removeCallbacks(Runnable)>
	//   10   24:return          
	}

	public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		AuthActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AuthActivity a>
	//    2    4:invokestatic    #43  <Method void AuthActivity.a(AuthActivity)>
		AuthActivity.g(a).postDelayed(AuthActivity.d(a), 30000L);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field AuthActivity a>
	//    5   11:invokestatic    #29  <Method Handler AuthActivity.g(AuthActivity)>
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field AuthActivity a>
	//    8   18:invokestatic    #33  <Method Runnable AuthActivity.d(AuthActivity)>
	//    9   21:ldc2w           #44  <Long 30000L>
	//   10   24:invokevirtual   #49  <Method boolean Handler.postDelayed(Runnable, long)>
	//   11   27:pop             
		super.onPageStarted(webview, s, bitmap);
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:aload_2         
	//   15   31:aload_3         
	//   16   32:invokespecial   #51  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
	//   17   35:return          
	}

	public final void onReceivedError(WebView webview, int i, String s, String s1)
	{
		AuthActivity.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AuthActivity a>
	//    2    4:invokestatic    #56  <Method boolean AuthActivity.b(AuthActivity)>
	//    3    7:pop             
		super.onReceivedError(webview, i, s, s1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #58  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
	//   10   17:return          
	}

	public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
	{
		if(AuthActivity.c(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field AuthActivity a>
	//*   2    4:invokestatic    #63  <Method boolean AuthActivity.c(AuthActivity)>
	//*   3    7:ifeq            24
		{
			sslerrorhandler.proceed();
	//    4   10:aload_2         
	//    5   11:invokevirtual   #68  <Method void SslErrorHandler.proceed()>
			AuthActivity.a(a, false);
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field AuthActivity a>
	//    8   18:iconst_0        
	//    9   19:invokestatic    #71  <Method boolean AuthActivity.a(AuthActivity, boolean)>
	//   10   22:pop             
			return;
	//   11   23:return          
		} else
		{
			a.runOnUiThread(((Runnable) (new ga(this, sslerrorhandler))));
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field AuthActivity a>
	//   14   28:new             #73  <Class ga>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #76  <Method void ga(AuthActivity$b, SslErrorHandler)>
	//   19   37:invokevirtual   #79  <Method void AuthActivity.runOnUiThread(Runnable)>
			return;
	//   20   40:return          
		}
	}

	public final boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(!s.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !s.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase()))
			break MISSING_BLOCK_LABEL_97;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #89  <Method String String.toLowerCase()>
	//    2    4:ldc1            #91  <String "alipays://platformapi/startApp?">
	//    3    6:invokevirtual   #89  <Method String String.toLowerCase()>
	//    4    9:invokevirtual   #95  <Method boolean String.startsWith(String)>
	//    5   12:ifne            30
	//    6   15:aload_2         
	//    7   16:invokevirtual   #89  <Method String String.toLowerCase()>
	//    8   19:ldc1            #97  <String "intent://platformapi/startapp?">
	//    9   21:invokevirtual   #89  <Method String String.toLowerCase()>
	//   10   24:invokevirtual   #95  <Method boolean String.startsWith(String)>
	//   11   27:ifeq            97
		webview = ((WebView) (hr.d(((android.content.Context) (a)))));
	//   12   30:aload_0         
	//   13   31:getfield        #13  <Field AuthActivity a>
	//   14   34:invokestatic    #102 <Method o.hr$a hr.d(android.content.Context)>
	//   15   37:astore_1        
		if(webview == null)
			break MISSING_BLOCK_LABEL_51;
	//   16   38:aload_1         
	//   17   39:ifnull          51
		boolean flag = ((o.hr.a) (webview)).b();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #107 <Method boolean o.hr$a.b()>
	//   20   46:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_53;
	//   21   47:iload_3         
	//   22   48:ifeq            53
		return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
		webview = ((WebView) (s));
	//   25   53:aload_2         
	//   26   54:astore_1        
		try
		{
			if(s.startsWith("intent://platformapi/startapp"))
	//*  27   55:aload_2         
	//*  28   56:ldc1            #109 <String "intent://platformapi/startapp">
	//*  29   58:invokevirtual   #95  <Method boolean String.startsWith(String)>
	//*  30   61:ifeq            73
				webview = ((WebView) (s.replaceFirst("intent://platformapi/startapp?", "alipays://platformapi/startApp?")));
	//   31   64:aload_2         
	//   32   65:ldc1            #97  <String "intent://platformapi/startapp?">
	//   33   67:ldc1            #91  <String "alipays://platformapi/startApp?">
	//   34   69:invokevirtual   #113 <Method String String.replaceFirst(String, String)>
	//   35   72:astore_1        
			webview = ((WebView) (new Intent("android.intent.action.VIEW", Uri.parse(((String) (webview))))));
	//   36   73:new             #115 <Class Intent>
	//   37   76:dup             
	//   38   77:ldc1            #117 <String "android.intent.action.VIEW">
	//   39   79:aload_1         
	//   40   80:invokestatic    #123 <Method Uri Uri.parse(String)>
	//   41   83:invokespecial   #126 <Method void Intent(String, Uri)>
	//   42   86:astore_1        
			a.startActivity(((Intent) (webview)));
	//   43   87:aload_0         
	//   44   88:getfield        #13  <Field AuthActivity a>
	//   45   91:aload_1         
	//   46   92:invokevirtual   #130 <Method void AuthActivity.startActivity(Intent)>
		}
	//*  47   95:iconst_1        
	//*  48   96:ireturn         
	//*  49   97:aload_0         
	//*  50   98:getfield        #13  <Field AuthActivity a>
	//*  51  101:aload_2         
	//*  52  102:invokestatic    #133 <Method boolean AuthActivity.b(AuthActivity, String)>
	//*  53  105:ifeq            114
	//*  54  108:aload_1         
	//*  55  109:invokevirtual   #138 <Method void WebView.stopLoading()>
	//*  56  112:iconst_1        
	//*  57  113:ireturn         
	//*  58  114:aload_0         
	//*  59  115:aload_1         
	//*  60  116:aload_2         
	//*  61  117:invokespecial   #140 <Method boolean WebViewClient.shouldOverrideUrlLoading(WebView, String)>
	//*  62  120:ireturn         
		// Misplaced declaration of an exception variable
		catch(WebView webview) { }
	//   63  121:astore_1        
		return true;
		if(AuthActivity.b(a, s))
		{
			webview.stopLoading();
			return true;
		} else
		{
			return super.shouldOverrideUrlLoading(webview, s);
		}
	//*  64  122:goto            95
	}

	public final AuthActivity a;

	private AuthActivity$b(AuthActivity authactivity)
	{
		a = authactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AuthActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void WebViewClient()>
	//    5    9:return          
	}

	AuthActivity$b(AuthActivity authactivity, byte byte0)
	{
		this(authactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AuthActivity$b(AuthActivity)>
	//    3    5:return          
	}
}

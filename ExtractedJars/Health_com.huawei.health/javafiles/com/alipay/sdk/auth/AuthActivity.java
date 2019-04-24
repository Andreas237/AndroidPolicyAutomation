// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.*;
import android.widget.LinearLayout;
import java.lang.reflect.Method;
import o.*;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthActivity extends Activity
{
	final class a extends WebChromeClient
	{

		public final boolean onConsoleMessage(ConsoleMessage consolemessage)
		{
			String s1 = consolemessage.message();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #28  <Method String ConsoleMessage.message()>
		//    2    4:astore_3        
			if(TextUtils.isEmpty(((CharSequence) (s1))))
		//*   3    5:aload_3         
		//*   4    6:invokestatic    #34  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   5    9:ifeq            18
				return super.onConsoleMessage(consolemessage);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
		//    9   17:ireturn         
			String s = null;
		//   10   18:aconst_null     
		//   11   19:astore_2        
			if(s1.startsWith("h5container.message: "))
		//*  12   20:aload_3         
		//*  13   21:ldc1            #38  <String "h5container.message: ">
		//*  14   23:invokevirtual   #44  <Method boolean String.startsWith(String)>
		//*  15   26:ifeq            38
				s = s1.replaceFirst("h5container.message: ", "");
		//   16   29:aload_3         
		//   17   30:ldc1            #38  <String "h5container.message: ">
		//   18   32:ldc1            #46  <String "">
		//   19   34:invokevirtual   #50  <Method String String.replaceFirst(String, String)>
		//   20   37:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (s))))
		//*  21   38:aload_2         
		//*  22   39:invokestatic    #34  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  23   42:ifeq            51
			{
				return super.onConsoleMessage(consolemessage);
		//   24   45:aload_0         
		//   25   46:aload_1         
		//   26   47:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
		//   27   50:ireturn         
			} else
			{
				AuthActivity.e(e, s);
		//   28   51:aload_0         
		//   29   52:getfield        #13  <Field AuthActivity e>
		//   30   55:aload_2         
		//   31   56:invokestatic    #53  <Method void AuthActivity.e(AuthActivity, String)>
				return super.onConsoleMessage(consolemessage);
		//   32   59:aload_0         
		//   33   60:aload_1         
		//   34   61:invokespecial   #36  <Method boolean WebChromeClient.onConsoleMessage(ConsoleMessage)>
		//   35   64:ireturn         
			}
		}

		final AuthActivity e;

		private a()
		{
			e = AuthActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AuthActivity e>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void WebChromeClient()>
		//    5    9:return          
		}

		a(byte byte0)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void AuthActivity$a(AuthActivity)>
		//    3    5:return          
		}
	}

	public final class b extends WebViewClient
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

		private b()
		{
			a = AuthActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AuthActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void WebViewClient()>
		//    5    9:return          
		}

		b(byte byte0)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void AuthActivity$b(AuthActivity)>
		//    3    5:return          
		}
	}


	public AuthActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Activity()>
		g = ((Runnable) (new fz(this)));
	//    2    4:aload_0         
	//    3    5:new             #31  <Class fz>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #34  <Method void fz(AuthActivity)>
	//    7   13:putfield        #36  <Field Runnable g>
	//    8   16:return          
	}

	static void a(AuthActivity authactivity)
	{
		Exception exception;
		try
		{
			if(authactivity.c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field hw c>
	//*   2    4:ifnonnull       21
				authactivity.c = new hw(((Activity) (authactivity)), "\u6B63\u5728\u52A0\u8F7D");
	//    3    7:aload_0         
	//    4    8:new             #43  <Class hw>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:ldc1            #45  <String "\u6B63\u5728\u52A0\u8F7D">
	//    8   15:invokespecial   #48  <Method void hw(Activity, String)>
	//    9   18:putfield        #41  <Field hw c>
			authactivity.c.c();
	//   10   21:aload_0         
	//   11   22:getfield        #41  <Field hw c>
	//   12   25:invokevirtual   #50  <Method void hw.c()>
			return;
	//   13   28:return          
		}
	//*  14   29:aload_0         
	//*  15   30:aconst_null     
	//*  16   31:putfield        #41  <Field hw c>
	//*  17   34:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			authactivity.c = null;
		}
	//*  18   35:astore_1        
	//*  19   36:goto            29
	}

	public static boolean a(AuthActivity authactivity, boolean flag)
	{
		authactivity.e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean e>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean b(AuthActivity authactivity)
	{
		authactivity.f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #56  <Field boolean f>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static boolean b(AuthActivity authactivity, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(s.startsWith("http://") || s.startsWith("https://"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #65  <String "http://">
	//*   7   12:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//*   8   15:ifne            27
	//*   9   18:aload_1         
	//*  10   19:ldc1            #73  <String "https://">
	//*  11   21:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//*  12   24:ifeq            29
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		if(!"SDKLite://h5quit".equalsIgnoreCase(s))
	//*  15   29:ldc1            #75  <String "SDKLite://h5quit">
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #78  <Method boolean String.equalsIgnoreCase(String)>
	//*  18   35:ifne            76
		{
			String s1 = s;
	//   19   38:aload_1         
	//   20   39:astore_2        
			if(TextUtils.equals(((CharSequence) (s)), ((CharSequence) (authactivity.a))))
	//*  21   40:aload_1         
	//*  22   41:aload_0         
	//*  23   42:getfield        #80  <Field String a>
	//*  24   45:invokestatic    #84  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  25   48:ifeq            71
				s1 = (new StringBuilder()).append(s).append("?resultCode=150").toString();
	//   26   51:new             #86  <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #87  <Method void StringBuilder()>
	//   29   58:aload_1         
	//   30   59:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:ldc1            #93  <String "?resultCode=150">
	//   32   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   34   70:astore_2        
			gg.b(((Activity) (authactivity)), s1);
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:invokestatic    #101 <Method void gg.b(Activity, String)>
		}
		authactivity.finish();
	//   38   76:aload_0         
	//   39   77:invokevirtual   #104 <Method void finish()>
		return true;
	//   40   80:iconst_1        
	//   41   81:ireturn         
	}

	static boolean c(AuthActivity authactivity)
	{
		return authactivity.e;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean e>
	//    2    4:ireturn         
	}

	static Runnable d(AuthActivity authactivity)
	{
		return authactivity.g;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Runnable g>
	//    2    4:areturn         
	}

	public static void d(AuthActivity authactivity, ge ge1)
	{
		if(authactivity.b == null || ge1 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field WebView b>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    6   12:new             #112 <Class JSONObject>
	//    7   15:dup             
	//    8   16:invokespecial   #113 <Method void JSONObject()>
	//    9   19:astore_2        
			jsonobject.put("clientId", ((Object) (ge1.a)));
	//   10   20:aload_2         
	//   11   21:ldc1            #115 <String "clientId">
	//   12   23:aload_1         
	//   13   24:getfield        #118 <Field String ge.a>
	//   14   27:invokevirtual   #122 <Method JSONObject JSONObject.put(String, Object)>
	//   15   30:pop             
			jsonobject.put("func", ((Object) (ge1.d)));
	//   16   31:aload_2         
	//   17   32:ldc1            #124 <String "func">
	//   18   34:aload_1         
	//   19   35:getfield        #126 <Field String ge.d>
	//   20   38:invokevirtual   #122 <Method JSONObject JSONObject.put(String, Object)>
	//   21   41:pop             
			jsonobject.put("param", ((Object) (ge1.e)));
	//   22   42:aload_2         
	//   23   43:ldc1            #128 <String "param">
	//   24   45:aload_1         
	//   25   46:getfield        #131 <Field JSONObject ge.e>
	//   26   49:invokevirtual   #122 <Method JSONObject JSONObject.put(String, Object)>
	//   27   52:pop             
			jsonobject.put("msgType", ((Object) (ge1.c)));
	//   28   53:aload_2         
	//   29   54:ldc1            #133 <String "msgType">
	//   30   56:aload_1         
	//   31   57:getfield        #135 <Field String ge.c>
	//   32   60:invokevirtual   #122 <Method JSONObject JSONObject.put(String, Object)>
	//   33   63:pop             
			authactivity.runOnUiThread(((Runnable) (new fy(authactivity, String.format("AlipayJSBridge._invokeJS(%s)", new Object[] {
				jsonobject.toString()
			})))));
	//   34   64:aload_0         
	//   35   65:new             #137 <Class fy>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:ldc1            #139 <String "AlipayJSBridge._invokeJS(%s)">
	//   39   72:iconst_1        
	//   40   73:anewarray       Object[]
	//   41   76:dup             
	//   42   77:iconst_0        
	//   43   78:aload_2         
	//   44   79:invokevirtual   #142 <Method String JSONObject.toString()>
	//   45   82:aastore         
	//   46   83:invokestatic    #146 <Method String String.format(String, Object[])>
	//   47   86:invokespecial   #149 <Method void fy(AuthActivity, String)>
	//   48   89:invokevirtual   #153 <Method void runOnUiThread(Runnable)>
			return;
	//   49   92:return          
		}
		// Misplaced declaration of an exception variable
		catch(AuthActivity authactivity)
	//*  50   93:astore_0        
		{
			return;
	//   51   94:return          
		}
	}

	public static String e(AuthActivity authactivity)
	{
		return authactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String a>
	//    2    4:areturn         
	}

	static void e(AuthActivity authactivity, String s)
	{
		Object obj;
		gk gk1;
		gk1 = new gk(authactivity.getApplicationContext(), ((o.gf) (new gc(authactivity))));
	//    0    0:new             #156 <Class gk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #160 <Method android.content.Context getApplicationContext()>
	//    4    8:new             #162 <Class gc>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #163 <Method void gc(AuthActivity)>
	//    8   16:invokespecial   #166 <Method void gk(android.content.Context, o.gf)>
	//    9   19:astore          4
		obj = null;
	//   10   21:aconst_null     
	//   11   22:astore_3        
		authactivity = ((AuthActivity) (obj));
	//   12   23:aload_3         
	//   13   24:astore_0        
		Object obj1 = ((Object) (new JSONObject(s)));
	//   14   25:new             #112 <Class JSONObject>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:invokespecial   #169 <Method void JSONObject(String)>
	//   18   33:astore          5
		authactivity = ((AuthActivity) (obj));
	//   19   35:aload_3         
	//   20   36:astore_0        
		obj = ((Object) (((JSONObject) (obj1)).getString("clientId")));
	//   21   37:aload           5
	//   22   39:ldc1            #115 <String "clientId">
	//   23   41:invokevirtual   #173 <Method String JSONObject.getString(String)>
	//   24   44:astore_3        
		s = ((String) (obj));
	//   25   45:aload_3         
	//   26   46:astore_1        
		authactivity = ((AuthActivity) (s));
	//   27   47:aload_1         
	//   28   48:astore_0        
		boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
	//   29   49:aload_3         
	//   30   50:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   31   53:istore_2        
		if(flag)
	//*  32   54:iload_2         
	//*  33   55:ifeq            59
			return;
	//   34   58:return          
		obj = null;
	//   35   59:aconst_null     
	//   36   60:astore_3        
		authactivity = ((AuthActivity) (s));
	//   37   61:aload_1         
	//   38   62:astore_0        
		Object obj2 = ((Object) (((JSONObject) (obj1)).getJSONObject("param")));
	//   39   63:aload           5
	//   40   65:ldc1            #128 <String "param">
	//   41   67:invokevirtual   #177 <Method JSONObject JSONObject.getJSONObject(String)>
	//   42   70:astore          6
		authactivity = ((AuthActivity) (s));
	//   43   72:aload_1         
	//   44   73:astore_0        
		if(!(obj2 instanceof JSONObject))
			break MISSING_BLOCK_LABEL_90;
	//   45   74:aload           6
	//   46   76:instanceof      #112 <Class JSONObject>
	//   47   79:ifeq            90
		authactivity = ((AuthActivity) (s));
	//   48   82:aload_1         
	//   49   83:astore_0        
		obj = ((Object) ((JSONObject)obj2));
	//   50   84:aload           6
	//   51   86:checkcast       #112 <Class JSONObject>
	//   52   89:astore_3        
		authactivity = ((AuthActivity) (s));
	//   53   90:aload_1         
	//   54   91:astore_0        
		obj2 = ((Object) (((JSONObject) (obj1)).getString("func")));
	//   55   92:aload           5
	//   56   94:ldc1            #124 <String "func">
	//   57   96:invokevirtual   #173 <Method String JSONObject.getString(String)>
	//   58   99:astore          6
		authactivity = ((AuthActivity) (s));
	//   59  101:aload_1         
	//   60  102:astore_0        
		obj1 = ((Object) (((JSONObject) (obj1)).getString("bundleName")));
	//   61  103:aload           5
	//   62  105:ldc1            #179 <String "bundleName">
	//   63  107:invokevirtual   #173 <Method String JSONObject.getString(String)>
	//   64  110:astore          5
		authactivity = ((AuthActivity) (s));
	//   65  112:aload_1         
	//   66  113:astore_0        
		ge ge1 = new ge("call");
	//   67  114:new             #117 <Class ge>
	//   68  117:dup             
	//   69  118:ldc1            #181 <String "call">
	//   70  120:invokespecial   #182 <Method void ge(String)>
	//   71  123:astore          7
		authactivity = ((AuthActivity) (s));
	//   72  125:aload_1         
	//   73  126:astore_0        
		ge1.b = ((String) (obj1));
	//   74  127:aload           7
	//   75  129:aload           5
	//   76  131:putfield        #184 <Field String ge.b>
		authactivity = ((AuthActivity) (s));
	//   77  134:aload_1         
	//   78  135:astore_0        
		ge1.d = ((String) (obj2));
	//   79  136:aload           7
	//   80  138:aload           6
	//   81  140:putfield        #126 <Field String ge.d>
		authactivity = ((AuthActivity) (s));
	//   82  143:aload_1         
	//   83  144:astore_0        
		ge1.e = ((JSONObject) (obj));
	//   84  145:aload           7
	//   85  147:aload_3         
	//   86  148:putfield        #131 <Field JSONObject ge.e>
		authactivity = ((AuthActivity) (s));
	//   87  151:aload_1         
	//   88  152:astore_0        
		ge1.a = s;
	//   89  153:aload           7
	//   90  155:aload_1         
	//   91  156:putfield        #118 <Field String ge.a>
		authactivity = ((AuthActivity) (s));
	//   92  159:aload_1         
	//   93  160:astore_0        
		try
		{
			gk1.d(ge1);
	//   94  161:aload           4
	//   95  163:aload           7
	//   96  165:invokevirtual   #187 <Method void gk.d(ge)>
			return;
	//   97  168:return          
		}
	//*  98  169:aload_0         
	//*  99  170:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 100  173:ifne            186
	//* 101  176:aload           4
	//* 102  178:aload_0         
	//* 103  179:getstatic       #192 <Field int o.ge$e.b>
	//* 104  182:invokevirtual   #195 <Method void gk.d(String, int)>
	//* 105  185:return          
	//* 106  186:return          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  107  187:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (authactivity))))
			try
			{
				gk1.d(((String) (authactivity)), o.ge.e.b);
				return;
			}
	//* 108  188:goto            169
			// Misplaced declaration of an exception variable
			catch(AuthActivity authactivity)
	//* 109  191:astore_0        
			{
				return;
	//  110  192:return          
			}
		else
			return;
	}

	public static void f(AuthActivity authactivity)
	{
		if(authactivity.c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field hw c>
	//*   2    4:ifnull          14
			authactivity.c.b();
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field hw c>
	//    5   11:invokevirtual   #197 <Method void hw.b()>
		authactivity.c = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #41  <Field hw c>
	//    9   19:return          
	}

	static Handler g(AuthActivity authactivity)
	{
		return authactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field Handler d>
	//    2    4:areturn         
	}

	public static WebView k(AuthActivity authactivity)
	{
		return authactivity.b;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field WebView b>
	//    2    4:areturn         
	}

	public void onBackPressed()
	{
		if(b.canGoBack())
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field WebView b>
	//*   2    4:invokevirtual   #209 <Method boolean WebView.canGoBack()>
	//*   3    7:ifeq            49
		{
			if(f)
	//*   4   10:aload_0         
	//*   5   11:getfield        #56  <Field boolean f>
	//*   6   14:ifeq            48
			{
				gg.b(((Activity) (this)), (new StringBuilder()).append(a).append("?resultCode=150").toString());
	//    7   17:aload_0         
	//    8   18:new             #86  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #87  <Method void StringBuilder()>
	//   11   25:aload_0         
	//   12   26:getfield        #80  <Field String a>
	//   13   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:ldc1            #93  <String "?resultCode=150">
	//   15   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   17   40:invokestatic    #101 <Method void gg.b(Activity, String)>
				finish();
	//   18   43:aload_0         
	//   19   44:invokevirtual   #104 <Method void finish()>
				return;
	//   20   47:return          
			} else
			{
				return;
	//   21   48:return          
			}
		} else
		{
			gg.b(((Activity) (this)), (new StringBuilder()).append(a).append("?resultCode=150").toString());
	//   22   49:aload_0         
	//   23   50:new             #86  <Class StringBuilder>
	//   24   53:dup             
	//   25   54:invokespecial   #87  <Method void StringBuilder()>
	//   26   57:aload_0         
	//   27   58:getfield        #80  <Field String a>
	//   28   61:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:ldc1            #93  <String "?resultCode=150">
	//   30   66:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   32   72:invokestatic    #101 <Method void gg.b(Activity, String)>
			finish();
	//   33   75:aload_0         
	//   34   76:invokevirtual   #104 <Method void finish()>
			return;
	//   35   79:return          
		}
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method void Activity.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #219 <Method void Activity.onCreate(Bundle)>
		try
		{
			bundle = getIntent().getExtras();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #223 <Method Intent getIntent()>
	//    5    9:invokevirtual   #229 <Method Bundle Intent.getExtras()>
	//    6   12:astore_1        
		}
	//*   7   13:goto            21
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #104 <Method void finish()>
	//*  10   20:return          
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       30
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #104 <Method void finish()>
	//*  15   29:return          
	//*  16   30:aload_0         
	//*  17   31:aload_1         
	//*  18   32:ldc1            #231 <String "redirectUri">
	//*  19   34:invokevirtual   #234 <Method String Bundle.getString(String)>
	//*  20   37:putfield        #80  <Field String a>
	//*  21   40:aload_1         
	//*  22   41:ldc1            #236 <String "params">
	//*  23   43:invokevirtual   #234 <Method String Bundle.getString(String)>
	//*  24   46:astore_1        
	//*  25   47:goto            55
	//*  26   50:aload_0         
	//*  27   51:invokevirtual   #104 <Method void finish()>
	//*  28   54:return          
	//*  29   55:aload_1         
	//*  30   56:invokestatic    #240 <Method boolean hr.d(String)>
	//*  31   59:ifne            67
	//*  32   62:aload_0         
	//*  33   63:invokevirtual   #104 <Method void finish()>
	//*  34   66:return          
	//*  35   67:aload_0         
	//*  36   68:iconst_1        
	//*  37   69:invokespecial   #244 <Method boolean Activity.requestWindowFeature(int)>
	//*  38   72:pop             
	//*  39   73:aload_0         
	//*  40   74:new             #246 <Class Handler>
	//*  41   77:dup             
	//*  42   78:aload_0         
	//*  43   79:invokevirtual   #250 <Method android.os.Looper getMainLooper()>
	//*  44   82:invokespecial   #253 <Method void Handler(android.os.Looper)>
	//*  45   85:putfield        #200 <Field Handler d>
	//*  46   88:new             #255 <Class LinearLayout>
	//*  47   91:dup             
	//*  48   92:aload_0         
	//*  49   93:invokespecial   #258 <Method void LinearLayout(android.content.Context)>
	//*  50   96:astore_2        
	//*  51   97:new             #260 <Class android.widget.LinearLayout$LayoutParams>
	//*  52  100:dup             
	//*  53  101:iconst_m1       
	//*  54  102:iconst_m1       
	//*  55  103:invokespecial   #263 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//*  56  106:astore_3        
	//*  57  107:aload_2         
	//*  58  108:iconst_1        
	//*  59  109:invokevirtual   #267 <Method void LinearLayout.setOrientation(int)>
	//*  60  112:aload_0         
	//*  61  113:aload_2         
	//*  62  114:aload_3         
	//*  63  115:invokevirtual   #271 <Method void setContentView(android.view.View, android.view.ViewGroup$LayoutParams)>
	//*  64  118:aload_0         
	//*  65  119:new             #205 <Class WebView>
	//*  66  122:dup             
	//*  67  123:aload_0         
	//*  68  124:invokespecial   #272 <Method void WebView(android.content.Context)>
	//*  69  127:putfield        #110 <Field WebView b>
	//*  70  130:aload_3         
	//*  71  131:fconst_1        
	//*  72  132:putfield        #276 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//*  73  135:aload_0         
	//*  74  136:getfield        #110 <Field WebView b>
	//*  75  139:iconst_0        
	//*  76  140:invokevirtual   #279 <Method void WebView.setVisibility(int)>
	//*  77  143:aload_2         
	//*  78  144:aload_0         
	//*  79  145:getfield        #110 <Field WebView b>
	//*  80  148:aload_3         
	//*  81  149:invokevirtual   #282 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
	//*  82  152:aload_0         
	//*  83  153:getfield        #110 <Field WebView b>
	//*  84  156:invokevirtual   #286 <Method WebSettings WebView.getSettings()>
	//*  85  159:astore_2        
	//*  86  160:aload_2         
	//*  87  161:new             #86  <Class StringBuilder>
	//*  88  164:dup             
	//*  89  165:invokespecial   #87  <Method void StringBuilder()>
	//*  90  168:aload_2         
	//*  91  169:invokevirtual   #291 <Method String WebSettings.getUserAgentString()>
	//*  92  172:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  93  175:aload_0         
	//*  94  176:invokevirtual   #160 <Method android.content.Context getApplicationContext()>
	//*  95  179:invokestatic    #294 <Method String hr.c(android.content.Context)>
	//*  96  182:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  97  185:invokevirtual   #97  <Method String StringBuilder.toString()>
	//*  98  188:invokevirtual   #297 <Method void WebSettings.setUserAgentString(String)>
	//*  99  191:aload_2         
	//* 100  192:getstatic       #303 <Field android.webkit.WebSettings$RenderPriority android.webkit.WebSettings$RenderPriority.HIGH>
	//* 101  195:invokevirtual   #307 <Method void WebSettings.setRenderPriority(android.webkit.WebSettings$RenderPriority)>
	//* 102  198:aload_2         
	//* 103  199:iconst_1        
	//* 104  200:invokevirtual   #311 <Method void WebSettings.setSupportMultipleWindows(boolean)>
	//* 105  203:aload_2         
	//* 106  204:iconst_1        
	//* 107  205:invokevirtual   #314 <Method void WebSettings.setJavaScriptEnabled(boolean)>
	//* 108  208:aload_2         
	//* 109  209:iconst_0        
	//* 110  210:invokevirtual   #317 <Method void WebSettings.setSavePassword(boolean)>
	//* 111  213:aload_2         
	//* 112  214:iconst_1        
	//* 113  215:invokevirtual   #320 <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
	//* 114  218:aload_2         
	//* 115  219:aload_2         
	//* 116  220:invokevirtual   #324 <Method int WebSettings.getMinimumFontSize()>
	//* 117  223:bipush          8
	//* 118  225:iadd            
	//* 119  226:invokevirtual   #327 <Method void WebSettings.setMinimumFontSize(int)>
	//* 120  229:aload_2         
	//* 121  230:iconst_0        
	//* 122  231:invokevirtual   #330 <Method void WebSettings.setAllowFileAccess(boolean)>
	//* 123  234:aload_2         
	//* 124  235:getstatic       #336 <Field android.webkit.WebSettings$TextSize android.webkit.WebSettings$TextSize.NORMAL>
	//* 125  238:invokevirtual   #340 <Method void WebSettings.setTextSize(android.webkit.WebSettings$TextSize)>
	//* 126  241:aload_0         
	//* 127  242:getfield        #110 <Field WebView b>
	//* 128  245:iconst_1        
	//* 129  246:invokevirtual   #343 <Method void WebView.setVerticalScrollbarOverlay(boolean)>
	//* 130  249:aload_0         
	//* 131  250:getfield        #110 <Field WebView b>
	//* 132  253:new             #9   <Class AuthActivity$b>
	//* 133  256:dup             
	//* 134  257:aload_0         
	//* 135  258:iconst_0        
	//* 136  259:invokespecial   #346 <Method void AuthActivity$b(AuthActivity, byte)>
	//* 137  262:invokevirtual   #350 <Method void WebView.setWebViewClient(WebViewClient)>
	//* 138  265:aload_0         
	//* 139  266:getfield        #110 <Field WebView b>
	//* 140  269:new             #6   <Class AuthActivity$a>
	//* 141  272:dup             
	//* 142  273:aload_0         
	//* 143  274:iconst_0        
	//* 144  275:invokespecial   #351 <Method void AuthActivity$a(AuthActivity, byte)>
	//* 145  278:invokevirtual   #355 <Method void WebView.setWebChromeClient(WebChromeClient)>
	//* 146  281:aload_0         
	//* 147  282:getfield        #110 <Field WebView b>
	//* 148  285:new             #357 <Class gb>
	//* 149  288:dup             
	//* 150  289:aload_0         
	//* 151  290:invokespecial   #358 <Method void gb(AuthActivity)>
	//* 152  293:invokevirtual   #362 <Method void WebView.setDownloadListener(android.webkit.DownloadListener)>
	//* 153  296:aload_0         
	//* 154  297:getfield        #110 <Field WebView b>
	//* 155  300:aload_1         
	//* 156  301:invokevirtual   #365 <Method void WebView.loadUrl(String)>
	//* 157  304:getstatic       #370 <Field int android.os.Build$VERSION.SDK_INT>
	//* 158  307:bipush          7
	//* 159  309:icmplt          366
	//* 160  312:aload_0         
	//* 161  313:getfield        #110 <Field WebView b>
	//* 162  316:invokevirtual   #286 <Method WebSettings WebView.getSettings()>
	//* 163  319:invokevirtual   #374 <Method Class Object.getClass()>
	//* 164  322:ldc2            #376 <String "setDomStorageEnabled">
	//* 165  325:iconst_1        
	//* 166  326:anewarray       Class[]
	//* 167  329:dup             
	//* 168  330:iconst_0        
	//* 169  331:getstatic       #384 <Field Class Boolean.TYPE>
	//* 170  334:aastore         
	//* 171  335:invokevirtual   #388 <Method Method Class.getMethod(String, Class[])>
	//* 172  338:astore_1        
	//* 173  339:aload_1         
	//* 174  340:ifnull          366
	//* 175  343:aload_1         
	//* 176  344:aload_0         
	//* 177  345:getfield        #110 <Field WebView b>
	//* 178  348:invokevirtual   #286 <Method WebSettings WebView.getSettings()>
	//* 179  351:iconst_1        
	//* 180  352:anewarray       Object[]
	//* 181  355:dup             
	//* 182  356:iconst_0        
	//* 183  357:iconst_1        
	//* 184  358:invokestatic    #392 <Method Boolean Boolean.valueOf(boolean)>
	//* 185  361:aastore         
	//* 186  362:invokevirtual   #398 <Method Object Method.invoke(Object, Object[])>
	//* 187  365:pop             
	//* 188  366:aload_0         
	//* 189  367:getfield        #110 <Field WebView b>
	//* 190  370:ldc2            #400 <String "searchBoxJavaBridge_">
	//* 191  373:invokevirtual   #403 <Method void WebView.removeJavascriptInterface(String)>
	//* 192  376:aload_0         
	//* 193  377:getfield        #110 <Field WebView b>
	//* 194  380:ldc2            #405 <String "accessibility">
	//* 195  383:invokevirtual   #403 <Method void WebView.removeJavascriptInterface(String)>
	//* 196  386:aload_0         
	//* 197  387:getfield        #110 <Field WebView b>
	//* 198  390:ldc2            #407 <String "accessibilityTraversal">
	//* 199  393:invokevirtual   #403 <Method void WebView.removeJavascriptInterface(String)>
	//* 200  396:goto            478
	//* 201  399:aload_0         
	//* 202  400:getfield        #110 <Field WebView b>
	//* 203  403:invokevirtual   #374 <Method Class Object.getClass()>
	//* 204  406:ldc2            #408 <String "removeJavascriptInterface">
	//* 205  409:iconst_0        
	//* 206  410:anewarray       Class[]
	//* 207  413:invokevirtual   #388 <Method Method Class.getMethod(String, Class[])>
	//* 208  416:astore_1        
	//* 209  417:aload_1         
	//* 210  418:ifnull          478
	//* 211  421:aload_1         
	//* 212  422:aload_0         
	//* 213  423:getfield        #110 <Field WebView b>
	//* 214  426:iconst_1        
	//* 215  427:anewarray       Object[]
	//* 216  430:dup             
	//* 217  431:iconst_0        
	//* 218  432:ldc2            #400 <String "searchBoxJavaBridge_">
	//* 219  435:aastore         
	//* 220  436:invokevirtual   #398 <Method Object Method.invoke(Object, Object[])>
	//* 221  439:pop             
	//* 222  440:aload_1         
	//* 223  441:aload_0         
	//* 224  442:getfield        #110 <Field WebView b>
	//* 225  445:iconst_1        
	//* 226  446:anewarray       Object[]
	//* 227  449:dup             
	//* 228  450:iconst_0        
	//* 229  451:ldc2            #405 <String "accessibility">
	//* 230  454:aastore         
	//* 231  455:invokevirtual   #398 <Method Object Method.invoke(Object, Object[])>
	//* 232  458:pop             
	//* 233  459:aload_1         
	//* 234  460:aload_0         
	//* 235  461:getfield        #110 <Field WebView b>
	//* 236  464:iconst_1        
	//* 237  465:anewarray       Object[]
	//* 238  468:dup             
	//* 239  469:iconst_0        
	//* 240  470:ldc2            #407 <String "accessibilityTraversal">
	//* 241  473:aastore         
	//* 242  474:invokevirtual   #398 <Method Object Method.invoke(Object, Object[])>
	//* 243  477:pop             
	//* 244  478:getstatic       #370 <Field int android.os.Build$VERSION.SDK_INT>
	//* 245  481:bipush          19
	//* 246  483:icmplt          497
	//* 247  486:aload_0         
	//* 248  487:getfield        #110 <Field WebView b>
	//* 249  490:invokevirtual   #286 <Method WebSettings WebView.getSettings()>
	//* 250  493:iconst_1        
	//* 251  494:invokevirtual   #411 <Method void WebSettings.setCacheMode(int)>
	//* 252  497:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			finish();
			return;
		}
		if(bundle == null)
		{
			finish();
			return;
		}
		try
		{
			a = bundle.getString("redirectUri");
			bundle = ((Bundle) (bundle.getString("params")));
		}
	//* 253  498:astore_1        
	//* 254  499:goto            16
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			finish();
			return;
		}
		if(!hr.d(((String) (bundle))))
		{
			finish();
			return;
		}
		super.requestWindowFeature(1);
		d = new Handler(getMainLooper());
		Object obj = ((Object) (new LinearLayout(((android.content.Context) (this)))));
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
		((LinearLayout) (obj)).setOrientation(1);
		setContentView(((android.view.View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		b = new WebView(((android.content.Context) (this)));
		layoutparams.weight = 1.0F;
		b.setVisibility(0);
		((LinearLayout) (obj)).addView(((android.view.View) (b)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		obj = ((Object) (b.getSettings()));
		((WebSettings) (obj)).setUserAgentString((new StringBuilder()).append(((WebSettings) (obj)).getUserAgentString()).append(hr.c(getApplicationContext())).toString());
		((WebSettings) (obj)).setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
		((WebSettings) (obj)).setSupportMultipleWindows(true);
		((WebSettings) (obj)).setJavaScriptEnabled(true);
		((WebSettings) (obj)).setSavePassword(false);
		((WebSettings) (obj)).setJavaScriptCanOpenWindowsAutomatically(true);
		((WebSettings) (obj)).setMinimumFontSize(((WebSettings) (obj)).getMinimumFontSize() + 8);
		((WebSettings) (obj)).setAllowFileAccess(false);
		((WebSettings) (obj)).setTextSize(android.webkit.WebSettings.TextSize.NORMAL);
		b.setVerticalScrollbarOverlay(true);
		b.setWebViewClient(((WebViewClient) (new b((byte)0))));
		b.setWebChromeClient(((WebChromeClient) (new a((byte)0))));
		b.setDownloadListener(((android.webkit.DownloadListener) (new gb(this))));
		b.loadUrl(((String) (bundle)));
		if(android.os.Build.VERSION.SDK_INT < 7)
			break MISSING_BLOCK_LABEL_366;
		bundle = ((Bundle) (((Object) (b.getSettings())).getClass().getMethod("setDomStorageEnabled", new Class[] {
			Boolean.TYPE
		})));
		if(bundle != null)
			try
			{
				((Method) (bundle)).invoke(((Object) (b.getSettings())), new Object[] {
					Boolean.valueOf(true)
				});
			}
	//* 255  502:astore_1        
	//* 256  503:goto            50
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
	//  257  506:astore_1        
		b.removeJavascriptInterface("searchBoxJavaBridge_");
		b.removeJavascriptInterface("accessibility");
		b.removeJavascriptInterface("accessibilityTraversal");
		  goto _L1
_L3:
		bundle = ((Bundle) (((Object) (b)).getClass().getMethod("removeJavascriptInterface", new Class[0])));
		if(bundle != null)
			try
			{
				((Method) (bundle)).invoke(((Object) (b)), new Object[] {
					"searchBoxJavaBridge_"
				});
				((Method) (bundle)).invoke(((Object) (b)), new Object[] {
					"accessibility"
				});
				((Method) (bundle)).invoke(((Object) (b)), new Object[] {
					"accessibilityTraversal"
				});
			}
	//* 258  507:goto            366
	//* 259  510:astore_1        
	//* 260  511:goto            399
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
	//  261  514:astore_1        
_L1:
		if(android.os.Build.VERSION.SDK_INT >= 19)
			b.getSettings().setCacheMode(1);
		return;
		bundle;
		if(true) goto _L3; else goto _L2
_L2:
	//* 262  515:goto            478
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void Activity.onDestroy()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #110 <Field WebView b>
	//*   4    8:ifnull          30
		{
			b.removeAllViews();
	//    5   11:aload_0         
	//    6   12:getfield        #110 <Field WebView b>
	//    7   15:invokevirtual   #417 <Method void WebView.removeAllViews()>
			try
			{
				b.destroy();
	//    8   18:aload_0         
	//    9   19:getfield        #110 <Field WebView b>
	//   10   22:invokevirtual   #420 <Method void WebView.destroy()>
			}
	//*  11   25:aload_0         
	//*  12   26:aconst_null     
	//*  13   27:putfield        #110 <Field WebView b>
	//*  14   30:return          
			catch(Throwable throwable) { }
	//   15   31:astore_1        
			b = null;
		}
	//*  16   32:goto            25
	}

	private String a;
	private WebView b;
	private hw c;
	private Handler d;
	private boolean e;
	private boolean f;
	private Runnable g;
}

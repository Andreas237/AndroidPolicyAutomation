// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xo, wx, ahr, wi

class ahm extends WebView
{

	public ahm(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void WebView(Context)>
		setBackgroundColor(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #16  <Method void setBackgroundColor(int)>
		context = ((Context) (getSettings()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #20  <Method WebSettings getSettings()>
	//    8   14:astore_1        
		((WebSettings) (context)).setAllowFileAccess(false);
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #26  <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (context)).setSavePassword(false);
	//   12   20:aload_1         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #29  <Method void WebSettings.setSavePassword(boolean)>
		((WebSettings) (context)).setSupportMultipleWindows(true);
	//   15   25:aload_1         
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #32  <Method void WebSettings.setSupportMultipleWindows(boolean)>
		((WebSettings) (context)).setJavaScriptCanOpenWindowsAutomatically(true);
	//   18   30:aload_1         
	//   19   31:iconst_1        
	//   20   32:invokevirtual   #35  <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  21   35:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   38:bipush          21
	//*  23   40:icmplt          48
			((WebSettings) (context)).setMixedContentMode(2);
	//   24   43:aload_1         
	//   25   44:iconst_2        
	//   26   45:invokevirtual   #44  <Method void WebSettings.setMixedContentMode(int)>
		aw.g().a(getContext(), ((WebSettings) (context)));
	//   27   48:invokestatic    #50  <Method xo aw.g()>
	//   28   51:aload_0         
	//   29   52:invokevirtual   #54  <Method Context getContext()>
	//   30   55:aload_1         
	//   31   56:invokevirtual   #60  <Method boolean xo.a(Context, WebSettings)>
	//   32   59:pop             
		removeJavascriptInterface("accessibility");
	//   33   60:aload_0         
	//   34   61:ldc1            #62  <String "accessibility">
	//   35   63:invokevirtual   #66  <Method void removeJavascriptInterface(String)>
		removeJavascriptInterface("accessibilityTraversal");
	//   36   66:aload_0         
	//   37   67:ldc1            #68  <String "accessibilityTraversal">
	//   38   69:invokevirtual   #66  <Method void removeJavascriptInterface(String)>
		try
		{
			getSettings().setJavaScriptEnabled(true);
	//   39   72:aload_0         
	//   40   73:invokevirtual   #20  <Method WebSettings getSettings()>
	//   41   76:iconst_1        
	//   42   77:invokevirtual   #71  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		}
	//*  43   80:goto            90
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  44   83:astore_1        
		{
			wx.b("Unable to enable Javascript.", ((Throwable) (context)));
	//   45   84:ldc1            #73  <String "Unable to enable Javascript.">
	//   46   86:aload_1         
	//   47   87:invokestatic    #79  <Method void wx.b(String, Throwable)>
		}
		setLayerType(1, ((android.graphics.Paint) (null)));
	//   48   90:aload_0         
	//   49   91:iconst_1        
	//   50   92:aconst_null     
	//   51   93:invokevirtual   #83  <Method void setLayerType(int, android.graphics.Paint)>
	//   52   96:return          
	}

	public void addJavascriptInterface(Object obj, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          15
		{
			super.addJavascriptInterface(obj, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokespecial   #88  <Method void WebView.addJavascriptInterface(Object, String)>
			return;
	//    7   14:return          
		} else
		{
			wx.a("Ignore addJavascriptInterface due to low Android version.");
	//    8   15:ldc1            #90  <String "Ignore addJavascriptInterface due to low Android version.">
	//    9   17:invokestatic    #92  <Method void wx.a(String)>
			return;
	//   10   20:return          
		}
	}

	public void d(String s)
	{
		ahr.a(((WebView) (this)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #98  <Method void ahr.a(WebView, String)>
	//    3    5:return          
	}

	public void loadUrl(String s)
	{
		try
		{
			super.loadUrl(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void WebView.loadUrl(String)>
			return;
	//    3    5:return          
		}
	//*   4    6:astore_1        
	//*   5    7:goto            15
	//*   6   10:astore_1        
	//*   7   11:goto            15
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//    8   14:astore_1        
		// Misplaced declaration of an exception variable
		catch(String s) { }
		// Misplaced declaration of an exception variable
		catch(String s) { }
		aw.i().a(((Throwable) (s)), "CoreWebView.loadUrl");
	//    9   15:invokestatic    #111 <Method wi aw.i()>
	//   10   18:aload_1         
	//   11   19:ldc1            #113 <String "CoreWebView.loadUrl">
	//   12   21:invokevirtual   #118 <Method void wi.a(Throwable, String)>
		wx.d("#007 Could not call remote method.", ((Throwable) (s)));
	//   13   24:ldc1            #120 <String "#007 Could not call remote method.">
	//   14   26:aload_1         
	//   15   27:invokestatic    #122 <Method void wx.d(String, Throwable)>
	//   16   30:return          
	}
}

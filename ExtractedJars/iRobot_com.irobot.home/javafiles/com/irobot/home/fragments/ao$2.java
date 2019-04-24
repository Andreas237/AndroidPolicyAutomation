// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.irobot.home.view.WebViewLanguageCompat;

// Referenced classes of package com.irobot.home.fragments:
//			ao

class ao$2 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		webview = ((WebView) (b.a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ao b>
	//    2    4:getfield        #27  <Field WebViewLanguageCompat ao.a>
	//    3    7:astore_1        
		s = ((String) (new StringBuilder()));
	//    4    8:new             #29  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #30  <Method void StringBuilder()>
	//    7   15:astore_2        
		((StringBuilder) (s)).append("javascript:loadChart(");
	//    8   16:aload_2         
	//    9   17:ldc1            #32  <String "javascript:loadChart(">
	//   10   19:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (s)).append(a);
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #18  <Field String a>
	//   15   28:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		((StringBuilder) (s)).append(")");
	//   17   32:aload_2         
	//   18   33:ldc1            #38  <String ")">
	//   19   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s)).toString());
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   24   44:invokevirtual   #47  <Method void WebViewLanguageCompat.loadUrl(String)>
	//   25   47:return          
	}

	final String a;
	final ao b;

	ao$2(ao ao1, String s)
	{
		b = ao1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ao b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void WebViewClient()>
	//    8   14:return          
	}
}

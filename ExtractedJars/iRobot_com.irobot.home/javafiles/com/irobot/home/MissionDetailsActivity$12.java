// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.irobot.home.view.WebViewLanguageCompat;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$12 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		webview = ((WebView) (a.F));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MissionDetailsActivity a>
	//    2    4:getfield        #24  <Field WebViewLanguageCompat MissionDetailsActivity.F>
	//    3    7:astore_1        
		s = ((String) (new StringBuilder()));
	//    4    8:new             #26  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void StringBuilder()>
	//    7   15:astore_2        
		((StringBuilder) (s)).append("javascript:loadChart(");
	//    8   16:aload_2         
	//    9   17:ldc1            #29  <String "javascript:loadChart(">
	//   10   19:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (s)).append(MissionDetailsActivity.d(a));
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #14  <Field MissionDetailsActivity a>
	//   15   28:invokestatic    #37  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
	//   16   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		((StringBuilder) (s)).append(")");
	//   18   35:aload_2         
	//   19   36:ldc1            #39  <String ")">
	//   20   38:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s)).toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   25   47:invokevirtual   #49  <Method void WebViewLanguageCompat.loadUrl(String)>
	//   26   50:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$12(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void WebViewClient()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.irobot.home.view.WebViewLanguageCompat;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

class MissionAndMapDetailsFragment$5 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		webview = ((WebView) (a.v));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MissionAndMapDetailsFragment a>
	//    2    4:getfield        #25  <Field WebViewLanguageCompat MissionAndMapDetailsFragment.v>
	//    3    7:astore_1        
		s = ((String) (new StringBuilder()));
	//    4    8:new             #27  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #28  <Method void StringBuilder()>
	//    7   15:astore_2        
		((StringBuilder) (s)).append("javascript:loadChart(");
	//    8   16:aload_2         
	//    9   17:ldc1            #30  <String "javascript:loadChart(">
	//   10   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (s)).append(MissionAndMapDetailsFragment.a(a));
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #15  <Field MissionAndMapDetailsFragment a>
	//   15   28:invokestatic    #37  <Method String MissionAndMapDetailsFragment.a(MissionAndMapDetailsFragment)>
	//   16   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		((StringBuilder) (s)).append(")");
	//   18   35:aload_2         
	//   19   36:ldc1            #39  <String ")">
	//   20   38:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s)).toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   25   47:invokevirtual   #49  <Method void WebViewLanguageCompat.loadUrl(String)>
	//   26   50:return          
	}

	final MissionAndMapDetailsFragment a;

	MissionAndMapDetailsFragment$5(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		a = missionandmapdetailsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MissionAndMapDetailsFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}

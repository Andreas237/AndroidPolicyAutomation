// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.irobot.home:
//			WebViewActivity

class WebViewActivity$1 extends WebViewClient
{

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(Uri.parse(s).getScheme().equals("market"))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #28  <Method Uri Uri.parse(String)>
	//*   2    4:invokevirtual   #32  <Method String Uri.getScheme()>
	//*   3    7:ldc1            #34  <String "market">
	//*   4    9:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*   5   12:ifeq            47
		{
			try
			{
				Intent intent = new Intent("android.intent.action.VIEW");
	//    6   15:new             #42  <Class Intent>
	//    7   18:dup             
	//    8   19:ldc1            #44  <String "android.intent.action.VIEW">
	//    9   21:invokespecial   #47  <Method void Intent(String)>
	//   10   24:astore_3        
				intent.setData(Uri.parse(s));
	//   11   25:aload_3         
	//   12   26:aload_2         
	//   13   27:invokestatic    #28  <Method Uri Uri.parse(String)>
	//   14   30:invokevirtual   #51  <Method Intent Intent.setData(Uri)>
	//   15   33:pop             
				((Activity)webview.getContext()).startActivity(intent);
	//   16   34:aload_1         
	//   17   35:invokevirtual   #57  <Method android.content.Context WebView.getContext()>
	//   18   38:checkcast       #59  <Class Activity>
	//   19   41:aload_3         
	//   20   42:invokevirtual   #63  <Method void Activity.startActivity(Intent)>
			}
	//*  21   45:iconst_1        
	//*  22   46:ireturn         
	//*  23   47:iconst_0        
	//*  24   48:ireturn         
			// Misplaced declaration of an exception variable
			catch(WebView webview)
	//*  25   49:astore_1        
			{
				return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
			}
			return true;
		} else
		{
			return false;
		}
	}

	final WebViewActivity a;

	WebViewActivity$1(WebViewActivity webviewactivity)
	{
		a = webviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void WebViewClient()>
	//    5    9:return          
	}
}

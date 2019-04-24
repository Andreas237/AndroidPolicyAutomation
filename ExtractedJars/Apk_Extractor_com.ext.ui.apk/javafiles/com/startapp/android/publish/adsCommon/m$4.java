// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			m, k

class m$4
	implements Runnable
{

	public void run()
	{
		try
		{
			WebView webview = new WebView(a);
	//    0    0:new             #29  <Class WebView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Context a>
	//    4    8:invokespecial   #32  <Method void WebView(Context)>
	//    5   11:astore_1        
			k.b(a, "User-Agent", webview.getSettings().getUserAgentString());
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Context a>
	//    8   16:ldc1            #34  <String "User-Agent">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #38  <Method WebSettings WebView.getSettings()>
	//   11   22:invokevirtual   #44  <Method String WebSettings.getUserAgentString()>
	//   12   25:invokestatic    #49  <Method void k.b(Context, String, String)>
			return;
	//   13   28:return          
		}
		catch(Exception exception)
	//*  14   29:astore_1        
		{
			f.a(a, d.b, "NetworkUtils.saveUserAgent - Webview failed", exception.getMessage(), "");
	//   15   30:aload_0         
	//   16   31:getfield        #20  <Field Context a>
	//   17   34:getstatic       #54  <Field d d.b>
	//   18   37:ldc1            #56  <String "NetworkUtils.saveUserAgent - Webview failed">
	//   19   39:aload_1         
	//   20   40:invokevirtual   #59  <Method String Exception.getMessage()>
	//   21   43:ldc1            #61  <String "">
	//   22   45:invokestatic    #66  <Method void f.a(Context, d, String, String, String)>
		}
	//   23   48:return          
	}

	final Context a;
	final m b;

	m$4(m m1, Context context)
	{
		b = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field m b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.os.Message;
import android.webkit.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab, s

class s$1$1 extends WebViewClient
{

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		a.b.d(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field s$1 a>
	//    2    4:getfield        #25  <Field ab s$1.b>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #31  <Method void ab.d(String)>
		for(webview = ((WebView) (a.c.iterator())); ((Iterator) (webview)).hasNext(); ((com.google.ads.interactivemedia.v3.api.ionAdSlot.ClickListener)((Iterator) (webview)).next()).onCompanionAdClick());
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field s$1 a>
	//    7   15:getfield        #35  <Field List s$1.c>
	//    8   18:invokeinterface #41  <Method Iterator List.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            50
	//   13   33:aload_1         
	//   14   34:invokeinterface #51  <Method Object Iterator.next()>
	//   15   39:checkcast       #53  <Class com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener>
	//   16   42:invokeinterface #56  <Method void com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener.onCompanionAdClick()>
	//*  17   47:goto            24
		return true;
	//   18   50:iconst_1        
	//   19   51:ireturn         
	}

	final s._cls1 a;

	s$1$1(s._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field s$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}

	// Unreferenced inner class com/google/ads/interactivemedia/v3/impl/s$1

/* anonymous class */
	class s._cls1 extends WebChromeClient
	{

		public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
		{
			webview = ((WebView) ((android.webkit.WebView.WebViewTransport)message.obj));
		//    0    0:aload           4
		//    1    2:getfield        #36  <Field Object Message.obj>
		//    2    5:checkcast       #38  <Class android.webkit.WebView$WebViewTransport>
		//    3    8:astore_1        
			((android.webkit.WebView.WebViewTransport) (webview)).setWebView(new WebView(a));
		//    4    9:aload_1         
		//    5   10:new             #40  <Class WebView>
		//    6   13:dup             
		//    7   14:aload_0         
		//    8   15:getfield        #20  <Field Context a>
		//    9   18:invokespecial   #43  <Method void WebView(Context)>
		//   10   21:invokevirtual   #47  <Method void android.webkit.WebView$WebViewTransport.setWebView(WebView)>
			((android.webkit.WebView.WebViewTransport) (webview)).getWebView().setWebViewClient(((WebViewClient) (new s._cls1._cls1(this))));
		//   11   24:aload_1         
		//   12   25:invokevirtual   #51  <Method WebView android.webkit.WebView$WebViewTransport.getWebView()>
		//   13   28:new             #11  <Class s$1$1>
		//   14   31:dup             
		//   15   32:aload_0         
		//   16   33:invokespecial   #54  <Method void s$1$1(s$1)>
		//   17   36:invokevirtual   #58  <Method void WebView.setWebViewClient(WebViewClient)>
			message.sendToTarget();
		//   18   39:aload           4
		//   19   41:invokevirtual   #61  <Method void Message.sendToTarget()>
			return true;
		//   20   44:iconst_1        
		//   21   45:ireturn         
		}

		final Context a;
		final ab b;
		final List c;

			
			{
				a = context;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #20  <Field Context a>
				b = ab1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field ab b>
				c = list;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field List c>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #27  <Method void WebChromeClient()>
			//   11   20:return          
			}
	}

}

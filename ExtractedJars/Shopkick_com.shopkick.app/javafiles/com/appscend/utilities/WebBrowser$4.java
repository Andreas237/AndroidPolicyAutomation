// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.appscend.utilities:
//			WebBrowser

class WebBrowser$4
	implements android.view.istener
{

	public void onClick(View view)
	{
		WebBrowser.access$100(WebBrowser.this).goForward();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WebBrowser this$0>
	//    2    4:invokestatic    #27  <Method WebView WebBrowser.access$100(WebBrowser)>
	//    3    7:invokevirtual   #32  <Method void WebView.goForward()>
	//    4   10:return          
	}

	final WebBrowser this$0;

	WebBrowser$4()
	{
		this$0 = WebBrowser.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WebBrowser this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

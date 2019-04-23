// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

class MadvertiseActivity$2
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		val$webView.goForward();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WebView val$webView>
	//    2    4:invokevirtual   #32  <Method void WebView.goForward()>
	//    3    7:return          
	}

	final MadvertiseActivity this$0;
	final WebView val$webView;

	MadvertiseActivity$2()
	{
		this$0 = final_madvertiseactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MadvertiseActivity this$0>
		val$webView = WebView.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field WebView val$webView>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

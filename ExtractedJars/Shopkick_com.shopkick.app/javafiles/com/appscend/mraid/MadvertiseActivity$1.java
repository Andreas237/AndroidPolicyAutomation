// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

class MadvertiseActivity$1
	implements android.view.View$OnClickListener
{

	public void onClick(View view)
	{
		if(val$webView.canGoBack())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field WebView val$webView>
	//*   2    4:invokevirtual   #33  <Method boolean WebView.canGoBack()>
	//*   3    7:ifeq            18
		{
			val$webView.goBack();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field WebView val$webView>
	//    6   14:invokevirtual   #36  <Method void WebView.goBack()>
			return;
	//    7   17:return          
		} else
		{
			finish();
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field MadvertiseActivity this$0>
	//   10   22:invokevirtual   #39  <Method void MadvertiseActivity.finish()>
			return;
	//   11   25:return          
		}
	}

	final MadvertiseActivity this$0;
	final WebView val$webView;

	MadvertiseActivity$1()
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

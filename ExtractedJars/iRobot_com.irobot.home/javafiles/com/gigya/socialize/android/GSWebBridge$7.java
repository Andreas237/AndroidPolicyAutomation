// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.webkit.WebView;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$7
	implements Runnable
{

	public void run()
	{
		GSWebBridge.access$100(GSWebBridge.this).loadUrl(val$invocation);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GSWebBridge this$0>
	//    2    4:invokestatic    #30  <Method WebView GSWebBridge.access$100(GSWebBridge)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field String val$invocation>
	//    5   11:invokevirtual   #36  <Method void WebView.loadUrl(String)>
	//    6   14:return          
	}

	final GSWebBridge this$0;
	final String val$invocation;

	GSWebBridge$7()
	{
		this$0 = final_gswebbridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSWebBridge this$0>
		val$invocation = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$invocation>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

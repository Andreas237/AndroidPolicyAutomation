// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$6$1
	implements ValueCallback
{

	public volatile void onReceiveValue(Object obj)
	{
		onReceiveValue((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class String>
	//    3    5:invokevirtual   #28  <Method void onReceiveValue(String)>
	//    4    8:return          
	}

	public void onReceiveValue(String s)
	{
		GigyaLog.d("Callback", s);
	//    0    0:ldc1            #30  <String "Callback">
	//    1    2:aload_1         
	//    2    3:invokestatic    #36  <Method void GigyaLog.d(String, String)>
	//    3    6:return          
	}

	final GSWebBridge._cls6 this$1;

	GSWebBridge$6$1()
	{
		this$1 = GSWebBridge._cls6.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GSWebBridge$6 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/GSWebBridge$6

/* anonymous class */
	class GSWebBridge._cls6
		implements Runnable
	{

		public void run()
		{
			if(android.os.Build.VERSION.SDK_INT > 18)
		//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          18
		//*   2    5:icmple          31
			{
				GSWebBridge.access$100(GSWebBridge.this).evaluateJavascript(invocation, ((ValueCallback) (new GSWebBridge._cls6._cls1())));
		//    3    8:aload_0         
		//    4    9:getfield        #21  <Field GSWebBridge this$0>
		//    5   12:invokestatic    #38  <Method WebView GSWebBridge.access$100(GSWebBridge)>
		//    6   15:aload_0         
		//    7   16:getfield        #23  <Field String val$invocation>
		//    8   19:new             #13  <Class GSWebBridge$6$1>
		//    9   22:dup             
		//   10   23:aload_0         
		//   11   24:invokespecial   #41  <Method void GSWebBridge$6$1(GSWebBridge$6)>
		//   12   27:invokevirtual   #47  <Method void WebView.evaluateJavascript(String, ValueCallback)>
				return;
		//   13   30:return          
			} else
			{
				GSWebBridge.access$100(GSWebBridge.this).loadUrl(invocation);
		//   14   31:aload_0         
		//   15   32:getfield        #21  <Field GSWebBridge this$0>
		//   16   35:invokestatic    #38  <Method WebView GSWebBridge.access$100(GSWebBridge)>
		//   17   38:aload_0         
		//   18   39:getfield        #23  <Field String val$invocation>
		//   19   42:invokevirtual   #51  <Method void WebView.loadUrl(String)>
				return;
		//   20   45:return          
			}
		}

		final GSWebBridge this$0;
		final String val$invocation;

			
			{
				this$0 = final_gswebbridge;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSWebBridge this$0>
				invocation = String.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$invocation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}

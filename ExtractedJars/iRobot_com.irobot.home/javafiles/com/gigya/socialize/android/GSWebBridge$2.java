// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$2
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		GSWebBridge.access$000(GSWebBridge.this, val$callbackId, ((Object) (gsresponse)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GSWebBridge this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String val$callbackId>
	//    4    8:aload_2         
	//    5    9:invokestatic    #31  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
	//    6   12:return          
	}

	final GSWebBridge this$0;
	final String val$callbackId;

	GSWebBridge$2()
	{
		this$0 = final_gswebbridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSWebBridge this$0>
		val$callbackId = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$callbackId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

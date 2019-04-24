// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSAsyncRequest

class GSAsyncRequest$1
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		GSAsyncRequest.access$000(GSAsyncRequest.this, gsresponse, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GSAsyncRequest this$0>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokestatic    #27  <Method void GSAsyncRequest.access$000(GSAsyncRequest, GSResponse, Object)>
		if(GSAsyncRequest.access$100(GSAsyncRequest.this) != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #17  <Field GSAsyncRequest this$0>
	//*   7   13:invokestatic    #31  <Method GSResponseListener GSAsyncRequest.access$100(GSAsyncRequest)>
	//*   8   16:ifnull          34
			GSAsyncRequest.access$100(GSAsyncRequest.this).onGSResponse(s, gsresponse, obj);
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field GSAsyncRequest this$0>
	//   11   23:invokestatic    #31  <Method GSResponseListener GSAsyncRequest.access$100(GSAsyncRequest)>
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokeinterface #33  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
	//   16   34:return          
	}

	final GSAsyncRequest this$0;

	GSAsyncRequest$1()
	{
		this$0 = GSAsyncRequest.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSAsyncRequest this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

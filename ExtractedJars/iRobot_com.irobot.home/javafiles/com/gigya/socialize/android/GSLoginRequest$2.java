// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android:
//			GSLoginRequest

class GSLoginRequest$2
	implements com.gigya.socialize.android.login.providers.viderCallback
{

	public void onResponse(GSObject gsobject)
	{
		GSLoginRequest.access$100(GSLoginRequest.this, gsobject);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GSLoginRequest this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void GSLoginRequest.access$100(GSLoginRequest, GSObject)>
	//    4    8:return          
	}

	final GSLoginRequest this$0;

	GSLoginRequest$2()
	{
		this$0 = GSLoginRequest.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSLoginRequest this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

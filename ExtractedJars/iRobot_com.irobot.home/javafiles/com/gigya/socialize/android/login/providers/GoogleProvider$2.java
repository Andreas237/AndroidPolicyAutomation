// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.os.Bundle;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$2
	implements com.google.android.gms.common.api.onnectionCallbacks
{

	public void onConnected(Bundle bundle)
	{
		GoogleProvider.access$300(GoogleProvider.this, val$silent, val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GoogleProvider this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Boolean val$silent>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//    6   12:invokestatic    #34  <Method void GoogleProvider.access$300(GoogleProvider, Boolean, LoginProvider$ProviderCallback)>
	//    7   15:return          
	}

	public void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	final GoogleProvider this$0;
	final viderCallback val$callback;
	final Boolean val$silent;

	GoogleProvider$2()
	{
		this$0 = final_googleprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GoogleProvider this$0>
		val$silent = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Boolean val$silent>
		val$callback = viderCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

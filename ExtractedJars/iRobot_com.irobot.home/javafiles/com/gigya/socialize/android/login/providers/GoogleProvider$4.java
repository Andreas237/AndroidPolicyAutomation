// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$4
	implements ResultCallback
{

	public void onResult(GoogleSignInResult googlesigninresult)
	{
		GoogleProvider.access$200(GoogleProvider.this, googlesigninresult, val$silent, val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field GoogleProvider this$0>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Boolean val$silent>
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field LoginProvider$ProviderCallback val$callback>
	//    7   13:invokestatic    #36  <Method void GoogleProvider.access$200(GoogleProvider, GoogleSignInResult, Boolean, LoginProvider$ProviderCallback)>
	//    8   16:return          
	}

	public volatile void onResult(Result result)
	{
		onResult((GoogleSignInResult)result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class GoogleSignInResult>
	//    3    5:invokevirtual   #41  <Method void onResult(GoogleSignInResult)>
	//    4    8:return          
	}

	final GoogleProvider this$0;
	final viderCallback val$callback;
	final Boolean val$silent;

	GoogleProvider$4()
	{
		this$0 = final_googleprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field GoogleProvider this$0>
		val$silent = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Boolean val$silent>
		val$callback = viderCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}

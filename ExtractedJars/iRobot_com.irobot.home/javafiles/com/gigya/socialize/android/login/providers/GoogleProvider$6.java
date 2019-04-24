// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$6
	implements ResultCallback
{

	public volatile void onResult(Result result)
	{
		onResult((Status)result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class Status>
	//    3    5:invokevirtual   #28  <Method void onResult(Status)>
	//    4    8:return          
	}

	public void onResult(Status status)
	{
		googleClient.disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GoogleProvider this$0>
	//    2    4:getfield        #32  <Field GoogleApiClient GoogleProvider.googleClient>
	//    3    7:invokevirtual   #37  <Method void GoogleApiClient.disconnect()>
		if(currentActivity != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field GoogleProvider this$0>
	//*   6   14:getfield        #41  <Field Activity GoogleProvider.currentActivity>
	//*   7   17:ifnull          38
		{
			currentActivity.finish();
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field GoogleProvider this$0>
	//   10   24:getfield        #41  <Field Activity GoogleProvider.currentActivity>
	//   11   27:invokevirtual   #44  <Method void Activity.finish()>
			currentActivity = null;
	//   12   30:aload_0         
	//   13   31:getfield        #18  <Field GoogleProvider this$0>
	//   14   34:aconst_null     
	//   15   35:putfield        #41  <Field Activity GoogleProvider.currentActivity>
		}
	//   16   38:return          
	}

	final GoogleProvider this$0;

	GoogleProvider$6()
	{
		this$0 = GoogleProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GoogleProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

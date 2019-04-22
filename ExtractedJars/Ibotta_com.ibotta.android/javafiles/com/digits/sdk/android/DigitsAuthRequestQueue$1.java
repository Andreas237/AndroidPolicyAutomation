// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;

// Referenced classes of package com.digits.sdk.android:
//			DigitsAuthRequestQueue, DigitsClient

class DigitsAuthRequestQueue$1 extends Callback
{

	public void failure(TwitterException twitterexception)
	{
		val$callback.failure(twitterexception);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Callback val$callback>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void Callback.failure(TwitterException)>
	//    4    8:return          
	}

	public void success(Result result)
	{
		val$callback.success(new Result(((Object) (digitsClient.getApiClient((Session)result.data))), ((retrofit.client.Response) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Callback val$callback>
	//    2    4:new             #32  <Class Result>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field DigitsAuthRequestQueue this$0>
	//    6   12:getfield        #36  <Field DigitsClient DigitsAuthRequestQueue.digitsClient>
	//    7   15:aload_1         
	//    8   16:getfield        #40  <Field Object Result.data>
	//    9   19:checkcast       #42  <Class Session>
	//   10   22:invokevirtual   #48  <Method DigitsApiClient DigitsClient.getApiClient(Session)>
	//   11   25:aconst_null     
	//   12   26:invokespecial   #51  <Method void Result(Object, retrofit.client.Response)>
	//   13   29:invokevirtual   #53  <Method void Callback.success(Result)>
	//   14   32:return          
	}

	final DigitsAuthRequestQueue this$0;
	final Callback val$callback;

	DigitsAuthRequestQueue$1()
	{
		this$0 = final_digitsauthrequestqueue;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DigitsAuthRequestQueue this$0>
		val$callback = Callback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Callback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Callback()>
	//    8   14:return          
	}
}

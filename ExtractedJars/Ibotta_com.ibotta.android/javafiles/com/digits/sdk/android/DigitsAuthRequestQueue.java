// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.core.internal.AuthRequestQueue;
import com.twitter.sdk.android.core.internal.SessionProvider;

// Referenced classes of package com.digits.sdk.android:
//			DigitsClient

class DigitsAuthRequestQueue extends AuthRequestQueue
{

	DigitsAuthRequestQueue(DigitsClient digitsclient, SessionProvider sessionprovider)
	{
		super(sessionprovider);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #13  <Method void AuthRequestQueue(SessionProvider)>
		digitsClient = digitsclient;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field DigitsClient digitsClient>
	//    6   10:return          
	}

	protected boolean addClientRequest(final Callback callback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = addRequest(((Callback) (new Callback() {

			public void failure(TwitterException twitterexception)
			{
				callback.failure(twitterexception);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Callback val$callback>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #28  <Method void Callback.failure(TwitterException)>
			//    4    8:return          
			}

			public void success(Result result)
			{
				callback.success(new Result(((Object) (digitsClient.getApiClient((Session)result.data))), ((retrofit.client.Response) (null))));
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

			
			{
				this$0 = DigitsAuthRequestQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field DigitsAuthRequestQueue this$0>
				callback = callback1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Callback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Callback()>
			//    8   14:return          
			}
		}
)));
	//    2    2:aload_0         
	//    3    3:new             #6   <Class DigitsAuthRequestQueue$1>
	//    4    6:dup             
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #21  <Method void DigitsAuthRequestQueue$1(DigitsAuthRequestQueue, Callback)>
	//    8   12:invokevirtual   #24  <Method boolean addRequest(Callback)>
	//    9   15:istore_2        
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_2         
	//   13   19:ireturn         
		callback;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw callback;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	final DigitsClient digitsClient;
}

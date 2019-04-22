// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			AccessTokenManager

class AccessTokenManager$1
	implements Runnable
{

	public void run()
	{
		AccessTokenManager.access$000(AccessTokenManager.this, val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessTokenManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//    4    8:invokestatic    #29  <Method void AccessTokenManager.access$000(AccessTokenManager, AccessToken$AccessTokenRefreshCallback)>
	//    5   11:return          
	}

	final AccessTokenManager this$0;
	final enRefreshCallback val$callback;

	AccessTokenManager$1()
	{
		this$0 = final_accesstokenmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AccessTokenManager this$0>
		val$callback = enRefreshCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AccessToken$AccessTokenRefreshCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//			FacebookSdk

static final class FacebookSdk$4
	implements Runnable
{

	public void run()
	{
		FacebookSdk.publishInstallAndWaitForResponse(val$applicationContext, val$applicationId);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context val$applicationContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String val$applicationId>
	//    4    8:invokestatic    #29  <Method GraphResponse FacebookSdk.publishInstallAndWaitForResponse(Context, String)>
	//    5   11:pop             
	//    6   12:return          
	}

	final Context val$applicationContext;
	final String val$applicationId;

	FacebookSdk$4(Context context, String s)
	{
		val$applicationContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context val$applicationContext>
		val$applicationId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String val$applicationId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

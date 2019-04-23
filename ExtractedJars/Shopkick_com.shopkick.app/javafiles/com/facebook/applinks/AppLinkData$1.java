// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.content.Context;

// Referenced classes of package com.facebook.applinks:
//			AppLinkData

static final class AppLinkData$1
	implements Runnable
{

	public void run()
	{
		AppLinkData.access$000(val$applicationContext, val$applicationIdCopy, val$completionHandler);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context val$applicationContext>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String val$applicationIdCopy>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field AppLinkData$CompletionHandler val$completionHandler>
	//    6   12:invokestatic    #32  <Method void AppLinkData.access$000(Context, String, AppLinkData$CompletionHandler)>
	//    7   15:return          
	}

	final Context val$applicationContext;
	final String val$applicationIdCopy;
	final mpletionHandler val$completionHandler;

	AppLinkData$1(Context context, String s, mpletionHandler mpletionhandler)
	{
		val$applicationContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context val$applicationContext>
		val$applicationIdCopy = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String val$applicationIdCopy>
		val$completionHandler = mpletionhandler;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field AppLinkData$CompletionHandler val$completionHandler>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}

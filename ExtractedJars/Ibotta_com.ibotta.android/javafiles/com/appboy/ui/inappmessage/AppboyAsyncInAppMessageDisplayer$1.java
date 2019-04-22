// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyAsyncInAppMessageDisplayer, AppboyInAppMessageManager

class AppboyAsyncInAppMessageDisplayer$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.d(AppboyAsyncInAppMessageDisplayer.access$000(), "Displaying in-app message.");
	//    0    0:invokestatic    #30  <Method String AppboyAsyncInAppMessageDisplayer.access$000()>
	//    1    3:ldc1            #32  <String "Displaying in-app message.">
	//    2    5:invokestatic    #38  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		AppboyInAppMessageManager.getInstance().displayInAppMessage(val$inAppMessage, false);
	//    4    9:invokestatic    #44  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field IInAppMessage val$inAppMessage>
	//    7   16:iconst_0        
	//    8   17:invokevirtual   #48  <Method boolean AppboyInAppMessageManager.displayInAppMessage(IInAppMessage, boolean)>
	//    9   20:pop             
	//   10   21:return          
	}

	final AppboyAsyncInAppMessageDisplayer this$0;
	final IInAppMessage val$inAppMessage;

	AppboyAsyncInAppMessageDisplayer$1()
	{
		this$0 = final_appboyasyncinappmessagedisplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyAsyncInAppMessageDisplayer this$0>
		val$inAppMessage = IInAppMessage.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field IInAppMessage val$inAppMessage>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

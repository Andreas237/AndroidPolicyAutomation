// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager, AppboyAsyncInAppMessageDisplayer

class AppboyInAppMessageManager$1
	implements Runnable
{

	public void run()
	{
		(new AppboyAsyncInAppMessageDisplayer()).execute(((Object []) (new IInAppMessage[] {
			val$inAppMessage
		})));
	//    0    0:new             #28  <Class AppboyAsyncInAppMessageDisplayer>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void AppboyAsyncInAppMessageDisplayer()>
	//    3    7:iconst_1        
	//    4    8:anewarray       IInAppMessage[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field IInAppMessage val$inAppMessage>
	//    9   17:aastore         
	//   10   18:invokevirtual   #35  <Method android.os.AsyncTask AppboyAsyncInAppMessageDisplayer.execute(Object[])>
	//   11   21:pop             
	//   12   22:return          
	}

	final AppboyInAppMessageManager this$0;
	final IInAppMessage val$inAppMessage;

	AppboyInAppMessageManager$1()
	{
		this$0 = final_appboyinappmessagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyInAppMessageManager this$0>
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

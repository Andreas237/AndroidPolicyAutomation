// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.os.AsyncTask;
import com.appboy.models.IInAppMessage;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager, AppboyAsyncInAppMessageDisplayer

class AppboyInAppMessageManager$1
	implements Runnable
{

	public void run()
	{
		AppboyAsyncInAppMessageDisplayer appboyasyncinappmessagedisplayer = new AppboyAsyncInAppMessageDisplayer();
	//    0    0:new             #29  <Class AppboyAsyncInAppMessageDisplayer>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void AppboyAsyncInAppMessageDisplayer()>
	//    3    7:astore_1        
		IInAppMessage aiinappmessage[] = new IInAppMessage[1];
	//    4    8:iconst_1        
	//    5    9:anewarray       IInAppMessage[]
	//    6   12:astore_2        
		aiinappmessage[0] = val$inAppMessage;
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field IInAppMessage val$inAppMessage>
	//   11   19:aastore         
		if(!(appboyasyncinappmessagedisplayer instanceof AsyncTask))
	//*  12   20:aload_1         
	//*  13   21:instanceof      #34  <Class AsyncTask>
	//*  14   24:ifne            34
		{
			appboyasyncinappmessagedisplayer.execute(((Object []) (aiinappmessage)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #38  <Method AsyncTask AppboyAsyncInAppMessageDisplayer.execute(Object[])>
	//   18   32:pop             
			return;
	//   19   33:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)appboyasyncinappmessagedisplayer, ((Object []) (aiinappmessage)));
	//   20   34:aload_1         
	//   21   35:checkcast       #34  <Class AsyncTask>
	//   22   38:aload_2         
	//   23   39:invokestatic    #43  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   24   42:pop             
			return;
	//   25   43:return          
		}
	}

	final AppboyInAppMessageManager this$0;
	final IInAppMessage val$inAppMessage;

	AppboyInAppMessageManager$1()
	{
		this$0 = final_appboyinappmessagemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AppboyInAppMessageManager this$0>
		val$inAppMessage = IInAppMessage.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field IInAppMessage val$inAppMessage>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}

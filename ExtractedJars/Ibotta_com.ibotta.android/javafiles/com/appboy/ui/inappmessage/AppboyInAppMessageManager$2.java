// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager

class AppboyInAppMessageManager$2
	implements IEventSubscriber
{

	public void trigger(InAppMessageEvent inappmessageevent)
	{
		if(getInAppMessageManagerListener().onInAppMessageReceived(inappmessageevent.getInAppMessage()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field AppboyInAppMessageManager this$0>
	//*   2    4:invokevirtual   #28  <Method IInAppMessageManagerListener AppboyInAppMessageManager.getInAppMessageManagerListener()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #34  <Method com.appboy.models.IInAppMessage InAppMessageEvent.getInAppMessage()>
	//*   5   11:invokeinterface #40  <Method boolean IInAppMessageManagerListener.onInAppMessageReceived(com.appboy.models.IInAppMessage)>
	//*   6   16:ifeq            20
		{
			return;
	//    7   19:return          
		} else
		{
			addInAppMessage(inappmessageevent.getInAppMessage());
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field AppboyInAppMessageManager this$0>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #34  <Method com.appboy.models.IInAppMessage InAppMessageEvent.getInAppMessage()>
	//   12   28:invokevirtual   #44  <Method void AppboyInAppMessageManager.addInAppMessage(com.appboy.models.IInAppMessage)>
			return;
	//   13   31:return          
		}
	}

	public volatile void trigger(Object obj)
	{
		trigger((InAppMessageEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class InAppMessageEvent>
	//    3    5:invokevirtual   #47  <Method void trigger(InAppMessageEvent)>
	//    4    8:return          
	}

	final AppboyInAppMessageManager this$0;

	AppboyInAppMessageManager$2()
	{
		this$0 = AppboyInAppMessageManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppboyInAppMessageManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

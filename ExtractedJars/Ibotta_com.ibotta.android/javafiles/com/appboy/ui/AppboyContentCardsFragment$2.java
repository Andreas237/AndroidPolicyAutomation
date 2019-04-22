// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.os.Handler;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.IEventSubscriber;

// Referenced classes of package com.appboy.ui:
//			AppboyContentCardsFragment

class AppboyContentCardsFragment$2
	implements IEventSubscriber
{

	public void trigger(ContentCardsUpdatedEvent contentcardsupdatedevent)
	{
		contentcardsupdatedevent = ((ContentCardsUpdatedEvent) (new ntentCardsUpdateRunnable(AppboyContentCardsFragment.this, contentcardsupdatedevent)));
	//    0    0:new             #25  <Class AppboyContentCardsFragment$ContentCardsUpdateRunnable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field AppboyContentCardsFragment this$0>
	//    4    8:aload_1         
	//    5    9:invokespecial   #28  <Method void AppboyContentCardsFragment$ContentCardsUpdateRunnable(AppboyContentCardsFragment, ContentCardsUpdatedEvent)>
	//    6   12:astore_1        
		AppboyContentCardsFragment.access$200(AppboyContentCardsFragment.this).post(((Runnable) (contentcardsupdatedevent)));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field AppboyContentCardsFragment this$0>
	//    9   17:invokestatic    #32  <Method Handler AppboyContentCardsFragment.access$200(AppboyContentCardsFragment)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #38  <Method boolean Handler.post(Runnable)>
	//   12   24:pop             
	//   13   25:return          
	}

	public volatile void trigger(Object obj)
	{
		trigger((ContentCardsUpdatedEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class ContentCardsUpdatedEvent>
	//    3    5:invokevirtual   #43  <Method void trigger(ContentCardsUpdatedEvent)>
	//    4    8:return          
	}

	final AppboyContentCardsFragment this$0;

	AppboyContentCardsFragment$2()
	{
		this$0 = AppboyContentCardsFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppboyContentCardsFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

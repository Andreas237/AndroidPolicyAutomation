// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			TabLayoutSelectionEvent

final class TabLayoutSelectionEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public TabLayoutSelectionEventOnSubscribe(TabLayout tablayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = tablayout;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field TabLayout view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Subscriber>
	//    3    5:invokevirtual   #30  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #35  <Method void Preconditions.checkUiThread()>
		android.support.design.widget.TabLayout.OnTabSelectedListener ontabselectedlistener = new android.support.design.widget.TabLayout.OnTabSelectedListener() {

			public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            31
					subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(view, TabLayoutSelectionEvent.Kind.RESELECTED, tab))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
			//    9   21:getstatic       #43  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.RESELECTED>
			//   10   24:aload_1         
			//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
			//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
			//   13   31:return          
			}

			public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            31
					subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(view, TabLayoutSelectionEvent.Kind.SELECTED, tab))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
			//    9   21:getstatic       #57  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.SELECTED>
			//   10   24:aload_1         
			//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
			//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
			//   13   31:return          
			}

			public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            31
					subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(view, TabLayoutSelectionEvent.Kind.UNSELECTED, tab))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
			//    9   21:getstatic       #61  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.UNSELECTED>
			//   10   24:aload_1         
			//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
			//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
			//   13   31:return          
			}

			final TabLayoutSelectionEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = TabLayoutSelectionEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class TabLayoutSelectionEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void TabLayoutSelectionEventOnSubscribe$1(TabLayoutSelectionEventOnSubscribe, Subscriber)>
	//    6   12:astore_3        
		view.setOnTabSelectedListener(ontabselectedlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field TabLayout view>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #44  <Method void TabLayout.setOnTabSelectedListener(android.support.design.widget.TabLayout$OnTabSelectedListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnTabSelectedListener(((android.support.design.widget.TabLayout.OnTabSelectedListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field TabLayoutSelectionEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void TabLayout.setOnTabSelectedListener(android.support.design.widget.TabLayout$OnTabSelectedListener)>
			//    5   11:return          
			}

			final TabLayoutSelectionEventOnSubscribe this$0;

			
			{
				this$0 = TabLayoutSelectionEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TabLayoutSelectionEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class TabLayoutSelectionEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void TabLayoutSelectionEventOnSubscribe$2(TabLayoutSelectionEventOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		int i = view.getSelectedTabPosition();
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field TabLayout view>
	//   19   37:invokevirtual   #55  <Method int TabLayout.getSelectedTabPosition()>
	//   20   40:istore_2        
		if(i != -1)
	//*  21   41:iload_2         
	//*  22   42:iconst_m1       
	//*  23   43:icmpeq          68
			subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(view, TabLayoutSelectionEvent.Kind.SELECTED, view.getTabAt(i)))));
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #20  <Field TabLayout view>
	//   27   51:getstatic       #61  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.SELECTED>
	//   28   54:aload_0         
	//   29   55:getfield        #20  <Field TabLayout view>
	//   30   58:iload_2         
	//   31   59:invokevirtual   #65  <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
	//   32   62:invokestatic    #71  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
	//   33   65:invokevirtual   #74  <Method void Subscriber.onNext(Object)>
	//   34   68:return          
	}

	private final TabLayout view;


/*
	static TabLayout access$000(TabLayoutSelectionEventOnSubscribe tablayoutselectioneventonsubscribe)
	{
		return tablayoutselectioneventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TabLayout view>
	//    2    4:areturn         
	}

*/
}

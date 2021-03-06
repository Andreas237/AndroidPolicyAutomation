// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class TabLayoutSelectionsOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public TabLayoutSelectionsOnSubscribe(TabLayout tablayout)
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
			//    0    0:return          
			}

			public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #34  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            18
					subscriber.onNext(((Object) (tab)));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokevirtual   #38  <Method void Subscriber.onNext(Object)>
			//    8   18:return          
			}

			public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
			{
			//    0    0:return          
			}

			final TabLayoutSelectionsOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = TabLayoutSelectionsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TabLayoutSelectionsOnSubscribe this$0>
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
	//    1    3:new             #9   <Class TabLayoutSelectionsOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void TabLayoutSelectionsOnSubscribe$1(TabLayoutSelectionsOnSubscribe, Subscriber)>
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
			//    1    1:getfield        #15  <Field TabLayoutSelectionsOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method TabLayout TabLayoutSelectionsOnSubscribe.access$000(TabLayoutSelectionsOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void TabLayout.setOnTabSelectedListener(android.support.design.widget.TabLayout$OnTabSelectedListener)>
			//    5   11:return          
			}

			final TabLayoutSelectionsOnSubscribe this$0;

			
			{
				this$0 = TabLayoutSelectionsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TabLayoutSelectionsOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class TabLayoutSelectionsOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void TabLayoutSelectionsOnSubscribe$2(TabLayoutSelectionsOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		int i = view.getSelectedTabPosition();
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field TabLayout view>
	//   19   37:invokevirtual   #55  <Method int TabLayout.getSelectedTabPosition()>
	//   20   40:istore_2        
		if(i != -1)
	//*  21   41:iload_2         
	//*  22   42:iconst_m1       
	//*  23   43:icmpeq          58
			subscriber.onNext(((Object) (view.getTabAt(i))));
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #20  <Field TabLayout view>
	//   27   51:iload_2         
	//   28   52:invokevirtual   #59  <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
	//   29   55:invokevirtual   #62  <Method void Subscriber.onNext(Object)>
	//   30   58:return          
	}

	private final TabLayout view;


/*
	static TabLayout access$000(TabLayoutSelectionsOnSubscribe tablayoutselectionsonsubscribe)
	{
		return tablayoutselectionsonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TabLayout view>
	//    2    4:areturn         
	}

*/
}

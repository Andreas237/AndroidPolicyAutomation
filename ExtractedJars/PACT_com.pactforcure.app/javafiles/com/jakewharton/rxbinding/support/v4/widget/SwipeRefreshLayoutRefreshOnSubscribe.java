// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class SwipeRefreshLayoutRefreshOnSubscribe
	implements rx.Observable.OnSubscribe
{

	SwipeRefreshLayoutRefreshOnSubscribe(SwipeRefreshLayout swiperefreshlayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = swiperefreshlayout;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field SwipeRefreshLayout view>
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
		android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener onrefreshlistener = new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

			public void onRefresh()
			{
				subscriber.onNext(((Object) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Subscriber val$subscriber>
			//    2    4:aconst_null     
			//    3    5:invokevirtual   #32  <Method void Subscriber.onNext(Object)>
			//    4    8:return          
			}

			final SwipeRefreshLayoutRefreshOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = SwipeRefreshLayoutRefreshOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
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
	//    1    3:new             #9   <Class SwipeRefreshLayoutRefreshOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void SwipeRefreshLayoutRefreshOnSubscribe$1(SwipeRefreshLayoutRefreshOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnRefreshListener(onrefreshlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field SwipeRefreshLayout view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method SwipeRefreshLayout SwipeRefreshLayoutRefreshOnSubscribe.access$000(SwipeRefreshLayoutRefreshOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
			//    5   11:return          
			}

			final SwipeRefreshLayoutRefreshOnSubscribe this$0;

			
			{
				this$0 = SwipeRefreshLayoutRefreshOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class SwipeRefreshLayoutRefreshOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void SwipeRefreshLayoutRefreshOnSubscribe$2(SwipeRefreshLayoutRefreshOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final SwipeRefreshLayout view;


/*
	static SwipeRefreshLayout access$000(SwipeRefreshLayoutRefreshOnSubscribe swiperefreshlayoutrefreshonsubscribe)
	{
		return swiperefreshlayoutrefreshonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SwipeRefreshLayout view>
	//    2    4:areturn         
	}

*/
}

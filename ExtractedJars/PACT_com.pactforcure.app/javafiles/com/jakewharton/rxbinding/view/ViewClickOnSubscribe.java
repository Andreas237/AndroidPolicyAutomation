// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class ViewClickOnSubscribe
	implements rx.Observable.OnSubscribe
{

	ViewClickOnSubscribe(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object event>
		view = view1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #24  <Field View view>
	//   10   20:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class Subscriber>
	//    3    5:invokevirtual   #36  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #41  <Method void Preconditions.checkUiThread()>
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            24
					subscriber.onNext(event);
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field ViewClickOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method Object ViewClickOnSubscribe.access$000(ViewClickOnSubscribe)>
			//    9   21:invokevirtual   #41  <Method void Subscriber.onNext(Object)>
			//   10   24:return          
			}

			final ViewClickOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewClickOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewClickOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #44  <Method void ViewClickOnSubscribe$1(ViewClickOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnClickListener(onclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #50  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnClickListener(((android.view.View.OnClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewClickOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewClickOnSubscribe.access$100(ViewClickOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			//    5   11:return          
			}

			final ViewClickOnSubscribe this$0;

			
			{
				this$0 = ViewClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewClickOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewClickOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #53  <Method void ViewClickOnSubscribe$2(ViewClickOnSubscribe)>
	//   16   30:invokevirtual   #57  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Object event = new Object();
	private final View view;


/*
	static Object access$000(ViewClickOnSubscribe viewclickonsubscribe)
	{
		return viewclickonsubscribe.event;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object event>
	//    2    4:areturn         
	}

*/


/*
	static View access$100(ViewClickOnSubscribe viewclickonsubscribe)
	{
		return viewclickonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field View view>
	//    2    4:areturn         
	}

*/
}

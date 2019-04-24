// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class ViewAttachesOnSubscribe
	implements rx.Observable.OnSubscribe
{

	ViewAttachesOnSubscribe(View view1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object event>
		view = view1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field View view>
		callOnAttach = flag;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #28  <Field boolean callOnAttach>
	//   13   25:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class Subscriber>
	//    3    5:invokevirtual   #42  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #47  <Method void Preconditions.checkUiThread()>
		final android.view.View.OnAttachStateChangeListener listener = new android.view.View.OnAttachStateChangeListener() {

			public void onViewAttachedToWindow(View view1)
			{
				if(callOnAttach && !subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
			//*   2    4:invokestatic    #32  <Method boolean ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe)>
			//*   3    7:ifeq            34
			//*   4   10:aload_0         
			//*   5   11:getfield        #21  <Field Subscriber val$subscriber>
			//*   6   14:invokevirtual   #38  <Method boolean Subscriber.isUnsubscribed()>
			//*   7   17:ifne            34
					subscriber.onNext(event);
			//    8   20:aload_0         
			//    9   21:getfield        #21  <Field Subscriber val$subscriber>
			//   10   24:aload_0         
			//   11   25:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
			//   12   28:invokestatic    #42  <Method Object ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe)>
			//   13   31:invokevirtual   #46  <Method void Subscriber.onNext(Object)>
			//   14   34:return          
			}

			public void onViewDetachedFromWindow(View view1)
			{
				if(!callOnAttach && !subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
			//*   2    4:invokestatic    #32  <Method boolean ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe)>
			//*   3    7:ifne            34
			//*   4   10:aload_0         
			//*   5   11:getfield        #21  <Field Subscriber val$subscriber>
			//*   6   14:invokevirtual   #38  <Method boolean Subscriber.isUnsubscribed()>
			//*   7   17:ifne            34
					subscriber.onNext(event);
			//    8   20:aload_0         
			//    9   21:getfield        #21  <Field Subscriber val$subscriber>
			//   10   24:aload_0         
			//   11   25:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
			//   12   28:invokestatic    #42  <Method Object ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe)>
			//   13   31:invokevirtual   #46  <Method void Subscriber.onNext(Object)>
			//   14   34:return          
			}

			final ViewAttachesOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewAttachesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewAttachesOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewAttachesOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #50  <Method void ViewAttachesOnSubscribe$1(ViewAttachesOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.addOnAttachStateChangeListener(listener);
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #56  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.removeOnAttachStateChangeListener(listener);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ViewAttachesOnSubscribe this$0>
			//    2    4:invokestatic    #28  <Method View ViewAttachesOnSubscribe.access$200(ViewAttachesOnSubscribe)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field android.view.View$OnAttachStateChangeListener val$listener>
			//    5   11:invokevirtual   #34  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			//    6   14:return          
			}

			final ViewAttachesOnSubscribe this$0;
			final android.view.View.OnAttachStateChangeListener val$listener;

			
			{
				this$0 = ViewAttachesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewAttachesOnSubscribe this$0>
				listener = onattachstatechangelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field android.view.View$OnAttachStateChangeListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
			//    8   14:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewAttachesOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokespecial   #59  <Method void ViewAttachesOnSubscribe$2(ViewAttachesOnSubscribe, android.view.View$OnAttachStateChangeListener)>
	//   17   31:invokevirtual   #63  <Method void Subscriber.add(rx.Subscription)>
	//   18   34:return          
	}

	private final boolean callOnAttach;
	private final Object event = new Object();
	private final View view;


/*
	static boolean access$000(ViewAttachesOnSubscribe viewattachesonsubscribe)
	{
		return viewattachesonsubscribe.callOnAttach;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean callOnAttach>
	//    2    4:ireturn         
	}

*/


/*
	static Object access$100(ViewAttachesOnSubscribe viewattachesonsubscribe)
	{
		return viewattachesonsubscribe.event;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object event>
	//    2    4:areturn         
	}

*/


/*
	static View access$200(ViewAttachesOnSubscribe viewattachesonsubscribe)
	{
		return viewattachesonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field View view>
	//    2    4:areturn         
	}

*/
}

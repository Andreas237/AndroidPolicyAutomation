// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func0;

final class ViewLongClickOnSubscribe
	implements rx.Observable.OnSubscribe
{

	ViewLongClickOnSubscribe(View view1, Func0 func0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object event>
		view = view1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #27  <Field View view>
		handled = func0;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #29  <Field Func0 handled>
	//   13   25:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class Subscriber>
	//    3    5:invokevirtual   #45  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #50  <Method void Preconditions.checkUiThread()>
		android.view.View.OnLongClickListener onlongclicklistener = new android.view.View.OnLongClickListener() {

			public boolean onLongClick(View view1)
			{
				if(((Boolean)handled.call()).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field ViewLongClickOnSubscribe this$0>
			//*   2    4:invokestatic    #31  <Method Func0 ViewLongClickOnSubscribe.access$000(ViewLongClickOnSubscribe)>
			//*   3    7:invokeinterface #36  <Method Object Func0.call()>
			//*   4   12:checkcast       #38  <Class Boolean>
			//*   5   15:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
			//*   6   18:ifeq            47
				{
					if(!subscriber.isUnsubscribed())
			//*   7   21:aload_0         
			//*   8   22:getfield        #21  <Field Subscriber val$subscriber>
			//*   9   25:invokevirtual   #47  <Method boolean Subscriber.isUnsubscribed()>
			//*  10   28:ifne            45
						subscriber.onNext(event);
			//   11   31:aload_0         
			//   12   32:getfield        #21  <Field Subscriber val$subscriber>
			//   13   35:aload_0         
			//   14   36:getfield        #19  <Field ViewLongClickOnSubscribe this$0>
			//   15   39:invokestatic    #51  <Method Object ViewLongClickOnSubscribe.access$100(ViewLongClickOnSubscribe)>
			//   16   42:invokevirtual   #55  <Method void Subscriber.onNext(Object)>
					return true;
			//   17   45:iconst_1        
			//   18   46:ireturn         
				} else
				{
					return false;
			//   19   47:iconst_0        
			//   20   48:ireturn         
				}
			}

			final ViewLongClickOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewLongClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewLongClickOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewLongClickOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #53  <Method void ViewLongClickOnSubscribe$1(ViewLongClickOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnLongClickListener(onlongclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #59  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewLongClickOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewLongClickOnSubscribe.access$200(ViewLongClickOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
			//    5   11:return          
			}

			final ViewLongClickOnSubscribe this$0;

			
			{
				this$0 = ViewLongClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewLongClickOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewLongClickOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #62  <Method void ViewLongClickOnSubscribe$2(ViewLongClickOnSubscribe)>
	//   16   30:invokevirtual   #66  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Object event = new Object();
	private final Func0 handled;
	private final View view;


/*
	static Func0 access$000(ViewLongClickOnSubscribe viewlongclickonsubscribe)
	{
		return viewlongclickonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Func0 handled>
	//    2    4:areturn         
	}

*/


/*
	static Object access$100(ViewLongClickOnSubscribe viewlongclickonsubscribe)
	{
		return viewlongclickonsubscribe.event;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object event>
	//    2    4:areturn         
	}

*/


/*
	static View access$200(ViewLongClickOnSubscribe viewlongclickonsubscribe)
	{
		return viewlongclickonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field View view>
	//    2    4:areturn         
	}

*/
}

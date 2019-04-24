// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachEvent

final class ViewAttachEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	ViewAttachEventOnSubscribe(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = view1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field View view>
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
		final android.view.View.OnAttachStateChangeListener listener = new android.view.View.OnAttachStateChangeListener() {

			public void onViewAttachedToWindow(View view1)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #34  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            30
					subscriber.onNext(((Object) (ViewAttachEvent.create(view, ViewAttachEvent.Kind.ATTACH))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field ViewAttachEventOnSubscribe this$0>
			//    8   18:invokestatic    #38  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
			//    9   21:getstatic       #44  <Field ViewAttachEvent$Kind ViewAttachEvent$Kind.ATTACH>
			//   10   24:invokestatic    #50  <Method ViewAttachEvent ViewAttachEvent.create(View, ViewAttachEvent$Kind)>
			//   11   27:invokevirtual   #54  <Method void Subscriber.onNext(Object)>
			//   12   30:return          
			}

			public void onViewDetachedFromWindow(View view1)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #34  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            30
					subscriber.onNext(((Object) (ViewAttachEvent.create(view, ViewAttachEvent.Kind.DETACH))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field ViewAttachEventOnSubscribe this$0>
			//    8   18:invokestatic    #38  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
			//    9   21:getstatic       #59  <Field ViewAttachEvent$Kind ViewAttachEvent$Kind.DETACH>
			//   10   24:invokestatic    #50  <Method ViewAttachEvent ViewAttachEvent.create(View, ViewAttachEvent$Kind)>
			//   11   27:invokevirtual   #54  <Method void Subscriber.onNext(Object)>
			//   12   30:return          
			}

			final ViewAttachEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewAttachEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewAttachEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewAttachEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void ViewAttachEventOnSubscribe$1(ViewAttachEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.addOnAttachStateChangeListener(listener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.removeOnAttachStateChangeListener(listener);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ViewAttachEventOnSubscribe this$0>
			//    2    4:invokestatic    #28  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field android.view.View$OnAttachStateChangeListener val$listener>
			//    5   11:invokevirtual   #34  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			//    6   14:return          
			}

			final ViewAttachEventOnSubscribe this$0;
			final android.view.View.OnAttachStateChangeListener val$listener;

			
			{
				this$0 = ViewAttachEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewAttachEventOnSubscribe this$0>
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
	//   12   22:new             #11  <Class ViewAttachEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokespecial   #47  <Method void ViewAttachEventOnSubscribe$2(ViewAttachEventOnSubscribe, android.view.View$OnAttachStateChangeListener)>
	//   17   31:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
	//   18   34:return          
	}

	private final View view;


/*
	static View access$000(ViewAttachEventOnSubscribe viewattacheventonsubscribe)
	{
		return viewattacheventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field View view>
	//    2    4:areturn         
	}

*/
}

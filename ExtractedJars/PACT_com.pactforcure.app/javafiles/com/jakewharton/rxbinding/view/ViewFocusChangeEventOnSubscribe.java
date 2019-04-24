// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewFocusChangeEvent

final class ViewFocusChangeEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public ViewFocusChangeEventOnSubscribe(View view1)
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
		android.view.View.OnFocusChangeListener onfocuschangelistener = new android.view.View.OnFocusChangeListener() {

			public void onFocusChange(View view1, boolean flag)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            28
					subscriber.onNext(((Object) (ViewFocusChangeEvent.create(view, flag))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field ViewFocusChangeEventOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method View ViewFocusChangeEventOnSubscribe.access$000(ViewFocusChangeEventOnSubscribe)>
			//    9   21:iload_2         
			//   10   22:invokestatic    #43  <Method ViewFocusChangeEvent ViewFocusChangeEvent.create(View, boolean)>
			//   11   25:invokevirtual   #47  <Method void Subscriber.onNext(Object)>
			//   12   28:return          
			}

			final ViewFocusChangeEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewFocusChangeEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewFocusChangeEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewFocusChangeEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void ViewFocusChangeEventOnSubscribe$1(ViewFocusChangeEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnFocusChangeListener(onfocuschangelistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void View.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnFocusChangeListener(((android.view.View.OnFocusChangeListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewFocusChangeEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewFocusChangeEventOnSubscribe.access$000(ViewFocusChangeEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
			//    5   11:return          
			}

			final ViewFocusChangeEventOnSubscribe this$0;

			
			{
				this$0 = ViewFocusChangeEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewFocusChangeEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewFocusChangeEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void ViewFocusChangeEventOnSubscribe$2(ViewFocusChangeEventOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (ViewFocusChangeEvent.create(view, view.hasFocus()))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field View view>
	//   20   38:aload_0         
	//   21   39:getfield        #20  <Field View view>
	//   22   42:invokevirtual   #55  <Method boolean View.hasFocus()>
	//   23   45:invokestatic    #61  <Method ViewFocusChangeEvent ViewFocusChangeEvent.create(View, boolean)>
	//   24   48:invokevirtual   #64  <Method void Subscriber.onNext(Object)>
	//   25   51:return          
	}

	private final View view;


/*
	static View access$000(ViewFocusChangeEventOnSubscribe viewfocuschangeeventonsubscribe)
	{
		return viewfocuschangeeventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field View view>
	//    2    4:areturn         
	}

*/
}

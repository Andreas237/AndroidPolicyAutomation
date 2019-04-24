// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.DragEvent;
import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewDragEvent

final class ViewDragEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public ViewDragEventOnSubscribe(View view1, Func1 func1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		view = view1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field View view>
		handled = func1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Func1 handled>
	//    8   14:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Subscriber>
	//    3    5:invokevirtual   #39  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #44  <Method void Preconditions.checkUiThread()>
		android.view.View.OnDragListener ondraglistener = new android.view.View.OnDragListener() {

			public boolean onDrag(View view1, DragEvent dragevent)
			{
				view1 = ((View) (ViewDragEvent.create(view, dragevent)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ViewDragEventOnSubscribe this$0>
			//    2    4:invokestatic    #31  <Method View ViewDragEventOnSubscribe.access$000(ViewDragEventOnSubscribe)>
			//    3    7:aload_2         
			//    4    8:invokestatic    #37  <Method ViewDragEvent ViewDragEvent.create(View, DragEvent)>
			//    5   11:astore_1        
				if(((Boolean)handled.call(((Object) (view1)))).booleanValue())
			//*   6   12:aload_0         
			//*   7   13:getfield        #19  <Field ViewDragEventOnSubscribe this$0>
			//*   8   16:invokestatic    #41  <Method Func1 ViewDragEventOnSubscribe.access$100(ViewDragEventOnSubscribe)>
			//*   9   19:aload_1         
			//*  10   20:invokeinterface #46  <Method Object Func1.call(Object)>
			//*  11   25:checkcast       #48  <Class Boolean>
			//*  12   28:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
			//*  13   31:ifeq            54
				{
					if(!subscriber.isUnsubscribed())
			//*  14   34:aload_0         
			//*  15   35:getfield        #21  <Field Subscriber val$subscriber>
			//*  16   38:invokevirtual   #57  <Method boolean Subscriber.isUnsubscribed()>
			//*  17   41:ifne            52
						subscriber.onNext(((Object) (view1)));
			//   18   44:aload_0         
			//   19   45:getfield        #21  <Field Subscriber val$subscriber>
			//   20   48:aload_1         
			//   21   49:invokevirtual   #61  <Method void Subscriber.onNext(Object)>
					return true;
			//   22   52:iconst_1        
			//   23   53:ireturn         
				} else
				{
					return false;
			//   24   54:iconst_0        
			//   25   55:ireturn         
				}
			}

			final ViewDragEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewDragEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewDragEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewDragEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #47  <Method void ViewDragEventOnSubscribe$1(ViewDragEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnDragListener(ondraglistener);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #53  <Method void View.setOnDragListener(android.view.View$OnDragListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnDragListener(((android.view.View.OnDragListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewDragEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewDragEventOnSubscribe.access$000(ViewDragEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnDragListener(android.view.View$OnDragListener)>
			//    5   11:return          
			}

			final ViewDragEventOnSubscribe this$0;

			
			{
				this$0 = ViewDragEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewDragEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewDragEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void ViewDragEventOnSubscribe$2(ViewDragEventOnSubscribe)>
	//   16   30:invokevirtual   #60  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final View view;


/*
	static View access$000(ViewDragEventOnSubscribe viewdrageventonsubscribe)
	{
		return viewdrageventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View view>
	//    2    4:areturn         
	}

*/


/*
	static Func1 access$100(ViewDragEventOnSubscribe viewdrageventonsubscribe)
	{
		return viewdrageventonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Func1 handled>
	//    2    4:areturn         
	}

*/
}

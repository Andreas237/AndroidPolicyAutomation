// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewLongClickEvent

final class ViewLongClickEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	ViewLongClickEventOnSubscribe(View view1, Func1 func1)
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
		android.view.View.OnLongClickListener onlongclicklistener = new android.view.View.OnLongClickListener() {

			public boolean onLongClick(View view1)
			{
				view1 = ((View) (ViewLongClickEvent.create(view)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
			//    2    4:invokestatic    #31  <Method View ViewLongClickEventOnSubscribe.access$000(ViewLongClickEventOnSubscribe)>
			//    3    7:invokestatic    #37  <Method ViewLongClickEvent ViewLongClickEvent.create(View)>
			//    4   10:astore_1        
				if(((Boolean)handled.call(((Object) (view1)))).booleanValue())
			//*   5   11:aload_0         
			//*   6   12:getfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
			//*   7   15:invokestatic    #41  <Method Func1 ViewLongClickEventOnSubscribe.access$100(ViewLongClickEventOnSubscribe)>
			//*   8   18:aload_1         
			//*   9   19:invokeinterface #46  <Method Object Func1.call(Object)>
			//*  10   24:checkcast       #48  <Class Boolean>
			//*  11   27:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
			//*  12   30:ifeq            53
				{
					if(!subscriber.isUnsubscribed())
			//*  13   33:aload_0         
			//*  14   34:getfield        #21  <Field Subscriber val$subscriber>
			//*  15   37:invokevirtual   #57  <Method boolean Subscriber.isUnsubscribed()>
			//*  16   40:ifne            51
						subscriber.onNext(((Object) (view1)));
			//   17   43:aload_0         
			//   18   44:getfield        #21  <Field Subscriber val$subscriber>
			//   19   47:aload_1         
			//   20   48:invokevirtual   #61  <Method void Subscriber.onNext(Object)>
					return true;
			//   21   51:iconst_1        
			//   22   52:ireturn         
				} else
				{
					return false;
			//   23   53:iconst_0        
			//   24   54:ireturn         
				}
			}

			final ViewLongClickEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewLongClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewLongClickEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #47  <Method void ViewLongClickEventOnSubscribe$1(ViewLongClickEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnLongClickListener(onlongclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #53  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewLongClickEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewLongClickEventOnSubscribe.access$000(ViewLongClickEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
			//    5   11:return          
			}

			final ViewLongClickEventOnSubscribe this$0;

			
			{
				this$0 = ViewLongClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewLongClickEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewLongClickEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void ViewLongClickEventOnSubscribe$2(ViewLongClickEventOnSubscribe)>
	//   16   30:invokevirtual   #60  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final View view;


/*
	static View access$000(ViewLongClickEventOnSubscribe viewlongclickeventonsubscribe)
	{
		return viewlongclickeventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View view>
	//    2    4:areturn         
	}

*/


/*
	static Func1 access$100(ViewLongClickEventOnSubscribe viewlongclickeventonsubscribe)
	{
		return viewlongclickeventonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Func1 handled>
	//    2    4:areturn         
	}

*/
}

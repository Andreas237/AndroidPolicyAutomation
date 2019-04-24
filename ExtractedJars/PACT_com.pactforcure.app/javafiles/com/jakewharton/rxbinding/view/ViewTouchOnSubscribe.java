// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func1;

final class ViewTouchOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public ViewTouchOnSubscribe(View view1, Func1 func1)
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
		android.view.View.OnTouchListener ontouchlistener = new android.view.View.OnTouchListener() {

			public boolean onTouch(View view1, MotionEvent motionevent)
			{
				if(((Boolean)handled.call(((Object) (motionevent)))).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field ViewTouchOnSubscribe this$0>
			//*   2    4:invokestatic    #32  <Method Func1 ViewTouchOnSubscribe.access$000(ViewTouchOnSubscribe)>
			//*   3    7:aload_2         
			//*   4    8:invokeinterface #37  <Method Object Func1.call(Object)>
			//*   5   13:checkcast       #39  <Class Boolean>
			//*   6   16:invokevirtual   #43  <Method boolean Boolean.booleanValue()>
			//*   7   19:ifeq            42
				{
					if(!subscriber.isUnsubscribed())
			//*   8   22:aload_0         
			//*   9   23:getfield        #21  <Field Subscriber val$subscriber>
			//*  10   26:invokevirtual   #48  <Method boolean Subscriber.isUnsubscribed()>
			//*  11   29:ifne            40
						subscriber.onNext(((Object) (motionevent)));
			//   12   32:aload_0         
			//   13   33:getfield        #21  <Field Subscriber val$subscriber>
			//   14   36:aload_2         
			//   15   37:invokevirtual   #52  <Method void Subscriber.onNext(Object)>
					return true;
			//   16   40:iconst_1        
			//   17   41:ireturn         
				} else
				{
					return false;
			//   18   42:iconst_0        
			//   19   43:ireturn         
				}
			}

			final ViewTouchOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ViewTouchOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewTouchOnSubscribe this$0>
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
	//    1    3:new             #9   <Class ViewTouchOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #47  <Method void ViewTouchOnSubscribe$1(ViewTouchOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnTouchListener(ontouchlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field View view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #53  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnTouchListener(((android.view.View.OnTouchListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ViewTouchOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method View ViewTouchOnSubscribe.access$100(ViewTouchOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
			//    5   11:return          
			}

			final ViewTouchOnSubscribe this$0;

			
			{
				this$0 = ViewTouchOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewTouchOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ViewTouchOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void ViewTouchOnSubscribe$2(ViewTouchOnSubscribe)>
	//   16   30:invokevirtual   #60  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final View view;


/*
	static Func1 access$000(ViewTouchOnSubscribe viewtouchonsubscribe)
	{
		return viewtouchonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Func1 handled>
	//    2    4:areturn         
	}

*/


/*
	static View access$100(ViewTouchOnSubscribe viewtouchonsubscribe)
	{
		return viewtouchonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View view>
	//    2    4:areturn         
	}

*/
}

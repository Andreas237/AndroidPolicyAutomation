// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func0;

final class AdapterViewItemLongClickOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public AdapterViewItemLongClickOnSubscribe(AdapterView adapterview, Func0 func0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		view = adapterview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field AdapterView view>
		handled = func0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Func0 handled>
	//    8   14:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class Subscriber>
	//    3    5:invokevirtual   #40  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #45  <Method void Preconditions.checkUiThread()>
		android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener = new android.widget.AdapterView.OnItemLongClickListener() {

			public boolean onItemLongClick(AdapterView adapterview, View view1, int i, long l)
			{
				if(((Boolean)handled.call()).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field AdapterViewItemLongClickOnSubscribe this$0>
			//*   2    4:invokestatic    #31  <Method Func0 AdapterViewItemLongClickOnSubscribe.access$000(AdapterViewItemLongClickOnSubscribe)>
			//*   3    7:invokeinterface #36  <Method Object Func0.call()>
			//*   4   12:checkcast       #38  <Class Boolean>
			//*   5   15:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
			//*   6   18:ifeq            44
				{
					if(!subscriber.isUnsubscribed())
			//*   7   21:aload_0         
			//*   8   22:getfield        #21  <Field Subscriber val$subscriber>
			//*   9   25:invokevirtual   #47  <Method boolean Subscriber.isUnsubscribed()>
			//*  10   28:ifne            42
						subscriber.onNext(((Object) (Integer.valueOf(i))));
			//   11   31:aload_0         
			//   12   32:getfield        #21  <Field Subscriber val$subscriber>
			//   13   35:iload_3         
			//   14   36:invokestatic    #53  <Method Integer Integer.valueOf(int)>
			//   15   39:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
					return true;
			//   16   42:iconst_1        
			//   17   43:ireturn         
				} else
				{
					return false;
			//   18   44:iconst_0        
			//   19   45:ireturn         
				}
			}

			final AdapterViewItemLongClickOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = AdapterViewItemLongClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AdapterViewItemLongClickOnSubscribe this$0>
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
	//    1    3:new             #9   <Class AdapterViewItemLongClickOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #48  <Method void AdapterViewItemLongClickOnSubscribe$1(AdapterViewItemLongClickOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnItemLongClickListener(onitemlongclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field AdapterView view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #54  <Method void AdapterView.setOnItemLongClickListener(android.widget.AdapterView$OnItemLongClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnItemLongClickListener(((android.widget.AdapterView.OnItemLongClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AdapterViewItemLongClickOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method AdapterView AdapterViewItemLongClickOnSubscribe.access$100(AdapterViewItemLongClickOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void AdapterView.setOnItemLongClickListener(android.widget.AdapterView$OnItemLongClickListener)>
			//    5   11:return          
			}

			final AdapterViewItemLongClickOnSubscribe this$0;

			
			{
				this$0 = AdapterViewItemLongClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AdapterViewItemLongClickOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class AdapterViewItemLongClickOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #57  <Method void AdapterViewItemLongClickOnSubscribe$2(AdapterViewItemLongClickOnSubscribe)>
	//   16   30:invokevirtual   #61  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func0 handled;
	private final AdapterView view;


/*
	static Func0 access$000(AdapterViewItemLongClickOnSubscribe adapterviewitemlongclickonsubscribe)
	{
		return adapterviewitemlongclickonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Func0 handled>
	//    2    4:areturn         
	}

*/


/*
	static AdapterView access$100(AdapterViewItemLongClickOnSubscribe adapterviewitemlongclickonsubscribe)
	{
		return adapterviewitemlongclickonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AdapterView view>
	//    2    4:areturn         
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemLongClickEvent

final class AdapterViewItemLongClickEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public AdapterViewItemLongClickEventOnSubscribe(AdapterView adapterview, Func1 func1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		view = adapterview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field AdapterView view>
		handled = func1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Func1 handled>
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
				adapterview = ((AdapterView) (AdapterViewItemLongClickEvent.create(adapterview, view1, i, l)));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:iload_3         
			//    3    3:lload           4
			//    4    5:invokestatic    #33  <Method AdapterViewItemLongClickEvent AdapterViewItemLongClickEvent.create(AdapterView, View, int, long)>
			//    5    8:astore_1        
				if(((Boolean)handled.call(((Object) (adapterview)))).booleanValue())
			//*   6    9:aload_0         
			//*   7   10:getfield        #19  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
			//*   8   13:invokestatic    #37  <Method Func1 AdapterViewItemLongClickEventOnSubscribe.access$000(AdapterViewItemLongClickEventOnSubscribe)>
			//*   9   16:aload_1         
			//*  10   17:invokeinterface #42  <Method Object Func1.call(Object)>
			//*  11   22:checkcast       #44  <Class Boolean>
			//*  12   25:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
			//*  13   28:ifeq            51
				{
					if(!subscriber.isUnsubscribed())
			//*  14   31:aload_0         
			//*  15   32:getfield        #21  <Field Subscriber val$subscriber>
			//*  16   35:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
			//*  17   38:ifne            49
						subscriber.onNext(((Object) (adapterview)));
			//   18   41:aload_0         
			//   19   42:getfield        #21  <Field Subscriber val$subscriber>
			//   20   45:aload_1         
			//   21   46:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
					return true;
			//   22   49:iconst_1        
			//   23   50:ireturn         
				} else
				{
					return false;
			//   24   51:iconst_0        
			//   25   52:ireturn         
				}
			}

			final AdapterViewItemLongClickEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = AdapterViewItemLongClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class AdapterViewItemLongClickEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #48  <Method void AdapterViewItemLongClickEventOnSubscribe$1(AdapterViewItemLongClickEventOnSubscribe, Subscriber)>
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
			//    1    1:getfield        #15  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method AdapterView AdapterViewItemLongClickEventOnSubscribe.access$100(AdapterViewItemLongClickEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void AdapterView.setOnItemLongClickListener(android.widget.AdapterView$OnItemLongClickListener)>
			//    5   11:return          
			}

			final AdapterViewItemLongClickEventOnSubscribe this$0;

			
			{
				this$0 = AdapterViewItemLongClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class AdapterViewItemLongClickEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #57  <Method void AdapterViewItemLongClickEventOnSubscribe$2(AdapterViewItemLongClickEventOnSubscribe)>
	//   16   30:invokevirtual   #61  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final AdapterView view;


/*
	static Func1 access$000(AdapterViewItemLongClickEventOnSubscribe adapterviewitemlongclickeventonsubscribe)
	{
		return adapterviewitemlongclickeventonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Func1 handled>
	//    2    4:areturn         
	}

*/


/*
	static AdapterView access$100(AdapterViewItemLongClickEventOnSubscribe adapterviewitemlongclickeventonsubscribe)
	{
		return adapterviewitemlongclickeventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AdapterView view>
	//    2    4:areturn         
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemClickEvent

final class AdapterViewItemClickEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public AdapterViewItemClickEventOnSubscribe(AdapterView adapterview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		view = adapterview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AdapterView view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Subscriber>
	//    3    5:invokevirtual   #33  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #38  <Method void Preconditions.checkUiThread()>
		android.widget.AdapterView.OnItemClickListener onitemclicklistener = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view1, int i, long l)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            25
					subscriber.onNext(((Object) (AdapterViewItemClickEvent.create(adapterview, view1, i, l))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:aload_2         
			//    8   16:iload_3         
			//    9   17:lload           4
			//   10   19:invokestatic    #39  <Method AdapterViewItemClickEvent AdapterViewItemClickEvent.create(AdapterView, View, int, long)>
			//   11   22:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//   12   25:return          
			}

			final AdapterViewItemClickEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = AdapterViewItemClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AdapterViewItemClickEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class AdapterViewItemClickEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void AdapterViewItemClickEventOnSubscribe$1(AdapterViewItemClickEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnItemClickListener(onitemclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field AdapterView view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #47  <Method void AdapterView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AdapterViewItemClickEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method AdapterView AdapterViewItemClickEventOnSubscribe.access$000(AdapterViewItemClickEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void AdapterView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			//    5   11:return          
			}

			final AdapterViewItemClickEventOnSubscribe this$0;

			
			{
				this$0 = AdapterViewItemClickEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AdapterViewItemClickEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class AdapterViewItemClickEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #50  <Method void AdapterViewItemClickEventOnSubscribe$2(AdapterViewItemClickEventOnSubscribe)>
	//   16   30:invokevirtual   #54  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final AdapterView view;


/*
	static AdapterView access$000(AdapterViewItemClickEventOnSubscribe adapterviewitemclickeventonsubscribe)
	{
		return adapterviewitemclickeventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AdapterView view>
	//    2    4:areturn         
	}

*/
}

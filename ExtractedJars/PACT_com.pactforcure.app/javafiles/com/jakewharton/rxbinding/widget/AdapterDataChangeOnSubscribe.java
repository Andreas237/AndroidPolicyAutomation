// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class AdapterDataChangeOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public AdapterDataChangeOnSubscribe(Adapter adapter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		adapter = adapter1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Adapter adapter>
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
		final DataSetObserver observer = new DataSetObserver() {

			public void onChanged()
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #30  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            24
					subscriber.onNext(((Object) (adapter)));
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
			//    8   18:invokestatic    #34  <Method Adapter AdapterDataChangeOnSubscribe.access$000(AdapterDataChangeOnSubscribe)>
			//    9   21:invokevirtual   #38  <Method void Subscriber.onNext(Object)>
			//   10   24:return          
			}

			final AdapterDataChangeOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = AdapterDataChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void DataSetObserver()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class AdapterDataChangeOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void AdapterDataChangeOnSubscribe$1(AdapterDataChangeOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		adapter.registerDataSetObserver(((DataSetObserver) (observer)));
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field Adapter adapter>
	//    9   17:aload_2         
	//   10   18:invokeinterface #47  <Method void Adapter.registerDataSetObserver(DataSetObserver)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				adapter.unregisterDataSetObserver(observer);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
			//    2    4:invokestatic    #28  <Method Adapter AdapterDataChangeOnSubscribe.access$000(AdapterDataChangeOnSubscribe)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field DataSetObserver val$observer>
			//    5   11:invokeinterface #34  <Method void Adapter.unregisterDataSetObserver(DataSetObserver)>
			//    6   16:return          
			}

			final AdapterDataChangeOnSubscribe this$0;
			final DataSetObserver val$observer;

			
			{
				this$0 = AdapterDataChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
				observer = datasetobserver;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field DataSetObserver val$observer>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
			//    8   14:return          
			}
		}
)));
	//   11   23:aload_1         
	//   12   24:new             #11  <Class AdapterDataChangeOnSubscribe$2>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokespecial   #50  <Method void AdapterDataChangeOnSubscribe$2(AdapterDataChangeOnSubscribe, DataSetObserver)>
	//   17   33:invokevirtual   #54  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (adapter)));
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #21  <Field Adapter adapter>
	//   21   41:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
	//   22   44:return          
	}

	private final Adapter adapter;


/*
	static Adapter access$000(AdapterDataChangeOnSubscribe adapterdatachangeonsubscribe)
	{
		return adapterdatachangeonsubscribe.adapter;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Adapter adapter>
	//    2    4:areturn         
	}

*/
}

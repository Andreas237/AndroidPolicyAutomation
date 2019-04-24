// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.database.DataSetObserver;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterDataChangeOnSubscribe

class AdapterDataChangeOnSubscribe$1 extends DataSetObserver
{

	public void onChanged()
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #30  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            24
			val$subscriber.onNext(((Object) (AdapterDataChangeOnSubscribe.access$000(AdapterDataChangeOnSubscribe.this))));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
	//    8   18:invokestatic    #34  <Method android.widget.Adapter AdapterDataChangeOnSubscribe.access$000(AdapterDataChangeOnSubscribe)>
	//    9   21:invokevirtual   #38  <Method void Subscriber.onNext(Object)>
	//   10   24:return          
	}

	final AdapterDataChangeOnSubscribe this$0;
	final Subscriber val$subscriber;

	AdapterDataChangeOnSubscribe$1()
	{
		this$0 = final_adapterdatachangeonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void DataSetObserver()>
	//    8   14:return          
	}
}

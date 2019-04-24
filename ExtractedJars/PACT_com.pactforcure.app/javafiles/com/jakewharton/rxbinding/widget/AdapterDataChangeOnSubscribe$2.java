// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterDataChangeOnSubscribe

class AdapterDataChangeOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		AdapterDataChangeOnSubscribe.access$000(AdapterDataChangeOnSubscribe.this).unregisterDataSetObserver(val$observer);
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

	AdapterDataChangeOnSubscribe$2()
	{
		this$0 = final_adapterdatachangeonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AdapterDataChangeOnSubscribe this$0>
		val$observer = DataSetObserver.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field DataSetObserver val$observer>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
	//    8   14:return          
	}
}

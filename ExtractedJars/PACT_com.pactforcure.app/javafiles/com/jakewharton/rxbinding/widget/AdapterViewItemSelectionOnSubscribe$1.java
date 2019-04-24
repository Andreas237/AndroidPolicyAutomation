// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemSelectionOnSubscribe

class AdapterViewItemSelectionOnSubscribe$1
	implements android.widget.AdapterView.OnItemSelectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (Integer.valueOf(i))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:iload_3         
	//    7   15:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (Integer.valueOf(-1))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:iconst_m1       
	//    7   15:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	final AdapterViewItemSelectionOnSubscribe this$0;
	final Subscriber val$subscriber;

	AdapterViewItemSelectionOnSubscribe$1()
	{
		this$0 = final_adapterviewitemselectiononsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AdapterViewItemSelectionOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

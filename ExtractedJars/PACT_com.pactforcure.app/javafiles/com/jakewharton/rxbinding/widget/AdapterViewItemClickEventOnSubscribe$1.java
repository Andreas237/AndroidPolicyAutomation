// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemClickEventOnSubscribe, AdapterViewItemClickEvent

class AdapterViewItemClickEventOnSubscribe$1
	implements android.widget.AdapterView.OnItemClickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            25
			val$subscriber.onNext(((Object) (AdapterViewItemClickEvent.create(adapterview, view, i, l))));
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

	AdapterViewItemClickEventOnSubscribe$1()
	{
		this$0 = final_adapterviewitemclickeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AdapterViewItemClickEventOnSubscribe this$0>
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

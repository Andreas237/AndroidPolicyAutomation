// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewClickOnSubscribe

class ViewClickOnSubscribe$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            24
			val$subscriber.onNext(ViewClickOnSubscribe.access$000(ViewClickOnSubscribe.this));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field ViewClickOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method Object ViewClickOnSubscribe.access$000(ViewClickOnSubscribe)>
	//    9   21:invokevirtual   #41  <Method void Subscriber.onNext(Object)>
	//   10   24:return          
	}

	final ViewClickOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewClickOnSubscribe$1()
	{
		this$0 = final_viewclickonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewClickOnSubscribe this$0>
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewClickEventOnSubscribe, ViewClickEvent

class ViewClickEventOnSubscribe$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            27
			val$subscriber.onNext(((Object) (ViewClickEvent.create(ViewClickEventOnSubscribe.access$000(ViewClickEventOnSubscribe.this)))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field ViewClickEventOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method View ViewClickEventOnSubscribe.access$000(ViewClickEventOnSubscribe)>
	//    9   21:invokestatic    #43  <Method ViewClickEvent ViewClickEvent.create(View)>
	//   10   24:invokevirtual   #47  <Method void Subscriber.onNext(Object)>
	//   11   27:return          
	}

	final ViewClickEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewClickEventOnSubscribe$1()
	{
		this$0 = final_viewclickeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewClickEventOnSubscribe this$0>
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

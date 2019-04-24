// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachEventOnSubscribe, ViewAttachEvent

class ViewAttachEventOnSubscribe$1
	implements android.view.ner
{

	public void onViewAttachedToWindow(View view)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #34  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            30
			val$subscriber.onNext(((Object) (ViewAttachEvent.create(ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe.this), ViewAttachEvent.Kind.ATTACH))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field ViewAttachEventOnSubscribe this$0>
	//    8   18:invokestatic    #38  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
	//    9   21:getstatic       #44  <Field ViewAttachEvent$Kind ViewAttachEvent$Kind.ATTACH>
	//   10   24:invokestatic    #50  <Method ViewAttachEvent ViewAttachEvent.create(View, ViewAttachEvent$Kind)>
	//   11   27:invokevirtual   #54  <Method void Subscriber.onNext(Object)>
	//   12   30:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #34  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            30
			val$subscriber.onNext(((Object) (ViewAttachEvent.create(ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe.this), ViewAttachEvent.Kind.DETACH))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field ViewAttachEventOnSubscribe this$0>
	//    8   18:invokestatic    #38  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
	//    9   21:getstatic       #59  <Field ViewAttachEvent$Kind ViewAttachEvent$Kind.DETACH>
	//   10   24:invokestatic    #50  <Method ViewAttachEvent ViewAttachEvent.create(View, ViewAttachEvent$Kind)>
	//   11   27:invokevirtual   #54  <Method void Subscriber.onNext(Object)>
	//   12   30:return          
	}

	final ViewAttachEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewAttachEventOnSubscribe$1()
	{
		this$0 = final_viewattacheventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewAttachEventOnSubscribe this$0>
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

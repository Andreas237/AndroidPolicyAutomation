// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachesOnSubscribe

class ViewAttachesOnSubscribe$1
	implements android.view.stener
{

	public void onViewAttachedToWindow(View view)
	{
		if(ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe.this) && !val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
	//*   2    4:invokestatic    #32  <Method boolean ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe)>
	//*   3    7:ifeq            34
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field Subscriber val$subscriber>
	//*   6   14:invokevirtual   #38  <Method boolean Subscriber.isUnsubscribed()>
	//*   7   17:ifne            34
			val$subscriber.onNext(ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe.this));
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field Subscriber val$subscriber>
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
	//   12   28:invokestatic    #42  <Method Object ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe)>
	//   13   31:invokevirtual   #46  <Method void Subscriber.onNext(Object)>
	//   14   34:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(!ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe.this) && !val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
	//*   2    4:invokestatic    #32  <Method boolean ViewAttachesOnSubscribe.access$000(ViewAttachesOnSubscribe)>
	//*   3    7:ifne            34
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field Subscriber val$subscriber>
	//*   6   14:invokevirtual   #38  <Method boolean Subscriber.isUnsubscribed()>
	//*   7   17:ifne            34
			val$subscriber.onNext(ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe.this));
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field Subscriber val$subscriber>
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field ViewAttachesOnSubscribe this$0>
	//   12   28:invokestatic    #42  <Method Object ViewAttachesOnSubscribe.access$100(ViewAttachesOnSubscribe)>
	//   13   31:invokevirtual   #46  <Method void Subscriber.onNext(Object)>
	//   14   34:return          
	}

	final ViewAttachesOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewAttachesOnSubscribe$1()
	{
		this$0 = final_viewattachesonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewAttachesOnSubscribe this$0>
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

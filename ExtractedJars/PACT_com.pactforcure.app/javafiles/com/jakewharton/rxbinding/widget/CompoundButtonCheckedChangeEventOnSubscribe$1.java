// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			CompoundButtonCheckedChangeEventOnSubscribe, CompoundButtonCheckedChangeEvent

class CompoundButtonCheckedChangeEventOnSubscribe$1
	implements android.widget.CompoundButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            28
			val$subscriber.onNext(((Object) (CompoundButtonCheckedChangeEvent.create(CompoundButtonCheckedChangeEventOnSubscribe.access$000(CompoundButtonCheckedChangeEventOnSubscribe.this), flag))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field CompoundButtonCheckedChangeEventOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method CompoundButton CompoundButtonCheckedChangeEventOnSubscribe.access$000(CompoundButtonCheckedChangeEventOnSubscribe)>
	//    9   21:iload_2         
	//   10   22:invokestatic    #43  <Method CompoundButtonCheckedChangeEvent CompoundButtonCheckedChangeEvent.create(CompoundButton, boolean)>
	//   11   25:invokevirtual   #47  <Method void Subscriber.onNext(Object)>
	//   12   28:return          
	}

	final CompoundButtonCheckedChangeEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	CompoundButtonCheckedChangeEventOnSubscribe$1()
	{
		this$0 = final_compoundbuttoncheckedchangeeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CompoundButtonCheckedChangeEventOnSubscribe this$0>
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

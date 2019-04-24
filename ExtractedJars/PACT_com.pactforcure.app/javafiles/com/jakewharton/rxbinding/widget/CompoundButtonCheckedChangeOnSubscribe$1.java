// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			CompoundButtonCheckedChangeOnSubscribe

class CompoundButtonCheckedChangeOnSubscribe$1
	implements android.widget.CompoundButton.OnCheckedChangeListener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (Boolean.valueOf(flag))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:iload_2         
	//    7   15:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	final CompoundButtonCheckedChangeOnSubscribe this$0;
	final Subscriber val$subscriber;

	CompoundButtonCheckedChangeOnSubscribe$1()
	{
		this$0 = final_compoundbuttoncheckedchangeonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CompoundButtonCheckedChangeOnSubscribe this$0>
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

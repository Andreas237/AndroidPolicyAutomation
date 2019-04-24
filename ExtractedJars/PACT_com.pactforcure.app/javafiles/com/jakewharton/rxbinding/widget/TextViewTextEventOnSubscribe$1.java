// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.text.Editable;
import android.text.TextWatcher;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewTextEventOnSubscribe, TextViewTextChangeEvent

class TextViewTextEventOnSubscribe$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
	//    0    0:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #36  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            32
			val$subscriber.onNext(((Object) (TextViewTextChangeEvent.create(TextViewTextEventOnSubscribe.access$000(TextViewTextEventOnSubscribe.this), charsequence, i, j, k))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field TextViewTextEventOnSubscribe this$0>
	//    8   18:invokestatic    #40  <Method android.widget.TextView TextViewTextEventOnSubscribe.access$000(TextViewTextEventOnSubscribe)>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:iload_3         
	//   12   24:iload           4
	//   13   26:invokestatic    #46  <Method TextViewTextChangeEvent TextViewTextChangeEvent.create(android.widget.TextView, CharSequence, int, int, int)>
	//   14   29:invokevirtual   #50  <Method void Subscriber.onNext(Object)>
	//   15   32:return          
	}

	final TextViewTextEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	TextViewTextEventOnSubscribe$1()
	{
		this$0 = final_textviewtexteventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextViewTextEventOnSubscribe this$0>
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

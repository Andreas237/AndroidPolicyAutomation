// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewEditorActionEventOnSubscribe, TextViewEditorActionEvent

class TextViewEditorActionEventOnSubscribe$1
	implements android.widget.TextView.OnEditorActionListener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		textview = ((TextView) (TextViewEditorActionEvent.create(textview, i, keyevent)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #33  <Method TextViewEditorActionEvent TextViewEditorActionEvent.create(TextView, int, KeyEvent)>
	//    4    6:astore_1        
		if(((Boolean)TextViewEditorActionEventOnSubscribe.access$000(TextViewEditorActionEventOnSubscribe.this).call(((Object) (textview)))).booleanValue())
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field TextViewEditorActionEventOnSubscribe this$0>
	//*   7   11:invokestatic    #37  <Method Func1 TextViewEditorActionEventOnSubscribe.access$000(TextViewEditorActionEventOnSubscribe)>
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #42  <Method Object Func1.call(Object)>
	//*  10   20:checkcast       #44  <Class Boolean>
	//*  11   23:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//*  12   26:ifeq            49
		{
			if(!val$subscriber.isUnsubscribed())
	//*  13   29:aload_0         
	//*  14   30:getfield        #21  <Field Subscriber val$subscriber>
	//*  15   33:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
	//*  16   36:ifne            47
				val$subscriber.onNext(((Object) (textview)));
	//   17   39:aload_0         
	//   18   40:getfield        #21  <Field Subscriber val$subscriber>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
		} else
		{
			return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
		}
	}

	final TextViewEditorActionEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	TextViewEditorActionEventOnSubscribe$1()
	{
		this$0 = final_textvieweditoractioneventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextViewEditorActionEventOnSubscribe this$0>
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

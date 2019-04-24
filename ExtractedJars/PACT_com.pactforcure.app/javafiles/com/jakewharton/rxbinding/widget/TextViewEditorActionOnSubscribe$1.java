// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewEditorActionOnSubscribe

class TextViewEditorActionOnSubscribe$1
	implements android.widget.TextView.OnEditorActionListener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		if(((Boolean)TextViewEditorActionOnSubscribe.access$000(TextViewEditorActionOnSubscribe.this).call(((Object) (Integer.valueOf(i))))).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field TextViewEditorActionOnSubscribe this$0>
	//*   2    4:invokestatic    #31  <Method Func1 TextViewEditorActionOnSubscribe.access$000(TextViewEditorActionOnSubscribe)>
	//*   3    7:iload_2         
	//*   4    8:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//*   5   11:invokeinterface #42  <Method Object Func1.call(Object)>
	//*   6   16:checkcast       #44  <Class Boolean>
	//*   7   19:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//*   8   22:ifeq            48
		{
			if(!val$subscriber.isUnsubscribed())
	//*   9   25:aload_0         
	//*  10   26:getfield        #21  <Field Subscriber val$subscriber>
	//*  11   29:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
	//*  12   32:ifne            46
				val$subscriber.onNext(((Object) (Integer.valueOf(i))));
	//   13   35:aload_0         
	//   14   36:getfield        #21  <Field Subscriber val$subscriber>
	//   15   39:iload_2         
	//   16   40:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   17   43:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			return true;
	//   18   46:iconst_1        
	//   19   47:ireturn         
		} else
		{
			return false;
	//   20   48:iconst_0        
	//   21   49:ireturn         
		}
	}

	final TextViewEditorActionOnSubscribe this$0;
	final Subscriber val$subscriber;

	TextViewEditorActionOnSubscribe$1()
	{
		this$0 = final_textvieweditoractiononsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextViewEditorActionOnSubscribe this$0>
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

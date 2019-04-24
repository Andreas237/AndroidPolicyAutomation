// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;
import rx.functions.Func0;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewLongClickOnSubscribe

class ViewLongClickOnSubscribe$1
	implements android.view.View.OnLongClickListener
{

	public boolean onLongClick(View view)
	{
		if(((Boolean)ViewLongClickOnSubscribe.access$000(ViewLongClickOnSubscribe.this).call()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewLongClickOnSubscribe this$0>
	//*   2    4:invokestatic    #31  <Method Func0 ViewLongClickOnSubscribe.access$000(ViewLongClickOnSubscribe)>
	//*   3    7:invokeinterface #36  <Method Object Func0.call()>
	//*   4   12:checkcast       #38  <Class Boolean>
	//*   5   15:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
	//*   6   18:ifeq            47
		{
			if(!val$subscriber.isUnsubscribed())
	//*   7   21:aload_0         
	//*   8   22:getfield        #21  <Field Subscriber val$subscriber>
	//*   9   25:invokevirtual   #47  <Method boolean Subscriber.isUnsubscribed()>
	//*  10   28:ifne            45
				val$subscriber.onNext(ViewLongClickOnSubscribe.access$100(ViewLongClickOnSubscribe.this));
	//   11   31:aload_0         
	//   12   32:getfield        #21  <Field Subscriber val$subscriber>
	//   13   35:aload_0         
	//   14   36:getfield        #19  <Field ViewLongClickOnSubscribe this$0>
	//   15   39:invokestatic    #51  <Method Object ViewLongClickOnSubscribe.access$100(ViewLongClickOnSubscribe)>
	//   16   42:invokevirtual   #55  <Method void Subscriber.onNext(Object)>
			return true;
	//   17   45:iconst_1        
	//   18   46:ireturn         
		} else
		{
			return false;
	//   19   47:iconst_0        
	//   20   48:ireturn         
		}
	}

	final ViewLongClickOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewLongClickOnSubscribe$1()
	{
		this$0 = final_viewlongclickonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewLongClickOnSubscribe this$0>
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

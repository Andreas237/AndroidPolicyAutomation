// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.DragEvent;
import android.view.View;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewDragOnSubscribe

class ViewDragOnSubscribe$1
	implements android.view.View.OnDragListener
{

	public boolean onDrag(View view, DragEvent dragevent)
	{
		if(((Boolean)ViewDragOnSubscribe.access$000(ViewDragOnSubscribe.this).call(((Object) (dragevent)))).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewDragOnSubscribe this$0>
	//*   2    4:invokestatic    #31  <Method Func1 ViewDragOnSubscribe.access$000(ViewDragOnSubscribe)>
	//*   3    7:aload_2         
	//*   4    8:invokeinterface #36  <Method Object Func1.call(Object)>
	//*   5   13:checkcast       #38  <Class Boolean>
	//*   6   16:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            42
		{
			if(!val$subscriber.isUnsubscribed())
	//*   8   22:aload_0         
	//*   9   23:getfield        #21  <Field Subscriber val$subscriber>
	//*  10   26:invokevirtual   #47  <Method boolean Subscriber.isUnsubscribed()>
	//*  11   29:ifne            40
				val$subscriber.onNext(((Object) (dragevent)));
	//   12   32:aload_0         
	//   13   33:getfield        #21  <Field Subscriber val$subscriber>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #51  <Method void Subscriber.onNext(Object)>
			return true;
	//   16   40:iconst_1        
	//   17   41:ireturn         
		} else
		{
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		}
	}

	final ViewDragOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewDragOnSubscribe$1()
	{
		this$0 = final_viewdragonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewDragOnSubscribe this$0>
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

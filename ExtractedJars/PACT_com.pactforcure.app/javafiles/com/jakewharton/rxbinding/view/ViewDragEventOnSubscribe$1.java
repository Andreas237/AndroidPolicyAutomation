// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.DragEvent;
import android.view.View;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewDragEventOnSubscribe, ViewDragEvent

class ViewDragEventOnSubscribe$1
	implements android.view.View.OnDragListener
{

	public boolean onDrag(View view, DragEvent dragevent)
	{
		view = ((View) (ViewDragEvent.create(ViewDragEventOnSubscribe.access$000(ViewDragEventOnSubscribe.this), dragevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ViewDragEventOnSubscribe this$0>
	//    2    4:invokestatic    #31  <Method View ViewDragEventOnSubscribe.access$000(ViewDragEventOnSubscribe)>
	//    3    7:aload_2         
	//    4    8:invokestatic    #37  <Method ViewDragEvent ViewDragEvent.create(View, DragEvent)>
	//    5   11:astore_1        
		if(((Boolean)ViewDragEventOnSubscribe.access$100(ViewDragEventOnSubscribe.this).call(((Object) (view)))).booleanValue())
	//*   6   12:aload_0         
	//*   7   13:getfield        #19  <Field ViewDragEventOnSubscribe this$0>
	//*   8   16:invokestatic    #41  <Method Func1 ViewDragEventOnSubscribe.access$100(ViewDragEventOnSubscribe)>
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #46  <Method Object Func1.call(Object)>
	//*  11   25:checkcast       #48  <Class Boolean>
	//*  12   28:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  13   31:ifeq            54
		{
			if(!val$subscriber.isUnsubscribed())
	//*  14   34:aload_0         
	//*  15   35:getfield        #21  <Field Subscriber val$subscriber>
	//*  16   38:invokevirtual   #57  <Method boolean Subscriber.isUnsubscribed()>
	//*  17   41:ifne            52
				val$subscriber.onNext(((Object) (view)));
	//   18   44:aload_0         
	//   19   45:getfield        #21  <Field Subscriber val$subscriber>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #61  <Method void Subscriber.onNext(Object)>
			return true;
	//   22   52:iconst_1        
	//   23   53:ireturn         
		} else
		{
			return false;
	//   24   54:iconst_0        
	//   25   55:ireturn         
		}
	}

	final ViewDragEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewDragEventOnSubscribe$1()
	{
		this$0 = final_viewdrageventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewDragEventOnSubscribe this$0>
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

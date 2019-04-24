// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewLongClickEventOnSubscribe, ViewLongClickEvent

class ViewLongClickEventOnSubscribe$1
	implements android.view.View.OnLongClickListener
{

	public boolean onLongClick(View view)
	{
		view = ((View) (ViewLongClickEvent.create(ViewLongClickEventOnSubscribe.access$000(ViewLongClickEventOnSubscribe.this))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
	//    2    4:invokestatic    #31  <Method View ViewLongClickEventOnSubscribe.access$000(ViewLongClickEventOnSubscribe)>
	//    3    7:invokestatic    #37  <Method ViewLongClickEvent ViewLongClickEvent.create(View)>
	//    4   10:astore_1        
		if(((Boolean)ViewLongClickEventOnSubscribe.access$100(ViewLongClickEventOnSubscribe.this).call(((Object) (view)))).booleanValue())
	//*   5   11:aload_0         
	//*   6   12:getfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
	//*   7   15:invokestatic    #41  <Method Func1 ViewLongClickEventOnSubscribe.access$100(ViewLongClickEventOnSubscribe)>
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #46  <Method Object Func1.call(Object)>
	//*  10   24:checkcast       #48  <Class Boolean>
	//*  11   27:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  12   30:ifeq            53
		{
			if(!val$subscriber.isUnsubscribed())
	//*  13   33:aload_0         
	//*  14   34:getfield        #21  <Field Subscriber val$subscriber>
	//*  15   37:invokevirtual   #57  <Method boolean Subscriber.isUnsubscribed()>
	//*  16   40:ifne            51
				val$subscriber.onNext(((Object) (view)));
	//   17   43:aload_0         
	//   18   44:getfield        #21  <Field Subscriber val$subscriber>
	//   19   47:aload_1         
	//   20   48:invokevirtual   #61  <Method void Subscriber.onNext(Object)>
			return true;
	//   21   51:iconst_1        
	//   22   52:ireturn         
		} else
		{
			return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
		}
	}

	final ViewLongClickEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	ViewLongClickEventOnSubscribe$1()
	{
		this$0 = final_viewlongclickeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewLongClickEventOnSubscribe this$0>
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemLongClickEventOnSubscribe, AdapterViewItemLongClickEvent

class AdapterViewItemLongClickEventOnSubscribe$1
	implements android.widget.AdapterView.OnItemLongClickListener
{

	public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (AdapterViewItemLongClickEvent.create(adapterview, view, i, l)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:lload           4
	//    4    5:invokestatic    #33  <Method AdapterViewItemLongClickEvent AdapterViewItemLongClickEvent.create(AdapterView, View, int, long)>
	//    5    8:astore_1        
		if(((Boolean)AdapterViewItemLongClickEventOnSubscribe.access$000(AdapterViewItemLongClickEventOnSubscribe.this).call(((Object) (adapterview)))).booleanValue())
	//*   6    9:aload_0         
	//*   7   10:getfield        #19  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
	//*   8   13:invokestatic    #37  <Method Func1 AdapterViewItemLongClickEventOnSubscribe.access$000(AdapterViewItemLongClickEventOnSubscribe)>
	//*   9   16:aload_1         
	//*  10   17:invokeinterface #42  <Method Object Func1.call(Object)>
	//*  11   22:checkcast       #44  <Class Boolean>
	//*  12   25:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
	//*  13   28:ifeq            51
		{
			if(!val$subscriber.isUnsubscribed())
	//*  14   31:aload_0         
	//*  15   32:getfield        #21  <Field Subscriber val$subscriber>
	//*  16   35:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
	//*  17   38:ifne            49
				val$subscriber.onNext(((Object) (adapterview)));
	//   18   41:aload_0         
	//   19   42:getfield        #21  <Field Subscriber val$subscriber>
	//   20   45:aload_1         
	//   21   46:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			return true;
	//   22   49:iconst_1        
	//   23   50:ireturn         
		} else
		{
			return false;
	//   24   51:iconst_0        
	//   25   52:ireturn         
		}
	}

	final AdapterViewItemLongClickEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	AdapterViewItemLongClickEventOnSubscribe$1()
	{
		this$0 = final_adapterviewitemlongclickeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AdapterViewItemLongClickEventOnSubscribe this$0>
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

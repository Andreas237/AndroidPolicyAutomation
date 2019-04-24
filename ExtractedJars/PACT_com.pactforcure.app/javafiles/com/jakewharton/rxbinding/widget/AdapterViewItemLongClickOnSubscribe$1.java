// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import rx.Subscriber;
import rx.functions.Func0;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemLongClickOnSubscribe

class AdapterViewItemLongClickOnSubscribe$1
	implements android.widget.AdapterView.OnItemLongClickListener
{

	public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
	{
		if(((Boolean)AdapterViewItemLongClickOnSubscribe.access$000(AdapterViewItemLongClickOnSubscribe.this).call()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AdapterViewItemLongClickOnSubscribe this$0>
	//*   2    4:invokestatic    #31  <Method Func0 AdapterViewItemLongClickOnSubscribe.access$000(AdapterViewItemLongClickOnSubscribe)>
	//*   3    7:invokeinterface #36  <Method Object Func0.call()>
	//*   4   12:checkcast       #38  <Class Boolean>
	//*   5   15:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
	//*   6   18:ifeq            44
		{
			if(!val$subscriber.isUnsubscribed())
	//*   7   21:aload_0         
	//*   8   22:getfield        #21  <Field Subscriber val$subscriber>
	//*   9   25:invokevirtual   #47  <Method boolean Subscriber.isUnsubscribed()>
	//*  10   28:ifne            42
				val$subscriber.onNext(((Object) (Integer.valueOf(i))));
	//   11   31:aload_0         
	//   12   32:getfield        #21  <Field Subscriber val$subscriber>
	//   13   35:iload_3         
	//   14   36:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   15   39:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			return true;
	//   16   42:iconst_1        
	//   17   43:ireturn         
		} else
		{
			return false;
	//   18   44:iconst_0        
	//   19   45:ireturn         
		}
	}

	final AdapterViewItemLongClickOnSubscribe this$0;
	final Subscriber val$subscriber;

	AdapterViewItemLongClickOnSubscribe$1()
	{
		this$0 = final_adapterviewitemlongclickonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AdapterViewItemLongClickOnSubscribe this$0>
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

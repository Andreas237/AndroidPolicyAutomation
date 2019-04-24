// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxCompoundButton

static final class RxCompoundButton$2
	implements Action1
{

	public void call(Object obj)
	{
		val$view.toggle();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CompoundButton val$view>
	//    2    4:invokevirtual   #28  <Method void CompoundButton.toggle()>
	//    3    7:return          
	}

	final CompoundButton val$view;

	RxCompoundButton$2(CompoundButton compoundbutton)
	{
		val$view = compoundbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CompoundButton val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

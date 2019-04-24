// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			RxView

static final class RxView$4
	implements Action1
{

	public void call(Boolean boolean1)
	{
		val$view.setPressed(boolean1.booleanValue());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View val$view>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//    4    8:invokevirtual   #36  <Method void View.setPressed(boolean)>
	//    5   11:return          
	}

	public volatile void call(Object obj)
	{
		call((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Boolean>
	//    3    5:invokevirtual   #39  <Method void call(Boolean)>
	//    4    8:return          
	}

	final View val$view;

	RxView$4(View view1)
	{
		val$view = view1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field View val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

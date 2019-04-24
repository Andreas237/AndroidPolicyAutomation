// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			RxView

static final class RxView$6
	implements Action1
{

	public void call(Boolean boolean1)
	{
		View view1 = val$view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field View val$view>
	//    2    4:astore_3        
		int i;
		if(boolean1.booleanValue())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//*   5    9:ifeq            20
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		else
	//*   8   14:aload_3         
	//*   9   15:iload_2         
	//*  10   16:invokevirtual   #40  <Method void View.setVisibility(int)>
	//*  11   19:return          
			i = val$visibilityWhenFalse;
	//   12   20:aload_0         
	//   13   21:getfield        #22  <Field int val$visibilityWhenFalse>
	//   14   24:istore_2        
		view1.setVisibility(i);
	//*  15   25:goto            14
	}

	public volatile void call(Object obj)
	{
		call((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Boolean>
	//    3    5:invokevirtual   #43  <Method void call(Boolean)>
	//    4    8:return          
	}

	final View val$view;
	final int val$visibilityWhenFalse;

	RxView$6(View view1, int i)
	{
		val$view = view1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field View val$view>
		val$visibilityWhenFalse = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$visibilityWhenFalse>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}

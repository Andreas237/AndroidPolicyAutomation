// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.view.MotionEvent;
import android.view.ViewGroup;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableScrollView

class ObservableScrollView$1
	implements Runnable
{

	public void run()
	{
		val$parent.dispatchTouchEvent(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewGroup val$parent>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field MotionEvent val$event>
	//    4    8:invokevirtual   #35  <Method boolean ViewGroup.dispatchTouchEvent(MotionEvent)>
	//    5   11:pop             
	//    6   12:return          
	}

	final ObservableScrollView this$0;
	final MotionEvent val$event;
	final ViewGroup val$parent;

	ObservableScrollView$1()
	{
		this$0 = final_observablescrollview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ObservableScrollView this$0>
		val$parent = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewGroup val$parent>
		val$event = MotionEvent.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field MotionEvent val$event>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

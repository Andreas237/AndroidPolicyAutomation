// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui.view;

import android.graphics.Paint;

// Referenced classes of package com.pactforcure.app.ui.view:
//			CircleIndicatorView

class CircleIndicatorView$1
{

	public void setColor(int i)
	{
		CircleIndicatorView.access$000(CircleIndicatorView.this).setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CircleIndicatorView this$0>
	//    2    4:invokestatic    #25  <Method Paint CircleIndicatorView.access$000(CircleIndicatorView)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #29  <Method void Paint.setColor(int)>
		invalidate();
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field CircleIndicatorView this$0>
	//    7   15:invokevirtual   #32  <Method void CircleIndicatorView.invalidate()>
	//    8   18:return          
	}

	final CircleIndicatorView this$0;

	CircleIndicatorView$1()
	{
		this$0 = CircleIndicatorView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CircleIndicatorView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}

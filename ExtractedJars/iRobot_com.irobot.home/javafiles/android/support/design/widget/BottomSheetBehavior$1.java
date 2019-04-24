// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$1
	implements Runnable
{

	public void run()
	{
		c.a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field BottomSheetBehavior c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field View a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field int b>
	//    6   12:invokevirtual   #32  <Method void BottomSheetBehavior.a(View, int)>
	//    7   15:return          
	}

	final View a;
	final int b;
	final BottomSheetBehavior c;

	BottomSheetBehavior$1(BottomSheetBehavior bottomsheetbehavior, View view, int i)
	{
		c = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field BottomSheetBehavior c>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field View a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$5
	implements Runnable
{

	public void run()
	{
		c.startSettlingAnimation(e, d);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BottomSheetBehavior c>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View e>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int d>
	//    6   12:invokevirtual   #34  <Method void BottomSheetBehavior.startSettlingAnimation(View, int)>
	//    7   15:return          
	}

	final BottomSheetBehavior c;
	final int d;
	final View e;

	BottomSheetBehavior$5(BottomSheetBehavior bottomsheetbehavior, View view, int i)
	{
		c = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field BottomSheetBehavior c>
		e = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field View e>
		d = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int d>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

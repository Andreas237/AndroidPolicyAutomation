// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ScrollUtils

static final class ScrollUtils$1
	implements android.view.er.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		if(android.os.Build$VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmpge          22
			val$view.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.er.OnGlobalLayoutListener) (this)));
	//    3    8:aload_0         
	//    4    9:getfield        #18  <Field View val$view>
	//    5   12:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #43  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		else
	//*   8   19:goto            33
			val$view.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.er.OnGlobalLayoutListener) (this)));
	//    9   22:aload_0         
	//   10   23:getfield        #18  <Field View val$view>
	//   11   26:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   12   29:aload_0         
	//   13   30:invokevirtual   #46  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		val$runnable.run();
	//   14   33:aload_0         
	//   15   34:getfield        #20  <Field Runnable val$runnable>
	//   16   37:invokeinterface #51  <Method void Runnable.run()>
	//   17   42:return          
	}

	final Runnable val$runnable;
	final View val$view;

	ScrollUtils$1(View view1, Runnable runnable1)
	{
		val$view = view1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field View val$view>
		val$runnable = runnable1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Runnable val$runnable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

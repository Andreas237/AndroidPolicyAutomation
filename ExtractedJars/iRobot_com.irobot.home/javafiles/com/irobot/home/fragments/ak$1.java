// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package com.irobot.home.fragments:
//			ak

class ak$1
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		ak.a(a, a.b.getHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ak a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field ak a>
	//    4    8:getfield        #25  <Field FrameLayout ak.b>
	//    5   11:invokevirtual   #31  <Method int FrameLayout.getHeight()>
	//    6   14:invokestatic    #34  <Method int ak.a(ak, int)>
	//    7   17:pop             
		ak.b(a, a.b.getWidth());
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field ak a>
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field ak a>
	//   12   26:getfield        #25  <Field FrameLayout ak.b>
	//   13   29:invokevirtual   #37  <Method int FrameLayout.getWidth()>
	//   14   32:invokestatic    #39  <Method int ak.b(ak, int)>
	//   15   35:pop             
		a.b.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//   16   36:aload_0         
	//   17   37:getfield        #17  <Field ak a>
	//   18   40:getfield        #25  <Field FrameLayout ak.b>
	//   19   43:invokevirtual   #43  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #49  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   22   50:return          
	}

	final ak a;

	ak$1(ak ak1)
	{
		a = ak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ak a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

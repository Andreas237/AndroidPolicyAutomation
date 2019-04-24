// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

class CoordinatorLayout$5
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		return c.setWindowInsets(windowinsetscompat);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CoordinatorLayout c>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CoordinatorLayout.setWindowInsets(WindowInsetsCompat)>
	//    4    8:areturn         
	}

	final CoordinatorLayout c;

	CoordinatorLayout$5(CoordinatorLayout coordinatorlayout)
	{
		c = coordinatorlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CoordinatorLayout c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

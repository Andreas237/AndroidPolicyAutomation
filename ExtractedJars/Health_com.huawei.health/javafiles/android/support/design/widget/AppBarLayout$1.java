// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

class AppBarLayout$1
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		return c.onWindowInsetChanged(windowinsetscompat);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AppBarLayout c>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #26  <Method WindowInsetsCompat AppBarLayout.onWindowInsetChanged(WindowInsetsCompat)>
	//    4    8:areturn         
	}

	final AppBarLayout c;

	AppBarLayout$1(AppBarLayout appbarlayout)
	{
		c = appbarlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppBarLayout c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout

class CollapsingToolbarLayout$1
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		return onWindowInsetChanged(windowinsetscompat);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CollapsingToolbarLayout this$0>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CollapsingToolbarLayout.onWindowInsetChanged(WindowInsetsCompat)>
	//    4    8:areturn         
	}

	final CollapsingToolbarLayout this$0;

	CollapsingToolbarLayout$1()
	{
		this$0 = CollapsingToolbarLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CollapsingToolbarLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

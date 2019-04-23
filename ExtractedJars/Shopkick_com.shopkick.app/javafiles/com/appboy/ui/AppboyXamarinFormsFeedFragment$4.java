// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//			AppboyXamarinFormsFeedFragment

class AppboyXamarinFormsFeedFragment$4
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		return view.getVisibility() == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method int View.getVisibility()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final AppboyXamarinFormsFeedFragment this$0;

	AppboyXamarinFormsFeedFragment$4()
	{
		this$0 = AppboyXamarinFormsFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

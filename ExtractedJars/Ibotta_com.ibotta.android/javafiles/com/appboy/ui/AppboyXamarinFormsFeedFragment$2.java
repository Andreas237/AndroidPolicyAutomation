// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//			AppboyXamarinFormsFeedFragment

class AppboyXamarinFormsFeedFragment$2
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		return AppboyXamarinFormsFeedFragment.access$200(AppboyXamarinFormsFeedFragment.this).onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//    2    4:invokestatic    #27  <Method GestureDetectorCompat AppboyXamarinFormsFeedFragment.access$200(AppboyXamarinFormsFeedFragment)>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #33  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
	//    5   11:ireturn         
	}

	final AppboyXamarinFormsFeedFragment this$0;

	AppboyXamarinFormsFeedFragment$2()
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

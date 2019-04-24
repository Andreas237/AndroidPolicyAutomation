// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.*;

// Referenced classes of package com.pactforcure.app.ui:
//			MainActivity

class MainActivity$3
	implements android.view.tener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		MainActivity.access$300(MainActivity.this).onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MainActivity this$0>
	//    2    4:invokestatic    #27  <Method GestureDetector MainActivity.access$300(MainActivity)>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #33  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//    5   11:pop             
		return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
	}

	final MainActivity this$0;

	MainActivity$3()
	{
		this$0 = MainActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MainActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

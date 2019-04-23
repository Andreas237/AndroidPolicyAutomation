// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v13.view:
//			DragStartHelper

class DragStartHelper$2
	implements android.view.er
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		return DragStartHelper.this.onTouch(view, motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field DragStartHelper this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #22  <Method boolean DragStartHelper.onTouch(View, MotionEvent)>
	//    5    9:ireturn         
	}

	final DragStartHelper this$0;

	DragStartHelper$2()
	{
		this$0 = DragStartHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DragStartHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

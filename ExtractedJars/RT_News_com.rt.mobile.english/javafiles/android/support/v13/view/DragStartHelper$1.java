// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view;

import android.view.View;

// Referenced classes of package android.support.v13.view:
//			DragStartHelper

class DragStartHelper$1
	implements android.view.stener
{

	public boolean onLongClick(View view)
	{
		return DragStartHelper.this.onLongClick(view);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field DragStartHelper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method boolean DragStartHelper.onLongClick(View)>
	//    4    8:ireturn         
	}

	final DragStartHelper this$0;

	DragStartHelper$1()
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

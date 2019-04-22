// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.internal:
//			WebDialog

class WebDialog$4
	implements android.view.Listener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(!view.hasFocus())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #29  <Method boolean View.hasFocus()>
	//*   2    4:ifne            12
			view.requestFocus();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method boolean View.requestFocus()>
	//    5   11:pop             
		return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	final WebDialog this$0;

	WebDialog$4()
	{
		this$0 = WebDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WebDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

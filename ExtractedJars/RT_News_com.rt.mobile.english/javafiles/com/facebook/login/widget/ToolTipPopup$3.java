// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.view.View;

// Referenced classes of package com.facebook.login.widget:
//			ToolTipPopup

class ToolTipPopup$3
	implements android.view.tener
{

	public void onClick(View view)
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ToolTipPopup this$0>
	//    2    4:invokevirtual   #25  <Method void ToolTipPopup.dismiss()>
	//    3    7:return          
	}

	final ToolTipPopup this$0;

	ToolTipPopup$3()
	{
		this$0 = ToolTipPopup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ToolTipPopup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.view.View;

// Referenced classes of package com.facebook.internal:
//			WebDialog

class WebDialog$2
	implements android.view.Listener
{

	public void onClick(View view)
	{
		cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WebDialog this$0>
	//    2    4:invokevirtual   #25  <Method void WebDialog.cancel()>
	//    3    7:return          
	}

	final WebDialog this$0;

	WebDialog$2()
	{
		this$0 = WebDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WebDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

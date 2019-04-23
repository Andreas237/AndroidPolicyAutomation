// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper, AppboyInAppMessageManager

class InAppMessageViewWrapper$4
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
	//    0    0:invokestatic    #29  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #33  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
	//    3    7:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$4()
	{
		this$0 = InAppMessageViewWrapper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper, AppboyInAppMessageManager

class InAppMessageViewWrapper$6
	implements com.appboy.ui.inappmessage.listeners.DismissCallbacks
{

	public boolean canDismiss(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onDismiss(View view, Object obj)
	{
		InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this).setAnimateOut(false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    2    4:invokestatic    #29  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//    3    7:iconst_0        
	//    4    8:invokeinterface #35  <Method void IInAppMessage.setAnimateOut(boolean)>
		AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
	//    5   13:invokestatic    #41  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    6   16:iconst_1        
	//    7   17:invokevirtual   #44  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
	//    8   20:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$6()
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

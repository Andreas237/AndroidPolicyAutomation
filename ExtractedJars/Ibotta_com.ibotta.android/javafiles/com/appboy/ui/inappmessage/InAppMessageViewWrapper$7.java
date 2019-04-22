// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper

class InAppMessageViewWrapper$7
	implements com.appboy.ui.inappmessage.listeners.hListener.ITouchListener
{

	public void onTouchEnded()
	{
		if(InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this).getDismissType() == DismissType.AUTO_DISMISS)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//*   2    4:invokestatic    #26  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//*   3    7:invokeinterface #32  <Method DismissType IInAppMessage.getDismissType()>
	//*   4   12:getstatic       #38  <Field DismissType DismissType.AUTO_DISMISS>
	//*   5   15:if_acmpne       25
			InAppMessageViewWrapper.access$700(InAppMessageViewWrapper.this);
	//    6   18:aload_0         
	//    7   19:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    8   22:invokestatic    #41  <Method void InAppMessageViewWrapper.access$700(InAppMessageViewWrapper)>
	//    9   25:return          
	}

	public void onTouchStartedOrContinued()
	{
		InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).removeCallbacks(InAppMessageViewWrapper.access$600(InAppMessageViewWrapper.this));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    2    4:invokestatic    #46  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    5   11:invokestatic    #50  <Method Runnable InAppMessageViewWrapper.access$600(InAppMessageViewWrapper)>
	//    6   14:invokevirtual   #56  <Method boolean View.removeCallbacks(Runnable)>
	//    7   17:pop             
	//    8   18:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$7()
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

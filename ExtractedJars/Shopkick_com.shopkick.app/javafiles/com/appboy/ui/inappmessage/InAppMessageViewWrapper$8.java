// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.animation.Animation;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.support.ViewUtils;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper

class InAppMessageViewWrapper$8
	implements android.view.animation.r
{

	public void onAnimationEnd(Animation animation)
	{
		if(InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this).getDismissType() == DismissType.AUTO_DISMISS)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//*   2    4:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//*   3    7:invokeinterface #33  <Method DismissType IInAppMessage.getDismissType()>
	//*   4   12:getstatic       #39  <Field DismissType DismissType.AUTO_DISMISS>
	//*   5   15:if_acmpne       25
			InAppMessageViewWrapper.access$700(InAppMessageViewWrapper.this);
	//    6   18:aload_0         
	//    7   19:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    8   22:invokestatic    #42  <Method void InAppMessageViewWrapper.access$700(InAppMessageViewWrapper)>
		AppboyLogger.d(InAppMessageViewWrapper.access$000(), "In-app message animated into view.");
	//    9   25:invokestatic    #46  <Method String InAppMessageViewWrapper.access$000()>
	//   10   28:ldc1            #48  <String "In-app message animated into view.">
	//   11   30:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//   12   33:pop             
		ViewUtils.setFocusableInTouchModeAndRequestFocus(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this));
	//   13   34:aload_0         
	//   14   35:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   15   38:invokestatic    #58  <Method android.view.View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//   16   41:invokestatic    #64  <Method void ViewUtils.setFocusableInTouchModeAndRequestFocus(android.view.View)>
		InAppMessageViewWrapper.access$800(InAppMessageViewWrapper.this);
	//   17   44:aload_0         
	//   18   45:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   19   48:invokestatic    #67  <Method void InAppMessageViewWrapper.access$800(InAppMessageViewWrapper)>
		InAppMessageViewWrapper.access$400(InAppMessageViewWrapper.this).afterOpened(InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this));
	//   20   51:aload_0         
	//   21   52:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   22   55:invokestatic    #71  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
	//   23   58:aload_0         
	//   24   59:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   25   62:invokestatic    #58  <Method android.view.View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//   26   65:aload_0         
	//   27   66:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   28   69:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//   29   72:invokeinterface #77  <Method void IInAppMessageViewLifecycleListener.afterOpened(android.view.View, IInAppMessage)>
	//   30   77:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$8()
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper

class InAppMessageViewWrapper$9
	implements android.view.animation.r
{

	public void onAnimationEnd(Animation animation)
	{
		InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    2    4:invokestatic    #27  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//    3    7:invokevirtual   #32  <Method void View.clearAnimation()>
		InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this).setVisibility(8);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    6   14:invokestatic    #27  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//    7   17:bipush          8
	//    8   19:invokevirtual   #36  <Method void View.setVisibility(int)>
		InAppMessageViewWrapper.access$900(InAppMessageViewWrapper.this);
	//    9   22:aload_0         
	//   10   23:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   11   26:invokestatic    #39  <Method void InAppMessageViewWrapper.access$900(InAppMessageViewWrapper)>
	//   12   29:return          
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

	InAppMessageViewWrapper$9()
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

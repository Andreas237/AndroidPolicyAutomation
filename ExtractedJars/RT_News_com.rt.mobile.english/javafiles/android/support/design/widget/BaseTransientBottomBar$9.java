// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$9
	implements android.view.animation.er
{

	public void onAnimationEnd(Animation animation)
	{
		onViewShown();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    2    4:invokevirtual   #25  <Method void BaseTransientBottomBar.onViewShown()>
	//    3    7:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$9()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

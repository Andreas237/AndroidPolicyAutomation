// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$12
	implements android.view.animation.r
{

	public void onAnimationEnd(Animation animation)
	{
		onViewHidden(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BaseTransientBottomBar this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int val$event>
	//    4    8:invokevirtual   #30  <Method void BaseTransientBottomBar.onViewHidden(int)>
	//    5   11:return          
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
	final int val$event;

	BaseTransientBottomBar$12()
	{
		this$0 = final_basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
		val$event = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

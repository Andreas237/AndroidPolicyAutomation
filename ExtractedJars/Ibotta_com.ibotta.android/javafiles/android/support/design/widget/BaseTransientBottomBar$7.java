// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$7
	implements LayoutChangeListener
{

	public void onLayoutChange(View view, int i, int j, int k, int l)
	{
		BaseTransientBottomBar.this.view.setOnLayoutChangeListener(((LayoutChangeListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    2    4:getfield        #26  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.view>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setOnLayoutChangeListener(BaseTransientBottomBar$OnLayoutChangeListener)>
		if(shouldAnimate())
	//*   5   11:aload_0         
	//*   6   12:getfield        #17  <Field BaseTransientBottomBar this$0>
	//*   7   15:invokevirtual   #36  <Method boolean BaseTransientBottomBar.shouldAnimate()>
	//*   8   18:ifeq            29
		{
			animateViewIn();
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field BaseTransientBottomBar this$0>
	//   11   25:invokevirtual   #39  <Method void BaseTransientBottomBar.animateViewIn()>
			return;
	//   12   28:return          
		} else
		{
			onViewShown();
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field BaseTransientBottomBar this$0>
	//   15   33:invokevirtual   #42  <Method void BaseTransientBottomBar.onViewShown()>
			return;
	//   16   36:return          
		}
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$7()
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

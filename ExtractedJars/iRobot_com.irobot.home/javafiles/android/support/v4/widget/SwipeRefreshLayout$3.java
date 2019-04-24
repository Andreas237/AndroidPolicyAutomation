// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout

class SwipeRefreshLayout$3 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		a.setAnimationProgress(1.0F - f);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SwipeRefreshLayout a>
	//    2    4:fconst_1        
	//    3    5:fload_1         
	//    4    6:fsub            
	//    5    7:invokevirtual   #24  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
	//    6   10:return          
	}

	final SwipeRefreshLayout a;

	SwipeRefreshLayout$3(SwipeRefreshLayout swiperefreshlayout)
	{
		a = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SwipeRefreshLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Animation()>
	//    5    9:return          
	}
}

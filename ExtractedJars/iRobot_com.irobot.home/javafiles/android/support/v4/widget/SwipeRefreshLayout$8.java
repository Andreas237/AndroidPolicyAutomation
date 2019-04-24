// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout

class SwipeRefreshLayout$8 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		float f1 = a.g;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SwipeRefreshLayout a>
	//    2    4:getfield        #25  <Field float SwipeRefreshLayout.g>
	//    3    7:fstore_3        
		float f2 = -a.g;
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field SwipeRefreshLayout a>
	//    6   12:getfield        #25  <Field float SwipeRefreshLayout.g>
	//    7   15:fneg            
	//    8   16:fstore          4
		a.setAnimationProgress(f1 + f2 * f);
	//    9   18:aload_0         
	//   10   19:getfield        #15  <Field SwipeRefreshLayout a>
	//   11   22:fload_3         
	//   12   23:fload           4
	//   13   25:fload_1         
	//   14   26:fmul            
	//   15   27:fadd            
	//   16   28:invokevirtual   #29  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
		a.a(f);
	//   17   31:aload_0         
	//   18   32:getfield        #15  <Field SwipeRefreshLayout a>
	//   19   35:fload_1         
	//   20   36:invokevirtual   #31  <Method void SwipeRefreshLayout.a(float)>
	//   21   39:return          
	}

	final SwipeRefreshLayout a;

	SwipeRefreshLayout$8(SwipeRefreshLayout swiperefreshlayout)
	{
		a = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeRefreshLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Animation()>
	//    5    9:return          
	}
}

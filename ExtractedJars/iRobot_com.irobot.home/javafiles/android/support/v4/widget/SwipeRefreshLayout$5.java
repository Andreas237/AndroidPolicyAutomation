// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout

class SwipeRefreshLayout$5
	implements android.view.animation.stener
{

	public void onAnimationEnd(Animation animation)
	{
		if(!a.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field SwipeRefreshLayout a>
	//*   2    4:getfield        #27  <Field boolean SwipeRefreshLayout.d>
	//*   3    7:ifne            18
			a.a(((android.view.animation.stener) (null)));
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field SwipeRefreshLayout a>
	//    6   14:aconst_null     
	//    7   15:invokevirtual   #30  <Method void SwipeRefreshLayout.a(android.view.animation.Animation$AnimationListener)>
	//    8   18:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final SwipeRefreshLayout a;

	SwipeRefreshLayout$5(SwipeRefreshLayout swiperefreshlayout)
	{
		a = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SwipeRefreshLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

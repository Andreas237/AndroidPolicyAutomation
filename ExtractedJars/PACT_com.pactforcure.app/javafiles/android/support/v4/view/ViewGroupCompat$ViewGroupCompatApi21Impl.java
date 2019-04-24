// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//			ViewGroupCompat

static class ViewGroupCompat$ViewGroupCompatApi21Impl extends ViewGroupCompat$ViewGroupCompatApi18Impl
{

	public int getNestedScrollAxes(ViewGroup viewgroup)
	{
		return viewgroup.getNestedScrollAxes();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int ViewGroup.getNestedScrollAxes()>
	//    2    4:ireturn         
	}

	public boolean isTransitionGroup(ViewGroup viewgroup)
	{
		return viewgroup.isTransitionGroup();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method boolean ViewGroup.isTransitionGroup()>
	//    2    4:ireturn         
	}

	public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
	{
		viewgroup.setTransitionGroup(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #32  <Method void ViewGroup.setTransitionGroup(boolean)>
	//    3    5:return          
	}

	ViewGroupCompat$ViewGroupCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewGroupCompat$ViewGroupCompatApi18Impl()>
	//    2    4:return          
	}
}

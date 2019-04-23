// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButton, CoordinatorLayout

public static class FloatingActionButton$Behavior extends ior
{

	public volatile boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
	{
		return super.getInsetDodgeRect(coordinatorlayout, floatingactionbutton, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method boolean FloatingActionButton$BaseBehavior.getInsetDodgeRect(CoordinatorLayout, FloatingActionButton, Rect)>
	//    5    7:ireturn         
	}

	public volatile boolean isAutoHideEnabled()
	{
		return super.isAutoHideEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method boolean FloatingActionButton$BaseBehavior.isAutoHideEnabled()>
	//    2    4:ireturn         
	}

	public volatile void onAttachedToLayoutParams( )
	{
		super.onAttachedToLayoutParams();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void FloatingActionButton$BaseBehavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
	//    3    5:return          
	}

	public volatile boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
	{
		return super.onDependentViewChanged(coordinatorlayout, floatingactionbutton, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #34  <Method boolean FloatingActionButton$BaseBehavior.onDependentViewChanged(CoordinatorLayout, FloatingActionButton, View)>
	//    5    7:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
	{
		return super.onLayoutChild(coordinatorlayout, floatingactionbutton, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #38  <Method boolean FloatingActionButton$BaseBehavior.onLayoutChild(CoordinatorLayout, FloatingActionButton, int)>
	//    5    7:ireturn         
	}

	public volatile void setAutoHideEnabled(boolean flag)
	{
		super.setAutoHideEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #42  <Method void FloatingActionButton$BaseBehavior.setAutoHideEnabled(boolean)>
	//    3    5:return          
	}

	public volatile void setInternalAutoHideListener(ityChangedListener itychangedlistener)
	{
		super.setInternalAutoHideListener(itychangedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void FloatingActionButton$BaseBehavior.setInternalAutoHideListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    3    5:return          
	}

	public FloatingActionButton$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void FloatingActionButton$BaseBehavior()>
	//    2    4:return          
	}

	public FloatingActionButton$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void FloatingActionButton$BaseBehavior(Context, AttributeSet)>
	//    4    6:return          
	}
}

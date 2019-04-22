// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout, CoordinatorLayout

public static class AppBarLayout$Behavior extends ior
{

	public volatile int getTopAndBottomOffset()
	{
		return super.getTopAndBottomOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method int AppBarLayout$BaseBehavior.getTopAndBottomOffset()>
	//    2    4:ireturn         
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
	{
		return super.onLayoutChild(coordinatorlayout, appbarlayout, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method boolean AppBarLayout$BaseBehavior.onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
	//    5    7:ireturn         
	}

	public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
	{
		return super.onMeasureChild(coordinatorlayout, appbarlayout, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #28  <Method boolean AppBarLayout$BaseBehavior.onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
	//    8   13:ireturn         
	}

	public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
	{
		super.onNestedPreScroll(coordinatorlayout, appbarlayout, view, i, j, ai, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:invokespecial   #32  <Method void AppBarLayout$BaseBehavior.onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
	//    9   15:return          
	}

	public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
			int i1)
	{
		super.onNestedScroll(coordinatorlayout, appbarlayout, view, i, j, k, l, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:invokespecial   #36  <Method void AppBarLayout$BaseBehavior.onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
	//   10   17:return          
	}

	public volatile void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
	{
		super.onRestoreInstanceState(coordinatorlayout, appbarlayout, parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #40  <Method void AppBarLayout$BaseBehavior.onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
	//    5    7:return          
	}

	public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
	{
		return super.onSaveInstanceState(coordinatorlayout, appbarlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #44  <Method Parcelable AppBarLayout$BaseBehavior.onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
	//    4    6:areturn         
	}

	public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
	{
		return super.onStartNestedScroll(coordinatorlayout, appbarlayout, view, view1, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #48  <Method boolean AppBarLayout$BaseBehavior.onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
	//    8   13:ireturn         
	}

	public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
	{
		super.onStopNestedScroll(coordinatorlayout, appbarlayout, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #52  <Method void AppBarLayout$BaseBehavior.onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
	//    6    9:return          
	}

	public volatile boolean setTopAndBottomOffset(int i)
	{
		return super.setTopAndBottomOffset(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #56  <Method boolean AppBarLayout$BaseBehavior.setTopAndBottomOffset(int)>
	//    3    5:ireturn         
	}

	public AppBarLayout$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AppBarLayout$BaseBehavior()>
	//    2    4:return          
	}

	public AppBarLayout$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void AppBarLayout$BaseBehavior(Context, AttributeSet)>
	//    4    6:return          
	}
}

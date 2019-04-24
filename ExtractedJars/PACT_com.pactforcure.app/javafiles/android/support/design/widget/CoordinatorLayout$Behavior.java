// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public static abstract class CoordinatorLayout$Behavior
{

	public static Object getTag(View view)
	{
		return ((ams)view.getLayoutParams()).mBehaviorTag;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$LayoutParams>
	//    3    7:getfield        #28  <Field Object CoordinatorLayout$LayoutParams.mBehaviorTag>
	//    4   10:areturn         
	}

	public static void setTag(View view, Object obj)
	{
		((ams)view.getLayoutParams()).mBehaviorTag = obj;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #24  <Class CoordinatorLayout$LayoutParams>
	//    3    7:aload_1         
	//    4    8:putfield        #28  <Field Object CoordinatorLayout$LayoutParams.mBehaviorTag>
	//    5   11:return          
	}

	public boolean blocksInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
	{
		return getScrimOpacity(coordinatorlayout, view) > 0.0F;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #36  <Method float getScrimOpacity(CoordinatorLayout, View)>
	//    4    6:fconst_0        
	//    5    7:fcmpl           
	//    6    8:ifle            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, View view, Rect rect)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getScrimColor(CoordinatorLayout coordinatorlayout, View view)
	{
		return 0xff000000;
	//    0    0:ldc1            #47  <Int 0xff000000>
	//    1    2:ireturn         
	}

	public float getScrimOpacity(CoordinatorLayout coordinatorlayout, View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorlayout, View view, WindowInsetsCompat windowinsetscompat)
	{
		return windowinsetscompat;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public void onAttachedToLayoutParams(ams ams)
	{
	//    0    0:return          
	}

	public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
	//    0    0:return          
	}

	public void onDetachedFromLayoutParams()
	{
	//    0    0:return          
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
	{
	//    0    0:return          
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
	{
		if(k == 0)
	//*   0    0:iload           7
	//*   1    2:ifne            18
			onNestedPreScroll(coordinatorlayout, view, view1, i, j, ai);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:iload           5
	//    8   13:aload           6
	//    9   15:invokevirtual   #93  <Method void onNestedPreScroll(CoordinatorLayout, View, View, int, int, int[])>
	//   10   18:return          
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
			int i1)
	{
		if(i1 == 0)
	//*   0    0:iload           8
	//*   1    2:ifne            20
			onNestedScroll(coordinatorlayout, view, view1, i, j, k, l);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:iload           5
	//    8   13:iload           6
	//    9   15:iload           7
	//   10   17:invokevirtual   #100 <Method void onNestedScroll(CoordinatorLayout, View, View, int, int, int, int)>
	//   11   20:return          
	}

	public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
	//    0    0:return          
	}

	public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		if(j == 0)
	//*   0    0:iload           6
	//*   1    2:ifne            16
			onNestedScrollAccepted(coordinatorlayout, view, view1, view2, i);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:iload           5
	//    8   13:invokevirtual   #107 <Method void onNestedScrollAccepted(CoordinatorLayout, View, View, View, int)>
	//    9   16:return          
	}

	public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
	//    0    0:return          
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (android.view.View.BaseSavedState.EMPTY_STATE));
	//    0    0:getstatic       #122 <Field android.view.AbsSavedState android.view.View$BaseSavedState.EMPTY_STATE>
	//    1    3:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		if(j == 0)
	//*   0    0:iload           6
	//*   1    2:ifne            17
			return onStartNestedScroll(coordinatorlayout, view, view1, view2, i);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:iload           5
	//    8   13:invokevirtual   #129 <Method boolean onStartNestedScroll(CoordinatorLayout, View, View, View, int)>
	//    9   16:ireturn         
		else
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
	//    0    0:return          
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
	{
		if(i == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            12
			onStopNestedScroll(coordinatorlayout, view, view1);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #134 <Method void onStopNestedScroll(CoordinatorLayout, View, View)>
	//    7   12:return          
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CoordinatorLayout$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public CoordinatorLayout$Behavior(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}

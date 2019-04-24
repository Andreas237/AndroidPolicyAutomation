// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.aa;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public static abstract class CoordinatorLayout$Behavior
{

	public aa a(CoordinatorLayout coordinatorlayout, View view, aa aa)
	{
		return aa;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public void a(CoordinatorLayout.c c1)
	{
	//    0    0:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
	//    0    0:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
	{
		if(i == 0)
	//*   0    0:iload           4
	//*   1    2:ifne            12
			c(coordinatorlayout, view, view1);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #26  <Method void c(CoordinatorLayout, View, View)>
	//    7   12:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
			int i1)
	{
		if(i1 == 0)
	//*   0    0:iload           8
	//*   1    2:ifne            20
			a(coordinatorlayout, view, view1, i, j, k, l);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:iload           5
	//    8   13:iload           6
	//    9   15:iload           7
	//   10   17:invokevirtual   #34  <Method void a(CoordinatorLayout, View, View, int, int, int, int)>
	//   11   20:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
	{
	//    0    0:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
	{
		if(k == 0)
	//*   0    0:iload           7
	//*   1    2:ifne            18
			a(coordinatorlayout, view, view1, i, j, ai);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:iload           5
	//    8   13:aload           6
	//    9   15:invokevirtual   #40  <Method void a(CoordinatorLayout, View, View, int, int, int[])>
	//   10   18:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		if(j == 0)
	//*   0    0:iload           6
	//*   1    2:ifne            17
			return a(coordinatorlayout, view, view1, view2, i);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:iload           5
	//    8   13:invokevirtual   #62  <Method boolean a(CoordinatorLayout, View, View, View, int)>
	//    9   16:ireturn         
		else
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
	}

	public Parcelable b(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (android.view.View.BaseSavedState.EMPTY_STATE));
	//    0    0:getstatic       #71  <Field android.view.AbsSavedState android.view.View$BaseSavedState.EMPTY_STATE>
	//    1    3:areturn         
	}

	public void b(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
	{
	//    0    0:return          
	}

	public void b(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		if(j == 0)
	//*   0    0:iload           6
	//*   1    2:ifne            16
			b(coordinatorlayout, view, view1, view2, i);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:iload           5
	//    8   13:invokevirtual   #77  <Method void b(CoordinatorLayout, View, View, View, int)>
	//    9   16:return          
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int c(CoordinatorLayout coordinatorlayout, View view)
	{
		return 0xff000000;
	//    0    0:ldc1            #80  <Int 0xff000000>
	//    1    2:ireturn         
	}

	public void c()
	{
	//    0    0:return          
	}

	public void c(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
	//    0    0:return          
	}

	public float d(CoordinatorLayout coordinatorlayout, View view)
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public void d(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
	//    0    0:return          
	}

	public boolean e(CoordinatorLayout coordinatorlayout, View view)
	{
		return d(coordinatorlayout, view) > 0.0F;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #89  <Method float d(CoordinatorLayout, View)>
	//    4    6:fconst_0        
	//    5    7:fcmpl           
	//    6    8:ifle            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
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

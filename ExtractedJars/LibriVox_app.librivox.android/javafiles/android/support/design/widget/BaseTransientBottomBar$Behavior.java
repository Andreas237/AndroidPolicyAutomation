// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior, p, BaseTransientBottomBar, CoordinatorLayout

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{

	static void a(BaseTransientBottomBar$Behavior basetransientbottombar$behavior, BaseTransientBottomBar basetransientbottombar)
	{
		basetransientbottombar$behavior.a(basetransientbottombar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void a(BaseTransientBottomBar)>
	//    3    5:return          
	}

	private void a(BaseTransientBottomBar basetransientbottombar)
	{
		g.a(basetransientbottombar);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field p g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void p.a(BaseTransientBottomBar)>
	//    4    8:return          
	}

	public boolean a(View view)
	{
		return g.a(view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field p g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method boolean p.a(View)>
	//    4    8:ireturn         
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		g.a(coordinatorlayout, view, motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field p g>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #32  <Method void p.a(CoordinatorLayout, View, MotionEvent)>
		return super.b(coordinatorlayout, view, motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokespecial   #34  <Method boolean SwipeDismissBehavior.b(CoordinatorLayout, View, MotionEvent)>
	//   11   17:ireturn         
	}

	private final p g = new p(((SwipeDismissBehavior) (this)));

	public BaseTransientBottomBar$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void SwipeDismissBehavior()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class p>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #15  <Method void p(SwipeDismissBehavior)>
	//    7   13:putfield        #17  <Field p g>
	//    8   16:return          
	}
}

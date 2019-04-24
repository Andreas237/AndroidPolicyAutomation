// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;
import o.x;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior, BaseTransientBottomBar, CoordinatorLayout

final class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{

	public boolean canSwipeDismissView(View view)
	{
		return view instanceof BaseTransientBottomBar.c;
	//    0    0:aload_1         
	//    1    1:instanceof      #22  <Class BaseTransientBottomBar$c>
	//    2    4:ireturn         
	}

	public boolean d(CoordinatorLayout coordinatorlayout, BaseTransientBottomBar.c c, MotionEvent motionevent)
	{
		switch(motionevent.getActionMasked())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #30  <Method int MotionEvent.getActionMasked()>
		{
		case 2: // '\002'
		default:
			break;

	//*   2    4:tableswitch     0 3: default 36
	//	               0 39
	//	               1 73
	//	               2 86
	//	               3 73
	//*   3   36:goto            86
		case 0: // '\0'
			if(coordinatorlayout.isPointInChildBounds(((View) (c)), (int)motionevent.getX(), (int)motionevent.getY()))
	//*   4   39:aload_1         
	//*   5   40:aload_2         
	//*   6   41:aload_3         
	//*   7   42:invokevirtual   #34  <Method float MotionEvent.getX()>
	//*   8   45:f2i             
	//*   9   46:aload_3         
	//*  10   47:invokevirtual   #37  <Method float MotionEvent.getY()>
	//*  11   50:f2i             
	//*  12   51:invokevirtual   #43  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  13   54:ifeq            86
				x.b().e(e.mManagerCallback);
	//   14   57:invokestatic    #49  <Method x x.b()>
	//   15   60:aload_0         
	//   16   61:getfield        #14  <Field BaseTransientBottomBar e>
	//   17   64:getfield        #53  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
	//   18   67:invokevirtual   #56  <Method void x.e(o.x$e)>
			break;

	//*  19   70:goto            86
		case 1: // '\001'
		case 3: // '\003'
			x.b().c(e.mManagerCallback);
	//   20   73:invokestatic    #49  <Method x x.b()>
	//   21   76:aload_0         
	//   22   77:getfield        #14  <Field BaseTransientBottomBar e>
	//   23   80:getfield        #53  <Field o.x$e BaseTransientBottomBar.mManagerCallback>
	//   24   83:invokevirtual   #59  <Method void x.c(o.x$e)>
			break;
		}
		return super.onInterceptTouchEvent(coordinatorlayout, ((View) (c)), motionevent);
	//   25   86:aload_0         
	//   26   87:aload_1         
	//   27   88:aload_2         
	//   28   89:aload_3         
	//   29   90:invokespecial   #63  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   30   93:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return d(coordinatorlayout, (BaseTransientBottomBar.c)view, motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #22  <Class BaseTransientBottomBar$c>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #65  <Method boolean d(CoordinatorLayout, BaseTransientBottomBar$c, MotionEvent)>
	//    6   10:ireturn         
	}

	final BaseTransientBottomBar e;

	BaseTransientBottomBar$Behavior(BaseTransientBottomBar basetransientbottombar)
	{
		e = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseTransientBottomBar e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void SwipeDismissBehavior()>
	//    5    9:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			p, CoordinatorLayout

class ViewOffsetBehavior extends CoordinatorLayout.Behavior
{

	public ViewOffsetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CoordinatorLayout$Behavior()>
		b = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int b>
		c = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int c>
	//    8   14:return          
	}

	public ViewOffsetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		b = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #16  <Field int b>
		c = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #18  <Field int c>
	//   10   16:return          
	}

	public boolean a(int i)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field p a>
	//*   2    4:ifnull          16
		{
			return a.a(i);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field p a>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #29  <Method boolean p.a(int)>
	//    7   15:ireturn         
		} else
		{
			b = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #16  <Field int b>
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		b(coordinatorlayout, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #33  <Method void b(CoordinatorLayout, View, int)>
		if(a == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field p a>
	//*   7   11:ifnonnull       26
			a = new p(view);
	//    8   14:aload_0         
	//    9   15:new             #27  <Class p>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #36  <Method void p(View)>
	//   13   23:putfield        #25  <Field p a>
		a.a();
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field p a>
	//   16   30:invokevirtual   #38  <Method void p.a()>
		if(b != 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #16  <Field int b>
	//*  19   37:ifeq            57
		{
			a.a(b);
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field p a>
	//   22   44:aload_0         
	//   23   45:getfield        #16  <Field int b>
	//   24   48:invokevirtual   #29  <Method boolean p.a(int)>
	//   25   51:pop             
			b = 0;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #16  <Field int b>
		}
		if(c != 0)
	//*  29   57:aload_0         
	//*  30   58:getfield        #18  <Field int c>
	//*  31   61:ifeq            81
		{
			a.b(c);
	//   32   64:aload_0         
	//   33   65:getfield        #25  <Field p a>
	//   34   68:aload_0         
	//   35   69:getfield        #18  <Field int c>
	//   36   72:invokevirtual   #40  <Method boolean p.b(int)>
	//   37   75:pop             
			c = 0;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #18  <Field int c>
		}
		return true;
	//   41   81:iconst_1        
	//   42   82:ireturn         
	}

	public int b()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field p a>
	//*   2    4:ifnull          15
			return a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field p a>
	//    5   11:invokevirtual   #45  <Method int p.b()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	protected void b(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		coordinatorlayout.a(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #50  <Method void CoordinatorLayout.a(View, int)>
	//    4    6:return          
	}

	private p a;
	private int b;
	private int c;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.support.v4.view.ViewCompat;
import android.view.View;

public class ab
{

	public ab(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View a>
	//    5    9:return          
	}

	private void d()
	{
		ViewCompat.offsetTopAndBottom(a, e - (a.getTop() - d));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int e>
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field View a>
	//    6   12:invokevirtual   #27  <Method int View.getTop()>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field int d>
	//    9   19:isub            
	//   10   20:isub            
	//   11   21:invokestatic    #35  <Method void ViewCompat.offsetTopAndBottom(View, int)>
		ViewCompat.offsetLeftAndRight(a, c - (a.getLeft() - b));
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field View a>
	//   14   28:aload_0         
	//   15   29:getfield        #37  <Field int c>
	//   16   32:aload_0         
	//   17   33:getfield        #18  <Field View a>
	//   18   36:invokevirtual   #40  <Method int View.getLeft()>
	//   19   39:aload_0         
	//   20   40:getfield        #42  <Field int b>
	//   21   43:isub            
	//   22   44:isub            
	//   23   45:invokestatic    #45  <Method void ViewCompat.offsetLeftAndRight(View, int)>
	//   24   48:return          
	}

	public void a()
	{
		d = a.getTop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field View a>
	//    3    5:invokevirtual   #27  <Method int View.getTop()>
	//    4    8:putfield        #29  <Field int d>
		b = a.getLeft();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field View a>
	//    8   16:invokevirtual   #40  <Method int View.getLeft()>
	//    9   19:putfield        #42  <Field int b>
		d();
	//   10   22:aload_0         
	//   11   23:invokespecial   #47  <Method void d()>
	//   12   26:return          
	}

	public int b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int d>
	//    2    4:ireturn         
	}

	public boolean b(int i)
	{
		if(e != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field int e>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			e = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #21  <Field int e>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #47  <Method void d()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public int c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int e>
	//    2    4:ireturn         
	}

	public boolean d(int i)
	{
		if(c != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int c>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			c = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #37  <Field int c>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #47  <Method void d()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public int e()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int c>
	//    2    4:ireturn         
	}

	private final View a;
	private int b;
	private int c;
	private int d;
	private int e;
}

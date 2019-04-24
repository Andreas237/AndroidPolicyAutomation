// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ah

static final class ah$2 extends ah
{

	public int a(View view)
	{
		lerView.LayoutParams layoutparams = (lerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.i(view) - layoutparams.topMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method int RecyclerView$h.i(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #35  <Field int RecyclerView$LayoutParams.topMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public void a(int j)
	{
		a.j(j);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #39  <Method void RecyclerView$h.j(int)>
	//    4    8:return          
	}

	public int b(View view)
	{
		lerView.LayoutParams layoutparams = (lerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.k(view) + layoutparams.bottomMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #42  <Method int RecyclerView$h.k(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #45  <Field int RecyclerView$LayoutParams.bottomMargin>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	public int c()
	{
		return a.A();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #50  <Method int RecyclerView$h.A()>
	//    3    7:ireturn         
	}

	public int c(View view)
	{
		a.a(view, true, b);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field Rect b>
	//    6   10:invokevirtual   #56  <Method void RecyclerView$h.a(View, boolean, Rect)>
		return b.bottom;
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field Rect b>
	//    9   17:getfield        #61  <Field int Rect.bottom>
	//   10   20:ireturn         
	}

	public int d()
	{
		return a.y() - a.C();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RecyclerView$h a>
	//    5   11:invokevirtual   #68  <Method int RecyclerView$h.C()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public int d(View view)
	{
		a.a(view, true, b);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field Rect b>
	//    6   10:invokevirtual   #56  <Method void RecyclerView$h.a(View, boolean, Rect)>
		return b.top;
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field Rect b>
	//    9   17:getfield        #71  <Field int Rect.top>
	//   10   20:ireturn         
	}

	public int e()
	{
		return a.y();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
	//    3    7:ireturn         
	}

	public int e(View view)
	{
		lerView.LayoutParams layoutparams = (lerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.g(view) + layoutparams.topMargin + layoutparams.bottomMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #75  <Method int RecyclerView$h.g(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #35  <Field int RecyclerView$LayoutParams.topMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #45  <Field int RecyclerView$LayoutParams.bottomMargin>
	//   13   25:iadd            
	//   14   26:ireturn         
	}

	public int f()
	{
		return a.y() - a.A() - a.C();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #65  <Method int RecyclerView$h.y()>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field RecyclerView$h a>
	//    5   11:invokevirtual   #50  <Method int RecyclerView$h.A()>
	//    6   14:isub            
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field RecyclerView$h a>
	//    9   19:invokevirtual   #68  <Method int RecyclerView$h.C()>
	//   10   22:isub            
	//   11   23:ireturn         
	}

	public int f(View view)
	{
		lerView.LayoutParams layoutparams = (lerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #23  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.f(view) + layoutparams.leftMargin + layoutparams.rightMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #78  <Method int RecyclerView$h.f(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #81  <Field int RecyclerView$LayoutParams.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #84  <Field int RecyclerView$LayoutParams.rightMargin>
	//   13   25:iadd            
	//   14   26:ireturn         
	}

	public int g()
	{
		return a.C();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #68  <Method int RecyclerView$h.C()>
	//    3    7:ireturn         
	}

	public int h()
	{
		return a.w();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #88  <Method int RecyclerView$h.w()>
	//    3    7:ireturn         
	}

	public int i()
	{
		return a.v();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #91  <Method int RecyclerView$h.v()>
	//    3    7:ireturn         
	}

	ah$2(lerView.h h1)
	{
		super(h1, ((ah$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #12  <Method void ah(RecyclerView$h, ah$1)>
	//    4    6:return          
	}
}

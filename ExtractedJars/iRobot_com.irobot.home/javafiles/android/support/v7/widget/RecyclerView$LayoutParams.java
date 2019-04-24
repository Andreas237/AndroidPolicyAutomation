// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$LayoutParams extends android.view.ms
{

	public boolean c()
	{
		return c.n();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RecyclerView$u c>
	//    2    4:invokevirtual   #48  <Method boolean RecyclerView$u.n()>
	//    3    7:ireturn         
	}

	public boolean d()
	{
		return c.q();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RecyclerView$u c>
	//    2    4:invokevirtual   #51  <Method boolean RecyclerView$u.q()>
	//    3    7:ireturn         
	}

	public boolean e()
	{
		return c.x();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RecyclerView$u c>
	//    2    4:invokevirtual   #54  <Method boolean RecyclerView$u.x()>
	//    3    7:ireturn         
	}

	public int f()
	{
		return c.d();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field RecyclerView$u c>
	//    2    4:invokevirtual   #57  <Method int RecyclerView$u.d()>
	//    3    7:ireturn         
	}

	RecyclerView.u c;
	final Rect d;
	boolean e;
	boolean f;

	public RecyclerView$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		d = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #20  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #23  <Method void Rect()>
	//    8   14:putfield        #25  <Field Rect d>
		e = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #27  <Field boolean e>
		f = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #29  <Field boolean f>
	//   15   27:return          
	}

	public RecyclerView$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		d = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #20  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #23  <Method void Rect()>
	//    8   14:putfield        #25  <Field Rect d>
		e = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #27  <Field boolean e>
		f = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #29  <Field boolean f>
	//   15   27:return          
	}

	public RecyclerView$LayoutParams(RecyclerView$LayoutParams recyclerview$layoutparams)
	{
		super(((android.view.ViewGroup.LayoutParams) (recyclerview$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		d = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #20  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void Rect()>
	//    7   13:putfield        #25  <Field Rect d>
		e = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #27  <Field boolean e>
		f = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #29  <Field boolean f>
	//   14   26:return          
	}

	public RecyclerView$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		d = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #20  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void Rect()>
	//    7   13:putfield        #25  <Field Rect d>
		e = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #27  <Field boolean e>
		f = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #29  <Field boolean f>
	//   14   26:return          
	}

	public RecyclerView$LayoutParams(android.view.ms ms)
	{
		super(ms);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		d = new Rect();
	//    3    5:aload_0         
	//    4    6:new             #20  <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #23  <Method void Rect()>
	//    7   13:putfield        #25  <Field Rect d>
		e = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #27  <Field boolean e>
		f = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #29  <Field boolean f>
	//   14   26:return          
	}
}

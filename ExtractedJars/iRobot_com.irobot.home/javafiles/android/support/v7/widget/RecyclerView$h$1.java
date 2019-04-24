// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$h$1
	implements bb.b
{

	public int a()
	{
		return a.z();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #25  <Method int RecyclerView$h.z()>
	//    3    7:ireturn         
	}

	public int a(View view)
	{
		utParams utparams = (utParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.h(view) - utparams.leftMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #36  <Method int RecyclerView$h.h(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #40  <Field int RecyclerView$LayoutParams.leftMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public View a(int i)
	{
		return a.h(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #43  <Method View RecyclerView$h.h(int)>
	//    4    8:areturn         
	}

	public int b()
	{
		return a.x() - a.B();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #47  <Method int RecyclerView$h.x()>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field RecyclerView$h a>
	//    5   11:invokevirtual   #50  <Method int RecyclerView$h.B()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public int b(View view)
	{
		utParams utparams = (utParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.j(view) + utparams.rightMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #53  <Method int RecyclerView$h.j(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #56  <Field int RecyclerView$LayoutParams.rightMargin>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	final RecyclerView.h a;

	RecyclerView$h$1(RecyclerView.h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RecyclerView$h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

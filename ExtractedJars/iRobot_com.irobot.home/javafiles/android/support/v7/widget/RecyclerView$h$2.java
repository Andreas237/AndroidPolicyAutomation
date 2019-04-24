// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$h$2
	implements bb.b
{

	public int a()
	{
		return a.A();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #25  <Method int RecyclerView$h.A()>
	//    3    7:ireturn         
	}

	public int a(View view)
	{
		utParams utparams = (utParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #34  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return a.i(view) - utparams.topMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method int RecyclerView$h.i(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #41  <Field int RecyclerView$LayoutParams.topMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public View a(int i)
	{
		return a.h(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #44  <Method View RecyclerView$h.h(int)>
	//    4    8:areturn         
	}

	public int b()
	{
		return a.y() - a.C();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$h a>
	//    2    4:invokevirtual   #48  <Method int RecyclerView$h.y()>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field RecyclerView$h a>
	//    5   11:invokevirtual   #51  <Method int RecyclerView$h.C()>
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
		return a.k(view) + utparams.bottomMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$h a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #54  <Method int RecyclerView$h.k(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #57  <Field int RecyclerView$LayoutParams.bottomMargin>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	final RecyclerView.h a;

	RecyclerView$h$2(RecyclerView.h h1)
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

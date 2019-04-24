// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.s;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, e

private class RecyclerView$p extends RecyclerView$c
{

	public void a()
	{
		a.a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView a>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #20  <Method void RecyclerView.a(String)>
		a.B.e = true;
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field RecyclerView a>
	//    6   12:getfield        #24  <Field RecyclerView$r RecyclerView.B>
	//    7   15:iconst_1        
	//    8   16:putfield        #30  <Field boolean RecyclerView$r.e>
		a.u();
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field RecyclerView a>
	//   11   23:invokevirtual   #33  <Method void RecyclerView.u()>
		if(!a.e.d())
	//*  12   26:aload_0         
	//*  13   27:getfield        #13  <Field RecyclerView a>
	//*  14   30:getfield        #36  <Field e RecyclerView.e>
	//*  15   33:invokevirtual   #42  <Method boolean e.d()>
	//*  16   36:ifne            46
			a.requestLayout();
	//   17   39:aload_0         
	//   18   40:getfield        #13  <Field RecyclerView a>
	//   19   43:invokevirtual   #45  <Method void RecyclerView.requestLayout()>
	//   20   46:return          
	}

	public void a(int i, int j, Object obj)
	{
		a.a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView a>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #20  <Method void RecyclerView.a(String)>
		if(a.e.a(i, j, obj))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView a>
	//*   6   12:getfield        #36  <Field e RecyclerView.e>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #49  <Method boolean e.a(int, int, Object)>
	//*  11   21:ifeq            28
			b();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #52  <Method void b()>
	//   14   28:return          
	}

	void b()
	{
		if(RecyclerView.c && a.q && a.p)
	//*   0    0:getstatic       #55  <Field boolean RecyclerView.c>
	//*   1    3:ifeq            41
	//*   2    6:aload_0         
	//*   3    7:getfield        #13  <Field RecyclerView a>
	//*   4   10:getfield        #58  <Field boolean RecyclerView.q>
	//*   5   13:ifeq            41
	//*   6   16:aload_0         
	//*   7   17:getfield        #13  <Field RecyclerView a>
	//*   8   20:getfield        #60  <Field boolean RecyclerView.p>
	//*   9   23:ifeq            41
		{
			s.a(((android.view.View) (a)), a.i);
	//   10   26:aload_0         
	//   11   27:getfield        #13  <Field RecyclerView a>
	//   12   30:aload_0         
	//   13   31:getfield        #13  <Field RecyclerView a>
	//   14   34:getfield        #64  <Field Runnable RecyclerView.i>
	//   15   37:invokestatic    #69  <Method void s.a(android.view.View, Runnable)>
			return;
	//   16   40:return          
		} else
		{
			a.v = true;
	//   17   41:aload_0         
	//   18   42:getfield        #13  <Field RecyclerView a>
	//   19   45:iconst_1        
	//   20   46:putfield        #72  <Field boolean RecyclerView.v>
			a.requestLayout();
	//   21   49:aload_0         
	//   22   50:getfield        #13  <Field RecyclerView a>
	//   23   53:invokevirtual   #45  <Method void RecyclerView.requestLayout()>
			return;
	//   24   56:return          
		}
	}

	public void b(int i, int j)
	{
		a.a(((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field RecyclerView a>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #20  <Method void RecyclerView.a(String)>
		if(a.e.b(i, j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #13  <Field RecyclerView a>
	//*   6   12:getfield        #36  <Field e RecyclerView.e>
	//*   7   15:iload_1         
	//*   8   16:iload_2         
	//*   9   17:invokevirtual   #76  <Method boolean e.b(int, int)>
	//*  10   20:ifeq            27
			b();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #52  <Method void b()>
	//   13   27:return          
	}

	final RecyclerView a;

	RecyclerView$p(RecyclerView recyclerview)
	{
		a = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RecyclerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void RecyclerView$c()>
	//    5    9:return          
	}
}

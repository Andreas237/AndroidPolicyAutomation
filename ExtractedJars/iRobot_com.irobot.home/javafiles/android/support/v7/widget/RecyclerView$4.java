// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$4
	implements bc.b
{

	public void a(RecyclerView$u recyclerview$u)
	{
		a.m.a(recyclerview$u.a, a.d);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView a>
	//    2    4:getfield        #23  <Field RecyclerView$h RecyclerView.m>
	//    3    7:aload_1         
	//    4    8:getfield        #28  <Field android.view.View RecyclerView$u.a>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field RecyclerView a>
	//    7   15:getfield        #32  <Field RecyclerView$n RecyclerView.d>
	//    8   18:invokevirtual   #37  <Method void RecyclerView$h.a(android.view.View, RecyclerView$n)>
	//    9   21:return          
	}

	public void a(RecyclerView$u recyclerview$u, c c1, c c2)
	{
		a.d.c(recyclerview$u);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView a>
	//    2    4:getfield        #32  <Field RecyclerView$n RecyclerView.d>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #43  <Method void RecyclerView$n.c(RecyclerView$u)>
		a.b(recyclerview$u, c1, c2);
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field RecyclerView a>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #46  <Method void RecyclerView.b(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//   11   21:return          
	}

	public void b(RecyclerView$u recyclerview$u, c c1, c c2)
	{
		a.a(recyclerview$u, c1, c2);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RecyclerView a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #48  <Method void RecyclerView.a(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//    6   10:return          
	}

	public void c(RecyclerView$u recyclerview$u, c c1, c c2)
	{
		recyclerview$u.a(false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #51  <Method void RecyclerView$u.a(boolean)>
		if(a.w ? a.x.a(recyclerview$u, recyclerview$u, c1, c2) : a.x.c(recyclerview$u, c1, c2))
	//*   3    5:aload_0         
	//*   4    6:getfield        #14  <Field RecyclerView a>
	//*   5    9:getfield        #55  <Field boolean RecyclerView.w>
	//*   6   12:ifeq            40
	//*   7   15:aload_0         
	//*   8   16:getfield        #14  <Field RecyclerView a>
	//*   9   19:getfield        #59  <Field RecyclerView$e RecyclerView.x>
	//*  10   22:aload_1         
	//*  11   23:aload_1         
	//*  12   24:aload_2         
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #64  <Method boolean RecyclerView$e.a(RecyclerView$u, RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//*  15   29:ifeq            59
		{
			a.p();
	//   16   32:aload_0         
	//   17   33:getfield        #14  <Field RecyclerView a>
	//   18   36:invokevirtual   #67  <Method void RecyclerView.p()>
			return;
	//   19   39:return          
		} else
	//*  20   40:aload_0         
	//*  21   41:getfield        #14  <Field RecyclerView a>
	//*  22   44:getfield        #59  <Field RecyclerView$e RecyclerView.x>
	//*  23   47:aload_1         
	//*  24   48:aload_2         
	//*  25   49:aload_3         
	//*  26   50:invokevirtual   #70  <Method boolean RecyclerView$e.c(RecyclerView$u, RecyclerView$e$c, RecyclerView$e$c)>
	//*  27   53:ifeq            59
	//*  28   56:goto            32
		{
			return;
	//   29   59:return          
		}
	}

	final RecyclerView a;

	RecyclerView$4(RecyclerView recyclerview)
	{
		a = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RecyclerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}

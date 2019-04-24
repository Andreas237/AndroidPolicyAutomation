// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView, t

class RecyclerView$6
	implements e.a
{

	public RecyclerView$u a(int i)
	{
		RecyclerView$u recyclerview$u = a.a(i, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #24  <Method RecyclerView$u RecyclerView.a(int, boolean)>
	//    5    9:astore_2        
		if(recyclerview$u == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		if(a.f.c(recyclerview$u.a))
	//*  10   16:aload_0         
	//*  11   17:getfield        #17  <Field RecyclerView a>
	//*  12   20:getfield        #28  <Field t RecyclerView.f>
	//*  13   23:aload_2         
	//*  14   24:getfield        #33  <Field android.view.View RecyclerView$u.a>
	//*  15   27:invokevirtual   #39  <Method boolean t.c(android.view.View)>
	//*  16   30:ifeq            35
			return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
		else
			return recyclerview$u;
	//   19   35:aload_2         
	//   20   36:areturn         
	}

	public void a(int i, int j)
	{
		a.a(i, j, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #43  <Method void RecyclerView.a(int, int, boolean)>
		a.C = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView a>
	//    8   14:iconst_1        
	//    9   15:putfield        #47  <Field boolean RecyclerView.C>
		RecyclerView$r recyclerview$r = a.B;
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field RecyclerView a>
	//   12   22:getfield        #51  <Field RecyclerView$r RecyclerView.B>
	//   13   25:astore_3        
		recyclerview$r.b = recyclerview$r.b + j;
	//   14   26:aload_3         
	//   15   27:aload_3         
	//   16   28:getfield        #56  <Field int RecyclerView$r.b>
	//   17   31:iload_2         
	//   18   32:iadd            
	//   19   33:putfield        #56  <Field int RecyclerView$r.b>
	//   20   36:return          
	}

	public void a(int i, int j, Object obj)
	{
		a.a(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #59  <Method void RecyclerView.a(int, int, Object)>
		a.D = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView a>
	//    8   14:iconst_1        
	//    9   15:putfield        #62  <Field boolean RecyclerView.D>
	//   10   18:return          
	}

	public void a(e.b b1)
	{
		c(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method void c(e$b)>
	//    3    5:return          
	}

	public void b(int i, int j)
	{
		a.a(i, j, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #43  <Method void RecyclerView.a(int, int, boolean)>
		a.C = true;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView a>
	//    8   14:iconst_1        
	//    9   15:putfield        #47  <Field boolean RecyclerView.C>
	//   10   18:return          
	}

	public void b(e.b b1)
	{
		c(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method void c(e$b)>
	//    3    5:return          
	}

	public void c(int i, int j)
	{
		a.g(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #68  <Method void RecyclerView.g(int, int)>
		a.C = true;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field RecyclerView a>
	//    7   13:iconst_1        
	//    8   14:putfield        #47  <Field boolean RecyclerView.C>
	//    9   17:return          
	}

	void c(e.b b1)
	{
		int i = b1.a;
	//    0    0:aload_1         
	//    1    1:getfield        #72  <Field int e$b.a>
	//    2    4:istore_2        
		if(i != 4)
	//*   3    5:iload_2         
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          111
		{
			if(i != 8)
	//*   6   10:iload_2         
	//*   7   11:bipush          8
	//*   8   13:icmpeq          87
			{
				switch(i)
	//*   9   16:iload_2         
				{
	//*  10   17:tableswitch     1 2: default 40
	//	               1 64
	//	               2 41
				default:
					return;
	//   11   40:return          

				case 2: // '\002'
					a.m.b(a, b1.b, b1.d);
	//   12   41:aload_0         
	//   13   42:getfield        #17  <Field RecyclerView a>
	//   14   45:getfield        #76  <Field RecyclerView$h RecyclerView.m>
	//   15   48:aload_0         
	//   16   49:getfield        #17  <Field RecyclerView a>
	//   17   52:aload_1         
	//   18   53:getfield        #77  <Field int e$b.b>
	//   19   56:aload_1         
	//   20   57:getfield        #80  <Field int e$b.d>
	//   21   60:invokevirtual   #85  <Method void RecyclerView$h.b(RecyclerView, int, int)>
					return;
	//   22   63:return          

				case 1: // '\001'
					a.m.a(a, b1.b, b1.d);
	//   23   64:aload_0         
	//   24   65:getfield        #17  <Field RecyclerView a>
	//   25   68:getfield        #76  <Field RecyclerView$h RecyclerView.m>
	//   26   71:aload_0         
	//   27   72:getfield        #17  <Field RecyclerView a>
	//   28   75:aload_1         
	//   29   76:getfield        #77  <Field int e$b.b>
	//   30   79:aload_1         
	//   31   80:getfield        #80  <Field int e$b.d>
	//   32   83:invokevirtual   #87  <Method void RecyclerView$h.a(RecyclerView, int, int)>
					return;
	//   33   86:return          
				}
			} else
			{
				a.m.a(a, b1.b, b1.d, 1);
	//   34   87:aload_0         
	//   35   88:getfield        #17  <Field RecyclerView a>
	//   36   91:getfield        #76  <Field RecyclerView$h RecyclerView.m>
	//   37   94:aload_0         
	//   38   95:getfield        #17  <Field RecyclerView a>
	//   39   98:aload_1         
	//   40   99:getfield        #77  <Field int e$b.b>
	//   41  102:aload_1         
	//   42  103:getfield        #80  <Field int e$b.d>
	//   43  106:iconst_1        
	//   44  107:invokevirtual   #90  <Method void RecyclerView$h.a(RecyclerView, int, int, int)>
				return;
	//   45  110:return          
			}
		} else
		{
			a.m.a(a, b1.b, b1.d, b1.c);
	//   46  111:aload_0         
	//   47  112:getfield        #17  <Field RecyclerView a>
	//   48  115:getfield        #76  <Field RecyclerView$h RecyclerView.m>
	//   49  118:aload_0         
	//   50  119:getfield        #17  <Field RecyclerView a>
	//   51  122:aload_1         
	//   52  123:getfield        #77  <Field int e$b.b>
	//   53  126:aload_1         
	//   54  127:getfield        #80  <Field int e$b.d>
	//   55  130:aload_1         
	//   56  131:getfield        #93  <Field Object e$b.c>
	//   57  134:invokevirtual   #96  <Method void RecyclerView$h.a(RecyclerView, int, int, Object)>
			return;
	//   58  137:return          
		}
	}

	public void d(int i, int j)
	{
		a.f(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #98  <Method void RecyclerView.f(int, int)>
		a.C = true;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field RecyclerView a>
	//    7   13:iconst_1        
	//    8   14:putfield        #47  <Field boolean RecyclerView.C>
	//    9   17:return          
	}

	final RecyclerView a;

	RecyclerView$6(RecyclerView recyclerview)
	{
		a = recyclerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RecyclerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

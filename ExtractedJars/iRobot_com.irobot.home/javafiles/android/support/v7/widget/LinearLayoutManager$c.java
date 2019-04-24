// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager

static class LinearLayoutManager$c
{

	private View b()
	{
		int j1 = k.size();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List k>
	//    2    4:invokeinterface #42  <Method int List.size()>
	//    3    9:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          80
		{
			View view = ((RecyclerView.u)k.get(i1)).a;
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field List k>
	//   11   21:iload_1         
	//   12   22:invokeinterface #46  <Method Object List.get(int)>
	//   13   27:checkcast       #48  <Class RecyclerView$u>
	//   14   30:getfield        #51  <Field View RecyclerView$u.a>
	//   15   33:astore_3        
			ams ams = (ams)view.getLayoutParams();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   38:checkcast       #59  <Class RecyclerView$LayoutParams>
	//   19   41:astore          4
			if(!ams.d() && d == ams.f())
	//*  20   43:aload           4
	//*  21   45:invokevirtual   #62  <Method boolean RecyclerView$LayoutParams.d()>
	//*  22   48:ifeq            54
	//*  23   51:goto            73
	//*  24   54:aload_0         
	//*  25   55:getfield        #64  <Field int d>
	//*  26   58:aload           4
	//*  27   60:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
	//*  28   63:icmpne          73
			{
				a(view);
	//   29   66:aload_0         
	//   30   67:aload_3         
	//   31   68:invokevirtual   #69  <Method void a(View)>
				return view;
	//   32   71:aload_3         
	//   33   72:areturn         
			}
		}

	//   34   73:iload_1         
	//   35   74:iconst_1        
	//   36   75:iadd            
	//   37   76:istore_1        
	//*  38   77:goto            12
		return null;
	//   39   80:aconst_null     
	//   40   81:areturn         
	}

	View a(RecyclerView.n n)
	{
		if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field List k>
	//*   2    4:ifnull          12
		{
			return b();
	//    3    7:aload_0         
	//    4    8:invokespecial   #72  <Method View b()>
	//    5   11:areturn         
		} else
		{
			n = ((RecyclerView.n) (n.c(d)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field int d>
	//    9   17:invokevirtual   #77  <Method View RecyclerView$n.c(int)>
	//   10   20:astore_1        
			d = d + e;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #64  <Field int d>
	//   14   26:aload_0         
	//   15   27:getfield        #79  <Field int e>
	//   16   30:iadd            
	//   17   31:putfield        #64  <Field int d>
			return ((View) (n));
	//   18   34:aload_1         
	//   19   35:areturn         
		}
	}

	public void a()
	{
		a(((View) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #69  <Method void a(View)>
	//    3    5:return          
	}

	public void a(View view)
	{
		view = b(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method View b(View)>
	//    3    5:astore_1        
		int i1;
		if(view == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       18
			i1 = -1;
	//    6   10:iconst_m1       
	//    7   11:istore_2        
		else
	//*   8   12:aload_0         
	//*   9   13:iload_2         
	//*  10   14:putfield        #64  <Field int d>
	//*  11   17:return          
			i1 = ((ams)view.getLayoutParams()).f();
	//   12   18:aload_1         
	//   13   19:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   14   22:checkcast       #59  <Class RecyclerView$LayoutParams>
	//   15   25:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
	//   16   28:istore_2        
		d = i1;
	//*  17   29:goto            12
	}

	boolean a(RecyclerView.r r)
	{
		return d >= 0 && d < r.e();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int d>
	//    2    4:iflt            20
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field int d>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #87  <Method int RecyclerView$r.e()>
	//    7   15:icmpge          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public View b(View view)
	{
		int i2 = k.size();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List k>
	//    2    4:invokeinterface #42  <Method int List.size()>
	//    3    9:istore          6
		View view1 = null;
	//    4   11:aconst_null     
	//    5   12:astore          7
		int j1 = 0x7fffffff;
	//    6   14:ldc1            #88  <Int 0x7fffffff>
	//    7   16:istore_3        
		for(int i1 = 0; i1 < i2;)
	//*   8   17:iconst_0        
	//*   9   18:istore_2        
	//*  10   19:iload_2         
	//*  11   20:iload           6
	//*  12   22:icmpge          159
		{
			View view3 = ((RecyclerView.u)k.get(i1)).a;
	//   13   25:aload_0         
	//   14   26:getfield        #34  <Field List k>
	//   15   29:iload_2         
	//   16   30:invokeinterface #46  <Method Object List.get(int)>
	//   17   35:checkcast       #48  <Class RecyclerView$u>
	//   18   38:getfield        #51  <Field View RecyclerView$u.a>
	//   19   41:astore          9
			ams ams = (ams)view3.getLayoutParams();
	//   20   43:aload           9
	//   21   45:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   48:checkcast       #59  <Class RecyclerView$LayoutParams>
	//   23   51:astore          10
			View view2 = view1;
	//   24   53:aload           7
	//   25   55:astore          8
			int k1 = j1;
	//   26   57:iload_3         
	//   27   58:istore          4
			if(view3 != view)
	//*  28   60:aload           9
	//*  29   62:aload_1         
	//*  30   63:if_acmpeq       145
				if(ams.d())
	//*  31   66:aload           10
	//*  32   68:invokevirtual   #62  <Method boolean RecyclerView$LayoutParams.d()>
	//*  33   71:ifeq            84
				{
					view2 = view1;
	//   34   74:aload           7
	//   35   76:astore          8
					k1 = j1;
	//   36   78:iload_3         
	//   37   79:istore          4
				} else
	//*  38   81:goto            145
				{
					int l1 = (ams.f() - d) * e;
	//   39   84:aload           10
	//   40   86:invokevirtual   #66  <Method int RecyclerView$LayoutParams.f()>
	//   41   89:aload_0         
	//   42   90:getfield        #64  <Field int d>
	//   43   93:isub            
	//   44   94:aload_0         
	//   45   95:getfield        #79  <Field int e>
	//   46   98:imul            
	//   47   99:istore          5
					if(l1 < 0)
	//*  48  101:iload           5
	//*  49  103:ifge            116
					{
						view2 = view1;
	//   50  106:aload           7
	//   51  108:astore          8
						k1 = j1;
	//   52  110:iload_3         
	//   53  111:istore          4
					} else
	//*  54  113:goto            145
					{
						view2 = view1;
	//   55  116:aload           7
	//   56  118:astore          8
						k1 = j1;
	//   57  120:iload_3         
	//   58  121:istore          4
						if(l1 < j1)
	//*  59  123:iload           5
	//*  60  125:iload_3         
	//*  61  126:icmpge          145
						{
							if(l1 == 0)
	//*  62  129:iload           5
	//*  63  131:ifne            137
								return view3;
	//   64  134:aload           9
	//   65  136:areturn         
							view2 = view3;
	//   66  137:aload           9
	//   67  139:astore          8
							k1 = l1;
	//   68  141:iload           5
	//   69  143:istore          4
						}
					}
				}
			i1++;
	//   70  145:iload_2         
	//   71  146:iconst_1        
	//   72  147:iadd            
	//   73  148:istore_2        
			view1 = view2;
	//   74  149:aload           8
	//   75  151:astore          7
			j1 = k1;
	//   76  153:iload           4
	//   77  155:istore_3        
		}

	//*  78  156:goto            19
		return view1;
	//   79  159:aload           7
	//   80  161:areturn         
	}

	boolean a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int h;
	boolean i;
	int j;
	List k;
	boolean l;

	LinearLayoutManager$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #28  <Field boolean a>
		h = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #30  <Field int h>
		i = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #32  <Field boolean i>
		k = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #34  <Field List k>
	//   14   24:return          
	}
}

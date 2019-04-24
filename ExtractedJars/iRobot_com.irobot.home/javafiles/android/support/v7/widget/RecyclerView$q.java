// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$q
{
	public static class a
	{

		private void b()
		{
			if(e != null && c < 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Interpolator e>
		//*   2    4:ifnull          25
		//*   3    7:aload_0         
		//*   4    8:getfield        #24  <Field int c>
		//*   5   11:iconst_1        
		//*   6   12:icmpge          25
				throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
		//    7   15:new             #26  <Class IllegalStateException>
		//    8   18:dup             
		//    9   19:ldc1            #28  <String "If you provide an interpolator, you must set a positive duration">
		//   10   21:invokespecial   #32  <Method void IllegalStateException(String)>
		//   11   24:athrow          
			if(c < 1)
		//*  12   25:aload_0         
		//*  13   26:getfield        #24  <Field int c>
		//*  14   29:iconst_1        
		//*  15   30:icmpge          43
				throw new IllegalStateException("Scroll duration must be a positive number");
		//   16   33:new             #26  <Class IllegalStateException>
		//   17   36:dup             
		//   18   37:ldc1            #34  <String "Scroll duration must be a positive number">
		//   19   39:invokespecial   #32  <Method void IllegalStateException(String)>
		//   20   42:athrow          
			else
				return;
		//   21   43:return          
		}

		void a(RecyclerView recyclerview)
		{
			if(d >= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field int d>
		//*   2    4:iflt            28
			{
				int i = d;
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field int d>
		//    5   11:istore_2        
				d = -1;
		//    6   12:aload_0         
		//    7   13:iconst_m1       
		//    8   14:putfield        #38  <Field int d>
				recyclerview.b(i);
		//    9   17:aload_1         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #41  <Method void RecyclerView.b(int)>
				f = false;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #43  <Field boolean f>
				return;
		//   15   27:return          
			}
			if(f)
		//*  16   28:aload_0         
		//*  17   29:getfield        #43  <Field boolean f>
		//*  18   32:ifeq            151
			{
				b();
		//   19   35:aload_0         
		//   20   36:invokespecial   #45  <Method void b()>
				if(e == null)
		//*  21   39:aload_0         
		//*  22   40:getfield        #22  <Field Interpolator e>
		//*  23   43:ifnonnull       95
				{
					if(c == 0x80000000)
		//*  24   46:aload_0         
		//*  25   47:getfield        #24  <Field int c>
		//*  26   50:ldc1            #46  <Int 0x80000000>
		//*  27   52:icmpne          73
						recyclerview.y.b(a, b);
		//   28   55:aload_1         
		//   29   56:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   30   59:aload_0         
		//   31   60:getfield        #52  <Field int a>
		//   32   63:aload_0         
		//   33   64:getfield        #54  <Field int b>
		//   34   67:invokevirtual   #59  <Method void RecyclerView$t.b(int, int)>
					else
		//*  35   70:goto            118
						recyclerview.y.a(a, b, c);
		//   36   73:aload_1         
		//   37   74:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   38   77:aload_0         
		//   39   78:getfield        #52  <Field int a>
		//   40   81:aload_0         
		//   41   82:getfield        #54  <Field int b>
		//   42   85:aload_0         
		//   43   86:getfield        #24  <Field int c>
		//   44   89:invokevirtual   #62  <Method void RecyclerView$t.a(int, int, int)>
				} else
		//*  45   92:goto            118
				{
					recyclerview.y.a(a, b, c, e);
		//   46   95:aload_1         
		//   47   96:getfield        #50  <Field RecyclerView$t RecyclerView.y>
		//   48   99:aload_0         
		//   49  100:getfield        #52  <Field int a>
		//   50  103:aload_0         
		//   51  104:getfield        #54  <Field int b>
		//   52  107:aload_0         
		//   53  108:getfield        #24  <Field int c>
		//   54  111:aload_0         
		//   55  112:getfield        #22  <Field Interpolator e>
		//   56  115:invokevirtual   #65  <Method void RecyclerView$t.a(int, int, int, Interpolator)>
				}
				g = g + 1;
		//   57  118:aload_0         
		//   58  119:aload_0         
		//   59  120:getfield        #67  <Field int g>
		//   60  123:iconst_1        
		//   61  124:iadd            
		//   62  125:putfield        #67  <Field int g>
				if(g > 10)
		//*  63  128:aload_0         
		//*  64  129:getfield        #67  <Field int g>
		//*  65  132:bipush          10
		//*  66  134:icmple          145
					Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
		//   67  137:ldc1            #69  <String "RecyclerView">
		//   68  139:ldc1            #71  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
		//   69  141:invokestatic    #76  <Method int Log.e(String, String)>
		//   70  144:pop             
				f = false;
		//   71  145:aload_0         
		//   72  146:iconst_0        
		//   73  147:putfield        #43  <Field boolean f>
				return;
		//   74  150:return          
			} else
			{
				g = 0;
		//   75  151:aload_0         
		//   76  152:iconst_0        
		//   77  153:putfield        #67  <Field int g>
				return;
		//   78  156:return          
			}
		}

		boolean a()
		{
			return d >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int d>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		private int a;
		private int b;
		private int c;
		private int d;
		private Interpolator e;
		private boolean f;
		private int g;
	}


	private void a(int i, int j)
	{
		RecyclerView recyclerview = b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView b>
	//    2    4:astore          4
		if(!e || a == -1 || recyclerview == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #27  <Field boolean e>
	//*   5   10:ifeq            26
	//*   6   13:aload_0         
	//*   7   14:getfield        #29  <Field int a>
	//*   8   17:iconst_m1       
	//*   9   18:icmpeq          26
	//*  10   21:aload           4
	//*  11   23:ifnonnull       30
			a();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #32  <Method void a()>
		d = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #34  <Field boolean d>
		if(f != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #36  <Field View f>
	//*  19   39:ifnull          103
			if(a(f) == a)
	//*  20   42:aload_0         
	//*  21   43:aload_0         
	//*  22   44:getfield        #36  <Field View f>
	//*  23   47:invokevirtual   #39  <Method int a(View)>
	//*  24   50:aload_0         
	//*  25   51:getfield        #29  <Field int a>
	//*  26   54:icmpne          90
			{
				a(f, recyclerview.B, g);
	//   27   57:aload_0         
	//   28   58:aload_0         
	//   29   59:getfield        #36  <Field View f>
	//   30   62:aload           4
	//   31   64:getfield        #43  <Field RecyclerView$r RecyclerView.B>
	//   32   67:aload_0         
	//   33   68:getfield        #45  <Field RecyclerView$q$a g>
	//   34   71:invokevirtual   #48  <Method void a(View, RecyclerView$r, RecyclerView$q$a)>
				g.a(recyclerview);
	//   35   74:aload_0         
	//   36   75:getfield        #45  <Field RecyclerView$q$a g>
	//   37   78:aload           4
	//   38   80:invokevirtual   #51  <Method void RecyclerView$q$a.a(RecyclerView)>
				a();
	//   39   83:aload_0         
	//   40   84:invokevirtual   #32  <Method void a()>
			} else
	//*  41   87:goto            103
			{
				Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
	//   42   90:ldc1            #53  <String "RecyclerView">
	//   43   92:ldc1            #55  <String "Passed over target position while smooth scrolling.">
	//   44   94:invokestatic    #60  <Method int Log.e(String, String)>
	//   45   97:pop             
				f = null;
	//   46   98:aload_0         
	//   47   99:aconst_null     
	//   48  100:putfield        #36  <Field View f>
			}
		if(e)
	//*  49  103:aload_0         
	//*  50  104:getfield        #27  <Field boolean e>
	//*  51  107:ifeq            171
		{
			a(i, j, recyclerview.B, g);
	//   52  110:aload_0         
	//   53  111:iload_1         
	//   54  112:iload_2         
	//   55  113:aload           4
	//   56  115:getfield        #43  <Field RecyclerView$r RecyclerView.B>
	//   57  118:aload_0         
	//   58  119:getfield        #45  <Field RecyclerView$q$a g>
	//   59  122:invokevirtual   #63  <Method void a(int, int, RecyclerView$r, RecyclerView$q$a)>
			boolean flag = g.a();
	//   60  125:aload_0         
	//   61  126:getfield        #45  <Field RecyclerView$q$a g>
	//   62  129:invokevirtual   #66  <Method boolean RecyclerView$q$a.a()>
	//   63  132:istore_3        
			g.a(recyclerview);
	//   64  133:aload_0         
	//   65  134:getfield        #45  <Field RecyclerView$q$a g>
	//   66  137:aload           4
	//   67  139:invokevirtual   #51  <Method void RecyclerView$q$a.a(RecyclerView)>
			if(flag)
	//*  68  142:iload_3         
	//*  69  143:ifeq            171
			{
				if(e)
	//*  70  146:aload_0         
	//*  71  147:getfield        #27  <Field boolean e>
	//*  72  150:ifeq            167
				{
					d = true;
	//   73  153:aload_0         
	//   74  154:iconst_1        
	//   75  155:putfield        #34  <Field boolean d>
					recyclerview.y.a();
	//   76  158:aload           4
	//   77  160:getfield        #70  <Field RecyclerView$t RecyclerView.y>
	//   78  163:invokevirtual   #73  <Method void RecyclerView$t.a()>
					return;
	//   79  166:return          
				}
				a();
	//   80  167:aload_0         
	//   81  168:invokevirtual   #32  <Method void a()>
			}
		}
	//   82  171:return          
	}

	static void a(RecyclerView$q recyclerview$q, int i, int j)
	{
		recyclerview$q.a(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #77  <Method void a(int, int)>
	//    4    6:return          
	}

	public int a(View view)
	{
		return b.f(view);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method int RecyclerView.f(View)>
	//    4    8:ireturn         
	}

	protected final void a()
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean e>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			e();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #81  <Method void e()>
			RecyclerView$r.a(b.B, -1);
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field RecyclerView b>
	//    8   16:getfield        #43  <Field RecyclerView$r RecyclerView.B>
	//    9   19:iconst_m1       
	//   10   20:invokestatic    #86  <Method int RecyclerView$r.a(RecyclerView$r, int)>
	//   11   23:pop             
			f = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #36  <Field View f>
			a = -1;
	//   15   29:aload_0         
	//   16   30:iconst_m1       
	//   17   31:putfield        #29  <Field int a>
			d = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #34  <Field boolean d>
			e = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #27  <Field boolean e>
			RecyclerView$h.a(c, this);
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RecyclerView$h c>
	//   26   48:aload_0         
	//   27   49:invokestatic    #93  <Method void RecyclerView$h.a(RecyclerView$h, RecyclerView$q)>
			c = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #88  <Field RecyclerView$h c>
			b = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #25  <Field RecyclerView b>
			return;
	//   34   62:return          
		}
	}

	public void a(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int a>
	//    3    5:return          
	}

	protected abstract void a(int i, int j, RecyclerView$r recyclerview$r, a a1);

	protected abstract void a(View view, RecyclerView$r recyclerview$r, a a1);

	protected void b(View view)
	{
		if(a(view) == d())
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #39  <Method int a(View)>
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #98  <Method int d()>
	//*   5    9:icmpne          17
			f = view;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #36  <Field View f>
	//    9   17:return          
	}

	public boolean b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean e>
	//    2    4:ireturn         
	}

	public int d()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int a>
	//    2    4:ireturn         
	}

	protected abstract void e();

	private int a;
	private RecyclerView b;
	private RecyclerView$h c;
	private boolean d;
	private boolean e;
	private View f;
	private final a g;
}

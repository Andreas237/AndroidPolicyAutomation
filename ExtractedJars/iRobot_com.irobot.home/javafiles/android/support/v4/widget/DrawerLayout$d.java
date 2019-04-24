// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout, p

private class DrawerLayout$d extends p.a
{

	private void c()
	{
		int i = b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int b>
	//    2    4:istore_2        
		byte byte0 = 3;
	//    3    5:iconst_3        
	//    4    6:istore_1        
		if(i == 3)
	//*   5    7:iload_2         
	//*   6    8:iconst_3        
	//*   7    9:icmpne          14
			byte0 = 5;
	//    8   12:iconst_5        
	//    9   13:istore_1        
		View view = a.c(((int) (byte0)));
	//   10   14:aload_0         
	//   11   15:getfield        #20  <Field DrawerLayout a>
	//   12   18:iload_1         
	//   13   19:invokevirtual   #34  <Method View DrawerLayout.c(int)>
	//   14   22:astore_3        
		if(view != null)
	//*  15   23:aload_3         
	//*  16   24:ifnull          35
			a.i(view);
	//   17   27:aload_0         
	//   18   28:getfield        #20  <Field DrawerLayout a>
	//   19   31:aload_3         
	//   20   32:invokevirtual   #38  <Method void DrawerLayout.i(View)>
	//   21   35:return          
	}

	public int a(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public void a()
	{
		a.removeCallbacks(d);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DrawerLayout a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Runnable d>
	//    4    8:invokevirtual   #49  <Method boolean DrawerLayout.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void a(int i)
	{
		a.a(b, i, c.c());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DrawerLayout a>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int b>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field p c>
	//    7   13:invokevirtual   #57  <Method View p.c()>
	//    8   16:invokevirtual   #60  <Method void DrawerLayout.a(int, int, View)>
	//    9   19:return          
	}

	public void a(int i, int j)
	{
		a.postDelayed(d, 160L);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DrawerLayout a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Runnable d>
	//    4    8:ldc2w           #62  <Long 160L>
	//    5   11:invokevirtual   #67  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void a(p p1)
	{
		c = p1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field p c>
	//    3    5:return          
	}

	public void a(View view, float f, float f1)
	{
		int i;
label0:
		{
			f1 = a.d(view);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DrawerLayout a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method float DrawerLayout.d(View)>
	//    4    8:fstore_3        
			int k = view.getWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #75  <Method int View.getWidth()>
	//    7   13:istore          6
			if(a.a(view, 3))
	//*   8   15:aload_0         
	//*   9   16:getfield        #20  <Field DrawerLayout a>
	//*  10   19:aload_1         
	//*  11   20:iconst_3        
	//*  12   21:invokevirtual   #78  <Method boolean DrawerLayout.a(View, int)>
	//*  13   24:ifeq            66
			{
				i = f != 0.0F;
	//   14   27:fload_2         
	//   15   28:fconst_0        
	//   16   29:fcmpl           
	//   17   30:istore          4
				if(i <= 0 && (i != 0 || f1 <= 0.5F))
	//*  18   32:iload           4
	//*  19   34:ifgt            60
	//*  20   37:iload           4
	//*  21   39:ifne            52
	//*  22   42:fload_3         
	//*  23   43:ldc1            #79  <Float 0.5F>
	//*  24   45:fcmpl           
	//*  25   46:ifle            52
	//*  26   49:goto            60
					i = -k;
	//   27   52:iload           6
	//   28   54:ineg            
	//   29   55:istore          4
				else
	//*  30   57:goto            109
					i = 0;
	//   31   60:iconst_0        
	//   32   61:istore          4
				break label0;
	//   33   63:goto            109
			}
			int j = a.getWidth();
	//   34   66:aload_0         
	//   35   67:getfield        #20  <Field DrawerLayout a>
	//   36   70:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
	//   37   73:istore          5
			if(f >= 0.0F)
	//*  38   75:fload_2         
	//*  39   76:fconst_0        
	//*  40   77:fcmpg           
	//*  41   78:iflt            102
			{
				i = j;
	//   42   81:iload           5
	//   43   83:istore          4
				if(f != 0.0F)
					break label0;
	//   44   85:fload_2         
	//   45   86:fconst_0        
	//   46   87:fcmpl           
	//   47   88:ifne            109
				i = j;
	//   48   91:iload           5
	//   49   93:istore          4
				if(f1 <= 0.5F)
					break label0;
	//   50   95:fload_3         
	//   51   96:ldc1            #79  <Float 0.5F>
	//   52   98:fcmpl           
	//   53   99:ifle            109
			}
			i = j - k;
	//   54  102:iload           5
	//   55  104:iload           6
	//   56  106:isub            
	//   57  107:istore          4
		}
		c.a(i, view.getTop());
	//   58  109:aload_0         
	//   59  110:getfield        #52  <Field p c>
	//   60  113:iload           4
	//   61  115:aload_1         
	//   62  116:invokevirtual   #45  <Method int View.getTop()>
	//   63  119:invokevirtual   #83  <Method boolean p.a(int, int)>
	//   64  122:pop             
		a.invalidate();
	//   65  123:aload_0         
	//   66  124:getfield        #20  <Field DrawerLayout a>
	//   67  127:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
	//   68  130:return          
	}

	public void a(View view, int i, int j, int k, int l)
	{
		j = view.getWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int View.getWidth()>
	//    2    4:istore_3        
		float f;
		if(a.a(view, 3))
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field DrawerLayout a>
	//*   5    9:aload_1         
	//*   6   10:iconst_3        
	//*   7   11:invokevirtual   #78  <Method boolean DrawerLayout.a(View, int)>
	//*   8   14:ifeq            33
			f = i + j;
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:iadd            
	//   12   20:i2f             
	//   13   21:fstore          6
		else
	//*  14   23:fload           6
	//*  15   25:iload_3         
	//*  16   26:i2f             
	//*  17   27:fdiv            
	//*  18   28:fstore          6
	//*  19   30:goto            48
			f = a.getWidth() - i;
	//   20   33:aload_0         
	//   21   34:getfield        #20  <Field DrawerLayout a>
	//   22   37:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
	//   23   40:iload_2         
	//   24   41:isub            
	//   25   42:i2f             
	//   26   43:fstore          6
		f /= j;
	//*  27   45:goto            23
		a.b(view, f);
	//   28   48:aload_0         
	//   29   49:getfield        #20  <Field DrawerLayout a>
	//   30   52:aload_1         
	//   31   53:fload           6
	//   32   55:invokevirtual   #90  <Method void DrawerLayout.b(View, float)>
		if(f == 0.0F)
	//*  33   58:fload           6
	//*  34   60:fconst_0        
	//*  35   61:fcmpl           
	//*  36   62:ifne            70
			i = 4;
	//   37   65:iconst_4        
	//   38   66:istore_2        
		else
	//*  39   67:goto            72
			i = 0;
	//   40   70:iconst_0        
	//   41   71:istore_2        
		view.setVisibility(i);
	//   42   72:aload_1         
	//   43   73:iload_2         
	//   44   74:invokevirtual   #93  <Method void View.setVisibility(int)>
		a.invalidate();
	//   45   77:aload_0         
	//   46   78:getfield        #20  <Field DrawerLayout a>
	//   47   81:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
	//   48   84:return          
	}

	public boolean a(View view, int i)
	{
		return a.g(view) && a.a(view, b) && a.a(view) == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DrawerLayout a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method boolean DrawerLayout.g(View)>
	//    4    8:ifeq            39
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field DrawerLayout a>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field int b>
	//   10   20:invokevirtual   #78  <Method boolean DrawerLayout.a(View, int)>
	//   11   23:ifeq            39
	//   12   26:aload_0         
	//   13   27:getfield        #20  <Field DrawerLayout a>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #100 <Method int DrawerLayout.a(View)>
	//   16   34:ifne            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
	}

	public int b(View view)
	{
		if(a.g(view))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field DrawerLayout a>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #97  <Method boolean DrawerLayout.g(View)>
	//*   4    8:ifeq            16
			return view.getWidth();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #75  <Method int View.getWidth()>
	//    7   15:ireturn         
		else
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public int b(View view, int i, int j)
	{
		int k;
		if(a.a(view, 3))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field DrawerLayout a>
	//*   2    4:aload_1         
	//*   3    5:iconst_3        
	//*   4    6:invokevirtual   #78  <Method boolean DrawerLayout.a(View, int)>
	//*   5    9:ifeq            32
		{
			j = -view.getWidth();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #75  <Method int View.getWidth()>
	//    8   16:ineg            
	//    9   17:istore_3        
			k = 0;
	//   10   18:iconst_0        
	//   11   19:istore          4
		} else
	//*  12   21:iload_3         
	//*  13   22:iload_2         
	//*  14   23:iload           4
	//*  15   25:invokestatic    #106 <Method int Math.min(int, int)>
	//*  16   28:invokestatic    #109 <Method int Math.max(int, int)>
	//*  17   31:ireturn         
		{
			k = a.getWidth();
	//   18   32:aload_0         
	//   19   33:getfield        #20  <Field DrawerLayout a>
	//   20   36:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
	//   21   39:istore          4
			j = k - view.getWidth();
	//   22   41:iload           4
	//   23   43:aload_1         
	//   24   44:invokevirtual   #75  <Method int View.getWidth()>
	//   25   47:isub            
	//   26   48:istore_3        
		}
		return Math.max(j, Math.min(i, k));
	//*  27   49:goto            21
	}

	void b()
	{
		int k = c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field p c>
	//    2    4:invokevirtual   #111 <Method int p.b()>
	//    3    7:istore_3        
		int i = b;
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field int b>
	//    6   12:istore_1        
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		boolean flag;
		if(i == 3)
	//*   9   15:iload_1         
	//*  10   16:iconst_3        
	//*  11   17:icmpne          25
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_1        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_1        
		View view;
		if(flag)
	//*  17   27:iload_1         
	//*  18   28:ifeq            60
		{
			view = a.c(3);
	//   19   31:aload_0         
	//   20   32:getfield        #20  <Field DrawerLayout a>
	//   21   35:iconst_3        
	//   22   36:invokevirtual   #34  <Method View DrawerLayout.c(int)>
	//   23   39:astore          4
			if(view != null)
	//*  24   41:aload           4
	//*  25   43:ifnull          53
				j = -view.getWidth();
	//   26   46:aload           4
	//   27   48:invokevirtual   #75  <Method int View.getWidth()>
	//   28   51:ineg            
	//   29   52:istore_2        
			j += k;
	//   30   53:iload_2         
	//   31   54:iload_3         
	//   32   55:iadd            
	//   33   56:istore_2        
		} else
	//*  34   57:goto            80
		{
			view = a.c(5);
	//   35   60:aload_0         
	//   36   61:getfield        #20  <Field DrawerLayout a>
	//   37   64:iconst_5        
	//   38   65:invokevirtual   #34  <Method View DrawerLayout.c(int)>
	//   39   68:astore          4
			j = a.getWidth() - k;
	//   40   70:aload_0         
	//   41   71:getfield        #20  <Field DrawerLayout a>
	//   42   74:invokevirtual   #80  <Method int DrawerLayout.getWidth()>
	//   43   77:iload_3         
	//   44   78:isub            
	//   45   79:istore_2        
		}
		if(view != null && (flag && view.getLeft() < j || !flag && view.getLeft() > j) && a.a(view) == 0)
	//*  46   80:aload           4
	//*  47   82:ifnull          173
	//*  48   85:iload_1         
	//*  49   86:ifeq            98
	//*  50   89:aload           4
	//*  51   91:invokevirtual   #114 <Method int View.getLeft()>
	//*  52   94:iload_2         
	//*  53   95:icmplt          111
	//*  54   98:iload_1         
	//*  55   99:ifne            173
	//*  56  102:aload           4
	//*  57  104:invokevirtual   #114 <Method int View.getLeft()>
	//*  58  107:iload_2         
	//*  59  108:icmple          173
	//*  60  111:aload_0         
	//*  61  112:getfield        #20  <Field DrawerLayout a>
	//*  62  115:aload           4
	//*  63  117:invokevirtual   #100 <Method int DrawerLayout.a(View)>
	//*  64  120:ifne            173
		{
			youtParams youtparams = (youtParams)view.getLayoutParams();
	//   65  123:aload           4
	//   66  125:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   67  128:checkcast       #120 <Class DrawerLayout$LayoutParams>
	//   68  131:astore          5
			c.a(view, j, view.getTop());
	//   69  133:aload_0         
	//   70  134:getfield        #52  <Field p c>
	//   71  137:aload           4
	//   72  139:iload_2         
	//   73  140:aload           4
	//   74  142:invokevirtual   #45  <Method int View.getTop()>
	//   75  145:invokevirtual   #123 <Method boolean p.a(View, int, int)>
	//   76  148:pop             
			youtparams.c = true;
	//   77  149:aload           5
	//   78  151:iconst_1        
	//   79  152:putfield        #126 <Field boolean DrawerLayout$LayoutParams.c>
			a.invalidate();
	//   80  155:aload_0         
	//   81  156:getfield        #20  <Field DrawerLayout a>
	//   82  159:invokevirtual   #86  <Method void DrawerLayout.invalidate()>
			c();
	//   83  162:aload_0         
	//   84  163:invokespecial   #128 <Method void c()>
			a.d();
	//   85  166:aload_0         
	//   86  167:getfield        #20  <Field DrawerLayout a>
	//   87  170:invokevirtual   #130 <Method void DrawerLayout.d()>
		}
	//   88  173:return          
	}

	public void b(int i, int j)
	{
		Object obj;
		if((i & 1) == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:iconst_1        
	//*   4    4:icmpne          23
		{
			obj = ((Object) (a));
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field DrawerLayout a>
	//    7   11:astore_3        
			i = 3;
	//    8   12:iconst_3        
	//    9   13:istore_1        
		} else
	//*  10   14:aload_3         
	//*  11   15:iload_1         
	//*  12   16:invokevirtual   #34  <Method View DrawerLayout.c(int)>
	//*  13   19:astore_3        
	//*  14   20:goto            33
		{
			obj = ((Object) (a));
	//   15   23:aload_0         
	//   16   24:getfield        #20  <Field DrawerLayout a>
	//   17   27:astore_3        
			i = 5;
	//   18   28:iconst_5        
	//   19   29:istore_1        
		}
		obj = ((Object) (((DrawerLayout) (obj)).c(i)));
	//*  20   30:goto            14
		if(obj != null && a.a(((View) (obj))) == 0)
	//*  21   33:aload_3         
	//*  22   34:ifnull          57
	//*  23   37:aload_0         
	//*  24   38:getfield        #20  <Field DrawerLayout a>
	//*  25   41:aload_3         
	//*  26   42:invokevirtual   #100 <Method int DrawerLayout.a(View)>
	//*  27   45:ifne            57
			c.a(((View) (obj)), j);
	//   28   48:aload_0         
	//   29   49:getfield        #52  <Field p c>
	//   30   52:aload_3         
	//   31   53:iload_2         
	//   32   54:invokevirtual   #133 <Method void p.a(View, int)>
	//   33   57:return          
	}

	public void b(View view, int i)
	{
		((youtParams)view.getLayoutParams()).c = false;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #120 <Class DrawerLayout$LayoutParams>
	//    3    7:iconst_0        
	//    4    8:putfield        #126 <Field boolean DrawerLayout$LayoutParams.c>
		c();
	//    5   11:aload_0         
	//    6   12:invokespecial   #128 <Method void c()>
	//    7   15:return          
	}

	public boolean b(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final DrawerLayout a;
	private final int b;
	private p c;
	private final Runnable d = new Runnable() {

		public void run()
		{
			a.b();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field DrawerLayout$d a>
		//    2    4:invokevirtual   #25  <Method void DrawerLayout$d.b()>
		//    3    7:return          
		}

		final DrawerLayout.d a;

			
			{
				a = DrawerLayout.d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawerLayout$d a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;

	DrawerLayout$d(DrawerLayout drawerlayout, int i)
	{
		a = drawerlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field DrawerLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void p$a()>
	//    5    9:aload_0         
	//    6   10:new             #9   <Class DrawerLayout$d$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #26  <Method void DrawerLayout$d$1(DrawerLayout$d)>
	//   10   18:putfield        #28  <Field Runnable d>
		b = i;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #30  <Field int b>
	//   14   26:return          
	}
}

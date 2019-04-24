// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.view.*;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class SwipeDismissBehavior extends CoordinatorLayout.Behavior
{
	public static interface a
	{

		public abstract void a(int k);

		public abstract void a(View view);
	}

	private class b
		implements Runnable
	{

		public void run()
		{
			if(a.b != null && a.b.a(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field SwipeDismissBehavior a>
		//*   2    4:getfield        #30  <Field p SwipeDismissBehavior.b>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #18  <Field SwipeDismissBehavior a>
		//*   6   14:getfield        #30  <Field p SwipeDismissBehavior.b>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #35  <Method boolean p.a(boolean)>
		//*   9   21:ifeq            33
			{
				s.a(b, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #23  <Field View b>
		//   12   28:aload_0         
		//   13   29:invokestatic    #40  <Method void s.a(View, Runnable)>
				return;
		//   14   32:return          
			}
			if(c && a.c != null)
		//*  15   33:aload_0         
		//*  16   34:getfield        #25  <Field boolean c>
		//*  17   37:ifeq            66
		//*  18   40:aload_0         
		//*  19   41:getfield        #18  <Field SwipeDismissBehavior a>
		//*  20   44:getfield        #43  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//*  21   47:ifnull          66
				a.c.a(b);
		//   22   50:aload_0         
		//   23   51:getfield        #18  <Field SwipeDismissBehavior a>
		//   24   54:getfield        #43  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//   25   57:aload_0         
		//   26   58:getfield        #23  <Field View b>
		//   27   61:invokeinterface #48  <Method void SwipeDismissBehavior$a.a(View)>
		//   28   66:return          
		}

		final SwipeDismissBehavior a;
		private final View b;
		private final boolean c;

		b(View view, boolean flag)
		{
			a = SwipeDismissBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field SwipeDismissBehavior a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			b = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field View b>
			c = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field boolean c>
		//   11   19:return          
		}
	}


	public SwipeDismissBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void CoordinatorLayout$Behavior()>
		h = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #33  <Field float h>
		d = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #35  <Field int d>
		e = 0.5F;
	//    8   14:aload_0         
	//    9   15:ldc1            #36  <Float 0.5F>
	//   10   17:putfield        #38  <Field float e>
		f = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #40  <Field float f>
		g = 0.5F;
	//   14   25:aload_0         
	//   15   26:ldc1            #36  <Float 0.5F>
	//   16   28:putfield        #42  <Field float g>
	//   17   31:aload_0         
	//   18   32:new             #7   <Class SwipeDismissBehavior$1>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #45  <Method void SwipeDismissBehavior$1(SwipeDismissBehavior)>
	//   22   40:putfield        #47  <Field android.support.v4.widget.p$a j>
	//   23   43:return          
	}

	static float a(float f1, float f2, float f3)
	{
		return Math.min(Math.max(f1, f2), f3);
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #55  <Method float Math.max(float, float)>
	//    3    5:fload_2         
	//    4    6:invokestatic    #58  <Method float Math.min(float, float)>
	//    5    9:freturn         
	}

	static int a(int k, int l, int i1)
	{
		return Math.min(Math.max(k, l), i1);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #62  <Method int Math.max(int, int)>
	//    3    5:iload_2         
	//    4    6:invokestatic    #64  <Method int Math.min(int, int)>
	//    5    9:ireturn         
	}

	private void a(ViewGroup viewgroup)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field p b>
	//*   2    4:ifnonnull       44
		{
			if(i)
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field boolean i>
	//*   5   11:ifeq            30
				viewgroup = ((ViewGroup) (p.a(viewgroup, h, j)));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field float h>
	//    9   19:aload_0         
	//   10   20:getfield        #47  <Field android.support.v4.widget.p$a j>
	//   11   23:invokestatic    #74  <Method p p.a(ViewGroup, float, android.support.v4.widget.p$a)>
	//   12   26:astore_1        
			else
	//*  13   27:goto            39
				viewgroup = ((ViewGroup) (p.a(viewgroup, j)));
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #47  <Field android.support.v4.widget.p$a j>
	//   17   35:invokestatic    #77  <Method p p.a(ViewGroup, android.support.v4.widget.p$a)>
	//   18   38:astore_1        
			b = ((p) (viewgroup));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #67  <Field p b>
		}
	//   22   44:return          
	}

	static float b(float f1, float f2, float f3)
	{
		return (f3 - f1) / (f2 - f1);
	//    0    0:fload_2         
	//    1    1:fload_0         
	//    2    2:fsub            
	//    3    3:fload_1         
	//    4    4:fload_0         
	//    5    5:fsub            
	//    6    6:fdiv            
	//    7    7:freturn         
	}

	public void a(float f1)
	{
		f = a(0.0F, f1, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #80  <Method float a(float, float, float)>
	//    5    7:putfield        #40  <Field float f>
	//    6   10:return          
	}

	public void a(int k)
	{
		d = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int d>
	//    3    5:return          
	}

	public void a(a a1)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field SwipeDismissBehavior$a c>
	//    3    5:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int k;
		boolean flag;
		flag = a;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean a>
	//    2    4:istore          5
		k = motionevent.getActionMasked();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #93  <Method int MotionEvent.getActionMasked()>
	//    5   10:istore          4
		if(k == 3) goto _L2; else goto _L1
	//    6   12:iload           4
	//    7   14:iconst_3        
	//    8   15:icmpeq          75
_L1:
		k;
	//    9   18:iload           4
		JVM INSTR tableswitch 0 1: default 44
	//	               0 47
	//	               1 75;
	//   10   20:tableswitch     0 1: default 44
	//	               0 47
	//	               1 75
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   11   44:goto            80
_L4:
		a = coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY());
	//   12   47:aload_0         
	//   13   48:aload_1         
	//   14   49:aload_2         
	//   15   50:aload_3         
	//   16   51:invokevirtual   #97  <Method float MotionEvent.getX()>
	//   17   54:f2i             
	//   18   55:aload_3         
	//   19   56:invokevirtual   #100 <Method float MotionEvent.getY()>
	//   20   59:f2i             
	//   21   60:invokevirtual   #105 <Method boolean CoordinatorLayout.a(View, int, int)>
	//   22   63:putfield        #87  <Field boolean a>
		flag = a;
	//   23   66:aload_0         
	//   24   67:getfield        #87  <Field boolean a>
	//   25   70:istore          5
		break; /* Loop/switch isn't completed */
	//   26   72:goto            80
_L2:
		a = false;
	//   27   75:aload_0         
	//   28   76:iconst_0        
	//   29   77:putfield        #87  <Field boolean a>
		if(flag)
	//*  30   80:iload           5
	//*  31   82:ifeq            99
		{
			a(((ViewGroup) (coordinatorlayout)));
	//   32   85:aload_0         
	//   33   86:aload_1         
	//   34   87:invokespecial   #107 <Method void a(ViewGroup)>
			return b.a(motionevent);
	//   35   90:aload_0         
	//   36   91:getfield        #67  <Field p b>
	//   37   94:aload_3         
	//   38   95:invokevirtual   #110 <Method boolean p.a(MotionEvent)>
	//   39   98:ireturn         
		} else
		{
			return false;
	//   40   99:iconst_0        
	//   41  100:ireturn         
		}
	}

	public boolean a(View view)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void b(float f1)
	{
		g = a(0.0F, f1, 1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_1        
	//    4    4:invokestatic    #80  <Method float a(float, float, float)>
	//    5    7:putfield        #42  <Field float g>
	//    6   10:return          
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field p b>
	//*   2    4:ifnull          17
		{
			b.b(motionevent);
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field p b>
	//    5   11:aload_3         
	//    6   12:invokevirtual   #116 <Method void p.b(MotionEvent)>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		} else
		{
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
	}

	private boolean a;
	p b;
	a c;
	int d;
	float e;
	float f;
	float g;
	private float h;
	private boolean i;
	private final android.support.v4.widget.p.a j = new android.support.v4.widget.p.a() {

		private boolean a(View view, float f1)
		{
			int l = f1 != 0.0F;
		//    0    0:fload_2         
		//    1    1:fconst_0        
		//    2    2:fcmpl           
		//    3    3:istore          4
			boolean flag1 = false;
		//    4    5:iconst_0        
		//    5    6:istore          6
			if(l != 0)
		//*   6    8:iload           4
		//*   7   10:ifeq            106
			{
				boolean flag;
				if(s.e(view) == 1)
		//*   8   13:aload_1         
		//*   9   14:invokestatic    #28  <Method int s.e(View)>
		//*  10   17:iconst_1        
		//*  11   18:icmpne          26
					flag = true;
		//   12   21:iconst_1        
		//   13   22:istore_3        
				else
		//*  14   23:goto            28
					flag = false;
		//   15   26:iconst_0        
		//   16   27:istore_3        
				if(a.d == 2)
		//*  17   28:aload_0         
		//*  18   29:getfield        #15  <Field SwipeDismissBehavior a>
		//*  19   32:getfield        #31  <Field int SwipeDismissBehavior.d>
		//*  20   35:iconst_2        
		//*  21   36:icmpne          41
					return true;
		//   22   39:iconst_1        
		//   23   40:ireturn         
				if(a.d == 0)
		//*  24   41:aload_0         
		//*  25   42:getfield        #15  <Field SwipeDismissBehavior a>
		//*  26   45:getfield        #31  <Field int SwipeDismissBehavior.d>
		//*  27   48:ifne            73
					return flag ? f1 >= 0.0F : l <= 0;
		//   28   51:iload_3         
		//   29   52:ifeq            63
		//   30   55:fload_2         
		//   31   56:fconst_0        
		//   32   57:fcmpg           
		//   33   58:ifge            71
		//   34   61:iconst_1        
		//   35   62:ireturn         
		//   36   63:iload           4
		//   37   65:ifle            71
		//   38   68:goto            61
		//   39   71:iconst_0        
		//   40   72:ireturn         
				return a.d == 1 && (flag ? l > 0 : f1 < 0.0F);
		//   41   73:aload_0         
		//   42   74:getfield        #15  <Field SwipeDismissBehavior a>
		//   43   77:getfield        #31  <Field int SwipeDismissBehavior.d>
		//   44   80:iconst_1        
		//   45   81:icmpne          104
		//   46   84:iload_3         
		//   47   85:ifeq            95
		//   48   88:iload           4
		//   49   90:ifle            104
		//   50   93:iconst_1        
		//   51   94:ireturn         
		//   52   95:fload_2         
		//   53   96:fconst_0        
		//   54   97:fcmpg           
		//   55   98:ifge            104
		//   56  101:goto            93
		//   57  104:iconst_0        
		//   58  105:ireturn         
			}
			int k = view.getLeft();
		//   59  106:aload_1         
		//   60  107:invokevirtual   #37  <Method int View.getLeft()>
		//   61  110:istore_3        
			l = b;
		//   62  111:aload_0         
		//   63  112:getfield        #39  <Field int b>
		//   64  115:istore          4
			int i1 = Math.round((float)view.getWidth() * a.e);
		//   65  117:aload_1         
		//   66  118:invokevirtual   #42  <Method int View.getWidth()>
		//   67  121:i2f             
		//   68  122:aload_0         
		//   69  123:getfield        #15  <Field SwipeDismissBehavior a>
		//   70  126:getfield        #45  <Field float SwipeDismissBehavior.e>
		//   71  129:fmul            
		//   72  130:invokestatic    #51  <Method int Math.round(float)>
		//   73  133:istore          5
			if(Math.abs(k - l) >= i1)
		//*  74  135:iload_3         
		//*  75  136:iload           4
		//*  76  138:isub            
		//*  77  139:invokestatic    #55  <Method int Math.abs(int)>
		//*  78  142:iload           5
		//*  79  144:icmplt          150
				flag1 = true;
		//   80  147:iconst_1        
		//   81  148:istore          6
			return flag1;
		//   82  150:iload           6
		//   83  152:ireturn         
		}

		public int a(View view, int k, int l)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #59  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public void a(int k)
		{
			if(a.c != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field SwipeDismissBehavior a>
		//*   2    4:getfield        #63  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//*   3    7:ifnull          23
				a.c.a(k);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field SwipeDismissBehavior a>
		//    6   14:getfield        #63  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//    7   17:iload_1         
		//    8   18:invokeinterface #67  <Method void SwipeDismissBehavior$a.a(int)>
		//    9   23:return          
		}

		public void a(View view, float f1, float f2)
		{
			c = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #20  <Field int c>
			int k = view.getWidth();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #42  <Method int View.getWidth()>
		//    5    9:istore          4
			boolean flag;
			if(a(view, f1))
		//*   6   11:aload_0         
		//*   7   12:aload_1         
		//*   8   13:fload_2         
		//*   9   14:invokespecial   #70  <Method boolean a(View, float)>
		//*  10   17:ifeq            58
			{
				if(view.getLeft() < b)
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #37  <Method int View.getLeft()>
		//*  13   24:aload_0         
		//*  14   25:getfield        #39  <Field int b>
		//*  15   28:icmpge          43
					k = b - k;
		//   16   31:aload_0         
		//   17   32:getfield        #39  <Field int b>
		//   18   35:iload           4
		//   19   37:isub            
		//   20   38:istore          4
				else
		//*  21   40:goto            52
					k = b + k;
		//   22   43:aload_0         
		//   23   44:getfield        #39  <Field int b>
		//   24   47:iload           4
		//   25   49:iadd            
		//   26   50:istore          4
				flag = true;
		//   27   52:iconst_1        
		//   28   53:istore          5
			} else
		//*  29   55:goto            67
			{
				k = b;
		//   30   58:aload_0         
		//   31   59:getfield        #39  <Field int b>
		//   32   62:istore          4
				flag = false;
		//   33   64:iconst_0        
		//   34   65:istore          5
			}
			if(a.b.a(k, view.getTop()))
		//*  35   67:aload_0         
		//*  36   68:getfield        #15  <Field SwipeDismissBehavior a>
		//*  37   71:getfield        #73  <Field p SwipeDismissBehavior.b>
		//*  38   74:iload           4
		//*  39   76:aload_1         
		//*  40   77:invokevirtual   #59  <Method int View.getTop()>
		//*  41   80:invokevirtual   #78  <Method boolean p.a(int, int)>
		//*  42   83:ifeq            105
			{
				s.a(view, ((Runnable) (((b) (a)). new b(view, flag))));
		//   43   86:aload_1         
		//   44   87:new             #80  <Class SwipeDismissBehavior$b>
		//   45   90:dup             
		//   46   91:aload_0         
		//   47   92:getfield        #15  <Field SwipeDismissBehavior a>
		//   48   95:aload_1         
		//   49   96:iload           5
		//   50   98:invokespecial   #83  <Method void SwipeDismissBehavior$b(SwipeDismissBehavior, View, boolean)>
		//   51  101:invokestatic    #86  <Method void s.a(View, Runnable)>
				return;
		//   52  104:return          
			}
			if(flag && a.c != null)
		//*  53  105:iload           5
		//*  54  107:ifeq            133
		//*  55  110:aload_0         
		//*  56  111:getfield        #15  <Field SwipeDismissBehavior a>
		//*  57  114:getfield        #63  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//*  58  117:ifnull          133
				a.c.a(view);
		//   59  120:aload_0         
		//   60  121:getfield        #15  <Field SwipeDismissBehavior a>
		//   61  124:getfield        #63  <Field SwipeDismissBehavior$a SwipeDismissBehavior.c>
		//   62  127:aload_1         
		//   63  128:invokeinterface #89  <Method void SwipeDismissBehavior$a.a(View)>
		//   64  133:return          
		}

		public void a(View view, int k, int l, int i1, int j1)
		{
			float f1 = (float)b + (float)view.getWidth() * a.f;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int b>
		//    2    4:i2f             
		//    3    5:aload_1         
		//    4    6:invokevirtual   #42  <Method int View.getWidth()>
		//    5    9:i2f             
		//    6   10:aload_0         
		//    7   11:getfield        #15  <Field SwipeDismissBehavior a>
		//    8   14:getfield        #93  <Field float SwipeDismissBehavior.f>
		//    9   17:fmul            
		//   10   18:fadd            
		//   11   19:fstore          6
			float f2 = (float)b + (float)view.getWidth() * a.g;
		//   12   21:aload_0         
		//   13   22:getfield        #39  <Field int b>
		//   14   25:i2f             
		//   15   26:aload_1         
		//   16   27:invokevirtual   #42  <Method int View.getWidth()>
		//   17   30:i2f             
		//   18   31:aload_0         
		//   19   32:getfield        #15  <Field SwipeDismissBehavior a>
		//   20   35:getfield        #96  <Field float SwipeDismissBehavior.g>
		//   21   38:fmul            
		//   22   39:fadd            
		//   23   40:fstore          7
			float f3 = k;
		//   24   42:iload_2         
		//   25   43:i2f             
		//   26   44:fstore          8
			if(f3 <= f1)
		//*  27   46:fload           8
		//*  28   48:fload           6
		//*  29   50:fcmpg           
		//*  30   51:ifgt            60
			{
				view.setAlpha(1.0F);
		//   31   54:aload_1         
		//   32   55:fconst_1        
		//   33   56:invokevirtual   #100 <Method void View.setAlpha(float)>
				return;
		//   34   59:return          
			}
			if(f3 >= f2)
		//*  35   60:fload           8
		//*  36   62:fload           7
		//*  37   64:fcmpl           
		//*  38   65:iflt            74
			{
				view.setAlpha(0.0F);
		//   39   68:aload_1         
		//   40   69:fconst_0        
		//   41   70:invokevirtual   #100 <Method void View.setAlpha(float)>
				return;
		//   42   73:return          
			} else
			{
				view.setAlpha(SwipeDismissBehavior.a(0.0F, 1.0F - SwipeDismissBehavior.b(f1, f2, f3), 1.0F));
		//   43   74:aload_1         
		//   44   75:fconst_0        
		//   45   76:fconst_1        
		//   46   77:fload           6
		//   47   79:fload           7
		//   48   81:fload           8
		//   49   83:invokestatic    #103 <Method float SwipeDismissBehavior.b(float, float, float)>
		//   50   86:fsub            
		//   51   87:fconst_1        
		//   52   88:invokestatic    #105 <Method float SwipeDismissBehavior.a(float, float, float)>
		//   53   91:invokevirtual   #100 <Method void View.setAlpha(float)>
				return;
		//   54   94:return          
			}
		}

		public boolean a(View view, int k)
		{
			return c == -1 && a.a(view);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int c>
		//    2    4:iconst_m1       
		//    3    5:icmpne          21
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field SwipeDismissBehavior a>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #109 <Method boolean SwipeDismissBehavior.a(View)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		public int b(View view)
		{
			return view.getWidth();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #42  <Method int View.getWidth()>
		//    2    4:ireturn         
		}

		public int b(View view, int k, int l)
		{
			if(s.e(view) == 1)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #28  <Method int s.e(View)>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          13
				l = 1;
		//    4    8:iconst_1        
		//    5    9:istore_3        
			else
		//*   6   10:goto            15
				l = 0;
		//    7   13:iconst_0        
		//    8   14:istore_3        
			if(a.d != 0) goto _L2; else goto _L1
		//    9   15:aload_0         
		//   10   16:getfield        #15  <Field SwipeDismissBehavior a>
		//   11   19:getfield        #31  <Field int SwipeDismissBehavior.d>
		//   12   22:ifne            71
_L1:
			if(l == 0) goto _L4; else goto _L3
		//   13   25:iload_3         
		//   14   26:ifeq            48
_L3:
			int i1;
			l = b - view.getWidth();
		//   15   29:aload_0         
		//   16   30:getfield        #39  <Field int b>
		//   17   33:aload_1         
		//   18   34:invokevirtual   #42  <Method int View.getWidth()>
		//   19   37:isub            
		//   20   38:istore_3        
			i1 = b;
		//   21   39:aload_0         
		//   22   40:getfield        #39  <Field int b>
		//   23   43:istore          4
			break MISSING_BLOCK_LABEL_102;
		//   24   45:goto            102
_L4:
			l = b;
		//   25   48:aload_0         
		//   26   49:getfield        #39  <Field int b>
		//   27   52:istore_3        
_L7:
			i1 = b;
		//   28   53:aload_0         
		//   29   54:getfield        #39  <Field int b>
		//   30   57:istore          4
			i1 = view.getWidth() + i1;
		//   31   59:aload_1         
		//   32   60:invokevirtual   #42  <Method int View.getWidth()>
		//   33   63:iload           4
		//   34   65:iadd            
		//   35   66:istore          4
			break MISSING_BLOCK_LABEL_102;
		//   36   68:goto            102
_L2:
			if(a.d != 1) goto _L6; else goto _L5
		//   37   71:aload_0         
		//   38   72:getfield        #15  <Field SwipeDismissBehavior a>
		//   39   75:getfield        #31  <Field int SwipeDismissBehavior.d>
		//   40   78:iconst_1        
		//   41   79:icmpne          89
_L5:
			if(l == 0) goto _L3; else goto _L4
		//   42   82:iload_3         
		//   43   83:ifeq            29
		//*  44   86:goto            48
_L6:
			l = b - view.getWidth();
		//   45   89:aload_0         
		//   46   90:getfield        #39  <Field int b>
		//   47   93:aload_1         
		//   48   94:invokevirtual   #42  <Method int View.getWidth()>
		//   49   97:isub            
		//   50   98:istore_3        
			  goto _L7
		//*  51   99:goto            53
			return SwipeDismissBehavior.a(l, k, i1);
		//   52  102:iload_3         
		//   53  103:iload_2         
		//   54  104:iload           4
		//   55  106:invokestatic    #112 <Method int SwipeDismissBehavior.a(int, int, int)>
		//   56  109:ireturn         
		}

		public void b(View view, int k)
		{
			c = k;
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:putfield        #20  <Field int c>
			b = view.getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #37  <Method int View.getLeft()>
		//    6   10:putfield        #39  <Field int b>
			view = ((View) (view.getParent()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #117 <Method ViewParent View.getParent()>
		//    9   17:astore_1        
			if(view != null)
		//*  10   18:aload_1         
		//*  11   19:ifnull          29
				((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
		//   12   22:aload_1         
		//   13   23:iconst_1        
		//   14   24:invokeinterface #123 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		//   15   29:return          
		}

		final SwipeDismissBehavior a;
		private int b;
		private int c;

			
			{
				a = SwipeDismissBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeDismissBehavior a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.v4.widget.p$a()>
				c = -1;
			//    5    9:aload_0         
			//    6   10:iconst_m1       
			//    7   11:putfield        #20  <Field int c>
			//    8   14:return          
			}
	}
;
}

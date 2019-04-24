// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Paint;

// Referenced classes of package o:
//			lh, oc

public class lp extends lh
{
	public static final class b extends Enum
	{

		public static b valueOf(String s)
		{
			return (b)Enum.valueOf(o/lp$b, s);
		//    0    0:ldc1            #2   <Class lp$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lp$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (c)).clone();
		//    0    0:getstatic       #28  <Field lp$b[] c>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lo.lp$b_3B_.clone()>
		//    2    6:checkcast       #39  <Class lp$b[]>
		//    3    9:areturn         
		}

		public static final b b;
		private static final b c[];
		public static final b e;

		static 
		{
			b = new b("LEFT", 0);
		//    0    0:new             #2   <Class lp$b>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void lp$b(String, int)>
		//    5   10:putstatic       #22  <Field lp$b b>
			e = new b("RIGHT", 1);
		//    6   13:new             #2   <Class lp$b>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void lp$b(String, int)>
		//   11   23:putstatic       #26  <Field lp$b e>
			c = (new b[] {
				b, e
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       b[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field lp$b b>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field lp$b e>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field lp$b[] c>
		//*  23   45:return          
		}

		private b(String s, int k)
		{
			super(s, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class c extends Enum
	{

		public static c valueOf(String s)
		{
			return (c)Enum.valueOf(o/lp$c, s);
		//    0    0:ldc1            #2   <Class lp$c>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lp$c>
		//    4    9:areturn         
		}

		public static c[] values()
		{
			return (c[])((c []) (e)).clone();
		//    0    0:getstatic       #28  <Field lp$c[] e>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lo.lp$c_3B_.clone()>
		//    2    6:checkcast       #39  <Class lp$c[]>
		//    3    9:areturn         
		}

		public static final c a;
		public static final c c;
		private static final c e[];

		static 
		{
			a = new c("OUTSIDE_CHART", 0);
		//    0    0:new             #2   <Class lp$c>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "OUTSIDE_CHART">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void lp$c(String, int)>
		//    5   10:putstatic       #22  <Field lp$c a>
			c = new c("INSIDE_CHART", 1);
		//    6   13:new             #2   <Class lp$c>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "INSIDE_CHART">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void lp$c(String, int)>
		//   11   23:putstatic       #26  <Field lp$c c>
			e = (new c[] {
				a, c
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       c[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field lp$c a>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field lp$c c>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field lp$c[] e>
		//*  23   45:return          
		}

		private c(String s, int k)
		{
			super(s, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public lp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void lh()>
		M = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean M>
		J = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #33  <Field boolean J>
		C = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #35  <Field boolean C>
		B = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #37  <Field boolean B>
		j = 0xff888888;
	//   14   24:aload_0         
	//   15   25:ldc1            #38  <Int 0xff888888>
	//   16   27:putfield        #40  <Field int j>
		F = 1.0F;
	//   17   30:aload_0         
	//   18   31:fconst_1        
	//   19   32:putfield        #42  <Field float F>
		G = 10F;
	//   20   35:aload_0         
	//   21   36:ldc1            #43  <Float 10F>
	//   22   38:putfield        #45  <Field float G>
		E = 10F;
	//   23   41:aload_0         
	//   24   42:ldc1            #43  <Float 10F>
	//   25   44:putfield        #47  <Field float E>
		L = c.a;
	//   26   47:aload_0         
	//   27   48:getstatic       #50  <Field lp$c lp$c.a>
	//   28   51:putfield        #52  <Field lp$c L>
		I = 0.0F;
	//   29   54:aload_0         
	//   30   55:fconst_0        
	//   31   56:putfield        #54  <Field float I>
		H = (1.0F / 0.0F);
	//   32   59:aload_0         
	//   33   60:ldc1            #55  <Float (1.0F / 0.0F)>
	//   34   62:putfield        #57  <Field float H>
		K = b.b;
	//   35   65:aload_0         
	//   36   66:getstatic       #59  <Field lp$b lp$b.b>
	//   37   69:putfield        #61  <Field lp$b K>
		z = 0.0F;
	//   38   72:aload_0         
	//   39   73:fconst_0        
	//   40   74:putfield        #64  <Field float z>
	//   41   77:return          
	}

	public lp(b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void lh()>
		M = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field boolean M>
		J = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #33  <Field boolean J>
		C = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #35  <Field boolean C>
		B = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #37  <Field boolean B>
		j = 0xff888888;
	//   14   24:aload_0         
	//   15   25:ldc1            #38  <Int 0xff888888>
	//   16   27:putfield        #40  <Field int j>
		F = 1.0F;
	//   17   30:aload_0         
	//   18   31:fconst_1        
	//   19   32:putfield        #42  <Field float F>
		G = 10F;
	//   20   35:aload_0         
	//   21   36:ldc1            #43  <Float 10F>
	//   22   38:putfield        #45  <Field float G>
		E = 10F;
	//   23   41:aload_0         
	//   24   42:ldc1            #43  <Float 10F>
	//   25   44:putfield        #47  <Field float E>
		L = c.a;
	//   26   47:aload_0         
	//   27   48:getstatic       #50  <Field lp$c lp$c.a>
	//   28   51:putfield        #52  <Field lp$c L>
		I = 0.0F;
	//   29   54:aload_0         
	//   30   55:fconst_0        
	//   31   56:putfield        #54  <Field float I>
		H = (1.0F / 0.0F);
	//   32   59:aload_0         
	//   33   60:ldc1            #55  <Float (1.0F / 0.0F)>
	//   34   62:putfield        #57  <Field float H>
		K = b1;
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:putfield        #61  <Field lp$b K>
		z = 0.0F;
	//   38   70:aload_0         
	//   39   71:fconst_0        
	//   40   72:putfield        #64  <Field float z>
	//   41   75:return          
	}

	public float C()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float I>
	//    2    4:freturn         
	}

	public float D()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float H>
	//    2    4:freturn         
	}

	public boolean E()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean C>
	//    2    4:ireturn         
	}

	public boolean F()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean J>
	//    2    4:ireturn         
	}

	public float G()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float G>
	//    2    4:freturn         
	}

	public c H()
	{
		return L;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field lp$c L>
	//    2    4:areturn         
	}

	public boolean I()
	{
		return M;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean M>
	//    2    4:ireturn         
	}

	public float J()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float E>
	//    2    4:freturn         
	}

	public boolean K()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean B>
	//    2    4:ireturn         
	}

	public boolean L()
	{
		return B() && g() && H() == c.a;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method boolean B()>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:invokevirtual   #75  <Method boolean g()>
	//    5   11:ifeq            26
	//    6   14:aload_0         
	//    7   15:invokevirtual   #77  <Method lp$c H()>
	//    8   18:getstatic       #50  <Field lp$c lp$c.a>
	//    9   21:if_acmpne       26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int M()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int j>
	//    2    4:ireturn         
	}

	public float N()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float F>
	//    2    4:freturn         
	}

	public float b(Paint paint)
	{
		paint.setTextSize(D);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field float D>
	//    3    5:invokevirtual   #88  <Method void Paint.setTextSize(float)>
		return (float)oc.e(paint, n()) + y() * 2.0F;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #92  <Method String n()>
	//    7   13:invokestatic    #98  <Method int oc.e(Paint, String)>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #101 <Method float y()>
	//   11   21:fconst_2        
	//   12   22:fmul            
	//   13   23:fadd            
	//   14   24:freturn         
	}

	public float d(Paint paint)
	{
		paint.setTextSize(D);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field float D>
	//    3    5:invokevirtual   #88  <Method void Paint.setTextSize(float)>
		float f2 = (float)oc.d(paint, n()) + v() * 2.0F;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #92  <Method String n()>
	//    7   13:invokestatic    #104 <Method int oc.d(Paint, String)>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #107 <Method float v()>
	//   11   21:fconst_2        
	//   12   22:fmul            
	//   13   23:fadd            
	//   14   24:fstore          4
		float f = C();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #109 <Method float C()>
	//   17   30:fstore_2        
		float f3 = D();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #111 <Method float D()>
	//   20   35:fstore          5
		float f1 = f;
	//   21   37:fload_2         
	//   22   38:fstore_3        
		if(f > 0.0F)
	//*  23   39:fload_2         
	//*  24   40:fconst_0        
	//*  25   41:fcmpl           
	//*  26   42:ifle            50
			f1 = oc.b(f);
	//   27   45:fload_2         
	//   28   46:invokestatic    #114 <Method float oc.b(float)>
	//   29   49:fstore_3        
		f = f3;
	//   30   50:fload           5
	//   31   52:fstore_2        
		if(f3 > 0.0F)
	//*  32   53:fload           5
	//*  33   55:fconst_0        
	//*  34   56:fcmpl           
	//*  35   57:ifle            77
		{
			f = f3;
	//   36   60:fload           5
	//   37   62:fstore_2        
			if(f3 != (1.0F / 0.0F))
	//*  38   63:fload           5
	//*  39   65:ldc1            #55  <Float (1.0F / 0.0F)>
	//*  40   67:fcmpl           
	//*  41   68:ifeq            77
				f = oc.b(f3);
	//   42   71:fload           5
	//   43   73:invokestatic    #114 <Method float oc.b(float)>
	//   44   76:fstore_2        
		}
		if((double)f <= 0.0D)
	//*  45   77:fload_2         
	//*  46   78:f2d             
	//*  47   79:dconst_0        
	//*  48   80:dcmpl           
	//*  49   81:ifle            87
	//*  50   84:goto            90
			f = f2;
	//   51   87:fload           4
	//   52   89:fstore_2        
		return Math.max(f1, Math.min(f2, f));
	//   53   90:fload_3         
	//   54   91:fload           4
	//   55   93:fload_2         
	//   56   94:invokestatic    #120 <Method float Math.min(float, float)>
	//   57   97:invokestatic    #123 <Method float Math.max(float, float)>
	//   58  100:freturn         
	}

	public void d(float f, float f1)
	{
		if(t)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean t>
	//*   2    4:ifeq            15
			f = q;
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field float q>
	//    5   11:fstore_1        
	//*   6   12:goto            15
		if(s)
	//*   7   15:aload_0         
	//*   8   16:getfield        #133 <Field boolean s>
	//*   9   19:ifeq            30
			f1 = u;
	//   10   22:aload_0         
	//   11   23:getfield        #136 <Field float u>
	//   12   26:fstore_2        
	//*  13   27:goto            30
		float f4 = Math.abs(f1 - f);
	//   14   30:fload_2         
	//   15   31:fload_1         
	//   16   32:fsub            
	//   17   33:invokestatic    #139 <Method float Math.abs(float)>
	//   18   36:fstore          5
		float f3 = f;
	//   19   38:fload_1         
	//   20   39:fstore          4
		float f2 = f1;
	//   21   41:fload_2         
	//   22   42:fstore_3        
		if(f4 == 0.0F)
	//*  23   43:fload           5
	//*  24   45:fconst_0        
	//*  25   46:fcmpl           
	//*  26   47:ifne            59
		{
			f2 = f1 + 1.0F;
	//   27   50:fload_2         
	//   28   51:fconst_1        
	//   29   52:fadd            
	//   30   53:fstore_3        
			f3 = f - 1.0F;
	//   31   54:fload_1         
	//   32   55:fconst_1        
	//   33   56:fsub            
	//   34   57:fstore          4
		}
		if(!t)
	//*  35   59:aload_0         
	//*  36   60:getfield        #127 <Field boolean t>
	//*  37   63:ifne            83
			q = f3 - (f4 / 100F) * J();
	//   38   66:aload_0         
	//   39   67:fload           4
	//   40   69:fload           5
	//   41   71:ldc1            #140 <Float 100F>
	//   42   73:fdiv            
	//   43   74:aload_0         
	//   44   75:invokevirtual   #142 <Method float J()>
	//   45   78:fmul            
	//   46   79:fsub            
	//   47   80:putfield        #130 <Field float q>
		if(!s)
	//*  48   83:aload_0         
	//*  49   84:getfield        #133 <Field boolean s>
	//*  50   87:ifne            106
			u = f2 + (f4 / 100F) * G();
	//   51   90:aload_0         
	//   52   91:fload_3         
	//   53   92:fload           5
	//   54   94:ldc1            #140 <Float 100F>
	//   55   96:fdiv            
	//   56   97:aload_0         
	//   57   98:invokevirtual   #144 <Method float G()>
	//   58  101:fmul            
	//   59  102:fadd            
	//   60  103:putfield        #136 <Field float u>
		w = Math.abs(u - q);
	//   61  106:aload_0         
	//   62  107:aload_0         
	//   63  108:getfield        #136 <Field float u>
	//   64  111:aload_0         
	//   65  112:getfield        #130 <Field float q>
	//   66  115:fsub            
	//   67  116:invokestatic    #139 <Method float Math.abs(float)>
	//   68  119:putfield        #147 <Field float w>
	//   69  122:return          
	}

	public void i(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
		{
			b(0.0F);
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:invokevirtual   #152 <Method void b(float)>
			return;
	//    5    9:return          
		} else
		{
			w();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #154 <Method void w()>
			return;
	//    8   14:return          
		}
	}

	public b j()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field lp$b K>
	//    2    4:areturn         
	}

	public void o(float f)
	{
		G = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #45  <Field float G>
	//    3    5:return          
	}

	protected boolean B;
	protected boolean C;
	protected float E;
	protected float F;
	protected float G;
	protected float H;
	protected float I;
	private boolean J;
	private b K;
	private c L;
	private boolean M;
	protected int j;
}

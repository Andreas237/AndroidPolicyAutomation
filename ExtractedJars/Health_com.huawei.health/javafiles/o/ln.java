// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lh, oc

public class ln extends lh
{
	public static final class e extends Enum
	{

		public static e valueOf(String s)
		{
			return (e)Enum.valueOf(o/ln$e, s);
		//    0    0:ldc1            #2   <Class ln$e>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ln$e>
		//    4    9:areturn         
		}

		public static e[] values()
		{
			return (e[])((e []) (f)).clone();
		//    0    0:getstatic       #43  <Field ln$e[] f>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lo.ln$e_3B_.clone()>
		//    2    6:checkcast       #54  <Class ln$e[]>
		//    3    9:areturn         
		}

		public static final e a;
		public static final e b;
		public static final e c;
		public static final e d;
		public static final e e;
		private static final e f[];

		static 
		{
			d = new e("TOP", 0);
		//    0    0:new             #2   <Class ln$e>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "TOP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void ln$e(String, int)>
		//    5   10:putstatic       #25  <Field ln$e d>
			e = new e("BOTTOM", 1);
		//    6   13:new             #2   <Class ln$e>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "BOTTOM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void ln$e(String, int)>
		//   11   23:putstatic       #29  <Field ln$e e>
			a = new e("BOTH_SIDED", 2);
		//   12   26:new             #2   <Class ln$e>
		//   13   29:dup             
		//   14   30:ldc1            #31  <String "BOTH_SIDED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void ln$e(String, int)>
		//   17   36:putstatic       #33  <Field ln$e a>
			c = new e("TOP_INSIDE", 3);
		//   18   39:new             #2   <Class ln$e>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "TOP_INSIDE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void ln$e(String, int)>
		//   23   49:putstatic       #37  <Field ln$e c>
			b = new e("BOTTOM_INSIDE", 4);
		//   24   52:new             #2   <Class ln$e>
		//   25   55:dup             
		//   26   56:ldc1            #39  <String "BOTTOM_INSIDE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void ln$e(String, int)>
		//   29   62:putstatic       #41  <Field ln$e b>
			f = (new e[] {
				d, e, a, c, b
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       e[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field ln$e d>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #29  <Field ln$e e>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #33  <Field ln$e a>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #37  <Field ln$e c>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #41  <Field ln$e b>
		//   51   98:aastore         
		//   52   99:putstatic       #43  <Field ln$e[] f>
		//*  53  102:return          
		}

		private e(String s, int k)
		{
			super(s, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ln()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void lh()>
		C = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field int C>
		j = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #25  <Field int j>
		B = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #27  <Field int B>
		I = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #29  <Field int I>
		H = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #31  <Field float H>
		G = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #33  <Field boolean G>
		E = e.d;
	//   20   34:aload_0         
	//   21   35:getstatic       #36  <Field ln$e ln$e.d>
	//   22   38:putfield        #38  <Field ln$e E>
		z = oc.b(4F);
	//   23   41:aload_0         
	//   24   42:ldc1            #39  <Float 4F>
	//   25   44:invokestatic    #45  <Method float oc.b(float)>
	//   26   47:putfield        #48  <Field float z>
	//   27   50:return          
	}

	public float C()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float H>
	//    2    4:freturn         
	}

	public boolean D()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean G>
	//    2    4:ireturn         
	}

	public void b(e e1)
	{
		E = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field ln$e E>
	//    3    5:return          
	}

	public void i(boolean flag)
	{
		G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean G>
	//    3    5:return          
	}

	public e j()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ln$e E>
	//    2    4:areturn         
	}

	public int B;
	public int C;
	private e E;
	private boolean G;
	protected float H;
	public int I;
	public int j;
}

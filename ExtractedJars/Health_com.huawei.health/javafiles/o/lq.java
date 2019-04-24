// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.DashPathEffect;

// Referenced classes of package o:
//			lj

public class lq extends lj
{
	public static final class e extends Enum
	{

		public static e valueOf(String s)
		{
			return (e)Enum.valueOf(o/lq$e, s);
		//    0    0:ldc1            #2   <Class lq$e>
		//    1    2:aload_0         
		//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lq$e>
		//    4    9:areturn         
		}

		public static e[] values()
		{
			return (e[])((e []) (d)).clone();
		//    0    0:getstatic       #38  <Field lq$e[] d>
		//    1    3:invokevirtual   #53  <Method Object _5B_Lo.lq$e_3B_.clone()>
		//    2    6:checkcast       #49  <Class lq$e[]>
		//    3    9:areturn         
		}

		public static final e a;
		public static final e b;
		public static final e c;
		private static final e d[];
		public static final e e;

		static 
		{
			c = new e("LEFT_TOP", 0);
		//    0    0:new             #2   <Class lq$e>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LEFT_TOP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void lq$e(String, int)>
		//    5   10:putstatic       #24  <Field lq$e c>
			e = new e("LEFT_BOTTOM", 1);
		//    6   13:new             #2   <Class lq$e>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "LEFT_BOTTOM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void lq$e(String, int)>
		//   11   23:putstatic       #28  <Field lq$e e>
			b = new e("RIGHT_TOP", 2);
		//   12   26:new             #2   <Class lq$e>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "RIGHT_TOP">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void lq$e(String, int)>
		//   17   36:putstatic       #32  <Field lq$e b>
			a = new e("RIGHT_BOTTOM", 3);
		//   18   39:new             #2   <Class lq$e>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "RIGHT_BOTTOM">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void lq$e(String, int)>
		//   23   49:putstatic       #36  <Field lq$e a>
			d = (new e[] {
				c, e, b, a
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       e[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field lq$e c>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #28  <Field lq$e e>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field lq$e b>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #36  <Field lq$e a>
		//   41   79:aastore         
		//   42   80:putstatic       #38  <Field lq$e[] d>
		//*  43   83:return          
		}

		private e(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public DashPathEffect a()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DashPathEffect g>
	//    2    4:areturn         
	}

	public int b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int d>
	//    2    4:ireturn         
	}

	public android.graphics.Paint.Style c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field android.graphics.Paint$Style a>
	//    2    4:areturn         
	}

	public float d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float c>
	//    2    4:freturn         
	}

	public float e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float e>
	//    2    4:freturn         
	}

	public String f()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String b>
	//    2    4:areturn         
	}

	public e k()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field lq$e i>
	//    2    4:areturn         
	}

	private android.graphics.Paint.Style a;
	private String b;
	private float c;
	private int d;
	private float e;
	private DashPathEffect g;
	private e i;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			lz, na, mc, mj

public class ly extends lz
	implements na
{
	public static final class c extends Enum
	{

		public static c valueOf(String s)
		{
			return (c)Enum.valueOf(o/ly$c, s);
		//    0    0:ldc1            #2   <Class ly$c>
		//    1    2:aload_0         
		//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ly$c>
		//    4    9:areturn         
		}

		public static c[] values()
		{
			return (c[])((c []) (e)).clone();
		//    0    0:getstatic       #38  <Field ly$c[] e>
		//    1    3:invokevirtual   #53  <Method Object _5B_Lo.ly$c_3B_.clone()>
		//    2    6:checkcast       #49  <Class ly$c[]>
		//    3    9:areturn         
		}

		public static final c a;
		public static final c b;
		public static final c c;
		public static final c d;
		private static final c e[];

		static 
		{
			b = new c("LINEAR", 0);
		//    0    0:new             #2   <Class ly$c>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LINEAR">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ly$c(String, int)>
		//    5   10:putstatic       #24  <Field ly$c b>
			c = new c("STEPPED", 1);
		//    6   13:new             #2   <Class ly$c>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "STEPPED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ly$c(String, int)>
		//   11   23:putstatic       #28  <Field ly$c c>
			a = new c("CUBIC_BEZIER", 2);
		//   12   26:new             #2   <Class ly$c>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "CUBIC_BEZIER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ly$c(String, int)>
		//   17   36:putstatic       #32  <Field ly$c a>
			d = new c("HORIZONTAL_BEZIER", 3);
		//   18   39:new             #2   <Class ly$c>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "HORIZONTAL_BEZIER">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ly$c(String, int)>
		//   23   49:putstatic       #36  <Field ly$c d>
			e = (new c[] {
				b, c, a, d
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       c[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ly$c b>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #28  <Field ly$c c>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field ly$c a>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #36  <Field ly$c d>
		//   41   79:aastore         
		//   42   80:putstatic       #38  <Field ly$c[] e>
		//*  43   83:return          
		}

		private c(String s, int l)
		{
			super(s, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ly(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void lz(List, String)>
		y = c.b;
	//    4    6:aload_0         
	//    5    7:getstatic       #34  <Field ly$c ly$c.b>
	//    6   10:putfield        #36  <Field ly$c y>
		w = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #38  <Field List w>
		z = -1;
	//   10   18:aload_0         
	//   11   19:iconst_m1       
	//   12   20:putfield        #40  <Field int z>
		j = 8F;
	//   13   23:aload_0         
	//   14   24:ldc1            #41  <Float 8F>
	//   15   26:putfield        #43  <Field float j>
		A = 4F;
	//   16   29:aload_0         
	//   17   30:ldc1            #44  <Float 4F>
	//   18   32:putfield        #46  <Field float A>
		B = 0.2F;
	//   19   35:aload_0         
	//   20   36:ldc1            #47  <Float 0.2F>
	//   21   38:putfield        #49  <Field float B>
		C = null;
	//   22   41:aload_0         
	//   23   42:aconst_null     
	//   24   43:putfield        #51  <Field DashPathEffect C>
		D = ((mj) (new mc()));
	//   25   46:aload_0         
	//   26   47:new             #53  <Class mc>
	//   27   50:dup             
	//   28   51:invokespecial   #56  <Method void mc()>
	//   29   54:putfield        #58  <Field mj D>
		F = true;
	//   30   57:aload_0         
	//   31   58:iconst_1        
	//   32   59:putfield        #60  <Field boolean F>
		G = true;
	//   33   62:aload_0         
	//   34   63:iconst_1        
	//   35   64:putfield        #62  <Field boolean G>
		if(w == null)
	//*  36   67:aload_0         
	//*  37   68:getfield        #38  <Field List w>
	//*  38   71:ifnonnull       85
			w = ((List) (new ArrayList()));
	//   39   74:aload_0         
	//   40   75:new             #64  <Class ArrayList>
	//   41   78:dup             
	//   42   79:invokespecial   #65  <Method void ArrayList()>
	//   43   82:putfield        #38  <Field List w>
		w.clear();
	//   44   85:aload_0         
	//   45   86:getfield        #38  <Field List w>
	//   46   89:invokeinterface #70  <Method void List.clear()>
		w.add(((Object) (Integer.valueOf(Color.rgb(140, 234, 255)))));
	//   47   94:aload_0         
	//   48   95:getfield        #38  <Field List w>
	//   49   98:sipush          140
	//   50  101:sipush          234
	//   51  104:sipush          255
	//   52  107:invokestatic    #76  <Method int Color.rgb(int, int, int)>
	//   53  110:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   54  113:invokeinterface #86  <Method boolean List.add(Object)>
	//   55  118:pop             
	//   56  119:return          
	}

	public void J()
	{
		if(w == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field List w>
	//*   2    4:ifnonnull       18
			w = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #64  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void ArrayList()>
	//    7   15:putfield        #38  <Field List w>
		w.clear();
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field List w>
	//   10   22:invokeinterface #70  <Method void List.clear()>
	//   11   27:return          
	}

	public int K()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int z>
	//    2    4:ireturn         
	}

	public boolean L()
	{
		return y == c.c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ly$c y>
	//    2    4:getstatic       #97  <Field ly$c ly$c.c>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean M()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean F>
	//    2    4:ireturn         
	}

	public int N()
	{
		return w.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List w>
	//    2    4:invokeinterface #103 <Method int List.size()>
	//    3    9:ireturn         
	}

	public boolean P()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean G>
	//    2    4:ireturn         
	}

	public mj R()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field mj D>
	//    2    4:areturn         
	}

	public c a()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ly$c y>
	//    2    4:areturn         
	}

	public void a(boolean flag)
	{
		F = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean F>
	//    3    5:return          
	}

	public float b()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float A>
	//    2    4:freturn         
	}

	public void b(boolean flag)
	{
		G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean G>
	//    3    5:return          
	}

	public void c()
	{
		C = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #51  <Field DashPathEffect C>
	//    3    5:return          
	}

	public float d()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float B>
	//    2    4:freturn         
	}

	public void d(float f, float f1, float f2)
	{
		C = new DashPathEffect(new float[] {
			f, f1
		}, f2);
	//    0    0:aload_0         
	//    1    1:new             #114 <Class DashPathEffect>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:fload_1         
	//    8   11:fastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:fastore         
	//   13   16:fload_3         
	//   14   17:invokespecial   #117 <Method void DashPathEffect(float[], float)>
	//   15   20:putfield        #51  <Field DashPathEffect C>
	//   16   23:return          
	}

	public float e()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float j>
	//    2    4:freturn         
	}

	public boolean g()
	{
		return C != null;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DashPathEffect C>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public DashPathEffect h()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DashPathEffect C>
	//    2    4:areturn         
	}

	public void i(int l)
	{
		J();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method void J()>
		w.add(((Object) (Integer.valueOf(l))));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field List w>
	//    4    8:iload_1         
	//    5    9:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//    6   12:invokeinterface #86  <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public int k(int l)
	{
		return ((Integer)w.get(l)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List w>
	//    2    4:iload_1         
	//    3    5:invokeinterface #131 <Method Object List.get(int)>
	//    4   10:checkcast       #78  <Class Integer>
	//    5   13:invokevirtual   #134 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	private float A;
	private float B;
	private DashPathEffect C;
	private mj D;
	private boolean F;
	private boolean G;
	private float j;
	private List w;
	private c y;
	private int z;
}

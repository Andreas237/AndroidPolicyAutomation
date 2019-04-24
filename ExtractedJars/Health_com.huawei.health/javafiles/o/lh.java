// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			lj, oc, md, mf

public abstract class lh extends lj
{

	public lh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void lj()>
		j = 0xff888888;
	//    2    4:aload_0         
	//    3    5:ldc1            #43  <Int 0xff888888>
	//    4    7:putfield        #45  <Field int j>
		C = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #47  <Field float C>
		B = 0xff888888;
	//    8   15:aload_0         
	//    9   16:ldc1            #43  <Int 0xff888888>
	//   10   18:putfield        #49  <Field int B>
		I = 1.0F;
	//   11   21:aload_0         
	//   12   22:fconst_1        
	//   13   23:putfield        #51  <Field float I>
		a = new float[0];
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:newarray        float[]
	//   17   30:putfield        #53  <Field float[] a>
		c = new float[0];
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:newarray        float[]
	//   21   37:putfield        #55  <Field float[] c>
		E = 6;
	//   22   40:aload_0         
	//   23   41:bipush          6
	//   24   43:putfield        #57  <Field int E>
		k = 1.0F;
	//   25   46:aload_0         
	//   26   47:fconst_1        
	//   27   48:putfield        #59  <Field float k>
		h = false;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #61  <Field boolean h>
		f = false;
	//   31   56:aload_0         
	//   32   57:iconst_0        
	//   33   58:putfield        #63  <Field boolean f>
		g = true;
	//   34   61:aload_0         
	//   35   62:iconst_1        
	//   36   63:putfield        #65  <Field boolean g>
		i = true;
	//   37   66:aload_0         
	//   38   67:iconst_1        
	//   39   68:putfield        #67  <Field boolean i>
		l = true;
	//   40   71:aload_0         
	//   41   72:iconst_1        
	//   42   73:putfield        #69  <Field boolean l>
		n = false;
	//   43   76:aload_0         
	//   44   77:iconst_0        
	//   45   78:putfield        #71  <Field boolean n>
		H = null;
	//   46   81:aload_0         
	//   47   82:aconst_null     
	//   48   83:putfield        #73  <Field DashPathEffect H>
		F = null;
	//   49   86:aload_0         
	//   50   87:aconst_null     
	//   51   88:putfield        #75  <Field DashPathEffect F>
		o = false;
	//   52   91:aload_0         
	//   53   92:iconst_0        
	//   54   93:putfield        #77  <Field boolean o>
		p = 0.0F;
	//   55   96:aload_0         
	//   56   97:fconst_0        
	//   57   98:putfield        #79  <Field float p>
		r = 0.0F;
	//   58  101:aload_0         
	//   59  102:fconst_0        
	//   60  103:putfield        #81  <Field float r>
		t = false;
	//   61  106:aload_0         
	//   62  107:iconst_0        
	//   63  108:putfield        #83  <Field boolean t>
		s = false;
	//   64  111:aload_0         
	//   65  112:iconst_0        
	//   66  113:putfield        #85  <Field boolean s>
		u = 0.0F;
	//   67  116:aload_0         
	//   68  117:fconst_0        
	//   69  118:putfield        #87  <Field float u>
		q = 0.0F;
	//   70  121:aload_0         
	//   71  122:fconst_0        
	//   72  123:putfield        #89  <Field float q>
		w = 0.0F;
	//   73  126:aload_0         
	//   74  127:fconst_0        
	//   75  128:putfield        #91  <Field float w>
		D = oc.b(10F);
	//   76  131:aload_0         
	//   77  132:ldc1            #92  <Float 10F>
	//   78  134:invokestatic    #97  <Method float oc.b(float)>
	//   79  137:putfield        #100 <Field float D>
		y = oc.b(5F);
	//   80  140:aload_0         
	//   81  141:ldc1            #101 <Float 5F>
	//   82  143:invokestatic    #97  <Method float oc.b(float)>
	//   83  146:putfield        #104 <Field float y>
		z = oc.b(5F);
	//   84  149:aload_0         
	//   85  150:ldc1            #101 <Float 5F>
	//   86  152:invokestatic    #97  <Method float oc.b(float)>
	//   87  155:putfield        #107 <Field float z>
		m = ((List) (new ArrayList()));
	//   88  158:aload_0         
	//   89  159:new             #109 <Class ArrayList>
	//   90  162:dup             
	//   91  163:invokespecial   #110 <Method void ArrayList()>
	//   92  166:putfield        #112 <Field List m>
	//   93  169:return          
	}

	public int a()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int j>
	//    2    4:ireturn         
	}

	public void a(float f1)
	{
		s = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #85  <Field boolean s>
		u = f1;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #87  <Field float u>
		w = Math.abs(f1 - q);
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #89  <Field float q>
	//   10   16:fsub            
	//   11   17:invokestatic    #120 <Method float Math.abs(float)>
	//   12   20:putfield        #91  <Field float w>
	//   13   23:return          
	}

	public void a(int i1)
	{
		B = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int B>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean i>
	//    3    5:return          
	}

	public void b(float f1)
	{
		t = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #83  <Field boolean t>
		q = f1;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #89  <Field float q>
		w = Math.abs(u - f1);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #87  <Field float u>
	//    9   15:fload_1         
	//   10   16:fsub            
	//   11   17:invokestatic    #120 <Method float Math.abs(float)>
	//   12   20:putfield        #91  <Field float w>
	//   13   23:return          
	}

	public void b(mf mf1)
	{
		if(mf1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       20
		{
			b = ((mf) (new md(e)));
	//    2    4:aload_0         
	//    3    5:new             #125 <Class md>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #127 <Field int e>
	//    7   13:invokespecial   #129 <Method void md(int)>
	//    8   16:putfield        #131 <Field mf b>
			return;
	//    9   19:return          
		} else
		{
			b = mf1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #131 <Field mf b>
			return;
	//   13   25:return          
		}
	}

	public void b(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean g>
	//    3    5:return          
	}

	public boolean b()
	{
		return n && d > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean n>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #134 <Field int d>
	//    5   11:ifle            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void c(float f1)
	{
		I = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #97  <Method float oc.b(float)>
	//    3    5:putfield        #51  <Field float I>
	//    4    8:return          
	}

	public void c(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 > 25)
	//*   2    2:iload_1         
	//*   3    3:bipush          25
	//*   4    5:icmple          11
			j1 = 25;
	//    5    8:bipush          25
	//    6   10:istore_2        
		i1 = j1;
	//    7   11:iload_2         
	//    8   12:istore_1        
		if(j1 < 2)
	//*   9   13:iload_2         
	//*  10   14:iconst_2        
	//*  11   15:icmpge          20
			i1 = 2;
	//   12   18:iconst_2        
	//   13   19:istore_1        
		E = i1;
	//   14   20:aload_0         
	//   15   21:iload_1         
	//   16   22:putfield        #57  <Field int E>
		f = false;
	//   17   25:aload_0         
	//   18   26:iconst_0        
	//   19   27:putfield        #63  <Field boolean f>
	//   20   30:return          
	}

	public void c(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean o>
	//    3    5:return          
	}

	public boolean c()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean i>
	//    2    4:ireturn         
	}

	public float d()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float I>
	//    2    4:freturn         
	}

	public String d(int i1)
	{
		if(i1 < 0 || i1 >= a.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field float[] a>
	//*   5    9:arraylength     
	//*   6   10:icmplt          16
			return "";
	//    7   13:ldc1            #138 <String "">
	//    8   15:areturn         
		else
			return r().b(a[i1], this);
	//    9   16:aload_0         
	//   10   17:invokevirtual   #141 <Method mf r()>
	//   11   20:aload_0         
	//   12   21:getfield        #53  <Field float[] a>
	//   13   24:iload_1         
	//   14   25:faload          
	//   15   26:aload_0         
	//   16   27:invokeinterface #146 <Method String mf.b(float, lh)>
	//   17   32:areturn         
	}

	public void d(float f1)
	{
		k = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #59  <Field float k>
		h = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #61  <Field boolean h>
	//    6   10:return          
	}

	public void d(float f1, float f2)
	{
		if(t)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean t>
	//*   2    4:ifeq            15
			f1 = q;
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field float q>
	//    5   11:fstore_1        
		else
	//*   6   12:goto            22
			f1 -= p;
	//    7   15:fload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field float p>
	//   10   20:fsub            
	//   11   21:fstore_1        
		if(s)
	//*  12   22:aload_0         
	//*  13   23:getfield        #85  <Field boolean s>
	//*  14   26:ifeq            37
			f2 = u;
	//   15   29:aload_0         
	//   16   30:getfield        #87  <Field float u>
	//   17   33:fstore_2        
		else
	//*  18   34:goto            44
			f2 += r;
	//   19   37:fload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #81  <Field float r>
	//   22   42:fadd            
	//   23   43:fstore_2        
		float f4 = f1;
	//   24   44:fload_1         
	//   25   45:fstore          4
		float f3 = f2;
	//   26   47:fload_2         
	//   27   48:fstore_3        
		if(Math.abs(f2 - f1) == 0.0F)
	//*  28   49:fload_2         
	//*  29   50:fload_1         
	//*  30   51:fsub            
	//*  31   52:invokestatic    #120 <Method float Math.abs(float)>
	//*  32   55:fconst_0        
	//*  33   56:fcmpl           
	//*  34   57:ifne            69
		{
			f3 = f2 + 1.0F;
	//   35   60:fload_2         
	//   36   61:fconst_1        
	//   37   62:fadd            
	//   38   63:fstore_3        
			f4 = f1 - 1.0F;
	//   39   64:fload_1         
	//   40   65:fconst_1        
	//   41   66:fsub            
	//   42   67:fstore          4
		}
		q = f4;
	//   43   69:aload_0         
	//   44   70:fload           4
	//   45   72:putfield        #89  <Field float q>
		u = f3;
	//   46   75:aload_0         
	//   47   76:fload_3         
	//   48   77:putfield        #87  <Field float u>
		w = Math.abs(f3 - f4);
	//   49   80:aload_0         
	//   50   81:fload_3         
	//   51   82:fload           4
	//   52   84:fsub            
	//   53   85:invokestatic    #120 <Method float Math.abs(float)>
	//   54   88:putfield        #91  <Field float w>
	//   55   91:return          
	}

	public void d(int i1, boolean flag)
	{
		c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #150 <Method void c(int)>
		f = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #63  <Field boolean f>
	//    6   10:return          
	}

	public void e(float f1)
	{
		C = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #97  <Method float oc.b(float)>
	//    3    5:putfield        #47  <Field float C>
	//    4    8:return          
	}

	public void e(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int j>
	//    3    5:return          
	}

	public void e(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean l>
	//    3    5:return          
	}

	public boolean e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean g>
	//    2    4:ireturn         
	}

	public int f()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int E>
	//    2    4:ireturn         
	}

	public boolean g()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean l>
	//    2    4:ireturn         
	}

	public void h(float f1)
	{
		p = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #79  <Field float p>
	//    3    5:return          
	}

	public boolean h()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean f>
	//    2    4:ireturn         
	}

	public float i()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float C>
	//    2    4:freturn         
	}

	public void i(float f1)
	{
		r = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #81  <Field float r>
	//    3    5:return          
	}

	public int k()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int B>
	//    2    4:ireturn         
	}

	public List l()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field List m>
	//    2    4:areturn         
	}

	public boolean m()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean h>
	//    2    4:ireturn         
	}

	public String n()
	{
		String s1 = "";
	//    0    0:ldc1            #138 <String "">
	//    1    2:astore_2        
		for(int i1 = 0; i1 < a.length;)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #53  <Field float[] a>
	//*   7   10:arraylength     
	//*   8   11:icmpge          54
		{
			String s3 = d(i1);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:invokevirtual   #156 <Method String d(int)>
	//   12   19:astore          4
			String s2 = s1;
	//   13   21:aload_2         
	//   14   22:astore_3        
			if(s3 != null)
	//*  15   23:aload           4
	//*  16   25:ifnull          45
			{
				s2 = s1;
	//   17   28:aload_2         
	//   18   29:astore_3        
				if(s1.length() < s3.length())
	//*  19   30:aload_2         
	//*  20   31:invokevirtual   #161 <Method int String.length()>
	//*  21   34:aload           4
	//*  22   36:invokevirtual   #161 <Method int String.length()>
	//*  23   39:icmpge          45
					s2 = s3;
	//   24   42:aload           4
	//   25   44:astore_3        
			}
			i1++;
	//   26   45:iload_1         
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore_1        
			s1 = s2;
	//   30   49:aload_3         
	//   31   50:astore_2        
		}

	//*  32   51:goto            5
		return s1;
	//   33   54:aload_2         
	//   34   55:areturn         
	}

	public boolean o()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean o>
	//    2    4:ireturn         
	}

	public float p()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float k>
	//    2    4:freturn         
	}

	public float q()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field float u>
	//    2    4:freturn         
	}

	public mf r()
	{
		if(b == null || (b instanceof md) && ((md)b).a() != e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field mf b>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field mf b>
	//*   5   11:instanceof      #125 <Class md>
	//*   6   14:ifeq            49
	//*   7   17:aload_0         
	//*   8   18:getfield        #131 <Field mf b>
	//*   9   21:checkcast       #125 <Class md>
	//*  10   24:invokevirtual   #163 <Method int md.a()>
	//*  11   27:aload_0         
	//*  12   28:getfield        #127 <Field int e>
	//*  13   31:icmpeq          49
			b = ((mf) (new md(e)));
	//   14   34:aload_0         
	//   15   35:new             #125 <Class md>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #127 <Field int e>
	//   19   43:invokespecial   #129 <Method void md(int)>
	//   20   46:putfield        #131 <Field mf b>
		return b;
	//   21   49:aload_0         
	//   22   50:getfield        #131 <Field mf b>
	//   23   53:areturn         
	}

	public float s()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field float q>
	//    2    4:freturn         
	}

	public DashPathEffect t()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field DashPathEffect F>
	//    2    4:areturn         
	}

	public DashPathEffect u()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field DashPathEffect H>
	//    2    4:areturn         
	}

	public void w()
	{
		t = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #83  <Field boolean t>
	//    3    5:return          
	}

	private int B;
	private float C;
	private int E;
	private DashPathEffect F;
	private DashPathEffect H;
	private float I;
	public float a[];
	protected mf b;
	public float c[];
	public int d;
	public int e;
	protected boolean f;
	protected boolean g;
	protected boolean h;
	protected boolean i;
	private int j;
	protected float k;
	protected boolean l;
	protected List m;
	protected boolean n;
	protected boolean o;
	protected float p;
	public float q;
	protected float r;
	protected boolean s;
	protected boolean t;
	public float u;
	public float w;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			mz, nz, oc, ml

public abstract class lu
	implements mz
{

	public lu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field List b>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #42  <Field List c>
		e = "DataSet";
	//    8   14:aload_0         
	//    9   15:ldc1            #44  <String "DataSet">
	//   10   17:putfield        #46  <Field String e>
		d = lp.b.b;
	//   11   20:aload_0         
	//   12   21:getstatic       #50  <Field lp$b lp$b.b>
	//   13   24:putfield        #52  <Field lp$b d>
		a = true;
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:putfield        #54  <Field boolean a>
		p = lm.c.e;
	//   17   32:aload_0         
	//   18   33:getstatic       #58  <Field lm$c lm$c.e>
	//   19   36:putfield        #60  <Field lm$c p>
		m = (0.0F / 0.0F);
	//   20   39:aload_0         
	//   21   40:ldc1            #61  <Float (0.0F / 0.0F)>
	//   22   42:putfield        #63  <Field float m>
		l = (0.0F / 0.0F);
	//   23   45:aload_0         
	//   24   46:ldc1            #61  <Float (0.0F / 0.0F)>
	//   25   48:putfield        #65  <Field float l>
		q = null;
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:putfield        #67  <Field DashPathEffect q>
		g = true;
	//   29   56:aload_0         
	//   30   57:iconst_1        
	//   31   58:putfield        #69  <Field boolean g>
		k = true;
	//   32   61:aload_0         
	//   33   62:iconst_1        
	//   34   63:putfield        #71  <Field boolean k>
		h = new nz();
	//   35   66:aload_0         
	//   36   67:new             #73  <Class nz>
	//   37   70:dup             
	//   38   71:invokespecial   #74  <Method void nz()>
	//   39   74:putfield        #76  <Field nz h>
		n = 17F;
	//   40   77:aload_0         
	//   41   78:ldc1            #77  <Float 17F>
	//   42   80:putfield        #79  <Field float n>
		o = true;
	//   43   83:aload_0         
	//   44   84:iconst_1        
	//   45   85:putfield        #81  <Field boolean o>
		b = ((List) (new ArrayList()));
	//   46   88:aload_0         
	//   47   89:new             #83  <Class ArrayList>
	//   48   92:dup             
	//   49   93:invokespecial   #84  <Method void ArrayList()>
	//   50   96:putfield        #40  <Field List b>
		c = ((List) (new ArrayList()));
	//   51   99:aload_0         
	//   52  100:new             #83  <Class ArrayList>
	//   53  103:dup             
	//   54  104:invokespecial   #84  <Method void ArrayList()>
	//   55  107:putfield        #42  <Field List c>
		b.add(((Object) (Integer.valueOf(Color.rgb(140, 234, 255)))));
	//   56  110:aload_0         
	//   57  111:getfield        #40  <Field List b>
	//   58  114:sipush          140
	//   59  117:sipush          234
	//   60  120:sipush          255
	//   61  123:invokestatic    #90  <Method int Color.rgb(int, int, int)>
	//   62  126:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   63  129:invokeinterface #102 <Method boolean List.add(Object)>
	//   64  134:pop             
		c.add(((Object) (Integer.valueOf(0xff000000))));
	//   65  135:aload_0         
	//   66  136:getfield        #42  <Field List c>
	//   67  139:ldc1            #103 <Int 0xff000000>
	//   68  141:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   69  144:invokeinterface #102 <Method boolean List.add(Object)>
	//   70  149:pop             
	//   71  150:return          
	}

	public lu(String s1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void lu()>
		e = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field String e>
	//    5    9:return          
	}

	public lp.b D()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field lp$b d>
	//    2    4:areturn         
	}

	public void a(float f1)
	{
		l = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #65  <Field float l>
	//    3    5:return          
	}

	public void a(int i1)
	{
		c.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List c>
	//    2    4:invokeinterface #113 <Method void List.clear()>
		c.add(((Object) (Integer.valueOf(i1))));
	//    3    9:aload_0         
	//    4   10:getfield        #42  <Field List c>
	//    5   13:iload_1         
	//    6   14:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//    7   17:invokeinterface #102 <Method boolean List.add(Object)>
	//    8   22:pop             
	//    9   23:return          
	}

	public void a(List list)
	{
		b = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field List b>
	//    3    5:return          
	}

	public int b(int i1)
	{
		return ((Integer)c.get(i1 % c.size())).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List c>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field List c>
	//    5    9:invokeinterface #121 <Method int List.size()>
	//    6   14:irem            
	//    7   15:invokeinterface #125 <Method Object List.get(int)>
	//    8   20:checkcast       #92  <Class Integer>
	//    9   23:invokevirtual   #128 <Method int Integer.intValue()>
	//   10   26:ireturn         
	}

	public void b(float f1)
	{
		m = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #63  <Field float m>
	//    3    5:return          
	}

	public void b(DashPathEffect dashpatheffect)
	{
		q = dashpatheffect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field DashPathEffect q>
	//    3    5:return          
	}

	public void b(ml ml)
	{
		if(ml == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			f = ml;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #132 <Field ml f>
			return;
	//    6   10:return          
		}
	}

	public void c(int i1)
	{
		p();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method void p()>
		b.add(((Object) (Integer.valueOf(i1))));
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field List b>
	//    4    8:iload_1         
	//    5    9:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//    6   12:invokeinterface #102 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void c(lm.c c1)
	{
		p = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field lm$c p>
	//    3    5:return          
	}

	public void c(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean g>
	//    3    5:return          
	}

	public void d(float f1)
	{
		n = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #141 <Method float oc.b(float)>
	//    3    5:putfield        #79  <Field float n>
	//    4    8:return          
	}

	public int e(int i1)
	{
		return ((Integer)b.get(i1 % b.size())).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List b>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field List b>
	//    5    9:invokeinterface #121 <Method int List.size()>
	//    6   14:irem            
	//    7   15:invokeinterface #125 <Method Object List.get(int)>
	//    8   20:checkcast       #92  <Class Integer>
	//    9   23:invokevirtual   #128 <Method int Integer.intValue()>
	//   10   26:ireturn         
	}

	public void e(boolean flag)
	{
		k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean k>
	//    3    5:return          
	}

	public void i()
	{
		B();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method void B()>
	//    2    4:return          
	}

	public boolean j()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean o>
	//    2    4:ireturn         
	}

	public List k()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List b>
	//    2    4:areturn         
	}

	public ml l()
	{
		if(t())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #152 <Method boolean t()>
	//*   2    4:ifeq            11
			return oc.c();
	//    3    7:invokestatic    #154 <Method ml oc.c()>
	//    4   10:areturn         
		else
			return f;
	//    5   11:aload_0         
	//    6   12:getfield        #132 <Field ml f>
	//    7   15:areturn         
	}

	public int m()
	{
		return ((Integer)b.get(0)).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field List b>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #125 <Method Object List.get(int)>
	//    4   10:checkcast       #92  <Class Integer>
	//    5   13:invokevirtual   #128 <Method int Integer.intValue()>
	//    6   16:ireturn         
	}

	public boolean n()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean a>
	//    2    4:ireturn         
	}

	public String o()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String e>
	//    2    4:areturn         
	}

	public void p()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field List b>
	//*   2    4:ifnonnull       18
			b = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #83  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #84  <Method void ArrayList()>
	//    7   15:putfield        #40  <Field List b>
		b.clear();
	//    8   18:aload_0         
	//    9   19:getfield        #40  <Field List b>
	//   10   22:invokeinterface #113 <Method void List.clear()>
	//   11   27:return          
	}

	public lm.c q()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field lm$c p>
	//    2    4:areturn         
	}

	public Typeface r()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Typeface i>
	//    2    4:areturn         
	}

	public float s()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field float n>
	//    2    4:freturn         
	}

	public boolean t()
	{
		return f == null;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field ml f>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public float u()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float m>
	//    2    4:freturn         
	}

	public boolean v()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean g>
	//    2    4:ireturn         
	}

	public float w()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field float l>
	//    2    4:freturn         
	}

	public boolean x()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean k>
	//    2    4:ireturn         
	}

	public DashPathEffect y()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field DashPathEffect q>
	//    2    4:areturn         
	}

	public nz z()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field nz h>
	//    2    4:areturn         
	}

	protected boolean a;
	protected List b;
	protected List c;
	protected lp.b d;
	private String e;
	protected transient ml f;
	protected boolean g;
	protected nz h;
	protected Typeface i;
	protected boolean k;
	private float l;
	private float m;
	protected float n;
	protected boolean o;
	private lm.c p;
	private DashPathEffect q;
}

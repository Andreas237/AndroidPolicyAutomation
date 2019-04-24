// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public class mh
{

	public mh(float f1, float f2, float f3, float f4, int j, int l, lp.b b1)
	{
		this(f1, f2, f3, f4, j, b1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:iload           5
	//    6    8:aload           7
	//    7   10:invokespecial   #22  <Method void mh(float, float, float, float, int, lp$b)>
		i = l;
	//    8   13:aload_0         
	//    9   14:iload           6
	//   10   16:putfield        #24  <Field int i>
	//   11   19:return          
	}

	public mh(float f1, float f2, float f3, float f4, int j, lp.b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #31  <Field float a>
		c = (0.0F / 0.0F);
	//    5   10:aload_0         
	//    6   11:ldc1            #29  <Float (0.0F / 0.0F)>
	//    7   13:putfield        #33  <Field float c>
		d = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #35  <Field int d>
		i = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #24  <Field int i>
		a = f1;
	//   14   26:aload_0         
	//   15   27:fload_1         
	//   16   28:putfield        #31  <Field float a>
		c = f2;
	//   17   31:aload_0         
	//   18   32:fload_2         
	//   19   33:putfield        #33  <Field float c>
		e = f3;
	//   20   36:aload_0         
	//   21   37:fload_3         
	//   22   38:putfield        #37  <Field float e>
		b = f4;
	//   23   41:aload_0         
	//   24   42:fload           4
	//   25   44:putfield        #39  <Field float b>
		f = j;
	//   26   47:aload_0         
	//   27   48:iload           5
	//   28   50:putfield        #41  <Field int f>
		h = b1;
	//   29   53:aload_0         
	//   30   54:aload           6
	//   31   56:putfield        #43  <Field lp$b h>
	//   32   59:return          
	}

	public mh(float f1, float f2, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = (0.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <Float (0.0F / 0.0F)>
	//    4    7:putfield        #31  <Field float a>
		c = (0.0F / 0.0F);
	//    5   10:aload_0         
	//    6   11:ldc1            #29  <Float (0.0F / 0.0F)>
	//    7   13:putfield        #33  <Field float c>
		d = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #35  <Field int d>
		i = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #24  <Field int i>
		a = f1;
	//   14   26:aload_0         
	//   15   27:fload_1         
	//   16   28:putfield        #31  <Field float a>
		c = f2;
	//   17   31:aload_0         
	//   18   32:fload_2         
	//   19   33:putfield        #33  <Field float c>
		f = j;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #41  <Field int f>
	//   23   41:return          
	}

	public mh(float f1, int j, int l)
	{
		this(f1, (0.0F / 0.0F), j);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #29  <Float (0.0F / 0.0F)>
	//    3    4:iload_2         
	//    4    5:invokespecial   #47  <Method void mh(float, float, int)>
		i = l;
	//    5    8:aload_0         
	//    6    9:iload_3         
	//    7   10:putfield        #24  <Field int i>
	//    8   13:return          
	}

	public int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int d>
	//    2    4:ireturn         
	}

	public void a(int j)
	{
		d = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int d>
	//    3    5:return          
	}

	public float b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float a>
	//    2    4:freturn         
	}

	public boolean b(mh mh1)
	{
		if(mh1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		return f == mh1.f && a == mh1.a && i == mh1.i && d == mh1.d;
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field int f>
	//    6   10:aload_1         
	//    7   11:getfield        #41  <Field int f>
	//    8   14:icmpne          53
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field float a>
	//   11   21:aload_1         
	//   12   22:getfield        #31  <Field float a>
	//   13   25:fcmpl           
	//   14   26:ifne            53
	//   15   29:aload_0         
	//   16   30:getfield        #24  <Field int i>
	//   17   33:aload_1         
	//   18   34:getfield        #24  <Field int i>
	//   19   37:icmpne          53
	//   20   40:aload_0         
	//   21   41:getfield        #35  <Field int d>
	//   22   44:aload_1         
	//   23   45:getfield        #35  <Field int d>
	//   24   48:icmpne          53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public float c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float e>
	//    2    4:freturn         
	}

	public float d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float c>
	//    2    4:freturn         
	}

	public float e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float b>
	//    2    4:freturn         
	}

	public void e(float f1, float f2)
	{
		k = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #54  <Field float k>
		g = f2;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #56  <Field float g>
	//    6   10:return          
	}

	public float f()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float k>
	//    2    4:freturn         
	}

	public int g()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int f>
	//    2    4:ireturn         
	}

	public float h()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float g>
	//    2    4:freturn         
	}

	public int i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int i>
	//    2    4:ireturn         
	}

	public lp.b k()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field lp$b h>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Highlight, x: ").append(a).append(", y: ").append(c).append(", dataSetIndex: ").append(f).append(", stackIndex (only stacked barentry): ").append(i).toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:ldc1            #64  <String "Highlight, x: ">
	//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #31  <Field float a>
	//    7   16:invokevirtual   #71  <Method StringBuilder StringBuilder.append(float)>
	//    8   19:ldc1            #73  <String ", y: ">
	//    9   21:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #33  <Field float c>
	//   12   28:invokevirtual   #71  <Method StringBuilder StringBuilder.append(float)>
	//   13   31:ldc1            #75  <String ", dataSetIndex: ">
	//   14   33:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #41  <Field int f>
	//   17   40:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #80  <String ", stackIndex (only stacked barentry): ">
	//   19   45:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #24  <Field int i>
	//   22   52:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   24   58:areturn         
	}

	private float a;
	private float b;
	private float c;
	private int d;
	private float e;
	private int f;
	private float g;
	private lp.b h;
	private int i;
	private float k;
}

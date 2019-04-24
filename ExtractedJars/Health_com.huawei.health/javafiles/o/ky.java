// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public abstract class ky
{

	public ky(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		b = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int b>
		c = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #23  <Field float c>
		a = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #25  <Field float a>
		d = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #27  <Field int d>
		k = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #29  <Field int k>
		b = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #21  <Field int b>
		e = new float[i];
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:newarray        float[]
	//   23   38:putfield        #31  <Field float[] e>
	//   24   41:return          
	}

	public int a()
	{
		return e.length;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float[] e>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public void b(float f, float f1)
	{
		c = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float c>
		a = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #25  <Field float a>
	//    6   10:return          
	}

	public void e()
	{
		b = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field int b>
	//    3    5:return          
	}

	protected float a;
	protected int b;
	protected float c;
	protected int d;
	public final float e[];
	protected int k;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Typeface;

// Referenced classes of package o:
//			oc

public abstract class lj
{

	public lj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		x = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #20  <Field boolean x>
		y = 5F;
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <Float 5F>
	//    7   12:putfield        #23  <Field float y>
		z = 5F;
	//    8   15:aload_0         
	//    9   16:ldc1            #21  <Float 5F>
	//   10   18:putfield        #25  <Field float z>
		v = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #27  <Field Typeface v>
		D = oc.b(10F);
	//   14   26:aload_0         
	//   15   27:ldc1            #28  <Float 10F>
	//   16   29:invokestatic    #34  <Method float oc.b(float)>
	//   17   32:putfield        #36  <Field float D>
		A = 0xff000000;
	//   18   35:aload_0         
	//   19   36:ldc1            #37  <Int 0xff000000>
	//   20   38:putfield        #39  <Field int A>
	//   21   41:return          
	}

	public int A()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int A>
	//    2    4:ireturn         
	}

	public boolean B()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean x>
	//    2    4:ireturn         
	}

	public void b(int i)
	{
		A = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int A>
	//    3    5:return          
	}

	public void d(boolean flag)
	{
		x = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field boolean x>
	//    3    5:return          
	}

	public void f(float f1)
	{
		y = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #34  <Method float oc.b(float)>
	//    3    5:putfield        #23  <Field float y>
	//    4    8:return          
	}

	public void g(float f1)
	{
		z = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #34  <Method float oc.b(float)>
	//    3    5:putfield        #25  <Field float z>
	//    4    8:return          
	}

	public void k(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 > 24F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #51  <Float 24F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f2 = 24F;
	//    6    9:ldc1            #51  <Float 24F>
	//    7   11:fstore_2        
		f1 = f2;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f2 < 6F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #52  <Float 6F>
	//*  12   17:fcmpg           
	//*  13   18:ifge            24
			f1 = 6F;
	//   14   21:ldc1            #52  <Float 6F>
	//   15   23:fstore_1        
		D = oc.b(f1);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:invokestatic    #34  <Method float oc.b(float)>
	//   19   29:putfield        #36  <Field float D>
	//   20   32:return          
	}

	public float v()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float y>
	//    2    4:freturn         
	}

	public Typeface x()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Typeface v>
	//    2    4:areturn         
	}

	public float y()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float z>
	//    2    4:freturn         
	}

	public float z()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float D>
	//    2    4:freturn         
	}

	protected int A;
	protected float D;
	protected Typeface v;
	protected boolean x;
	protected float y;
	protected float z;
}

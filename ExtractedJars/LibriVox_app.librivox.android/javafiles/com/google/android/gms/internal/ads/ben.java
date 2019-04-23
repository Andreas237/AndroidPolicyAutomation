// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ac, de

public final class ben
	implements ac
{

	public ben()
	{
		this(2500, 1, 1.0F);
	//    0    0:aload_0         
	//    1    1:sipush          2500
	//    2    4:iconst_1        
	//    3    5:fconst_1        
	//    4    6:invokespecial   #17  <Method void ben(int, int, float)>
	//    5    9:return          
	}

	private ben(int i, int j, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = 2500;
	//    2    4:aload_0         
	//    3    5:sipush          2500
	//    4    8:putfield        #22  <Field int a>
		c = 1;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #24  <Field int c>
		d = 1.0F;
	//    8   16:aload_0         
	//    9   17:fconst_1        
	//   10   18:putfield        #26  <Field float d>
	//   11   21:return          
	}

	public final int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int a>
	//    2    4:ireturn         
	}

	public final void a(de de)
	{
		int i = b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int b>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		b = i + 1;
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:iconst_1        
	//    8   10:iadd            
	//    9   11:putfield        #30  <Field int b>
		i = a;
	//   10   14:aload_0         
	//   11   15:getfield        #22  <Field int a>
	//   12   18:istore_3        
		a = i + (int)((float)i * d);
	//   13   19:aload_0         
	//   14   20:iload_3         
	//   15   21:iload_3         
	//   16   22:i2f             
	//   17   23:aload_0         
	//   18   24:getfield        #26  <Field float d>
	//   19   27:fmul            
	//   20   28:f2i             
	//   21   29:iadd            
	//   22   30:putfield        #22  <Field int a>
		if(b > c)
	//*  23   33:aload_0         
	//*  24   34:getfield        #30  <Field int b>
	//*  25   37:aload_0         
	//*  26   38:getfield        #24  <Field int c>
	//*  27   41:icmpgt          47
	//*  28   44:goto            49
			flag = false;
	//   29   47:iconst_0        
	//   30   48:istore_2        
		if(flag)
	//*  31   49:iload_2         
	//*  32   50:ifeq            54
			return;
	//   33   53:return          
		else
			throw de;
	//   34   54:aload_1         
	//   35   55:athrow          
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int b>
	//    2    4:ireturn         
	}

	private int a;
	private int b;
	private final int c;
	private final float d;
}

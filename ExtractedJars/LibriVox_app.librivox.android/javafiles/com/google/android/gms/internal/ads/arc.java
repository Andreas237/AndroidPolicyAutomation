// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asu, are, arf, ard, 
//			aug, ars, atv, aqq

public abstract class arc
{

	private arc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #18  <Field int b>
		d = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <Int 0x7fffffff>
	//    7   13:putfield        #21  <Field int d>
		e = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #23  <Field boolean e>
	//   11   21:return          
	}

	arc(ard ard)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void arc()>
	//    2    4:return          
	}

	public static long a(long l1)
	{
		return -(l1 & 1L) ^ l1 >>> 1;
	//    0    0:lload_0         
	//    1    1:lconst_1        
	//    2    2:land            
	//    3    3:lneg            
	//    4    4:lload_0         
	//    5    5:iconst_1        
	//    6    6:lushr           
	//    7    7:lxor            
	//    8    8:lreturn         
	}

	public static arc a(byte abyte0[], int i1, int j1)
	{
		return a(abyte0, i1, j1, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #31  <Method arc a(byte[], int, int, boolean)>
	//    5    7:areturn         
	}

	static arc a(byte abyte0[], int i1, int j1, boolean flag)
	{
		abyte0 = ((byte []) (new are(abyte0, i1, j1, flag, ((ard) (null)))));
	//    0    0:new             #35  <Class are>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #38  <Method void are(byte[], int, int, boolean, ard)>
	//    8   12:astore_0        
		try
		{
			((arc) (abyte0)).d(j1);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #41  <Method int d(int)>
	//   12   18:pop             
		}
	//*  13   19:aload_0         
	//*  14   20:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   21:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (abyte0)));
	//   16   22:new             #43  <Class IllegalArgumentException>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:invokespecial   #46  <Method void IllegalArgumentException(Throwable)>
	//   20   30:athrow          
		}
		return ((arc) (abyte0));
	}

	public static int g(int i1)
	{
		return -(i1 & 1) ^ i1 >>> 1;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iand            
	//    3    3:ineg            
	//    4    4:iload_0         
	//    5    5:iconst_1        
	//    6    6:iushr           
	//    7    7:ixor            
	//    8    8:ireturn         
	}

	public abstract int a();

	public abstract atv a(aug aug, ars ars);

	public abstract void a(int i1);

	public abstract double b();

	public abstract boolean b(int i1);

	public abstract float c();

	public final int c(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            16
		{
			int j1 = b;
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int b>
	//    4    8:istore_2        
			b = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #18  <Field int b>
			return j1;
	//    8   14:iload_2         
	//    9   15:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(47);
	//   10   16:new             #55  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:bipush          47
	//   13   22:invokespecial   #57  <Method void StringBuilder(int)>
	//   14   25:astore_3        
			stringbuilder.append("Recursion limit cannot be negative: ");
	//   15   26:aload_3         
	//   16   27:ldc1            #59  <String "Recursion limit cannot be negative: ">
	//   17   29:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(i1);
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #66  <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   39:new             #43  <Class IllegalArgumentException>
	//   24   42:dup             
	//   25   43:aload_3         
	//   26   44:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   27   47:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   28   50:athrow          
		}
	}

	public abstract int d(int i1);

	public abstract long d();

	public abstract long e();

	public abstract void e(int i1);

	public abstract int f();

	public abstract void f(int i1);

	public abstract long g();

	public abstract int h();

	public abstract boolean i();

	public abstract String j();

	public abstract String k();

	public abstract aqq l();

	public abstract int m();

	public abstract int n();

	public abstract int o();

	public abstract long p();

	public abstract int q();

	public abstract long r();

	abstract long s();

	public abstract boolean t();

	public abstract int u();

	int a;
	int b;
	arf c;
	private int d;
	private boolean e;
}

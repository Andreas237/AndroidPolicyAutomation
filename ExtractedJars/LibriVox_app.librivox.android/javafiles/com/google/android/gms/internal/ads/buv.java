// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, buw, bux, asq, 
//			asr

public final class buv extends Enum
	implements asp
{

	private buv(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		e = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #48  <Field int e>
	//    7   11:return          
	}

	public static buv a(int i)
	{
		if(i != 1000)
	//*   0    0:iload_0         
	//*   1    1:sipush          1000
	//*   2    4:icmpeq          42
			switch(i)
	//*   3    7:iload_0         
			{
	//*   4    8:tableswitch     0 1: default 32
	//	               0 38
	//	               1 34
			default:
				return null;
	//    5   32:aconst_null     
	//    6   33:areturn         

			case 1: // '\001'
				return b;
	//    7   34:getstatic       #30  <Field buv b>
	//    8   37:areturn         

			case 0: // '\0'
				return a;
	//    9   38:getstatic       #26  <Field buv a>
	//   10   41:areturn         
			}
		else
			return c;
	//   11   42:getstatic       #34  <Field buv c>
	//   12   45:areturn         
	}

	public static asr b()
	{
		return bux.a;
	//    0    0:getstatic       #55  <Field asr bux.a>
	//    1    3:areturn         
	}

	public static buv[] values()
	{
		return (buv[])((buv []) (f)).clone();
	//    0    0:getstatic       #36  <Field buv[] f>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.google.android.gms.internal.ads.buv_3B_.clone()>
	//    2    6:checkcast       #58  <Class buv[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int e>
	//    2    4:ireturn         
	}

	private static final buv a;
	private static final buv b;
	private static final buv c;
	private static final asq d = new buw();
	private static final buv f[];
	private final int e;

	static 
	{
		a = new buv("ENUM_FALSE", 0, 0);
	//    0    0:new             #2   <Class buv>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "ENUM_FALSE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void buv(String, int, int)>
	//    6   11:putstatic       #26  <Field buv a>
		b = new buv("ENUM_TRUE", 1, 1);
	//    7   14:new             #2   <Class buv>
	//    8   17:dup             
	//    9   18:ldc1            #28  <String "ENUM_TRUE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void buv(String, int, int)>
	//   13   25:putstatic       #30  <Field buv b>
		c = new buv("ENUM_UNKNOWN", 2, 1000);
	//   14   28:new             #2   <Class buv>
	//   15   31:dup             
	//   16   32:ldc1            #32  <String "ENUM_UNKNOWN">
	//   17   34:iconst_2        
	//   18   35:sipush          1000
	//   19   38:invokespecial   #24  <Method void buv(String, int, int)>
	//   20   41:putstatic       #34  <Field buv c>
		f = (new buv[] {
			a, b, c
		});
	//   21   44:iconst_3        
	//   22   45:anewarray       buv[]
	//   23   48:dup             
	//   24   49:iconst_0        
	//   25   50:getstatic       #26  <Field buv a>
	//   26   53:aastore         
	//   27   54:dup             
	//   28   55:iconst_1        
	//   29   56:getstatic       #30  <Field buv b>
	//   30   59:aastore         
	//   31   60:dup             
	//   32   61:iconst_2        
	//   33   62:getstatic       #34  <Field buv c>
	//   34   65:aastore         
	//   35   66:putstatic       #36  <Field buv[] f>
	//   36   69:new             #38  <Class buw>
	//   37   72:dup             
	//   38   73:invokespecial   #40  <Method void buw()>
	//   39   76:putstatic       #42  <Field asq d>
	//*  40   79:return          
	}
}

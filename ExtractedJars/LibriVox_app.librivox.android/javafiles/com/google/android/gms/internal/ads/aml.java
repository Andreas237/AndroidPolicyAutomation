// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, amm, asq

public final class aml extends Enum
	implements asp
{

	private aml(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #56  <Method void Enum(String, int)>
		g = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #58  <Field int g>
	//    7   11:return          
	}

	public static aml a(int i)
	{
		if(i != 0)
	//*   0    0:iload_0         
	//*   1    1:ifeq            46
			switch(i)
	//*   2    4:iload_0         
			{
	//*   3    5:tableswitch     2 4: default 32
	//	               2 42
	//	               3 38
	//	               4 34
			default:
				return null;
	//    4   32:aconst_null     
	//    5   33:areturn         

			case 4: // '\004'
				return c;
	//    6   34:getstatic       #40  <Field aml c>
	//    7   37:areturn         

			case 3: // '\003'
				return b;
	//    8   38:getstatic       #36  <Field aml b>
	//    9   41:areturn         

			case 2: // '\002'
				return a;
	//   10   42:getstatic       #32  <Field aml a>
	//   11   45:areturn         
			}
		else
			return e;
	//   12   46:getstatic       #28  <Field aml e>
	//   13   49:areturn         
	}

	public static aml[] values()
	{
		return (aml[])((aml []) (h)).clone();
	//    0    0:getstatic       #46  <Field aml[] h>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.google.android.gms.internal.ads.aml_3B_.clone()>
	//    2    6:checkcast       #62  <Class aml[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		if(this != d)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #44  <Field aml d>
	//*   2    4:if_acmpeq       12
			return g;
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field int g>
	//    5   11:ireturn         
		else
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
	//    6   12:new             #69  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #71  <String "Can't get the number of an unknown enum value.">
	//    9   18:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
	}

	public static final aml a;
	public static final aml b;
	public static final aml c;
	public static final aml d;
	private static final aml e;
	private static final asq f = new amm();
	private static final aml h[];
	private final int g;

	static 
	{
		e = new aml("UNKNOWN_CURVE", 0, 0);
	//    0    0:new             #2   <Class aml>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "UNKNOWN_CURVE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void aml(String, int, int)>
	//    6   11:putstatic       #28  <Field aml e>
		a = new aml("NIST_P256", 1, 2);
	//    7   14:new             #2   <Class aml>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "NIST_P256">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #26  <Method void aml(String, int, int)>
	//   13   25:putstatic       #32  <Field aml a>
		b = new aml("NIST_P384", 2, 3);
	//   14   28:new             #2   <Class aml>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "NIST_P384">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #26  <Method void aml(String, int, int)>
	//   20   39:putstatic       #36  <Field aml b>
		c = new aml("NIST_P521", 3, 4);
	//   21   42:new             #2   <Class aml>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "NIST_P521">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #26  <Method void aml(String, int, int)>
	//   27   53:putstatic       #40  <Field aml c>
		d = new aml("UNRECOGNIZED", 4, -1);
	//   28   56:new             #2   <Class aml>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "UNRECOGNIZED">
	//   31   62:iconst_4        
	//   32   63:iconst_m1       
	//   33   64:invokespecial   #26  <Method void aml(String, int, int)>
	//   34   67:putstatic       #44  <Field aml d>
		h = (new aml[] {
			e, a, b, c, d
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       aml[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #28  <Field aml e>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #32  <Field aml a>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #36  <Field aml b>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #40  <Field aml c>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #44  <Field aml d>
	//   56  103:aastore         
	//   57  104:putstatic       #46  <Field aml[] h>
	//   58  107:new             #48  <Class amm>
	//   59  110:dup             
	//   60  111:invokespecial   #50  <Method void amm()>
	//   61  114:putstatic       #52  <Field asq f>
	//*  62  117:return          
	}
}

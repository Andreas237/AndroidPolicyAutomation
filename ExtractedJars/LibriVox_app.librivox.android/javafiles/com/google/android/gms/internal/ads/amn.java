// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, amo, asq

public final class amn extends Enum
	implements asp
{

	private amn(String s, int i, int j)
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

	public static amn a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 50
	//	               1 46
	//	               2 36
	//	               3 42
	//	               4 38
		case 2: // '\002'
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 4: // '\004'
			return c;
	//    4   38:getstatic       #40  <Field amn c>
	//    5   41:areturn         

		case 3: // '\003'
			return b;
	//    6   42:getstatic       #36  <Field amn b>
	//    7   45:areturn         

		case 1: // '\001'
			return a;
	//    8   46:getstatic       #32  <Field amn a>
	//    9   49:areturn         

		case 0: // '\0'
			return e;
	//   10   50:getstatic       #28  <Field amn e>
	//   11   53:areturn         
		}
	}

	public static amn[] values()
	{
		return (amn[])((amn []) (h)).clone();
	//    0    0:getstatic       #46  <Field amn[] h>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.google.android.gms.internal.ads.amn_3B_.clone()>
	//    2    6:checkcast       #62  <Class amn[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		if(this != d)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #44  <Field amn d>
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

	public static final amn a;
	public static final amn b;
	public static final amn c;
	public static final amn d;
	private static final amn e;
	private static final asq f = new amo();
	private static final amn h[];
	private final int g;

	static 
	{
		e = new amn("UNKNOWN_HASH", 0, 0);
	//    0    0:new             #2   <Class amn>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "UNKNOWN_HASH">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void amn(String, int, int)>
	//    6   11:putstatic       #28  <Field amn e>
		a = new amn("SHA1", 1, 1);
	//    7   14:new             #2   <Class amn>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "SHA1">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void amn(String, int, int)>
	//   13   25:putstatic       #32  <Field amn a>
		b = new amn("SHA256", 2, 3);
	//   14   28:new             #2   <Class amn>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "SHA256">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #26  <Method void amn(String, int, int)>
	//   20   39:putstatic       #36  <Field amn b>
		c = new amn("SHA512", 3, 4);
	//   21   42:new             #2   <Class amn>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "SHA512">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #26  <Method void amn(String, int, int)>
	//   27   53:putstatic       #40  <Field amn c>
		d = new amn("UNRECOGNIZED", 4, -1);
	//   28   56:new             #2   <Class amn>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "UNRECOGNIZED">
	//   31   62:iconst_4        
	//   32   63:iconst_m1       
	//   33   64:invokespecial   #26  <Method void amn(String, int, int)>
	//   34   67:putstatic       #44  <Field amn d>
		h = (new amn[] {
			e, a, b, c, d
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       amn[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #28  <Field amn e>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #32  <Field amn a>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #36  <Field amn b>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #40  <Field amn c>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #44  <Field amn d>
	//   56  103:aastore         
	//   57  104:putstatic       #46  <Field amn[] h>
	//   58  107:new             #48  <Class amo>
	//   59  110:dup             
	//   60  111:invokespecial   #50  <Method void amo()>
	//   61  114:putstatic       #52  <Field asq f>
	//*  62  117:return          
	}
}

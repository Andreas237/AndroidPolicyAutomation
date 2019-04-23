// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, alr, asq

public final class alq extends Enum
	implements asp
{

	private alq(String s, int i, int j)
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

	public static alq a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 46
	//	               1 42
	//	               2 38
	//	               3 34
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 3: // '\003'
			return d;
	//    4   34:getstatic       #40  <Field alq d>
	//    5   37:areturn         

		case 2: // '\002'
			return c;
	//    6   38:getstatic       #36  <Field alq c>
	//    7   41:areturn         

		case 1: // '\001'
			return b;
	//    8   42:getstatic       #32  <Field alq b>
	//    9   45:areturn         

		case 0: // '\0'
			return a;
	//   10   46:getstatic       #28  <Field alq a>
	//   11   49:areturn         
		}
	}

	public static alq[] values()
	{
		return (alq[])((alq []) (h)).clone();
	//    0    0:getstatic       #46  <Field alq[] h>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.google.android.gms.internal.ads.alq_3B_.clone()>
	//    2    6:checkcast       #62  <Class alq[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		if(this != e)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #44  <Field alq e>
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

	public static final alq a;
	public static final alq b;
	public static final alq c;
	public static final alq d;
	public static final alq e;
	private static final asq f = new alr();
	private static final alq h[];
	private final int g;

	static 
	{
		a = new alq("UNKNOWN_FORMAT", 0, 0);
	//    0    0:new             #2   <Class alq>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "UNKNOWN_FORMAT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void alq(String, int, int)>
	//    6   11:putstatic       #28  <Field alq a>
		b = new alq("UNCOMPRESSED", 1, 1);
	//    7   14:new             #2   <Class alq>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "UNCOMPRESSED">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void alq(String, int, int)>
	//   13   25:putstatic       #32  <Field alq b>
		c = new alq("COMPRESSED", 2, 2);
	//   14   28:new             #2   <Class alq>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "COMPRESSED">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #26  <Method void alq(String, int, int)>
	//   20   39:putstatic       #36  <Field alq c>
		d = new alq("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
	//   21   42:new             #2   <Class alq>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "DO_NOT_USE_CRUNCHY_UNCOMPRESSED">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #26  <Method void alq(String, int, int)>
	//   27   53:putstatic       #40  <Field alq d>
		e = new alq("UNRECOGNIZED", 4, -1);
	//   28   56:new             #2   <Class alq>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "UNRECOGNIZED">
	//   31   62:iconst_4        
	//   32   63:iconst_m1       
	//   33   64:invokespecial   #26  <Method void alq(String, int, int)>
	//   34   67:putstatic       #44  <Field alq e>
		h = (new alq[] {
			a, b, c, d, e
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       alq[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #28  <Field alq a>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #32  <Field alq b>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #36  <Field alq c>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #40  <Field alq d>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #44  <Field alq e>
	//   56  103:aastore         
	//   57  104:putstatic       #46  <Field alq[] h>
	//   58  107:new             #48  <Class alr>
	//   59  110:dup             
	//   60  111:invokespecial   #50  <Method void alr()>
	//   61  114:putstatic       #52  <Field asq f>
	//*  62  117:return          
	}
}

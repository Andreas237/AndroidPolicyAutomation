// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, axy, axz, asq, 
//			asr

public final class awz extends Enum
	implements asp
{

	private awz(String s, int i, int j)
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

	public static awz a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 54
	//	               1 50
	//	               2 46
	//	               3 42
	//	               4 38
		default:
			return null;
	//    2   36:aconst_null     
	//    3   37:areturn         

		case 4: // '\004'
			return e;
	//    4   38:getstatic       #44  <Field awz e>
	//    5   41:areturn         

		case 3: // '\003'
			return d;
	//    6   42:getstatic       #40  <Field awz d>
	//    7   45:areturn         

		case 2: // '\002'
			return c;
	//    8   46:getstatic       #36  <Field awz c>
	//    9   49:areturn         

		case 1: // '\001'
			return b;
	//   10   50:getstatic       #32  <Field awz b>
	//   11   53:areturn         

		case 0: // '\0'
			return a;
	//   12   54:getstatic       #28  <Field awz a>
	//   13   57:areturn         
		}
	}

	public static asr b()
	{
		return axz.a;
	//    0    0:getstatic       #65  <Field asr axz.a>
	//    1    3:areturn         
	}

	public static awz[] values()
	{
		return (awz[])((awz []) (h)).clone();
	//    0    0:getstatic       #46  <Field awz[] h>
	//    1    3:invokevirtual   #72  <Method Object _5B_Lcom.google.android.gms.internal.ads.awz_3B_.clone()>
	//    2    6:checkcast       #68  <Class awz[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int g>
	//    2    4:ireturn         
	}

	private static final awz a;
	private static final awz b;
	private static final awz c;
	private static final awz d;
	private static final awz e;
	private static final asq f = new axy();
	private static final awz h[];
	private final int g;

	static 
	{
		a = new awz("SAFE", 0, 0);
	//    0    0:new             #2   <Class awz>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "SAFE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void awz(String, int, int)>
	//    6   11:putstatic       #28  <Field awz a>
		b = new awz("DANGEROUS", 1, 1);
	//    7   14:new             #2   <Class awz>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "DANGEROUS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void awz(String, int, int)>
	//   13   25:putstatic       #32  <Field awz b>
		c = new awz("UNKNOWN", 2, 2);
	//   14   28:new             #2   <Class awz>
	//   15   31:dup             
	//   16   32:ldc1            #34  <String "UNKNOWN">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #26  <Method void awz(String, int, int)>
	//   20   39:putstatic       #36  <Field awz c>
		d = new awz("POTENTIALLY_UNWANTED", 3, 3);
	//   21   42:new             #2   <Class awz>
	//   22   45:dup             
	//   23   46:ldc1            #38  <String "POTENTIALLY_UNWANTED">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #26  <Method void awz(String, int, int)>
	//   27   53:putstatic       #40  <Field awz d>
		e = new awz("DANGEROUS_HOST", 4, 4);
	//   28   56:new             #2   <Class awz>
	//   29   59:dup             
	//   30   60:ldc1            #42  <String "DANGEROUS_HOST">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #26  <Method void awz(String, int, int)>
	//   34   67:putstatic       #44  <Field awz e>
		h = (new awz[] {
			a, b, c, d, e
		});
	//   35   70:iconst_5        
	//   36   71:anewarray       awz[]
	//   37   74:dup             
	//   38   75:iconst_0        
	//   39   76:getstatic       #28  <Field awz a>
	//   40   79:aastore         
	//   41   80:dup             
	//   42   81:iconst_1        
	//   43   82:getstatic       #32  <Field awz b>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_2        
	//   47   88:getstatic       #36  <Field awz c>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_3        
	//   51   94:getstatic       #40  <Field awz d>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_4        
	//   55  100:getstatic       #44  <Field awz e>
	//   56  103:aastore         
	//   57  104:putstatic       #46  <Field awz[] h>
	//   58  107:new             #48  <Class axy>
	//   59  110:dup             
	//   60  111:invokespecial   #50  <Method void axy()>
	//   61  114:putstatic       #52  <Field asq f>
	//*  62  117:return          
	}
}

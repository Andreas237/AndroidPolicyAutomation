// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			y

public static final class y$a extends Enum
{

	public static boolean a(y$a y$a1)
	{
		return y$a1.ordinal() >= y.a.ordinal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method int ordinal()>
	//    2    4:getstatic       #47  <Field y$a y.a>
	//    3    7:invokevirtual   #46  <Method int ordinal()>
	//    4   10:icmplt          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static y$a valueOf(String s)
	{
		return (y$a)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/y$a, s);
	//    0    0:ldc1            #2   <Class y$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class y$a>
	//    4    9:areturn         
	}

	public static y$a[] values()
	{
		return (y$a[])((y$a []) (e)).clone();
	//    0    0:getstatic       #38  <Field y$a[] e>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.y$a_3B_.clone()>
	//    2    6:checkcast       #55  <Class y$a[]>
	//    3    9:areturn         
	}

	public static final y$a a;
	public static final y$a b;
	public static final y$a c;
	public static final y$a d;
	private static final y$a e[];

	static 
	{
		a = new y$a("VERBOSE", 0);
	//    0    0:new             #2   <Class y$a>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "VERBOSE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void y$a(String, int)>
	//    5   10:putstatic       #24  <Field y$a a>
		b = new y$a("ABRIDGED", 1);
	//    6   13:new             #2   <Class y$a>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "ABRIDGED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void y$a(String, int)>
	//   11   23:putstatic       #28  <Field y$a b>
		c = new y$a("LIFECYCLE", 2);
	//   12   26:new             #2   <Class y$a>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "LIFECYCLE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void y$a(String, int)>
	//   17   36:putstatic       #32  <Field y$a c>
		d = new y$a("PROD", 3);
	//   18   39:new             #2   <Class y$a>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "PROD">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void y$a(String, int)>
	//   23   49:putstatic       #36  <Field y$a d>
		e = (new y$a[] {
			a, b, c, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       y$a[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field y$a a>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field y$a b>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field y$a c>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #36  <Field y$a d>
	//   41   79:aastore         
	//   42   80:putstatic       #38  <Field y$a[] e>
	//*  43   83:return          
	}

	private y$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

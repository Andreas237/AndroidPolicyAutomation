// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			fj

static final class fj$a extends Enum
{

	public static fj$a valueOf(String s)
	{
		return (fj$a)Enum.valueOf(com/amap/api/mapcore/util/fj$a, s);
	//    0    0:ldc1            #2   <Class fj$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class fj$a>
	//    4    9:areturn         
	}

	public static fj$a[] values()
	{
		return (fj$a[])((fj$a []) (d)).clone();
	//    0    0:getstatic       #33  <Field fj$a[] d>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lcom.amap.api.mapcore.util.fj$a_3B_.clone()>
	//    2    6:checkcast       #44  <Class fj$a[]>
	//    3    9:areturn         
	}

	public static final fj$a a;
	public static final fj$a b;
	public static final fj$a c;
	private static final fj$a d[];

	static 
	{
		a = new fj$a("FAIL", 0);
	//    0    0:new             #2   <Class fj$a>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "FAIL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void fj$a(String, int)>
	//    5   10:putstatic       #23  <Field fj$a a>
		b = new fj$a("PERFECT", 1);
	//    6   13:new             #2   <Class fj$a>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "PERFECT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void fj$a(String, int)>
	//   11   23:putstatic       #27  <Field fj$a b>
		c = new fj$a("FIT", 2);
	//   12   26:new             #2   <Class fj$a>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "FIT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void fj$a(String, int)>
	//   17   36:putstatic       #31  <Field fj$a c>
		d = (new fj$a[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       fj$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field fj$a a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field fj$a b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #31  <Field fj$a c>
	//   31   60:aastore         
	//   32   61:putstatic       #33  <Field fj$a[] d>
	//*  33   64:return          
	}

	private fj$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

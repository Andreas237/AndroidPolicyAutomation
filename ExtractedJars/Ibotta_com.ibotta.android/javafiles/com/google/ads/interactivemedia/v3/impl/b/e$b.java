// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.b;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.b:
//			e

private static final class e$b extends Enum
{

	public static e$b valueOf(String s)
	{
		return (e$b)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/b/e$b, s);
	//    0    0:ldc1            #2   <Class e$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class e$b>
	//    4    9:areturn         
	}

	public static e$b[] values()
	{
		return (e$b[])((e$b []) (d)).clone();
	//    0    0:getstatic       #33  <Field e$b[] d>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.b.e$b_3B_.clone()>
	//    2    6:checkcast       #44  <Class e$b[]>
	//    3    9:areturn         
	}

	public static final e$b a;
	public static final e$b b;
	public static final e$b c;
	private static final e$b d[];

	static 
	{
		a = new e$b("NOT_SKIPPABLE", 0);
	//    0    0:new             #2   <Class e$b>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NOT_SKIPPABLE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void e$b(String, int)>
	//    5   10:putstatic       #23  <Field e$b a>
		b = new e$b("WAITING_TO_SKIP", 1);
	//    6   13:new             #2   <Class e$b>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "WAITING_TO_SKIP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void e$b(String, int)>
	//   11   23:putstatic       #27  <Field e$b b>
		c = new e$b("SKIPPABLE", 2);
	//   12   26:new             #2   <Class e$b>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "SKIPPABLE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void e$b(String, int)>
	//   17   36:putstatic       #31  <Field e$b c>
		d = (new e$b[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       e$b[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field e$b a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field e$b b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #31  <Field e$b c>
	//   31   60:aastore         
	//   32   61:putstatic       #33  <Field e$b[] d>
	//*  33   64:return          
	}

	private e$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

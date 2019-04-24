// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			n

public static final class n$a extends Enum
{

	public static n$a valueOf(String s)
	{
		return (n$a)Enum.valueOf(com/startapp/android/publish/adsCommon/n$a, s);
	//    0    0:ldc1            #2   <Class n$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class n$a>
	//    4    9:areturn         
	}

	public static n$a[] values()
	{
		return (n$a[])((n$a []) (e)).clone();
	//    0    0:getstatic       #38  <Field n$a[] e>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.n$a_3B_.clone()>
	//    2    6:checkcast       #49  <Class n$a[]>
	//    3    9:areturn         
	}

	public static final n$a a;
	public static final n$a b;
	public static final n$a c;
	public static final n$a d;
	private static final n$a e[];

	static 
	{
		a = new n$a("DISABLED", 0);
	//    0    0:new             #2   <Class n$a>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "DISABLED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void n$a(String, int)>
	//    5   10:putstatic       #24  <Field n$a a>
		b = new n$a("SKIP", 1);
	//    6   13:new             #2   <Class n$a>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "SKIP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void n$a(String, int)>
	//   11   23:putstatic       #28  <Field n$a b>
		c = new n$a("CLOSE", 2);
	//   12   26:new             #2   <Class n$a>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "CLOSE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void n$a(String, int)>
	//   17   36:putstatic       #32  <Field n$a c>
		d = new n$a("BOTH", 3);
	//   18   39:new             #2   <Class n$a>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "BOTH">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void n$a(String, int)>
	//   23   49:putstatic       #36  <Field n$a d>
		e = (new n$a[] {
			a, b, c, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       n$a[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field n$a a>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field n$a b>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field n$a c>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #36  <Field n$a d>
	//   41   79:aastore         
	//   42   80:putstatic       #38  <Field n$a[] e>
	//*  43   83:return          
	}

	private n$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

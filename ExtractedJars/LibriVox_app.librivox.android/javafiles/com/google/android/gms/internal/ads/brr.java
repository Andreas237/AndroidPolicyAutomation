// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class brr extends Enum
{

	private brr(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static brr[] values()
	{
		return (brr[])((brr []) (e)).clone();
	//    0    0:getstatic       #35  <Field brr[] e>
	//    1    3:invokevirtual   #44  <Method Object _5B_Lcom.google.android.gms.internal.ads.brr_3B_.clone()>
	//    2    6:checkcast       #40  <Class brr[]>
	//    3    9:areturn         
	}

	public static final brr a;
	private static final brr b;
	private static final brr c;
	private static final brr d;
	private static final brr e[];

	static 
	{
		b = new brr("LOW", 0);
	//    0    0:new             #2   <Class brr>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "LOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void brr(String, int)>
	//    5   10:putstatic       #21  <Field brr b>
		a = new brr("NORMAL", 1);
	//    6   13:new             #2   <Class brr>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "NORMAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void brr(String, int)>
	//   11   23:putstatic       #25  <Field brr a>
		c = new brr("HIGH", 2);
	//   12   26:new             #2   <Class brr>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "HIGH">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void brr(String, int)>
	//   17   36:putstatic       #29  <Field brr c>
		d = new brr("IMMEDIATE", 3);
	//   18   39:new             #2   <Class brr>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "IMMEDIATE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void brr(String, int)>
	//   23   49:putstatic       #33  <Field brr d>
		e = (new brr[] {
			b, a, c, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       brr[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field brr b>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #25  <Field brr a>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #29  <Field brr c>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field brr d>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field brr[] e>
	//*  43   83:return          
	}
}

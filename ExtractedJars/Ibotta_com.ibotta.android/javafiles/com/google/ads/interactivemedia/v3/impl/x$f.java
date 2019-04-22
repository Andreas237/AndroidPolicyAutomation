// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

static final class x$f extends Enum
{

	public static x$f valueOf(String s)
	{
		return (x$f)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/x$f, s);
	//    0    0:ldc1            #2   <Class x$f>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class x$f>
	//    4    9:areturn         
	}

	public static x$f[] values()
	{
		return (x$f[])((x$f []) (e)).clone();
	//    0    0:getstatic       #39  <Field x$f[] e>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.x$f_3B_.clone()>
	//    2    6:checkcast       #50  <Class x$f[]>
	//    3    9:areturn         
	}

	public static final x$f a;
	public static final x$f b;
	public static final x$f c;
	public static final x$f d;
	private static final x$f e[];

	static 
	{
		a = new x$f("IDLE", 0);
	//    0    0:new             #2   <Class x$f>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "IDLE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void x$f(String, int)>
	//    5   10:putstatic       #25  <Field x$f a>
		b = new x$f("LOADED", 1);
	//    6   13:new             #2   <Class x$f>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "LOADED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void x$f(String, int)>
	//   11   23:putstatic       #29  <Field x$f b>
		c = new x$f("PLAYING", 2);
	//   12   26:new             #2   <Class x$f>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "PLAYING">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void x$f(String, int)>
	//   17   36:putstatic       #33  <Field x$f c>
		d = new x$f("PAUSED", 3);
	//   18   39:new             #2   <Class x$f>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "PAUSED">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void x$f(String, int)>
	//   23   49:putstatic       #37  <Field x$f d>
		e = (new x$f[] {
			a, b, c, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       x$f[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #25  <Field x$f a>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #29  <Field x$f b>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #33  <Field x$f c>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #37  <Field x$f d>
	//   41   79:aastore         
	//   42   80:putstatic       #39  <Field x$f[] e>
	//*  43   83:return          
	}

	private x$f(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

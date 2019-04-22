// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

public static final class x$g extends Enum
{

	public static x$g valueOf(String s)
	{
		return (x$g)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/x$g, s);
	//    0    0:ldc1            #2   <Class x$g>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class x$g>
	//    4    9:areturn         
	}

	public static x$g[] values()
	{
		return (x$g[])((x$g []) (d)).clone();
	//    0    0:getstatic       #31  <Field x$g[] d>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.x$g_3B_.clone()>
	//    2    6:checkcast       #47  <Class x$g[]>
	//    3    9:areturn         
	}

	public int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int c>
	//    2    4:ireturn         
	}

	public static final x$g a;
	public static final x$g b;
	private static final x$g d[];
	private final int c;

	static 
	{
		a = new x$g("TYPE_VIDEO", 0, 0);
	//    0    0:new             #2   <Class x$g>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "TYPE_VIDEO">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #23  <Method void x$g(String, int, int)>
	//    6   11:putstatic       #25  <Field x$g a>
		b = new x$g("TYPE_AUDIO", 1, 1);
	//    7   14:new             #2   <Class x$g>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "TYPE_AUDIO">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #23  <Method void x$g(String, int, int)>
	//   13   25:putstatic       #29  <Field x$g b>
		d = (new x$g[] {
			a, b
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       x$g[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #25  <Field x$g a>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #29  <Field x$g b>
	//   23   43:aastore         
	//   24   44:putstatic       #31  <Field x$g[] d>
	//*  25   47:return          
	}

	private x$g(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
		c = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #37  <Field int c>
	//    7   11:return          
	}
}

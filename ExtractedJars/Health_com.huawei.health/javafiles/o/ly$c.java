// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ly

public static final class ly$c extends Enum
{

	public static ly$c valueOf(String s)
	{
		return (ly$c)Enum.valueOf(o/ly$c, s);
	//    0    0:ldc1            #2   <Class ly$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ly$c>
	//    4    9:areturn         
	}

	public static ly$c[] values()
	{
		return (ly$c[])((ly$c []) (e)).clone();
	//    0    0:getstatic       #38  <Field ly$c[] e>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lo.ly$c_3B_.clone()>
	//    2    6:checkcast       #49  <Class ly$c[]>
	//    3    9:areturn         
	}

	public static final ly$c a;
	public static final ly$c b;
	public static final ly$c c;
	public static final ly$c d;
	private static final ly$c e[];

	static 
	{
		b = new ly$c("LINEAR", 0);
	//    0    0:new             #2   <Class ly$c>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LINEAR">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ly$c(String, int)>
	//    5   10:putstatic       #24  <Field ly$c b>
		c = new ly$c("STEPPED", 1);
	//    6   13:new             #2   <Class ly$c>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "STEPPED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ly$c(String, int)>
	//   11   23:putstatic       #28  <Field ly$c c>
		a = new ly$c("CUBIC_BEZIER", 2);
	//   12   26:new             #2   <Class ly$c>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "CUBIC_BEZIER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ly$c(String, int)>
	//   17   36:putstatic       #32  <Field ly$c a>
		d = new ly$c("HORIZONTAL_BEZIER", 3);
	//   18   39:new             #2   <Class ly$c>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "HORIZONTAL_BEZIER">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void ly$c(String, int)>
	//   23   49:putstatic       #36  <Field ly$c d>
		e = (new ly$c[] {
			b, c, a, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ly$c[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field ly$c b>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field ly$c c>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field ly$c a>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #36  <Field ly$c d>
	//   41   79:aastore         
	//   42   80:putstatic       #38  <Field ly$c[] e>
	//*  43   83:return          
	}

	private ly$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

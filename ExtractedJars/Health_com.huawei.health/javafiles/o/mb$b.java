// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			mb

public static final class mb$b extends Enum
{

	public static mb$b valueOf(String s)
	{
		return (mb$b)Enum.valueOf(o/mb$b, s);
	//    0    0:ldc1            #2   <Class mb$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class mb$b>
	//    4    9:areturn         
	}

	public static mb$b[] values()
	{
		return (mb$b[])((mb$b []) (a)).clone();
	//    0    0:getstatic       #33  <Field mb$b[] a>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lo.mb$b_3B_.clone()>
	//    2    6:checkcast       #44  <Class mb$b[]>
	//    3    9:areturn         
	}

	private static final mb$b a[];
	public static final mb$b b;
	public static final mb$b c;
	public static final mb$b d;

	static 
	{
		c = new mb$b("UP", 0);
	//    0    0:new             #2   <Class mb$b>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "UP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void mb$b(String, int)>
	//    5   10:putstatic       #23  <Field mb$b c>
		b = new mb$b("DOWN", 1);
	//    6   13:new             #2   <Class mb$b>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "DOWN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void mb$b(String, int)>
	//   11   23:putstatic       #27  <Field mb$b b>
		d = new mb$b("CLOSEST", 2);
	//   12   26:new             #2   <Class mb$b>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "CLOSEST">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void mb$b(String, int)>
	//   17   36:putstatic       #31  <Field mb$b d>
		a = (new mb$b[] {
			c, b, d
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       mb$b[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field mb$b c>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field mb$b b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #31  <Field mb$b d>
	//   31   60:aastore         
	//   32   61:putstatic       #33  <Field mb$b[] a>
	//*  33   64:return          
	}

	private mb$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

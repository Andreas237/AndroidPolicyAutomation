// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			fn

public static final class fn$b extends Enum
{

	public static fn$b valueOf(String s)
	{
		return (fn$b)Enum.valueOf(o/fn$b, s);
	//    0    0:ldc1            #2   <Class fn$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class fn$b>
	//    4    9:areturn         
	}

	public static fn$b[] values()
	{
		return (fn$b[])((fn$b []) (d)).clone();
	//    0    0:getstatic       #28  <Field fn$b[] d>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lo.fn$b_3B_.clone()>
	//    2    6:checkcast       #39  <Class fn$b[]>
	//    3    9:areturn         
	}

	public static final fn$b b;
	public static final fn$b c;
	private static final fn$b d[];

	static 
	{
		b = new fn$b("ONLINE", 0);
	//    0    0:new             #2   <Class fn$b>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "ONLINE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void fn$b(String, int)>
	//    5   10:putstatic       #22  <Field fn$b b>
		c = new fn$b("SANDBOX", 1);
	//    6   13:new             #2   <Class fn$b>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "SANDBOX">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void fn$b(String, int)>
	//   11   23:putstatic       #26  <Field fn$b c>
		d = (new fn$b[] {
			b, c
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       fn$b[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field fn$b b>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field fn$b c>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field fn$b[] d>
	//*  23   45:return          
	}

	private fn$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class x extends Enum
{

	private x(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static x valueOf(String s)
	{
		return (x)Enum.valueOf(bo/app/x, s);
	//    0    0:ldc1            #2   <Class x>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class x>
	//    4    9:areturn         
	}

	public static x[] values()
	{
		return (x[])((x []) (c)).clone();
	//    0    0:getstatic       #26  <Field x[] c>
	//    1    3:invokevirtual   #41  <Method Object _5B_Lbo.app.x_3B_.clone()>
	//    2    6:checkcast       #37  <Class x[]>
	//    3    9:areturn         
	}

	public static final x a;
	public static final x b;
	private static final x c[];

	static 
	{
		a = new x("OPEN_SESSION", 0);
	//    0    0:new             #2   <Class x>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "OPEN_SESSION">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void x(String, int)>
	//    5   10:putstatic       #20  <Field x a>
		b = new x("NO_SESSION", 1);
	//    6   13:new             #2   <Class x>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "NO_SESSION">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void x(String, int)>
	//   11   23:putstatic       #24  <Field x b>
		c = (new x[] {
			a, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       x[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #20  <Field x a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #24  <Field x b>
	//   21   41:aastore         
	//   22   42:putstatic       #26  <Field x[] c>
	//*  23   45:return          
	}
}

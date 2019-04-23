// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class u extends Enum
{

	private u(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static u valueOf(String s)
	{
		return (u)Enum.valueOf(bo/app/u, s);
	//    0    0:ldc1            #2   <Class u>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class u>
	//    4    9:areturn         
	}

	public static u[] values()
	{
		return (u[])((u []) (c)).clone();
	//    0    0:getstatic       #26  <Field u[] c>
	//    1    3:invokevirtual   #41  <Method Object _5B_Lbo.app.u_3B_.clone()>
	//    2    6:checkcast       #37  <Class u[]>
	//    3    9:areturn         
	}

	public static final u a;
	public static final u b;
	private static final u c[];

	static 
	{
		a = new u("ENTER", 0);
	//    0    0:new             #2   <Class u>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "ENTER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void u(String, int)>
	//    5   10:putstatic       #20  <Field u a>
		b = new u("EXIT", 1);
	//    6   13:new             #2   <Class u>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "EXIT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void u(String, int)>
	//   11   23:putstatic       #24  <Field u b>
		c = (new u[] {
			a, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       u[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #20  <Field u a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #24  <Field u b>
	//   21   41:aastore         
	//   22   42:putstatic       #26  <Field u[] c>
	//*  23   45:return          
	}
}

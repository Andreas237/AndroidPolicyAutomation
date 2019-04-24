// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;


// Referenced classes of package com.irobot.home.b:
//			x

private static final class x$b extends Enum
{

	public static x$b valueOf(String s)
	{
		return (x$b)Enum.valueOf(com/irobot/home/b/x$b, s);
	//    0    0:ldc1            #2   <Class x$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class x$b>
	//    4    9:areturn         
	}

	public static x$b[] values()
	{
		return (x$b[])((x$b []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field x$b[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.irobot.home.b.x$b_3B_.clone()>
	//    2    6:checkcast       #46  <Class x$b[]>
	//    3    9:areturn         
	}

	private static final x$b $VALUES[];
	public static final x$b GREEN;
	public static final x$b RED;
	public static final x$b UNKNOWN;
	public static final x$b YELLOW;

	static 
	{
		GREEN = new x$b("GREEN", 0);
	//    0    0:new             #2   <Class x$b>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "GREEN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void x$b(String, int)>
	//    5   10:putstatic       #24  <Field x$b GREEN>
		YELLOW = new x$b("YELLOW", 1);
	//    6   13:new             #2   <Class x$b>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "YELLOW">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void x$b(String, int)>
	//   11   23:putstatic       #27  <Field x$b YELLOW>
		RED = new x$b("RED", 2);
	//   12   26:new             #2   <Class x$b>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "RED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void x$b(String, int)>
	//   17   36:putstatic       #30  <Field x$b RED>
		UNKNOWN = new x$b("UNKNOWN", 3);
	//   18   39:new             #2   <Class x$b>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "UNKNOWN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void x$b(String, int)>
	//   23   49:putstatic       #33  <Field x$b UNKNOWN>
		$VALUES = (new x$b[] {
			GREEN, YELLOW, RED, UNKNOWN
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       x$b[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field x$b GREEN>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field x$b YELLOW>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field x$b RED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field x$b UNKNOWN>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field x$b[] $VALUES>
	//*  43   83:return          
	}

	private x$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			IRobotApplication

public static final class IRobotApplication$a extends Enum
{

	public static IRobotApplication$a valueOf(String s)
	{
		return (IRobotApplication$a)Enum.valueOf(com/irobot/home/IRobotApplication$a, s);
	//    0    0:ldc1            #2   <Class IRobotApplication$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class IRobotApplication$a>
	//    4    9:areturn         
	}

	public static IRobotApplication$a[] values()
	{
		return (IRobotApplication$a[])((IRobotApplication$a []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field IRobotApplication$a[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.IRobotApplication$a_3B_.clone()>
	//    2    6:checkcast       #42  <Class IRobotApplication$a[]>
	//    3    9:areturn         
	}

	private static final IRobotApplication$a $VALUES[];
	public static final IRobotApplication$a False;
	public static final IRobotApplication$a None;
	public static final IRobotApplication$a True;

	static 
	{
		True = new IRobotApplication$a("True", 0);
	//    0    0:new             #2   <Class IRobotApplication$a>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "True">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
	//    5   10:putstatic       #23  <Field IRobotApplication$a True>
		False = new IRobotApplication$a("False", 1);
	//    6   13:new             #2   <Class IRobotApplication$a>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "False">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
	//   11   23:putstatic       #26  <Field IRobotApplication$a False>
		None = new IRobotApplication$a("None", 2);
	//   12   26:new             #2   <Class IRobotApplication$a>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "None">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void IRobotApplication$a(String, int)>
	//   17   36:putstatic       #29  <Field IRobotApplication$a None>
		$VALUES = (new IRobotApplication$a[] {
			True, False, None
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       IRobotApplication$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field IRobotApplication$a True>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field IRobotApplication$a False>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field IRobotApplication$a None>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field IRobotApplication$a[] $VALUES>
	//*  33   64:return          
	}

	private IRobotApplication$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

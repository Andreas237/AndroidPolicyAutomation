// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			TestUserManager

private static final class TestUserManager$Mode extends Enum
{

	public static TestUserManager$Mode valueOf(String s)
	{
		return (TestUserManager$Mode)Enum.valueOf(com/facebook/TestUserManager$Mode, s);
	//    0    0:ldc1            #2   <Class TestUserManager$Mode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TestUserManager$Mode>
	//    4    9:areturn         
	}

	public static TestUserManager$Mode[] values()
	{
		return (TestUserManager$Mode[])((TestUserManager$Mode []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field TestUserManager$Mode[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.TestUserManager$Mode_3B_.clone()>
	//    2    6:checkcast       #38  <Class TestUserManager$Mode[]>
	//    3    9:areturn         
	}

	private static final TestUserManager$Mode $VALUES[];
	public static final TestUserManager$Mode PRIVATE;
	public static final TestUserManager$Mode SHARED;

	static 
	{
		PRIVATE = new TestUserManager$Mode("PRIVATE", 0);
	//    0    0:new             #2   <Class TestUserManager$Mode>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "PRIVATE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void TestUserManager$Mode(String, int)>
	//    5   10:putstatic       #22  <Field TestUserManager$Mode PRIVATE>
		SHARED = new TestUserManager$Mode("SHARED", 1);
	//    6   13:new             #2   <Class TestUserManager$Mode>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "SHARED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void TestUserManager$Mode(String, int)>
	//   11   23:putstatic       #25  <Field TestUserManager$Mode SHARED>
		$VALUES = (new TestUserManager$Mode[] {
			PRIVATE, SHARED
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       TestUserManager$Mode[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field TestUserManager$Mode PRIVATE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field TestUserManager$Mode SHARED>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field TestUserManager$Mode[] $VALUES>
	//*  23   45:return          
	}

	private TestUserManager$Mode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

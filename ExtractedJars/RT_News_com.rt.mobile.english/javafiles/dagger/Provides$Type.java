// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package dagger;


// Referenced classes of package dagger:
//			Provides

public static final class Provides$Type extends Enum
{

	public static Provides$Type valueOf(String s)
	{
		return (Provides$Type)Enum.valueOf(dagger/Provides$Type, s);
	//    0    0:ldc1            #2   <Class Provides$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Provides$Type>
	//    4    9:areturn         
	}

	public static Provides$Type[] values()
	{
		return (Provides$Type[])((Provides$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Provides$Type[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Ldagger.Provides$Type_3B_.clone()>
	//    2    6:checkcast       #42  <Class Provides$Type[]>
	//    3    9:areturn         
	}

	private static final Provides$Type $VALUES[];
	public static final Provides$Type SET;
	public static final Provides$Type SET_VALUES;
	public static final Provides$Type UNIQUE;

	static 
	{
		UNIQUE = new Provides$Type("UNIQUE", 0);
	//    0    0:new             #2   <Class Provides$Type>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "UNIQUE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Provides$Type(String, int)>
	//    5   10:putstatic       #23  <Field Provides$Type UNIQUE>
		SET = new Provides$Type("SET", 1);
	//    6   13:new             #2   <Class Provides$Type>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "SET">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Provides$Type(String, int)>
	//   11   23:putstatic       #26  <Field Provides$Type SET>
		SET_VALUES = new Provides$Type("SET_VALUES", 2);
	//   12   26:new             #2   <Class Provides$Type>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "SET_VALUES">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Provides$Type(String, int)>
	//   17   36:putstatic       #29  <Field Provides$Type SET_VALUES>
		$VALUES = (new Provides$Type[] {
			UNIQUE, SET, SET_VALUES
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Provides$Type[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Provides$Type UNIQUE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Provides$Type SET>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Provides$Type SET_VALUES>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Provides$Type[] $VALUES>
	//*  33   64:return          
	}

	private Provides$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

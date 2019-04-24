// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;


// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			Join

public static final class Join$JoinType extends Enum
{

	public static Join$JoinType valueOf(String s)
	{
		return (Join$JoinType)Enum.valueOf(com/raizlabs/android/dbflow/sql/language/Join$JoinType, s);
	//    0    0:ldc1            #2   <Class Join$JoinType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Join$JoinType>
	//    4    9:areturn         
	}

	public static Join$JoinType[] values()
	{
		return (Join$JoinType[])((Join$JoinType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Join$JoinType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.raizlabs.android.dbflow.sql.language.Join$JoinType_3B_.clone()>
	//    2    6:checkcast       #42  <Class Join$JoinType[]>
	//    3    9:areturn         
	}

	private static final Join$JoinType $VALUES[];
	public static final Join$JoinType CROSS;
	public static final Join$JoinType INNER;
	public static final Join$JoinType LEFT_OUTER;

	static 
	{
		LEFT_OUTER = new Join$JoinType("LEFT_OUTER", 0);
	//    0    0:new             #2   <Class Join$JoinType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LEFT_OUTER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Join$JoinType(String, int)>
	//    5   10:putstatic       #23  <Field Join$JoinType LEFT_OUTER>
		INNER = new Join$JoinType("INNER", 1);
	//    6   13:new             #2   <Class Join$JoinType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "INNER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Join$JoinType(String, int)>
	//   11   23:putstatic       #26  <Field Join$JoinType INNER>
		CROSS = new Join$JoinType("CROSS", 2);
	//   12   26:new             #2   <Class Join$JoinType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "CROSS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Join$JoinType(String, int)>
	//   17   36:putstatic       #29  <Field Join$JoinType CROSS>
		$VALUES = (new Join$JoinType[] {
			LEFT_OUTER, INNER, CROSS
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Join$JoinType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Join$JoinType LEFT_OUTER>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Join$JoinType INNER>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Join$JoinType CROSS>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Join$JoinType[] $VALUES>
	//*  33   64:return          
	}

	private Join$JoinType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

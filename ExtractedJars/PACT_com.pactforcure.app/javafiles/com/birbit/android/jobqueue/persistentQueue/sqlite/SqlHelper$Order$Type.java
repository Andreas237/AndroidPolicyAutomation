// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;


// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqlHelper

public static final class SqlHelper$Order$Type extends Enum
{

	public static SqlHelper$Order$Type valueOf(String s)
	{
		return (SqlHelper$Order$Type)Enum.valueOf(com/birbit/android/jobqueue/persistentQueue/sqlite/SqlHelper$Order$Type, s);
	//    0    0:ldc1            #2   <Class SqlHelper$Order$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SqlHelper$Order$Type>
	//    4    9:areturn         
	}

	public static SqlHelper$Order$Type[] values()
	{
		return (SqlHelper$Order$Type[])((SqlHelper$Order$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #30  <Field SqlHelper$Order$Type[] $VALUES>
	//    1    3:invokevirtual   #45  <Method Object _5B_Lcom.birbit.android.jobqueue.persistentQueue.sqlite.SqlHelper$Order$Type_3B_.clone()>
	//    2    6:checkcast       #41  <Class SqlHelper$Order$Type[]>
	//    3    9:areturn         
	}

	private static final SqlHelper$Order$Type $VALUES[];
	public static final SqlHelper$Order$Type ASC;
	public static final SqlHelper$Order$Type DESC;

	static 
	{
		ASC = new SqlHelper$Order$Type("ASC", 0);
	//    0    0:new             #2   <Class SqlHelper$Order$Type>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ASC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void SqlHelper$Order$Type(String, int)>
	//    5   10:putstatic       #25  <Field SqlHelper$Order$Type ASC>
		DESC = new SqlHelper$Order$Type("DESC", 1);
	//    6   13:new             #2   <Class SqlHelper$Order$Type>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "DESC">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void SqlHelper$Order$Type(String, int)>
	//   11   23:putstatic       #28  <Field SqlHelper$Order$Type DESC>
		$VALUES = (new SqlHelper$Order$Type[] {
			ASC, DESC
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       SqlHelper$Order$Type[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #25  <Field SqlHelper$Order$Type ASC>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #28  <Field SqlHelper$Order$Type DESC>
	//   21   41:aastore         
	//   22   42:putstatic       #30  <Field SqlHelper$Order$Type[] $VALUES>
	//*  23   45:return          
	}

	private SqlHelper$Order$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #32  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

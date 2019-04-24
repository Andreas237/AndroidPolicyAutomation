// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;


// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			BaseModel

public static final class BaseModel$Action extends Enum
{

	public static BaseModel$Action valueOf(String s)
	{
		return (BaseModel$Action)Enum.valueOf(com/raizlabs/android/dbflow/structure/BaseModel$Action, s);
	//    0    0:ldc1            #2   <Class BaseModel$Action>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BaseModel$Action>
	//    4    9:areturn         
	}

	public static BaseModel$Action[] values()
	{
		return (BaseModel$Action[])((BaseModel$Action []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field BaseModel$Action[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.raizlabs.android.dbflow.structure.BaseModel$Action_3B_.clone()>
	//    2    6:checkcast       #50  <Class BaseModel$Action[]>
	//    3    9:areturn         
	}

	private static final BaseModel$Action $VALUES[];
	public static final BaseModel$Action CHANGE;
	public static final BaseModel$Action DELETE;
	public static final BaseModel$Action INSERT;
	public static final BaseModel$Action SAVE;
	public static final BaseModel$Action UPDATE;

	static 
	{
		SAVE = new BaseModel$Action("SAVE", 0);
	//    0    0:new             #2   <Class BaseModel$Action>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "SAVE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void BaseModel$Action(String, int)>
	//    5   10:putstatic       #25  <Field BaseModel$Action SAVE>
		INSERT = new BaseModel$Action("INSERT", 1);
	//    6   13:new             #2   <Class BaseModel$Action>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "INSERT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void BaseModel$Action(String, int)>
	//   11   23:putstatic       #28  <Field BaseModel$Action INSERT>
		UPDATE = new BaseModel$Action("UPDATE", 2);
	//   12   26:new             #2   <Class BaseModel$Action>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "UPDATE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void BaseModel$Action(String, int)>
	//   17   36:putstatic       #31  <Field BaseModel$Action UPDATE>
		DELETE = new BaseModel$Action("DELETE", 3);
	//   18   39:new             #2   <Class BaseModel$Action>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "DELETE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void BaseModel$Action(String, int)>
	//   23   49:putstatic       #34  <Field BaseModel$Action DELETE>
		CHANGE = new BaseModel$Action("CHANGE", 4);
	//   24   52:new             #2   <Class BaseModel$Action>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "CHANGE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void BaseModel$Action(String, int)>
	//   29   62:putstatic       #37  <Field BaseModel$Action CHANGE>
		$VALUES = (new BaseModel$Action[] {
			SAVE, INSERT, UPDATE, DELETE, CHANGE
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       BaseModel$Action[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field BaseModel$Action SAVE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field BaseModel$Action INSERT>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field BaseModel$Action UPDATE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field BaseModel$Action DELETE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field BaseModel$Action CHANGE>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field BaseModel$Action[] $VALUES>
	//*  53  102:return          
	}

	private BaseModel$Action(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

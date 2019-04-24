// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			GameRequestContent

public static final class GameRequestContent$Filters extends Enum
{

	public static GameRequestContent$Filters valueOf(String s)
	{
		return (GameRequestContent$Filters)Enum.valueOf(com/facebook/share/model/GameRequestContent$Filters, s);
	//    0    0:ldc1            #2   <Class GameRequestContent$Filters>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GameRequestContent$Filters>
	//    4    9:areturn         
	}

	public static GameRequestContent$Filters[] values()
	{
		return (GameRequestContent$Filters[])((GameRequestContent$Filters []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field GameRequestContent$Filters[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.share.model.GameRequestContent$Filters_3B_.clone()>
	//    2    6:checkcast       #38  <Class GameRequestContent$Filters[]>
	//    3    9:areturn         
	}

	private static final GameRequestContent$Filters $VALUES[];
	public static final GameRequestContent$Filters APP_NON_USERS;
	public static final GameRequestContent$Filters APP_USERS;

	static 
	{
		APP_USERS = new GameRequestContent$Filters("APP_USERS", 0);
	//    0    0:new             #2   <Class GameRequestContent$Filters>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "APP_USERS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void GameRequestContent$Filters(String, int)>
	//    5   10:putstatic       #22  <Field GameRequestContent$Filters APP_USERS>
		APP_NON_USERS = new GameRequestContent$Filters("APP_NON_USERS", 1);
	//    6   13:new             #2   <Class GameRequestContent$Filters>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "APP_NON_USERS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void GameRequestContent$Filters(String, int)>
	//   11   23:putstatic       #25  <Field GameRequestContent$Filters APP_NON_USERS>
		$VALUES = (new GameRequestContent$Filters[] {
			APP_USERS, APP_NON_USERS
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       GameRequestContent$Filters[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field GameRequestContent$Filters APP_USERS>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field GameRequestContent$Filters APP_NON_USERS>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field GameRequestContent$Filters[] $VALUES>
	//*  23   45:return          
	}

	private GameRequestContent$Filters(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

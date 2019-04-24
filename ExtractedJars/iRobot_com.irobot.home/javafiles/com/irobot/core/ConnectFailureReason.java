// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ConnectFailureReason extends Enum
{

	private ConnectFailureReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #22  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ConnectFailureReason valueOf(String s)
	{
		return (ConnectFailureReason)Enum.valueOf(com/irobot/core/ConnectFailureReason, s);
	//    0    0:ldc1            #2   <Class ConnectFailureReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #28  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConnectFailureReason>
	//    4    9:areturn         
	}

	public static ConnectFailureReason[] values()
	{
		return (ConnectFailureReason[])((ConnectFailureReason []) ($VALUES)).clone();
	//    0    0:getstatic       #20  <Field ConnectFailureReason[] $VALUES>
	//    1    3:invokevirtual   #35  <Method Object _5B_Lcom.irobot.core.ConnectFailureReason_3B_.clone()>
	//    2    6:checkcast       #31  <Class ConnectFailureReason[]>
	//    3    9:areturn         
	}

	private static final ConnectFailureReason $VALUES[];
	public static final ConnectFailureReason Unknown;

	static 
	{
		Unknown = new ConnectFailureReason("Unknown", 0);
	//    0    0:new             #2   <Class ConnectFailureReason>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "Unknown">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #16  <Method void ConnectFailureReason(String, int)>
	//    5   10:putstatic       #18  <Field ConnectFailureReason Unknown>
		$VALUES = (new ConnectFailureReason[] {
			Unknown
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       ConnectFailureReason[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #18  <Field ConnectFailureReason Unknown>
	//   11   22:aastore         
	//   12   23:putstatic       #20  <Field ConnectFailureReason[] $VALUES>
	//*  13   26:return          
	}
}

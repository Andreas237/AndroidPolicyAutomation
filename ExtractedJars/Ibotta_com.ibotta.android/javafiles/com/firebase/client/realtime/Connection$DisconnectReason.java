// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;


// Referenced classes of package com.firebase.client.realtime:
//			Connection

public static final class Connection$DisconnectReason extends Enum
{

	public static Connection$DisconnectReason valueOf(String s)
	{
		return (Connection$DisconnectReason)Enum.valueOf(com/firebase/client/realtime/Connection$DisconnectReason, s);
	//    0    0:ldc1            #2   <Class Connection$DisconnectReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Connection$DisconnectReason>
	//    4    9:areturn         
	}

	public static Connection$DisconnectReason[] values()
	{
		return (Connection$DisconnectReason[])((Connection$DisconnectReason []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Connection$DisconnectReason[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.realtime.Connection$DisconnectReason_3B_.clone()>
	//    2    6:checkcast       #38  <Class Connection$DisconnectReason[]>
	//    3    9:areturn         
	}

	private static final Connection$DisconnectReason $VALUES[];
	public static final Connection$DisconnectReason OTHER;
	public static final Connection$DisconnectReason SERVER_RESET;

	static 
	{
		SERVER_RESET = new Connection$DisconnectReason("SERVER_RESET", 0);
	//    0    0:new             #2   <Class Connection$DisconnectReason>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "SERVER_RESET">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Connection$DisconnectReason(String, int)>
	//    5   10:putstatic       #22  <Field Connection$DisconnectReason SERVER_RESET>
		OTHER = new Connection$DisconnectReason("OTHER", 1);
	//    6   13:new             #2   <Class Connection$DisconnectReason>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "OTHER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Connection$DisconnectReason(String, int)>
	//   11   23:putstatic       #25  <Field Connection$DisconnectReason OTHER>
		$VALUES = (new Connection$DisconnectReason[] {
			SERVER_RESET, OTHER
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Connection$DisconnectReason[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Connection$DisconnectReason SERVER_RESET>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Connection$DisconnectReason OTHER>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Connection$DisconnectReason[] $VALUES>
	//*  23   45:return          
	}

	private Connection$DisconnectReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

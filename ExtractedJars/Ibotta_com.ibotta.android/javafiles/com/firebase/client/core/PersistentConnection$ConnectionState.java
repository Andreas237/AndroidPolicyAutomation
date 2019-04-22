// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

private static final class PersistentConnection$ConnectionState extends Enum
{

	public static PersistentConnection$ConnectionState valueOf(String s)
	{
		return (PersistentConnection$ConnectionState)Enum.valueOf(com/firebase/client/core/PersistentConnection$ConnectionState, s);
	//    0    0:ldc1            #2   <Class PersistentConnection$ConnectionState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PersistentConnection$ConnectionState>
	//    4    9:areturn         
	}

	public static PersistentConnection$ConnectionState[] values()
	{
		return (PersistentConnection$ConnectionState[])((PersistentConnection$ConnectionState []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field PersistentConnection$ConnectionState[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.firebase.client.core.PersistentConnection$ConnectionState_3B_.clone()>
	//    2    6:checkcast       #42  <Class PersistentConnection$ConnectionState[]>
	//    3    9:areturn         
	}

	private static final PersistentConnection$ConnectionState $VALUES[];
	public static final PersistentConnection$ConnectionState Authenticating;
	public static final PersistentConnection$ConnectionState Connected;
	public static final PersistentConnection$ConnectionState Disconnected;

	static 
	{
		Disconnected = new PersistentConnection$ConnectionState("Disconnected", 0);
	//    0    0:new             #2   <Class PersistentConnection$ConnectionState>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Disconnected">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
	//    5   10:putstatic       #23  <Field PersistentConnection$ConnectionState Disconnected>
		Authenticating = new PersistentConnection$ConnectionState("Authenticating", 1);
	//    6   13:new             #2   <Class PersistentConnection$ConnectionState>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Authenticating">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
	//   11   23:putstatic       #26  <Field PersistentConnection$ConnectionState Authenticating>
		Connected = new PersistentConnection$ConnectionState("Connected", 2);
	//   12   26:new             #2   <Class PersistentConnection$ConnectionState>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Connected">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
	//   17   36:putstatic       #29  <Field PersistentConnection$ConnectionState Connected>
		$VALUES = (new PersistentConnection$ConnectionState[] {
			Disconnected, Authenticating, Connected
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       PersistentConnection$ConnectionState[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field PersistentConnection$ConnectionState Disconnected>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field PersistentConnection$ConnectionState Authenticating>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field PersistentConnection$ConnectionState Connected>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field PersistentConnection$ConnectionState[] $VALUES>
	//*  33   64:return          
	}

	private PersistentConnection$ConnectionState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

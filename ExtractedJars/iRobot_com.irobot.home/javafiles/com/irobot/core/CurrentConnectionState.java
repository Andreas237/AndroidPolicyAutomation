// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class CurrentConnectionState extends Enum
{

	private CurrentConnectionState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CurrentConnectionState valueOf(String s)
	{
		return (CurrentConnectionState)Enum.valueOf(com/irobot/core/CurrentConnectionState, s);
	//    0    0:ldc1            #2   <Class CurrentConnectionState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CurrentConnectionState>
	//    4    9:areturn         
	}

	public static CurrentConnectionState[] values()
	{
		return (CurrentConnectionState[])((CurrentConnectionState []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field CurrentConnectionState[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.irobot.core.CurrentConnectionState_3B_.clone()>
	//    2    6:checkcast       #55  <Class CurrentConnectionState[]>
	//    3    9:areturn         
	}

	private static final CurrentConnectionState $VALUES[];
	public static final CurrentConnectionState ConnectedLocally;
	public static final CurrentConnectionState ConnectedRemotely;
	public static final CurrentConnectionState Connecting;
	public static final CurrentConnectionState Disconnected;
	public static final CurrentConnectionState Error;
	public static final CurrentConnectionState RemoteMissing;
	public static final CurrentConnectionState Unknown;

	static 
	{
		Disconnected = new CurrentConnectionState("Disconnected", 0);
	//    0    0:new             #2   <Class CurrentConnectionState>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Disconnected">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//    5   10:putstatic       #24  <Field CurrentConnectionState Disconnected>
		Connecting = new CurrentConnectionState("Connecting", 1);
	//    6   13:new             #2   <Class CurrentConnectionState>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "Connecting">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   11   23:putstatic       #27  <Field CurrentConnectionState Connecting>
		ConnectedLocally = new CurrentConnectionState("ConnectedLocally", 2);
	//   12   26:new             #2   <Class CurrentConnectionState>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "ConnectedLocally">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   17   36:putstatic       #30  <Field CurrentConnectionState ConnectedLocally>
		ConnectedRemotely = new CurrentConnectionState("ConnectedRemotely", 3);
	//   18   39:new             #2   <Class CurrentConnectionState>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "ConnectedRemotely">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   23   49:putstatic       #33  <Field CurrentConnectionState ConnectedRemotely>
		RemoteMissing = new CurrentConnectionState("RemoteMissing", 4);
	//   24   52:new             #2   <Class CurrentConnectionState>
	//   25   55:dup             
	//   26   56:ldc1            #34  <String "RemoteMissing">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   29   62:putstatic       #36  <Field CurrentConnectionState RemoteMissing>
		Error = new CurrentConnectionState("Error", 5);
	//   30   65:new             #2   <Class CurrentConnectionState>
	//   31   68:dup             
	//   32   69:ldc1            #37  <String "Error">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   35   75:putstatic       #39  <Field CurrentConnectionState Error>
		Unknown = new CurrentConnectionState("Unknown", 6);
	//   36   78:new             #2   <Class CurrentConnectionState>
	//   37   81:dup             
	//   38   82:ldc1            #40  <String "Unknown">
	//   39   84:bipush          6
	//   40   86:invokespecial   #22  <Method void CurrentConnectionState(String, int)>
	//   41   89:putstatic       #42  <Field CurrentConnectionState Unknown>
		$VALUES = (new CurrentConnectionState[] {
			Disconnected, Connecting, ConnectedLocally, ConnectedRemotely, RemoteMissing, Error, Unknown
		});
	//   42   92:bipush          7
	//   43   94:anewarray       CurrentConnectionState[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #24  <Field CurrentConnectionState Disconnected>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #27  <Field CurrentConnectionState Connecting>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #30  <Field CurrentConnectionState ConnectedLocally>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #33  <Field CurrentConnectionState ConnectedRemotely>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #36  <Field CurrentConnectionState RemoteMissing>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #39  <Field CurrentConnectionState Error>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #42  <Field CurrentConnectionState Unknown>
	//   71  139:aastore         
	//   72  140:putstatic       #44  <Field CurrentConnectionState[] $VALUES>
	//*  73  143:return          
	}
}

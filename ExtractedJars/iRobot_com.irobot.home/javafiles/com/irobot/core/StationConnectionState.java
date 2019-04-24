// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class StationConnectionState extends Enum
{

	private StationConnectionState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static StationConnectionState valueOf(String s)
	{
		return (StationConnectionState)Enum.valueOf(com/irobot/core/StationConnectionState, s);
	//    0    0:ldc1            #2   <Class StationConnectionState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StationConnectionState>
	//    4    9:areturn         
	}

	public static StationConnectionState[] values()
	{
		return (StationConnectionState[])((StationConnectionState []) ($VALUES)).clone();
	//    0    0:getstatic       #60  <Field StationConnectionState[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.irobot.core.StationConnectionState_3B_.clone()>
	//    2    6:checkcast       #71  <Class StationConnectionState[]>
	//    3    9:areturn         
	}

	private static final StationConnectionState $VALUES[];
	public static final StationConnectionState AuthError;
	public static final StationConnectionState ChannelSwitch;
	public static final StationConnectionState ConnectError;
	public static final StationConnectionState Connecting;
	public static final StationConnectionState DhcpError;
	public static final StationConnectionState Idle;
	public static final StationConnectionState LinkLostError;
	public static final StationConnectionState NetworkError;
	public static final StationConnectionState NotOnDock;
	public static final StationConnectionState Ok;
	public static final StationConnectionState RssiLow;

	static 
	{
		Idle = new StationConnectionState("Idle", 0);
	//    0    0:new             #2   <Class StationConnectionState>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "Idle">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//    5   10:putstatic       #28  <Field StationConnectionState Idle>
		Ok = new StationConnectionState("Ok", 1);
	//    6   13:new             #2   <Class StationConnectionState>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "Ok">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   11   23:putstatic       #31  <Field StationConnectionState Ok>
		NetworkError = new StationConnectionState("NetworkError", 2);
	//   12   26:new             #2   <Class StationConnectionState>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "NetworkError">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   17   36:putstatic       #34  <Field StationConnectionState NetworkError>
		AuthError = new StationConnectionState("AuthError", 3);
	//   18   39:new             #2   <Class StationConnectionState>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "AuthError">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   23   49:putstatic       #37  <Field StationConnectionState AuthError>
		DhcpError = new StationConnectionState("DhcpError", 4);
	//   24   52:new             #2   <Class StationConnectionState>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "DhcpError">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   29   62:putstatic       #40  <Field StationConnectionState DhcpError>
		LinkLostError = new StationConnectionState("LinkLostError", 5);
	//   30   65:new             #2   <Class StationConnectionState>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "LinkLostError">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   35   75:putstatic       #43  <Field StationConnectionState LinkLostError>
		ConnectError = new StationConnectionState("ConnectError", 6);
	//   36   78:new             #2   <Class StationConnectionState>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "ConnectError">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   41   89:putstatic       #46  <Field StationConnectionState ConnectError>
		ChannelSwitch = new StationConnectionState("ChannelSwitch", 7);
	//   42   92:new             #2   <Class StationConnectionState>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "ChannelSwitch">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   47  103:putstatic       #49  <Field StationConnectionState ChannelSwitch>
		Connecting = new StationConnectionState("Connecting", 8);
	//   48  106:new             #2   <Class StationConnectionState>
	//   49  109:dup             
	//   50  110:ldc1            #50  <String "Connecting">
	//   51  112:bipush          8
	//   52  114:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   53  117:putstatic       #52  <Field StationConnectionState Connecting>
		NotOnDock = new StationConnectionState("NotOnDock", 9);
	//   54  120:new             #2   <Class StationConnectionState>
	//   55  123:dup             
	//   56  124:ldc1            #53  <String "NotOnDock">
	//   57  126:bipush          9
	//   58  128:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   59  131:putstatic       #55  <Field StationConnectionState NotOnDock>
		RssiLow = new StationConnectionState("RssiLow", 10);
	//   60  134:new             #2   <Class StationConnectionState>
	//   61  137:dup             
	//   62  138:ldc1            #56  <String "RssiLow">
	//   63  140:bipush          10
	//   64  142:invokespecial   #26  <Method void StationConnectionState(String, int)>
	//   65  145:putstatic       #58  <Field StationConnectionState RssiLow>
		$VALUES = (new StationConnectionState[] {
			Idle, Ok, NetworkError, AuthError, DhcpError, LinkLostError, ConnectError, ChannelSwitch, Connecting, NotOnDock, 
			RssiLow
		});
	//   66  148:bipush          11
	//   67  150:anewarray       StationConnectionState[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #28  <Field StationConnectionState Idle>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #31  <Field StationConnectionState Ok>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #34  <Field StationConnectionState NetworkError>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #37  <Field StationConnectionState AuthError>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #40  <Field StationConnectionState DhcpError>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #43  <Field StationConnectionState LinkLostError>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #46  <Field StationConnectionState ConnectError>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #49  <Field StationConnectionState ChannelSwitch>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #52  <Field StationConnectionState Connecting>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #55  <Field StationConnectionState NotOnDock>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #58  <Field StationConnectionState RssiLow>
	//  111  223:aastore         
	//  112  224:putstatic       #60  <Field StationConnectionState[] $VALUES>
	//* 113  227:return          
	}
}

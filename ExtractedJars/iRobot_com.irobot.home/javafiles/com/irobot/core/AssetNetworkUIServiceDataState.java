// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetNetworkUIServiceDataState extends Enum
{

	private AssetNetworkUIServiceDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #70  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetNetworkUIServiceDataState valueOf(String s)
	{
		return (AssetNetworkUIServiceDataState)Enum.valueOf(com/irobot/core/AssetNetworkUIServiceDataState, s);
	//    0    0:ldc1            #2   <Class AssetNetworkUIServiceDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetNetworkUIServiceDataState>
	//    4    9:areturn         
	}

	public static AssetNetworkUIServiceDataState[] values()
	{
		return (AssetNetworkUIServiceDataState[])((AssetNetworkUIServiceDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #68  <Field AssetNetworkUIServiceDataState[] $VALUES>
	//    1    3:invokevirtual   #83  <Method Object _5B_Lcom.irobot.core.AssetNetworkUIServiceDataState_3B_.clone()>
	//    2    6:checkcast       #79  <Class AssetNetworkUIServiceDataState[]>
	//    3    9:areturn         
	}

	private static final AssetNetworkUIServiceDataState $VALUES[];
	public static final AssetNetworkUIServiceDataState AwsCloudEnvironment;
	public static final AssetNetworkUIServiceDataState CloudNetworkAddress;
	public static final AssetNetworkUIServiceDataState Invalid;
	public static final AssetNetworkUIServiceDataState LocalConnectionState;
	public static final AssetNetworkUIServiceDataState MacAddress;
	public static final AssetNetworkUIServiceDataState NetworkAddress;
	public static final AssetNetworkUIServiceDataState NetworkSettings;
	public static final AssetNetworkUIServiceDataState NetworkStatus;
	public static final AssetNetworkUIServiceDataState RemoteConnectionState;
	public static final AssetNetworkUIServiceDataState SignalStrength;
	public static final AssetNetworkUIServiceDataState SoftApState;
	public static final AssetNetworkUIServiceDataState WifiConfiguration;
	public static final AssetNetworkUIServiceDataState WifiLog;

	static 
	{
		LocalConnectionState = new AssetNetworkUIServiceDataState("LocalConnectionState", 0);
	//    0    0:new             #2   <Class AssetNetworkUIServiceDataState>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "LocalConnectionState">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//    5   10:putstatic       #30  <Field AssetNetworkUIServiceDataState LocalConnectionState>
		RemoteConnectionState = new AssetNetworkUIServiceDataState("RemoteConnectionState", 1);
	//    6   13:new             #2   <Class AssetNetworkUIServiceDataState>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "RemoteConnectionState">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   11   23:putstatic       #33  <Field AssetNetworkUIServiceDataState RemoteConnectionState>
		NetworkAddress = new AssetNetworkUIServiceDataState("NetworkAddress", 2);
	//   12   26:new             #2   <Class AssetNetworkUIServiceDataState>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "NetworkAddress">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   17   36:putstatic       #36  <Field AssetNetworkUIServiceDataState NetworkAddress>
		WifiConfiguration = new AssetNetworkUIServiceDataState("WifiConfiguration", 3);
	//   18   39:new             #2   <Class AssetNetworkUIServiceDataState>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "WifiConfiguration">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   23   49:putstatic       #39  <Field AssetNetworkUIServiceDataState WifiConfiguration>
		NetworkSettings = new AssetNetworkUIServiceDataState("NetworkSettings", 4);
	//   24   52:new             #2   <Class AssetNetworkUIServiceDataState>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "NetworkSettings">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   29   62:putstatic       #42  <Field AssetNetworkUIServiceDataState NetworkSettings>
		NetworkStatus = new AssetNetworkUIServiceDataState("NetworkStatus", 5);
	//   30   65:new             #2   <Class AssetNetworkUIServiceDataState>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "NetworkStatus">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   35   75:putstatic       #45  <Field AssetNetworkUIServiceDataState NetworkStatus>
		SoftApState = new AssetNetworkUIServiceDataState("SoftApState", 6);
	//   36   78:new             #2   <Class AssetNetworkUIServiceDataState>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "SoftApState">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   41   89:putstatic       #48  <Field AssetNetworkUIServiceDataState SoftApState>
		MacAddress = new AssetNetworkUIServiceDataState("MacAddress", 7);
	//   42   92:new             #2   <Class AssetNetworkUIServiceDataState>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "MacAddress">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   47  103:putstatic       #51  <Field AssetNetworkUIServiceDataState MacAddress>
		SignalStrength = new AssetNetworkUIServiceDataState("SignalStrength", 8);
	//   48  106:new             #2   <Class AssetNetworkUIServiceDataState>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "SignalStrength">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   53  117:putstatic       #54  <Field AssetNetworkUIServiceDataState SignalStrength>
		CloudNetworkAddress = new AssetNetworkUIServiceDataState("CloudNetworkAddress", 9);
	//   54  120:new             #2   <Class AssetNetworkUIServiceDataState>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "CloudNetworkAddress">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   59  131:putstatic       #57  <Field AssetNetworkUIServiceDataState CloudNetworkAddress>
		AwsCloudEnvironment = new AssetNetworkUIServiceDataState("AwsCloudEnvironment", 10);
	//   60  134:new             #2   <Class AssetNetworkUIServiceDataState>
	//   61  137:dup             
	//   62  138:ldc1            #58  <String "AwsCloudEnvironment">
	//   63  140:bipush          10
	//   64  142:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   65  145:putstatic       #60  <Field AssetNetworkUIServiceDataState AwsCloudEnvironment>
		WifiLog = new AssetNetworkUIServiceDataState("WifiLog", 11);
	//   66  148:new             #2   <Class AssetNetworkUIServiceDataState>
	//   67  151:dup             
	//   68  152:ldc1            #61  <String "WifiLog">
	//   69  154:bipush          11
	//   70  156:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   71  159:putstatic       #63  <Field AssetNetworkUIServiceDataState WifiLog>
		Invalid = new AssetNetworkUIServiceDataState("Invalid", 12);
	//   72  162:new             #2   <Class AssetNetworkUIServiceDataState>
	//   73  165:dup             
	//   74  166:ldc1            #64  <String "Invalid">
	//   75  168:bipush          12
	//   76  170:invokespecial   #28  <Method void AssetNetworkUIServiceDataState(String, int)>
	//   77  173:putstatic       #66  <Field AssetNetworkUIServiceDataState Invalid>
		$VALUES = (new AssetNetworkUIServiceDataState[] {
			LocalConnectionState, RemoteConnectionState, NetworkAddress, WifiConfiguration, NetworkSettings, NetworkStatus, SoftApState, MacAddress, SignalStrength, CloudNetworkAddress, 
			AwsCloudEnvironment, WifiLog, Invalid
		});
	//   78  176:bipush          13
	//   79  178:anewarray       AssetNetworkUIServiceDataState[]
	//   80  181:dup             
	//   81  182:iconst_0        
	//   82  183:getstatic       #30  <Field AssetNetworkUIServiceDataState LocalConnectionState>
	//   83  186:aastore         
	//   84  187:dup             
	//   85  188:iconst_1        
	//   86  189:getstatic       #33  <Field AssetNetworkUIServiceDataState RemoteConnectionState>
	//   87  192:aastore         
	//   88  193:dup             
	//   89  194:iconst_2        
	//   90  195:getstatic       #36  <Field AssetNetworkUIServiceDataState NetworkAddress>
	//   91  198:aastore         
	//   92  199:dup             
	//   93  200:iconst_3        
	//   94  201:getstatic       #39  <Field AssetNetworkUIServiceDataState WifiConfiguration>
	//   95  204:aastore         
	//   96  205:dup             
	//   97  206:iconst_4        
	//   98  207:getstatic       #42  <Field AssetNetworkUIServiceDataState NetworkSettings>
	//   99  210:aastore         
	//  100  211:dup             
	//  101  212:iconst_5        
	//  102  213:getstatic       #45  <Field AssetNetworkUIServiceDataState NetworkStatus>
	//  103  216:aastore         
	//  104  217:dup             
	//  105  218:bipush          6
	//  106  220:getstatic       #48  <Field AssetNetworkUIServiceDataState SoftApState>
	//  107  223:aastore         
	//  108  224:dup             
	//  109  225:bipush          7
	//  110  227:getstatic       #51  <Field AssetNetworkUIServiceDataState MacAddress>
	//  111  230:aastore         
	//  112  231:dup             
	//  113  232:bipush          8
	//  114  234:getstatic       #54  <Field AssetNetworkUIServiceDataState SignalStrength>
	//  115  237:aastore         
	//  116  238:dup             
	//  117  239:bipush          9
	//  118  241:getstatic       #57  <Field AssetNetworkUIServiceDataState CloudNetworkAddress>
	//  119  244:aastore         
	//  120  245:dup             
	//  121  246:bipush          10
	//  122  248:getstatic       #60  <Field AssetNetworkUIServiceDataState AwsCloudEnvironment>
	//  123  251:aastore         
	//  124  252:dup             
	//  125  253:bipush          11
	//  126  255:getstatic       #63  <Field AssetNetworkUIServiceDataState WifiLog>
	//  127  258:aastore         
	//  128  259:dup             
	//  129  260:bipush          12
	//  130  262:getstatic       #66  <Field AssetNetworkUIServiceDataState Invalid>
	//  131  265:aastore         
	//  132  266:putstatic       #68  <Field AssetNetworkUIServiceDataState[] $VALUES>
	//* 133  269:return          
	}
}

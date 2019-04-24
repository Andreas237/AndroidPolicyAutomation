// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class CloudServerState extends Enum
{

	private CloudServerState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #78  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CloudServerState valueOf(String s)
	{
		return (CloudServerState)Enum.valueOf(com/irobot/core/CloudServerState, s);
	//    0    0:ldc1            #2   <Class CloudServerState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #84  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CloudServerState>
	//    4    9:areturn         
	}

	public static CloudServerState[] values()
	{
		return (CloudServerState[])((CloudServerState []) ($VALUES)).clone();
	//    0    0:getstatic       #76  <Field CloudServerState[] $VALUES>
	//    1    3:invokevirtual   #91  <Method Object _5B_Lcom.irobot.core.CloudServerState_3B_.clone()>
	//    2    6:checkcast       #87  <Class CloudServerState[]>
	//    3    9:areturn         
	}

	private static final CloudServerState $VALUES[];
	public static final CloudServerState CloudStateConnected;
	public static final CloudServerState CloudStateConnecting;
	public static final CloudServerState CloudStateRegistration;
	public static final CloudServerState CloudStateServiceDiscovery;
	public static final CloudServerState CloudStateUnconfigured;
	public static final CloudServerState CloudStateUnknown;
	public static final CloudServerState CloudStateWaitForNtp;
	public static final CloudServerState NetworkError;
	public static final CloudServerState NtpError;
	public static final CloudServerState Off;
	public static final CloudServerState On;
	public static final CloudServerState RegistrationFailedError;
	public static final CloudServerState ServerDown;
	public static final CloudServerState ServerError;
	public static final CloudServerState ServiceDiscoveryError;

	static 
	{
		Off = new CloudServerState("Off", 0);
	//    0    0:new             #2   <Class CloudServerState>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Off">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #30  <Method void CloudServerState(String, int)>
	//    5   10:putstatic       #32  <Field CloudServerState Off>
		On = new CloudServerState("On", 1);
	//    6   13:new             #2   <Class CloudServerState>
	//    7   16:dup             
	//    8   17:ldc1            #33  <String "On">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   11   23:putstatic       #35  <Field CloudServerState On>
		ServerError = new CloudServerState("ServerError", 2);
	//   12   26:new             #2   <Class CloudServerState>
	//   13   29:dup             
	//   14   30:ldc1            #36  <String "ServerError">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   17   36:putstatic       #38  <Field CloudServerState ServerError>
		ServerDown = new CloudServerState("ServerDown", 3);
	//   18   39:new             #2   <Class CloudServerState>
	//   19   42:dup             
	//   20   43:ldc1            #39  <String "ServerDown">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   23   49:putstatic       #41  <Field CloudServerState ServerDown>
		NetworkError = new CloudServerState("NetworkError", 4);
	//   24   52:new             #2   <Class CloudServerState>
	//   25   55:dup             
	//   26   56:ldc1            #42  <String "NetworkError">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   29   62:putstatic       #44  <Field CloudServerState NetworkError>
		NtpError = new CloudServerState("NtpError", 5);
	//   30   65:new             #2   <Class CloudServerState>
	//   31   68:dup             
	//   32   69:ldc1            #45  <String "NtpError">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   35   75:putstatic       #47  <Field CloudServerState NtpError>
		ServiceDiscoveryError = new CloudServerState("ServiceDiscoveryError", 6);
	//   36   78:new             #2   <Class CloudServerState>
	//   37   81:dup             
	//   38   82:ldc1            #48  <String "ServiceDiscoveryError">
	//   39   84:bipush          6
	//   40   86:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   41   89:putstatic       #50  <Field CloudServerState ServiceDiscoveryError>
		RegistrationFailedError = new CloudServerState("RegistrationFailedError", 7);
	//   42   92:new             #2   <Class CloudServerState>
	//   43   95:dup             
	//   44   96:ldc1            #51  <String "RegistrationFailedError">
	//   45   98:bipush          7
	//   46  100:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   47  103:putstatic       #53  <Field CloudServerState RegistrationFailedError>
		CloudStateUnknown = new CloudServerState("CloudStateUnknown", 8);
	//   48  106:new             #2   <Class CloudServerState>
	//   49  109:dup             
	//   50  110:ldc1            #54  <String "CloudStateUnknown">
	//   51  112:bipush          8
	//   52  114:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   53  117:putstatic       #56  <Field CloudServerState CloudStateUnknown>
		CloudStateUnconfigured = new CloudServerState("CloudStateUnconfigured", 9);
	//   54  120:new             #2   <Class CloudServerState>
	//   55  123:dup             
	//   56  124:ldc1            #57  <String "CloudStateUnconfigured">
	//   57  126:bipush          9
	//   58  128:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   59  131:putstatic       #59  <Field CloudServerState CloudStateUnconfigured>
		CloudStateWaitForNtp = new CloudServerState("CloudStateWaitForNtp", 10);
	//   60  134:new             #2   <Class CloudServerState>
	//   61  137:dup             
	//   62  138:ldc1            #60  <String "CloudStateWaitForNtp">
	//   63  140:bipush          10
	//   64  142:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   65  145:putstatic       #62  <Field CloudServerState CloudStateWaitForNtp>
		CloudStateServiceDiscovery = new CloudServerState("CloudStateServiceDiscovery", 11);
	//   66  148:new             #2   <Class CloudServerState>
	//   67  151:dup             
	//   68  152:ldc1            #63  <String "CloudStateServiceDiscovery">
	//   69  154:bipush          11
	//   70  156:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   71  159:putstatic       #65  <Field CloudServerState CloudStateServiceDiscovery>
		CloudStateRegistration = new CloudServerState("CloudStateRegistration", 12);
	//   72  162:new             #2   <Class CloudServerState>
	//   73  165:dup             
	//   74  166:ldc1            #66  <String "CloudStateRegistration">
	//   75  168:bipush          12
	//   76  170:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   77  173:putstatic       #68  <Field CloudServerState CloudStateRegistration>
		CloudStateConnecting = new CloudServerState("CloudStateConnecting", 13);
	//   78  176:new             #2   <Class CloudServerState>
	//   79  179:dup             
	//   80  180:ldc1            #69  <String "CloudStateConnecting">
	//   81  182:bipush          13
	//   82  184:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   83  187:putstatic       #71  <Field CloudServerState CloudStateConnecting>
		CloudStateConnected = new CloudServerState("CloudStateConnected", 14);
	//   84  190:new             #2   <Class CloudServerState>
	//   85  193:dup             
	//   86  194:ldc1            #72  <String "CloudStateConnected">
	//   87  196:bipush          14
	//   88  198:invokespecial   #30  <Method void CloudServerState(String, int)>
	//   89  201:putstatic       #74  <Field CloudServerState CloudStateConnected>
		$VALUES = (new CloudServerState[] {
			Off, On, ServerError, ServerDown, NetworkError, NtpError, ServiceDiscoveryError, RegistrationFailedError, CloudStateUnknown, CloudStateUnconfigured, 
			CloudStateWaitForNtp, CloudStateServiceDiscovery, CloudStateRegistration, CloudStateConnecting, CloudStateConnected
		});
	//   90  204:bipush          15
	//   91  206:anewarray       CloudServerState[]
	//   92  209:dup             
	//   93  210:iconst_0        
	//   94  211:getstatic       #32  <Field CloudServerState Off>
	//   95  214:aastore         
	//   96  215:dup             
	//   97  216:iconst_1        
	//   98  217:getstatic       #35  <Field CloudServerState On>
	//   99  220:aastore         
	//  100  221:dup             
	//  101  222:iconst_2        
	//  102  223:getstatic       #38  <Field CloudServerState ServerError>
	//  103  226:aastore         
	//  104  227:dup             
	//  105  228:iconst_3        
	//  106  229:getstatic       #41  <Field CloudServerState ServerDown>
	//  107  232:aastore         
	//  108  233:dup             
	//  109  234:iconst_4        
	//  110  235:getstatic       #44  <Field CloudServerState NetworkError>
	//  111  238:aastore         
	//  112  239:dup             
	//  113  240:iconst_5        
	//  114  241:getstatic       #47  <Field CloudServerState NtpError>
	//  115  244:aastore         
	//  116  245:dup             
	//  117  246:bipush          6
	//  118  248:getstatic       #50  <Field CloudServerState ServiceDiscoveryError>
	//  119  251:aastore         
	//  120  252:dup             
	//  121  253:bipush          7
	//  122  255:getstatic       #53  <Field CloudServerState RegistrationFailedError>
	//  123  258:aastore         
	//  124  259:dup             
	//  125  260:bipush          8
	//  126  262:getstatic       #56  <Field CloudServerState CloudStateUnknown>
	//  127  265:aastore         
	//  128  266:dup             
	//  129  267:bipush          9
	//  130  269:getstatic       #59  <Field CloudServerState CloudStateUnconfigured>
	//  131  272:aastore         
	//  132  273:dup             
	//  133  274:bipush          10
	//  134  276:getstatic       #62  <Field CloudServerState CloudStateWaitForNtp>
	//  135  279:aastore         
	//  136  280:dup             
	//  137  281:bipush          11
	//  138  283:getstatic       #65  <Field CloudServerState CloudStateServiceDiscovery>
	//  139  286:aastore         
	//  140  287:dup             
	//  141  288:bipush          12
	//  142  290:getstatic       #68  <Field CloudServerState CloudStateRegistration>
	//  143  293:aastore         
	//  144  294:dup             
	//  145  295:bipush          13
	//  146  297:getstatic       #71  <Field CloudServerState CloudStateConnecting>
	//  147  300:aastore         
	//  148  301:dup             
	//  149  302:bipush          14
	//  150  304:getstatic       #74  <Field CloudServerState CloudStateConnected>
	//  151  307:aastore         
	//  152  308:putstatic       #76  <Field CloudServerState[] $VALUES>
	//* 153  311:return          
	}
}

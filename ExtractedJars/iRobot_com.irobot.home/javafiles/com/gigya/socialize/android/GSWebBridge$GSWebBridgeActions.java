// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;


// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

private static final class GSWebBridge$GSWebBridgeActions extends Enum
{

	public static GSWebBridge$GSWebBridgeActions valueOf(String s)
	{
		return (GSWebBridge$GSWebBridgeActions)Enum.valueOf(com/gigya/socialize/android/GSWebBridge$GSWebBridgeActions, s);
	//    0    0:ldc1            #2   <Class GSWebBridge$GSWebBridgeActions>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GSWebBridge$GSWebBridgeActions>
	//    4    9:areturn         
	}

	public static GSWebBridge$GSWebBridgeActions[] values()
	{
		return (GSWebBridge$GSWebBridgeActions[])((GSWebBridge$GSWebBridgeActions []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field GSWebBridge$GSWebBridgeActions[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.gigya.socialize.android.GSWebBridge$GSWebBridgeActions_3B_.clone()>
	//    2    6:checkcast       #62  <Class GSWebBridge$GSWebBridgeActions[]>
	//    3    9:areturn         
	}

	private static final GSWebBridge$GSWebBridgeActions $VALUES[];
	public static final GSWebBridge$GSWebBridgeActions GET_IDS;
	public static final GSWebBridge$GSWebBridgeActions IS_SESSION_VALID;
	public static final GSWebBridge$GSWebBridgeActions ON_CUSTOM_EVENT;
	public static final GSWebBridge$GSWebBridgeActions ON_JS_EXCEPTION;
	public static final GSWebBridge$GSWebBridgeActions ON_PLUGIN_EVENT;
	public static final GSWebBridge$GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS;
	public static final GSWebBridge$GSWebBridgeActions SEND_OAUTH_REQUEST;
	public static final GSWebBridge$GSWebBridgeActions SEND_REQUEST;

	static 
	{
		IS_SESSION_VALID = new GSWebBridge$GSWebBridgeActions("IS_SESSION_VALID", 0);
	//    0    0:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "IS_SESSION_VALID">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//    5   10:putstatic       #28  <Field GSWebBridge$GSWebBridgeActions IS_SESSION_VALID>
		SEND_REQUEST = new GSWebBridge$GSWebBridgeActions("SEND_REQUEST", 1);
	//    6   13:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "SEND_REQUEST">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   11   23:putstatic       #31  <Field GSWebBridge$GSWebBridgeActions SEND_REQUEST>
		SEND_OAUTH_REQUEST = new GSWebBridge$GSWebBridgeActions("SEND_OAUTH_REQUEST", 2);
	//   12   26:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "SEND_OAUTH_REQUEST">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   17   36:putstatic       #34  <Field GSWebBridge$GSWebBridgeActions SEND_OAUTH_REQUEST>
		GET_IDS = new GSWebBridge$GSWebBridgeActions("GET_IDS", 3);
	//   18   39:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "GET_IDS">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   23   49:putstatic       #37  <Field GSWebBridge$GSWebBridgeActions GET_IDS>
		ON_PLUGIN_EVENT = new GSWebBridge$GSWebBridgeActions("ON_PLUGIN_EVENT", 4);
	//   24   52:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "ON_PLUGIN_EVENT">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   29   62:putstatic       #40  <Field GSWebBridge$GSWebBridgeActions ON_PLUGIN_EVENT>
		ON_CUSTOM_EVENT = new GSWebBridge$GSWebBridgeActions("ON_CUSTOM_EVENT", 5);
	//   30   65:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "ON_CUSTOM_EVENT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   35   75:putstatic       #43  <Field GSWebBridge$GSWebBridgeActions ON_CUSTOM_EVENT>
		REGISTER_FOR_NAMESPACE_EVENTS = new GSWebBridge$GSWebBridgeActions("REGISTER_FOR_NAMESPACE_EVENTS", 6);
	//   36   78:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "REGISTER_FOR_NAMESPACE_EVENTS">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   41   89:putstatic       #46  <Field GSWebBridge$GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS>
		ON_JS_EXCEPTION = new GSWebBridge$GSWebBridgeActions("ON_JS_EXCEPTION", 7);
	//   42   92:new             #2   <Class GSWebBridge$GSWebBridgeActions>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "ON_JS_EXCEPTION">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
	//   47  103:putstatic       #49  <Field GSWebBridge$GSWebBridgeActions ON_JS_EXCEPTION>
		$VALUES = (new GSWebBridge$GSWebBridgeActions[] {
			IS_SESSION_VALID, SEND_REQUEST, SEND_OAUTH_REQUEST, GET_IDS, ON_PLUGIN_EVENT, ON_CUSTOM_EVENT, REGISTER_FOR_NAMESPACE_EVENTS, ON_JS_EXCEPTION
		});
	//   48  106:bipush          8
	//   49  108:anewarray       GSWebBridge$GSWebBridgeActions[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field GSWebBridge$GSWebBridgeActions IS_SESSION_VALID>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field GSWebBridge$GSWebBridgeActions SEND_REQUEST>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field GSWebBridge$GSWebBridgeActions SEND_OAUTH_REQUEST>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field GSWebBridge$GSWebBridgeActions GET_IDS>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field GSWebBridge$GSWebBridgeActions ON_PLUGIN_EVENT>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field GSWebBridge$GSWebBridgeActions ON_CUSTOM_EVENT>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field GSWebBridge$GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field GSWebBridge$GSWebBridgeActions ON_JS_EXCEPTION>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field GSWebBridge$GSWebBridgeActions[] $VALUES>
	//*  83  164:return          
	}

	private GSWebBridge$GSWebBridgeActions(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

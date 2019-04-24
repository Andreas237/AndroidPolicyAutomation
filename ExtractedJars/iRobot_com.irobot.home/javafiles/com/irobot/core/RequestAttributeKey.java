// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class RequestAttributeKey extends Enum
{

	private RequestAttributeKey(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RequestAttributeKey valueOf(String s)
	{
		return (RequestAttributeKey)Enum.valueOf(com/irobot/core/RequestAttributeKey, s);
	//    0    0:ldc1            #2   <Class RequestAttributeKey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RequestAttributeKey>
	//    4    9:areturn         
	}

	public static RequestAttributeKey[] values()
	{
		return (RequestAttributeKey[])((RequestAttributeKey []) ($VALUES)).clone();
	//    0    0:getstatic       #60  <Field RequestAttributeKey[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.irobot.core.RequestAttributeKey_3B_.clone()>
	//    2    6:checkcast       #71  <Class RequestAttributeKey[]>
	//    3    9:areturn         
	}

	private static final RequestAttributeKey $VALUES[];
	public static final RequestAttributeKey BleCharacteristicUuid;
	public static final RequestAttributeKey BleServiceUuid;
	public static final RequestAttributeKey Body;
	public static final RequestAttributeKey ConnectTimeout;
	public static final RequestAttributeKey HttpRequestMethod;
	public static final RequestAttributeKey NetworkAddress;
	public static final RequestAttributeKey OverallTimeout;
	public static final RequestAttributeKey PriorityRequest;
	public static final RequestAttributeKey RequestIdentifier;
	public static final RequestAttributeKey RequestKey;
	public static final RequestAttributeKey Topic;

	static 
	{
		RequestKey = new RequestAttributeKey("RequestKey", 0);
	//    0    0:new             #2   <Class RequestAttributeKey>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "RequestKey">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//    5   10:putstatic       #28  <Field RequestAttributeKey RequestKey>
		RequestIdentifier = new RequestAttributeKey("RequestIdentifier", 1);
	//    6   13:new             #2   <Class RequestAttributeKey>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "RequestIdentifier">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   11   23:putstatic       #31  <Field RequestAttributeKey RequestIdentifier>
		PriorityRequest = new RequestAttributeKey("PriorityRequest", 2);
	//   12   26:new             #2   <Class RequestAttributeKey>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "PriorityRequest">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   17   36:putstatic       #34  <Field RequestAttributeKey PriorityRequest>
		NetworkAddress = new RequestAttributeKey("NetworkAddress", 3);
	//   18   39:new             #2   <Class RequestAttributeKey>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "NetworkAddress">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   23   49:putstatic       #37  <Field RequestAttributeKey NetworkAddress>
		ConnectTimeout = new RequestAttributeKey("ConnectTimeout", 4);
	//   24   52:new             #2   <Class RequestAttributeKey>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "ConnectTimeout">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   29   62:putstatic       #40  <Field RequestAttributeKey ConnectTimeout>
		OverallTimeout = new RequestAttributeKey("OverallTimeout", 5);
	//   30   65:new             #2   <Class RequestAttributeKey>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "OverallTimeout">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   35   75:putstatic       #43  <Field RequestAttributeKey OverallTimeout>
		HttpRequestMethod = new RequestAttributeKey("HttpRequestMethod", 6);
	//   36   78:new             #2   <Class RequestAttributeKey>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "HttpRequestMethod">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   41   89:putstatic       #46  <Field RequestAttributeKey HttpRequestMethod>
		Topic = new RequestAttributeKey("Topic", 7);
	//   42   92:new             #2   <Class RequestAttributeKey>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "Topic">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   47  103:putstatic       #49  <Field RequestAttributeKey Topic>
		Body = new RequestAttributeKey("Body", 8);
	//   48  106:new             #2   <Class RequestAttributeKey>
	//   49  109:dup             
	//   50  110:ldc1            #50  <String "Body">
	//   51  112:bipush          8
	//   52  114:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   53  117:putstatic       #52  <Field RequestAttributeKey Body>
		BleServiceUuid = new RequestAttributeKey("BleServiceUuid", 9);
	//   54  120:new             #2   <Class RequestAttributeKey>
	//   55  123:dup             
	//   56  124:ldc1            #53  <String "BleServiceUuid">
	//   57  126:bipush          9
	//   58  128:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   59  131:putstatic       #55  <Field RequestAttributeKey BleServiceUuid>
		BleCharacteristicUuid = new RequestAttributeKey("BleCharacteristicUuid", 10);
	//   60  134:new             #2   <Class RequestAttributeKey>
	//   61  137:dup             
	//   62  138:ldc1            #56  <String "BleCharacteristicUuid">
	//   63  140:bipush          10
	//   64  142:invokespecial   #26  <Method void RequestAttributeKey(String, int)>
	//   65  145:putstatic       #58  <Field RequestAttributeKey BleCharacteristicUuid>
		$VALUES = (new RequestAttributeKey[] {
			RequestKey, RequestIdentifier, PriorityRequest, NetworkAddress, ConnectTimeout, OverallTimeout, HttpRequestMethod, Topic, Body, BleServiceUuid, 
			BleCharacteristicUuid
		});
	//   66  148:bipush          11
	//   67  150:anewarray       RequestAttributeKey[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #28  <Field RequestAttributeKey RequestKey>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #31  <Field RequestAttributeKey RequestIdentifier>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #34  <Field RequestAttributeKey PriorityRequest>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #37  <Field RequestAttributeKey NetworkAddress>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #40  <Field RequestAttributeKey ConnectTimeout>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #43  <Field RequestAttributeKey OverallTimeout>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #46  <Field RequestAttributeKey HttpRequestMethod>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #49  <Field RequestAttributeKey Topic>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #52  <Field RequestAttributeKey Body>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #55  <Field RequestAttributeKey BleServiceUuid>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #58  <Field RequestAttributeKey BleCharacteristicUuid>
	//  111  223:aastore         
	//  112  224:putstatic       #60  <Field RequestAttributeKey[] $VALUES>
	//* 113  227:return          
	}
}

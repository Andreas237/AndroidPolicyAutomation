// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.operation;


public final class OperationKey extends Enum
{

	private OperationKey(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #136 <Method void Enum(String, int)>
		_value = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #138 <Field String _value>
	//    7   11:return          
	}

	public static OperationKey valueOf(String s)
	{
		return (OperationKey)Enum.valueOf(com/huawei/operation/OperationKey, s);
	//    0    0:ldc1            #2   <Class OperationKey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #145 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OperationKey>
	//    4    9:areturn         
	}

	public static OperationKey[] values()
	{
		return (OperationKey[])((OperationKey []) ($VALUES)).clone();
	//    0    0:getstatic       #132 <Field OperationKey[] $VALUES>
	//    1    3:invokevirtual   #152 <Method Object _5B_Lcom.huawei.operation.OperationKey_3B_.clone()>
	//    2    6:checkcast       #148 <Class OperationKey[]>
	//    3    9:areturn         
	}

	public String value()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field String _value>
	//    2    4:areturn         
	}

	private static final OperationKey $VALUES[];
	public static final OperationKey HEALTH_APP_BOOTING_90010001;
	public static final OperationKey HEALTH_APP_CRASH_2050003;
	public static final OperationKey HEALTH_APP_CRASH_90030001;
	public static final OperationKey HEALTH_APP_DEPEND_85040001;
	public static final OperationKey HEALTH_APP_DEVIE_80020001;
	public static final OperationKey HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002;
	public static final OperationKey HEALTH_APP_GPS_90020001;
	public static final OperationKey HEALTH_APP_PERFORMANCE_85020001;
	public static final OperationKey HEALTH_APP_PVUV_85050001;
	public static final OperationKey HEALTH_APP_REQUEST_85030002;
	public static final OperationKey HEALTH_APP_REQUEST_MODULE_85030001;
	public static final OperationKey HEALTH_APP_RUN_END_2050006;
	public static final OperationKey HEALTH_APP_RUN_START_2050005;
	public static final OperationKey HEALTH_APP_SLEEP_80010001;
	public static final OperationKey HEALTH_APP_STEP_COUNT_80040001;
	public static final OperationKey HEALTH_APP_STEP_SENSOR_80040002;
	public static final OperationKey HEALTH_APP_THIRD_SERVICE_80030001;
	public static final OperationKey HEALTH_APP_THIRD_SERVICE_LOADING_80030002;
	public static final OperationKey HEALTH_APP_TRAFFIC_85010001;
	private String _value;

	static 
	{
		HEALTH_APP_CRASH_2050003 = new OperationKey("HEALTH_APP_CRASH_2050003", 0, "2050003");
	//    0    0:new             #2   <Class OperationKey>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "HEALTH_APP_CRASH_2050003">
	//    3    6:iconst_0        
	//    4    7:ldc1            #34  <String "2050003">
	//    5    9:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//    6   12:putstatic       #40  <Field OperationKey HEALTH_APP_CRASH_2050003>
		HEALTH_APP_RUN_START_2050005 = new OperationKey("HEALTH_APP_RUN_START_2050005", 1, "2050005");
	//    7   15:new             #2   <Class OperationKey>
	//    8   18:dup             
	//    9   19:ldc1            #41  <String "HEALTH_APP_RUN_START_2050005">
	//   10   21:iconst_1        
	//   11   22:ldc1            #43  <String "2050005">
	//   12   24:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   13   27:putstatic       #45  <Field OperationKey HEALTH_APP_RUN_START_2050005>
		HEALTH_APP_RUN_END_2050006 = new OperationKey("HEALTH_APP_RUN_END_2050006", 2, "2050006");
	//   14   30:new             #2   <Class OperationKey>
	//   15   33:dup             
	//   16   34:ldc1            #46  <String "HEALTH_APP_RUN_END_2050006">
	//   17   36:iconst_2        
	//   18   37:ldc1            #48  <String "2050006">
	//   19   39:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   20   42:putstatic       #50  <Field OperationKey HEALTH_APP_RUN_END_2050006>
		HEALTH_APP_BOOTING_90010001 = new OperationKey("HEALTH_APP_BOOTING_90010001", 3, "90010001");
	//   21   45:new             #2   <Class OperationKey>
	//   22   48:dup             
	//   23   49:ldc1            #51  <String "HEALTH_APP_BOOTING_90010001">
	//   24   51:iconst_3        
	//   25   52:ldc1            #53  <String "90010001">
	//   26   54:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   27   57:putstatic       #55  <Field OperationKey HEALTH_APP_BOOTING_90010001>
		HEALTH_APP_GPS_90020001 = new OperationKey("HEALTH_APP_GPS_90020001", 4, "90020001");
	//   28   60:new             #2   <Class OperationKey>
	//   29   63:dup             
	//   30   64:ldc1            #56  <String "HEALTH_APP_GPS_90020001">
	//   31   66:iconst_4        
	//   32   67:ldc1            #58  <String "90020001">
	//   33   69:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   34   72:putstatic       #60  <Field OperationKey HEALTH_APP_GPS_90020001>
		HEALTH_APP_CRASH_90030001 = new OperationKey("HEALTH_APP_CRASH_90030001", 5, "90030001");
	//   35   75:new             #2   <Class OperationKey>
	//   36   78:dup             
	//   37   79:ldc1            #61  <String "HEALTH_APP_CRASH_90030001">
	//   38   81:iconst_5        
	//   39   82:ldc1            #63  <String "90030001">
	//   40   84:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   41   87:putstatic       #65  <Field OperationKey HEALTH_APP_CRASH_90030001>
		HEALTH_APP_SLEEP_80010001 = new OperationKey("HEALTH_APP_SLEEP_80010001", 6, "80010001");
	//   42   90:new             #2   <Class OperationKey>
	//   43   93:dup             
	//   44   94:ldc1            #66  <String "HEALTH_APP_SLEEP_80010001">
	//   45   96:bipush          6
	//   46   98:ldc1            #68  <String "80010001">
	//   47  100:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   48  103:putstatic       #70  <Field OperationKey HEALTH_APP_SLEEP_80010001>
		HEALTH_APP_DEVIE_80020001 = new OperationKey("HEALTH_APP_DEVIE_80020001", 7, "80020001");
	//   49  106:new             #2   <Class OperationKey>
	//   50  109:dup             
	//   51  110:ldc1            #71  <String "HEALTH_APP_DEVIE_80020001">
	//   52  112:bipush          7
	//   53  114:ldc1            #73  <String "80020001">
	//   54  116:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   55  119:putstatic       #75  <Field OperationKey HEALTH_APP_DEVIE_80020001>
		HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002 = new OperationKey("HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002", 8, "80020002");
	//   56  122:new             #2   <Class OperationKey>
	//   57  125:dup             
	//   58  126:ldc1            #76  <String "HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002">
	//   59  128:bipush          8
	//   60  130:ldc1            #78  <String "80020002">
	//   61  132:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   62  135:putstatic       #80  <Field OperationKey HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002>
		HEALTH_APP_THIRD_SERVICE_80030001 = new OperationKey("HEALTH_APP_THIRD_SERVICE_80030001", 9, "80030001");
	//   63  138:new             #2   <Class OperationKey>
	//   64  141:dup             
	//   65  142:ldc1            #81  <String "HEALTH_APP_THIRD_SERVICE_80030001">
	//   66  144:bipush          9
	//   67  146:ldc1            #83  <String "80030001">
	//   68  148:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   69  151:putstatic       #85  <Field OperationKey HEALTH_APP_THIRD_SERVICE_80030001>
		HEALTH_APP_THIRD_SERVICE_LOADING_80030002 = new OperationKey("HEALTH_APP_THIRD_SERVICE_LOADING_80030002", 10, "80030002");
	//   70  154:new             #2   <Class OperationKey>
	//   71  157:dup             
	//   72  158:ldc1            #86  <String "HEALTH_APP_THIRD_SERVICE_LOADING_80030002">
	//   73  160:bipush          10
	//   74  162:ldc1            #88  <String "80030002">
	//   75  164:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   76  167:putstatic       #90  <Field OperationKey HEALTH_APP_THIRD_SERVICE_LOADING_80030002>
		HEALTH_APP_STEP_COUNT_80040001 = new OperationKey("HEALTH_APP_STEP_COUNT_80040001", 11, "80040001");
	//   77  170:new             #2   <Class OperationKey>
	//   78  173:dup             
	//   79  174:ldc1            #91  <String "HEALTH_APP_STEP_COUNT_80040001">
	//   80  176:bipush          11
	//   81  178:ldc1            #93  <String "80040001">
	//   82  180:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   83  183:putstatic       #95  <Field OperationKey HEALTH_APP_STEP_COUNT_80040001>
		HEALTH_APP_STEP_SENSOR_80040002 = new OperationKey("HEALTH_APP_STEP_SENSOR_80040002", 12, "80040002");
	//   84  186:new             #2   <Class OperationKey>
	//   85  189:dup             
	//   86  190:ldc1            #96  <String "HEALTH_APP_STEP_SENSOR_80040002">
	//   87  192:bipush          12
	//   88  194:ldc1            #98  <String "80040002">
	//   89  196:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   90  199:putstatic       #100 <Field OperationKey HEALTH_APP_STEP_SENSOR_80040002>
		HEALTH_APP_TRAFFIC_85010001 = new OperationKey("HEALTH_APP_TRAFFIC_85010001", 13, "85010001");
	//   91  202:new             #2   <Class OperationKey>
	//   92  205:dup             
	//   93  206:ldc1            #101 <String "HEALTH_APP_TRAFFIC_85010001">
	//   94  208:bipush          13
	//   95  210:ldc1            #103 <String "85010001">
	//   96  212:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//   97  215:putstatic       #105 <Field OperationKey HEALTH_APP_TRAFFIC_85010001>
		HEALTH_APP_PERFORMANCE_85020001 = new OperationKey("HEALTH_APP_PERFORMANCE_85020001", 14, "85020001");
	//   98  218:new             #2   <Class OperationKey>
	//   99  221:dup             
	//  100  222:ldc1            #106 <String "HEALTH_APP_PERFORMANCE_85020001">
	//  101  224:bipush          14
	//  102  226:ldc1            #108 <String "85020001">
	//  103  228:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//  104  231:putstatic       #110 <Field OperationKey HEALTH_APP_PERFORMANCE_85020001>
		HEALTH_APP_REQUEST_85030002 = new OperationKey("HEALTH_APP_REQUEST_85030002", 15, "85030002");
	//  105  234:new             #2   <Class OperationKey>
	//  106  237:dup             
	//  107  238:ldc1            #111 <String "HEALTH_APP_REQUEST_85030002">
	//  108  240:bipush          15
	//  109  242:ldc1            #113 <String "85030002">
	//  110  244:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//  111  247:putstatic       #115 <Field OperationKey HEALTH_APP_REQUEST_85030002>
		HEALTH_APP_REQUEST_MODULE_85030001 = new OperationKey("HEALTH_APP_REQUEST_MODULE_85030001", 16, "85030001");
	//  112  250:new             #2   <Class OperationKey>
	//  113  253:dup             
	//  114  254:ldc1            #116 <String "HEALTH_APP_REQUEST_MODULE_85030001">
	//  115  256:bipush          16
	//  116  258:ldc1            #118 <String "85030001">
	//  117  260:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//  118  263:putstatic       #120 <Field OperationKey HEALTH_APP_REQUEST_MODULE_85030001>
		HEALTH_APP_DEPEND_85040001 = new OperationKey("HEALTH_APP_DEPEND_85040001", 17, "85040001");
	//  119  266:new             #2   <Class OperationKey>
	//  120  269:dup             
	//  121  270:ldc1            #121 <String "HEALTH_APP_DEPEND_85040001">
	//  122  272:bipush          17
	//  123  274:ldc1            #123 <String "85040001">
	//  124  276:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//  125  279:putstatic       #125 <Field OperationKey HEALTH_APP_DEPEND_85040001>
		HEALTH_APP_PVUV_85050001 = new OperationKey("HEALTH_APP_PVUV_85050001", 18, "85050001");
	//  126  282:new             #2   <Class OperationKey>
	//  127  285:dup             
	//  128  286:ldc1            #126 <String "HEALTH_APP_PVUV_85050001">
	//  129  288:bipush          18
	//  130  290:ldc1            #128 <String "85050001">
	//  131  292:invokespecial   #38  <Method void OperationKey(String, int, String)>
	//  132  295:putstatic       #130 <Field OperationKey HEALTH_APP_PVUV_85050001>
		$VALUES = (new OperationKey[] {
			HEALTH_APP_CRASH_2050003, HEALTH_APP_RUN_START_2050005, HEALTH_APP_RUN_END_2050006, HEALTH_APP_BOOTING_90010001, HEALTH_APP_GPS_90020001, HEALTH_APP_CRASH_90030001, HEALTH_APP_SLEEP_80010001, HEALTH_APP_DEVIE_80020001, HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002, HEALTH_APP_THIRD_SERVICE_80030001, 
			HEALTH_APP_THIRD_SERVICE_LOADING_80030002, HEALTH_APP_STEP_COUNT_80040001, HEALTH_APP_STEP_SENSOR_80040002, HEALTH_APP_TRAFFIC_85010001, HEALTH_APP_PERFORMANCE_85020001, HEALTH_APP_REQUEST_85030002, HEALTH_APP_REQUEST_MODULE_85030001, HEALTH_APP_DEPEND_85040001, HEALTH_APP_PVUV_85050001
		});
	//  133  298:bipush          19
	//  134  300:anewarray       OperationKey[]
	//  135  303:dup             
	//  136  304:iconst_0        
	//  137  305:getstatic       #40  <Field OperationKey HEALTH_APP_CRASH_2050003>
	//  138  308:aastore         
	//  139  309:dup             
	//  140  310:iconst_1        
	//  141  311:getstatic       #45  <Field OperationKey HEALTH_APP_RUN_START_2050005>
	//  142  314:aastore         
	//  143  315:dup             
	//  144  316:iconst_2        
	//  145  317:getstatic       #50  <Field OperationKey HEALTH_APP_RUN_END_2050006>
	//  146  320:aastore         
	//  147  321:dup             
	//  148  322:iconst_3        
	//  149  323:getstatic       #55  <Field OperationKey HEALTH_APP_BOOTING_90010001>
	//  150  326:aastore         
	//  151  327:dup             
	//  152  328:iconst_4        
	//  153  329:getstatic       #60  <Field OperationKey HEALTH_APP_GPS_90020001>
	//  154  332:aastore         
	//  155  333:dup             
	//  156  334:iconst_5        
	//  157  335:getstatic       #65  <Field OperationKey HEALTH_APP_CRASH_90030001>
	//  158  338:aastore         
	//  159  339:dup             
	//  160  340:bipush          6
	//  161  342:getstatic       #70  <Field OperationKey HEALTH_APP_SLEEP_80010001>
	//  162  345:aastore         
	//  163  346:dup             
	//  164  347:bipush          7
	//  165  349:getstatic       #75  <Field OperationKey HEALTH_APP_DEVIE_80020001>
	//  166  352:aastore         
	//  167  353:dup             
	//  168  354:bipush          8
	//  169  356:getstatic       #80  <Field OperationKey HEALTH_APP_DEVIE_SILENT_SUCCESS_80020002>
	//  170  359:aastore         
	//  171  360:dup             
	//  172  361:bipush          9
	//  173  363:getstatic       #85  <Field OperationKey HEALTH_APP_THIRD_SERVICE_80030001>
	//  174  366:aastore         
	//  175  367:dup             
	//  176  368:bipush          10
	//  177  370:getstatic       #90  <Field OperationKey HEALTH_APP_THIRD_SERVICE_LOADING_80030002>
	//  178  373:aastore         
	//  179  374:dup             
	//  180  375:bipush          11
	//  181  377:getstatic       #95  <Field OperationKey HEALTH_APP_STEP_COUNT_80040001>
	//  182  380:aastore         
	//  183  381:dup             
	//  184  382:bipush          12
	//  185  384:getstatic       #100 <Field OperationKey HEALTH_APP_STEP_SENSOR_80040002>
	//  186  387:aastore         
	//  187  388:dup             
	//  188  389:bipush          13
	//  189  391:getstatic       #105 <Field OperationKey HEALTH_APP_TRAFFIC_85010001>
	//  190  394:aastore         
	//  191  395:dup             
	//  192  396:bipush          14
	//  193  398:getstatic       #110 <Field OperationKey HEALTH_APP_PERFORMANCE_85020001>
	//  194  401:aastore         
	//  195  402:dup             
	//  196  403:bipush          15
	//  197  405:getstatic       #115 <Field OperationKey HEALTH_APP_REQUEST_85030002>
	//  198  408:aastore         
	//  199  409:dup             
	//  200  410:bipush          16
	//  201  412:getstatic       #120 <Field OperationKey HEALTH_APP_REQUEST_MODULE_85030001>
	//  202  415:aastore         
	//  203  416:dup             
	//  204  417:bipush          17
	//  205  419:getstatic       #125 <Field OperationKey HEALTH_APP_DEPEND_85040001>
	//  206  422:aastore         
	//  207  423:dup             
	//  208  424:bipush          18
	//  209  426:getstatic       #130 <Field OperationKey HEALTH_APP_PVUV_85050001>
	//  210  429:aastore         
	//  211  430:putstatic       #132 <Field OperationKey[] $VALUES>
	//* 212  433:return          
	}
}

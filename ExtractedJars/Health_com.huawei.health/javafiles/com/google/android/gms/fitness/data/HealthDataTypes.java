// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;


// Referenced classes of package com.google.android.gms.fitness.data:
//			DataType, Field, HealthFields

public final class HealthDataTypes
{

	private HealthDataTypes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #213 <Method void Object()>
	//    2    4:return          
	}

	public static final DataType AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY;
	public static final DataType AGGREGATE_BLOOD_GLUCOSE_SUMMARY;
	public static final DataType AGGREGATE_BLOOD_PRESSURE_SUMMARY;
	public static final DataType AGGREGATE_BODY_TEMPERATURE_SUMMARY;
	public static final DataType AGGREGATE_OXYGEN_SATURATION_SUMMARY;
	public static final DataType TYPE_BASAL_BODY_TEMPERATURE;
	public static final DataType TYPE_BLOOD_GLUCOSE;
	public static final DataType TYPE_BLOOD_PRESSURE;
	public static final DataType TYPE_BODY_TEMPERATURE;
	public static final DataType TYPE_CERVICAL_MUCUS;
	public static final DataType TYPE_CERVICAL_POSITION;
	public static final DataType TYPE_MENSTRUATION;
	public static final DataType TYPE_OVULATION_TEST;
	public static final DataType TYPE_OXYGEN_SATURATION;
	public static final DataType TYPE_VAGINAL_SPOTTING;

	static 
	{
		TYPE_BLOOD_PRESSURE = new DataType("com.google.blood_pressure", new Field[] {
			HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC, HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC, HealthFields.FIELD_BODY_POSITION, HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION
		});
	//    0    0:new             #24  <Class DataType>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "com.google.blood_pressure">
	//    3    6:iconst_4        
	//    4    7:anewarray       Field[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:getstatic       #34  <Field Field HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:getstatic       #37  <Field Field HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:getstatic       #40  <Field Field HealthFields.FIELD_BODY_POSITION>
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:getstatic       #43  <Field Field HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION>
	//   20   33:aastore         
	//   21   34:invokespecial   #47  <Method void DataType(String, Field[])>
	//   22   37:putstatic       #49  <Field DataType TYPE_BLOOD_PRESSURE>
		TYPE_BLOOD_GLUCOSE = new DataType("com.google.blood_glucose", new Field[] {
			HealthFields.FIELD_BLOOD_GLUCOSE_LEVEL, HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL, Field.FIELD_MEAL_TYPE, HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP, HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE
		});
	//   23   40:new             #24  <Class DataType>
	//   24   43:dup             
	//   25   44:ldc1            #51  <String "com.google.blood_glucose">
	//   26   46:iconst_5        
	//   27   47:anewarray       Field[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:getstatic       #54  <Field Field HealthFields.FIELD_BLOOD_GLUCOSE_LEVEL>
	//   31   55:aastore         
	//   32   56:dup             
	//   33   57:iconst_1        
	//   34   58:getstatic       #57  <Field Field HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL>
	//   35   61:aastore         
	//   36   62:dup             
	//   37   63:iconst_2        
	//   38   64:getstatic       #60  <Field Field Field.FIELD_MEAL_TYPE>
	//   39   67:aastore         
	//   40   68:dup             
	//   41   69:iconst_3        
	//   42   70:getstatic       #63  <Field Field HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP>
	//   43   73:aastore         
	//   44   74:dup             
	//   45   75:iconst_4        
	//   46   76:getstatic       #66  <Field Field HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE>
	//   47   79:aastore         
	//   48   80:invokespecial   #47  <Method void DataType(String, Field[])>
	//   49   83:putstatic       #68  <Field DataType TYPE_BLOOD_GLUCOSE>
		TYPE_OXYGEN_SATURATION = new DataType("com.google.oxygen_saturation", new Field[] {
			HealthFields.FIELD_OXYGEN_SATURATION, HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE, HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE, HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM, HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD
		});
	//   50   86:new             #24  <Class DataType>
	//   51   89:dup             
	//   52   90:ldc1            #70  <String "com.google.oxygen_saturation">
	//   53   92:iconst_5        
	//   54   93:anewarray       Field[]
	//   55   96:dup             
	//   56   97:iconst_0        
	//   57   98:getstatic       #73  <Field Field HealthFields.FIELD_OXYGEN_SATURATION>
	//   58  101:aastore         
	//   59  102:dup             
	//   60  103:iconst_1        
	//   61  104:getstatic       #76  <Field Field HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE>
	//   62  107:aastore         
	//   63  108:dup             
	//   64  109:iconst_2        
	//   65  110:getstatic       #79  <Field Field HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE>
	//   66  113:aastore         
	//   67  114:dup             
	//   68  115:iconst_3        
	//   69  116:getstatic       #82  <Field Field HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM>
	//   70  119:aastore         
	//   71  120:dup             
	//   72  121:iconst_4        
	//   73  122:getstatic       #85  <Field Field HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD>
	//   74  125:aastore         
	//   75  126:invokespecial   #47  <Method void DataType(String, Field[])>
	//   76  129:putstatic       #87  <Field DataType TYPE_OXYGEN_SATURATION>
		TYPE_BODY_TEMPERATURE = new DataType("com.google.body.temperature", new Field[] {
			HealthFields.FIELD_BODY_TEMPERATURE, HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION
		});
	//   77  132:new             #24  <Class DataType>
	//   78  135:dup             
	//   79  136:ldc1            #89  <String "com.google.body.temperature">
	//   80  138:iconst_2        
	//   81  139:anewarray       Field[]
	//   82  142:dup             
	//   83  143:iconst_0        
	//   84  144:getstatic       #92  <Field Field HealthFields.FIELD_BODY_TEMPERATURE>
	//   85  147:aastore         
	//   86  148:dup             
	//   87  149:iconst_1        
	//   88  150:getstatic       #95  <Field Field HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION>
	//   89  153:aastore         
	//   90  154:invokespecial   #47  <Method void DataType(String, Field[])>
	//   91  157:putstatic       #97  <Field DataType TYPE_BODY_TEMPERATURE>
		TYPE_BASAL_BODY_TEMPERATURE = new DataType("com.google.body.temperature.basal", new Field[] {
			HealthFields.FIELD_BODY_TEMPERATURE, HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION
		});
	//   92  160:new             #24  <Class DataType>
	//   93  163:dup             
	//   94  164:ldc1            #99  <String "com.google.body.temperature.basal">
	//   95  166:iconst_2        
	//   96  167:anewarray       Field[]
	//   97  170:dup             
	//   98  171:iconst_0        
	//   99  172:getstatic       #92  <Field Field HealthFields.FIELD_BODY_TEMPERATURE>
	//  100  175:aastore         
	//  101  176:dup             
	//  102  177:iconst_1        
	//  103  178:getstatic       #95  <Field Field HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION>
	//  104  181:aastore         
	//  105  182:invokespecial   #47  <Method void DataType(String, Field[])>
	//  106  185:putstatic       #101 <Field DataType TYPE_BASAL_BODY_TEMPERATURE>
		TYPE_CERVICAL_MUCUS = new DataType("com.google.cervical_mucus", new Field[] {
			HealthFields.FIELD_CERVICAL_MUCUS_TEXTURE, HealthFields.FIELD_CERVICAL_MUCUS_AMOUNT
		});
	//  107  188:new             #24  <Class DataType>
	//  108  191:dup             
	//  109  192:ldc1            #103 <String "com.google.cervical_mucus">
	//  110  194:iconst_2        
	//  111  195:anewarray       Field[]
	//  112  198:dup             
	//  113  199:iconst_0        
	//  114  200:getstatic       #106 <Field Field HealthFields.FIELD_CERVICAL_MUCUS_TEXTURE>
	//  115  203:aastore         
	//  116  204:dup             
	//  117  205:iconst_1        
	//  118  206:getstatic       #109 <Field Field HealthFields.FIELD_CERVICAL_MUCUS_AMOUNT>
	//  119  209:aastore         
	//  120  210:invokespecial   #47  <Method void DataType(String, Field[])>
	//  121  213:putstatic       #111 <Field DataType TYPE_CERVICAL_MUCUS>
		TYPE_CERVICAL_POSITION = new DataType("com.google.cervical_position", new Field[] {
			HealthFields.FIELD_CERVICAL_POSITION, HealthFields.FIELD_CERVICAL_DILATION, HealthFields.FIELD_CERVICAL_FIRMNESS
		});
	//  122  216:new             #24  <Class DataType>
	//  123  219:dup             
	//  124  220:ldc1            #113 <String "com.google.cervical_position">
	//  125  222:iconst_3        
	//  126  223:anewarray       Field[]
	//  127  226:dup             
	//  128  227:iconst_0        
	//  129  228:getstatic       #116 <Field Field HealthFields.FIELD_CERVICAL_POSITION>
	//  130  231:aastore         
	//  131  232:dup             
	//  132  233:iconst_1        
	//  133  234:getstatic       #119 <Field Field HealthFields.FIELD_CERVICAL_DILATION>
	//  134  237:aastore         
	//  135  238:dup             
	//  136  239:iconst_2        
	//  137  240:getstatic       #122 <Field Field HealthFields.FIELD_CERVICAL_FIRMNESS>
	//  138  243:aastore         
	//  139  244:invokespecial   #47  <Method void DataType(String, Field[])>
	//  140  247:putstatic       #124 <Field DataType TYPE_CERVICAL_POSITION>
		TYPE_MENSTRUATION = new DataType("com.google.menstruation", new Field[] {
			HealthFields.FIELD_MENSTRUAL_FLOW
		});
	//  141  250:new             #24  <Class DataType>
	//  142  253:dup             
	//  143  254:ldc1            #126 <String "com.google.menstruation">
	//  144  256:iconst_1        
	//  145  257:anewarray       Field[]
	//  146  260:dup             
	//  147  261:iconst_0        
	//  148  262:getstatic       #129 <Field Field HealthFields.FIELD_MENSTRUAL_FLOW>
	//  149  265:aastore         
	//  150  266:invokespecial   #47  <Method void DataType(String, Field[])>
	//  151  269:putstatic       #131 <Field DataType TYPE_MENSTRUATION>
		TYPE_OVULATION_TEST = new DataType("com.google.ovulation_test", new Field[] {
			HealthFields.FIELD_OVULATION_TEST_RESULT
		});
	//  152  272:new             #24  <Class DataType>
	//  153  275:dup             
	//  154  276:ldc1            #133 <String "com.google.ovulation_test">
	//  155  278:iconst_1        
	//  156  279:anewarray       Field[]
	//  157  282:dup             
	//  158  283:iconst_0        
	//  159  284:getstatic       #136 <Field Field HealthFields.FIELD_OVULATION_TEST_RESULT>
	//  160  287:aastore         
	//  161  288:invokespecial   #47  <Method void DataType(String, Field[])>
	//  162  291:putstatic       #138 <Field DataType TYPE_OVULATION_TEST>
		TYPE_VAGINAL_SPOTTING = new DataType("com.google.vaginal_spotting", new Field[] {
			Field.FIELD_OCCURRENCES
		});
	//  163  294:new             #24  <Class DataType>
	//  164  297:dup             
	//  165  298:ldc1            #140 <String "com.google.vaginal_spotting">
	//  166  300:iconst_1        
	//  167  301:anewarray       Field[]
	//  168  304:dup             
	//  169  305:iconst_0        
	//  170  306:getstatic       #143 <Field Field Field.FIELD_OCCURRENCES>
	//  171  309:aastore         
	//  172  310:invokespecial   #47  <Method void DataType(String, Field[])>
	//  173  313:putstatic       #145 <Field DataType TYPE_VAGINAL_SPOTTING>
		AGGREGATE_BLOOD_PRESSURE_SUMMARY = new DataType("com.google.blood_pressure.summary", new Field[] {
			HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE, HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX, HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN, HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE, HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX, HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN, HealthFields.FIELD_BODY_POSITION, HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION
		});
	//  174  316:new             #24  <Class DataType>
	//  175  319:dup             
	//  176  320:ldc1            #147 <String "com.google.blood_pressure.summary">
	//  177  322:bipush          8
	//  178  324:anewarray       Field[]
	//  179  327:dup             
	//  180  328:iconst_0        
	//  181  329:getstatic       #150 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE>
	//  182  332:aastore         
	//  183  333:dup             
	//  184  334:iconst_1        
	//  185  335:getstatic       #153 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX>
	//  186  338:aastore         
	//  187  339:dup             
	//  188  340:iconst_2        
	//  189  341:getstatic       #156 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN>
	//  190  344:aastore         
	//  191  345:dup             
	//  192  346:iconst_3        
	//  193  347:getstatic       #159 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE>
	//  194  350:aastore         
	//  195  351:dup             
	//  196  352:iconst_4        
	//  197  353:getstatic       #162 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX>
	//  198  356:aastore         
	//  199  357:dup             
	//  200  358:iconst_5        
	//  201  359:getstatic       #165 <Field Field HealthFields.FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN>
	//  202  362:aastore         
	//  203  363:dup             
	//  204  364:bipush          6
	//  205  366:getstatic       #40  <Field Field HealthFields.FIELD_BODY_POSITION>
	//  206  369:aastore         
	//  207  370:dup             
	//  208  371:bipush          7
	//  209  373:getstatic       #43  <Field Field HealthFields.FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION>
	//  210  376:aastore         
	//  211  377:invokespecial   #47  <Method void DataType(String, Field[])>
	//  212  380:putstatic       #167 <Field DataType AGGREGATE_BLOOD_PRESSURE_SUMMARY>
		AGGREGATE_BLOOD_GLUCOSE_SUMMARY = new DataType("com.google.blood_glucose.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN, HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL, Field.FIELD_MEAL_TYPE, HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP, HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE
		});
	//  213  383:new             #24  <Class DataType>
	//  214  386:dup             
	//  215  387:ldc1            #169 <String "com.google.blood_glucose.summary">
	//  216  389:bipush          7
	//  217  391:anewarray       Field[]
	//  218  394:dup             
	//  219  395:iconst_0        
	//  220  396:getstatic       #172 <Field Field Field.FIELD_AVERAGE>
	//  221  399:aastore         
	//  222  400:dup             
	//  223  401:iconst_1        
	//  224  402:getstatic       #175 <Field Field Field.FIELD_MAX>
	//  225  405:aastore         
	//  226  406:dup             
	//  227  407:iconst_2        
	//  228  408:getstatic       #178 <Field Field Field.FIELD_MIN>
	//  229  411:aastore         
	//  230  412:dup             
	//  231  413:iconst_3        
	//  232  414:getstatic       #57  <Field Field HealthFields.FIELD_TEMPORAL_RELATION_TO_MEAL>
	//  233  417:aastore         
	//  234  418:dup             
	//  235  419:iconst_4        
	//  236  420:getstatic       #60  <Field Field Field.FIELD_MEAL_TYPE>
	//  237  423:aastore         
	//  238  424:dup             
	//  239  425:iconst_5        
	//  240  426:getstatic       #63  <Field Field HealthFields.FIELD_TEMPORAL_RELATION_TO_SLEEP>
	//  241  429:aastore         
	//  242  430:dup             
	//  243  431:bipush          6
	//  244  433:getstatic       #66  <Field Field HealthFields.FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE>
	//  245  436:aastore         
	//  246  437:invokespecial   #47  <Method void DataType(String, Field[])>
	//  247  440:putstatic       #180 <Field DataType AGGREGATE_BLOOD_GLUCOSE_SUMMARY>
		AGGREGATE_OXYGEN_SATURATION_SUMMARY = new DataType("com.google.oxygen_saturation.summary", new Field[] {
			HealthFields.FIELD_OXYGEN_SATURATION_AVERAGE, HealthFields.FIELD_OXYGEN_SATURATION_MAX, HealthFields.FIELD_OXYGEN_SATURATION_MIN, HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE, HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX, HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN, HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE, HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM, HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD
		});
	//  248  443:new             #24  <Class DataType>
	//  249  446:dup             
	//  250  447:ldc1            #182 <String "com.google.oxygen_saturation.summary">
	//  251  449:bipush          9
	//  252  451:anewarray       Field[]
	//  253  454:dup             
	//  254  455:iconst_0        
	//  255  456:getstatic       #185 <Field Field HealthFields.FIELD_OXYGEN_SATURATION_AVERAGE>
	//  256  459:aastore         
	//  257  460:dup             
	//  258  461:iconst_1        
	//  259  462:getstatic       #188 <Field Field HealthFields.FIELD_OXYGEN_SATURATION_MAX>
	//  260  465:aastore         
	//  261  466:dup             
	//  262  467:iconst_2        
	//  263  468:getstatic       #191 <Field Field HealthFields.FIELD_OXYGEN_SATURATION_MIN>
	//  264  471:aastore         
	//  265  472:dup             
	//  266  473:iconst_3        
	//  267  474:getstatic       #194 <Field Field HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE>
	//  268  477:aastore         
	//  269  478:dup             
	//  270  479:iconst_4        
	//  271  480:getstatic       #197 <Field Field HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX>
	//  272  483:aastore         
	//  273  484:dup             
	//  274  485:iconst_5        
	//  275  486:getstatic       #200 <Field Field HealthFields.FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN>
	//  276  489:aastore         
	//  277  490:dup             
	//  278  491:bipush          6
	//  279  493:getstatic       #79  <Field Field HealthFields.FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE>
	//  280  496:aastore         
	//  281  497:dup             
	//  282  498:bipush          7
	//  283  500:getstatic       #82  <Field Field HealthFields.FIELD_OXYGEN_SATURATION_SYSTEM>
	//  284  503:aastore         
	//  285  504:dup             
	//  286  505:bipush          8
	//  287  507:getstatic       #85  <Field Field HealthFields.FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD>
	//  288  510:aastore         
	//  289  511:invokespecial   #47  <Method void DataType(String, Field[])>
	//  290  514:putstatic       #202 <Field DataType AGGREGATE_OXYGEN_SATURATION_SUMMARY>
		AGGREGATE_BODY_TEMPERATURE_SUMMARY = new DataType("com.google.body.temperature.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN, HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION
		});
	//  291  517:new             #24  <Class DataType>
	//  292  520:dup             
	//  293  521:ldc1            #204 <String "com.google.body.temperature.summary">
	//  294  523:iconst_4        
	//  295  524:anewarray       Field[]
	//  296  527:dup             
	//  297  528:iconst_0        
	//  298  529:getstatic       #172 <Field Field Field.FIELD_AVERAGE>
	//  299  532:aastore         
	//  300  533:dup             
	//  301  534:iconst_1        
	//  302  535:getstatic       #175 <Field Field Field.FIELD_MAX>
	//  303  538:aastore         
	//  304  539:dup             
	//  305  540:iconst_2        
	//  306  541:getstatic       #178 <Field Field Field.FIELD_MIN>
	//  307  544:aastore         
	//  308  545:dup             
	//  309  546:iconst_3        
	//  310  547:getstatic       #95  <Field Field HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION>
	//  311  550:aastore         
	//  312  551:invokespecial   #47  <Method void DataType(String, Field[])>
	//  313  554:putstatic       #206 <Field DataType AGGREGATE_BODY_TEMPERATURE_SUMMARY>
		AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY = new DataType("com.google.body.temperature.basal.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN, HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION
		});
	//  314  557:new             #24  <Class DataType>
	//  315  560:dup             
	//  316  561:ldc1            #208 <String "com.google.body.temperature.basal.summary">
	//  317  563:iconst_4        
	//  318  564:anewarray       Field[]
	//  319  567:dup             
	//  320  568:iconst_0        
	//  321  569:getstatic       #172 <Field Field Field.FIELD_AVERAGE>
	//  322  572:aastore         
	//  323  573:dup             
	//  324  574:iconst_1        
	//  325  575:getstatic       #175 <Field Field Field.FIELD_MAX>
	//  326  578:aastore         
	//  327  579:dup             
	//  328  580:iconst_2        
	//  329  581:getstatic       #178 <Field Field Field.FIELD_MIN>
	//  330  584:aastore         
	//  331  585:dup             
	//  332  586:iconst_3        
	//  333  587:getstatic       #95  <Field Field HealthFields.FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION>
	//  334  590:aastore         
	//  335  591:invokespecial   #47  <Method void DataType(String, Field[])>
	//  336  594:putstatic       #210 <Field DataType AGGREGATE_BASAL_BODY_TEMPERATURE_SUMMARY>
	//* 337  597:return          
	}
}

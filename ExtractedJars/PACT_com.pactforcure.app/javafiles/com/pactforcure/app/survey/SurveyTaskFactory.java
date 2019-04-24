// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.pactforcure.app.survey:
//			Survey, SurveyDataException, SurveyTask, PpdTask, 
//			HrpqTask, HruqTask, SurveyDelegate

public class SurveyTaskFactory
{

	public SurveyTaskFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static SurveyTask newSurveyTask(Survey survey, ArrayList arraylist, Map map, Map map1, SurveyDelegate surveydelegate)
	{
		byte byte0;
		String s;
		s = survey.getCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method String Survey.getCode()>
	//    2    4:astore          6
		byte0 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          5
		s.hashCode();
	//    5    9:aload           6
	//    6   11:invokevirtual   #23  <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 72
	//	               -706907381: 138
	//	               -706719882: 186
	//	               -706719727: 202
	//	               -706404705: 154
	//	               79428: 170
	//	               737020781: 122;
	//    7   14:lookupswitch    6: default 72
	//	               -706907381: 138
	//	               -706719882: 186
	//	               -706719727: 202
	//	               -706404705: 154
	//	               79428: 170
	//	               737020781: 122
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		break; /* Loop/switch isn't completed */
_L4:
		break MISSING_BLOCK_LABEL_202;
_L8:
		switch(byte0)
	//*   8   72:iload           5
		{
	//*   9   74:tableswitch     0 5: default 112
	//	               0 218
	//	               1 218
	//	               2 218
	//	               3 232
	//	               4 246
	//	               5 260
		default:
			throw new SurveyDataException("survey not found");
	//   10  112:new             #25  <Class SurveyDataException>
	//   11  115:dup             
	//   12  116:ldc1            #27  <String "survey not found">
	//   13  118:invokespecial   #30  <Method void SurveyDataException(String)>
	//   14  121:athrow          

	//*  15  122:aload           6
	//*  16  124:ldc1            #32  <String "Eligibility">
	//*  17  126:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  18  129:ifeq            72
	//*  19  132:iconst_0        
	//*  20  133:istore          5
	//*  21  135:goto            72
	//*  22  138:aload           6
	//*  23  140:ldc1            #38  <String "HealthEconomics-BIMF">
	//*  24  142:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  25  145:ifeq            72
	//*  26  148:iconst_1        
	//*  27  149:istore          5
	//*  28  151:goto            72
	//*  29  154:aload           6
	//*  30  156:ldc1            #40  <String "HealthEconomics-SF12">
	//*  31  158:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  32  161:ifeq            72
	//*  33  164:iconst_2        
	//*  34  165:istore          5
	//*  35  167:goto            72
	//*  36  170:aload           6
	//*  37  172:ldc1            #42  <String "PPD">
	//*  38  174:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  39  177:ifeq            72
	//*  40  180:iconst_3        
	//*  41  181:istore          5
	//*  42  183:goto            72
	//*  43  186:aload           6
	//*  44  188:ldc1            #44  <String "HealthEconomics-HRPQ">
	//*  45  190:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  46  193:ifeq            72
	//*  47  196:iconst_4        
	//*  48  197:istore          5
	//*  49  199:goto            72
	//*  50  202:aload           6
	//*  51  204:ldc1            #46  <String "HealthEconomics-HRUQ">
	//*  52  206:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  53  209:ifeq            72
	//*  54  212:iconst_5        
	//*  55  213:istore          5
	//*  56  215:goto            72
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			return new SurveyTask(survey, ((java.util.List) (arraylist)), map, map1, ((com.pactforcure.app.ui.SurveyCallbacks) (surveydelegate)));
	//   57  218:new             #48  <Class SurveyTask>
	//   58  221:dup             
	//   59  222:aload_0         
	//   60  223:aload_1         
	//   61  224:aload_2         
	//   62  225:aload_3         
	//   63  226:aload           4
	//   64  228:invokespecial   #51  <Method void SurveyTask(Survey, java.util.List, Map, Map, com.pactforcure.app.ui.SurveyCallbacks)>
	//   65  231:areturn         

		case 3: // '\003'
			return ((SurveyTask) (new PpdTask(survey, ((java.util.List) (arraylist)), map, map1, ((com.pactforcure.app.ui.SurveyCallbacks) (surveydelegate)))));
	//   66  232:new             #53  <Class PpdTask>
	//   67  235:dup             
	//   68  236:aload_0         
	//   69  237:aload_1         
	//   70  238:aload_2         
	//   71  239:aload_3         
	//   72  240:aload           4
	//   73  242:invokespecial   #54  <Method void PpdTask(Survey, java.util.List, Map, Map, com.pactforcure.app.ui.SurveyCallbacks)>
	//   74  245:areturn         

		case 4: // '\004'
			return ((SurveyTask) (new HrpqTask(survey, ((java.util.List) (arraylist)), map, map1, ((com.pactforcure.app.ui.SurveyCallbacks) (surveydelegate)))));
	//   75  246:new             #56  <Class HrpqTask>
	//   76  249:dup             
	//   77  250:aload_0         
	//   78  251:aload_1         
	//   79  252:aload_2         
	//   80  253:aload_3         
	//   81  254:aload           4
	//   82  256:invokespecial   #57  <Method void HrpqTask(Survey, java.util.List, Map, Map, com.pactforcure.app.ui.SurveyCallbacks)>
	//   83  259:areturn         

		case 5: // '\005'
			return ((SurveyTask) (new HruqTask(survey, arraylist, map, map1, surveydelegate)));
	//   84  260:new             #59  <Class HruqTask>
	//   85  263:dup             
	//   86  264:aload_0         
	//   87  265:aload_1         
	//   88  266:aload_2         
	//   89  267:aload_3         
	//   90  268:aload           4
	//   91  270:invokespecial   #62  <Method void HruqTask(Survey, ArrayList, Map, Map, SurveyDelegate)>
	//   92  273:areturn         
		}
_L7:
		if(s.equals("Eligibility"))
			byte0 = 0;
		  goto _L8
_L2:
		if(s.equals("HealthEconomics-BIMF"))
			byte0 = 1;
		  goto _L8
_L5:
		if(s.equals("HealthEconomics-SF12"))
			byte0 = 2;
		  goto _L8
_L6:
		if(s.equals("PPD"))
			byte0 = 3;
		  goto _L8
_L3:
		if(s.equals("HealthEconomics-HRPQ"))
			byte0 = 4;
		  goto _L8
		if(s.equals("HealthEconomics-HRUQ"))
			byte0 = 5;
		  goto _L8
	}
}

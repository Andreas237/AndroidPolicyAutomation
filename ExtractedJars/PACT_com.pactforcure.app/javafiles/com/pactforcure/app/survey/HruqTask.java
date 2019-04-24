// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.util.ArrayList;
import java.util.Map;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveyTask, Answer, Survey, SurveyDelegate

class HruqTask extends SurveyTask
{

	public HruqTask(Survey survey, ArrayList arraylist, Map map, Map map1, SurveyDelegate surveydelegate)
	{
		super(survey, ((java.util.List) (arraylist)), map, map1, ((com.pactforcure.app.ui.SurveyCallbacks) (surveydelegate)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #9   <Method void SurveyTask(Survey, java.util.List, Map, Map, com.pactforcure.app.ui.SurveyCallbacks)>
	//    7   11:return          
	}

	public Step getStepAfterStep(Step step, TaskResult taskresult)
	{
		if(currentStep != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Step currentStep>
	//    2    4:ifnonnull       19
_L1:
		step = super.getStepAfterStep(currentStep, taskresult);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field Step currentStep>
	//    6   12:aload_2         
	//    7   13:invokespecial   #20  <Method Step SurveyTask.getStepAfterStep(Step, TaskResult)>
	//    8   16:astore_1        
_L4:
		return step;
	//    9   17:aload_1         
	//   10   18:areturn         
_L2:
		taskresult = ((TaskResult) (super.getStepAfterStep(step, taskresult)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #20  <Method Step SurveyTask.getStepAfterStep(Step, TaskResult)>
	//   15   25:astore_2        
		if(!currentStep.getIdentifier().equals("HRUQ6b"))
			break; /* Loop/switch isn't completed */
	//   16   26:aload_0         
	//   17   27:getfield        #18  <Field Step currentStep>
	//   18   30:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   19   33:ldc1            #28  <String "HRUQ6b">
	//   20   35:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   21   38:ifeq            87
		step = ((Step) ((Answer)answers.get("HRUQ6a")));
	//   22   41:aload_0         
	//   23   42:getfield        #38  <Field Map answers>
	//   24   45:ldc1            #40  <String "HRUQ6a">
	//   25   47:invokeinterface #46  <Method Object Map.get(Object)>
	//   26   52:checkcast       #48  <Class Answer>
	//   27   55:astore_1        
		int i = -1;
	//   28   56:iconst_m1       
	//   29   57:istore_3        
		if(step != null)
	//*  30   58:aload_1         
	//*  31   59:ifnull          73
			i = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//   32   62:aload_1         
	//   33   63:invokevirtual   #51  <Method String Answer.getValue()>
	//   34   66:invokestatic    #57  <Method Integer Integer.valueOf(String)>
	//   35   69:invokevirtual   #61  <Method int Integer.intValue()>
	//   36   72:istore_3        
		step = ((Step) (taskresult));
	//   37   73:aload_2         
	//   38   74:astore_1        
		if(i == 1)
	//*  39   75:iload_3         
	//*  40   76:iconst_1        
	//*  41   77:icmpne          17
			return getStepById("HRUQ-End");
	//   42   80:aload_0         
	//   43   81:ldc1            #63  <String "HRUQ-End">
	//   44   83:invokevirtual   #67  <Method Step getStepById(String)>
	//   45   86:areturn         
		if(true) goto _L4; else goto _L3
_L3:
		if(!currentStep.getIdentifier().equals("HRUQ6c"))
			break; /* Loop/switch isn't completed */
	//   46   87:aload_0         
	//   47   88:getfield        #18  <Field Step currentStep>
	//   48   91:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   49   94:ldc1            #69  <String "HRUQ6c">
	//   50   96:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   51   99:ifeq            148
		step = ((Step) ((Answer)answers.get("HRUQ6a")));
	//   52  102:aload_0         
	//   53  103:getfield        #38  <Field Map answers>
	//   54  106:ldc1            #40  <String "HRUQ6a">
	//   55  108:invokeinterface #46  <Method Object Map.get(Object)>
	//   56  113:checkcast       #48  <Class Answer>
	//   57  116:astore_1        
		int j = -1;
	//   58  117:iconst_m1       
	//   59  118:istore_3        
		if(step != null)
	//*  60  119:aload_1         
	//*  61  120:ifnull          134
			j = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//   62  123:aload_1         
	//   63  124:invokevirtual   #51  <Method String Answer.getValue()>
	//   64  127:invokestatic    #57  <Method Integer Integer.valueOf(String)>
	//   65  130:invokevirtual   #61  <Method int Integer.intValue()>
	//   66  133:istore_3        
		step = ((Step) (taskresult));
	//   67  134:aload_2         
	//   68  135:astore_1        
		if(j == 2)
	//*  69  136:iload_3         
	//*  70  137:iconst_2        
	//*  71  138:icmpne          17
			return getStepById("HRUQ-End");
	//   72  141:aload_0         
	//   73  142:ldc1            #63  <String "HRUQ-End">
	//   74  144:invokevirtual   #67  <Method Step getStepById(String)>
	//   75  147:areturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(!currentStep.getIdentifier().equals("HRUQ6d"))
			break; /* Loop/switch isn't completed */
	//   76  148:aload_0         
	//   77  149:getfield        #18  <Field Step currentStep>
	//   78  152:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   79  155:ldc1            #71  <String "HRUQ6d">
	//   80  157:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   81  160:ifeq            209
		step = ((Step) ((Answer)answers.get("HRUQ6a")));
	//   82  163:aload_0         
	//   83  164:getfield        #38  <Field Map answers>
	//   84  167:ldc1            #40  <String "HRUQ6a">
	//   85  169:invokeinterface #46  <Method Object Map.get(Object)>
	//   86  174:checkcast       #48  <Class Answer>
	//   87  177:astore_1        
		int k = -1;
	//   88  178:iconst_m1       
	//   89  179:istore_3        
		if(step != null)
	//*  90  180:aload_1         
	//*  91  181:ifnull          195
			k = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//   92  184:aload_1         
	//   93  185:invokevirtual   #51  <Method String Answer.getValue()>
	//   94  188:invokestatic    #57  <Method Integer Integer.valueOf(String)>
	//   95  191:invokevirtual   #61  <Method int Integer.intValue()>
	//   96  194:istore_3        
		step = ((Step) (taskresult));
	//   97  195:aload_2         
	//   98  196:astore_1        
		if(k == 3)
	//*  99  197:iload_3         
	//* 100  198:iconst_3        
	//* 101  199:icmpne          17
			return getStepById("HRUQ-End");
	//  102  202:aload_0         
	//  103  203:ldc1            #63  <String "HRUQ-End">
	//  104  205:invokevirtual   #67  <Method Step getStepById(String)>
	//  105  208:areturn         
		if(true) goto _L4; else goto _L6
_L6:
		step = ((Step) (taskresult));
	//  106  209:aload_2         
	//  107  210:astore_1        
		if(currentStep.getIdentifier().equals("HRUQ6e"))
	//* 108  211:aload_0         
	//* 109  212:getfield        #18  <Field Step currentStep>
	//* 110  215:invokevirtual   #26  <Method String Step.getIdentifier()>
	//* 111  218:ldc1            #73  <String "HRUQ6e">
	//* 112  220:invokevirtual   #34  <Method boolean String.equals(Object)>
	//* 113  223:ifeq            17
		{
			step = ((Step) ((Answer)answers.get("HRUQ6a")));
	//  114  226:aload_0         
	//  115  227:getfield        #38  <Field Map answers>
	//  116  230:ldc1            #40  <String "HRUQ6a">
	//  117  232:invokeinterface #46  <Method Object Map.get(Object)>
	//  118  237:checkcast       #48  <Class Answer>
	//  119  240:astore_1        
			int l = -1;
	//  120  241:iconst_m1       
	//  121  242:istore_3        
			if(step != null)
	//* 122  243:aload_1         
	//* 123  244:ifnull          258
				l = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//  124  247:aload_1         
	//  125  248:invokevirtual   #51  <Method String Answer.getValue()>
	//  126  251:invokestatic    #57  <Method Integer Integer.valueOf(String)>
	//  127  254:invokevirtual   #61  <Method int Integer.intValue()>
	//  128  257:istore_3        
			step = ((Step) (taskresult));
	//  129  258:aload_2         
	//  130  259:astore_1        
			if(l == 4)
	//* 131  260:iload_3         
	//* 132  261:iconst_4        
	//* 133  262:icmpne          17
				return getStepById("HRUQ-End");
	//  134  265:aload_0         
	//  135  266:ldc1            #63  <String "HRUQ-End">
	//  136  268:invokevirtual   #67  <Method Step getStepById(String)>
	//  137  271:areturn         
		}
		if(true) goto _L4; else goto _L7
_L7:
	}

	public Step getStepBeforeStep(Step step, TaskResult taskresult)
	{
		Step step1 = super.getStepBeforeStep(step, taskresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #76  <Method Step SurveyTask.getStepBeforeStep(Step, TaskResult)>
	//    4    6:astore_3        
		if(!currentStep.getIdentifier().equals("HRUQ2a")) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field Step currentStep>
	//    7   11:invokevirtual   #26  <Method String Step.getIdentifier()>
	//    8   14:ldc1            #78  <String "HRUQ2a">
	//    9   16:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   10   19:ifeq            69
_L1:
		step = ((Step) ((Answer)answers.get("HRUQ1a")));
	//   11   22:aload_0         
	//   12   23:getfield        #38  <Field Map answers>
	//   13   26:ldc1            #80  <String "HRUQ1a">
	//   14   28:invokeinterface #46  <Method Object Map.get(Object)>
	//   15   33:checkcast       #48  <Class Answer>
	//   16   36:astore_1        
		taskresult = "";
	//   17   37:ldc1            #82  <String "">
	//   18   39:astore_2        
		if(step != null)
	//*  19   40:aload_1         
	//*  20   41:ifnull          49
			taskresult = ((TaskResult) (((Answer) (step)).getValue()));
	//   21   44:aload_1         
	//   22   45:invokevirtual   #51  <Method String Answer.getValue()>
	//   23   48:astore_2        
		step = step1;
	//   24   49:aload_3         
	//   25   50:astore_1        
		if(((String) (taskresult)).equals("no"))
	//*  26   51:aload_2         
	//*  27   52:ldc1            #84  <String "no">
	//*  28   54:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  29   57:ifeq            67
			step = getStepById("HRUQ1a");
	//   30   60:aload_0         
	//   31   61:ldc1            #80  <String "HRUQ1a">
	//   32   63:invokevirtual   #67  <Method Step getStepById(String)>
	//   33   66:astore_1        
_L4:
		return step;
	//   34   67:aload_1         
	//   35   68:areturn         
_L2:
		if(!currentStep.getIdentifier().equals("HRUQ3a"))
			break; /* Loop/switch isn't completed */
	//   36   69:aload_0         
	//   37   70:getfield        #18  <Field Step currentStep>
	//   38   73:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   39   76:ldc1            #86  <String "HRUQ3a">
	//   40   78:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   41   81:ifeq            129
		step = ((Step) ((Answer)answers.get("HRUQ2a")));
	//   42   84:aload_0         
	//   43   85:getfield        #38  <Field Map answers>
	//   44   88:ldc1            #78  <String "HRUQ2a">
	//   45   90:invokeinterface #46  <Method Object Map.get(Object)>
	//   46   95:checkcast       #48  <Class Answer>
	//   47   98:astore_1        
		taskresult = "";
	//   48   99:ldc1            #82  <String "">
	//   49  101:astore_2        
		if(step != null)
	//*  50  102:aload_1         
	//*  51  103:ifnull          111
			taskresult = ((TaskResult) (((Answer) (step)).getValue()));
	//   52  106:aload_1         
	//   53  107:invokevirtual   #51  <Method String Answer.getValue()>
	//   54  110:astore_2        
		step = step1;
	//   55  111:aload_3         
	//   56  112:astore_1        
		if(((String) (taskresult)).equals("no"))
	//*  57  113:aload_2         
	//*  58  114:ldc1            #84  <String "no">
	//*  59  116:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  60  119:ifeq            67
			return getStepById("HRUQ2a");
	//   61  122:aload_0         
	//   62  123:ldc1            #78  <String "HRUQ2a">
	//   63  125:invokevirtual   #67  <Method Step getStepById(String)>
	//   64  128:areturn         
		if(true) goto _L4; else goto _L3
_L3:
		if(!currentStep.getIdentifier().equals("HRUQ4a"))
			break; /* Loop/switch isn't completed */
	//   65  129:aload_0         
	//   66  130:getfield        #18  <Field Step currentStep>
	//   67  133:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   68  136:ldc1            #88  <String "HRUQ4a">
	//   69  138:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   70  141:ifeq            189
		step = ((Step) ((Answer)answers.get("HRUQ3a")));
	//   71  144:aload_0         
	//   72  145:getfield        #38  <Field Map answers>
	//   73  148:ldc1            #86  <String "HRUQ3a">
	//   74  150:invokeinterface #46  <Method Object Map.get(Object)>
	//   75  155:checkcast       #48  <Class Answer>
	//   76  158:astore_1        
		taskresult = "";
	//   77  159:ldc1            #82  <String "">
	//   78  161:astore_2        
		if(step != null)
	//*  79  162:aload_1         
	//*  80  163:ifnull          171
			taskresult = ((TaskResult) (((Answer) (step)).getValue()));
	//   81  166:aload_1         
	//   82  167:invokevirtual   #51  <Method String Answer.getValue()>
	//   83  170:astore_2        
		step = step1;
	//   84  171:aload_3         
	//   85  172:astore_1        
		if(((String) (taskresult)).equals("no"))
	//*  86  173:aload_2         
	//*  87  174:ldc1            #84  <String "no">
	//*  88  176:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  89  179:ifeq            67
			return getStepById("HRUQ3a");
	//   90  182:aload_0         
	//   91  183:ldc1            #86  <String "HRUQ3a">
	//   92  185:invokevirtual   #67  <Method Step getStepById(String)>
	//   93  188:areturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(!currentStep.getIdentifier().equals("HRUQ5a"))
			break; /* Loop/switch isn't completed */
	//   94  189:aload_0         
	//   95  190:getfield        #18  <Field Step currentStep>
	//   96  193:invokevirtual   #26  <Method String Step.getIdentifier()>
	//   97  196:ldc1            #90  <String "HRUQ5a">
	//   98  198:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   99  201:ifeq            249
		step = ((Step) ((Answer)answers.get("HRUQ4a")));
	//  100  204:aload_0         
	//  101  205:getfield        #38  <Field Map answers>
	//  102  208:ldc1            #88  <String "HRUQ4a">
	//  103  210:invokeinterface #46  <Method Object Map.get(Object)>
	//  104  215:checkcast       #48  <Class Answer>
	//  105  218:astore_1        
		taskresult = "";
	//  106  219:ldc1            #82  <String "">
	//  107  221:astore_2        
		if(step != null)
	//* 108  222:aload_1         
	//* 109  223:ifnull          231
			taskresult = ((TaskResult) (((Answer) (step)).getValue()));
	//  110  226:aload_1         
	//  111  227:invokevirtual   #51  <Method String Answer.getValue()>
	//  112  230:astore_2        
		step = step1;
	//  113  231:aload_3         
	//  114  232:astore_1        
		if(((String) (taskresult)).equals("no"))
	//* 115  233:aload_2         
	//* 116  234:ldc1            #84  <String "no">
	//* 117  236:invokevirtual   #34  <Method boolean String.equals(Object)>
	//* 118  239:ifeq            67
			return getStepById("HRUQ4a");
	//  119  242:aload_0         
	//  120  243:ldc1            #88  <String "HRUQ4a">
	//  121  245:invokevirtual   #67  <Method Step getStepById(String)>
	//  122  248:areturn         
		if(true) goto _L4; else goto _L6
_L6:
		step = step1;
	//  123  249:aload_3         
	//  124  250:astore_1        
		if(currentStep.getIdentifier().equals("HRUQ6a"))
	//* 125  251:aload_0         
	//* 126  252:getfield        #18  <Field Step currentStep>
	//* 127  255:invokevirtual   #26  <Method String Step.getIdentifier()>
	//* 128  258:ldc1            #40  <String "HRUQ6a">
	//* 129  260:invokevirtual   #34  <Method boolean String.equals(Object)>
	//* 130  263:ifeq            67
		{
			step = ((Step) ((Answer)answers.get("HRUQ5a")));
	//  131  266:aload_0         
	//  132  267:getfield        #38  <Field Map answers>
	//  133  270:ldc1            #90  <String "HRUQ5a">
	//  134  272:invokeinterface #46  <Method Object Map.get(Object)>
	//  135  277:checkcast       #48  <Class Answer>
	//  136  280:astore_1        
			taskresult = "";
	//  137  281:ldc1            #82  <String "">
	//  138  283:astore_2        
			if(step != null)
	//* 139  284:aload_1         
	//* 140  285:ifnull          293
				taskresult = ((TaskResult) (((Answer) (step)).getValue()));
	//  141  288:aload_1         
	//  142  289:invokevirtual   #51  <Method String Answer.getValue()>
	//  143  292:astore_2        
			step = step1;
	//  144  293:aload_3         
	//  145  294:astore_1        
			if(((String) (taskresult)).equals("no"))
	//* 146  295:aload_2         
	//* 147  296:ldc1            #84  <String "no">
	//* 148  298:invokevirtual   #34  <Method boolean String.equals(Object)>
	//* 149  301:ifeq            67
				return getStepById("HRUQ5a");
	//  150  304:aload_0         
	//  151  305:ldc1            #90  <String "HRUQ5a">
	//  152  307:invokevirtual   #67  <Method Step getStepById(String)>
	//  153  310:areturn         
		}
		if(true) goto _L4; else goto _L7
_L7:
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.ui.SurveyCallbacks;
import java.util.List;
import java.util.Map;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveyTask, Answer, Survey, QuestionType, 
//			SurveyDelegate, PpdCalculator

public class PpdTask extends SurveyTask
{

	public PpdTask(Survey survey, List list, Map map, Map map1, SurveyCallbacks surveycallbacks)
	{
		super(survey, list, map, map1, surveycallbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #23  <Method void SurveyTask(Survey, List, Map, Map, SurveyCallbacks)>
	//    7   11:return          
	}

	public Step getStepAfterStep(Step step, TaskResult taskresult)
	{
		if(step == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
			return super.getStepAfterStep(step, taskresult);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #30  <Method Step SurveyTask.getStepAfterStep(Step, TaskResult)>
	//    6   10:areturn         
		Step step1 = super.getStepAfterStep(step, taskresult);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokespecial   #30  <Method Step SurveyTask.getStepAfterStep(Step, TaskResult)>
	//   11   17:astore          5
		taskresult = ((TaskResult) (getSelectedValue(step, taskresult)));
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:aload_2         
	//   15   22:invokevirtual   #34  <Method String getSelectedValue(Step, TaskResult)>
	//   16   25:astore_2        
		if(step.getIdentifier().equals("EPDS20") && score < 13)
	//*  17   26:aload_1         
	//*  18   27:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  19   30:ldc1            #42  <String "EPDS20">
	//*  20   32:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  21   35:ifeq            54
	//*  22   38:aload_0         
	//*  23   39:getfield        #50  <Field int score>
	//*  24   42:bipush          13
	//*  25   44:icmpge          54
			return getStepById("PP1");
	//   26   47:aload_0         
	//   27   48:ldc1            #52  <String "PP1">
	//   28   50:invokevirtual   #56  <Method Step getStepById(String)>
	//   29   53:areturn         
		if(step.getIdentifier().equals("PP4"))
	//*  30   54:aload_1         
	//*  31   55:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  32   58:ldc1            #58  <String "PP4">
	//*  33   60:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  34   63:ifeq            172
		{
			step = "";
	//   35   66:ldc1            #60  <String "">
	//   36   68:astore_1        
			taskresult = ((TaskResult) ((Answer)answers.get("EPDS16")));
	//   37   69:aload_0         
	//   38   70:getfield        #64  <Field Map answers>
	//   39   73:ldc1            #66  <String "EPDS16">
	//   40   75:invokeinterface #72  <Method Object Map.get(Object)>
	//   41   80:checkcast       #74  <Class Answer>
	//   42   83:astore_2        
			if(taskresult != null)
	//*  43   84:aload_2         
	//*  44   85:ifnull          93
				step = ((Step) (((Answer) (taskresult)).getValue()));
	//   45   88:aload_2         
	//   46   89:invokevirtual   #77  <Method String Answer.getValue()>
	//   47   92:astore_1        
			if(((String) (step)).equals("often") || ((String) (step)).equals("sometimes"))
	//*  48   93:aload_1         
	//*  49   94:ldc1            #79  <String "often">
	//*  50   96:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  51   99:ifne            111
	//*  52  102:aload_1         
	//*  53  103:ldc1            #81  <String "sometimes">
	//*  54  105:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  55  108:ifeq            170
			{
				if(Res.getStudyId() == StudyId.US)
	//*  56  111:invokestatic    #87  <Method StudyId Res.getStudyId()>
	//*  57  114:getstatic       #93  <Field StudyId StudyId.US>
	//*  58  117:if_acmpne       127
				{
					return getStepById("EPDS25");
	//   59  120:aload_0         
	//   60  121:ldc1            #95  <String "EPDS25">
	//   61  123:invokevirtual   #56  <Method Step getStepById(String)>
	//   62  126:areturn         
				} else
				{
					SurveyDelegate.insertOrUpdateAnswer(answers, survey.getCode(), QuestionType.QuestionTypeBooleanChoice, new Answer(Res.getStudyId().name(), survey.getCode(), "suicidality", "0"));
	//   63  127:aload_0         
	//   64  128:getfield        #64  <Field Map answers>
	//   65  131:aload_0         
	//   66  132:getfield        #99  <Field Survey survey>
	//   67  135:invokevirtual   #104 <Method String Survey.getCode()>
	//   68  138:getstatic       #110 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   69  141:new             #74  <Class Answer>
	//   70  144:dup             
	//   71  145:invokestatic    #87  <Method StudyId Res.getStudyId()>
	//   72  148:invokevirtual   #113 <Method String StudyId.name()>
	//   73  151:aload_0         
	//   74  152:getfield        #99  <Field Survey survey>
	//   75  155:invokevirtual   #104 <Method String Survey.getCode()>
	//   76  158:ldc1            #17  <String "suicidality">
	//   77  160:ldc1            #115 <String "0">
	//   78  162:invokespecial   #118 <Method void Answer(String, String, String, String)>
	//   79  165:invokestatic    #124 <Method void SurveyDelegate.insertOrUpdateAnswer(Map, String, QuestionType, Answer)>
					return null;
	//   80  168:aconst_null     
	//   81  169:areturn         
				}
			} else
			{
				return null;
	//   82  170:aconst_null     
	//   83  171:areturn         
			}
		}
		if(step.getIdentifier().equals("EPDS25"))
	//*  84  172:aload_1         
	//*  85  173:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  86  176:ldc1            #95  <String "EPDS25">
	//*  87  178:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  88  181:ifeq            234
			if(!((String) (taskresult)).equals("never"))
	//*  89  184:aload_2         
	//*  90  185:ldc1            #126 <String "never">
	//*  91  187:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  92  190:ifne            321
				SurveyDelegate.insertOrUpdateAnswer(answers, survey.getCode(), QuestionType.QuestionTypeBooleanChoice, new Answer(Res.getStudyId().name(), survey.getCode(), "suicidality", "1"));
	//   93  193:aload_0         
	//   94  194:getfield        #64  <Field Map answers>
	//   95  197:aload_0         
	//   96  198:getfield        #99  <Field Survey survey>
	//   97  201:invokevirtual   #104 <Method String Survey.getCode()>
	//   98  204:getstatic       #110 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   99  207:new             #74  <Class Answer>
	//  100  210:dup             
	//  101  211:invokestatic    #87  <Method StudyId Res.getStudyId()>
	//  102  214:invokevirtual   #113 <Method String StudyId.name()>
	//  103  217:aload_0         
	//  104  218:getfield        #99  <Field Survey survey>
	//  105  221:invokevirtual   #104 <Method String Survey.getCode()>
	//  106  224:ldc1            #17  <String "suicidality">
	//  107  226:ldc1            #128 <String "1">
	//  108  228:invokespecial   #118 <Method void Answer(String, String, String, String)>
	//  109  231:invokestatic    #124 <Method void SurveyDelegate.insertOrUpdateAnswer(Map, String, QuestionType, Answer)>
			else
	//* 110  234:aload_1         
	//* 111  235:invokevirtual   #40  <Method String Step.getIdentifier()>
	//* 112  238:ldc1            #130 <String "EPDS04">
	//* 113  240:invokevirtual   #48  <Method boolean String.equals(Object)>
	//* 114  243:ifeq            372
	//* 115  246:iconst_0        
	//* 116  247:istore_3        
	//* 117  248:aload_0         
	//* 118  249:getfield        #64  <Field Map answers>
	//* 119  252:ldc1            #130 <String "EPDS04">
	//* 120  254:invokeinterface #72  <Method Object Map.get(Object)>
	//* 121  259:checkcast       #74  <Class Answer>
	//* 122  262:astore_1        
	//* 123  263:aload_1         
	//* 124  264:ifnull          278
	//* 125  267:aload_1         
	//* 126  268:invokevirtual   #77  <Method String Answer.getValue()>
	//* 127  271:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//* 128  274:invokevirtual   #140 <Method int Integer.intValue()>
	//* 129  277:istore_3        
	//* 130  278:aload_0         
	//* 131  279:getfield        #143 <Field Map globalVariables>
	//* 132  282:ldc1            #145 <String "age">
	//* 133  284:invokeinterface #72  <Method Object Map.get(Object)>
	//* 134  289:checkcast       #44  <Class String>
	//* 135  292:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//* 136  295:invokevirtual   #140 <Method int Integer.intValue()>
	//* 137  298:istore          4
	//* 138  300:iload_3         
	//* 139  301:iload           4
	//* 140  303:icmpeq          314
	//* 141  306:iload_3         
	//* 142  307:iload           4
	//* 143  309:iconst_1        
	//* 144  310:isub            
	//* 145  311:icmpne          365
	//* 146  314:aload_0         
	//* 147  315:ldc1            #147 <String "EPDS04b">
	//* 148  317:invokevirtual   #56  <Method Step getStepById(String)>
	//* 149  320:areturn         
				SurveyDelegate.insertOrUpdateAnswer(answers, survey.getCode(), QuestionType.QuestionTypeBooleanChoice, new Answer(Res.getStudyId().name(), survey.getCode(), "suicidality", "0"));
	//  150  321:aload_0         
	//  151  322:getfield        #64  <Field Map answers>
	//  152  325:aload_0         
	//  153  326:getfield        #99  <Field Survey survey>
	//  154  329:invokevirtual   #104 <Method String Survey.getCode()>
	//  155  332:getstatic       #110 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//  156  335:new             #74  <Class Answer>
	//  157  338:dup             
	//  158  339:invokestatic    #87  <Method StudyId Res.getStudyId()>
	//  159  342:invokevirtual   #113 <Method String StudyId.name()>
	//  160  345:aload_0         
	//  161  346:getfield        #99  <Field Survey survey>
	//  162  349:invokevirtual   #104 <Method String Survey.getCode()>
	//  163  352:ldc1            #17  <String "suicidality">
	//  164  354:ldc1            #115 <String "0">
	//  165  356:invokespecial   #118 <Method void Answer(String, String, String, String)>
	//  166  359:invokestatic    #124 <Method void SurveyDelegate.insertOrUpdateAnswer(Map, String, QuestionType, Answer)>
		if(step.getIdentifier().equals("EPDS04"))
		{
			int i = 0;
			step = ((Step) ((Answer)answers.get("EPDS04")));
			if(step != null)
				i = Integer.valueOf(((Answer) (step)).getValue()).intValue();
			int k = Integer.valueOf((String)globalVariables.get("age")).intValue();
			if(i == k || i == k - 1)
				return getStepById("EPDS04b");
			else
	//* 167  362:goto            234
				return getStepById("EPDS05");
	//  168  365:aload_0         
	//  169  366:ldc1            #149 <String "EPDS05">
	//  170  368:invokevirtual   #56  <Method Step getStepById(String)>
	//  171  371:areturn         
		}
		if(step.getIdentifier().equals("ppdE3"))
	//* 172  372:aload_1         
	//* 173  373:invokevirtual   #40  <Method String Step.getIdentifier()>
	//* 174  376:ldc1            #151 <String "ppdE3">
	//* 175  378:invokevirtual   #48  <Method boolean String.equals(Object)>
	//* 176  381:ifeq            509
		{
			step = "";
	//  177  384:ldc1            #60  <String "">
	//  178  386:astore_1        
			taskresult = ((TaskResult) ((Answer)answers.get("ppdE3")));
	//  179  387:aload_0         
	//  180  388:getfield        #64  <Field Map answers>
	//  181  391:ldc1            #151 <String "ppdE3">
	//  182  393:invokeinterface #72  <Method Object Map.get(Object)>
	//  183  398:checkcast       #74  <Class Answer>
	//  184  401:astore_2        
			if(taskresult != null)
	//* 185  402:aload_2         
	//* 186  403:ifnull          411
				step = ((Step) (((Answer) (taskresult)).getValue()));
	//  187  406:aload_2         
	//  188  407:invokevirtual   #77  <Method String Answer.getValue()>
	//  189  410:astore_1        
			if(!((String) (step)).equals("no"))
	//* 190  411:aload_1         
	//* 191  412:ldc1            #153 <String "no">
	//* 192  414:invokevirtual   #48  <Method boolean String.equals(Object)>
	//* 193  417:ifne            507
			{
				int j = 0;
	//  194  420:iconst_0        
	//  195  421:istore_3        
				step = ((Step) ((Answer)answers.get("ppdE2b")));
	//  196  422:aload_0         
	//  197  423:getfield        #64  <Field Map answers>
	//  198  426:ldc1            #155 <String "ppdE2b">
	//  199  428:invokeinterface #72  <Method Object Map.get(Object)>
	//  200  433:checkcast       #74  <Class Answer>
	//  201  436:astore_1        
				if(step != null)
	//* 202  437:aload_1         
	//* 203  438:ifnull          452
					j = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//  204  441:aload_1         
	//  205  442:invokevirtual   #77  <Method String Answer.getValue()>
	//  206  445:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//  207  448:invokevirtual   #140 <Method int Integer.intValue()>
	//  208  451:istore_3        
				step = "";
	//  209  452:ldc1            #60  <String "">
	//  210  454:astore_1        
				taskresult = ((TaskResult) ((Answer)answers.get("ppdE2a")));
	//  211  455:aload_0         
	//  212  456:getfield        #64  <Field Map answers>
	//  213  459:ldc1            #157 <String "ppdE2a">
	//  214  461:invokeinterface #72  <Method Object Map.get(Object)>
	//  215  466:checkcast       #74  <Class Answer>
	//  216  469:astore_2        
				if(taskresult != null)
	//* 217  470:aload_2         
	//* 218  471:ifnull          479
					step = ((Step) (((Answer) (taskresult)).getValue()));
	//  219  474:aload_2         
	//  220  475:invokevirtual   #77  <Method String Answer.getValue()>
	//  221  478:astore_1        
				if(j == 1 || ((String) (step)).equals("yes"))
	//* 222  479:iload_3         
	//* 223  480:iconst_1        
	//* 224  481:icmpeq          493
	//* 225  484:aload_1         
	//* 226  485:ldc1            #159 <String "yes">
	//* 227  487:invokevirtual   #48  <Method boolean String.equals(Object)>
	//* 228  490:ifeq            500
					return getStepById("EPDS01a");
	//  229  493:aload_0         
	//  230  494:ldc1            #161 <String "EPDS01a">
	//  231  496:invokevirtual   #56  <Method Step getStepById(String)>
	//  232  499:areturn         
				else
					return getStepById("EPDS01");
	//  233  500:aload_0         
	//  234  501:ldc1            #163 <String "EPDS01">
	//  235  503:invokevirtual   #56  <Method Step getStepById(String)>
	//  236  506:areturn         
			} else
			{
				return null;
	//  237  507:aconst_null     
	//  238  508:areturn         
			}
		} else
		{
			score = (new PpdCalculator(answers)).score();
	//  239  509:aload_0         
	//  240  510:new             #165 <Class PpdCalculator>
	//  241  513:dup             
	//  242  514:aload_0         
	//  243  515:getfield        #64  <Field Map answers>
	//  244  518:invokespecial   #168 <Method void PpdCalculator(Map)>
	//  245  521:invokevirtual   #170 <Method int PpdCalculator.score()>
	//  246  524:putfield        #50  <Field int score>
			return step1;
	//  247  527:aload           5
	//  248  529:areturn         
		}
	}

	public Step getStepBeforeStep(Step step, TaskResult taskresult)
	{
		taskresult = ((TaskResult) (super.getStepBeforeStep(step, taskresult)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #173 <Method Step SurveyTask.getStepBeforeStep(Step, TaskResult)>
	//    4    6:astore_2        
		if(currentStep.getIdentifier().equals("PP1") && score < 13)
	//*   5    7:aload_0         
	//*   6    8:getfield        #177 <Field Step currentStep>
	//*   7   11:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*   8   14:ldc1            #52  <String "PP1">
	//*   9   16:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  10   19:ifeq            38
	//*  11   22:aload_0         
	//*  12   23:getfield        #50  <Field int score>
	//*  13   26:bipush          13
	//*  14   28:icmpge          38
			return getStepById("EPDS20");
	//   15   31:aload_0         
	//   16   32:ldc1            #42  <String "EPDS20">
	//   17   34:invokevirtual   #56  <Method Step getStepById(String)>
	//   18   37:areturn         
		if(currentStep.getIdentifier().equals("ppdE3"))
	//*  19   38:aload_0         
	//*  20   39:getfield        #177 <Field Step currentStep>
	//*  21   42:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  22   45:ldc1            #151 <String "ppdE3">
	//*  23   47:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  24   50:ifeq            103
		{
			Answer answer = (Answer)answers.get("ppdE1");
	//   25   53:aload_0         
	//   26   54:getfield        #64  <Field Map answers>
	//   27   57:ldc1            #179 <String "ppdE1">
	//   28   59:invokeinterface #72  <Method Object Map.get(Object)>
	//   29   64:checkcast       #74  <Class Answer>
	//   30   67:astore          5
			step = ((Step) (Integer.valueOf(0)));
	//   31   69:iconst_0        
	//   32   70:invokestatic    #182 <Method Integer Integer.valueOf(int)>
	//   33   73:astore_1        
			if(answer != null)
	//*  34   74:aload           5
	//*  35   76:ifnull          88
				step = ((Step) (Integer.valueOf(answer.getValue())));
	//   36   79:aload           5
	//   37   81:invokevirtual   #77  <Method String Answer.getValue()>
	//   38   84:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//   39   87:astore_1        
			if(((Integer) (step)).intValue() == 1)
	//*  40   88:aload_1         
	//*  41   89:invokevirtual   #140 <Method int Integer.intValue()>
	//*  42   92:iconst_1        
	//*  43   93:icmpne          103
				return getStepById("ppdE2a");
	//   44   96:aload_0         
	//   45   97:ldc1            #157 <String "ppdE2a">
	//   46   99:invokevirtual   #56  <Method Step getStepById(String)>
	//   47  102:areturn         
		}
		if(currentStep.getIdentifier().equals("EPDS05"))
	//*  48  103:aload_0         
	//*  49  104:getfield        #177 <Field Step currentStep>
	//*  50  107:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  51  110:ldc1            #149 <String "EPDS05">
	//*  52  112:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  53  115:ifeq            200
		{
			int i = 0;
	//   54  118:iconst_0        
	//   55  119:istore_3        
			step = ((Step) ((Answer)answers.get("EPDS04")));
	//   56  120:aload_0         
	//   57  121:getfield        #64  <Field Map answers>
	//   58  124:ldc1            #130 <String "EPDS04">
	//   59  126:invokeinterface #72  <Method Object Map.get(Object)>
	//   60  131:checkcast       #74  <Class Answer>
	//   61  134:astore_1        
			if(step != null)
	//*  62  135:aload_1         
	//*  63  136:ifnull          150
				i = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//   64  139:aload_1         
	//   65  140:invokevirtual   #77  <Method String Answer.getValue()>
	//   66  143:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//   67  146:invokevirtual   #140 <Method int Integer.intValue()>
	//   68  149:istore_3        
			int k = Integer.valueOf((String)globalVariables.get("age")).intValue();
	//   69  150:aload_0         
	//   70  151:getfield        #143 <Field Map globalVariables>
	//   71  154:ldc1            #145 <String "age">
	//   72  156:invokeinterface #72  <Method Object Map.get(Object)>
	//   73  161:checkcast       #44  <Class String>
	//   74  164:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//   75  167:invokevirtual   #140 <Method int Integer.intValue()>
	//   76  170:istore          4
			if(i == k || i == k - 1)
	//*  77  172:iload_3         
	//*  78  173:iload           4
	//*  79  175:icmpeq          186
	//*  80  178:iload_3         
	//*  81  179:iload           4
	//*  82  181:iconst_1        
	//*  83  182:isub            
	//*  84  183:icmpne          193
				return getStepById("EPDS04b");
	//   85  186:aload_0         
	//   86  187:ldc1            #147 <String "EPDS04b">
	//   87  189:invokevirtual   #56  <Method Step getStepById(String)>
	//   88  192:areturn         
			else
				return getStepById("EPDS04");
	//   89  193:aload_0         
	//   90  194:ldc1            #130 <String "EPDS04">
	//   91  196:invokevirtual   #56  <Method Step getStepById(String)>
	//   92  199:areturn         
		}
		if(currentStep.getIdentifier().equals("EPDS04"))
	//*  93  200:aload_0         
	//*  94  201:getfield        #177 <Field Step currentStep>
	//*  95  204:invokevirtual   #40  <Method String Step.getIdentifier()>
	//*  96  207:ldc1            #130 <String "EPDS04">
	//*  97  209:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  98  212:ifeq            302
		{
			step = ((Step) ((Answer)answers.get("ppdE2b")));
	//   99  215:aload_0         
	//  100  216:getfield        #64  <Field Map answers>
	//  101  219:ldc1            #155 <String "ppdE2b">
	//  102  221:invokeinterface #72  <Method Object Map.get(Object)>
	//  103  226:checkcast       #74  <Class Answer>
	//  104  229:astore_1        
			int j = 0;
	//  105  230:iconst_0        
	//  106  231:istore_3        
			if(step != null)
	//* 107  232:aload_1         
	//* 108  233:ifnull          247
				j = Integer.valueOf(((Answer) (step)).getValue()).intValue();
	//  109  236:aload_1         
	//  110  237:invokevirtual   #77  <Method String Answer.getValue()>
	//  111  240:invokestatic    #136 <Method Integer Integer.valueOf(String)>
	//  112  243:invokevirtual   #140 <Method int Integer.intValue()>
	//  113  246:istore_3        
			step = "";
	//  114  247:ldc1            #60  <String "">
	//  115  249:astore_1        
			taskresult = ((TaskResult) ((Answer)answers.get("ppdE2a")));
	//  116  250:aload_0         
	//  117  251:getfield        #64  <Field Map answers>
	//  118  254:ldc1            #157 <String "ppdE2a">
	//  119  256:invokeinterface #72  <Method Object Map.get(Object)>
	//  120  261:checkcast       #74  <Class Answer>
	//  121  264:astore_2        
			if(taskresult != null)
	//* 122  265:aload_2         
	//* 123  266:ifnull          274
				step = ((Step) (((Answer) (taskresult)).getValue()));
	//  124  269:aload_2         
	//  125  270:invokevirtual   #77  <Method String Answer.getValue()>
	//  126  273:astore_1        
			if(j == 1 || ((String) (step)).equals("yes"))
	//* 127  274:iload_3         
	//* 128  275:iconst_1        
	//* 129  276:icmpeq          288
	//* 130  279:aload_1         
	//* 131  280:ldc1            #159 <String "yes">
	//* 132  282:invokevirtual   #48  <Method boolean String.equals(Object)>
	//* 133  285:ifeq            295
				return getStepById("EPDS01a");
	//  134  288:aload_0         
	//  135  289:ldc1            #161 <String "EPDS01a">
	//  136  291:invokevirtual   #56  <Method Step getStepById(String)>
	//  137  294:areturn         
			else
				return getStepById("EPDS01");
	//  138  295:aload_0         
	//  139  296:ldc1            #163 <String "EPDS01">
	//  140  298:invokevirtual   #56  <Method Step getStepById(String)>
	//  141  301:areturn         
		} else
		{
			score = (new PpdCalculator(answers)).score();
	//  142  302:aload_0         
	//  143  303:new             #165 <Class PpdCalculator>
	//  144  306:dup             
	//  145  307:aload_0         
	//  146  308:getfield        #64  <Field Map answers>
	//  147  311:invokespecial   #168 <Method void PpdCalculator(Map)>
	//  148  314:invokevirtual   #170 <Method int PpdCalculator.score()>
	//  149  317:putfield        #50  <Field int score>
			answers.put("EPDS_total", ((Object) (new Answer(Res.getStudyId().name(), survey.getCode(), "EPDS_total", String.valueOf(score)))));
	//  150  320:aload_0         
	//  151  321:getfield        #64  <Field Map answers>
	//  152  324:ldc1            #8   <String "EPDS_total">
	//  153  326:new             #74  <Class Answer>
	//  154  329:dup             
	//  155  330:invokestatic    #87  <Method StudyId Res.getStudyId()>
	//  156  333:invokevirtual   #113 <Method String StudyId.name()>
	//  157  336:aload_0         
	//  158  337:getfield        #99  <Field Survey survey>
	//  159  340:invokevirtual   #104 <Method String Survey.getCode()>
	//  160  343:ldc1            #8   <String "EPDS_total">
	//  161  345:aload_0         
	//  162  346:getfield        #50  <Field int score>
	//  163  349:invokestatic    #185 <Method String String.valueOf(int)>
	//  164  352:invokespecial   #118 <Method void Answer(String, String, String, String)>
	//  165  355:invokeinterface #189 <Method Object Map.put(Object, Object)>
	//  166  360:pop             
			return ((Step) (taskresult));
	//  167  361:aload_2         
	//  168  362:areturn         
		}
	}

	public static final String EPDS_TOTAL = "EPDS_total";
	public static final String PPD_CASE = "PPD_case";
	public static final String PPP_POSSIBLE = "PPP_possible";
	public static final String SUICIDALITY = "suicidality";
	private int score;
}

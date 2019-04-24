// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.birbit.android.jobqueue.JobManager;
import com.pactforcure.app.api.ProcessQuestionnaireJob;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.ui.SurveyActivity;
import com.pactforcure.app.ui.SurveyCallbacks;
import com.pactforcure.app.util.StringUtils;
import java.util.*;
import org.researchstack.backbone.answerformat.ChoiceAnswerFormat;
import org.researchstack.backbone.answerformat.IntegerAnswerFormat;
import org.researchstack.backbone.model.Choice;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.QuestionStep;
import org.researchstack.backbone.step.Step;

// Referenced classes of package com.pactforcure.app.survey:
//			Question, Answer, SurveyStorage, QuestionType, 
//			SurveyDataException, ProgressStatus, SurveyTask, TaskClosureReason

public class SurveyDelegate
	implements SurveyCallbacks
{

	public SurveyDelegate(String s, SurveyTask surveytask, Map map, Map map1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		surveyCode = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String surveyCode>
		surveyTask = surveytask;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field SurveyTask surveyTask>
		globalVariables = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Map globalVariables>
		answers = map1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field Map answers>
		stepList = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field List stepList>
	//   17   31:return          
	}

	public static void insertOrUpdateAnswer(Map map, String s, Question question, String s1)
	{
		insertOrUpdateAnswer(map, s, question.getQuestionCode(), question.getQuestionType(), s1, question);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #44  <Method String Question.getQuestionCode()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #48  <Method QuestionType Question.getQuestionType()>
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #51  <Method void insertOrUpdateAnswer(Map, String, String, QuestionType, String, Question)>
	//    9   15:return          
	}

	public static void insertOrUpdateAnswer(Map map, String s, QuestionType questiontype, Answer answer)
	{
		insertOrUpdateAnswer(map, s, answer.getQuestionCode(), questiontype, answer.getValue(), ((Question) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #56  <Method String Answer.getQuestionCode()>
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #59  <Method String Answer.getValue()>
	//    7   11:aconst_null     
	//    8   12:invokestatic    #51  <Method void insertOrUpdateAnswer(Map, String, String, QuestionType, String, Question)>
	//    9   15:return          
	}

	public static void insertOrUpdateAnswer(Map map, String s, String s1, QuestionType questiontype, String s2, Question question)
	{
		Object obj = ((Object) ((Answer)map.get(((Object) (s1)))));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokeinterface #67  <Method Object Map.get(Object)>
	//    3    7:checkcast       #55  <Class Answer>
	//    4   10:astore          7
		if(obj == null) goto _L2; else goto _L1
	//    5   12:aload           7
	//    6   14:ifnull          69
_L1:
		((Answer) (obj)).setValue(s2);
	//    7   17:aload           7
	//    8   19:aload           4
	//    9   21:invokevirtual   #71  <Method void Answer.setValue(String)>
		((Answer) (obj)).setDateAdded(new Date());
	//   10   24:aload           7
	//   11   26:new             #73  <Class Date>
	//   12   29:dup             
	//   13   30:invokespecial   #74  <Method void Date()>
	//   14   33:invokevirtual   #78  <Method void Answer.setDateAdded(Date)>
		questiontype = ((QuestionType) (obj));
	//   15   36:aload           7
	//   16   38:astore_3        
_L4:
		map.put(((Object) (s1)), ((Object) (questiontype)));
	//   17   39:aload_0         
	//   18   40:aload_2         
	//   19   41:aload_3         
	//   20   42:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   21   47:pop             
		if(!s.equals("Eligibility"))
	//*  22   48:aload_1         
	//*  23   49:ldc1            #84  <String "Eligibility">
	//*  24   51:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*  25   54:ifne            68
			SurveyStorage.saveAnswers(Res.getStudyId().name(), s, map);
	//   26   57:invokestatic    #96  <Method StudyId Res.getStudyId()>
	//   27   60:invokevirtual   #101 <Method String StudyId.name()>
	//   28   63:aload_1         
	//   29   64:aload_0         
	//   30   65:invokestatic    #107 <Method void SurveyStorage.saveAnswers(String, String, Map)>
		return;
	//   31   68:return          
_L2:
		obj = ((Object) (s2));
	//   32   69:aload           4
	//   33   71:astore          7
		if(questiontype != QuestionType.QuestionTypeNumberPicker)
			break; /* Loop/switch isn't completed */
	//   34   73:aload_3         
	//   35   74:getstatic       #113 <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//   36   77:if_acmpne       133
		int i;
		if(s2 != null)
	//*  37   80:aload           4
	//*  38   82:ifnull          127
			i = Integer.valueOf(s2).intValue();
	//   39   85:aload           4
	//   40   87:invokestatic    #119 <Method Integer Integer.valueOf(String)>
	//   41   90:invokevirtual   #123 <Method int Integer.intValue()>
	//   42   93:istore          6
		else
	//*  43   95:aload           5
	//*  44   97:iload           6
	//*  45   99:invokevirtual   #127 <Method String Question.getNumericLabel(int)>
	//*  46  102:astore          5
	//*  47  104:new             #55  <Class Answer>
	//*  48  107:dup             
	//*  49  108:invokestatic    #96  <Method StudyId Res.getStudyId()>
	//*  50  111:invokevirtual   #101 <Method String StudyId.name()>
	//*  51  114:aload_1         
	//*  52  115:aload_2         
	//*  53  116:aload           4
	//*  54  118:aload           5
	//*  55  120:invokespecial   #130 <Method void Answer(String, String, String, String, String)>
	//*  56  123:astore_3        
	//*  57  124:goto            39
			i = 0;
	//   58  127:iconst_0        
	//   59  128:istore          6
		question = ((Question) (question.getNumericLabel(i)));
_L5:
		questiontype = ((QuestionType) (new Answer(Res.getStudyId().name(), s, s1, s2, ((String) (question)))));
		if(true) goto _L4; else goto _L3
	//*  60  130:goto            95
_L3:
		question = ((Question) (obj));
	//   61  133:aload           7
	//   62  135:astore          5
		if(questiontype == QuestionType.QuestionTypeBooleanChoice)
	//*  63  137:aload_3         
	//*  64  138:getstatic       #133 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//*  65  141:if_acmpne       104
			if(s2.equals("1"))
	//*  66  144:aload           4
	//*  67  146:ldc1            #135 <String "1">
	//*  68  148:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*  69  151:ifeq            164
				question = ((Question) (Res.getRegularString(0x7f0801ad)));
	//   70  154:ldc1            #136 <Int 0x7f0801ad>
	//   71  156:invokestatic    #139 <Method String Res.getRegularString(int)>
	//   72  159:astore          5
			else
	//*  73  161:goto            104
				question = ((Question) (Res.getRegularString(0x7f08003d)));
	//   74  164:ldc1            #140 <Int 0x7f08003d>
	//   75  166:invokestatic    #139 <Method String Res.getRegularString(int)>
	//   76  169:astore          5
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//*  77  171:goto            161
	}

	public void answerSelected(String s, Step step, Step step1, TaskResult taskresult)
		throws SurveyDataException
	{
		SurveyStorage.saveSurveyProgress(Res.getStudyId().name(), surveyCode, ProgressStatus.Started);
	//    0    0:invokestatic    #96  <Method StudyId Res.getStudyId()>
	//    1    3:invokevirtual   #101 <Method String StudyId.name()>
	//    2    6:aload_0         
	//    3    7:getfield        #25  <Field String surveyCode>
	//    4   10:getstatic       #152 <Field ProgressStatus ProgressStatus.Started>
	//    5   13:invokestatic    #156 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		taskresult = ((TaskResult) (surveyTask.questionByIdentifier(step1.getIdentifier())));
	//    6   16:aload_0         
	//    7   17:getfield        #27  <Field SurveyTask surveyTask>
	//    8   20:aload_3         
	//    9   21:invokevirtual   #161 <Method String Step.getIdentifier()>
	//   10   24:invokevirtual   #167 <Method Question SurveyTask.questionByIdentifier(String)>
	//   11   27:astore          4
		((Question) (taskresult)).replaceTitleVariables(globalVariables);
	//   12   29:aload           4
	//   13   31:aload_0         
	//   14   32:getfield        #29  <Field Map globalVariables>
	//   15   35:invokevirtual   #171 <Method void Question.replaceTitleVariables(Map)>
		globalVariables.put(((Object) (step1.getIdentifier())), ((Object) (s)));
	//   16   38:aload_0         
	//   17   39:getfield        #29  <Field Map globalVariables>
	//   18   42:aload_3         
	//   19   43:invokevirtual   #161 <Method String Step.getIdentifier()>
	//   20   46:aload_1         
	//   21   47:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   22   52:pop             
		if(((Question) (taskresult)).getQuestionType() == QuestionType.QuestionTypeNumberPicker)
	//*  23   53:aload           4
	//*  24   55:invokevirtual   #48  <Method QuestionType Question.getQuestionType()>
	//*  25   58:getstatic       #113 <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//*  26   61:if_acmpne       112
		{
			String s1 = ((Question) (taskresult)).getNumericLabel(Integer.valueOf(s).intValue());
	//   27   64:aload           4
	//   28   66:aload_1         
	//   29   67:invokestatic    #119 <Method Integer Integer.valueOf(String)>
	//   30   70:invokevirtual   #123 <Method int Integer.intValue()>
	//   31   73:invokevirtual   #127 <Method String Question.getNumericLabel(int)>
	//   32   76:astore          5
			globalVariables.put(((Object) ((new StringBuilder()).append(step1.getIdentifier()).append("_label").toString())), ((Object) (s1)));
	//   33   78:aload_0         
	//   34   79:getfield        #29  <Field Map globalVariables>
	//   35   82:new             #173 <Class StringBuilder>
	//   36   85:dup             
	//   37   86:invokespecial   #174 <Method void StringBuilder()>
	//   38   89:aload_3         
	//   39   90:invokevirtual   #161 <Method String Step.getIdentifier()>
	//   40   93:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   41   96:ldc1            #180 <String "_label">
	//   42   98:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   43  101:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   44  104:aload           5
	//   45  106:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   46  111:pop             
		}
		if(!((Question) (taskresult)).getGlobalVariable().equals(""))
	//*  47  112:aload           4
	//*  48  114:invokevirtual   #186 <Method String Question.getGlobalVariable()>
	//*  49  117:ldc1            #188 <String "">
	//*  50  119:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*  51  122:ifne            252
		{
			globalVariables.put(((Object) (((Question) (taskresult)).getGlobalVariable())), ((Object) (s)));
	//   52  125:aload_0         
	//   53  126:getfield        #29  <Field Map globalVariables>
	//   54  129:aload           4
	//   55  131:invokevirtual   #186 <Method String Question.getGlobalVariable()>
	//   56  134:aload_1         
	//   57  135:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   58  140:pop             
			if(((Question) (taskresult)).getQuestionType() == QuestionType.QuestionTypeNumberPicker)
	//*  59  141:aload           4
	//*  60  143:invokevirtual   #48  <Method QuestionType Question.getQuestionType()>
	//*  61  146:getstatic       #113 <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//*  62  149:if_acmpne       228
			{
				step1 = ((Step) (Integer.valueOf(s)));
	//   63  152:aload_1         
	//   64  153:invokestatic    #119 <Method Integer Integer.valueOf(String)>
	//   65  156:astore_3        
				globalVariables.put(((Object) ((new StringBuilder()).append(((Question) (taskresult)).getGlobalVariable()).append("_label").toString())), ((Object) (((Question) (taskresult)).getNumericLabel(((Integer) (step1)).intValue()))));
	//   66  157:aload_0         
	//   67  158:getfield        #29  <Field Map globalVariables>
	//   68  161:new             #173 <Class StringBuilder>
	//   69  164:dup             
	//   70  165:invokespecial   #174 <Method void StringBuilder()>
	//   71  168:aload           4
	//   72  170:invokevirtual   #186 <Method String Question.getGlobalVariable()>
	//   73  173:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   74  176:ldc1            #180 <String "_label">
	//   75  178:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   76  181:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   77  184:aload           4
	//   78  186:aload_3         
	//   79  187:invokevirtual   #123 <Method int Integer.intValue()>
	//   80  190:invokevirtual   #127 <Method String Question.getNumericLabel(int)>
	//   81  193:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   82  198:pop             
				if(((Question) (taskresult)).getGlobalVariable().equals("numDeliveries"))
	//*  83  199:aload           4
	//*  84  201:invokevirtual   #186 <Method String Question.getGlobalVariable()>
	//*  85  204:ldc1            #190 <String "numDeliveries">
	//*  86  206:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*  87  209:ifeq            228
				{
					Participant participant = ParticipantStorage.getParticipant();
	//   88  212:invokestatic    #196 <Method Participant ParticipantStorage.getParticipant()>
	//   89  215:astore          5
					participant.setNumDeliveries(((Integer) (step1)));
	//   90  217:aload           5
	//   91  219:aload_3         
	//   92  220:invokevirtual   #202 <Method void Participant.setNumDeliveries(Integer)>
					participant.save();
	//   93  223:aload           5
	//   94  225:invokevirtual   #205 <Method void Participant.save()>
				}
			}
			SurveyActivity.globalVariableWasUpdated(((Question) (taskresult)).getGlobalVariable(), globalVariables, answers, surveyTask, stepList);
	//   95  228:aload           4
	//   96  230:invokevirtual   #186 <Method String Question.getGlobalVariable()>
	//   97  233:aload_0         
	//   98  234:getfield        #29  <Field Map globalVariables>
	//   99  237:aload_0         
	//  100  238:getfield        #31  <Field Map answers>
	//  101  241:aload_0         
	//  102  242:getfield        #27  <Field SurveyTask surveyTask>
	//  103  245:aload_0         
	//  104  246:getfield        #33  <Field List stepList>
	//  105  249:invokestatic    #211 <Method void SurveyActivity.globalVariableWasUpdated(String, Map, Map, SurveyTask, List)>
		}
		Iterator iterator = stepList.iterator();
	//  106  252:aload_0         
	//  107  253:getfield        #33  <Field List stepList>
	//  108  256:invokeinterface #217 <Method Iterator List.iterator()>
	//  109  261:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//  110  263:aload           5
	//  111  265:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//  112  270:ifeq            444
			step1 = (Step)iterator.next();
	//  113  273:aload           5
	//  114  275:invokeinterface #227 <Method Object Iterator.next()>
	//  115  280:checkcast       #158 <Class Step>
	//  116  283:astore_3        
			if(step1 instanceof QuestionStep)
	//* 117  284:aload_3         
	//* 118  285:instanceof      #229 <Class QuestionStep>
	//* 119  288:ifeq            263
			{
				QuestionStep questionstep = (QuestionStep)step1;
	//  120  291:aload_3         
	//  121  292:checkcast       #229 <Class QuestionStep>
	//  122  295:astore          6
				org.researchstack.backbone.answerformat.AnswerFormat answerformat = questionstep.getAnswerFormat();
	//  123  297:aload           6
	//  124  299:invokevirtual   #233 <Method org.researchstack.backbone.answerformat.AnswerFormat QuestionStep.getAnswerFormat()>
	//  125  302:astore          7
				if((answerformat instanceof IntegerAnswerFormat) || (answerformat instanceof ChoiceAnswerFormat))
	//* 126  304:aload           7
	//* 127  306:instanceof      #235 <Class IntegerAnswerFormat>
	//* 128  309:ifne            320
	//* 129  312:aload           7
	//* 130  314:instanceof      #237 <Class ChoiceAnswerFormat>
	//* 131  317:ifeq            263
				{
					Question question = surveyTask.questionByIdentifier(step1.getIdentifier());
	//  132  320:aload_0         
	//  133  321:getfield        #27  <Field SurveyTask surveyTask>
	//  134  324:aload_3         
	//  135  325:invokevirtual   #161 <Method String Step.getIdentifier()>
	//  136  328:invokevirtual   #167 <Method Question SurveyTask.questionByIdentifier(String)>
	//  137  331:astore          7
					question.replaceTitleVariables(globalVariables);
	//  138  333:aload           7
	//  139  335:aload_0         
	//  140  336:getfield        #29  <Field Map globalVariables>
	//  141  339:invokevirtual   #171 <Method void Question.replaceTitleVariables(Map)>
					step1.setTitle(question.getTitleFormatted());
	//  142  342:aload_3         
	//  143  343:aload           7
	//  144  345:invokevirtual   #240 <Method String Question.getTitleFormatted()>
	//  145  348:invokevirtual   #243 <Method void Step.setTitle(String)>
					step1.setText(question.getTextFormatted());
	//  146  351:aload_3         
	//  147  352:aload           7
	//  148  354:invokevirtual   #246 <Method String Question.getTextFormatted()>
	//  149  357:invokevirtual   #249 <Method void Step.setText(String)>
					if(question.getQuestionType() == QuestionType.QuestionTypeNumberPicker)
	//* 150  360:aload           7
	//* 151  362:invokevirtual   #48  <Method QuestionType Question.getQuestionType()>
	//* 152  365:getstatic       #113 <Field QuestionType QuestionType.QuestionTypeNumberPicker>
	//* 153  368:if_acmpne       263
					{
						if(question.isNumberShowAsOrdinal())
	//* 154  371:aload           7
	//* 155  373:invokevirtual   #252 <Method boolean Question.isNumberShowAsOrdinal()>
	//* 156  376:ifeq            423
						{
							step1 = ((Step) (question.buildNumericChoices()));
	//  157  379:aload           7
	//  158  381:invokevirtual   #256 <Method List Question.buildNumericChoices()>
	//  159  384:astore_3        
							step1 = ((Step) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, (Choice[])((List) (step1)).toArray(((Object []) (new Choice[((List) (step1)).size()]))))));
	//  160  385:new             #237 <Class ChoiceAnswerFormat>
	//  161  388:dup             
	//  162  389:getstatic       #262 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  163  392:aload_3         
	//  164  393:aload_3         
	//  165  394:invokeinterface #265 <Method int List.size()>
	//  166  399:anewarray       Choice[]
	//  167  402:invokeinterface #271 <Method Object[] List.toArray(Object[])>
	//  168  407:checkcast       #273 <Class Choice[]>
	//  169  410:invokespecial   #276 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  170  413:astore_3        
						} else
	//* 171  414:aload           6
	//* 172  416:aload_3         
	//* 173  417:invokevirtual   #280 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
	//* 174  420:goto            263
						{
							step1 = ((Step) (new IntegerAnswerFormat(question.getMin(), question.getMax())));
	//  175  423:new             #235 <Class IntegerAnswerFormat>
	//  176  426:dup             
	//  177  427:aload           7
	//  178  429:invokevirtual   #283 <Method int Question.getMin()>
	//  179  432:aload           7
	//  180  434:invokevirtual   #286 <Method int Question.getMax()>
	//  181  437:invokespecial   #289 <Method void IntegerAnswerFormat(int, int)>
	//  182  440:astore_3        
						}
						questionstep.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (step1)));
					}
				}
			}
		} while(true);
	//  183  441:goto            414
		if(step != null && StringUtils.safeNotEmpty(step.getIdentifier()))
	//* 184  444:aload_2         
	//* 185  445:ifnull          498
	//* 186  448:aload_2         
	//* 187  449:invokevirtual   #161 <Method String Step.getIdentifier()>
	//* 188  452:invokestatic    #295 <Method boolean StringUtils.safeNotEmpty(String)>
	//* 189  455:ifeq            498
		{
			step1 = ((Step) (surveyTask.questionByIdentifier(step.getIdentifier())));
	//  190  458:aload_0         
	//  191  459:getfield        #27  <Field SurveyTask surveyTask>
	//  192  462:aload_2         
	//  193  463:invokevirtual   #161 <Method String Step.getIdentifier()>
	//  194  466:invokevirtual   #167 <Method Question SurveyTask.questionByIdentifier(String)>
	//  195  469:astore_3        
			if(step1 != null)
	//* 196  470:aload_3         
	//* 197  471:ifnull          498
			{
				((Question) (step1)).replaceTitleVariables(globalVariables);
	//  198  474:aload_3         
	//  199  475:aload_0         
	//  200  476:getfield        #29  <Field Map globalVariables>
	//  201  479:invokevirtual   #171 <Method void Question.replaceTitleVariables(Map)>
				step.setTitle(((Question) (step1)).getTitleFormatted());
	//  202  482:aload_2         
	//  203  483:aload_3         
	//  204  484:invokevirtual   #240 <Method String Question.getTitleFormatted()>
	//  205  487:invokevirtual   #243 <Method void Step.setTitle(String)>
				step.setText(((Question) (step1)).getTextFormatted());
	//  206  490:aload_2         
	//  207  491:aload_3         
	//  208  492:invokevirtual   #246 <Method String Question.getTextFormatted()>
	//  209  495:invokevirtual   #249 <Method void Step.setText(String)>
			}
		}
		insertOrUpdateAnswer(answers, surveyCode, ((Question) (taskresult)), s);
	//  210  498:aload_0         
	//  211  499:getfield        #31  <Field Map answers>
	//  212  502:aload_0         
	//  213  503:getfield        #25  <Field String surveyCode>
	//  214  506:aload           4
	//  215  508:aload_1         
	//  216  509:invokestatic    #297 <Method void insertOrUpdateAnswer(Map, String, Question, String)>
	//  217  512:return          
	}

	public Map getGlobalVariables()
	{
		return globalVariables;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Map globalVariables>
	//    2    4:areturn         
	}

	public List getStepList()
	{
		return stepList;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List stepList>
	//    2    4:areturn         
	}

	public SurveyTask getSurveyTask()
	{
		return surveyTask;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SurveyTask surveyTask>
	//    2    4:areturn         
	}

	public void setGlobalVariables(Map map)
	{
		globalVariables = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Map globalVariables>
	//    3    5:return          
	}

	public void setStepList(List list)
	{
		stepList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field List stepList>
	//    3    5:return          
	}

	public void setSurveyTask(SurveyTask surveytask)
	{
		surveyTask = surveytask;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field SurveyTask surveyTask>
	//    3    5:return          
	}

	public void taskClosedByTheUser(String s, String s1)
	{
		SurveyStorage.clearAnswers(s, s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #318 <Method long SurveyStorage.clearAnswers(String, String)>
	//    3    5:pop2            
	//    4    6:return          
	}

	public void willStop(TaskClosureReason taskclosurereason)
	{
		if(taskclosurereason == TaskClosureReason.NoSpecialReason)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #326 <Field TaskClosureReason TaskClosureReason.NoSpecialReason>
	//*   2    4:if_acmpne       37
		{
			if(!surveyCode.equals("Eligibility"))
	//*   3    7:aload_0         
	//*   4    8:getfield        #25  <Field String surveyCode>
	//*   5   11:ldc1            #84  <String "Eligibility">
	//*   6   13:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*   7   16:ifne            36
				SurveyStorage.saveAnswers(Res.getStudyId().name(), surveyCode, answers);
	//    8   19:invokestatic    #96  <Method StudyId Res.getStudyId()>
	//    9   22:invokevirtual   #101 <Method String StudyId.name()>
	//   10   25:aload_0         
	//   11   26:getfield        #25  <Field String surveyCode>
	//   12   29:aload_0         
	//   13   30:getfield        #31  <Field Map answers>
	//   14   33:invokestatic    #107 <Method void SurveyStorage.saveAnswers(String, String, Map)>
		} else
	//*  15   36:return          
		if(taskclosurereason == TaskClosureReason.CompletedQuestionnaire)
	//*  16   37:aload_1         
	//*  17   38:getstatic       #329 <Field TaskClosureReason TaskClosureReason.CompletedQuestionnaire>
	//*  18   41:if_acmpne       36
		{
			BackboneApplication.get().getJobManager().addJobInBackground(((com.birbit.android.jobqueue.Job) (new ProcessQuestionnaireJob(surveyCode, true, true))));
	//   19   44:invokestatic    #334 <Method BackboneApplication BackboneApplication.get()>
	//   20   47:invokevirtual   #338 <Method JobManager BackboneApplication.getJobManager()>
	//   21   50:new             #340 <Class ProcessQuestionnaireJob>
	//   22   53:dup             
	//   23   54:aload_0         
	//   24   55:getfield        #25  <Field String surveyCode>
	//   25   58:iconst_1        
	//   26   59:iconst_1        
	//   27   60:invokespecial   #343 <Method void ProcessQuestionnaireJob(String, boolean, boolean)>
	//   28   63:invokevirtual   #349 <Method void JobManager.addJobInBackground(com.birbit.android.jobqueue.Job)>
			return;
	//   29   66:return          
		}
	}

	Map answers;
	Map globalVariables;
	List stepList;
	String surveyCode;
	SurveyTask surveyTask;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import android.util.Log;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.ui.SurveyCallbacks;
import com.pactforcure.app.util.StringUtils;
import java.util.*;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;
import org.researchstack.backbone.task.OrderedTask;

// Referenced classes of package com.pactforcure.app.survey:
//			Survey, Answer, SurveyStorage, Question, 
//			Choice, NextQuestion, QuestionType, ResultFailureConditionInjector, 
//			TaskClosureReason

public class SurveyTask extends OrderedTask
{

	public SurveyTask(Survey survey1, List list, Map map, Map map1, SurveyCallbacks surveycallbacks)
	{
		super(survey1.getCode(), list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method String Survey.getCode()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #34  <Method void OrderedTask(String, List)>
		shouldSaveParticipantAnswers = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #36  <Field boolean shouldSaveParticipantAnswers>
		survey = survey1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #38  <Field Survey survey>
		globalVariables = map;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #40  <Field Map globalVariables>
		answers = map1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #42  <Field Map answers>
		_flddelegate = surveycallbacks;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #44  <Field SurveyCallbacks _flddelegate>
	//   20   36:return          
	}

	private Step getNextStepUsingQuestionCode(String s)
	{
		for(Iterator iterator = steps.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field List steps>
	//*   2    4:invokeinterface #59  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			Step step = (Step)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #69  <Method Object Iterator.next()>
	//    9   25:checkcast       #71  <Class Step>
	//   10   28:astore_3        
			if(step.getIdentifier().equals(((Object) (s))))
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #74  <Method String Step.getIdentifier()>
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  15   37:ifeq            10
				return step;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public void clearViewsOf(Step step)
	{
	//    0    0:return          
	}

	public String getAnswerForStep(Step step)
	{
		step = ((Step) ((Answer)answers.get(((Object) (step.getIdentifier())))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map answers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method String Step.getIdentifier()>
	//    4    8:invokeinterface #90  <Method Object Map.get(Object)>
	//    5   13:checkcast       #92  <Class Answer>
	//    6   16:astore_1        
		if(step != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          26
			return ((Answer) (step)).getValue();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #95  <Method String Answer.getValue()>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public Step getCurrentStep()
	{
		return currentStep;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Step currentStep>
	//    2    4:areturn         
	}

	protected String getSelectedValue(Step step, TaskResult taskresult)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(step == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
		{
			step = ((Step) (obj));
	//    4    6:aload_3         
	//    5    7:astore_1        
		} else
	//*   6    8:aload_1         
	//*   7    9:areturn         
		{
			taskresult = ((TaskResult) (taskresult.getStepResult(step.getIdentifier())));
	//    8   10:aload_2         
	//    9   11:aload_1         
	//   10   12:invokevirtual   #74  <Method String Step.getIdentifier()>
	//   11   15:invokevirtual   #107 <Method StepResult TaskResult.getStepResult(String)>
	//   12   18:astore_2        
			step = ((Step) (obj));
	//   13   19:aload_3         
	//   14   20:astore_1        
			if(taskresult != null)
	//*  15   21:aload_2         
	//*  16   22:ifnull          8
			{
				taskresult = ((TaskResult) (((StepResult) (taskresult)).getResult()));
	//   17   25:aload_2         
	//   18   26:invokevirtual   #112 <Method Object StepResult.getResult()>
	//   19   29:astore_2        
				step = "";
	//   20   30:ldc1            #114 <String "">
	//   21   32:astore_1        
				if(taskresult instanceof String)
	//*  22   33:aload_2         
	//*  23   34:instanceof      #76  <Class String>
	//*  24   37:ifeq            45
					return (String)taskresult;
	//   25   40:aload_2         
	//   26   41:checkcast       #76  <Class String>
	//   27   44:areturn         
				if(taskresult instanceof Integer)
	//*  28   45:aload_2         
	//*  29   46:instanceof      #116 <Class Integer>
	//*  30   49:ifeq            8
					return String.valueOf(((Object) ((Integer)taskresult)));
	//   31   52:aload_2         
	//   32   53:checkcast       #116 <Class Integer>
	//   33   56:invokestatic    #120 <Method String String.valueOf(Object)>
	//   34   59:areturn         
			}
		}
		return ((String) (step));
	}

	public Step getStepAfterStep(Step step, TaskResult taskresult)
	{
		Object obj;
		Step step1;
		String s;
		if(step == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       250
			if(answers.size() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field Map answers>
	//*   4    8:invokeinterface #126 <Method int Map.size()>
	//*   5   13:ifle            236
			{
				Answer answer = SurveyStorage.getLatestAnswer(Res.getStudyId().name(), survey.getCode());
	//    6   16:invokestatic    #132 <Method StudyId Res.getStudyId()>
	//    7   19:invokevirtual   #137 <Method String StudyId.name()>
	//    8   22:aload_0         
	//    9   23:getfield        #38  <Field Survey survey>
	//   10   26:invokevirtual   #31  <Method String Survey.getCode()>
	//   11   29:invokestatic    #143 <Method Answer SurveyStorage.getLatestAnswer(String, String)>
	//   12   32:astore          6
				int i = 0;
	//   13   34:iconst_0        
	//   14   35:istore_3        
label0:
				do
				{
label1:
					{
label2:
						{
							if(i >= steps.size())
								break label0;
	//   15   36:iload_3         
	//   16   37:aload_0         
	//   17   38:getfield        #53  <Field List steps>
	//   18   41:invokeinterface #144 <Method int List.size()>
	//   19   46:icmpge          250
							if(!((Step)steps.get(i)).getIdentifier().equals(((Object) (answer.getQuestionCode()))))
								break label1;
	//   20   49:aload_0         
	//   21   50:getfield        #53  <Field List steps>
	//   22   53:iload_3         
	//   23   54:invokeinterface #147 <Method Object List.get(int)>
	//   24   59:checkcast       #71  <Class Step>
	//   25   62:invokevirtual   #74  <Method String Step.getIdentifier()>
	//   26   65:aload           6
	//   27   67:invokevirtual   #150 <Method String Answer.getQuestionCode()>
	//   28   70:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   29   73:ifeq            229
							step = ((Step) (questionByIdentifier(answer.getQuestionCode())));
	//   30   76:aload_0         
	//   31   77:aload           6
	//   32   79:invokevirtual   #150 <Method String Answer.getQuestionCode()>
	//   33   82:invokevirtual   #154 <Method Question questionByIdentifier(String)>
	//   34   85:astore_1        
							if(((Question) (step)).getChoices() != null)
	//*  35   86:aload_1         
	//*  36   87:invokevirtual   #160 <Method List Question.getChoices()>
	//*  37   90:ifnull          129
							{
								step = ((Step) (((Question) (step)).getSelectedChoiceByValue(answer.value)));
	//   38   93:aload_1         
	//   39   94:aload           6
	//   40   96:getfield        #163 <Field String Answer.value>
	//   41   99:invokevirtual   #167 <Method Choice Question.getSelectedChoiceByValue(String)>
	//   42  102:astore_1        
								if(((Choice) (step)).getNextQuestionCode() != null && ((Choice) (step)).getNextQuestionCode().length() > 0)
	//*  43  103:aload_1         
	//*  44  104:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//*  45  107:ifnull          213
	//*  46  110:aload_1         
	//*  47  111:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//*  48  114:invokevirtual   #175 <Method int String.length()>
	//*  49  117:ifle            213
									return getNextStepUsingQuestionCode(((Choice) (step)).getNextQuestionCode());
	//   50  120:aload_0         
	//   51  121:aload_1         
	//   52  122:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//   53  125:invokespecial   #177 <Method Step getNextStepUsingQuestionCode(String)>
	//   54  128:areturn         
								break label2;
							}
							if(((Question) (step)).getNextQuestions() == null || ((Question) (step)).getNextQuestions().size() <= 0)
								break label2;
	//   55  129:aload_1         
	//   56  130:invokevirtual   #180 <Method List Question.getNextQuestions()>
	//   57  133:ifnull          213
	//   58  136:aload_1         
	//   59  137:invokevirtual   #180 <Method List Question.getNextQuestions()>
	//   60  140:invokeinterface #144 <Method int List.size()>
	//   61  145:ifle            213
							step = ((Step) (((Question) (step)).getNextQuestions().iterator()));
	//   62  148:aload_1         
	//   63  149:invokevirtual   #180 <Method List Question.getNextQuestions()>
	//   64  152:invokeinterface #59  <Method Iterator List.iterator()>
	//   65  157:astore_1        
							do
							{
								if(!((Iterator) (step)).hasNext())
									break label2;
	//   66  158:aload_1         
	//   67  159:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   68  164:ifeq            213
								taskresult = ((TaskResult) ((NextQuestion)((Iterator) (step)).next()));
	//   69  167:aload_1         
	//   70  168:invokeinterface #69  <Method Object Iterator.next()>
	//   71  173:checkcast       #182 <Class NextQuestion>
	//   72  176:astore_2        
							} while(!((NextQuestion) (taskresult)).getValue().equals(((Object) (answer.value))) && !((NextQuestion) (taskresult)).getValue().equals("default"));
	//   73  177:aload_2         
	//   74  178:invokevirtual   #183 <Method String NextQuestion.getValue()>
	//   75  181:aload           6
	//   76  183:getfield        #163 <Field String Answer.value>
	//   77  186:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   78  189:ifne            204
	//   79  192:aload_2         
	//   80  193:invokevirtual   #183 <Method String NextQuestion.getValue()>
	//   81  196:ldc1            #185 <String "default">
	//   82  198:invokevirtual   #80  <Method boolean String.equals(Object)>
	//   83  201:ifeq            158
							return stepByQuestionIdentifier(((NextQuestion) (taskresult)).getNextQuestionCode());
	//   84  204:aload_0         
	//   85  205:aload_2         
	//   86  206:invokevirtual   #186 <Method String NextQuestion.getNextQuestionCode()>
	//   87  209:invokevirtual   #189 <Method Step stepByQuestionIdentifier(String)>
	//   88  212:areturn         
						}
						return (Step)steps.get(i + 1);
	//   89  213:aload_0         
	//   90  214:getfield        #53  <Field List steps>
	//   91  217:iload_3         
	//   92  218:iconst_1        
	//   93  219:iadd            
	//   94  220:invokeinterface #147 <Method Object List.get(int)>
	//   95  225:checkcast       #71  <Class Step>
	//   96  228:areturn         
					}
					i++;
	//   97  229:iload_3         
	//   98  230:iconst_1        
	//   99  231:iadd            
	//  100  232:istore_3        
				} while(true);
	//  101  233:goto            36
			} else
			{
				return (Step)steps.get(0);
	//  102  236:aload_0         
	//  103  237:getfield        #53  <Field List steps>
	//  104  240:iconst_0        
	//  105  241:invokeinterface #147 <Method Object List.get(int)>
	//  106  246:checkcast       #71  <Class Step>
	//  107  249:areturn         
			}
		step1 = super.getStepAfterStep(step, taskresult);
	//  108  250:aload_0         
	//  109  251:aload_1         
	//  110  252:aload_2         
	//  111  253:invokespecial   #191 <Method Step OrderedTask.getStepAfterStep(Step, TaskResult)>
	//  112  256:astore          7
		s = getSelectedValue(step, taskresult);
	//  113  258:aload_0         
	//  114  259:aload_1         
	//  115  260:aload_2         
	//  116  261:invokevirtual   #193 <Method String getSelectedValue(Step, TaskResult)>
	//  117  264:astore          9
		if(s == null)
	//* 118  266:aload           9
	//* 119  268:ifnonnull       274
			return step1;
	//  120  271:aload           7
	//  121  273:areturn         
		obj = ((Object) (step1));
	//  122  274:aload           7
	//  123  276:astore          6
		if(s.length() <= 0) goto _L2; else goto _L1
	//  124  278:aload           9
	//  125  280:invokevirtual   #175 <Method int String.length()>
	//  126  283:ifle            356
_L1:
		obj = ((Object) (questionByIdentifier(step.getIdentifier())));
	//  127  286:aload_0         
	//  128  287:aload_1         
	//  129  288:invokevirtual   #74  <Method String Step.getIdentifier()>
	//  130  291:invokevirtual   #154 <Method Question questionByIdentifier(String)>
	//  131  294:astore          6
		static class _cls1
		{

			static final int $SwitchMap$com$pactforcure$app$survey$QuestionType[];

			static 
			{
				$SwitchMap$com$pactforcure$app$survey$QuestionType = new int[QuestionType.values().length];
			//    0    0:invokestatic    #18  <Method QuestionType[] QuestionType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeSingleChoice.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//    5   12:getstatic       #24  <Field QuestionType QuestionType.QuestionTypeSingleChoice>
			//    6   15:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  10   23:getstatic       #31  <Field QuestionType QuestionType.QuestionTypeMultipleChoice>
			//*  11   26:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  15   34:getstatic       #34  <Field QuestionType QuestionType.QuestionTypeNumberPicker>
			//*  16   37:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  20   45:getstatic       #37  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
			//*  21   48:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  25   56:getstatic       #40  <Field QuestionType QuestionType.QuestionTypeValuePicker>
			//*  26   59:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  30   67:getstatic       #43  <Field QuestionType QuestionType.QuestionTypeScale>
			//*  31   70:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  35   79:getstatic       #46  <Field QuestionType QuestionType.QuestionTypeText>
			//*  36   82:invokevirtual   #28  <Method int QuestionType.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:return          
			//*  40   89:astore_0        
			//*  41   90:return          
			//*  42   91:astore_0        
			//*  43   92:goto            76
			//*  44   95:astore_0        
			//*  45   96:goto            64
			//*  46   99:astore_0        
			//*  47  100:goto            53
			//*  48  103:astore_0        
			//*  49  104:goto            42
			//*  50  107:astore_0        
			//*  51  108:goto            31
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   52  111:astore_0        
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeMultipleChoice.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeNumberPicker.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeBooleanChoice.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeValuePicker.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeScale.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeText.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  53  112:goto            20
			}
		}

		_cls1..SwitchMap.com.pactforcure.app.survey.QuestionType[((Question) (obj)).getQuestionType().ordinal()];
	//  132  296:getstatic       #197 <Field int[] SurveyTask$1.$SwitchMap$com$pactforcure$app$survey$QuestionType>
	//  133  299:aload           6
	//  134  301:invokevirtual   #201 <Method QuestionType Question.getQuestionType()>
	//  135  304:invokevirtual   #206 <Method int QuestionType.ordinal()>
	//  136  307:iaload          
		JVM INSTR tableswitch 1 7: default 352
	//	               1 374
	//	               2 374
	//	               3 480
	//	               4 480
	//	               5 936
	//	               6 951
	//	               7 967;
	//  137  308:tableswitch     1 7: default 352
	//	               1 374
	//	               2 374
	//	               3 480
	//	               4 480
	//	               5 936
	//	               6 951
	//	               7 967
		   goto _L3 _L4 _L4 _L5 _L5 _L6 _L7 _L8
_L3:
		obj = ((Object) (step1));
	//  138  352:aload           7
	//  139  354:astore          6
_L2:
		_flddelegate.answerSelected(s, ((Step) (obj)), step, taskresult);
	//  140  356:aload_0         
	//  141  357:getfield        #44  <Field SurveyCallbacks _flddelegate>
	//  142  360:aload           9
	//  143  362:aload           6
	//  144  364:aload_1         
	//  145  365:aload_2         
	//  146  366:invokeinterface #212 <Method void SurveyCallbacks.answerSelected(String, Step, Step, TaskResult)>
		return ((Step) (obj));
	//  147  371:aload           6
	//  148  373:areturn         
_L4:
		Object obj1 = ((Object) (((Question) (obj)).getSelectedChoiceByValue(s)));
	//  149  374:aload           6
	//  150  376:aload           9
	//  151  378:invokevirtual   #167 <Method Choice Question.getSelectedChoiceByValue(String)>
	//  152  381:astore          8
		obj = ((Object) (step1));
	//  153  383:aload           7
	//  154  385:astore          6
		if(obj1 != null)
	//* 155  387:aload           8
	//* 156  389:ifnull          356
		{
			if(((Choice) (obj1)).getFailReason() != null && !((Choice) (obj1)).getFailReason().equals(""))
	//* 157  392:aload           8
	//* 158  394:invokevirtual   #215 <Method String Choice.getFailReason()>
	//* 159  397:ifnull          424
	//* 160  400:aload           8
	//* 161  402:invokevirtual   #215 <Method String Choice.getFailReason()>
	//* 162  405:ldc1            #114 <String "">
	//* 163  407:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 164  410:ifne            424
			{
				ResultFailureConditionInjector.injectFailure(taskresult, ((Choice) (obj1)).getFailReason());
	//  165  413:aload_2         
	//  166  414:aload           8
	//  167  416:invokevirtual   #215 <Method String Choice.getFailReason()>
	//  168  419:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
				return null;
	//  169  422:aconst_null     
	//  170  423:areturn         
			}
			obj = ((Object) (step1));
	//  171  424:aload           7
	//  172  426:astore          6
			if(((Choice) (obj1)).getNextQuestionCode() != null)
	//* 173  428:aload           8
	//* 174  430:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//* 175  433:ifnull          356
			{
				obj = ((Object) (step1));
	//  176  436:aload           7
	//  177  438:astore          6
				if(!((Choice) (obj1)).getNextQuestionCode().equals(""))
	//* 178  440:aload           8
	//* 179  442:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//* 180  445:ldc1            #114 <String "">
	//* 181  447:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 182  450:ifne            356
				{
					obj1 = ((Object) (getNextStepUsingQuestionCode(((Choice) (obj1)).getNextQuestionCode())));
	//  183  453:aload_0         
	//  184  454:aload           8
	//  185  456:invokevirtual   #172 <Method String Choice.getNextQuestionCode()>
	//  186  459:invokespecial   #177 <Method Step getNextStepUsingQuestionCode(String)>
	//  187  462:astore          8
					obj = ((Object) (step1));
	//  188  464:aload           7
	//  189  466:astore          6
					if(obj1 != null)
	//* 190  468:aload           8
	//* 191  470:ifnull          356
						obj = obj1;
	//  192  473:aload           8
	//  193  475:astore          6
				}
			}
		}
		continue; /* Loop/switch isn't completed */
	//  194  477:goto            356
_L5:
		Object obj2;
		String s1;
		String s2;
		s1 = ((Question) (obj)).getFailValue();
	//  195  480:aload           6
	//  196  482:invokevirtual   #224 <Method String Question.getFailValue()>
	//  197  485:astore          10
		s2 = ((Question) (obj)).getFailComparation();
	//  198  487:aload           6
	//  199  489:invokevirtual   #227 <Method String Question.getFailComparation()>
	//  200  492:astore          11
		obj2 = ((Object) (((Question) (obj)).getFailReason()));
	//  201  494:aload           6
	//  202  496:invokevirtual   #228 <Method String Question.getFailReason()>
	//  203  499:astore          8
		if(s1 == null || s1.length() <= 0 || s2 == null || s2.length() <= 0 || obj2 == null || ((String) (obj2)).length() <= 0) goto _L10; else goto _L9
	//  204  501:aload           10
	//  205  503:ifnull          672
	//  206  506:aload           10
	//  207  508:invokevirtual   #175 <Method int String.length()>
	//  208  511:ifle            672
	//  209  514:aload           11
	//  210  516:ifnull          672
	//  211  519:aload           11
	//  212  521:invokevirtual   #175 <Method int String.length()>
	//  213  524:ifle            672
	//  214  527:aload           8
	//  215  529:ifnull          672
	//  216  532:aload           8
	//  217  534:invokevirtual   #175 <Method int String.length()>
	//  218  537:ifle            672
_L9:
		byte byte0;
		int j;
		int k;
		j = Integer.valueOf(s).intValue();
	//  219  540:aload           9
	//  220  542:invokestatic    #231 <Method Integer Integer.valueOf(String)>
	//  221  545:invokevirtual   #234 <Method int Integer.intValue()>
	//  222  548:istore          4
		k = Integer.valueOf(s1).intValue();
	//  223  550:aload           10
	//  224  552:invokestatic    #231 <Method Integer Integer.valueOf(String)>
	//  225  555:invokevirtual   #234 <Method int Integer.intValue()>
	//  226  558:istore          5
		s1 = ((Question) (obj)).getFailComparation();
	//  227  560:aload           6
	//  228  562:invokevirtual   #227 <Method String Question.getFailComparation()>
	//  229  565:astore          10
		byte0 = -1;
	//  230  567:iconst_m1       
	//  231  568:istore_3        
		s1.hashCode();
	//  232  569:aload           10
	//  233  571:invokevirtual   #237 <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 632
	//	               60: 756
	//	               62: 816
	//	               1084: 831
	//	               1921: 771
	//	               1952: 786
	//	               1983: 801;
	//  234  574:lookupswitch    6: default 632
	//	               60: 756
	//	               62: 816
	//	               1084: 831
	//	               1921: 771
	//	               1952: 786
	//	               1983: 801
		   goto _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L11:
		byte0;
	//  235  632:iload_3         
		JVM INSTR tableswitch 0 5: default 672
	//	               0 846
	//	               1 861
	//	               2 876
	//	               3 891
	//	               4 906
	//	               5 921;
	//  236  633:tableswitch     0 5: default 672
	//	               0 846
	//	               1 861
	//	               2 876
	//	               3 891
	//	               4 906
	//	               5 921
		   goto _L10 _L18 _L19 _L20 _L21 _L22 _L23
_L10:
		obj2 = ((Object) (((Question) (obj)).getNextQuestions().iterator()));
	//  237  672:aload           6
	//  238  674:invokevirtual   #180 <Method List Question.getNextQuestions()>
	//  239  677:invokeinterface #59  <Method Iterator List.iterator()>
	//  240  682:astore          8
label3:
		do
		{
			do
			{
				obj = ((Object) (step1));
	//  241  684:aload           7
	//  242  686:astore          6
				if(!((Iterator) (obj2)).hasNext())
					break label3;
	//  243  688:aload           8
	//  244  690:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//  245  695:ifeq            356
				obj = ((Object) ((NextQuestion)((Iterator) (obj2)).next()));
	//  246  698:aload           8
	//  247  700:invokeinterface #69  <Method Object Iterator.next()>
	//  248  705:checkcast       #182 <Class NextQuestion>
	//  249  708:astore          6
				s1 = ((NextQuestion) (obj)).getValue();
	//  250  710:aload           6
	//  251  712:invokevirtual   #183 <Method String NextQuestion.getValue()>
	//  252  715:astore          10
			} while(!s.equals(((Object) (s1))) && !s1.equals("default"));
	//  253  717:aload           9
	//  254  719:aload           10
	//  255  721:invokevirtual   #80  <Method boolean String.equals(Object)>
	//  256  724:ifne            737
	//  257  727:aload           10
	//  258  729:ldc1            #185 <String "default">
	//  259  731:invokevirtual   #80  <Method boolean String.equals(Object)>
	//  260  734:ifeq            684
			obj = ((Object) (getNextStepUsingQuestionCode(((NextQuestion) (obj)).getNextQuestionCode())));
	//  261  737:aload_0         
	//  262  738:aload           6
	//  263  740:invokevirtual   #186 <Method String NextQuestion.getNextQuestionCode()>
	//  264  743:invokespecial   #177 <Method Step getNextStepUsingQuestionCode(String)>
	//  265  746:astore          6
		} while(obj == null);
	//  266  748:aload           6
	//  267  750:ifnull          684
		continue; /* Loop/switch isn't completed */
	//  268  753:goto            356
_L12:
		if(s1.equals("<"))
	//* 269  756:aload           10
	//* 270  758:ldc1            #239 <String "<">
	//* 271  760:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 272  763:ifeq            632
			byte0 = 0;
	//  273  766:iconst_0        
	//  274  767:istore_3        
		  goto _L11
	//* 275  768:goto            632
_L15:
		if(s1.equals("<="))
	//* 276  771:aload           10
	//* 277  773:ldc1            #241 <String "<=">
	//* 278  775:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 279  778:ifeq            632
			byte0 = 1;
	//  280  781:iconst_1        
	//  281  782:istore_3        
		  goto _L11
	//* 282  783:goto            632
_L16:
		if(s1.equals("=="))
	//* 283  786:aload           10
	//* 284  788:ldc1            #243 <String "==">
	//* 285  790:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 286  793:ifeq            632
			byte0 = 2;
	//  287  796:iconst_2        
	//  288  797:istore_3        
		  goto _L11
	//* 289  798:goto            632
_L17:
		if(s1.equals(">="))
	//* 290  801:aload           10
	//* 291  803:ldc1            #245 <String ">=">
	//* 292  805:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 293  808:ifeq            632
			byte0 = 3;
	//  294  811:iconst_3        
	//  295  812:istore_3        
		  goto _L11
	//* 296  813:goto            632
_L13:
		if(s1.equals(">"))
	//* 297  816:aload           10
	//* 298  818:ldc1            #247 <String ">">
	//* 299  820:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 300  823:ifeq            632
			byte0 = 4;
	//  301  826:iconst_4        
	//  302  827:istore_3        
		  goto _L11
	//* 303  828:goto            632
_L14:
		if(s1.equals("!="))
	//* 304  831:aload           10
	//* 305  833:ldc1            #249 <String "!=">
	//* 306  835:invokevirtual   #80  <Method boolean String.equals(Object)>
	//* 307  838:ifeq            632
			byte0 = 5;
	//  308  841:iconst_5        
	//  309  842:istore_3        
		  goto _L11
	//* 310  843:goto            632
_L18:
		if(j >= k) goto _L10; else goto _L24
	//  311  846:iload           4
	//  312  848:iload           5
	//  313  850:icmpge          672
_L24:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  314  853:aload_2         
	//  315  854:aload           8
	//  316  856:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  317  859:aconst_null     
	//  318  860:areturn         
_L19:
		if(j > k) goto _L10; else goto _L25
	//  319  861:iload           4
	//  320  863:iload           5
	//  321  865:icmpgt          672
_L25:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  322  868:aload_2         
	//  323  869:aload           8
	//  324  871:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  325  874:aconst_null     
	//  326  875:areturn         
_L20:
		if(j != k) goto _L10; else goto _L26
	//  327  876:iload           4
	//  328  878:iload           5
	//  329  880:icmpne          672
_L26:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  330  883:aload_2         
	//  331  884:aload           8
	//  332  886:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  333  889:aconst_null     
	//  334  890:areturn         
_L21:
		if(j < k) goto _L10; else goto _L27
	//  335  891:iload           4
	//  336  893:iload           5
	//  337  895:icmplt          672
_L27:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  338  898:aload_2         
	//  339  899:aload           8
	//  340  901:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  341  904:aconst_null     
	//  342  905:areturn         
_L22:
		if(j <= k) goto _L10; else goto _L28
	//  343  906:iload           4
	//  344  908:iload           5
	//  345  910:icmple          672
_L28:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  346  913:aload_2         
	//  347  914:aload           8
	//  348  916:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  349  919:aconst_null     
	//  350  920:areturn         
_L23:
		if(j == k) goto _L10; else goto _L29
	//  351  921:iload           4
	//  352  923:iload           5
	//  353  925:icmpeq          672
_L29:
		ResultFailureConditionInjector.injectFailure(taskresult, ((String) (obj2)));
	//  354  928:aload_2         
	//  355  929:aload           8
	//  356  931:invokestatic    #221 <Method void ResultFailureConditionInjector.injectFailure(TaskResult, String)>
		return null;
	//  357  934:aconst_null     
	//  358  935:areturn         
_L6:
		Log.e("SurveyTask", "getStepAfterStep: question type: QuestionTypeValuePicker not treated");
	//  359  936:ldc1            #10  <String "SurveyTask">
	//  360  938:ldc1            #251 <String "getStepAfterStep: question type: QuestionTypeValuePicker not treated">
	//  361  940:invokestatic    #257 <Method int Log.e(String, String)>
	//  362  943:pop             
		obj = ((Object) (step1));
	//  363  944:aload           7
	//  364  946:astore          6
		continue; /* Loop/switch isn't completed */
	//  365  948:goto            356
_L7:
		Log.e("SurveyTask", "getStepAfterStep: question type: QuestionTypeScale not treated");
	//  366  951:ldc1            #10  <String "SurveyTask">
	//  367  953:ldc2            #259 <String "getStepAfterStep: question type: QuestionTypeScale not treated">
	//  368  956:invokestatic    #257 <Method int Log.e(String, String)>
	//  369  959:pop             
		obj = ((Object) (step1));
	//  370  960:aload           7
	//  371  962:astore          6
		continue; /* Loop/switch isn't completed */
	//  372  964:goto            356
_L8:
		Log.e("SurveyTask", "getStepAfterStep: question type: QuestionTypeText not treated");
	//  373  967:ldc1            #10  <String "SurveyTask">
	//  374  969:ldc2            #261 <String "getStepAfterStep: question type: QuestionTypeText not treated">
	//  375  972:invokestatic    #257 <Method int Log.e(String, String)>
	//  376  975:pop             
		obj = ((Object) (step1));
	//  377  976:aload           7
	//  378  978:astore          6
		if(true) goto _L2; else goto _L30
	//  379  980:goto            356
_L30:
	}

	public Step getStepBeforeStep(Step step, TaskResult taskresult)
	{
		step = super.getStepBeforeStep(step, taskresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #264 <Method Step OrderedTask.getStepBeforeStep(Step, TaskResult)>
	//    4    6:astore_1        
		String s = getSelectedValue(currentStep, taskresult);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #99  <Field Step currentStep>
	//    8   12:aload_2         
	//    9   13:invokevirtual   #193 <Method String getSelectedValue(Step, TaskResult)>
	//   10   16:astore_3        
		Object obj = ((Object) (questionByIdentifier(currentStep.getIdentifier())));
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #99  <Field Step currentStep>
	//   14   22:invokevirtual   #74  <Method String Step.getIdentifier()>
	//   15   25:invokevirtual   #154 <Method Question questionByIdentifier(String)>
	//   16   28:astore          4
		if(StringUtils.safeNotEmpty(((Question) (obj)).getPreviousQuestion()))
	//*  17   30:aload           4
	//*  18   32:invokevirtual   #267 <Method String Question.getPreviousQuestion()>
	//*  19   35:invokestatic    #273 <Method boolean StringUtils.safeNotEmpty(String)>
	//*  20   38:ifeq            60
		{
			obj = ((Object) (stepByQuestionIdentifier(((Question) (obj)).getPreviousQuestion())));
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:invokevirtual   #267 <Method String Question.getPreviousQuestion()>
	//   24   47:invokevirtual   #189 <Method Step stepByQuestionIdentifier(String)>
	//   25   50:astore          4
			if(obj != null)
	//*  26   52:aload           4
	//*  27   54:ifnull          60
				return ((Step) (obj));
	//   28   57:aload           4
	//   29   59:areturn         
		}
		if(StringUtils.safeNotEmpty(s))
	//*  30   60:aload_3         
	//*  31   61:invokestatic    #273 <Method boolean StringUtils.safeNotEmpty(String)>
	//*  32   64:ifeq            83
			_flddelegate.answerSelected(s, step, currentStep, taskresult);
	//   33   67:aload_0         
	//   34   68:getfield        #44  <Field SurveyCallbacks _flddelegate>
	//   35   71:aload_3         
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #99  <Field Step currentStep>
	//   39   77:aload_2         
	//   40   78:invokeinterface #212 <Method void SurveyCallbacks.answerSelected(String, Step, Step, TaskResult)>
		return step;
	//   41   83:aload_1         
	//   42   84:areturn         
	}

	public Question questionByIdentifier(String s)
	{
		for(Iterator iterator = survey.getQuestions().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Survey survey>
	//*   2    4:invokevirtual   #276 <Method List Survey.getQuestions()>
	//*   3    7:invokeinterface #59  <Method Iterator List.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            45
		{
			Question question = (Question)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #69  <Method Object Iterator.next()>
	//   10   28:checkcast       #156 <Class Question>
	//   11   31:astore_3        
			if(question.getQuestionCode().equals(((Object) (s))))
	//*  12   32:aload_3         
	//*  13   33:invokevirtual   #277 <Method String Question.getQuestionCode()>
	//*  14   36:aload_1         
	//*  15   37:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  16   40:ifeq            13
				return question;
	//   17   43:aload_3         
	//   18   44:areturn         
		}

		return null;
	//   19   45:aconst_null     
	//   20   46:areturn         
	}

	public Step stepByQuestionIdentifier(String s)
	{
		for(Iterator iterator = steps.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field List steps>
	//*   2    4:invokeinterface #59  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			Step step = (Step)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #69  <Method Object Iterator.next()>
	//    9   25:checkcast       #71  <Class Step>
	//   10   28:astore_3        
			if(step.getIdentifier().equals(((Object) (s))))
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #74  <Method String Step.getIdentifier()>
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  15   37:ifeq            10
				return step;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public void stepShown(Step step)
	{
		currentStep = step;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field Step currentStep>
	//    3    5:return          
	}

	public void taskClosedByTheUser()
	{
		shouldSaveParticipantAnswers = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean shouldSaveParticipantAnswers>
		_flddelegate.taskClosedByTheUser(Res.getStudyId().name(), survey.getCode());
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field SurveyCallbacks _flddelegate>
	//    5    9:invokestatic    #132 <Method StudyId Res.getStudyId()>
	//    6   12:invokevirtual   #137 <Method String StudyId.name()>
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field Survey survey>
	//    9   19:invokevirtual   #31  <Method String Survey.getCode()>
	//   10   22:invokeinterface #283 <Method void SurveyCallbacks.taskClosedByTheUser(String, String)>
	//   11   27:return          
	}

	public void willStop(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
		{
			_flddelegate.willStop(TaskClosureReason.CompletedQuestionnaire);
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field SurveyCallbacks _flddelegate>
	//    4    8:getstatic       #291 <Field TaskClosureReason TaskClosureReason.CompletedQuestionnaire>
	//    5   11:invokeinterface #294 <Method void SurveyCallbacks.willStop(TaskClosureReason)>
			return;
	//    6   16:return          
		}
		SurveyCallbacks surveycallbacks = _flddelegate;
	//    7   17:aload_0         
	//    8   18:getfield        #44  <Field SurveyCallbacks _flddelegate>
	//    9   21:astore_3        
		TaskClosureReason taskclosurereason;
		if(shouldSaveParticipantAnswers)
	//*  10   22:aload_0         
	//*  11   23:getfield        #36  <Field boolean shouldSaveParticipantAnswers>
	//*  12   26:ifeq            41
			taskclosurereason = TaskClosureReason.NoSpecialReason;
	//   13   29:getstatic       #297 <Field TaskClosureReason TaskClosureReason.NoSpecialReason>
	//   14   32:astore_2        
		else
	//*  15   33:aload_3         
	//*  16   34:aload_2         
	//*  17   35:invokeinterface #294 <Method void SurveyCallbacks.willStop(TaskClosureReason)>
	//*  18   40:return          
			taskclosurereason = TaskClosureReason.DiscardedResults;
	//   19   41:getstatic       #300 <Field TaskClosureReason TaskClosureReason.DiscardedResults>
	//   20   44:astore_2        
		surveycallbacks.willStop(taskclosurereason);
	//*  21   45:goto            33
	}

	public static final String TAG = "SurveyTask";
	protected final Map answers;
	protected Step currentStep;
	protected final SurveyCallbacks _flddelegate;
	protected final Map globalVariables;
	private boolean shouldSaveParticipantAnswers;
	protected final Survey survey;
}

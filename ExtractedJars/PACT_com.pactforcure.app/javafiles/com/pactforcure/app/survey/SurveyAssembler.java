// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import java.util.*;
import org.researchstack.backbone.answerformat.*;
import org.researchstack.backbone.model.Choice;
import org.researchstack.backbone.step.*;

// Referenced classes of package com.pactforcure.app.survey:
//			Answer, Survey, Question, SurveyDataException, 
//			StepType, QuestionType

public class SurveyAssembler
{

	public SurveyAssembler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Map initializeGlobalVariables(Survey survey, Map map)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void HashMap()>
	//    3    7:astore_2        
		Participant participant = ParticipantStorage.getParticipant();
	//    4    8:invokestatic    #22  <Method Participant ParticipantStorage.getParticipant()>
	//    5   11:astore_3        
		if(participant != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          141
		{
			((Map) (hashmap)).put("numDeliveries", ((Object) (String.valueOf(((Object) (participant.getNumDeliveries()))))));
	//    8   16:aload_2         
	//    9   17:ldc1            #24  <String "numDeliveries">
	//   10   19:aload_3         
	//   11   20:invokevirtual   #30  <Method Integer Participant.getNumDeliveries()>
	//   12   23:invokestatic    #36  <Method String String.valueOf(Object)>
	//   13   26:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
			((Map) (hashmap)).put("age", ((Object) (String.valueOf(((Object) (participant.getAge()))))));
	//   15   32:aload_2         
	//   16   33:ldc1            #44  <String "age">
	//   17   35:aload_3         
	//   18   36:invokevirtual   #47  <Method Integer Participant.getAge()>
	//   19   39:invokestatic    #36  <Method String String.valueOf(Object)>
	//   20   42:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   21   47:pop             
			String s;
			Object obj;
			for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext(); ((Map) (hashmap)).put(((Object) ((new StringBuilder()).append(s).append("_label").toString())), obj))
	//*  22   48:aload_1         
	//*  23   49:invokeinterface #51  <Method Collection Map.values()>
	//*  24   54:invokeinterface #57  <Method Iterator Collection.iterator()>
	//*  25   59:astore_1        
	//*  26   60:aload_1         
	//*  27   61:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  28   66:ifeq            141
			{
				obj = ((Object) ((Answer)((Iterator) (map)).next()));
	//   29   69:aload_1         
	//   30   70:invokeinterface #67  <Method Object Iterator.next()>
	//   31   75:checkcast       #69  <Class Answer>
	//   32   78:astore          5
				s = ((Answer) (obj)).getQuestionCode();
	//   33   80:aload           5
	//   34   82:invokevirtual   #73  <Method String Answer.getQuestionCode()>
	//   35   85:astore_3        
				String s1 = ((Answer) (obj)).getValue();
	//   36   86:aload           5
	//   37   88:invokevirtual   #76  <Method String Answer.getValue()>
	//   38   91:astore          4
				obj = ((Object) (((Answer) (obj)).getFormattedValue()));
	//   39   93:aload           5
	//   40   95:invokevirtual   #79  <Method String Answer.getFormattedValue()>
	//   41   98:astore          5
				((Map) (hashmap)).put(((Object) (s)), ((Object) (s1)));
	//   42  100:aload_2         
	//   43  101:aload_3         
	//   44  102:aload           4
	//   45  104:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   46  109:pop             
			}

	//   47  110:aload_2         
	//   48  111:new             #81  <Class StringBuilder>
	//   49  114:dup             
	//   50  115:invokespecial   #82  <Method void StringBuilder()>
	//   51  118:aload_3         
	//   52  119:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   53  122:ldc1            #88  <String "_label">
	//   54  124:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   55  127:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   56  130:aload           5
	//   57  132:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   58  137:pop             
		}
	//*  59  138:goto            60
		survey = ((Survey) (survey.getQuestions().iterator()));
	//   60  141:aload_0         
	//   61  142:invokevirtual   #97  <Method List Survey.getQuestions()>
	//   62  145:invokeinterface #100 <Method Iterator List.iterator()>
	//   63  150:astore_0        
		do
		{
			if(!((Iterator) (survey)).hasNext())
				break;
	//   64  151:aload_0         
	//   65  152:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   66  157:ifeq            241
			map = ((Map) ((Question)((Iterator) (survey)).next()));
	//   67  160:aload_0         
	//   68  161:invokeinterface #67  <Method Object Iterator.next()>
	//   69  166:checkcast       #102 <Class Question>
	//   70  169:astore_1        
			((Question) (map)).replaceTitleVariables(((Map) (hashmap)));
	//   71  170:aload_1         
	//   72  171:aload_2         
	//   73  172:invokevirtual   #106 <Method void Question.replaceTitleVariables(Map)>
			if(((Map) (hashmap)).get(((Object) (((Question) (map)).getQuestionCode()))) == null)
	//*  74  175:aload_2         
	//*  75  176:aload_1         
	//*  76  177:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//*  77  180:invokeinterface #111 <Method Object Map.get(Object)>
	//*  78  185:ifnonnull       151
			{
				((Map) (hashmap)).put(((Object) (String.valueOf(((Object) (((Question) (map)).getQuestionCode()))))), "0");
	//   79  188:aload_2         
	//   80  189:aload_1         
	//   81  190:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//   82  193:invokestatic    #36  <Method String String.valueOf(Object)>
	//   83  196:ldc1            #113 <String "0">
	//   84  198:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   85  203:pop             
				((Map) (hashmap)).put(((Object) ((new StringBuilder()).append(String.valueOf(((Object) (((Question) (map)).getQuestionCode())))).append("_label").toString())), "");
	//   86  204:aload_2         
	//   87  205:new             #81  <Class StringBuilder>
	//   88  208:dup             
	//   89  209:invokespecial   #82  <Method void StringBuilder()>
	//   90  212:aload_1         
	//   91  213:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//   92  216:invokestatic    #36  <Method String String.valueOf(Object)>
	//   93  219:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   94  222:ldc1            #88  <String "_label">
	//   95  224:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   96  227:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   97  230:ldc1            #115 <String "">
	//   98  232:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   99  237:pop             
			}
		} while(true);
	//  100  238:goto            151
		return ((Map) (hashmap));
	//  101  241:aload_2         
	//  102  242:areturn         
	}

	public static Step stepForQuestion(Question question)
		throws SurveyDataException
	{
		String s;
		String s1 = question.getTitle();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method String Question.getTitle()>
	//    2    4:astore_2        
		s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1.equals("<EMPTY>"))
	//*   5    7:aload_2         
	//*   6    8:ldc1            #126 <String "<EMPTY>">
	//*   7   10:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*   8   13:ifeq            19
			s = "";
	//    9   16:ldc1            #115 <String "">
	//   10   18:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$com$pactforcure$app$survey$QuestionType[];
			static final int $SwitchMap$com$pactforcure$app$survey$StepType[];

			static 
			{
				$SwitchMap$com$pactforcure$app$survey$StepType = new int[StepType.values().length];
			//    0    0:invokestatic    #19  <Method StepType[] StepType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
				try
				{
					$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeQuestion.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
			//    5   12:getstatic       #25  <Field StepType StepType.StepTypeQuestion>
			//    6   15:invokevirtual   #29  <Method int StepType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
			//*  10   23:getstatic       #32  <Field StepType StepType.StepTypeInstruction>
			//*  11   26:invokevirtual   #29  <Method int StepType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$pactforcure$app$survey$StepType>
			//*  15   34:getstatic       #35  <Field StepType StepType.StepTypeCompletion>
			//*  16   37:invokevirtual   #29  <Method int StepType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:invokestatic    #40  <Method QuestionType[] QuestionType.values()>
			//*  20   45:arraylength     
			//*  21   46:newarray        int[]
			//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  24   54:getstatic       #46  <Field QuestionType QuestionType.QuestionTypeNumberPicker>
			//*  25   57:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  26   60:iconst_1        
			//*  27   61:iastore         
			//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  29   65:getstatic       #50  <Field QuestionType QuestionType.QuestionTypeSingleChoice>
			//*  30   68:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  31   71:iconst_2        
			//*  32   72:iastore         
			//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  34   76:getstatic       #53  <Field QuestionType QuestionType.QuestionTypeMultipleChoice>
			//*  35   79:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  36   82:iconst_3        
			//*  37   83:iastore         
			//*  38   84:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  39   87:getstatic       #56  <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
			//*  40   90:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  41   93:iconst_4        
			//*  42   94:iastore         
			//*  43   95:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  44   98:getstatic       #59  <Field QuestionType QuestionType.QuestionTypeValuePicker>
			//*  45  101:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  46  104:iconst_5        
			//*  47  105:iastore         
			//*  48  106:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  49  109:getstatic       #62  <Field QuestionType QuestionType.QuestionTypeScale>
			//*  50  112:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  51  115:bipush          6
			//*  52  117:iastore         
			//*  53  118:getstatic       #42  <Field int[] $SwitchMap$com$pactforcure$app$survey$QuestionType>
			//*  54  121:getstatic       #65  <Field QuestionType QuestionType.QuestionTypeText>
			//*  55  124:invokevirtual   #47  <Method int QuestionType.ordinal()>
			//*  56  127:bipush          7
			//*  57  129:iastore         
			//*  58  130:return          
			//*  59  131:astore_0        
			//*  60  132:return          
			//*  61  133:astore_0        
			//*  62  134:goto            118
			//*  63  137:astore_0        
			//*  64  138:goto            106
			//*  65  141:astore_0        
			//*  66  142:goto            95
			//*  67  145:astore_0        
			//*  68  146:goto            84
			//*  69  149:astore_0        
			//*  70  150:goto            73
			//*  71  153:astore_0        
			//*  72  154:goto            62
			//*  73  157:astore_0        
			//*  74  158:goto            42
			//*  75  161:astore_0        
			//*  76  162:goto            31
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  165:astore_0        
				try
				{
					$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeInstruction.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$StepType[StepType.StepTypeCompletion.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				$SwitchMap$com$pactforcure$app$survey$QuestionType = new int[QuestionType.values().length];
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeNumberPicker.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeSingleChoice.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$pactforcure$app$survey$QuestionType[QuestionType.QuestionTypeMultipleChoice.ordinal()] = 3;
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
			//*  78  166:goto            20
			}
		}

		_cls1..SwitchMap.com.pactforcure.app.survey.StepType[question.getStepType().ordinal()];
	//   11   19:getstatic       #134 <Field int[] SurveyAssembler$1.$SwitchMap$com$pactforcure$app$survey$StepType>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #138 <Method StepType Question.getStepType()>
	//   14   26:invokevirtual   #144 <Method int StepType.ordinal()>
	//   15   29:iaload          
		JVM INSTR tableswitch 1 3: default 56
	//	               1 58
	//	               2 437
	//	               3 454;
	//   16   30:tableswitch     1 3: default 56
	//	               1 58
	//	               2 437
	//	               3 454
		   goto _L1 _L2 _L3 _L4
_L1:
		return null;
	//   17   56:aconst_null     
	//   18   57:areturn         
_L2:
		Object obj;
		QuestionStep questionstep;
		obj = null;
	//   19   58:aconst_null     
	//   20   59:astore_2        
		questionstep = new QuestionStep(question.getQuestionCode(), s);
	//   21   60:new             #146 <Class QuestionStep>
	//   22   63:dup             
	//   23   64:aload_0         
	//   24   65:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//   25   68:aload_1         
	//   26   69:invokespecial   #149 <Method void QuestionStep(String, String)>
	//   27   72:astore          4
		String s2 = question.getTitleFormatted();
	//   28   74:aload_0         
	//   29   75:invokevirtual   #152 <Method String Question.getTitleFormatted()>
	//   30   78:astore_3        
		s = s2;
	//   31   79:aload_3         
	//   32   80:astore_1        
		if(s2.equals("<EMPTY>"))
	//*  33   81:aload_3         
	//*  34   82:ldc1            #126 <String "<EMPTY>">
	//*  35   84:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  36   87:ifeq            93
			s = "";
	//   37   90:ldc1            #115 <String "">
	//   38   92:astore_1        
		questionstep.setTitle(s);
	//   39   93:aload           4
	//   40   95:aload_1         
	//   41   96:invokevirtual   #156 <Method void QuestionStep.setTitle(String)>
		questionstep.setText(question.getTextFormatted());
	//   42   99:aload           4
	//   43  101:aload_0         
	//   44  102:invokevirtual   #159 <Method String Question.getTextFormatted()>
	//   45  105:invokevirtual   #162 <Method void QuestionStep.setText(String)>
		questionstep.setOptional(question.isOptional());
	//   46  108:aload           4
	//   47  110:aload_0         
	//   48  111:invokevirtual   #165 <Method boolean Question.isOptional()>
	//   49  114:invokevirtual   #169 <Method void QuestionStep.setOptional(boolean)>
		_cls1..SwitchMap.com.pactforcure.app.survey.QuestionType[question.getQuestionType().ordinal()];
	//   50  117:getstatic       #172 <Field int[] SurveyAssembler$1.$SwitchMap$com$pactforcure$app$survey$QuestionType>
	//   51  120:aload_0         
	//   52  121:invokevirtual   #176 <Method QuestionType Question.getQuestionType()>
	//   53  124:invokevirtual   #179 <Method int QuestionType.ordinal()>
	//   54  127:iaload          
		JVM INSTR tableswitch 1 7: default 172
	//	               1 183
	//	               2 246
	//	               3 283
	//	               4 320
	//	               5 357
	//	               6 394
	//	               7 421;
	//   55  128:tableswitch     1 7: default 172
	//	               1 183
	//	               2 246
	//	               3 283
	//	               4 320
	//	               5 357
	//	               6 394
	//	               7 421
		   goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
		question = ((Question) (obj));
	//   56  172:aload_2         
	//   57  173:astore_0        
_L13:
		questionstep.setAnswerFormat(((org.researchstack.backbone.answerformat.AnswerFormat) (question)));
	//   58  174:aload           4
	//   59  176:aload_0         
	//   60  177:invokevirtual   #183 <Method void QuestionStep.setAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat)>
		return ((Step) (questionstep));
	//   61  180:aload           4
	//   62  182:areturn         
_L6:
		if(question.isNumberShowAsOrdinal())
	//*  63  183:aload_0         
	//*  64  184:invokevirtual   #186 <Method boolean Question.isNumberShowAsOrdinal()>
	//*  65  187:ifeq            227
		{
			question = ((Question) (question.buildNumericChoices()));
	//   66  190:aload_0         
	//   67  191:invokevirtual   #189 <Method List Question.buildNumericChoices()>
	//   68  194:astore_0        
			question = ((Question) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, (Choice[])((List) (question)).toArray(((Object []) (new Choice[((List) (question)).size()]))))));
	//   69  195:new             #191 <Class ChoiceAnswerFormat>
	//   70  198:dup             
	//   71  199:getstatic       #197 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//   72  202:aload_0         
	//   73  203:aload_0         
	//   74  204:invokeinterface #200 <Method int List.size()>
	//   75  209:anewarray       Choice[]
	//   76  212:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//   77  217:checkcast       #208 <Class Choice[]>
	//   78  220:invokespecial   #211 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//   79  223:astore_0        
		} else
	//*  80  224:goto            174
		{
			question = ((Question) (new IntegerAnswerFormat(question.getMin(), question.getMax())));
	//   81  227:new             #213 <Class IntegerAnswerFormat>
	//   82  230:dup             
	//   83  231:aload_0         
	//   84  232:invokevirtual   #216 <Method int Question.getMin()>
	//   85  235:aload_0         
	//   86  236:invokevirtual   #219 <Method int Question.getMax()>
	//   87  239:invokespecial   #222 <Method void IntegerAnswerFormat(int, int)>
	//   88  242:astore_0        
		}
		  goto _L13
	//*  89  243:goto            174
_L7:
		question = ((Question) (question.buildChoicesText()));
	//   90  246:aload_0         
	//   91  247:invokevirtual   #225 <Method List Question.buildChoicesText()>
	//   92  250:astore_0        
		question = ((Question) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, (Choice[])((List) (question)).toArray(((Object []) (new Choice[((List) (question)).size()]))))));
	//   93  251:new             #191 <Class ChoiceAnswerFormat>
	//   94  254:dup             
	//   95  255:getstatic       #197 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//   96  258:aload_0         
	//   97  259:aload_0         
	//   98  260:invokeinterface #200 <Method int List.size()>
	//   99  265:anewarray       Choice[]
	//  100  268:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//  101  273:checkcast       #208 <Class Choice[]>
	//  102  276:invokespecial   #211 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  103  279:astore_0        
		  goto _L13
	//* 104  280:goto            174
_L8:
		question = ((Question) (question.buildChoicesText()));
	//  105  283:aload_0         
	//  106  284:invokevirtual   #225 <Method List Question.buildChoicesText()>
	//  107  287:astore_0        
		question = ((Question) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.MultipleChoice, (Choice[])((List) (question)).toArray(((Object []) (new Choice[((List) (question)).size()]))))));
	//  108  288:new             #191 <Class ChoiceAnswerFormat>
	//  109  291:dup             
	//  110  292:getstatic       #228 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.MultipleChoice>
	//  111  295:aload_0         
	//  112  296:aload_0         
	//  113  297:invokeinterface #200 <Method int List.size()>
	//  114  302:anewarray       Choice[]
	//  115  305:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//  116  310:checkcast       #208 <Class Choice[]>
	//  117  313:invokespecial   #211 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  118  316:astore_0        
		  goto _L13
	//* 119  317:goto            174
_L9:
		question = ((Question) (question.buildBooleanChoices()));
	//  120  320:aload_0         
	//  121  321:invokevirtual   #231 <Method List Question.buildBooleanChoices()>
	//  122  324:astore_0        
		question = ((Question) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, (Choice[])((List) (question)).toArray(((Object []) (new Choice[((List) (question)).size()]))))));
	//  123  325:new             #191 <Class ChoiceAnswerFormat>
	//  124  328:dup             
	//  125  329:getstatic       #197 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  126  332:aload_0         
	//  127  333:aload_0         
	//  128  334:invokeinterface #200 <Method int List.size()>
	//  129  339:anewarray       Choice[]
	//  130  342:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//  131  347:checkcast       #208 <Class Choice[]>
	//  132  350:invokespecial   #211 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  133  353:astore_0        
		  goto _L13
	//* 134  354:goto            174
_L10:
		question = ((Question) (question.buildChoicesText()));
	//  135  357:aload_0         
	//  136  358:invokevirtual   #225 <Method List Question.buildChoicesText()>
	//  137  361:astore_0        
		question = ((Question) (new ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat.ChoiceAnswerStyle.SingleChoice, (Choice[])((List) (question)).toArray(((Object []) (new Choice[((List) (question)).size()]))))));
	//  138  362:new             #191 <Class ChoiceAnswerFormat>
	//  139  365:dup             
	//  140  366:getstatic       #197 <Field org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle.SingleChoice>
	//  141  369:aload_0         
	//  142  370:aload_0         
	//  143  371:invokeinterface #200 <Method int List.size()>
	//  144  376:anewarray       Choice[]
	//  145  379:invokeinterface #206 <Method Object[] List.toArray(Object[])>
	//  146  384:checkcast       #208 <Class Choice[]>
	//  147  387:invokespecial   #211 <Method void ChoiceAnswerFormat(org.researchstack.backbone.answerformat.AnswerFormat$ChoiceAnswerStyle, Choice[])>
	//  148  390:astore_0        
		  goto _L13
	//* 149  391:goto            174
_L11:
		question = ((Question) (new ScaleAnswerFormat(question.getMin(), question.getMax(), question.getMinimumValueDescription(), question.getMaximumValueDescription())));
	//  150  394:new             #233 <Class ScaleAnswerFormat>
	//  151  397:dup             
	//  152  398:aload_0         
	//  153  399:invokevirtual   #216 <Method int Question.getMin()>
	//  154  402:aload_0         
	//  155  403:invokevirtual   #219 <Method int Question.getMax()>
	//  156  406:aload_0         
	//  157  407:invokevirtual   #236 <Method String Question.getMinimumValueDescription()>
	//  158  410:aload_0         
	//  159  411:invokevirtual   #239 <Method String Question.getMaximumValueDescription()>
	//  160  414:invokespecial   #242 <Method void ScaleAnswerFormat(int, int, String, String)>
	//  161  417:astore_0        
		  goto _L13
	//* 162  418:goto            174
_L12:
		question = ((Question) (new TextAnswerFormat()));
	//  163  421:new             #244 <Class TextAnswerFormat>
	//  164  424:dup             
	//  165  425:invokespecial   #245 <Method void TextAnswerFormat()>
	//  166  428:astore_0        
		((TextAnswerFormat) (question)).setIsMultipleLines(true);
	//  167  429:aload_0         
	//  168  430:iconst_1        
	//  169  431:invokevirtual   #248 <Method void TextAnswerFormat.setIsMultipleLines(boolean)>
		  goto _L13
	//* 170  434:goto            174
_L3:
		return ((Step) (new InstructionStep(question.getQuestionCode(), s, question.getText())));
	//  171  437:new             #250 <Class InstructionStep>
	//  172  440:dup             
	//  173  441:aload_0         
	//  174  442:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//  175  445:aload_1         
	//  176  446:aload_0         
	//  177  447:invokevirtual   #253 <Method String Question.getText()>
	//  178  450:invokespecial   #256 <Method void InstructionStep(String, String, String)>
	//  179  453:areturn         
_L4:
		question = ((Question) (new InstructionStep(question.getQuestionCode(), s, question.getText())));
	//  180  454:new             #250 <Class InstructionStep>
	//  181  457:dup             
	//  182  458:aload_0         
	//  183  459:invokevirtual   #107 <Method String Question.getQuestionCode()>
	//  184  462:aload_1         
	//  185  463:aload_0         
	//  186  464:invokevirtual   #253 <Method String Question.getText()>
	//  187  467:invokespecial   #256 <Method void InstructionStep(String, String, String)>
	//  188  470:astore_0        
		((InstructionStep) (question)).setPositiveButtonTitleResId(0x7f080069);
	//  189  471:aload_0         
	//  190  472:ldc2            #257 <Int 0x7f080069>
	//  191  475:invokevirtual   #261 <Method void InstructionStep.setPositiveButtonTitleResId(int)>
		((InstructionStep) (question)).setAllowsBackNavigation(false);
	//  192  478:aload_0         
	//  193  479:iconst_0        
	//  194  480:invokevirtual   #264 <Method void InstructionStep.setAllowsBackNavigation(boolean)>
		return ((Step) (question));
	//  195  483:aload_0         
	//  196  484:areturn         
	}
}

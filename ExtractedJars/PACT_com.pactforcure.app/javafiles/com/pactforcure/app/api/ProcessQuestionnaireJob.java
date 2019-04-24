// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.birbit.android.jobqueue.*;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.core.message.SurveyCompletedMessage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.*;
import com.pactforcure.app.ui.OnPpdEndMessage;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

// Referenced classes of package com.pactforcure.app.api:
//			UploadSurveyResponsesJob

public class ProcessQuestionnaireJob extends Job
{

	public ProcessQuestionnaireJob(String s, boolean flag, boolean flag1)
	{
		super((new Params(1)).persist());
	//    0    0:aload_0         
	//    1    1:new             #13  <Class Params>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:invokespecial   #16  <Method void Params(int)>
	//    5    9:invokevirtual   #20  <Method Params Params.persist()>
	//    6   12:invokespecial   #23  <Method void Job(Params)>
		surveyCode = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field String surveyCode>
		uploadAtTheEnd = flag;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #27  <Field boolean uploadAtTheEnd>
		mayShowSuicidalityScreen = flag1;
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:putfield        #29  <Field boolean mayShowSuicidalityScreen>
	//   16   30:return          
	}

	private void processHealthEconomicsQuestionnaire(String s)
	{
		String s1 = Res.getStudyId().name();
	//    0    0:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//    1    3:invokevirtual   #44  <Method String StudyId.name()>
	//    2    6:astore_2        
		Map map = SurveyStorage.loadAnswers(s1, s);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokestatic    #50  <Method Map SurveyStorage.loadAnswers(String, String)>
	//    6   12:astore_3        
		BackboneApplication.get().getJobManager().addJobInBackground(((Job) (new UploadSurveyResponsesJob(map))));
	//    7   13:invokestatic    #56  <Method BackboneApplication BackboneApplication.get()>
	//    8   16:invokevirtual   #60  <Method JobManager BackboneApplication.getJobManager()>
	//    9   19:new             #62  <Class UploadSurveyResponsesJob>
	//   10   22:dup             
	//   11   23:aload_3         
	//   12   24:invokespecial   #65  <Method void UploadSurveyResponsesJob(Map)>
	//   13   27:invokevirtual   #71  <Method void JobManager.addJobInBackground(Job)>
		SurveyStorage.saveSurveyProgress(s1, s, ProgressStatus.Completed);
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:getstatic       #77  <Field ProgressStatus ProgressStatus.Completed>
	//   17   35:invokestatic    #81  <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		EventBus.getDefault().postSticky(((Object) (new SurveyCompletedMessage())));
	//   18   38:invokestatic    #87  <Method EventBus EventBus.getDefault()>
	//   19   41:new             #89  <Class SurveyCompletedMessage>
	//   20   44:dup             
	//   21   45:invokespecial   #92  <Method void SurveyCompletedMessage()>
	//   22   48:invokevirtual   #96  <Method void EventBus.postSticky(Object)>
	//   23   51:return          
	}

	private void processPpdQuestionnaire()
	{
		if(uploadAtTheEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean uploadAtTheEnd>
	//*   2    4:ifeq            21
			SurveyStorage.saveSurveyProgress(Res.getStudyId().name(), "PPD", ProgressStatus.Completed);
	//    3    7:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//    4   10:invokevirtual   #44  <Method String StudyId.name()>
	//    5   13:ldc1            #99  <String "PPD">
	//    6   15:getstatic       #77  <Field ProgressStatus ProgressStatus.Completed>
	//    7   18:invokestatic    #81  <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		Object obj1 = ((Object) (SurveyStorage.loadAnswers(Res.getStudyId().name(), "PPD")));
	//    8   21:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//    9   24:invokevirtual   #44  <Method String StudyId.name()>
	//   10   27:ldc1            #99  <String "PPD">
	//   11   29:invokestatic    #50  <Method Map SurveyStorage.loadAnswers(String, String)>
	//   12   32:astore          5
		Object obj2 = ((Object) (new PpdCalculator(((Map) (obj1)))));
	//   13   34:new             #101 <Class PpdCalculator>
	//   14   37:dup             
	//   15   38:aload           5
	//   16   40:invokespecial   #102 <Method void PpdCalculator(Map)>
	//   17   43:astore          6
		int i = ((PpdCalculator) (obj2)).score();
	//   18   45:aload           6
	//   19   47:invokevirtual   #106 <Method int PpdCalculator.score()>
	//   20   50:istore_1        
		boolean flag = ((PpdCalculator) (obj2)).ppdCase(i);
	//   21   51:aload           6
	//   22   53:iload_1         
	//   23   54:invokevirtual   #110 <Method boolean PpdCalculator.ppdCase(int)>
	//   24   57:istore_2        
		Object obj3 = ((Object) (QuestionType.QuestionTypeBooleanChoice));
	//   25   58:getstatic       #116 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//   26   61:astore          7
		String s = Res.getStudyId().name();
	//   27   63:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//   28   66:invokevirtual   #44  <Method String StudyId.name()>
	//   29   69:astore          8
		boolean flag1;
		Object obj;
		if(flag)
	//*  30   71:iload_2         
	//*  31   72:ifeq            356
			obj = "1";
	//   32   75:ldc1            #118 <String "1">
	//   33   77:astore          4
		else
	//*  34   79:aload           5
	//*  35   81:ldc1            #99  <String "PPD">
	//*  36   83:aload           7
	//*  37   85:new             #120 <Class Answer>
	//*  38   88:dup             
	//*  39   89:aload           8
	//*  40   91:ldc1            #99  <String "PPD">
	//*  41   93:ldc1            #122 <String "PPD_case">
	//*  42   95:aload           4
	//*  43   97:invokespecial   #125 <Method void Answer(String, String, String, String)>
	//*  44  100:invokestatic    #131 <Method void SurveyDelegate.insertOrUpdateAnswer(Map, String, QuestionType, Answer)>
	//*  45  103:aload           6
	//*  46  105:invokevirtual   #135 <Method boolean PpdCalculator.ppdPossible()>
	//*  47  108:istore_3        
	//*  48  109:getstatic       #116 <Field QuestionType QuestionType.QuestionTypeBooleanChoice>
	//*  49  112:astore          6
	//*  50  114:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//*  51  117:invokevirtual   #44  <Method String StudyId.name()>
	//*  52  120:astore          7
	//*  53  122:iload_3         
	//*  54  123:ifeq            363
	//*  55  126:ldc1            #118 <String "1">
	//*  56  128:astore          4
	//*  57  130:aload           5
	//*  58  132:ldc1            #99  <String "PPD">
	//*  59  134:aload           6
	//*  60  136:new             #120 <Class Answer>
	//*  61  139:dup             
	//*  62  140:aload           7
	//*  63  142:ldc1            #99  <String "PPD">
	//*  64  144:ldc1            #137 <String "PPP_possible">
	//*  65  146:aload           4
	//*  66  148:invokespecial   #125 <Method void Answer(String, String, String, String)>
	//*  67  151:invokestatic    #131 <Method void SurveyDelegate.insertOrUpdateAnswer(Map, String, QuestionType, Answer)>
	//*  68  154:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//*  69  157:astore          4
	//*  70  159:iload_2         
	//*  71  160:ifne            167
	//*  72  163:iload_3         
	//*  73  164:ifeq            370
	//*  74  167:iconst_1        
	//*  75  168:istore_2        
	//*  76  169:aload           4
	//*  77  171:iload_2         
	//*  78  172:invokestatic    #143 <Method void PpdResultsStorage.setEnableDnaModule(StudyId, boolean)>
	//*  79  175:aload_0         
	//*  80  176:getfield        #27  <Field boolean uploadAtTheEnd>
	//*  81  179:ifeq            200
	//*  82  182:invokestatic    #56  <Method BackboneApplication BackboneApplication.get()>
	//*  83  185:invokevirtual   #60  <Method JobManager BackboneApplication.getJobManager()>
	//*  84  188:new             #62  <Class UploadSurveyResponsesJob>
	//*  85  191:dup             
	//*  86  192:aload           5
	//*  87  194:invokespecial   #65  <Method void UploadSurveyResponsesJob(Map)>
	//*  88  197:invokevirtual   #71  <Method void JobManager.addJobInBackground(Job)>
	//*  89  200:aload           5
	//*  90  202:ldc1            #145 <String "suicidality">
	//*  91  204:invokeinterface #150 <Method Object Map.get(Object)>
	//*  92  209:checkcast       #120 <Class Answer>
	//*  93  212:astore          4
	//*  94  214:aload           4
	//*  95  216:ifnull          375
	//*  96  219:aload           4
	//*  97  221:invokevirtual   #153 <Method String Answer.getValue()>
	//*  98  224:ldc1            #118 <String "1">
	//*  99  226:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 100  229:ifeq            375
	//* 101  232:iconst_1        
	//* 102  233:istore_2        
	//* 103  234:iconst_0        
	//* 104  235:istore_3        
	//* 105  236:aconst_null     
	//* 106  237:astore          4
	//* 107  239:aload           5
	//* 108  241:ldc1            #161 <String "EPDS04b">
	//* 109  243:invokeinterface #150 <Method Object Map.get(Object)>
	//* 110  248:checkcast       #120 <Class Answer>
	//* 111  251:astore          6
	//* 112  253:aload           6
	//* 113  255:ifnull          269
	//* 114  258:aload           6
	//* 115  260:invokevirtual   #153 <Method String Answer.getValue()>
	//* 116  263:ldc1            #118 <String "1">
	//* 117  265:invokevirtual   #159 <Method boolean String.equals(Object)>
	//* 118  268:istore_3        
	//* 119  269:aload           5
	//* 120  271:ldc1            #163 <String "EPDS02">
	//* 121  273:invokeinterface #150 <Method Object Map.get(Object)>
	//* 122  278:checkcast       #120 <Class Answer>
	//* 123  281:astore          5
	//* 124  283:aload           5
	//* 125  285:ifnull          295
	//* 126  288:aload           5
	//* 127  290:invokevirtual   #153 <Method String Answer.getValue()>
	//* 128  293:astore          4
	//* 129  295:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//* 130  298:iload_1         
	//* 131  299:invokestatic    #167 <Method void PpdResultsStorage.setScore(StudyId, int)>
	//* 132  302:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//* 133  305:iload_3         
	//* 134  306:invokestatic    #170 <Method void PpdResultsStorage.saveCurrentSymptoms(StudyId, boolean)>
	//* 135  309:invokestatic    #38  <Method StudyId Res.getStudyId()>
	//* 136  312:aload           4
	//* 137  314:invokestatic    #174 <Method void PpdResultsStorage.saveWorstEpisode(StudyId, String)>
	//* 138  317:aload_0         
	//* 139  318:getfield        #29  <Field boolean mayShowSuicidalityScreen>
	//* 140  321:ifeq            342
	//* 141  324:invokestatic    #87  <Method EventBus EventBus.getDefault()>
	//* 142  327:new             #176 <Class OnPpdEndMessage>
	//* 143  330:dup             
	//* 144  331:iload_2         
	//* 145  332:iload_1         
	//* 146  333:iload_3         
	//* 147  334:aload           4
	//* 148  336:invokespecial   #179 <Method void OnPpdEndMessage(boolean, int, boolean, String)>
	//* 149  339:invokevirtual   #96  <Method void EventBus.postSticky(Object)>
	//* 150  342:invokestatic    #87  <Method EventBus EventBus.getDefault()>
	//* 151  345:new             #89  <Class SurveyCompletedMessage>
	//* 152  348:dup             
	//* 153  349:invokespecial   #92  <Method void SurveyCompletedMessage()>
	//* 154  352:invokevirtual   #96  <Method void EventBus.postSticky(Object)>
	//* 155  355:return          
			obj = "0";
	//  156  356:ldc1            #181 <String "0">
	//  157  358:astore          4
		SurveyDelegate.insertOrUpdateAnswer(((Map) (obj1)), "PPD", ((QuestionType) (obj3)), new Answer(s, "PPD", "PPD_case", ((String) (obj))));
		flag1 = ((PpdCalculator) (obj2)).ppdPossible();
		obj2 = ((Object) (QuestionType.QuestionTypeBooleanChoice));
		obj3 = ((Object) (Res.getStudyId().name()));
		if(flag1)
			obj = "1";
		else
	//* 158  360:goto            79
			obj = "0";
	//  159  363:ldc1            #181 <String "0">
	//  160  365:astore          4
		SurveyDelegate.insertOrUpdateAnswer(((Map) (obj1)), "PPD", ((QuestionType) (obj2)), new Answer(((String) (obj3)), "PPD", "PPP_possible", ((String) (obj))));
		obj = ((Object) (Res.getStudyId()));
		if(flag || flag1)
			flag = true;
		else
	//* 161  367:goto            130
			flag = false;
	//  162  370:iconst_0        
	//  163  371:istore_2        
		PpdResultsStorage.setEnableDnaModule(((StudyId) (obj)), flag);
		if(uploadAtTheEnd)
			BackboneApplication.get().getJobManager().addJobInBackground(((Job) (new UploadSurveyResponsesJob(((Map) (obj1))))));
		obj = ((Object) ((Answer)((Map) (obj1)).get("suicidality")));
		if(obj != null && ((Answer) (obj)).getValue().equals("1"))
			flag = true;
		else
	//* 164  372:goto            169
			flag = false;
	//  165  375:iconst_0        
	//  166  376:istore_2        
		flag1 = false;
		obj = null;
		obj2 = ((Object) ((Answer)((Map) (obj1)).get("EPDS04b")));
		if(obj2 != null)
			flag1 = ((Answer) (obj2)).getValue().equals("1");
		obj1 = ((Object) ((Answer)((Map) (obj1)).get("EPDS02")));
		if(obj1 != null)
			obj = ((Object) (((Answer) (obj1)).getValue()));
		PpdResultsStorage.setScore(Res.getStudyId(), i);
		PpdResultsStorage.saveCurrentSymptoms(Res.getStudyId(), flag1);
		PpdResultsStorage.saveWorstEpisode(Res.getStudyId(), ((String) (obj)));
		if(mayShowSuicidalityScreen)
			EventBus.getDefault().postSticky(((Object) (new OnPpdEndMessage(flag, i, flag1, ((String) (obj))))));
		EventBus.getDefault().postSticky(((Object) (new SurveyCompletedMessage())));
	//* 167  377:goto            234
	}

	public void onAdded()
	{
	//    0    0:return          
	}

	protected void onCancel(int i, Throwable throwable)
	{
	//    0    0:return          
	}

	public void onRun()
		throws Throwable
	{
		byte byte0;
		String s;
		s = surveyCode;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String surveyCode>
	//    2    4:astore_2        
		byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_1        
		s.hashCode();
	//    5    7:aload_2         
	//    6    8:invokevirtual   #192 <Method int String.hashCode()>
		JVM INSTR lookupswitch 5: default 60
	//	               -706907381: 111
	//	               -706719882: 125
	//	               -706719727: 139
	//	               -706404705: 153
	//	               79428: 97;
	//    7   11:lookupswitch    5: default 60
	//	               -706907381: 111
	//	               -706719882: 125
	//	               -706719727: 139
	//	               -706404705: 153
	//	               79428: 97
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_153;
_L7:
		switch(byte0)
	//*   8   60:iload_1         
		{
	//*   9   61:tableswitch     0 4: default 96
	//	               0 167
	//	               1 172
	//	               2 172
	//	               3 172
	//	               4 172
		default:
			return;
	//   10   96:return          

	//*  11   97:aload_2         
	//*  12   98:ldc1            #99  <String "PPD">
	//*  13  100:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  14  103:ifeq            60
	//*  15  106:iconst_0        
	//*  16  107:istore_1        
	//*  17  108:goto            60
	//*  18  111:aload_2         
	//*  19  112:ldc1            #194 <String "HealthEconomics-BIMF">
	//*  20  114:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  21  117:ifeq            60
	//*  22  120:iconst_1        
	//*  23  121:istore_1        
	//*  24  122:goto            60
	//*  25  125:aload_2         
	//*  26  126:ldc1            #196 <String "HealthEconomics-HRPQ">
	//*  27  128:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  28  131:ifeq            60
	//*  29  134:iconst_2        
	//*  30  135:istore_1        
	//*  31  136:goto            60
	//*  32  139:aload_2         
	//*  33  140:ldc1            #198 <String "HealthEconomics-HRUQ">
	//*  34  142:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  35  145:ifeq            60
	//*  36  148:iconst_3        
	//*  37  149:istore_1        
	//*  38  150:goto            60
	//*  39  153:aload_2         
	//*  40  154:ldc1            #200 <String "HealthEconomics-SF12">
	//*  41  156:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  42  159:ifeq            60
	//*  43  162:iconst_4        
	//*  44  163:istore_1        
	//*  45  164:goto            60
		case 0: // '\0'
			processPpdQuestionnaire();
	//   46  167:aload_0         
	//   47  168:invokespecial   #202 <Method void processPpdQuestionnaire()>
			return;
	//   48  171:return          

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			processHealthEconomicsQuestionnaire(surveyCode);
	//   49  172:aload_0         
	//   50  173:aload_0         
	//   51  174:getfield        #25  <Field String surveyCode>
	//   52  177:invokespecial   #204 <Method void processHealthEconomicsQuestionnaire(String)>
			break;
		}
		break MISSING_BLOCK_LABEL_180;
_L6:
		if(s.equals("PPD"))
			byte0 = 0;
		  goto _L7
_L2:
		if(s.equals("HealthEconomics-BIMF"))
			byte0 = 1;
		  goto _L7
_L3:
		if(s.equals("HealthEconomics-HRPQ"))
			byte0 = 2;
		  goto _L7
_L4:
		if(s.equals("HealthEconomics-HRUQ"))
			byte0 = 3;
		  goto _L7
		if(s.equals("HealthEconomics-SF12"))
			byte0 = 4;
		  goto _L7
	//   53  180:return          
	}

	protected RetryConstraint shouldReRunOnThrowable(Throwable throwable, int i, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final boolean mayShowSuicidalityScreen;
	private final String surveyCode;
	private final boolean uploadAtTheEnd;
}

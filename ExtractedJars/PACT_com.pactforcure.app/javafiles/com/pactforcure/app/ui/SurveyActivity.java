// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.*;
import android.widget.TextView;
import com.pactforcure.app.consent.GeneralConsentTask;
import com.pactforcure.app.consent.GeneralConsentTuple;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.*;
import java.util.*;
import org.json.simple.parser.ParseException;
import org.researchstack.backbone.model.ConsentDocument;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.step.Step;
import org.researchstack.backbone.ui.ViewTaskActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

// Referenced classes of package com.pactforcure.app.ui:
//			DemographicsFormActivity, LandingActivity

public class SurveyActivity extends AppCompatActivity
{

	public SurveyActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	private void displayFailureMessage(String s)
	{
		findViewById(0x7f0e0112).setVisibility(0);
	//    0    0:aload_0         
	//    1    1:ldc1            #53  <Int 0x7f0e0112>
	//    2    3:invokevirtual   #57  <Method View findViewById(int)>
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #63  <Method void View.setVisibility(int)>
		String s1 = getFailureTitle(s);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #67  <Method String getFailureTitle(String)>
	//    8   15:astore_2        
		s = getFailureText(s);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokespecial   #70  <Method String getFailureText(String)>
	//   12   21:astore_1        
		((TextView)findViewById(0x7f0e0113)).setText(((CharSequence) (s)));
	//   13   22:aload_0         
	//   14   23:ldc1            #71  <Int 0x7f0e0113>
	//   15   25:invokevirtual   #57  <Method View findViewById(int)>
	//   16   28:checkcast       #73  <Class TextView>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
		toolbar.setTitle(((CharSequence) (s1)));
	//   19   35:aload_0         
	//   20   36:getfield        #79  <Field Toolbar toolbar>
	//   21   39:aload_2         
	//   22   40:invokevirtual   #84  <Method void Toolbar.setTitle(CharSequence)>
	//   23   43:return          
	}

	private String getFailureText(String s)
	{
		return Res.getRegularString((new StringBuilder()).append(s).append("_text").toString());
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #93  <String "_text">
	//    6   13:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #97  <Method String StringBuilder.toString()>
	//    8   19:invokestatic    #102 <Method String Res.getRegularString(String)>
	//    9   22:areturn         
	}

	private String getFailureTitle(String s)
	{
		return Res.getRegularString((new StringBuilder()).append(s).append("_title").toString());
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #104 <String "_title">
	//    6   13:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #97  <Method String StringBuilder.toString()>
	//    8   19:invokestatic    #102 <Method String Res.getRegularString(String)>
	//    9   22:areturn         
	}

	public static void globalVariableWasUpdated(String s, Map map, Map map1, SurveyTask surveytask, List list)
	{
		s = surveytask.getCurrentStep().getIdentifier();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #112 <Method Step SurveyTask.getCurrentStep()>
	//    2    4:invokevirtual   #117 <Method String Step.getIdentifier()>
	//    3    7:astore_0        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          7
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
label0:
		do
		{
label1:
			{
				int j = ((int) (flag));
	//    8   14:iload           7
	//    9   16:istore          6
				if(i < list.size())
	//*  10   18:iload           5
	//*  11   20:aload           4
	//*  12   22:invokeinterface #123 <Method int List.size()>
	//*  13   27:icmpge          56
				{
					if(!((Step)list.get(i)).getIdentifier().equals(((Object) (s))))
						break label1;
	//   14   30:aload           4
	//   15   32:iload           5
	//   16   34:invokeinterface #127 <Method Object List.get(int)>
	//   17   39:checkcast       #114 <Class Step>
	//   18   42:invokevirtual   #117 <Method String Step.getIdentifier()>
	//   19   45:aload_0         
	//   20   46:invokevirtual   #133 <Method boolean String.equals(Object)>
	//   21   49:ifeq            111
					j = i;
	//   22   52:iload           5
	//   23   54:istore          6
				}
				for(i = j + 1; i < list.size(); i++)
	//*  24   56:iload           6
	//*  25   58:iconst_1        
	//*  26   59:iadd            
	//*  27   60:istore          5
	//*  28   62:iload           5
	//*  29   64:aload           4
	//*  30   66:invokeinterface #123 <Method int List.size()>
	//*  31   71:icmpge          120
				{
					s = ((String) ((Step)list.get(i)));
	//   32   74:aload           4
	//   33   76:iload           5
	//   34   78:invokeinterface #127 <Method Object List.get(int)>
	//   35   83:checkcast       #114 <Class Step>
	//   36   86:astore_0        
					((Step) (s)).resetToInitialState();
	//   37   87:aload_0         
	//   38   88:invokevirtual   #136 <Method void Step.resetToInitialState()>
					map1.remove(((Object) (((Step) (s)).getIdentifier())));
	//   39   91:aload_2         
	//   40   92:aload_0         
	//   41   93:invokevirtual   #117 <Method String Step.getIdentifier()>
	//   42   96:invokeinterface #142 <Method Object Map.remove(Object)>
	//   43  101:pop             
				}

	//   44  102:iload           5
	//   45  104:iconst_1        
	//   46  105:iadd            
	//   47  106:istore          5
				break label0;
	//   48  108:goto            62
			}
			i++;
	//   49  111:iload           5
	//   50  113:iconst_1        
	//   51  114:iadd            
	//   52  115:istore          5
		} while(true);
	//   53  117:goto            14
	//   54  120:return          
	}

	private void goToInformedConsent()
	{
		GeneralConsentTuple generalconsenttuple = GeneralConsentTask.buildConsentTask();
	//    0    0:invokestatic    #151 <Method GeneralConsentTuple GeneralConsentTask.buildConsentTask()>
	//    1    3:astore_1        
		consentDocument = generalconsenttuple.consentDocument;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #155 <Field ConsentDocument GeneralConsentTuple.consentDocument>
	//    5    9:putfield        #156 <Field ConsentDocument consentDocument>
		startActivityForResult(ViewTaskActivity.newIntent(((Context) (this)), ((org.researchstack.backbone.task.Task) (generalconsenttuple.generalConsentTask))), 2);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #160 <Field GeneralConsentTask GeneralConsentTuple.generalConsentTask>
	//   10   18:invokestatic    #166 <Method Intent ViewTaskActivity.newIntent(Context, org.researchstack.backbone.task.Task)>
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #170 <Method void startActivityForResult(Intent, int)>
	//   13   25:return          
	}

	private void initWithSurvey(Survey survey)
		throws SurveyDataException
	{
		if(survey.getQuestions().size() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #180 <Method List Survey.getQuestions()>
	//*   2    4:invokeinterface #123 <Method int List.size()>
	//*   3    9:ifne            35
		{
			Log.d("SurveyActivity", String.format("Survey %s has no questions", new Object[] {
				survey.getCode()
			}));
	//    4   12:ldc1            #29  <String "SurveyActivity">
	//    5   14:ldc1            #182 <String "Survey %s has no questions">
	//    6   16:iconst_1        
	//    7   17:anewarray       Object[]
	//    8   20:dup             
	//    9   21:iconst_0        
	//   10   22:aload_1         
	//   11   23:invokevirtual   #187 <Method String Survey.getCode()>
	//   12   26:aastore         
	//   13   27:invokestatic    #191 <Method String String.format(String, Object[])>
	//   14   30:invokestatic    #197 <Method int Log.d(String, String)>
	//   15   33:pop             
			return;
	//   16   34:return          
		}
		Map map = SurveyStorage.loadAnswers(Res.getStudyId().name(), survey.getCode());
	//   17   35:invokestatic    #201 <Method StudyId Res.getStudyId()>
	//   18   38:invokevirtual   #206 <Method String StudyId.name()>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #187 <Method String Survey.getCode()>
	//   21   45:invokestatic    #212 <Method Map SurveyStorage.loadAnswers(String, String)>
	//   22   48:astore_2        
		Map map1 = SurveyAssembler.initializeGlobalVariables(survey, map);
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:invokestatic    #218 <Method Map SurveyAssembler.initializeGlobalVariables(Survey, Map)>
	//   26   54:astore_3        
		stepList = new ArrayList();
	//   27   55:aload_0         
	//   28   56:new             #220 <Class ArrayList>
	//   29   59:dup             
	//   30   60:invokespecial   #221 <Method void ArrayList()>
	//   31   63:putfield        #223 <Field ArrayList stepList>
		Iterator iterator = survey.getQuestions().iterator();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #180 <Method List Survey.getQuestions()>
	//   34   70:invokeinterface #227 <Method Iterator List.iterator()>
	//   35   75:astore          4
		while(iterator.hasNext()) 
	//*  36   77:aload           4
	//*  37   79:invokeinterface #233 <Method boolean Iterator.hasNext()>
	//*  38   84:ifeq            190
		{
			Object obj = ((Object) ((Question)iterator.next()));
	//   39   87:aload           4
	//   40   89:invokeinterface #237 <Method Object Iterator.next()>
	//   41   94:checkcast       #239 <Class Question>
	//   42   97:astore          6
			((Question) (obj)).replaceTitleVariables(map1);
	//   43   99:aload           6
	//   44  101:aload_3         
	//   45  102:invokevirtual   #243 <Method void Question.replaceTitleVariables(Map)>
			Step step = SurveyAssembler.stepForQuestion(((Question) (obj)));
	//   46  105:aload           6
	//   47  107:invokestatic    #247 <Method Step SurveyAssembler.stepForQuestion(Question)>
	//   48  110:astore          5
			obj = ((Object) (((Question) (obj)).getTitle()));
	//   49  112:aload           6
	//   50  114:invokevirtual   #250 <Method String Question.getTitle()>
	//   51  117:astore          6
			if(((String) (obj)).equals("<EMPTY>"))
	//*  52  119:aload           6
	//*  53  121:ldc1            #252 <String "<EMPTY>">
	//*  54  123:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  55  126:ifeq            149
				step.setStepTitle(0x7f080376);
	//   56  129:aload           5
	//   57  131:ldc1            #253 <Int 0x7f080376>
	//   58  133:invokevirtual   #256 <Method void Step.setStepTitle(int)>
			else
	//*  59  136:aload_0         
	//*  60  137:getfield        #223 <Field ArrayList stepList>
	//*  61  140:aload           5
	//*  62  142:invokevirtual   #259 <Method boolean ArrayList.add(Object)>
	//*  63  145:pop             
	//*  64  146:goto            77
			if(((String) (obj)).length() == 0)
	//*  65  149:aload           6
	//*  66  151:invokevirtual   #262 <Method int String.length()>
	//*  67  154:ifne            136
				step.setStepTitle(Res.getStudySpecificStringId((new StringBuilder()).append(survey.getCode()).append("_title").toString()));
	//   68  157:aload           5
	//   69  159:new             #86  <Class StringBuilder>
	//   70  162:dup             
	//   71  163:invokespecial   #87  <Method void StringBuilder()>
	//   72  166:aload_1         
	//   73  167:invokevirtual   #187 <Method String Survey.getCode()>
	//   74  170:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   75  173:ldc1            #104 <String "_title">
	//   76  175:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   77  178:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   78  181:invokestatic    #266 <Method int Res.getStudySpecificStringId(String)>
	//   79  184:invokevirtual   #256 <Method void Step.setStepTitle(int)>
			stepList.add(((Object) (step)));
		}
	//*  80  187:goto            136
		surveyCallbacks = new SurveyDelegate(survey.getCode(), surveyTask, map1, map, ((List) (stepList)));
	//   81  190:aload_0         
	//   82  191:new             #268 <Class SurveyDelegate>
	//   83  194:dup             
	//   84  195:aload_1         
	//   85  196:invokevirtual   #187 <Method String Survey.getCode()>
	//   86  199:aload_0         
	//   87  200:getfield        #270 <Field SurveyTask surveyTask>
	//   88  203:aload_3         
	//   89  204:aload_2         
	//   90  205:aload_0         
	//   91  206:getfield        #223 <Field ArrayList stepList>
	//   92  209:invokespecial   #273 <Method void SurveyDelegate(String, SurveyTask, Map, Map, List)>
	//   93  212:putfield        #275 <Field SurveyDelegate surveyCallbacks>
		surveyTask = SurveyTaskFactory.newSurveyTask(survey, stepList, map1, map, surveyCallbacks);
	//   94  215:aload_0         
	//   95  216:aload_1         
	//   96  217:aload_0         
	//   97  218:getfield        #223 <Field ArrayList stepList>
	//   98  221:aload_3         
	//   99  222:aload_2         
	//  100  223:aload_0         
	//  101  224:getfield        #275 <Field SurveyDelegate surveyCallbacks>
	//  102  227:invokestatic    #281 <Method SurveyTask SurveyTaskFactory.newSurveyTask(Survey, ArrayList, Map, Map, SurveyDelegate)>
	//  103  230:putfield        #270 <Field SurveyTask surveyTask>
		surveyCallbacks.setSurveyTask(surveyTask);
	//  104  233:aload_0         
	//  105  234:getfield        #275 <Field SurveyDelegate surveyCallbacks>
	//  106  237:aload_0         
	//  107  238:getfield        #270 <Field SurveyTask surveyTask>
	//  108  241:invokevirtual   #285 <Method void SurveyDelegate.setSurveyTask(SurveyTask)>
		startActivityForResult(ViewTaskActivity.newIntent(((Context) (this)), ((org.researchstack.backbone.task.Task) (surveyTask))), surveyCodeToRequestCode(survey.getCode()));
	//  109  244:aload_0         
	//  110  245:aload_0         
	//  111  246:aload_0         
	//  112  247:getfield        #270 <Field SurveyTask surveyTask>
	//  113  250:invokestatic    #166 <Method Intent ViewTaskActivity.newIntent(Context, org.researchstack.backbone.task.Task)>
	//  114  253:aload_0         
	//  115  254:aload_1         
	//  116  255:invokevirtual   #187 <Method String Survey.getCode()>
	//  117  258:invokespecial   #288 <Method int surveyCodeToRequestCode(String)>
	//  118  261:invokevirtual   #170 <Method void startActivityForResult(Intent, int)>
	//  119  264:return          
	}

	private void initWithSurveyId(int i)
	{
		initWithSurvey(SurveyLoader.fromSurveyCode(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #300 <Method Survey SurveyLoader.fromSurveyCode(int)>
	//    3    5:invokespecial   #302 <Method void initWithSurvey(Survey)>
		return;
	//    4    8:return          
		Object obj;
		obj;
	//    5    9:astore_2        
_L2:
		Log.e("SurveyActivity", "Couldn't load ppdSurvey");
	//    6   10:ldc1            #29  <String "SurveyActivity">
	//    7   12:ldc2            #304 <String "Couldn't load ppdSurvey">
	//    8   15:invokestatic    #307 <Method int Log.e(String, String)>
	//    9   18:pop             
		Log.e("SurveyActivity", Log.getStackTraceString(((Throwable) (obj))));
	//   10   19:ldc1            #29  <String "SurveyActivity">
	//   11   21:aload_2         
	//   12   22:invokestatic    #311 <Method String Log.getStackTraceString(Throwable)>
	//   13   25:invokestatic    #307 <Method int Log.e(String, String)>
	//   14   28:pop             
		finish();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #314 <Method void finish()>
		return;
	//   17   33:return          
		obj;
	//   18   34:astore_2        
		continue; /* Loop/switch isn't completed */
	//   19   35:goto            10
		obj;
	//   20   38:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  21   39:goto            10
	}

	private void processEligibilityQuizResult(TaskResult taskresult)
	{
		String s = ResultFailureConditionInjector.extractFailure(taskresult);
	//    0    0:aload_1         
	//    1    1:invokestatic    #322 <Method String ResultFailureConditionInjector.extractFailure(TaskResult)>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
		{
			failedInTheEligibilityQuiz = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #324 <Field boolean failedInTheEligibilityQuiz>
			supportInvalidateOptionsMenu();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #327 <Method void supportInvalidateOptionsMenu()>
			displayFailureMessage(s);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokespecial   #329 <Method void displayFailureMessage(String)>
			return;
	//   13   23:return          
		} else
		{
			ParticipantStorage.saveParticipant(Participant.fromEligibility(taskresult));
	//   14   24:aload_1         
	//   15   25:invokestatic    #335 <Method Participant Participant.fromEligibility(TaskResult)>
	//   16   28:invokestatic    #341 <Method void ParticipantStorage.saveParticipant(Participant)>
			return;
	//   17   31:return          
		}
	}

	private void processGeneralConsent(Intent intent)
	{
		intent = ((Intent) ((String)((TaskResult)intent.getSerializableExtra("ViewTaskActivity.ExtraTaskResult")).getStepResult("signature_consent_identifier").getResults().get("ConsentSignatureStep.Signature")));
	//    0    0:aload_1         
	//    1    1:ldc2            #345 <String "ViewTaskActivity.ExtraTaskResult">
	//    2    4:invokevirtual   #351 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    7:checkcast       #353 <Class TaskResult>
	//    4   10:ldc2            #355 <String "signature_consent_identifier">
	//    5   13:invokevirtual   #359 <Method StepResult TaskResult.getStepResult(String)>
	//    6   16:invokevirtual   #365 <Method Map StepResult.getResults()>
	//    7   19:ldc2            #367 <String "ConsentSignatureStep.Signature">
	//    8   22:invokeinterface #369 <Method Object Map.get(Object)>
	//    9   27:checkcast       #129 <Class String>
	//   10   30:astore_1        
		Participant participant = ParticipantStorage.getParticipant();
	//   11   31:invokestatic    #373 <Method Participant ParticipantStorage.getParticipant()>
	//   12   34:astore_2        
		participant.setSignedPDF(new Date());
	//   13   35:aload_2         
	//   14   36:new             #375 <Class Date>
	//   15   39:dup             
	//   16   40:invokespecial   #376 <Method void Date()>
	//   17   43:invokevirtual   #380 <Method void Participant.setSignedPDF(Date)>
		participant.setBase64Signature(((String) (intent)));
	//   18   46:aload_2         
	//   19   47:aload_1         
	//   20   48:invokevirtual   #383 <Method void Participant.setBase64Signature(String)>
		participant.save();
	//   21   51:aload_2         
	//   22   52:invokevirtual   #386 <Method void Participant.save()>
		intent = new Intent(((Context) (this)), com/pactforcure/app/ui/DemographicsFormActivity);
	//   23   55:new             #347 <Class Intent>
	//   24   58:dup             
	//   25   59:aload_0         
	//   26   60:ldc2            #388 <Class DemographicsFormActivity>
	//   27   63:invokespecial   #391 <Method void Intent(Context, Class)>
	//   28   66:astore_1        
		intent.putExtra("consentDocument", ((java.io.Serializable) (consentDocument)));
	//   29   67:aload_1         
	//   30   68:ldc2            #392 <String "consentDocument">
	//   31   71:aload_0         
	//   32   72:getfield        #156 <Field ConsentDocument consentDocument>
	//   33   75:invokevirtual   #396 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   34   78:pop             
		startActivityForResult(intent, 4);
	//   35   79:aload_0         
	//   36   80:aload_1         
	//   37   81:iconst_4        
	//   38   82:invokevirtual   #170 <Method void startActivityForResult(Intent, int)>
		finish();
	//   39   85:aload_0         
	//   40   86:invokevirtual   #314 <Method void finish()>
	//   41   89:return          
	}

	private static String requestCodeToSurveyCode(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 8: default 40
	//	               3 44
	//	               4 40
	//	               5 48
	//	               6 52
	//	               7 56
	//	               8 60
		case 4: // '\004'
		default:
			return "";
	//    2   40:ldc2            #400 <String "">
	//    3   43:areturn         

		case 3: // '\003'
			return "PPD";
	//    4   44:ldc2            #402 <String "PPD">
	//    5   47:areturn         

		case 5: // '\005'
			return "HealthEconomics-BIMF";
	//    6   48:ldc2            #404 <String "HealthEconomics-BIMF">
	//    7   51:areturn         

		case 6: // '\006'
			return "HealthEconomics-HRPQ";
	//    8   52:ldc2            #406 <String "HealthEconomics-HRPQ">
	//    9   55:areturn         

		case 7: // '\007'
			return "HealthEconomics-HRUQ";
	//   10   56:ldc2            #408 <String "HealthEconomics-HRUQ">
	//   11   59:areturn         

		case 8: // '\b'
			return "HealthEconomics-SF12";
	//   12   60:ldc2            #410 <String "HealthEconomics-SF12">
	//   13   63:areturn         
		}
	}

	private int surveyCodeToRequestCode(String s)
	{
		byte byte0;
		byte byte1;
		byte1 = 3;
	//    0    0:iconst_3        
	//    1    1:istore_3        
		byte0 = -1;
	//    2    2:iconst_m1       
	//    3    3:istore_2        
		s.hashCode();
	//    4    4:aload_1         
	//    5    5:invokevirtual   #413 <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 68
	//	               -706907381: 149
	//	               -706719882: 164
	//	               -706719727: 179
	//	               -706404705: 194
	//	               79428: 119
	//	               737020781: 134;
	//    6    8:lookupswitch    6: default 68
	//	               -706907381: 149
	//	               -706719882: 164
	//	               -706719727: 179
	//	               -706404705: 194
	//	               79428: 119
	//	               737020781: 134
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_194;
_L8:
		switch(byte0)
	//*   7   68:iload_2         
		{
	//*   8   69:tableswitch     0 5: default 108
	//	               0 211
	//	               1 209
	//	               2 213
	//	               3 215
	//	               4 218
	//	               5 221
		default:
			throw new SurveyDataException("this ppdSurvey has no reserved request code");
	//    9  108:new             #174 <Class SurveyDataException>
	//   10  111:dup             
	//   11  112:ldc2            #415 <String "this ppdSurvey has no reserved request code">
	//   12  115:invokespecial   #417 <Method void SurveyDataException(String)>
	//   13  118:athrow          

	//*  14  119:aload_1         
	//*  15  120:ldc2            #402 <String "PPD">
	//*  16  123:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  17  126:ifeq            68
	//*  18  129:iconst_0        
	//*  19  130:istore_2        
	//*  20  131:goto            68
	//*  21  134:aload_1         
	//*  22  135:ldc2            #419 <String "Eligibility">
	//*  23  138:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  24  141:ifeq            68
	//*  25  144:iconst_1        
	//*  26  145:istore_2        
	//*  27  146:goto            68
	//*  28  149:aload_1         
	//*  29  150:ldc2            #404 <String "HealthEconomics-BIMF">
	//*  30  153:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  31  156:ifeq            68
	//*  32  159:iconst_2        
	//*  33  160:istore_2        
	//*  34  161:goto            68
	//*  35  164:aload_1         
	//*  36  165:ldc2            #406 <String "HealthEconomics-HRPQ">
	//*  37  168:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  38  171:ifeq            68
	//*  39  174:iconst_3        
	//*  40  175:istore_2        
	//*  41  176:goto            68
	//*  42  179:aload_1         
	//*  43  180:ldc2            #408 <String "HealthEconomics-HRUQ">
	//*  44  183:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  45  186:ifeq            68
	//*  46  189:iconst_4        
	//*  47  190:istore_2        
	//*  48  191:goto            68
	//*  49  194:aload_1         
	//*  50  195:ldc2            #410 <String "HealthEconomics-SF12">
	//*  51  198:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  52  201:ifeq            68
	//*  53  204:iconst_5        
	//*  54  205:istore_2        
	//*  55  206:goto            68
		case 1: // '\001'
			byte1 = 1;
	//   56  209:iconst_1        
	//   57  210:istore_3        
			// fall through

		case 0: // '\0'
			return ((int) (byte1));
	//   58  211:iload_3         
	//   59  212:ireturn         

		case 2: // '\002'
			return 5;
	//   60  213:iconst_5        
	//   61  214:ireturn         

		case 3: // '\003'
			return 6;
	//   62  215:bipush          6
	//   63  217:ireturn         

		case 4: // '\004'
			return 7;
	//   64  218:bipush          7
	//   65  220:ireturn         

		case 5: // '\005'
			return 8;
	//   66  221:bipush          8
	//   67  223:ireturn         
		}
_L6:
		if(s.equals("PPD"))
			byte0 = 0;
		  goto _L8
_L7:
		if(s.equals("Eligibility"))
			byte0 = 1;
		  goto _L8
_L2:
		if(s.equals("HealthEconomics-BIMF"))
			byte0 = 2;
		  goto _L8
_L3:
		if(s.equals("HealthEconomics-HRPQ"))
			byte0 = 3;
		  goto _L8
_L4:
		if(s.equals("HealthEconomics-HRUQ"))
			byte0 = 4;
		  goto _L8
		if(s.equals("HealthEconomics-SF12"))
			byte0 = 5;
		  goto _L8
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #427 <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #429 <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if(i == 1 && j == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          36
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          36
		{
			processEligibilityQuizResult((TaskResult)intent.getSerializableExtra("ViewTaskActivity.ExtraTaskResult"));
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:ldc2            #345 <String "ViewTaskActivity.ExtraTaskResult">
	//    9   15:invokevirtual   #351 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   10   18:checkcast       #353 <Class TaskResult>
	//   11   21:invokespecial   #433 <Method void processEligibilityQuizResult(TaskResult)>
			if(!failedInTheEligibilityQuiz)
	//*  12   24:aload_0         
	//*  13   25:getfield        #324 <Field boolean failedInTheEligibilityQuiz>
	//*  14   28:ifne            35
				goToInformedConsent();
	//   15   31:aload_0         
	//   16   32:invokespecial   #435 <Method void goToInformedConsent()>
			return;
	//   17   35:return          
		}
		if(i == 2 && j == -1)
	//*  18   36:iload_1         
	//*  19   37:iconst_2        
	//*  20   38:icmpne          52
	//*  21   41:iload_2         
	//*  22   42:iconst_m1       
	//*  23   43:icmpne          52
		{
			processGeneralConsent(intent);
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:invokespecial   #437 <Method void processGeneralConsent(Intent)>
			return;
	//   27   51:return          
		}
		if(i == 2 && j == 0)
	//*  28   52:iload_1         
	//*  29   53:iconst_2        
	//*  30   54:icmpne          92
	//*  31   57:iload_2         
	//*  32   58:ifne            92
		{
			intent = new Intent(((Context) (this)), com/pactforcure/app/ui/LandingActivity);
	//   33   61:new             #347 <Class Intent>
	//   34   64:dup             
	//   35   65:aload_0         
	//   36   66:ldc2            #439 <Class LandingActivity>
	//   37   69:invokespecial   #391 <Method void Intent(Context, Class)>
	//   38   72:astore_3        
			intent.putExtra("reasonExtra", 0);
	//   39   73:aload_3         
	//   40   74:ldc2            #441 <String "reasonExtra">
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #444 <Method Intent Intent.putExtra(String, int)>
	//   43   81:pop             
			startActivity(intent);
	//   44   82:aload_0         
	//   45   83:aload_3         
	//   46   84:invokevirtual   #447 <Method void startActivity(Intent)>
			finish();
	//   47   87:aload_0         
	//   48   88:invokevirtual   #314 <Method void finish()>
			return;
	//   49   91:return          
		}
		if(i == 3 && j == -1)
	//*  50   92:iload_1         
	//*  51   93:iconst_3        
	//*  52   94:icmpne          113
	//*  53   97:iload_2         
	//*  54   98:iconst_m1       
	//*  55   99:icmpne          113
		{
			setResult(-2);
	//   56  102:aload_0         
	//   57  103:bipush          -2
	//   58  105:invokevirtual   #450 <Method void setResult(int)>
			finish();
	//   59  108:aload_0         
	//   60  109:invokevirtual   #314 <Method void finish()>
			return;
	//   61  112:return          
		}
		if(i >= 5 && i <= 8 && j == -1)
	//*  62  113:iload_1         
	//*  63  114:iconst_5        
	//*  64  115:icmplt          140
	//*  65  118:iload_1         
	//*  66  119:bipush          8
	//*  67  121:icmpgt          140
	//*  68  124:iload_2         
	//*  69  125:iconst_m1       
	//*  70  126:icmpne          140
		{
			setResult(-2);
	//   71  129:aload_0         
	//   72  130:bipush          -2
	//   73  132:invokevirtual   #450 <Method void setResult(int)>
			finish();
	//   74  135:aload_0         
	//   75  136:invokevirtual   #314 <Method void finish()>
			return;
	//   76  139:return          
		} else
		{
			finish();
	//   77  140:aload_0         
	//   78  141:invokevirtual   #314 <Method void finish()>
			return;
	//   79  144:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #454 <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040031);
	//    3    5:aload_0         
	//    4    6:ldc2            #455 <Int 0x7f040031>
	//    5    9:invokevirtual   #458 <Method void setContentView(int)>
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:ldc2            #459 <Int 0x7f0e00af>
	//    9   17:invokevirtual   #57  <Method View findViewById(int)>
	//   10   20:checkcast       #81  <Class Toolbar>
	//   11   23:putfield        #79  <Field Toolbar toolbar>
		toolbar.setTitle("");
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field Toolbar toolbar>
	//   14   30:ldc2            #400 <String "">
	//   15   33:invokevirtual   #84  <Method void Toolbar.setTitle(CharSequence)>
		setSupportActionBar(toolbar);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #79  <Field Toolbar toolbar>
	//   19   41:invokevirtual   #463 <Method void setSupportActionBar(Toolbar)>
		bundle = ((Bundle) (getIntent()));
	//   20   44:aload_0         
	//   21   45:invokevirtual   #467 <Method Intent getIntent()>
	//   22   48:astore_1        
		int i = ((Intent) (bundle)).getIntExtra("SURVEY_CODE_EXTRA", 0);
	//   23   49:aload_1         
	//   24   50:ldc1            #26  <String "SURVEY_CODE_EXTRA">
	//   25   52:iconst_0        
	//   26   53:invokevirtual   #471 <Method int Intent.getIntExtra(String, int)>
	//   27   56:istore_2        
		if(i == 0)
	//*  28   57:iload_2         
	//*  29   58:ifne            90
		{
			if(((Intent) (bundle)).getIntExtra("testing_consent", 0) == 1)
	//*  30   61:aload_1         
	//*  31   62:ldc1            #32  <String "testing_consent">
	//*  32   64:iconst_0        
	//*  33   65:invokevirtual   #471 <Method int Intent.getIntExtra(String, int)>
	//*  34   68:iconst_1        
	//*  35   69:icmpne          77
			{
				goToInformedConsent();
	//   36   72:aload_0         
	//   37   73:invokespecial   #435 <Method void goToInformedConsent()>
				return;
	//   38   76:return          
			}
			Log.e("SurveyActivity", "Tried to start a ppdSurvey wo/ a ppdSurvey code");
	//   39   77:ldc1            #29  <String "SurveyActivity">
	//   40   79:ldc2            #473 <String "Tried to start a ppdSurvey wo/ a ppdSurvey code">
	//   41   82:invokestatic    #307 <Method int Log.e(String, String)>
	//   42   85:pop             
			finish();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #314 <Method void finish()>
		}
		initWithSurveyId(i);
	//   45   90:aload_0         
	//   46   91:iload_2         
	//   47   92:invokespecial   #475 <Method void initWithSurveyId(int)>
	//   48   95:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0007);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Toolbar toolbar>
	//    2    4:ldc2            #478 <Int 0x7f0f0007>
	//    3    7:invokevirtual   #481 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(0x7f0e017c == menuitem.getItemId())
	//*   0    0:ldc2            #484 <Int 0x7f0e017c>
	//*   1    3:aload_1         
	//*   2    4:invokeinterface #489 <Method int MenuItem.getItemId()>
	//*   3    9:icmpne          18
		{
			finish();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #314 <Method void finish()>
			return true;
	//    6   16:iconst_1        
	//    7   17:ireturn         
		} else
		{
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		}
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		return failedInTheEligibilityQuiz;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field boolean failedInTheEligibilityQuiz>
	//    2    4:ireturn         
	}

	private static final int REQUEST_CONSENT = 2;
	private static final int REQUEST_ELIGIBILITY = 1;
	private static final int REQUEST_HEALTH_ECONOMICS_BIMF = 5;
	private static final int REQUEST_HEALTH_ECONOMICS_HRPQ = 6;
	private static final int REQUEST_HEALTH_ECONOMICS_HRUQ = 7;
	private static final int REQUEST_HEALTH_ECONOMICS_SF12 = 8;
	private static final int REQUEST_PARTICIPANT_FORM = 4;
	private static final int REQUEST_PPD = 3;
	public static final int RESULT_LOADING = -2;
	public static final String SURVEY_CODE_EXTRA = "SURVEY_CODE_EXTRA";
	private static final String TAG = "SurveyActivity";
	public static final String TESTING_CONSENT_EXTRA = "testing_consent";
	private ConsentDocument consentDocument;
	private boolean failedInTheEligibilityQuiz;
	private ArrayList stepList;
	private SurveyDelegate surveyCallbacks;
	private SurveyTask surveyTask;
	private Toolbar toolbar;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.Params;
import com.birbit.android.jobqueue.RetryConstraint;
import com.pactforcure.app.api.dto.SaveResponesRequestBody;
import com.pactforcure.app.api.dto.SaveResponsesResponse;
import com.pactforcure.app.api.transform.QuestionTypeFinder;
import com.pactforcure.app.api.transform.ResponseToServerTransformerFactory;
import com.pactforcure.app.api.transform.ResponseToServerValueTransformer;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.core.message.SurveyUploadedMessage;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.pactforcure.app.survey.Answer;
import com.pactforcure.app.survey.ProgressStatus;
import com.pactforcure.app.survey.Response;
import com.pactforcure.app.survey.SurveyLoader;
import com.pactforcure.app.survey.SurveyStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import retrofit2.Call;

// Referenced classes of package com.pactforcure.app.api:
//			ApiService

public class UploadSurveyResponsesJob extends Job
{

	public UploadSurveyResponsesJob(Map map)
	{
		super((new Params(1)).requireNetwork().persist());
	//    0    0:aload_0         
	//    1    1:new             #13  <Class Params>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:invokespecial   #16  <Method void Params(int)>
	//    5    9:invokevirtual   #20  <Method Params Params.requireNetwork()>
	//    6   12:invokevirtual   #23  <Method Params Params.persist()>
	//    7   15:invokespecial   #26  <Method void Job(Params)>
		answers = map;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #28  <Field Map answers>
		if(map.size() > 0)
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #34  <Method int Map.size()>
	//*  13   29:ifle            66
			surveyCode = ((Answer)((java.util.Map.Entry)map.entrySet().iterator().next()).getValue()).getSurveyCode();
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokeinterface #38  <Method Set Map.entrySet()>
	//   17   39:invokeinterface #44  <Method Iterator Set.iterator()>
	//   18   44:invokeinterface #50  <Method Object Iterator.next()>
	//   19   49:checkcast       #52  <Class java.util.Map$Entry>
	//   20   52:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   21   57:checkcast       #57  <Class Answer>
	//   22   60:invokevirtual   #61  <Method String Answer.getSurveyCode()>
	//   23   63:putfield        #63  <Field String surveyCode>
	//   24   66:return          
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
		Object obj = ((Object) (BackboneApplication.get().getApi()));
	//    0    0:invokestatic    #81  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #85  <Method ApiService BackboneApplication.getApi()>
	//    2    6:astore_1        
		Object obj1 = ((Object) (new QuestionTypeFinder(SurveyLoader.fromSurveyStringCode(surveyCode))));
	//    3    7:new             #87  <Class QuestionTypeFinder>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field String surveyCode>
	//    7   15:invokestatic    #93  <Method com.pactforcure.app.survey.Survey SurveyLoader.fromSurveyStringCode(String)>
	//    8   18:invokespecial   #96  <Method void QuestionTypeFinder(com.pactforcure.app.survey.Survey)>
	//    9   21:astore_3        
		ArrayList arraylist = new ArrayList(answers.size());
	//   10   22:new             #98  <Class ArrayList>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #28  <Field Map answers>
	//   14   30:invokeinterface #34  <Method int Map.size()>
	//   15   35:invokespecial   #99  <Method void ArrayList(int)>
	//   16   38:astore_2        
		Answer answer;
		ResponseToServerValueTransformer responsetoservervaluetransformer;
		for(Iterator iterator = answers.values().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new Response(answer.getQuestionCode(), responsetoservervaluetransformer.normalize(answer.getValue()), answer.getSurveyCode(), answer.getDateAdded())))))
	//*  17   39:aload_0         
	//*  18   40:getfield        #28  <Field Map answers>
	//*  19   43:invokeinterface #103 <Method Collection Map.values()>
	//*  20   48:invokeinterface #106 <Method Iterator Collection.iterator()>
	//*  21   53:astore          4
	//*  22   55:aload           4
	//*  23   57:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  24   62:ifeq            135
		{
			answer = (Answer)iterator.next();
	//   25   65:aload           4
	//   26   67:invokeinterface #50  <Method Object Iterator.next()>
	//   27   72:checkcast       #57  <Class Answer>
	//   28   75:astore          5
			responsetoservervaluetransformer = ResponseToServerTransformerFactory.forQuestionType(((QuestionTypeFinder) (obj1)).get(answer.getQuestionCode()));
	//   29   77:aload_3         
	//   30   78:aload           5
	//   31   80:invokevirtual   #113 <Method String Answer.getQuestionCode()>
	//   32   83:invokevirtual   #116 <Method com.pactforcure.app.survey.QuestionType QuestionTypeFinder.get(String)>
	//   33   86:invokestatic    #122 <Method ResponseToServerValueTransformer ResponseToServerTransformerFactory.forQuestionType(com.pactforcure.app.survey.QuestionType)>
	//   34   89:astore          6
		}

	//   35   91:aload_2         
	//   36   92:new             #124 <Class Response>
	//   37   95:dup             
	//   38   96:aload           5
	//   39   98:invokevirtual   #113 <Method String Answer.getQuestionCode()>
	//   40  101:aload           6
	//   41  103:aload           5
	//   42  105:invokevirtual   #126 <Method String Answer.getValue()>
	//   43  108:invokeinterface #132 <Method String ResponseToServerValueTransformer.normalize(String)>
	//   44  113:aload           5
	//   45  115:invokevirtual   #61  <Method String Answer.getSurveyCode()>
	//   46  118:aload           5
	//   47  120:invokevirtual   #136 <Method java.util.Date Answer.getDateAdded()>
	//   48  123:invokespecial   #139 <Method void Response(String, String, String, java.util.Date)>
	//   49  126:invokeinterface #145 <Method boolean List.add(Object)>
	//   50  131:pop             
	//*  51  132:goto            55
		obj1 = ((Object) (ParticipantStorage.getAccessToken()));
	//   52  135:invokestatic    #150 <Method String ParticipantStorage.getAccessToken()>
	//   53  138:astore_3        
		obj = ((Object) ((SaveResponsesResponse)((ApiService) (obj)).saveResponses(((String) (obj1)), new SaveResponesRequestBody(((String) (obj1)), ((List) (arraylist)))).execute().body()));
	//   54  139:aload_1         
	//   55  140:aload_3         
	//   56  141:new             #152 <Class SaveResponesRequestBody>
	//   57  144:dup             
	//   58  145:aload_3         
	//   59  146:aload_2         
	//   60  147:invokespecial   #155 <Method void SaveResponesRequestBody(String, List)>
	//   61  150:invokeinterface #161 <Method Call ApiService.saveResponses(String, SaveResponesRequestBody)>
	//   62  155:invokeinterface #167 <Method retrofit2.Response Call.execute()>
	//   63  160:invokevirtual   #172 <Method Object retrofit2.Response.body()>
	//   64  163:checkcast       #174 <Class SaveResponsesResponse>
	//   65  166:astore_1        
		if(obj != null && ((SaveResponsesResponse) (obj)).getSuccess().booleanValue())
	//*  66  167:aload_1         
	//*  67  168:ifnull          210
	//*  68  171:aload_1         
	//*  69  172:invokevirtual   #178 <Method Boolean SaveResponsesResponse.getSuccess()>
	//*  70  175:invokevirtual   #183 <Method boolean Boolean.booleanValue()>
	//*  71  178:ifeq            210
		{
			SurveyStorage.saveSurveyProgress(Res.getStudyId().name(), surveyCode, ProgressStatus.Uploaded);
	//   72  181:invokestatic    #189 <Method StudyId Res.getStudyId()>
	//   73  184:invokevirtual   #194 <Method String StudyId.name()>
	//   74  187:aload_0         
	//   75  188:getfield        #63  <Field String surveyCode>
	//   76  191:getstatic       #200 <Field ProgressStatus ProgressStatus.Uploaded>
	//   77  194:invokestatic    #206 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
			EventBus.getDefault().postSticky(((Object) (new SurveyUploadedMessage())));
	//   78  197:invokestatic    #212 <Method EventBus EventBus.getDefault()>
	//   79  200:new             #214 <Class SurveyUploadedMessage>
	//   80  203:dup             
	//   81  204:invokespecial   #216 <Method void SurveyUploadedMessage()>
	//   82  207:invokevirtual   #220 <Method void EventBus.postSticky(Object)>
		}
	//   83  210:return          
	}

	protected RetryConstraint shouldReRunOnThrowable(Throwable throwable, int i, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private Map answers;
	private String surveyCode;
}

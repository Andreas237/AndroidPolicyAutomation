// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import com.pactforcure.app.api.ProcessQuestionnaireJob;
import com.pactforcure.app.api.dto.Response;
import com.pactforcure.app.api.dto.Study;
import com.pactforcure.app.api.transform.*;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.ParticipantStorage;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import java.util.*;
import org.json.simple.parser.ParseException;

// Referenced classes of package com.pactforcure.app.survey:
//			Answer, SurveyParsingException, SurveyLoader, SurveyStorage, 
//			ProgressStatus, PpdResultsStorage

public class SurveySync
{
	public static class ResponsesDtoParser
	{

		public static Map fromDtoList(String s, List list)
		{
			HashMap hashmap = new HashMap(list.size());
		//    0    0:new             #16  <Class HashMap>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokeinterface #22  <Method int List.size()>
		//    4   10:invokespecial   #25  <Method void HashMap(int)>
		//    5   13:astore_2        
			Response response;
			Answer answer;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).put(((Object) (response.getQuestionCode())), ((Object) (answer))))
		//*   6   14:aload_1         
		//*   7   15:invokeinterface #29  <Method Iterator List.iterator()>
		//*   8   20:astore_1        
		//*   9   21:aload_1         
		//*  10   22:invokeinterface #35  <Method boolean Iterator.hasNext()>
		//*  11   27:ifeq            107
			{
				response = (Response)((Iterator) (list)).next();
		//   12   30:aload_1         
		//   13   31:invokeinterface #39  <Method Object Iterator.next()>
		//   14   36:checkcast       #41  <Class Response>
		//   15   39:astore_3        
				answer = new Answer();
		//   16   40:new             #43  <Class Answer>
		//   17   43:dup             
		//   18   44:invokespecial   #44  <Method void Answer()>
		//   19   47:astore          4
				answer.setStudyId(s);
		//   20   49:aload           4
		//   21   51:aload_0         
		//   22   52:invokevirtual   #48  <Method void Answer.setStudyId(String)>
				answer.setSurveyCode(response.getSurveyCode());
		//   23   55:aload           4
		//   24   57:aload_3         
		//   25   58:invokevirtual   #52  <Method String Response.getSurveyCode()>
		//   26   61:invokevirtual   #55  <Method void Answer.setSurveyCode(String)>
				answer.setDateAdded(response.getCreatedAt());
		//   27   64:aload           4
		//   28   66:aload_3         
		//   29   67:invokevirtual   #59  <Method java.util.Date Response.getCreatedAt()>
		//   30   70:invokevirtual   #63  <Method void Answer.setDateAdded(java.util.Date)>
				answer.setQuestionCode(response.getQuestionCode());
		//   31   73:aload           4
		//   32   75:aload_3         
		//   33   76:invokevirtual   #66  <Method String Response.getQuestionCode()>
		//   34   79:invokevirtual   #69  <Method void Answer.setQuestionCode(String)>
				answer.setValue(response.getValue());
		//   35   82:aload           4
		//   36   84:aload_3         
		//   37   85:invokevirtual   #72  <Method String Response.getValue()>
		//   38   88:invokevirtual   #75  <Method void Answer.setValue(String)>
			}

		//   39   91:aload_2         
		//   40   92:aload_3         
		//   41   93:invokevirtual   #66  <Method String Response.getQuestionCode()>
		//   42   96:aload           4
		//   43   98:invokeinterface #81  <Method Object Map.put(Object, Object)>
		//   44  103:pop             
		//*  45  104:goto            21
			return ((Map) (hashmap));
		//   46  107:aload_2         
		//   47  108:areturn         
		}

		public ResponsesDtoParser()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public SurveySync()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static Map groupBySurveyCode(Map map)
	{
		HashMap hashmap = new HashMap(5);
	//    0    0:new             #20  <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:invokespecial   #23  <Method void HashMap(int)>
	//    4    8:astore_1        
		Answer answer;
		for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext(); ((Map)((Map) (hashmap)).get(((Object) (answer.getSurveyCode())))).put(((Object) (answer.getQuestionCode())), ((Object) (answer))))
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #29  <Method Collection Map.values()>
	//*   7   15:invokeinterface #35  <Method Iterator Collection.iterator()>
	//*   8   20:astore_0        
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            98
		{
			answer = (Answer)((Iterator) (map)).next();
	//   12   30:aload_0         
	//   13   31:invokeinterface #45  <Method Object Iterator.next()>
	//   14   36:checkcast       #47  <Class Answer>
	//   15   39:astore_2        
			if(!((Map) (hashmap)).containsKey(((Object) (answer.getSurveyCode()))))
	//*  16   40:aload_1         
	//*  17   41:aload_2         
	//*  18   42:invokevirtual   #51  <Method String Answer.getSurveyCode()>
	//*  19   45:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  20   50:ifne            71
				((Map) (hashmap)).put(((Object) (answer.getSurveyCode())), ((Object) (new HashMap())));
	//   21   53:aload_1         
	//   22   54:aload_2         
	//   23   55:invokevirtual   #51  <Method String Answer.getSurveyCode()>
	//   24   58:new             #20  <Class HashMap>
	//   25   61:dup             
	//   26   62:invokespecial   #56  <Method void HashMap()>
	//   27   65:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   28   70:pop             
		}

	//   29   71:aload_1         
	//   30   72:aload_2         
	//   31   73:invokevirtual   #51  <Method String Answer.getSurveyCode()>
	//   32   76:invokeinterface #64  <Method Object Map.get(Object)>
	//   33   81:checkcast       #25  <Class Map>
	//   34   84:aload_2         
	//   35   85:invokevirtual   #67  <Method String Answer.getQuestionCode()>
	//   36   88:aload_2         
	//   37   89:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   38   94:pop             
	//*  39   95:goto            21
		return ((Map) (hashmap));
	//   40   98:aload_1         
	//   41   99:areturn         
	}

	public static void saveResponsesFromDtos(Study study, List list)
	{
		String s;
		s = study.getStudyId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method String Study.getStudyId()>
	//    2    4:astore          4
		study = ((Study) (groupBySurveyCode(ResponsesDtoParser.fromDtoList(s, list))));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #84  <Method Map SurveySync$ResponsesDtoParser.fromDtoList(String, List)>
	//    6   12:invokestatic    #86  <Method Map groupBySurveyCode(Map)>
	//    7   15:astore_0        
		if(!((Map) (study)).containsKey("PPD")) goto _L2; else goto _L1
	//    8   16:aload_0         
	//    9   17:ldc1            #88  <String "PPD">
	//   10   19:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//   11   24:ifeq            124
_L1:
		Map map;
		list = ((List) (SurveyLoader.fromSurveyCode(0x7f0e0013)));
	//   12   27:ldc1            #89  <Int 0x7f0e0013>
	//   13   29:invokestatic    #95  <Method Survey SurveyLoader.fromSurveyCode(int)>
	//   14   32:astore_1        
		map = (Map)((Map) (study)).get("PPD");
	//   15   33:aload_0         
	//   16   34:ldc1            #88  <String "PPD">
	//   17   36:invokeinterface #64  <Method Object Map.get(Object)>
	//   18   41:checkcast       #25  <Class Map>
	//   19   44:astore          5
		Answer answer;
		for(Iterator iterator = map.values().iterator(); iterator.hasNext(); answer.setValue(ResponseFromServerTransformerFactory.forQuestionType((new QuestionTypeFinder(((Survey) (list)))).get(answer.getQuestionCode())).denormalize(answer.getValue())))
	//*  20   46:aload           5
	//*  21   48:invokeinterface #29  <Method Collection Map.values()>
	//*  22   53:invokeinterface #35  <Method Iterator Collection.iterator()>
	//*  23   58:astore          6
	//*  24   60:aload           6
	//*  25   62:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*  26   67:ifeq            225
			answer = (Answer)iterator.next();
	//   27   70:aload           6
	//   28   72:invokeinterface #45  <Method Object Iterator.next()>
	//   29   77:checkcast       #47  <Class Answer>
	//   30   80:astore          7

	//   31   82:aload           7
	//   32   84:new             #97  <Class QuestionTypeFinder>
	//   33   87:dup             
	//   34   88:aload_1         
	//   35   89:invokespecial   #100 <Method void QuestionTypeFinder(Survey)>
	//   36   92:aload           7
	//   37   94:invokevirtual   #67  <Method String Answer.getQuestionCode()>
	//   38   97:invokevirtual   #103 <Method QuestionType QuestionTypeFinder.get(String)>
	//   39  100:invokestatic    #109 <Method ResponseFromServerValueTransformer ResponseFromServerTransformerFactory.forQuestionType(QuestionType)>
	//   40  103:aload           7
	//   41  105:invokevirtual   #112 <Method String Answer.getValue()>
	//   42  108:invokeinterface #118 <Method String ResponseFromServerValueTransformer.denormalize(String)>
	//   43  113:invokevirtual   #122 <Method void Answer.setValue(String)>
		  goto _L3
	//*  44  116:goto            60
	//*  45  119:astore_1        
	//*  46  120:aload_1         
	//*  47  121:invokevirtual   #125 <Method void ParseException.printStackTrace()>
_L2:
		if(((Map) (study)).containsKey("DNA"))
	//*  48  124:aload_0         
	//*  49  125:ldc1            #127 <String "DNA">
	//*  50  127:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  51  132:ifeq            153
			SurveyStorage.saveAnswers(s, "DNA", (Map)((Map) (study)).get("DNA"));
	//   52  135:aload           4
	//   53  137:ldc1            #127 <String "DNA">
	//   54  139:aload_0         
	//   55  140:ldc1            #127 <String "DNA">
	//   56  142:invokeinterface #64  <Method Object Map.get(Object)>
	//   57  147:checkcast       #25  <Class Map>
	//   58  150:invokestatic    #133 <Method void SurveyStorage.saveAnswers(String, String, Map)>
		list = ((List) (new String[4]));
	//   59  153:iconst_4        
	//   60  154:anewarray       String[]
	//   61  157:astore_1        
		list[0] = "HealthEconomics-BIMF";
	//   62  158:aload_1         
	//   63  159:iconst_0        
	//   64  160:ldc1            #137 <String "HealthEconomics-BIMF">
	//   65  162:aastore         
		list[1] = "HealthEconomics-HRPQ";
	//   66  163:aload_1         
	//   67  164:iconst_1        
	//   68  165:ldc1            #139 <String "HealthEconomics-HRPQ">
	//   69  167:aastore         
		list[2] = "HealthEconomics-HRUQ";
	//   70  168:aload_1         
	//   71  169:iconst_2        
	//   72  170:ldc1            #141 <String "HealthEconomics-HRUQ">
	//   73  172:aastore         
		list[3] = "HealthEconomics-SF12";
	//   74  173:aload_1         
	//   75  174:iconst_3        
	//   76  175:ldc1            #143 <String "HealthEconomics-SF12">
	//   77  177:aastore         
		int j = list.length;
	//   78  178:aload_1         
	//   79  179:arraylength     
	//   80  180:istore_3        
		for(int i = 0; i < j; i++)
	//*  81  181:iconst_0        
	//*  82  182:istore_2        
	//*  83  183:iload_2         
	//*  84  184:iload_3         
	//*  85  185:icmpge          245
		{
			s = ((String) (list[i]));
	//   86  188:aload_1         
	//   87  189:iload_2         
	//   88  190:aaload          
	//   89  191:astore          4
			if(((Map) (study)).containsKey(((Object) (s))))
	//*  90  193:aload_0         
	//*  91  194:aload           4
	//*  92  196:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  93  201:ifeq            218
				SurveyStorage.saveSurveyProgress(Res.getStudyId().name(), s, ProgressStatus.Uploaded);
	//   94  204:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//   95  207:invokevirtual   #153 <Method String StudyId.name()>
	//   96  210:aload           4
	//   97  212:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   98  215:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		}

	//   99  218:iload_2         
	//  100  219:iconst_1        
	//  101  220:iadd            
	//  102  221:istore_2        
		break; /* Loop/switch isn't completed */
	//  103  222:goto            183
_L3:
		try
		{
			SurveyStorage.saveAnswers(s, "PPD", map);
	//  104  225:aload           4
	//  105  227:ldc1            #88  <String "PPD">
	//  106  229:aload           5
	//  107  231:invokestatic    #133 <Method void SurveyStorage.saveAnswers(String, String, Map)>
		}
		// Misplaced declaration of an exception variable
		catch(List list)
		{
			((ParseException) (list)).printStackTrace();
		}
	//* 108  234:goto            124
		// Misplaced declaration of an exception variable
		catch(List list)
	//* 109  237:astore_1        
		{
			((SurveyParsingException) (list)).printStackTrace();
	//  110  238:aload_1         
	//  111  239:invokevirtual   #164 <Method void SurveyParsingException.printStackTrace()>
		}
		if(true) goto _L2; else goto _L4
	//  112  242:goto            124
_L4:
	//  113  245:return          
	}

	public static void syncStateFromDtos(Study study, List list, Boolean boolean1)
		throws Throwable
	{
		study = ((Study) (study.getStudyId()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method String Study.getStudyId()>
	//    2    4:astore_0        
		Res.setAndSaveStudyId(StudyId.valueOf(((String) (study))));
	//    3    5:aload_0         
	//    4    6:invokestatic    #173 <Method StudyId StudyId.valueOf(String)>
	//    5    9:invokestatic    #177 <Method void Res.setAndSaveStudyId(StudyId)>
		list = ((List) (groupBySurveyCode(ResponsesDtoParser.fromDtoList(((String) (study)), list))));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #84  <Method Map SurveySync$ResponsesDtoParser.fromDtoList(String, List)>
	//    9   17:invokestatic    #86  <Method Map groupBySurveyCode(Map)>
	//   10   20:astore_1        
		if(((Map) (list)).containsKey("PPD"))
	//*  11   21:aload_1         
	//*  12   22:ldc1            #88  <String "PPD">
	//*  13   24:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  14   29:ifeq            123
		{
			(new ProcessQuestionnaireJob("PPD", false, false)).onRun();
	//   15   32:new             #179 <Class ProcessQuestionnaireJob>
	//   16   35:dup             
	//   17   36:ldc1            #88  <String "PPD">
	//   18   38:iconst_0        
	//   19   39:iconst_0        
	//   20   40:invokespecial   #182 <Method void ProcessQuestionnaireJob(String, boolean, boolean)>
	//   21   43:invokevirtual   #185 <Method void ProcessQuestionnaireJob.onRun()>
			SurveyStorage.saveSurveyProgress(((String) (study)), "PPD", ProgressStatus.Uploaded);
	//   22   46:aload_0         
	//   23   47:ldc1            #88  <String "PPD">
	//   24   49:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   25   52:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
			if(ParticipantStorage.getParticipant().isDNAregistered() && PpdResultsStorage.getDnaModuleEnabled(Res.getStudyId()))
	//*  26   55:invokestatic    #191 <Method Participant ParticipantStorage.getParticipant()>
	//*  27   58:invokevirtual   #196 <Method boolean Participant.isDNAregistered()>
	//*  28   61:ifeq            123
	//*  29   64:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//*  30   67:invokestatic    #202 <Method boolean PpdResultsStorage.getDnaModuleEnabled(StudyId)>
	//*  31   70:ifeq            123
			{
				SurveyStorage.saveSurveyProgress(((String) (study)), "DNA", ProgressStatus.Uploaded);
	//   32   73:aload_0         
	//   33   74:ldc1            #127 <String "DNA">
	//   34   76:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   35   79:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
				PpdResultsStorage.setGivenDnaConsent(Res.getStudyId(), true);
	//   36   82:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//   37   85:iconst_1        
	//   38   86:invokestatic    #206 <Method void PpdResultsStorage.setGivenDnaConsent(StudyId, boolean)>
				PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(Res.getStudyId(), true);
	//   39   89:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//   40   92:iconst_1        
	//   41   93:invokestatic    #209 <Method void PpdResultsStorage.setAreHealthEconomicQuestionnairesAvailable(StudyId, boolean)>
				if(boolean1 != null && boolean1.booleanValue())
	//*  42   96:aload_2         
	//*  43   97:ifnull          123
	//*  44  100:aload_2         
	//*  45  101:invokevirtual   #214 <Method boolean Boolean.booleanValue()>
	//*  46  104:ifeq            123
				{
					PpdResultsStorage.setSentDnaKitBackProgress(Res.getStudyId(), ProgressStatus.Uploaded);
	//   47  107:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//   48  110:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   49  113:invokestatic    #218 <Method void PpdResultsStorage.setSentDnaKitBackProgress(StudyId, ProgressStatus)>
					PpdResultsStorage.setSentDnaKitBack(Res.getStudyId(), true);
	//   50  116:invokestatic    #148 <Method StudyId Res.getStudyId()>
	//   51  119:iconst_1        
	//   52  120:invokestatic    #221 <Method void PpdResultsStorage.setSentDnaKitBack(StudyId, boolean)>
				}
			}
		}
		if(((Map) (list)).containsKey("HealthEconomics-BIMF"))
	//*  53  123:aload_1         
	//*  54  124:ldc1            #137 <String "HealthEconomics-BIMF">
	//*  55  126:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  56  131:ifeq            143
			SurveyStorage.saveSurveyProgress(((String) (study)), "HealthEconomics-BIMF", ProgressStatus.Uploaded);
	//   57  134:aload_0         
	//   58  135:ldc1            #137 <String "HealthEconomics-BIMF">
	//   59  137:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   60  140:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		if(((Map) (list)).containsKey("HealthEconomics-HRPQ"))
	//*  61  143:aload_1         
	//*  62  144:ldc1            #139 <String "HealthEconomics-HRPQ">
	//*  63  146:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  64  151:ifeq            163
			SurveyStorage.saveSurveyProgress(((String) (study)), "HealthEconomics-HRPQ", ProgressStatus.Uploaded);
	//   65  154:aload_0         
	//   66  155:ldc1            #139 <String "HealthEconomics-HRPQ">
	//   67  157:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   68  160:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		if(((Map) (list)).containsKey("HealthEconomics-SF12"))
	//*  69  163:aload_1         
	//*  70  164:ldc1            #143 <String "HealthEconomics-SF12">
	//*  71  166:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  72  171:ifeq            183
			SurveyStorage.saveSurveyProgress(((String) (study)), "HealthEconomics-SF12", ProgressStatus.Uploaded);
	//   73  174:aload_0         
	//   74  175:ldc1            #143 <String "HealthEconomics-SF12">
	//   75  177:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   76  180:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
		if(((Map) (list)).containsKey("HealthEconomics-HRUQ"))
	//*  77  183:aload_1         
	//*  78  184:ldc1            #141 <String "HealthEconomics-HRUQ">
	//*  79  186:invokeinterface #55  <Method boolean Map.containsKey(Object)>
	//*  80  191:ifeq            203
			SurveyStorage.saveSurveyProgress(((String) (study)), "HealthEconomics-HRUQ", ProgressStatus.Uploaded);
	//   81  194:aload_0         
	//   82  195:ldc1            #141 <String "HealthEconomics-HRUQ">
	//   83  197:getstatic       #159 <Field ProgressStatus ProgressStatus.Uploaded>
	//   84  200:invokestatic    #163 <Method void SurveyStorage.saveSurveyProgress(String, String, ProgressStatus)>
	//   85  203:return          
	}

	private static final String TAG = "SurveySync";
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import android.content.SharedPreferences;
import android.util.Log;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.core.lambda.Predicate;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.studies.StudyId;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.util.*;

// Referenced classes of package com.pactforcure.app.survey:
//			ProgressStatus, Answer, Answer_Table

public class SurveyStorage
{

	public SurveyStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	private static boolean anySurveyAt(String s, Predicate predicate)
	{
		String as[] = new String[6];
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:astore          4
		as[0] = "PPD";
	//    3    7:aload           4
	//    4    9:iconst_0        
	//    5   10:ldc1            #25  <String "PPD">
	//    6   12:aastore         
		as[1] = "DNA";
	//    7   13:aload           4
	//    8   15:iconst_1        
	//    9   16:ldc1            #27  <String "DNA">
	//   10   18:aastore         
		as[2] = "HealthEconomics-BIMF";
	//   11   19:aload           4
	//   12   21:iconst_2        
	//   13   22:ldc1            #29  <String "HealthEconomics-BIMF">
	//   14   24:aastore         
		as[3] = "HealthEconomics-HRPQ";
	//   15   25:aload           4
	//   16   27:iconst_3        
	//   17   28:ldc1            #31  <String "HealthEconomics-HRPQ">
	//   18   30:aastore         
		as[4] = "HealthEconomics-HRUQ";
	//   19   31:aload           4
	//   20   33:iconst_4        
	//   21   34:ldc1            #33  <String "HealthEconomics-HRUQ">
	//   22   36:aastore         
		as[5] = "HealthEconomics-SF12";
	//   23   37:aload           4
	//   24   39:iconst_5        
	//   25   40:ldc1            #35  <String "HealthEconomics-SF12">
	//   26   42:aastore         
		int j = as.length;
	//   27   43:aload           4
	//   28   45:arraylength     
	//   29   46:istore_3        
		for(int i = 0; i < j; i++)
	//*  30   47:iconst_0        
	//*  31   48:istore_2        
	//*  32   49:iload_2         
	//*  33   50:iload_3         
	//*  34   51:icmpge          132
		{
			String s1 = as[i];
	//   35   54:aload           4
	//   36   56:iload_2         
	//   37   57:aaload          
	//   38   58:astore          5
			ProgressStatus progressstatus = loadSurveyProgress(s, s1);
	//   39   60:aload_0         
	//   40   61:aload           5
	//   41   63:invokestatic    #39  <Method ProgressStatus loadSurveyProgress(String, String)>
	//   42   66:astore          6
			if(predicate.test(((Object) (progressstatus))))
	//*  43   68:aload_1         
	//*  44   69:aload           6
	//*  45   71:invokeinterface #45  <Method boolean Predicate.test(Object)>
	//*  46   76:ifeq            125
			{
				Log.d("SurveyStorage", (new StringBuilder()).append("Survey ").append(s1).append(" is in the ").append(progressstatus.name()).append(" state.").toString());
	//   47   79:ldc1            #14  <String "SurveyStorage">
	//   48   81:new             #47  <Class StringBuilder>
	//   49   84:dup             
	//   50   85:invokespecial   #48  <Method void StringBuilder()>
	//   51   88:ldc1            #50  <String "Survey ">
	//   52   90:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   53   93:aload           5
	//   54   95:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   55   98:ldc1            #56  <String " is in the ">
	//   56  100:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   57  103:aload           6
	//   58  105:invokevirtual   #62  <Method String ProgressStatus.name()>
	//   59  108:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   60  111:ldc1            #64  <String " state.">
	//   61  113:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   62  116:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   63  119:invokestatic    #73  <Method int Log.d(String, String)>
	//   64  122:pop             
				return true;
	//   65  123:iconst_1        
	//   66  124:ireturn         
			}
		}

	//   67  125:iload_2         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:istore_2        
	//*  71  129:goto            49
		return false;
	//   72  132:iconst_0        
	//   73  133:ireturn         
	}

	public static boolean anySurveyAtStarted(String s)
	{
		class .Lambda._cls1
			implements Predicate
		{

			public static Predicate lambdaFactory$()
			{
				return ((Predicate) (instance));
			//    0    0:getstatic       #15  <Field SurveyStorage$$Lambda$1 instance>
			//    1    3:areturn         
			}

			public boolean test(Object obj)
			{
				return SurveyStorage.lambda$anySurveyAtStarted$1((ProgressStatus)obj);
			//    0    0:aload_1         
			//    1    1:checkcast       #23  <Class ProgressStatus>
			//    2    4:invokestatic    #29  <Method boolean SurveyStorage.lambda$anySurveyAtStarted$1(ProgressStatus)>
			//    3    7:ireturn         
			}

			private static final .Lambda._cls1 instance = new .Lambda._cls1();

			static 
			{
			//    0    0:new             #2   <Class SurveyStorage$$Lambda$1>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void SurveyStorage$$Lambda$1()>
			//    3    7:putstatic       #15  <Field SurveyStorage$$Lambda$1 instance>
			//*   4   10:return          
			}

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		return anySurveyAt(s, .Lambda._cls1.lambdaFactory.());
	//    0    0:aload_0         
	//    1    1:invokestatic    #83  <Method Predicate SurveyStorage$$Lambda$1.lambdaFactory$()>
	//    2    4:invokestatic    #85  <Method boolean anySurveyAt(String, Predicate)>
	//    3    7:ireturn         
	}

	public static boolean anySurveyAtUploading(String s)
	{
		class .Lambda._cls2
			implements Predicate
		{

			public static Predicate lambdaFactory$()
			{
				return ((Predicate) (instance));
			//    0    0:getstatic       #15  <Field SurveyStorage$$Lambda$2 instance>
			//    1    3:areturn         
			}

			public boolean test(Object obj)
			{
				return SurveyStorage.lambda$anySurveyAtUploading$2((ProgressStatus)obj);
			//    0    0:aload_1         
			//    1    1:checkcast       #23  <Class ProgressStatus>
			//    2    4:invokestatic    #29  <Method boolean SurveyStorage.lambda$anySurveyAtUploading$2(ProgressStatus)>
			//    3    7:ireturn         
			}

			private static final .Lambda._cls2 instance = new .Lambda._cls2();

			static 
			{
			//    0    0:new             #2   <Class SurveyStorage$$Lambda$2>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void SurveyStorage$$Lambda$2()>
			//    3    7:putstatic       #15  <Field SurveyStorage$$Lambda$2 instance>
			//*   4   10:return          
			}

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		return anySurveyAt(s, .Lambda._cls2.lambdaFactory.());
	//    0    0:aload_0         
	//    1    1:invokestatic    #89  <Method Predicate SurveyStorage$$Lambda$2.lambdaFactory$()>
	//    2    4:invokestatic    #85  <Method boolean anySurveyAt(String, Predicate)>
	//    3    7:ireturn         
	}

	public static void clear(boolean flag)
	{
		StudyId studyid = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(!flag)
	//*   2    2:iload_0         
	//*   3    3:ifne            10
			studyid = Res.getStudyId();
	//    4    6:invokestatic    #97  <Method StudyId Res.getStudyId()>
	//    5    9:astore_1        
		BackboneApplication.get().getSharedPreferences("survey_progress", 0).edit().clear().apply();
	//    6   10:invokestatic    #103 <Method BackboneApplication BackboneApplication.get()>
	//    7   13:ldc1            #11  <String "survey_progress">
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #107 <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//   10   19:invokeinterface #113 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   11   24:invokeinterface #117 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   12   29:invokeinterface #120 <Method void android.content.SharedPreferences$Editor.apply()>
		if(!flag)
	//*  13   34:iload_0         
	//*  14   35:ifne            42
			Res.setAndSaveStudyId(studyid);
	//   15   38:aload_1         
	//   16   39:invokestatic    #124 <Method void Res.setAndSaveStudyId(StudyId)>
		SQLite.delete(com/pactforcure/app/survey/Answer).execute();
	//   17   42:ldc1            #126 <Class Answer>
	//   18   44:invokestatic    #132 <Method From SQLite.delete(Class)>
	//   19   47:invokevirtual   #137 <Method void From.execute()>
	//   20   50:return          
	}

	public static long clearAnswers(String s, String s1)
	{
		return SQLite.delete().from(com/pactforcure/app/survey/Answer).where(new SQLCondition[] {
			Answer_Table.studyId.eq(((Object) (s)))
		}).and(((SQLCondition) (Answer_Table.surveyCode.eq(((Object) (s1)))))).executeUpdateDelete();
	//    0    0:invokestatic    #142 <Method Delete SQLite.delete()>
	//    1    3:ldc1            #126 <Class Answer>
	//    2    5:invokevirtual   #147 <Method From Delete.from(Class)>
	//    3    8:iconst_1        
	//    4    9:anewarray       SQLCondition[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:getstatic       #155 <Field Property Answer_Table.studyId>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   10   21:aastore         
	//   11   22:invokevirtual   #165 <Method Where From.where(SQLCondition[])>
	//   12   25:getstatic       #168 <Field Property Answer_Table.surveyCode>
	//   13   28:aload_1         
	//   14   29:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   15   32:invokevirtual   #174 <Method Where Where.and(SQLCondition)>
	//   16   35:invokevirtual   #178 <Method long Where.executeUpdateDelete()>
	//   17   38:lreturn         
	}

	public static Answer getLatestAnswer(String s, String s1)
	{
		return (Answer)SQLite.select(new IProperty[0]).from(com/pactforcure/app/survey/Answer).where(new SQLCondition[] {
			Answer_Table.studyId.eq(((Object) (s)))
		}).and(((SQLCondition) (Answer_Table.surveyCode.eq(((Object) (s1)))))).orderBy(OrderBy.fromProperty(((IProperty) (Answer_Table.dateAdded))).descending()).limit(1).querySingle();
	//    0    0:iconst_0        
	//    1    1:anewarray       IProperty[]
	//    2    4:invokestatic    #186 <Method Select SQLite.select(IProperty[])>
	//    3    7:ldc1            #126 <Class Answer>
	//    4    9:invokevirtual   #189 <Method From Select.from(Class)>
	//    5   12:iconst_1        
	//    6   13:anewarray       SQLCondition[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #155 <Field Property Answer_Table.studyId>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   12   25:aastore         
	//   13   26:invokevirtual   #165 <Method Where From.where(SQLCondition[])>
	//   14   29:getstatic       #168 <Field Property Answer_Table.surveyCode>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   17   36:invokevirtual   #174 <Method Where Where.and(SQLCondition)>
	//   18   39:getstatic       #193 <Field com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty Answer_Table.dateAdded>
	//   19   42:invokestatic    #199 <Method OrderBy OrderBy.fromProperty(IProperty)>
	//   20   45:invokevirtual   #203 <Method OrderBy OrderBy.descending()>
	//   21   48:invokevirtual   #207 <Method Where Where.orderBy(OrderBy)>
	//   22   51:iconst_1        
	//   23   52:invokevirtual   #211 <Method Where Where.limit(int)>
	//   24   55:invokevirtual   #215 <Method Object Where.querySingle()>
	//   25   58:checkcast       #126 <Class Answer>
	//   26   61:areturn         
	}

	public static String getSurveyKey(String s, String s1)
	{
		return (new StringBuilder()).append(s).append("-").append(s1).toString();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #219 <String "-">
	//    6   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   10   23:areturn         
	}

	static boolean lambda$anySurveyAtStarted$1(ProgressStatus progressstatus)
	{
		return progressstatus == ProgressStatus.Started;
	//    0    0:aload_0         
	//    1    1:getstatic       #225 <Field ProgressStatus ProgressStatus.Started>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static boolean lambda$anySurveyAtUploading$2(ProgressStatus progressstatus)
	{
		return progressstatus == ProgressStatus.Completed;
	//    0    0:aload_0         
	//    1    1:getstatic       #229 <Field ProgressStatus ProgressStatus.Completed>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static Map loadAnswers(String s, String s1)
	{
		s1 = ((String) (SQLite.select(new IProperty[0]).from(com/pactforcure/app/survey/Answer).where(new SQLCondition[] {
			Answer_Table.studyId.eq(((Object) (s)))
		}).and(((SQLCondition) (Answer_Table.surveyCode.eq(((Object) (s1)))))).queryList()));
	//    0    0:iconst_0        
	//    1    1:anewarray       IProperty[]
	//    2    4:invokestatic    #186 <Method Select SQLite.select(IProperty[])>
	//    3    7:ldc1            #126 <Class Answer>
	//    4    9:invokevirtual   #189 <Method From Select.from(Class)>
	//    5   12:iconst_1        
	//    6   13:anewarray       SQLCondition[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:getstatic       #155 <Field Property Answer_Table.studyId>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   12   25:aastore         
	//   13   26:invokevirtual   #165 <Method Where From.where(SQLCondition[])>
	//   14   29:getstatic       #168 <Field Property Answer_Table.surveyCode>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   17   36:invokevirtual   #174 <Method Where Where.and(SQLCondition)>
	//   18   39:invokevirtual   #235 <Method List Where.queryList()>
	//   19   42:astore_1        
		s = ((String) (new HashMap()));
	//   20   43:new             #237 <Class HashMap>
	//   21   46:dup             
	//   22   47:invokespecial   #238 <Method void HashMap()>
	//   23   50:astore_0        
		Answer answer;
		for(s1 = ((String) (((List) (s1)).iterator())); ((Iterator) (s1)).hasNext(); ((Map) (s)).put(((Object) (answer.getQuestionCode())), ((Object) (answer))))
	//*  24   51:aload_1         
	//*  25   52:invokeinterface #244 <Method Iterator List.iterator()>
	//*  26   57:astore_1        
	//*  27   58:aload_1         
	//*  28   59:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  29   64:ifeq            92
			answer = (Answer)((Iterator) (s1)).next();
	//   30   67:aload_1         
	//   31   68:invokeinterface #253 <Method Object Iterator.next()>
	//   32   73:checkcast       #126 <Class Answer>
	//   33   76:astore_2        

	//   34   77:aload_0         
	//   35   78:aload_2         
	//   36   79:invokevirtual   #256 <Method String Answer.getQuestionCode()>
	//   37   82:aload_2         
	//   38   83:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   39   88:pop             
	//*  40   89:goto            58
		return ((Map) (s));
	//   41   92:aload_0         
	//   42   93:areturn         
	}

	public static StudyId loadStudyId()
	{
		int i = BackboneApplication.get().getSharedPreferences("survey_progress", 0).getInt("study_id", -1);
	//    0    0:invokestatic    #103 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "survey_progress">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #107 <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #8   <String "study_id">
	//    5   11:iconst_m1       
	//    6   12:invokeinterface #268 <Method int SharedPreferences.getInt(String, int)>
	//    7   17:istore_0        
		if(i == -1)
	//*   8   18:iload_0         
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          25
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		else
			return StudyId.values()[i];
	//   13   25:invokestatic    #274 <Method StudyId[] StudyId.values()>
	//   14   28:iload_0         
	//   15   29:aaload          
	//   16   30:areturn         
	}

	public static ProgressStatus loadSurveyProgress(String s, String s1)
	{
		int i = BackboneApplication.get().getSharedPreferences("survey_progress", 0).getInt(getSurveyKey(s, s1), 0);
	//    0    0:invokestatic    #103 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "survey_progress">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #107 <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #276 <Method String getSurveyKey(String, String)>
	//    7   14:iconst_0        
	//    8   15:invokeinterface #268 <Method int SharedPreferences.getInt(String, int)>
	//    9   20:istore_2        
		return ProgressStatus.values()[i];
	//   10   21:invokestatic    #279 <Method ProgressStatus[] ProgressStatus.values()>
	//   11   24:iload_2         
	//   12   25:aaload          
	//   13   26:areturn         
	}

	public static void saveAnswers(String s, String s1, Map map)
	{
		Log.e("SurveyStorage", (new StringBuilder()).append("saveAnswers() studyId: ").append(s).append(" answers.size: ").append(map.size()).toString());
	//    0    0:ldc1            #14  <String "SurveyStorage">
	//    1    2:new             #47  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #48  <Method void StringBuilder()>
	//    4    9:ldc2            #283 <String "saveAnswers() studyId: ">
	//    5   12:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc2            #285 <String " answers.size: ">
	//    9   22:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   10   25:aload_2         
	//   11   26:invokeinterface #289 <Method int Map.size()>
	//   12   31:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   13   34:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   14   37:invokestatic    #295 <Method int Log.e(String, String)>
	//   15   40:pop             
		s1 = ((String) (SQLite.select(new IProperty[0]).from(com/pactforcure/app/survey/Answer).where(new SQLCondition[] {
			Answer_Table.studyId.eq(((Object) (s)))
		}).and(((SQLCondition) (Answer_Table.surveyCode.eq(((Object) (s1)))))).queryList()));
	//   16   41:iconst_0        
	//   17   42:anewarray       IProperty[]
	//   18   45:invokestatic    #186 <Method Select SQLite.select(IProperty[])>
	//   19   48:ldc1            #126 <Class Answer>
	//   20   50:invokevirtual   #189 <Method From Select.from(Class)>
	//   21   53:iconst_1        
	//   22   54:anewarray       SQLCondition[]
	//   23   57:dup             
	//   24   58:iconst_0        
	//   25   59:getstatic       #155 <Field Property Answer_Table.studyId>
	//   26   62:aload_0         
	//   27   63:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   28   66:aastore         
	//   29   67:invokevirtual   #165 <Method Where From.where(SQLCondition[])>
	//   30   70:getstatic       #168 <Field Property Answer_Table.surveyCode>
	//   31   73:aload_1         
	//   32   74:invokevirtual   #161 <Method com.raizlabs.android.dbflow.sql.language.Condition Property.eq(Object)>
	//   33   77:invokevirtual   #174 <Method Where Where.and(SQLCondition)>
	//   34   80:invokevirtual   #235 <Method List Where.queryList()>
	//   35   83:astore_1        
		s = ((String) (new HashMap(((List) (s1)).size())));
	//   36   84:new             #237 <Class HashMap>
	//   37   87:dup             
	//   38   88:aload_1         
	//   39   89:invokeinterface #296 <Method int List.size()>
	//   40   94:invokespecial   #299 <Method void HashMap(int)>
	//   41   97:astore_0        
		Answer answer;
		for(s1 = ((String) (((List) (s1)).iterator())); ((Iterator) (s1)).hasNext(); ((Map) (s)).put(((Object) (answer.getQuestionCode())), ((Object) (answer))))
	//*  42   98:aload_1         
	//*  43   99:invokeinterface #244 <Method Iterator List.iterator()>
	//*  44  104:astore_1        
	//*  45  105:aload_1         
	//*  46  106:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  47  111:ifeq            139
			answer = (Answer)((Iterator) (s1)).next();
	//   48  114:aload_1         
	//   49  115:invokeinterface #253 <Method Object Iterator.next()>
	//   50  120:checkcast       #126 <Class Answer>
	//   51  123:astore_3        

	//   52  124:aload_0         
	//   53  125:aload_3         
	//   54  126:invokevirtual   #256 <Method String Answer.getQuestionCode()>
	//   55  129:aload_3         
	//   56  130:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   57  135:pop             
	//*  58  136:goto            105
		for(s1 = ((String) (map.entrySet().iterator())); ((Iterator) (s1)).hasNext();)
	//*  59  139:aload_2         
	//*  60  140:invokeinterface #303 <Method Set Map.entrySet()>
	//*  61  145:invokeinterface #306 <Method Iterator Set.iterator()>
	//*  62  150:astore_1        
	//*  63  151:aload_1         
	//*  64  152:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//*  65  157:ifeq            234
		{
			map = ((Map) ((java.util.Map.Entry)((Iterator) (s1)).next()));
	//   66  160:aload_1         
	//   67  161:invokeinterface #253 <Method Object Iterator.next()>
	//   68  166:checkcast       #308 <Class java.util.Map$Entry>
	//   69  169:astore_2        
			String s2 = (String)((java.util.Map.Entry) (map)).getKey();
	//   70  170:aload_2         
	//   71  171:invokeinterface #311 <Method Object java.util.Map$Entry.getKey()>
	//   72  176:checkcast       #23  <Class String>
	//   73  179:astore_3        
			Answer answer1 = (Answer)((Map) (s)).get(((Object) (s2)));
	//   74  180:aload_0         
	//   75  181:aload_3         
	//   76  182:invokeinterface #314 <Method Object Map.get(Object)>
	//   77  187:checkcast       #126 <Class Answer>
	//   78  190:astore          4
			if(answer1 == null)
	//*  79  192:aload           4
	//*  80  194:ifnonnull       214
				((Map) (s)).put(((Object) (s2)), ((java.util.Map.Entry) (map)).getValue());
	//   81  197:aload_0         
	//   82  198:aload_3         
	//   83  199:aload_2         
	//   84  200:invokeinterface #317 <Method Object java.util.Map$Entry.getValue()>
	//   85  205:invokeinterface #262 <Method Object Map.put(Object, Object)>
	//   86  210:pop             
			else
	//*  87  211:goto            151
				answer1.setValue(((Answer)((java.util.Map.Entry) (map)).getValue()).getValue());
	//   88  214:aload           4
	//   89  216:aload_2         
	//   90  217:invokeinterface #317 <Method Object java.util.Map$Entry.getValue()>
	//   91  222:checkcast       #126 <Class Answer>
	//   92  225:invokevirtual   #319 <Method String Answer.getValue()>
	//   93  228:invokevirtual   #323 <Method void Answer.setValue(String)>
		}

	//*  94  231:goto            151
		for(s = ((String) (((Map) (s)).values().iterator())); ((Iterator) (s)).hasNext(); ((Answer)((Iterator) (s)).next()).save());
	//   95  234:aload_0         
	//   96  235:invokeinterface #326 <Method Collection Map.values()>
	//   97  240:invokeinterface #329 <Method Iterator Collection.iterator()>
	//   98  245:astore_0        
	//   99  246:aload_0         
	//  100  247:invokeinterface #250 <Method boolean Iterator.hasNext()>
	//  101  252:ifeq            270
	//  102  255:aload_0         
	//  103  256:invokeinterface #253 <Method Object Iterator.next()>
	//  104  261:checkcast       #126 <Class Answer>
	//  105  264:invokevirtual   #332 <Method void Answer.save()>
	//* 106  267:goto            246
	//  107  270:return          
	}

	public static void saveStudyId(StudyId studyid)
	{
		BackboneApplication.get().getSharedPreferences("survey_progress", 0).edit().putInt("study_id", studyid.ordinal()).apply();
	//    0    0:invokestatic    #103 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "survey_progress">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #107 <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #113 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:ldc1            #8   <String "study_id">
	//    6   16:aload_0         
	//    7   17:invokevirtual   #337 <Method int StudyId.ordinal()>
	//    8   20:invokeinterface #341 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    9   25:invokeinterface #120 <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   30:return          
	}

	public static void saveSurveyProgress(String s, String s1, ProgressStatus progressstatus)
	{
		BackboneApplication.get().getSharedPreferences("survey_progress", 0).edit().putInt(getSurveyKey(s, s1), progressstatus.ordinal()).apply();
	//    0    0:invokestatic    #103 <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "survey_progress">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #107 <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #113 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:aload_1         
	//    7   16:invokestatic    #276 <Method String getSurveyKey(String, String)>
	//    8   19:aload_2         
	//    9   20:invokevirtual   #344 <Method int ProgressStatus.ordinal()>
	//   10   23:invokeinterface #341 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   11   28:invokeinterface #120 <Method void android.content.SharedPreferences$Editor.apply()>
	//   12   33:return          
	}

	private static final String STUDY_ID = "study_id";
	private static final String SURVEY_PROGRESS_SHARED_PREFS_FILENAME = "survey_progress";
	private static final String TAG = "SurveyStorage";
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import android.content.SharedPreferences;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.studies.StudyId;

// Referenced classes of package com.pactforcure.app.survey:
//			SurveyStorage, ProgressStatus

public class PpdResultsStorage
{

	public PpdResultsStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areHealthEconomicQuestionnairesAvailable(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getBoolean(getHealthEconomicQuestionnairesAvailableKey(studyid), false);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #29  <Method String getHealthEconomicQuestionnairesAvailableKey(StudyId)>
	//    6   13:iconst_0        
	//    7   14:invokeinterface #35  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   19:ireturn         
	}

	public static void clear()
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().clear().apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:invokeinterface #44  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    6   19:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   24:return          
	}

	private static String getCurrentSymptomsKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("current-symptoms-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #71  <String "current-symptoms-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private static String getDnaConsentGivenKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("dna-consent-given-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #77  <String "dna-consent-given-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private static String getDnaEnabledKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("dna-enabled-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #80  <String "dna-enabled-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private static String getDnaKitBackKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("dna-kit-back-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #83  <String "dna-kit-back-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static ProgressStatus getDnaKitBackProgress(StudyId studyid)
	{
		int i = BackboneApplication.get().getSharedPreferences("ppd_results", 0).getInt(getDnaKitProgressKey(studyid), 0);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #88  <Method String getDnaKitProgressKey(StudyId)>
	//    6   13:iconst_0        
	//    7   14:invokeinterface #92  <Method int SharedPreferences.getInt(String, int)>
	//    8   19:istore_1        
		return ProgressStatus.values()[i];
	//    9   20:invokestatic    #98  <Method ProgressStatus[] ProgressStatus.values()>
	//   10   23:iload_1         
	//   11   24:aaload          
	//   12   25:areturn         
	}

	private static String getDnaKitProgressKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("dna-kit-back-key-progress").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #100 <String "dna-kit-back-key-progress">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static boolean getDnaModuleEnabled(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getBoolean(getDnaEnabledKey(studyid), false);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #103 <Method String getDnaEnabledKey(StudyId)>
	//    6   13:iconst_0        
	//    7   14:invokeinterface #35  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   19:ireturn         
	}

	private static String getHealthEconomicQuestionnairesAvailableKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("health-eco-questionnaires-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #105 <String "health-eco-questionnaires-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static int getScore(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getInt(getScoreKey(studyid), -1);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #110 <Method String getScoreKey(StudyId)>
	//    6   13:iconst_m1       
	//    7   14:invokeinterface #92  <Method int SharedPreferences.getInt(String, int)>
	//    8   19:ireturn         
	}

	private static String getScoreKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #112 <String "-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static String getWorstEpisode(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getString(getWorstEpisodesKey(studyid), ((String) (null)));
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #116 <Method String getWorstEpisodesKey(StudyId)>
	//    6   13:aconst_null     
	//    7   14:invokeinterface #119 <Method String SharedPreferences.getString(String, String)>
	//    8   19:areturn         
	}

	private static String getWorstEpisodesKey(StudyId studyid)
	{
		return (new StringBuilder()).append(SurveyStorage.getSurveyKey(studyid.name(), "PPD")).append("worst-episodes-key").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String StudyId.name()>
	//    5   11:ldc1            #59  <String "PPD">
	//    6   13:invokestatic    #65  <Method String SurveyStorage.getSurveyKey(String, String)>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #121 <String "worst-episodes-key">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public static boolean hasGivenDnaConsent(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getBoolean(getDnaConsentGivenKey(studyid), false);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #124 <Method String getDnaConsentGivenKey(StudyId)>
	//    6   13:iconst_0        
	//    7   14:invokeinterface #35  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   19:ireturn         
	}

	public static boolean hasSentDnaKitBack(StudyId studyid)
	{
		return BackboneApplication.get().getSharedPreferences("ppd_results", 0).getBoolean(getDnaKitBackKey(studyid), false);
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #127 <Method String getDnaKitBackKey(StudyId)>
	//    6   13:iconst_0        
	//    7   14:invokeinterface #35  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   19:ireturn         
	}

	public static void saveCurrentSymptoms(StudyId studyid, boolean flag)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putBoolean(getCurrentSymptomsKey(studyid), flag).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #131 <Method String getCurrentSymptomsKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #135 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void saveWorstEpisode(StudyId studyid, String s)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putString(getWorstEpisodesKey(studyid), s).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #116 <Method String getWorstEpisodesKey(StudyId)>
	//    7   18:aload_1         
	//    8   19:invokeinterface #141 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setAreHealthEconomicQuestionnairesAvailable(StudyId studyid, boolean flag)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putBoolean(getHealthEconomicQuestionnairesAvailableKey(studyid), flag).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #29  <Method String getHealthEconomicQuestionnairesAvailableKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #135 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setEnableDnaModule(StudyId studyid, boolean flag)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putBoolean(getDnaEnabledKey(studyid), flag).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #103 <Method String getDnaEnabledKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #135 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setGivenDnaConsent(StudyId studyid, boolean flag)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putBoolean(getDnaConsentGivenKey(studyid), flag).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #124 <Method String getDnaConsentGivenKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #135 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setScore(StudyId studyid, int i)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putInt(getScoreKey(studyid), i).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #110 <Method String getScoreKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setSentDnaKitBack(StudyId studyid, boolean flag)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putBoolean(getDnaKitBackKey(studyid), flag).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #127 <Method String getDnaKitBackKey(StudyId)>
	//    7   18:iload_1         
	//    8   19:invokeinterface #135 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   24:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   29:return          
	}

	public static void setSentDnaKitBackProgress(StudyId studyid, ProgressStatus progressstatus)
	{
		BackboneApplication.get().getSharedPreferences("ppd_results", 0).edit().putInt(getDnaKitProgressKey(studyid), progressstatus.ordinal()).apply();
	//    0    0:invokestatic    #21  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #8   <String "ppd_results">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #25  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #40  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:aload_0         
	//    6   15:invokestatic    #88  <Method String getDnaKitProgressKey(StudyId)>
	//    7   18:aload_1         
	//    8   19:invokevirtual   #157 <Method int ProgressStatus.ordinal()>
	//    9   22:invokeinterface #150 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   10   27:invokeinterface #47  <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   32:return          
	}

	private static final String PPD_RESULTS_STORAGE_SHARED_PREFS_FILENAME = "ppd_results";
}

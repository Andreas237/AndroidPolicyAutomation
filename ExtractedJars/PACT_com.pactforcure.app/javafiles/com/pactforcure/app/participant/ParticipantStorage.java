// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import android.content.SharedPreferences;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.survey.SurveyStorage;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.pactforcure.app.participant:
//			Participant

public class ParticipantStorage
{

	public ParticipantStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static void clear()
	{
		BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).edit().clear().apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:invokeinterface #40  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    6   19:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
		SQLite.delete(com/pactforcure/app/participant/Participant).execute();
	//    7   24:ldc1            #45  <Class Participant>
	//    8   26:invokestatic    #51  <Method From SQLite.delete(Class)>
	//    9   29:invokevirtual   #56  <Method void From.execute()>
	//   10   32:return          
	}

	public static String getAccessToken()
	{
		return BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).getString("ACCESS_TOKEN", "");
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #7   <String "ACCESS_TOKEN">
	//    5   11:ldc1            #60  <String "">
	//    6   13:invokeinterface #64  <Method String SharedPreferences.getString(String, String)>
	//    7   18:areturn         
	}

	public static Participant getParticipant()
	{
		return (Participant)SQLite.select(new IProperty[0]).from(com/pactforcure/app/participant/Participant).querySingle();
	//    0    0:iconst_0        
	//    1    1:anewarray       IProperty[]
	//    2    4:invokestatic    #72  <Method Select SQLite.select(IProperty[])>
	//    3    7:ldc1            #45  <Class Participant>
	//    4    9:invokevirtual   #77  <Method From Select.from(Class)>
	//    5   12:invokevirtual   #81  <Method Object From.querySingle()>
	//    6   15:checkcast       #45  <Class Participant>
	//    7   18:areturn         
	}

	public static boolean isTheUserRegistered()
	{
		return BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).getBoolean("IS_REGISTERED", false);
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #11  <String "IS_REGISTERED">
	//    5   11:iconst_0        
	//    6   12:invokeinterface #87  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   17:ireturn         
	}

	public static void saveAccessToken(String s)
	{
		BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).edit().putString("ACCESS_TOKEN", s).apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:ldc1            #7   <String "ACCESS_TOKEN">
	//    6   16:aload_0         
	//    7   17:invokeinterface #93  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   22:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	public static void saveParticipant(Participant participant)
	{
		SQLite.delete(com/pactforcure/app/participant/Participant).execute();
	//    0    0:ldc1            #45  <Class Participant>
	//    1    2:invokestatic    #51  <Method From SQLite.delete(Class)>
	//    2    5:invokevirtual   #56  <Method void From.execute()>
		participant.save();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #98  <Method void Participant.save()>
	//    5   12:return          
	}

	public static void setUserAsRegistered()
	{
		BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).edit().putBoolean("IS_REGISTERED", true).apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:ldc1            #11  <String "IS_REGISTERED">
	//    6   16:iconst_1        
	//    7   17:invokeinterface #103 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   22:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	public static void setUserHasPassword()
	{
		BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).edit().putBoolean("HAS_PASSWORD", true).apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:ldc1            #9   <String "HAS_PASSWORD">
	//    6   16:iconst_1        
	//    7   17:invokeinterface #103 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   22:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	public static boolean userChoseStudy()
	{
		return SurveyStorage.loadStudyId() != null;
	//    0    0:invokestatic    #111 <Method com.pactforcure.app.studies.StudyId SurveyStorage.loadStudyId()>
	//    1    3:ifnull          8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	public static boolean userHasPassword()
	{
		return BackboneApplication.get().getSharedPreferences("participant_data.dat", 0).getBoolean("HAS_PASSWORD", false);
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #14  <String "participant_data.dat">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #9   <String "HAS_PASSWORD">
	//    5   11:iconst_0        
	//    6   12:invokeinterface #87  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   17:ireturn         
	}

	private static final String ACCESS_TOKEN = "ACCESS_TOKEN";
	private static final String HAS_PASSWORD = "HAS_PASSWORD";
	private static final String IS_REGISTERED = "IS_REGISTERED";
	private static final String PARTICIPANT_SHARED_PREFS_FILENAME = "participant_data.dat";
}

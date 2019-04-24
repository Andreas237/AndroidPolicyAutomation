// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.studies;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.survey.SurveyStorage;
import com.pactforcure.app.util.FileUtils;
import java.util.Locale;

// Referenced classes of package com.pactforcure.app.studies:
//			StudyId

public class Res
{

	public Res()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static String getRegularRawAsString(int i)
	{
		return FileUtils.rawResToString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #39  <Method String FileUtils.rawResToString(int)>
	//    2    4:areturn         
	}

	public static String getRegularString(int i)
	{
		return ((Application) (BackboneApplication.get())).getResources().getString(i);
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #53  <Method Resources Application.getResources()>
	//    2    6:iload_0         
	//    3    7:invokevirtual   #58  <Method String Resources.getString(int)>
	//    4   10:areturn         
	}

	public static String getRegularString(String s)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_1        
		Resources resources = ((Application) (backboneapplication)).getResources();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method Resources Application.getResources()>
	//    4    8:astore_2        
		return resources.getString(resources.getIdentifier(s.toLowerCase(), "string", ((Application) (backboneapplication)).getPackageName()));
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #65  <Method String String.toLowerCase()>
	//    9   15:ldc1            #67  <String "string">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #70  <Method String Application.getPackageName()>
	//   12   21:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   13   24:invokevirtual   #58  <Method String Resources.getString(int)>
	//   14   27:areturn         
	}

	public static int getRegularStringResId(String s)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_1        
		return ((Application) (backboneapplication)).getResources().getIdentifier(s.toLowerCase().replace("-", "_"), "string", ((Application) (backboneapplication)).getPackageName());
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method Resources Application.getResources()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #65  <Method String String.toLowerCase()>
	//    6   12:ldc1            #78  <String "-">
	//    7   14:ldc1            #80  <String "_">
	//    8   16:invokevirtual   #84  <Method String String.replace(CharSequence, CharSequence)>
	//    9   19:ldc1            #67  <String "string">
	//   10   21:aload_1         
	//   11   22:invokevirtual   #70  <Method String Application.getPackageName()>
	//   12   25:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   13   28:ireturn         
	}

	public static StudyId getStudyId()
	{
		if(studyId == null)
	//*   0    0:getstatic       #27  <Field StudyId studyId>
	//*   1    3:ifnonnull       10
			return StudyId.US;
	//    2    6:getstatic       #90  <Field StudyId StudyId.US>
	//    3    9:areturn         
		else
			return studyId;
	//    4   10:getstatic       #27  <Field StudyId studyId>
	//    5   13:areturn         
	}

	public static String getStudySpecificRawAsString(int i)
	{
		return FileUtils.rawResToString(getStudySpecificRawId(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #95  <Method int getStudySpecificRawId(int)>
	//    2    4:invokestatic    #39  <Method String FileUtils.rawResToString(int)>
	//    3    7:areturn         
	}

	public static int getStudySpecificRawId(int i)
	{
		StudyId studyid = getStudyId();
	//    0    0:invokestatic    #97  <Method StudyId getStudyId()>
	//    1    3:astore_1        
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    2    4:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    3    7:astore_2        
		return ((Application) (backboneapplication)).getResources().getIdentifier(studySpecificResourceName(studyid, i), "raw", ((Application) (backboneapplication)).getPackageName());
	//    4    8:aload_2         
	//    5    9:invokevirtual   #53  <Method Resources Application.getResources()>
	//    6   12:aload_1         
	//    7   13:iload_0         
	//    8   14:invokestatic    #101 <Method String studySpecificResourceName(StudyId, int)>
	//    9   17:ldc1            #103 <String "raw">
	//   10   19:aload_2         
	//   11   20:invokevirtual   #70  <Method String Application.getPackageName()>
	//   12   23:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   13   26:ireturn         
	}

	public static String getStudySpecificString(int i)
	{
		return getStudySpecificString(getStudyId(), i);
	//    0    0:invokestatic    #97  <Method StudyId getStudyId()>
	//    1    3:iload_0         
	//    2    4:invokestatic    #107 <Method String getStudySpecificString(StudyId, int)>
	//    3    7:areturn         
	}

	private static String getStudySpecificString(StudyId studyid, int i)
	{
		return getStudySpecificString(studyid, i, Locale.getDefault());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #113 <Method Locale Locale.getDefault()>
	//    3    5:invokestatic    #116 <Method String getStudySpecificString(StudyId, int, Locale)>
	//    4    8:areturn         
	}

	private static String getStudySpecificString(StudyId studyid, int i, Locale locale)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore          4
		int j;
		if(locale.equals(((Object) (Locale.getDefault()))))
	//*   2    5:aload_2         
	//*   3    6:invokestatic    #113 <Method Locale Locale.getDefault()>
	//*   4    9:invokevirtual   #120 <Method boolean Locale.equals(Object)>
	//*   5   12:ifeq            60
		{
			locale = ((Locale) (((Application) (backboneapplication)).getResources()));
	//    6   15:aload           4
	//    7   17:invokevirtual   #53  <Method Resources Application.getResources()>
	//    8   20:astore_2        
		} else
	//*   9   21:aload_2         
	//*  10   22:aload_0         
	//*  11   23:iload_1         
	//*  12   24:invokestatic    #101 <Method String studySpecificResourceName(StudyId, int)>
	//*  13   27:ldc1            #67  <String "string">
	//*  14   29:aload           4
	//*  15   31:invokevirtual   #70  <Method String Application.getPackageName()>
	//*  16   34:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//*  17   37:istore_3        
	//*  18   38:iload_3         
	//*  19   39:ifne            107
	//*  20   42:aload_0         
	//*  21   43:getstatic       #90  <Field StudyId StudyId.US>
	//*  22   46:if_acmpeq       97
	//*  23   49:getstatic       #90  <Field StudyId StudyId.US>
	//*  24   52:iload_1         
	//*  25   53:getstatic       #123 <Field Locale Locale.US>
	//*  26   56:invokestatic    #116 <Method String getStudySpecificString(StudyId, int, Locale)>
	//*  27   59:areturn         
		{
			Configuration configuration = new Configuration(((Application) (backboneapplication)).getResources().getConfiguration());
	//   28   60:new             #125 <Class Configuration>
	//   29   63:dup             
	//   30   64:aload           4
	//   31   66:invokevirtual   #53  <Method Resources Application.getResources()>
	//   32   69:invokevirtual   #129 <Method Configuration Resources.getConfiguration()>
	//   33   72:invokespecial   #132 <Method void Configuration(Configuration)>
	//   34   75:astore          5
			configuration.setLocale(locale);
	//   35   77:aload           5
	//   36   79:aload_2         
	//   37   80:invokevirtual   #136 <Method void Configuration.setLocale(Locale)>
			locale = ((Locale) (((Application) (backboneapplication)).createConfigurationContext(configuration).getResources()));
	//   38   83:aload           4
	//   39   85:aload           5
	//   40   87:invokevirtual   #140 <Method Context Application.createConfigurationContext(Configuration)>
	//   41   90:invokevirtual   #143 <Method Resources Context.getResources()>
	//   42   93:astore_2        
		}
		j = ((Resources) (locale)).getIdentifier(studySpecificResourceName(studyid, i), "string", ((Application) (backboneapplication)).getPackageName());
		if(j == 0)
		{
			if(studyid != StudyId.US)
				return getStudySpecificString(StudyId.US, i, Locale.US);
			else
	//*  43   94:goto            21
				throw new android.content.res.Resources.NotFoundException("can't find the resource");
	//   44   97:new             #145 <Class android.content.res.Resources$NotFoundException>
	//   45  100:dup             
	//   46  101:ldc1            #147 <String "can't find the resource">
	//   47  103:invokespecial   #150 <Method void android.content.res.Resources$NotFoundException(String)>
	//   48  106:athrow          
		} else
		{
			return ((Resources) (locale)).getString(j);
	//   49  107:aload_2         
	//   50  108:iload_3         
	//   51  109:invokevirtual   #58  <Method String Resources.getString(int)>
	//   52  112:areturn         
		}
	}

	private static String getStudySpecificString(StudyId studyid, String s)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_2        
		return getStudySpecificString(studyid, backboneapplication.getResources().getIdentifier(s, "string", backboneapplication.getPackageName()), Locale.getDefault());
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #152 <Method Resources BackboneApplication.getResources()>
	//    5    9:aload_1         
	//    6   10:ldc1            #67  <String "string">
	//    7   12:aload_2         
	//    8   13:invokevirtual   #153 <Method String BackboneApplication.getPackageName()>
	//    9   16:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   10   19:invokestatic    #113 <Method Locale Locale.getDefault()>
	//   11   22:invokestatic    #116 <Method String getStudySpecificString(StudyId, int, Locale)>
	//   12   25:areturn         
	}

	public static String getStudySpecificString(String s)
	{
		return getStudySpecificString(getStudyId(), s);
	//    0    0:invokestatic    #97  <Method StudyId getStudyId()>
	//    1    3:aload_0         
	//    2    4:invokestatic    #155 <Method String getStudySpecificString(StudyId, String)>
	//    3    7:areturn         
	}

	public static int getStudySpecificStringId(int i)
	{
		BackboneApplication backboneapplication = BackboneApplication.get();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_1        
		return ((Application) (backboneapplication)).getResources().getIdentifier(studySpecificResourceName(getStudyId(), i), "string", ((Application) (backboneapplication)).getPackageName());
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method Resources Application.getResources()>
	//    4    8:invokestatic    #97  <Method StudyId getStudyId()>
	//    5   11:iload_0         
	//    6   12:invokestatic    #101 <Method String studySpecificResourceName(StudyId, int)>
	//    7   15:ldc1            #67  <String "string">
	//    8   17:aload_1         
	//    9   18:invokevirtual   #70  <Method String Application.getPackageName()>
	//   10   21:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   11   24:ireturn         
	}

	public static int getStudySpecificStringId(String s)
	{
		String s1 = s.toLowerCase().replace("-", "_");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method String String.toLowerCase()>
	//    2    4:ldc1            #78  <String "-">
	//    3    6:ldc1            #80  <String "_">
	//    4    8:invokevirtual   #84  <Method String String.replace(CharSequence, CharSequence)>
	//    5   11:astore_1        
		s = ((String) (BackboneApplication.get()));
	//    6   12:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    7   15:astore_0        
		s1 = studySpecificResourceName(getStudyId(), s1);
	//    8   16:invokestatic    #97  <Method StudyId getStudyId()>
	//    9   19:aload_1         
	//   10   20:invokestatic    #158 <Method String studySpecificResourceName(StudyId, String)>
	//   11   23:astore_1        
		return ((BackboneApplication) (s)).getResources().getIdentifier(s1, "string", ((BackboneApplication) (s)).getPackageName());
	//   12   24:aload_0         
	//   13   25:invokevirtual   #152 <Method Resources BackboneApplication.getResources()>
	//   14   28:aload_1         
	//   15   29:ldc1            #67  <String "string">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #153 <Method String BackboneApplication.getPackageName()>
	//   18   35:invokevirtual   #74  <Method int Resources.getIdentifier(String, String, String)>
	//   19   38:ireturn         
	}

	public static void setAndSaveStudyId(StudyId studyid)
	{
		studyId = studyid;
	//    0    0:aload_0         
	//    1    1:putstatic       #27  <Field StudyId studyId>
		SurveyStorage.saveStudyId(studyid);
	//    2    4:aload_0         
	//    3    5:invokestatic    #163 <Method void SurveyStorage.saveStudyId(StudyId)>
	//    4    8:return          
	}

	private static String studySpecificResourceName(StudyId studyid, int i)
	{
		Resources resources = BackboneApplication.get().getResources();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #152 <Method Resources BackboneApplication.getResources()>
	//    2    6:astore_2        
		return (new StringBuilder()).append(studyid.name().toLowerCase()).append("_").append(resources.getResourceEntryName(i)).toString();
	//    3    7:new             #165 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #166 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #169 <Method String StudyId.name()>
	//    8   18:invokevirtual   #65  <Method String String.toLowerCase()>
	//    9   21:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #80  <String "_">
	//   11   26:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_2         
	//   13   30:iload_1         
	//   14   31:invokevirtual   #176 <Method String Resources.getResourceEntryName(int)>
	//   15   34:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   17   40:areturn         
	}

	private static String studySpecificResourceName(StudyId studyid, String s)
	{
		BackboneApplication.get().getResources();
	//    0    0:invokestatic    #47  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #152 <Method Resources BackboneApplication.getResources()>
	//    2    6:pop             
		return (new StringBuilder()).append(studyid.name().toLowerCase()).append("_").append(s).toString();
	//    3    7:new             #165 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #166 <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #169 <Method String StudyId.name()>
	//    8   18:invokevirtual   #65  <Method String String.toLowerCase()>
	//    9   21:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #80  <String "_">
	//   11   26:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_1         
	//   13   30:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   15   36:areturn         
	}

	public static final String EN = "en";
	public static final String ES = "es";
	private static final String TAG = "Res";
	private static StudyId studyId = SurveyStorage.loadStudyId();

	static 
	{
	//    0    0:invokestatic    #25  <Method StudyId SurveyStorage.loadStudyId()>
	//    1    3:putstatic       #27  <Field StudyId studyId>
	//*   2    6:return          
	}
}

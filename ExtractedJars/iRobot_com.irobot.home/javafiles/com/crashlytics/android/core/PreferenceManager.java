// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.SharedPreferences;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class PreferenceManager
{

	public PreferenceManager(c c1, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		preferenceStore = c1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field c preferenceStore>
		kit = crashlyticscore;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field CrashlyticsCore kit>
	//    8   14:return          
	}

	public static PreferenceManager create(c c1, CrashlyticsCore crashlyticscore)
	{
		return new PreferenceManager(c1, crashlyticscore);
	//    0    0:new             #2   <Class PreferenceManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #35  <Method void PreferenceManager(c, CrashlyticsCore)>
	//    5    9:areturn         
	}

	void setShouldAlwaysSendReports(boolean flag)
	{
		preferenceStore.a(preferenceStore.b().putBoolean("always_send_reports_opt_in", flag));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c preferenceStore>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field c preferenceStore>
	//    4    8:invokeinterface #43  <Method android.content.SharedPreferences$Editor c.b()>
	//    5   13:ldc1            #11  <String "always_send_reports_opt_in">
	//    6   15:iload_1         
	//    7   16:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   21:invokeinterface #53  <Method boolean c.a(android.content.SharedPreferences$Editor)>
	//    9   26:pop             
	//   10   27:return          
	}

	boolean shouldAlwaysSendReports()
	{
		if(!preferenceStore.a().contains("preferences_migration_complete"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field c preferenceStore>
	//*   2    4:invokeinterface #58  <Method SharedPreferences c.a()>
	//*   3    9:ldc1            #14  <String "preferences_migration_complete">
	//*   4   11:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
	//*   5   16:ifne            146
		{
			d d1 = new d(((b.a.a.a.i) (kit)));
	//    6   19:new             #66  <Class d>
	//    7   22:dup             
	//    8   23:aload_0         
	//    9   24:getfield        #30  <Field CrashlyticsCore kit>
	//   10   27:invokespecial   #69  <Method void d(b.a.a.a.i)>
	//   11   30:astore_3        
			boolean flag;
			if(!preferenceStore.a().contains("always_send_reports_opt_in") && ((c) (d1)).a().contains("always_send_reports_opt_in"))
	//*  12   31:aload_0         
	//*  13   32:getfield        #28  <Field c preferenceStore>
	//*  14   35:invokeinterface #58  <Method SharedPreferences c.a()>
	//*  15   40:ldc1            #11  <String "always_send_reports_opt_in">
	//*  16   42:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
	//*  17   47:ifne            71
	//*  18   50:aload_3         
	//*  19   51:invokeinterface #58  <Method SharedPreferences c.a()>
	//*  20   56:ldc1            #11  <String "always_send_reports_opt_in">
	//*  21   58:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
	//*  22   63:ifeq            71
				flag = true;
	//   23   66:iconst_1        
	//   24   67:istore_1        
			else
	//*  25   68:goto            73
				flag = false;
	//   26   71:iconst_0        
	//   27   72:istore_1        
			if(flag)
	//*  28   73:iload_1         
	//*  29   74:ifeq            119
			{
				boolean flag1 = ((c) (d1)).a().getBoolean("always_send_reports_opt_in", false);
	//   30   77:aload_3         
	//   31   78:invokeinterface #58  <Method SharedPreferences c.a()>
	//   32   83:ldc1            #11  <String "always_send_reports_opt_in">
	//   33   85:iconst_0        
	//   34   86:invokeinterface #73  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   35   91:istore_2        
				preferenceStore.a(preferenceStore.b().putBoolean("always_send_reports_opt_in", flag1));
	//   36   92:aload_0         
	//   37   93:getfield        #28  <Field c preferenceStore>
	//   38   96:aload_0         
	//   39   97:getfield        #28  <Field c preferenceStore>
	//   40  100:invokeinterface #43  <Method android.content.SharedPreferences$Editor c.b()>
	//   41  105:ldc1            #11  <String "always_send_reports_opt_in">
	//   42  107:iload_2         
	//   43  108:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   44  113:invokeinterface #53  <Method boolean c.a(android.content.SharedPreferences$Editor)>
	//   45  118:pop             
			}
			preferenceStore.a(preferenceStore.b().putBoolean("preferences_migration_complete", true));
	//   46  119:aload_0         
	//   47  120:getfield        #28  <Field c preferenceStore>
	//   48  123:aload_0         
	//   49  124:getfield        #28  <Field c preferenceStore>
	//   50  127:invokeinterface #43  <Method android.content.SharedPreferences$Editor c.b()>
	//   51  132:ldc1            #14  <String "preferences_migration_complete">
	//   52  134:iconst_1        
	//   53  135:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   54  140:invokeinterface #53  <Method boolean c.a(android.content.SharedPreferences$Editor)>
	//   55  145:pop             
		}
		return preferenceStore.a().getBoolean("always_send_reports_opt_in", false);
	//   56  146:aload_0         
	//   57  147:getfield        #28  <Field c preferenceStore>
	//   58  150:invokeinterface #58  <Method SharedPreferences c.a()>
	//   59  155:ldc1            #11  <String "always_send_reports_opt_in">
	//   60  157:iconst_0        
	//   61  158:invokeinterface #73  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   62  163:ireturn         
	}

	static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
	private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
	private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
	private final CrashlyticsCore kit;
	private final c preferenceStore;
}

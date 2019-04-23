// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.SharedPreferences;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class PreferenceManager
{

	public PreferenceManager(PreferenceStore preferencestore, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		preferenceStore = preferencestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field PreferenceStore preferenceStore>
		kit = crashlyticscore;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field CrashlyticsCore kit>
	//    8   14:return          
	}

	public static PreferenceManager create(PreferenceStore preferencestore, CrashlyticsCore crashlyticscore)
	{
		return new PreferenceManager(preferencestore, crashlyticscore);
	//    0    0:new             #2   <Class PreferenceManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #35  <Method void PreferenceManager(PreferenceStore, CrashlyticsCore)>
	//    5    9:areturn         
	}

	void setShouldAlwaysSendReports(boolean flag)
	{
		PreferenceStore preferencestore = preferenceStore;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PreferenceStore preferenceStore>
	//    2    4:astore_2        
		preferencestore.save(preferencestore.edit().putBoolean("always_send_reports_opt_in", flag));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #43  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #11  <String "always_send_reports_opt_in">
	//    7   14:iload_1         
	//    8   15:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   20:invokeinterface #53  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	boolean shouldAlwaysSendReports()
	{
		if(!preferenceStore.get().contains("preferences_migration_complete"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field PreferenceStore preferenceStore>
	//*   2    4:invokeinterface #59  <Method SharedPreferences PreferenceStore.get()>
	//*   3    9:ldc1            #14  <String "preferences_migration_complete">
	//*   4   11:invokeinterface #65  <Method boolean SharedPreferences.contains(String)>
	//*   5   16:ifne            144
		{
			Object obj = ((Object) (new PreferenceStoreImpl(((io.fabric.sdk.android.Kit) (kit)))));
	//    6   19:new             #67  <Class PreferenceStoreImpl>
	//    7   22:dup             
	//    8   23:aload_0         
	//    9   24:getfield        #30  <Field CrashlyticsCore kit>
	//   10   27:invokespecial   #70  <Method void PreferenceStoreImpl(io.fabric.sdk.android.Kit)>
	//   11   30:astore_3        
			boolean flag;
			if(!preferenceStore.get().contains("always_send_reports_opt_in") && ((PreferenceStore) (obj)).get().contains("always_send_reports_opt_in"))
	//*  12   31:aload_0         
	//*  13   32:getfield        #28  <Field PreferenceStore preferenceStore>
	//*  14   35:invokeinterface #59  <Method SharedPreferences PreferenceStore.get()>
	//*  15   40:ldc1            #11  <String "always_send_reports_opt_in">
	//*  16   42:invokeinterface #65  <Method boolean SharedPreferences.contains(String)>
	//*  17   47:ifne            71
	//*  18   50:aload_3         
	//*  19   51:invokeinterface #59  <Method SharedPreferences PreferenceStore.get()>
	//*  20   56:ldc1            #11  <String "always_send_reports_opt_in">
	//*  21   58:invokeinterface #65  <Method boolean SharedPreferences.contains(String)>
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
	//*  29   74:ifeq            118
			{
				boolean flag1 = ((PreferenceStore) (obj)).get().getBoolean("always_send_reports_opt_in", false);
	//   30   77:aload_3         
	//   31   78:invokeinterface #59  <Method SharedPreferences PreferenceStore.get()>
	//   32   83:ldc1            #11  <String "always_send_reports_opt_in">
	//   33   85:iconst_0        
	//   34   86:invokeinterface #74  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   35   91:istore_2        
				obj = ((Object) (preferenceStore));
	//   36   92:aload_0         
	//   37   93:getfield        #28  <Field PreferenceStore preferenceStore>
	//   38   96:astore_3        
				((PreferenceStore) (obj)).save(((PreferenceStore) (obj)).edit().putBoolean("always_send_reports_opt_in", flag1));
	//   39   97:aload_3         
	//   40   98:aload_3         
	//   41   99:invokeinterface #43  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   42  104:ldc1            #11  <String "always_send_reports_opt_in">
	//   43  106:iload_2         
	//   44  107:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   45  112:invokeinterface #53  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   46  117:pop             
			}
			obj = ((Object) (preferenceStore));
	//   47  118:aload_0         
	//   48  119:getfield        #28  <Field PreferenceStore preferenceStore>
	//   49  122:astore_3        
			((PreferenceStore) (obj)).save(((PreferenceStore) (obj)).edit().putBoolean("preferences_migration_complete", true));
	//   50  123:aload_3         
	//   51  124:aload_3         
	//   52  125:invokeinterface #43  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   53  130:ldc1            #14  <String "preferences_migration_complete">
	//   54  132:iconst_1        
	//   55  133:invokeinterface #49  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   56  138:invokeinterface #53  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   57  143:pop             
		}
		return preferenceStore.get().getBoolean("always_send_reports_opt_in", false);
	//   58  144:aload_0         
	//   59  145:getfield        #28  <Field PreferenceStore preferenceStore>
	//   60  148:invokeinterface #59  <Method SharedPreferences PreferenceStore.get()>
	//   61  153:ldc1            #11  <String "always_send_reports_opt_in">
	//   62  155:iconst_0        
	//   63  156:invokeinterface #74  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   64  161:ireturn         
	}

	static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
	private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
	private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
	private final CrashlyticsCore kit;
	private final PreferenceStore preferenceStore;
}

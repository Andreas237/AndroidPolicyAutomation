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

	public PreferenceManager(PreferenceStore preferencestore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		preferenceStore = preferencestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field PreferenceStore preferenceStore>
	//    5    9:return          
	}

	public static PreferenceManager create(PreferenceStore preferencestore, CrashlyticsCore crashlyticscore)
	{
		if(!preferencestore.get().getBoolean("preferences_migration_complete", false))
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #25  <Method SharedPreferences PreferenceStore.get()>
	//*   2    6:ldc1            #27  <String "preferences_migration_complete">
	//*   3    8:iconst_0        
	//*   4    9:invokeinterface #33  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   5   14:ifne            126
		{
			crashlyticscore = ((CrashlyticsCore) (new PreferenceStoreImpl(((io.fabric.sdk.android.Kit) (crashlyticscore)))));
	//    6   17:new             #35  <Class PreferenceStoreImpl>
	//    7   20:dup             
	//    8   21:aload_1         
	//    9   22:invokespecial   #38  <Method void PreferenceStoreImpl(io.fabric.sdk.android.Kit)>
	//   10   25:astore_1        
			boolean flag;
			if(!preferencestore.get().contains("always_send_reports_opt_in") && ((PreferenceStore) (crashlyticscore)).get().contains("always_send_reports_opt_in"))
	//*  11   26:aload_0         
	//*  12   27:invokeinterface #25  <Method SharedPreferences PreferenceStore.get()>
	//*  13   32:ldc1            #40  <String "always_send_reports_opt_in">
	//*  14   34:invokeinterface #44  <Method boolean SharedPreferences.contains(String)>
	//*  15   39:ifne            63
	//*  16   42:aload_1         
	//*  17   43:invokeinterface #25  <Method SharedPreferences PreferenceStore.get()>
	//*  18   48:ldc1            #40  <String "always_send_reports_opt_in">
	//*  19   50:invokeinterface #44  <Method boolean SharedPreferences.contains(String)>
	//*  20   55:ifeq            63
				flag = true;
	//   21   58:iconst_1        
	//   22   59:istore_2        
			else
	//*  23   60:goto            65
				flag = false;
	//   24   63:iconst_0        
	//   25   64:istore_2        
			if(flag)
	//*  26   65:iload_2         
	//*  27   66:ifeq            105
			{
				boolean flag1 = ((PreferenceStore) (crashlyticscore)).get().getBoolean("always_send_reports_opt_in", false);
	//   28   69:aload_1         
	//   29   70:invokeinterface #25  <Method SharedPreferences PreferenceStore.get()>
	//   30   75:ldc1            #40  <String "always_send_reports_opt_in">
	//   31   77:iconst_0        
	//   32   78:invokeinterface #33  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   33   83:istore_3        
				preferencestore.save(preferencestore.edit().putBoolean("always_send_reports_opt_in", flag1));
	//   34   84:aload_0         
	//   35   85:aload_0         
	//   36   86:invokeinterface #48  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   37   91:ldc1            #40  <String "always_send_reports_opt_in">
	//   38   93:iload_3         
	//   39   94:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   40   99:invokeinterface #58  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   41  104:pop             
			}
			preferencestore.save(preferencestore.edit().putBoolean("preferences_migration_complete", true));
	//   42  105:aload_0         
	//   43  106:aload_0         
	//   44  107:invokeinterface #48  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//   45  112:ldc1            #27  <String "preferences_migration_complete">
	//   46  114:iconst_1        
	//   47  115:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   48  120:invokeinterface #58  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   49  125:pop             
		}
		return new PreferenceManager(preferencestore);
	//   50  126:new             #2   <Class PreferenceManager>
	//   51  129:dup             
	//   52  130:aload_0         
	//   53  131:invokespecial   #60  <Method void PreferenceManager(PreferenceStore)>
	//   54  134:areturn         
	}

	void setShouldAlwaysSendReports(boolean flag)
	{
		PreferenceStore preferencestore = preferenceStore;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PreferenceStore preferenceStore>
	//    2    4:astore_2        
		preferencestore.save(preferencestore.edit().putBoolean("always_send_reports_opt_in", flag));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #48  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #40  <String "always_send_reports_opt_in">
	//    7   14:iload_1         
	//    8   15:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   20:invokeinterface #58  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	boolean shouldAlwaysSendReports()
	{
		return preferenceStore.get().getBoolean("always_send_reports_opt_in", false);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PreferenceStore preferenceStore>
	//    2    4:invokeinterface #25  <Method SharedPreferences PreferenceStore.get()>
	//    3    9:ldc1            #40  <String "always_send_reports_opt_in">
	//    4   11:iconst_0        
	//    5   12:invokeinterface #33  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   17:ireturn         
	}

	private final PreferenceStore preferenceStore;
}

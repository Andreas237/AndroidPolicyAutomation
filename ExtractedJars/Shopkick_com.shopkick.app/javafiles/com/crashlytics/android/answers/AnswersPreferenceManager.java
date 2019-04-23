// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

class AnswersPreferenceManager
{

	AnswersPreferenceManager(PreferenceStore preferencestore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		prefStore = preferencestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field PreferenceStore prefStore>
	//    5    9:return          
	}

	public static AnswersPreferenceManager build(Context context)
	{
		return new AnswersPreferenceManager(((PreferenceStore) (new PreferenceStoreImpl(context, "settings"))));
	//    0    0:new             #2   <Class AnswersPreferenceManager>
	//    1    3:dup             
	//    2    4:new             #25  <Class PreferenceStoreImpl>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:ldc1            #11  <String "settings">
	//    6   11:invokespecial   #28  <Method void PreferenceStoreImpl(Context, String)>
	//    7   14:invokespecial   #30  <Method void AnswersPreferenceManager(PreferenceStore)>
	//    8   17:areturn         
	}

	public boolean hasAnalyticsLaunched()
	{
		return prefStore.get().getBoolean("analytics_launched", false);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PreferenceStore prefStore>
	//    2    4:invokeinterface #41  <Method SharedPreferences PreferenceStore.get()>
	//    3    9:ldc1            #8   <String "analytics_launched">
	//    4   11:iconst_0        
	//    5   12:invokeinterface #47  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   17:ireturn         
	}

	public void setAnalyticsLaunched()
	{
		PreferenceStore preferencestore = prefStore;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PreferenceStore prefStore>
	//    2    4:astore_1        
		preferencestore.save(preferencestore.edit().putBoolean("analytics_launched", true));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokeinterface #53  <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    6   12:ldc1            #8   <String "analytics_launched">
	//    7   14:iconst_1        
	//    8   15:invokeinterface #59  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    9   20:invokeinterface #63  <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   10   25:pop             
	//   11   26:return          
	}

	static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
	static final String PREF_STORE_NAME = "settings";
	private final PreferenceStore prefStore;
}

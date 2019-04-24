// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.SharedPreferences;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;

class AnswersPreferenceManager
{

	AnswersPreferenceManager(c c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		prefStore = c1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field c prefStore>
	//    5    9:return          
	}

	public static AnswersPreferenceManager build(Context context)
	{
		return new AnswersPreferenceManager(((c) (new d(context, "settings"))));
	//    0    0:new             #2   <Class AnswersPreferenceManager>
	//    1    3:dup             
	//    2    4:new             #25  <Class d>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:ldc1            #11  <String "settings">
	//    6   11:invokespecial   #28  <Method void d(Context, String)>
	//    7   14:invokespecial   #30  <Method void AnswersPreferenceManager(c)>
	//    8   17:areturn         
	}

	public boolean hasAnalyticsLaunched()
	{
		return prefStore.a().getBoolean("analytics_launched", false);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field c prefStore>
	//    2    4:invokeinterface #41  <Method SharedPreferences c.a()>
	//    3    9:ldc1            #8   <String "analytics_launched">
	//    4   11:iconst_0        
	//    5   12:invokeinterface #47  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    6   17:ireturn         
	}

	public void setAnalyticsLaunched()
	{
		prefStore.a(prefStore.b().putBoolean("analytics_launched", true));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field c prefStore>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field c prefStore>
	//    4    8:invokeinterface #53  <Method android.content.SharedPreferences$Editor c.b()>
	//    5   13:ldc1            #8   <String "analytics_launched">
	//    6   15:iconst_1        
	//    7   16:invokeinterface #59  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    8   21:invokeinterface #62  <Method boolean c.a(android.content.SharedPreferences$Editor)>
	//    9   26:pop             
	//   10   27:return          
	}

	static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
	static final String PREF_STORE_NAME = "settings";
	private final c prefStore;
}

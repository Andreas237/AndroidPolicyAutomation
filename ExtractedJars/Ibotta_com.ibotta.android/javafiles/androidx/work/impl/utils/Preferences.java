// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences
{

	public Preferences(Context context)
	{
		this(context.getSharedPreferences("androidx.work.util.preferences", 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <String "androidx.work.util.preferences">
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #21  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5    8:invokespecial   #24  <Method void Preferences(SharedPreferences)>
	//    6   11:return          
	}

	public Preferences(SharedPreferences sharedpreferences)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mSharedPreferences = sharedpreferences;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field SharedPreferences mSharedPreferences>
	//    5    9:return          
	}

	public boolean needsReschedule()
	{
		return mSharedPreferences.getBoolean("reschedule_needed", false);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field SharedPreferences mSharedPreferences>
	//    2    4:ldc1            #37  <String "reschedule_needed">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #43  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	public void setNeedsReschedule(boolean flag)
	{
		mSharedPreferences.edit().putBoolean("reschedule_needed", flag).apply();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field SharedPreferences mSharedPreferences>
	//    2    4:invokeinterface #49  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #37  <String "reschedule_needed">
	//    4   11:iload_1         
	//    5   12:invokeinterface #55  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    6   17:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   22:return          
	}

	private SharedPreferences mSharedPreferences;
}

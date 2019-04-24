// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import java.util.Locale;

public final class LocaleHelper
{

	public LocaleHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getPersistedLocale(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getString("default_language", "");
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:ldc1            #19  <String "default_language">
	//    3    6:ldc1            #21  <String "">
	//    4    8:invokeinterface #27  <Method String SharedPreferences.getString(String, String)>
	//    5   13:areturn         
	}

	public static Context onAttach(Context context)
	{
		return setLocale(context, getPersistedLocale(context));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #31  <Method String getPersistedLocale(Context)>
	//    3    5:invokestatic    #35  <Method Context setLocale(Context, String)>
	//    4    8:areturn         
	}

	public static Context setLocale(Context context, String s)
	{
		s = ((String) (new Locale(s)));
	//    0    0:new             #37  <Class Locale>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #40  <Method void Locale(String)>
	//    4    8:astore_1        
		Locale.setDefault(((Locale) (s)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #44  <Method void Locale.setDefault(Locale)>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   7   13:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          24
	//*   9   18:icmplt          27
			return updateResources(context, ((Locale) (s)));
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokestatic    #54  <Method Context updateResources(Context, Locale)>
	//   13   26:areturn         
		else
			return updateResourcesLegacy(context, ((Locale) (s)));
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokestatic    #57  <Method Context updateResourcesLegacy(Context, Locale)>
	//   17   32:areturn         
	}

	private static Context updateResources(Context context, Locale locale)
	{
		Configuration configuration = context.getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #72  <Method Configuration Resources.getConfiguration()>
	//    3    7:astore_2        
		configuration.setLocale(locale);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #76  <Method void Configuration.setLocale(Locale)>
		configuration.setLayoutDirection(locale);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #79  <Method void Configuration.setLayoutDirection(Locale)>
		return context.createConfigurationContext(configuration);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #83  <Method Context Context.createConfigurationContext(Configuration)>
	//   13   23:areturn         
	}

	private static Context updateResourcesLegacy(Context context, Locale locale)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Resources Context.getResources()>
	//    2    4:astore_2        
		Configuration configuration = resources.getConfiguration();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #72  <Method Configuration Resources.getConfiguration()>
	//    5    9:astore_3        
		configuration.locale = locale;
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:putfield        #88  <Field Locale Configuration.locale>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   9   15:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   18:bipush          17
	//*  11   20:icmplt          28
			configuration.setLayoutDirection(locale);
	//   12   23:aload_3         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #79  <Method void Configuration.setLayoutDirection(Locale)>
		resources.updateConfiguration(configuration, resources.getDisplayMetrics());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #92  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   19   34:invokevirtual   #96  <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
		return context;
	//   20   37:aload_0         
	//   21   38:areturn         
	}
}

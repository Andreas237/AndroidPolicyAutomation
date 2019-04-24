// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;

final class zzft
{

	static void zza(Context context, String s, String s1, String s2)
	{
		context = ((Context) (context.getSharedPreferences(s, 0).edit()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #15  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    6:invokeinterface #21  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   11:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putString(s1, s2);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokeinterface #27  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   20:pop             
		((android.content.SharedPreferences.Editor) (context)).apply();
	//   11   21:aload_0         
	//   12   22:invokeinterface #31  <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   27:return          
	}
}

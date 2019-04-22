// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.firebase.client.CredentialStore;

public class AndroidCredentialStore
	implements CredentialStore
{

	public AndroidCredentialStore(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		sharedPreferences = context.getSharedPreferences("com.firebase.authentication.credentials", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "com.firebase.authentication.credentials">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #23  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #25  <Field SharedPreferences sharedPreferences>
	//    8   15:return          
	}

	private String buildKey(String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("/");
	//    8   14:aload_3         
	//    9   15:ldc1            #37  <String "/">
	//   10   17:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(s1);
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		return stringbuilder.toString();
	//   16   27:aload_3         
	//   17   28:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   18   31:areturn         
	}

	public boolean clearCredential(String s, String s1)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #49  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		editor.remove(buildKey(s, s1));
	//    4   10:aload_3         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #51  <Method String buildKey(String, String)>
	//    9   17:invokeinterface #57  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   10   22:pop             
		return editor.commit();
	//   11   23:aload_3         
	//   12   24:invokeinterface #61  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   13   29:ireturn         
	}

	public String loadCredential(String s, String s1)
	{
		return sharedPreferences.getString(buildKey(s, s1), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SharedPreferences sharedPreferences>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #51  <Method String buildKey(String, String)>
	//    6   10:aconst_null     
	//    7   11:invokeinterface #65  <Method String SharedPreferences.getString(String, String)>
	//    8   16:areturn         
	}

	public boolean storeCredential(String s, String s1, String s2)
	{
		android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SharedPreferences sharedPreferences>
	//    2    4:invokeinterface #49  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore          4
		editor.putString(buildKey(s, s1), s2);
	//    4   11:aload           4
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokespecial   #51  <Method String buildKey(String, String)>
	//    9   19:aload_3         
	//   10   20:invokeinterface #71  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   25:pop             
		return editor.commit();
	//   12   26:aload           4
	//   13   28:invokeinterface #61  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   14   33:ireturn         
	}

	private static final String ANDROID_SHARED_PREFERENCE_NAME = "com.firebase.authentication.credentials";
	private final SharedPreferences sharedPreferences;
}

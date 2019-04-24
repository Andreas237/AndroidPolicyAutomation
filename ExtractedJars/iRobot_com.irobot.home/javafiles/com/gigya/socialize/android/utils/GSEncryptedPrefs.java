// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import javax.crypto.SecretKey;

// Referenced classes of package com.gigya.socialize.android.utils:
//			SessionEncryption

public class GSEncryptedPrefs
{

	private GSEncryptedPrefs(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		settings = context.getSharedPreferences("GSLIB", 0);
	//    2    4:aload_1         
	//    3    5:ldc1            #19  <String "GSLIB">
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #25  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   11:putstatic       #27  <Field SharedPreferences settings>
		secretKey = SessionEncryption.getInstance().init(context, settings);
	//    7   14:aload_0         
	//    8   15:invokestatic    #33  <Method SessionEncryption SessionEncryption.getInstance()>
	//    9   18:aload_1         
	//   10   19:getstatic       #27  <Field SharedPreferences settings>
	//   11   22:invokevirtual   #37  <Method SecretKey SessionEncryption.init(Context, SharedPreferences)>
	//   12   25:putfield        #39  <Field SecretKey secretKey>
		if(secretKey == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #39  <Field SecretKey secretKey>
	//*  15   32:ifnonnull       52
			throw new SessionEncryption.SessionEncryptionException("SecretKey must not be null", ((Throwable) (new RuntimeException())));
	//   16   35:new             #41  <Class SessionEncryption$SessionEncryptionException>
	//   17   38:dup             
	//   18   39:ldc1            #43  <String "SecretKey must not be null">
	//   19   41:new             #45  <Class RuntimeException>
	//   20   44:dup             
	//   21   45:invokespecial   #46  <Method void RuntimeException()>
	//   22   48:invokespecial   #49  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//   23   51:athrow          
		else
			return;
	//   24   52:return          
	}

	public static GSEncryptedPrefs getInstance(Context context)
	{
		if(instance == null)
	//*   0    0:getstatic       #52  <Field GSEncryptedPrefs instance>
	//*   1    3:ifnonnull       17
			instance = new GSEncryptedPrefs(context);
	//    2    6:new             #2   <Class GSEncryptedPrefs>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #54  <Method void GSEncryptedPrefs(Context)>
	//    6   14:putstatic       #52  <Field GSEncryptedPrefs instance>
		return instance;
	//    7   17:getstatic       #52  <Field GSEncryptedPrefs instance>
	//    8   20:areturn         
	}

	public void deleteEntity(String s)
	{
		settings.edit().remove(s).apply();
	//    0    0:getstatic       #27  <Field SharedPreferences settings>
	//    1    3:invokeinterface #62  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    2    8:aload_1         
	//    3    9:invokeinterface #68  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    4   14:invokeinterface #71  <Method void android.content.SharedPreferences$Editor.apply()>
	//    5   19:return          
	}

	public SecretKey getSecretKey()
	{
		return secretKey;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SecretKey secretKey>
	//    2    4:areturn         
	}

	public String getString(String s, String s1)
	{
		return settings.getString(s, s1);
	//    0    0:getstatic       #27  <Field SharedPreferences settings>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokeinterface #77  <Method String SharedPreferences.getString(String, String)>
	//    4   10:areturn         
	}

	public void setString(String s, String s1)
	{
		android.content.SharedPreferences.Editor editor = settings.edit();
	//    0    0:getstatic       #27  <Field SharedPreferences settings>
	//    1    3:invokeinterface #62  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    2    8:astore_3        
		editor.putString(s, s1);
	//    3    9:aload_3         
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokeinterface #83  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    7   17:pop             
		editor.apply();
	//    8   18:aload_3         
	//    9   19:invokeinterface #71  <Method void android.content.SharedPreferences$Editor.apply()>
	//   10   24:return          
	}

	private static GSEncryptedPrefs instance;
	private static SharedPreferences settings;
	private SecretKey secretKey;

	static 
	{
	//    0    0:return          
	}
}

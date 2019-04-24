// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package me.pushy.sdk.config;

import android.os.Environment;

public class PushyStorage
{

	public PushyStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	public static final String EXTERNAL_STORAGE_AUTH_KEY_FILE = "registration.key";
	public static final String EXTERNAL_STORAGE_DIRECTORY;
	public static final String EXTERNAL_STORAGE_FILE_ENTERPRISE_PREFIX = "enterprise.";
	public static final String EXTERNAL_STORAGE_TOKEN_FILE = "registration.id";

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(((Object) (Environment.getExternalStorageDirectory())));
	//    4    8:aload_0         
	//    5    9:invokestatic    #28  <Method java.io.File Environment.getExternalStorageDirectory()>
	//    6   12:invokevirtual   #32  <Method StringBuilder StringBuilder.append(Object)>
	//    7   15:pop             
		stringbuilder.append("/Android/data/me.pushy.sdk/");
	//    8   16:aload_0         
	//    9   17:ldc1            #34  <String "/Android/data/me.pushy.sdk/">
	//   10   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		EXTERNAL_STORAGE_DIRECTORY = stringbuilder.toString();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   14   27:putstatic       #43  <Field String EXTERNAL_STORAGE_DIRECTORY>
	//*  15   30:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class BuildProperties
{

	BuildProperties(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		versionCode = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String versionCode>
		versionName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String versionName>
		buildId = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String buildId>
		packageName = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #22  <Field String packageName>
	//   14   25:return          
	}

	public static BuildProperties fromProperties(Properties properties)
	{
		return new BuildProperties(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
	//    0    0:new             #2   <Class BuildProperties>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "version_code">
	//    4    7:invokevirtual   #33  <Method String Properties.getProperty(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #35  <String "version_name">
	//    7   13:invokevirtual   #33  <Method String Properties.getProperty(String)>
	//    8   16:aload_0         
	//    9   17:ldc1            #37  <String "build_id">
	//   10   19:invokevirtual   #33  <Method String Properties.getProperty(String)>
	//   11   22:aload_0         
	//   12   23:ldc1            #39  <String "package_name">
	//   13   25:invokevirtual   #33  <Method String Properties.getProperty(String)>
	//   14   28:invokespecial   #41  <Method void BuildProperties(String, String, String, String)>
	//   15   31:areturn         
	}

	public static BuildProperties fromPropertiesStream(InputStream inputstream)
		throws IOException
	{
		Properties properties = new Properties();
	//    0    0:new             #29  <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void Properties()>
	//    3    7:astore_1        
		properties.load(inputstream);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #50  <Method void Properties.load(InputStream)>
		return fromProperties(properties);
	//    7   13:aload_1         
	//    8   14:invokestatic    #52  <Method BuildProperties fromProperties(Properties)>
	//    9   17:areturn         
	}

	public final String buildId;
	public final String packageName;
	public final String versionCode;
	public final String versionName;
}

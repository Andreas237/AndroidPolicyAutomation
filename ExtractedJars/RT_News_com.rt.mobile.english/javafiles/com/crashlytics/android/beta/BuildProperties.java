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
	//    1    1:invokespecial   #26  <Method void Object()>
		versionCode = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String versionCode>
		versionName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field String versionName>
		buildId = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String buildId>
		packageName = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field String packageName>
	//   14   25:return          
	}

	public static BuildProperties fromProperties(Properties properties)
	{
		return new BuildProperties(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
	//    0    0:new             #2   <Class BuildProperties>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "version_code">
	//    4    7:invokevirtual   #43  <Method String Properties.getProperty(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <String "version_name">
	//    7   13:invokevirtual   #43  <Method String Properties.getProperty(String)>
	//    8   16:aload_0         
	//    9   17:ldc1            #8   <String "build_id">
	//   10   19:invokevirtual   #43  <Method String Properties.getProperty(String)>
	//   11   22:aload_0         
	//   12   23:ldc1            #11  <String "package_name">
	//   13   25:invokevirtual   #43  <Method String Properties.getProperty(String)>
	//   14   28:invokespecial   #45  <Method void BuildProperties(String, String, String, String)>
	//   15   31:areturn         
	}

	public static BuildProperties fromPropertiesStream(InputStream inputstream)
		throws IOException
	{
		Properties properties = new Properties();
	//    0    0:new             #39  <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Properties()>
	//    3    7:astore_1        
		properties.load(inputstream);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #54  <Method void Properties.load(InputStream)>
		return fromProperties(properties);
	//    7   13:aload_1         
	//    8   14:invokestatic    #56  <Method BuildProperties fromProperties(Properties)>
	//    9   17:areturn         
	}

	private static final String BUILD_ID = "build_id";
	private static final String PACKAGE_NAME = "package_name";
	private static final String VERSION_CODE = "version_code";
	private static final String VERSION_NAME = "version_name";
	public final String buildId;
	public final String packageName;
	public final String versionCode;
	public final String versionName;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.util.VersionUtil;

public final class PackageVersion
	implements Versioned
{

	public PackageVersion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public Version version()
	{
		return VERSION;
	//    0    0:getstatic       #24  <Field Version VERSION>
	//    1    3:areturn         
	}

	public static final Version VERSION = VersionUtil.parseVersion("2.8.7", "com.fasterxml.jackson.core", "jackson-core");

	static 
	{
	//    0    0:ldc1            #12  <String "2.8.7">
	//    1    2:ldc1            #14  <String "com.fasterxml.jackson.core">
	//    2    4:ldc1            #16  <String "jackson-core">
	//    3    6:invokestatic    #22  <Method Version VersionUtil.parseVersion(String, String, String)>
	//    4    9:putstatic       #24  <Field Version VERSION>
	//*   5   12:return          
	}
}

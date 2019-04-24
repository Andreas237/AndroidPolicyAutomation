// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;


public class KitInfo
{

	public KitInfo(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		identifier = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String identifier>
		version = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String version>
		buildType = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #19  <Field String buildType>
	//   11   19:return          
	}

	public String getBuildType()
	{
		return buildType;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String buildType>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return identifier;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String identifier>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String version>
	//    2    4:areturn         
	}

	private final String buildType;
	private final String identifier;
	private final String version;
}

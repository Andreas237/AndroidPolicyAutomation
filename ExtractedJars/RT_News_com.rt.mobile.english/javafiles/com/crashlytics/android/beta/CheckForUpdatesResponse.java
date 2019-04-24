// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;


class CheckForUpdatesResponse
{

	public CheckForUpdatesResponse(String s, String s1, String s2, String s3, String s4, String s5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String url>
		versionString = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String versionString>
		displayVersion = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String displayVersion>
		buildVersion = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field String buildVersion>
		packageName = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #26  <Field String packageName>
		instanceId = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #28  <Field String instanceId>
	//   20   37:return          
	}

	public final String buildVersion;
	public final String displayVersion;
	public final String instanceId;
	public final String packageName;
	public final String url;
	public final String versionString;
}

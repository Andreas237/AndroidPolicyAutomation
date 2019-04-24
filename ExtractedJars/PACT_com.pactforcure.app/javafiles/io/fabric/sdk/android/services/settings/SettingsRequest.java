// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public class SettingsRequest
{

	public SettingsRequest(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, int i, String s10)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		apiKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String apiKey>
		deviceModel = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String deviceModel>
		osBuildVersion = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String osBuildVersion>
		osDisplayVersion = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field String osDisplayVersion>
		advertisingId = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field String advertisingId>
		installationId = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #35  <Field String installationId>
		androidId = s6;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #37  <Field String androidId>
		instanceId = s7;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #39  <Field String instanceId>
		displayVersion = s8;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #41  <Field String displayVersion>
		buildVersion = s9;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #43  <Field String buildVersion>
		source = i;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #45  <Field int source>
		iconHash = s10;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #47  <Field String iconHash>
	//   38   73:return          
	}

	public final String advertisingId;
	public final String androidId;
	public final String apiKey;
	public final String buildVersion;
	public final String deviceModel;
	public final String displayVersion;
	public final String iconHash;
	public final String installationId;
	public final String instanceId;
	public final String osBuildVersion;
	public final String osDisplayVersion;
	public final int source;
}

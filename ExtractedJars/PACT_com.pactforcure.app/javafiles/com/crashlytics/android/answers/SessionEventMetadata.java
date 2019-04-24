// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


final class SessionEventMetadata
{

	public SessionEventMetadata(String s, String s1, String s2, String s3, String s4, Boolean boolean1, String s5, 
			String s6, String s7, String s8, String s9, String s10)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		appBundleId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String appBundleId>
		executionId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String executionId>
		installationId = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field String installationId>
		androidId = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field String androidId>
		advertisingId = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field String advertisingId>
		limitAdTrackingEnabled = boolean1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #36  <Field Boolean limitAdTrackingEnabled>
		betaDeviceToken = s5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #38  <Field String betaDeviceToken>
		buildId = s6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #40  <Field String buildId>
		osVersion = s7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #42  <Field String osVersion>
		deviceModel = s8;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #44  <Field String deviceModel>
		appVersionCode = s9;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #46  <Field String appVersionCode>
		appVersionName = s10;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #48  <Field String appVersionName>
	//   38   73:return          
	}

	public String toString()
	{
		if(stringRepresentation == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field String stringRepresentation>
	//*   2    4:ifnonnull       165
			stringRepresentation = (new StringBuilder()).append("appBundleId=").append(appBundleId).append(", executionId=").append(executionId).append(", installationId=").append(installationId).append(", androidId=").append(androidId).append(", advertisingId=").append(advertisingId).append(", limitAdTrackingEnabled=").append(((Object) (limitAdTrackingEnabled))).append(", betaDeviceToken=").append(betaDeviceToken).append(", buildId=").append(buildId).append(", osVersion=").append(osVersion).append(", deviceModel=").append(deviceModel).append(", appVersionCode=").append(appVersionCode).append(", appVersionName=").append(appVersionName).toString();
	//    3    7:aload_0         
	//    4    8:new             #55  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #56  <Method void StringBuilder()>
	//    7   15:ldc1            #58  <String "appBundleId=">
	//    8   17:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field String appBundleId>
	//   11   24:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:ldc1            #64  <String ", executionId=">
	//   13   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:getfield        #28  <Field String executionId>
	//   16   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:ldc1            #66  <String ", installationId=">
	//   18   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:aload_0         
	//   20   45:getfield        #30  <Field String installationId>
	//   21   48:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   51:ldc1            #68  <String ", androidId=">
	//   23   53:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   24   56:aload_0         
	//   25   57:getfield        #32  <Field String androidId>
	//   26   60:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   63:ldc1            #70  <String ", advertisingId=">
	//   28   65:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   29   68:aload_0         
	//   30   69:getfield        #34  <Field String advertisingId>
	//   31   72:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   32   75:ldc1            #72  <String ", limitAdTrackingEnabled=">
	//   33   77:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   80:aload_0         
	//   35   81:getfield        #36  <Field Boolean limitAdTrackingEnabled>
	//   36   84:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   37   87:ldc1            #77  <String ", betaDeviceToken=">
	//   38   89:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   39   92:aload_0         
	//   40   93:getfield        #38  <Field String betaDeviceToken>
	//   41   96:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   42   99:ldc1            #79  <String ", buildId=">
	//   43  101:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   44  104:aload_0         
	//   45  105:getfield        #40  <Field String buildId>
	//   46  108:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47  111:ldc1            #81  <String ", osVersion=">
	//   48  113:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   49  116:aload_0         
	//   50  117:getfield        #42  <Field String osVersion>
	//   51  120:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   52  123:ldc1            #83  <String ", deviceModel=">
	//   53  125:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54  128:aload_0         
	//   55  129:getfield        #44  <Field String deviceModel>
	//   56  132:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   57  135:ldc1            #85  <String ", appVersionCode=">
	//   58  137:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   59  140:aload_0         
	//   60  141:getfield        #46  <Field String appVersionCode>
	//   61  144:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   62  147:ldc1            #87  <String ", appVersionName=">
	//   63  149:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   64  152:aload_0         
	//   65  153:getfield        #48  <Field String appVersionName>
	//   66  156:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   67  159:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   68  162:putfield        #53  <Field String stringRepresentation>
		return stringRepresentation;
	//   69  165:aload_0         
	//   70  166:getfield        #53  <Field String stringRepresentation>
	//   71  169:areturn         
	}

	public final String advertisingId;
	public final String androidId;
	public final String appBundleId;
	public final String appVersionCode;
	public final String appVersionName;
	public final String betaDeviceToken;
	public final String buildId;
	public final String deviceModel;
	public final String executionId;
	public final String installationId;
	public final Boolean limitAdTrackingEnabled;
	public final String osVersion;
	private String stringRepresentation;
}

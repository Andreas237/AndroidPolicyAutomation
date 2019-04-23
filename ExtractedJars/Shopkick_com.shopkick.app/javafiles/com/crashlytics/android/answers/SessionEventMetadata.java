// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


final class SessionEventMetadata
{

	public SessionEventMetadata(String s, String s1, String s2, Boolean boolean1, String s3, String s4, String s5, 
			String s6, String s7, String s8)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		appBundleId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String appBundleId>
		executionId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String executionId>
		installationId = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field String installationId>
		limitAdTrackingEnabled = boolean1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field Boolean limitAdTrackingEnabled>
		betaDeviceToken = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #32  <Field String betaDeviceToken>
		buildId = s4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #34  <Field String buildId>
		osVersion = s5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #36  <Field String osVersion>
		deviceModel = s6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #38  <Field String deviceModel>
		appVersionCode = s7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #40  <Field String appVersionCode>
		appVersionName = s8;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #42  <Field String appVersionName>
	//   32   61:return          
	}

	public String toString()
	{
		if(stringRepresentation == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field String stringRepresentation>
	//*   2    4:ifnonnull       183
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #49  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #50  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("appBundleId=");
	//    7   15:aload_1         
	//    8   16:ldc1            #52  <String "appBundleId=">
	//    9   18:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(appBundleId);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #24  <Field String appBundleId>
	//   14   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(", executionId=");
	//   16   31:aload_1         
	//   17   32:ldc1            #58  <String ", executionId=">
	//   18   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(executionId);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #26  <Field String executionId>
	//   23   43:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(", installationId=");
	//   25   47:aload_1         
	//   26   48:ldc1            #60  <String ", installationId=">
	//   27   50:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			stringbuilder.append(installationId);
	//   29   54:aload_1         
	//   30   55:aload_0         
	//   31   56:getfield        #28  <Field String installationId>
	//   32   59:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
			stringbuilder.append(", limitAdTrackingEnabled=");
	//   34   63:aload_1         
	//   35   64:ldc1            #62  <String ", limitAdTrackingEnabled=">
	//   36   66:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			stringbuilder.append(((Object) (limitAdTrackingEnabled)));
	//   38   70:aload_1         
	//   39   71:aload_0         
	//   40   72:getfield        #30  <Field Boolean limitAdTrackingEnabled>
	//   41   75:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   42   78:pop             
			stringbuilder.append(", betaDeviceToken=");
	//   43   79:aload_1         
	//   44   80:ldc1            #67  <String ", betaDeviceToken=">
	//   45   82:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(betaDeviceToken);
	//   47   86:aload_1         
	//   48   87:aload_0         
	//   49   88:getfield        #32  <Field String betaDeviceToken>
	//   50   91:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   51   94:pop             
			stringbuilder.append(", buildId=");
	//   52   95:aload_1         
	//   53   96:ldc1            #69  <String ", buildId=">
	//   54   98:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
			stringbuilder.append(buildId);
	//   56  102:aload_1         
	//   57  103:aload_0         
	//   58  104:getfield        #34  <Field String buildId>
	//   59  107:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   60  110:pop             
			stringbuilder.append(", osVersion=");
	//   61  111:aload_1         
	//   62  112:ldc1            #71  <String ", osVersion=">
	//   63  114:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   64  117:pop             
			stringbuilder.append(osVersion);
	//   65  118:aload_1         
	//   66  119:aload_0         
	//   67  120:getfield        #36  <Field String osVersion>
	//   68  123:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   69  126:pop             
			stringbuilder.append(", deviceModel=");
	//   70  127:aload_1         
	//   71  128:ldc1            #73  <String ", deviceModel=">
	//   72  130:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   73  133:pop             
			stringbuilder.append(deviceModel);
	//   74  134:aload_1         
	//   75  135:aload_0         
	//   76  136:getfield        #38  <Field String deviceModel>
	//   77  139:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   78  142:pop             
			stringbuilder.append(", appVersionCode=");
	//   79  143:aload_1         
	//   80  144:ldc1            #75  <String ", appVersionCode=">
	//   81  146:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   82  149:pop             
			stringbuilder.append(appVersionCode);
	//   83  150:aload_1         
	//   84  151:aload_0         
	//   85  152:getfield        #40  <Field String appVersionCode>
	//   86  155:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   87  158:pop             
			stringbuilder.append(", appVersionName=");
	//   88  159:aload_1         
	//   89  160:ldc1            #77  <String ", appVersionName=">
	//   90  162:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   91  165:pop             
			stringbuilder.append(appVersionName);
	//   92  166:aload_1         
	//   93  167:aload_0         
	//   94  168:getfield        #42  <Field String appVersionName>
	//   95  171:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   96  174:pop             
			stringRepresentation = stringbuilder.toString();
	//   97  175:aload_0         
	//   98  176:aload_1         
	//   99  177:invokevirtual   #79  <Method String StringBuilder.toString()>
	//  100  180:putfield        #47  <Field String stringRepresentation>
		}
		return stringRepresentation;
	//  101  183:aload_0         
	//  102  184:getfield        #47  <Field String stringRepresentation>
	//  103  187:areturn         
	}

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

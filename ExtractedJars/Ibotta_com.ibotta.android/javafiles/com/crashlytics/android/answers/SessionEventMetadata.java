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
	//*   2    4:ifnonnull       215
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #55  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #56  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("appBundleId=");
	//    7   15:aload_1         
	//    8   16:ldc1            #58  <String "appBundleId=">
	//    9   18:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(appBundleId);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #26  <Field String appBundleId>
	//   14   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(", executionId=");
	//   16   31:aload_1         
	//   17   32:ldc1            #64  <String ", executionId=">
	//   18   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(executionId);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #28  <Field String executionId>
	//   23   43:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(", installationId=");
	//   25   47:aload_1         
	//   26   48:ldc1            #66  <String ", installationId=">
	//   27   50:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			stringbuilder.append(installationId);
	//   29   54:aload_1         
	//   30   55:aload_0         
	//   31   56:getfield        #30  <Field String installationId>
	//   32   59:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
			stringbuilder.append(", androidId=");
	//   34   63:aload_1         
	//   35   64:ldc1            #68  <String ", androidId=">
	//   36   66:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			stringbuilder.append(androidId);
	//   38   70:aload_1         
	//   39   71:aload_0         
	//   40   72:getfield        #32  <Field String androidId>
	//   41   75:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			stringbuilder.append(", advertisingId=");
	//   43   79:aload_1         
	//   44   80:ldc1            #70  <String ", advertisingId=">
	//   45   82:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(advertisingId);
	//   47   86:aload_1         
	//   48   87:aload_0         
	//   49   88:getfield        #34  <Field String advertisingId>
	//   50   91:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   51   94:pop             
			stringbuilder.append(", limitAdTrackingEnabled=");
	//   52   95:aload_1         
	//   53   96:ldc1            #72  <String ", limitAdTrackingEnabled=">
	//   54   98:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
			stringbuilder.append(((Object) (limitAdTrackingEnabled)));
	//   56  102:aload_1         
	//   57  103:aload_0         
	//   58  104:getfield        #36  <Field Boolean limitAdTrackingEnabled>
	//   59  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   60  110:pop             
			stringbuilder.append(", betaDeviceToken=");
	//   61  111:aload_1         
	//   62  112:ldc1            #77  <String ", betaDeviceToken=">
	//   63  114:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   64  117:pop             
			stringbuilder.append(betaDeviceToken);
	//   65  118:aload_1         
	//   66  119:aload_0         
	//   67  120:getfield        #38  <Field String betaDeviceToken>
	//   68  123:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   69  126:pop             
			stringbuilder.append(", buildId=");
	//   70  127:aload_1         
	//   71  128:ldc1            #79  <String ", buildId=">
	//   72  130:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   73  133:pop             
			stringbuilder.append(buildId);
	//   74  134:aload_1         
	//   75  135:aload_0         
	//   76  136:getfield        #40  <Field String buildId>
	//   77  139:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   78  142:pop             
			stringbuilder.append(", osVersion=");
	//   79  143:aload_1         
	//   80  144:ldc1            #81  <String ", osVersion=">
	//   81  146:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   82  149:pop             
			stringbuilder.append(osVersion);
	//   83  150:aload_1         
	//   84  151:aload_0         
	//   85  152:getfield        #42  <Field String osVersion>
	//   86  155:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   87  158:pop             
			stringbuilder.append(", deviceModel=");
	//   88  159:aload_1         
	//   89  160:ldc1            #83  <String ", deviceModel=">
	//   90  162:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   91  165:pop             
			stringbuilder.append(deviceModel);
	//   92  166:aload_1         
	//   93  167:aload_0         
	//   94  168:getfield        #44  <Field String deviceModel>
	//   95  171:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   96  174:pop             
			stringbuilder.append(", appVersionCode=");
	//   97  175:aload_1         
	//   98  176:ldc1            #85  <String ", appVersionCode=">
	//   99  178:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  100  181:pop             
			stringbuilder.append(appVersionCode);
	//  101  182:aload_1         
	//  102  183:aload_0         
	//  103  184:getfield        #46  <Field String appVersionCode>
	//  104  187:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  105  190:pop             
			stringbuilder.append(", appVersionName=");
	//  106  191:aload_1         
	//  107  192:ldc1            #87  <String ", appVersionName=">
	//  108  194:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  109  197:pop             
			stringbuilder.append(appVersionName);
	//  110  198:aload_1         
	//  111  199:aload_0         
	//  112  200:getfield        #48  <Field String appVersionName>
	//  113  203:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  114  206:pop             
			stringRepresentation = stringbuilder.toString();
	//  115  207:aload_0         
	//  116  208:aload_1         
	//  117  209:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  118  212:putfield        #53  <Field String stringRepresentation>
		}
		return stringRepresentation;
	//  119  215:aload_0         
	//  120  216:getfield        #53  <Field String stringRepresentation>
	//  121  219:areturn         
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

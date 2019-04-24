// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			CommonUtils

public class ApiKey
{

	public ApiKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String getApiKey(Context context)
	{
		Fabric.getLogger().w("Fabric", "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.");
	//    0    0:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #27  <String "Fabric">
	//    2    5:ldc1            #29  <String "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.">
	//    3    7:invokeinterface #35  <Method void Logger.w(String, String)>
		return (new ApiKey()).getValue(context);
	//    4   12:new             #2   <Class ApiKey>
	//    5   15:dup             
	//    6   16:invokespecial   #36  <Method void ApiKey()>
	//    7   19:aload_0         
	//    8   20:invokevirtual   #39  <Method String getValue(Context)>
	//    9   23:areturn         
	}

	public static String getApiKey(Context context, boolean flag)
	{
		Fabric.getLogger().w("Fabric", "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.");
	//    0    0:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #27  <String "Fabric">
	//    2    5:ldc1            #43  <String "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.">
	//    3    7:invokeinterface #35  <Method void Logger.w(String, String)>
		return (new ApiKey()).getValue(context);
	//    4   12:new             #2   <Class ApiKey>
	//    5   15:dup             
	//    6   16:invokespecial   #36  <Method void ApiKey()>
	//    7   19:aload_0         
	//    8   20:invokevirtual   #39  <Method String getValue(Context)>
	//    9   23:areturn         
	}

	protected String buildApiKeyInstructions()
	{
		return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
	//    0    0:ldc1            #47  <String "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>">
	//    1    2:areturn         
	}

	protected String getApiKeyFromManifest(Context context)
	{
		String s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Object obj = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		String s = s1;
	//    4    5:aload_3         
	//    5    6:astore_2        
		Object obj1;
		try
		{
			obj1 = ((Object) (context.getPackageName()));
	//    6    7:aload_1         
	//    7    8:invokevirtual   #55  <Method String Context.getPackageName()>
	//    8   11:astore          5
		}
	//*   9   13:aload_3         
	//*  10   14:astore_2        
	//*  11   15:aload_1         
	//*  12   16:invokevirtual   #59  <Method PackageManager Context.getPackageManager()>
	//*  13   19:aload           5
	//*  14   21:sipush          128
	//*  15   24:invokevirtual   #65  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  16   27:getfield        #71  <Field Bundle ApplicationInfo.metaData>
	//*  17   30:astore          5
	//*  18   32:aload           4
	//*  19   34:astore_1        
	//*  20   35:aload           5
	//*  21   37:ifnull          80
	//*  22   40:aload_3         
	//*  23   41:astore_2        
	//*  24   42:aload           5
	//*  25   44:ldc1            #11  <String "io.fabric.ApiKey">
	//*  26   46:invokevirtual   #77  <Method String Bundle.getString(String)>
	//*  27   49:astore_3        
	//*  28   50:aload_3         
	//*  29   51:astore_1        
	//*  30   52:aload_3         
	//*  31   53:ifnonnull       80
	//*  32   56:aload_3         
	//*  33   57:astore_2        
	//*  34   58:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//*  35   61:ldc1            #27  <String "Fabric">
	//*  36   63:ldc1            #79  <String "Falling back to Crashlytics key lookup from Manifest">
	//*  37   65:invokeinterface #82  <Method void Logger.d(String, String)>
	//*  38   70:aload_3         
	//*  39   71:astore_2        
	//*  40   72:aload           5
	//*  41   74:ldc1            #8   <String "com.crashlytics.ApiKey">
	//*  42   76:invokevirtual   #77  <Method String Bundle.getString(String)>
	//*  43   79:astore_1        
	//*  44   80:aload_1         
	//*  45   81:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  46   82:astore_1        
		{
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Caught non-fatal exception while retrieving apiKey: ").append(((Object) (context))).toString());
	//   47   83:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//   48   86:ldc1            #27  <String "Fabric">
	//   49   88:new             #84  <Class StringBuilder>
	//   50   91:dup             
	//   51   92:invokespecial   #85  <Method void StringBuilder()>
	//   52   95:ldc1            #87  <String "Caught non-fatal exception while retrieving apiKey: ">
	//   53   97:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:aload_1         
	//   55  101:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   56  104:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   57  107:invokeinterface #82  <Method void Logger.d(String, String)>
			return s;
	//   58  112:aload_2         
	//   59  113:areturn         
		}
		s = s1;
		obj1 = ((Object) (context.getPackageManager().getApplicationInfo(((String) (obj1)), 128).metaData));
		context = ((Context) (obj));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_80;
		s = s1;
		s1 = ((Bundle) (obj1)).getString("io.fabric.ApiKey");
		context = ((Context) (s1));
		if(s1 != null)
			break MISSING_BLOCK_LABEL_80;
		s = s1;
		Fabric.getLogger().d("Fabric", "Falling back to Crashlytics key lookup from Manifest");
		s = s1;
		context = ((Context) (((Bundle) (obj1)).getString("com.crashlytics.ApiKey")));
		return ((String) (context));
	}

	protected String getApiKeyFromStrings(Context context)
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int j = CommonUtils.getResourcesIdentifier(context, "io.fabric.ApiKey", "string");
	//    2    3:aload_1         
	//    3    4:ldc1            #11  <String "io.fabric.ApiKey">
	//    4    6:ldc1            #100 <String "string">
	//    5    8:invokestatic    #106 <Method int CommonUtils.getResourcesIdentifier(Context, String, String)>
	//    6   11:istore_3        
		int i = j;
	//    7   12:iload_3         
	//    8   13:istore_2        
		if(j == 0)
	//*   9   14:iload_3         
	//*  10   15:ifne            39
		{
			Fabric.getLogger().d("Fabric", "Falling back to Crashlytics key lookup from Strings");
	//   11   18:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//   12   21:ldc1            #27  <String "Fabric">
	//   13   23:ldc1            #108 <String "Falling back to Crashlytics key lookup from Strings">
	//   14   25:invokeinterface #82  <Method void Logger.d(String, String)>
			i = CommonUtils.getResourcesIdentifier(context, "com.crashlytics.ApiKey", "string");
	//   15   30:aload_1         
	//   16   31:ldc1            #8   <String "com.crashlytics.ApiKey">
	//   17   33:ldc1            #100 <String "string">
	//   18   35:invokestatic    #106 <Method int CommonUtils.getResourcesIdentifier(Context, String, String)>
	//   19   38:istore_2        
		}
		if(i != 0)
	//*  20   39:iload_2         
	//*  21   40:ifeq            53
			s = context.getResources().getString(i);
	//   22   43:aload_1         
	//   23   44:invokevirtual   #112 <Method Resources Context.getResources()>
	//   24   47:iload_2         
	//   25   48:invokevirtual   #117 <Method String Resources.getString(int)>
	//   26   51:astore          4
		return s;
	//   27   53:aload           4
	//   28   55:areturn         
	}

	public String getValue(Context context)
	{
		String s1 = getApiKeyFromManifest(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method String getApiKeyFromManifest(Context)>
	//    3    5:astore_3        
		String s = s1;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   6    8:aload_3         
	//*   7    9:invokestatic    #125 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   12:ifeq            21
			s = getApiKeyFromStrings(context);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #127 <Method String getApiKeyFromStrings(Context)>
	//   12   20:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   21:aload_2         
	//*  14   22:invokestatic    #125 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   25:ifeq            33
			logErrorOrThrowException(context);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #131 <Method void logErrorOrThrowException(Context)>
		return s;
	//   19   33:aload_2         
	//   20   34:areturn         
	}

	protected void logErrorOrThrowException(Context context)
	{
		if(Fabric.isDebuggable() || CommonUtils.isAppDebuggable(context))
	//*   0    0:invokestatic    #135 <Method boolean Fabric.isDebuggable()>
	//*   1    3:ifne            13
	//*   2    6:aload_1         
	//*   3    7:invokestatic    #139 <Method boolean CommonUtils.isAppDebuggable(Context)>
	//*   4   10:ifeq            25
		{
			throw new IllegalArgumentException(buildApiKeyInstructions());
	//    5   13:new             #141 <Class IllegalArgumentException>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokevirtual   #143 <Method String buildApiKeyInstructions()>
	//    9   21:invokespecial   #146 <Method void IllegalArgumentException(String)>
	//   10   24:athrow          
		} else
		{
			Fabric.getLogger().e("Fabric", buildApiKeyInstructions());
	//   11   25:invokestatic    #25  <Method Logger Fabric.getLogger()>
	//   12   28:ldc1            #27  <String "Fabric">
	//   13   30:aload_0         
	//   14   31:invokevirtual   #143 <Method String buildApiKeyInstructions()>
	//   15   34:invokeinterface #149 <Method void Logger.e(String, String)>
			return;
	//   16   39:return          
		}
	}

	static final String CRASHLYTICS_API_KEY = "com.crashlytics.ApiKey";
	static final String FABRIC_API_KEY = "io.fabric.ApiKey";
}

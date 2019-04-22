// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.*;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.*;
import java.io.File;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManager

public class Answers extends Kit
{

	public Answers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Kit()>
	//    2    4:return          
	}

	protected Boolean doInBackground()
	{
		SettingsData settingsdata;
		try
		{
			settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #22  <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #26  <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:astore_1        
		}
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       28
	//*   5   11:invokestatic    #32  <Method Logger Fabric.getLogger()>
	//*   6   14:ldc1            #34  <String "Answers">
	//*   7   16:ldc1            #36  <String "Failed to retrieve settings">
	//*   8   18:invokeinterface #42  <Method void Logger.e(String, String)>
	//*   9   23:iconst_0        
	//*  10   24:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
	//*  11   27:areturn         
	//*  12   28:aload_1         
	//*  13   29:getfield        #54  <Field FeaturesSettingsData SettingsData.featuresData>
	//*  14   32:getfield        #60  <Field boolean FeaturesSettingsData.collectAnalytics>
	//*  15   35:ifeq            70
	//*  16   38:invokestatic    #32  <Method Logger Fabric.getLogger()>
	//*  17   41:ldc1            #34  <String "Answers">
	//*  18   43:ldc1            #62  <String "Analytics collection enabled">
	//*  19   45:invokeinterface #65  <Method void Logger.d(String, String)>
	//*  20   50:aload_0         
	//*  21   51:getfield        #67  <Field SessionAnalyticsManager analyticsManager>
	//*  22   54:aload_1         
	//*  23   55:getfield        #71  <Field io.fabric.sdk.android.services.settings.AnalyticsSettingsData SettingsData.analyticsSettingsData>
	//*  24   58:aload_0         
	//*  25   59:invokevirtual   #75  <Method String getOverridenSpiEndpoint()>
	//*  26   62:invokevirtual   #81  <Method void SessionAnalyticsManager.setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData, String)>
	//*  27   65:iconst_1        
	//*  28   66:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
	//*  29   69:areturn         
	//*  30   70:invokestatic    #32  <Method Logger Fabric.getLogger()>
	//*  31   73:ldc1            #34  <String "Answers">
	//*  32   75:ldc1            #83  <String "Analytics collection disabled">
	//*  33   77:invokeinterface #65  <Method void Logger.d(String, String)>
	//*  34   82:aload_0         
	//*  35   83:getfield        #67  <Field SessionAnalyticsManager analyticsManager>
	//*  36   86:invokevirtual   #86  <Method void SessionAnalyticsManager.disable()>
	//*  37   89:iconst_0        
	//*  38   90:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
	//*  39   93:areturn         
		catch(Exception exception)
	//*  40   94:astore_1        
		{
			Fabric.getLogger().e("Answers", "Error dealing with settings", ((Throwable) (exception)));
	//   41   95:invokestatic    #32  <Method Logger Fabric.getLogger()>
	//   42   98:ldc1            #34  <String "Answers">
	//   43  100:ldc1            #88  <String "Error dealing with settings">
	//   44  102:aload_1         
	//   45  103:invokeinterface #91  <Method void Logger.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   46  108:iconst_0        
	//   47  109:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
	//   48  112:areturn         
		}
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_28;
		Fabric.getLogger().e("Answers", "Failed to retrieve settings");
		return Boolean.valueOf(false);
		if(settingsdata.featuresData.collectAnalytics)
		{
			Fabric.getLogger().d("Answers", "Analytics collection enabled");
			analyticsManager.setAnalyticsSettingsData(settingsdata.analyticsSettingsData, getOverridenSpiEndpoint());
			return Boolean.valueOf(true);
		}
		Fabric.getLogger().d("Answers", "Analytics collection disabled");
		analyticsManager.disable();
		return Boolean.valueOf(false);
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:answers";
	//    0    0:ldc1            #97  <String "com.crashlytics.sdk.android:answers">
	//    1    2:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method Context getContext()>
	//    2    4:ldc1            #103 <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #109 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.3.13.dev";
	//    0    0:ldc1            #112 <String "1.3.13.dev">
	//    1    2:areturn         
	}

	public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
	{
		SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:astore_2        
		if(sessionanalyticsmanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
			sessionanalyticsmanager.onCrash(fatalexception.getSessionId(), fatalexception.getExceptionName());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #119 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getSessionId()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #122 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getExceptionName()>
	//   10   18:invokevirtual   #125 <Method void SessionAnalyticsManager.onCrash(String, String)>
	//   11   21:return          
	}

	protected boolean onPreExecute()
	{
		Context context;
		PackageManager packagemanager;
		String s1;
		PackageInfo packageinfo;
		String s2;
		context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method Context getContext()>
	//    2    4:astore          4
		packagemanager = context.getPackageManager();
	//    3    6:aload           4
	//    4    8:invokevirtual   #136 <Method PackageManager Context.getPackageManager()>
	//    5   11:astore          5
		s1 = context.getPackageName();
	//    6   13:aload           4
	//    7   15:invokevirtual   #139 <Method String Context.getPackageName()>
	//    8   18:astore          6
		packageinfo = packagemanager.getPackageInfo(s1, 0);
	//    9   20:aload           5
	//   10   22:aload           6
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #145 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   13   28:astore          7
		s2 = Integer.toString(packageinfo.versionCode);
	//   14   30:aload           7
	//   15   32:getfield        #151 <Field int PackageInfo.versionCode>
	//   16   35:invokestatic    #157 <Method String Integer.toString(int)>
	//   17   38:astore          8
		String s;
		if(packageinfo.versionName == null)
	//*  18   40:aload           7
	//*  19   42:getfield        #161 <Field String PackageInfo.versionName>
	//*  20   45:ifnonnull       54
		{
			s = "0.0";
	//   21   48:ldc1            #163 <String "0.0">
	//   22   50:astore_3        
			break MISSING_BLOCK_LABEL_60;
	//   23   51:goto            60
		}
		s = packageinfo.versionName;
	//   24   54:aload           7
	//   25   56:getfield        #161 <Field String PackageInfo.versionName>
	//   26   59:astore_3        
		long l;
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  27   60:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   63:bipush          9
	//*  29   65:icmplt          77
		{
			l = packageinfo.firstInstallTime;
	//   30   68:aload           7
	//   31   70:getfield        #172 <Field long PackageInfo.firstInstallTime>
	//   32   73:lstore_1        
			break MISSING_BLOCK_LABEL_99;
	//   33   74:goto            99
		}
		l = (new File(packagemanager.getApplicationInfo(s1, 0).sourceDir)).lastModified();
	//   34   77:new             #174 <Class File>
	//   35   80:dup             
	//   36   81:aload           5
	//   37   83:aload           6
	//   38   85:iconst_0        
	//   39   86:invokevirtual   #178 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   40   89:getfield        #183 <Field String ApplicationInfo.sourceDir>
	//   41   92:invokespecial   #186 <Method void File(String)>
	//   42   95:invokevirtual   #190 <Method long File.lastModified()>
	//   43   98:lstore_1        
		analyticsManager = SessionAnalyticsManager.build(((Kit) (this)), context, getIdManager(), s2, s, l);
	//   44   99:aload_0         
	//   45  100:aload_0         
	//   46  101:aload           4
	//   47  103:aload_0         
	//   48  104:invokevirtual   #194 <Method io.fabric.sdk.android.services.common.IdManager getIdManager()>
	//   49  107:aload           8
	//   50  109:aload_3         
	//   51  110:lload_1         
	//   52  111:invokestatic    #198 <Method SessionAnalyticsManager SessionAnalyticsManager.build(Kit, Context, io.fabric.sdk.android.services.common.IdManager, String, String, long)>
	//   53  114:putfield        #67  <Field SessionAnalyticsManager analyticsManager>
		analyticsManager.enable();
	//   54  117:aload_0         
	//   55  118:getfield        #67  <Field SessionAnalyticsManager analyticsManager>
	//   56  121:invokevirtual   #201 <Method void SessionAnalyticsManager.enable()>
		return true;
	//   57  124:iconst_1        
	//   58  125:ireturn         
		Exception exception;
		exception;
	//   59  126:astore_3        
		Fabric.getLogger().e("Answers", "Error retrieving app properties", ((Throwable) (exception)));
	//   60  127:invokestatic    #32  <Method Logger Fabric.getLogger()>
	//   61  130:ldc1            #34  <String "Answers">
	//   62  132:ldc1            #203 <String "Error retrieving app properties">
	//   63  134:aload_3         
	//   64  135:invokeinterface #91  <Method void Logger.e(String, String, Throwable)>
		return false;
	//   65  140:iconst_0        
	//   66  141:ireturn         
	}

	SessionAnalyticsManager analyticsManager;
}

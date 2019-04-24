// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//			AnalyticsSettingsData, AppSettingsData, BetaSettingsData, FeaturesSettingsData, 
//			PromptSettingsData, SessionSettingsData

public class SettingsData
{

	public SettingsData(long l, AppSettingsData appsettingsdata, SessionSettingsData sessionsettingsdata, PromptSettingsData promptsettingsdata, FeaturesSettingsData featuressettingsdata, AnalyticsSettingsData analyticssettingsdata, 
			BetaSettingsData betasettingsdata, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		expiresAtMillis = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #28  <Field long expiresAtMillis>
		appData = appsettingsdata;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #30  <Field AppSettingsData appData>
		sessionData = sessionsettingsdata;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #32  <Field SessionSettingsData sessionData>
		promptData = promptsettingsdata;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #34  <Field PromptSettingsData promptData>
		featuresData = featuressettingsdata;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #36  <Field FeaturesSettingsData featuresData>
		settingsVersion = i;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #38  <Field int settingsVersion>
		cacheDuration = j;
	//   20   38:aload_0         
	//   21   39:iload           10
	//   22   41:putfield        #40  <Field int cacheDuration>
		analyticsSettingsData = analyticssettingsdata;
	//   23   44:aload_0         
	//   24   45:aload           7
	//   25   47:putfield        #42  <Field AnalyticsSettingsData analyticsSettingsData>
		betaSettingsData = betasettingsdata;
	//   26   50:aload_0         
	//   27   51:aload           8
	//   28   53:putfield        #44  <Field BetaSettingsData betaSettingsData>
	//   29   56:return          
	}

	public boolean isExpired(long l)
	{
		return expiresAtMillis < l;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long expiresAtMillis>
	//    2    4:lload_1         
	//    3    5:lcmp            
	//    4    6:ifge            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final AnalyticsSettingsData analyticsSettingsData;
	public final AppSettingsData appData;
	public final BetaSettingsData betaSettingsData;
	public final int cacheDuration;
	public final long expiresAtMillis;
	public final FeaturesSettingsData featuresData;
	public final PromptSettingsData promptData;
	public final SessionSettingsData sessionData;
	public final int settingsVersion;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class CrashlyticsCore$5
	implements io.fabric.sdk.android.services.settings.ccess
{

	public Boolean usingSettings(SettingsData settingsdata)
	{
		if(settingsdata.featuresData.promptEnabled)
	//*   0    0:aload_1         
	//*   1    1:getfield        #30  <Field FeaturesSettingsData SettingsData.featuresData>
	//*   2    4:getfield        #36  <Field boolean FeaturesSettingsData.promptEnabled>
	//*   3    7:ifeq            23
			return Boolean.valueOf(shouldSendReportsWithoutPrompting() ^ true);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field CrashlyticsCore this$0>
	//    6   14:invokevirtual   #39  <Method boolean CrashlyticsCore.shouldSendReportsWithoutPrompting()>
	//    7   17:iconst_1        
	//    8   18:ixor            
	//    9   19:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   10   22:areturn         
		else
			return Boolean.valueOf(false);
	//   11   23:iconst_0        
	//   12   24:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public volatile Object usingSettings(SettingsData settingsdata)
	{
		return ((Object) (usingSettings(settingsdata)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method Boolean usingSettings(SettingsData)>
	//    3    5:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$5()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

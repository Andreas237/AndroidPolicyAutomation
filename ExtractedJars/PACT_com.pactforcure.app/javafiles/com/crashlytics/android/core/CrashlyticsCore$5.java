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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(settingsdata.featuresData.promptEnabled)
	//*   2    2:aload_1         
	//*   3    3:getfield        #30  <Field FeaturesSettingsData SettingsData.featuresData>
	//*   4    6:getfield        #36  <Field boolean FeaturesSettingsData.promptEnabled>
	//*   5    9:ifeq            29
		{
			if(!shouldSendReportsWithoutPrompting())
	//*   6   12:aload_0         
	//*   7   13:getfield        #18  <Field CrashlyticsCore this$0>
	//*   8   16:invokevirtual   #39  <Method boolean CrashlyticsCore.shouldSendReportsWithoutPrompting()>
	//*   9   19:ifne            24
				flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_2        
			return Boolean.valueOf(flag);
	//   12   24:iload_2         
	//   13   25:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   14   28:areturn         
		} else
		{
			return Boolean.valueOf(false);
	//   15   29:iconst_0        
	//   16   30:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:areturn         
		}
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

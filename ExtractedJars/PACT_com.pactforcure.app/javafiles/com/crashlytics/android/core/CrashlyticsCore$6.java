// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.settings.SettingsData;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore

class CrashlyticsCore$6
	implements io.fabric.sdk.android.services.settings.ccess
{

	public Boolean usingSettings(SettingsData settingsdata)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		Activity activity = getFabric().getCurrentActivity();
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field CrashlyticsCore this$0>
	//    4    6:invokevirtual   #28  <Method Fabric CrashlyticsCore.getFabric()>
	//    5    9:invokevirtual   #34  <Method Activity Fabric.getCurrentActivity()>
	//    6   12:astore          4
		boolean flag = flag1;
	//    7   14:iload_3         
	//    8   15:istore_2        
		if(activity != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          57
		{
			flag = flag1;
	//   11   21:iload_3         
	//   12   22:istore_2        
			if(!activity.isFinishing())
	//*  13   23:aload           4
	//*  14   25:invokevirtual   #39  <Method boolean Activity.isFinishing()>
	//*  15   28:ifne            57
			{
				flag = flag1;
	//   16   31:iload_3         
	//   17   32:istore_2        
				if(shouldPromptUserBeforeSendingCrashReports())
	//*  18   33:aload_0         
	//*  19   34:getfield        #18  <Field CrashlyticsCore this$0>
	//*  20   37:invokevirtual   #42  <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
	//*  21   40:ifeq            57
					flag = CrashlyticsCore.access$200(CrashlyticsCore.this, activity, settingsdata.promptData);
	//   22   43:aload_0         
	//   23   44:getfield        #18  <Field CrashlyticsCore this$0>
	//   24   47:aload           4
	//   25   49:aload_1         
	//   26   50:getfield        #48  <Field io.fabric.sdk.android.services.settings.PromptSettingsData SettingsData.promptData>
	//   27   53:invokestatic    #52  <Method boolean CrashlyticsCore.access$200(CrashlyticsCore, Activity, io.fabric.sdk.android.services.settings.PromptSettingsData)>
	//   28   56:istore_2        
			}
		}
		return Boolean.valueOf(flag);
	//   29   57:iload_2         
	//   30   58:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   31   61:areturn         
	}

	public volatile Object usingSettings(SettingsData settingsdata)
	{
		return ((Object) (usingSettings(settingsdata)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method Boolean usingSettings(SettingsData)>
	//    3    5:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$6()
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

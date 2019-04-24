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
		Activity activity = getFabric().getCurrentActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
	//    2    4:invokevirtual   #28  <Method Fabric CrashlyticsCore.getFabric()>
	//    3    7:invokevirtual   #34  <Method Activity Fabric.getCurrentActivity()>
	//    4   10:astore_3        
		boolean flag;
		if(activity != null && !activity.isFinishing() && shouldPromptUserBeforeSendingCrashReports())
	//*   5   11:aload_3         
	//*   6   12:ifnull          48
	//*   7   15:aload_3         
	//*   8   16:invokevirtual   #39  <Method boolean Activity.isFinishing()>
	//*   9   19:ifne            48
	//*  10   22:aload_0         
	//*  11   23:getfield        #18  <Field CrashlyticsCore this$0>
	//*  12   26:invokevirtual   #42  <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
	//*  13   29:ifeq            48
			flag = CrashlyticsCore.access$200(CrashlyticsCore.this, activity, settingsdata.promptData);
	//   14   32:aload_0         
	//   15   33:getfield        #18  <Field CrashlyticsCore this$0>
	//   16   36:aload_3         
	//   17   37:aload_1         
	//   18   38:getfield        #48  <Field io.fabric.sdk.android.services.settings.PromptSettingsData SettingsData.promptData>
	//   19   41:invokestatic    #52  <Method boolean CrashlyticsCore.access$200(CrashlyticsCore, Activity, io.fabric.sdk.android.services.settings.PromptSettingsData)>
	//   20   44:istore_2        
		else
	//*  21   45:goto            50
			flag = true;
	//   22   48:iconst_1        
	//   23   49:istore_2        
		return Boolean.valueOf(flag);
	//   24   50:iload_2         
	//   25   51:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   26   54:areturn         
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

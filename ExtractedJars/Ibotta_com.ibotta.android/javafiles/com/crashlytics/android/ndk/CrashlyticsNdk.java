// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsKitBinder;
import com.crashlytics.android.core.internal.CrashEventDataProvider;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

// Referenced classes of package com.crashlytics.android.ndk:
//			NdkKitController, NdkKitControllerImpl

public class CrashlyticsNdk extends Kit
	implements CrashEventDataProvider
{

	public CrashlyticsNdk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Kit()>
	//    2    4:return          
	}

	public static CrashlyticsNdk getInstance()
	{
		return (CrashlyticsNdk)Fabric.getKit(com/crashlytics/android/ndk/CrashlyticsNdk);
	//    0    0:ldc1            #2   <Class CrashlyticsNdk>
	//    1    2:invokestatic    #22  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class CrashlyticsNdk>
	//    3    8:areturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		kitController.loadPreviousCrashData();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NdkKitController kitController>
	//    2    4:invokeinterface #34  <Method void NdkKitController.loadPreviousCrashData()>
		kitController.clearCachedData();
	//    3    9:aload_0         
	//    4   10:getfield        #29  <Field NdkKitController kitController>
	//    5   13:invokeinterface #37  <Method void NdkKitController.clearCachedData()>
		return null;
	//    6   18:aconst_null     
	//    7   19:areturn         
	}

	public SessionEventData getCrashEventData()
	{
		return kitController.getPreviousCrashData();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field NdkKitController kitController>
	//    2    4:invokeinterface #42  <Method SessionEventData NdkKitController.getPreviousCrashData()>
	//    3    9:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-ndk";
	//    0    0:ldc1            #46  <String "com.crashlytics.sdk.android.crashlytics-ndk">
	//    1    2:areturn         
	}

	public String getVersion()
	{
		return "1.1.6.167";
	//    0    0:ldc1            #49  <String "1.1.6.167">
	//    1    2:areturn         
	}

	protected boolean onPreExecute()
	{
		CrashlyticsCore crashlyticscore = (CrashlyticsCore)Fabric.getKit(com/crashlytics/android/core/CrashlyticsCore);
	//    0    0:ldc1            #53  <Class CrashlyticsCore>
	//    1    2:invokestatic    #22  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #53  <Class CrashlyticsCore>
	//    3    8:astore_1        
		if(crashlyticscore != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          30
			return onPreExecute(NdkKitControllerImpl.create(this), crashlyticscore, new CrashlyticsKitBinder());
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:invokestatic    #59  <Method NdkKitController NdkKitControllerImpl.create(CrashlyticsNdk)>
	//    9   18:aload_1         
	//   10   19:new             #61  <Class CrashlyticsKitBinder>
	//   11   22:dup             
	//   12   23:invokespecial   #62  <Method void CrashlyticsKitBinder()>
	//   13   26:invokevirtual   #65  <Method boolean onPreExecute(NdkKitController, CrashlyticsCore, CrashlyticsKitBinder)>
	//   14   29:ireturn         
		else
			throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
	//   15   30:new             #67  <Class UnmetDependencyException>
	//   16   33:dup             
	//   17   34:ldc1            #69  <String "CrashlyticsNdk requires Crashlytics">
	//   18   36:invokespecial   #72  <Method void UnmetDependencyException(String)>
	//   19   39:athrow          
	}

	boolean onPreExecute(NdkKitController ndkkitcontroller, CrashlyticsCore crashlyticscore, CrashlyticsKitBinder crashlyticskitbinder)
	{
		kitController = ndkkitcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field NdkKitController kitController>
		boolean flag = ndkkitcontroller.initialize(getContext());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method android.content.Context getContext()>
	//    6   10:invokeinterface #80  <Method boolean NdkKitController.initialize(android.content.Context)>
	//    7   15:istore          4
		if(flag)
	//*   8   17:iload           4
	//*   9   19:ifeq            40
		{
			crashlyticskitbinder.bindCrashEventDataProvider(crashlyticscore, this);
	//   10   22:aload_3         
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #84  <Method void CrashlyticsKitBinder.bindCrashEventDataProvider(CrashlyticsCore, CrashlyticsNdk)>
			Fabric.getLogger().d("CrashlyticsNdk", "Crashlytics NDK initialization successful");
	//   14   28:invokestatic    #88  <Method Logger Fabric.getLogger()>
	//   15   31:ldc1            #90  <String "CrashlyticsNdk">
	//   16   33:ldc1            #92  <String "Crashlytics NDK initialization successful">
	//   17   35:invokeinterface #98  <Method void Logger.d(String, String)>
		}
		return flag;
	//   18   40:iload           4
	//   19   42:ireturn         
	}

	private NdkKitController kitController;
}

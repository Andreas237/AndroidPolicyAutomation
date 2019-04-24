// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsFileMarker

class CrashlyticsCore$3
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		boolean flag;
		try
		{
			flag = CrashlyticsCore.access$100(CrashlyticsCore.this).remove();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
	//    2    4:invokestatic    #29  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
	//    3    7:invokevirtual   #35  <Method boolean CrashlyticsFileMarker.remove()>
	//    4   10:istore_1        
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
	//    5   11:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//    6   14:ldc1            #43  <String "CrashlyticsCore">
	//    7   16:new             #45  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #46  <Method void StringBuilder()>
	//   10   23:ldc1            #48  <String "Initialization marker file removed: ">
	//   11   25:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:iload_1         
	//   13   29:invokevirtual   #55  <Method StringBuilder StringBuilder.append(boolean)>
	//   14   32:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   15   35:invokeinterface #65  <Method void Logger.d(String, String)>
		}
	//*  16   40:iload_1         
	//*  17   41:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//*  18   44:areturn         
		catch(Exception exception)
	//*  19   45:astore_2        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", ((Throwable) (exception)));
	//   20   46:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   21   49:ldc1            #43  <String "CrashlyticsCore">
	//   22   51:ldc1            #73  <String "Problem encountered deleting Crashlytics initialization marker.">
	//   23   53:aload_2         
	//   24   54:invokeinterface #77  <Method void Logger.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   25   59:iconst_0        
	//   26   60:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   27   63:areturn         
		}
		return Boolean.valueOf(flag);
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$3()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

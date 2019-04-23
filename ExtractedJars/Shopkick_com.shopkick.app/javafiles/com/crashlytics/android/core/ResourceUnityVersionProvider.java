// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.crashlytics.android.core:
//			UnityVersionProvider

class ResourceUnityVersionProvider
	implements UnityVersionProvider
{

	public ResourceUnityVersionProvider(Context context1, UnityVersionProvider unityversionprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		hasRead = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean hasRead>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field Context context>
		fallback = unityversionprovider;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #25  <Field UnityVersionProvider fallback>
	//   11   19:return          
	}

	public String getUnityVersion()
	{
		if(!hasRead)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean hasRead>
	//*   2    4:ifne            23
		{
			unityVersion = CommonUtils.resolveUnityEditorVersion(context);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field Context context>
	//    6   12:invokestatic    #34  <Method String CommonUtils.resolveUnityEditorVersion(Context)>
	//    7   15:putfield        #36  <Field String unityVersion>
			hasRead = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #21  <Field boolean hasRead>
		}
		Object obj = ((Object) (unityVersion));
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field String unityVersion>
	//   13   27:astore_1        
		if(obj != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          34
			return ((String) (obj));
	//   16   32:aload_1         
	//   17   33:areturn         
		obj = ((Object) (fallback));
	//   18   34:aload_0         
	//   19   35:getfield        #25  <Field UnityVersionProvider fallback>
	//   20   38:astore_1        
		if(obj != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          50
			return ((UnityVersionProvider) (obj)).getUnityVersion();
	//   23   43:aload_1         
	//   24   44:invokeinterface #38  <Method String UnityVersionProvider.getUnityVersion()>
	//   25   49:areturn         
		else
			return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
	}

	private final Context context;
	private final UnityVersionProvider fallback;
	private boolean hasRead;
	private String unityVersion;
}

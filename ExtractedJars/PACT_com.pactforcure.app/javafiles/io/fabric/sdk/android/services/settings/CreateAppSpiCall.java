// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequestFactory;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			AbstractAppSpiCall, AppRequestData

public class CreateAppSpiCall extends AbstractAppSpiCall
{

	public CreateAppSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory)
	{
		super(kit, s, s1, httprequestfactory, HttpMethod.POST);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #12  <Field HttpMethod HttpMethod.POST>
	//    6    9:invokespecial   #15  <Method void AbstractAppSpiCall(Kit, String, String, HttpRequestFactory, HttpMethod)>
	//    7   12:return          
	}

	public volatile boolean invoke(AppRequestData apprequestdata)
	{
		return super.invoke(apprequestdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method boolean AbstractAppSpiCall.invoke(AppRequestData)>
	//    3    5:ireturn         
	}
}

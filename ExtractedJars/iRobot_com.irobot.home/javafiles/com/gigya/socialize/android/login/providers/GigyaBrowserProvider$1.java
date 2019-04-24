// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.gigya.socialize.*;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GigyaBrowserProvider

class GigyaBrowserProvider$1
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #37  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            24
			val$params.put("gmidTicket", gsresponse.getString("gmidTicket", ""));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field GSObject val$params>
	//    5   11:ldc1            #39  <String "gmidTicket">
	//    6   13:aload_2         
	//    7   14:ldc1            #39  <String "gmidTicket">
	//    8   16:ldc1            #41  <String "">
	//    9   18:invokevirtual   #45  <Method String GSResponse.getString(String, String)>
	//   10   21:invokevirtual   #51  <Method void GSObject.put(String, String)>
		GigyaBrowserProvider.access$000(GigyaBrowserProvider.this, val$params, val$callback);
	//   11   24:aload_0         
	//   12   25:getfield        #21  <Field GigyaBrowserProvider this$0>
	//   13   28:aload_0         
	//   14   29:getfield        #23  <Field GSObject val$params>
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field LoginProvider$ProviderCallback val$callback>
	//   17   36:invokestatic    #54  <Method void GigyaBrowserProvider.access$000(GigyaBrowserProvider, GSObject, LoginProvider$ProviderCallback)>
	//   18   39:return          
	}

	final GigyaBrowserProvider this$0;
	final allback val$callback;
	final GSObject val$params;

	GigyaBrowserProvider$1()
	{
		this$0 = final_gigyabrowserprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GigyaBrowserProvider this$0>
		val$params = gsobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field GSObject val$params>
		val$callback = allback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

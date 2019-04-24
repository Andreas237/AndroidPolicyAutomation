// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GigyaBrowserProvider

class GigyaBrowserProvider$2
	implements inActivityCallback
{

	public void onResponse(GSObject gsobject)
	{
		if(val$callback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
	//*   2    4:ifnull          17
			val$callback.onResponse(gsobject);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
	//    5   11:aload_1         
	//    6   12:invokeinterface #31  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
	//    7   17:return          
	}

	final GigyaBrowserProvider this$0;
	final allback val$callback;

	GigyaBrowserProvider$2()
	{
		this$0 = final_gigyabrowserprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GigyaBrowserProvider this$0>
		val$callback = allback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

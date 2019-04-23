// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CloudSearchController, CraftARCloudRecognition, CraftARSearchResponseHandler, CraftARError

class CloudSearchController$2
	implements Runnable
{

	public void run()
	{
		CraftARSearchResponseHandler craftarsearchresponsehandler = mCloudIR.getCraftARSearchResponseHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CloudSearchController this$0>
	//    2    4:getfield        #30  <Field CraftARCloudRecognition CloudSearchController.mCloudIR>
	//    3    7:invokevirtual   #36  <Method CraftARSearchResponseHandler CraftARCloudRecognition.getCraftARSearchResponseHandler()>
	//    4   10:astore_1        
		if(craftarsearchresponsehandler != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
			craftarsearchresponsehandler.searchFailed(val$error, -1);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field CraftARError val$error>
	//   10   20:iconst_m1       
	//   11   21:invokeinterface #42  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
	//   12   26:return          
	}

	final CloudSearchController this$0;
	final CraftARError val$error;

	CloudSearchController$2()
	{
		this$0 = final_cloudsearchcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CloudSearchController this$0>
		val$error = CraftARError.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CraftARError val$error>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

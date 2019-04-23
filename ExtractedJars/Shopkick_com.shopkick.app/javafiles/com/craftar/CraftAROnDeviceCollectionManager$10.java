// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftARError

class CraftAROnDeviceCollectionManager$10
	implements Runnable
{

	public void run()
	{
		CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR, "Collection could not be added, bundle is invalid. Only .zip extension is allowed at this moment");
	//    0    0:new             #28  <Class CraftARError>
	//    1    3:dup             
	//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_EXTRACT_ERROR>
	//    3    7:ldc1            #36  <String "Collection could not be added, bundle is invalid. Only .zip extension is allowed at this moment">
	//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    5   12:astore_1        
		val$collectionEventsHandler.addCollectionFailed(craftarerror);
	//    6   13:aload_0         
	//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
	//    8   17:aload_1         
	//    9   18:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//   10   23:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final CollectionListener val$collectionEventsHandler;

	CraftAROnDeviceCollectionManager$10()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
		val$collectionEventsHandler = CollectionListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection

class CraftAROnDeviceCollectionManager$11
	implements Runnable
{

	public void run()
	{
		val$collectionEventsHandler.collectionAdded(val$newCollection);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$newCollection>
	//    4    8:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.collectionAdded(CraftAROnDeviceCollection)>
	//    5   13:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final CollectionListener val$collectionEventsHandler;
	final CraftAROnDeviceCollection val$newCollection;

	CraftAROnDeviceCollectionManager$11()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
		val$collectionEventsHandler = collectionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$collectionEventsHandler>
		val$newCollection = CraftAROnDeviceCollection.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CraftAROnDeviceCollection val$newCollection>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

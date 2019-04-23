// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection

class CraftAROnDeviceCollectionManager$1
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceCollectionManager.access$000(CraftAROnDeviceCollectionManager.this, val$collection, val$token, val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field CraftAROnDeviceCollection val$collection>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field String val$token>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field CraftAROnDeviceCollectionManager$SyncCollectionListener val$listener>
	//    8   16:invokestatic    #37  <Method void CraftAROnDeviceCollectionManager.access$000(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
	//    9   19:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final CraftAROnDeviceCollection val$collection;
	final ncCollectionListener val$listener;
	final String val$token;

	CraftAROnDeviceCollectionManager$1()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftAROnDeviceCollectionManager this$0>
		val$collection = craftarondevicecollection;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field CraftAROnDeviceCollection val$collection>
		val$token = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field String val$token>
		val$listener = ncCollectionListener.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field CraftAROnDeviceCollectionManager$SyncCollectionListener val$listener>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}

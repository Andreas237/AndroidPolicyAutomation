// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$12
	implements Runnable
{

	public void run()
	{
		CollectionListener collectionlistener = val$addCollectionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
	//    2    4:astore_1        
		if(collectionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			collectionlistener.addCollectionProgress(val$progress);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field float val$progress>
	//    8   14:invokeinterface #36  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
	//    9   19:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final CollectionListener val$addCollectionListener;
	final float val$progress;

	CraftAROnDeviceCollectionManager$12()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
		val$addCollectionListener = collectionlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
		val$progress = F.this;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #25  <Field float val$progress>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

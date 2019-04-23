// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$9
	implements Runnable
{

	public void run()
	{
		CraftAROnDeviceCollection craftarondevicecollection = CraftAROnDeviceCollectionManager.access$500(CraftAROnDeviceCollectionManager.this, val$bundleFileName, val$addCollectionListener);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String val$bundleFileName>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
	//    6   12:invokestatic    #34  <Method CraftAROnDeviceCollection CraftAROnDeviceCollectionManager.access$500(CraftAROnDeviceCollectionManager, String, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//    7   15:astore_1        
		if(craftarondevicecollection != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          32
			CraftAROnDeviceCollectionManager.access$300(CraftAROnDeviceCollectionManager.this, craftarondevicecollection, val$addCollectionListener);
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
	//   15   29:invokestatic    #38  <Method void CraftAROnDeviceCollectionManager.access$300(CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$AddCollectionListener)>
	//   16   32:return          
	}

	final CraftAROnDeviceCollectionManager this$0;
	final dCollectionListener val$addCollectionListener;
	final String val$bundleFileName;

	CraftAROnDeviceCollectionManager$9()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftAROnDeviceCollectionManager this$0>
		val$bundleFileName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$bundleFileName>
		val$addCollectionListener = dCollectionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$addCollectionListener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

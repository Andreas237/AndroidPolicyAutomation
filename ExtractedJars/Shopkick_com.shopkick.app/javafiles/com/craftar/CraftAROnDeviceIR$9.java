// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, SetOnDeviceCollectionListener

class CraftAROnDeviceIR$9
	implements Runnable
{

	public void run()
	{
		SetOnDeviceCollectionListener setondevicecollectionlistener = val$setCollectionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
	//    2    4:astore_1        
		if(setondevicecollectionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			setondevicecollectionlistener.collectionReady(((java.util.List) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokeinterface #32  <Method void SetOnDeviceCollectionListener.collectionReady(java.util.List)>
	//    8   16:return          
	}

	final CraftAROnDeviceIR this$0;
	final SetOnDeviceCollectionListener val$setCollectionListener;

	CraftAROnDeviceIR$9()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftAROnDeviceIR this$0>
		val$setCollectionListener = SetOnDeviceCollectionListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

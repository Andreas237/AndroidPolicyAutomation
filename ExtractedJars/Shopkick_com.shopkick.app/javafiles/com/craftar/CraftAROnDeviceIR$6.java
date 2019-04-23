// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftARError, SetOnDeviceCollectionListener, CLog

class CraftAROnDeviceIR$6
	implements Runnable
{

	public void run()
	{
		CraftARError craftarerror = new CraftARError(ODES.COLLECTION_INVALID, "Collection is null");
	//    0    0:new             #28  <Class CraftARError>
	//    1    3:dup             
	//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_INVALID>
	//    3    7:ldc1            #36  <String "Collection is null">
	//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    5   12:astore_1        
		SetOnDeviceCollectionListener setondevicecollectionlistener = val$setCollectionListener;
	//    6   13:aload_0         
	//    7   14:getfield        #21  <Field SetOnDeviceCollectionListener val$setCollectionListener>
	//    8   17:astore_2        
		if(setondevicecollectionlistener != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          30
		{
			setondevicecollectionlistener.setCollectionFailed(craftarerror);
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:invokeinterface #45  <Method void SetOnDeviceCollectionListener.setCollectionFailed(CraftARError)>
			return;
	//   14   29:return          
		} else
		{
			CLog.e(craftarerror.getErrorMessage());
	//   15   30:aload_1         
	//   16   31:invokevirtual   #49  <Method String CraftARError.getErrorMessage()>
	//   17   34:invokestatic    #55  <Method void CLog.e(String)>
			return;
	//   18   37:return          
		}
	}

	final CraftAROnDeviceIR this$0;
	final SetOnDeviceCollectionListener val$setCollectionListener;

	CraftAROnDeviceIR$6()
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

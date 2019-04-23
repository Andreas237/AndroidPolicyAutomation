// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftARError, CLog

class CraftAROnDeviceCollectionManager$3
	implements Runnable
{

	public void run()
	{
		CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR, "Collection not found");
	//    0    0:new             #28  <Class CraftARError>
	//    1    3:dup             
	//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.COLLECTION_MANAGER_DELETE_ERROR>
	//    3    7:ldc1            #36  <String "Collection not found">
	//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    5   12:astore_1        
		leteCollectionListener letecollectionlistener = val$listener;
	//    6   13:aload_0         
	//    7   14:getfield        #21  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
	//    8   17:astore_2        
		if(letecollectionlistener != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          30
		{
			letecollectionlistener.deleteCollectionFailed(craftarerror);
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:invokeinterface #45  <Method void CraftAROnDeviceCollectionManager$DeleteCollectionListener.deleteCollectionFailed(CraftARError)>
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

	final CraftAROnDeviceCollectionManager this$0;
	final leteCollectionListener val$listener;

	CraftAROnDeviceCollectionManager$3()
	{
		this$0 = final_craftarondevicecollectionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftAROnDeviceCollectionManager this$0>
		val$listener = leteCollectionListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CraftAROnDeviceCollectionManager$DeleteCollectionListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

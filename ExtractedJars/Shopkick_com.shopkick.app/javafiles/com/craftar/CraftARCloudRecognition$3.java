// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARCloudRecognition, ConnectParams, CRSConnect, CraftARError, 
//			SetCloudCollectionListener, CLog

class CraftARCloudRecognition$3
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (new ConnectParams()));
	//    0    0:new             #34  <Class ConnectParams>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ConnectParams()>
	//    3    7:astore_1        
		obj.token = val$collectionToken;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String val$collectionToken>
	//    7   13:putfield        #38  <Field String ConnectParams.token>
		try
		{
			CraftARCloudRecognition.access$600(CraftARCloudRecognition.this).connect(((ConnectParams) (obj)), (() (new nnectCallback(CraftARCloudRecognition.this, val$listener))));
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field CraftARCloudRecognition this$0>
	//   10   20:invokestatic    #42  <Method CRSConnect CraftARCloudRecognition.access$600(CraftARCloudRecognition)>
	//   11   23:aload_1         
	//   12   24:new             #44  <Class CraftARCloudRecognition$ConnectCallback>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field CraftARCloudRecognition this$0>
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field SetCloudCollectionListener val$listener>
	//   18   36:invokespecial   #47  <Method void CraftARCloudRecognition$ConnectCallback(CraftARCloudRecognition, SetCloudCollectionListener)>
	//   19   39:invokevirtual   #53  <Method void CRSConnect.connect(ConnectParams, CRSConnect$NetworkCallback)>
			return;
	//   20   42:return          
		}
		catch(Exception exception)
	//*  21   43:astore_1        
		{
			exception = ((Exception) (new CraftARError(CraftARError.ERROR_CODES.ERROR_NETWORK, exception.getMessage())));
	//   22   44:new             #55  <Class CraftARError>
	//   23   47:dup             
	//   24   48:getstatic       #61  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//   25   51:aload_1         
	//   26   52:invokevirtual   #65  <Method String Exception.getMessage()>
	//   27   55:invokespecial   #68  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//   28   58:astore_1        
		}
		SetCloudCollectionListener setcloudcollectionlistener = val$listener;
	//   29   59:aload_0         
	//   30   60:getfield        #25  <Field SetCloudCollectionListener val$listener>
	//   31   63:astore_2        
		if(setcloudcollectionlistener != null)
	//*  32   64:aload_2         
	//*  33   65:ifnull          76
		{
			setcloudcollectionlistener.setCollectionFailed(((CraftARError) (exception)));
	//   34   68:aload_2         
	//   35   69:aload_1         
	//   36   70:invokeinterface #74  <Method void SetCloudCollectionListener.setCollectionFailed(CraftARError)>
			return;
	//   37   75:return          
		} else
		{
			CLog.e(((CraftARError) (exception)).getErrorMessage());
	//   38   76:aload_1         
	//   39   77:invokevirtual   #77  <Method String CraftARError.getErrorMessage()>
	//   40   80:invokestatic    #83  <Method void CLog.e(String)>
			return;
	//   41   83:return          
		}
	}

	final CraftARCloudRecognition this$0;
	final String val$collectionToken;
	final SetCloudCollectionListener val$listener;

	CraftARCloudRecognition$3()
	{
		this$0 = final_craftarcloudrecognition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CraftARCloudRecognition this$0>
		val$collectionToken = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String val$collectionToken>
		val$listener = SetCloudCollectionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SetCloudCollectionListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

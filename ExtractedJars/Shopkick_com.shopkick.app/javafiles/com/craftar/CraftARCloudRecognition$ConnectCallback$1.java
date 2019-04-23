// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			CraftARCloudRecognition, SetCloudCollectionListener, CLog, CraftARError, 
//			CraftARNetworkError

class CraftARCloudRecognition$ConnectCallback$1
	implements Runnable
{

	public void run()
	{
		JSONException jsonexception;
		if(val$statusCode == 200)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int val$statusCode>
	//*   2    4:sipush          200
	//*   3    7:icmpne          39
			if(mSetCollectionListener != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
	//*   6   14:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
	//*   7   17:ifnull          33
			{
				mSetCollectionListener.collectionReady();
	//    8   20:aload_0         
	//    9   21:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
	//   10   24:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
	//   11   27:invokeinterface #44  <Method void SetCloudCollectionListener.collectionReady()>
				return;
	//   12   32:return          
			} else
			{
				CLog.e("No collection listener set");
	//   13   33:ldc1            #46  <String "No collection listener set">
	//   14   35:invokestatic    #52  <Method void CLog.e(String)>
				return;
	//   15   38:return          
			}
		Object obj;
		try
		{
			obj = ((Object) ((new JSONObject(val$message)).getJSONObject("error")));
	//   16   39:new             #54  <Class JSONObject>
	//   17   42:dup             
	//   18   43:aload_0         
	//   19   44:getfield        #28  <Field String val$message>
	//   20   47:invokespecial   #56  <Method void JSONObject(String)>
	//   21   50:ldc1            #58  <String "error">
	//   22   52:invokevirtual   #62  <Method JSONObject JSONObject.getJSONObject(String)>
	//   23   55:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   24   56:new             #64  <Class StringBuilder>
	//   25   59:dup             
	//   26   60:invokespecial   #65  <Method void StringBuilder()>
	//   27   63:astore_2        
			stringbuilder.append("errorJSON:");
	//   28   64:aload_2         
	//   29   65:ldc1            #67  <String "errorJSON:">
	//   30   67:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   31   70:pop             
			stringbuilder.append(((JSONObject) (obj)).toString());
	//   32   71:aload_2         
	//   33   72:aload_1         
	//   34   73:invokevirtual   #75  <Method String JSONObject.toString()>
	//   35   76:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:pop             
			CLog.v(stringbuilder.toString());
	//   37   80:aload_2         
	//   38   81:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   39   84:invokestatic    #79  <Method void CLog.v(String)>
			obj = ((Object) (new CraftARError(((JSONObject) (obj)))));
	//   40   87:new             #81  <Class CraftARError>
	//   41   90:dup             
	//   42   91:aload_1         
	//   43   92:invokespecial   #84  <Method void CraftARError(JSONObject)>
	//   44   95:astore_1        
		}
	//*  45   96:goto            118
	//*  46   99:new             #86  <Class CraftARNetworkError>
	//*  47  102:dup             
	//*  48  103:getstatic       #92  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.HTTP_ERROR>
	//*  49  106:aload_0         
	//*  50  107:getfield        #28  <Field String val$message>
	//*  51  110:aload_0         
	//*  52  111:getfield        #26  <Field int val$statusCode>
	//*  53  114:invokespecial   #95  <Method void CraftARNetworkError(CraftARError$ERROR_CODES, String, int)>
	//*  54  117:astore_1        
	//*  55  118:aload_0         
	//*  56  119:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
	//*  57  122:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
	//*  58  125:ifnull          142
	//*  59  128:aload_0         
	//*  60  129:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
	//*  61  132:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
	//*  62  135:aload_1         
	//*  63  136:invokeinterface #99  <Method void SetCloudCollectionListener.setCollectionFailed(CraftARError)>
	//*  64  141:return          
	//*  65  142:aload_1         
	//*  66  143:invokevirtual   #102 <Method String CraftARError.getErrorMessage()>
	//*  67  146:invokestatic    #52  <Method void CLog.e(String)>
	//*  68  149:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			obj = ((Object) (new CraftARNetworkError(CraftARError.ERROR_CODES.HTTP_ERROR, val$message, val$statusCode)));
		}
		if(mSetCollectionListener != null)
		{
			mSetCollectionListener.setCollectionFailed(((CraftARError) (obj)));
			return;
		} else
		{
			CLog.e(((CraftARError) (obj)).getErrorMessage());
			return;
		}
	//*  69  150:astore_1        
	//*  70  151:goto            99
	}

	final CraftARCloudRecognition.ConnectCallback this$1;
	final String val$message;
	final int val$statusCode;

	CraftARCloudRecognition$ConnectCallback$1()
	{
		this$1 = final_connectcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
		val$statusCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #26  <Field int val$statusCode>
		val$message = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$message>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARCloudRecognition, CraftARError, CraftARSearchResponseHandler, CLog

class CraftARCloudRecognition$2
	implements Runnable
{

	public void run()
	{
		CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_NOT_LOADED, "Query image could not be loaded");
	//    0    0:new             #28  <Class CraftARError>
	//    1    3:dup             
	//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_NOT_LOADED>
	//    3    7:ldc1            #36  <String "Query image could not be loaded">
	//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//    5   12:astore_1        
		if(mResponseHandler != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #19  <Field CraftARCloudRecognition this$0>
	//*   8   17:getfield        #43  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//*   9   20:ifnull          41
		{
			mResponseHandler.searchFailed(craftarerror, val$requestCode);
	//   10   23:aload_0         
	//   11   24:getfield        #19  <Field CraftARCloudRecognition this$0>
	//   12   27:getfield        #43  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//   13   30:aload_1         
	//   14   31:aload_0         
	//   15   32:getfield        #21  <Field int val$requestCode>
	//   16   35:invokeinterface #49  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
			return;
	//   17   40:return          
		} else
		{
			CLog.w("No response handler set");
	//   18   41:ldc1            #51  <String "No response handler set">
	//   19   43:invokestatic    #57  <Method void CLog.w(String)>
			StringBuilder stringbuilder = new StringBuilder();
	//   20   46:new             #59  <Class StringBuilder>
	//   21   49:dup             
	//   22   50:invokespecial   #60  <Method void StringBuilder()>
	//   23   53:astore_2        
			stringbuilder.append("Search failed(");
	//   24   54:aload_2         
	//   25   55:ldc1            #62  <String "Search failed(">
	//   26   57:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   60:pop             
			stringbuilder.append(((Object) (craftarerror.getErrorCode())));
	//   28   61:aload_2         
	//   29   62:aload_1         
	//   30   63:invokevirtual   #70  <Method CraftARError$ERROR_CODES CraftARError.getErrorCode()>
	//   31   66:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//   32   69:pop             
			stringbuilder.append("):");
	//   33   70:aload_2         
	//   34   71:ldc1            #75  <String "):">
	//   35   73:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
			stringbuilder.append(craftarerror.getErrorMessage());
	//   37   77:aload_2         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #79  <Method String CraftARError.getErrorMessage()>
	//   40   82:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
			CLog.e(stringbuilder.toString());
	//   42   86:aload_2         
	//   43   87:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   44   90:invokestatic    #85  <Method void CLog.e(String)>
			return;
	//   45   93:return          
		}
	}

	final CraftARCloudRecognition this$0;
	final int val$requestCode;

	CraftARCloudRecognition$2()
	{
		this$0 = final_craftarcloudrecognition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftARCloudRecognition this$0>
		val$requestCode = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int val$requestCode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

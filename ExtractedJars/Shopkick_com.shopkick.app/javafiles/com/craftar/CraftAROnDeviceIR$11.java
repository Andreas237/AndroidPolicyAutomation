// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftARSearchResponseHandler, CLog

class CraftAROnDeviceIR$11
	implements Runnable
{

	public void run()
	{
		if(mResponseHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CraftAROnDeviceIR this$0>
	//*   2    4:getfield        #33  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
	//*   3    7:ifnull          34
		{
			mResponseHandler.searchFailed(CraftAROnDeviceIR.access$300(val$errorCode), val$requestCode);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field CraftAROnDeviceIR this$0>
	//    6   14:getfield        #33  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field int val$errorCode>
	//    9   21:invokestatic    #37  <Method CraftARError CraftAROnDeviceIR.access$300(int)>
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field int val$requestCode>
	//   12   28:invokeinterface #43  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
			return;
	//   13   33:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   34:new             #45  <Class StringBuilder>
	//   15   37:dup             
	//   16   38:invokespecial   #46  <Method void StringBuilder()>
	//   17   41:astore_1        
			stringbuilder.append("Search failed with error: ");
	//   18   42:aload_1         
	//   19   43:ldc1            #48  <String "Search failed with error: ">
	//   20   45:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   48:pop             
			stringbuilder.append(val$errorCode);
	//   22   49:aload_1         
	//   23   50:aload_0         
	//   24   51:getfield        #22  <Field int val$errorCode>
	//   25   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(int)>
	//   26   57:pop             
			CLog.e(stringbuilder.toString());
	//   27   58:aload_1         
	//   28   59:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #65  <Method void CLog.e(String)>
			return;
	//   30   65:return          
		}
	}

	final CraftAROnDeviceIR this$0;
	final int val$errorCode;
	final int val$requestCode;

	CraftAROnDeviceIR$11()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CraftAROnDeviceIR this$0>
		val$errorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$errorCode>
		val$requestCode = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int val$requestCode>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}

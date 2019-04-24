// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$13
	implements Runnable
{

	public void run()
	{
		if(val$response.getErrorCode() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field GSResponse val$response>
	//*   2    4:invokevirtual   #44  <Method int GSResponse.getErrorCode()>
	//*   3    7:ifeq            49
		{
			String s = GSAPI.access$000();
	//    4   10:invokestatic    #48  <Method String GSAPI.access$000()>
	//    5   13:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #50  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #51  <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("Error Response: \n");
	//   10   22:aload_2         
	//   11   23:ldc1            #53  <String "Error Response: \n">
	//   12   25:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(val$response.getLog());
	//   14   29:aload_2         
	//   15   30:aload_0         
	//   16   31:getfield        #27  <Field GSResponse val$response>
	//   17   34:invokevirtual   #60  <Method String GSResponse.getLog()>
	//   18   37:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			GigyaLog.e(s, stringbuilder.toString());
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   23   46:invokestatic    #69  <Method void GigyaLog.e(String, String)>
		}
		val$listener.onGSResponse(val$method, val$response, val$context);
	//   24   49:aload_0         
	//   25   50:getfield        #29  <Field GSResponseListener val$listener>
	//   26   53:aload_0         
	//   27   54:getfield        #31  <Field String val$method>
	//   28   57:aload_0         
	//   29   58:getfield        #27  <Field GSResponse val$response>
	//   30   61:aload_0         
	//   31   62:getfield        #33  <Field Object val$context>
	//   32   65:invokeinterface #75  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
	//   33   70:return          
	}

	final GSAPI this$0;
	final Object val$context;
	final GSResponseListener val$listener;
	final String val$method;
	final GSResponse val$response;

	GSAPI$13()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GSAPI this$0>
		val$response = gsresponse;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field GSResponse val$response>
		val$listener = gsresponselistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field GSResponseListener val$listener>
		val$method = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field String val$method>
		val$context = Object.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field Object val$context>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void Object()>
	//   17   31:return          
	}
}

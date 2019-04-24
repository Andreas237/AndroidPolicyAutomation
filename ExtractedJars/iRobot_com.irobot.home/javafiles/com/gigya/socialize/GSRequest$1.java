// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;


// Referenced classes of package com.gigya.socialize:
//			GSRequest, GSResponseListener

class GSRequest$1
	implements Runnable
{

	public void run()
	{
		GSResponse gsresponse = send();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GSRequest this$0>
	//    2    4:invokevirtual   #33  <Method GSResponse GSRequest.send()>
	//    3    7:astore_1        
		if(val$listener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field GSResponseListener val$listener>
	//*   6   12:ifnull          36
			val$listener.onGSResponse(apiMethod, gsresponse, val$context);
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field GSResponseListener val$listener>
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field GSRequest this$0>
	//   11   23:getfield        #37  <Field String GSRequest.apiMethod>
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #25  <Field Object val$context>
	//   15   31:invokeinterface #43  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
	//   16   36:return          
	}

	final GSRequest this$0;
	final Object val$context;
	final GSResponseListener val$listener;

	GSRequest$1()
	{
		this$0 = final_gsrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GSRequest this$0>
		val$listener = gsresponselistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field GSResponseListener val$listener>
		val$context = Object.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Object val$context>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

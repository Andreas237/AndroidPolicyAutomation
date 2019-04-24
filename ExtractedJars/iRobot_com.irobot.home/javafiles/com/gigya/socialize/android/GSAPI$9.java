// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$9
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            34
			invokeSocializeListeners("connectionRemoved", new Object[] {
				val$provider, val$ctx
			});
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field GSAPI this$0>
	//    5   11:ldc1            #43  <String "connectionRemoved">
	//    6   13:iconst_2        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:getfield        #25  <Field String val$provider>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_0         
	//   16   27:getfield        #27  <Field Object val$ctx>
	//   17   30:aastore         
	//   18   31:invokevirtual   #47  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
		notifyResponse(val$listener, "removeConnection", gsresponse, obj);
	//   19   34:aload_0         
	//   20   35:getfield        #23  <Field GSAPI this$0>
	//   21   38:aload_0         
	//   22   39:getfield        #29  <Field GSResponseListener val$listener>
	//   23   42:ldc1            #48  <String "removeConnection">
	//   24   44:aload_2         
	//   25   45:aload_3         
	//   26   46:invokevirtual   #52  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
	//   27   49:return          
	}

	final GSAPI this$0;
	final Object val$ctx;
	final GSResponseListener val$listener;
	final String val$provider;

	GSAPI$9()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field GSAPI this$0>
		val$provider = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$provider>
		val$ctx = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Object val$ctx>
		val$listener = GSResponseListener.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field GSResponseListener val$listener>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}

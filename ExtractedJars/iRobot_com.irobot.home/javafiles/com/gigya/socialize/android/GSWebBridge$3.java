// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;
import com.gigya.socialize.android.event.GSWebBridgeListenerProxy;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$3
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() != 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifeq            35
		{
			gsresponse.getData().put("errorCode", gsresponse.getErrorCode());
	//    3    7:aload_2         
	//    4    8:invokevirtual   #37  <Method GSObject GSResponse.getData()>
	//    5   11:ldc1            #39  <String "errorCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
	//    8   17:invokevirtual   #45  <Method void GSObject.put(String, int)>
			GSWebBridge.access$000(GSWebBridge.this, val$callbackId, ((Object) (gsresponse)));
	//    9   20:aload_0         
	//   10   21:getfield        #19  <Field GSWebBridge this$0>
	//   11   24:aload_0         
	//   12   25:getfield        #21  <Field String val$callbackId>
	//   13   28:aload_2         
	//   14   29:invokestatic    #49  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
		} else
	//*  15   32:goto            75
		{
			s = ((String) (new GSObject()));
	//   16   35:new             #41  <Class GSObject>
	//   17   38:dup             
	//   18   39:invokespecial   #50  <Method void GSObject()>
	//   19   42:astore_1        
			((GSObject) (s)).put("userInfo", gsresponse.getData());
	//   20   43:aload_1         
	//   21   44:ldc1            #52  <String "userInfo">
	//   22   46:aload_2         
	//   23   47:invokevirtual   #37  <Method GSObject GSResponse.getData()>
	//   24   50:invokevirtual   #55  <Method void GSObject.put(String, GSObject)>
			((GSObject) (s)).put("errorCode", gsresponse.getErrorCode());
	//   25   53:aload_1         
	//   26   54:ldc1            #39  <String "errorCode">
	//   27   56:aload_2         
	//   28   57:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
	//   29   60:invokevirtual   #45  <Method void GSObject.put(String, int)>
			GSWebBridge.access$000(GSWebBridge.this, val$callbackId, ((Object) (s)));
	//   30   63:aload_0         
	//   31   64:getfield        #19  <Field GSWebBridge this$0>
	//   32   67:aload_0         
	//   33   68:getfield        #21  <Field String val$callbackId>
	//   34   71:aload_1         
	//   35   72:invokestatic    #49  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
		}
		GSWebBridge.access$200(GSWebBridge.this).onLoginResponse(GSWebBridge.access$100(GSWebBridge.this), gsresponse);
	//   36   75:aload_0         
	//   37   76:getfield        #19  <Field GSWebBridge this$0>
	//   38   79:invokestatic    #59  <Method GSWebBridgeListenerProxy GSWebBridge.access$200(GSWebBridge)>
	//   39   82:aload_0         
	//   40   83:getfield        #19  <Field GSWebBridge this$0>
	//   41   86:invokestatic    #63  <Method android.webkit.WebView GSWebBridge.access$100(GSWebBridge)>
	//   42   89:aload_2         
	//   43   90:invokevirtual   #69  <Method void GSWebBridgeListenerProxy.onLoginResponse(android.webkit.WebView, GSResponse)>
	//   44   93:return          
	}

	final GSWebBridge this$0;
	final String val$callbackId;

	GSWebBridge$3()
	{
		this$0 = final_gswebbridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSWebBridge this$0>
		val$callbackId = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$callbackId>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSLoginRequest

class GSAPI$8
	implements Runnable
{

	public void run()
	{
		try
		{
			val$req.send();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field GSLoginRequest val$req>
	//    2    4:invokevirtual   #47  <Method void GSLoginRequest.send()>
			return;
	//    3    7:return          
		}
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #50  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
	//*   7   13:return          
		catch(IllegalArgumentException illegalargumentexception)
	//*   8   14:astore_1        
		{
			notifyResponse(val$listener, "login", new GSResponse("login", val$params, 0x61a86, illegalargumentexception.getMessage(), ((com.gigya.socialize.GSLogger) (null))), val$context);
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field GSAPI this$0>
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field GSResponseListener val$listener>
	//   13   23:ldc1            #52  <String "login">
	//   14   25:new             #54  <Class GSResponse>
	//   15   28:dup             
	//   16   29:ldc1            #52  <String "login">
	//   17   31:aload_0         
	//   18   32:getfield        #31  <Field GSObject val$params>
	//   19   35:ldc1            #55  <Int 0x61a86>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #59  <Method String IllegalArgumentException.getMessage()>
	//   22   41:aconst_null     
	//   23   42:invokespecial   #62  <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//   24   45:aload_0         
	//   25   46:getfield        #33  <Field Object val$context>
	//   26   49:invokevirtual   #66  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
		}
		catch(android.content.pm.anager.NameNotFoundException namenotfoundexception)
		{
			namenotfoundexception.printStackTrace();
			return;
		}
	//   27   52:return          
	}

	final GSAPI this$0;
	final Object val$context;
	final GSResponseListener val$listener;
	final GSObject val$params;
	final GSLoginRequest val$req;

	GSAPI$8()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GSAPI this$0>
		val$req = gsloginrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field GSLoginRequest val$req>
		val$listener = gsresponselistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field GSResponseListener val$listener>
		val$params = gsobject;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field GSObject val$params>
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

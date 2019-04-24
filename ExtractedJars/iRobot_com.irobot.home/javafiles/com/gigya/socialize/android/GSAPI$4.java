// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.*;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSLoginRequest

class GSAPI$4
	implements Runnable
{

	public void run()
	{
		String s = val$params.getString("loginMode", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field GSObject val$params>
	//    2    4:ldc1            #44  <String "loginMode">
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #50  <Method String GSObject.getString(String, String)>
	//    5   10:astore_1        
		if(s == null || !s.equals("reAuth"))
	//*   6   11:aload_1         
	//*   7   12:ifnull          24
	//*   8   15:aload_1         
	//*   9   16:ldc1            #52  <String "reAuth">
	//*  10   18:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  11   21:ifne            31
			clearSession();
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field GSAPI this$0>
	//   14   28:invokevirtual   #61  <Method void GSAPI.clearSession()>
		try
		{
			val$req.send();
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field GSLoginRequest val$req>
	//   17   35:invokevirtual   #66  <Method void GSLoginRequest.send()>
			return;
	//   18   38:return          
		}
	//*  19   39:astore_1        
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #69  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
	//*  22   44:return          
		catch(IllegalArgumentException illegalargumentexception)
	//*  23   45:astore_1        
		{
			notifyResponse(val$listener, "login", new GSResponse("login", val$params, 0x61a86, illegalargumentexception.getMessage(), ((com.gigya.socialize.GSLogger) (null))), val$context);
	//   24   46:aload_0         
	//   25   47:getfield        #25  <Field GSAPI this$0>
	//   26   50:aload_0         
	//   27   51:getfield        #31  <Field GSResponseListener val$listener>
	//   28   54:ldc1            #70  <String "login">
	//   29   56:new             #72  <Class GSResponse>
	//   30   59:dup             
	//   31   60:ldc1            #70  <String "login">
	//   32   62:aload_0         
	//   33   63:getfield        #27  <Field GSObject val$params>
	//   34   66:ldc1            #73  <Int 0x61a86>
	//   35   68:aload_1         
	//   36   69:invokevirtual   #77  <Method String IllegalArgumentException.getMessage()>
	//   37   72:aconst_null     
	//   38   73:invokespecial   #80  <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//   39   76:aload_0         
	//   40   77:getfield        #33  <Field Object val$context>
	//   41   80:invokevirtual   #84  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
		}
		catch(android.content.pm.anager.NameNotFoundException namenotfoundexception)
		{
			namenotfoundexception.printStackTrace();
			return;
		}
	//   42   83:return          
	}

	final GSAPI this$0;
	final Object val$context;
	final GSResponseListener val$listener;
	final GSObject val$params;
	final GSLoginRequest val$req;

	GSAPI$4()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GSAPI this$0>
		val$params = gsobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field GSObject val$params>
		val$req = gsloginrequest;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field GSLoginRequest val$req>
		val$listener = gsresponselistener;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field GSResponseListener val$listener>
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

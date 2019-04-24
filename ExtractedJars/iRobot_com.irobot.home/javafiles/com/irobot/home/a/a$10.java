// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.irobot.core.AccountSessionDelegate;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.a:
//			a

class a$10
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #28  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            33
		{
			com.irobot.home.a.a.a(a).onAccountConsentDateUpdated();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field a a>
	//    5   11:invokestatic    #31  <Method AccountSessionDelegate a.a(a)>
	//    6   14:invokevirtual   #36  <Method void AccountSessionDelegate.onAccountConsentDateUpdated()>
			a.requestLegalTermsConsentDateInfo();
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field a a>
	//    9   21:invokevirtual   #39  <Method void a.requestLegalTermsConsentDateInfo()>
			o.b(com.irobot.home.a.a.b(), "Update consent date successful.");
	//   10   24:invokestatic    #43  <Method String a.b()>
	//   11   27:ldc1            #45  <String "Update consent date successful.">
	//   12   29:invokestatic    #50  <Method void o.b(String, String)>
			return;
	//   13   32:return          
		} else
		{
			com.irobot.home.a.a.a(a).onAccountConsentDateUpdateFailed();
	//   14   33:aload_0         
	//   15   34:getfield        #17  <Field a a>
	//   16   37:invokestatic    #31  <Method AccountSessionDelegate a.a(a)>
	//   17   40:invokevirtual   #53  <Method void AccountSessionDelegate.onAccountConsentDateUpdateFailed()>
			o.d(com.irobot.home.a.a.b(), "Failed to update consent date.");
	//   18   43:invokestatic    #43  <Method String a.b()>
	//   19   46:ldc1            #55  <String "Failed to update consent date.">
	//   20   48:invokestatic    #58  <Method void o.d(String, String)>
			return;
	//   21   51:return          
		}
	}

	final a a;

	a$10(a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

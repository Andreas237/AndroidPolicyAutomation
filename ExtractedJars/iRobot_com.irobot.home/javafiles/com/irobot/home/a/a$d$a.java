// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.gigya.socialize.*;
import com.irobot.core.AccountSessionDelegate;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.a:
//			a

private class a$d$a
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #32  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            36
		{
			com.irobot.home.a.a.a(a.a).onAccountConsentDateReceived(gsresponse.getData().toJsonString());
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field a$d a>
	//    5   11:getfield        #35  <Field a a$d.a>
	//    6   14:invokestatic    #38  <Method AccountSessionDelegate a.a(a)>
	//    7   17:aload_2         
	//    8   18:invokevirtual   #42  <Method GSObject GSResponse.getData()>
	//    9   21:invokevirtual   #48  <Method String GSObject.toJsonString()>
	//   10   24:invokevirtual   #54  <Method void AccountSessionDelegate.onAccountConsentDateReceived(String)>
			o.b(com.irobot.home.a.a.b(), "Request legal terms consent date info successful.");
	//   11   27:invokestatic    #57  <Method String a.b()>
	//   12   30:ldc1            #59  <String "Request legal terms consent date info successful.">
	//   13   32:invokestatic    #64  <Method void o.b(String, String)>
			return;
	//   14   35:return          
		} else
		{
			o.d(com.irobot.home.a.a.b(), "Failed request legal terms consent date info.");
	//   15   36:invokestatic    #57  <Method String a.b()>
	//   16   39:ldc1            #66  <String "Failed request legal terms consent date info.">
	//   17   41:invokestatic    #68  <Method void o.d(String, String)>
			return;
	//   18   44:return          
		}
	}

	final a.d a;

	private a$d$a(a.d d1)
	{
		a = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field a$d a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	a$d$a(a.d d1, a._cls1 _pcls1)
	{
		this(d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void a$d$a(a$d)>
	//    3    5:return          
	}
}

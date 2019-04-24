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

class a$5
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            58
		{
			s = com.irobot.home.a.a.b();
	//    3    7:invokestatic    #36  <Method String a.b()>
	//    4   10:astore_1        
			gsresponse = ((GSResponse) (new StringBuilder()));
	//    5   11:new             #38  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #39  <Method void StringBuilder()>
	//    8   18:astore_2        
			((StringBuilder) (gsresponse)).append("Account country set to: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #41  <String "Account country set to: ">
	//   11   22:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (gsresponse)).append(a);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:getfield        #21  <Field String a>
	//   16   31:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			o.b(s, ((StringBuilder) (gsresponse)).toString());
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   21   40:invokestatic    #53  <Method void o.b(String, String)>
			com.irobot.home.a.a.a(b).onAccountCountryUpdated(a);
	//   22   43:aload_0         
	//   23   44:getfield        #19  <Field a b>
	//   24   47:invokestatic    #56  <Method AccountSessionDelegate a.a(a)>
	//   25   50:aload_0         
	//   26   51:getfield        #21  <Field String a>
	//   27   54:invokevirtual   #61  <Method void AccountSessionDelegate.onAccountCountryUpdated(String)>
			return;
	//   28   57:return          
		} else
		{
			s = com.irobot.home.a.a.b();
	//   29   58:invokestatic    #36  <Method String a.b()>
	//   30   61:astore_1        
			gsresponse = ((GSResponse) (new StringBuilder()));
	//   31   62:new             #38  <Class StringBuilder>
	//   32   65:dup             
	//   33   66:invokespecial   #39  <Method void StringBuilder()>
	//   34   69:astore_2        
			((StringBuilder) (gsresponse)).append("Failed to set account country to: ");
	//   35   70:aload_2         
	//   36   71:ldc1            #63  <String "Failed to set account country to: ">
	//   37   73:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
			((StringBuilder) (gsresponse)).append(a);
	//   39   77:aload_2         
	//   40   78:aload_0         
	//   41   79:getfield        #21  <Field String a>
	//   42   82:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
			o.d(s, ((StringBuilder) (gsresponse)).toString());
	//   44   86:aload_1         
	//   45   87:aload_2         
	//   46   88:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   47   91:invokestatic    #66  <Method void o.d(String, String)>
			return;
	//   48   94:return          
		}
	}

	final String a;
	final a b;

	a$5(a a1, String s)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field a b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.irobot.core.*;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.a:
//			a

class a$8
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #37  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifne            26
		{
			com.irobot.home.a.a.a(c).onAccountFeatureStatusUpdated(a, b);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field a c>
	//    5   11:invokestatic    #40  <Method AccountSessionDelegate a.a(a)>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field FeatureType a>
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field long b>
	//   10   22:invokevirtual   #45  <Method void AccountSessionDelegate.onAccountFeatureStatusUpdated(FeatureType, long)>
			return;
	//   11   25:return          
		} else
		{
			s = com.irobot.home.a.a.b();
	//   12   26:invokestatic    #48  <Method String a.b()>
	//   13   29:astore_1        
			gsresponse = ((GSResponse) (new StringBuilder()));
	//   14   30:new             #50  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #51  <Method void StringBuilder()>
	//   17   37:astore_2        
			((StringBuilder) (gsresponse)).append("Failed to update feature type: ");
	//   18   38:aload_2         
	//   19   39:ldc1            #53  <String "Failed to update feature type: ">
	//   20   41:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (gsresponse)).append(GigyaConst.getKeyForFeatureType(a));
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #23  <Field FeatureType a>
	//   25   50:invokestatic    #63  <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
	//   26   53:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			o.d(s, ((StringBuilder) (gsresponse)).toString());
	//   28   57:aload_1         
	//   29   58:aload_2         
	//   30   59:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #72  <Method void o.d(String, String)>
			com.irobot.home.a.a.a(c).onAccountFeatureStatusUpdateFailed(a);
	//   32   65:aload_0         
	//   33   66:getfield        #21  <Field a c>
	//   34   69:invokestatic    #40  <Method AccountSessionDelegate a.a(a)>
	//   35   72:aload_0         
	//   36   73:getfield        #23  <Field FeatureType a>
	//   37   76:invokevirtual   #76  <Method void AccountSessionDelegate.onAccountFeatureStatusUpdateFailed(FeatureType)>
			return;
	//   38   79:return          
		}
	}

	final FeatureType a;
	final long b;
	final a c;

	a$8(a a1, FeatureType featuretype, long l)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field a c>
		a = featuretype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field FeatureType a>
		b = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

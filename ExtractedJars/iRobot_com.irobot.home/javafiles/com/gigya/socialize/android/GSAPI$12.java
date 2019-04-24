// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$12
	implements GSResponseListener
{

	public void onGSResponse(String s, GSResponse gsresponse, Object obj)
	{
		if(gsresponse.getErrorCode() != 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #29  <Method int GSResponse.getErrorCode()>
	//*   2    4:ifeq            43
		{
			s = GSAPI.access$000();
	//    3    7:invokestatic    #33  <Method String GSAPI.access$000()>
	//    4   10:astore_1        
			obj = ((Object) (new StringBuilder()));
	//    5   11:new             #35  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #36  <Method void StringBuilder()>
	//    8   18:astore_3        
			((StringBuilder) (obj)).append("Unable to report SDK error.");
	//    9   19:aload_3         
	//   10   20:ldc1            #38  <String "Unable to report SDK error.">
	//   11   22:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (obj)).append(gsresponse.getLog());
	//   13   26:aload_3         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #45  <Method String GSResponse.getLog()>
	//   16   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			GigyaLog.e(s, ((StringBuilder) (obj)).toString());
	//   18   35:aload_1         
	//   19   36:aload_3         
	//   20   37:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   21   40:invokestatic    #54  <Method void GigyaLog.e(String, String)>
		}
	//   22   43:return          
	}

	final GSAPI this$0;

	GSAPI$12()
	{
		this$0 = GSAPI.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSAPI this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}

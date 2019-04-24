// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android:
//			GSLoginRequest

class GSLoginRequest$1
	implements com.gigya.socialize.android.login.providers.viderCallback
{

	public void onResponse(GSObject gsobject)
	{
		String s = gsobject.getString("providerToken", ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc1            #24  <String "providerToken">
	//    2    3:aconst_null     
	//    3    4:invokevirtual   #30  <Method String GSObject.getString(String, String)>
	//    4    7:astore_2        
		if(s != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          30
		{
			GSLoginRequest.access$000(GSLoginRequest.this, s, gsobject.getLong("providerExpiration", -1L));
	//    7   12:aload_0         
	//    8   13:getfield        #17  <Field GSLoginRequest this$0>
	//    9   16:aload_2         
	//   10   17:aload_1         
	//   11   18:ldc1            #32  <String "providerExpiration">
	//   12   20:ldc2w           #33  <Long -1L>
	//   13   23:invokevirtual   #38  <Method long GSObject.getLong(String, long)>
	//   14   26:invokestatic    #42  <Method void GSLoginRequest.access$000(GSLoginRequest, String, long)>
			return;
	//   15   29:return          
		} else
		{
			GSLoginRequest.access$100(GSLoginRequest.this, gsobject);
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field GSLoginRequest this$0>
	//   18   34:aload_1         
	//   19   35:invokestatic    #46  <Method void GSLoginRequest.access$100(GSLoginRequest, GSObject)>
			return;
	//   20   38:return          
		}
	}

	final GSLoginRequest this$0;

	GSLoginRequest$1()
	{
		this$0 = GSLoginRequest.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSLoginRequest this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

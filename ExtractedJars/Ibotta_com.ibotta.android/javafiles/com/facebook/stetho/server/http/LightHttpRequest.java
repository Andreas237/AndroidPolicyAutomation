// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import android.net.Uri;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpMessage

public class LightHttpRequest extends LightHttpMessage
{

	public LightHttpRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void LightHttpMessage()>
	//    2    4:return          
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void LightHttpMessage.reset()>
		method = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field String method>
		uri = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Uri uri>
		protocol = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field String protocol>
	//   11   19:return          
	}

	public String method;
	public String protocol;
	public Uri uri;
}

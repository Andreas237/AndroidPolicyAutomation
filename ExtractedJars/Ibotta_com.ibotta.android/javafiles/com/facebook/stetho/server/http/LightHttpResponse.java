// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;


// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpMessage, LightHttpBody

public class LightHttpResponse extends LightHttpMessage
{

	public LightHttpResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void LightHttpMessage()>
	//    2    4:return          
	}

	public void prepare()
	{
		LightHttpBody lighthttpbody = body;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LightHttpBody body>
	//    2    4:astore_1        
		if(lighthttpbody != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
		{
			addHeader("Content-Type", lighthttpbody.contentType());
	//    5    9:aload_0         
	//    6   10:ldc1            #20  <String "Content-Type">
	//    7   12:aload_1         
	//    8   13:invokevirtual   #26  <Method String LightHttpBody.contentType()>
	//    9   16:invokevirtual   #30  <Method void addHeader(String, String)>
			addHeader("Content-Length", String.valueOf(body.contentLength()));
	//   10   19:aload_0         
	//   11   20:ldc1            #32  <String "Content-Length">
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field LightHttpBody body>
	//   14   26:invokevirtual   #36  <Method int LightHttpBody.contentLength()>
	//   15   29:invokestatic    #42  <Method String String.valueOf(int)>
	//   16   32:invokevirtual   #30  <Method void addHeader(String, String)>
		}
	//   17   35:return          
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void LightHttpMessage.reset()>
		code = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #47  <Field int code>
		reasonPhrase = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field String reasonPhrase>
		body = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #18  <Field LightHttpBody body>
	//   11   19:return          
	}

	public LightHttpBody body;
	public int code;
	public String reasonPhrase;
}

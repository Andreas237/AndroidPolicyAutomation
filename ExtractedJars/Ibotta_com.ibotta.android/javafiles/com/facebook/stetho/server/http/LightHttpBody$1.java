// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpBody

static final class LightHttpBody$1 extends LightHttpBody
{

	public int contentLength()
	{
		return val$body.length;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] val$body>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public String contentType()
	{
		return val$contentType;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String val$contentType>
	//    2    4:areturn         
	}

	public void writeTo(OutputStream outputstream)
		throws IOException
	{
		outputstream.write(val$body);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field byte[] val$body>
	//    3    5:invokevirtual   #35  <Method void OutputStream.write(byte[])>
	//    4    8:return          
	}

	final byte val$body[];
	final String val$contentType;

	LightHttpBody$1(String s, byte abyte0[])
	{
		val$contentType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String val$contentType>
		val$body = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field byte[] val$body>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void LightHttpBody()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

class HttpRequest$5 extends oseOperation
{

	public HttpRequest run()
		throws IOException
	{
		return copy(((java.io.Reader) (val$reader)), val$writer);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpRequest this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field BufferedReader val$reader>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Writer val$writer>
	//    6   12:invokevirtual   #36  <Method HttpRequest HttpRequest.copy(java.io.Reader, Writer)>
	//    7   15:areturn         
	}

	public volatile Object run()
		throws tpRequestException, IOException
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method HttpRequest run()>
	//    2    4:areturn         
	}

	final HttpRequest this$0;
	final BufferedReader val$reader;
	final Writer val$writer;

	HttpRequest$5(BufferedReader bufferedreader, Writer writer1)
	{
		this$0 = final_httprequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field HttpRequest this$0>
		val$reader = bufferedreader;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #22  <Field BufferedReader val$reader>
		val$writer = writer1;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #24  <Field Writer val$writer>
		super(final_closeable, Z.this);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
	//   13   23:return          
	}
}

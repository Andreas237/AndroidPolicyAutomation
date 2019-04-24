// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

class HttpRequest$8 extends ushOperation
{

	protected HttpRequest run()
		throws IOException
	{
		return copy(val$input, val$writer);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpRequest this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Reader val$input>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Writer val$writer>
	//    6   12:invokevirtual   #36  <Method HttpRequest HttpRequest.copy(Reader, Writer)>
	//    7   15:areturn         
	}

	protected volatile Object run()
		throws tpRequestException, IOException
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method HttpRequest run()>
	//    2    4:areturn         
	}

	final HttpRequest this$0;
	final Reader val$input;
	final Writer val$writer;

	HttpRequest$8(Writer writer1)
	{
		this$0 = final_httprequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field HttpRequest this$0>
		val$input = Reader.this;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field Reader val$input>
		val$writer = writer1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #24  <Field Writer val$writer>
		super(final_flushable);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #27  <Method void HttpRequest$FlushOperation(Flushable)>
	//   12   21:return          
	}
}

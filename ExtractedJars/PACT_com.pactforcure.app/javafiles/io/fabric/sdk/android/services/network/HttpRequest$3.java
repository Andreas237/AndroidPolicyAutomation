// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

class HttpRequest$3 extends oseOperation
{

	protected HttpRequest run()
		throws tpRequestException, IOException
	{
		return receive(val$output);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field HttpRequest this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field OutputStream val$output>
	//    4    8:invokevirtual   #33  <Method HttpRequest HttpRequest.receive(OutputStream)>
	//    5   11:areturn         
	}

	protected volatile Object run()
		throws tpRequestException, IOException
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method HttpRequest run()>
	//    2    4:areturn         
	}

	final HttpRequest this$0;
	final OutputStream val$output;

	HttpRequest$3(boolean flag, OutputStream outputstream)
	{
		this$0 = final_httprequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field HttpRequest this$0>
		val$output = outputstream;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #20  <Field OutputStream val$output>
		super(Closeable.this, flag);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:iload_3         
	//    9   14:invokespecial   #23  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
	//   10   17:return          
	}
}

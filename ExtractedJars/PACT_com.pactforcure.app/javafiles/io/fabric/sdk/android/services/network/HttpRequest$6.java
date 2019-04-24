// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

class HttpRequest$6 extends oseOperation
{

	public HttpRequest run()
		throws IOException
	{
		byte abyte0[] = new byte[HttpRequest.access$100(HttpRequest.this)];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpRequest this$0>
	//    2    4:invokestatic    #36  <Method int HttpRequest.access$100(HttpRequest)>
	//    3    7:newarray        byte[]
	//    4    9:astore_2        
		do
		{
			int i = val$input.read(abyte0);
	//    5   10:aload_0         
	//    6   11:getfield        #22  <Field InputStream val$input>
	//    7   14:aload_2         
	//    8   15:invokevirtual   #42  <Method int InputStream.read(byte[])>
	//    9   18:istore_1        
			if(i != -1)
	//*  10   19:iload_1         
	//*  11   20:iconst_m1       
	//*  12   21:icmpeq          37
				val$output.write(abyte0, 0, i);
	//   13   24:aload_0         
	//   14   25:getfield        #24  <Field OutputStream val$output>
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:iload_1         
	//   18   31:invokevirtual   #48  <Method void OutputStream.write(byte[], int, int)>
			else
	//*  19   34:goto            10
				return HttpRequest.this;
	//   20   37:aload_0         
	//   21   38:getfield        #20  <Field HttpRequest this$0>
	//   22   41:areturn         
		} while(true);
	}

	public volatile Object run()
		throws tpRequestException, IOException
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method HttpRequest run()>
	//    2    4:areturn         
	}

	final HttpRequest this$0;
	final InputStream val$input;
	final OutputStream val$output;

	HttpRequest$6(InputStream inputstream, OutputStream outputstream)
	{
		this$0 = final_httprequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field HttpRequest this$0>
		val$input = inputstream;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #22  <Field InputStream val$input>
		val$output = outputstream;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #24  <Field OutputStream val$output>
		super(final_closeable, Z.this);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
	//   13   23:return          
	}
}

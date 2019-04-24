// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;
import java.nio.CharBuffer;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

class HttpRequest$4 extends oseOperation
{

	public HttpRequest run()
		throws IOException
	{
		CharBuffer charbuffer = CharBuffer.allocate(HttpRequest.access$100(HttpRequest.this));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpRequest this$0>
	//    2    4:invokestatic    #36  <Method int HttpRequest.access$100(HttpRequest)>
	//    3    7:invokestatic    #42  <Method CharBuffer CharBuffer.allocate(int)>
	//    4   10:astore_2        
		do
		{
			int i = val$reader.read(charbuffer);
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field BufferedReader val$reader>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #48  <Method int BufferedReader.read(CharBuffer)>
	//    9   19:istore_1        
			if(i != -1)
	//*  10   20:iload_1         
	//*  11   21:iconst_m1       
	//*  12   22:icmpeq          51
			{
				charbuffer.rewind();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #52  <Method java.nio.Buffer CharBuffer.rewind()>
	//   15   29:pop             
				val$appendable.append(((CharSequence) (charbuffer)), 0, i);
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field Appendable val$appendable>
	//   18   34:aload_2         
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:invokeinterface #58  <Method Appendable Appendable.append(CharSequence, int, int)>
	//   22   42:pop             
				charbuffer.rewind();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #52  <Method java.nio.Buffer CharBuffer.rewind()>
	//   25   47:pop             
			} else
	//*  26   48:goto            11
			{
				return HttpRequest.this;
	//   27   51:aload_0         
	//   28   52:getfield        #20  <Field HttpRequest this$0>
	//   29   55:areturn         
			}
		} while(true);
	}

	public volatile Object run()
		throws tpRequestException, IOException
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method HttpRequest run()>
	//    2    4:areturn         
	}

	final HttpRequest this$0;
	final Appendable val$appendable;
	final BufferedReader val$reader;

	HttpRequest$4(BufferedReader bufferedreader, Appendable appendable1)
	{
		this$0 = final_httprequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field HttpRequest this$0>
		val$reader = bufferedreader;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #22  <Field BufferedReader val$reader>
		val$appendable = appendable1;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #24  <Field Appendable val$appendable>
		super(final_closeable, Z.this);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #27  <Method void HttpRequest$CloseOperation(Closeable, boolean)>
	//   13   23:return          
	}
}

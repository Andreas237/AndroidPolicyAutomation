// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.*;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseBodyFileManager, AsyncPrettyPrinter

private class ResponseBodyFileManager$AsyncPrettyPrintingCallable
	implements Callable
{

	private String prettyPrintContent(InputStream inputstream, AsyncPrettyPrinter asyncprettyprinter)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #34  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ByteArrayOutputStream()>
	//    3    7:astore_3        
		PrintWriter printwriter = new PrintWriter(((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #37  <Class PrintWriter>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:invokespecial   #40  <Method void PrintWriter(java.io.OutputStream)>
	//    8   16:astore          4
		asyncprettyprinter.printTo(printwriter, inputstream);
	//    9   18:aload_2         
	//   10   19:aload           4
	//   11   21:aload_1         
	//   12   22:invokeinterface #46  <Method void AsyncPrettyPrinter.printTo(PrintWriter, InputStream)>
		printwriter.flush();
	//   13   27:aload           4
	//   14   29:invokevirtual   #49  <Method void PrintWriter.flush()>
		return bytearrayoutputstream.toString("UTF-8");
	//   15   32:aload_3         
	//   16   33:ldc1            #51  <String "UTF-8">
	//   17   35:invokevirtual   #55  <Method String ByteArrayOutputStream.toString(String)>
	//   18   38:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method String call()>
	//    2    4:areturn         
	}

	public String call()
		throws IOException
	{
		return prettyPrintContent(mInputStream, mAsyncPrettyPrinter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field InputStream mInputStream>
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field AsyncPrettyPrinter mAsyncPrettyPrinter>
	//    5    9:invokespecial   #65  <Method String prettyPrintContent(InputStream, AsyncPrettyPrinter)>
	//    6   12:areturn         
	}

	private final AsyncPrettyPrinter mAsyncPrettyPrinter;
	private final InputStream mInputStream;
	final ResponseBodyFileManager this$0;

	public ResponseBodyFileManager$AsyncPrettyPrintingCallable(InputStream inputstream, AsyncPrettyPrinter asyncprettyprinter)
	{
		this$0 = ResponseBodyFileManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ResponseBodyFileManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		mInputStream = inputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field InputStream mInputStream>
		mAsyncPrettyPrinter = asyncprettyprinter;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field AsyncPrettyPrinter mAsyncPrettyPrinter>
	//   11   19:return          
	}
}

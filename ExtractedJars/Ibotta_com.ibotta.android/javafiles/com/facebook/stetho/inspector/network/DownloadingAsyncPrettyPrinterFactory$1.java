// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.ExceptionUtil;
import java.io.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			AsyncPrettyPrinter, DownloadingAsyncPrettyPrinterFactory, PrettyPrinterDisplayType

class DownloadingAsyncPrettyPrinterFactory$1
	implements AsyncPrettyPrinter
{

	public PrettyPrinterDisplayType getPrettifiedType()
	{
		return val$result.getDisplayType();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DownloadingAsyncPrettyPrinterFactory$MatchResult val$result>
	//    2    4:invokevirtual   #36  <Method PrettyPrinterDisplayType DownloadingAsyncPrettyPrinterFactory$MatchResult.getDisplayType()>
	//    3    7:areturn         
	}

	public void printTo(PrintWriter printwriter, InputStream inputstream)
		throws IOException
	{
		String s = (String)val$response.get();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Future val$response>
	//    2    4:invokeinterface #50  <Method Object Future.get()>
	//    3    9:checkcast       #52  <Class String>
	//    4   12:astore_3        
		ExecutionException executionexception;
		try
		{
			doPrint(printwriter, inputstream, s);
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field DownloadingAsyncPrettyPrinterFactory this$0>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:aload_3         
	//   10   20:invokevirtual   #56  <Method void DownloadingAsyncPrettyPrinterFactory.doPrint(PrintWriter, InputStream, String)>
			return;
	//   11   23:return          
		}
	//*  12   24:astore_3        
	//*  13   25:ldc1            #40  <Class IOException>
	//*  14   27:aload_3         
	//*  15   28:invokevirtual   #60  <Method Throwable ExecutionException.getCause()>
	//*  16   31:invokevirtual   #66  <Method boolean Class.isInstance(Object)>
	//*  17   34:ifeq            75
	//*  18   37:new             #68  <Class StringBuilder>
	//*  19   40:dup             
	//*  20   41:invokespecial   #69  <Method void StringBuilder()>
	//*  21   44:astore          4
	//*  22   46:aload           4
	//*  23   48:ldc1            #71  <String "Cannot successfully download schema: ">
	//*  24   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  25   53:pop             
	//*  26   54:aload           4
	//*  27   56:aload_3         
	//*  28   57:invokevirtual   #79  <Method String ExecutionException.getMessage()>
	//*  29   60:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  30   63:pop             
	//*  31   64:aload_1         
	//*  32   65:aload_2         
	//*  33   66:aload           4
	//*  34   68:invokevirtual   #82  <Method String StringBuilder.toString()>
	//*  35   71:invokestatic    #85  <Method void DownloadingAsyncPrettyPrinterFactory.access$000(PrintWriter, InputStream, String)>
	//*  36   74:return          
	//*  37   75:aload_3         
	//*  38   76:athrow          
		// Misplaced declaration of an exception variable
		catch(PrintWriter printwriter)
	//*  39   77:astore_1        
		{
			throw ExceptionUtil.propagate(((ExecutionException) (printwriter)).getCause());
	//   40   78:aload_1         
	//   41   79:invokevirtual   #60  <Method Throwable ExecutionException.getCause()>
	//   42   82:invokestatic    #91  <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//   43   85:athrow          
		}
		executionexception;
		if(((Class) (java/io/IOException)).isInstance(((Object) (executionexception.getCause()))))
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Cannot successfully download schema: ");
			stringbuilder1.append(executionexception.getMessage());
			DownloadingAsyncPrettyPrinterFactory.access$000(printwriter, inputstream, stringbuilder1.toString());
			return;
		}
		throw executionexception;
_L2:
		InterruptedException interruptedexception;
		StringBuilder stringbuilder = new StringBuilder();
	//   44   86:new             #68  <Class StringBuilder>
	//   45   89:dup             
	//   46   90:invokespecial   #69  <Method void StringBuilder()>
	//   47   93:astore_3        
		stringbuilder.append("Encountered spurious interrupt while downloading schema for pretty printing: ");
	//   48   94:aload_3         
	//   49   95:ldc1            #93  <String "Encountered spurious interrupt while downloading schema for pretty printing: ">
	//   50   97:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   51  100:pop             
		stringbuilder.append(interruptedexception.getMessage());
	//   52  101:aload_3         
	//   53  102:aload           4
	//   54  104:invokevirtual   #94  <Method String InterruptedException.getMessage()>
	//   55  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
		DownloadingAsyncPrettyPrinterFactory.access$000(printwriter, inputstream, stringbuilder.toString());
	//   57  111:aload_1         
	//   58  112:aload_2         
	//   59  113:aload_3         
	//   60  114:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   61  117:invokestatic    #85  <Method void DownloadingAsyncPrettyPrinterFactory.access$000(PrintWriter, InputStream, String)>
		return;
	//   62  120:return          
		interruptedexception;
	//   63  121:astore          4
		if(true) goto _L2; else goto _L1
	//   64  123:goto            86
_L1:
	}

	final DownloadingAsyncPrettyPrinterFactory this$0;
	final Future val$response;
	final tchResult val$result;

	DownloadingAsyncPrettyPrinterFactory$1()
	{
		this$0 = final_downloadingasyncprettyprinterfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DownloadingAsyncPrettyPrinterFactory this$0>
		val$response = future;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Future val$response>
		val$result = tchResult.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field DownloadingAsyncPrettyPrinterFactory$MatchResult val$result>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}

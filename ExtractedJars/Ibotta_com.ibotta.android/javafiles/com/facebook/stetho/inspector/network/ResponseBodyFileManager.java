// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.common.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			AsyncPrettyPrinterExecutorHolder, ResponseBodyData, AsyncPrettyPrinter

public class ResponseBodyFileManager
{
	private class AsyncPrettyPrintingCallable
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
			PrintWriter printwriter = new PrintWriter(((OutputStream) (bytearrayoutputstream)));
		//    4    8:new             #37  <Class PrintWriter>
		//    5   11:dup             
		//    6   12:aload_3         
		//    7   13:invokespecial   #40  <Method void PrintWriter(OutputStream)>
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

		public AsyncPrettyPrintingCallable(InputStream inputstream, AsyncPrettyPrinter asyncprettyprinter)
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


	public ResponseBodyFileManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:invokestatic    #36  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #38  <Field Map mRequestIdMap>
		mContext = context;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #40  <Field Context mContext>
	//   11   23:return          
	}

	private static String getFilename(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("network-response-body-");
	//    4    8:aload_1         
	//    5    9:ldc1            #11  <String "network-response-body-">
	//    6   11:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	private String prettyPrintContentWithTimeOut(AsyncPrettyPrinter asyncprettyprinter, InputStream inputstream)
		throws IOException
	{
		TimeoutException timeoutexception;
		asyncprettyprinter = ((AsyncPrettyPrinter) (new AsyncPrettyPrintingCallable(inputstream, asyncprettyprinter)));
	//    0    0:new             #6   <Class ResponseBodyFileManager$AsyncPrettyPrintingCallable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #65  <Method void ResponseBodyFileManager$AsyncPrettyPrintingCallable(ResponseBodyFileManager, InputStream, AsyncPrettyPrinter)>
	//    6   10:astore_1        
		Object obj = ((Object) (AsyncPrettyPrinterExecutorHolder.getExecutorService()));
	//    7   11:invokestatic    #71  <Method ExecutorService AsyncPrettyPrinterExecutorHolder.getExecutorService()>
	//    8   14:astore_3        
		if(obj == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		asyncprettyprinter = ((AsyncPrettyPrinter) (((ExecutorService) (obj)).submit(((Callable) (asyncprettyprinter)))));
	//   13   21:aload_3         
	//   14   22:aload_1         
	//   15   23:invokeinterface #77  <Method Future ExecutorService.submit(Callable)>
	//   16   28:astore_1        
		try
		{
			obj = ((Object) ((String)Util.getUninterruptibly(((Future) (asyncprettyprinter)), 10L, TimeUnit.SECONDS)));
	//   17   29:aload_1         
	//   18   30:ldc2w           #78  <Long 10L>
	//   19   33:getstatic       #85  <Field TimeUnit TimeUnit.SECONDS>
	//   20   36:invokestatic    #91  <Method Object Util.getUninterruptibly(Future, long, TimeUnit)>
	//   21   39:checkcast       #93  <Class String>
	//   22   42:astore_3        
		}
	//*  23   43:aload_3         
	//*  24   44:areturn         
	//*  25   45:astore_1        
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #97  <Method Throwable ExecutionException.getCause()>
	//*  28   50:astore_1        
	//*  29   51:aload_1         
	//*  30   52:ldc1            #58  <Class IOException>
	//*  31   54:invokestatic    #103 <Method void ExceptionUtil.propagateIfInstanceOf(Throwable, Class)>
	//*  32   57:aload_1         
	//*  33   58:invokestatic    #107 <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//*  34   61:athrow          
	//*  35   62:aload_1         
	//*  36   63:iconst_1        
	//*  37   64:invokeinterface #113 <Method boolean Future.cancel(boolean)>
	//*  38   69:pop             
	//*  39   70:new             #45  <Class StringBuilder>
	//*  40   73:dup             
	//*  41   74:invokespecial   #46  <Method void StringBuilder()>
	//*  42   77:astore_1        
	//*  43   78:aload_1         
	//*  44   79:ldc1            #115 <String "Time out after 10 seconds of attempting to pretty print\n">
	//*  45   81:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  46   84:pop             
	//*  47   85:aload_1         
	//*  48   86:aload_2         
	//*  49   87:invokestatic    #119 <Method String Util.readAsUTF8(InputStream)>
	//*  50   90:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  51   93:pop             
	//*  52   94:aload_1         
	//*  53   95:invokevirtual   #54  <Method String StringBuilder.toString()>
	//*  54   98:areturn         
		// Misplaced declaration of an exception variable
		catch(TimeoutException timeoutexception)
		{
			((Future) (asyncprettyprinter)).cancel(true);
			asyncprettyprinter = ((AsyncPrettyPrinter) (new StringBuilder()));
			((StringBuilder) (asyncprettyprinter)).append("Time out after 10 seconds of attempting to pretty print\n");
			((StringBuilder) (asyncprettyprinter)).append(Util.readAsUTF8(inputstream));
			return ((StringBuilder) (asyncprettyprinter)).toString();
		}
		// Misplaced declaration of an exception variable
		catch(AsyncPrettyPrinter asyncprettyprinter)
		{
			asyncprettyprinter = ((AsyncPrettyPrinter) (((ExecutionException) (asyncprettyprinter)).getCause()));
			ExceptionUtil.propagateIfInstanceOf(((Throwable) (asyncprettyprinter)), java/io/IOException);
			throw ExceptionUtil.propagate(((Throwable) (asyncprettyprinter)));
		}
		return ((String) (obj));
	//*  55   99:astore_3        
	//*  56  100:goto            62
	}

	public void associateAsyncPrettyPrinterWithId(String s, AsyncPrettyPrinter asyncprettyprinter)
	{
		if(mRequestIdMap.put(((Object) (s)), ((Object) (asyncprettyprinter))) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Map mRequestIdMap>
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//*   5   11:ifnonnull       15
		{
			return;
	//    6   14:return          
		} else
		{
			asyncprettyprinter = ((AsyncPrettyPrinter) (new StringBuilder()));
	//    7   15:new             #45  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #46  <Method void StringBuilder()>
	//   10   22:astore_2        
			((StringBuilder) (asyncprettyprinter)).append("cannot associate different pretty printers with the same request id: ");
	//   11   23:aload_2         
	//   12   24:ldc1            #130 <String "cannot associate different pretty printers with the same request id: ">
	//   13   26:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (asyncprettyprinter)).append(s);
	//   15   30:aload_2         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			throw new IllegalArgumentException(((StringBuilder) (asyncprettyprinter)).toString());
	//   19   36:new             #132 <Class IllegalArgumentException>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   23   44:invokespecial   #135 <Method void IllegalArgumentException(String)>
	//   24   47:athrow          
		}
	}

	public void cleanupFiles()
	{
		File afile[] = mContext.getFilesDir().listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context mContext>
	//    2    4:invokevirtual   #142 <Method File Context.getFilesDir()>
	//    3    7:invokevirtual   #148 <Method File[] File.listFiles()>
	//    4   10:astore_3        
		int j = afile.length;
	//    5   11:aload_3         
	//    6   12:arraylength     
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          92
		{
			File file = afile[i];
	//   13   21:aload_3         
	//   14   22:iload_1         
	//   15   23:aaload          
	//   16   24:astore          4
			if(file.getName().startsWith("network-response-body-") && !file.delete())
	//*  17   26:aload           4
	//*  18   28:invokevirtual   #151 <Method String File.getName()>
	//*  19   31:ldc1            #11  <String "network-response-body-">
	//*  20   33:invokevirtual   #155 <Method boolean String.startsWith(String)>
	//*  21   36:ifeq            85
	//*  22   39:aload           4
	//*  23   41:invokevirtual   #159 <Method boolean File.delete()>
	//*  24   44:ifne            85
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #45  <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #46  <Method void StringBuilder()>
	//   28   54:astore          5
				stringbuilder.append("Failed to delete ");
	//   29   56:aload           5
	//   30   58:ldc1            #161 <String "Failed to delete ">
	//   31   60:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
				stringbuilder.append(file.getAbsolutePath());
	//   33   64:aload           5
	//   34   66:aload           4
	//   35   68:invokevirtual   #164 <Method String File.getAbsolutePath()>
	//   36   71:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				LogRedirector.w("ResponseBodyFileManager", stringbuilder.toString());
	//   38   75:ldc1            #17  <String "ResponseBodyFileManager">
	//   39   77:aload           5
	//   40   79:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #170 <Method void LogRedirector.w(String, String)>
			}
		}

	//   42   85:iload_1         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_1        
	//*  46   89:goto            16
		LogRedirector.i("ResponseBodyFileManager", "Cleaned up temporary network files.");
	//   47   92:ldc1            #17  <String "ResponseBodyFileManager">
	//   48   94:ldc1            #172 <String "Cleaned up temporary network files.">
	//   49   96:invokestatic    #175 <Method void LogRedirector.i(String, String)>
	//   50   99:return          
	}

	public OutputStream openResponseBodyFile(String s, boolean flag)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #179 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #181 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #184 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public ResponseBodyData readFile(String s)
		throws IOException
	{
		java.io.FileInputStream fileinputstream = mContext.openFileInput(getFilename(s));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokestatic    #188 <Method String getFilename(String)>
	//    4    8:invokevirtual   #192 <Method java.io.FileInputStream Context.openFileInput(String)>
	//    5   11:astore          4
		int i = ((InputStream) (fileinputstream)).read();
	//    6   13:aload           4
	//    7   15:invokevirtual   #198 <Method int InputStream.read()>
	//    8   18:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_99;
	//    9   19:iload_2         
	//   10   20:iconst_m1       
	//   11   21:icmpeq          99
		ResponseBodyData responsebodydata = new ResponseBodyData();
	//   12   24:new             #200 <Class ResponseBodyData>
	//   13   27:dup             
	//   14   28:invokespecial   #201 <Method void ResponseBodyData()>
	//   15   31:astore          5
		boolean flag;
		if(i != 0)
	//*  16   33:iload_2         
	//*  17   34:ifeq            117
			flag = true;
	//   18   37:iconst_1        
	//   19   38:istore_3        
		else
	//*  20   39:goto            42
	//*  21   42:aload           5
	//*  22   44:iload_3         
	//*  23   45:putfield        #205 <Field boolean ResponseBodyData.base64Encoded>
	//*  24   48:aload_0         
	//*  25   49:getfield        #38  <Field Map mRequestIdMap>
	//*  26   52:aload_1         
	//*  27   53:invokeinterface #209 <Method Object Map.get(Object)>
	//*  28   58:checkcast       #211 <Class AsyncPrettyPrinter>
	//*  29   61:astore_1        
	//*  30   62:aload_1         
	//*  31   63:ifnull          81
	//*  32   66:aload           5
	//*  33   68:aload_0         
	//*  34   69:aload_1         
	//*  35   70:aload           4
	//*  36   72:invokespecial   #213 <Method String prettyPrintContentWithTimeOut(AsyncPrettyPrinter, InputStream)>
	//*  37   75:putfield        #216 <Field String ResponseBodyData.data>
	//*  38   78:goto            91
	//*  39   81:aload           5
	//*  40   83:aload           4
	//*  41   85:invokestatic    #119 <Method String Util.readAsUTF8(InputStream)>
	//*  42   88:putfield        #216 <Field String ResponseBodyData.data>
	//*  43   91:aload           4
	//*  44   93:invokevirtual   #219 <Method void InputStream.close()>
	//*  45   96:aload           5
	//*  46   98:areturn         
	//*  47   99:new             #221 <Class EOFException>
	//*  48  102:dup             
	//*  49  103:ldc1            #223 <String "Failed to read base64Encode byte">
	//*  50  105:invokespecial   #224 <Method void EOFException(String)>
	//*  51  108:athrow          
	//*  52  109:astore_1        
	//*  53  110:aload           4
	//*  54  112:invokevirtual   #219 <Method void InputStream.close()>
	//*  55  115:aload_1         
	//*  56  116:athrow          
			flag = false;
	//   57  117:iconst_0        
	//   58  118:istore_3        
		responsebodydata.base64Encoded = flag;
		s = ((String) ((AsyncPrettyPrinter)mRequestIdMap.get(((Object) (s)))));
		if(s == null)
			break MISSING_BLOCK_LABEL_81;
		responsebodydata.data = prettyPrintContentWithTimeOut(((AsyncPrettyPrinter) (s)), ((InputStream) (fileinputstream)));
		break MISSING_BLOCK_LABEL_91;
		responsebodydata.data = Util.readAsUTF8(((InputStream) (fileinputstream)));
		((InputStream) (fileinputstream)).close();
		return responsebodydata;
		throw new EOFException("Failed to read base64Encode byte");
		s;
		((InputStream) (fileinputstream)).close();
		throw s;
	//*  59  119:goto            42
	}

	private static final String FILENAME_PREFIX = "network-response-body-";
	private static final int PRETTY_PRINT_TIMEOUT_SEC = 10;
	private static final String TAG = "ResponseBodyFileManager";
	private final Context mContext;
	private final Map mRequestIdMap = Collections.synchronizedMap(((Map) (new HashMap())));
}

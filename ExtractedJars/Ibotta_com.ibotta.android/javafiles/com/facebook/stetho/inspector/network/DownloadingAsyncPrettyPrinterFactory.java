// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			AsyncPrettyPrinterFactory, AsyncPrettyPrinterExecutorHolder, AsyncPrettyPrinter, PrettyPrinterDisplayType

public abstract class DownloadingAsyncPrettyPrinterFactory
	implements AsyncPrettyPrinterFactory
{
	protected class MatchResult
	{

		public PrettyPrinterDisplayType getDisplayType()
		{
			return mDisplayType;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PrettyPrinterDisplayType mDisplayType>
		//    2    4:areturn         
		}

		public String getSchemaUri()
		{
			return mSchemaUri;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String mSchemaUri>
		//    2    4:areturn         
		}

		private final PrettyPrinterDisplayType mDisplayType;
		private final String mSchemaUri;
		final DownloadingAsyncPrettyPrinterFactory this$0;

		public MatchResult(String s, PrettyPrinterDisplayType prettyprinterdisplaytype)
		{
			this$0 = DownloadingAsyncPrettyPrinterFactory.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field DownloadingAsyncPrettyPrinterFactory this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mSchemaUri = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String mSchemaUri>
			mDisplayType = prettyprinterdisplaytype;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field PrettyPrinterDisplayType mDisplayType>
		//   11   19:return          
		}
	}

	private static class Request
		implements Callable
	{

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #28  <Method String call()>
		//    2    4:areturn         
		}

		public String call()
			throws IOException
		{
			int i;
			Object obj;
			obj = ((Object) ((HttpURLConnection)URLConnectionInstrumentation.openConnection(url.openConnection())));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field URL url>
		//    2    4:invokevirtual   #37  <Method java.net.URLConnection URL.openConnection()>
		//    3    7:invokestatic    #42  <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
		//    4   10:checkcast       #44  <Class HttpURLConnection>
		//    5   13:astore_2        
			i = ((HttpURLConnection) (obj)).getResponseCode();
		//    6   14:aload_2         
		//    7   15:invokevirtual   #48  <Method int HttpURLConnection.getResponseCode()>
		//    8   18:istore_1        
			if(i != 200)
				break MISSING_BLOCK_LABEL_49;
		//    9   19:iload_1         
		//   10   20:sipush          200
		//   11   23:icmpne          49
			obj = ((Object) (((HttpURLConnection) (obj)).getInputStream()));
		//   12   26:aload_2         
		//   13   27:invokevirtual   #52  <Method InputStream HttpURLConnection.getInputStream()>
		//   14   30:astore_2        
			String s = Util.readAsUTF8(((InputStream) (obj)));
		//   15   31:aload_2         
		//   16   32:invokestatic    #58  <Method String Util.readAsUTF8(InputStream)>
		//   17   35:astore_3        
			((InputStream) (obj)).close();
		//   18   36:aload_2         
		//   19   37:invokevirtual   #63  <Method void InputStream.close()>
			return s;
		//   20   40:aload_3         
		//   21   41:areturn         
			Exception exception;
			exception;
		//   22   42:astore_3        
			((InputStream) (obj)).close();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #63  <Method void InputStream.close()>
			throw exception;
		//   25   47:aload_3         
		//   26   48:athrow          
			StringBuilder stringbuilder = new StringBuilder();
		//   27   49:new             #65  <Class StringBuilder>
		//   28   52:dup             
		//   29   53:invokespecial   #66  <Method void StringBuilder()>
		//   30   56:astore_2        
			stringbuilder.append("Got status code: ");
		//   31   57:aload_2         
		//   32   58:ldc1            #68  <String "Got status code: ">
		//   33   60:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   34   63:pop             
			stringbuilder.append(i);
		//   35   64:aload_2         
		//   36   65:iload_1         
		//   37   66:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
		//   38   69:pop             
			stringbuilder.append(" while downloading ");
		//   39   70:aload_2         
		//   40   71:ldc1            #77  <String " while downloading ">
		//   41   73:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   42   76:pop             
			stringbuilder.append("schema with url: ");
		//   43   77:aload_2         
		//   44   78:ldc1            #79  <String "schema with url: ">
		//   45   80:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   46   83:pop             
			stringbuilder.append(url.toString());
		//   47   84:aload_2         
		//   48   85:aload_0         
		//   49   86:getfield        #20  <Field URL url>
		//   50   89:invokevirtual   #82  <Method String URL.toString()>
		//   51   92:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   52   95:pop             
			throw new IOException(stringbuilder.toString());
		//   53   96:new             #31  <Class IOException>
		//   54   99:dup             
		//   55  100:aload_2         
		//   56  101:invokevirtual   #83  <Method String StringBuilder.toString()>
		//   57  104:invokespecial   #86  <Method void IOException(String)>
		//   58  107:athrow          
		}

		private URL url;

		public Request(URL url1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			url = url1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field URL url>
		//    5    9:return          
		}
	}


	public DownloadingAsyncPrettyPrinterFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private static void doErrorPrint(PrintWriter printwriter, InputStream inputstream, String s)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("\n");
	//    8   14:aload_3         
	//    9   15:ldc1            #38  <String "\n">
	//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(Util.readAsUTF8(inputstream));
	//   12   21:aload_3         
	//   13   22:aload_1         
	//   14   23:invokestatic    #44  <Method String Util.readAsUTF8(InputStream)>
	//   15   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		printwriter.print(stringbuilder.toString());
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   20   35:invokevirtual   #54  <Method void PrintWriter.print(String)>
	//   21   38:return          
	}

	private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(String s, String s1)
	{
		return new AsyncPrettyPrinter(s, s1) {

			public PrettyPrinterDisplayType getPrettifiedType()
			{
				return PrettyPrinterDisplayType.TEXT;
			//    0    0:getstatic       #32  <Field PrettyPrinterDisplayType PrettyPrinterDisplayType.TEXT>
			//    1    3:areturn         
			}

			public void printTo(PrintWriter printwriter, InputStream inputstream)
				throws IOException
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #38  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #39  <Method void StringBuilder()>
			//    3    7:astore_3        
				stringbuilder.append("[Failed to parse header: ");
			//    4    8:aload_3         
			//    5    9:ldc1            #41  <String "[Failed to parse header: ">
			//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(headerName);
			//    8   15:aload_3         
			//    9   16:aload_0         
			//   10   17:getfield        #18  <Field String val$headerName>
			//   11   20:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//   12   23:pop             
				stringbuilder.append(" : ");
			//   13   24:aload_3         
			//   14   25:ldc1            #47  <String " : ">
			//   15   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//   16   30:pop             
				stringbuilder.append(headerValue);
			//   17   31:aload_3         
			//   18   32:aload_0         
			//   19   33:getfield        #20  <Field String val$headerValue>
			//   20   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//   21   39:pop             
				stringbuilder.append(" ]");
			//   22   40:aload_3         
			//   23   41:ldc1            #49  <String " ]">
			//   24   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//   25   46:pop             
				DownloadingAsyncPrettyPrinterFactory.doErrorPrint(printwriter, inputstream, stringbuilder.toString());
			//   26   47:aload_1         
			//   27   48:aload_2         
			//   28   49:aload_3         
			//   29   50:invokevirtual   #53  <Method String StringBuilder.toString()>
			//   30   53:invokestatic    #57  <Method void DownloadingAsyncPrettyPrinterFactory.access$000(PrintWriter, InputStream, String)>
			//   31   56:return          
			}

			final String val$headerName;
			final String val$headerValue;

			
			{
				headerName = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field String val$headerName>
				headerValue = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String val$headerValue>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #10  <Class DownloadingAsyncPrettyPrinterFactory$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #59  <Method void DownloadingAsyncPrettyPrinterFactory$2(String, String)>
	//    5    9:areturn         
	}

	private static URL parseURL(String s)
	{
		try
		{
			s = ((String) (new URL(s)));
	//    0    0:new             #66  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #68  <Method void URL(String)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
	//*   7   11:aconst_null     
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((URL) (s));
	//*   9   13:astore_0        
	//*  10   14:goto            11
	}

	protected abstract void doPrint(PrintWriter printwriter, InputStream inputstream, String s)
		throws IOException;

	public AsyncPrettyPrinter getInstance(String s, String s1)
	{
		MatchResult matchresult = matchAndParseHeader(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #75  <Method DownloadingAsyncPrettyPrinterFactory$MatchResult matchAndParseHeader(String, String)>
	//    4    6:astore_3        
		if(matchresult == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		URL url = parseURL(matchresult.getSchemaUri());
	//    9   13:aload_3         
	//   10   14:invokevirtual   #78  <Method String DownloadingAsyncPrettyPrinterFactory$MatchResult.getSchemaUri()>
	//   11   17:invokestatic    #80  <Method URL parseURL(String)>
	//   12   20:astore          4
		if(url == null)
	//*  13   22:aload           4
	//*  14   24:ifnonnull       33
			return getErrorAsyncPrettyPrinter(s, s1);
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokestatic    #82  <Method AsyncPrettyPrinter getErrorAsyncPrettyPrinter(String, String)>
	//   18   32:areturn         
		s = ((String) (AsyncPrettyPrinterExecutorHolder.getExecutorService()));
	//   19   33:invokestatic    #88  <Method ExecutorService AsyncPrettyPrinterExecutorHolder.getExecutorService()>
	//   20   36:astore_1        
		if(s == null)
	//*  21   37:aload_1         
	//*  22   38:ifnonnull       43
			return null;
	//   23   41:aconst_null     
	//   24   42:areturn         
		else
			return new AsyncPrettyPrinter() {

				public PrettyPrinterDisplayType getPrettifiedType()
				{
					return result.getDisplayType();
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field DownloadingAsyncPrettyPrinterFactory$MatchResult val$result>
				//    2    4:invokevirtual   #36  <Method PrettyPrinterDisplayType DownloadingAsyncPrettyPrinterFactory$MatchResult.getDisplayType()>
				//    3    7:areturn         
				}

				public void printTo(PrintWriter printwriter, InputStream inputstream)
					throws IOException
				{
					String s2 = (String)response.get();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field Future val$response>
				//    2    4:invokeinterface #50  <Method Object Future.get()>
				//    3    9:checkcast       #52  <Class String>
				//    4   12:astore_3        
					ExecutionException executionexception;
					try
					{
						doPrint(printwriter, inputstream, s2);
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
						DownloadingAsyncPrettyPrinterFactory.doErrorPrint(printwriter, inputstream, stringbuilder1.toString());
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
					DownloadingAsyncPrettyPrinterFactory.doErrorPrint(printwriter, inputstream, stringbuilder.toString());
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
				final MatchResult val$result;

			
			{
				this$0 = DownloadingAsyncPrettyPrinterFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DownloadingAsyncPrettyPrinterFactory this$0>
				response = future;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Future val$response>
				result = matchresult;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field DownloadingAsyncPrettyPrinterFactory$MatchResult val$result>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
;
	//   25   43:new             #8   <Class DownloadingAsyncPrettyPrinterFactory$1>
	//   26   46:dup             
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:new             #15  <Class DownloadingAsyncPrettyPrinterFactory$Request>
	//   30   52:dup             
	//   31   53:aload           4
	//   32   55:invokespecial   #91  <Method void DownloadingAsyncPrettyPrinterFactory$Request(URL)>
	//   33   58:invokeinterface #97  <Method Future ExecutorService.submit(Callable)>
	//   34   63:aload_3         
	//   35   64:invokespecial   #100 <Method void DownloadingAsyncPrettyPrinterFactory$1(DownloadingAsyncPrettyPrinterFactory, Future, DownloadingAsyncPrettyPrinterFactory$MatchResult)>
	//   36   67:areturn         
	}

	protected abstract MatchResult matchAndParseHeader(String s, String s1);


/*
	static void access$000(PrintWriter printwriter, InputStream inputstream, String s)
		throws IOException
	{
		doErrorPrint(printwriter, inputstream, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #28  <Method void doErrorPrint(PrintWriter, InputStream, String)>
		return;
	//    4    6:return          
	}

*/
}

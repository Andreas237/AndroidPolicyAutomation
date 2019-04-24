// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import android.content.Context;
import java.io.*;
import org.apache.http.*;
import org.apache.http.entity.AbstractHttpEntity;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappHandler, DumpappOutputBrokenException, StreamFramer, Dumper

public class StreamingDumpappHandler extends DumpappHandler
{
	private class DumpappHttpEntity extends AbstractHttpEntity
	{

		public InputStream getContent()
			throws IOException, IllegalStateException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #37  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public long getContentLength()
		{
			return -1L;
		//    0    0:ldc2w           #42  <Long -1L>
		//    1    3:lreturn         
		}

		public boolean isRepeatable()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isStreaming()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void writeTo(OutputStream outputstream)
			throws IOException
		{
			StreamingDumpappHandler.writeTo(mRequest, mDumper, mInput, outputstream);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field HttpRequest mRequest>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field Dumper mDumper>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field InputStream mInput>
		//    6   12:aload_1         
		//    7   13:invokestatic    #52  <Method void StreamingDumpappHandler.access$000(HttpRequest, Dumper, InputStream, OutputStream)>
		//    8   16:return          
		}

		private final Dumper mDumper;
		private final InputStream mInput;
		private final HttpRequest mRequest;
		final StreamingDumpappHandler this$0;

		DumpappHttpEntity(HttpRequest httprequest, Dumper dumper, InputStream inputstream)
		{
			this$0 = StreamingDumpappHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field StreamingDumpappHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void AbstractHttpEntity()>
			mRequest = httprequest;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field HttpRequest mRequest>
			mDumper = dumper;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Dumper mDumper>
			mInput = inputstream;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #28  <Field InputStream mInput>
		//   14   25:return          
		}
	}


	public StreamingDumpappHandler(Context context, Dumper dumper)
	{
		super(context, dumper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void DumpappHandler(Context, Dumper)>
	//    4    6:return          
	}

	private static void writeTo(HttpRequest httprequest, Dumper dumper, InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		outputstream = ((OutputStream) (new StreamFramer(outputstream)));
	//    0    0:new             #24  <Class StreamFramer>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #27  <Method void StreamFramer(OutputStream)>
	//    4    8:astore_3        
		httprequest = ((HttpRequest) (getArgs(httprequest)));
	//    5    9:aload_0         
	//    6   10:invokestatic    #31  <Method String[] getArgs(HttpRequest)>
	//    7   13:astore_0        
		try
		{
			((StreamFramer) (outputstream)).writeExitCode(dumper.dump(inputstream, ((StreamFramer) (outputstream)).getStdout(), ((StreamFramer) (outputstream)).getStderr(), ((String []) (httprequest))));
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #35  <Method java.io.PrintStream StreamFramer.getStdout()>
	//   13   21:aload_3         
	//   14   22:invokevirtual   #38  <Method java.io.PrintStream StreamFramer.getStderr()>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #44  <Method int Dumper.dump(InputStream, java.io.PrintStream, java.io.PrintStream, String[])>
	//   17   29:invokevirtual   #48  <Method void StreamFramer.writeExitCode(int)>
		}
	//*  18   32:goto            42
	//*  19   35:astore_0        
	//*  20   36:aload_3         
	//*  21   37:invokevirtual   #52  <Method void StreamFramer.close()>
	//*  22   40:aload_0         
	//*  23   41:athrow          
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #52  <Method void StreamFramer.close()>
	//*  26   46:return          
		// Misplaced declaration of an exception variable
		catch(HttpRequest httprequest) { }
	//   27   47:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   28   48:goto            42
		httprequest;
		((StreamFramer) (outputstream)).close();
		throw httprequest;
		((StreamFramer) (outputstream)).close();
		return;
	}

	protected HttpEntity getResponseEntity(HttpRequest httprequest, InputStream inputstream, HttpResponse httpresponse)
		throws IOException
	{
		httprequest = ((HttpRequest) (new DumpappHttpEntity(httprequest, getDumper(), inputstream)));
	//    0    0:new             #6   <Class StreamingDumpappHandler$DumpappHttpEntity>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #58  <Method Dumper getDumper()>
	//    6   10:aload_2         
	//    7   11:invokespecial   #61  <Method void StreamingDumpappHandler$DumpappHttpEntity(StreamingDumpappHandler, HttpRequest, Dumper, InputStream)>
	//    8   14:astore_1        
		((DumpappHttpEntity) (httprequest)).setChunked(true);
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #65  <Method void StreamingDumpappHandler$DumpappHttpEntity.setChunked(boolean)>
		((DumpappHttpEntity) (httprequest)).setContentType("application/octet-stream");
	//   12   20:aload_1         
	//   13   21:ldc1            #67  <String "application/octet-stream">
	//   14   23:invokevirtual   #71  <Method void StreamingDumpappHandler$DumpappHttpEntity.setContentType(String)>
		return ((HttpEntity) (httprequest));
	//   15   26:aload_1         
	//   16   27:areturn         
	}


/*
	static void access$000(HttpRequest httprequest, Dumper dumper, InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		writeTo(httprequest, dumper, inputstream, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #19  <Method void writeTo(HttpRequest, Dumper, InputStream, OutputStream)>
		return;
	//    5    7:return          
	}

*/
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import android.content.Context;
import java.io.*;
import org.apache.http.*;
import org.apache.http.entity.ByteArrayEntity;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappHandler, Dumper

public class RawDumpappHandler extends DumpappHandler
{

	public RawDumpappHandler(Context context, Dumper dumper)
	{
		super(context, dumper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void DumpappHandler(Context, Dumper)>
	//    4    6:return          
	}

	private static HttpEntity createResponseEntity(byte abyte0[])
	{
		ByteArrayEntity bytearrayentity = new ByteArrayEntity(abyte0);
	//    0    0:new             #17  <Class ByteArrayEntity>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void ByteArrayEntity(byte[])>
	//    4    8:astore_1        
		if(isProbablyBinaryData(abyte0))
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #24  <Method boolean isProbablyBinaryData(byte[])>
	//*   7   13:ifeq            24
		{
			bytearrayentity.setContentType("application/octet-stream");
	//    8   16:aload_1         
	//    9   17:ldc1            #26  <String "application/octet-stream">
	//   10   19:invokevirtual   #30  <Method void ByteArrayEntity.setContentType(String)>
			return ((HttpEntity) (bytearrayentity));
	//   11   22:aload_1         
	//   12   23:areturn         
		} else
		{
			bytearrayentity.setContentType("text/plain");
	//   13   24:aload_1         
	//   14   25:ldc1            #32  <String "text/plain">
	//   15   27:invokevirtual   #30  <Method void ByteArrayEntity.setContentType(String)>
			return ((HttpEntity) (bytearrayentity));
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	private static boolean isProbablyBinaryData(byte abyte0[])
	{
		for(int i = 0; i < abyte0.length;)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          54
		{
			byte byte0 = abyte0[i];
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:baload          
	//    9   11:istore_2        
			if(byte0 < 127 && (byte0 >= 32 || byte0 == 13 || byte0 == 10 || byte0 == 9))
	//*  10   12:iload_2         
	//*  11   13:bipush          127
	//*  12   15:icmpge          52
	//*  13   18:iload_2         
	//*  14   19:bipush          32
	//*  15   21:icmpge          45
	//*  16   24:iload_2         
	//*  17   25:bipush          13
	//*  18   27:icmpeq          45
	//*  19   30:iload_2         
	//*  20   31:bipush          10
	//*  21   33:icmpeq          45
	//*  22   36:iload_2         
	//*  23   37:bipush          9
	//*  24   39:icmpeq          45
	//*  25   42:goto            52
				i++;
	//   26   45:iload_1         
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore_1        
			else
	//*  30   49:goto            2
				return true;
	//   31   52:iconst_1        
	//   32   53:ireturn         
		}

		return false;
	//   33   54:iconst_0        
	//   34   55:ireturn         
	}

	protected HttpEntity getResponseEntity(HttpRequest httprequest, InputStream inputstream, HttpResponse httpresponse)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
	//    0    0:new             #38  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ByteArrayOutputStream()>
	//    3    7:astore          7
		PrintStream printstream = new PrintStream(((java.io.OutputStream) (bytearrayoutputstream1)));
	//    4    9:new             #43  <Class PrintStream>
	//    5   12:dup             
	//    6   13:aload           7
	//    7   15:invokespecial   #46  <Method void PrintStream(java.io.OutputStream)>
	//    8   18:astore          4
		ByteArrayOutputStream bytearrayoutputstream;
		PrintStream printstream1;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    9   20:new             #38  <Class ByteArrayOutputStream>
	//   10   23:dup             
	//   11   24:invokespecial   #41  <Method void ByteArrayOutputStream()>
	//   12   27:astore          5
		printstream1 = new PrintStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//   13   29:new             #43  <Class PrintStream>
	//   14   32:dup             
	//   15   33:aload           5
	//   16   35:invokespecial   #46  <Method void PrintStream(java.io.OutputStream)>
	//   17   38:astore          6
		httpresponse.addHeader("X-FAB-ExitCode", String.valueOf(getDumper().dump(inputstream, printstream, printstream1, getArgs(httprequest))));
	//   18   40:aload_3         
	//   19   41:ldc1            #8   <String "X-FAB-ExitCode">
	//   20   43:aload_0         
	//   21   44:invokevirtual   #50  <Method Dumper getDumper()>
	//   22   47:aload_2         
	//   23   48:aload           4
	//   24   50:aload           6
	//   25   52:aload_1         
	//   26   53:invokestatic    #54  <Method String[] getArgs(HttpRequest)>
	//   27   56:invokevirtual   #60  <Method int Dumper.dump(InputStream, PrintStream, PrintStream, String[])>
	//   28   59:invokestatic    #66  <Method String String.valueOf(int)>
	//   29   62:invokeinterface #72  <Method void HttpResponse.addHeader(String, String)>
		printstream1.close();
	//   30   67:aload           6
	//   31   69:invokevirtual   #75  <Method void PrintStream.close()>
		if(bytearrayoutputstream.size() > 0)
	//*  32   72:aload           5
	//*  33   74:invokevirtual   #79  <Method int ByteArrayOutputStream.size()>
	//*  34   77:ifle            91
			System.err.write(bytearrayoutputstream.toByteArray());
	//   35   80:getstatic       #85  <Field PrintStream System.err>
	//   36   83:aload           5
	//   37   85:invokevirtual   #89  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   38   88:invokevirtual   #92  <Method void PrintStream.write(byte[])>
		printstream.close();
	//   39   91:aload           4
	//   40   93:invokevirtual   #75  <Method void PrintStream.close()>
		inputstream.close();
	//   41   96:aload_2         
	//   42   97:invokevirtual   #95  <Method void InputStream.close()>
		return createResponseEntity(bytearrayoutputstream1.toByteArray());
	//   43  100:aload           7
	//   44  102:invokevirtual   #89  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   45  105:invokestatic    #97  <Method HttpEntity createResponseEntity(byte[])>
	//   46  108:areturn         
		httprequest;
	//   47  109:astore_1        
		printstream1.close();
	//   48  110:aload           6
	//   49  112:invokevirtual   #75  <Method void PrintStream.close()>
		if(bytearrayoutputstream.size() > 0)
	//*  50  115:aload           5
	//*  51  117:invokevirtual   #79  <Method int ByteArrayOutputStream.size()>
	//*  52  120:ifle            134
			System.err.write(bytearrayoutputstream.toByteArray());
	//   53  123:getstatic       #85  <Field PrintStream System.err>
	//   54  126:aload           5
	//   55  128:invokevirtual   #89  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   56  131:invokevirtual   #92  <Method void PrintStream.write(byte[])>
		throw httprequest;
	//   57  134:aload_1         
	//   58  135:athrow          
		httprequest;
	//   59  136:astore_1        
		printstream.close();
	//   60  137:aload           4
	//   61  139:invokevirtual   #75  <Method void PrintStream.close()>
		throw httprequest;
	//   62  142:aload_1         
	//   63  143:athrow          
		httprequest;
	//   64  144:astore_1        
		inputstream.close();
	//   65  145:aload_2         
	//   66  146:invokevirtual   #95  <Method void InputStream.close()>
		throw httprequest;
	//   67  149:aload_1         
	//   68  150:athrow          
	}

	private static final String RESPONSE_HEADER_EXIT_CODE = "X-FAB-ExitCode";
}

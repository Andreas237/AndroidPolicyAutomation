// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server.http;

import android.net.Uri;
import com.facebook.stetho.server.LeakyBufferedInputStream;
import com.facebook.stetho.server.SocketLike;
import java.io.*;
import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.server.http:
//			LightHttpRequest, HandlerRegistry, LightHttpResponse, LightHttpBody, 
//			HttpHandler, LightHttpMessage

public class LightHttpServer
{
	private static class HttpMessageReader
	{

		public String readLine()
			throws IOException
		{
			do
			{
				int i = mIn.read();
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field BufferedInputStream mIn>
		//    2    4:invokevirtual   #45  <Method int BufferedInputStream.read()>
		//    3    7:istore_2        
				if(i < 0)
		//*   4    8:iload_2         
		//*   5    9:ifge            14
					return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
				char c = (char)i;
		//    8   14:iload_2         
		//    9   15:int2char        
		//   10   16:istore_1        
				mNewLineDetector.accept(c);
		//   11   17:aload_0         
		//   12   18:getfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
		//   13   21:iload_1         
		//   14   22:invokevirtual   #49  <Method void LightHttpServer$HttpMessageReader$NewLineDetector.accept(char)>
				switch(mNewLineDetector.state())
		//*  15   25:aload_0         
		//*  16   26:getfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
		//*  17   29:invokevirtual   #52  <Method int LightHttpServer$HttpMessageReader$NewLineDetector.state()>
				{
		//*  18   32:tableswitch     1 3: default 60
		//		               1 81
		//		               2 0
		//		               3 63
		//*  19   60:goto            0
				case 3: // '\003'
					String s = mBuffer.toString();
		//   20   63:aload_0         
		//   21   64:getfield        #26  <Field StringBuilder mBuffer>
		//   22   67:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   23   70:astore_3        
					mBuffer.setLength(0);
		//   24   71:aload_0         
		//   25   72:getfield        #26  <Field StringBuilder mBuffer>
		//   26   75:iconst_0        
		//   27   76:invokevirtual   #59  <Method void StringBuilder.setLength(int)>
					return s;
		//   28   79:aload_3         
		//   29   80:areturn         

				case 1: // '\001'
					mBuffer.append(c);
		//   30   81:aload_0         
		//   31   82:getfield        #26  <Field StringBuilder mBuffer>
		//   32   85:iload_1         
		//   33   86:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
		//   34   89:pop             
					break;
				}
			} while(true);
		//*  35   90:goto            0
		}

		private final StringBuilder mBuffer = new StringBuilder();
		private final BufferedInputStream mIn;
		private final NewLineDetector mNewLineDetector = new NewLineDetector();

		public HttpMessageReader(BufferedInputStream bufferedinputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #23  <Class StringBuilder>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void StringBuilder()>
		//    6   12:putfield        #26  <Field StringBuilder mBuffer>
		//    7   15:aload_0         
		//    8   16:new             #9   <Class LightHttpServer$HttpMessageReader$NewLineDetector>
		//    9   19:dup             
		//   10   20:aconst_null     
		//   11   21:invokespecial   #29  <Method void LightHttpServer$HttpMessageReader$NewLineDetector(LightHttpServer$1)>
		//   12   24:putfield        #31  <Field LightHttpServer$HttpMessageReader$NewLineDetector mNewLineDetector>
			mIn = bufferedinputstream;
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:putfield        #33  <Field BufferedInputStream mIn>
		//   16   32:return          
		}
	}

	private static class HttpMessageReader.NewLineDetector
	{

		public void accept(char c)
		{
			switch(state)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field int state>
			{
		//*   2    4:tableswitch     1 3: default 32
		//		               1 104
		//		               2 86
		//		               3 68
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    3   32:new             #31  <Class StringBuilder>
		//    4   35:dup             
		//    5   36:invokespecial   #32  <Method void StringBuilder()>
		//    6   39:astore_2        
				stringbuilder.append("Unknown state: ");
		//    7   40:aload_2         
		//    8   41:ldc1            #34  <String "Unknown state: ">
		//    9   43:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   10   46:pop             
				stringbuilder.append(state);
		//   11   47:aload_2         
		//   12   48:aload_0         
		//   13   49:getfield        #24  <Field int state>
		//   14   52:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   15   55:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   16   56:new             #43  <Class IllegalArgumentException>
		//   17   59:dup             
		//   18   60:aload_2         
		//   19   61:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   20   64:invokespecial   #50  <Method void IllegalArgumentException(String)>
		//   21   67:athrow          

			case 3: // '\003'
				if(c == '\r')
		//*  22   68:iload_1         
		//*  23   69:bipush          13
		//*  24   71:icmpne          80
				{
					state = 2;
		//   25   74:aload_0         
		//   26   75:iconst_2        
		//   27   76:putfield        #24  <Field int state>
					return;
		//   28   79:return          
				} else
				{
					state = 1;
		//   29   80:aload_0         
		//   30   81:iconst_1        
		//   31   82:putfield        #24  <Field int state>
					return;
		//   32   85:return          
				}

			case 2: // '\002'
				if(c == '\n')
		//*  33   86:iload_1         
		//*  34   87:bipush          10
		//*  35   89:icmpne          98
				{
					state = 3;
		//   36   92:aload_0         
		//   37   93:iconst_3        
		//   38   94:putfield        #24  <Field int state>
					return;
		//   39   97:return          
				} else
				{
					state = 1;
		//   40   98:aload_0         
		//   41   99:iconst_1        
		//   42  100:putfield        #24  <Field int state>
					return;
		//   43  103:return          
				}

			case 1: // '\001'
				break;
			}
			if(c == '\r')
		//*  44  104:iload_1         
		//*  45  105:bipush          13
		//*  46  107:icmpne          115
				state = 2;
		//   47  110:aload_0         
		//   48  111:iconst_2        
		//   49  112:putfield        #24  <Field int state>
		//   50  115:return          
		}

		public int state()
		{
			return state;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int state>
		//    2    4:ireturn         
		}

		private static final int STATE_ON_CR = 2;
		private static final int STATE_ON_CRLF = 3;
		private static final int STATE_ON_OTHER = 1;
		private int state;

		private HttpMessageReader.NewLineDetector()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			state = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #24  <Field int state>
		//    5    9:return          
		}

	}

	public static class HttpMessageWriter
	{

		public void flush()
			throws IOException
		{
			mOut.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field BufferedOutputStream mOut>
		//    2    4:invokevirtual   #37  <Method void BufferedOutputStream.flush()>
		//    3    7:return          
		}

		public void writeLine()
			throws IOException
		{
			mOut.write(CRLF);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field BufferedOutputStream mOut>
		//    2    4:getstatic       #23  <Field byte[] CRLF>
		//    3    7:invokevirtual   #43  <Method void BufferedOutputStream.write(byte[])>
		//    4   10:return          
		}

		public void writeLine(String s)
			throws IOException
		{
			int j = s.length();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #48  <Method int String.length()>
		//    2    4:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iload_3         
		//*   7    9:icmpge          35
			{
				char c = s.charAt(i);
		//    8   12:aload_1         
		//    9   13:iload_2         
		//   10   14:invokevirtual   #52  <Method char String.charAt(int)>
		//   11   17:istore          4
				mOut.write(((int) (c)));
		//   12   19:aload_0         
		//   13   20:getfield        #30  <Field BufferedOutputStream mOut>
		//   14   23:iload           4
		//   15   25:invokevirtual   #55  <Method void BufferedOutputStream.write(int)>
			}

		//   16   28:iload_2         
		//   17   29:iconst_1        
		//   18   30:iadd            
		//   19   31:istore_2        
		//*  20   32:goto            7
			mOut.write(CRLF);
		//   21   35:aload_0         
		//   22   36:getfield        #30  <Field BufferedOutputStream mOut>
		//   23   39:getstatic       #23  <Field byte[] CRLF>
		//   24   42:invokevirtual   #43  <Method void BufferedOutputStream.write(byte[])>
		//   25   45:return          
		}

		private static final byte CRLF[] = "\r\n".getBytes();
		private final BufferedOutputStream mOut;

		static 
		{
		//    0    0:ldc1            #15  <String "\r\n">
		//    1    2:invokevirtual   #21  <Method byte[] String.getBytes()>
		//    2    5:putstatic       #23  <Field byte[] CRLF>
		//*   3    8:return          
		}

		public HttpMessageWriter(BufferedOutputStream bufferedoutputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			mOut = bufferedoutputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field BufferedOutputStream mOut>
		//    5    9:return          
		}
	}


	public LightHttpServer(HandlerRegistry handlerregistry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mHandlerRegistry = handlerregistry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field HandlerRegistry mHandlerRegistry>
	//    5    9:return          
	}

	private boolean dispatchToHandler(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
		throws IOException
	{
		Object obj;
		obj = ((Object) (mHandlerRegistry.lookup(lighthttprequest.uri.getPath())));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HandlerRegistry mHandlerRegistry>
	//    2    4:aload_2         
	//    3    5:getfield        #41  <Field Uri LightHttpRequest.uri>
	//    4    8:invokevirtual   #47  <Method String Uri.getPath()>
	//    5   11:invokevirtual   #53  <Method HttpHandler HandlerRegistry.lookup(String)>
	//    6   14:astore          5
		if(obj == null)
	//*   7   16:aload           5
	//*   8   18:ifnonnull       47
		{
			lighthttpresponse.code = 404;
	//    9   21:aload_3         
	//   10   22:sipush          404
	//   11   25:putfield        #59  <Field int LightHttpResponse.code>
			lighthttpresponse.reasonPhrase = "Not found";
	//   12   28:aload_3         
	//   13   29:ldc1            #61  <String "Not found">
	//   14   31:putfield        #64  <Field String LightHttpResponse.reasonPhrase>
			lighthttpresponse.body = LightHttpBody.create("No handler found\n", "text/plain");
	//   15   34:aload_3         
	//   16   35:ldc1            #66  <String "No handler found\n">
	//   17   37:ldc1            #68  <String "text/plain">
	//   18   39:invokestatic    #74  <Method LightHttpBody LightHttpBody.create(String, String)>
	//   19   42:putfield        #78  <Field LightHttpBody LightHttpResponse.body>
			return true;
	//   20   45:iconst_1        
	//   21   46:ireturn         
		}
		boolean flag = ((HttpHandler) (obj)).handleRequest(socketlike, lighthttprequest, lighthttpresponse);
	//   22   47:aload           5
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:aload_3         
	//   26   52:invokeinterface #83  <Method boolean HttpHandler.handleRequest(SocketLike, LightHttpRequest, LightHttpResponse)>
	//   27   57:istore          4
		return flag;
	//   28   59:iload           4
	//   29   61:ireturn         
		lighthttprequest;
	//   30   62:astore_2        
		lighthttpresponse.code = 500;
	//   31   63:aload_3         
	//   32   64:sipush          500
	//   33   67:putfield        #59  <Field int LightHttpResponse.code>
		lighthttpresponse.reasonPhrase = "Internal Server Error";
	//   34   70:aload_3         
	//   35   71:ldc1            #85  <String "Internal Server Error">
	//   36   73:putfield        #64  <Field String LightHttpResponse.reasonPhrase>
		obj = ((Object) (new StringWriter()));
	//   37   76:new             #87  <Class StringWriter>
	//   38   79:dup             
	//   39   80:invokespecial   #88  <Method void StringWriter()>
	//   40   83:astore          5
		socketlike = ((SocketLike) (new PrintWriter(((java.io.Writer) (obj)))));
	//   41   85:new             #90  <Class PrintWriter>
	//   42   88:dup             
	//   43   89:aload           5
	//   44   91:invokespecial   #93  <Method void PrintWriter(java.io.Writer)>
	//   45   94:astore_1        
		((RuntimeException) (lighthttprequest)).printStackTrace(((PrintWriter) (socketlike)));
	//   46   95:aload_2         
	//   47   96:aload_1         
	//   48   97:invokevirtual   #97  <Method void RuntimeException.printStackTrace(PrintWriter)>
		((PrintWriter) (socketlike)).close();
	//   49  100:aload_1         
	//   50  101:invokevirtual   #100 <Method void PrintWriter.close()>
		lighthttpresponse.body = LightHttpBody.create(((StringWriter) (obj)).toString(), "text/plain");
	//   51  104:aload_3         
	//   52  105:aload           5
	//   53  107:invokevirtual   #103 <Method String StringWriter.toString()>
	//   54  110:ldc1            #68  <String "text/plain">
	//   55  112:invokestatic    #74  <Method LightHttpBody LightHttpBody.create(String, String)>
	//   56  115:putfield        #78  <Field LightHttpBody LightHttpResponse.body>
		return true;
	//   57  118:iconst_1        
	//   58  119:ireturn         
		lighthttprequest;
	//   59  120:astore_2        
		((PrintWriter) (socketlike)).close();
	//   60  121:aload_1         
	//   61  122:invokevirtual   #100 <Method void PrintWriter.close()>
		throw lighthttprequest;
	//   62  125:aload_2         
	//   63  126:athrow          
	}

	private static void readHeaders(LightHttpMessage lighthttpmessage, HttpMessageReader httpmessagereader)
		throws IOException
	{
		do
		{
			String s = httpmessagereader.readLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method String LightHttpServer$HttpMessageReader.readLine()>
	//    2    4:astore_2        
			if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          95
			{
				if("".equals(((Object) (s))))
	//*   5    9:ldc1            #111 <String "">
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*   8   15:ifeq            19
					return;
	//    9   18:return          
				String as[] = s.split(": ", 2);
	//   10   19:aload_2         
	//   11   20:ldc1            #119 <String ": ">
	//   12   22:iconst_2        
	//   13   23:invokevirtual   #123 <Method String[] String.split(String, int)>
	//   14   26:astore_3        
				if(as.length == 2)
	//*  15   27:aload_3         
	//*  16   28:arraylength     
	//*  17   29:iconst_2        
	//*  18   30:icmpne          62
				{
					s = as[0];
	//   19   33:aload_3         
	//   20   34:iconst_0        
	//   21   35:aaload          
	//   22   36:astore_2        
					String s1 = as[1];
	//   23   37:aload_3         
	//   24   38:iconst_1        
	//   25   39:aaload          
	//   26   40:astore_3        
					lighthttpmessage.headerNames.add(((Object) (s)));
	//   27   41:aload_0         
	//   28   42:getfield        #129 <Field ArrayList LightHttpMessage.headerNames>
	//   29   45:aload_2         
	//   30   46:invokevirtual   #134 <Method boolean ArrayList.add(Object)>
	//   31   49:pop             
					lighthttpmessage.headerValues.add(((Object) (s1)));
	//   32   50:aload_0         
	//   33   51:getfield        #137 <Field ArrayList LightHttpMessage.headerValues>
	//   34   54:aload_3         
	//   35   55:invokevirtual   #134 <Method boolean ArrayList.add(Object)>
	//   36   58:pop             
				} else
	//*  37   59:goto            0
				{
					lighthttpmessage = ((LightHttpMessage) (new StringBuilder()));
	//   38   62:new             #139 <Class StringBuilder>
	//   39   65:dup             
	//   40   66:invokespecial   #140 <Method void StringBuilder()>
	//   41   69:astore_0        
					((StringBuilder) (lighthttpmessage)).append("Malformed header: ");
	//   42   70:aload_0         
	//   43   71:ldc1            #142 <String "Malformed header: ">
	//   44   73:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   45   76:pop             
					((StringBuilder) (lighthttpmessage)).append(s);
	//   46   77:aload_0         
	//   47   78:aload_2         
	//   48   79:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   49   82:pop             
					throw new IOException(((StringBuilder) (lighthttpmessage)).toString());
	//   50   83:new             #33  <Class IOException>
	//   51   86:dup             
	//   52   87:aload_0         
	//   53   88:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   54   91:invokespecial   #150 <Method void IOException(String)>
	//   55   94:athrow          
				}
			} else
			{
				throw new EOFException();
	//   56   95:new             #152 <Class EOFException>
	//   57   98:dup             
	//   58   99:invokespecial   #153 <Method void EOFException()>
	//   59  102:athrow          
			}
		} while(true);
	}

	private static LightHttpRequest readRequestMessage(LightHttpRequest lighthttprequest, HttpMessageReader httpmessagereader)
		throws IOException
	{
		lighthttprequest.reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method void LightHttpRequest.reset()>
		String s = httpmessagereader.readLine();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method String LightHttpServer$HttpMessageReader.readLine()>
	//    4    8:astore_2        
		if(s == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		String as[] = s.split(" ", 3);
	//    9   15:aload_2         
	//   10   16:ldc1            #161 <String " ">
	//   11   18:iconst_3        
	//   12   19:invokevirtual   #123 <Method String[] String.split(String, int)>
	//   13   22:astore_3        
		if(as.length == 3)
	//*  14   23:aload_3         
	//*  15   24:arraylength     
	//*  16   25:iconst_3        
	//*  17   26:icmpne          60
		{
			lighthttprequest.method = as[0];
	//   18   29:aload_0         
	//   19   30:aload_3         
	//   20   31:iconst_0        
	//   21   32:aaload          
	//   22   33:putfield        #164 <Field String LightHttpRequest.method>
			lighthttprequest.uri = Uri.parse(as[1]);
	//   23   36:aload_0         
	//   24   37:aload_3         
	//   25   38:iconst_1        
	//   26   39:aaload          
	//   27   40:invokestatic    #168 <Method Uri Uri.parse(String)>
	//   28   43:putfield        #41  <Field Uri LightHttpRequest.uri>
			lighthttprequest.protocol = as[2];
	//   29   46:aload_0         
	//   30   47:aload_3         
	//   31   48:iconst_2        
	//   32   49:aaload          
	//   33   50:putfield        #171 <Field String LightHttpRequest.protocol>
			readHeaders(((LightHttpMessage) (lighthttprequest)), httpmessagereader);
	//   34   53:aload_0         
	//   35   54:aload_1         
	//   36   55:invokestatic    #173 <Method void readHeaders(LightHttpMessage, LightHttpServer$HttpMessageReader)>
			return lighthttprequest;
	//   37   58:aload_0         
	//   38   59:areturn         
		} else
		{
			lighthttprequest = ((LightHttpRequest) (new StringBuilder()));
	//   39   60:new             #139 <Class StringBuilder>
	//   40   63:dup             
	//   41   64:invokespecial   #140 <Method void StringBuilder()>
	//   42   67:astore_0        
			((StringBuilder) (lighthttprequest)).append("Invalid request line: ");
	//   43   68:aload_0         
	//   44   69:ldc1            #175 <String "Invalid request line: ">
	//   45   71:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   46   74:pop             
			((StringBuilder) (lighthttprequest)).append(s);
	//   47   75:aload_0         
	//   48   76:aload_2         
	//   49   77:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   50   80:pop             
			throw new IOException(((StringBuilder) (lighthttprequest)).toString());
	//   51   81:new             #33  <Class IOException>
	//   52   84:dup             
	//   53   85:aload_0         
	//   54   86:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   55   89:invokespecial   #150 <Method void IOException(String)>
	//   56   92:athrow          
		}
	}

	private static void writeFullResponse(LightHttpResponse lighthttpresponse, HttpMessageWriter httpmessagewriter, OutputStream outputstream)
		throws IOException
	{
		lighthttpresponse.prepare();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method void LightHttpResponse.prepare()>
		writeResponseMessage(lighthttpresponse, httpmessagewriter);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #185 <Method void writeResponseMessage(LightHttpResponse, LightHttpServer$HttpMessageWriter)>
		if(lighthttpresponse.body != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #78  <Field LightHttpBody LightHttpResponse.body>
	//*   7   13:ifnull          24
			lighthttpresponse.body.writeTo(outputstream);
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field LightHttpBody LightHttpResponse.body>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #189 <Method void LightHttpBody.writeTo(OutputStream)>
	//   12   24:return          
	}

	public static void writeResponseMessage(LightHttpResponse lighthttpresponse, HttpMessageWriter httpmessagewriter)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #139 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("HTTP/1.1 ");
	//    4    9:aload           4
	//    5   11:ldc1            #191 <String "HTTP/1.1 ">
	//    6   13:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(lighthttpresponse.code);
	//    8   17:aload           4
	//    9   19:aload_0         
	//   10   20:getfield        #59  <Field int LightHttpResponse.code>
	//   11   23:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:pop             
		stringbuilder.append(" ");
	//   13   27:aload           4
	//   14   29:ldc1            #161 <String " ">
	//   15   31:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(lighthttpresponse.reasonPhrase);
	//   17   35:aload           4
	//   18   37:aload_0         
	//   19   38:getfield        #64  <Field String LightHttpResponse.reasonPhrase>
	//   20   41:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		httpmessagewriter.writeLine(stringbuilder.toString());
	//   22   45:aload_1         
	//   23   46:aload           4
	//   24   48:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   25   51:invokevirtual   #197 <Method void LightHttpServer$HttpMessageWriter.writeLine(String)>
		int j = lighthttpresponse.headerNames.size();
	//   26   54:aload_0         
	//   27   55:getfield        #198 <Field ArrayList LightHttpResponse.headerNames>
	//   28   58:invokevirtual   #202 <Method int ArrayList.size()>
	//   29   61:istore_3        
		for(int i = 0; i < j; i++)
	//*  30   62:iconst_0        
	//*  31   63:istore_2        
	//*  32   64:iload_2         
	//*  33   65:iload_3         
	//*  34   66:icmpge          144
		{
			String s = (String)lighthttpresponse.headerNames.get(i);
	//   35   69:aload_0         
	//   36   70:getfield        #198 <Field ArrayList LightHttpResponse.headerNames>
	//   37   73:iload_2         
	//   38   74:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   39   77:checkcast       #113 <Class String>
	//   40   80:astore          4
			String s1 = (String)lighthttpresponse.headerValues.get(i);
	//   41   82:aload_0         
	//   42   83:getfield        #207 <Field ArrayList LightHttpResponse.headerValues>
	//   43   86:iload_2         
	//   44   87:invokevirtual   #206 <Method Object ArrayList.get(int)>
	//   45   90:checkcast       #113 <Class String>
	//   46   93:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//   47   95:new             #139 <Class StringBuilder>
	//   48   98:dup             
	//   49   99:invokespecial   #140 <Method void StringBuilder()>
	//   50  102:astore          6
			stringbuilder1.append(s);
	//   51  104:aload           6
	//   52  106:aload           4
	//   53  108:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
			stringbuilder1.append(": ");
	//   55  112:aload           6
	//   56  114:ldc1            #119 <String ": ">
	//   57  116:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   58  119:pop             
			stringbuilder1.append(s1);
	//   59  120:aload           6
	//   60  122:aload           5
	//   61  124:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   62  127:pop             
			httpmessagewriter.writeLine(stringbuilder1.toString());
	//   63  128:aload_1         
	//   64  129:aload           6
	//   65  131:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   66  134:invokevirtual   #197 <Method void LightHttpServer$HttpMessageWriter.writeLine(String)>
		}

	//   67  137:iload_2         
	//   68  138:iconst_1        
	//   69  139:iadd            
	//   70  140:istore_2        
	//*  71  141:goto            64
		httpmessagewriter.writeLine();
	//   72  144:aload_1         
	//   73  145:invokevirtual   #209 <Method void LightHttpServer$HttpMessageWriter.writeLine()>
		httpmessagewriter.flush();
	//   74  148:aload_1         
	//   75  149:invokevirtual   #212 <Method void LightHttpServer$HttpMessageWriter.flush()>
	//   76  152:return          
	}

	public void serve(SocketLike socketlike)
		throws IOException
	{
		Object obj = ((Object) (new LeakyBufferedInputStream(socketlike.getInput(), 1024)));
	//    0    0:new             #216 <Class LeakyBufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method java.io.InputStream SocketLike.getInput()>
	//    4    8:sipush          1024
	//    5   11:invokespecial   #225 <Method void LeakyBufferedInputStream(java.io.InputStream, int)>
	//    6   14:astore          5
		OutputStream outputstream = socketlike.getOutput();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #229 <Method OutputStream SocketLike.getOutput()>
	//    9   20:astore_2        
		HttpMessageReader httpmessagereader = new HttpMessageReader(((BufferedInputStream) (obj)));
	//   10   21:new             #8   <Class LightHttpServer$HttpMessageReader>
	//   11   24:dup             
	//   12   25:aload           5
	//   13   27:invokespecial   #232 <Method void LightHttpServer$HttpMessageReader(BufferedInputStream)>
	//   14   30:astore_3        
		HttpMessageWriter httpmessagewriter = new HttpMessageWriter(new BufferedOutputStream(outputstream));
	//   15   31:new             #14  <Class LightHttpServer$HttpMessageWriter>
	//   16   34:dup             
	//   17   35:new             #234 <Class BufferedOutputStream>
	//   18   38:dup             
	//   19   39:aload_2         
	//   20   40:invokespecial   #236 <Method void BufferedOutputStream(OutputStream)>
	//   21   43:invokespecial   #239 <Method void LightHttpServer$HttpMessageWriter(BufferedOutputStream)>
	//   22   46:astore          4
		socketlike = new SocketLike(socketlike, ((LeakyBufferedInputStream) (obj)));
	//   23   48:new             #218 <Class SocketLike>
	//   24   51:dup             
	//   25   52:aload_1         
	//   26   53:aload           5
	//   27   55:invokespecial   #242 <Method void SocketLike(SocketLike, LeakyBufferedInputStream)>
	//   28   58:astore_1        
		obj = ((Object) (new LightHttpRequest()));
	//   29   59:new             #37  <Class LightHttpRequest>
	//   30   62:dup             
	//   31   63:invokespecial   #243 <Method void LightHttpRequest()>
	//   32   66:astore          5
		LightHttpResponse lighthttpresponse = new LightHttpResponse();
	//   33   68:new             #55  <Class LightHttpResponse>
	//   34   71:dup             
	//   35   72:invokespecial   #244 <Method void LightHttpResponse()>
	//   36   75:astore          6
		do
		{
			LightHttpRequest lighthttprequest = readRequestMessage(((LightHttpRequest) (obj)), httpmessagereader);
	//   37   77:aload           5
	//   38   79:aload_3         
	//   39   80:invokestatic    #246 <Method LightHttpRequest readRequestMessage(LightHttpRequest, LightHttpServer$HttpMessageReader)>
	//   40   83:astore          7
			if(lighthttprequest != null)
	//*  41   85:aload           7
	//*  42   87:ifnull          119
			{
				lighthttpresponse.reset();
	//   43   90:aload           6
	//   44   92:invokevirtual   #247 <Method void LightHttpResponse.reset()>
				if(!dispatchToHandler(socketlike, lighthttprequest, lighthttpresponse))
	//*  45   95:aload_0         
	//*  46   96:aload_1         
	//*  47   97:aload           7
	//*  48   99:aload           6
	//*  49  101:invokespecial   #249 <Method boolean dispatchToHandler(SocketLike, LightHttpRequest, LightHttpResponse)>
	//*  50  104:ifne            108
					return;
	//   51  107:return          
				writeFullResponse(lighthttpresponse, httpmessagewriter, outputstream);
	//   52  108:aload           6
	//   53  110:aload           4
	//   54  112:aload_2         
	//   55  113:invokestatic    #251 <Method void writeFullResponse(LightHttpResponse, LightHttpServer$HttpMessageWriter, OutputStream)>
			} else
	//*  56  116:goto            77
			{
				return;
	//   57  119:return          
			}
		} while(true);
	}

	private static final String TAG = "LightHttpServer";
	private final HandlerRegistry mHandlerRegistry;
}

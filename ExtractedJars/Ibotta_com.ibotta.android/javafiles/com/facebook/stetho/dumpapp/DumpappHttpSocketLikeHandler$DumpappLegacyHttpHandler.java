// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import android.net.Uri;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.*;
import java.io.*;
import java.util.List;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpappHttpSocketLikeHandler, Framer, DumpappSocketLikeHandler, Dumper

private static class DumpappHttpSocketLikeHandler$DumpappLegacyHttpHandler
	implements HttpHandler
{

	public boolean handleRequest(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
		throws IOException
	{
		boolean flag1 = "POST".equals(((Object) (lighthttprequest.method)));
	//    0    0:ldc1            #35  <String "POST">
	//    1    2:aload_2         
	//    2    3:getfield        #40  <Field String LightHttpRequest.method>
	//    3    6:invokevirtual   #46  <Method boolean String.equals(Object)>
	//    4    9:istore          5
		boolean flag;
		if(!flag1 && "GET".equals(((Object) (lighthttprequest.method))))
	//*   5   11:iload           5
	//*   6   13:ifne            34
	//*   7   16:ldc1            #48  <String "GET">
	//*   8   18:aload_2         
	//*   9   19:getfield        #40  <Field String LightHttpRequest.method>
	//*  10   22:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  11   25:ifeq            34
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore          4
		else
	//*  14   31:goto            37
			flag = false;
	//   15   34:iconst_0        
	//   16   35:istore          4
		if(!flag && !flag1)
	//*  17   37:iload           4
	//*  18   39:ifne            102
	//*  19   42:iload           5
	//*  20   44:ifeq            50
	//*  21   47:goto            102
		{
			lighthttpresponse.code = 501;
	//   22   50:aload_3         
	//   23   51:sipush          501
	//   24   54:putfield        #54  <Field int LightHttpResponse.code>
			lighthttpresponse.reasonPhrase = "Not implemented";
	//   25   57:aload_3         
	//   26   58:ldc1            #56  <String "Not implemented">
	//   27   60:putfield        #59  <Field String LightHttpResponse.reasonPhrase>
			socketlike = ((SocketLike) (new StringBuilder()));
	//   28   63:new             #61  <Class StringBuilder>
	//   29   66:dup             
	//   30   67:invokespecial   #62  <Method void StringBuilder()>
	//   31   70:astore_1        
			((StringBuilder) (socketlike)).append(lighthttprequest.method);
	//   32   71:aload_1         
	//   33   72:aload_2         
	//   34   73:getfield        #40  <Field String LightHttpRequest.method>
	//   35   76:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:pop             
			((StringBuilder) (socketlike)).append(" not implemented");
	//   37   80:aload_1         
	//   38   81:ldc1            #68  <String " not implemented">
	//   39   83:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
			lighthttpresponse.body = LightHttpBody.create(((StringBuilder) (socketlike)).toString(), "text/plain");
	//   41   87:aload_3         
	//   42   88:aload_1         
	//   43   89:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   44   92:ldc1            #74  <String "text/plain">
	//   45   94:invokestatic    #80  <Method LightHttpBody LightHttpBody.create(String, String)>
	//   46   97:putfield        #84  <Field LightHttpBody LightHttpResponse.body>
			return true;
	//   47  100:iconst_1        
	//   48  101:ireturn         
		}
		lighthttprequest = ((LightHttpRequest) (lighthttprequest.uri.getQueryParameters("argv")));
	//   49  102:aload_2         
	//   50  103:getfield        #88  <Field Uri LightHttpRequest.uri>
	//   51  106:ldc1            #16  <String "argv">
	//   52  108:invokevirtual   #94  <Method List Uri.getQueryParameters(String)>
	//   53  111:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   54  112:new             #96  <Class ByteArrayOutputStream>
	//   55  115:dup             
	//   56  116:invokespecial   #97  <Method void ByteArrayOutputStream()>
	//   57  119:astore          6
		Framer framer = new Framer(((java.io.InputStream) (new ByteArrayInputStream(new byte[0]))), ((java.io.OutputStream) (bytearrayoutputstream)));
	//   58  121:new             #99  <Class Framer>
	//   59  124:dup             
	//   60  125:new             #101 <Class ByteArrayInputStream>
	//   61  128:dup             
	//   62  129:iconst_0        
	//   63  130:newarray        byte[]
	//   64  132:invokespecial   #104 <Method void ByteArrayInputStream(byte[])>
	//   65  135:aload           6
	//   66  137:invokespecial   #107 <Method void Framer(java.io.InputStream, java.io.OutputStream)>
	//   67  140:astore          7
		if(flag1)
	//*  68  142:iload           5
	//*  69  144:ifeq            153
			socketlike = "ERROR";
	//   70  147:ldc1            #109 <String "ERROR">
	//   71  149:astore_1        
		else
	//*  72  150:goto            156
			socketlike = "WARNING";
	//   73  153:ldc1            #111 <String "WARNING">
	//   74  155:astore_1        
		PrintStream printstream = framer.getStderr();
	//   75  156:aload           7
	//   76  158:invokevirtual   #115 <Method PrintStream Framer.getStderr()>
	//   77  161:astore          8
		StringBuilder stringbuilder = new StringBuilder();
	//   78  163:new             #61  <Class StringBuilder>
	//   79  166:dup             
	//   80  167:invokespecial   #62  <Method void StringBuilder()>
	//   81  170:astore          9
		stringbuilder.append("*** ");
	//   82  172:aload           9
	//   83  174:ldc1            #117 <String "*** ">
	//   84  176:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   85  179:pop             
		stringbuilder.append(((String) (socketlike)));
	//   86  180:aload           9
	//   87  182:aload_1         
	//   88  183:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   89  186:pop             
		stringbuilder.append(": Using legacy HTTP protocol; update dumpapp script! ***");
	//   90  187:aload           9
	//   91  189:ldc1            #119 <String ": Using legacy HTTP protocol; update dumpapp script! ***">
	//   92  191:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   93  194:pop             
		printstream.println(stringbuilder.toString());
	//   94  195:aload           8
	//   95  197:aload           9
	//   96  199:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   97  202:invokevirtual   #125 <Method void PrintStream.println(String)>
		if(flag)
	//*  98  205:iload           4
	//*  99  207:ifeq            240
			DumpappSocketLikeHandler.dump(mDumper, framer, (String[])((List) (lighthttprequest)).toArray(((Object []) (new String[((List) (lighthttprequest)).size()]))));
	//  100  210:aload_0         
	//  101  211:getfield        #28  <Field Dumper mDumper>
	//  102  214:aload           7
	//  103  216:aload_2         
	//  104  217:aload_2         
	//  105  218:invokeinterface #131 <Method int List.size()>
	//  106  223:anewarray       String[]
	//  107  226:invokeinterface #135 <Method Object[] List.toArray(Object[])>
	//  108  231:checkcast       #137 <Class String[]>
	//  109  234:invokestatic    #143 <Method void DumpappSocketLikeHandler.dump(Dumper, Framer, String[])>
		else
	//* 110  237:goto            246
			framer.writeExitCode(1);
	//  111  240:aload           7
	//  112  242:iconst_1        
	//  113  243:invokevirtual   #147 <Method void Framer.writeExitCode(int)>
		lighthttpresponse.code = 200;
	//  114  246:aload_3         
	//  115  247:sipush          200
	//  116  250:putfield        #54  <Field int LightHttpResponse.code>
		lighthttpresponse.reasonPhrase = "OK";
	//  117  253:aload_3         
	//  118  254:ldc1            #149 <String "OK">
	//  119  256:putfield        #59  <Field String LightHttpResponse.reasonPhrase>
		lighthttpresponse.addHeader("Access-Control-Allow-Origin", "*");
	//  120  259:aload_3         
	//  121  260:ldc1            #19  <String "Access-Control-Allow-Origin">
	//  122  262:ldc1            #151 <String "*">
	//  123  264:invokevirtual   #155 <Method void LightHttpResponse.addHeader(String, String)>
		lighthttpresponse.body = LightHttpBody.create(bytearrayoutputstream.toByteArray(), "application/octet-stream");
	//  124  267:aload_3         
	//  125  268:aload           6
	//  126  270:invokevirtual   #159 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  127  273:ldc1            #13  <String "application/octet-stream">
	//  128  275:invokestatic    #162 <Method LightHttpBody LightHttpBody.create(byte[], String)>
	//  129  278:putfield        #84  <Field LightHttpBody LightHttpResponse.body>
		return true;
	//  130  281:iconst_1        
	//  131  282:ireturn         
	}

	private static final String CONTENT_TYPE = "application/octet-stream";
	private static final String QUERY_PARAM_ARGV = "argv";
	private static final String RESPONSE_HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
	private final Dumper mDumper;

	public DumpappHttpSocketLikeHandler$DumpappLegacyHttpHandler(Dumper dumper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mDumper = dumper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Dumper mDumper>
	//    5    9:return          
	}
}

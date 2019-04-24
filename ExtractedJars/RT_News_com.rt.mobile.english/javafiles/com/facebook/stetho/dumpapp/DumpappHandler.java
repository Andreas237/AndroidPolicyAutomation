// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import android.content.Context;
import android.net.Uri;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.server.SecureHttpRequestHandler;
import java.io.*;
import java.util.List;
import org.apache.http.*;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			Dumper

public abstract class DumpappHandler extends SecureHttpRequestHandler
{

	public DumpappHandler(Context context, Dumper dumper)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void SecureHttpRequestHandler(Context)>
		mDumper = dumper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Dumper mDumper>
	//    6   10:return          
	}

	private static InputStream bufferInput(HttpRequest httprequest)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #27  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		Util.copy(getCallerInput(httprequest), ((java.io.OutputStream) (bytearrayoutputstream)), new byte[256]);
	//    4    8:aload_0         
	//    5    9:invokestatic    #33  <Method InputStream getCallerInput(HttpRequest)>
	//    6   12:aload_1         
	//    7   13:sipush          256
	//    8   16:newarray        byte[]
	//    9   18:invokestatic    #39  <Method void Util.copy(InputStream, java.io.OutputStream, byte[])>
		return ((InputStream) (new ByteArrayInputStream(bytearrayoutputstream.toByteArray())));
	//   10   21:new             #41  <Class ByteArrayInputStream>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokevirtual   #45  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   14   29:invokespecial   #48  <Method void ByteArrayInputStream(byte[])>
	//   15   32:areturn         
	}

	protected static String[] getArgs(HttpRequest httprequest)
	{
		httprequest = ((HttpRequest) (Uri.parse(httprequest.getRequestLine().getUri()).getQueryParameters("argv")));
	//    0    0:aload_0         
	//    1    1:invokeinterface #57  <Method RequestLine HttpRequest.getRequestLine()>
	//    2    6:invokeinterface #63  <Method String RequestLine.getUri()>
	//    3   11:invokestatic    #69  <Method Uri Uri.parse(String)>
	//    4   14:ldc1            #8   <String "argv">
	//    5   16:invokevirtual   #73  <Method List Uri.getQueryParameters(String)>
	//    6   19:astore_0        
		return (String[])((List) (httprequest)).toArray(((Object []) (new String[((List) (httprequest)).size()])));
	//    7   20:aload_0         
	//    8   21:aload_0         
	//    9   22:invokeinterface #79  <Method int List.size()>
	//   10   27:anewarray       String[]
	//   11   30:invokeinterface #85  <Method Object[] List.toArray(Object[])>
	//   12   35:checkcast       #87  <Class String[]>
	//   13   38:areturn         
	}

	private static InputStream getCallerInput(HttpRequest httprequest)
		throws IOException
	{
		if(httprequest instanceof HttpEntityEnclosingRequest)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #89  <Class HttpEntityEnclosingRequest>
	//*   2    4:ifeq            28
		{
			httprequest = ((HttpRequest) (((HttpEntityEnclosingRequest)httprequest).getEntity()));
	//    3    7:aload_0         
	//    4    8:checkcast       #89  <Class HttpEntityEnclosingRequest>
	//    5   11:invokeinterface #93  <Method HttpEntity HttpEntityEnclosingRequest.getEntity()>
	//    6   16:astore_0        
			if(httprequest != null)
	//*   7   17:aload_0         
	//*   8   18:ifnull          28
				return ((HttpEntity) (httprequest)).getContent();
	//    9   21:aload_0         
	//   10   22:invokeinterface #99  <Method InputStream HttpEntity.getContent()>
	//   11   27:areturn         
		}
		return ((InputStream) (new ByteArrayInputStream(new byte[0])));
	//   12   28:new             #41  <Class ByteArrayInputStream>
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:newarray        byte[]
	//   16   35:invokespecial   #48  <Method void ByteArrayInputStream(byte[])>
	//   17   38:areturn         
	}

	protected Dumper getDumper()
	{
		return mDumper;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Dumper mDumper>
	//    2    4:areturn         
	}

	protected abstract HttpEntity getResponseEntity(HttpRequest httprequest, InputStream inputstream, HttpResponse httpresponse)
		throws IOException;

	protected void handleSecured(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException
	{
		httpresponse.setEntity(getResponseEntity(httprequest, bufferInput(httprequest), httpresponse));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokestatic    #109 <Method InputStream bufferInput(HttpRequest)>
	//    5    7:aload_2         
	//    6    8:invokevirtual   #111 <Method HttpEntity getResponseEntity(HttpRequest, InputStream, HttpResponse)>
	//    7   11:invokeinterface #117 <Method void HttpResponse.setEntity(HttpEntity)>
		httpresponse.addHeader("Access-Control-Allow-Origin", "*");
	//    8   16:aload_2         
	//    9   17:ldc1            #11  <String "Access-Control-Allow-Origin">
	//   10   19:ldc1            #119 <String "*">
	//   11   21:invokeinterface #123 <Method void HttpResponse.addHeader(String, String)>
		httpresponse.setStatusCode(200);
	//   12   26:aload_2         
	//   13   27:sipush          200
	//   14   30:invokeinterface #127 <Method void HttpResponse.setStatusCode(int)>
	//   15   35:return          
	}

	private static final String QUERY_PARAM_ARGV = "argv";
	private static final String RESPONSE_HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
	private final Dumper mDumper;
}

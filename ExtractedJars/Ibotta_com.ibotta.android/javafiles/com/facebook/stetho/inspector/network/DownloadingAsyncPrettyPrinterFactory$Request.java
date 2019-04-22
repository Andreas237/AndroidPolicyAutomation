// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			DownloadingAsyncPrettyPrinterFactory

private static class DownloadingAsyncPrettyPrinterFactory$Request
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

	public DownloadingAsyncPrettyPrinterFactory$Request(URL url1)
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

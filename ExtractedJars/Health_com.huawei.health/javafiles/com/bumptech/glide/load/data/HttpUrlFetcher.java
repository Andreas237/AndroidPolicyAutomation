// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.data:
//			DataFetcher

public class HttpUrlFetcher
	implements DataFetcher
{
	static class DefaultHttpUrlConnectionFactory
		implements HttpUrlConnectionFactory
	{

		public HttpURLConnection build(URL url)
			throws IOException
		{
			return (HttpURLConnection)url.openConnection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method java.net.URLConnection URL.openConnection()>
		//    2    4:checkcast       #26  <Class HttpURLConnection>
		//    3    7:areturn         
		}

		DefaultHttpUrlConnectionFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface HttpUrlConnectionFactory
	{

		public abstract HttpURLConnection build(URL url)
			throws IOException;
	}


	public HttpUrlFetcher(GlideUrl glideurl, int i)
	{
		this(glideurl, i, DEFAULT_CONNECTION_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #39  <Field HttpUrlFetcher$HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY>
	//    4    6:invokespecial   #44  <Method void HttpUrlFetcher(GlideUrl, int, HttpUrlFetcher$HttpUrlConnectionFactory)>
	//    5    9:return          
	}

	HttpUrlFetcher(GlideUrl glideurl, int i, HttpUrlConnectionFactory httpurlconnectionfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		glideUrl = glideurl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field GlideUrl glideUrl>
		timeout = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #49  <Field int timeout>
		connectionFactory = httpurlconnectionfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #51  <Field HttpUrlFetcher$HttpUrlConnectionFactory connectionFactory>
	//   11   19:return          
	}

	private InputStream getStreamForSuccessfulRequest(HttpURLConnection httpurlconnection)
		throws IOException
	{
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection.getContentEncoding()))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #61  <Method String HttpURLConnection.getContentEncoding()>
	//*   2    4:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            31
		{
			int i = httpurlconnection.getContentLength();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #71  <Method int HttpURLConnection.getContentLength()>
	//    6   14:istore_2        
			stream = ContentLengthInputStream.obtain(httpurlconnection.getInputStream(), i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #75  <Method InputStream HttpURLConnection.getInputStream()>
	//   10   20:iload_2         
	//   11   21:i2l             
	//   12   22:invokestatic    #81  <Method InputStream ContentLengthInputStream.obtain(InputStream, long)>
	//   13   25:putfield        #83  <Field InputStream stream>
		} else
	//*  14   28:goto            76
		{
			if(Log.isLoggable("HttpUrlFetcher", 3))
	//*  15   31:ldc1            #22  <String "HttpUrlFetcher">
	//*  16   33:iconst_3        
	//*  17   34:invokestatic    #89  <Method boolean Log.isLoggable(String, int)>
	//*  18   37:ifeq            68
				Log.d("HttpUrlFetcher", (new StringBuilder()).append("Got non empty content encoding: ").append(httpurlconnection.getContentEncoding()).toString());
	//   19   40:ldc1            #22  <String "HttpUrlFetcher">
	//   20   42:new             #91  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #92  <Method void StringBuilder()>
	//   23   49:ldc1            #94  <String "Got non empty content encoding: ">
	//   24   51:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_1         
	//   26   55:invokevirtual   #61  <Method String HttpURLConnection.getContentEncoding()>
	//   27   58:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   28   61:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   29   64:invokestatic    #105 <Method int Log.d(String, String)>
	//   30   67:pop             
			stream = httpurlconnection.getInputStream();
	//   31   68:aload_0         
	//   32   69:aload_1         
	//   33   70:invokevirtual   #75  <Method InputStream HttpURLConnection.getInputStream()>
	//   34   73:putfield        #83  <Field InputStream stream>
		}
		return stream;
	//   35   76:aload_0         
	//   36   77:getfield        #83  <Field InputStream stream>
	//   37   80:areturn         
	}

	private InputStream loadDataWithRedirects(URL url, int i, URL url1, Map map)
		throws IOException
	{
		if(i >= 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmplt          15
			throw new HttpException("Too many (> 5) redirects!");
	//    3    5:new             #112 <Class HttpException>
	//    4    8:dup             
	//    5    9:ldc1            #114 <String "Too many (> 5) redirects!">
	//    6   11:invokespecial   #117 <Method void HttpException(String)>
	//    7   14:athrow          
		if(url1 != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          43
			try
			{
				if(url.toURI().equals(((Object) (url1.toURI()))))
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #123 <Method URI URL.toURI()>
	//*  12   23:aload_3         
	//*  13   24:invokevirtual   #123 <Method URI URL.toURI()>
	//*  14   27:invokevirtual   #129 <Method boolean URI.equals(Object)>
	//*  15   30:ifeq            43
					throw new HttpException("In re-direct loop");
	//   16   33:new             #112 <Class HttpException>
	//   17   36:dup             
	//   18   37:ldc1            #131 <String "In re-direct loop">
	//   19   39:invokespecial   #117 <Method void HttpException(String)>
	//   20   42:athrow          
			}
	//*  21   43:goto            47
			// Misplaced declaration of an exception variable
			catch(URL url1) { }
	//   22   46:astore_3        
		urlConnection = connectionFactory.build(url);
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #51  <Field HttpUrlFetcher$HttpUrlConnectionFactory connectionFactory>
	//   26   52:aload_1         
	//   27   53:invokeinterface #135 <Method HttpURLConnection HttpUrlFetcher$HttpUrlConnectionFactory.build(URL)>
	//   28   58:putfield        #137 <Field HttpURLConnection urlConnection>
		java.util.Map.Entry entry;
		for(url1 = ((URL) (map.entrySet().iterator())); ((Iterator) (url1)).hasNext(); urlConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*  29   61:aload           4
	//*  30   63:invokeinterface #143 <Method Set Map.entrySet()>
	//*  31   68:invokeinterface #149 <Method Iterator Set.iterator()>
	//*  32   73:astore_3        
	//*  33   74:aload_3         
	//*  34   75:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//*  35   80:ifeq            124
			entry = (java.util.Map.Entry)((Iterator) (url1)).next();
	//   36   83:aload_3         
	//   37   84:invokeinterface #159 <Method Object Iterator.next()>
	//   38   89:checkcast       #161 <Class java.util.Map$Entry>
	//   39   92:astore          6

	//   40   94:aload_0         
	//   41   95:getfield        #137 <Field HttpURLConnection urlConnection>
	//   42   98:aload           6
	//   43  100:invokeinterface #164 <Method Object java.util.Map$Entry.getKey()>
	//   44  105:checkcast       #166 <Class String>
	//   45  108:aload           6
	//   46  110:invokeinterface #169 <Method Object java.util.Map$Entry.getValue()>
	//   47  115:checkcast       #166 <Class String>
	//   48  118:invokevirtual   #173 <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  49  121:goto            74
		urlConnection.setConnectTimeout(timeout);
	//   50  124:aload_0         
	//   51  125:getfield        #137 <Field HttpURLConnection urlConnection>
	//   52  128:aload_0         
	//   53  129:getfield        #49  <Field int timeout>
	//   54  132:invokevirtual   #177 <Method void HttpURLConnection.setConnectTimeout(int)>
		urlConnection.setReadTimeout(timeout);
	//   55  135:aload_0         
	//   56  136:getfield        #137 <Field HttpURLConnection urlConnection>
	//   57  139:aload_0         
	//   58  140:getfield        #49  <Field int timeout>
	//   59  143:invokevirtual   #180 <Method void HttpURLConnection.setReadTimeout(int)>
		urlConnection.setUseCaches(false);
	//   60  146:aload_0         
	//   61  147:getfield        #137 <Field HttpURLConnection urlConnection>
	//   62  150:iconst_0        
	//   63  151:invokevirtual   #184 <Method void HttpURLConnection.setUseCaches(boolean)>
		urlConnection.setDoInput(true);
	//   64  154:aload_0         
	//   65  155:getfield        #137 <Field HttpURLConnection urlConnection>
	//   66  158:iconst_1        
	//   67  159:invokevirtual   #187 <Method void HttpURLConnection.setDoInput(boolean)>
		urlConnection.setInstanceFollowRedirects(false);
	//   68  162:aload_0         
	//   69  163:getfield        #137 <Field HttpURLConnection urlConnection>
	//   70  166:iconst_0        
	//   71  167:invokevirtual   #190 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		urlConnection.connect();
	//   72  170:aload_0         
	//   73  171:getfield        #137 <Field HttpURLConnection urlConnection>
	//   74  174:invokevirtual   #193 <Method void HttpURLConnection.connect()>
		if(isCancelled)
	//*  75  177:aload_0         
	//*  76  178:getfield        #195 <Field boolean isCancelled>
	//*  77  181:ifeq            186
			return null;
	//   78  184:aconst_null     
	//   79  185:areturn         
		int j = urlConnection.getResponseCode();
	//   80  186:aload_0         
	//   81  187:getfield        #137 <Field HttpURLConnection urlConnection>
	//   82  190:invokevirtual   #198 <Method int HttpURLConnection.getResponseCode()>
	//   83  193:istore          5
		if(j / 100 == 2)
	//*  84  195:iload           5
	//*  85  197:bipush          100
	//*  86  199:idiv            
	//*  87  200:iconst_2        
	//*  88  201:icmpne          213
			return getStreamForSuccessfulRequest(urlConnection);
	//   89  204:aload_0         
	//   90  205:aload_0         
	//   91  206:getfield        #137 <Field HttpURLConnection urlConnection>
	//   92  209:invokespecial   #200 <Method InputStream getStreamForSuccessfulRequest(HttpURLConnection)>
	//   93  212:areturn         
		if(j / 100 == 3)
	//*  94  213:iload           5
	//*  95  215:bipush          100
	//*  96  217:idiv            
	//*  97  218:iconst_3        
	//*  98  219:icmpne          269
		{
			url1 = ((URL) (urlConnection.getHeaderField("Location")));
	//   99  222:aload_0         
	//  100  223:getfield        #137 <Field HttpURLConnection urlConnection>
	//  101  226:ldc1            #202 <String "Location">
	//  102  228:invokevirtual   #206 <Method String HttpURLConnection.getHeaderField(String)>
	//  103  231:astore_3        
			if(TextUtils.isEmpty(((CharSequence) (url1))))
	//* 104  232:aload_3         
	//* 105  233:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 106  236:ifeq            249
				throw new HttpException("Received empty or null redirect url");
	//  107  239:new             #112 <Class HttpException>
	//  108  242:dup             
	//  109  243:ldc1            #208 <String "Received empty or null redirect url">
	//  110  245:invokespecial   #117 <Method void HttpException(String)>
	//  111  248:athrow          
			else
				return loadDataWithRedirects(new URL(url, ((String) (url1))), i + 1, url, map);
	//  112  249:aload_0         
	//  113  250:new             #119 <Class URL>
	//  114  253:dup             
	//  115  254:aload_1         
	//  116  255:aload_3         
	//  117  256:invokespecial   #211 <Method void URL(URL, String)>
	//  118  259:iload_2         
	//  119  260:iconst_1        
	//  120  261:iadd            
	//  121  262:aload_1         
	//  122  263:aload           4
	//  123  265:invokespecial   #213 <Method InputStream loadDataWithRedirects(URL, int, URL, Map)>
	//  124  268:areturn         
		}
		if(j == -1)
	//* 125  269:iload           5
	//* 126  271:iconst_m1       
	//* 127  272:icmpne          285
			throw new HttpException(j);
	//  128  275:new             #112 <Class HttpException>
	//  129  278:dup             
	//  130  279:iload           5
	//  131  281:invokespecial   #215 <Method void HttpException(int)>
	//  132  284:athrow          
		else
			throw new HttpException(urlConnection.getResponseMessage(), j);
	//  133  285:new             #112 <Class HttpException>
	//  134  288:dup             
	//  135  289:aload_0         
	//  136  290:getfield        #137 <Field HttpURLConnection urlConnection>
	//  137  293:invokevirtual   #218 <Method String HttpURLConnection.getResponseMessage()>
	//  138  296:iload           5
	//  139  298:invokespecial   #221 <Method void HttpException(String, int)>
	//  140  301:athrow          
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #195 <Field boolean isCancelled>
	//    3    5:return          
	}

	public void cleanup()
	{
		if(stream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field InputStream stream>
	//*   2    4:ifnull          18
			try
			{
				stream.close();
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field InputStream stream>
	//    5   11:invokevirtual   #230 <Method void InputStream.close()>
			}
	//*   6   14:goto            18
			catch(IOException ioexception) { }
	//    7   17:astore_1        
		if(urlConnection != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #137 <Field HttpURLConnection urlConnection>
	//*  10   22:ifnull          32
			urlConnection.disconnect();
	//   11   25:aload_0         
	//   12   26:getfield        #137 <Field HttpURLConnection urlConnection>
	//   13   29:invokevirtual   #233 <Method void HttpURLConnection.disconnect()>
	//   14   32:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #227 <Class InputStream>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.REMOTE;
	//    0    0:getstatic       #246 <Field DataSource DataSource.REMOTE>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, DataFetcher.DataCallback datacallback)
	{
		long l = LogTime.getLogTime();
	//    0    0:invokestatic    #254 <Method long LogTime.getLogTime()>
	//    1    3:lstore_3        
		try
		{
			priority = ((Priority) (loadDataWithRedirects(glideUrl.toURL(), 0, ((URL) (null)), glideUrl.getHeaders())));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field GlideUrl glideUrl>
	//    5    9:invokevirtual   #260 <Method URL GlideUrl.toURL()>
	//    6   12:iconst_0        
	//    7   13:aconst_null     
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field GlideUrl glideUrl>
	//   10   18:invokevirtual   #264 <Method Map GlideUrl.getHeaders()>
	//   11   21:invokespecial   #213 <Method InputStream loadDataWithRedirects(URL, int, URL, Map)>
	//   12   24:astore_1        
		}
	//*  13   25:goto            56
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*  14   28:astore_1        
		{
			if(Log.isLoggable("HttpUrlFetcher", 3))
	//*  15   29:ldc1            #22  <String "HttpUrlFetcher">
	//*  16   31:iconst_3        
	//*  17   32:invokestatic    #89  <Method boolean Log.isLoggable(String, int)>
	//*  18   35:ifeq            48
				Log.d("HttpUrlFetcher", "Failed to load data for url", ((Throwable) (priority)));
	//   19   38:ldc1            #22  <String "HttpUrlFetcher">
	//   20   40:ldc2            #266 <String "Failed to load data for url">
	//   21   43:aload_1         
	//   22   44:invokestatic    #269 <Method int Log.d(String, String, Throwable)>
	//   23   47:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokeinterface #275 <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   27   55:return          
		}
		if(Log.isLoggable("HttpUrlFetcher", 2))
	//*  28   56:ldc1            #22  <String "HttpUrlFetcher">
	//*  29   58:iconst_2        
	//*  30   59:invokestatic    #89  <Method boolean Log.isLoggable(String, int)>
	//*  31   62:ifeq            104
			Log.v("HttpUrlFetcher", (new StringBuilder()).append("Finished http url fetcher fetch in ").append(LogTime.getElapsedMillis(l)).append(" ms and loaded ").append(((Object) (priority))).toString());
	//   32   65:ldc1            #22  <String "HttpUrlFetcher">
	//   33   67:new             #91  <Class StringBuilder>
	//   34   70:dup             
	//   35   71:invokespecial   #92  <Method void StringBuilder()>
	//   36   74:ldc2            #277 <String "Finished http url fetcher fetch in ">
	//   37   77:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   38   80:lload_3         
	//   39   81:invokestatic    #281 <Method double LogTime.getElapsedMillis(long)>
	//   40   84:invokevirtual   #284 <Method StringBuilder StringBuilder.append(double)>
	//   41   87:ldc2            #286 <String " ms and loaded ">
	//   42   90:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:aload_1         
	//   44   94:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   45   97:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   46  100:invokestatic    #292 <Method int Log.v(String, String)>
	//   47  103:pop             
		datacallback.onDataReady(((Object) (priority)));
	//   48  104:aload_2         
	//   49  105:aload_1         
	//   50  106:invokeinterface #296 <Method void DataFetcher$DataCallback.onDataReady(Object)>
	//   51  111:return          
	}

	static final HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = new DefaultHttpUrlConnectionFactory();
	private static final int MAXIMUM_REDIRECTS = 5;
	private static final String TAG = "HttpUrlFetcher";
	private final HttpUrlConnectionFactory connectionFactory;
	private final GlideUrl glideUrl;
	private volatile boolean isCancelled;
	private InputStream stream;
	private final int timeout;
	private HttpURLConnection urlConnection;

	static 
	{
	//    0    0:new             #9   <Class HttpUrlFetcher$DefaultHttpUrlConnectionFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void HttpUrlFetcher$DefaultHttpUrlConnectionFactory()>
	//    3    7:putstatic       #39  <Field HttpUrlFetcher$HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY>
	//*   4   10:return          
	}
}

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
	private static class DefaultHttpUrlConnectionFactory
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
	//    3    3:getstatic       #42  <Field HttpUrlFetcher$HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY>
	//    4    6:invokespecial   #47  <Method void HttpUrlFetcher(GlideUrl, int, HttpUrlFetcher$HttpUrlConnectionFactory)>
	//    5    9:return          
	}

	HttpUrlFetcher(GlideUrl glideurl, int i, HttpUrlConnectionFactory httpurlconnectionfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		glideUrl = glideurl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field GlideUrl glideUrl>
		timeout = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #52  <Field int timeout>
		connectionFactory = httpurlconnectionfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field HttpUrlFetcher$HttpUrlConnectionFactory connectionFactory>
	//   11   19:return          
	}

	private InputStream getStreamForSuccessfulRequest(HttpURLConnection httpurlconnection)
		throws IOException
	{
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection.getContentEncoding()))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #65  <Method String HttpURLConnection.getContentEncoding()>
	//*   2    4:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            31
		{
			int i = httpurlconnection.getContentLength();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #75  <Method int HttpURLConnection.getContentLength()>
	//    6   14:istore_2        
			stream = ContentLengthInputStream.obtain(httpurlconnection.getInputStream(), i);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #79  <Method InputStream HttpURLConnection.getInputStream()>
	//   10   20:iload_2         
	//   11   21:i2l             
	//   12   22:invokestatic    #85  <Method InputStream ContentLengthInputStream.obtain(InputStream, long)>
	//   13   25:putfield        #87  <Field InputStream stream>
		} else
	//*  14   28:goto            82
		{
			if(Log.isLoggable("HttpUrlFetcher", 3))
	//*  15   31:ldc1            #25  <String "HttpUrlFetcher">
	//*  16   33:iconst_3        
	//*  17   34:invokestatic    #93  <Method boolean Log.isLoggable(String, int)>
	//*  18   37:ifeq            74
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #95  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #96  <Method void StringBuilder()>
	//   22   47:astore_3        
				stringbuilder.append("Got non empty content encoding: ");
	//   23   48:aload_3         
	//   24   49:ldc1            #98  <String "Got non empty content encoding: ">
	//   25   51:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
				stringbuilder.append(httpurlconnection.getContentEncoding());
	//   27   55:aload_3         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #65  <Method String HttpURLConnection.getContentEncoding()>
	//   30   60:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
				Log.d("HttpUrlFetcher", stringbuilder.toString());
	//   32   64:ldc1            #25  <String "HttpUrlFetcher">
	//   33   66:aload_3         
	//   34   67:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   35   70:invokestatic    #109 <Method int Log.d(String, String)>
	//   36   73:pop             
			}
			stream = httpurlconnection.getInputStream();
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:invokevirtual   #79  <Method InputStream HttpURLConnection.getInputStream()>
	//   40   79:putfield        #87  <Field InputStream stream>
		}
		return stream;
	//   41   82:aload_0         
	//   42   83:getfield        #87  <Field InputStream stream>
	//   43   86:areturn         
	}

	private static boolean isHttpOk(int i)
	{
		return i / 100 == 2;
	//    0    0:iload_0         
	//    1    1:bipush          100
	//    2    3:idiv            
	//    3    4:iconst_2        
	//    4    5:icmpne          10
	//    5    8:iconst_1        
	//    6    9:ireturn         
	//    7   10:iconst_0        
	//    8   11:ireturn         
	}

	private static boolean isHttpRedirect(int i)
	{
		return i / 100 == 3;
	//    0    0:iload_0         
	//    1    1:bipush          100
	//    2    3:idiv            
	//    3    4:iconst_3        
	//    4    5:icmpne          10
	//    5    8:iconst_1        
	//    6    9:ireturn         
	//    7   10:iconst_0        
	//    8   11:ireturn         
	}

	private InputStream loadDataWithRedirects(URL url, int i, URL url1, Map map)
		throws IOException
	{
		if(i >= 5)
			break MISSING_BLOCK_LABEL_306;
	//    0    0:iload_2         
	//    1    1:iconst_5        
	//    2    2:icmpge          306
		if(url1 == null)
			break MISSING_BLOCK_LABEL_36;
	//    3    5:aload_3         
	//    4    6:ifnull          36
		int j;
		if(url.toURI().equals(((Object) (url1.toURI()))))
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #123 <Method URI URL.toURI()>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #123 <Method URI URL.toURI()>
	//*   9   17:invokevirtual   #129 <Method boolean URI.equals(Object)>
	//*  10   20:ifne            26
	//*  11   23:goto            36
			try
			{
				throw new HttpException("In re-direct loop");
	//   12   26:new             #131 <Class HttpException>
	//   13   29:dup             
	//   14   30:ldc1            #133 <String "In re-direct loop">
	//   15   32:invokespecial   #136 <Method void HttpException(String)>
	//   16   35:athrow          
			}
	//*  17   36:aload_0         
	//*  18   37:aload_0         
	//*  19   38:getfield        #54  <Field HttpUrlFetcher$HttpUrlConnectionFactory connectionFactory>
	//*  20   41:aload_1         
	//*  21   42:invokeinterface #140 <Method HttpURLConnection HttpUrlFetcher$HttpUrlConnectionFactory.build(URL)>
	//*  22   47:putfield        #142 <Field HttpURLConnection urlConnection>
	//*  23   50:aload           4
	//*  24   52:invokeinterface #148 <Method Set Map.entrySet()>
	//*  25   57:invokeinterface #154 <Method Iterator Set.iterator()>
	//*  26   62:astore_3        
	//*  27   63:aload_3         
	//*  28   64:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  29   69:ifeq            113
	//*  30   72:aload_3         
	//*  31   73:invokeinterface #164 <Method Object Iterator.next()>
	//*  32   78:checkcast       #166 <Class java.util.Map$Entry>
	//*  33   81:astore          6
	//*  34   83:aload_0         
	//*  35   84:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  36   87:aload           6
	//*  37   89:invokeinterface #169 <Method Object java.util.Map$Entry.getKey()>
	//*  38   94:checkcast       #171 <Class String>
	//*  39   97:aload           6
	//*  40   99:invokeinterface #174 <Method Object java.util.Map$Entry.getValue()>
	//*  41  104:checkcast       #171 <Class String>
	//*  42  107:invokevirtual   #178 <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  43  110:goto            63
	//*  44  113:aload_0         
	//*  45  114:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  46  117:aload_0         
	//*  47  118:getfield        #52  <Field int timeout>
	//*  48  121:invokevirtual   #182 <Method void HttpURLConnection.setConnectTimeout(int)>
	//*  49  124:aload_0         
	//*  50  125:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  51  128:aload_0         
	//*  52  129:getfield        #52  <Field int timeout>
	//*  53  132:invokevirtual   #185 <Method void HttpURLConnection.setReadTimeout(int)>
	//*  54  135:aload_0         
	//*  55  136:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  56  139:iconst_0        
	//*  57  140:invokevirtual   #189 <Method void HttpURLConnection.setUseCaches(boolean)>
	//*  58  143:aload_0         
	//*  59  144:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  60  147:iconst_1        
	//*  61  148:invokevirtual   #192 <Method void HttpURLConnection.setDoInput(boolean)>
	//*  62  151:aload_0         
	//*  63  152:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  64  155:iconst_0        
	//*  65  156:invokevirtual   #195 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
	//*  66  159:aload_0         
	//*  67  160:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  68  163:invokevirtual   #198 <Method void HttpURLConnection.connect()>
	//*  69  166:aload_0         
	//*  70  167:aload_0         
	//*  71  168:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  72  171:invokevirtual   #79  <Method InputStream HttpURLConnection.getInputStream()>
	//*  73  174:putfield        #87  <Field InputStream stream>
	//*  74  177:aload_0         
	//*  75  178:getfield        #200 <Field boolean isCancelled>
	//*  76  181:ifeq            186
	//*  77  184:aconst_null     
	//*  78  185:areturn         
	//*  79  186:aload_0         
	//*  80  187:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  81  190:invokevirtual   #203 <Method int HttpURLConnection.getResponseCode()>
	//*  82  193:istore          5
	//*  83  195:iload           5
	//*  84  197:invokestatic    #205 <Method boolean isHttpOk(int)>
	//*  85  200:ifeq            212
	//*  86  203:aload_0         
	//*  87  204:aload_0         
	//*  88  205:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  89  208:invokespecial   #207 <Method InputStream getStreamForSuccessfulRequest(HttpURLConnection)>
	//*  90  211:areturn         
	//*  91  212:iload           5
	//*  92  214:invokestatic    #209 <Method boolean isHttpRedirect(int)>
	//*  93  217:ifeq            273
	//*  94  220:aload_0         
	//*  95  221:getfield        #142 <Field HttpURLConnection urlConnection>
	//*  96  224:ldc1            #211 <String "Location">
	//*  97  226:invokevirtual   #215 <Method String HttpURLConnection.getHeaderField(String)>
	//*  98  229:astore_3        
	//*  99  230:aload_3         
	//* 100  231:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 101  234:ifne            263
	//* 102  237:new             #119 <Class URL>
	//* 103  240:dup             
	//* 104  241:aload_1         
	//* 105  242:aload_3         
	//* 106  243:invokespecial   #218 <Method void URL(URL, String)>
	//* 107  246:astore_3        
	//* 108  247:aload_0         
	//* 109  248:invokevirtual   #221 <Method void cleanup()>
	//* 110  251:aload_0         
	//* 111  252:aload_3         
	//* 112  253:iload_2         
	//* 113  254:iconst_1        
	//* 114  255:iadd            
	//* 115  256:aload_1         
	//* 116  257:aload           4
	//* 117  259:invokespecial   #223 <Method InputStream loadDataWithRedirects(URL, int, URL, Map)>
	//* 118  262:areturn         
	//* 119  263:new             #131 <Class HttpException>
	//* 120  266:dup             
	//* 121  267:ldc1            #225 <String "Received empty or null redirect url">
	//* 122  269:invokespecial   #136 <Method void HttpException(String)>
	//* 123  272:athrow          
	//* 124  273:iload           5
	//* 125  275:iconst_m1       
	//* 126  276:icmpne          289
	//* 127  279:new             #131 <Class HttpException>
	//* 128  282:dup             
	//* 129  283:iload           5
	//* 130  285:invokespecial   #227 <Method void HttpException(int)>
	//* 131  288:athrow          
	//* 132  289:new             #131 <Class HttpException>
	//* 133  292:dup             
	//* 134  293:aload_0         
	//* 135  294:getfield        #142 <Field HttpURLConnection urlConnection>
	//* 136  297:invokevirtual   #230 <Method String HttpURLConnection.getResponseMessage()>
	//* 137  300:iload           5
	//* 138  302:invokespecial   #233 <Method void HttpException(String, int)>
	//* 139  305:athrow          
	//* 140  306:new             #131 <Class HttpException>
	//* 141  309:dup             
	//* 142  310:ldc1            #235 <String "Too many (> 5) redirects!">
	//* 143  312:invokespecial   #136 <Method void HttpException(String)>
	//* 144  315:athrow          
			// Misplaced declaration of an exception variable
			catch(URL url1) { }
	//  145  316:astore_3        
		urlConnection = connectionFactory.build(url);
		java.util.Map.Entry entry;
		for(url1 = ((URL) (map.entrySet().iterator())); ((Iterator) (url1)).hasNext(); urlConnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
			entry = (java.util.Map.Entry)((Iterator) (url1)).next();

		urlConnection.setConnectTimeout(timeout);
		urlConnection.setReadTimeout(timeout);
		urlConnection.setUseCaches(false);
		urlConnection.setDoInput(true);
		urlConnection.setInstanceFollowRedirects(false);
		urlConnection.connect();
		stream = urlConnection.getInputStream();
		if(isCancelled)
			return null;
		j = urlConnection.getResponseCode();
		if(isHttpOk(j))
			return getStreamForSuccessfulRequest(urlConnection);
		if(isHttpRedirect(j))
		{
			url1 = ((URL) (urlConnection.getHeaderField("Location")));
			if(!TextUtils.isEmpty(((CharSequence) (url1))))
			{
				url1 = new URL(url, ((String) (url1)));
				cleanup();
				return loadDataWithRedirects(url1, i + 1, url, map);
			} else
			{
				throw new HttpException("Received empty or null redirect url");
			}
		}
		if(j == -1)
			throw new HttpException(j);
		else
			throw new HttpException(urlConnection.getResponseMessage(), j);
		throw new HttpException("Too many (> 5) redirects!");
	//* 146  317:goto            36
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #200 <Field boolean isCancelled>
	//    3    5:return          
	}

	public void cleanup()
	{
		Object obj = ((Object) (stream));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field InputStream stream>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			try
			{
				((InputStream) (obj)).close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #243 <Method void InputStream.close()>
			}
	//*   7   13:aload_0         
	//*   8   14:getfield        #142 <Field HttpURLConnection urlConnection>
	//*   9   17:astore_1        
	//*  10   18:aload_1         
	//*  11   19:ifnull          26
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #246 <Method void HttpURLConnection.disconnect()>
	//*  14   26:aload_0         
	//*  15   27:aconst_null     
	//*  16   28:putfield        #142 <Field HttpURLConnection urlConnection>
	//*  17   31:return          
			catch(IOException ioexception) { }
	//   18   32:astore_1        
		obj = ((Object) (urlConnection));
		if(obj != null)
			((HttpURLConnection) (obj)).disconnect();
		urlConnection = null;
	//*  19   33:goto            13
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #240 <Class InputStream>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.REMOTE;
	//    0    0:getstatic       #258 <Field DataSource DataSource.REMOTE>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, DataFetcher.DataCallback datacallback)
	{
		long l = LogTime.getLogTime();
	//    0    0:invokestatic    #266 <Method long LogTime.getLogTime()>
	//    1    3:lstore_3        
		datacallback.onDataReady(((Object) (loadDataWithRedirects(glideUrl.toURL(), 0, ((URL) (null)), glideUrl.getHeaders()))));
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field GlideUrl glideUrl>
	//    6   10:invokevirtual   #272 <Method URL GlideUrl.toURL()>
	//    7   13:iconst_0        
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field GlideUrl glideUrl>
	//   11   19:invokevirtual   #276 <Method Map GlideUrl.getHeaders()>
	//   12   22:invokespecial   #223 <Method InputStream loadDataWithRedirects(URL, int, URL, Map)>
	//   13   25:invokeinterface #282 <Method void DataFetcher$DataCallback.onDataReady(Object)>
		if(!Log.isLoggable("HttpUrlFetcher", 2))
			break MISSING_BLOCK_LABEL_125;
	//   14   30:ldc1            #25  <String "HttpUrlFetcher">
	//   15   32:iconst_2        
	//   16   33:invokestatic    #93  <Method boolean Log.isLoggable(String, int)>
	//   17   36:ifeq            125
		priority = ((Priority) (new StringBuilder()));
	//   18   39:new             #95  <Class StringBuilder>
	//   19   42:dup             
	//   20   43:invokespecial   #96  <Method void StringBuilder()>
	//   21   46:astore_1        
		break MISSING_BLOCK_LABEL_98;
	//   22   47:goto            98
		priority;
	//   23   50:astore_1        
		break MISSING_BLOCK_LABEL_126;
	//   24   51:goto            126
		priority;
	//   25   54:astore_1        
		if(Log.isLoggable("HttpUrlFetcher", 3))
	//*  26   55:ldc1            #25  <String "HttpUrlFetcher">
	//*  27   57:iconst_3        
	//*  28   58:invokestatic    #93  <Method boolean Log.isLoggable(String, int)>
	//*  29   61:ifeq            74
			Log.d("HttpUrlFetcher", "Failed to load data for url", ((Throwable) (priority)));
	//   30   64:ldc1            #25  <String "HttpUrlFetcher">
	//   31   66:ldc2            #284 <String "Failed to load data for url">
	//   32   69:aload_1         
	//   33   70:invokestatic    #287 <Method int Log.d(String, String, Throwable)>
	//   34   73:pop             
		datacallback.onLoadFailed(((Exception) (priority)));
	//   35   74:aload_2         
	//   36   75:aload_1         
	//   37   76:invokeinterface #291 <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
		if(!Log.isLoggable("HttpUrlFetcher", 2))
			break MISSING_BLOCK_LABEL_125;
	//   38   81:ldc1            #25  <String "HttpUrlFetcher">
	//   39   83:iconst_2        
	//   40   84:invokestatic    #93  <Method boolean Log.isLoggable(String, int)>
	//   41   87:ifeq            125
		priority = ((Priority) (new StringBuilder()));
	//   42   90:new             #95  <Class StringBuilder>
	//   43   93:dup             
	//   44   94:invokespecial   #96  <Method void StringBuilder()>
	//   45   97:astore_1        
		((StringBuilder) (priority)).append("Finished http url fetcher fetch in ");
	//   46   98:aload_1         
	//   47   99:ldc2            #293 <String "Finished http url fetcher fetch in ">
	//   48  102:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   49  105:pop             
		((StringBuilder) (priority)).append(LogTime.getElapsedMillis(l));
	//   50  106:aload_1         
	//   51  107:lload_3         
	//   52  108:invokestatic    #297 <Method double LogTime.getElapsedMillis(long)>
	//   53  111:invokevirtual   #300 <Method StringBuilder StringBuilder.append(double)>
	//   54  114:pop             
		Log.v("HttpUrlFetcher", ((StringBuilder) (priority)).toString());
	//   55  115:ldc1            #25  <String "HttpUrlFetcher">
	//   56  117:aload_1         
	//   57  118:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   58  121:invokestatic    #303 <Method int Log.v(String, String)>
	//   59  124:pop             
		return;
	//   60  125:return          
		if(Log.isLoggable("HttpUrlFetcher", 2))
	//*  61  126:ldc1            #25  <String "HttpUrlFetcher">
	//*  62  128:iconst_2        
	//*  63  129:invokestatic    #93  <Method boolean Log.isLoggable(String, int)>
	//*  64  132:ifeq            170
		{
			datacallback = ((DataFetcher.DataCallback) (new StringBuilder()));
	//   65  135:new             #95  <Class StringBuilder>
	//   66  138:dup             
	//   67  139:invokespecial   #96  <Method void StringBuilder()>
	//   68  142:astore_2        
			((StringBuilder) (datacallback)).append("Finished http url fetcher fetch in ");
	//   69  143:aload_2         
	//   70  144:ldc2            #293 <String "Finished http url fetcher fetch in ">
	//   71  147:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   72  150:pop             
			((StringBuilder) (datacallback)).append(LogTime.getElapsedMillis(l));
	//   73  151:aload_2         
	//   74  152:lload_3         
	//   75  153:invokestatic    #297 <Method double LogTime.getElapsedMillis(long)>
	//   76  156:invokevirtual   #300 <Method StringBuilder StringBuilder.append(double)>
	//   77  159:pop             
			Log.v("HttpUrlFetcher", ((StringBuilder) (datacallback)).toString());
	//   78  160:ldc1            #25  <String "HttpUrlFetcher">
	//   79  162:aload_2         
	//   80  163:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   81  166:invokestatic    #303 <Method int Log.v(String, String)>
	//   82  169:pop             
		}
		throw priority;
	//   83  170:aload_1         
	//   84  171:athrow          
	}

	static final HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY = new DefaultHttpUrlConnectionFactory();
	private static final int INVALID_STATUS_CODE = -1;
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
	//    2    4:invokespecial   #40  <Method void HttpUrlFetcher$DefaultHttpUrlConnectionFactory()>
	//    3    7:putstatic       #42  <Field HttpUrlFetcher$HttpUrlConnectionFactory DEFAULT_CONNECTION_FACTORY>
	//*   4   10:return          
	}
}

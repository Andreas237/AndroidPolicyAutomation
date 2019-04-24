// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.util.*;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource, DataSpec, TransferListener, DataSourceException

public class DefaultHttpDataSource
	implements HttpDataSource
{

	public DefaultHttpDataSource(String s, Predicate predicate)
	{
		this(s, predicate, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #74  <Method void DefaultHttpDataSource(String, Predicate, TransferListener)>
	//    5    7:return          
	}

	public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener)
	{
		this(s, predicate, transferlistener, 8000, 8000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:sipush          8000
	//    5    7:sipush          8000
	//    6   10:invokespecial   #79  <Method void DefaultHttpDataSource(String, Predicate, TransferListener, int, int)>
	//    7   13:return          
	}

	public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i, int j)
	{
		this(s, predicate, transferlistener, i, j, false, ((HttpDataSource.RequestProperties) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:aconst_null     
	//    8   10:invokespecial   #83  <Method void DefaultHttpDataSource(String, Predicate, TransferListener, int, int, boolean, HttpDataSource$RequestProperties)>
	//    9   13:return          
	}

	public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i, int j, boolean flag, HttpDataSource.RequestProperties requestproperties)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		userAgent = Assertions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #91  <Method String Assertions.checkNotEmpty(String)>
	//    5    9:putfield        #93  <Field String userAgent>
		contentTypePredicate = predicate;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #95  <Field Predicate contentTypePredicate>
		listener = transferlistener;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #97  <Field TransferListener listener>
		requestProperties = new HttpDataSource.RequestProperties();
	//   12   22:aload_0         
	//   13   23:new             #99  <Class HttpDataSource$RequestProperties>
	//   14   26:dup             
	//   15   27:invokespecial   #100 <Method void HttpDataSource$RequestProperties()>
	//   16   30:putfield        #102 <Field HttpDataSource$RequestProperties requestProperties>
		connectTimeoutMillis = i;
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:putfield        #104 <Field int connectTimeoutMillis>
		readTimeoutMillis = j;
	//   20   39:aload_0         
	//   21   40:iload           5
	//   22   42:putfield        #106 <Field int readTimeoutMillis>
		allowCrossProtocolRedirects = flag;
	//   23   45:aload_0         
	//   24   46:iload           6
	//   25   48:putfield        #108 <Field boolean allowCrossProtocolRedirects>
		defaultRequestProperties = requestproperties;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #110 <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//   29   57:return          
	}

	private void closeConnectionQuietly()
	{
		if(connection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field HttpURLConnection connection>
	//*   2    4:ifnull          32
		{
			try
			{
				connection.disconnect();
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field HttpURLConnection connection>
	//    5   11:invokevirtual   #121 <Method void HttpURLConnection.disconnect()>
			}
	//*   6   14:goto            27
			catch(Exception exception)
	//*   7   17:astore_1        
			{
				Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", ((Throwable) (exception)));
	//    8   18:ldc1            #22  <String "DefaultHttpDataSource">
	//    9   20:ldc1            #123 <String "Unexpected error while disconnecting">
	//   10   22:aload_1         
	//   11   23:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   12   26:pop             
			}
			connection = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #116 <Field HttpURLConnection connection>
		}
	//   16   32:return          
	}

	private static long getContentLength(HttpURLConnection httpurlconnection)
	{
		String s = httpurlconnection.getHeaderField("Content-Length");
	//    0    0:aload_0         
	//    1    1:ldc1            #135 <String "Content-Length">
	//    2    3:invokevirtual   #138 <Method String HttpURLConnection.getHeaderField(String)>
	//    3    6:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    4    8:aload           5
	//    5   10:invokestatic    #144 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   13:ifne            69
_L1:
		long l = Long.parseLong(s);
	//    7   16:aload           5
	//    8   18:invokestatic    #150 <Method long Long.parseLong(String)>
	//    9   21:lstore_1        
		  goto _L3
	//*  10   22:goto            73
_L8:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   11   25:new             #152 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #153 <Method void StringBuilder()>
	//   14   32:astore          6
		stringbuilder1.append("Unexpected Content-Length [");
	//   15   34:aload           6
	//   16   36:ldc1            #155 <String "Unexpected Content-Length [">
	//   17   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		stringbuilder1.append(s);
	//   19   42:aload           6
	//   20   44:aload           5
	//   21   46:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
		stringbuilder1.append("]");
	//   23   50:aload           6
	//   24   52:ldc1            #161 <String "]">
	//   25   54:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
		Log.e("DefaultHttpDataSource", stringbuilder1.toString());
	//   27   58:ldc1            #22  <String "DefaultHttpDataSource">
	//   28   60:aload           6
	//   29   62:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   30   65:invokestatic    #168 <Method int Log.e(String, String)>
	//   31   68:pop             
_L2:
		l = -1L;
	//   32   69:ldc2w           #169 <Long -1L>
	//   33   72:lstore_1        
_L3:
		httpurlconnection = ((HttpURLConnection) (httpurlconnection.getHeaderField("Content-Range")));
	//   34   73:aload_0         
	//   35   74:ldc1            #172 <String "Content-Range">
	//   36   76:invokevirtual   #138 <Method String HttpURLConnection.getHeaderField(String)>
	//   37   79:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection)))) goto _L5; else goto _L4
	//   38   80:aload_0         
	//   39   81:invokestatic    #144 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   40   84:ifne            250
_L4:
		Matcher matcher = CONTENT_RANGE_HEADER.matcher(((CharSequence) (httpurlconnection)));
	//   41   87:getstatic       #62  <Field Pattern CONTENT_RANGE_HEADER>
	//   42   90:aload_0         
	//   43   91:invokevirtual   #176 <Method Matcher Pattern.matcher(CharSequence)>
	//   44   94:astore          6
		if(!matcher.find()) goto _L5; else goto _L6
	//   45   96:aload           6
	//   46   98:invokevirtual   #182 <Method boolean Matcher.find()>
	//   47  101:ifeq            250
_L6:
		long l1 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1L;
	//   48  104:aload           6
	//   49  106:iconst_2        
	//   50  107:invokevirtual   #186 <Method String Matcher.group(int)>
	//   51  110:invokestatic    #150 <Method long Long.parseLong(String)>
	//   52  113:aload           6
	//   53  115:iconst_1        
	//   54  116:invokevirtual   #186 <Method String Matcher.group(int)>
	//   55  119:invokestatic    #150 <Method long Long.parseLong(String)>
	//   56  122:lsub            
	//   57  123:lconst_1        
	//   58  124:ladd            
	//   59  125:lstore_3        
		if(l < 0L)
	//*  60  126:lload_1         
	//*  61  127:lconst_0        
	//*  62  128:lcmp            
	//*  63  129:ifge            134
			return l1;
	//   64  132:lload_3         
	//   65  133:lreturn         
		if(l == l1) goto _L5; else goto _L7
	//   66  134:lload_1         
	//   67  135:lload_3         
	//   68  136:lcmp            
	//   69  137:ifeq            250
_L7:
		StringBuilder stringbuilder2 = new StringBuilder();
	//   70  140:new             #152 <Class StringBuilder>
	//   71  143:dup             
	//   72  144:invokespecial   #153 <Method void StringBuilder()>
	//   73  147:astore          6
		stringbuilder2.append("Inconsistent headers [");
	//   74  149:aload           6
	//   75  151:ldc1            #188 <String "Inconsistent headers [">
	//   76  153:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   77  156:pop             
		stringbuilder2.append(s);
	//   78  157:aload           6
	//   79  159:aload           5
	//   80  161:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   81  164:pop             
		stringbuilder2.append("] [");
	//   82  165:aload           6
	//   83  167:ldc1            #190 <String "] [">
	//   84  169:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   85  172:pop             
		stringbuilder2.append(((String) (httpurlconnection)));
	//   86  173:aload           6
	//   87  175:aload_0         
	//   88  176:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
		stringbuilder2.append("]");
	//   90  180:aload           6
	//   91  182:ldc1            #161 <String "]">
	//   92  184:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   93  187:pop             
		Log.w("DefaultHttpDataSource", stringbuilder2.toString());
	//   94  188:ldc1            #22  <String "DefaultHttpDataSource">
	//   95  190:aload           6
	//   96  192:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   97  195:invokestatic    #193 <Method int Log.w(String, String)>
	//   98  198:pop             
		l1 = Math.max(l, l1);
	//   99  199:lload_1         
	//  100  200:lload_3         
	//  101  201:invokestatic    #199 <Method long Math.max(long, long)>
	//  102  204:lstore_3        
		return l1;
	//  103  205:lload_3         
	//  104  206:lreturn         
_L9:
		StringBuilder stringbuilder = new StringBuilder();
	//  105  207:new             #152 <Class StringBuilder>
	//  106  210:dup             
	//  107  211:invokespecial   #153 <Method void StringBuilder()>
	//  108  214:astore          5
		stringbuilder.append("Unexpected Content-Range [");
	//  109  216:aload           5
	//  110  218:ldc1            #201 <String "Unexpected Content-Range [">
	//  111  220:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  112  223:pop             
		stringbuilder.append(((String) (httpurlconnection)));
	//  113  224:aload           5
	//  114  226:aload_0         
	//  115  227:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  116  230:pop             
		stringbuilder.append("]");
	//  117  231:aload           5
	//  118  233:ldc1            #161 <String "]">
	//  119  235:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  120  238:pop             
		Log.e("DefaultHttpDataSource", stringbuilder.toString());
	//  121  239:ldc1            #22  <String "DefaultHttpDataSource">
	//  122  241:aload           5
	//  123  243:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  124  246:invokestatic    #168 <Method int Log.e(String, String)>
	//  125  249:pop             
_L5:
		return l;
	//  126  250:lload_1         
	//  127  251:lreturn         
		NumberFormatException numberformatexception1;
		numberformatexception1;
	//  128  252:astore          6
		  goto _L8
	//* 129  254:goto            25
		NumberFormatException numberformatexception;
		numberformatexception;
	//  130  257:astore          5
		  goto _L9
	//* 131  259:goto            207
	}

	private static URL handleRedirect(URL url, String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new ProtocolException("Null location redirect");
	//    2    4:new             #207 <Class ProtocolException>
	//    3    7:dup             
	//    4    8:ldc1            #209 <String "Null location redirect">
	//    5   10:invokespecial   #212 <Method void ProtocolException(String)>
	//    6   13:athrow          
		s = ((String) (new URL(url, s)));
	//    7   14:new             #214 <Class URL>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokespecial   #217 <Method void URL(URL, String)>
	//   12   23:astore_1        
		url = ((URL) (((URL) (s)).getProtocol()));
	//   13   24:aload_1         
	//   14   25:invokevirtual   #220 <Method String URL.getProtocol()>
	//   15   28:astore_0        
		if(!"https".equals(((Object) (url))) && !"http".equals(((Object) (url))))
	//*  16   29:ldc1            #222 <String "https">
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*  19   35:ifne            80
	//*  20   38:ldc1            #230 <String "http">
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*  23   44:ifne            80
		{
			s = ((String) (new StringBuilder()));
	//   24   47:new             #152 <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #153 <Method void StringBuilder()>
	//   27   54:astore_1        
			((StringBuilder) (s)).append("Unsupported protocol redirect: ");
	//   28   55:aload_1         
	//   29   56:ldc1            #232 <String "Unsupported protocol redirect: ">
	//   30   58:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			((StringBuilder) (s)).append(((String) (url)));
	//   32   62:aload_1         
	//   33   63:aload_0         
	//   34   64:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			throw new ProtocolException(((StringBuilder) (s)).toString());
	//   36   68:new             #207 <Class ProtocolException>
	//   37   71:dup             
	//   38   72:aload_1         
	//   39   73:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   40   76:invokespecial   #212 <Method void ProtocolException(String)>
	//   41   79:athrow          
		} else
		{
			return ((URL) (s));
	//   42   80:aload_1         
	//   43   81:areturn         
		}
	}

	private HttpURLConnection makeConnection(DataSpec dataspec)
		throws IOException
	{
		URL url = new URL(dataspec.uri.toString());
	//    0    0:new             #214 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #241 <Field Uri DataSpec.uri>
	//    4    8:invokevirtual   #244 <Method String Uri.toString()>
	//    5   11:invokespecial   #245 <Method void URL(String)>
	//    6   14:astore          10
		byte abyte0[] = dataspec.postBody;
	//    7   16:aload_1         
	//    8   17:getfield        #249 <Field byte[] DataSpec.postBody>
	//    9   20:astore          9
		long l = dataspec.position;
	//   10   22:aload_1         
	//   11   23:getfield        #252 <Field long DataSpec.position>
	//   12   26:lstore          4
		long l1 = dataspec.length;
	//   13   28:aload_1         
	//   14   29:getfield        #255 <Field long DataSpec.length>
	//   15   32:lstore          6
		boolean flag = dataspec.isFlagSet(1);
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #259 <Method boolean DataSpec.isFlagSet(int)>
	//   19   39:istore          8
		dataspec = ((DataSpec) (this));
	//   20   41:aload_0         
	//   21   42:astore_1        
		if(!((DefaultHttpDataSource) (dataspec)).allowCrossProtocolRedirects)
	//*  22   43:aload_1         
	//*  23   44:getfield        #108 <Field boolean allowCrossProtocolRedirects>
	//*  24   47:ifne            66
			return ((DefaultHttpDataSource) (dataspec)).makeConnection(url, abyte0, l, l1, flag, true);
	//   25   50:aload_1         
	//   26   51:aload           10
	//   27   53:aload           9
	//   28   55:lload           4
	//   29   57:lload           6
	//   30   59:iload           8
	//   31   61:iconst_1        
	//   32   62:invokespecial   #262 <Method HttpURLConnection makeConnection(URL, byte[], long, long, boolean, boolean)>
	//   33   65:areturn         
		int i = 0;
	//   34   66:iconst_0        
	//   35   67:istore_2        
		dataspec = ((DataSpec) (url));
	//   36   68:aload           10
	//   37   70:astore_1        
		do
		{
			int j = i + 1;
	//   38   71:iload_2         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_3        
			if(i <= 20)
	//*  42   75:iload_2         
	//*  43   76:bipush          20
	//*  44   78:icmpgt          186
			{
				HttpURLConnection httpurlconnection = makeConnection(((URL) (dataspec)), abyte0, l, l1, flag, false);
	//   45   81:aload_0         
	//   46   82:aload_1         
	//   47   83:aload           9
	//   48   85:lload           4
	//   49   87:lload           6
	//   50   89:iload           8
	//   51   91:iconst_0        
	//   52   92:invokespecial   #262 <Method HttpURLConnection makeConnection(URL, byte[], long, long, boolean, boolean)>
	//   53   95:astore          10
				i = httpurlconnection.getResponseCode();
	//   54   97:aload           10
	//   55   99:invokevirtual   #266 <Method int HttpURLConnection.getResponseCode()>
	//   56  102:istore_2        
				if(i != 300 && i != 301 && i != 302 && i != 303 && (abyte0 != null || i != 307 && i != 308))
	//*  57  103:iload_2         
	//*  58  104:sipush          300
	//*  59  107:icmpeq          156
	//*  60  110:iload_2         
	//*  61  111:sipush          301
	//*  62  114:icmpeq          156
	//*  63  117:iload_2         
	//*  64  118:sipush          302
	//*  65  121:icmpeq          156
	//*  66  124:iload_2         
	//*  67  125:sipush          303
	//*  68  128:icmpeq          156
	//*  69  131:aload           9
	//*  70  133:ifnonnull       153
	//*  71  136:iload_2         
	//*  72  137:sipush          307
	//*  73  140:icmpeq          156
	//*  74  143:iload_2         
	//*  75  144:sipush          308
	//*  76  147:icmpne          153
	//*  77  150:goto            156
					return httpurlconnection;
	//   78  153:aload           10
	//   79  155:areturn         
				abyte0 = null;
	//   80  156:aconst_null     
	//   81  157:astore          9
				String s = httpurlconnection.getHeaderField("Location");
	//   82  159:aload           10
	//   83  161:ldc2            #268 <String "Location">
	//   84  164:invokevirtual   #138 <Method String HttpURLConnection.getHeaderField(String)>
	//   85  167:astore          11
				httpurlconnection.disconnect();
	//   86  169:aload           10
	//   87  171:invokevirtual   #121 <Method void HttpURLConnection.disconnect()>
				dataspec = ((DataSpec) (handleRedirect(((URL) (dataspec)), s)));
	//   88  174:aload_1         
	//   89  175:aload           11
	//   90  177:invokestatic    #270 <Method URL handleRedirect(URL, String)>
	//   91  180:astore_1        
				i = j;
	//   92  181:iload_3         
	//   93  182:istore_2        
			} else
	//*  94  183:goto            71
			{
				dataspec = ((DataSpec) (new StringBuilder()));
	//   95  186:new             #152 <Class StringBuilder>
	//   96  189:dup             
	//   97  190:invokespecial   #153 <Method void StringBuilder()>
	//   98  193:astore_1        
				((StringBuilder) (dataspec)).append("Too many redirects: ");
	//   99  194:aload_1         
	//  100  195:ldc2            #272 <String "Too many redirects: ">
	//  101  198:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  102  201:pop             
				((StringBuilder) (dataspec)).append(j);
	//  103  202:aload_1         
	//  104  203:iload_3         
	//  105  204:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//  106  207:pop             
				throw new NoRouteToHostException(((StringBuilder) (dataspec)).toString());
	//  107  208:new             #277 <Class NoRouteToHostException>
	//  108  211:dup             
	//  109  212:aload_1         
	//  110  213:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  111  216:invokespecial   #278 <Method void NoRouteToHostException(String)>
	//  112  219:athrow          
			}
		} while(true);
	}

	private HttpURLConnection makeConnection(URL url, byte abyte0[], long l, long l1, boolean flag, 
			boolean flag1)
		throws IOException
	{
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #282 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #118 <Class HttpURLConnection>
	//    3    7:astore          10
		httpurlconnection.setConnectTimeout(connectTimeoutMillis);
	//    4    9:aload           10
	//    5   11:aload_0         
	//    6   12:getfield        #104 <Field int connectTimeoutMillis>
	//    7   15:invokevirtual   #286 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(readTimeoutMillis);
	//    8   18:aload           10
	//    9   20:aload_0         
	//   10   21:getfield        #106 <Field int readTimeoutMillis>
	//   11   24:invokevirtual   #289 <Method void HttpURLConnection.setReadTimeout(int)>
		if(defaultRequestProperties != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #110 <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//*  14   31:ifnull          100
		{
			java.util.Map.Entry entry;
			for(url = ((URL) (defaultRequestProperties.getSnapshot().entrySet().iterator())); ((Iterator) (url)).hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*  15   34:aload_0         
	//*  16   35:getfield        #110 <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//*  17   38:invokevirtual   #293 <Method Map HttpDataSource$RequestProperties.getSnapshot()>
	//*  18   41:invokeinterface #299 <Method Set Map.entrySet()>
	//*  19   46:invokeinterface #305 <Method Iterator Set.iterator()>
	//*  20   51:astore_1        
	//*  21   52:aload_1         
	//*  22   53:invokeinterface #310 <Method boolean Iterator.hasNext()>
	//*  23   58:ifeq            100
				entry = (java.util.Map.Entry)((Iterator) (url)).next();
	//   24   61:aload_1         
	//   25   62:invokeinterface #314 <Method Object Iterator.next()>
	//   26   67:checkcast       #316 <Class java.util.Map$Entry>
	//   27   70:astore          9

	//   28   72:aload           10
	//   29   74:aload           9
	//   30   76:invokeinterface #319 <Method Object java.util.Map$Entry.getKey()>
	//   31   81:checkcast       #224 <Class String>
	//   32   84:aload           9
	//   33   86:invokeinterface #322 <Method Object java.util.Map$Entry.getValue()>
	//   34   91:checkcast       #224 <Class String>
	//   35   94:invokevirtual   #326 <Method void HttpURLConnection.setRequestProperty(String, String)>
		}
	//*  36   97:goto            52
		java.util.Map.Entry entry1;
		for(url = ((URL) (requestProperties.getSnapshot().entrySet().iterator())); ((Iterator) (url)).hasNext(); httpurlconnection.setRequestProperty((String)entry1.getKey(), (String)entry1.getValue()))
	//*  37  100:aload_0         
	//*  38  101:getfield        #102 <Field HttpDataSource$RequestProperties requestProperties>
	//*  39  104:invokevirtual   #293 <Method Map HttpDataSource$RequestProperties.getSnapshot()>
	//*  40  107:invokeinterface #299 <Method Set Map.entrySet()>
	//*  41  112:invokeinterface #305 <Method Iterator Set.iterator()>
	//*  42  117:astore_1        
	//*  43  118:aload_1         
	//*  44  119:invokeinterface #310 <Method boolean Iterator.hasNext()>
	//*  45  124:ifeq            166
			entry1 = (java.util.Map.Entry)((Iterator) (url)).next();
	//   46  127:aload_1         
	//   47  128:invokeinterface #314 <Method Object Iterator.next()>
	//   48  133:checkcast       #316 <Class java.util.Map$Entry>
	//   49  136:astore          9

	//   50  138:aload           10
	//   51  140:aload           9
	//   52  142:invokeinterface #319 <Method Object java.util.Map$Entry.getKey()>
	//   53  147:checkcast       #224 <Class String>
	//   54  150:aload           9
	//   55  152:invokeinterface #322 <Method Object java.util.Map$Entry.getValue()>
	//   56  157:checkcast       #224 <Class String>
	//   57  160:invokevirtual   #326 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  58  163:goto            118
		if(l != 0L || l1 != -1L)
	//*  59  166:lload_3         
	//*  60  167:lconst_0        
	//*  61  168:lcmp            
	//*  62  169:ifne            181
	//*  63  172:lload           5
	//*  64  174:ldc2w           #169 <Long -1L>
	//*  65  177:lcmp            
	//*  66  178:ifeq            269
		{
			url = ((URL) (new StringBuilder()));
	//   67  181:new             #152 <Class StringBuilder>
	//   68  184:dup             
	//   69  185:invokespecial   #153 <Method void StringBuilder()>
	//   70  188:astore_1        
			((StringBuilder) (url)).append("bytes=");
	//   71  189:aload_1         
	//   72  190:ldc2            #328 <String "bytes=">
	//   73  193:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   74  196:pop             
			((StringBuilder) (url)).append(l);
	//   75  197:aload_1         
	//   76  198:lload_3         
	//   77  199:invokevirtual   #331 <Method StringBuilder StringBuilder.append(long)>
	//   78  202:pop             
			((StringBuilder) (url)).append("-");
	//   79  203:aload_1         
	//   80  204:ldc2            #333 <String "-">
	//   81  207:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   82  210:pop             
			String s = ((StringBuilder) (url)).toString();
	//   83  211:aload_1         
	//   84  212:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   85  215:astore          9
			url = ((URL) (s));
	//   86  217:aload           9
	//   87  219:astore_1        
			if(l1 != -1L)
	//*  88  220:lload           5
	//*  89  222:ldc2w           #169 <Long -1L>
	//*  90  225:lcmp            
	//*  91  226:ifeq            260
			{
				url = ((URL) (new StringBuilder()));
	//   92  229:new             #152 <Class StringBuilder>
	//   93  232:dup             
	//   94  233:invokespecial   #153 <Method void StringBuilder()>
	//   95  236:astore_1        
				((StringBuilder) (url)).append(s);
	//   96  237:aload_1         
	//   97  238:aload           9
	//   98  240:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   99  243:pop             
				((StringBuilder) (url)).append((l + l1) - 1L);
	//  100  244:aload_1         
	//  101  245:lload_3         
	//  102  246:lload           5
	//  103  248:ladd            
	//  104  249:lconst_1        
	//  105  250:lsub            
	//  106  251:invokevirtual   #331 <Method StringBuilder StringBuilder.append(long)>
	//  107  254:pop             
				url = ((URL) (((StringBuilder) (url)).toString()));
	//  108  255:aload_1         
	//  109  256:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  110  259:astore_1        
			}
			httpurlconnection.setRequestProperty("Range", ((String) (url)));
	//  111  260:aload           10
	//  112  262:ldc2            #335 <String "Range">
	//  113  265:aload_1         
	//  114  266:invokevirtual   #326 <Method void HttpURLConnection.setRequestProperty(String, String)>
		}
		httpurlconnection.setRequestProperty("User-Agent", userAgent);
	//  115  269:aload           10
	//  116  271:ldc2            #337 <String "User-Agent">
	//  117  274:aload_0         
	//  118  275:getfield        #93  <Field String userAgent>
	//  119  278:invokevirtual   #326 <Method void HttpURLConnection.setRequestProperty(String, String)>
		if(!flag)
	//* 120  281:iload           7
	//* 121  283:ifne            297
			httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
	//  122  286:aload           10
	//  123  288:ldc2            #339 <String "Accept-Encoding">
	//  124  291:ldc2            #341 <String "identity">
	//  125  294:invokevirtual   #326 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setInstanceFollowRedirects(flag1);
	//  126  297:aload           10
	//  127  299:iload           8
	//  128  301:invokevirtual   #345 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		if(abyte0 != null)
	//* 129  304:aload_2         
	//* 130  305:ifnull          314
			flag = true;
	//  131  308:iconst_1        
	//  132  309:istore          7
		else
	//* 133  311:goto            317
			flag = false;
	//  134  314:iconst_0        
	//  135  315:istore          7
		httpurlconnection.setDoOutput(flag);
	//  136  317:aload           10
	//  137  319:iload           7
	//  138  321:invokevirtual   #348 <Method void HttpURLConnection.setDoOutput(boolean)>
		if(abyte0 != null)
	//* 139  324:aload_2         
	//* 140  325:ifnull          379
		{
			httpurlconnection.setRequestMethod("POST");
	//  141  328:aload           10
	//  142  330:ldc2            #350 <String "POST">
	//  143  333:invokevirtual   #353 <Method void HttpURLConnection.setRequestMethod(String)>
			if(abyte0.length == 0)
	//* 144  336:aload_2         
	//* 145  337:arraylength     
	//* 146  338:ifne            349
			{
				httpurlconnection.connect();
	//  147  341:aload           10
	//  148  343:invokevirtual   #356 <Method void HttpURLConnection.connect()>
				return httpurlconnection;
	//  149  346:aload           10
	//  150  348:areturn         
			} else
			{
				httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
	//  151  349:aload           10
	//  152  351:aload_2         
	//  153  352:arraylength     
	//  154  353:invokevirtual   #359 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
				httpurlconnection.connect();
	//  155  356:aload           10
	//  156  358:invokevirtual   #356 <Method void HttpURLConnection.connect()>
				url = ((URL) (httpurlconnection.getOutputStream()));
	//  157  361:aload           10
	//  158  363:invokevirtual   #363 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  159  366:astore_1        
				((OutputStream) (url)).write(abyte0);
	//  160  367:aload_1         
	//  161  368:aload_2         
	//  162  369:invokevirtual   #369 <Method void OutputStream.write(byte[])>
				((OutputStream) (url)).close();
	//  163  372:aload_1         
	//  164  373:invokevirtual   #372 <Method void OutputStream.close()>
				return httpurlconnection;
	//  165  376:aload           10
	//  166  378:areturn         
			}
		} else
		{
			httpurlconnection.connect();
	//  167  379:aload           10
	//  168  381:invokevirtual   #356 <Method void HttpURLConnection.connect()>
			return httpurlconnection;
	//  169  384:aload           10
	//  170  386:areturn         
		}
	}

	private static void maybeTerminateInputStream(HttpURLConnection httpurlconnection, long l)
	{
		if(Util.SDK_INT != 19 && Util.SDK_INT != 20)
	//*   0    0:getstatic       #379 <Field int Util.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmpeq          17
	//*   3    8:getstatic       #379 <Field int Util.SDK_INT>
	//*   4   11:bipush          20
	//*   5   13:icmpeq          17
			return;
	//    6   16:return          
		Object obj;
		try
		{
			httpurlconnection = ((HttpURLConnection) (httpurlconnection.getInputStream()));
	//    7   17:aload_0         
	//    8   18:invokevirtual   #383 <Method InputStream HttpURLConnection.getInputStream()>
	//    9   21:astore_0        
		}
	//*  10   22:lload_1         
	//*  11   23:ldc2w           #169 <Long -1L>
	//*  12   26:lcmp            
	//*  13   27:ifne            103
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #388 <Method int InputStream.read()>
	//*  16   34:iconst_m1       
	//*  17   35:icmpne          39
	//*  18   38:return          
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #392 <Method Class Object.getClass()>
	//*  21   43:invokevirtual   #397 <Method String Class.getName()>
	//*  22   46:astore_3        
	//*  23   47:ldc2            #399 <String "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream">
	//*  24   50:aload_3         
	//*  25   51:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*  26   54:ifne            67
	//*  27   57:ldc2            #401 <String "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream">
	//*  28   60:aload_3         
	//*  29   61:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*  30   64:ifeq            100
	//*  31   67:aload_0         
	//*  32   68:invokevirtual   #392 <Method Class Object.getClass()>
	//*  33   71:invokevirtual   #404 <Method Class Class.getSuperclass()>
	//*  34   74:ldc2            #406 <String "unexpectedEndOfInput">
	//*  35   77:iconst_0        
	//*  36   78:anewarray       Class[]
	//*  37   81:invokevirtual   #410 <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  38   84:astore_3        
	//*  39   85:aload_3         
	//*  40   86:iconst_1        
	//*  41   87:invokevirtual   #415 <Method void Method.setAccessible(boolean)>
	//*  42   90:aload_3         
	//*  43   91:aload_0         
	//*  44   92:iconst_0        
	//*  45   93:anewarray       Object[]
	//*  46   96:invokevirtual   #419 <Method Object Method.invoke(Object, Object[])>
	//*  47   99:pop             
	//*  48  100:return          
		// Misplaced declaration of an exception variable
		catch(HttpURLConnection httpurlconnection)
	//*  49  101:astore_0        
		{
			return;
	//   50  102:return          
		}
		if(l != -1L) goto _L2; else goto _L1
_L1:
		if(((InputStream) (httpurlconnection)).read() == -1)
			return;
_L4:
		obj = ((Object) (((Object) (httpurlconnection)).getClass().getName()));
		if("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(obj) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(obj))
		{
			obj = ((Object) (((Object) (httpurlconnection)).getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0])));
			((Method) (obj)).setAccessible(true);
			((Method) (obj)).invoke(((Object) (httpurlconnection)), new Object[0]);
		}
		return;
_L2:
		if(l <= 2048L)
	//*  51  103:lload_1         
	//*  52  104:ldc2w           #15  <Long 2048L>
	//*  53  107:lcmp            
	//*  54  108:ifgt            39
			return;
	//   55  111:return          
		if(true) goto _L4; else goto _L3
_L3:
	}

	private int readInternal(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = j;
	//    4    6:iload_3         
	//    5    7:istore          4
		if(bytesToRead != -1L)
	//*   6    9:aload_0         
	//*   7   10:getfield        #423 <Field long bytesToRead>
	//*   8   13:ldc2w           #169 <Long -1L>
	//*   9   16:lcmp            
	//*  10   17:ifeq            50
		{
			long l = bytesToRead - bytesRead;
	//   11   20:aload_0         
	//   12   21:getfield        #423 <Field long bytesToRead>
	//   13   24:aload_0         
	//   14   25:getfield        #425 <Field long bytesRead>
	//   15   28:lsub            
	//   16   29:lstore          5
			if(l == 0L)
	//*  17   31:lload           5
	//*  18   33:lconst_0        
	//*  19   34:lcmp            
	//*  20   35:ifne            40
				return -1;
	//   21   38:iconst_m1       
	//   22   39:ireturn         
			k = (int)Math.min(j, l);
	//   23   40:iload_3         
	//   24   41:i2l             
	//   25   42:lload           5
	//   26   44:invokestatic    #428 <Method long Math.min(long, long)>
	//   27   47:l2i             
	//   28   48:istore          4
		}
		i = inputStream.read(abyte0, i, k);
	//   29   50:aload_0         
	//   30   51:getfield        #430 <Field InputStream inputStream>
	//   31   54:aload_1         
	//   32   55:iload_2         
	//   33   56:iload           4
	//   34   58:invokevirtual   #432 <Method int InputStream.read(byte[], int, int)>
	//   35   61:istore_2        
		if(i == -1)
	//*  36   62:iload_2         
	//*  37   63:iconst_m1       
	//*  38   64:icmpne          88
			if(bytesToRead != -1L)
	//*  39   67:aload_0         
	//*  40   68:getfield        #423 <Field long bytesToRead>
	//*  41   71:ldc2w           #169 <Long -1L>
	//*  42   74:lcmp            
	//*  43   75:ifeq            86
				throw new EOFException();
	//   44   78:new             #434 <Class EOFException>
	//   45   81:dup             
	//   46   82:invokespecial   #435 <Method void EOFException()>
	//   47   85:athrow          
			else
				return -1;
	//   48   86:iconst_m1       
	//   49   87:ireturn         
		bytesRead = bytesRead + (long)i;
	//   50   88:aload_0         
	//   51   89:aload_0         
	//   52   90:getfield        #425 <Field long bytesRead>
	//   53   93:iload_2         
	//   54   94:i2l             
	//   55   95:ladd            
	//   56   96:putfield        #425 <Field long bytesRead>
		if(listener != null)
	//*  57   99:aload_0         
	//*  58  100:getfield        #97  <Field TransferListener listener>
	//*  59  103:ifnull          117
			listener.onBytesTransferred(((Object) (this)), i);
	//   60  106:aload_0         
	//   61  107:getfield        #97  <Field TransferListener listener>
	//   62  110:aload_0         
	//   63  111:iload_2         
	//   64  112:invokeinterface #441 <Method void TransferListener.onBytesTransferred(Object, int)>
		return i;
	//   65  117:iload_2         
	//   66  118:ireturn         
	}

	private void skipInternal()
		throws IOException
	{
		if(bytesSkipped == bytesToSkip)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field long bytesSkipped>
	//*   2    4:aload_0         
	//*   3    5:getfield        #446 <Field long bytesToSkip>
	//*   4    8:lcmp            
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		byte abyte1[] = (byte[])skipBufferReference.getAndSet(((Object) (null)));
	//    7   13:getstatic       #69  <Field AtomicReference skipBufferReference>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #450 <Method Object AtomicReference.getAndSet(Object)>
	//   10   20:checkcast       #451 <Class byte[]>
	//   11   23:astore_3        
		byte abyte0[] = abyte1;
	//   12   24:aload_3         
	//   13   25:astore_2        
		if(abyte1 == null)
	//*  14   26:aload_3         
	//*  15   27:ifnonnull       36
			abyte0 = new byte[4096];
	//   16   30:sipush          4096
	//   17   33:newarray        byte[]
	//   18   35:astore_2        
		do
		{
			if(bytesSkipped == bytesToSkip)
				break;
	//   19   36:aload_0         
	//   20   37:getfield        #444 <Field long bytesSkipped>
	//   21   40:aload_0         
	//   22   41:getfield        #446 <Field long bytesToSkip>
	//   23   44:lcmp            
	//   24   45:ifeq            138
			int i = (int)Math.min(bytesToSkip - bytesSkipped, abyte0.length);
	//   25   48:aload_0         
	//   26   49:getfield        #446 <Field long bytesToSkip>
	//   27   52:aload_0         
	//   28   53:getfield        #444 <Field long bytesSkipped>
	//   29   56:lsub            
	//   30   57:aload_2         
	//   31   58:arraylength     
	//   32   59:i2l             
	//   33   60:invokestatic    #428 <Method long Math.min(long, long)>
	//   34   63:l2i             
	//   35   64:istore_1        
			i = inputStream.read(abyte0, 0, i);
	//   36   65:aload_0         
	//   37   66:getfield        #430 <Field InputStream inputStream>
	//   38   69:aload_2         
	//   39   70:iconst_0        
	//   40   71:iload_1         
	//   41   72:invokevirtual   #432 <Method int InputStream.read(byte[], int, int)>
	//   42   75:istore_1        
			if(Thread.currentThread().isInterrupted())
	//*  43   76:invokestatic    #457 <Method Thread Thread.currentThread()>
	//*  44   79:invokevirtual   #460 <Method boolean Thread.isInterrupted()>
	//*  45   82:ifeq            93
				throw new InterruptedIOException();
	//   46   85:new             #462 <Class InterruptedIOException>
	//   47   88:dup             
	//   48   89:invokespecial   #463 <Method void InterruptedIOException()>
	//   49   92:athrow          
			if(i == -1)
	//*  50   93:iload_1         
	//*  51   94:iconst_m1       
	//*  52   95:icmpne          106
				throw new EOFException();
	//   53   98:new             #434 <Class EOFException>
	//   54  101:dup             
	//   55  102:invokespecial   #435 <Method void EOFException()>
	//   56  105:athrow          
			bytesSkipped = bytesSkipped + (long)i;
	//   57  106:aload_0         
	//   58  107:aload_0         
	//   59  108:getfield        #444 <Field long bytesSkipped>
	//   60  111:iload_1         
	//   61  112:i2l             
	//   62  113:ladd            
	//   63  114:putfield        #444 <Field long bytesSkipped>
			if(listener != null)
	//*  64  117:aload_0         
	//*  65  118:getfield        #97  <Field TransferListener listener>
	//*  66  121:ifnull          36
				listener.onBytesTransferred(((Object) (this)), i);
	//   67  124:aload_0         
	//   68  125:getfield        #97  <Field TransferListener listener>
	//   69  128:aload_0         
	//   70  129:iload_1         
	//   71  130:invokeinterface #441 <Method void TransferListener.onBytesTransferred(Object, int)>
		} while(true);
	//   72  135:goto            36
		skipBufferReference.set(((Object) (abyte0)));
	//   73  138:getstatic       #69  <Field AtomicReference skipBufferReference>
	//   74  141:aload_2         
	//   75  142:invokevirtual   #467 <Method void AtomicReference.set(Object)>
	//   76  145:return          
	}

	protected final long bytesRead()
	{
		return bytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #425 <Field long bytesRead>
	//    2    4:lreturn         
	}

	protected final long bytesRemaining()
	{
		if(bytesToRead == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #423 <Field long bytesToRead>
	//*   2    4:ldc2w           #169 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            16
			return bytesToRead;
	//    5   11:aload_0         
	//    6   12:getfield        #423 <Field long bytesToRead>
	//    7   15:lreturn         
		else
			return bytesToRead - bytesRead;
	//    8   16:aload_0         
	//    9   17:getfield        #423 <Field long bytesToRead>
	//   10   20:aload_0         
	//   11   21:getfield        #425 <Field long bytesRead>
	//   12   24:lsub            
	//   13   25:lreturn         
	}

	protected final long bytesSkipped()
	{
		return bytesSkipped;
	//    0    0:aload_0         
	//    1    1:getfield        #444 <Field long bytesSkipped>
	//    2    4:lreturn         
	}

	public void clearAllRequestProperties()
	{
		requestProperties.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field HttpDataSource$RequestProperties requestProperties>
	//    2    4:invokevirtual   #473 <Method void HttpDataSource$RequestProperties.clear()>
	//    3    7:return          
	}

	public void clearRequestProperty(String s)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #477 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		requestProperties.remove(s);
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field HttpDataSource$RequestProperties requestProperties>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #480 <Method void HttpDataSource$RequestProperties.remove(String)>
	//    7   13:return          
	}

	public void close()
		throws HttpDataSource.HttpDataSourceException
	{
		if(inputStream == null)
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:getfield        #430 <Field InputStream inputStream>
	//    2    4:ifnull          43
		maybeTerminateInputStream(connection, bytesRemaining());
	//    3    7:aload_0         
	//    4    8:getfield        #116 <Field HttpURLConnection connection>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #484 <Method long bytesRemaining()>
	//    7   15:invokestatic    #486 <Method void maybeTerminateInputStream(HttpURLConnection, long)>
		inputStream.close();
	//    8   18:aload_0         
	//    9   19:getfield        #430 <Field InputStream inputStream>
	//   10   22:invokevirtual   #487 <Method void InputStream.close()>
		break MISSING_BLOCK_LABEL_43;
	//   11   25:goto            43
		Object obj;
		obj;
	//   12   28:astore_1        
		throw new HttpDataSource.HttpDataSourceException(((IOException) (obj)), dataSpec, 3);
	//   13   29:new             #482 <Class HttpDataSource$HttpDataSourceException>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #489 <Field DataSpec dataSpec>
	//   18   38:iconst_3        
	//   19   39:invokespecial   #492 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//   20   42:athrow          
		inputStream = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #430 <Field InputStream inputStream>
		closeConnectionQuietly();
	//   24   48:aload_0         
	//   25   49:invokespecial   #494 <Method void closeConnectionQuietly()>
		if(opened)
	//*  26   52:aload_0         
	//*  27   53:getfield        #496 <Field boolean opened>
	//*  28   56:ifeq            81
		{
			opened = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #496 <Field boolean opened>
			if(listener != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #97  <Field TransferListener listener>
	//*  34   68:ifnull          81
				listener.onTransferEnd(((Object) (this)));
	//   35   71:aload_0         
	//   36   72:getfield        #97  <Field TransferListener listener>
	//   37   75:aload_0         
	//   38   76:invokeinterface #499 <Method void TransferListener.onTransferEnd(Object)>
		}
		return;
	//   39   81:return          
		obj;
	//   40   82:astore_1        
		inputStream = null;
	//   41   83:aload_0         
	//   42   84:aconst_null     
	//   43   85:putfield        #430 <Field InputStream inputStream>
		closeConnectionQuietly();
	//   44   88:aload_0         
	//   45   89:invokespecial   #494 <Method void closeConnectionQuietly()>
		if(opened)
	//*  46   92:aload_0         
	//*  47   93:getfield        #496 <Field boolean opened>
	//*  48   96:ifeq            121
		{
			opened = false;
	//   49   99:aload_0         
	//   50  100:iconst_0        
	//   51  101:putfield        #496 <Field boolean opened>
			if(listener != null)
	//*  52  104:aload_0         
	//*  53  105:getfield        #97  <Field TransferListener listener>
	//*  54  108:ifnull          121
				listener.onTransferEnd(((Object) (this)));
	//   55  111:aload_0         
	//   56  112:getfield        #97  <Field TransferListener listener>
	//   57  115:aload_0         
	//   58  116:invokeinterface #499 <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//   59  121:aload_1         
	//   60  122:athrow          
	}

	protected final HttpURLConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field HttpURLConnection connection>
	//    2    4:areturn         
	}

	public Map getResponseHeaders()
	{
		if(connection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field HttpURLConnection connection>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return connection.getHeaderFields();
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field HttpURLConnection connection>
	//    7   13:invokevirtual   #505 <Method Map HttpURLConnection.getHeaderFields()>
	//    8   16:areturn         
	}

	public Uri getUri()
	{
		if(connection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field HttpURLConnection connection>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return Uri.parse(connection.getURL().toString());
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field HttpURLConnection connection>
	//    7   13:invokevirtual   #512 <Method URL HttpURLConnection.getURL()>
	//    8   16:invokevirtual   #513 <Method String URL.toString()>
	//    9   19:invokestatic    #517 <Method Uri Uri.parse(String)>
	//   10   22:areturn         
	}

	public long open(DataSpec dataspec)
		throws HttpDataSource.HttpDataSourceException
	{
		dataSpec = dataspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #489 <Field DataSpec dataSpec>
		long l2 = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          5
		bytesRead = 0L;
	//    5    8:aload_0         
	//    6    9:lconst_0        
	//    7   10:putfield        #425 <Field long bytesRead>
		bytesSkipped = 0L;
	//    8   13:aload_0         
	//    9   14:lconst_0        
	//   10   15:putfield        #444 <Field long bytesSkipped>
		int i;
		Map map;
		try
		{
			connection = makeConnection(dataspec);
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:invokespecial   #521 <Method HttpURLConnection makeConnection(DataSpec)>
	//   15   24:putfield        #116 <Field HttpURLConnection connection>
		}
	//*  16   27:aload_0         
	//*  17   28:getfield        #116 <Field HttpURLConnection connection>
	//*  18   31:invokevirtual   #266 <Method int HttpURLConnection.getResponseCode()>
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:sipush          200
	//*  22   39:icmplt          266
	//*  23   42:iload_2         
	//*  24   43:sipush          299
	//*  25   46:icmple          52
	//*  26   49:goto            266
	//*  27   52:aload_0         
	//*  28   53:getfield        #116 <Field HttpURLConnection connection>
	//*  29   56:invokevirtual   #524 <Method String HttpURLConnection.getContentType()>
	//*  30   59:astore          7
	//*  31   61:aload_0         
	//*  32   62:getfield        #95  <Field Predicate contentTypePredicate>
	//*  33   65:ifnull          97
	//*  34   68:aload_0         
	//*  35   69:getfield        #95  <Field Predicate contentTypePredicate>
	//*  36   72:aload           7
	//*  37   74:invokeinterface #529 <Method boolean Predicate.evaluate(Object)>
	//*  38   79:ifne            97
	//*  39   82:aload_0         
	//*  40   83:invokespecial   #494 <Method void closeConnectionQuietly()>
	//*  41   86:new             #531 <Class HttpDataSource$InvalidContentTypeException>
	//*  42   89:dup             
	//*  43   90:aload           7
	//*  44   92:aload_1         
	//*  45   93:invokespecial   #534 <Method void HttpDataSource$InvalidContentTypeException(String, DataSpec)>
	//*  46   96:athrow          
	//*  47   97:lload           5
	//*  48   99:lstore_3        
	//*  49  100:iload_2         
	//*  50  101:sipush          200
	//*  51  104:icmpne          124
	//*  52  107:lload           5
	//*  53  109:lstore_3        
	//*  54  110:aload_1         
	//*  55  111:getfield        #252 <Field long DataSpec.position>
	//*  56  114:lconst_0        
	//*  57  115:lcmp            
	//*  58  116:ifeq            124
	//*  59  119:aload_1         
	//*  60  120:getfield        #252 <Field long DataSpec.position>
	//*  61  123:lstore_3        
	//*  62  124:aload_0         
	//*  63  125:lload_3         
	//*  64  126:putfield        #446 <Field long bytesToSkip>
	//*  65  129:aload_1         
	//*  66  130:iconst_1        
	//*  67  131:invokevirtual   #259 <Method boolean DataSpec.isFlagSet(int)>
	//*  68  134:ifne            201
	//*  69  137:aload_1         
	//*  70  138:getfield        #255 <Field long DataSpec.length>
	//*  71  141:lstore          5
	//*  72  143:ldc2w           #169 <Long -1L>
	//*  73  146:lstore_3        
	//*  74  147:lload           5
	//*  75  149:ldc2w           #169 <Long -1L>
	//*  76  152:lcmp            
	//*  77  153:ifeq            167
	//*  78  156:aload_0         
	//*  79  157:aload_1         
	//*  80  158:getfield        #255 <Field long DataSpec.length>
	//*  81  161:putfield        #423 <Field long bytesToRead>
	//*  82  164:goto            209
	//*  83  167:aload_0         
	//*  84  168:getfield        #116 <Field HttpURLConnection connection>
	//*  85  171:invokestatic    #536 <Method long getContentLength(HttpURLConnection)>
	//*  86  174:lstore          5
	//*  87  176:lload           5
	//*  88  178:ldc2w           #169 <Long -1L>
	//*  89  181:lcmp            
	//*  90  182:ifeq            193
	//*  91  185:lload           5
	//*  92  187:aload_0         
	//*  93  188:getfield        #446 <Field long bytesToSkip>
	//*  94  191:lsub            
	//*  95  192:lstore_3        
	//*  96  193:aload_0         
	//*  97  194:lload_3         
	//*  98  195:putfield        #423 <Field long bytesToRead>
	//*  99  198:goto            209
	//* 100  201:aload_0         
	//* 101  202:aload_1         
	//* 102  203:getfield        #255 <Field long DataSpec.length>
	//* 103  206:putfield        #423 <Field long bytesToRead>
	//* 104  209:aload_0         
	//* 105  210:aload_0         
	//* 106  211:getfield        #116 <Field HttpURLConnection connection>
	//* 107  214:invokevirtual   #383 <Method InputStream HttpURLConnection.getInputStream()>
	//* 108  217:putfield        #430 <Field InputStream inputStream>
	//* 109  220:aload_0         
	//* 110  221:iconst_1        
	//* 111  222:putfield        #496 <Field boolean opened>
	//* 112  225:aload_0         
	//* 113  226:getfield        #97  <Field TransferListener listener>
	//* 114  229:ifnull          243
	//* 115  232:aload_0         
	//* 116  233:getfield        #97  <Field TransferListener listener>
	//* 117  236:aload_0         
	//* 118  237:aload_1         
	//* 119  238:invokeinterface #540 <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//* 120  243:aload_0         
	//* 121  244:getfield        #423 <Field long bytesToRead>
	//* 122  247:lreturn         
	//* 123  248:astore          7
	//* 124  250:aload_0         
	//* 125  251:invokespecial   #494 <Method void closeConnectionQuietly()>
	//* 126  254:new             #482 <Class HttpDataSource$HttpDataSourceException>
	//* 127  257:dup             
	//* 128  258:aload           7
	//* 129  260:aload_1         
	//* 130  261:iconst_1        
	//* 131  262:invokespecial   #492 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//* 132  265:athrow          
	//* 133  266:aload_0         
	//* 134  267:getfield        #116 <Field HttpURLConnection connection>
	//* 135  270:invokevirtual   #505 <Method Map HttpURLConnection.getHeaderFields()>
	//* 136  273:astore          7
	//* 137  275:aload_0         
	//* 138  276:invokespecial   #494 <Method void closeConnectionQuietly()>
	//* 139  279:new             #542 <Class HttpDataSource$InvalidResponseCodeException>
	//* 140  282:dup             
	//* 141  283:iload_2         
	//* 142  284:aload           7
	//* 143  286:aload_1         
	//* 144  287:invokespecial   #545 <Method void HttpDataSource$InvalidResponseCodeException(int, Map, DataSpec)>
	//* 145  290:astore_1        
	//* 146  291:iload_2         
	//* 147  292:sipush          416
	//* 148  295:icmpne          311
	//* 149  298:aload_1         
	//* 150  299:new             #547 <Class DataSourceException>
	//* 151  302:dup             
	//* 152  303:iconst_0        
	//* 153  304:invokespecial   #549 <Method void DataSourceException(int)>
	//* 154  307:invokevirtual   #553 <Method Throwable HttpDataSource$InvalidResponseCodeException.initCause(Throwable)>
	//* 155  310:pop             
	//* 156  311:aload_1         
	//* 157  312:athrow          
	//* 158  313:astore          7
	//* 159  315:aload_0         
	//* 160  316:invokespecial   #494 <Method void closeConnectionQuietly()>
	//* 161  319:new             #152 <Class StringBuilder>
	//* 162  322:dup             
	//* 163  323:invokespecial   #153 <Method void StringBuilder()>
	//* 164  326:astore          8
	//* 165  328:aload           8
	//* 166  330:ldc2            #555 <String "Unable to connect to ">
	//* 167  333:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//* 168  336:pop             
	//* 169  337:aload           8
	//* 170  339:aload_1         
	//* 171  340:getfield        #241 <Field Uri DataSpec.uri>
	//* 172  343:invokevirtual   #244 <Method String Uri.toString()>
	//* 173  346:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//* 174  349:pop             
	//* 175  350:new             #482 <Class HttpDataSource$HttpDataSourceException>
	//* 176  353:dup             
	//* 177  354:aload           8
	//* 178  356:invokevirtual   #165 <Method String StringBuilder.toString()>
	//* 179  359:aload           7
	//* 180  361:aload_1         
	//* 181  362:iconst_1        
	//* 182  363:invokespecial   #558 <Method void HttpDataSource$HttpDataSourceException(String, IOException, DataSpec, int)>
	//* 183  366:athrow          
		catch(IOException ioexception2)
	//* 184  367:astore          7
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  185  369:new             #152 <Class StringBuilder>
	//  186  372:dup             
	//  187  373:invokespecial   #153 <Method void StringBuilder()>
	//  188  376:astore          8
			stringbuilder1.append("Unable to connect to ");
	//  189  378:aload           8
	//  190  380:ldc2            #555 <String "Unable to connect to ">
	//  191  383:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  192  386:pop             
			stringbuilder1.append(dataspec.uri.toString());
	//  193  387:aload           8
	//  194  389:aload_1         
	//  195  390:getfield        #241 <Field Uri DataSpec.uri>
	//  196  393:invokevirtual   #244 <Method String Uri.toString()>
	//  197  396:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  198  399:pop             
			throw new HttpDataSource.HttpDataSourceException(stringbuilder1.toString(), ioexception2, dataspec, 1);
	//  199  400:new             #482 <Class HttpDataSource$HttpDataSourceException>
	//  200  403:dup             
	//  201  404:aload           8
	//  202  406:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  203  409:aload           7
	//  204  411:aload_1         
	//  205  412:iconst_1        
	//  206  413:invokespecial   #558 <Method void HttpDataSource$HttpDataSourceException(String, IOException, DataSpec, int)>
	//  207  416:athrow          
		}
		try
		{
			i = connection.getResponseCode();
		}
		catch(IOException ioexception1)
		{
			closeConnectionQuietly();
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Unable to connect to ");
			stringbuilder.append(dataspec.uri.toString());
			throw new HttpDataSource.HttpDataSourceException(stringbuilder.toString(), ioexception1, dataspec, 1);
		}
		if(i >= 200 && i <= 299)
		{
			String s = connection.getContentType();
			if(contentTypePredicate != null && !contentTypePredicate.evaluate(((Object) (s))))
			{
				closeConnectionQuietly();
				throw new HttpDataSource.InvalidContentTypeException(s, dataspec);
			}
			long l = l2;
			if(i == 200)
			{
				l = l2;
				if(dataspec.position != 0L)
					l = dataspec.position;
			}
			bytesToSkip = l;
			if(!dataspec.isFlagSet(1))
			{
				long l3 = dataspec.length;
				long l1 = -1L;
				if(l3 != -1L)
				{
					bytesToRead = dataspec.length;
				} else
				{
					long l4 = getContentLength(connection);
					if(l4 != -1L)
						l1 = l4 - bytesToSkip;
					bytesToRead = l1;
				}
			} else
			{
				bytesToRead = dataspec.length;
			}
			try
			{
				inputStream = connection.getInputStream();
			}
			catch(IOException ioexception)
			{
				closeConnectionQuietly();
				throw new HttpDataSource.HttpDataSourceException(ioexception, dataspec, 1);
			}
			opened = true;
			if(listener != null)
				listener.onTransferStart(((Object) (this)), dataspec);
			return bytesToRead;
		}
		map = connection.getHeaderFields();
		closeConnectionQuietly();
		dataspec = ((DataSpec) (new HttpDataSource.InvalidResponseCodeException(i, map, dataspec)));
		if(i == 416)
			((HttpDataSource.InvalidResponseCodeException) (dataspec)).initCause(((Throwable) (new DataSourceException(0))));
		throw dataspec;
	}

	public int read(byte abyte0[], int i, int j)
		throws HttpDataSource.HttpDataSourceException
	{
		try
		{
			skipInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #560 <Method void skipInternal()>
			i = readInternal(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #562 <Method int readInternal(byte[], int, int)>
	//    7   11:istore_2        
		}
	//*   8   12:iload_2         
	//*   9   13:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   14:astore_1        
		{
			throw new HttpDataSource.HttpDataSourceException(((IOException) (abyte0)), dataSpec, 2);
	//   11   15:new             #482 <Class HttpDataSource$HttpDataSourceException>
	//   12   18:dup             
	//   13   19:aload_1         
	//   14   20:aload_0         
	//   15   21:getfield        #489 <Field DataSpec dataSpec>
	//   16   24:iconst_2        
	//   17   25:invokespecial   #492 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//   18   28:athrow          
		}
		return i;
	}

	public void setRequestProperty(String s, String s1)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #477 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		Assertions.checkNotNull(((Object) (s1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #477 <Method Object Assertions.checkNotNull(Object)>
	//    5    9:pop             
		requestProperties.set(s, s1);
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field HttpDataSource$RequestProperties requestProperties>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #564 <Method void HttpDataSource$RequestProperties.set(String, String)>
	//   11   19:return          
	}

	private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
	public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
	public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
	private static final long MAX_BYTES_TO_DRAIN = 2048L;
	private static final int MAX_REDIRECTS = 20;
	private static final String TAG = "DefaultHttpDataSource";
	private static final AtomicReference skipBufferReference = new AtomicReference();
	private final boolean allowCrossProtocolRedirects;
	private long bytesRead;
	private long bytesSkipped;
	private long bytesToRead;
	private long bytesToSkip;
	private final int connectTimeoutMillis;
	private HttpURLConnection connection;
	private final Predicate contentTypePredicate;
	private DataSpec dataSpec;
	private final HttpDataSource.RequestProperties defaultRequestProperties;
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private final int readTimeoutMillis;
	private final HttpDataSource.RequestProperties requestProperties;
	private final String userAgent;

	static 
	{
	//    0    0:ldc1            #54  <String "^bytes (\\d+)-(\\d+)/(\\d+)$">
	//    1    2:invokestatic    #60  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #62  <Field Pattern CONTENT_RANGE_HEADER>
	//    3    8:new             #64  <Class AtomicReference>
	//    4   11:dup             
	//    5   12:invokespecial   #67  <Method void AtomicReference()>
	//    6   15:putstatic       #69  <Field AtomicReference skipBufferReference>
	//*   7   18:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.util.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			HttpDataSource, DataSpec, TransferListener

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
	//    4    4:invokespecial   #70  <Method void DefaultHttpDataSource(String, Predicate, TransferListener)>
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
	//    6   10:invokespecial   #75  <Method void DefaultHttpDataSource(String, Predicate, TransferListener, int, int)>
	//    7   13:return          
	}

	public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i, int j)
	{
		this(s, predicate, transferlistener, i, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokespecial   #79  <Method void DefaultHttpDataSource(String, Predicate, TransferListener, int, int, boolean)>
	//    8   12:return          
	}

	public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		userAgent = Assertions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #87  <Method String Assertions.checkNotEmpty(String)>
	//    5    9:putfield        #89  <Field String userAgent>
		contentTypePredicate = predicate;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #91  <Field Predicate contentTypePredicate>
		listener = transferlistener;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #93  <Field TransferListener listener>
		requestProperties = new HashMap();
	//   12   22:aload_0         
	//   13   23:new             #95  <Class HashMap>
	//   14   26:dup             
	//   15   27:invokespecial   #96  <Method void HashMap()>
	//   16   30:putfield        #98  <Field HashMap requestProperties>
		connectTimeoutMillis = i;
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:putfield        #100 <Field int connectTimeoutMillis>
		readTimeoutMillis = j;
	//   20   39:aload_0         
	//   21   40:iload           5
	//   22   42:putfield        #102 <Field int readTimeoutMillis>
		allowCrossProtocolRedirects = flag;
	//   23   45:aload_0         
	//   24   46:iload           6
	//   25   48:putfield        #104 <Field boolean allowCrossProtocolRedirects>
	//   26   51:return          
	}

	private void closeConnectionQuietly()
	{
		HttpURLConnection httpurlconnection = connection;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HttpURLConnection connection>
	//    2    4:astore_1        
		if(httpurlconnection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          31
		{
			try
			{
				httpurlconnection.disconnect();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #115 <Method void HttpURLConnection.disconnect()>
			}
	//*   7   13:goto            26
			catch(Exception exception)
	//*   8   16:astore_1        
			{
				Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", ((Throwable) (exception)));
	//    9   17:ldc1            #18  <String "DefaultHttpDataSource">
	//   10   19:ldc1            #117 <String "Unexpected error while disconnecting">
	//   11   21:aload_1         
	//   12   22:invokestatic    #123 <Method int Log.e(String, String, Throwable)>
	//   13   25:pop             
			}
			connection = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #110 <Field HttpURLConnection connection>
		}
	//   17   31:return          
	}

	private static long getContentLength(HttpURLConnection httpurlconnection)
	{
		String s = httpurlconnection.getHeaderField("Content-Length");
	//    0    0:aload_0         
	//    1    1:ldc1            #129 <String "Content-Length">
	//    2    3:invokevirtual   #132 <Method String HttpURLConnection.getHeaderField(String)>
	//    3    6:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    4    8:aload           5
	//    5   10:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   13:ifne            69
_L1:
		long l = Long.parseLong(s);
	//    7   16:aload           5
	//    8   18:invokestatic    #144 <Method long Long.parseLong(String)>
	//    9   21:lstore_1        
		  goto _L3
	//*  10   22:goto            73
_L8:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   11   25:new             #146 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #147 <Method void StringBuilder()>
	//   14   32:astore          6
		stringbuilder1.append("Unexpected Content-Length [");
	//   15   34:aload           6
	//   16   36:ldc1            #149 <String "Unexpected Content-Length [">
	//   17   38:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		stringbuilder1.append(s);
	//   19   42:aload           6
	//   20   44:aload           5
	//   21   46:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
		stringbuilder1.append("]");
	//   23   50:aload           6
	//   24   52:ldc1            #155 <String "]">
	//   25   54:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
		Log.e("DefaultHttpDataSource", stringbuilder1.toString());
	//   27   58:ldc1            #18  <String "DefaultHttpDataSource">
	//   28   60:aload           6
	//   29   62:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   30   65:invokestatic    #162 <Method int Log.e(String, String)>
	//   31   68:pop             
_L2:
		l = -1L;
	//   32   69:ldc2w           #163 <Long -1L>
	//   33   72:lstore_1        
_L3:
		httpurlconnection = ((HttpURLConnection) (httpurlconnection.getHeaderField("Content-Range")));
	//   34   73:aload_0         
	//   35   74:ldc1            #166 <String "Content-Range">
	//   36   76:invokevirtual   #132 <Method String HttpURLConnection.getHeaderField(String)>
	//   37   79:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection)))) goto _L5; else goto _L4
	//   38   80:aload_0         
	//   39   81:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   40   84:ifne            250
_L4:
		Matcher matcher = CONTENT_RANGE_HEADER.matcher(((CharSequence) (httpurlconnection)));
	//   41   87:getstatic       #58  <Field Pattern CONTENT_RANGE_HEADER>
	//   42   90:aload_0         
	//   43   91:invokevirtual   #170 <Method Matcher Pattern.matcher(CharSequence)>
	//   44   94:astore          6
		if(!matcher.find()) goto _L5; else goto _L6
	//   45   96:aload           6
	//   46   98:invokevirtual   #176 <Method boolean Matcher.find()>
	//   47  101:ifeq            250
_L6:
		long l1 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1L;
	//   48  104:aload           6
	//   49  106:iconst_2        
	//   50  107:invokevirtual   #180 <Method String Matcher.group(int)>
	//   51  110:invokestatic    #144 <Method long Long.parseLong(String)>
	//   52  113:aload           6
	//   53  115:iconst_1        
	//   54  116:invokevirtual   #180 <Method String Matcher.group(int)>
	//   55  119:invokestatic    #144 <Method long Long.parseLong(String)>
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
	//   70  140:new             #146 <Class StringBuilder>
	//   71  143:dup             
	//   72  144:invokespecial   #147 <Method void StringBuilder()>
	//   73  147:astore          6
		stringbuilder2.append("Inconsistent headers [");
	//   74  149:aload           6
	//   75  151:ldc1            #182 <String "Inconsistent headers [">
	//   76  153:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   77  156:pop             
		stringbuilder2.append(s);
	//   78  157:aload           6
	//   79  159:aload           5
	//   80  161:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   81  164:pop             
		stringbuilder2.append("] [");
	//   82  165:aload           6
	//   83  167:ldc1            #184 <String "] [">
	//   84  169:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   85  172:pop             
		stringbuilder2.append(((String) (httpurlconnection)));
	//   86  173:aload           6
	//   87  175:aload_0         
	//   88  176:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
		stringbuilder2.append("]");
	//   90  180:aload           6
	//   91  182:ldc1            #155 <String "]">
	//   92  184:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   93  187:pop             
		Log.w("DefaultHttpDataSource", stringbuilder2.toString());
	//   94  188:ldc1            #18  <String "DefaultHttpDataSource">
	//   95  190:aload           6
	//   96  192:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   97  195:invokestatic    #187 <Method int Log.w(String, String)>
	//   98  198:pop             
		l1 = Math.max(l, l1);
	//   99  199:lload_1         
	//  100  200:lload_3         
	//  101  201:invokestatic    #193 <Method long Math.max(long, long)>
	//  102  204:lstore_3        
		return l1;
	//  103  205:lload_3         
	//  104  206:lreturn         
_L9:
		StringBuilder stringbuilder = new StringBuilder();
	//  105  207:new             #146 <Class StringBuilder>
	//  106  210:dup             
	//  107  211:invokespecial   #147 <Method void StringBuilder()>
	//  108  214:astore          5
		stringbuilder.append("Unexpected Content-Range [");
	//  109  216:aload           5
	//  110  218:ldc1            #195 <String "Unexpected Content-Range [">
	//  111  220:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  112  223:pop             
		stringbuilder.append(((String) (httpurlconnection)));
	//  113  224:aload           5
	//  114  226:aload_0         
	//  115  227:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  116  230:pop             
		stringbuilder.append("]");
	//  117  231:aload           5
	//  118  233:ldc1            #155 <String "]">
	//  119  235:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  120  238:pop             
		Log.e("DefaultHttpDataSource", stringbuilder.toString());
	//  121  239:ldc1            #18  <String "DefaultHttpDataSource">
	//  122  241:aload           5
	//  123  243:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  124  246:invokestatic    #162 <Method int Log.e(String, String)>
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
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          74
		{
			s = ((String) (new URL(url, s)));
	//    2    4:new             #201 <Class URL>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #204 <Method void URL(URL, String)>
	//    7   13:astore_1        
			url = ((URL) (((URL) (s)).getProtocol()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #207 <Method String URL.getProtocol()>
	//   10   18:astore_0        
			if(!"https".equals(((Object) (url))))
	//*  11   19:ldc1            #209 <String "https">
	//*  12   21:aload_0         
	//*  13   22:invokevirtual   #215 <Method boolean String.equals(Object)>
	//*  14   25:ifne            72
			{
				if("http".equals(((Object) (url))))
	//*  15   28:ldc1            #217 <String "http">
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #215 <Method boolean String.equals(Object)>
	//*  18   34:ifeq            39
				{
					return ((URL) (s));
	//   19   37:aload_1         
	//   20   38:areturn         
				} else
				{
					s = ((String) (new StringBuilder()));
	//   21   39:new             #146 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #147 <Method void StringBuilder()>
	//   24   46:astore_1        
					((StringBuilder) (s)).append("Unsupported protocol redirect: ");
	//   25   47:aload_1         
	//   26   48:ldc1            #219 <String "Unsupported protocol redirect: ">
	//   27   50:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
					((StringBuilder) (s)).append(((String) (url)));
	//   29   54:aload_1         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
					throw new ProtocolException(((StringBuilder) (s)).toString());
	//   33   60:new             #221 <Class ProtocolException>
	//   34   63:dup             
	//   35   64:aload_1         
	//   36   65:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   37   68:invokespecial   #224 <Method void ProtocolException(String)>
	//   38   71:athrow          
				}
			} else
			{
				return ((URL) (s));
	//   39   72:aload_1         
	//   40   73:areturn         
			}
		} else
		{
			throw new ProtocolException("Null location redirect");
	//   41   74:new             #221 <Class ProtocolException>
	//   42   77:dup             
	//   43   78:ldc1            #226 <String "Null location redirect">
	//   44   80:invokespecial   #224 <Method void ProtocolException(String)>
	//   45   83:athrow          
		}
	}

	private HttpURLConnection makeConnection(DataSpec dataspec)
		throws IOException
	{
		URL url = new URL(dataspec.uri.toString());
	//    0    0:new             #201 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #235 <Field Uri DataSpec.uri>
	//    4    8:invokevirtual   #238 <Method String Uri.toString()>
	//    5   11:invokespecial   #239 <Method void URL(String)>
	//    6   14:astore          10
		byte abyte1[] = dataspec.postBody;
	//    7   16:aload_1         
	//    8   17:getfield        #243 <Field byte[] DataSpec.postBody>
	//    9   20:astore          11
		long l = dataspec.position;
	//   10   22:aload_1         
	//   11   23:getfield        #246 <Field long DataSpec.position>
	//   12   26:lstore          4
		long l1 = dataspec.length;
	//   13   28:aload_1         
	//   14   29:getfield        #249 <Field long DataSpec.length>
	//   15   32:lstore          6
		int j = dataspec.flags;
	//   16   34:aload_1         
	//   17   35:getfield        #252 <Field int DataSpec.flags>
	//   18   38:istore_3        
		int i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_2        
		boolean flag;
		if((j & 1) != 0)
	//*  21   41:iload_3         
	//*  22   42:iconst_1        
	//*  23   43:iand            
	//*  24   44:ifeq            53
			flag = true;
	//   25   47:iconst_1        
	//   26   48:istore          8
		else
	//*  27   50:goto            56
			flag = false;
	//   28   53:iconst_0        
	//   29   54:istore          8
		dataspec = ((DataSpec) (url));
	//   30   56:aload           10
	//   31   58:astore_1        
		byte abyte0[] = abyte1;
	//   32   59:aload           11
	//   33   61:astore          9
		if(!allowCrossProtocolRedirects)
	//*  34   63:aload_0         
	//*  35   64:getfield        #104 <Field boolean allowCrossProtocolRedirects>
	//*  36   67:ifne            86
			return makeConnection(url, abyte1, l, l1, flag, true);
	//   37   70:aload_0         
	//   38   71:aload           10
	//   39   73:aload           11
	//   40   75:lload           4
	//   41   77:lload           6
	//   42   79:iload           8
	//   43   81:iconst_1        
	//   44   82:invokespecial   #255 <Method HttpURLConnection makeConnection(URL, byte[], long, long, boolean, boolean)>
	//   45   85:areturn         
		do
		{
			int k = i + 1;
	//   46   86:iload_2         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore_3        
			if(i <= 20)
	//*  50   90:iload_2         
	//*  51   91:bipush          20
	//*  52   93:icmpgt          201
			{
				HttpURLConnection httpurlconnection = makeConnection(((URL) (dataspec)), abyte0, l, l1, flag, false);
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:aload           9
	//   56  100:lload           4
	//   57  102:lload           6
	//   58  104:iload           8
	//   59  106:iconst_0        
	//   60  107:invokespecial   #255 <Method HttpURLConnection makeConnection(URL, byte[], long, long, boolean, boolean)>
	//   61  110:astore          10
				i = httpurlconnection.getResponseCode();
	//   62  112:aload           10
	//   63  114:invokevirtual   #259 <Method int HttpURLConnection.getResponseCode()>
	//   64  117:istore_2        
				if(i != 300 && i != 301 && i != 302 && i != 303 && (abyte0 != null || i != 307 && i != 308))
	//*  65  118:iload_2         
	//*  66  119:sipush          300
	//*  67  122:icmpeq          171
	//*  68  125:iload_2         
	//*  69  126:sipush          301
	//*  70  129:icmpeq          171
	//*  71  132:iload_2         
	//*  72  133:sipush          302
	//*  73  136:icmpeq          171
	//*  74  139:iload_2         
	//*  75  140:sipush          303
	//*  76  143:icmpeq          171
	//*  77  146:aload           9
	//*  78  148:ifnonnull       168
	//*  79  151:iload_2         
	//*  80  152:sipush          307
	//*  81  155:icmpeq          171
	//*  82  158:iload_2         
	//*  83  159:sipush          308
	//*  84  162:icmpne          168
	//*  85  165:goto            171
					return httpurlconnection;
	//   86  168:aload           10
	//   87  170:areturn         
				abyte0 = null;
	//   88  171:aconst_null     
	//   89  172:astore          9
				String s = httpurlconnection.getHeaderField("Location");
	//   90  174:aload           10
	//   91  176:ldc2            #261 <String "Location">
	//   92  179:invokevirtual   #132 <Method String HttpURLConnection.getHeaderField(String)>
	//   93  182:astore          11
				httpurlconnection.disconnect();
	//   94  184:aload           10
	//   95  186:invokevirtual   #115 <Method void HttpURLConnection.disconnect()>
				dataspec = ((DataSpec) (handleRedirect(((URL) (dataspec)), s)));
	//   96  189:aload_1         
	//   97  190:aload           11
	//   98  192:invokestatic    #263 <Method URL handleRedirect(URL, String)>
	//   99  195:astore_1        
				i = k;
	//  100  196:iload_3         
	//  101  197:istore_2        
			} else
	//* 102  198:goto            86
			{
				dataspec = ((DataSpec) (new StringBuilder()));
	//  103  201:new             #146 <Class StringBuilder>
	//  104  204:dup             
	//  105  205:invokespecial   #147 <Method void StringBuilder()>
	//  106  208:astore_1        
				((StringBuilder) (dataspec)).append("Too many redirects: ");
	//  107  209:aload_1         
	//  108  210:ldc2            #265 <String "Too many redirects: ">
	//  109  213:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  110  216:pop             
				((StringBuilder) (dataspec)).append(k);
	//  111  217:aload_1         
	//  112  218:iload_3         
	//  113  219:invokevirtual   #268 <Method StringBuilder StringBuilder.append(int)>
	//  114  222:pop             
				throw new NoRouteToHostException(((StringBuilder) (dataspec)).toString());
	//  115  223:new             #270 <Class NoRouteToHostException>
	//  116  226:dup             
	//  117  227:aload_1         
	//  118  228:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  119  231:invokespecial   #271 <Method void NoRouteToHostException(String)>
	//  120  234:athrow          
			}
		} while(true);
	}

	private HttpURLConnection makeConnection(URL url, byte abyte0[], long l, long l1, boolean flag, 
			boolean flag1)
		throws IOException
	{
		HttpURLConnection httpurlconnection;
		httpurlconnection = (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #275 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #112 <Class HttpURLConnection>
	//    3    7:astore          10
		httpurlconnection.setConnectTimeout(connectTimeoutMillis);
	//    4    9:aload           10
	//    5   11:aload_0         
	//    6   12:getfield        #100 <Field int connectTimeoutMillis>
	//    7   15:invokevirtual   #279 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(readTimeoutMillis);
	//    8   18:aload           10
	//    9   20:aload_0         
	//   10   21:getfield        #102 <Field int readTimeoutMillis>
	//   11   24:invokevirtual   #282 <Method void HttpURLConnection.setReadTimeout(int)>
		url = ((URL) (requestProperties));
	//   12   27:aload_0         
	//   13   28:getfield        #98  <Field HashMap requestProperties>
	//   14   31:astore_1        
		url;
	//   15   32:aload_1         
		JVM INSTR monitorenter ;
	//   16   33:monitorenter    
		java.util.Map.Entry entry;
		for(Iterator iterator = requestProperties.entrySet().iterator(); iterator.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*  17   34:aload_0         
	//*  18   35:getfield        #98  <Field HashMap requestProperties>
	//*  19   38:invokevirtual   #286 <Method Set HashMap.entrySet()>
	//*  20   41:invokeinterface #292 <Method Iterator Set.iterator()>
	//*  21   46:astore          9
	//*  22   48:aload           9
	//*  23   50:invokeinterface #297 <Method boolean Iterator.hasNext()>
	//*  24   55:ifeq            98
			entry = (java.util.Map.Entry)iterator.next();
	//   25   58:aload           9
	//   26   60:invokeinterface #301 <Method Object Iterator.next()>
	//   27   65:checkcast       #303 <Class java.util.Map$Entry>
	//   28   68:astore          11

	//   29   70:aload           10
	//   30   72:aload           11
	//   31   74:invokeinterface #306 <Method Object java.util.Map$Entry.getKey()>
	//   32   79:checkcast       #211 <Class String>
	//   33   82:aload           11
	//   34   84:invokeinterface #309 <Method Object java.util.Map$Entry.getValue()>
	//   35   89:checkcast       #211 <Class String>
	//   36   92:invokevirtual   #313 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  37   95:goto            48
		url;
	//   38   98:aload_1         
		JVM INSTR monitorexit ;
	//   39   99:monitorexit     
		if(l != 0L || l1 != -1L)
	//*  40  100:lload_3         
	//*  41  101:lconst_0        
	//*  42  102:lcmp            
	//*  43  103:ifne            115
	//*  44  106:lload           5
	//*  45  108:ldc2w           #163 <Long -1L>
	//*  46  111:lcmp            
	//*  47  112:ifeq            203
		{
			url = ((URL) (new StringBuilder()));
	//   48  115:new             #146 <Class StringBuilder>
	//   49  118:dup             
	//   50  119:invokespecial   #147 <Method void StringBuilder()>
	//   51  122:astore_1        
			((StringBuilder) (url)).append("bytes=");
	//   52  123:aload_1         
	//   53  124:ldc2            #315 <String "bytes=">
	//   54  127:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   55  130:pop             
			((StringBuilder) (url)).append(l);
	//   56  131:aload_1         
	//   57  132:lload_3         
	//   58  133:invokevirtual   #318 <Method StringBuilder StringBuilder.append(long)>
	//   59  136:pop             
			((StringBuilder) (url)).append("-");
	//   60  137:aload_1         
	//   61  138:ldc2            #320 <String "-">
	//   62  141:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   63  144:pop             
			String s = ((StringBuilder) (url)).toString();
	//   64  145:aload_1         
	//   65  146:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   66  149:astore          9
			url = ((URL) (s));
	//   67  151:aload           9
	//   68  153:astore_1        
			if(l1 != -1L)
	//*  69  154:lload           5
	//*  70  156:ldc2w           #163 <Long -1L>
	//*  71  159:lcmp            
	//*  72  160:ifeq            194
			{
				url = ((URL) (new StringBuilder()));
	//   73  163:new             #146 <Class StringBuilder>
	//   74  166:dup             
	//   75  167:invokespecial   #147 <Method void StringBuilder()>
	//   76  170:astore_1        
				((StringBuilder) (url)).append(s);
	//   77  171:aload_1         
	//   78  172:aload           9
	//   79  174:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   80  177:pop             
				((StringBuilder) (url)).append((l + l1) - 1L);
	//   81  178:aload_1         
	//   82  179:lload_3         
	//   83  180:lload           5
	//   84  182:ladd            
	//   85  183:lconst_1        
	//   86  184:lsub            
	//   87  185:invokevirtual   #318 <Method StringBuilder StringBuilder.append(long)>
	//   88  188:pop             
				url = ((URL) (((StringBuilder) (url)).toString()));
	//   89  189:aload_1         
	//   90  190:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   91  193:astore_1        
			}
			httpurlconnection.setRequestProperty("Range", ((String) (url)));
	//   92  194:aload           10
	//   93  196:ldc2            #322 <String "Range">
	//   94  199:aload_1         
	//   95  200:invokevirtual   #313 <Method void HttpURLConnection.setRequestProperty(String, String)>
		}
		httpurlconnection.setRequestProperty("User-Agent", userAgent);
	//   96  203:aload           10
	//   97  205:ldc2            #324 <String "User-Agent">
	//   98  208:aload_0         
	//   99  209:getfield        #89  <Field String userAgent>
	//  100  212:invokevirtual   #313 <Method void HttpURLConnection.setRequestProperty(String, String)>
		if(!flag)
	//* 101  215:iload           7
	//* 102  217:ifne            231
			httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
	//  103  220:aload           10
	//  104  222:ldc2            #326 <String "Accept-Encoding">
	//  105  225:ldc2            #328 <String "identity">
	//  106  228:invokevirtual   #313 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setInstanceFollowRedirects(flag1);
	//  107  231:aload           10
	//  108  233:iload           8
	//  109  235:invokevirtual   #332 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		if(abyte0 != null)
	//* 110  238:aload_2         
	//* 111  239:ifnull          248
			flag = true;
	//  112  242:iconst_1        
	//  113  243:istore          7
		else
	//* 114  245:goto            251
			flag = false;
	//  115  248:iconst_0        
	//  116  249:istore          7
		httpurlconnection.setDoOutput(flag);
	//  117  251:aload           10
	//  118  253:iload           7
	//  119  255:invokevirtual   #335 <Method void HttpURLConnection.setDoOutput(boolean)>
		if(abyte0 != null)
	//* 120  258:aload_2         
	//* 121  259:ifnull          313
		{
			httpurlconnection.setRequestMethod("POST");
	//  122  262:aload           10
	//  123  264:ldc2            #337 <String "POST">
	//  124  267:invokevirtual   #340 <Method void HttpURLConnection.setRequestMethod(String)>
			if(abyte0.length == 0)
	//* 125  270:aload_2         
	//* 126  271:arraylength     
	//* 127  272:ifne            283
			{
				httpurlconnection.connect();
	//  128  275:aload           10
	//  129  277:invokevirtual   #343 <Method void HttpURLConnection.connect()>
				return httpurlconnection;
	//  130  280:aload           10
	//  131  282:areturn         
			} else
			{
				httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
	//  132  283:aload           10
	//  133  285:aload_2         
	//  134  286:arraylength     
	//  135  287:invokevirtual   #346 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
				httpurlconnection.connect();
	//  136  290:aload           10
	//  137  292:invokevirtual   #343 <Method void HttpURLConnection.connect()>
				url = ((URL) (httpurlconnection.getOutputStream()));
	//  138  295:aload           10
	//  139  297:invokevirtual   #350 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  140  300:astore_1        
				((OutputStream) (url)).write(abyte0);
	//  141  301:aload_1         
	//  142  302:aload_2         
	//  143  303:invokevirtual   #356 <Method void OutputStream.write(byte[])>
				((OutputStream) (url)).close();
	//  144  306:aload_1         
	//  145  307:invokevirtual   #359 <Method void OutputStream.close()>
				return httpurlconnection;
	//  146  310:aload           10
	//  147  312:areturn         
			}
		} else
		{
			httpurlconnection.connect();
	//  148  313:aload           10
	//  149  315:invokevirtual   #343 <Method void HttpURLConnection.connect()>
			return httpurlconnection;
	//  150  318:aload           10
	//  151  320:areturn         
		}
		abyte0;
	//  152  321:astore_2        
		url;
	//  153  322:aload_1         
		JVM INSTR monitorexit ;
	//  154  323:monitorexit     
		throw abyte0;
	//  155  324:aload_2         
	//  156  325:athrow          
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
		i = inputStream.read(abyte0, i, j);
	//    4    6:aload_0         
	//    5    7:getfield        #363 <Field InputStream inputStream>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #368 <Method int InputStream.read(byte[], int, int)>
	//   10   16:istore_2        
		if(i == -1)
	//*  11   17:iload_2         
	//*  12   18:iconst_m1       
	//*  13   19:icmpne          59
		{
			long l = bytesToRead;
	//   14   22:aload_0         
	//   15   23:getfield        #370 <Field long bytesToRead>
	//   16   26:lstore          4
			if(l != -1L)
	//*  17   28:lload           4
	//*  18   30:ldc2w           #163 <Long -1L>
	//*  19   33:lcmp            
	//*  20   34:ifeq            57
			{
				if(l == bytesRead)
	//*  21   37:lload           4
	//*  22   39:aload_0         
	//*  23   40:getfield        #372 <Field long bytesRead>
	//*  24   43:lcmp            
	//*  25   44:ifne            49
					return -1;
	//   26   47:iconst_m1       
	//   27   48:ireturn         
				else
					throw new EOFException();
	//   28   49:new             #374 <Class EOFException>
	//   29   52:dup             
	//   30   53:invokespecial   #375 <Method void EOFException()>
	//   31   56:athrow          
			} else
			{
				return -1;
	//   32   57:iconst_m1       
	//   33   58:ireturn         
			}
		}
		bytesRead = bytesRead + (long)i;
	//   34   59:aload_0         
	//   35   60:aload_0         
	//   36   61:getfield        #372 <Field long bytesRead>
	//   37   64:iload_2         
	//   38   65:i2l             
	//   39   66:ladd            
	//   40   67:putfield        #372 <Field long bytesRead>
		abyte0 = ((byte []) (listener));
	//   41   70:aload_0         
	//   42   71:getfield        #93  <Field TransferListener listener>
	//   43   74:astore_1        
		if(abyte0 != null)
	//*  44   75:aload_1         
	//*  45   76:ifnull          86
			((TransferListener) (abyte0)).onBytesTransferred(i);
	//   46   79:aload_1         
	//   47   80:iload_2         
	//   48   81:invokeinterface #380 <Method void TransferListener.onBytesTransferred(int)>
		return i;
	//   49   86:iload_2         
	//   50   87:ireturn         
	}

	private void skipInternal()
		throws IOException
	{
		if(bytesSkipped == bytesToSkip)
	//*   0    0:aload_0         
	//*   1    1:getfield        #383 <Field long bytesSkipped>
	//*   2    4:aload_0         
	//*   3    5:getfield        #385 <Field long bytesToSkip>
	//*   4    8:lcmp            
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		byte abyte1[] = (byte[])skipBufferReference.getAndSet(((Object) (null)));
	//    7   13:getstatic       #65  <Field AtomicReference skipBufferReference>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #389 <Method Object AtomicReference.getAndSet(Object)>
	//   10   20:checkcast       #390 <Class byte[]>
	//   11   23:astore          7
		byte abyte0[] = abyte1;
	//   12   25:aload           7
	//   13   27:astore          6
		if(abyte1 == null)
	//*  14   29:aload           7
	//*  15   31:ifnonnull       41
			abyte0 = new byte[4096];
	//   16   34:sipush          4096
	//   17   37:newarray        byte[]
	//   18   39:astore          6
		do
		{
			long l = bytesSkipped;
	//   19   41:aload_0         
	//   20   42:getfield        #383 <Field long bytesSkipped>
	//   21   45:lstore_2        
			long l1 = bytesToSkip;
	//   22   46:aload_0         
	//   23   47:getfield        #385 <Field long bytesToSkip>
	//   24   50:lstore          4
			if(l != l1)
	//*  25   52:lload_2         
	//*  26   53:lload           4
	//*  27   55:lcmp            
	//*  28   56:ifeq            144
			{
				int i = (int)Math.min(l1 - l, abyte0.length);
	//   29   59:lload           4
	//   30   61:lload_2         
	//   31   62:lsub            
	//   32   63:aload           6
	//   33   65:arraylength     
	//   34   66:i2l             
	//   35   67:invokestatic    #393 <Method long Math.min(long, long)>
	//   36   70:l2i             
	//   37   71:istore_1        
				i = inputStream.read(abyte0, 0, i);
	//   38   72:aload_0         
	//   39   73:getfield        #363 <Field InputStream inputStream>
	//   40   76:aload           6
	//   41   78:iconst_0        
	//   42   79:iload_1         
	//   43   80:invokevirtual   #368 <Method int InputStream.read(byte[], int, int)>
	//   44   83:istore_1        
				if(!Thread.interrupted())
	//*  45   84:invokestatic    #398 <Method boolean Thread.interrupted()>
	//*  46   87:ifne            136
				{
					if(i != -1)
	//*  47   90:iload_1         
	//*  48   91:iconst_m1       
	//*  49   92:icmpeq          128
					{
						bytesSkipped = bytesSkipped + (long)i;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #383 <Field long bytesSkipped>
	//   53  100:iload_1         
	//   54  101:i2l             
	//   55  102:ladd            
	//   56  103:putfield        #383 <Field long bytesSkipped>
						TransferListener transferlistener = listener;
	//   57  106:aload_0         
	//   58  107:getfield        #93  <Field TransferListener listener>
	//   59  110:astore          7
						if(transferlistener != null)
	//*  60  112:aload           7
	//*  61  114:ifnull          41
							transferlistener.onBytesTransferred(i);
	//   62  117:aload           7
	//   63  119:iload_1         
	//   64  120:invokeinterface #380 <Method void TransferListener.onBytesTransferred(int)>
					} else
	//*  65  125:goto            41
					{
						throw new EOFException();
	//   66  128:new             #374 <Class EOFException>
	//   67  131:dup             
	//   68  132:invokespecial   #375 <Method void EOFException()>
	//   69  135:athrow          
					}
				} else
				{
					throw new InterruptedIOException();
	//   70  136:new             #400 <Class InterruptedIOException>
	//   71  139:dup             
	//   72  140:invokespecial   #401 <Method void InterruptedIOException()>
	//   73  143:athrow          
				}
			} else
			{
				skipBufferReference.set(((Object) (abyte0)));
	//   74  144:getstatic       #65  <Field AtomicReference skipBufferReference>
	//   75  147:aload           6
	//   76  149:invokevirtual   #405 <Method void AtomicReference.set(Object)>
				return;
	//   77  152:return          
			}
		} while(true);
	}

	protected final long bytesRead()
	{
		return bytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field long bytesRead>
	//    2    4:lreturn         
	}

	protected final long bytesRemaining()
	{
		long l = bytesToRead;
	//    0    0:aload_0         
	//    1    1:getfield        #370 <Field long bytesToRead>
	//    2    4:lstore_1        
		if(l == -1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #163 <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return l;
	//    7   13:lload_1         
	//    8   14:lreturn         
		else
			return l - bytesRead;
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #372 <Field long bytesRead>
	//   12   20:lsub            
	//   13   21:lreturn         
	}

	protected final long bytesSkipped()
	{
		return bytesSkipped;
	//    0    0:aload_0         
	//    1    1:getfield        #383 <Field long bytesSkipped>
	//    2    4:lreturn         
	}

	public void clearAllRequestProperties()
	{
		synchronized(requestProperties)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field HashMap requestProperties>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			requestProperties.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #98  <Field HashMap requestProperties>
	//    7   11:invokevirtual   #411 <Method void HashMap.clear()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		hashmap;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public void clearRequestProperty(String s)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #415 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		synchronized(requestProperties)
	//*   3    5:aload_0         
	//*   4    6:getfield        #98  <Field HashMap requestProperties>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
		{
			requestProperties.remove(((Object) (s)));
	//    8   12:aload_0         
	//    9   13:getfield        #98  <Field HashMap requestProperties>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #418 <Method Object HashMap.remove(Object)>
	//   12   20:pop             
		}
	//   13   21:aload_2         
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		s;
	//   16   24:astore_1        
		hashmap;
	//   17   25:aload_2         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		throw s;
	//   19   27:aload_1         
	//   20   28:athrow          
	}

	public void close()
		throws HttpDataSource.HttpDataSourceException
	{
		if(inputStream == null)
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:getfield        #363 <Field InputStream inputStream>
	//    2    4:ifnull          43
		Util.maybeTerminateInputStream(connection, bytesRemaining());
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field HttpURLConnection connection>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #422 <Method long bytesRemaining()>
	//    7   15:invokestatic    #428 <Method void Util.maybeTerminateInputStream(HttpURLConnection, long)>
		inputStream.close();
	//    8   18:aload_0         
	//    9   19:getfield        #363 <Field InputStream inputStream>
	//   10   22:invokevirtual   #429 <Method void InputStream.close()>
		break MISSING_BLOCK_LABEL_43;
	//   11   25:goto            43
		Object obj;
		obj;
	//   12   28:astore_1        
		throw new HttpDataSource.HttpDataSourceException(((IOException) (obj)), dataSpec, 3);
	//   13   29:new             #420 <Class HttpDataSource$HttpDataSourceException>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #431 <Field DataSpec dataSpec>
	//   18   38:iconst_3        
	//   19   39:invokespecial   #434 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//   20   42:athrow          
		inputStream = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #363 <Field InputStream inputStream>
		closeConnectionQuietly();
	//   24   48:aload_0         
	//   25   49:invokespecial   #436 <Method void closeConnectionQuietly()>
		if(opened)
	//*  26   52:aload_0         
	//*  27   53:getfield        #438 <Field boolean opened>
	//*  28   56:ifeq            79
		{
			opened = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #438 <Field boolean opened>
			TransferListener transferlistener = listener;
	//   32   64:aload_0         
	//   33   65:getfield        #93  <Field TransferListener listener>
	//   34   68:astore_1        
			if(transferlistener != null)
	//*  35   69:aload_1         
	//*  36   70:ifnull          79
				transferlistener.onTransferEnd();
	//   37   73:aload_1         
	//   38   74:invokeinterface #441 <Method void TransferListener.onTransferEnd()>
		}
		return;
	//   39   79:return          
		transferlistener;
	//   40   80:astore_1        
		inputStream = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #363 <Field InputStream inputStream>
		closeConnectionQuietly();
	//   44   86:aload_0         
	//   45   87:invokespecial   #436 <Method void closeConnectionQuietly()>
		if(opened)
	//*  46   90:aload_0         
	//*  47   91:getfield        #438 <Field boolean opened>
	//*  48   94:ifeq            117
		{
			opened = false;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #438 <Field boolean opened>
			TransferListener transferlistener1 = listener;
	//   52  102:aload_0         
	//   53  103:getfield        #93  <Field TransferListener listener>
	//   54  106:astore_2        
			if(transferlistener1 != null)
	//*  55  107:aload_2         
	//*  56  108:ifnull          117
				transferlistener1.onTransferEnd();
	//   57  111:aload_2         
	//   58  112:invokeinterface #441 <Method void TransferListener.onTransferEnd()>
		}
		throw transferlistener;
	//   59  117:aload_1         
	//   60  118:athrow          
	}

	protected final HttpURLConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HttpURLConnection connection>
	//    2    4:areturn         
	}

	public Map getResponseHeaders()
	{
		HttpURLConnection httpurlconnection = connection;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HttpURLConnection connection>
	//    2    4:astore_1        
		if(httpurlconnection == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return httpurlconnection.getHeaderFields();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #448 <Method Map HttpURLConnection.getHeaderFields()>
	//    9   15:areturn         
	}

	public String getUri()
	{
		HttpURLConnection httpurlconnection = connection;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HttpURLConnection connection>
	//    2    4:astore_1        
		if(httpurlconnection == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return httpurlconnection.getURL().toString();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #454 <Method URL HttpURLConnection.getURL()>
	//    9   15:invokevirtual   #455 <Method String URL.toString()>
	//   10   18:areturn         
	}

	public long open(DataSpec dataspec)
		throws HttpDataSource.HttpDataSourceException
	{
		dataSpec = dataspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #431 <Field DataSpec dataSpec>
		long l2 = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          5
		bytesRead = 0L;
	//    5    8:aload_0         
	//    6    9:lconst_0        
	//    7   10:putfield        #372 <Field long bytesRead>
		bytesSkipped = 0L;
	//    8   13:aload_0         
	//    9   14:lconst_0        
	//   10   15:putfield        #383 <Field long bytesSkipped>
		int i;
		try
		{
			connection = makeConnection(dataspec);
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:invokespecial   #459 <Method HttpURLConnection makeConnection(DataSpec)>
	//   15   24:putfield        #110 <Field HttpURLConnection connection>
		}
	//*  16   27:aload_0         
	//*  17   28:getfield        #110 <Field HttpURLConnection connection>
	//*  18   31:invokevirtual   #259 <Method int HttpURLConnection.getResponseCode()>
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:sipush          200
	//*  22   39:icmplt          263
	//*  23   42:iload_2         
	//*  24   43:sipush          299
	//*  25   46:icmpgt          263
	//*  26   49:aload_0         
	//*  27   50:getfield        #110 <Field HttpURLConnection connection>
	//*  28   53:invokevirtual   #462 <Method String HttpURLConnection.getContentType()>
	//*  29   56:astore          9
	//*  30   58:aload_0         
	//*  31   59:getfield        #91  <Field Predicate contentTypePredicate>
	//*  32   62:astore          10
	//*  33   64:aload           10
	//*  34   66:ifnull          99
	//*  35   69:aload           10
	//*  36   71:aload           9
	//*  37   73:invokeinterface #467 <Method boolean Predicate.evaluate(Object)>
	//*  38   78:ifeq            84
	//*  39   81:goto            99
	//*  40   84:aload_0         
	//*  41   85:invokespecial   #436 <Method void closeConnectionQuietly()>
	//*  42   88:new             #469 <Class HttpDataSource$InvalidContentTypeException>
	//*  43   91:dup             
	//*  44   92:aload           9
	//*  45   94:aload_1         
	//*  46   95:invokespecial   #472 <Method void HttpDataSource$InvalidContentTypeException(String, DataSpec)>
	//*  47   98:athrow          
	//*  48   99:lload           5
	//*  49  101:lstore_3        
	//*  50  102:iload_2         
	//*  51  103:sipush          200
	//*  52  106:icmpne          126
	//*  53  109:lload           5
	//*  54  111:lstore_3        
	//*  55  112:aload_1         
	//*  56  113:getfield        #246 <Field long DataSpec.position>
	//*  57  116:lconst_0        
	//*  58  117:lcmp            
	//*  59  118:ifeq            126
	//*  60  121:aload_1         
	//*  61  122:getfield        #246 <Field long DataSpec.position>
	//*  62  125:lstore_3        
	//*  63  126:aload_0         
	//*  64  127:lload_3         
	//*  65  128:putfield        #385 <Field long bytesToSkip>
	//*  66  131:aload_1         
	//*  67  132:getfield        #252 <Field int DataSpec.flags>
	//*  68  135:iconst_1        
	//*  69  136:iand            
	//*  70  137:ifne            201
	//*  71  140:aload_0         
	//*  72  141:getfield        #110 <Field HttpURLConnection connection>
	//*  73  144:invokestatic    #474 <Method long getContentLength(HttpURLConnection)>
	//*  74  147:lstore          5
	//*  75  149:aload_1         
	//*  76  150:getfield        #249 <Field long DataSpec.length>
	//*  77  153:lstore          7
	//*  78  155:ldc2w           #163 <Long -1L>
	//*  79  158:lstore_3        
	//*  80  159:lload           7
	//*  81  161:ldc2w           #163 <Long -1L>
	//*  82  164:lcmp            
	//*  83  165:ifeq            176
	//*  84  168:aload_1         
	//*  85  169:getfield        #249 <Field long DataSpec.length>
	//*  86  172:lstore_3        
	//*  87  173:goto            193
	//*  88  176:lload           5
	//*  89  178:ldc2w           #163 <Long -1L>
	//*  90  181:lcmp            
	//*  91  182:ifeq            193
	//*  92  185:lload           5
	//*  93  187:aload_0         
	//*  94  188:getfield        #385 <Field long bytesToSkip>
	//*  95  191:lsub            
	//*  96  192:lstore_3        
	//*  97  193:aload_0         
	//*  98  194:lload_3         
	//*  99  195:putfield        #370 <Field long bytesToRead>
	//* 100  198:goto            209
	//* 101  201:aload_0         
	//* 102  202:aload_1         
	//* 103  203:getfield        #249 <Field long DataSpec.length>
	//* 104  206:putfield        #370 <Field long bytesToRead>
	//* 105  209:aload_0         
	//* 106  210:aload_0         
	//* 107  211:getfield        #110 <Field HttpURLConnection connection>
	//* 108  214:invokevirtual   #478 <Method InputStream HttpURLConnection.getInputStream()>
	//* 109  217:putfield        #363 <Field InputStream inputStream>
	//* 110  220:aload_0         
	//* 111  221:iconst_1        
	//* 112  222:putfield        #438 <Field boolean opened>
	//* 113  225:aload_0         
	//* 114  226:getfield        #93  <Field TransferListener listener>
	//* 115  229:astore_1        
	//* 116  230:aload_1         
	//* 117  231:ifnull          240
	//* 118  234:aload_1         
	//* 119  235:invokeinterface #481 <Method void TransferListener.onTransferStart()>
	//* 120  240:aload_0         
	//* 121  241:getfield        #370 <Field long bytesToRead>
	//* 122  244:lreturn         
	//* 123  245:astore          9
	//* 124  247:aload_0         
	//* 125  248:invokespecial   #436 <Method void closeConnectionQuietly()>
	//* 126  251:new             #420 <Class HttpDataSource$HttpDataSourceException>
	//* 127  254:dup             
	//* 128  255:aload           9
	//* 129  257:aload_1         
	//* 130  258:iconst_1        
	//* 131  259:invokespecial   #434 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//* 132  262:athrow          
	//* 133  263:aload_0         
	//* 134  264:getfield        #110 <Field HttpURLConnection connection>
	//* 135  267:invokevirtual   #448 <Method Map HttpURLConnection.getHeaderFields()>
	//* 136  270:astore          9
	//* 137  272:aload_0         
	//* 138  273:invokespecial   #436 <Method void closeConnectionQuietly()>
	//* 139  276:new             #483 <Class HttpDataSource$InvalidResponseCodeException>
	//* 140  279:dup             
	//* 141  280:iload_2         
	//* 142  281:aload           9
	//* 143  283:aload_1         
	//* 144  284:invokespecial   #486 <Method void HttpDataSource$InvalidResponseCodeException(int, Map, DataSpec)>
	//* 145  287:athrow          
	//* 146  288:astore          9
	//* 147  290:aload_0         
	//* 148  291:invokespecial   #436 <Method void closeConnectionQuietly()>
	//* 149  294:new             #146 <Class StringBuilder>
	//* 150  297:dup             
	//* 151  298:invokespecial   #147 <Method void StringBuilder()>
	//* 152  301:astore          10
	//* 153  303:aload           10
	//* 154  305:ldc2            #488 <String "Unable to connect to ">
	//* 155  308:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 156  311:pop             
	//* 157  312:aload           10
	//* 158  314:aload_1         
	//* 159  315:getfield        #235 <Field Uri DataSpec.uri>
	//* 160  318:invokevirtual   #238 <Method String Uri.toString()>
	//* 161  321:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 162  324:pop             
	//* 163  325:new             #420 <Class HttpDataSource$HttpDataSourceException>
	//* 164  328:dup             
	//* 165  329:aload           10
	//* 166  331:invokevirtual   #159 <Method String StringBuilder.toString()>
	//* 167  334:aload           9
	//* 168  336:aload_1         
	//* 169  337:iconst_1        
	//* 170  338:invokespecial   #491 <Method void HttpDataSource$HttpDataSourceException(String, IOException, DataSpec, int)>
	//* 171  341:athrow          
		catch(IOException ioexception2)
	//* 172  342:astore          9
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  173  344:new             #146 <Class StringBuilder>
	//  174  347:dup             
	//  175  348:invokespecial   #147 <Method void StringBuilder()>
	//  176  351:astore          10
			stringbuilder1.append("Unable to connect to ");
	//  177  353:aload           10
	//  178  355:ldc2            #488 <String "Unable to connect to ">
	//  179  358:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  180  361:pop             
			stringbuilder1.append(dataspec.uri.toString());
	//  181  362:aload           10
	//  182  364:aload_1         
	//  183  365:getfield        #235 <Field Uri DataSpec.uri>
	//  184  368:invokevirtual   #238 <Method String Uri.toString()>
	//  185  371:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  186  374:pop             
			throw new HttpDataSource.HttpDataSourceException(stringbuilder1.toString(), ioexception2, dataspec, 1);
	//  187  375:new             #420 <Class HttpDataSource$HttpDataSourceException>
	//  188  378:dup             
	//  189  379:aload           10
	//  190  381:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  191  384:aload           9
	//  192  386:aload_1         
	//  193  387:iconst_1        
	//  194  388:invokespecial   #491 <Method void HttpDataSource$HttpDataSourceException(String, IOException, DataSpec, int)>
	//  195  391:athrow          
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
			Predicate predicate = contentTypePredicate;
			if(predicate != null && !predicate.evaluate(((Object) (s))))
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
			if((dataspec.flags & 1) == 0)
			{
				long l3 = getContentLength(connection);
				long l4 = dataspec.length;
				long l1 = -1L;
				if(l4 != -1L)
					l1 = dataspec.length;
				else
				if(l3 != -1L)
					l1 = l3 - bytesToSkip;
				bytesToRead = l1;
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
			dataspec = ((DataSpec) (listener));
			if(dataspec != null)
				((TransferListener) (dataspec)).onTransferStart();
			return bytesToRead;
		} else
		{
			Map map = connection.getHeaderFields();
			closeConnectionQuietly();
			throw new HttpDataSource.InvalidResponseCodeException(i, map, dataspec);
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws HttpDataSource.HttpDataSourceException
	{
		try
		{
			skipInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #493 <Method void skipInternal()>
			i = readInternal(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #495 <Method int readInternal(byte[], int, int)>
	//    7   11:istore_2        
		}
	//*   8   12:iload_2         
	//*   9   13:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   14:astore_1        
		{
			throw new HttpDataSource.HttpDataSourceException(((IOException) (abyte0)), dataSpec, 2);
	//   11   15:new             #420 <Class HttpDataSource$HttpDataSourceException>
	//   12   18:dup             
	//   13   19:aload_1         
	//   14   20:aload_0         
	//   15   21:getfield        #431 <Field DataSpec dataSpec>
	//   16   24:iconst_2        
	//   17   25:invokespecial   #434 <Method void HttpDataSource$HttpDataSourceException(IOException, DataSpec, int)>
	//   18   28:athrow          
		}
		return i;
	}

	public void setRequestProperty(String s, String s1)
	{
		Assertions.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #415 <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		Assertions.checkNotNull(((Object) (s1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #415 <Method Object Assertions.checkNotNull(Object)>
	//    5    9:pop             
		synchronized(requestProperties)
	//*   6   10:aload_0         
	//*   7   11:getfield        #98  <Field HashMap requestProperties>
	//*   8   14:astore_3        
	//*   9   15:aload_3         
	//*  10   16:monitorenter    
		{
			requestProperties.put(((Object) (s)), ((Object) (s1)));
	//   11   17:aload_0         
	//   12   18:getfield        #98  <Field HashMap requestProperties>
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #499 <Method Object HashMap.put(Object, Object)>
	//   16   26:pop             
		}
	//   17   27:aload_3         
	//   18   28:monitorexit     
		return;
	//   19   29:return          
		s;
	//   20   30:astore_1        
		hashmap;
	//   21   31:aload_3         
		JVM INSTR monitorexit ;
	//   22   32:monitorexit     
		throw s;
	//   23   33:aload_1         
	//   24   34:athrow          
	}

	private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
	public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
	public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
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
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private final int readTimeoutMillis;
	private final HashMap requestProperties;
	private final String userAgent;

	static 
	{
	//    0    0:ldc1            #50  <String "^bytes (\\d+)-(\\d+)/(\\d+)$">
	//    1    2:invokestatic    #56  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #58  <Field Pattern CONTENT_RANGE_HEADER>
	//    3    8:new             #60  <Class AtomicReference>
	//    4   11:dup             
	//    5   12:invokespecial   #63  <Method void AtomicReference()>
	//    6   15:putstatic       #65  <Field AtomicReference skipBufferReference>
	//*   7   18:return          
	}
}

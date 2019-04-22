// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//			WorkQueue, ImageRequest, Utility, UrlRedirectCache, 
//			ImageResponseCache, ImageResponse

public class ImageDownloader
{
	private static class CacheReadWorkItem
		implements Runnable
	{

		public void run()
		{
			ImageDownloader.readFromCache(key, context, allowCachedRedirects);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ImageDownloader$RequestKey key>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field Context context>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field boolean allowCachedRedirects>
		//    6   12:invokestatic    #32  <Method void ImageDownloader.access$100(ImageDownloader$RequestKey, Context, boolean)>
		//    7   15:return          
		}

		private boolean allowCachedRedirects;
		private Context context;
		private RequestKey key;

		CacheReadWorkItem(Context context1, RequestKey requestkey, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			context = context1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Context context>
			key = requestkey;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field ImageDownloader$RequestKey key>
			allowCachedRedirects = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field boolean allowCachedRedirects>
		//   11   19:return          
		}
	}

	private static class DownloadImageWorkItem
		implements Runnable
	{

		public void run()
		{
			ImageDownloader.download(key, context);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field ImageDownloader$RequestKey key>
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field Context context>
		//    4    8:invokestatic    #28  <Method void ImageDownloader.access$200(ImageDownloader$RequestKey, Context)>
		//    5   11:return          
		}

		private Context context;
		private RequestKey key;

		DownloadImageWorkItem(Context context1, RequestKey requestkey)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			context = context1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Context context>
			key = requestkey;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field ImageDownloader$RequestKey key>
		//    8   14:return          
		}
	}

	private static class DownloaderContext
	{

		boolean isCancelled;
		ImageRequest request;
		WorkQueue.WorkItem workItem;

		private DownloaderContext()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class RequestKey
	{

		public boolean equals(Object obj)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			boolean flag = flag1;
		//    2    2:iload_3         
		//    3    3:istore_2        
			if(obj != null)
		//*   4    4:aload_1         
		//*   5    5:ifnull          50
			{
				flag = flag1;
		//    6    8:iload_3         
		//    7    9:istore_2        
				if(obj instanceof RequestKey)
		//*   8   10:aload_1         
		//*   9   11:instanceof      #2   <Class ImageDownloader$RequestKey>
		//*  10   14:ifeq            50
				{
					obj = ((Object) ((RequestKey)obj));
		//   11   17:aload_1         
		//   12   18:checkcast       #2   <Class ImageDownloader$RequestKey>
		//   13   21:astore_1        
					flag = flag1;
		//   14   22:iload_3         
		//   15   23:istore_2        
					if(((RequestKey) (obj)).uri == uri)
		//*  16   24:aload_1         
		//*  17   25:getfield        #18  <Field Uri uri>
		//*  18   28:aload_0         
		//*  19   29:getfield        #18  <Field Uri uri>
		//*  20   32:if_acmpne       50
					{
						flag = flag1;
		//   21   35:iload_3         
		//   22   36:istore_2        
						if(((RequestKey) (obj)).tag == tag)
		//*  23   37:aload_1         
		//*  24   38:getfield        #20  <Field Object tag>
		//*  25   41:aload_0         
		//*  26   42:getfield        #20  <Field Object tag>
		//*  27   45:if_acmpne       50
							flag = true;
		//   28   48:iconst_1        
		//   29   49:istore_2        
					}
				}
			}
			return flag;
		//   30   50:iload_2         
		//   31   51:ireturn         
		}

		public int hashCode()
		{
			return (1073 + uri.hashCode()) * 37 + tag.hashCode();
		//    0    0:sipush          1073
		//    1    3:aload_0         
		//    2    4:getfield        #18  <Field Uri uri>
		//    3    7:invokevirtual   #29  <Method int Uri.hashCode()>
		//    4   10:iadd            
		//    5   11:bipush          37
		//    6   13:imul            
		//    7   14:aload_0         
		//    8   15:getfield        #20  <Field Object tag>
		//    9   18:invokevirtual   #30  <Method int Object.hashCode()>
		//   10   21:iadd            
		//   11   22:ireturn         
		}

		Object tag;
		Uri uri;

		RequestKey(Uri uri1, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			uri = uri1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Uri uri>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Object tag>
		//    8   14:return          
		}
	}


	public static boolean cancelRequest(ImageRequest imagerequest)
	{
		RequestKey requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
	//    0    0:new             #17  <Class ImageDownloader$RequestKey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #64  <Method Uri ImageRequest.getImageUri()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #68  <Method Object ImageRequest.getCallerTag()>
	//    6   12:invokespecial   #71  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//    7   15:astore_2        
		imagerequest = ((ImageRequest) (pendingRequests));
	//    8   16:getstatic       #45  <Field Map pendingRequests>
	//    9   19:astore_0        
		imagerequest;
	//   10   20:aload_0         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(((Object) (requestkey)));
	//   12   22:getstatic       #45  <Field Map pendingRequests>
	//   13   25:aload_2         
	//   14   26:invokeinterface #77  <Method Object Map.get(Object)>
	//   15   31:checkcast       #14  <Class ImageDownloader$DownloaderContext>
	//   16   34:astore_3        
		boolean flag = true;
	//   17   35:iconst_1        
	//   18   36:istore_1        
		if(downloadercontext == null) goto _L2; else goto _L1
	//   19   37:aload_3         
	//   20   38:ifnull          83
_L1:
		if(downloadercontext.workItem.cancel())
	//*  21   41:aload_3         
	//*  22   42:getfield        #81  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
	//*  23   45:invokeinterface #87  <Method boolean WorkQueue$WorkItem.cancel()>
	//*  24   50:ifeq            66
		{
			pendingRequests.remove(((Object) (requestkey)));
	//   25   53:getstatic       #45  <Field Map pendingRequests>
	//   26   56:aload_2         
	//   27   57:invokeinterface #90  <Method Object Map.remove(Object)>
	//   28   62:pop             
			break MISSING_BLOCK_LABEL_74;
	//   29   63:goto            74
		}
		downloadercontext.isCancelled = true;
	//   30   66:aload_3         
	//   31   67:iconst_1        
	//   32   68:putfield        #94  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//*  33   71:goto            74
_L4:
		imagerequest;
	//   34   74:aload_0         
		JVM INSTR monitorexit ;
	//   35   75:monitorexit     
		return flag;
	//   36   76:iload_1         
	//   37   77:ireturn         
		Exception exception;
		exception;
	//   38   78:astore_2        
		imagerequest;
	//   39   79:aload_0         
		JVM INSTR monitorexit ;
	//   40   80:monitorexit     
		throw exception;
	//   41   81:aload_2         
	//   42   82:athrow          
_L2:
		flag = false;
	//   43   83:iconst_0        
	//   44   84:istore_1        
		if(true) goto _L4; else goto _L3
	//   45   85:goto            74
_L3:
	}

	private static void download(RequestKey requestkey, Context context)
	{
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj3;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		flag1 = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		flag = true;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		Object obj2 = ((Object) ((HttpURLConnection)URLConnectionInstrumentation.openConnection((new URL(requestkey.uri.toString())).openConnection())));
	//    8   10:new             #98  <Class URL>
	//    9   13:dup             
	//   10   14:aload_0         
	//   11   15:getfield        #102 <Field Uri ImageDownloader$RequestKey.uri>
	//   12   18:invokevirtual   #108 <Method String Uri.toString()>
	//   13   21:invokespecial   #111 <Method void URL(String)>
	//   14   24:invokevirtual   #115 <Method java.net.URLConnection URL.openConnection()>
	//   15   27:invokestatic    #120 <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//   16   30:checkcast       #122 <Class HttpURLConnection>
	//   17   33:astore          7
		int i;
		((HttpURLConnection) (obj2)).setInstanceFollowRedirects(false);
	//   18   35:aload           7
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #126 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		i = ((HttpURLConnection) (obj2)).getResponseCode();
	//   21   41:aload           7
	//   22   43:invokevirtual   #130 <Method int HttpURLConnection.getResponseCode()>
	//   23   46:istore          4
		if(i == 200) goto _L2; else goto _L1
	//   24   48:iload           4
	//   25   50:sipush          200
	//   26   53:icmpeq          348
_L1:
		i;
	//   27   56:iload           4
		JVM INSTR tableswitch 301 302: default 467
	//	               301 256
	//	               302 256;
	//   28   58:tableswitch     301 302: default 467
	//	               301 256
	//	               302 256
		   goto _L3 _L4 _L4
_L3:
		Object obj1 = ((Object) (((HttpURLConnection) (obj2)).getErrorStream()));
	//   29   80:aload           7
	//   30   82:invokevirtual   #134 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   31   85:astore          6
		context = ((Context) (obj1));
	//   32   87:aload           6
	//   33   89:astore_1        
		obj = obj1;
	//   34   90:aload           6
	//   35   92:astore          5
		obj3 = ((Object) (new StringBuilder()));
	//   36   94:new             #136 <Class StringBuilder>
	//   37   97:dup             
	//   38   98:invokespecial   #137 <Method void StringBuilder()>
	//   39  101:astore          8
		if(obj1 == null) goto _L6; else goto _L5
	//   40  103:aload           6
	//   41  105:ifnull          201
_L5:
		context = ((Context) (obj1));
	//   42  108:aload           6
	//   43  110:astore_1        
		obj = obj1;
	//   44  111:aload           6
	//   45  113:astore          5
		Object obj4 = ((Object) (new InputStreamReader(((java.io.InputStream) (obj1)))));
	//   46  115:new             #139 <Class InputStreamReader>
	//   47  118:dup             
	//   48  119:aload           6
	//   49  121:invokespecial   #142 <Method void InputStreamReader(java.io.InputStream)>
	//   50  124:astore          9
		context = ((Context) (obj1));
	//   51  126:aload           6
	//   52  128:astore_1        
		obj = obj1;
	//   53  129:aload           6
	//   54  131:astore          5
		char ac[] = new char[128];
	//   55  133:sipush          128
	//   56  136:newarray        char[]
	//   57  138:astore          10
_L8:
		context = ((Context) (obj1));
	//   58  140:aload           6
	//   59  142:astore_1        
		obj = obj1;
	//   60  143:aload           6
	//   61  145:astore          5
		i = ((InputStreamReader) (obj4)).read(ac, 0, ac.length);
	//   62  147:aload           9
	//   63  149:aload           10
	//   64  151:iconst_0        
	//   65  152:aload           10
	//   66  154:arraylength     
	//   67  155:invokevirtual   #146 <Method int InputStreamReader.read(char[], int, int)>
	//   68  158:istore          4
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   69  160:iload           4
	//   70  162:ifle            186
		context = ((Context) (obj1));
	//   71  165:aload           6
	//   72  167:astore_1        
		obj = obj1;
	//   73  168:aload           6
	//   74  170:astore          5
		((StringBuilder) (obj3)).append(ac, 0, i);
	//   75  172:aload           8
	//   76  174:aload           10
	//   77  176:iconst_0        
	//   78  177:iload           4
	//   79  179:invokevirtual   #150 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   80  182:pop             
		if(true) goto _L8; else goto _L7
	//   81  183:goto            140
_L7:
		context = ((Context) (obj1));
	//   82  186:aload           6
	//   83  188:astore_1        
		obj = obj1;
	//   84  189:aload           6
	//   85  191:astore          5
		Utility.closeQuietly(((java.io.Closeable) (obj4)));
	//   86  193:aload           9
	//   87  195:invokestatic    #156 <Method void Utility.closeQuietly(java.io.Closeable)>
		  goto _L9
	//*  88  198:goto            216
_L6:
		context = ((Context) (obj1));
	//   89  201:aload           6
	//   90  203:astore_1        
		obj = obj1;
	//   91  204:aload           6
	//   92  206:astore          5
		((StringBuilder) (obj3)).append("Unexpected error while downloading an image.");
	//   93  208:aload           8
	//   94  210:ldc1            #158 <String "Unexpected error while downloading an image.">
	//   95  212:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   96  215:pop             
_L9:
		context = ((Context) (obj1));
	//   97  216:aload           6
	//   98  218:astore_1        
		obj = obj1;
	//   99  219:aload           6
	//  100  221:astore          5
		obj3 = ((Object) (new FacebookException(((StringBuilder) (obj3)).toString())));
	//  101  223:new             #163 <Class FacebookException>
	//  102  226:dup             
	//  103  227:aload           8
	//  104  229:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  105  232:invokespecial   #165 <Method void FacebookException(String)>
	//  106  235:astore          8
		context = null;
	//  107  237:aconst_null     
	//  108  238:astore_1        
		obj = obj3;
	//  109  239:aload           8
	//  110  241:astore          5
		  goto _L10
	//* 111  243:goto            377
		requestkey;
	//  112  246:astore_0        
		  goto _L11
	//* 113  247:goto            416
		context;
	//  114  250:astore_1        
		flag = flag1;
	//  115  251:iload_3         
	//  116  252:istore_2        
		  goto _L12
	//* 117  253:goto            437
_L4:
		context = ((Context) (((HttpURLConnection) (obj2)).getHeaderField("location")));
	//  118  256:aload           7
	//  119  258:ldc1            #167 <String "location">
	//  120  260:invokevirtual   #171 <Method String HttpURLConnection.getHeaderField(String)>
	//  121  263:astore_1        
		if(Utility.isNullOrEmpty(((String) (context))))
			break MISSING_BLOCK_LABEL_324;
	//  122  264:aload_1         
	//  123  265:invokestatic    #175 <Method boolean Utility.isNullOrEmpty(String)>
	//  124  268:ifne            324
		context = ((Context) (Uri.parse(((String) (context)))));
	//  125  271:aload_1         
	//  126  272:invokestatic    #179 <Method Uri Uri.parse(String)>
	//  127  275:astore_1        
		UrlRedirectCache.cacheUriRedirect(requestkey.uri, ((Uri) (context)));
	//  128  276:aload_0         
	//  129  277:getfield        #102 <Field Uri ImageDownloader$RequestKey.uri>
	//  130  280:aload_1         
	//  131  281:invokestatic    #185 <Method void UrlRedirectCache.cacheUriRedirect(Uri, Uri)>
		obj1 = ((Object) (removePendingRequest(requestkey)));
	//  132  284:aload_0         
	//  133  285:invokestatic    #189 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//  134  288:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_324;
	//  135  290:aload           6
	//  136  292:ifnull          324
		if(!((DownloaderContext) (obj1)).isCancelled)
	//* 137  295:aload           6
	//* 138  297:getfield        #94  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//* 139  300:ifne            324
			enqueueCacheRead(((DownloaderContext) (obj1)).request, new RequestKey(((Uri) (context)), requestkey.tag), false);
	//  140  303:aload           6
	//  141  305:getfield        #193 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//  142  308:new             #17  <Class ImageDownloader$RequestKey>
	//  143  311:dup             
	//  144  312:aload_1         
	//  145  313:aload_0         
	//  146  314:getfield        #197 <Field Object ImageDownloader$RequestKey.tag>
	//  147  317:invokespecial   #71  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//  148  320:iconst_0        
	//  149  321:invokestatic    #201 <Method void enqueueCacheRead(ImageRequest, ImageDownloader$RequestKey, boolean)>
		obj1 = null;
	//  150  324:aconst_null     
	//  151  325:astore          6
		context = ((Context) (obj1));
	//  152  327:aload           6
	//  153  329:astore_1        
		flag = false;
	//  154  330:iconst_0        
	//  155  331:istore_2        
		obj = obj3;
	//  156  332:aload           8
	//  157  334:astore          5
		  goto _L10
	//* 158  336:goto            377
		context;
	//  159  339:astore_1        
		obj = null;
	//  160  340:aconst_null     
	//  161  341:astore          5
		flag = false;
	//  162  343:iconst_0        
	//  163  344:istore_2        
		  goto _L12
	//* 164  345:goto            437
_L2:
		obj1 = ((Object) (ImageResponseCache.interceptAndCacheImageStream(context, ((HttpURLConnection) (obj2)))));
	//  165  348:aload_1         
	//  166  349:aload           7
	//  167  351:invokestatic    #207 <Method java.io.InputStream ImageResponseCache.interceptAndCacheImageStream(Context, HttpURLConnection)>
	//  168  354:astore          6
		context = ((Context) (obj1));
	//  169  356:aload           6
	//  170  358:astore_1        
		obj = obj1;
	//  171  359:aload           6
	//  172  361:astore          5
		obj4 = ((Object) (BitmapFactoryInstrumentation.decodeStream(((java.io.InputStream) (obj1)))));
	//  173  363:aload           6
	//  174  365:invokestatic    #213 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(java.io.InputStream)>
	//  175  368:astore          9
		context = ((Context) (obj4));
	//  176  370:aload           9
	//  177  372:astore_1        
		obj = obj3;
	//  178  373:aload           8
	//  179  375:astore          5
_L10:
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//  180  377:aload           6
	//  181  379:invokestatic    #156 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  182  382:aload           7
	//  183  384:invokestatic    #217 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		obj1 = ((Object) (context));
	//  184  387:aload_1         
	//  185  388:astore          6
		  goto _L13
	//* 186  390:goto            453
		requestkey;
	//  187  393:astore_0        
		context = ((Context) (obj));
	//  188  394:aload           5
	//  189  396:astore_1        
		  goto _L11
	//* 190  397:goto            416
		context;
	//  191  400:astore_1        
		obj = null;
	//  192  401:aconst_null     
	//  193  402:astore          5
		flag = flag1;
	//  194  404:iload_3         
	//  195  405:istore_2        
		  goto _L12
	//* 196  406:goto            437
		requestkey;
	//  197  409:astore_0        
		obj2 = null;
	//  198  410:aconst_null     
	//  199  411:astore          7
		context = ((Context) (obj));
	//  200  413:aload           5
	//  201  415:astore_1        
_L11:
		Utility.closeQuietly(((java.io.Closeable) (context)));
	//  202  416:aload_1         
	//  203  417:invokestatic    #156 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  204  420:aload           7
	//  205  422:invokestatic    #217 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		throw requestkey;
	//  206  425:aload_0         
	//  207  426:athrow          
		context;
	//  208  427:astore_1        
		obj = null;
	//  209  428:aconst_null     
	//  210  429:astore          5
		obj2 = obj;
	//  211  431:aload           5
	//  212  433:astore          7
		flag = flag1;
	//  213  435:iload_3         
	//  214  436:istore_2        
_L12:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//  215  437:aload           5
	//  216  439:invokestatic    #156 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  217  442:aload           7
	//  218  444:invokestatic    #217 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		obj1 = null;
	//  219  447:aconst_null     
	//  220  448:astore          6
		obj = ((Object) (context));
	//  221  450:aload_1         
	//  222  451:astore          5
_L13:
		if(flag)
	//* 223  453:iload_2         
	//* 224  454:ifeq            466
			issueResponse(requestkey, ((Exception) (obj)), ((Bitmap) (obj1)), false);
	//  225  457:aload_0         
	//  226  458:aload           5
	//  227  460:aload           6
	//  228  462:iconst_0        
	//  229  463:invokestatic    #221 <Method void issueResponse(ImageDownloader$RequestKey, Exception, Bitmap, boolean)>
		return;
	//  230  466:return          
	//* 231  467:goto            80
	}

	public static void downloadAsync(ImageRequest imagerequest)
	{
		RequestKey requestkey;
		if(imagerequest == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
	//    3    5:new             #17  <Class ImageDownloader$RequestKey>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #64  <Method Uri ImageRequest.getImageUri()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #68  <Method Object ImageRequest.getCallerTag()>
	//    9   17:invokespecial   #71  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//   10   20:astore_2        
		Map map = pendingRequests;
	//   11   21:getstatic       #45  <Field Map pendingRequests>
	//   12   24:astore_1        
		map;
	//   13   25:aload_1         
		JVM INSTR monitorenter ;
	//   14   26:monitorenter    
		DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(((Object) (requestkey)));
	//   15   27:getstatic       #45  <Field Map pendingRequests>
	//   16   30:aload_2         
	//   17   31:invokeinterface #77  <Method Object Map.get(Object)>
	//   18   36:checkcast       #14  <Class ImageDownloader$DownloaderContext>
	//   19   39:astore_3        
		if(downloadercontext == null)
			break MISSING_BLOCK_LABEL_66;
	//   20   40:aload_3         
	//   21   41:ifnull          66
		downloadercontext.request = imagerequest;
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:putfield        #193 <Field ImageRequest ImageDownloader$DownloaderContext.request>
		downloadercontext.isCancelled = false;
	//   25   49:aload_3         
	//   26   50:iconst_0        
	//   27   51:putfield        #94  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
		downloadercontext.workItem.moveToFront();
	//   28   54:aload_3         
	//   29   55:getfield        #81  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
	//   30   58:invokeinterface #226 <Method void WorkQueue$WorkItem.moveToFront()>
		break MISSING_BLOCK_LABEL_75;
	//   31   63:goto            75
		enqueueCacheRead(imagerequest, requestkey, imagerequest.isCachedRedirectAllowed());
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #229 <Method boolean ImageRequest.isCachedRedirectAllowed()>
	//   36   72:invokestatic    #201 <Method void enqueueCacheRead(ImageRequest, ImageDownloader$RequestKey, boolean)>
		map;
	//   37   75:aload_1         
		JVM INSTR monitorexit ;
	//   38   76:monitorexit     
		return;
	//   39   77:return          
		imagerequest;
	//   40   78:astore_0        
		map;
	//   41   79:aload_1         
		JVM INSTR monitorexit ;
	//   42   80:monitorexit     
		throw imagerequest;
	//   43   81:aload_0         
	//   44   82:athrow          
	}

	private static void enqueueCacheRead(ImageRequest imagerequest, RequestKey requestkey, boolean flag)
	{
		enqueueRequest(imagerequest, requestkey, cacheReadQueue, ((Runnable) (new CacheReadWorkItem(imagerequest.getContext(), requestkey, flag))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #39  <Field WorkQueue cacheReadQueue>
	//    3    5:new             #8   <Class ImageDownloader$CacheReadWorkItem>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #233 <Method Context ImageRequest.getContext()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokespecial   #236 <Method void ImageDownloader$CacheReadWorkItem(Context, ImageDownloader$RequestKey, boolean)>
	//   10   18:invokestatic    #240 <Method void enqueueRequest(ImageRequest, ImageDownloader$RequestKey, WorkQueue, Runnable)>
	//   11   21:return          
	}

	private static void enqueueDownload(ImageRequest imagerequest, RequestKey requestkey)
	{
		enqueueRequest(imagerequest, requestkey, downloadQueue, ((Runnable) (new DownloadImageWorkItem(imagerequest.getContext(), requestkey))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #37  <Field WorkQueue downloadQueue>
	//    3    5:new             #11  <Class ImageDownloader$DownloadImageWorkItem>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #233 <Method Context ImageRequest.getContext()>
	//    7   13:aload_1         
	//    8   14:invokespecial   #245 <Method void ImageDownloader$DownloadImageWorkItem(Context, ImageDownloader$RequestKey)>
	//    9   17:invokestatic    #240 <Method void enqueueRequest(ImageRequest, ImageDownloader$RequestKey, WorkQueue, Runnable)>
	//   10   20:return          
	}

	private static void enqueueRequest(ImageRequest imagerequest, RequestKey requestkey, WorkQueue workqueue, Runnable runnable)
	{
		synchronized(pendingRequests)
	//*   0    0:getstatic       #45  <Field Map pendingRequests>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			DownloaderContext downloadercontext = new DownloaderContext();
	//    4    8:new             #14  <Class ImageDownloader$DownloaderContext>
	//    5   11:dup             
	//    6   12:aconst_null     
	//    7   13:invokespecial   #248 <Method void ImageDownloader$DownloaderContext(ImageDownloader$1)>
	//    8   16:astore          5
			downloadercontext.request = imagerequest;
	//    9   18:aload           5
	//   10   20:aload_0         
	//   11   21:putfield        #193 <Field ImageRequest ImageDownloader$DownloaderContext.request>
			pendingRequests.put(((Object) (requestkey)), ((Object) (downloadercontext)));
	//   12   24:getstatic       #45  <Field Map pendingRequests>
	//   13   27:aload_1         
	//   14   28:aload           5
	//   15   30:invokeinterface #252 <Method Object Map.put(Object, Object)>
	//   16   35:pop             
			downloadercontext.workItem = workqueue.addActiveWorkItem(runnable);
	//   17   36:aload           5
	//   18   38:aload_2         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #256 <Method WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   21   43:putfield        #81  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
		}
	//   22   46:aload           4
	//   23   48:monitorexit     
		return;
	//   24   49:return          
		imagerequest;
	//   25   50:astore_0        
		map;
	//   26   51:aload           4
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		throw imagerequest;
	//   28   54:aload_0         
	//   29   55:athrow          
	}

	private static Handler getHandler()
	{
		com/facebook/internal/ImageDownloader;
	//    0    0:ldc1            #2   <Class ImageDownloader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Handler handler1;
		if(handler == null)
	//*   2    3:getstatic       #260 <Field Handler handler>
	//*   3    6:ifnonnull       22
			handler = new Handler(Looper.getMainLooper());
	//    4    9:new             #262 <Class Handler>
	//    5   12:dup             
	//    6   13:invokestatic    #268 <Method Looper Looper.getMainLooper()>
	//    7   16:invokespecial   #271 <Method void Handler(Looper)>
	//    8   19:putstatic       #260 <Field Handler handler>
		handler1 = handler;
	//    9   22:getstatic       #260 <Field Handler handler>
	//   10   25:astore_0        
		com/facebook/internal/ImageDownloader;
	//   11   26:ldc1            #2   <Class ImageDownloader>
		JVM INSTR monitorexit ;
	//   12   28:monitorexit     
		return handler1;
	//   13   29:aload_0         
	//   14   30:areturn         
		Exception exception;
		exception;
	//   15   31:astore_0        
	//*  16   32:ldc1            #2   <Class ImageDownloader>
		throw exception;
	//   17   34:monitorexit     
	//   18   35:aload_0         
	//   19   36:athrow          
	}

	private static void issueResponse(RequestKey requestkey, Exception exception, Bitmap bitmap, boolean flag)
	{
		requestkey = ((RequestKey) (removePendingRequest(requestkey)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #189 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//    2    4:astore_0        
		if(requestkey != null && !((DownloaderContext) (requestkey)).isCancelled)
	//*   3    5:aload_0         
	//*   4    6:ifnull          52
	//*   5    9:aload_0         
	//*   6   10:getfield        #94  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//*   7   13:ifne            52
		{
			requestkey = ((RequestKey) (((DownloaderContext) (requestkey)).request));
	//    8   16:aload_0         
	//    9   17:getfield        #193 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//   10   20:astore_0        
			ImageRequest.Callback callback = ((ImageRequest) (requestkey)).getCallback();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #275 <Method ImageRequest$Callback ImageRequest.getCallback()>
	//   13   25:astore          4
			if(callback != null)
	//*  14   27:aload           4
	//*  15   29:ifnull          52
				getHandler().post(new Runnable(((ImageRequest) (requestkey)), exception, flag, bitmap, callback) {

					public void run()
					{
						ImageResponse imageresponse = new ImageResponse(request, error, isCachedRedirect, bitmap);
					//    0    0:new             #40  <Class ImageResponse>
					//    1    3:dup             
					//    2    4:aload_0         
					//    3    5:getfield        #25  <Field ImageRequest val$request>
					//    4    8:aload_0         
					//    5    9:getfield        #27  <Field Exception val$error>
					//    6   12:aload_0         
					//    7   13:getfield        #29  <Field boolean val$isCachedRedirect>
					//    8   16:aload_0         
					//    9   17:getfield        #31  <Field Bitmap val$bitmap>
					//   10   20:invokespecial   #43  <Method void ImageResponse(ImageRequest, Exception, boolean, Bitmap)>
					//   11   23:astore_1        
						callback.onCompleted(imageresponse);
					//   12   24:aload_0         
					//   13   25:getfield        #33  <Field ImageRequest$Callback val$callback>
					//   14   28:aload_1         
					//   15   29:invokeinterface #49  <Method void ImageRequest$Callback.onCompleted(ImageResponse)>
					//   16   34:return          
					}

					final Bitmap val$bitmap;
					final ImageRequest.Callback val$callback;
					final Exception val$error;
					final boolean val$isCachedRedirect;
					final ImageRequest val$request;

			
			{
				request = imagerequest;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field ImageRequest val$request>
				error = exception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Exception val$error>
				isCachedRedirect = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field boolean val$isCachedRedirect>
				bitmap = bitmap1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field Bitmap val$bitmap>
				callback = callback1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field ImageRequest$Callback val$callback>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
				}
);
	//   16   32:invokestatic    #277 <Method Handler getHandler()>
	//   17   35:new             #6   <Class ImageDownloader$1>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_3         
	//   22   42:aload_2         
	//   23   43:aload           4
	//   24   45:invokespecial   #280 <Method void ImageDownloader$1(ImageRequest, Exception, boolean, Bitmap, ImageRequest$Callback)>
	//   25   48:invokevirtual   #284 <Method boolean Handler.post(Runnable)>
	//   26   51:pop             
		}
	//   27   52:return          
	}

	private static void readFromCache(RequestKey requestkey, Context context, boolean flag)
	{
		Object obj;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			if(flag)
	//*   2    2:iload_2         
	//*   3    3:ifeq            48
			{
				obj = ((Object) (UrlRedirectCache.getRedirectedUri(requestkey.uri)));
	//    4    6:aload_0         
	//    5    7:getfield        #102 <Field Uri ImageDownloader$RequestKey.uri>
	//    6   10:invokestatic    #288 <Method Uri UrlRedirectCache.getRedirectedUri(Uri)>
	//    7   13:astore          4
				if(obj != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          48
				{
					java.io.InputStream inputstream = ImageResponseCache.getCachedImageStream(((Uri) (obj)), context);
	//   10   20:aload           4
	//   11   22:aload_1         
	//   12   23:invokestatic    #292 <Method java.io.InputStream ImageResponseCache.getCachedImageStream(Uri, Context)>
	//   13   26:astore          5
					flag = flag1;
	//   14   28:iload_3         
	//   15   29:istore_2        
					obj = ((Object) (inputstream));
	//   16   30:aload           5
	//   17   32:astore          4
					if(inputstream != null)
	//*  18   34:aload           5
	//*  19   36:ifnull          53
					{
						flag = true;
	//   20   39:iconst_1        
	//   21   40:istore_2        
						obj = ((Object) (inputstream));
	//   22   41:aload           5
	//   23   43:astore          4
					}
					break label0;
	//   24   45:goto            53
				}
			}
			obj = null;
	//   25   48:aconst_null     
	//   26   49:astore          4
			flag = flag1;
	//   27   51:iload_3         
	//   28   52:istore_2        
		}
		if(!flag)
	//*  29   53:iload_2         
	//*  30   54:ifne            67
			obj = ((Object) (ImageResponseCache.getCachedImageStream(requestkey.uri, context)));
	//   31   57:aload_0         
	//   32   58:getfield        #102 <Field Uri ImageDownloader$RequestKey.uri>
	//   33   61:aload_1         
	//   34   62:invokestatic    #292 <Method java.io.InputStream ImageResponseCache.getCachedImageStream(Uri, Context)>
	//   35   65:astore          4
		if(obj != null)
	//*  36   67:aload           4
	//*  37   69:ifnull          91
		{
			context = ((Context) (BitmapFactoryInstrumentation.decodeStream(((java.io.InputStream) (obj)))));
	//   38   72:aload           4
	//   39   74:invokestatic    #213 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(java.io.InputStream)>
	//   40   77:astore_1        
			Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   41   78:aload           4
	//   42   80:invokestatic    #156 <Method void Utility.closeQuietly(java.io.Closeable)>
			issueResponse(requestkey, ((Exception) (null)), ((Bitmap) (context)), flag);
	//   43   83:aload_0         
	//   44   84:aconst_null     
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:invokestatic    #221 <Method void issueResponse(ImageDownloader$RequestKey, Exception, Bitmap, boolean)>
			return;
	//   48   90:return          
		}
		context = ((Context) (removePendingRequest(requestkey)));
	//   49   91:aload_0         
	//   50   92:invokestatic    #189 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//   51   95:astore_1        
		if(context != null && !((DownloaderContext) (context)).isCancelled)
	//*  52   96:aload_1         
	//*  53   97:ifnull          115
	//*  54  100:aload_1         
	//*  55  101:getfield        #94  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//*  56  104:ifne            115
			enqueueDownload(((DownloaderContext) (context)).request, requestkey);
	//   57  107:aload_1         
	//   58  108:getfield        #193 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//   59  111:aload_0         
	//   60  112:invokestatic    #294 <Method void enqueueDownload(ImageRequest, ImageDownloader$RequestKey)>
	//   61  115:return          
	}

	private static DownloaderContext removePendingRequest(RequestKey requestkey)
	{
		synchronized(pendingRequests)
	//*   0    0:getstatic       #45  <Field Map pendingRequests>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			requestkey = ((RequestKey) ((DownloaderContext)pendingRequests.remove(((Object) (requestkey)))));
	//    4    6:getstatic       #45  <Field Map pendingRequests>
	//    5    9:aload_0         
	//    6   10:invokeinterface #90  <Method Object Map.remove(Object)>
	//    7   15:checkcast       #14  <Class ImageDownloader$DownloaderContext>
	//    8   18:astore_0        
		}
	//    9   19:aload_1         
	//   10   20:monitorexit     
		return ((DownloaderContext) (requestkey));
	//   11   21:aload_0         
	//   12   22:areturn         
		requestkey;
	//   13   23:astore_0        
		map;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw requestkey;
	//   16   26:aload_0         
	//   17   27:athrow          
	}

	private static WorkQueue cacheReadQueue = new WorkQueue(2);
	private static WorkQueue downloadQueue = new WorkQueue(8);
	private static Handler handler;
	private static final Map pendingRequests = new HashMap();

	static 
	{
	//    0    0:new             #31  <Class WorkQueue>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:invokespecial   #35  <Method void WorkQueue(int)>
	//    4    9:putstatic       #37  <Field WorkQueue downloadQueue>
	//    5   12:new             #31  <Class WorkQueue>
	//    6   15:dup             
	//    7   16:iconst_2        
	//    8   17:invokespecial   #35  <Method void WorkQueue(int)>
	//    9   20:putstatic       #39  <Field WorkQueue cacheReadQueue>
	//   10   23:new             #41  <Class HashMap>
	//   11   26:dup             
	//   12   27:invokespecial   #43  <Method void HashMap()>
	//   13   30:putstatic       #45  <Field Map pendingRequests>
	//*  14   33:return          
	}


/*
	static void access$100(RequestKey requestkey, Context context, boolean flag)
	{
		readFromCache(requestkey, context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #51  <Method void readFromCache(ImageDownloader$RequestKey, Context, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$200(RequestKey requestkey, Context context)
	{
		download(requestkey, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #56  <Method void download(ImageDownloader$RequestKey, Context)>
		return;
	//    3    5:return          
	}

*/
}

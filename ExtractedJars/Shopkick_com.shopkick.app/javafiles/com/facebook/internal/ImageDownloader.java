// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//			WorkQueue, ImageRequest, ImageResponseCache, UrlRedirectCache, 
//			Utility, ImageResponse

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
		//*  17   25:getfield        #23  <Field Uri uri>
		//*  18   28:aload_0         
		//*  19   29:getfield        #23  <Field Uri uri>
		//*  20   32:if_acmpne       50
					{
						flag = flag1;
		//   21   35:iload_3         
		//   22   36:istore_2        
						if(((RequestKey) (obj)).tag == tag)
		//*  23   37:aload_1         
		//*  24   38:getfield        #25  <Field Object tag>
		//*  25   41:aload_0         
		//*  26   42:getfield        #25  <Field Object tag>
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
		//    2    4:getfield        #23  <Field Uri uri>
		//    3    7:invokevirtual   #34  <Method int Uri.hashCode()>
		//    4   10:iadd            
		//    5   11:bipush          37
		//    6   13:imul            
		//    7   14:aload_0         
		//    8   15:getfield        #25  <Field Object tag>
		//    9   18:invokevirtual   #35  <Method int Object.hashCode()>
		//   10   21:iadd            
		//   11   22:ireturn         
		}

		private static final int HASH_MULTIPLIER = 37;
		private static final int HASH_SEED = 29;
		Object tag;
		Uri uri;

		RequestKey(Uri uri1, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			uri = uri1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Uri uri>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Object tag>
		//    8   14:return          
		}
	}


	public ImageDownloader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static boolean cancelRequest(ImageRequest imagerequest)
	{
		RequestKey requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
	//    0    0:new             #17  <Class ImageDownloader$RequestKey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method Uri ImageRequest.getImageUri()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #73  <Method Object ImageRequest.getCallerTag()>
	//    6   12:invokespecial   #76  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//    7   15:astore_2        
		imagerequest = ((ImageRequest) (pendingRequests));
	//    8   16:getstatic       #49  <Field Map pendingRequests>
	//    9   19:astore_0        
		imagerequest;
	//   10   20:aload_0         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(((Object) (requestkey)));
	//   12   22:getstatic       #49  <Field Map pendingRequests>
	//   13   25:aload_2         
	//   14   26:invokeinterface #82  <Method Object Map.get(Object)>
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
	//*  22   42:getfield        #86  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
	//*  23   45:invokeinterface #92  <Method boolean WorkQueue$WorkItem.cancel()>
	//*  24   50:ifeq            66
		{
			pendingRequests.remove(((Object) (requestkey)));
	//   25   53:getstatic       #49  <Field Map pendingRequests>
	//   26   56:aload_2         
	//   27   57:invokeinterface #95  <Method Object Map.remove(Object)>
	//   28   62:pop             
			break MISSING_BLOCK_LABEL_74;
	//   29   63:goto            74
		}
		downloadercontext.isCancelled = true;
	//   30   66:aload_3         
	//   31   67:iconst_1        
	//   32   68:putfield        #99  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
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

	public static void clearCache(Context context)
	{
		ImageResponseCache.clearCache(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method void ImageResponseCache.clearCache(Context)>
		UrlRedirectCache.clearCache();
	//    2    4:invokestatic    #109 <Method void UrlRedirectCache.clearCache()>
	//    3    7:return          
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
		Object obj2 = ((Object) ((HttpURLConnection)(new URL(requestkey.uri.toString())).openConnection()));
	//    8   10:new             #113 <Class URL>
	//    9   13:dup             
	//   10   14:aload_0         
	//   11   15:getfield        #117 <Field Uri ImageDownloader$RequestKey.uri>
	//   12   18:invokevirtual   #123 <Method String Uri.toString()>
	//   13   21:invokespecial   #126 <Method void URL(String)>
	//   14   24:invokevirtual   #130 <Method java.net.URLConnection URL.openConnection()>
	//   15   27:checkcast       #132 <Class HttpURLConnection>
	//   16   30:astore          7
		int i;
		((HttpURLConnection) (obj2)).setInstanceFollowRedirects(false);
	//   17   32:aload           7
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #136 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		i = ((HttpURLConnection) (obj2)).getResponseCode();
	//   20   38:aload           7
	//   21   40:invokevirtual   #140 <Method int HttpURLConnection.getResponseCode()>
	//   22   43:istore          4
		if(i == 200) goto _L2; else goto _L1
	//   23   45:iload           4
	//   24   47:sipush          200
	//   25   50:icmpeq          344
_L1:
		i;
	//   26   53:iload           4
		JVM INSTR tableswitch 301 302: default 463
	//	               301 252
	//	               302 252;
	//   27   55:tableswitch     301 302: default 463
	//	               301 252
	//	               302 252
		   goto _L3 _L4 _L4
_L3:
		Object obj1 = ((Object) (((HttpURLConnection) (obj2)).getErrorStream()));
	//   28   76:aload           7
	//   29   78:invokevirtual   #144 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   30   81:astore          6
		context = ((Context) (obj1));
	//   31   83:aload           6
	//   32   85:astore_1        
		obj = obj1;
	//   33   86:aload           6
	//   34   88:astore          5
		obj3 = ((Object) (new StringBuilder()));
	//   35   90:new             #146 <Class StringBuilder>
	//   36   93:dup             
	//   37   94:invokespecial   #147 <Method void StringBuilder()>
	//   38   97:astore          8
		if(obj1 == null) goto _L6; else goto _L5
	//   39   99:aload           6
	//   40  101:ifnull          197
_L5:
		context = ((Context) (obj1));
	//   41  104:aload           6
	//   42  106:astore_1        
		obj = obj1;
	//   43  107:aload           6
	//   44  109:astore          5
		Object obj4 = ((Object) (new InputStreamReader(((java.io.InputStream) (obj1)))));
	//   45  111:new             #149 <Class InputStreamReader>
	//   46  114:dup             
	//   47  115:aload           6
	//   48  117:invokespecial   #152 <Method void InputStreamReader(java.io.InputStream)>
	//   49  120:astore          9
		context = ((Context) (obj1));
	//   50  122:aload           6
	//   51  124:astore_1        
		obj = obj1;
	//   52  125:aload           6
	//   53  127:astore          5
		char ac[] = new char[128];
	//   54  129:sipush          128
	//   55  132:newarray        char[]
	//   56  134:astore          10
_L8:
		context = ((Context) (obj1));
	//   57  136:aload           6
	//   58  138:astore_1        
		obj = obj1;
	//   59  139:aload           6
	//   60  141:astore          5
		i = ((InputStreamReader) (obj4)).read(ac, 0, ac.length);
	//   61  143:aload           9
	//   62  145:aload           10
	//   63  147:iconst_0        
	//   64  148:aload           10
	//   65  150:arraylength     
	//   66  151:invokevirtual   #156 <Method int InputStreamReader.read(char[], int, int)>
	//   67  154:istore          4
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   68  156:iload           4
	//   69  158:ifle            182
		context = ((Context) (obj1));
	//   70  161:aload           6
	//   71  163:astore_1        
		obj = obj1;
	//   72  164:aload           6
	//   73  166:astore          5
		((StringBuilder) (obj3)).append(ac, 0, i);
	//   74  168:aload           8
	//   75  170:aload           10
	//   76  172:iconst_0        
	//   77  173:iload           4
	//   78  175:invokevirtual   #160 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   79  178:pop             
		if(true) goto _L8; else goto _L7
	//   80  179:goto            136
_L7:
		context = ((Context) (obj1));
	//   81  182:aload           6
	//   82  184:astore_1        
		obj = obj1;
	//   83  185:aload           6
	//   84  187:astore          5
		Utility.closeQuietly(((java.io.Closeable) (obj4)));
	//   85  189:aload           9
	//   86  191:invokestatic    #166 <Method void Utility.closeQuietly(java.io.Closeable)>
		  goto _L9
	//*  87  194:goto            212
_L6:
		context = ((Context) (obj1));
	//   88  197:aload           6
	//   89  199:astore_1        
		obj = obj1;
	//   90  200:aload           6
	//   91  202:astore          5
		((StringBuilder) (obj3)).append("Unexpected error while downloading an image.");
	//   92  204:aload           8
	//   93  206:ldc1            #168 <String "Unexpected error while downloading an image.">
	//   94  208:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   95  211:pop             
_L9:
		context = ((Context) (obj1));
	//   96  212:aload           6
	//   97  214:astore_1        
		obj = obj1;
	//   98  215:aload           6
	//   99  217:astore          5
		obj3 = ((Object) (new FacebookException(((StringBuilder) (obj3)).toString())));
	//  100  219:new             #173 <Class FacebookException>
	//  101  222:dup             
	//  102  223:aload           8
	//  103  225:invokevirtual   #174 <Method String StringBuilder.toString()>
	//  104  228:invokespecial   #175 <Method void FacebookException(String)>
	//  105  231:astore          8
		context = null;
	//  106  233:aconst_null     
	//  107  234:astore_1        
		obj = obj3;
	//  108  235:aload           8
	//  109  237:astore          5
		  goto _L10
	//* 110  239:goto            373
		requestkey;
	//  111  242:astore_0        
		  goto _L11
	//* 112  243:goto            412
		context;
	//  113  246:astore_1        
		flag = flag1;
	//  114  247:iload_3         
	//  115  248:istore_2        
		  goto _L12
	//* 116  249:goto            433
_L4:
		context = ((Context) (((HttpURLConnection) (obj2)).getHeaderField("location")));
	//  117  252:aload           7
	//  118  254:ldc1            #177 <String "location">
	//  119  256:invokevirtual   #181 <Method String HttpURLConnection.getHeaderField(String)>
	//  120  259:astore_1        
		if(Utility.isNullOrEmpty(((String) (context))))
			break MISSING_BLOCK_LABEL_320;
	//  121  260:aload_1         
	//  122  261:invokestatic    #185 <Method boolean Utility.isNullOrEmpty(String)>
	//  123  264:ifne            320
		context = ((Context) (Uri.parse(((String) (context)))));
	//  124  267:aload_1         
	//  125  268:invokestatic    #189 <Method Uri Uri.parse(String)>
	//  126  271:astore_1        
		UrlRedirectCache.cacheUriRedirect(requestkey.uri, ((Uri) (context)));
	//  127  272:aload_0         
	//  128  273:getfield        #117 <Field Uri ImageDownloader$RequestKey.uri>
	//  129  276:aload_1         
	//  130  277:invokestatic    #193 <Method void UrlRedirectCache.cacheUriRedirect(Uri, Uri)>
		obj1 = ((Object) (removePendingRequest(requestkey)));
	//  131  280:aload_0         
	//  132  281:invokestatic    #197 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//  133  284:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_320;
	//  134  286:aload           6
	//  135  288:ifnull          320
		if(!((DownloaderContext) (obj1)).isCancelled)
	//* 136  291:aload           6
	//* 137  293:getfield        #99  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//* 138  296:ifne            320
			enqueueCacheRead(((DownloaderContext) (obj1)).request, new RequestKey(((Uri) (context)), requestkey.tag), false);
	//  139  299:aload           6
	//  140  301:getfield        #201 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//  141  304:new             #17  <Class ImageDownloader$RequestKey>
	//  142  307:dup             
	//  143  308:aload_1         
	//  144  309:aload_0         
	//  145  310:getfield        #205 <Field Object ImageDownloader$RequestKey.tag>
	//  146  313:invokespecial   #76  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//  147  316:iconst_0        
	//  148  317:invokestatic    #209 <Method void enqueueCacheRead(ImageRequest, ImageDownloader$RequestKey, boolean)>
		obj1 = null;
	//  149  320:aconst_null     
	//  150  321:astore          6
		context = ((Context) (obj1));
	//  151  323:aload           6
	//  152  325:astore_1        
		flag = false;
	//  153  326:iconst_0        
	//  154  327:istore_2        
		obj = obj3;
	//  155  328:aload           8
	//  156  330:astore          5
		  goto _L10
	//* 157  332:goto            373
		context;
	//  158  335:astore_1        
		obj = null;
	//  159  336:aconst_null     
	//  160  337:astore          5
		flag = false;
	//  161  339:iconst_0        
	//  162  340:istore_2        
		  goto _L12
	//* 163  341:goto            433
_L2:
		obj1 = ((Object) (ImageResponseCache.interceptAndCacheImageStream(context, ((HttpURLConnection) (obj2)))));
	//  164  344:aload_1         
	//  165  345:aload           7
	//  166  347:invokestatic    #213 <Method java.io.InputStream ImageResponseCache.interceptAndCacheImageStream(Context, HttpURLConnection)>
	//  167  350:astore          6
		context = ((Context) (obj1));
	//  168  352:aload           6
	//  169  354:astore_1        
		obj = obj1;
	//  170  355:aload           6
	//  171  357:astore          5
		obj4 = ((Object) (BitmapFactory.decodeStream(((java.io.InputStream) (obj1)))));
	//  172  359:aload           6
	//  173  361:invokestatic    #219 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
	//  174  364:astore          9
		context = ((Context) (obj4));
	//  175  366:aload           9
	//  176  368:astore_1        
		obj = obj3;
	//  177  369:aload           8
	//  178  371:astore          5
_L10:
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//  179  373:aload           6
	//  180  375:invokestatic    #166 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  181  378:aload           7
	//  182  380:invokestatic    #223 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		obj1 = ((Object) (context));
	//  183  383:aload_1         
	//  184  384:astore          6
		  goto _L13
	//* 185  386:goto            449
		requestkey;
	//  186  389:astore_0        
		context = ((Context) (obj));
	//  187  390:aload           5
	//  188  392:astore_1        
		  goto _L11
	//* 189  393:goto            412
		context;
	//  190  396:astore_1        
		obj = null;
	//  191  397:aconst_null     
	//  192  398:astore          5
		flag = flag1;
	//  193  400:iload_3         
	//  194  401:istore_2        
		  goto _L12
	//* 195  402:goto            433
		requestkey;
	//  196  405:astore_0        
		obj2 = null;
	//  197  406:aconst_null     
	//  198  407:astore          7
		context = ((Context) (obj));
	//  199  409:aload           5
	//  200  411:astore_1        
_L11:
		Utility.closeQuietly(((java.io.Closeable) (context)));
	//  201  412:aload_1         
	//  202  413:invokestatic    #166 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  203  416:aload           7
	//  204  418:invokestatic    #223 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		throw requestkey;
	//  205  421:aload_0         
	//  206  422:athrow          
		context;
	//  207  423:astore_1        
		obj = null;
	//  208  424:aconst_null     
	//  209  425:astore          5
		obj2 = obj;
	//  210  427:aload           5
	//  211  429:astore          7
		flag = flag1;
	//  212  431:iload_3         
	//  213  432:istore_2        
_L12:
		Utility.closeQuietly(((java.io.Closeable) (obj)));
	//  214  433:aload           5
	//  215  435:invokestatic    #166 <Method void Utility.closeQuietly(java.io.Closeable)>
		Utility.disconnectQuietly(((java.net.URLConnection) (obj2)));
	//  216  438:aload           7
	//  217  440:invokestatic    #223 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		obj1 = null;
	//  218  443:aconst_null     
	//  219  444:astore          6
		obj = ((Object) (context));
	//  220  446:aload_1         
	//  221  447:astore          5
_L13:
		if(flag)
	//* 222  449:iload_2         
	//* 223  450:ifeq            462
			issueResponse(requestkey, ((Exception) (obj)), ((Bitmap) (obj1)), false);
	//  224  453:aload_0         
	//  225  454:aload           5
	//  226  456:aload           6
	//  227  458:iconst_0        
	//  228  459:invokestatic    #227 <Method void issueResponse(ImageDownloader$RequestKey, Exception, Bitmap, boolean)>
		return;
	//  229  462:return          
	//* 230  463:goto            76
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
	//    6   10:invokevirtual   #69  <Method Uri ImageRequest.getImageUri()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #73  <Method Object ImageRequest.getCallerTag()>
	//    9   17:invokespecial   #76  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//   10   20:astore_2        
		Map map = pendingRequests;
	//   11   21:getstatic       #49  <Field Map pendingRequests>
	//   12   24:astore_1        
		map;
	//   13   25:aload_1         
		JVM INSTR monitorenter ;
	//   14   26:monitorenter    
		DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(((Object) (requestkey)));
	//   15   27:getstatic       #49  <Field Map pendingRequests>
	//   16   30:aload_2         
	//   17   31:invokeinterface #82  <Method Object Map.get(Object)>
	//   18   36:checkcast       #14  <Class ImageDownloader$DownloaderContext>
	//   19   39:astore_3        
		if(downloadercontext == null)
			break MISSING_BLOCK_LABEL_66;
	//   20   40:aload_3         
	//   21   41:ifnull          66
		downloadercontext.request = imagerequest;
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:putfield        #201 <Field ImageRequest ImageDownloader$DownloaderContext.request>
		downloadercontext.isCancelled = false;
	//   25   49:aload_3         
	//   26   50:iconst_0        
	//   27   51:putfield        #99  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
		downloadercontext.workItem.moveToFront();
	//   28   54:aload_3         
	//   29   55:getfield        #86  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
	//   30   58:invokeinterface #232 <Method void WorkQueue$WorkItem.moveToFront()>
		break MISSING_BLOCK_LABEL_75;
	//   31   63:goto            75
		enqueueCacheRead(imagerequest, requestkey, imagerequest.isCachedRedirectAllowed());
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #235 <Method boolean ImageRequest.isCachedRedirectAllowed()>
	//   36   72:invokestatic    #209 <Method void enqueueCacheRead(ImageRequest, ImageDownloader$RequestKey, boolean)>
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
	//    2    2:getstatic       #43  <Field WorkQueue cacheReadQueue>
	//    3    5:new             #8   <Class ImageDownloader$CacheReadWorkItem>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #239 <Method Context ImageRequest.getContext()>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokespecial   #242 <Method void ImageDownloader$CacheReadWorkItem(Context, ImageDownloader$RequestKey, boolean)>
	//   10   18:invokestatic    #246 <Method void enqueueRequest(ImageRequest, ImageDownloader$RequestKey, WorkQueue, Runnable)>
	//   11   21:return          
	}

	private static void enqueueDownload(ImageRequest imagerequest, RequestKey requestkey)
	{
		enqueueRequest(imagerequest, requestkey, downloadQueue, ((Runnable) (new DownloadImageWorkItem(imagerequest.getContext(), requestkey))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #41  <Field WorkQueue downloadQueue>
	//    3    5:new             #11  <Class ImageDownloader$DownloadImageWorkItem>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #239 <Method Context ImageRequest.getContext()>
	//    7   13:aload_1         
	//    8   14:invokespecial   #251 <Method void ImageDownloader$DownloadImageWorkItem(Context, ImageDownloader$RequestKey)>
	//    9   17:invokestatic    #246 <Method void enqueueRequest(ImageRequest, ImageDownloader$RequestKey, WorkQueue, Runnable)>
	//   10   20:return          
	}

	private static void enqueueRequest(ImageRequest imagerequest, RequestKey requestkey, WorkQueue workqueue, Runnable runnable)
	{
		synchronized(pendingRequests)
	//*   0    0:getstatic       #49  <Field Map pendingRequests>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			DownloaderContext downloadercontext = new DownloaderContext();
	//    4    8:new             #14  <Class ImageDownloader$DownloaderContext>
	//    5   11:dup             
	//    6   12:aconst_null     
	//    7   13:invokespecial   #254 <Method void ImageDownloader$DownloaderContext(ImageDownloader$1)>
	//    8   16:astore          5
			downloadercontext.request = imagerequest;
	//    9   18:aload           5
	//   10   20:aload_0         
	//   11   21:putfield        #201 <Field ImageRequest ImageDownloader$DownloaderContext.request>
			pendingRequests.put(((Object) (requestkey)), ((Object) (downloadercontext)));
	//   12   24:getstatic       #49  <Field Map pendingRequests>
	//   13   27:aload_1         
	//   14   28:aload           5
	//   15   30:invokeinterface #258 <Method Object Map.put(Object, Object)>
	//   16   35:pop             
			downloadercontext.workItem = workqueue.addActiveWorkItem(runnable);
	//   17   36:aload           5
	//   18   38:aload_2         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #262 <Method WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   21   43:putfield        #86  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
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
	//*   2    3:getstatic       #266 <Field Handler handler>
	//*   3    6:ifnonnull       22
			handler = new Handler(Looper.getMainLooper());
	//    4    9:new             #268 <Class Handler>
	//    5   12:dup             
	//    6   13:invokestatic    #274 <Method Looper Looper.getMainLooper()>
	//    7   16:invokespecial   #277 <Method void Handler(Looper)>
	//    8   19:putstatic       #266 <Field Handler handler>
		handler1 = handler;
	//    9   22:getstatic       #266 <Field Handler handler>
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
	//    1    1:invokestatic    #197 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//    2    4:astore_0        
		if(requestkey != null && !((DownloaderContext) (requestkey)).isCancelled)
	//*   3    5:aload_0         
	//*   4    6:ifnull          52
	//*   5    9:aload_0         
	//*   6   10:getfield        #99  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//*   7   13:ifne            52
		{
			requestkey = ((RequestKey) (((DownloaderContext) (requestkey)).request));
	//    8   16:aload_0         
	//    9   17:getfield        #201 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//   10   20:astore_0        
			ImageRequest.Callback callback = ((ImageRequest) (requestkey)).getCallback();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #281 <Method ImageRequest$Callback ImageRequest.getCallback()>
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
	//   16   32:invokestatic    #283 <Method Handler getHandler()>
	//   17   35:new             #6   <Class ImageDownloader$1>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_3         
	//   22   42:aload_2         
	//   23   43:aload           4
	//   24   45:invokespecial   #286 <Method void ImageDownloader$1(ImageRequest, Exception, boolean, Bitmap, ImageRequest$Callback)>
	//   25   48:invokevirtual   #290 <Method boolean Handler.post(Runnable)>
	//   26   51:pop             
		}
	//   27   52:return          
	}

	public static void prioritizeRequest(ImageRequest imagerequest)
	{
		Object obj = ((Object) (new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag())));
	//    0    0:new             #17  <Class ImageDownloader$RequestKey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method Uri ImageRequest.getImageUri()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #73  <Method Object ImageRequest.getCallerTag()>
	//    6   12:invokespecial   #76  <Method void ImageDownloader$RequestKey(Uri, Object)>
	//    7   15:astore_1        
		imagerequest = ((ImageRequest) (pendingRequests));
	//    8   16:getstatic       #49  <Field Map pendingRequests>
	//    9   19:astore_0        
		imagerequest;
	//   10   20:aload_0         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		obj = ((Object) ((DownloaderContext)pendingRequests.get(obj)));
	//   12   22:getstatic       #49  <Field Map pendingRequests>
	//   13   25:aload_1         
	//   14   26:invokeinterface #82  <Method Object Map.get(Object)>
	//   15   31:checkcast       #14  <Class ImageDownloader$DownloaderContext>
	//   16   34:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_48;
	//   17   35:aload_1         
	//   18   36:ifnull          48
		((DownloaderContext) (obj)).workItem.moveToFront();
	//   19   39:aload_1         
	//   20   40:getfield        #86  <Field WorkQueue$WorkItem ImageDownloader$DownloaderContext.workItem>
	//   21   43:invokeinterface #232 <Method void WorkQueue$WorkItem.moveToFront()>
		imagerequest;
	//   22   48:aload_0         
		JVM INSTR monitorexit ;
	//   23   49:monitorexit     
		return;
	//   24   50:return          
		Exception exception;
		exception;
	//   25   51:astore_1        
		imagerequest;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		throw exception;
	//   28   54:aload_1         
	//   29   55:athrow          
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
	//    5    7:getfield        #117 <Field Uri ImageDownloader$RequestKey.uri>
	//    6   10:invokestatic    #295 <Method Uri UrlRedirectCache.getRedirectedUri(Uri)>
	//    7   13:astore          4
				if(obj != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          48
				{
					java.io.InputStream inputstream = ImageResponseCache.getCachedImageStream(((Uri) (obj)), context);
	//   10   20:aload           4
	//   11   22:aload_1         
	//   12   23:invokestatic    #299 <Method java.io.InputStream ImageResponseCache.getCachedImageStream(Uri, Context)>
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
	//   32   58:getfield        #117 <Field Uri ImageDownloader$RequestKey.uri>
	//   33   61:aload_1         
	//   34   62:invokestatic    #299 <Method java.io.InputStream ImageResponseCache.getCachedImageStream(Uri, Context)>
	//   35   65:astore          4
		if(obj != null)
	//*  36   67:aload           4
	//*  37   69:ifnull          91
		{
			context = ((Context) (BitmapFactory.decodeStream(((java.io.InputStream) (obj)))));
	//   38   72:aload           4
	//   39   74:invokestatic    #219 <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
	//   40   77:astore_1        
			Utility.closeQuietly(((java.io.Closeable) (obj)));
	//   41   78:aload           4
	//   42   80:invokestatic    #166 <Method void Utility.closeQuietly(java.io.Closeable)>
			issueResponse(requestkey, ((Exception) (null)), ((Bitmap) (context)), flag);
	//   43   83:aload_0         
	//   44   84:aconst_null     
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:invokestatic    #227 <Method void issueResponse(ImageDownloader$RequestKey, Exception, Bitmap, boolean)>
			return;
	//   48   90:return          
		}
		context = ((Context) (removePendingRequest(requestkey)));
	//   49   91:aload_0         
	//   50   92:invokestatic    #197 <Method ImageDownloader$DownloaderContext removePendingRequest(ImageDownloader$RequestKey)>
	//   51   95:astore_1        
		if(context != null && !((DownloaderContext) (context)).isCancelled)
	//*  52   96:aload_1         
	//*  53   97:ifnull          115
	//*  54  100:aload_1         
	//*  55  101:getfield        #99  <Field boolean ImageDownloader$DownloaderContext.isCancelled>
	//*  56  104:ifne            115
			enqueueDownload(((DownloaderContext) (context)).request, requestkey);
	//   57  107:aload_1         
	//   58  108:getfield        #201 <Field ImageRequest ImageDownloader$DownloaderContext.request>
	//   59  111:aload_0         
	//   60  112:invokestatic    #301 <Method void enqueueDownload(ImageRequest, ImageDownloader$RequestKey)>
	//   61  115:return          
	}

	private static DownloaderContext removePendingRequest(RequestKey requestkey)
	{
		synchronized(pendingRequests)
	//*   0    0:getstatic       #49  <Field Map pendingRequests>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			requestkey = ((RequestKey) ((DownloaderContext)pendingRequests.remove(((Object) (requestkey)))));
	//    4    6:getstatic       #49  <Field Map pendingRequests>
	//    5    9:aload_0         
	//    6   10:invokeinterface #95  <Method Object Map.remove(Object)>
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

	private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
	private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
	private static WorkQueue cacheReadQueue = new WorkQueue(2);
	private static WorkQueue downloadQueue = new WorkQueue(8);
	private static Handler handler;
	private static final Map pendingRequests = new HashMap();

	static 
	{
	//    0    0:new             #35  <Class WorkQueue>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:invokespecial   #39  <Method void WorkQueue(int)>
	//    4    9:putstatic       #41  <Field WorkQueue downloadQueue>
	//    5   12:new             #35  <Class WorkQueue>
	//    6   15:dup             
	//    7   16:iconst_2        
	//    8   17:invokespecial   #39  <Method void WorkQueue(int)>
	//    9   20:putstatic       #43  <Field WorkQueue cacheReadQueue>
	//   10   23:new             #45  <Class HashMap>
	//   11   26:dup             
	//   12   27:invokespecial   #47  <Method void HashMap()>
	//   13   30:putstatic       #49  <Field Map pendingRequests>
	//*  14   33:return          
	}


/*
	static void access$100(RequestKey requestkey, Context context, boolean flag)
	{
		readFromCache(requestkey, context, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #56  <Method void readFromCache(ImageDownloader$RequestKey, Context, boolean)>
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
	//    2    2:invokestatic    #61  <Method void download(ImageDownloader$RequestKey, Context)>
		return;
	//    3    5:return          
	}

*/
}

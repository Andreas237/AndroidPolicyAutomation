// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//			VolleyLog, Cache, Request, NetworkResponse, 
//			ResponseDelivery, Response

public class CacheDispatcher extends Thread
{

	public CacheDispatcher(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, Cache cache, ResponseDelivery responsedelivery)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Thread()>
		mQuit = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean mQuit>
		mCacheQueue = blockingqueue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field BlockingQueue mCacheQueue>
		mNetworkQueue = blockingqueue1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #35  <Field BlockingQueue mNetworkQueue>
		mCache = cache;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #37  <Field Cache mCache>
		mDelivery = responsedelivery;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #39  <Field ResponseDelivery mDelivery>
	//   17   30:return          
	}

	public void quit()
	{
		mQuit = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #31  <Field boolean mQuit>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #47  <Method void interrupt()>
	//    5    9:return          
	}

	public void run()
	{
		if(DEBUG)
	//*   0    0:getstatic       #24  <Field boolean DEBUG>
	//*   1    3:ifeq            15
			VolleyLog.v("start new dispatcher", new Object[0]);
	//    2    6:ldc1            #52  <String "start new dispatcher">
	//    3    8:iconst_0        
	//    4    9:anewarray       Object[]
	//    5   12:invokestatic    #58  <Method void VolleyLog.v(String, Object[])>
		Process.setThreadPriority(10);
	//    6   15:bipush          10
	//    7   17:invokestatic    #64  <Method void Process.setThreadPriority(int)>
		mCache.initialize();
	//    8   20:aload_0         
	//    9   21:getfield        #37  <Field Cache mCache>
	//   10   24:invokeinterface #69  <Method void Cache.initialize()>
_L1:
		final Request request;
		do
		{
label0:
			{
				request = (Request)mCacheQueue.take();
	//   11   29:aload_0         
	//   12   30:getfield        #33  <Field BlockingQueue mCacheQueue>
	//   13   33:invokeinterface #75  <Method Object BlockingQueue.take()>
	//   14   38:checkcast       #77  <Class Request>
	//   15   41:astore_1        
				request.addMarker("cache-queue-take");
	//   16   42:aload_1         
	//   17   43:ldc1            #79  <String "cache-queue-take">
	//   18   45:invokevirtual   #83  <Method void Request.addMarker(String)>
				if(!request.isCanceled())
					break label0;
	//   19   48:aload_1         
	//   20   49:invokevirtual   #87  <Method boolean Request.isCanceled()>
	//   21   52:ifeq            64
				request.finish("cache-discard-canceled");
	//   22   55:aload_1         
	//   23   56:ldc1            #89  <String "cache-discard-canceled">
	//   24   58:invokevirtual   #92  <Method void Request.finish(String)>
			}
		} while(true);
	//   25   61:goto            29
		Cache.Entry entry = mCache.get(request.getCacheKey());
	//   26   64:aload_0         
	//   27   65:getfield        #37  <Field Cache mCache>
	//   28   68:aload_1         
	//   29   69:invokevirtual   #96  <Method String Request.getCacheKey()>
	//   30   72:invokeinterface #100 <Method Cache$Entry Cache.get(String)>
	//   31   77:astore_2        
label1:
		{
			if(entry != null)
				break label1;
	//   32   78:aload_2         
	//   33   79:ifnonnull       101
			Response response;
			try
			{
				request.addMarker("cache-miss");
	//   34   82:aload_1         
	//   35   83:ldc1            #102 <String "cache-miss">
	//   36   85:invokevirtual   #83  <Method void Request.addMarker(String)>
				mNetworkQueue.put(((Object) (request)));
	//   37   88:aload_0         
	//   38   89:getfield        #35  <Field BlockingQueue mNetworkQueue>
	//   39   92:aload_1         
	//   40   93:invokeinterface #106 <Method void BlockingQueue.put(Object)>
			}
	//*  41   98:goto            29
	//*  42  101:aload_2         
	//*  43  102:invokevirtual   #111 <Method boolean Cache$Entry.isExpired()>
	//*  44  105:ifeq            133
	//*  45  108:aload_1         
	//*  46  109:ldc1            #113 <String "cache-hit-expired">
	//*  47  111:invokevirtual   #83  <Method void Request.addMarker(String)>
	//*  48  114:aload_1         
	//*  49  115:aload_2         
	//*  50  116:invokevirtual   #117 <Method Request Request.setCacheEntry(Cache$Entry)>
	//*  51  119:pop             
	//*  52  120:aload_0         
	//*  53  121:getfield        #35  <Field BlockingQueue mNetworkQueue>
	//*  54  124:aload_1         
	//*  55  125:invokeinterface #106 <Method void BlockingQueue.put(Object)>
	//*  56  130:goto            29
	//*  57  133:aload_1         
	//*  58  134:ldc1            #119 <String "cache-hit">
	//*  59  136:invokevirtual   #83  <Method void Request.addMarker(String)>
	//*  60  139:aload_1         
	//*  61  140:new             #121 <Class NetworkResponse>
	//*  62  143:dup             
	//*  63  144:aload_2         
	//*  64  145:getfield        #125 <Field byte[] Cache$Entry.data>
	//*  65  148:aload_2         
	//*  66  149:getfield        #129 <Field java.util.Map Cache$Entry.responseHeaders>
	//*  67  152:invokespecial   #132 <Method void NetworkResponse(byte[], java.util.Map)>
	//*  68  155:invokevirtual   #136 <Method Response Request.parseNetworkResponse(NetworkResponse)>
	//*  69  158:astore_3        
	//*  70  159:aload_1         
	//*  71  160:ldc1            #138 <String "cache-hit-parsed">
	//*  72  162:invokevirtual   #83  <Method void Request.addMarker(String)>
	//*  73  165:aload_2         
	//*  74  166:invokevirtual   #141 <Method boolean Cache$Entry.refreshNeeded()>
	//*  75  169:ifne            186
	//*  76  172:aload_0         
	//*  77  173:getfield        #39  <Field ResponseDelivery mDelivery>
	//*  78  176:aload_1         
	//*  79  177:aload_3         
	//*  80  178:invokeinterface #147 <Method void ResponseDelivery.postResponse(Request, Response)>
	//*  81  183:goto            223
	//*  82  186:aload_1         
	//*  83  187:ldc1            #149 <String "cache-hit-refresh-needed">
	//*  84  189:invokevirtual   #83  <Method void Request.addMarker(String)>
	//*  85  192:aload_1         
	//*  86  193:aload_2         
	//*  87  194:invokevirtual   #117 <Method Request Request.setCacheEntry(Cache$Entry)>
	//*  88  197:pop             
	//*  89  198:aload_3         
	//*  90  199:iconst_1        
	//*  91  200:putfield        #154 <Field boolean Response.intermediate>
	//*  92  203:aload_0         
	//*  93  204:getfield        #39  <Field ResponseDelivery mDelivery>
	//*  94  207:aload_1         
	//*  95  208:aload_3         
	//*  96  209:new             #6   <Class CacheDispatcher$1>
	//*  97  212:dup             
	//*  98  213:aload_0         
	//*  99  214:aload_1         
	//* 100  215:invokespecial   #157 <Method void CacheDispatcher$1(CacheDispatcher, Request)>
	//* 101  218:invokeinterface #160 <Method void ResponseDelivery.postResponse(Request, Response, Runnable)>
	//* 102  223:goto            29
			catch(InterruptedException interruptedexception)
	//* 103  226:astore_1        
			{
				if(mQuit)
	//* 104  227:aload_0         
	//* 105  228:getfield        #31  <Field boolean mQuit>
	//* 106  231:ifeq            235
					return;
	//  107  234:return          
			}
		}
		  goto _L1
label2:
		{
			if(!entry.isExpired())
				break label2;
			request.addMarker("cache-hit-expired");
			request.setCacheEntry(entry);
			mNetworkQueue.put(((Object) (request)));
		}
		  goto _L1
label3:
		{
			request.addMarker("cache-hit");
			response = request.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
			request.addMarker("cache-hit-parsed");
			if(entry.refreshNeeded())
				break label3;
			mDelivery.postResponse(request, response);
		}
		  goto _L1
		request.addMarker("cache-hit-refresh-needed");
		request.setCacheEntry(entry);
		response.intermediate = true;
		mDelivery.postResponse(request, response, new Runnable() {

			public void run()
			{
				try
				{
					mNetworkQueue.put(((Object) (request)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CacheDispatcher this$0>
			//    2    4:invokestatic    #30  <Method BlockingQueue CacheDispatcher.access$000(CacheDispatcher)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Request val$request>
			//    5   11:invokeinterface #36  <Method void BlockingQueue.put(Object)>
					return;
			//    6   16:return          
				}
				catch(InterruptedException interruptedexception1)
			//*   7   17:astore_1        
				{
					return;
			//    8   18:return          
				}
			}

			final CacheDispatcher this$0;
			final Request val$request;

			
			{
				this$0 = CacheDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CacheDispatcher this$0>
				request = request1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Request val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
		  goto _L1
	//* 108  235:goto            29
	}

	private static final boolean DEBUG;
	private final Cache mCache;
	private final BlockingQueue mCacheQueue;
	private final ResponseDelivery mDelivery;
	private final BlockingQueue mNetworkQueue;
	private volatile boolean mQuit;

	static 
	{
		DEBUG = VolleyLog.DEBUG;
	//    0    0:getstatic       #23  <Field boolean VolleyLog.DEBUG>
	//    1    3:putstatic       #24  <Field boolean DEBUG>
	//*   2    6:return          
	}


/*
	static BlockingQueue access$000(CacheDispatcher cachedispatcher)
	{
		return cachedispatcher.mNetworkQueue;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BlockingQueue mNetworkQueue>
	//    2    4:areturn         
	}

*/
}

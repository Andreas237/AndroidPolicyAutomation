// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//			Request, ResponseDelivery, VolleyError, Network, 
//			NetworkResponse, Response, Cache, VolleyLog

public class NetworkDispatcher extends Thread
{

	public NetworkDispatcher(BlockingQueue blockingqueue, Network network, Cache cache, ResponseDelivery responsedelivery)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Thread()>
		mQuit = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean mQuit>
		mQueue = blockingqueue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field BlockingQueue mQueue>
		mNetwork = network;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #26  <Field Network mNetwork>
		mCache = cache;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #28  <Field Cache mCache>
		mDelivery = responsedelivery;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #30  <Field ResponseDelivery mDelivery>
	//   17   30:return          
	}

	private void addTrafficStatsTag(Request request)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          15
			TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
	//    3    8:aload_1         
	//    4    9:invokevirtual   #50  <Method int Request.getTrafficStatsTag()>
	//    5   12:invokestatic    #56  <Method void TrafficStats.setThreadStatsTag(int)>
	//    6   15:return          
	}

	private void parseAndDeliverNetworkError(Request request, VolleyError volleyerror)
	{
		volleyerror = request.parseNetworkError(volleyerror);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #64  <Method VolleyError Request.parseNetworkError(VolleyError)>
	//    3    5:astore_2        
		mDelivery.postError(request, volleyerror);
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field ResponseDelivery mDelivery>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #69  <Method void ResponseDelivery.postError(Request, VolleyError)>
	//    9   17:return          
	}

	private void processRequest()
		throws InterruptedException
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #83  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_1        
		Request request = (Request)mQueue.take();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field BlockingQueue mQueue>
	//    4    8:invokeinterface #89  <Method Object BlockingQueue.take()>
	//    5   13:checkcast       #46  <Class Request>
	//    6   16:astore_3        
		Object obj;
		try
		{
			request.addMarker("network-queue-take");
	//    7   17:aload_3         
	//    8   18:ldc1            #91  <String "network-queue-take">
	//    9   20:invokevirtual   #95  <Method void Request.addMarker(String)>
			if(request.isCanceled())
	//*  10   23:aload_3         
	//*  11   24:invokevirtual   #99  <Method boolean Request.isCanceled()>
	//*  12   27:ifeq            41
			{
				request.finish("network-discard-cancelled");
	//   13   30:aload_3         
	//   14   31:ldc1            #101 <String "network-discard-cancelled">
	//   15   33:invokevirtual   #104 <Method void Request.finish(String)>
				request.notifyListenerResponseNotUsable();
	//   16   36:aload_3         
	//   17   37:invokevirtual   #107 <Method void Request.notifyListenerResponseNotUsable()>
				return;
	//   18   40:return          
			}
		}
	//*  19   41:aload_0         
	//*  20   42:aload_3         
	//*  21   43:invokespecial   #109 <Method void addTrafficStatsTag(Request)>
	//*  22   46:aload_0         
	//*  23   47:getfield        #26  <Field Network mNetwork>
	//*  24   50:aload_3         
	//*  25   51:invokeinterface #115 <Method NetworkResponse Network.performRequest(Request)>
	//*  26   56:astore          4
	//*  27   58:aload_3         
	//*  28   59:ldc1            #117 <String "network-http-complete">
	//*  29   61:invokevirtual   #95  <Method void Request.addMarker(String)>
	//*  30   64:aload           4
	//*  31   66:getfield        #122 <Field boolean NetworkResponse.notModified>
	//*  32   69:ifeq            90
	//*  33   72:aload_3         
	//*  34   73:invokevirtual   #125 <Method boolean Request.hasHadResponseDelivered()>
	//*  35   76:ifeq            90
	//*  36   79:aload_3         
	//*  37   80:ldc1            #127 <String "not-modified">
	//*  38   82:invokevirtual   #104 <Method void Request.finish(String)>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #107 <Method void Request.notifyListenerResponseNotUsable()>
	//*  41   89:return          
	//*  42   90:aload_3         
	//*  43   91:aload           4
	//*  44   93:invokevirtual   #131 <Method Response Request.parseNetworkResponse(NetworkResponse)>
	//*  45   96:astore          4
	//*  46   98:aload_3         
	//*  47   99:ldc1            #133 <String "network-parse-complete">
	//*  48  101:invokevirtual   #95  <Method void Request.addMarker(String)>
	//*  49  104:aload_3         
	//*  50  105:invokevirtual   #136 <Method boolean Request.shouldCache()>
	//*  51  108:ifeq            143
	//*  52  111:aload           4
	//*  53  113:getfield        #142 <Field Cache$Entry Response.cacheEntry>
	//*  54  116:ifnull          143
	//*  55  119:aload_0         
	//*  56  120:getfield        #28  <Field Cache mCache>
	//*  57  123:aload_3         
	//*  58  124:invokevirtual   #146 <Method String Request.getCacheKey()>
	//*  59  127:aload           4
	//*  60  129:getfield        #142 <Field Cache$Entry Response.cacheEntry>
	//*  61  132:invokeinterface #152 <Method void Cache.put(String, Cache$Entry)>
	//*  62  137:aload_3         
	//*  63  138:ldc1            #154 <String "network-cache-written">
	//*  64  140:invokevirtual   #95  <Method void Request.addMarker(String)>
	//*  65  143:aload_3         
	//*  66  144:invokevirtual   #157 <Method void Request.markDelivered()>
	//*  67  147:aload_0         
	//*  68  148:getfield        #30  <Field ResponseDelivery mDelivery>
	//*  69  151:aload_3         
	//*  70  152:aload           4
	//*  71  154:invokeinterface #161 <Method void ResponseDelivery.postResponse(Request, Response)>
	//*  72  159:aload_3         
	//*  73  160:aload           4
	//*  74  162:invokevirtual   #165 <Method void Request.notifyListenerResponseReceived(Response)>
	//*  75  165:return          
	//*  76  166:astore          4
	//*  77  168:aload           4
	//*  78  170:ldc1            #167 <String "Unhandled exception %s">
	//*  79  172:iconst_1        
	//*  80  173:anewarray       Object[]
	//*  81  176:dup             
	//*  82  177:iconst_0        
	//*  83  178:aload           4
	//*  84  180:invokevirtual   #172 <Method String Exception.toString()>
	//*  85  183:aastore         
	//*  86  184:invokestatic    #178 <Method void VolleyLog.e(Throwable, String, Object[])>
	//*  87  187:new             #75  <Class VolleyError>
	//*  88  190:dup             
	//*  89  191:aload           4
	//*  90  193:invokespecial   #181 <Method void VolleyError(Throwable)>
	//*  91  196:astore          4
	//*  92  198:aload           4
	//*  93  200:invokestatic    #83  <Method long SystemClock.elapsedRealtime()>
	//*  94  203:lload_1         
	//*  95  204:lsub            
	//*  96  205:invokevirtual   #185 <Method void VolleyError.setNetworkTimeMs(long)>
	//*  97  208:aload_0         
	//*  98  209:getfield        #30  <Field ResponseDelivery mDelivery>
	//*  99  212:aload_3         
	//* 100  213:aload           4
	//* 101  215:invokeinterface #69  <Method void ResponseDelivery.postError(Request, VolleyError)>
	//* 102  220:aload_3         
	//* 103  221:invokevirtual   #107 <Method void Request.notifyListenerResponseNotUsable()>
	//* 104  224:return          
		catch(VolleyError volleyerror1)
	//* 105  225:astore          4
		{
			volleyerror1.setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
	//  106  227:aload           4
	//  107  229:invokestatic    #83  <Method long SystemClock.elapsedRealtime()>
	//  108  232:lload_1         
	//  109  233:lsub            
	//  110  234:invokevirtual   #185 <Method void VolleyError.setNetworkTimeMs(long)>
			parseAndDeliverNetworkError(request, volleyerror1);
	//  111  237:aload_0         
	//  112  238:aload_3         
	//  113  239:aload           4
	//  114  241:invokespecial   #187 <Method void parseAndDeliverNetworkError(Request, VolleyError)>
			request.notifyListenerResponseNotUsable();
	//  115  244:aload_3         
	//  116  245:invokevirtual   #107 <Method void Request.notifyListenerResponseNotUsable()>
			return;
	//  117  248:return          
		}
		catch(Exception exception)
		{
			VolleyLog.e(((Throwable) (exception)), "Unhandled exception %s", new Object[] {
				exception.toString()
			});
			VolleyError volleyerror = new VolleyError(((Throwable) (exception)));
			volleyerror.setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
			mDelivery.postError(request, volleyerror);
			request.notifyListenerResponseNotUsable();
			return;
		}
		addTrafficStatsTag(request);
		obj = ((Object) (mNetwork.performRequest(request)));
		request.addMarker("network-http-complete");
		if(((NetworkResponse) (obj)).notModified && request.hasHadResponseDelivered())
		{
			request.finish("not-modified");
			request.notifyListenerResponseNotUsable();
			return;
		}
		obj = ((Object) (request.parseNetworkResponse(((NetworkResponse) (obj)))));
		request.addMarker("network-parse-complete");
		if(request.shouldCache() && ((Response) (obj)).cacheEntry != null)
		{
			mCache.put(request.getCacheKey(), ((Response) (obj)).cacheEntry);
			request.addMarker("network-cache-written");
		}
		request.markDelivered();
		mDelivery.postResponse(request, ((Response) (obj)));
		request.notifyListenerResponseReceived(((Response) (obj)));
		return;
	}

	public void quit()
	{
		mQuit = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #22  <Field boolean mQuit>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #192 <Method void interrupt()>
	//    5    9:return          
	}

	public void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #198 <Method void Process.setThreadPriority(int)>
		do
			try
			{
				do
					processRequest();
	//    2    5:aload_0         
	//    3    6:invokespecial   #200 <Method void processRequest()>
				while(true);
	//    4    9:goto            5
			}
	//*   5   12:aload_0         
	//*   6   13:getfield        #22  <Field boolean mQuit>
	//*   7   16:ifeq            5
	//*   8   19:return          
			catch(InterruptedException interruptedexception) { }
	//    9   20:astore_1        
		while(!mQuit);
	//*  10   21:goto            12
	}

	private final Cache mCache;
	private final ResponseDelivery mDelivery;
	private final Network mNetwork;
	private final BlockingQueue mQueue;
	private volatile boolean mQuit;
}

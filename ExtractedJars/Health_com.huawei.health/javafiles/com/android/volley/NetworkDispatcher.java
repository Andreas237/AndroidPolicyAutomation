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

	public void quit()
	{
		mQuit = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #22  <Field boolean mQuit>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #74  <Method void interrupt()>
	//    5    9:return          
	}

	public void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #86  <Method void Process.setThreadPriority(int)>
_L2:
		long l;
		Object obj;
		l = SystemClock.elapsedRealtime();
	//    2    5:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//    3    8:lstore_1        
		try
		{
			obj = ((Object) ((Request)mQueue.take()));
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field BlockingQueue mQueue>
	//    6   13:invokeinterface #98  <Method Object BlockingQueue.take()>
	//    7   18:checkcast       #46  <Class Request>
	//    8   21:astore_3        
		}
	//*   9   22:goto            37
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   25:astore_3        
		{
			if(mQuit)
	//*  11   26:aload_0         
	//*  12   27:getfield        #22  <Field boolean mQuit>
	//*  13   30:ifeq            34
				return;
	//   14   33:return          
			continue; /* Loop/switch isn't completed */
	//   15   34:goto            5
		}
		((Request) (obj)).addMarker("network-queue-take");
	//   16   37:aload_3         
	//   17   38:ldc1            #100 <String "network-queue-take">
	//   18   40:invokevirtual   #104 <Method void Request.addMarker(String)>
		if(((Request) (obj)).isCanceled())
	//*  19   43:aload_3         
	//*  20   44:invokevirtual   #108 <Method boolean Request.isCanceled()>
	//*  21   47:ifeq            59
		{
			((Request) (obj)).finish("network-discard-cancelled");
	//   22   50:aload_3         
	//   23   51:ldc1            #110 <String "network-discard-cancelled">
	//   24   53:invokevirtual   #113 <Method void Request.finish(String)>
			continue; /* Loop/switch isn't completed */
	//   25   56:goto            5
		}
		addTrafficStatsTag(((Request) (obj)));
	//   26   59:aload_0         
	//   27   60:aload_3         
	//   28   61:invokespecial   #115 <Method void addTrafficStatsTag(Request)>
		Object obj1 = ((Object) (mNetwork.performRequest(((Request) (obj)))));
	//   29   64:aload_0         
	//   30   65:getfield        #26  <Field Network mNetwork>
	//   31   68:aload_3         
	//   32   69:invokeinterface #121 <Method NetworkResponse Network.performRequest(Request)>
	//   33   74:astore          4
		((Request) (obj)).addMarker("network-http-complete");
	//   34   76:aload_3         
	//   35   77:ldc1            #123 <String "network-http-complete">
	//   36   79:invokevirtual   #104 <Method void Request.addMarker(String)>
		if(((NetworkResponse) (obj1)).notModified && ((Request) (obj)).hasHadResponseDelivered())
	//*  37   82:aload           4
	//*  38   84:getfield        #128 <Field boolean NetworkResponse.notModified>
	//*  39   87:ifeq            106
	//*  40   90:aload_3         
	//*  41   91:invokevirtual   #131 <Method boolean Request.hasHadResponseDelivered()>
	//*  42   94:ifeq            106
		{
			((Request) (obj)).finish("not-modified");
	//   43   97:aload_3         
	//   44   98:ldc1            #133 <String "not-modified">
	//   45  100:invokevirtual   #113 <Method void Request.finish(String)>
			continue; /* Loop/switch isn't completed */
	//   46  103:goto            5
		}
		try
		{
			obj1 = ((Object) (((Request) (obj)).parseNetworkResponse(((NetworkResponse) (obj1)))));
	//   47  106:aload_3         
	//   48  107:aload           4
	//   49  109:invokevirtual   #137 <Method Response Request.parseNetworkResponse(NetworkResponse)>
	//   50  112:astore          4
			((Request) (obj)).addMarker("network-parse-complete");
	//   51  114:aload_3         
	//   52  115:ldc1            #139 <String "network-parse-complete">
	//   53  117:invokevirtual   #104 <Method void Request.addMarker(String)>
			if(((Request) (obj)).shouldCache() && ((Response) (obj1)).cacheEntry != null)
	//*  54  120:aload_3         
	//*  55  121:invokevirtual   #142 <Method boolean Request.shouldCache()>
	//*  56  124:ifeq            159
	//*  57  127:aload           4
	//*  58  129:getfield        #148 <Field Cache$Entry Response.cacheEntry>
	//*  59  132:ifnull          159
			{
				mCache.put(((Request) (obj)).getCacheKey(), ((Response) (obj1)).cacheEntry);
	//   60  135:aload_0         
	//   61  136:getfield        #28  <Field Cache mCache>
	//   62  139:aload_3         
	//   63  140:invokevirtual   #152 <Method String Request.getCacheKey()>
	//   64  143:aload           4
	//   65  145:getfield        #148 <Field Cache$Entry Response.cacheEntry>
	//   66  148:invokeinterface #158 <Method void Cache.put(String, Cache$Entry)>
				((Request) (obj)).addMarker("network-cache-written");
	//   67  153:aload_3         
	//   68  154:ldc1            #160 <String "network-cache-written">
	//   69  156:invokevirtual   #104 <Method void Request.addMarker(String)>
			}
			((Request) (obj)).markDelivered();
	//   70  159:aload_3         
	//   71  160:invokevirtual   #163 <Method void Request.markDelivered()>
			mDelivery.postResponse(((Request) (obj)), ((Response) (obj1)));
	//   72  163:aload_0         
	//   73  164:getfield        #30  <Field ResponseDelivery mDelivery>
	//   74  167:aload_3         
	//   75  168:aload           4
	//   76  170:invokeinterface #167 <Method void ResponseDelivery.postResponse(Request, Response)>
		}
	//*  77  175:goto            254
		catch(VolleyError volleyerror)
	//*  78  178:astore          4
		{
			volleyerror.setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
	//   79  180:aload           4
	//   80  182:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//   81  185:lload_1         
	//   82  186:lsub            
	//   83  187:invokevirtual   #171 <Method void VolleyError.setNetworkTimeMs(long)>
			parseAndDeliverNetworkError(((Request) (obj)), volleyerror);
	//   84  190:aload_0         
	//   85  191:aload_3         
	//   86  192:aload           4
	//   87  194:invokespecial   #173 <Method void parseAndDeliverNetworkError(Request, VolleyError)>
		}
	//*  88  197:goto            254
		catch(Exception exception)
	//*  89  200:astore          4
		{
			VolleyLog.e(((Throwable) (exception)), "Unhandled exception %s", new Object[] {
				exception.toString()
			});
	//   90  202:aload           4
	//   91  204:ldc1            #175 <String "Unhandled exception %s">
	//   92  206:iconst_1        
	//   93  207:anewarray       Object[]
	//   94  210:dup             
	//   95  211:iconst_0        
	//   96  212:aload           4
	//   97  214:invokevirtual   #180 <Method String Exception.toString()>
	//   98  217:aastore         
	//   99  218:invokestatic    #186 <Method void VolleyLog.e(Throwable, String, Object[])>
			VolleyError volleyerror1 = new VolleyError(((Throwable) (exception)));
	//  100  221:new             #79  <Class VolleyError>
	//  101  224:dup             
	//  102  225:aload           4
	//  103  227:invokespecial   #189 <Method void VolleyError(Throwable)>
	//  104  230:astore          4
			volleyerror1.setNetworkTimeMs(SystemClock.elapsedRealtime() - l);
	//  105  232:aload           4
	//  106  234:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
	//  107  237:lload_1         
	//  108  238:lsub            
	//  109  239:invokevirtual   #171 <Method void VolleyError.setNetworkTimeMs(long)>
			mDelivery.postError(((Request) (obj)), volleyerror1);
	//  110  242:aload_0         
	//  111  243:getfield        #30  <Field ResponseDelivery mDelivery>
	//  112  246:aload_3         
	//  113  247:aload           4
	//  114  249:invokeinterface #69  <Method void ResponseDelivery.postError(Request, VolleyError)>
		}
		if(true) goto _L2; else goto _L1
	//  115  254:goto            5
_L1:
	}

	private final Cache mCache;
	private final ResponseDelivery mDelivery;
	private final Network mNetwork;
	private final BlockingQueue mQueue;
	private volatile boolean mQuit;
}

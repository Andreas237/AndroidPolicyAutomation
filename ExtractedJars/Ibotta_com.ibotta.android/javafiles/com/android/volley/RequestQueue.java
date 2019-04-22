// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.android.volley:
//			ExecutorDelivery, NetworkDispatcher, Request, CacheDispatcher, 
//			Cache, ResponseDelivery, Network

public class RequestQueue
{
	public static interface RequestFilter
	{

		public abstract boolean apply(Request request);
	}

	public static interface RequestFinishedListener
	{

		public abstract void onRequestFinished(Request request);
	}


	public RequestQueue(Cache cache, Network network)
	{
		this(cache, network, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_4        
	//    4    4:invokespecial   #37  <Method void RequestQueue(Cache, Network, int)>
	//    5    7:return          
	}

	public RequestQueue(Cache cache, Network network, int i)
	{
		this(cache, network, i, ((ResponseDelivery) (new ExecutorDelivery(new Handler(Looper.getMainLooper())))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:new             #40  <Class ExecutorDelivery>
	//    5    7:dup             
	//    6    8:new             #42  <Class Handler>
	//    7   11:dup             
	//    8   12:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//    9   15:invokespecial   #51  <Method void Handler(Looper)>
	//   10   18:invokespecial   #54  <Method void ExecutorDelivery(Handler)>
	//   11   21:invokespecial   #57  <Method void RequestQueue(Cache, Network, int, ResponseDelivery)>
	//   12   24:return          
	}

	public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responsedelivery)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mSequenceGenerator = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #62  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void AtomicInteger()>
	//    6   12:putfield        #65  <Field AtomicInteger mSequenceGenerator>
		mCurrentRequests = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #67  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #68  <Method void HashSet()>
	//   11   23:putfield        #70  <Field Set mCurrentRequests>
		mCacheQueue = new PriorityBlockingQueue();
	//   12   26:aload_0         
	//   13   27:new             #72  <Class PriorityBlockingQueue>
	//   14   30:dup             
	//   15   31:invokespecial   #73  <Method void PriorityBlockingQueue()>
	//   16   34:putfield        #75  <Field PriorityBlockingQueue mCacheQueue>
		mNetworkQueue = new PriorityBlockingQueue();
	//   17   37:aload_0         
	//   18   38:new             #72  <Class PriorityBlockingQueue>
	//   19   41:dup             
	//   20   42:invokespecial   #73  <Method void PriorityBlockingQueue()>
	//   21   45:putfield        #77  <Field PriorityBlockingQueue mNetworkQueue>
		mFinishedListeners = ((List) (new ArrayList()));
	//   22   48:aload_0         
	//   23   49:new             #79  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #80  <Method void ArrayList()>
	//   26   56:putfield        #82  <Field List mFinishedListeners>
		mCache = cache;
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:putfield        #84  <Field Cache mCache>
		mNetwork = network;
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:putfield        #86  <Field Network mNetwork>
		mDispatchers = new NetworkDispatcher[i];
	//   33   69:aload_0         
	//   34   70:iload_3         
	//   35   71:anewarray       NetworkDispatcher[]
	//   36   74:putfield        #90  <Field NetworkDispatcher[] mDispatchers>
		mDelivery = responsedelivery;
	//   37   77:aload_0         
	//   38   78:aload           4
	//   39   80:putfield        #92  <Field ResponseDelivery mDelivery>
	//   40   83:return          
	}

	public Request add(Request request)
	{
		request.setRequestQueue(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #100 <Method Request Request.setRequestQueue(RequestQueue)>
	//    3    5:pop             
		synchronized(mCurrentRequests)
	//*   4    6:aload_0         
	//*   5    7:getfield        #70  <Field Set mCurrentRequests>
	//*   6   10:astore_2        
	//*   7   11:aload_2         
	//*   8   12:monitorenter    
		{
			mCurrentRequests.add(((Object) (request)));
	//    9   13:aload_0         
	//   10   14:getfield        #70  <Field Set mCurrentRequests>
	//   11   17:aload_1         
	//   12   18:invokeinterface #105 <Method boolean Set.add(Object)>
	//   13   23:pop             
		}
	//   14   24:aload_2         
	//   15   25:monitorexit     
		request.setSequence(getSequenceNumber());
	//   16   26:aload_1         
	//   17   27:aload_0         
	//   18   28:invokevirtual   #109 <Method int getSequenceNumber()>
	//   19   31:invokevirtual   #113 <Method Request Request.setSequence(int)>
	//   20   34:pop             
		request.addMarker("add-to-queue");
	//   21   35:aload_1         
	//   22   36:ldc1            #115 <String "add-to-queue">
	//   23   38:invokevirtual   #119 <Method void Request.addMarker(String)>
		if(!request.shouldCache())
	//*  24   41:aload_1         
	//*  25   42:invokevirtual   #123 <Method boolean Request.shouldCache()>
	//*  26   45:ifne            59
		{
			mNetworkQueue.add(((Object) (request)));
	//   27   48:aload_0         
	//   28   49:getfield        #77  <Field PriorityBlockingQueue mNetworkQueue>
	//   29   52:aload_1         
	//   30   53:invokevirtual   #124 <Method boolean PriorityBlockingQueue.add(Object)>
	//   31   56:pop             
			return request;
	//   32   57:aload_1         
	//   33   58:areturn         
		} else
		{
			mCacheQueue.add(((Object) (request)));
	//   34   59:aload_0         
	//   35   60:getfield        #75  <Field PriorityBlockingQueue mCacheQueue>
	//   36   63:aload_1         
	//   37   64:invokevirtual   #124 <Method boolean PriorityBlockingQueue.add(Object)>
	//   38   67:pop             
			return request;
	//   39   68:aload_1         
	//   40   69:areturn         
		}
		request;
	//   41   70:astore_1        
		set;
	//   42   71:aload_2         
		JVM INSTR monitorexit ;
	//   43   72:monitorexit     
		throw request;
	//   44   73:aload_1         
	//   45   74:athrow          
	}

	void finish(Request request)
	{
		synchronized(mCurrentRequests)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Set mCurrentRequests>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mCurrentRequests.remove(((Object) (request)));
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field Set mCurrentRequests>
	//    7   11:aload_1         
	//    8   12:invokeinterface #131 <Method boolean Set.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		obj = ((Object) (mFinishedListeners));
	//   12   20:aload_0         
	//   13   21:getfield        #82  <Field List mFinishedListeners>
	//   14   24:astore_2        
		obj;
	//   15   25:aload_2         
		JVM INSTR monitorenter ;
	//   16   26:monitorenter    
		for(Iterator iterator = mFinishedListeners.iterator(); iterator.hasNext(); ((RequestFinishedListener)iterator.next()).onRequestFinished(request));
	//   17   27:aload_0         
	//   18   28:getfield        #82  <Field List mFinishedListeners>
	//   19   31:invokeinterface #137 <Method Iterator List.iterator()>
	//   20   36:astore_3        
	//   21   37:aload_3         
	//   22   38:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//   23   43:ifeq            64
	//   24   46:aload_3         
	//   25   47:invokeinterface #146 <Method Object Iterator.next()>
	//   26   52:checkcast       #9   <Class RequestQueue$RequestFinishedListener>
	//   27   55:aload_1         
	//   28   56:invokeinterface #149 <Method void RequestQueue$RequestFinishedListener.onRequestFinished(Request)>
	//*  29   61:goto            37
		obj;
	//   30   64:aload_2         
		JVM INSTR monitorexit ;
	//   31   65:monitorexit     
		return;
	//   32   66:return          
		request;
	//   33   67:astore_1        
		obj;
	//   34   68:aload_2         
		JVM INSTR monitorexit ;
	//   35   69:monitorexit     
		throw request;
	//   36   70:aload_1         
	//   37   71:athrow          
		request;
	//   38   72:astore_1        
		obj;
	//   39   73:aload_2         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		throw request;
	//   41   75:aload_1         
	//   42   76:athrow          
	}

	public int getSequenceNumber()
	{
		return mSequenceGenerator.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AtomicInteger mSequenceGenerator>
	//    2    4:invokevirtual   #153 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:ireturn         
	}

	public void start()
	{
		stop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method void stop()>
		mCacheDispatcher = new CacheDispatcher(((java.util.concurrent.BlockingQueue) (mCacheQueue)), ((java.util.concurrent.BlockingQueue) (mNetworkQueue)), mCache, mDelivery);
	//    2    4:aload_0         
	//    3    5:new             #159 <Class CacheDispatcher>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #75  <Field PriorityBlockingQueue mCacheQueue>
	//    7   13:aload_0         
	//    8   14:getfield        #77  <Field PriorityBlockingQueue mNetworkQueue>
	//    9   17:aload_0         
	//   10   18:getfield        #84  <Field Cache mCache>
	//   11   21:aload_0         
	//   12   22:getfield        #92  <Field ResponseDelivery mDelivery>
	//   13   25:invokespecial   #162 <Method void CacheDispatcher(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, Cache, ResponseDelivery)>
	//   14   28:putfield        #164 <Field CacheDispatcher mCacheDispatcher>
		mCacheDispatcher.start();
	//   15   31:aload_0         
	//   16   32:getfield        #164 <Field CacheDispatcher mCacheDispatcher>
	//   17   35:invokevirtual   #166 <Method void CacheDispatcher.start()>
		for(int i = 0; i < mDispatchers.length; i++)
	//*  18   38:iconst_0        
	//*  19   39:istore_1        
	//*  20   40:iload_1         
	//*  21   41:aload_0         
	//*  22   42:getfield        #90  <Field NetworkDispatcher[] mDispatchers>
	//*  23   45:arraylength     
	//*  24   46:icmpge          91
		{
			NetworkDispatcher networkdispatcher = new NetworkDispatcher(((java.util.concurrent.BlockingQueue) (mNetworkQueue)), mNetwork, mCache, mDelivery);
	//   25   49:new             #88  <Class NetworkDispatcher>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:getfield        #77  <Field PriorityBlockingQueue mNetworkQueue>
	//   29   57:aload_0         
	//   30   58:getfield        #86  <Field Network mNetwork>
	//   31   61:aload_0         
	//   32   62:getfield        #84  <Field Cache mCache>
	//   33   65:aload_0         
	//   34   66:getfield        #92  <Field ResponseDelivery mDelivery>
	//   35   69:invokespecial   #169 <Method void NetworkDispatcher(java.util.concurrent.BlockingQueue, Network, Cache, ResponseDelivery)>
	//   36   72:astore_2        
			mDispatchers[i] = networkdispatcher;
	//   37   73:aload_0         
	//   38   74:getfield        #90  <Field NetworkDispatcher[] mDispatchers>
	//   39   77:iload_1         
	//   40   78:aload_2         
	//   41   79:aastore         
			networkdispatcher.start();
	//   42   80:aload_2         
	//   43   81:invokevirtual   #170 <Method void NetworkDispatcher.start()>
		}

	//   44   84:iload_1         
	//   45   85:iconst_1        
	//   46   86:iadd            
	//   47   87:istore_1        
	//*  48   88:goto            40
	//   49   91:return          
	}

	public void stop()
	{
		CacheDispatcher cachedispatcher = mCacheDispatcher;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field CacheDispatcher mCacheDispatcher>
	//    2    4:astore_3        
		if(cachedispatcher != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          13
			cachedispatcher.quit();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #173 <Method void CacheDispatcher.quit()>
		NetworkDispatcher anetworkdispatcher[] = mDispatchers;
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field NetworkDispatcher[] mDispatchers>
	//    9   17:astore_3        
		int j = anetworkdispatcher.length;
	//   10   18:aload_3         
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          50
		{
			NetworkDispatcher networkdispatcher = anetworkdispatcher[i];
	//   18   28:aload_3         
	//   19   29:iload_1         
	//   20   30:aaload          
	//   21   31:astore          4
			if(networkdispatcher != null)
	//*  22   33:aload           4
	//*  23   35:ifnull          43
				networkdispatcher.quit();
	//   24   38:aload           4
	//   25   40:invokevirtual   #174 <Method void NetworkDispatcher.quit()>
		}

	//   26   43:iload_1         
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:istore_1        
	//*  30   47:goto            23
	//   31   50:return          
	}

	private final Cache mCache;
	private CacheDispatcher mCacheDispatcher;
	private final PriorityBlockingQueue mCacheQueue;
	private final Set mCurrentRequests;
	private final ResponseDelivery mDelivery;
	private final NetworkDispatcher mDispatchers[];
	private final List mFinishedListeners;
	private final Network mNetwork;
	private final PriorityBlockingQueue mNetworkQueue;
	private final AtomicInteger mSequenceGenerator;
}

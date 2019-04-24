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
//			ExecutorDelivery, NetworkDispatcher, Request, VolleyLog, 
//			CacheDispatcher, Cache, ResponseDelivery, Network

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
	//    4    4:invokespecial   #45  <Method void RequestQueue(Cache, Network, int)>
	//    5    7:return          
	}

	public RequestQueue(Cache cache, Network network, int i)
	{
		this(cache, network, i, ((ResponseDelivery) (new ExecutorDelivery(new Handler(Looper.getMainLooper())))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:new             #48  <Class ExecutorDelivery>
	//    5    7:dup             
	//    6    8:new             #50  <Class Handler>
	//    7   11:dup             
	//    8   12:invokestatic    #56  <Method Looper Looper.getMainLooper()>
	//    9   15:invokespecial   #59  <Method void Handler(Looper)>
	//   10   18:invokespecial   #62  <Method void ExecutorDelivery(Handler)>
	//   11   21:invokespecial   #65  <Method void RequestQueue(Cache, Network, int, ResponseDelivery)>
	//   12   24:return          
	}

	public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responsedelivery)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		mSequenceGenerator = new AtomicInteger();
	//    2    4:aload_0         
	//    3    5:new             #70  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:invokespecial   #71  <Method void AtomicInteger()>
	//    6   12:putfield        #73  <Field AtomicInteger mSequenceGenerator>
		mWaitingRequests = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #75  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #76  <Method void HashMap()>
	//   11   23:putfield        #78  <Field Map mWaitingRequests>
		mCurrentRequests = ((Set) (new HashSet()));
	//   12   26:aload_0         
	//   13   27:new             #80  <Class HashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #81  <Method void HashSet()>
	//   16   34:putfield        #83  <Field Set mCurrentRequests>
		mCacheQueue = new PriorityBlockingQueue();
	//   17   37:aload_0         
	//   18   38:new             #85  <Class PriorityBlockingQueue>
	//   19   41:dup             
	//   20   42:invokespecial   #86  <Method void PriorityBlockingQueue()>
	//   21   45:putfield        #88  <Field PriorityBlockingQueue mCacheQueue>
		mNetworkQueue = new PriorityBlockingQueue();
	//   22   48:aload_0         
	//   23   49:new             #85  <Class PriorityBlockingQueue>
	//   24   52:dup             
	//   25   53:invokespecial   #86  <Method void PriorityBlockingQueue()>
	//   26   56:putfield        #90  <Field PriorityBlockingQueue mNetworkQueue>
		mFinishedListeners = ((List) (new ArrayList()));
	//   27   59:aload_0         
	//   28   60:new             #92  <Class ArrayList>
	//   29   63:dup             
	//   30   64:invokespecial   #93  <Method void ArrayList()>
	//   31   67:putfield        #95  <Field List mFinishedListeners>
		mCache = cache;
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:putfield        #97  <Field Cache mCache>
		mNetwork = network;
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:putfield        #99  <Field Network mNetwork>
		mDispatchers = new NetworkDispatcher[i];
	//   38   80:aload_0         
	//   39   81:iload_3         
	//   40   82:anewarray       NetworkDispatcher[]
	//   41   85:putfield        #103 <Field NetworkDispatcher[] mDispatchers>
		mDelivery = responsedelivery;
	//   42   88:aload_0         
	//   43   89:aload           4
	//   44   91:putfield        #105 <Field ResponseDelivery mDelivery>
	//   45   94:return          
	}

	public Request add(Request request)
	{
		request.setRequestQueue(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #113 <Method Request Request.setRequestQueue(RequestQueue)>
	//    3    5:pop             
		Object obj = ((Object) (mCurrentRequests));
	//    4    6:aload_0         
	//    5    7:getfield        #83  <Field Set mCurrentRequests>
	//    6   10:astore_2        
		obj;
	//    7   11:aload_2         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		mCurrentRequests.add(((Object) (request)));
	//    9   13:aload_0         
	//   10   14:getfield        #83  <Field Set mCurrentRequests>
	//   11   17:aload_1         
	//   12   18:invokeinterface #118 <Method boolean Set.add(Object)>
	//   13   23:pop             
		obj;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		  goto _L1
	//*  16   26:goto            34
		request;
	//   17   29:astore_1        
	//*  18   30:aload_2         
		throw request;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
_L1:
		request.setSequence(getSequenceNumber());
	//   22   34:aload_1         
	//   23   35:aload_0         
	//   24   36:invokevirtual   #122 <Method int getSequenceNumber()>
	//   25   39:invokevirtual   #126 <Method Request Request.setSequence(int)>
	//   26   42:pop             
		request.addMarker("add-to-queue");
	//   27   43:aload_1         
	//   28   44:ldc1            #128 <String "add-to-queue">
	//   29   46:invokevirtual   #132 <Method void Request.addMarker(String)>
		if(!request.shouldCache())
	//*  30   49:aload_1         
	//*  31   50:invokevirtual   #136 <Method boolean Request.shouldCache()>
	//*  32   53:ifne            67
		{
			mNetworkQueue.add(((Object) (request)));
	//   33   56:aload_0         
	//   34   57:getfield        #90  <Field PriorityBlockingQueue mNetworkQueue>
	//   35   60:aload_1         
	//   36   61:invokevirtual   #137 <Method boolean PriorityBlockingQueue.add(Object)>
	//   37   64:pop             
			return request;
	//   38   65:aload_1         
	//   39   66:areturn         
		}
		Map map = mWaitingRequests;
	//   40   67:aload_0         
	//   41   68:getfield        #78  <Field Map mWaitingRequests>
	//   42   71:astore          4
		map;
	//   43   73:aload           4
		JVM INSTR monitorenter ;
	//   44   75:monitorenter    
		Queue queue;
		String s;
		s = request.getCacheKey();
	//   45   76:aload_1         
	//   46   77:invokevirtual   #141 <Method String Request.getCacheKey()>
	//   47   80:astore          5
		if(!mWaitingRequests.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_169;
	//   48   82:aload_0         
	//   49   83:getfield        #78  <Field Map mWaitingRequests>
	//   50   86:aload           5
	//   51   88:invokeinterface #146 <Method boolean Map.containsKey(Object)>
	//   52   93:ifeq            169
		queue = (Queue)mWaitingRequests.get(((Object) (s)));
	//   53   96:aload_0         
	//   54   97:getfield        #78  <Field Map mWaitingRequests>
	//   55  100:aload           5
	//   56  102:invokeinterface #150 <Method Object Map.get(Object)>
	//   57  107:checkcast       #152 <Class Queue>
	//   58  110:astore_3        
		obj = ((Object) (queue));
	//   59  111:aload_3         
	//   60  112:astore_2        
		if(queue != null)
			break MISSING_BLOCK_LABEL_125;
	//   61  113:aload_3         
	//   62  114:ifnonnull       125
		obj = ((Object) (new LinkedList()));
	//   63  117:new             #154 <Class LinkedList>
	//   64  120:dup             
	//   65  121:invokespecial   #155 <Method void LinkedList()>
	//   66  124:astore_2        
		((Queue) (obj)).add(((Object) (request)));
	//   67  125:aload_2         
	//   68  126:aload_1         
	//   69  127:invokeinterface #156 <Method boolean Queue.add(Object)>
	//   70  132:pop             
		mWaitingRequests.put(((Object) (s)), obj);
	//   71  133:aload_0         
	//   72  134:getfield        #78  <Field Map mWaitingRequests>
	//   73  137:aload           5
	//   74  139:aload_2         
	//   75  140:invokeinterface #160 <Method Object Map.put(Object, Object)>
	//   76  145:pop             
		if(VolleyLog.DEBUG)
	//*  77  146:getstatic       #166 <Field boolean VolleyLog.DEBUG>
	//*  78  149:ifeq            202
			VolleyLog.v("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
				s
			});
	//   79  152:ldc1            #168 <String "Request for cacheKey=%s is in flight, putting on hold.">
	//   80  154:iconst_1        
	//   81  155:anewarray       Object[]
	//   82  158:dup             
	//   83  159:iconst_0        
	//   84  160:aload           5
	//   85  162:aastore         
	//   86  163:invokestatic    #172 <Method void VolleyLog.v(String, Object[])>
		break MISSING_BLOCK_LABEL_191;
	//   87  166:goto            202
		mWaitingRequests.put(((Object) (s)), ((Object) (null)));
	//   88  169:aload_0         
	//   89  170:getfield        #78  <Field Map mWaitingRequests>
	//   90  173:aload           5
	//   91  175:aconst_null     
	//   92  176:invokeinterface #160 <Method Object Map.put(Object, Object)>
	//   93  181:pop             
		mCacheQueue.add(((Object) (request)));
	//   94  182:aload_0         
	//   95  183:getfield        #88  <Field PriorityBlockingQueue mCacheQueue>
	//   96  186:aload_1         
	//   97  187:invokevirtual   #137 <Method boolean PriorityBlockingQueue.add(Object)>
	//   98  190:pop             
		map;
	//   99  191:aload           4
		JVM INSTR monitorexit ;
	//  100  193:monitorexit     
		return request;
	//  101  194:aload_1         
	//  102  195:areturn         
		request;
	//  103  196:astore_1        
	//* 104  197:aload           4
		throw request;
	//  105  199:monitorexit     
	//  106  200:aload_1         
	//  107  201:athrow          
	//* 108  202:goto            191
	}

	public void addRequestFinishedListener(RequestFinishedListener requestfinishedlistener)
	{
		List list = mFinishedListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List mFinishedListeners>
	//    2    4:astore_2        
		list;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mFinishedListeners.add(((Object) (requestfinishedlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field List mFinishedListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #179 <Method boolean List.add(Object)>
	//    9   17:pop             
		list;
	//   10   18:aload_2         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		requestfinishedlistener;
	//   13   21:astore_1        
	//*  14   22:aload_2         
		throw requestfinishedlistener;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void cancelAll(RequestFilter requestfilter)
	{
		Set set = mCurrentRequests;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Set mCurrentRequests>
	//    2    4:astore_2        
		set;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = mCurrentRequests.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field Set mCurrentRequests>
	//    7   11:invokeinterface #186 <Method Iterator Set.iterator()>
	//    8   16:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   17:aload_3         
	//   10   18:invokeinterface #191 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            56
			Request request = (Request)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #195 <Method Object Iterator.next()>
	//   14   32:checkcast       #109 <Class Request>
	//   15   35:astore          4
			if(requestfilter.apply(request))
	//*  16   37:aload_1         
	//*  17   38:aload           4
	//*  18   40:invokeinterface #199 <Method boolean RequestQueue$RequestFilter.apply(Request)>
	//*  19   45:ifeq            53
				request.cancel();
	//   20   48:aload           4
	//   21   50:invokevirtual   #202 <Method void Request.cancel()>
		} while(true);
	//   22   53:goto            17
		set;
	//   23   56:aload_2         
		JVM INSTR monitorexit ;
	//   24   57:monitorexit     
		return;
	//   25   58:return          
		requestfilter;
	//   26   59:astore_1        
	//*  27   60:aload_2         
		throw requestfilter;
	//   28   61:monitorexit     
	//   29   62:aload_1         
	//   30   63:athrow          
	}

	public void cancelAll(final Object tag)
	{
		if(tag == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Cannot cancelAll with a null tag");
	//    2    4:new             #205 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #207 <String "Cannot cancelAll with a null tag">
	//    5   10:invokespecial   #209 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			cancelAll(new RequestFilter() {

				public boolean apply(Request request)
				{
					return request.getTag() == tag;
				//    0    0:aload_1         
				//    1    1:invokevirtual   #33  <Method Object Request.getTag()>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field Object val$tag>
				//    4    8:if_acmpne       13
				//    5   11:iconst_1        
				//    6   12:ireturn         
				//    7   13:iconst_0        
				//    8   14:ireturn         
				}

				final RequestQueue this$0;
				final Object val$tag;

			
			{
				this$0 = RequestQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RequestQueue this$0>
				tag = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$tag>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    7   14:aload_0         
	//    8   15:new             #6   <Class RequestQueue$1>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokespecial   #212 <Method void RequestQueue$1(RequestQueue, Object)>
	//   13   24:invokevirtual   #214 <Method void cancelAll(RequestQueue$RequestFilter)>
			return;
	//   14   27:return          
		}
	}

	void finish(Request request)
	{
		Object obj = ((Object) (mCurrentRequests));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Set mCurrentRequests>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mCurrentRequests.remove(((Object) (request)));
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field Set mCurrentRequests>
	//    7   11:aload_1         
	//    8   12:invokeinterface #219 <Method boolean Set.remove(Object)>
	//    9   17:pop             
		obj;
	//   10   18:aload_2         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		  goto _L1
	//*  12   20:goto            28
		request;
	//   13   23:astore_1        
	//*  14   24:aload_2         
		throw request;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
_L1:
		obj = ((Object) (mFinishedListeners));
	//   18   28:aload_0         
	//   19   29:getfield        #95  <Field List mFinishedListeners>
	//   20   32:astore_2        
		obj;
	//   21   33:aload_2         
		JVM INSTR monitorenter ;
	//   22   34:monitorenter    
		for(Iterator iterator = mFinishedListeners.iterator(); iterator.hasNext(); ((RequestFinishedListener)iterator.next()).onRequestFinished(request));
	//   23   35:aload_0         
	//   24   36:getfield        #95  <Field List mFinishedListeners>
	//   25   39:invokeinterface #220 <Method Iterator List.iterator()>
	//   26   44:astore_3        
	//   27   45:aload_3         
	//   28   46:invokeinterface #191 <Method boolean Iterator.hasNext()>
	//   29   51:ifeq            72
	//   30   54:aload_3         
	//   31   55:invokeinterface #195 <Method Object Iterator.next()>
	//   32   60:checkcast       #11  <Class RequestQueue$RequestFinishedListener>
	//   33   63:aload_1         
	//   34   64:invokeinterface #223 <Method void RequestQueue$RequestFinishedListener.onRequestFinished(Request)>
	//*  35   69:goto            45
		obj;
	//   36   72:aload_2         
		JVM INSTR monitorexit ;
	//   37   73:monitorexit     
		  goto _L2
	//*  38   74:goto            82
		request;
	//   39   77:astore_1        
	//*  40   78:aload_2         
		throw request;
	//   41   79:monitorexit     
	//   42   80:aload_1         
	//   43   81:athrow          
_L2:
		if(!request.shouldCache())
			break MISSING_BLOCK_LABEL_167;
	//   44   82:aload_1         
	//   45   83:invokevirtual   #136 <Method boolean Request.shouldCache()>
	//   46   86:ifeq            167
		obj = ((Object) (mWaitingRequests));
	//   47   89:aload_0         
	//   48   90:getfield        #78  <Field Map mWaitingRequests>
	//   49   93:astore_2        
		obj;
	//   50   94:aload_2         
		JVM INSTR monitorenter ;
	//   51   95:monitorenter    
		Queue queue;
		request = ((Request) (request.getCacheKey()));
	//   52   96:aload_1         
	//   53   97:invokevirtual   #141 <Method String Request.getCacheKey()>
	//   54  100:astore_1        
		queue = (Queue)mWaitingRequests.remove(((Object) (request)));
	//   55  101:aload_0         
	//   56  102:getfield        #78  <Field Map mWaitingRequests>
	//   57  105:aload_1         
	//   58  106:invokeinterface #225 <Method Object Map.remove(Object)>
	//   59  111:checkcast       #152 <Class Queue>
	//   60  114:astore_3        
		if(queue == null)
			break MISSING_BLOCK_LABEL_159;
	//   61  115:aload_3         
	//   62  116:ifnull          159
		if(VolleyLog.DEBUG)
	//*  63  119:getstatic       #166 <Field boolean VolleyLog.DEBUG>
	//*  64  122:ifeq            150
			VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
				Integer.valueOf(queue.size()), request
			});
	//   65  125:ldc1            #227 <String "Releasing %d waiting requests for cacheKey=%s.">
	//   66  127:iconst_2        
	//   67  128:anewarray       Object[]
	//   68  131:dup             
	//   69  132:iconst_0        
	//   70  133:aload_3         
	//   71  134:invokeinterface #230 <Method int Queue.size()>
	//   72  139:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   73  142:aastore         
	//   74  143:dup             
	//   75  144:iconst_1        
	//   76  145:aload_1         
	//   77  146:aastore         
	//   78  147:invokestatic    #172 <Method void VolleyLog.v(String, Object[])>
		mCacheQueue.addAll(((java.util.Collection) (queue)));
	//   79  150:aload_0         
	//   80  151:getfield        #88  <Field PriorityBlockingQueue mCacheQueue>
	//   81  154:aload_3         
	//   82  155:invokevirtual   #240 <Method boolean PriorityBlockingQueue.addAll(java.util.Collection)>
	//   83  158:pop             
		obj;
	//   84  159:aload_2         
		JVM INSTR monitorexit ;
	//   85  160:monitorexit     
		return;
	//   86  161:return          
		request;
	//   87  162:astore_1        
	//*  88  163:aload_2         
		throw request;
	//   89  164:monitorexit     
	//   90  165:aload_1         
	//   91  166:athrow          
	//   92  167:return          
	}

	public Cache getCache()
	{
		return mCache;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Cache mCache>
	//    2    4:areturn         
	}

	public int getSequenceNumber()
	{
		return mSequenceGenerator.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field AtomicInteger mSequenceGenerator>
	//    2    4:invokevirtual   #246 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:ireturn         
	}

	public void removeRequestFinishedListener(RequestFinishedListener requestfinishedlistener)
	{
		List list = mFinishedListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field List mFinishedListeners>
	//    2    4:astore_2        
		list;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mFinishedListeners.remove(((Object) (requestfinishedlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field List mFinishedListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #248 <Method boolean List.remove(Object)>
	//    9   17:pop             
		list;
	//   10   18:aload_2         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		requestfinishedlistener;
	//   13   21:astore_1        
	//*  14   22:aload_2         
		throw requestfinishedlistener;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void start()
	{
		stop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method void stop()>
		mCacheDispatcher = new CacheDispatcher(((java.util.concurrent.BlockingQueue) (mCacheQueue)), ((java.util.concurrent.BlockingQueue) (mNetworkQueue)), mCache, mDelivery);
	//    2    4:aload_0         
	//    3    5:new             #254 <Class CacheDispatcher>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field PriorityBlockingQueue mCacheQueue>
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field PriorityBlockingQueue mNetworkQueue>
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field Cache mCache>
	//   11   21:aload_0         
	//   12   22:getfield        #105 <Field ResponseDelivery mDelivery>
	//   13   25:invokespecial   #257 <Method void CacheDispatcher(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, Cache, ResponseDelivery)>
	//   14   28:putfield        #259 <Field CacheDispatcher mCacheDispatcher>
		mCacheDispatcher.start();
	//   15   31:aload_0         
	//   16   32:getfield        #259 <Field CacheDispatcher mCacheDispatcher>
	//   17   35:invokevirtual   #261 <Method void CacheDispatcher.start()>
		for(int i = 0; i < mDispatchers.length; i++)
	//*  18   38:iconst_0        
	//*  19   39:istore_1        
	//*  20   40:iload_1         
	//*  21   41:aload_0         
	//*  22   42:getfield        #103 <Field NetworkDispatcher[] mDispatchers>
	//*  23   45:arraylength     
	//*  24   46:icmpge          91
		{
			NetworkDispatcher networkdispatcher = new NetworkDispatcher(((java.util.concurrent.BlockingQueue) (mNetworkQueue)), mNetwork, mCache, mDelivery);
	//   25   49:new             #101 <Class NetworkDispatcher>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:getfield        #90  <Field PriorityBlockingQueue mNetworkQueue>
	//   29   57:aload_0         
	//   30   58:getfield        #99  <Field Network mNetwork>
	//   31   61:aload_0         
	//   32   62:getfield        #97  <Field Cache mCache>
	//   33   65:aload_0         
	//   34   66:getfield        #105 <Field ResponseDelivery mDelivery>
	//   35   69:invokespecial   #264 <Method void NetworkDispatcher(java.util.concurrent.BlockingQueue, Network, Cache, ResponseDelivery)>
	//   36   72:astore_2        
			mDispatchers[i] = networkdispatcher;
	//   37   73:aload_0         
	//   38   74:getfield        #103 <Field NetworkDispatcher[] mDispatchers>
	//   39   77:iload_1         
	//   40   78:aload_2         
	//   41   79:aastore         
			networkdispatcher.start();
	//   42   80:aload_2         
	//   43   81:invokevirtual   #265 <Method void NetworkDispatcher.start()>
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
		if(mCacheDispatcher != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #259 <Field CacheDispatcher mCacheDispatcher>
	//*   2    4:ifnull          14
			mCacheDispatcher.quit();
	//    3    7:aload_0         
	//    4    8:getfield        #259 <Field CacheDispatcher mCacheDispatcher>
	//    5   11:invokevirtual   #268 <Method void CacheDispatcher.quit()>
		for(int i = 0; i < mDispatchers.length; i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_1        
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #103 <Field NetworkDispatcher[] mDispatchers>
	//*  11   21:arraylength     
	//*  12   22:icmpge          50
			if(mDispatchers[i] != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #103 <Field NetworkDispatcher[] mDispatchers>
	//*  15   29:iload_1         
	//*  16   30:aaload          
	//*  17   31:ifnull          43
				mDispatchers[i].quit();
	//   18   34:aload_0         
	//   19   35:getfield        #103 <Field NetworkDispatcher[] mDispatchers>
	//   20   38:iload_1         
	//   21   39:aaload          
	//   22   40:invokevirtual   #269 <Method void NetworkDispatcher.quit()>

	//   23   43:iload_1         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_1        
	//*  27   47:goto            16
	//   28   50:return          
	}

	private static final int DEFAULT_NETWORK_THREAD_POOL_SIZE = 4;
	private final Cache mCache;
	private CacheDispatcher mCacheDispatcher;
	private final PriorityBlockingQueue mCacheQueue;
	private final Set mCurrentRequests;
	private final ResponseDelivery mDelivery;
	private NetworkDispatcher mDispatchers[];
	private List mFinishedListeners;
	private final Network mNetwork;
	private final PriorityBlockingQueue mNetworkQueue;
	private AtomicInteger mSequenceGenerator;
	private final Map mWaitingRequests;
}

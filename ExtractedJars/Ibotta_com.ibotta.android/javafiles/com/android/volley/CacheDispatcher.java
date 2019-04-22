// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.Process;
import java.util.*;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//			VolleyLog, Request, Cache, NetworkResponse, 
//			ResponseDelivery, Response

public class CacheDispatcher extends Thread
{
	private static class WaitingRequestManager
		implements Request.NetworkRequestCompleteListener
	{

		private boolean maybeAddToWaitingRequests(Request request)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			List list;
			String s;
			s = request.getCacheKey();
		//    2    2:aload_1         
		//    3    3:invokevirtual   #39  <Method String Request.getCacheKey()>
		//    4    6:astore          4
			if(!mWaitingRequests.containsKey(((Object) (s))))
				break MISSING_BLOCK_LABEL_102;
		//    5    8:aload_0         
		//    6    9:getfield        #24  <Field Map mWaitingRequests>
		//    7   12:aload           4
		//    8   14:invokeinterface #45  <Method boolean Map.containsKey(Object)>
		//    9   19:ifeq            102
			list = (List)mWaitingRequests.get(((Object) (s)));
		//   10   22:aload_0         
		//   11   23:getfield        #24  <Field Map mWaitingRequests>
		//   12   26:aload           4
		//   13   28:invokeinterface #49  <Method Object Map.get(Object)>
		//   14   33:checkcast       #51  <Class List>
		//   15   36:astore_3        
			Object obj;
			obj = ((Object) (list));
		//   16   37:aload_3         
		//   17   38:astore_2        
			if(list != null)
				break MISSING_BLOCK_LABEL_51;
		//   18   39:aload_3         
		//   19   40:ifnonnull       51
			obj = ((Object) (new ArrayList()));
		//   20   43:new             #53  <Class ArrayList>
		//   21   46:dup             
		//   22   47:invokespecial   #54  <Method void ArrayList()>
		//   23   50:astore_2        
			request.addMarker("waiting-for-response");
		//   24   51:aload_1         
		//   25   52:ldc1            #56  <String "waiting-for-response">
		//   26   54:invokevirtual   #60  <Method void Request.addMarker(String)>
			((List) (obj)).add(((Object) (request)));
		//   27   57:aload_2         
		//   28   58:aload_1         
		//   29   59:invokeinterface #63  <Method boolean List.add(Object)>
		//   30   64:pop             
			mWaitingRequests.put(((Object) (s)), obj);
		//   31   65:aload_0         
		//   32   66:getfield        #24  <Field Map mWaitingRequests>
		//   33   69:aload           4
		//   34   71:aload_2         
		//   35   72:invokeinterface #67  <Method Object Map.put(Object, Object)>
		//   36   77:pop             
			if(VolleyLog.DEBUG)
		//*  37   78:getstatic       #73  <Field boolean VolleyLog.DEBUG>
		//*  38   81:ifeq            98
				VolleyLog.d("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
					s
				});
		//   39   84:ldc1            #75  <String "Request for cacheKey=%s is in flight, putting on hold.">
		//   40   86:iconst_1        
		//   41   87:anewarray       Object[]
		//   42   90:dup             
		//   43   91:iconst_0        
		//   44   92:aload           4
		//   45   94:aastore         
		//   46   95:invokestatic    #79  <Method void VolleyLog.d(String, Object[])>
			this;
		//   47   98:aload_0         
			JVM INSTR monitorexit ;
		//   48   99:monitorexit     
			return true;
		//   49  100:iconst_1        
		//   50  101:ireturn         
			mWaitingRequests.put(((Object) (s)), ((Object) (null)));
		//   51  102:aload_0         
		//   52  103:getfield        #24  <Field Map mWaitingRequests>
		//   53  106:aload           4
		//   54  108:aconst_null     
		//   55  109:invokeinterface #67  <Method Object Map.put(Object, Object)>
		//   56  114:pop             
			request.setNetworkRequestCompleteListener(((Request.NetworkRequestCompleteListener) (this)));
		//   57  115:aload_1         
		//   58  116:aload_0         
		//   59  117:invokevirtual   #83  <Method void Request.setNetworkRequestCompleteListener(Request$NetworkRequestCompleteListener)>
			if(VolleyLog.DEBUG)
		//*  60  120:getstatic       #73  <Field boolean VolleyLog.DEBUG>
		//*  61  123:ifeq            140
				VolleyLog.d("new request, sending to network %s", new Object[] {
					s
				});
		//   62  126:ldc1            #85  <String "new request, sending to network %s">
		//   63  128:iconst_1        
		//   64  129:anewarray       Object[]
		//   65  132:dup             
		//   66  133:iconst_0        
		//   67  134:aload           4
		//   68  136:aastore         
		//   69  137:invokestatic    #79  <Method void VolleyLog.d(String, Object[])>
			this;
		//   70  140:aload_0         
			JVM INSTR monitorexit ;
		//   71  141:monitorexit     
			return false;
		//   72  142:iconst_0        
		//   73  143:ireturn         
			request;
		//   74  144:astore_1        
		//*  75  145:aload_0         
			throw request;
		//   76  146:monitorexit     
		//   77  147:aload_1         
		//   78  148:athrow          
		}

		public void onNoUsableResponseReceived(Request request)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			List list;
			request = ((Request) (request.getCacheKey()));
		//    2    2:aload_1         
		//    3    3:invokevirtual   #39  <Method String Request.getCacheKey()>
		//    4    6:astore_1        
			list = (List)mWaitingRequests.remove(((Object) (request)));
		//    5    7:aload_0         
		//    6    8:getfield        #24  <Field Map mWaitingRequests>
		//    7   11:aload_1         
		//    8   12:invokeinterface #94  <Method Object Map.remove(Object)>
		//    9   17:checkcast       #51  <Class List>
		//   10   20:astore_2        
			if(list == null)
				break MISSING_BLOCK_LABEL_139;
		//   11   21:aload_2         
		//   12   22:ifnull          139
			Request request1;
			if(list.isEmpty())
				break MISSING_BLOCK_LABEL_139;
		//   13   25:aload_2         
		//   14   26:invokeinterface #98  <Method boolean List.isEmpty()>
		//   15   31:ifne            139
			if(VolleyLog.DEBUG)
		//*  16   34:getstatic       #73  <Field boolean VolleyLog.DEBUG>
		//*  17   37:ifeq            65
				VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", new Object[] {
					Integer.valueOf(list.size()), request
				});
		//   18   40:ldc1            #100 <String "%d waiting requests for cacheKey=%s; resend to network">
		//   19   42:iconst_2        
		//   20   43:anewarray       Object[]
		//   21   46:dup             
		//   22   47:iconst_0        
		//   23   48:aload_2         
		//   24   49:invokeinterface #104 <Method int List.size()>
		//   25   54:invokestatic    #110 <Method Integer Integer.valueOf(int)>
		//   26   57:aastore         
		//   27   58:dup             
		//   28   59:iconst_1        
		//   29   60:aload_1         
		//   30   61:aastore         
		//   31   62:invokestatic    #113 <Method void VolleyLog.v(String, Object[])>
			request1 = (Request)list.remove(0);
		//   32   65:aload_2         
		//   33   66:iconst_0        
		//   34   67:invokeinterface #116 <Method Object List.remove(int)>
		//   35   72:checkcast       #35  <Class Request>
		//   36   75:astore_3        
			mWaitingRequests.put(((Object) (request)), ((Object) (list)));
		//   37   76:aload_0         
		//   38   77:getfield        #24  <Field Map mWaitingRequests>
		//   39   80:aload_1         
		//   40   81:aload_2         
		//   41   82:invokeinterface #67  <Method Object Map.put(Object, Object)>
		//   42   87:pop             
			request1.setNetworkRequestCompleteListener(((Request.NetworkRequestCompleteListener) (this)));
		//   43   88:aload_3         
		//   44   89:aload_0         
		//   45   90:invokevirtual   #83  <Method void Request.setNetworkRequestCompleteListener(Request$NetworkRequestCompleteListener)>
			try
			{
				mCacheDispatcher.mNetworkQueue.put(((Object) (request1)));
		//   46   93:aload_0         
		//   47   94:getfield        #26  <Field CacheDispatcher mCacheDispatcher>
		//   48   97:invokestatic    #120 <Method BlockingQueue CacheDispatcher.access$100(CacheDispatcher)>
		//   49  100:aload_3         
		//   50  101:invokeinterface #125 <Method void BlockingQueue.put(Object)>
				break MISSING_BLOCK_LABEL_139;
		//   51  106:goto            139
			}
			// Misplaced declaration of an exception variable
			catch(Request request) { }
		//   52  109:astore_1        
			VolleyLog.e("Couldn't add request to queue. %s", new Object[] {
				((InterruptedException) (request)).toString()
			});
		//   53  110:ldc1            #127 <String "Couldn't add request to queue. %s">
		//   54  112:iconst_1        
		//   55  113:anewarray       Object[]
		//   56  116:dup             
		//   57  117:iconst_0        
		//   58  118:aload_1         
		//   59  119:invokevirtual   #130 <Method String InterruptedException.toString()>
		//   60  122:aastore         
		//   61  123:invokestatic    #133 <Method void VolleyLog.e(String, Object[])>
			Thread.currentThread().interrupt();
		//   62  126:invokestatic    #139 <Method Thread Thread.currentThread()>
		//   63  129:invokevirtual   #142 <Method void Thread.interrupt()>
			mCacheDispatcher.quit();
		//   64  132:aload_0         
		//   65  133:getfield        #26  <Field CacheDispatcher mCacheDispatcher>
		//   66  136:invokevirtual   #145 <Method void CacheDispatcher.quit()>
			this;
		//   67  139:aload_0         
			JVM INSTR monitorexit ;
		//   68  140:monitorexit     
			return;
		//   69  141:return          
			request;
		//   70  142:astore_1        
		//*  71  143:aload_0         
			throw request;
		//   72  144:monitorexit     
		//   73  145:aload_1         
		//   74  146:athrow          
		}

		public void onResponseReceived(Request request, Response response)
		{
			if(response.cacheEntry == null || response.cacheEntry.isExpired())
		//*   0    0:aload_2         
		//*   1    1:getfield        #154 <Field Cache$Entry Response.cacheEntry>
		//*   2    4:ifnull          127
		//*   3    7:aload_2         
		//*   4    8:getfield        #154 <Field Cache$Entry Response.cacheEntry>
		//*   5   11:invokevirtual   #159 <Method boolean Cache$Entry.isExpired()>
		//*   6   14:ifeq            20
				break MISSING_BLOCK_LABEL_127;
		//    7   17:goto            127
			request = ((Request) (request.getCacheKey()));
		//    8   20:aload_1         
		//    9   21:invokevirtual   #39  <Method String Request.getCacheKey()>
		//   10   24:astore_1        
			this;
		//   11   25:aload_0         
			JVM INSTR monitorenter ;
		//   12   26:monitorenter    
			Object obj = ((Object) ((List)mWaitingRequests.remove(((Object) (request)))));
		//   13   27:aload_0         
		//   14   28:getfield        #24  <Field Map mWaitingRequests>
		//   15   31:aload_1         
		//   16   32:invokeinterface #94  <Method Object Map.remove(Object)>
		//   17   37:checkcast       #51  <Class List>
		//   18   40:astore_3        
			this;
		//   19   41:aload_0         
			JVM INSTR monitorexit ;
		//   20   42:monitorexit     
			if(obj != null)
		//*  21   43:aload_3         
		//*  22   44:ifnull          121
			{
				if(VolleyLog.DEBUG)
		//*  23   47:getstatic       #73  <Field boolean VolleyLog.DEBUG>
		//*  24   50:ifeq            78
					VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
						Integer.valueOf(((List) (obj)).size()), request
					});
		//   25   53:ldc1            #161 <String "Releasing %d waiting requests for cacheKey=%s.">
		//   26   55:iconst_2        
		//   27   56:anewarray       Object[]
		//   28   59:dup             
		//   29   60:iconst_0        
		//   30   61:aload_3         
		//   31   62:invokeinterface #104 <Method int List.size()>
		//   32   67:invokestatic    #110 <Method Integer Integer.valueOf(int)>
		//   33   70:aastore         
		//   34   71:dup             
		//   35   72:iconst_1        
		//   36   73:aload_1         
		//   37   74:aastore         
		//   38   75:invokestatic    #113 <Method void VolleyLog.v(String, Object[])>
				for(request = ((Request) (((List) (obj)).iterator())); ((Iterator) (request)).hasNext(); mCacheDispatcher.mDelivery.postResponse(((Request) (obj)), response))
		//*  39   78:aload_3         
		//*  40   79:invokeinterface #165 <Method Iterator List.iterator()>
		//*  41   84:astore_1        
		//*  42   85:aload_1         
		//*  43   86:invokeinterface #170 <Method boolean Iterator.hasNext()>
		//*  44   91:ifeq            121
					obj = ((Object) ((Request)((Iterator) (request)).next()));
		//   45   94:aload_1         
		//   46   95:invokeinterface #174 <Method Object Iterator.next()>
		//   47  100:checkcast       #35  <Class Request>
		//   48  103:astore_3        

		//   49  104:aload_0         
		//   50  105:getfield        #26  <Field CacheDispatcher mCacheDispatcher>
		//   51  108:invokestatic    #178 <Method ResponseDelivery CacheDispatcher.access$200(CacheDispatcher)>
		//   52  111:aload_3         
		//   53  112:aload_2         
		//   54  113:invokeinterface #183 <Method void ResponseDelivery.postResponse(Request, Response)>
			}
		//*  55  118:goto            85
			return;
		//   56  121:return          
			request;
		//   57  122:astore_1        
			this;
		//   58  123:aload_0         
			JVM INSTR monitorexit ;
		//   59  124:monitorexit     
			throw request;
		//   60  125:aload_1         
		//   61  126:athrow          
			onNoUsableResponseReceived(request);
		//   62  127:aload_0         
		//   63  128:aload_1         
		//   64  129:invokevirtual   #185 <Method void onNoUsableResponseReceived(Request)>
			return;
		//   65  132:return          
		}

		private final CacheDispatcher mCacheDispatcher;
		private final Map mWaitingRequests = new HashMap();


/*
		static boolean access$000(WaitingRequestManager waitingrequestmanager, Request request)
		{
			return waitingrequestmanager.maybeAddToWaitingRequests(request);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method boolean maybeAddToWaitingRequests(Request)>
		//    3    5:ireturn         
		}

*/

		WaitingRequestManager(CacheDispatcher cachedispatcher)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void HashMap()>
		//    6   12:putfield        #24  <Field Map mWaitingRequests>
			mCacheDispatcher = cachedispatcher;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #26  <Field CacheDispatcher mCacheDispatcher>
		//   10   20:return          
		}
	}


	public CacheDispatcher(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, Cache cache, ResponseDelivery responsedelivery)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Thread()>
		mQuit = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean mQuit>
		mCacheQueue = blockingqueue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #38  <Field BlockingQueue mCacheQueue>
		mNetworkQueue = blockingqueue1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #40  <Field BlockingQueue mNetworkQueue>
		mCache = cache;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #42  <Field Cache mCache>
		mDelivery = responsedelivery;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #44  <Field ResponseDelivery mDelivery>
	//   17   30:aload_0         
	//   18   31:new             #8   <Class CacheDispatcher$WaitingRequestManager>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:invokespecial   #47  <Method void CacheDispatcher$WaitingRequestManager(CacheDispatcher)>
	//   22   39:putfield        #49  <Field CacheDispatcher$WaitingRequestManager mWaitingRequestManager>
	//   23   42:return          
	}

	private void processRequest()
		throws InterruptedException
	{
		final Request request = (Request)mCacheQueue.take();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BlockingQueue mCacheQueue>
	//    2    4:invokeinterface #64  <Method Object BlockingQueue.take()>
	//    3    9:checkcast       #66  <Class Request>
	//    4   12:astore_1        
		request.addMarker("cache-queue-take");
	//    5   13:aload_1         
	//    6   14:ldc1            #68  <String "cache-queue-take">
	//    7   16:invokevirtual   #72  <Method void Request.addMarker(String)>
		if(request.isCanceled())
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #76  <Method boolean Request.isCanceled()>
	//*  10   23:ifeq            33
		{
			request.finish("cache-discard-canceled");
	//   11   26:aload_1         
	//   12   27:ldc1            #78  <String "cache-discard-canceled">
	//   13   29:invokevirtual   #81  <Method void Request.finish(String)>
			return;
	//   14   32:return          
		}
		Cache.Entry entry = mCache.get(request.getCacheKey());
	//   15   33:aload_0         
	//   16   34:getfield        #42  <Field Cache mCache>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #85  <Method String Request.getCacheKey()>
	//   19   41:invokeinterface #91  <Method Cache$Entry Cache.get(String)>
	//   20   46:astore_2        
		if(entry == null)
	//*  21   47:aload_2         
	//*  22   48:ifnonnull       79
		{
			request.addMarker("cache-miss");
	//   23   51:aload_1         
	//   24   52:ldc1            #93  <String "cache-miss">
	//   25   54:invokevirtual   #72  <Method void Request.addMarker(String)>
			if(!mWaitingRequestManager.maybeAddToWaitingRequests(request))
	//*  26   57:aload_0         
	//*  27   58:getfield        #49  <Field CacheDispatcher$WaitingRequestManager mWaitingRequestManager>
	//*  28   61:aload_1         
	//*  29   62:invokestatic    #97  <Method boolean CacheDispatcher$WaitingRequestManager.access$000(CacheDispatcher$WaitingRequestManager, Request)>
	//*  30   65:ifne            78
				mNetworkQueue.put(((Object) (request)));
	//   31   68:aload_0         
	//   32   69:getfield        #40  <Field BlockingQueue mNetworkQueue>
	//   33   72:aload_1         
	//   34   73:invokeinterface #101 <Method void BlockingQueue.put(Object)>
			return;
	//   35   78:return          
		}
		if(entry.isExpired())
	//*  36   79:aload_2         
	//*  37   80:invokevirtual   #106 <Method boolean Cache$Entry.isExpired()>
	//*  38   83:ifeq            120
		{
			request.addMarker("cache-hit-expired");
	//   39   86:aload_1         
	//   40   87:ldc1            #108 <String "cache-hit-expired">
	//   41   89:invokevirtual   #72  <Method void Request.addMarker(String)>
			request.setCacheEntry(entry);
	//   42   92:aload_1         
	//   43   93:aload_2         
	//   44   94:invokevirtual   #112 <Method Request Request.setCacheEntry(Cache$Entry)>
	//   45   97:pop             
			if(!mWaitingRequestManager.maybeAddToWaitingRequests(request))
	//*  46   98:aload_0         
	//*  47   99:getfield        #49  <Field CacheDispatcher$WaitingRequestManager mWaitingRequestManager>
	//*  48  102:aload_1         
	//*  49  103:invokestatic    #97  <Method boolean CacheDispatcher$WaitingRequestManager.access$000(CacheDispatcher$WaitingRequestManager, Request)>
	//*  50  106:ifne            119
				mNetworkQueue.put(((Object) (request)));
	//   51  109:aload_0         
	//   52  110:getfield        #40  <Field BlockingQueue mNetworkQueue>
	//   53  113:aload_1         
	//   54  114:invokeinterface #101 <Method void BlockingQueue.put(Object)>
			return;
	//   55  119:return          
		}
		request.addMarker("cache-hit");
	//   56  120:aload_1         
	//   57  121:ldc1            #114 <String "cache-hit">
	//   58  123:invokevirtual   #72  <Method void Request.addMarker(String)>
		Response response = request.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
	//   59  126:aload_1         
	//   60  127:new             #116 <Class NetworkResponse>
	//   61  130:dup             
	//   62  131:aload_2         
	//   63  132:getfield        #120 <Field byte[] Cache$Entry.data>
	//   64  135:aload_2         
	//   65  136:getfield        #124 <Field Map Cache$Entry.responseHeaders>
	//   66  139:invokespecial   #127 <Method void NetworkResponse(byte[], Map)>
	//   67  142:invokevirtual   #131 <Method Response Request.parseNetworkResponse(NetworkResponse)>
	//   68  145:astore_3        
		request.addMarker("cache-hit-parsed");
	//   69  146:aload_1         
	//   70  147:ldc1            #133 <String "cache-hit-parsed">
	//   71  149:invokevirtual   #72  <Method void Request.addMarker(String)>
		if(!entry.refreshNeeded())
	//*  72  152:aload_2         
	//*  73  153:invokevirtual   #136 <Method boolean Cache$Entry.refreshNeeded()>
	//*  74  156:ifne            171
		{
			mDelivery.postResponse(request, response);
	//   75  159:aload_0         
	//   76  160:getfield        #44  <Field ResponseDelivery mDelivery>
	//   77  163:aload_1         
	//   78  164:aload_3         
	//   79  165:invokeinterface #142 <Method void ResponseDelivery.postResponse(Request, Response)>
			return;
	//   80  170:return          
		}
		request.addMarker("cache-hit-refresh-needed");
	//   81  171:aload_1         
	//   82  172:ldc1            #144 <String "cache-hit-refresh-needed">
	//   83  174:invokevirtual   #72  <Method void Request.addMarker(String)>
		request.setCacheEntry(entry);
	//   84  177:aload_1         
	//   85  178:aload_2         
	//   86  179:invokevirtual   #112 <Method Request Request.setCacheEntry(Cache$Entry)>
	//   87  182:pop             
		response.intermediate = true;
	//   88  183:aload_3         
	//   89  184:iconst_1        
	//   90  185:putfield        #149 <Field boolean Response.intermediate>
		if(!mWaitingRequestManager.maybeAddToWaitingRequests(request))
	//*  91  188:aload_0         
	//*  92  189:getfield        #49  <Field CacheDispatcher$WaitingRequestManager mWaitingRequestManager>
	//*  93  192:aload_1         
	//*  94  193:invokestatic    #97  <Method boolean CacheDispatcher$WaitingRequestManager.access$000(CacheDispatcher$WaitingRequestManager, Request)>
	//*  95  196:ifne            220
		{
			mDelivery.postResponse(request, response, new Runnable() {

				public void run()
				{
					InterruptedException interruptedexception;
					try
					{
						mNetworkQueue.put(((Object) (request)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field CacheDispatcher this$0>
				//    2    4:invokestatic    #31  <Method BlockingQueue CacheDispatcher.access$100(CacheDispatcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field Request val$request>
				//    5   11:invokeinterface #37  <Method void BlockingQueue.put(Object)>
						return;
				//    6   16:return          
					}
				//*   7   17:invokestatic    #43  <Method Thread Thread.currentThread()>
				//*   8   20:invokevirtual   #46  <Method void Thread.interrupt()>
				//*   9   23:return          
					// Misplaced declaration of an exception variable
					catch(InterruptedException interruptedexception)
					{
						Thread.currentThread().interrupt();
					}
				//*  10   24:astore_1        
				//*  11   25:goto            17
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
	//   96  199:aload_0         
	//   97  200:getfield        #44  <Field ResponseDelivery mDelivery>
	//   98  203:aload_1         
	//   99  204:aload_3         
	//  100  205:new             #6   <Class CacheDispatcher$1>
	//  101  208:dup             
	//  102  209:aload_0         
	//  103  210:aload_1         
	//  104  211:invokespecial   #152 <Method void CacheDispatcher$1(CacheDispatcher, Request)>
	//  105  214:invokeinterface #155 <Method void ResponseDelivery.postResponse(Request, Response, Runnable)>
			return;
	//  106  219:return          
		} else
		{
			mDelivery.postResponse(request, response);
	//  107  220:aload_0         
	//  108  221:getfield        #44  <Field ResponseDelivery mDelivery>
	//  109  224:aload_1         
	//  110  225:aload_3         
	//  111  226:invokeinterface #142 <Method void ResponseDelivery.postResponse(Request, Response)>
			return;
	//  112  231:return          
		}
	}

	public void quit()
	{
		mQuit = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean mQuit>
		interrupt();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #160 <Method void interrupt()>
	//    5    9:return          
	}

	public void run()
	{
		if(DEBUG)
	//*   0    0:getstatic       #29  <Field boolean DEBUG>
	//*   1    3:ifeq            15
			VolleyLog.v("start new dispatcher", new Object[0]);
	//    2    6:ldc1            #163 <String "start new dispatcher">
	//    3    8:iconst_0        
	//    4    9:anewarray       Object[]
	//    5   12:invokestatic    #169 <Method void VolleyLog.v(String, Object[])>
		Process.setThreadPriority(10);
	//    6   15:bipush          10
	//    7   17:invokestatic    #175 <Method void Process.setThreadPriority(int)>
		mCache.initialize();
	//    8   20:aload_0         
	//    9   21:getfield        #42  <Field Cache mCache>
	//   10   24:invokeinterface #178 <Method void Cache.initialize()>
		do
			try
			{
				do
					processRequest();
	//   11   29:aload_0         
	//   12   30:invokespecial   #180 <Method void processRequest()>
				while(true);
	//   13   33:goto            29
			}
	//*  14   36:aload_0         
	//*  15   37:getfield        #36  <Field boolean mQuit>
	//*  16   40:ifeq            29
	//*  17   43:return          
			catch(InterruptedException interruptedexception) { }
	//   18   44:astore_1        
		while(!mQuit);
	//*  19   45:goto            36
	}

	private static final boolean DEBUG;
	private final Cache mCache;
	private final BlockingQueue mCacheQueue;
	private final ResponseDelivery mDelivery;
	private final BlockingQueue mNetworkQueue;
	private volatile boolean mQuit;
	private final WaitingRequestManager mWaitingRequestManager = new WaitingRequestManager(this);

	static 
	{
		DEBUG = VolleyLog.DEBUG;
	//    0    0:getstatic       #28  <Field boolean VolleyLog.DEBUG>
	//    1    3:putstatic       #29  <Field boolean DEBUG>
	//*   2    6:return          
	}


/*
	static BlockingQueue access$100(CacheDispatcher cachedispatcher)
	{
		return cachedispatcher.mNetworkQueue;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BlockingQueue mNetworkQueue>
	//    2    4:areturn         
	}

*/


/*
	static ResponseDelivery access$200(CacheDispatcher cachedispatcher)
	{
		return cachedispatcher.mDelivery;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ResponseDelivery mDelivery>
	//    2    4:areturn         
	}

*/
}

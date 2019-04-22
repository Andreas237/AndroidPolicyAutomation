// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.util.*;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//			CacheDispatcher, Request, VolleyLog, Response, 
//			ResponseDelivery

private static class CacheDispatcher$WaitingRequestManager
	implements 
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
		request.setNetworkRequestCompleteListener((() (this)));
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
		request1.setNetworkRequestCompleteListener((() (this)));
	//   43   88:aload_3         
	//   44   89:aload_0         
	//   45   90:invokevirtual   #83  <Method void Request.setNetworkRequestCompleteListener(Request$NetworkRequestCompleteListener)>
		try
		{
			CacheDispatcher.access$100(mCacheDispatcher).put(((Object) (request1)));
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
			for(request = ((Request) (((List) (obj)).iterator())); ((Iterator) (request)).hasNext(); CacheDispatcher.access$200(mCacheDispatcher).postResponse(((Request) (obj)), response))
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
	static boolean access$000(CacheDispatcher$WaitingRequestManager cachedispatcher$waitingrequestmanager, Request request)
	{
		return cachedispatcher$waitingrequestmanager.maybeAddToWaitingRequests(request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method boolean maybeAddToWaitingRequests(Request)>
	//    3    5:ireturn         
	}

*/

	CacheDispatcher$WaitingRequestManager(CacheDispatcher cachedispatcher)
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

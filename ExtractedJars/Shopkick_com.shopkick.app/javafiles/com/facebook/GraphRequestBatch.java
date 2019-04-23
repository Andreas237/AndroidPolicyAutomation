// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Handler;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphRequestAsyncTask

public class GraphRequestBatch extends AbstractList
{
	public static interface Callback
	{

		public abstract void onBatchCompleted(GraphRequestBatch graphrequestbatch);
	}

	public static interface OnProgressCallback
		extends Callback
	{

		public abstract void onBatchProgress(GraphRequestBatch graphrequestbatch, long l, long l1);
	}


	public GraphRequestBatch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractList()>
		requests = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayList()>
	//    6   12:putfield        #41  <Field List requests>
		timeoutInMilliseconds = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #43  <Field int timeoutInMilliseconds>
		id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
	//   10   20:aload_0         
	//   11   21:getstatic       #34  <Field AtomicInteger idGenerator>
	//   12   24:invokevirtual   #47  <Method int AtomicInteger.incrementAndGet()>
	//   13   27:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   14   30:invokevirtual   #57  <Method String Integer.toString()>
	//   15   33:putfield        #59  <Field String id>
		callbacks = ((List) (new ArrayList()));
	//   16   36:aload_0         
	//   17   37:new             #38  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #39  <Method void ArrayList()>
	//   20   44:putfield        #61  <Field List callbacks>
		requests = ((List) (new ArrayList()));
	//   21   47:aload_0         
	//   22   48:new             #38  <Class ArrayList>
	//   23   51:dup             
	//   24   52:invokespecial   #39  <Method void ArrayList()>
	//   25   55:putfield        #41  <Field List requests>
	//   26   58:return          
	}

	public GraphRequestBatch(GraphRequestBatch graphrequestbatch)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractList()>
		requests = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayList()>
	//    6   12:putfield        #41  <Field List requests>
		timeoutInMilliseconds = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #43  <Field int timeoutInMilliseconds>
		id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
	//   10   20:aload_0         
	//   11   21:getstatic       #34  <Field AtomicInteger idGenerator>
	//   12   24:invokevirtual   #47  <Method int AtomicInteger.incrementAndGet()>
	//   13   27:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   14   30:invokevirtual   #57  <Method String Integer.toString()>
	//   15   33:putfield        #59  <Field String id>
		callbacks = ((List) (new ArrayList()));
	//   16   36:aload_0         
	//   17   37:new             #38  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #39  <Method void ArrayList()>
	//   20   44:putfield        #61  <Field List callbacks>
		requests = ((List) (new ArrayList(((Collection) (graphrequestbatch)))));
	//   21   47:aload_0         
	//   22   48:new             #38  <Class ArrayList>
	//   23   51:dup             
	//   24   52:aload_1         
	//   25   53:invokespecial   #65  <Method void ArrayList(Collection)>
	//   26   56:putfield        #41  <Field List requests>
		callbackHandler = graphrequestbatch.callbackHandler;
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:getfield        #67  <Field Handler callbackHandler>
	//   30   64:putfield        #67  <Field Handler callbackHandler>
		timeoutInMilliseconds = graphrequestbatch.timeoutInMilliseconds;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:getfield        #43  <Field int timeoutInMilliseconds>
	//   34   72:putfield        #43  <Field int timeoutInMilliseconds>
		callbacks = ((List) (new ArrayList(((Collection) (graphrequestbatch.callbacks)))));
	//   35   75:aload_0         
	//   36   76:new             #38  <Class ArrayList>
	//   37   79:dup             
	//   38   80:aload_1         
	//   39   81:getfield        #61  <Field List callbacks>
	//   40   84:invokespecial   #65  <Method void ArrayList(Collection)>
	//   41   87:putfield        #61  <Field List callbacks>
	//   42   90:return          
	}

	public GraphRequestBatch(Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractList()>
		requests = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayList()>
	//    6   12:putfield        #41  <Field List requests>
		timeoutInMilliseconds = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #43  <Field int timeoutInMilliseconds>
		id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
	//   10   20:aload_0         
	//   11   21:getstatic       #34  <Field AtomicInteger idGenerator>
	//   12   24:invokevirtual   #47  <Method int AtomicInteger.incrementAndGet()>
	//   13   27:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   14   30:invokevirtual   #57  <Method String Integer.toString()>
	//   15   33:putfield        #59  <Field String id>
		callbacks = ((List) (new ArrayList()));
	//   16   36:aload_0         
	//   17   37:new             #38  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #39  <Method void ArrayList()>
	//   20   44:putfield        #61  <Field List callbacks>
		requests = ((List) (new ArrayList(collection)));
	//   21   47:aload_0         
	//   22   48:new             #38  <Class ArrayList>
	//   23   51:dup             
	//   24   52:aload_1         
	//   25   53:invokespecial   #65  <Method void ArrayList(Collection)>
	//   26   56:putfield        #41  <Field List requests>
	//   27   59:return          
	}

	public transient GraphRequestBatch(GraphRequest agraphrequest[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractList()>
		requests = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayList()>
	//    6   12:putfield        #41  <Field List requests>
		timeoutInMilliseconds = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #43  <Field int timeoutInMilliseconds>
		id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
	//   10   20:aload_0         
	//   11   21:getstatic       #34  <Field AtomicInteger idGenerator>
	//   12   24:invokevirtual   #47  <Method int AtomicInteger.incrementAndGet()>
	//   13   27:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   14   30:invokevirtual   #57  <Method String Integer.toString()>
	//   15   33:putfield        #59  <Field String id>
		callbacks = ((List) (new ArrayList()));
	//   16   36:aload_0         
	//   17   37:new             #38  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #39  <Method void ArrayList()>
	//   20   44:putfield        #61  <Field List callbacks>
		requests = Arrays.asList(((Object []) (agraphrequest)));
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:invokestatic    #76  <Method List Arrays.asList(Object[])>
	//   24   52:putfield        #41  <Field List requests>
	//   25   55:return          
	}

	public final void add(int i, GraphRequest graphrequest)
	{
		requests.add(i, ((Object) (graphrequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #83  <Method void List.add(int, Object)>
	//    5   11:return          
	}

	public volatile void add(int i, Object obj)
	{
		add(i, (GraphRequest)obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class GraphRequest>
	//    4    6:invokevirtual   #87  <Method void add(int, GraphRequest)>
	//    5    9:return          
	}

	public final boolean add(GraphRequest graphrequest)
	{
		return requests.add(((Object) (graphrequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:aload_1         
	//    3    5:invokeinterface #91  <Method boolean List.add(Object)>
	//    4   10:ireturn         
	}

	public volatile boolean add(Object obj)
	{
		return add((GraphRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class GraphRequest>
	//    3    5:invokevirtual   #93  <Method boolean add(GraphRequest)>
	//    4    8:ireturn         
	}

	public void addCallback(Callback callback)
	{
		if(!callbacks.contains(((Object) (callback))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field List callbacks>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #98  <Method boolean List.contains(Object)>
	//*   4   10:ifne            24
			callbacks.add(((Object) (callback)));
	//    5   13:aload_0         
	//    6   14:getfield        #61  <Field List callbacks>
	//    7   17:aload_1         
	//    8   18:invokeinterface #91  <Method boolean List.add(Object)>
	//    9   23:pop             
	//   10   24:return          
	}

	public final void clear()
	{
		requests.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:invokeinterface #101 <Method void List.clear()>
	//    3    9:return          
	}

	public final List executeAndWait()
	{
		return executeAndWaitImpl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method List executeAndWaitImpl()>
	//    2    4:areturn         
	}

	List executeAndWaitImpl()
	{
		return GraphRequest.executeBatchAndWait(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #111 <Method List GraphRequest.executeBatchAndWait(GraphRequestBatch)>
	//    2    4:areturn         
	}

	public final GraphRequestAsyncTask executeAsync()
	{
		return executeAsyncImpl();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method GraphRequestAsyncTask executeAsyncImpl()>
	//    2    4:areturn         
	}

	GraphRequestAsyncTask executeAsyncImpl()
	{
		return GraphRequest.executeBatchAsync(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method GraphRequestAsyncTask GraphRequest.executeBatchAsync(GraphRequestBatch)>
	//    2    4:areturn         
	}

	public final GraphRequest get(int i)
	{
		return (GraphRequest)requests.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:iload_1         
	//    3    5:invokeinterface #125 <Method Object List.get(int)>
	//    4   10:checkcast       #85  <Class GraphRequest>
	//    5   13:areturn         
	}

	public volatile Object get(int i)
	{
		return ((Object) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #127 <Method GraphRequest get(int)>
	//    3    5:areturn         
	}

	public final String getBatchApplicationId()
	{
		return batchApplicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field String batchApplicationId>
	//    2    4:areturn         
	}

	final Handler getCallbackHandler()
	{
		return callbackHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Handler callbackHandler>
	//    2    4:areturn         
	}

	final List getCallbacks()
	{
		return callbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List callbacks>
	//    2    4:areturn         
	}

	final String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String id>
	//    2    4:areturn         
	}

	final List getRequests()
	{
		return requests;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:areturn         
	}

	public int getTimeout()
	{
		return timeoutInMilliseconds;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int timeoutInMilliseconds>
	//    2    4:ireturn         
	}

	public final GraphRequest remove(int i)
	{
		return (GraphRequest)requests.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:iload_1         
	//    3    5:invokeinterface #141 <Method Object List.remove(int)>
	//    4   10:checkcast       #85  <Class GraphRequest>
	//    5   13:areturn         
	}

	public volatile Object remove(int i)
	{
		return ((Object) (remove(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #143 <Method GraphRequest remove(int)>
	//    3    5:areturn         
	}

	public void removeCallback(Callback callback)
	{
		callbacks.remove(((Object) (callback)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List callbacks>
	//    2    4:aload_1         
	//    3    5:invokeinterface #146 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final GraphRequest set(int i, GraphRequest graphrequest)
	{
		return (GraphRequest)requests.set(i, ((Object) (graphrequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #151 <Method Object List.set(int, Object)>
	//    5   11:checkcast       #85  <Class GraphRequest>
	//    6   14:areturn         
	}

	public volatile Object set(int i, Object obj)
	{
		return ((Object) (set(i, (GraphRequest)obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #85  <Class GraphRequest>
	//    4    6:invokevirtual   #153 <Method GraphRequest set(int, GraphRequest)>
	//    5    9:areturn         
	}

	public final void setBatchApplicationId(String s)
	{
		batchApplicationId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field String batchApplicationId>
	//    3    5:return          
	}

	final void setCallbackHandler(Handler handler)
	{
		callbackHandler = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Handler callbackHandler>
	//    3    5:return          
	}

	public void setTimeout(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			timeoutInMilliseconds = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int timeoutInMilliseconds>
			return;
	//    5    9:return          
		} else
		{
			throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
	//    6   10:new             #161 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc1            #163 <String "Argument timeoutInMilliseconds must be >= 0.">
	//    9   16:invokespecial   #165 <Method void IllegalArgumentException(String)>
	//   10   19:athrow          
		}
	}

	public final int size()
	{
		return requests.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List requests>
	//    2    4:invokeinterface #168 <Method int List.size()>
	//    3    9:ireturn         
	}

	private static AtomicInteger idGenerator = new AtomicInteger();
	private String batchApplicationId;
	private Handler callbackHandler;
	private List callbacks;
	private final String id;
	private List requests;
	private int timeoutInMilliseconds;

	static 
	{
	//    0    0:new             #29  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void AtomicInteger()>
	//    3    7:putstatic       #34  <Field AtomicInteger idGenerator>
	//*   4   10:return          
	}
}

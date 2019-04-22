// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoader

static class MultiModelLoader$MultiFetcher
	implements DataFetcher, com.bumptech.glide.load.data.DataFetcher.DataCallback
{

	private void startNextOrFail()
	{
		if(isCancelled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean isCancelled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(currentIndex < fetchers.size() - 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #48  <Field int currentIndex>
	//*   6   12:aload_0         
	//*   7   13:getfield        #46  <Field List fetchers>
	//*   8   16:invokeinterface #61  <Method int List.size()>
	//*   9   21:iconst_1        
	//*  10   22:isub            
	//*  11   23:icmpge          49
		{
			currentIndex = currentIndex + 1;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #48  <Field int currentIndex>
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:putfield        #48  <Field int currentIndex>
			loadData(priority, callback);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #63  <Field Priority priority>
	//   21   41:aload_0         
	//   22   42:getfield        #65  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   23   45:invokevirtual   #69  <Method void loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			return;
	//   24   48:return          
		} else
		{
			Preconditions.checkNotNull(((Object) (exceptions)));
	//   25   49:aload_0         
	//   26   50:getfield        #71  <Field List exceptions>
	//   27   53:invokestatic    #75  <Method Object Preconditions.checkNotNull(Object)>
	//   28   56:pop             
			callback.onLoadFailed(((Exception) (new GlideException("Fetch failed", ((List) (new ArrayList(((java.util.Collection) (exceptions)))))))));
	//   29   57:aload_0         
	//   30   58:getfield        #65  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   31   61:new             #77  <Class GlideException>
	//   32   64:dup             
	//   33   65:ldc1            #79  <String "Fetch failed">
	//   34   67:new             #81  <Class ArrayList>
	//   35   70:dup             
	//   36   71:aload_0         
	//   37   72:getfield        #71  <Field List exceptions>
	//   38   75:invokespecial   #84  <Method void ArrayList(java.util.Collection)>
	//   39   78:invokespecial   #87  <Method void GlideException(String, List)>
	//   40   81:invokeinterface #91  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   41   86:return          
		}
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #55  <Field boolean isCancelled>
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cancel());
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field List fetchers>
	//    5    9:invokeinterface #96  <Method Iterator List.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            41
	//   10   24:aload_1         
	//   11   25:invokeinterface #106 <Method Object Iterator.next()>
	//   12   30:checkcast       #7   <Class DataFetcher>
	//   13   33:invokeinterface #108 <Method void DataFetcher.cancel()>
	//*  14   38:goto            15
	//   15   41:return          
	}

	public void cleanup()
	{
		List list = exceptions;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List exceptions>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			throwableListPool.release(((Object) (list)));
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//    7   13:aload_1         
	//    8   14:invokeinterface #115 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    9   19:pop             
		exceptions = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #71  <Field List exceptions>
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cleanup());
	//   13   25:aload_0         
	//   14   26:getfield        #46  <Field List fetchers>
	//   15   29:invokeinterface #96  <Method Iterator List.iterator()>
	//   16   34:astore_1        
	//   17   35:aload_1         
	//   18   36:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   19   41:ifeq            61
	//   20   44:aload_1         
	//   21   45:invokeinterface #106 <Method Object Iterator.next()>
	//   22   50:checkcast       #7   <Class DataFetcher>
	//   23   53:invokeinterface #117 <Method void DataFetcher.cleanup()>
	//*  24   58:goto            35
	//   25   61:return          
	}

	public Class getDataClass()
	{
		return ((DataFetcher)fetchers.get(0)).getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #123 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #125 <Method Class DataFetcher.getDataClass()>
	//    6   18:areturn         
	}

	public DataSource getDataSource()
	{
		return ((DataFetcher)fetchers.get(0)).getDataSource();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #123 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #131 <Method DataSource DataFetcher.getDataSource()>
	//    6   18:areturn         
	}

	public void loadData(Priority priority1, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		priority = priority1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Priority priority>
		callback = datacallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #65  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
		exceptions = (List)throwableListPool.acquire();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #38  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//    9   15:invokeinterface #134 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//   10   20:checkcast       #57  <Class List>
	//   11   23:putfield        #71  <Field List exceptions>
		((DataFetcher)fetchers.get(currentIndex)).loadData(priority1, ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   12   26:aload_0         
	//   13   27:getfield        #46  <Field List fetchers>
	//   14   30:aload_0         
	//   15   31:getfield        #48  <Field int currentIndex>
	//   16   34:invokeinterface #123 <Method Object List.get(int)>
	//   17   39:checkcast       #7   <Class DataFetcher>
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:invokeinterface #135 <Method void DataFetcher.loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
		if(isCancelled)
	//*  21   49:aload_0         
	//*  22   50:getfield        #55  <Field boolean isCancelled>
	//*  23   53:ifeq            60
			cancel();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #136 <Method void cancel()>
	//   26   60:return          
	}

	public void onDataReady(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			callback.onDataReady(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//    4    8:aload_1         
	//    5    9:invokeinterface #141 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
			return;
	//    6   14:return          
		} else
		{
			startNextOrFail();
	//    7   15:aload_0         
	//    8   16:invokespecial   #143 <Method void startNextOrFail()>
			return;
	//    9   19:return          
		}
	}

	public void onLoadFailed(Exception exception)
	{
		((List)Preconditions.checkNotNull(((Object) (exceptions)))).add(((Object) (exception)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List exceptions>
	//    2    4:invokestatic    #75  <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:checkcast       #57  <Class List>
	//    4   10:aload_1         
	//    5   11:invokeinterface #147 <Method boolean List.add(Object)>
	//    6   16:pop             
		startNextOrFail();
	//    7   17:aload_0         
	//    8   18:invokespecial   #143 <Method void startNextOrFail()>
	//    9   21:return          
	}

	private com.bumptech.glide.load.data.DataFetcher.DataCallback callback;
	private int currentIndex;
	private List exceptions;
	private final List fetchers;
	private boolean isCancelled;
	private Priority priority;
	private final android.support.v4.util.Pools.Pool throwableListPool;

	MultiModelLoader$MultiFetcher(List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		throwableListPool = pool;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #38  <Field android.support.v4.util.Pools$Pool throwableListPool>
		Preconditions.checkNotEmpty(((java.util.Collection) (list)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #44  <Method java.util.Collection Preconditions.checkNotEmpty(java.util.Collection)>
	//    7   13:pop             
		fetchers = list;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #46  <Field List fetchers>
		currentIndex = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #48  <Field int currentIndex>
	//   14   24:return          
	}
}

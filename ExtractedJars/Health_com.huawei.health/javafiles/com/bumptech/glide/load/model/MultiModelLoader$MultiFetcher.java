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
		if(currentIndex < fetchers.size() - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int currentIndex>
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field List fetchers>
	//*   4    8:invokeinterface #55  <Method int List.size()>
	//*   5   13:iconst_1        
	//*   6   14:isub            
	//*   7   15:icmpge          41
		{
			currentIndex = currentIndex + 1;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field int currentIndex>
	//   11   23:iconst_1        
	//   12   24:iadd            
	//   13   25:putfield        #45  <Field int currentIndex>
			loadData(priority, callback);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #57  <Field Priority priority>
	//   17   33:aload_0         
	//   18   34:getfield        #59  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   19   37:invokevirtual   #63  <Method void loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			return;
	//   20   40:return          
		} else
		{
			callback.onLoadFailed(((Exception) (new GlideException("Fetch failed", ((List) (new ArrayList(((java.util.Collection) (exceptions)))))))));
	//   21   41:aload_0         
	//   22   42:getfield        #59  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   23   45:new             #65  <Class GlideException>
	//   24   48:dup             
	//   25   49:ldc1            #67  <String "Fetch failed">
	//   26   51:new             #69  <Class ArrayList>
	//   27   54:dup             
	//   28   55:aload_0         
	//   29   56:getfield        #71  <Field List exceptions>
	//   30   59:invokespecial   #74  <Method void ArrayList(java.util.Collection)>
	//   31   62:invokespecial   #77  <Method void GlideException(String, List)>
	//   32   65:invokeinterface #81  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   33   70:return          
		}
	}

	public void cancel()
	{
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cancel());
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List fetchers>
	//    2    4:invokeinterface #86  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #96  <Method Object Iterator.next()>
	//    9   25:checkcast       #7   <Class DataFetcher>
	//   10   28:invokeinterface #98  <Method void DataFetcher.cancel()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void cleanup()
	{
		if(exceptions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field List exceptions>
	//*   2    4:ifnull          21
			exceptionListPool.release(((Object) (exceptions)));
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field List exceptions>
	//    7   15:invokeinterface #105 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    8   20:pop             
		exceptions = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #71  <Field List exceptions>
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cleanup());
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field List fetchers>
	//   14   30:invokeinterface #86  <Method Iterator List.iterator()>
	//   15   35:astore_1        
	//   16   36:aload_1         
	//   17   37:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   18   42:ifeq            62
	//   19   45:aload_1         
	//   20   46:invokeinterface #96  <Method Object Iterator.next()>
	//   21   51:checkcast       #7   <Class DataFetcher>
	//   22   54:invokeinterface #107 <Method void DataFetcher.cleanup()>
	//*  23   59:goto            36
	//   24   62:return          
	}

	public Class getDataClass()
	{
		return ((DataFetcher)fetchers.get(0)).getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #114 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #116 <Method Class DataFetcher.getDataClass()>
	//    6   18:areturn         
	}

	public DataSource getDataSource()
	{
		return ((DataFetcher)fetchers.get(0)).getDataSource();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #114 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #122 <Method DataSource DataFetcher.getDataSource()>
	//    6   18:areturn         
	}

	public void loadData(Priority priority1, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		priority = priority1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Priority priority>
		callback = datacallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #59  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
		exceptions = (List)exceptionListPool.acquire();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #35  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//    9   15:invokeinterface #125 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//   10   20:checkcast       #51  <Class List>
	//   11   23:putfield        #71  <Field List exceptions>
		((DataFetcher)fetchers.get(currentIndex)).loadData(priority1, ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field List fetchers>
	//   14   30:aload_0         
	//   15   31:getfield        #45  <Field int currentIndex>
	//   16   34:invokeinterface #114 <Method Object List.get(int)>
	//   17   39:checkcast       #7   <Class DataFetcher>
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:invokeinterface #126 <Method void DataFetcher.loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
	//   21   49:return          
	}

	public void onDataReady(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			callback.onDataReady(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//    4    8:aload_1         
	//    5    9:invokeinterface #131 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
			return;
	//    6   14:return          
		} else
		{
			startNextOrFail();
	//    7   15:aload_0         
	//    8   16:invokespecial   #133 <Method void startNextOrFail()>
			return;
	//    9   19:return          
		}
	}

	public void onLoadFailed(Exception exception)
	{
		exceptions.add(((Object) (exception)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List exceptions>
	//    2    4:aload_1         
	//    3    5:invokeinterface #137 <Method boolean List.add(Object)>
	//    4   10:pop             
		startNextOrFail();
	//    5   11:aload_0         
	//    6   12:invokespecial   #133 <Method void startNextOrFail()>
	//    7   15:return          
	}

	private com.bumptech.glide.load.data.DataFetcher.DataCallback callback;
	private int currentIndex;
	private final android.support.v4.util.Pools.Pool exceptionListPool;
	private List exceptions;
	private final List fetchers;
	private Priority priority;

	MultiModelLoader$MultiFetcher(List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		exceptionListPool = pool;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #35  <Field android.support.v4.util.Pools$Pool exceptionListPool>
		Preconditions.checkNotEmpty(((java.util.Collection) (list)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #41  <Method java.util.Collection Preconditions.checkNotEmpty(java.util.Collection)>
	//    7   13:pop             
		fetchers = list;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #43  <Field List fetchers>
		currentIndex = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #45  <Field int currentIndex>
	//   14   24:return          
	}
}

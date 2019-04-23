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
	//*   1    1:getfield        #46  <Field int currentIndex>
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field List fetchers>
	//*   4    8:invokeinterface #57  <Method int List.size()>
	//*   5   13:iconst_1        
	//*   6   14:isub            
	//*   7   15:icmpge          41
		{
			currentIndex = currentIndex + 1;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #46  <Field int currentIndex>
	//   11   23:iconst_1        
	//   12   24:iadd            
	//   13   25:putfield        #46  <Field int currentIndex>
			loadData(priority, callback);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #59  <Field Priority priority>
	//   17   33:aload_0         
	//   18   34:getfield        #61  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   19   37:invokevirtual   #65  <Method void loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			return;
	//   20   40:return          
		} else
		{
			Preconditions.checkNotNull(((Object) (exceptions)));
	//   21   41:aload_0         
	//   22   42:getfield        #67  <Field List exceptions>
	//   23   45:invokestatic    #71  <Method Object Preconditions.checkNotNull(Object)>
	//   24   48:pop             
			callback.onLoadFailed(((Exception) (new GlideException("Fetch failed", ((List) (new ArrayList(((java.util.Collection) (exceptions)))))))));
	//   25   49:aload_0         
	//   26   50:getfield        #61  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   27   53:new             #73  <Class GlideException>
	//   28   56:dup             
	//   29   57:ldc1            #75  <String "Fetch failed">
	//   30   59:new             #77  <Class ArrayList>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:getfield        #67  <Field List exceptions>
	//   34   67:invokespecial   #80  <Method void ArrayList(java.util.Collection)>
	//   35   70:invokespecial   #83  <Method void GlideException(String, List)>
	//   36   73:invokeinterface #87  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   37   78:return          
		}
	}

	public void cancel()
	{
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cancel());
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List fetchers>
	//    2    4:invokeinterface #92  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #102 <Method Object Iterator.next()>
	//    9   25:checkcast       #7   <Class DataFetcher>
	//   10   28:invokeinterface #104 <Method void DataFetcher.cancel()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void cleanup()
	{
		List list = exceptions;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List exceptions>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			throwableListPool.release(((Object) (list)));
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//    7   13:aload_1         
	//    8   14:invokeinterface #111 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    9   19:pop             
		exceptions = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #67  <Field List exceptions>
		for(Iterator iterator = fetchers.iterator(); iterator.hasNext(); ((DataFetcher)iterator.next()).cleanup());
	//   13   25:aload_0         
	//   14   26:getfield        #44  <Field List fetchers>
	//   15   29:invokeinterface #92  <Method Iterator List.iterator()>
	//   16   34:astore_1        
	//   17   35:aload_1         
	//   18   36:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   19   41:ifeq            61
	//   20   44:aload_1         
	//   21   45:invokeinterface #102 <Method Object Iterator.next()>
	//   22   50:checkcast       #7   <Class DataFetcher>
	//   23   53:invokeinterface #113 <Method void DataFetcher.cleanup()>
	//*  24   58:goto            35
	//   25   61:return          
	}

	public Class getDataClass()
	{
		return ((DataFetcher)fetchers.get(0)).getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #119 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #121 <Method Class DataFetcher.getDataClass()>
	//    6   18:areturn         
	}

	public DataSource getDataSource()
	{
		return ((DataFetcher)fetchers.get(0)).getDataSource();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List fetchers>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #119 <Method Object List.get(int)>
	//    4   10:checkcast       #7   <Class DataFetcher>
	//    5   13:invokeinterface #127 <Method DataSource DataFetcher.getDataSource()>
	//    6   18:areturn         
	}

	public void loadData(Priority priority1, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		priority = priority1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field Priority priority>
		callback = datacallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #61  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
		exceptions = (List)throwableListPool.acquire();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #36  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//    9   15:invokeinterface #130 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//   10   20:checkcast       #53  <Class List>
	//   11   23:putfield        #67  <Field List exceptions>
		((DataFetcher)fetchers.get(currentIndex)).loadData(priority1, ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field List fetchers>
	//   14   30:aload_0         
	//   15   31:getfield        #46  <Field int currentIndex>
	//   16   34:invokeinterface #119 <Method Object List.get(int)>
	//   17   39:checkcast       #7   <Class DataFetcher>
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:invokeinterface #131 <Method void DataFetcher.loadData(Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
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
	//    3    5:getfield        #61  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//    4    8:aload_1         
	//    5    9:invokeinterface #136 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
			return;
	//    6   14:return          
		} else
		{
			startNextOrFail();
	//    7   15:aload_0         
	//    8   16:invokespecial   #138 <Method void startNextOrFail()>
			return;
	//    9   19:return          
		}
	}

	public void onLoadFailed(Exception exception)
	{
		((List)Preconditions.checkNotNull(((Object) (exceptions)))).add(((Object) (exception)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List exceptions>
	//    2    4:invokestatic    #71  <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:checkcast       #53  <Class List>
	//    4   10:aload_1         
	//    5   11:invokeinterface #142 <Method boolean List.add(Object)>
	//    6   16:pop             
		startNextOrFail();
	//    7   17:aload_0         
	//    8   18:invokespecial   #138 <Method void startNextOrFail()>
	//    9   21:return          
	}

	private com.bumptech.glide.load.data.DataFetcher.DataCallback callback;
	private int currentIndex;
	private List exceptions;
	private final List fetchers;
	private Priority priority;
	private final android.support.v4.util.Pools.Pool throwableListPool;

	MultiModelLoader$MultiFetcher(List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		throwableListPool = pool;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #36  <Field android.support.v4.util.Pools$Pool throwableListPool>
		Preconditions.checkNotEmpty(((java.util.Collection) (list)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #42  <Method java.util.Collection Preconditions.checkNotEmpty(java.util.Collection)>
	//    7   13:pop             
		fetchers = list;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #44  <Field List fetchers>
		currentIndex = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #46  <Field int currentIndex>
	//   14   24:return          
	}
}

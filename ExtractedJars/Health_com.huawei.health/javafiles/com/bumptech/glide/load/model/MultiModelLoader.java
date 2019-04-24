// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader

class MultiModelLoader
	implements ModelLoader
{
	static class MultiFetcher
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

		MultiFetcher(List list, android.support.v4.util.Pools.Pool pool)
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


	MultiModelLoader(List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		modelLoaders = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field List modelLoaders>
		exceptionListPool = pool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//    8   14:return          
	}

	public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		com.bumptech.glide.load.Key key = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		int l = modelLoaders.size();
	//    2    3:aload_0         
	//    3    4:getfield        #23  <Field List modelLoaders>
	//    4    7:invokeinterface #36  <Method int List.size()>
	//    5   12:istore          6
		ArrayList arraylist = new ArrayList(l);
	//    6   14:new             #38  <Class ArrayList>
	//    7   17:dup             
	//    8   18:iload           6
	//    9   20:invokespecial   #41  <Method void ArrayList(int)>
	//   10   23:astore          9
		for(int k = 0; k < l;)
	//*  11   25:iconst_0        
	//*  12   26:istore          5
	//*  13   28:iload           5
	//*  14   30:iload           6
	//*  15   32:icmpge          122
		{
			Object obj1 = ((Object) ((ModelLoader)modelLoaders.get(k)));
	//   16   35:aload_0         
	//   17   36:getfield        #23  <Field List modelLoaders>
	//   18   39:iload           5
	//   19   41:invokeinterface #45  <Method Object List.get(int)>
	//   20   46:checkcast       #7   <Class ModelLoader>
	//   21   49:astore          10
			com.bumptech.glide.load.Key key1 = key;
	//   22   51:aload           7
	//   23   53:astore          8
			if(((ModelLoader) (obj1)).handles(obj))
	//*  24   55:aload           10
	//*  25   57:aload_1         
	//*  26   58:invokeinterface #49  <Method boolean ModelLoader.handles(Object)>
	//*  27   63:ifeq            109
			{
				obj1 = ((Object) (((ModelLoader) (obj1)).buildLoadData(obj, i, j, options)));
	//   28   66:aload           10
	//   29   68:aload_1         
	//   30   69:iload_2         
	//   31   70:iload_3         
	//   32   71:aload           4
	//   33   73:invokeinterface #51  <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   34   78:astore          10
				key1 = key;
	//   35   80:aload           7
	//   36   82:astore          8
				if(obj1 != null)
	//*  37   84:aload           10
	//*  38   86:ifnull          109
				{
					key1 = ((ModelLoader.LoadData) (obj1)).sourceKey;
	//   39   89:aload           10
	//   40   91:getfield        #57  <Field com.bumptech.glide.load.Key ModelLoader$LoadData.sourceKey>
	//   41   94:astore          8
					((List) (arraylist)).add(((Object) (((ModelLoader.LoadData) (obj1)).fetcher)));
	//   42   96:aload           9
	//   43   98:aload           10
	//   44  100:getfield        #61  <Field DataFetcher ModelLoader$LoadData.fetcher>
	//   45  103:invokeinterface #64  <Method boolean List.add(Object)>
	//   46  108:pop             
				}
			}
			k++;
	//   47  109:iload           5
	//   48  111:iconst_1        
	//   49  112:iadd            
	//   50  113:istore          5
			key = key1;
	//   51  115:aload           8
	//   52  117:astore          7
		}

	//*  53  119:goto            28
		if(!((List) (arraylist)).isEmpty())
	//*  54  122:aload           9
	//*  55  124:invokeinterface #68  <Method boolean List.isEmpty()>
	//*  56  129:ifne            155
			return new ModelLoader.LoadData(key, ((DataFetcher) (new MultiFetcher(((List) (arraylist)), exceptionListPool))));
	//   57  132:new             #53  <Class ModelLoader$LoadData>
	//   58  135:dup             
	//   59  136:aload           7
	//   60  138:new             #9   <Class MultiModelLoader$MultiFetcher>
	//   61  141:dup             
	//   62  142:aload           9
	//   63  144:aload_0         
	//   64  145:getfield        #25  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   65  148:invokespecial   #70  <Method void MultiModelLoader$MultiFetcher(List, android.support.v4.util.Pools$Pool)>
	//   66  151:invokespecial   #73  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   67  154:areturn         
		else
			return null;
	//   68  155:aconst_null     
	//   69  156:areturn         
	}

	public boolean handles(Object obj)
	{
		for(Iterator iterator = modelLoaders.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List modelLoaders>
	//*   2    4:invokeinterface #78  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
			if(((ModelLoader)iterator.next()).handles(obj))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #87  <Method Object Iterator.next()>
	//*   9   25:checkcast       #7   <Class ModelLoader>
	//*  10   28:aload_1         
	//*  11   29:invokeinterface #49  <Method boolean ModelLoader.handles(Object)>
	//*  12   34:ifeq            39
				return true;
	//   13   37:iconst_1        
	//   14   38:ireturn         

	//*  15   39:goto            10
		return false;
	//   16   42:iconst_0        
	//   17   43:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("MultiModelLoader{modelLoaders=").append(Arrays.toString(modelLoaders.toArray(((Object []) (new ModelLoader[modelLoaders.size()]))))).append('}').toString();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:ldc1            #95  <String "MultiModelLoader{modelLoaders=">
	//    4    9:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field List modelLoaders>
	//    7   16:aload_0         
	//    8   17:getfield        #23  <Field List modelLoaders>
	//    9   20:invokeinterface #36  <Method int List.size()>
	//   10   25:anewarray       ModelLoader[]
	//   11   28:invokeinterface #103 <Method Object[] List.toArray(Object[])>
	//   12   33:invokestatic    #108 <Method String Arrays.toString(Object[])>
	//   13   36:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   14   39:bipush          125
	//   15   41:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//   16   44:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   17   47:areturn         
	}

	private final android.support.v4.util.Pools.Pool exceptionListPool;
	private final List modelLoaders;
}

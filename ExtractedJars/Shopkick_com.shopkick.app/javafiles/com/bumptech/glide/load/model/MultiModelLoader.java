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

		MultiFetcher(List list, android.support.v4.util.Pools.Pool pool)
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


	MultiModelLoader(List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		modelLoaders = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field List modelLoaders>
		exceptionListPool = pool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//    8   14:return          
	}

	public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		int l = modelLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List modelLoaders>
	//    2    4:invokeinterface #38  <Method int List.size()>
	//    3    9:istore          6
		ArrayList arraylist = new ArrayList(l);
	//    4   11:new             #40  <Class ArrayList>
	//    5   14:dup             
	//    6   15:iload           6
	//    7   17:invokespecial   #43  <Method void ArrayList(int)>
	//    8   20:astore          10
		Object obj1 = null;
	//    9   22:aconst_null     
	//   10   23:astore          9
		int k = 0;
	//   11   25:iconst_0        
	//   12   26:istore          5
		com.bumptech.glide.load.Key key;
		com.bumptech.glide.load.Key key1;
		for(key = null; k < l; key = key1)
	//*  13   28:aconst_null     
	//*  14   29:astore          7
	//*  15   31:iload           5
	//*  16   33:iload           6
	//*  17   35:icmpge          125
		{
			Object obj2 = ((Object) ((ModelLoader)modelLoaders.get(k)));
	//   18   38:aload_0         
	//   19   39:getfield        #24  <Field List modelLoaders>
	//   20   42:iload           5
	//   21   44:invokeinterface #47  <Method Object List.get(int)>
	//   22   49:checkcast       #7   <Class ModelLoader>
	//   23   52:astore          11
			key1 = key;
	//   24   54:aload           7
	//   25   56:astore          8
			if(((ModelLoader) (obj2)).handles(obj))
	//*  26   58:aload           11
	//*  27   60:aload_1         
	//*  28   61:invokeinterface #51  <Method boolean ModelLoader.handles(Object)>
	//*  29   66:ifeq            112
			{
				obj2 = ((Object) (((ModelLoader) (obj2)).buildLoadData(obj, i, j, options)));
	//   30   69:aload           11
	//   31   71:aload_1         
	//   32   72:iload_2         
	//   33   73:iload_3         
	//   34   74:aload           4
	//   35   76:invokeinterface #53  <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   36   81:astore          11
				key1 = key;
	//   37   83:aload           7
	//   38   85:astore          8
				if(obj2 != null)
	//*  39   87:aload           11
	//*  40   89:ifnull          112
				{
					key1 = ((ModelLoader.LoadData) (obj2)).sourceKey;
	//   41   92:aload           11
	//   42   94:getfield        #59  <Field com.bumptech.glide.load.Key ModelLoader$LoadData.sourceKey>
	//   43   97:astore          8
					((List) (arraylist)).add(((Object) (((ModelLoader.LoadData) (obj2)).fetcher)));
	//   44   99:aload           10
	//   45  101:aload           11
	//   46  103:getfield        #63  <Field DataFetcher ModelLoader$LoadData.fetcher>
	//   47  106:invokeinterface #66  <Method boolean List.add(Object)>
	//   48  111:pop             
				}
			}
			k++;
	//   49  112:iload           5
	//   50  114:iconst_1        
	//   51  115:iadd            
	//   52  116:istore          5
		}

	//   53  118:aload           8
	//   54  120:astore          7
	//*  55  122:goto            31
		obj = ((Object) (obj1));
	//   56  125:aload           9
	//   57  127:astore_1        
		if(!((List) (arraylist)).isEmpty())
	//*  58  128:aload           10
	//*  59  130:invokeinterface #70  <Method boolean List.isEmpty()>
	//*  60  135:ifne            169
		{
			obj = ((Object) (obj1));
	//   61  138:aload           9
	//   62  140:astore_1        
			if(key != null)
	//*  63  141:aload           7
	//*  64  143:ifnull          169
				obj = ((Object) (new ModelLoader.LoadData(key, ((DataFetcher) (new MultiFetcher(((List) (arraylist)), exceptionListPool))))));
	//   65  146:new             #55  <Class ModelLoader$LoadData>
	//   66  149:dup             
	//   67  150:aload           7
	//   68  152:new             #9   <Class MultiModelLoader$MultiFetcher>
	//   69  155:dup             
	//   70  156:aload           10
	//   71  158:aload_0         
	//   72  159:getfield        #26  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   73  162:invokespecial   #72  <Method void MultiModelLoader$MultiFetcher(List, android.support.v4.util.Pools$Pool)>
	//   74  165:invokespecial   #75  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   75  168:astore_1        
		}
		return ((ModelLoader.LoadData) (obj));
	//   76  169:aload_1         
	//   77  170:areturn         
	}

	public boolean handles(Object obj)
	{
		for(Iterator iterator = modelLoaders.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field List modelLoaders>
	//*   2    4:invokeinterface #80  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
			if(((ModelLoader)iterator.next()).handles(obj))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #89  <Method Object Iterator.next()>
	//*   9   25:checkcast       #7   <Class ModelLoader>
	//*  10   28:aload_1         
	//*  11   29:invokeinterface #51  <Method boolean ModelLoader.handles(Object)>
	//*  12   34:ifeq            10
				return true;
	//   13   37:iconst_1        
	//   14   38:ireturn         

		return false;
	//   15   39:iconst_0        
	//   16   40:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MultiModelLoader{modelLoaders=");
	//    4    8:aload_1         
	//    5    9:ldc1            #97  <String "MultiModelLoader{modelLoaders=">
	//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Arrays.toString(modelLoaders.toArray()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field List modelLoaders>
	//   11   20:invokeinterface #105 <Method Object[] List.toArray()>
	//   12   25:invokestatic    #110 <Method String Arrays.toString(Object[])>
	//   13   28:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append('}');
	//   15   32:aload_1         
	//   16   33:bipush          125
	//   17   35:invokevirtual   #113 <Method StringBuilder StringBuilder.append(char)>
	//   18   38:pop             
		return stringbuilder.toString();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   21   43:areturn         
	}

	private final android.support.v4.util.Pools.Pool exceptionListPool;
	private final List modelLoaders;
}

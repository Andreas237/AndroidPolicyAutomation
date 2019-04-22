// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DataFetcherGenerator, DecodeHelper, DataCacheKey

class DataCacheGenerator
	implements com.bumptech.glide.load.data.DataFetcher.DataCallback, DataFetcherGenerator
{

	DataCacheGenerator(DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
	{
		this(decodehelper.getCacheKeys(), decodehelper, fetcherreadycallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method List DecodeHelper.getCacheKeys()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #40  <Method void DataCacheGenerator(List, DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//    6   10:return          
	}

	DataCacheGenerator(List list, DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		sourceIdIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #48  <Field int sourceIdIndex>
		cacheKeys = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #50  <Field List cacheKeys>
		helper = decodehelper;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #52  <Field DecodeHelper helper>
		cb = fetcherreadycallback;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #54  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//   14   24:return          
	}

	private boolean hasNextModelLoader()
	{
		return modelLoaderIndex < modelLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int modelLoaderIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field List modelLoaders>
	//    4    8:invokeinterface #67  <Method int List.size()>
	//    5   13:icmpge          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public void cancel()
	{
		com.bumptech.glide.load.model.ModelLoader.LoadData loaddata = loadData;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    2    4:astore_1        
		if(loaddata != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			loaddata.fetcher.cancel();
	//    5    9:aload_1         
	//    6   10:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    7   13:invokeinterface #80  <Method void DataFetcher.cancel()>
	//    8   18:return          
	}

	public void onDataReady(Object obj)
	{
		cb.onDataFetcherReady(sourceKey, obj, loadData.fetcher, DataSource.DATA_DISK_CACHE, sourceKey);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field Key sourceKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #90  <Field DataSource DataSource.DATA_DISK_CACHE>
	//    9   19:aload_0         
	//   10   20:getfield        #84  <Field Key sourceKey>
	//   11   23:invokeinterface #96  <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherReady(Key, Object, DataFetcher, DataSource, Key)>
	//   12   28:return          
	}

	public void onLoadFailed(Exception exception)
	{
		cb.onDataFetcherFailed(sourceKey, exception, loadData.fetcher, DataSource.DATA_DISK_CACHE);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field Key sourceKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #90  <Field DataSource DataSource.DATA_DISK_CACHE>
	//    9   19:invokeinterface #103 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   10   24:return          
	}

	public boolean startNext()
	{
		do
		{
			Object obj;
			Object obj1;
			do
			{
				obj = ((Object) (modelLoaders));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List modelLoaders>
	//    2    4:astore_3        
				boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
				if(obj != null && hasNextModelLoader())
	//*   5    7:aload_3         
	//*   6    8:ifnull          154
	//*   7   11:aload_0         
	//*   8   12:invokespecial   #107 <Method boolean hasNextModelLoader()>
	//*   9   15:ifne            21
	//*  10   18:goto            154
				{
					loadData = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
					do
					{
						if(flag || !hasNextModelLoader())
							break;
	//   14   26:iload_2         
	//   15   27:ifne            152
	//   16   30:aload_0         
	//   17   31:invokespecial   #107 <Method boolean hasNextModelLoader()>
	//   18   34:ifeq            152
						obj = ((Object) (modelLoaders));
	//   19   37:aload_0         
	//   20   38:getfield        #61  <Field List modelLoaders>
	//   21   41:astore_3        
						int i = modelLoaderIndex;
	//   22   42:aload_0         
	//   23   43:getfield        #59  <Field int modelLoaderIndex>
	//   24   46:istore_1        
						modelLoaderIndex = i + 1;
	//   25   47:aload_0         
	//   26   48:iload_1         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #59  <Field int modelLoaderIndex>
						loadData = ((ModelLoader)((List) (obj)).get(i)).buildLoadData(((Object) (cacheFile)), helper.getWidth(), helper.getHeight(), helper.getOptions());
	//   30   54:aload_0         
	//   31   55:aload_3         
	//   32   56:iload_1         
	//   33   57:invokeinterface #111 <Method Object List.get(int)>
	//   34   62:checkcast       #113 <Class ModelLoader>
	//   35   65:aload_0         
	//   36   66:getfield        #115 <Field File cacheFile>
	//   37   69:aload_0         
	//   38   70:getfield        #52  <Field DecodeHelper helper>
	//   39   73:invokevirtual   #118 <Method int DecodeHelper.getWidth()>
	//   40   76:aload_0         
	//   41   77:getfield        #52  <Field DecodeHelper helper>
	//   42   80:invokevirtual   #121 <Method int DecodeHelper.getHeight()>
	//   43   83:aload_0         
	//   44   84:getfield        #52  <Field DecodeHelper helper>
	//   45   87:invokevirtual   #125 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//   46   90:invokeinterface #129 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, com.bumptech.glide.load.Options)>
	//   47   95:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
						if(loadData != null && helper.hasLoadPath(loadData.fetcher.getDataClass()))
	//*  48   98:aload_0         
	//*  49   99:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  50  102:ifnull          26
	//*  51  105:aload_0         
	//*  52  106:getfield        #52  <Field DecodeHelper helper>
	//*  53  109:aload_0         
	//*  54  110:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  55  113:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  56  116:invokeinterface #133 <Method Class DataFetcher.getDataClass()>
	//*  57  121:invokevirtual   #137 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//*  58  124:ifeq            26
						{
							loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   59  127:aload_0         
	//   60  128:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   61  131:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   62  134:aload_0         
	//   63  135:getfield        #52  <Field DecodeHelper helper>
	//   64  138:invokevirtual   #141 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//   65  141:aload_0         
	//   66  142:invokeinterface #144 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
							flag = true;
	//   67  147:iconst_1        
	//   68  148:istore_2        
						}
					} while(true);
	//   69  149:goto            26
					return flag;
	//   70  152:iload_2         
	//   71  153:ireturn         
				}
				sourceIdIndex = sourceIdIndex + 1;
	//   72  154:aload_0         
	//   73  155:aload_0         
	//   74  156:getfield        #48  <Field int sourceIdIndex>
	//   75  159:iconst_1        
	//   76  160:iadd            
	//   77  161:putfield        #48  <Field int sourceIdIndex>
				if(sourceIdIndex >= cacheKeys.size())
	//*  78  164:aload_0         
	//*  79  165:getfield        #48  <Field int sourceIdIndex>
	//*  80  168:aload_0         
	//*  81  169:getfield        #50  <Field List cacheKeys>
	//*  82  172:invokeinterface #67  <Method int List.size()>
	//*  83  177:icmplt          182
					return false;
	//   84  180:iconst_0        
	//   85  181:ireturn         
				obj = ((Object) ((Key)cacheKeys.get(sourceIdIndex)));
	//   86  182:aload_0         
	//   87  183:getfield        #50  <Field List cacheKeys>
	//   88  186:aload_0         
	//   89  187:getfield        #48  <Field int sourceIdIndex>
	//   90  190:invokeinterface #111 <Method Object List.get(int)>
	//   91  195:checkcast       #146 <Class Key>
	//   92  198:astore_3        
				obj1 = ((Object) (new DataCacheKey(((Key) (obj)), helper.getSignature())));
	//   93  199:new             #148 <Class DataCacheKey>
	//   94  202:dup             
	//   95  203:aload_3         
	//   96  204:aload_0         
	//   97  205:getfield        #52  <Field DecodeHelper helper>
	//   98  208:invokevirtual   #152 <Method Key DecodeHelper.getSignature()>
	//   99  211:invokespecial   #155 <Method void DataCacheKey(Key, Key)>
	//  100  214:astore          4
				cacheFile = helper.getDiskCache().get(((Key) (obj1)));
	//  101  216:aload_0         
	//  102  217:aload_0         
	//  103  218:getfield        #52  <Field DecodeHelper helper>
	//  104  221:invokevirtual   #159 <Method DiskCache DecodeHelper.getDiskCache()>
	//  105  224:aload           4
	//  106  226:invokeinterface #164 <Method File DiskCache.get(Key)>
	//  107  231:putfield        #115 <Field File cacheFile>
				obj1 = ((Object) (cacheFile));
	//  108  234:aload_0         
	//  109  235:getfield        #115 <Field File cacheFile>
	//  110  238:astore          4
			} while(obj1 == null);
	//  111  240:aload           4
	//  112  242:ifnull          0
			sourceKey = ((Key) (obj));
	//  113  245:aload_0         
	//  114  246:aload_3         
	//  115  247:putfield        #84  <Field Key sourceKey>
			modelLoaders = helper.getModelLoaders(((File) (obj1)));
	//  116  250:aload_0         
	//  117  251:aload_0         
	//  118  252:getfield        #52  <Field DecodeHelper helper>
	//  119  255:aload           4
	//  120  257:invokevirtual   #168 <Method List DecodeHelper.getModelLoaders(File)>
	//  121  260:putfield        #61  <Field List modelLoaders>
			modelLoaderIndex = 0;
	//  122  263:aload_0         
	//  123  264:iconst_0        
	//  124  265:putfield        #59  <Field int modelLoaderIndex>
		} while(true);
	//  125  268:goto            0
	}

	private File cacheFile;
	private final List cacheKeys;
	private final DataFetcherGenerator.FetcherReadyCallback cb;
	private final DecodeHelper helper;
	private volatile com.bumptech.glide.load.model.ModelLoader.LoadData loadData;
	private int modelLoaderIndex;
	private List modelLoaders;
	private int sourceIdIndex;
	private Key sourceKey;
}

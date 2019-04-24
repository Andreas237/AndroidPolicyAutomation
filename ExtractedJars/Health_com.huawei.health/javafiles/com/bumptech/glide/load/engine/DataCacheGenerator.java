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
	implements DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback
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
	//    9   19:invokeinterface #102 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   10   24:return          
	}

	public boolean startNext()
	{
		do
		{
			if(modelLoaders != null && hasNextModelLoader())
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field List modelLoaders>
	//    2    4:ifnull          14
	//    3    7:aload_0         
	//    4    8:invokespecial   #105 <Method boolean hasNextModelLoader()>
	//    5   11:ifne            132
			sourceIdIndex = sourceIdIndex + 1;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field int sourceIdIndex>
	//    9   19:iconst_1        
	//   10   20:iadd            
	//   11   21:putfield        #48  <Field int sourceIdIndex>
			if(sourceIdIndex >= cacheKeys.size())
	//*  12   24:aload_0         
	//*  13   25:getfield        #48  <Field int sourceIdIndex>
	//*  14   28:aload_0         
	//*  15   29:getfield        #50  <Field List cacheKeys>
	//*  16   32:invokeinterface #67  <Method int List.size()>
	//*  17   37:icmplt          42
				return false;
	//   18   40:iconst_0        
	//   19   41:ireturn         
			Key key = (Key)cacheKeys.get(sourceIdIndex);
	//   20   42:aload_0         
	//   21   43:getfield        #50  <Field List cacheKeys>
	//   22   46:aload_0         
	//   23   47:getfield        #48  <Field int sourceIdIndex>
	//   24   50:invokeinterface #109 <Method Object List.get(int)>
	//   25   55:checkcast       #111 <Class Key>
	//   26   58:astore          4
			DataCacheKey datacachekey = new DataCacheKey(key, helper.getSignature());
	//   27   60:new             #113 <Class DataCacheKey>
	//   28   63:dup             
	//   29   64:aload           4
	//   30   66:aload_0         
	//   31   67:getfield        #52  <Field DecodeHelper helper>
	//   32   70:invokevirtual   #117 <Method Key DecodeHelper.getSignature()>
	//   33   73:invokespecial   #120 <Method void DataCacheKey(Key, Key)>
	//   34   76:astore          5
			cacheFile = helper.getDiskCache().get(((Key) (datacachekey)));
	//   35   78:aload_0         
	//   36   79:aload_0         
	//   37   80:getfield        #52  <Field DecodeHelper helper>
	//   38   83:invokevirtual   #124 <Method DiskCache DecodeHelper.getDiskCache()>
	//   39   86:aload           5
	//   40   88:invokeinterface #129 <Method File DiskCache.get(Key)>
	//   41   93:putfield        #131 <Field File cacheFile>
			if(cacheFile != null)
	//*  42   96:aload_0         
	//*  43   97:getfield        #131 <Field File cacheFile>
	//*  44  100:ifnull          129
			{
				sourceKey = key;
	//   45  103:aload_0         
	//   46  104:aload           4
	//   47  106:putfield        #84  <Field Key sourceKey>
				modelLoaders = helper.getModelLoaders(cacheFile);
	//   48  109:aload_0         
	//   49  110:aload_0         
	//   50  111:getfield        #52  <Field DecodeHelper helper>
	//   51  114:aload_0         
	//   52  115:getfield        #131 <Field File cacheFile>
	//   53  118:invokevirtual   #135 <Method List DecodeHelper.getModelLoaders(File)>
	//   54  121:putfield        #61  <Field List modelLoaders>
				modelLoaderIndex = 0;
	//   55  124:aload_0         
	//   56  125:iconst_0        
	//   57  126:putfield        #59  <Field int modelLoaderIndex>
			}
		} while(true);
	//   58  129:goto            0
		loadData = null;
	//   59  132:aload_0         
	//   60  133:aconst_null     
	//   61  134:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
		boolean flag;
		boolean flag1;
		for(flag = false; !flag && hasNextModelLoader(); flag = flag1)
	//*  62  137:iconst_0        
	//*  63  138:istore_2        
	//*  64  139:iload_2         
	//*  65  140:ifne            273
	//*  66  143:aload_0         
	//*  67  144:invokespecial   #105 <Method boolean hasNextModelLoader()>
	//*  68  147:ifeq            273
		{
			List list = modelLoaders;
	//   69  150:aload_0         
	//   70  151:getfield        #61  <Field List modelLoaders>
	//   71  154:astore          4
			int i = modelLoaderIndex;
	//   72  156:aload_0         
	//   73  157:getfield        #59  <Field int modelLoaderIndex>
	//   74  160:istore_1        
			modelLoaderIndex = i + 1;
	//   75  161:aload_0         
	//   76  162:iload_1         
	//   77  163:iconst_1        
	//   78  164:iadd            
	//   79  165:putfield        #59  <Field int modelLoaderIndex>
			loadData = ((ModelLoader)list.get(i)).buildLoadData(((Object) (cacheFile)), helper.getWidth(), helper.getHeight(), helper.getOptions());
	//   80  168:aload_0         
	//   81  169:aload           4
	//   82  171:iload_1         
	//   83  172:invokeinterface #109 <Method Object List.get(int)>
	//   84  177:checkcast       #137 <Class ModelLoader>
	//   85  180:aload_0         
	//   86  181:getfield        #131 <Field File cacheFile>
	//   87  184:aload_0         
	//   88  185:getfield        #52  <Field DecodeHelper helper>
	//   89  188:invokevirtual   #140 <Method int DecodeHelper.getWidth()>
	//   90  191:aload_0         
	//   91  192:getfield        #52  <Field DecodeHelper helper>
	//   92  195:invokevirtual   #143 <Method int DecodeHelper.getHeight()>
	//   93  198:aload_0         
	//   94  199:getfield        #52  <Field DecodeHelper helper>
	//   95  202:invokevirtual   #147 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//   96  205:invokeinterface #151 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, com.bumptech.glide.load.Options)>
	//   97  210:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
			flag1 = flag;
	//   98  213:iload_2         
	//   99  214:istore_3        
			if(loadData == null)
				continue;
	//  100  215:aload_0         
	//  101  216:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  102  219:ifnull          268
			flag1 = flag;
	//  103  222:iload_2         
	//  104  223:istore_3        
			if(helper.hasLoadPath(loadData.fetcher.getDataClass()))
	//* 105  224:aload_0         
	//* 106  225:getfield        #52  <Field DecodeHelper helper>
	//* 107  228:aload_0         
	//* 108  229:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//* 109  232:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//* 110  235:invokeinterface #155 <Method Class DataFetcher.getDataClass()>
	//* 111  240:invokevirtual   #159 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//* 112  243:ifeq            268
			{
				flag1 = true;
	//  113  246:iconst_1        
	//  114  247:istore_3        
				loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//  115  248:aload_0         
	//  116  249:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  117  252:getfield        #76  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//  118  255:aload_0         
	//  119  256:getfield        #52  <Field DecodeHelper helper>
	//  120  259:invokevirtual   #163 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//  121  262:aload_0         
	//  122  263:invokeinterface #166 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			}
		}

	//  123  268:iload_3         
	//  124  269:istore_2        
	//* 125  270:goto            139
		return flag;
	//  126  273:iload_2         
	//  127  274:ireturn         
	}

	private File cacheFile;
	private List cacheKeys;
	private final DataFetcherGenerator.FetcherReadyCallback cb;
	private final DecodeHelper helper;
	private volatile com.bumptech.glide.load.model.ModelLoader.LoadData loadData;
	private int modelLoaderIndex;
	private List modelLoaders;
	private int sourceIdIndex;
	private Key sourceKey;
}

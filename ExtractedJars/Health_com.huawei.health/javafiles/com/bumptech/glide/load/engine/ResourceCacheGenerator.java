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
//			DataFetcherGenerator, DecodeHelper, ResourceCacheKey

class ResourceCacheGenerator
	implements DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback
{

	public ResourceCacheGenerator(DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		sourceIdIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int sourceIdIndex>
		resourceClassIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #39  <Field int resourceClassIndex>
		helper = decodehelper;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #41  <Field DecodeHelper helper>
		cb = fetcherreadycallback;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #43  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//   14   24:return          
	}

	private boolean hasNextModelLoader()
	{
		return modelLoaderIndex < modelLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int modelLoaderIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field List modelLoaders>
	//    4    8:invokeinterface #58  <Method int List.size()>
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
	//    1    1:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    2    4:astore_1        
		if(loaddata != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			loaddata.fetcher.cancel();
	//    5    9:aload_1         
	//    6   10:getfield        #67  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    7   13:invokeinterface #71  <Method void DataFetcher.cancel()>
	//    8   18:return          
	}

	public void onDataReady(Object obj)
	{
		cb.onDataFetcherReady(sourceKey, obj, loadData.fetcher, DataSource.RESOURCE_DISK_CACHE, ((Key) (currentKey)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field Key sourceKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #67  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #81  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//    9   19:aload_0         
	//   10   20:getfield        #83  <Field ResourceCacheKey currentKey>
	//   11   23:invokeinterface #89  <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherReady(Key, Object, DataFetcher, DataSource, Key)>
	//   12   28:return          
	}

	public void onLoadFailed(Exception exception)
	{
		cb.onDataFetcherFailed(((Key) (currentKey)), exception, loadData.fetcher, DataSource.RESOURCE_DISK_CACHE);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field ResourceCacheKey currentKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #67  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #81  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//    9   19:invokeinterface #95  <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   10   24:return          
	}

	public boolean startNext()
	{
		List list = helper.getCacheKeys();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DecodeHelper helper>
	//    2    4:invokevirtual   #102 <Method List DecodeHelper.getCacheKeys()>
	//    3    7:astore          4
		if(list.isEmpty())
	//*   4    9:aload           4
	//*   5   11:invokeinterface #105 <Method boolean List.isEmpty()>
	//*   6   16:ifeq            21
			return false;
	//    7   19:iconst_0        
	//    8   20:ireturn         
		List list2 = helper.getRegisteredResourceClasses();
	//    9   21:aload_0         
	//   10   22:getfield        #41  <Field DecodeHelper helper>
	//   11   25:invokevirtual   #108 <Method List DecodeHelper.getRegisteredResourceClasses()>
	//   12   28:astore          5
		do
		{
			if(modelLoaders != null && hasNextModelLoader())
				break;
	//   13   30:aload_0         
	//   14   31:getfield        #52  <Field List modelLoaders>
	//   15   34:ifnull          44
	//   16   37:aload_0         
	//   17   38:invokespecial   #110 <Method boolean hasNextModelLoader()>
	//   18   41:ifne            243
			resourceClassIndex = resourceClassIndex + 1;
	//   19   44:aload_0         
	//   20   45:aload_0         
	//   21   46:getfield        #39  <Field int resourceClassIndex>
	//   22   49:iconst_1        
	//   23   50:iadd            
	//   24   51:putfield        #39  <Field int resourceClassIndex>
			if(resourceClassIndex >= list2.size())
	//*  25   54:aload_0         
	//*  26   55:getfield        #39  <Field int resourceClassIndex>
	//*  27   58:aload           5
	//*  28   60:invokeinterface #58  <Method int List.size()>
	//*  29   65:icmplt          99
			{
				sourceIdIndex = sourceIdIndex + 1;
	//   30   68:aload_0         
	//   31   69:aload_0         
	//   32   70:getfield        #37  <Field int sourceIdIndex>
	//   33   73:iconst_1        
	//   34   74:iadd            
	//   35   75:putfield        #37  <Field int sourceIdIndex>
				if(sourceIdIndex >= list.size())
	//*  36   78:aload_0         
	//*  37   79:getfield        #37  <Field int sourceIdIndex>
	//*  38   82:aload           4
	//*  39   84:invokeinterface #58  <Method int List.size()>
	//*  40   89:icmplt          94
					return false;
	//   41   92:iconst_0        
	//   42   93:ireturn         
				resourceClassIndex = 0;
	//   43   94:aload_0         
	//   44   95:iconst_0        
	//   45   96:putfield        #39  <Field int resourceClassIndex>
			}
			Key key = (Key)list.get(sourceIdIndex);
	//   46   99:aload           4
	//   47  101:aload_0         
	//   48  102:getfield        #37  <Field int sourceIdIndex>
	//   49  105:invokeinterface #114 <Method Object List.get(int)>
	//   50  110:checkcast       #116 <Class Key>
	//   51  113:astore          6
			Class class1 = (Class)list2.get(resourceClassIndex);
	//   52  115:aload           5
	//   53  117:aload_0         
	//   54  118:getfield        #39  <Field int resourceClassIndex>
	//   55  121:invokeinterface #114 <Method Object List.get(int)>
	//   56  126:checkcast       #118 <Class Class>
	//   57  129:astore          7
			com.bumptech.glide.load.Transformation transformation = helper.getTransformation(class1);
	//   58  131:aload_0         
	//   59  132:getfield        #41  <Field DecodeHelper helper>
	//   60  135:aload           7
	//   61  137:invokevirtual   #122 <Method com.bumptech.glide.load.Transformation DecodeHelper.getTransformation(Class)>
	//   62  140:astore          8
			currentKey = new ResourceCacheKey(key, helper.getSignature(), helper.getWidth(), helper.getHeight(), transformation, class1, helper.getOptions());
	//   63  142:aload_0         
	//   64  143:new             #124 <Class ResourceCacheKey>
	//   65  146:dup             
	//   66  147:aload           6
	//   67  149:aload_0         
	//   68  150:getfield        #41  <Field DecodeHelper helper>
	//   69  153:invokevirtual   #128 <Method Key DecodeHelper.getSignature()>
	//   70  156:aload_0         
	//   71  157:getfield        #41  <Field DecodeHelper helper>
	//   72  160:invokevirtual   #131 <Method int DecodeHelper.getWidth()>
	//   73  163:aload_0         
	//   74  164:getfield        #41  <Field DecodeHelper helper>
	//   75  167:invokevirtual   #134 <Method int DecodeHelper.getHeight()>
	//   76  170:aload           8
	//   77  172:aload           7
	//   78  174:aload_0         
	//   79  175:getfield        #41  <Field DecodeHelper helper>
	//   80  178:invokevirtual   #138 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//   81  181:invokespecial   #141 <Method void ResourceCacheKey(Key, Key, int, int, com.bumptech.glide.load.Transformation, Class, com.bumptech.glide.load.Options)>
	//   82  184:putfield        #83  <Field ResourceCacheKey currentKey>
			cacheFile = helper.getDiskCache().get(((Key) (currentKey)));
	//   83  187:aload_0         
	//   84  188:aload_0         
	//   85  189:getfield        #41  <Field DecodeHelper helper>
	//   86  192:invokevirtual   #145 <Method DiskCache DecodeHelper.getDiskCache()>
	//   87  195:aload_0         
	//   88  196:getfield        #83  <Field ResourceCacheKey currentKey>
	//   89  199:invokeinterface #150 <Method File DiskCache.get(Key)>
	//   90  204:putfield        #152 <Field File cacheFile>
			if(cacheFile != null)
	//*  91  207:aload_0         
	//*  92  208:getfield        #152 <Field File cacheFile>
	//*  93  211:ifnull          240
			{
				sourceKey = key;
	//   94  214:aload_0         
	//   95  215:aload           6
	//   96  217:putfield        #75  <Field Key sourceKey>
				modelLoaders = helper.getModelLoaders(cacheFile);
	//   97  220:aload_0         
	//   98  221:aload_0         
	//   99  222:getfield        #41  <Field DecodeHelper helper>
	//  100  225:aload_0         
	//  101  226:getfield        #152 <Field File cacheFile>
	//  102  229:invokevirtual   #156 <Method List DecodeHelper.getModelLoaders(File)>
	//  103  232:putfield        #52  <Field List modelLoaders>
				modelLoaderIndex = 0;
	//  104  235:aload_0         
	//  105  236:iconst_0        
	//  106  237:putfield        #50  <Field int modelLoaderIndex>
			}
		} while(true);
	//  107  240:goto            30
		loadData = null;
	//  108  243:aload_0         
	//  109  244:aconst_null     
	//  110  245:putfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
		boolean flag;
		boolean flag1;
		for(flag = false; !flag && hasNextModelLoader(); flag = flag1)
	//* 111  248:iconst_0        
	//* 112  249:istore_2        
	//* 113  250:iload_2         
	//* 114  251:ifne            384
	//* 115  254:aload_0         
	//* 116  255:invokespecial   #110 <Method boolean hasNextModelLoader()>
	//* 117  258:ifeq            384
		{
			List list1 = modelLoaders;
	//  118  261:aload_0         
	//  119  262:getfield        #52  <Field List modelLoaders>
	//  120  265:astore          4
			int i = modelLoaderIndex;
	//  121  267:aload_0         
	//  122  268:getfield        #50  <Field int modelLoaderIndex>
	//  123  271:istore_1        
			modelLoaderIndex = i + 1;
	//  124  272:aload_0         
	//  125  273:iload_1         
	//  126  274:iconst_1        
	//  127  275:iadd            
	//  128  276:putfield        #50  <Field int modelLoaderIndex>
			loadData = ((ModelLoader)list1.get(i)).buildLoadData(((Object) (cacheFile)), helper.getWidth(), helper.getHeight(), helper.getOptions());
	//  129  279:aload_0         
	//  130  280:aload           4
	//  131  282:iload_1         
	//  132  283:invokeinterface #114 <Method Object List.get(int)>
	//  133  288:checkcast       #158 <Class ModelLoader>
	//  134  291:aload_0         
	//  135  292:getfield        #152 <Field File cacheFile>
	//  136  295:aload_0         
	//  137  296:getfield        #41  <Field DecodeHelper helper>
	//  138  299:invokevirtual   #131 <Method int DecodeHelper.getWidth()>
	//  139  302:aload_0         
	//  140  303:getfield        #41  <Field DecodeHelper helper>
	//  141  306:invokevirtual   #134 <Method int DecodeHelper.getHeight()>
	//  142  309:aload_0         
	//  143  310:getfield        #41  <Field DecodeHelper helper>
	//  144  313:invokevirtual   #138 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//  145  316:invokeinterface #162 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, com.bumptech.glide.load.Options)>
	//  146  321:putfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
			flag1 = flag;
	//  147  324:iload_2         
	//  148  325:istore_3        
			if(loadData == null)
				continue;
	//  149  326:aload_0         
	//  150  327:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  151  330:ifnull          379
			flag1 = flag;
	//  152  333:iload_2         
	//  153  334:istore_3        
			if(helper.hasLoadPath(loadData.fetcher.getDataClass()))
	//* 154  335:aload_0         
	//* 155  336:getfield        #41  <Field DecodeHelper helper>
	//* 156  339:aload_0         
	//* 157  340:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//* 158  343:getfield        #67  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//* 159  346:invokeinterface #166 <Method Class DataFetcher.getDataClass()>
	//* 160  351:invokevirtual   #170 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//* 161  354:ifeq            379
			{
				flag1 = true;
	//  162  357:iconst_1        
	//  163  358:istore_3        
				loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//  164  359:aload_0         
	//  165  360:getfield        #61  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  166  363:getfield        #67  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//  167  366:aload_0         
	//  168  367:getfield        #41  <Field DecodeHelper helper>
	//  169  370:invokevirtual   #174 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//  170  373:aload_0         
	//  171  374:invokeinterface #177 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			}
		}

	//  172  379:iload_3         
	//  173  380:istore_2        
	//* 174  381:goto            250
		return flag;
	//  175  384:iload_2         
	//  176  385:ireturn         
	}

	private File cacheFile;
	private final DataFetcherGenerator.FetcherReadyCallback cb;
	private ResourceCacheKey currentKey;
	private final DecodeHelper helper;
	private volatile com.bumptech.glide.load.model.ModelLoader.LoadData loadData;
	private int modelLoaderIndex;
	private List modelLoaders;
	private int resourceClassIndex;
	private int sourceIdIndex;
	private Key sourceKey;
}

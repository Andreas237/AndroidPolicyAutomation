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

	ResourceCacheGenerator(DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		resourceClassIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #37  <Field int resourceClassIndex>
		helper = decodehelper;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field DecodeHelper helper>
		cb = fetcherreadycallback;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//   11   19:return          
	}

	private boolean hasNextModelLoader()
	{
		return modelLoaderIndex < modelLoaders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int modelLoaderIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field List modelLoaders>
	//    4    8:invokeinterface #56  <Method int List.size()>
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
	//    1    1:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    2    4:astore_1        
		if(loaddata != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			loaddata.fetcher.cancel();
	//    5    9:aload_1         
	//    6   10:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    7   13:invokeinterface #69  <Method void DataFetcher.cancel()>
	//    8   18:return          
	}

	public void onDataReady(Object obj)
	{
		cb.onDataFetcherReady(sourceKey, obj, loadData.fetcher, DataSource.RESOURCE_DISK_CACHE, ((Key) (currentKey)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field Key sourceKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #79  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//    9   19:aload_0         
	//   10   20:getfield        #81  <Field ResourceCacheKey currentKey>
	//   11   23:invokeinterface #87  <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherReady(Key, Object, DataFetcher, DataSource, Key)>
	//   12   28:return          
	}

	public void onLoadFailed(Exception exception)
	{
		cb.onDataFetcherFailed(((Key) (currentKey)), exception, loadData.fetcher, DataSource.RESOURCE_DISK_CACHE);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field ResourceCacheKey currentKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:getstatic       #79  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//    9   19:invokeinterface #94  <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   10   24:return          
	}

	public boolean startNext()
	{
		List list = helper.getCacheKeys();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DecodeHelper helper>
	//    2    4:invokevirtual   #102 <Method List DecodeHelper.getCacheKeys()>
	//    3    7:astore          4
		boolean flag1 = list.isEmpty();
	//    4    9:aload           4
	//    5   11:invokeinterface #105 <Method boolean List.isEmpty()>
	//    6   16:istore_3        
		boolean flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_2        
		if(flag1)
	//*   9   19:iload_3         
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		List list1 = helper.getRegisteredResourceClasses();
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field DecodeHelper helper>
	//   15   29:invokevirtual   #108 <Method List DecodeHelper.getRegisteredResourceClasses()>
	//   16   32:astore          5
		if(list1.isEmpty() && ((Object) (java/io/File)).equals(((Object) (helper.getTranscodeClass()))))
	//*  17   34:aload           5
	//*  18   36:invokeinterface #105 <Method boolean List.isEmpty()>
	//*  19   41:ifeq            61
	//*  20   44:ldc1            #110 <Class File>
	//*  21   46:aload_0         
	//*  22   47:getfield        #39  <Field DecodeHelper helper>
	//*  23   50:invokevirtual   #114 <Method Class DecodeHelper.getTranscodeClass()>
	//*  24   53:invokevirtual   #118 <Method boolean Object.equals(Object)>
	//*  25   56:ifeq            61
			return false;
	//   26   59:iconst_0        
	//   27   60:ireturn         
		do
		{
			Key key;
			Object obj;
			do
			{
				if(modelLoaders != null && hasNextModelLoader())
	//*  28   61:aload_0         
	//*  29   62:getfield        #50  <Field List modelLoaders>
	//*  30   65:ifnull          213
	//*  31   68:aload_0         
	//*  32   69:invokespecial   #120 <Method boolean hasNextModelLoader()>
	//*  33   72:ifne            78
	//*  34   75:goto            213
				{
					loadData = null;
	//   35   78:aload_0         
	//   36   79:aconst_null     
	//   37   80:putfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
					do
					{
						if(flag || !hasNextModelLoader())
							break;
	//   38   83:iload_2         
	//   39   84:ifne            211
	//   40   87:aload_0         
	//   41   88:invokespecial   #120 <Method boolean hasNextModelLoader()>
	//   42   91:ifeq            211
						list = modelLoaders;
	//   43   94:aload_0         
	//   44   95:getfield        #50  <Field List modelLoaders>
	//   45   98:astore          4
						int i = modelLoaderIndex;
	//   46  100:aload_0         
	//   47  101:getfield        #48  <Field int modelLoaderIndex>
	//   48  104:istore_1        
						modelLoaderIndex = i + 1;
	//   49  105:aload_0         
	//   50  106:iload_1         
	//   51  107:iconst_1        
	//   52  108:iadd            
	//   53  109:putfield        #48  <Field int modelLoaderIndex>
						loadData = ((ModelLoader)list.get(i)).buildLoadData(((Object) (cacheFile)), helper.getWidth(), helper.getHeight(), helper.getOptions());
	//   54  112:aload_0         
	//   55  113:aload           4
	//   56  115:iload_1         
	//   57  116:invokeinterface #124 <Method Object List.get(int)>
	//   58  121:checkcast       #126 <Class ModelLoader>
	//   59  124:aload_0         
	//   60  125:getfield        #128 <Field File cacheFile>
	//   61  128:aload_0         
	//   62  129:getfield        #39  <Field DecodeHelper helper>
	//   63  132:invokevirtual   #131 <Method int DecodeHelper.getWidth()>
	//   64  135:aload_0         
	//   65  136:getfield        #39  <Field DecodeHelper helper>
	//   66  139:invokevirtual   #134 <Method int DecodeHelper.getHeight()>
	//   67  142:aload_0         
	//   68  143:getfield        #39  <Field DecodeHelper helper>
	//   69  146:invokevirtual   #138 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//   70  149:invokeinterface #142 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, com.bumptech.glide.load.Options)>
	//   71  154:putfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
						if(loadData != null && helper.hasLoadPath(loadData.fetcher.getDataClass()))
	//*  72  157:aload_0         
	//*  73  158:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  74  161:ifnull          83
	//*  75  164:aload_0         
	//*  76  165:getfield        #39  <Field DecodeHelper helper>
	//*  77  168:aload_0         
	//*  78  169:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  79  172:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  80  175:invokeinterface #145 <Method Class DataFetcher.getDataClass()>
	//*  81  180:invokevirtual   #149 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//*  82  183:ifeq            83
						{
							loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   83  186:aload_0         
	//   84  187:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   85  190:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   86  193:aload_0         
	//   87  194:getfield        #39  <Field DecodeHelper helper>
	//   88  197:invokevirtual   #153 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//   89  200:aload_0         
	//   90  201:invokeinterface #156 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
							flag = true;
	//   91  206:iconst_1        
	//   92  207:istore_2        
						}
					} while(true);
	//   93  208:goto            83
					return flag;
	//   94  211:iload_2         
	//   95  212:ireturn         
				}
				resourceClassIndex = resourceClassIndex + 1;
	//   96  213:aload_0         
	//   97  214:aload_0         
	//   98  215:getfield        #37  <Field int resourceClassIndex>
	//   99  218:iconst_1        
	//  100  219:iadd            
	//  101  220:putfield        #37  <Field int resourceClassIndex>
				if(resourceClassIndex >= list1.size())
	//* 102  223:aload_0         
	//* 103  224:getfield        #37  <Field int resourceClassIndex>
	//* 104  227:aload           5
	//* 105  229:invokeinterface #56  <Method int List.size()>
	//* 106  234:icmplt          268
				{
					sourceIdIndex = sourceIdIndex + 1;
	//  107  237:aload_0         
	//  108  238:aload_0         
	//  109  239:getfield        #158 <Field int sourceIdIndex>
	//  110  242:iconst_1        
	//  111  243:iadd            
	//  112  244:putfield        #158 <Field int sourceIdIndex>
					if(sourceIdIndex >= list.size())
	//* 113  247:aload_0         
	//* 114  248:getfield        #158 <Field int sourceIdIndex>
	//* 115  251:aload           4
	//* 116  253:invokeinterface #56  <Method int List.size()>
	//* 117  258:icmplt          263
						return false;
	//  118  261:iconst_0        
	//  119  262:ireturn         
					resourceClassIndex = 0;
	//  120  263:aload_0         
	//  121  264:iconst_0        
	//  122  265:putfield        #37  <Field int resourceClassIndex>
				}
				key = (Key)list.get(sourceIdIndex);
	//  123  268:aload           4
	//  124  270:aload_0         
	//  125  271:getfield        #158 <Field int sourceIdIndex>
	//  126  274:invokeinterface #124 <Method Object List.get(int)>
	//  127  279:checkcast       #160 <Class Key>
	//  128  282:astore          6
				obj = ((Object) ((Class)list1.get(resourceClassIndex)));
	//  129  284:aload           5
	//  130  286:aload_0         
	//  131  287:getfield        #37  <Field int resourceClassIndex>
	//  132  290:invokeinterface #124 <Method Object List.get(int)>
	//  133  295:checkcast       #162 <Class Class>
	//  134  298:astore          7
				com.bumptech.glide.load.Transformation transformation = helper.getTransformation(((Class) (obj)));
	//  135  300:aload_0         
	//  136  301:getfield        #39  <Field DecodeHelper helper>
	//  137  304:aload           7
	//  138  306:invokevirtual   #166 <Method com.bumptech.glide.load.Transformation DecodeHelper.getTransformation(Class)>
	//  139  309:astore          8
				currentKey = new ResourceCacheKey(helper.getArrayPool(), key, helper.getSignature(), helper.getWidth(), helper.getHeight(), transformation, ((Class) (obj)), helper.getOptions());
	//  140  311:aload_0         
	//  141  312:new             #168 <Class ResourceCacheKey>
	//  142  315:dup             
	//  143  316:aload_0         
	//  144  317:getfield        #39  <Field DecodeHelper helper>
	//  145  320:invokevirtual   #172 <Method com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool DecodeHelper.getArrayPool()>
	//  146  323:aload           6
	//  147  325:aload_0         
	//  148  326:getfield        #39  <Field DecodeHelper helper>
	//  149  329:invokevirtual   #176 <Method Key DecodeHelper.getSignature()>
	//  150  332:aload_0         
	//  151  333:getfield        #39  <Field DecodeHelper helper>
	//  152  336:invokevirtual   #131 <Method int DecodeHelper.getWidth()>
	//  153  339:aload_0         
	//  154  340:getfield        #39  <Field DecodeHelper helper>
	//  155  343:invokevirtual   #134 <Method int DecodeHelper.getHeight()>
	//  156  346:aload           8
	//  157  348:aload           7
	//  158  350:aload_0         
	//  159  351:getfield        #39  <Field DecodeHelper helper>
	//  160  354:invokevirtual   #138 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//  161  357:invokespecial   #179 <Method void ResourceCacheKey(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool, Key, Key, int, int, com.bumptech.glide.load.Transformation, Class, com.bumptech.glide.load.Options)>
	//  162  360:putfield        #81  <Field ResourceCacheKey currentKey>
				cacheFile = helper.getDiskCache().get(((Key) (currentKey)));
	//  163  363:aload_0         
	//  164  364:aload_0         
	//  165  365:getfield        #39  <Field DecodeHelper helper>
	//  166  368:invokevirtual   #183 <Method DiskCache DecodeHelper.getDiskCache()>
	//  167  371:aload_0         
	//  168  372:getfield        #81  <Field ResourceCacheKey currentKey>
	//  169  375:invokeinterface #188 <Method File DiskCache.get(Key)>
	//  170  380:putfield        #128 <Field File cacheFile>
				obj = ((Object) (cacheFile));
	//  171  383:aload_0         
	//  172  384:getfield        #128 <Field File cacheFile>
	//  173  387:astore          7
			} while(obj == null);
	//  174  389:aload           7
	//  175  391:ifnull          61
			sourceKey = key;
	//  176  394:aload_0         
	//  177  395:aload           6
	//  178  397:putfield        #73  <Field Key sourceKey>
			modelLoaders = helper.getModelLoaders(((File) (obj)));
	//  179  400:aload_0         
	//  180  401:aload_0         
	//  181  402:getfield        #39  <Field DecodeHelper helper>
	//  182  405:aload           7
	//  183  407:invokevirtual   #192 <Method List DecodeHelper.getModelLoaders(File)>
	//  184  410:putfield        #50  <Field List modelLoaders>
			modelLoaderIndex = 0;
	//  185  413:aload_0         
	//  186  414:iconst_0        
	//  187  415:putfield        #48  <Field int modelLoaderIndex>
		} while(true);
	//  188  418:goto            61
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

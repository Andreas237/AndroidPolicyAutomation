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
	implements com.bumptech.glide.load.data.DataFetcher.DataCallback, DataFetcherGenerator
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
		Object obj = ((Object) (helper.getCacheKeys()));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DecodeHelper helper>
	//    2    4:invokevirtual   #102 <Method List DecodeHelper.getCacheKeys()>
	//    3    7:astore          4
		boolean flag1 = ((List) (obj)).isEmpty();
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
		List list = helper.getRegisteredResourceClasses();
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field DecodeHelper helper>
	//   15   29:invokevirtual   #108 <Method List DecodeHelper.getRegisteredResourceClasses()>
	//   16   32:astore          5
		if(list.isEmpty())
	//*  17   34:aload           5
	//*  18   36:invokeinterface #105 <Method boolean List.isEmpty()>
	//*  19   41:ifeq            125
			if(((Object) (java/io/File)).equals(((Object) (helper.getTranscodeClass()))))
	//*  20   44:ldc1            #110 <Class File>
	//*  21   46:aload_0         
	//*  22   47:getfield        #39  <Field DecodeHelper helper>
	//*  23   50:invokevirtual   #114 <Method Class DecodeHelper.getTranscodeClass()>
	//*  24   53:invokevirtual   #118 <Method boolean Object.equals(Object)>
	//*  25   56:ifeq            61
			{
				return false;
	//   26   59:iconst_0        
	//   27   60:ireturn         
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//   28   61:new             #120 <Class StringBuilder>
	//   29   64:dup             
	//   30   65:invokespecial   #121 <Method void StringBuilder()>
	//   31   68:astore          4
				((StringBuilder) (obj)).append("Failed to find any load path from ");
	//   32   70:aload           4
	//   33   72:ldc1            #123 <String "Failed to find any load path from ">
	//   34   74:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
				((StringBuilder) (obj)).append(((Object) (helper.getModelClass())));
	//   36   78:aload           4
	//   37   80:aload_0         
	//   38   81:getfield        #39  <Field DecodeHelper helper>
	//   39   84:invokevirtual   #130 <Method Class DecodeHelper.getModelClass()>
	//   40   87:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   41   90:pop             
				((StringBuilder) (obj)).append(" to ");
	//   42   91:aload           4
	//   43   93:ldc1            #135 <String " to ">
	//   44   95:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
				((StringBuilder) (obj)).append(((Object) (helper.getTranscodeClass())));
	//   46   99:aload           4
	//   47  101:aload_0         
	//   48  102:getfield        #39  <Field DecodeHelper helper>
	//   49  105:invokevirtual   #114 <Method Class DecodeHelper.getTranscodeClass()>
	//   50  108:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   51  111:pop             
				throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   52  112:new             #137 <Class IllegalStateException>
	//   53  115:dup             
	//   54  116:aload           4
	//   55  118:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   56  121:invokespecial   #144 <Method void IllegalStateException(String)>
	//   57  124:athrow          
			}
		do
		{
			Key key;
			Object obj1;
			do
			{
				if(modelLoaders != null && hasNextModelLoader())
	//*  58  125:aload_0         
	//*  59  126:getfield        #50  <Field List modelLoaders>
	//*  60  129:ifnull          277
	//*  61  132:aload_0         
	//*  62  133:invokespecial   #146 <Method boolean hasNextModelLoader()>
	//*  63  136:ifne            142
	//*  64  139:goto            277
				{
					loadData = null;
	//   65  142:aload_0         
	//   66  143:aconst_null     
	//   67  144:putfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
					do
					{
						if(flag || !hasNextModelLoader())
							break;
	//   68  147:iload_2         
	//   69  148:ifne            275
	//   70  151:aload_0         
	//   71  152:invokespecial   #146 <Method boolean hasNextModelLoader()>
	//   72  155:ifeq            275
						obj = ((Object) (modelLoaders));
	//   73  158:aload_0         
	//   74  159:getfield        #50  <Field List modelLoaders>
	//   75  162:astore          4
						int i = modelLoaderIndex;
	//   76  164:aload_0         
	//   77  165:getfield        #48  <Field int modelLoaderIndex>
	//   78  168:istore_1        
						modelLoaderIndex = i + 1;
	//   79  169:aload_0         
	//   80  170:iload_1         
	//   81  171:iconst_1        
	//   82  172:iadd            
	//   83  173:putfield        #48  <Field int modelLoaderIndex>
						loadData = ((ModelLoader)((List) (obj)).get(i)).buildLoadData(((Object) (cacheFile)), helper.getWidth(), helper.getHeight(), helper.getOptions());
	//   84  176:aload_0         
	//   85  177:aload           4
	//   86  179:iload_1         
	//   87  180:invokeinterface #150 <Method Object List.get(int)>
	//   88  185:checkcast       #152 <Class ModelLoader>
	//   89  188:aload_0         
	//   90  189:getfield        #154 <Field File cacheFile>
	//   91  192:aload_0         
	//   92  193:getfield        #39  <Field DecodeHelper helper>
	//   93  196:invokevirtual   #157 <Method int DecodeHelper.getWidth()>
	//   94  199:aload_0         
	//   95  200:getfield        #39  <Field DecodeHelper helper>
	//   96  203:invokevirtual   #160 <Method int DecodeHelper.getHeight()>
	//   97  206:aload_0         
	//   98  207:getfield        #39  <Field DecodeHelper helper>
	//   99  210:invokevirtual   #164 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//  100  213:invokeinterface #168 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, com.bumptech.glide.load.Options)>
	//  101  218:putfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
						if(loadData != null && helper.hasLoadPath(loadData.fetcher.getDataClass()))
	//* 102  221:aload_0         
	//* 103  222:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//* 104  225:ifnull          147
	//* 105  228:aload_0         
	//* 106  229:getfield        #39  <Field DecodeHelper helper>
	//* 107  232:aload_0         
	//* 108  233:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//* 109  236:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//* 110  239:invokeinterface #171 <Method Class DataFetcher.getDataClass()>
	//* 111  244:invokevirtual   #175 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//* 112  247:ifeq            147
						{
							loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//  113  250:aload_0         
	//  114  251:getfield        #59  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  115  254:getfield        #65  <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//  116  257:aload_0         
	//  117  258:getfield        #39  <Field DecodeHelper helper>
	//  118  261:invokevirtual   #179 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//  119  264:aload_0         
	//  120  265:invokeinterface #182 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
							flag = true;
	//  121  270:iconst_1        
	//  122  271:istore_2        
						}
					} while(true);
	//  123  272:goto            147
					return flag;
	//  124  275:iload_2         
	//  125  276:ireturn         
				}
				resourceClassIndex = resourceClassIndex + 1;
	//  126  277:aload_0         
	//  127  278:aload_0         
	//  128  279:getfield        #37  <Field int resourceClassIndex>
	//  129  282:iconst_1        
	//  130  283:iadd            
	//  131  284:putfield        #37  <Field int resourceClassIndex>
				if(resourceClassIndex >= list.size())
	//* 132  287:aload_0         
	//* 133  288:getfield        #37  <Field int resourceClassIndex>
	//* 134  291:aload           5
	//* 135  293:invokeinterface #56  <Method int List.size()>
	//* 136  298:icmplt          332
				{
					sourceIdIndex = sourceIdIndex + 1;
	//  137  301:aload_0         
	//  138  302:aload_0         
	//  139  303:getfield        #184 <Field int sourceIdIndex>
	//  140  306:iconst_1        
	//  141  307:iadd            
	//  142  308:putfield        #184 <Field int sourceIdIndex>
					if(sourceIdIndex >= ((List) (obj)).size())
	//* 143  311:aload_0         
	//* 144  312:getfield        #184 <Field int sourceIdIndex>
	//* 145  315:aload           4
	//* 146  317:invokeinterface #56  <Method int List.size()>
	//* 147  322:icmplt          327
						return false;
	//  148  325:iconst_0        
	//  149  326:ireturn         
					resourceClassIndex = 0;
	//  150  327:aload_0         
	//  151  328:iconst_0        
	//  152  329:putfield        #37  <Field int resourceClassIndex>
				}
				key = (Key)((List) (obj)).get(sourceIdIndex);
	//  153  332:aload           4
	//  154  334:aload_0         
	//  155  335:getfield        #184 <Field int sourceIdIndex>
	//  156  338:invokeinterface #150 <Method Object List.get(int)>
	//  157  343:checkcast       #186 <Class Key>
	//  158  346:astore          6
				obj1 = ((Object) ((Class)list.get(resourceClassIndex)));
	//  159  348:aload           5
	//  160  350:aload_0         
	//  161  351:getfield        #37  <Field int resourceClassIndex>
	//  162  354:invokeinterface #150 <Method Object List.get(int)>
	//  163  359:checkcast       #188 <Class Class>
	//  164  362:astore          7
				com.bumptech.glide.load.Transformation transformation = helper.getTransformation(((Class) (obj1)));
	//  165  364:aload_0         
	//  166  365:getfield        #39  <Field DecodeHelper helper>
	//  167  368:aload           7
	//  168  370:invokevirtual   #192 <Method com.bumptech.glide.load.Transformation DecodeHelper.getTransformation(Class)>
	//  169  373:astore          8
				currentKey = new ResourceCacheKey(helper.getArrayPool(), key, helper.getSignature(), helper.getWidth(), helper.getHeight(), transformation, ((Class) (obj1)), helper.getOptions());
	//  170  375:aload_0         
	//  171  376:new             #194 <Class ResourceCacheKey>
	//  172  379:dup             
	//  173  380:aload_0         
	//  174  381:getfield        #39  <Field DecodeHelper helper>
	//  175  384:invokevirtual   #198 <Method com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool DecodeHelper.getArrayPool()>
	//  176  387:aload           6
	//  177  389:aload_0         
	//  178  390:getfield        #39  <Field DecodeHelper helper>
	//  179  393:invokevirtual   #202 <Method Key DecodeHelper.getSignature()>
	//  180  396:aload_0         
	//  181  397:getfield        #39  <Field DecodeHelper helper>
	//  182  400:invokevirtual   #157 <Method int DecodeHelper.getWidth()>
	//  183  403:aload_0         
	//  184  404:getfield        #39  <Field DecodeHelper helper>
	//  185  407:invokevirtual   #160 <Method int DecodeHelper.getHeight()>
	//  186  410:aload           8
	//  187  412:aload           7
	//  188  414:aload_0         
	//  189  415:getfield        #39  <Field DecodeHelper helper>
	//  190  418:invokevirtual   #164 <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//  191  421:invokespecial   #205 <Method void ResourceCacheKey(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool, Key, Key, int, int, com.bumptech.glide.load.Transformation, Class, com.bumptech.glide.load.Options)>
	//  192  424:putfield        #81  <Field ResourceCacheKey currentKey>
				cacheFile = helper.getDiskCache().get(((Key) (currentKey)));
	//  193  427:aload_0         
	//  194  428:aload_0         
	//  195  429:getfield        #39  <Field DecodeHelper helper>
	//  196  432:invokevirtual   #209 <Method DiskCache DecodeHelper.getDiskCache()>
	//  197  435:aload_0         
	//  198  436:getfield        #81  <Field ResourceCacheKey currentKey>
	//  199  439:invokeinterface #214 <Method File DiskCache.get(Key)>
	//  200  444:putfield        #154 <Field File cacheFile>
				obj1 = ((Object) (cacheFile));
	//  201  447:aload_0         
	//  202  448:getfield        #154 <Field File cacheFile>
	//  203  451:astore          7
			} while(obj1 == null);
	//  204  453:aload           7
	//  205  455:ifnull          125
			sourceKey = key;
	//  206  458:aload_0         
	//  207  459:aload           6
	//  208  461:putfield        #73  <Field Key sourceKey>
			modelLoaders = helper.getModelLoaders(((File) (obj1)));
	//  209  464:aload_0         
	//  210  465:aload_0         
	//  211  466:getfield        #39  <Field DecodeHelper helper>
	//  212  469:aload           7
	//  213  471:invokevirtual   #218 <Method List DecodeHelper.getModelLoaders(File)>
	//  214  474:putfield        #50  <Field List modelLoaders>
			modelLoaderIndex = 0;
	//  215  477:aload_0         
	//  216  478:iconst_0        
	//  217  479:putfield        #48  <Field int modelLoaderIndex>
		} while(true);
	//  218  482:goto            125
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

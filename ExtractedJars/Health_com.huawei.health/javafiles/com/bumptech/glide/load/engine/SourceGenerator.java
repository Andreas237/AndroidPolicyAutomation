// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DataFetcherGenerator, DecodeHelper, DataCacheWriter, DataCacheKey, 
//			DataCacheGenerator, DiskCacheStrategy

class SourceGenerator
	implements DataFetcherGenerator, com.bumptech.glide.load.data.DataFetcher.DataCallback, DataFetcherGenerator.FetcherReadyCallback
{

	public SourceGenerator(DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		helper = decodehelper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field DecodeHelper helper>
		cb = fetcherreadycallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    8   14:return          
	}

	private void cacheData(Object obj)
	{
		long l = LogTime.getLogTime();
	//    0    0:invokestatic    #51  <Method long LogTime.getLogTime()>
	//    1    3:lstore_2        
		com.bumptech.glide.load.Encoder encoder = helper.getSourceEncoder(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field DecodeHelper helper>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #57  <Method com.bumptech.glide.load.Encoder DecodeHelper.getSourceEncoder(Object)>
	//    6   12:astore          4
		DataCacheWriter datacachewriter = new DataCacheWriter(encoder, obj, helper.getOptions());
	//    7   14:new             #59  <Class DataCacheWriter>
	//    8   17:dup             
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field DecodeHelper helper>
	//   13   25:invokevirtual   #63  <Method com.bumptech.glide.load.Options DecodeHelper.getOptions()>
	//   14   28:invokespecial   #66  <Method void DataCacheWriter(com.bumptech.glide.load.Encoder, Object, com.bumptech.glide.load.Options)>
	//   15   31:astore          5
		originalKey = new DataCacheKey(loadData.sourceKey, helper.getSignature());
	//   16   33:aload_0         
	//   17   34:new             #68  <Class DataCacheKey>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   21   42:getfield        #76  <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   22   45:aload_0         
	//   23   46:getfield        #38  <Field DecodeHelper helper>
	//   24   49:invokevirtual   #80  <Method Key DecodeHelper.getSignature()>
	//   25   52:invokespecial   #83  <Method void DataCacheKey(Key, Key)>
	//   26   55:putfield        #85  <Field DataCacheKey originalKey>
		helper.getDiskCache().put(((Key) (originalKey)), ((com.bumptech.glide.load.engine.cache.DiskCache.Writer) (datacachewriter)));
	//   27   58:aload_0         
	//   28   59:getfield        #38  <Field DecodeHelper helper>
	//   29   62:invokevirtual   #89  <Method DiskCache DecodeHelper.getDiskCache()>
	//   30   65:aload_0         
	//   31   66:getfield        #85  <Field DataCacheKey originalKey>
	//   32   69:aload           5
	//   33   71:invokeinterface #95  <Method void DiskCache.put(Key, com.bumptech.glide.load.engine.cache.DiskCache$Writer)>
		if(Log.isLoggable("SourceGenerator", 2))
	//*  34   76:ldc1            #15  <String "SourceGenerator">
	//*  35   78:iconst_2        
	//*  36   79:invokestatic    #101 <Method boolean Log.isLoggable(String, int)>
	//*  37   82:ifeq            144
			Log.v("SourceGenerator", (new StringBuilder()).append("Finished encoding source to cache, key: ").append(((Object) (originalKey))).append(", data: ").append(obj).append(", encoder: ").append(((Object) (encoder))).append(", duration: ").append(LogTime.getElapsedMillis(l)).toString());
	//   38   85:ldc1            #15  <String "SourceGenerator">
	//   39   87:new             #103 <Class StringBuilder>
	//   40   90:dup             
	//   41   91:invokespecial   #104 <Method void StringBuilder()>
	//   42   94:ldc1            #106 <String "Finished encoding source to cache, key: ">
	//   43   96:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   44   99:aload_0         
	//   45  100:getfield        #85  <Field DataCacheKey originalKey>
	//   46  103:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   47  106:ldc1            #115 <String ", data: ">
	//   48  108:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   49  111:aload_1         
	//   50  112:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   51  115:ldc1            #117 <String ", encoder: ">
	//   52  117:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   53  120:aload           4
	//   54  122:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   55  125:ldc1            #119 <String ", duration: ">
	//   56  127:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   57  130:lload_2         
	//   58  131:invokestatic    #123 <Method double LogTime.getElapsedMillis(long)>
	//   59  134:invokevirtual   #126 <Method StringBuilder StringBuilder.append(double)>
	//   60  137:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   61  140:invokestatic    #134 <Method int Log.v(String, String)>
	//   62  143:pop             
		loadData.fetcher.cleanup();
	//   63  144:aload_0         
	//   64  145:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   65  148:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   66  151:invokeinterface #143 <Method void DataFetcher.cleanup()>
		break MISSING_BLOCK_LABEL_174;
	//   67  156:goto            174
		obj;
	//   68  159:astore_1        
		loadData.fetcher.cleanup();
	//   69  160:aload_0         
	//   70  161:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   71  164:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   72  167:invokeinterface #143 <Method void DataFetcher.cleanup()>
		throw obj;
	//   73  172:aload_1         
	//   74  173:athrow          
		sourceCacheGenerator = new DataCacheGenerator(Collections.singletonList(((Object) (loadData.sourceKey))), helper, ((DataFetcherGenerator.FetcherReadyCallback) (this)));
	//   75  174:aload_0         
	//   76  175:new             #145 <Class DataCacheGenerator>
	//   77  178:dup             
	//   78  179:aload_0         
	//   79  180:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   80  183:getfield        #76  <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   81  186:invokestatic    #151 <Method List Collections.singletonList(Object)>
	//   82  189:aload_0         
	//   83  190:getfield        #38  <Field DecodeHelper helper>
	//   84  193:aload_0         
	//   85  194:invokespecial   #154 <Method void DataCacheGenerator(List, DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   86  197:putfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
		return;
	//   87  200:return          
	}

	private boolean hasNextModelLoader()
	{
		return loadDataListIndex < helper.getLoadData().size();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field int loadDataListIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field DecodeHelper helper>
	//    4    8:invokevirtual   #164 <Method List DecodeHelper.getLoadData()>
	//    5   11:invokeinterface #170 <Method int List.size()>
	//    6   16:icmpge          21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
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
	//    6   10:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    7   13:invokeinterface #173 <Method void DataFetcher.cancel()>
	//    8   18:return          
	}

	public void onDataFetcherFailed(Key key, Exception exception, DataFetcher datafetcher, DataSource datasource)
	{
		cb.onDataFetcherFailed(key, exception, datafetcher, loadData.fetcher.getDataSource());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   11:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   14:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//    9   19:invokeinterface #181 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   10   24:return          
	}

	public void onDataFetcherReady(Key key, Object obj, DataFetcher datafetcher, DataSource datasource, Key key1)
	{
		cb.onDataFetcherReady(key, obj, datafetcher, loadData.fetcher.getDataSource(), key);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   11:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   14:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//    9   19:aload_1         
	//   10   20:invokeinterface #186 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherReady(Key, Object, DataFetcher, DataSource, Key)>
	//   11   25:return          
	}

	public void onDataReady(Object obj)
	{
		DiskCacheStrategy diskcachestrategy = helper.getDiskCacheStrategy();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DecodeHelper helper>
	//    2    4:invokevirtual   #192 <Method DiskCacheStrategy DecodeHelper.getDiskCacheStrategy()>
	//    3    7:astore_2        
		if(obj != null && diskcachestrategy.isDataCacheable(loadData.fetcher.getDataSource()))
	//*   4    8:aload_1         
	//*   5    9:ifnull          46
	//*   6   12:aload_2         
	//*   7   13:aload_0         
	//*   8   14:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*   9   17:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  10   20:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//*  11   25:invokevirtual   #198 <Method boolean DiskCacheStrategy.isDataCacheable(DataSource)>
	//*  12   28:ifeq            46
		{
			dataToCache = obj;
	//   13   31:aload_0         
	//   14   32:aload_1         
	//   15   33:putfield        #200 <Field Object dataToCache>
			cb.reschedule();
	//   16   36:aload_0         
	//   17   37:getfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//   18   40:invokeinterface #203 <Method void DataFetcherGenerator$FetcherReadyCallback.reschedule()>
			return;
	//   19   45:return          
		} else
		{
			cb.onDataFetcherReady(loadData.sourceKey, obj, loadData.fetcher, loadData.fetcher.getDataSource(), ((Key) (originalKey)));
	//   20   46:aload_0         
	//   21   47:getfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//   22   50:aload_0         
	//   23   51:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   24   54:getfield        #76  <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   25   57:aload_1         
	//   26   58:aload_0         
	//   27   59:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   28   62:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   29   65:aload_0         
	//   30   66:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   31   69:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   32   72:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//   33   77:aload_0         
	//   34   78:getfield        #85  <Field DataCacheKey originalKey>
	//   35   81:invokeinterface #186 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherReady(Key, Object, DataFetcher, DataSource, Key)>
			return;
	//   36   86:return          
		}
	}

	public void onLoadFailed(Exception exception)
	{
		cb.onDataFetcherFailed(((Key) (originalKey)), exception, loadData.fetcher, loadData.fetcher.getDataSource());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataFetcherGenerator$FetcherReadyCallback cb>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field DataCacheKey originalKey>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//    7   13:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   10   20:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   11   23:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//   12   28:invokeinterface #181 <Method void DataFetcherGenerator$FetcherReadyCallback.onDataFetcherFailed(Key, Exception, DataFetcher, DataSource)>
	//   13   33:return          
	}

	public void reschedule()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #207 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #208 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean startNext()
	{
		if(dataToCache != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field Object dataToCache>
	//*   2    4:ifnull          22
		{
			Object obj = dataToCache;
	//    3    7:aload_0         
	//    4    8:getfield        #200 <Field Object dataToCache>
	//    5   11:astore_3        
			dataToCache = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #200 <Field Object dataToCache>
			cacheData(obj);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokespecial   #211 <Method void cacheData(Object)>
		}
		if(sourceCacheGenerator != null && sourceCacheGenerator.startNext())
	//*  12   22:aload_0         
	//*  13   23:getfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
	//*  14   26:ifnull          41
	//*  15   29:aload_0         
	//*  16   30:getfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
	//*  17   33:invokevirtual   #213 <Method boolean DataCacheGenerator.startNext()>
	//*  18   36:ifeq            41
			return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
		sourceCacheGenerator = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
		loadData = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
		boolean flag = false;
	//   27   51:iconst_0        
	//   28   52:istore_2        
		do
		{
			if(flag || !hasNextModelLoader())
				break;
	//   29   53:iload_2         
	//   30   54:ifne            177
	//   31   57:aload_0         
	//   32   58:invokespecial   #215 <Method boolean hasNextModelLoader()>
	//   33   61:ifeq            177
			List list = helper.getLoadData();
	//   34   64:aload_0         
	//   35   65:getfield        #38  <Field DecodeHelper helper>
	//   36   68:invokevirtual   #164 <Method List DecodeHelper.getLoadData()>
	//   37   71:astore_3        
			int i = loadDataListIndex;
	//   38   72:aload_0         
	//   39   73:getfield        #160 <Field int loadDataListIndex>
	//   40   76:istore_1        
			loadDataListIndex = i + 1;
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:iconst_1        
	//   44   80:iadd            
	//   45   81:putfield        #160 <Field int loadDataListIndex>
			loadData = (com.bumptech.glide.load.model.ModelLoader.LoadData)list.get(i);
	//   46   84:aload_0         
	//   47   85:aload_3         
	//   48   86:iload_1         
	//   49   87:invokeinterface #219 <Method Object List.get(int)>
	//   50   92:checkcast       #72  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   51   95:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
			if(loadData != null && (helper.getDiskCacheStrategy().isDataCacheable(loadData.fetcher.getDataSource()) || helper.hasLoadPath(loadData.fetcher.getDataClass())))
	//*  52   98:aload_0         
	//*  53   99:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  54  102:ifnull          53
	//*  55  105:aload_0         
	//*  56  106:getfield        #38  <Field DecodeHelper helper>
	//*  57  109:invokevirtual   #192 <Method DiskCacheStrategy DecodeHelper.getDiskCacheStrategy()>
	//*  58  112:aload_0         
	//*  59  113:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  60  116:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  61  119:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//*  62  124:invokevirtual   #198 <Method boolean DiskCacheStrategy.isDataCacheable(DataSource)>
	//*  63  127:ifne            152
	//*  64  130:aload_0         
	//*  65  131:getfield        #38  <Field DecodeHelper helper>
	//*  66  134:aload_0         
	//*  67  135:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  68  138:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  69  141:invokeinterface #223 <Method Class DataFetcher.getDataClass()>
	//*  70  146:invokevirtual   #227 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//*  71  149:ifeq            53
			{
				flag = true;
	//   72  152:iconst_1        
	//   73  153:istore_2        
				loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   74  154:aload_0         
	//   75  155:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   76  158:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   77  161:aload_0         
	//   78  162:getfield        #38  <Field DecodeHelper helper>
	//   79  165:invokevirtual   #231 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//   80  168:aload_0         
	//   81  169:invokeinterface #234 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
			}
		} while(true);
	//   82  174:goto            53
		return flag;
	//   83  177:iload_2         
	//   84  178:ireturn         
	}

	private static final String TAG = "SourceGenerator";
	private final DataFetcherGenerator.FetcherReadyCallback cb;
	private Object dataToCache;
	private final DecodeHelper helper;
	private volatile com.bumptech.glide.load.model.ModelLoader.LoadData loadData;
	private int loadDataListIndex;
	private DataCacheKey originalKey;
	private DataCacheGenerator sourceCacheGenerator;
}

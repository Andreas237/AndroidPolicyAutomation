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

	SourceGenerator(DecodeHelper decodehelper, DataFetcherGenerator.FetcherReadyCallback fetcherreadycallback)
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
	//*  37   82:ifeq            172
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   38   85:new             #103 <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #104 <Method void StringBuilder()>
	//   41   92:astore          5
			stringbuilder.append("Finished encoding source to cache, key: ");
	//   42   94:aload           5
	//   43   96:ldc1            #106 <String "Finished encoding source to cache, key: ">
	//   44   98:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:pop             
			stringbuilder.append(((Object) (originalKey)));
	//   46  102:aload           5
	//   47  104:aload_0         
	//   48  105:getfield        #85  <Field DataCacheKey originalKey>
	//   49  108:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   50  111:pop             
			stringbuilder.append(", data: ");
	//   51  112:aload           5
	//   52  114:ldc1            #115 <String ", data: ">
	//   53  116:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   54  119:pop             
			stringbuilder.append(obj);
	//   55  120:aload           5
	//   56  122:aload_1         
	//   57  123:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   58  126:pop             
			stringbuilder.append(", encoder: ");
	//   59  127:aload           5
	//   60  129:ldc1            #117 <String ", encoder: ">
	//   61  131:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   62  134:pop             
			stringbuilder.append(((Object) (encoder)));
	//   63  135:aload           5
	//   64  137:aload           4
	//   65  139:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   66  142:pop             
			stringbuilder.append(", duration: ");
	//   67  143:aload           5
	//   68  145:ldc1            #119 <String ", duration: ">
	//   69  147:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   70  150:pop             
			stringbuilder.append(LogTime.getElapsedMillis(l));
	//   71  151:aload           5
	//   72  153:lload_2         
	//   73  154:invokestatic    #123 <Method double LogTime.getElapsedMillis(long)>
	//   74  157:invokevirtual   #126 <Method StringBuilder StringBuilder.append(double)>
	//   75  160:pop             
			Log.v("SourceGenerator", stringbuilder.toString());
	//   76  161:ldc1            #15  <String "SourceGenerator">
	//   77  163:aload           5
	//   78  165:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   79  168:invokestatic    #134 <Method int Log.v(String, String)>
	//   80  171:pop             
		}
		loadData.fetcher.cleanup();
	//   81  172:aload_0         
	//   82  173:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   83  176:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   84  179:invokeinterface #143 <Method void DataFetcher.cleanup()>
		sourceCacheGenerator = new DataCacheGenerator(Collections.singletonList(((Object) (loadData.sourceKey))), helper, ((DataFetcherGenerator.FetcherReadyCallback) (this)));
	//   85  184:aload_0         
	//   86  185:new             #145 <Class DataCacheGenerator>
	//   87  188:dup             
	//   88  189:aload_0         
	//   89  190:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   90  193:getfield        #76  <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   91  196:invokestatic    #151 <Method List Collections.singletonList(Object)>
	//   92  199:aload_0         
	//   93  200:getfield        #38  <Field DecodeHelper helper>
	//   94  203:aload_0         
	//   95  204:invokespecial   #154 <Method void DataCacheGenerator(List, DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   96  207:putfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
		return;
	//   97  210:return          
		obj;
	//   98  211:astore_1        
		loadData.fetcher.cleanup();
	//   99  212:aload_0         
	//  100  213:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//  101  216:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//  102  219:invokeinterface #143 <Method void DataFetcher.cleanup()>
		throw obj;
	//  103  224:aload_1         
	//  104  225:athrow          
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
	//    0    0:new             #209 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean startNext()
	{
		Object obj = dataToCache;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field Object dataToCache>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          19
		{
			dataToCache = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #200 <Field Object dataToCache>
			cacheData(obj);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokespecial   #213 <Method void cacheData(Object)>
		}
		obj = ((Object) (sourceCacheGenerator));
	//   11   19:aload_0         
	//   12   20:getfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
	//   13   23:astore_3        
		if(obj != null && ((DataCacheGenerator) (obj)).startNext())
	//*  14   24:aload_3         
	//*  15   25:ifnull          37
	//*  16   28:aload_3         
	//*  17   29:invokevirtual   #215 <Method boolean DataCacheGenerator.startNext()>
	//*  18   32:ifeq            37
			return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		sourceCacheGenerator = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #156 <Field DataCacheGenerator sourceCacheGenerator>
		loadData = null;
	//   24   42:aload_0         
	//   25   43:aconst_null     
	//   26   44:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
		boolean flag = false;
	//   27   47:iconst_0        
	//   28   48:istore_2        
		do
		{
			if(flag || !hasNextModelLoader())
				break;
	//   29   49:iload_2         
	//   30   50:ifne            173
	//   31   53:aload_0         
	//   32   54:invokespecial   #217 <Method boolean hasNextModelLoader()>
	//   33   57:ifeq            173
			List list = helper.getLoadData();
	//   34   60:aload_0         
	//   35   61:getfield        #38  <Field DecodeHelper helper>
	//   36   64:invokevirtual   #164 <Method List DecodeHelper.getLoadData()>
	//   37   67:astore_3        
			int i = loadDataListIndex;
	//   38   68:aload_0         
	//   39   69:getfield        #160 <Field int loadDataListIndex>
	//   40   72:istore_1        
			loadDataListIndex = i + 1;
	//   41   73:aload_0         
	//   42   74:iload_1         
	//   43   75:iconst_1        
	//   44   76:iadd            
	//   45   77:putfield        #160 <Field int loadDataListIndex>
			loadData = (com.bumptech.glide.load.model.ModelLoader.LoadData)list.get(i);
	//   46   80:aload_0         
	//   47   81:aload_3         
	//   48   82:iload_1         
	//   49   83:invokeinterface #221 <Method Object List.get(int)>
	//   50   88:checkcast       #72  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   51   91:putfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
			if(loadData != null && (helper.getDiskCacheStrategy().isDataCacheable(loadData.fetcher.getDataSource()) || helper.hasLoadPath(loadData.fetcher.getDataClass())))
	//*  52   94:aload_0         
	//*  53   95:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  54   98:ifnull          49
	//*  55  101:aload_0         
	//*  56  102:getfield        #38  <Field DecodeHelper helper>
	//*  57  105:invokevirtual   #192 <Method DiskCacheStrategy DecodeHelper.getDiskCacheStrategy()>
	//*  58  108:aload_0         
	//*  59  109:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  60  112:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  61  115:invokeinterface #179 <Method DataSource DataFetcher.getDataSource()>
	//*  62  120:invokevirtual   #198 <Method boolean DiskCacheStrategy.isDataCacheable(DataSource)>
	//*  63  123:ifne            148
	//*  64  126:aload_0         
	//*  65  127:getfield        #38  <Field DecodeHelper helper>
	//*  66  130:aload_0         
	//*  67  131:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//*  68  134:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//*  69  137:invokeinterface #225 <Method Class DataFetcher.getDataClass()>
	//*  70  142:invokevirtual   #229 <Method boolean DecodeHelper.hasLoadPath(Class)>
	//*  71  145:ifeq            49
			{
				loadData.fetcher.loadData(helper.getPriority(), ((com.bumptech.glide.load.data.DataFetcher.DataCallback) (this)));
	//   72  148:aload_0         
	//   73  149:getfield        #70  <Field com.bumptech.glide.load.model.ModelLoader$LoadData loadData>
	//   74  152:getfield        #138 <Field DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   75  155:aload_0         
	//   76  156:getfield        #38  <Field DecodeHelper helper>
	//   77  159:invokevirtual   #233 <Method com.bumptech.glide.Priority DecodeHelper.getPriority()>
	//   78  162:aload_0         
	//   79  163:invokeinterface #236 <Method void DataFetcher.loadData(com.bumptech.glide.Priority, com.bumptech.glide.load.data.DataFetcher$DataCallback)>
				flag = true;
	//   80  168:iconst_1        
	//   81  169:istore_2        
			}
		} while(true);
	//   82  170:goto            49
		return flag;
	//   83  173:iload_2         
	//   84  174:ireturn         
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

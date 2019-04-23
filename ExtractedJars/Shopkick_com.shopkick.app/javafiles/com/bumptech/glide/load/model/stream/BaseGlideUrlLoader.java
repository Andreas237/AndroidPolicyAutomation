// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.*;
import java.util.*;

public abstract class BaseGlideUrlLoader
	implements ModelLoader
{

	protected BaseGlideUrlLoader(ModelLoader modelloader)
	{
		this(modelloader, ((ModelCache) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void BaseGlideUrlLoader(ModelLoader, ModelCache)>
	//    4    6:return          
	}

	protected BaseGlideUrlLoader(ModelLoader modelloader, ModelCache modelcache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		concreteLoader = modelloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ModelLoader concreteLoader>
		modelCache = modelcache;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field ModelCache modelCache>
	//    8   14:return          
	}

	private static List getAlternateKeys(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #41  <Method int Collection.size()>
	//    4   10:invokespecial   #44  <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Object) (new GlideUrl((String)((Iterator) (collection)).next())))));
	//    6   14:aload_0         
	//    7   15:invokeinterface #48  <Method Iterator Collection.iterator()>
	//    8   20:astore_0        
	//    9   21:aload_0         
	//   10   22:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            56
	//   12   30:aload_1         
	//   13   31:new             #56  <Class GlideUrl>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokeinterface #60  <Method Object Iterator.next()>
	//   17   41:checkcast       #62  <Class String>
	//   18   44:invokespecial   #65  <Method void GlideUrl(String)>
	//   19   47:invokeinterface #71  <Method boolean List.add(Object)>
	//   20   52:pop             
	//*  21   53:goto            21
		return ((List) (arraylist));
	//   22   56:aload_1         
	//   23   57:areturn         
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		Object obj1 = ((Object) (modelCache));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ModelCache modelCache>
	//    2    4:astore          5
		if(obj1 != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          27
			obj1 = ((Object) ((GlideUrl)((ModelCache) (obj1)).get(obj, i, j)));
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #81  <Method Object ModelCache.get(Object, int, int)>
	//   10   19:checkcast       #56  <Class GlideUrl>
	//   11   22:astore          5
		else
	//*  12   24:goto            30
			obj1 = null;
	//   13   27:aconst_null     
	//   14   28:astore          5
		GlideUrl glideurl = ((GlideUrl) (obj1));
	//   15   30:aload           5
	//   16   32:astore          6
		if(obj1 == null)
	//*  17   34:aload           5
	//*  18   36:ifnonnull       101
		{
			Object obj2 = ((Object) (getUrl(obj, i, j, options)));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iload_2         
	//   22   42:iload_3         
	//   23   43:aload           4
	//   24   45:invokevirtual   #85  <Method String getUrl(Object, int, int, Options)>
	//   25   48:astore          5
			if(TextUtils.isEmpty(((CharSequence) (obj2))))
	//*  26   50:aload           5
	//*  27   52:invokestatic    #91  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  28   55:ifeq            60
				return null;
	//   29   58:aconst_null     
	//   30   59:areturn         
			glideurl = new GlideUrl(((String) (obj2)), getHeaders(obj, i, j, options));
	//   31   60:new             #56  <Class GlideUrl>
	//   32   63:dup             
	//   33   64:aload           5
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:iload_2         
	//   37   69:iload_3         
	//   38   70:aload           4
	//   39   72:invokevirtual   #95  <Method Headers getHeaders(Object, int, int, Options)>
	//   40   75:invokespecial   #98  <Method void GlideUrl(String, Headers)>
	//   41   78:astore          6
			obj2 = ((Object) (modelCache));
	//   42   80:aload_0         
	//   43   81:getfield        #29  <Field ModelCache modelCache>
	//   44   84:astore          5
			if(obj2 != null)
	//*  45   86:aload           5
	//*  46   88:ifnull          101
				((ModelCache) (obj2)).put(obj, i, j, ((Object) (glideurl)));
	//   47   91:aload           5
	//   48   93:aload_1         
	//   49   94:iload_2         
	//   50   95:iload_3         
	//   51   96:aload           6
	//   52   98:invokevirtual   #102 <Method void ModelCache.put(Object, int, int, Object)>
		}
		obj = ((Object) (getAlternateUrls(obj, i, j, options)));
	//   53  101:aload_0         
	//   54  102:aload_1         
	//   55  103:iload_2         
	//   56  104:iload_3         
	//   57  105:aload           4
	//   58  107:invokevirtual   #106 <Method List getAlternateUrls(Object, int, int, Options)>
	//   59  110:astore_1        
		options = ((Options) (concreteLoader.buildLoadData(((Object) (glideurl)), i, j, options)));
	//   60  111:aload_0         
	//   61  112:getfield        #27  <Field ModelLoader concreteLoader>
	//   62  115:aload           6
	//   63  117:iload_2         
	//   64  118:iload_3         
	//   65  119:aload           4
	//   66  121:invokeinterface #108 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   67  126:astore          4
		if(options != null)
	//*  68  128:aload           4
	//*  69  130:ifnull          167
		{
			if(((List) (obj)).isEmpty())
	//*  70  133:aload_1         
	//*  71  134:invokeinterface #110 <Method boolean List.isEmpty()>
	//*  72  139:ifeq            145
				return ((com.bumptech.glide.load.model.ModelLoader.LoadData) (options));
	//   73  142:aload           4
	//   74  144:areturn         
			else
				return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.model.ModelLoader.LoadData) (options)).sourceKey, getAlternateKeys(((Collection) (obj))), ((com.bumptech.glide.load.model.ModelLoader.LoadData) (options)).fetcher);
	//   75  145:new             #112 <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   76  148:dup             
	//   77  149:aload           4
	//   78  151:getfield        #116 <Field com.bumptech.glide.load.Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   79  154:aload_1         
	//   80  155:invokestatic    #118 <Method List getAlternateKeys(Collection)>
	//   81  158:aload           4
	//   82  160:getfield        #122 <Field com.bumptech.glide.load.data.DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   83  163:invokespecial   #125 <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, List, com.bumptech.glide.load.data.DataFetcher)>
	//   84  166:areturn         
		} else
		{
			return ((com.bumptech.glide.load.model.ModelLoader.LoadData) (options));
	//   85  167:aload           4
	//   86  169:areturn         
		}
	}

	protected List getAlternateUrls(Object obj, int i, int j, Options options)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #133 <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	protected Headers getHeaders(Object obj, int i, int j, Options options)
	{
		return Headers.DEFAULT;
	//    0    0:getstatic       #140 <Field Headers Headers.DEFAULT>
	//    1    3:areturn         
	}

	protected abstract String getUrl(Object obj, int i, int j, Options options);

	private final ModelLoader concreteLoader;
	private final ModelCache modelCache;
}

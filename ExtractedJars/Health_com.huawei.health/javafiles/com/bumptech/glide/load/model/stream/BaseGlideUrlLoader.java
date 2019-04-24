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

	private static List getAlternateKeys(List list)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #41  <Method int List.size()>
	//    4   10:invokespecial   #44  <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (new GlideUrl((String)((Iterator) (list)).next())))));
	//    6   14:aload_0         
	//    7   15:invokeinterface #48  <Method Iterator List.iterator()>
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
	//   19   47:invokeinterface #69  <Method boolean List.add(Object)>
	//   20   52:pop             
	//*  21   53:goto            21
		return ((List) (arraylist));
	//   22   56:aload_1         
	//   23   57:areturn         
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		GlideUrl glideurl = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		if(modelCache != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #29  <Field ModelCache modelCache>
	//*   4    7:ifnull          25
			glideurl = (GlideUrl)modelCache.get(obj, i, j);
	//    5   10:aload_0         
	//    6   11:getfield        #29  <Field ModelCache modelCache>
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:iload_3         
	//   10   17:invokevirtual   #78  <Method Object ModelCache.get(Object, int, int)>
	//   11   20:checkcast       #56  <Class GlideUrl>
	//   12   23:astore          5
		GlideUrl glideurl1 = glideurl;
	//   13   25:aload           5
	//   14   27:astore          6
		if(glideurl == null)
	//*  15   29:aload           5
	//*  16   31:ifnonnull       102
		{
			Object obj1 = ((Object) (getUrl(obj, i, j, options)));
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:iload_3         
	//   21   38:aload           4
	//   22   40:invokevirtual   #82  <Method String getUrl(Object, int, int, Options)>
	//   23   43:astore          5
			if(TextUtils.isEmpty(((CharSequence) (obj1))))
	//*  24   45:aload           5
	//*  25   47:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   50:ifeq            55
				return null;
	//   27   53:aconst_null     
	//   28   54:areturn         
			obj1 = ((Object) (new GlideUrl(((String) (obj1)), getHeaders(obj, i, j, options))));
	//   29   55:new             #56  <Class GlideUrl>
	//   30   58:dup             
	//   31   59:aload           5
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:iload_2         
	//   35   64:iload_3         
	//   36   65:aload           4
	//   37   67:invokevirtual   #92  <Method Headers getHeaders(Object, int, int, Options)>
	//   38   70:invokespecial   #95  <Method void GlideUrl(String, Headers)>
	//   39   73:astore          5
			glideurl1 = ((GlideUrl) (obj1));
	//   40   75:aload           5
	//   41   77:astore          6
			if(modelCache != null)
	//*  42   79:aload_0         
	//*  43   80:getfield        #29  <Field ModelCache modelCache>
	//*  44   83:ifnull          102
			{
				modelCache.put(obj, i, j, obj1);
	//   45   86:aload_0         
	//   46   87:getfield        #29  <Field ModelCache modelCache>
	//   47   90:aload_1         
	//   48   91:iload_2         
	//   49   92:iload_3         
	//   50   93:aload           5
	//   51   95:invokevirtual   #99  <Method void ModelCache.put(Object, int, int, Object)>
				glideurl1 = ((GlideUrl) (obj1));
	//   52   98:aload           5
	//   53  100:astore          6
			}
		}
		obj = ((Object) (getAlternateUrls(obj, i, j, options)));
	//   54  102:aload_0         
	//   55  103:aload_1         
	//   56  104:iload_2         
	//   57  105:iload_3         
	//   58  106:aload           4
	//   59  108:invokevirtual   #103 <Method List getAlternateUrls(Object, int, int, Options)>
	//   60  111:astore_1        
		options = ((Options) (concreteLoader.buildLoadData(((Object) (glideurl1)), i, j, options)));
	//   61  112:aload_0         
	//   62  113:getfield        #27  <Field ModelLoader concreteLoader>
	//   63  116:aload           6
	//   64  118:iload_2         
	//   65  119:iload_3         
	//   66  120:aload           4
	//   67  122:invokeinterface #105 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   68  127:astore          4
		if(((List) (obj)).isEmpty())
	//*  69  129:aload_1         
	//*  70  130:invokeinterface #107 <Method boolean List.isEmpty()>
	//*  71  135:ifeq            141
			return ((com.bumptech.glide.load.model.ModelLoader.LoadData) (options));
	//   72  138:aload           4
	//   73  140:areturn         
		else
			return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.model.ModelLoader.LoadData) (options)).sourceKey, getAlternateKeys(((List) (obj))), ((com.bumptech.glide.load.model.ModelLoader.LoadData) (options)).fetcher);
	//   74  141:new             #109 <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   75  144:dup             
	//   76  145:aload           4
	//   77  147:getfield        #113 <Field com.bumptech.glide.load.Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   78  150:aload_1         
	//   79  151:invokestatic    #115 <Method List getAlternateKeys(List)>
	//   80  154:aload           4
	//   81  156:getfield        #119 <Field com.bumptech.glide.load.data.DataFetcher com.bumptech.glide.load.model.ModelLoader$LoadData.fetcher>
	//   82  159:invokespecial   #122 <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, List, com.bumptech.glide.load.data.DataFetcher)>
	//   83  162:areturn         
	}

	protected List getAlternateUrls(Object obj, int i, int j, Options options)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #130 <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	protected Headers getHeaders(Object obj, int i, int j, Options options)
	{
		return Headers.DEFAULT;
	//    0    0:getstatic       #137 <Field Headers Headers.DEFAULT>
	//    1    3:areturn         
	}

	protected abstract String getUrl(Object obj, int i, int j, Options options);

	private final ModelLoader concreteLoader;
	private final ModelCache modelCache;
}

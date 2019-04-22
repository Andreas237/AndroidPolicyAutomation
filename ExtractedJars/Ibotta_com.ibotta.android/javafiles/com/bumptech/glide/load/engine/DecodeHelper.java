// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.*;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.io.File;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DiskCacheStrategy, LoadPath, Resource

final class DecodeHelper
{

	DecodeHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field List loadData>
	//    7   15:aload_0         
	//    8   16:new             #46  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void ArrayList()>
	//   11   23:putfield        #51  <Field List cacheKeys>
	//   12   26:return          
	}

	void clear()
	{
		glideContext = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #55  <Field GlideContext glideContext>
		model = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #57  <Field Object model>
		signature = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #59  <Field Key signature>
		resourceClass = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #61  <Field Class resourceClass>
		transcodeClass = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #63  <Field Class transcodeClass>
		options = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #65  <Field Options options>
		priority = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #67  <Field Priority priority>
		transformations = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #69  <Field Map transformations>
		diskCacheStrategy = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #71  <Field DiskCacheStrategy diskCacheStrategy>
		loadData.clear();
	//   27   45:aload_0         
	//   28   46:getfield        #49  <Field List loadData>
	//   29   49:invokeinterface #75  <Method void List.clear()>
		isLoadDataSet = false;
	//   30   54:aload_0         
	//   31   55:iconst_0        
	//   32   56:putfield        #77  <Field boolean isLoadDataSet>
		cacheKeys.clear();
	//   33   59:aload_0         
	//   34   60:getfield        #51  <Field List cacheKeys>
	//   35   63:invokeinterface #75  <Method void List.clear()>
		isCacheKeysSet = false;
	//   36   68:aload_0         
	//   37   69:iconst_0        
	//   38   70:putfield        #79  <Field boolean isCacheKeysSet>
	//   39   73:return          
	}

	ArrayPool getArrayPool()
	{
		return glideContext.getArrayPool();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #85  <Method ArrayPool GlideContext.getArrayPool()>
	//    3    7:areturn         
	}

	List getCacheKeys()
	{
		if(!isCacheKeysSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean isCacheKeysSet>
	//*   2    4:ifne            161
		{
			isCacheKeysSet = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #79  <Field boolean isCacheKeysSet>
			cacheKeys.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field List cacheKeys>
	//    8   16:invokeinterface #75  <Method void List.clear()>
			List list = getLoadData();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #90  <Method List getLoadData()>
	//   11   25:astore          4
			int k = list.size();
	//   12   27:aload           4
	//   13   29:invokeinterface #94  <Method int List.size()>
	//   14   34:istore_3        
			for(int i = 0; i < k; i++)
	//*  15   35:iconst_0        
	//*  16   36:istore_1        
	//*  17   37:iload_1         
	//*  18   38:iload_3         
	//*  19   39:icmpge          161
			{
				com.bumptech.glide.load.model.ModelLoader.LoadData loaddata = (com.bumptech.glide.load.model.ModelLoader.LoadData)list.get(i);
	//   20   42:aload           4
	//   21   44:iload_1         
	//   22   45:invokeinterface #98  <Method Object List.get(int)>
	//   23   50:checkcast       #100 <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   24   53:astore          5
				if(!cacheKeys.contains(((Object) (loaddata.sourceKey))))
	//*  25   55:aload_0         
	//*  26   56:getfield        #51  <Field List cacheKeys>
	//*  27   59:aload           5
	//*  28   61:getfield        #103 <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//*  29   64:invokeinterface #107 <Method boolean List.contains(Object)>
	//*  30   69:ifne            87
					cacheKeys.add(((Object) (loaddata.sourceKey)));
	//   31   72:aload_0         
	//   32   73:getfield        #51  <Field List cacheKeys>
	//   33   76:aload           5
	//   34   78:getfield        #103 <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//   35   81:invokeinterface #110 <Method boolean List.add(Object)>
	//   36   86:pop             
				for(int j = 0; j < loaddata.alternateKeys.size(); j++)
	//*  37   87:iconst_0        
	//*  38   88:istore_2        
	//*  39   89:iload_2         
	//*  40   90:aload           5
	//*  41   92:getfield        #113 <Field List com.bumptech.glide.load.model.ModelLoader$LoadData.alternateKeys>
	//*  42   95:invokeinterface #94  <Method int List.size()>
	//*  43  100:icmpge          154
					if(!cacheKeys.contains(loaddata.alternateKeys.get(j)))
	//*  44  103:aload_0         
	//*  45  104:getfield        #51  <Field List cacheKeys>
	//*  46  107:aload           5
	//*  47  109:getfield        #113 <Field List com.bumptech.glide.load.model.ModelLoader$LoadData.alternateKeys>
	//*  48  112:iload_2         
	//*  49  113:invokeinterface #98  <Method Object List.get(int)>
	//*  50  118:invokeinterface #107 <Method boolean List.contains(Object)>
	//*  51  123:ifne            147
						cacheKeys.add(loaddata.alternateKeys.get(j));
	//   52  126:aload_0         
	//   53  127:getfield        #51  <Field List cacheKeys>
	//   54  130:aload           5
	//   55  132:getfield        #113 <Field List com.bumptech.glide.load.model.ModelLoader$LoadData.alternateKeys>
	//   56  135:iload_2         
	//   57  136:invokeinterface #98  <Method Object List.get(int)>
	//   58  141:invokeinterface #110 <Method boolean List.add(Object)>
	//   59  146:pop             

	//   60  147:iload_2         
	//   61  148:iconst_1        
	//   62  149:iadd            
	//   63  150:istore_2        
			}

	//   64  151:goto            89
	//   65  154:iload_1         
	//   66  155:iconst_1        
	//   67  156:iadd            
	//   68  157:istore_1        
		}
	//*  69  158:goto            37
		return cacheKeys;
	//   70  161:aload_0         
	//   71  162:getfield        #51  <Field List cacheKeys>
	//   72  165:areturn         
	}

	DiskCache getDiskCache()
	{
		return diskCacheProvider.getDiskCache();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//    2    4:invokeinterface #123 <Method DiskCache DecodeJob$DiskCacheProvider.getDiskCache()>
	//    3    9:areturn         
	}

	DiskCacheStrategy getDiskCacheStrategy()
	{
		return diskCacheStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field DiskCacheStrategy diskCacheStrategy>
	//    2    4:areturn         
	}

	int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int height>
	//    2    4:ireturn         
	}

	List getLoadData()
	{
		if(!isLoadDataSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean isLoadDataSet>
	//*   2    4:ifne            107
		{
			isLoadDataSet = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #77  <Field boolean isLoadDataSet>
			loadData.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field List loadData>
	//    8   16:invokeinterface #75  <Method void List.clear()>
			List list = glideContext.getRegistry().getModelLoaders(model);
	//    9   21:aload_0         
	//   10   22:getfield        #55  <Field GlideContext glideContext>
	//   11   25:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//   12   28:aload_0         
	//   13   29:getfield        #57  <Field Object model>
	//   14   32:invokevirtual   #138 <Method List Registry.getModelLoaders(Object)>
	//   15   35:astore_3        
			int i = 0;
	//   16   36:iconst_0        
	//   17   37:istore_1        
			for(int j = list.size(); i < j; i++)
	//*  18   38:aload_3         
	//*  19   39:invokeinterface #94  <Method int List.size()>
	//*  20   44:istore_2        
	//*  21   45:iload_1         
	//*  22   46:iload_2         
	//*  23   47:icmpge          107
			{
				com.bumptech.glide.load.model.ModelLoader.LoadData loaddata = ((ModelLoader)list.get(i)).buildLoadData(model, width, height, options);
	//   24   50:aload_3         
	//   25   51:iload_1         
	//   26   52:invokeinterface #98  <Method Object List.get(int)>
	//   27   57:checkcast       #140 <Class ModelLoader>
	//   28   60:aload_0         
	//   29   61:getfield        #57  <Field Object model>
	//   30   64:aload_0         
	//   31   65:getfield        #142 <Field int width>
	//   32   68:aload_0         
	//   33   69:getfield        #128 <Field int height>
	//   34   72:aload_0         
	//   35   73:getfield        #65  <Field Options options>
	//   36   76:invokeinterface #146 <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   37   81:astore          4
				if(loaddata != null)
	//*  38   83:aload           4
	//*  39   85:ifnull          100
					loadData.add(((Object) (loaddata)));
	//   40   88:aload_0         
	//   41   89:getfield        #49  <Field List loadData>
	//   42   92:aload           4
	//   43   94:invokeinterface #110 <Method boolean List.add(Object)>
	//   44   99:pop             
			}

	//   45  100:iload_1         
	//   46  101:iconst_1        
	//   47  102:iadd            
	//   48  103:istore_1        
		}
	//*  49  104:goto            45
		return loadData;
	//   50  107:aload_0         
	//   51  108:getfield        #49  <Field List loadData>
	//   52  111:areturn         
	}

	LoadPath getLoadPath(Class class1)
	{
		return glideContext.getRegistry().getLoadPath(class1, resourceClass, transcodeClass);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field Class resourceClass>
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field Class transcodeClass>
	//    8   16:invokevirtual   #152 <Method LoadPath Registry.getLoadPath(Class, Class, Class)>
	//    9   19:areturn         
	}

	Class getModelClass()
	{
		return model.getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object model>
	//    2    4:invokevirtual   #158 <Method Class Object.getClass()>
	//    3    7:areturn         
	}

	List getModelLoaders(File file)
		throws com.bumptech.glide.Registry.NoModelLoaderAvailableException
	{
		return glideContext.getRegistry().getModelLoaders(((Object) (file)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #138 <Method List Registry.getModelLoaders(Object)>
	//    5   11:areturn         
	}

	Options getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Options options>
	//    2    4:areturn         
	}

	Priority getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Priority priority>
	//    2    4:areturn         
	}

	List getRegisteredResourceClasses()
	{
		return glideContext.getRegistry().getRegisteredResourceClasses(model.getClass(), resourceClass, transcodeClass);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field Object model>
	//    5   11:invokevirtual   #158 <Method Class Object.getClass()>
	//    6   14:aload_0         
	//    7   15:getfield        #61  <Field Class resourceClass>
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field Class transcodeClass>
	//   10   22:invokevirtual   #172 <Method List Registry.getRegisteredResourceClasses(Class, Class, Class)>
	//   11   25:areturn         
	}

	ResourceEncoder getResultEncoder(Resource resource)
	{
		return glideContext.getRegistry().getResultEncoder(resource);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #177 <Method ResourceEncoder Registry.getResultEncoder(Resource)>
	//    5   11:areturn         
	}

	Key getSignature()
	{
		return signature;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Key signature>
	//    2    4:areturn         
	}

	Encoder getSourceEncoder(Object obj)
		throws com.bumptech.glide.Registry.NoSourceEncoderAvailableException
	{
		return glideContext.getRegistry().getSourceEncoder(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #186 <Method Encoder Registry.getSourceEncoder(Object)>
	//    5   11:areturn         
	}

	Class getTranscodeClass()
	{
		return transcodeClass;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Class transcodeClass>
	//    2    4:areturn         
	}

	Transformation getTransformation(Class class1)
	{
		Object obj;
label0:
		{
			Transformation transformation = (Transformation)transformations.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Map transformations>
	//    2    4:aload_1         
	//    3    5:invokeinterface #195 <Method Object Map.get(Object)>
	//    4   10:checkcast       #197 <Class Transformation>
	//    5   13:astore_3        
			obj = ((Object) (transformation));
	//    6   14:aload_3         
	//    7   15:astore_2        
			if(transformation != null)
				break label0;
	//    8   16:aload_3         
	//    9   17:ifnonnull       85
			Iterator iterator = transformations.entrySet().iterator();
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field Map transformations>
	//   12   24:invokeinterface #201 <Method Set Map.entrySet()>
	//   13   29:invokeinterface #207 <Method Iterator Set.iterator()>
	//   14   34:astore          4
			do
			{
				obj = ((Object) (transformation));
	//   15   36:aload_3         
	//   16   37:astore_2        
				if(!iterator.hasNext())
					break label0;
	//   17   38:aload           4
	//   18   40:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//   19   45:ifeq            85
				obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   20   48:aload           4
	//   21   50:invokeinterface #217 <Method Object Iterator.next()>
	//   22   55:checkcast       #219 <Class java.util.Map$Entry>
	//   23   58:astore_2        
			} while(!((Class)((java.util.Map.Entry) (obj)).getKey()).isAssignableFrom(class1));
	//   24   59:aload_2         
	//   25   60:invokeinterface #222 <Method Object java.util.Map$Entry.getKey()>
	//   26   65:checkcast       #224 <Class Class>
	//   27   68:aload_1         
	//   28   69:invokevirtual   #228 <Method boolean Class.isAssignableFrom(Class)>
	//   29   72:ifeq            36
			obj = ((Object) ((Transformation)((java.util.Map.Entry) (obj)).getValue()));
	//   30   75:aload_2         
	//   31   76:invokeinterface #231 <Method Object java.util.Map$Entry.getValue()>
	//   32   81:checkcast       #197 <Class Transformation>
	//   33   84:astore_2        
		}
		if(obj == null)
	//*  34   85:aload_2         
	//*  35   86:ifnonnull       155
		{
			if(transformations.isEmpty() && isTransformationRequired)
	//*  36   89:aload_0         
	//*  37   90:getfield        #69  <Field Map transformations>
	//*  38   93:invokeinterface #234 <Method boolean Map.isEmpty()>
	//*  39   98:ifeq            151
	//*  40  101:aload_0         
	//*  41  102:getfield        #236 <Field boolean isTransformationRequired>
	//*  42  105:ifne            111
	//*  43  108:goto            151
			{
				obj = ((Object) (new StringBuilder()));
	//   44  111:new             #238 <Class StringBuilder>
	//   45  114:dup             
	//   46  115:invokespecial   #239 <Method void StringBuilder()>
	//   47  118:astore_2        
				((StringBuilder) (obj)).append("Missing transformation for ");
	//   48  119:aload_2         
	//   49  120:ldc1            #241 <String "Missing transformation for ">
	//   50  122:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   51  125:pop             
				((StringBuilder) (obj)).append(((Object) (class1)));
	//   52  126:aload_2         
	//   53  127:aload_1         
	//   54  128:invokevirtual   #248 <Method StringBuilder StringBuilder.append(Object)>
	//   55  131:pop             
				((StringBuilder) (obj)).append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
	//   56  132:aload_2         
	//   57  133:ldc1            #250 <String ". If you wish to ignore unknown resource types, use the optional transformation methods.">
	//   58  135:invokevirtual   #245 <Method StringBuilder StringBuilder.append(String)>
	//   59  138:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   60  139:new             #252 <Class IllegalArgumentException>
	//   61  142:dup             
	//   62  143:aload_2         
	//   63  144:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   64  147:invokespecial   #259 <Method void IllegalArgumentException(String)>
	//   65  150:athrow          
			} else
			{
				return ((Transformation) (UnitTransformation.get()));
	//   66  151:invokestatic    #264 <Method UnitTransformation UnitTransformation.get()>
	//   67  154:areturn         
			}
		} else
		{
			return ((Transformation) (obj));
	//   68  155:aload_2         
	//   69  156:areturn         
		}
	}

	int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int width>
	//    2    4:ireturn         
	}

	boolean hasLoadPath(Class class1)
	{
		return getLoadPath(class1) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #269 <Method LoadPath getLoadPath(Class)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	void init(GlideContext glidecontext, Object obj, Key key, int i, int j, DiskCacheStrategy diskcachestrategy, Class class1, 
			Class class2, Priority priority1, Options options1, Map map, boolean flag, boolean flag1, DecodeJob.DiskCacheProvider diskcacheprovider)
	{
		glideContext = glidecontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field GlideContext glideContext>
		model = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #57  <Field Object model>
		signature = key;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #59  <Field Key signature>
		width = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #142 <Field int width>
		height = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #128 <Field int height>
		diskCacheStrategy = diskcachestrategy;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #71  <Field DiskCacheStrategy diskCacheStrategy>
		resourceClass = class1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #61  <Field Class resourceClass>
		diskCacheProvider = diskcacheprovider;
	//   21   39:aload_0         
	//   22   40:aload           14
	//   23   42:putfield        #119 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
		transcodeClass = class2;
	//   24   45:aload_0         
	//   25   46:aload           8
	//   26   48:putfield        #63  <Field Class transcodeClass>
		priority = priority1;
	//   27   51:aload_0         
	//   28   52:aload           9
	//   29   54:putfield        #67  <Field Priority priority>
		options = options1;
	//   30   57:aload_0         
	//   31   58:aload           10
	//   32   60:putfield        #65  <Field Options options>
		transformations = map;
	//   33   63:aload_0         
	//   34   64:aload           11
	//   35   66:putfield        #69  <Field Map transformations>
		isTransformationRequired = flag;
	//   36   69:aload_0         
	//   37   70:iload           12
	//   38   72:putfield        #236 <Field boolean isTransformationRequired>
		isScaleOnlyOrNoTransform = flag1;
	//   39   75:aload_0         
	//   40   76:iload           13
	//   41   78:putfield        #274 <Field boolean isScaleOnlyOrNoTransform>
	//   42   81:return          
	}

	boolean isResourceEncoderAvailable(Resource resource)
	{
		return glideContext.getRegistry().isResourceEncoderAvailable(resource);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field GlideContext glideContext>
	//    2    4:invokevirtual   #132 <Method Registry GlideContext.getRegistry()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #279 <Method boolean Registry.isResourceEncoderAvailable(Resource)>
	//    5   11:ireturn         
	}

	boolean isScaleOnlyOrNoTransform()
	{
		return isScaleOnlyOrNoTransform;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field boolean isScaleOnlyOrNoTransform>
	//    2    4:ireturn         
	}

	boolean isSourceKey(Key key)
	{
		List list = getLoadData();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method List getLoadData()>
	//    2    4:astore          4
		int j = list.size();
	//    3    6:aload           4
	//    4    8:invokeinterface #94  <Method int List.size()>
	//    5   13:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_2        
	//*   8   16:iload_2         
	//*   9   17:iload_3         
	//*  10   18:icmpge          53
			if(((com.bumptech.glide.load.model.ModelLoader.LoadData)list.get(i)).sourceKey.equals(((Object) (key))))
	//*  11   21:aload           4
	//*  12   23:iload_2         
	//*  13   24:invokeinterface #98  <Method Object List.get(int)>
	//*  14   29:checkcast       #100 <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//*  15   32:getfield        #103 <Field Key com.bumptech.glide.load.model.ModelLoader$LoadData.sourceKey>
	//*  16   35:aload_1         
	//*  17   36:invokeinterface #287 <Method boolean Key.equals(Object)>
	//*  18   41:ifeq            46
				return true;
	//   19   44:iconst_1        
	//   20   45:ireturn         

	//   21   46:iload_2         
	//   22   47:iconst_1        
	//   23   48:iadd            
	//   24   49:istore_2        
	//*  25   50:goto            16
		return false;
	//   26   53:iconst_0        
	//   27   54:ireturn         
	}

	private final List cacheKeys = new ArrayList();
	private DecodeJob.DiskCacheProvider diskCacheProvider;
	private DiskCacheStrategy diskCacheStrategy;
	private GlideContext glideContext;
	private int height;
	private boolean isCacheKeysSet;
	private boolean isLoadDataSet;
	private boolean isScaleOnlyOrNoTransform;
	private boolean isTransformationRequired;
	private final List loadData = new ArrayList();
	private Object model;
	private Options options;
	private Priority priority;
	private Class resourceClass;
	private Key signature;
	private Class transcodeClass;
	private Map transformations;
	private int width;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.*;

public class Registry
{
	public static class MissingComponentException extends RuntimeException
	{

		public MissingComponentException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}

	public static final class NoImageHeaderParserException extends MissingComponentException
	{

		public NoImageHeaderParserException()
		{
			super("Failed to find image header parser.");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "Failed to find image header parser.">
		//    2    3:invokespecial   #14  <Method void Registry$MissingComponentException(String)>
		//    3    6:return          
		}
	}

	public static class NoModelLoaderAvailableException extends MissingComponentException
	{

		public NoModelLoaderAvailableException(Class class1, Class class2)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #12  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("Failed to find any ModelLoaders for model: ");
		//    4    8:aload_3         
		//    5    9:ldc1            #17  <String "Failed to find any ModelLoaders for model: ">
		//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (class1)));
		//    8   15:aload_3         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			stringbuilder.append(" and data: ");
		//   12   21:aload_3         
		//   13   22:ldc1            #26  <String " and data: ">
		//   14   24:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//   15   27:pop             
			stringbuilder.append(((Object) (class2)));
		//   16   28:aload_3         
		//   17   29:aload_2         
		//   18   30:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
		//   19   33:pop             
			super(stringbuilder.toString());
		//   20   34:aload_0         
		//   21   35:aload_3         
		//   22   36:invokevirtual   #30  <Method String StringBuilder.toString()>
		//   23   39:invokespecial   #33  <Method void Registry$MissingComponentException(String)>
		//   24   42:return          
		}

		public NoModelLoaderAvailableException(Object obj)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #12  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Failed to find any ModelLoaders for model: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #17  <String "Failed to find any ModelLoaders for model: ">
		//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(obj);
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #30  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #33  <Method void Registry$MissingComponentException(String)>
		//   16   29:return          
		}
	}

	public static class NoResultEncoderAvailableException extends MissingComponentException
	{

		public NoResultEncoderAvailableException(Class class1)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #12  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Failed to find result encoder for resource class: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #17  <String "Failed to find result encoder for resource class: ">
		//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (class1)));
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			stringbuilder.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
		//   12   21:aload_2         
		//   13   22:ldc1            #26  <String ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.">
		//   14   24:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//   15   27:pop             
			super(stringbuilder.toString());
		//   16   28:aload_0         
		//   17   29:aload_2         
		//   18   30:invokevirtual   #30  <Method String StringBuilder.toString()>
		//   19   33:invokespecial   #33  <Method void Registry$MissingComponentException(String)>
		//   20   36:return          
		}
	}

	public static class NoSourceEncoderAvailableException extends MissingComponentException
	{

		public NoSourceEncoderAvailableException(Class class1)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #12  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Failed to find source encoder for data class: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #17  <String "Failed to find source encoder for data class: ">
		//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (class1)));
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
		//   11   20:pop             
			super(stringbuilder.toString());
		//   12   21:aload_0         
		//   13   22:aload_2         
		//   14   23:invokevirtual   #28  <Method String StringBuilder.toString()>
		//   15   26:invokespecial   #31  <Method void Registry$MissingComponentException(String)>
		//   16   29:return          
		}
	}


	public Registry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #62  <Class ModelToResourceClassCache>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void ModelToResourceClassCache()>
	//    6   12:putfield        #65  <Field ModelToResourceClassCache modelToResourceClassCache>
	//    7   15:aload_0         
	//    8   16:new             #67  <Class LoadPathCache>
	//    9   19:dup             
	//   10   20:invokespecial   #68  <Method void LoadPathCache()>
	//   11   23:putfield        #70  <Field LoadPathCache loadPathCache>
	//   12   26:aload_0         
	//   13   27:invokestatic    #76  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafeList()>
	//   14   30:putfield        #78  <Field android.support.v4.util.Pools$Pool throwableListPool>
		modelLoaderRegistry = new ModelLoaderRegistry(throwableListPool);
	//   15   33:aload_0         
	//   16   34:new             #80  <Class ModelLoaderRegistry>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:getfield        #78  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//   20   42:invokespecial   #83  <Method void ModelLoaderRegistry(android.support.v4.util.Pools$Pool)>
	//   21   45:putfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//   22   48:aload_0         
	//   23   49:new             #87  <Class EncoderRegistry>
	//   24   52:dup             
	//   25   53:invokespecial   #88  <Method void EncoderRegistry()>
	//   26   56:putfield        #90  <Field EncoderRegistry encoderRegistry>
	//   27   59:aload_0         
	//   28   60:new             #92  <Class ResourceDecoderRegistry>
	//   29   63:dup             
	//   30   64:invokespecial   #93  <Method void ResourceDecoderRegistry()>
	//   31   67:putfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//   32   70:aload_0         
	//   33   71:new             #97  <Class ResourceEncoderRegistry>
	//   34   74:dup             
	//   35   75:invokespecial   #98  <Method void ResourceEncoderRegistry()>
	//   36   78:putfield        #100 <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//   37   81:aload_0         
	//   38   82:new             #102 <Class DataRewinderRegistry>
	//   39   85:dup             
	//   40   86:invokespecial   #103 <Method void DataRewinderRegistry()>
	//   41   89:putfield        #105 <Field DataRewinderRegistry dataRewinderRegistry>
	//   42   92:aload_0         
	//   43   93:new             #107 <Class TranscoderRegistry>
	//   44   96:dup             
	//   45   97:invokespecial   #108 <Method void TranscoderRegistry()>
	//   46  100:putfield        #110 <Field TranscoderRegistry transcoderRegistry>
	//   47  103:aload_0         
	//   48  104:new             #112 <Class ImageHeaderParserRegistry>
	//   49  107:dup             
	//   50  108:invokespecial   #113 <Method void ImageHeaderParserRegistry()>
	//   51  111:putfield        #115 <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
		setResourceDecoderBucketPriorityList(Arrays.asList(((Object []) (new String[] {
			"Gif", "Bitmap", "BitmapDrawable"
		}))));
	//   52  114:aload_0         
	//   53  115:iconst_3        
	//   54  116:anewarray       String[]
	//   55  119:dup             
	//   56  120:iconst_0        
	//   57  121:ldc1            #32  <String "Gif">
	//   58  123:aastore         
	//   59  124:dup             
	//   60  125:iconst_1        
	//   61  126:ldc1            #26  <String "Bitmap">
	//   62  128:aastore         
	//   63  129:dup             
	//   64  130:iconst_2        
	//   65  131:ldc1            #29  <String "BitmapDrawable">
	//   66  133:aastore         
	//   67  134:invokestatic    #123 <Method List Arrays.asList(Object[])>
	//   68  137:invokevirtual   #127 <Method Registry setResourceDecoderBucketPriorityList(List)>
	//   69  140:pop             
	//   70  141:return          
	}

	private List getDecodePaths(Class class1, Class class2, Class class3)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore          4
		for(class2 = ((Class) (decoderRegistry.getResourceClasses(class1, class2).iterator())); ((Iterator) (class2)).hasNext();)
	//*   4    9:aload_0         
	//*   5   10:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//*   6   13:aload_1         
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #138 <Method List ResourceDecoderRegistry.getResourceClasses(Class, Class)>
	//*   9   18:invokeinterface #144 <Method Iterator List.iterator()>
	//*  10   23:astore_2        
	//*  11   24:aload_2         
	//*  12   25:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  13   30:ifeq            131
		{
			Class class4 = (Class)((Iterator) (class2)).next();
	//   14   33:aload_2         
	//   15   34:invokeinterface #154 <Method Object Iterator.next()>
	//   16   39:checkcast       #156 <Class Class>
	//   17   42:astore          5
			Iterator iterator = transcoderRegistry.getTranscodeClasses(class4, class3).iterator();
	//   18   44:aload_0         
	//   19   45:getfield        #110 <Field TranscoderRegistry transcoderRegistry>
	//   20   48:aload           5
	//   21   50:aload_3         
	//   22   51:invokevirtual   #159 <Method List TranscoderRegistry.getTranscodeClasses(Class, Class)>
	//   23   54:invokeinterface #144 <Method Iterator List.iterator()>
	//   24   59:astore          6
			while(iterator.hasNext()) 
	//*  25   61:aload           6
	//*  26   63:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  27   68:ifeq            24
			{
				Class class5 = (Class)iterator.next();
	//   28   71:aload           6
	//   29   73:invokeinterface #154 <Method Object Iterator.next()>
	//   30   78:checkcast       #156 <Class Class>
	//   31   81:astore          7
				((List) (arraylist)).add(((Object) (new DecodePath(class1, class4, class5, decoderRegistry.getDecoders(class1, class4), transcoderRegistry.get(class4, class5), throwableListPool))));
	//   32   83:aload           4
	//   33   85:new             #161 <Class DecodePath>
	//   34   88:dup             
	//   35   89:aload_1         
	//   36   90:aload           5
	//   37   92:aload           7
	//   38   94:aload_0         
	//   39   95:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//   40   98:aload_1         
	//   41   99:aload           5
	//   42  101:invokevirtual   #164 <Method List ResourceDecoderRegistry.getDecoders(Class, Class)>
	//   43  104:aload_0         
	//   44  105:getfield        #110 <Field TranscoderRegistry transcoderRegistry>
	//   45  108:aload           5
	//   46  110:aload           7
	//   47  112:invokevirtual   #168 <Method ResourceTranscoder TranscoderRegistry.get(Class, Class)>
	//   48  115:aload_0         
	//   49  116:getfield        #78  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//   50  119:invokespecial   #171 <Method void DecodePath(Class, Class, Class, List, ResourceTranscoder, android.support.v4.util.Pools$Pool)>
	//   51  122:invokeinterface #175 <Method boolean List.add(Object)>
	//   52  127:pop             
			}
		}

	//*  53  128:goto            61
		return ((List) (arraylist));
	//   54  131:aload           4
	//   55  133:areturn         
	}

	public Registry append(Class class1, Encoder encoder)
	{
		encoderRegistry.append(class1, encoder);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field EncoderRegistry encoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #184 <Method void EncoderRegistry.append(Class, Encoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry append(Class class1, ResourceEncoder resourceencoder)
	{
		resourceEncoderRegistry.append(class1, resourceencoder);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #189 <Method void ResourceEncoderRegistry.append(Class, ResourceEncoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry append(Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		append("legacy_append", class1, class2, resourcedecoder);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "legacy_append">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #194 <Method Registry append(String, Class, Class, ResourceDecoder)>
	//    6    9:pop             
		return this;
	//    7   10:aload_0         
	//    8   11:areturn         
	}

	public Registry append(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.append(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #199 <Method void ModelLoaderRegistry.append(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry append(String s, Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		decoderRegistry.append(s, resourcedecoder, class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #203 <Method void ResourceDecoderRegistry.append(String, ResourceDecoder, Class, Class)>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public List getImageHeaderParsers()
	{
		List list = imageHeaderParserRegistry.getParsers();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
	//    2    4:invokevirtual   #209 <Method List ImageHeaderParserRegistry.getParsers()>
	//    3    7:astore_1        
		if(!list.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #212 <Method boolean List.isEmpty()>
	//*   6   14:ifne            19
			return list;
	//    7   17:aload_1         
	//    8   18:areturn         
		else
			throw new NoImageHeaderParserException();
	//    9   19:new             #9   <Class Registry$NoImageHeaderParserException>
	//   10   22:dup             
	//   11   23:invokespecial   #213 <Method void Registry$NoImageHeaderParserException()>
	//   12   26:athrow          
	}

	public LoadPath getLoadPath(Class class1, Class class2, Class class3)
	{
		LoadPath loadpath = loadPathCache.get(class1, class2, class3);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field LoadPathCache loadPathCache>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #219 <Method LoadPath LoadPathCache.get(Class, Class, Class)>
	//    6   10:astore          5
		if(loadPathCache.isEmptyLoadPath(loadpath))
	//*   7   12:aload_0         
	//*   8   13:getfield        #70  <Field LoadPathCache loadPathCache>
	//*   9   16:aload           5
	//*  10   18:invokevirtual   #223 <Method boolean LoadPathCache.isEmptyLoadPath(LoadPath)>
	//*  11   21:ifeq            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		Object obj = ((Object) (loadpath));
	//   14   26:aload           5
	//   15   28:astore          4
		if(loadpath == null)
	//*  16   30:aload           5
	//*  17   32:ifnonnull       90
		{
			obj = ((Object) (getDecodePaths(class1, class2, class3)));
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:aload_3         
	//   22   39:invokespecial   #225 <Method List getDecodePaths(Class, Class, Class)>
	//   23   42:astore          4
			if(((List) (obj)).isEmpty())
	//*  24   44:aload           4
	//*  25   46:invokeinterface #212 <Method boolean List.isEmpty()>
	//*  26   51:ifeq            60
				obj = null;
	//   27   54:aconst_null     
	//   28   55:astore          4
			else
	//*  29   57:goto            78
				obj = ((Object) (new LoadPath(class1, class2, class3, ((List) (obj)), throwableListPool)));
	//   30   60:new             #227 <Class LoadPath>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aload_3         
	//   35   67:aload           4
	//   36   69:aload_0         
	//   37   70:getfield        #78  <Field android.support.v4.util.Pools$Pool throwableListPool>
	//   38   73:invokespecial   #230 <Method void LoadPath(Class, Class, Class, List, android.support.v4.util.Pools$Pool)>
	//   39   76:astore          4
			loadPathCache.put(class1, class2, class3, ((LoadPath) (obj)));
	//   40   78:aload_0         
	//   41   79:getfield        #70  <Field LoadPathCache loadPathCache>
	//   42   82:aload_1         
	//   43   83:aload_2         
	//   44   84:aload_3         
	//   45   85:aload           4
	//   46   87:invokevirtual   #234 <Method void LoadPathCache.put(Class, Class, Class, LoadPath)>
		}
		return ((LoadPath) (obj));
	//   47   90:aload           4
	//   48   92:areturn         
	}

	public List getModelLoaders(Object obj)
	{
		List list = modelLoaderRegistry.getModelLoaders(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #239 <Method List ModelLoaderRegistry.getModelLoaders(Object)>
	//    4    8:astore_2        
		if(!list.isEmpty())
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #212 <Method boolean List.isEmpty()>
	//*   7   15:ifne            20
			return list;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			throw new NoModelLoaderAvailableException(obj);
	//   10   20:new             #12  <Class Registry$NoModelLoaderAvailableException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #242 <Method void Registry$NoModelLoaderAvailableException(Object)>
	//   14   28:athrow          
	}

	public List getRegisteredResourceClasses(Class class1, Class class2, Class class3)
	{
		List list = modelToResourceClassCache.get(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ModelToResourceClassCache modelToResourceClassCache>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #246 <Method List ModelToResourceClassCache.get(Class, Class)>
	//    5    9:astore          5
		Object obj = ((Object) (list));
	//    6   11:aload           5
	//    7   13:astore          4
		if(list == null)
	//*   8   15:aload           5
	//*   9   17:ifnonnull       162
		{
			obj = ((Object) (new ArrayList()));
	//   10   20:new             #133 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #134 <Method void ArrayList()>
	//   13   27:astore          4
			for(Iterator iterator = modelLoaderRegistry.getDataClasses(class1).iterator(); iterator.hasNext();)
	//*  14   29:aload_0         
	//*  15   30:getfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #250 <Method List ModelLoaderRegistry.getDataClasses(Class)>
	//*  18   37:invokeinterface #144 <Method Iterator List.iterator()>
	//*  19   42:astore          5
	//*  20   44:aload           5
	//*  21   46:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  22   51:ifeq            148
			{
				Object obj1 = ((Object) ((Class)iterator.next()));
	//   23   54:aload           5
	//   24   56:invokeinterface #154 <Method Object Iterator.next()>
	//   25   61:checkcast       #156 <Class Class>
	//   26   64:astore          6
				obj1 = ((Object) (decoderRegistry.getResourceClasses(((Class) (obj1)), class2).iterator()));
	//   27   66:aload_0         
	//   28   67:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//   29   70:aload           6
	//   30   72:aload_2         
	//   31   73:invokevirtual   #138 <Method List ResourceDecoderRegistry.getResourceClasses(Class, Class)>
	//   32   76:invokeinterface #144 <Method Iterator List.iterator()>
	//   33   81:astore          6
				while(((Iterator) (obj1)).hasNext()) 
	//*  34   83:aload           6
	//*  35   85:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  36   90:ifeq            44
				{
					Class class4 = (Class)((Iterator) (obj1)).next();
	//   37   93:aload           6
	//   38   95:invokeinterface #154 <Method Object Iterator.next()>
	//   39  100:checkcast       #156 <Class Class>
	//   40  103:astore          7
					if(!transcoderRegistry.getTranscodeClasses(class4, class3).isEmpty() && !((List) (obj)).contains(((Object) (class4))))
	//*  41  105:aload_0         
	//*  42  106:getfield        #110 <Field TranscoderRegistry transcoderRegistry>
	//*  43  109:aload           7
	//*  44  111:aload_3         
	//*  45  112:invokevirtual   #159 <Method List TranscoderRegistry.getTranscodeClasses(Class, Class)>
	//*  46  115:invokeinterface #212 <Method boolean List.isEmpty()>
	//*  47  120:ifne            83
	//*  48  123:aload           4
	//*  49  125:aload           7
	//*  50  127:invokeinterface #253 <Method boolean List.contains(Object)>
	//*  51  132:ifne            83
						((List) (obj)).add(((Object) (class4)));
	//   52  135:aload           4
	//   53  137:aload           7
	//   54  139:invokeinterface #175 <Method boolean List.add(Object)>
	//   55  144:pop             
				}
			}

	//*  56  145:goto            83
			modelToResourceClassCache.put(class1, class2, Collections.unmodifiableList(((List) (obj))));
	//   57  148:aload_0         
	//   58  149:getfield        #65  <Field ModelToResourceClassCache modelToResourceClassCache>
	//   59  152:aload_1         
	//   60  153:aload_2         
	//   61  154:aload           4
	//   62  156:invokestatic    #259 <Method List Collections.unmodifiableList(List)>
	//   63  159:invokevirtual   #262 <Method void ModelToResourceClassCache.put(Class, Class, List)>
		}
		return ((List) (obj));
	//   64  162:aload           4
	//   65  164:areturn         
	}

	public ResourceEncoder getResultEncoder(Resource resource)
		throws NoResultEncoderAvailableException
	{
		ResourceEncoder resourceencoder = resourceEncoderRegistry.get(resource.getResourceClass());
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #271 <Method Class Resource.getResourceClass()>
	//    4   10:invokevirtual   #274 <Method ResourceEncoder ResourceEncoderRegistry.get(Class)>
	//    5   13:astore_2        
		if(resourceencoder != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          20
			return resourceencoder;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			throw new NoResultEncoderAvailableException(resource.getResourceClass());
	//   10   20:new             #15  <Class Registry$NoResultEncoderAvailableException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokeinterface #271 <Method Class Resource.getResourceClass()>
	//   14   30:invokespecial   #277 <Method void Registry$NoResultEncoderAvailableException(Class)>
	//   15   33:athrow          
	}

	public DataRewinder getRewinder(Object obj)
	{
		return dataRewinderRegistry.build(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field DataRewinderRegistry dataRewinderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #284 <Method DataRewinder DataRewinderRegistry.build(Object)>
	//    4    8:areturn         
	}

	public Encoder getSourceEncoder(Object obj)
		throws NoSourceEncoderAvailableException
	{
		Encoder encoder = encoderRegistry.getEncoder(obj.getClass());
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field EncoderRegistry encoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #290 <Method Class Object.getClass()>
	//    4    8:invokevirtual   #294 <Method Encoder EncoderRegistry.getEncoder(Class)>
	//    5   11:astore_2        
		if(encoder != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          18
			return encoder;
	//    8   16:aload_2         
	//    9   17:areturn         
		else
			throw new NoSourceEncoderAvailableException(obj.getClass());
	//   10   18:new             #18  <Class Registry$NoSourceEncoderAvailableException>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokevirtual   #290 <Method Class Object.getClass()>
	//   14   26:invokespecial   #295 <Method void Registry$NoSourceEncoderAvailableException(Class)>
	//   15   29:athrow          
	}

	public boolean isResourceEncoderAvailable(Resource resource)
	{
		return resourceEncoderRegistry.get(resource.getResourceClass()) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #271 <Method Class Resource.getResourceClass()>
	//    4   10:invokevirtual   #274 <Method ResourceEncoder ResourceEncoderRegistry.get(Class)>
	//    5   13:ifnull          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public Registry prepend(Class class1, Encoder encoder)
	{
		encoderRegistry.prepend(class1, encoder);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field EncoderRegistry encoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #302 <Method void EncoderRegistry.prepend(Class, Encoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry prepend(Class class1, ResourceEncoder resourceencoder)
	{
		resourceEncoderRegistry.prepend(class1, resourceencoder);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #304 <Method void ResourceEncoderRegistry.prepend(Class, ResourceEncoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry prepend(Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		prepend("legacy_prepend_all", class1, class2, resourcedecoder);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "legacy_prepend_all">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #306 <Method Registry prepend(String, Class, Class, ResourceDecoder)>
	//    6    9:pop             
		return this;
	//    7   10:aload_0         
	//    8   11:areturn         
	}

	public Registry prepend(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.prepend(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #308 <Method void ModelLoaderRegistry.prepend(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry prepend(String s, Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		decoderRegistry.prepend(s, resourcedecoder, class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #310 <Method void ResourceDecoderRegistry.prepend(String, ResourceDecoder, Class, Class)>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public Registry register(ImageHeaderParser imageheaderparser)
	{
		imageHeaderParserRegistry.add(imageheaderparser);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #315 <Method void ImageHeaderParserRegistry.add(ImageHeaderParser)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Registry register(com.bumptech.glide.load.data.DataRewinder.Factory factory)
	{
		dataRewinderRegistry.register(factory);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field DataRewinderRegistry dataRewinderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method void DataRewinderRegistry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Registry register(Class class1, Encoder encoder)
	{
		return append(class1, encoder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #323 <Method Registry append(Class, Encoder)>
	//    4    6:areturn         
	}

	public Registry register(Class class1, ResourceEncoder resourceencoder)
	{
		return append(class1, resourceencoder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #326 <Method Registry append(Class, ResourceEncoder)>
	//    4    6:areturn         
	}

	public Registry register(Class class1, Class class2, ResourceTranscoder resourcetranscoder)
	{
		transcoderRegistry.register(class1, class2, resourcetranscoder);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field TranscoderRegistry transcoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #330 <Method void TranscoderRegistry.register(Class, Class, ResourceTranscoder)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry replace(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.replace(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #334 <Method void ModelLoaderRegistry.replace(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final Registry setResourceDecoderBucketPriorityList(List list)
	{
		list = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #338 <Method void ArrayList(java.util.Collection)>
	//    4    8:astore_1        
		list.add(0, "legacy_prepend_all");
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:ldc1            #35  <String "legacy_prepend_all">
	//    8   13:invokeinterface #341 <Method void List.add(int, Object)>
		list.add("legacy_append");
	//    9   18:aload_1         
	//   10   19:ldc1            #23  <String "legacy_append">
	//   11   21:invokeinterface #175 <Method boolean List.add(Object)>
	//   12   26:pop             
		decoderRegistry.setBucketPriorityList(list);
	//   13   27:aload_0         
	//   14   28:getfield        #95  <Field ResourceDecoderRegistry decoderRegistry>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #345 <Method void ResourceDecoderRegistry.setBucketPriorityList(List)>
		return this;
	//   17   35:aload_0         
	//   18   36:areturn         
	}

	private static final String BUCKET_APPEND_ALL = "legacy_append";
	public static final String BUCKET_BITMAP = "Bitmap";
	public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";
	public static final String BUCKET_GIF = "Gif";
	private static final String BUCKET_PREPEND_ALL = "legacy_prepend_all";
	private final DataRewinderRegistry dataRewinderRegistry = new DataRewinderRegistry();
	private final ResourceDecoderRegistry decoderRegistry = new ResourceDecoderRegistry();
	private final EncoderRegistry encoderRegistry = new EncoderRegistry();
	private final ImageHeaderParserRegistry imageHeaderParserRegistry = new ImageHeaderParserRegistry();
	private final LoadPathCache loadPathCache = new LoadPathCache();
	private final ModelLoaderRegistry modelLoaderRegistry;
	private final ModelToResourceClassCache modelToResourceClassCache = new ModelToResourceClassCache();
	private final ResourceEncoderRegistry resourceEncoderRegistry = new ResourceEncoderRegistry();
	private final android.support.v4.util.Pools.Pool throwableListPool = FactoryPools.threadSafeList();
	private final TranscoderRegistry transcoderRegistry = new TranscoderRegistry();
}

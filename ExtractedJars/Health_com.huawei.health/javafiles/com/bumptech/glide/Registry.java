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
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
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
			super((new StringBuilder()).append("Failed to find any ModelLoaders for model: ").append(((Object) (class1))).append(" and data: ").append(((Object) (class2))).toString());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void StringBuilder()>
		//    4    8:ldc1            #16  <String "Failed to find any ModelLoaders for model: ">
		//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//    8   17:ldc1            #25  <String " and data: ">
		//    9   19:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   10   22:aload_2         
		//   11   23:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//   12   26:invokevirtual   #29  <Method String StringBuilder.toString()>
		//   13   29:invokespecial   #32  <Method void Registry$MissingComponentException(String)>
		//   14   32:return          
		}

		public NoModelLoaderAvailableException(Object obj)
		{
			super((new StringBuilder()).append("Failed to find any ModelLoaders for model: ").append(obj).toString());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void StringBuilder()>
		//    4    8:ldc1            #16  <String "Failed to find any ModelLoaders for model: ">
		//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//    8   17:invokevirtual   #29  <Method String StringBuilder.toString()>
		//    9   20:invokespecial   #32  <Method void Registry$MissingComponentException(String)>
		//   10   23:return          
		}
	}

	public static class NoResultEncoderAvailableException extends MissingComponentException
	{

		public NoResultEncoderAvailableException(Class class1)
		{
			super((new StringBuilder()).append("Failed to find result encoder for resource class: ").append(((Object) (class1))).toString());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void StringBuilder()>
		//    4    8:ldc1            #16  <String "Failed to find result encoder for resource class: ">
		//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//    8   17:invokevirtual   #27  <Method String StringBuilder.toString()>
		//    9   20:invokespecial   #30  <Method void Registry$MissingComponentException(String)>
		//   10   23:return          
		}
	}

	public static class NoSourceEncoderAvailableException extends MissingComponentException
	{

		public NoSourceEncoderAvailableException(Class class1)
		{
			super((new StringBuilder()).append("Failed to find source encoder for data class: ").append(((Object) (class1))).toString());
		//    0    0:aload_0         
		//    1    1:new             #11  <Class StringBuilder>
		//    2    4:dup             
		//    3    5:invokespecial   #14  <Method void StringBuilder()>
		//    4    8:ldc1            #16  <String "Failed to find source encoder for data class: ">
		//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    6   13:aload_1         
		//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
		//    8   17:invokevirtual   #27  <Method String StringBuilder.toString()>
		//    9   20:invokespecial   #30  <Method void Registry$MissingComponentException(String)>
		//   10   23:return          
		}
	}


	public Registry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ModelToResourceClassCache>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ModelToResourceClassCache()>
	//    6   12:putfield        #49  <Field ModelToResourceClassCache modelToResourceClassCache>
	//    7   15:aload_0         
	//    8   16:new             #51  <Class LoadPathCache>
	//    9   19:dup             
	//   10   20:invokespecial   #52  <Method void LoadPathCache()>
	//   11   23:putfield        #54  <Field LoadPathCache loadPathCache>
	//   12   26:aload_0         
	//   13   27:invokestatic    #60  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafeList()>
	//   14   30:putfield        #62  <Field android.support.v4.util.Pools$Pool exceptionListPool>
		modelLoaderRegistry = new ModelLoaderRegistry(exceptionListPool);
	//   15   33:aload_0         
	//   16   34:new             #64  <Class ModelLoaderRegistry>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:getfield        #62  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   20   42:invokespecial   #67  <Method void ModelLoaderRegistry(android.support.v4.util.Pools$Pool)>
	//   21   45:putfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//   22   48:aload_0         
	//   23   49:new             #71  <Class EncoderRegistry>
	//   24   52:dup             
	//   25   53:invokespecial   #72  <Method void EncoderRegistry()>
	//   26   56:putfield        #74  <Field EncoderRegistry encoderRegistry>
	//   27   59:aload_0         
	//   28   60:new             #76  <Class ResourceDecoderRegistry>
	//   29   63:dup             
	//   30   64:invokespecial   #77  <Method void ResourceDecoderRegistry()>
	//   31   67:putfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//   32   70:aload_0         
	//   33   71:new             #81  <Class ResourceEncoderRegistry>
	//   34   74:dup             
	//   35   75:invokespecial   #82  <Method void ResourceEncoderRegistry()>
	//   36   78:putfield        #84  <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//   37   81:aload_0         
	//   38   82:new             #86  <Class DataRewinderRegistry>
	//   39   85:dup             
	//   40   86:invokespecial   #87  <Method void DataRewinderRegistry()>
	//   41   89:putfield        #89  <Field DataRewinderRegistry dataRewinderRegistry>
	//   42   92:aload_0         
	//   43   93:new             #91  <Class TranscoderRegistry>
	//   44   96:dup             
	//   45   97:invokespecial   #92  <Method void TranscoderRegistry()>
	//   46  100:putfield        #94  <Field TranscoderRegistry transcoderRegistry>
	//   47  103:aload_0         
	//   48  104:new             #96  <Class ImageHeaderParserRegistry>
	//   49  107:dup             
	//   50  108:invokespecial   #97  <Method void ImageHeaderParserRegistry()>
	//   51  111:putfield        #99  <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
	//   52  114:return          
	}

	private List getDecodePaths(Class class1, Class class2, Class class3)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #104 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void ArrayList()>
	//    3    7:astore          4
		for(class2 = ((Class) (decoderRegistry.getResourceClasses(class1, class2).iterator())); ((Iterator) (class2)).hasNext();)
	//*   4    9:aload_0         
	//*   5   10:getfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//*   6   13:aload_1         
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #109 <Method List ResourceDecoderRegistry.getResourceClasses(Class, Class)>
	//*   9   18:invokeinterface #115 <Method Iterator List.iterator()>
	//*  10   23:astore_2        
	//*  11   24:aload_2         
	//*  12   25:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  13   30:ifeq            134
		{
			Class class4 = (Class)((Iterator) (class2)).next();
	//   14   33:aload_2         
	//   15   34:invokeinterface #125 <Method Object Iterator.next()>
	//   16   39:checkcast       #127 <Class Class>
	//   17   42:astore          5
			Iterator iterator = transcoderRegistry.getTranscodeClasses(class4, class3).iterator();
	//   18   44:aload_0         
	//   19   45:getfield        #94  <Field TranscoderRegistry transcoderRegistry>
	//   20   48:aload           5
	//   21   50:aload_3         
	//   22   51:invokevirtual   #130 <Method List TranscoderRegistry.getTranscodeClasses(Class, Class)>
	//   23   54:invokeinterface #115 <Method Iterator List.iterator()>
	//   24   59:astore          6
			while(iterator.hasNext()) 
	//*  25   61:aload           6
	//*  26   63:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  27   68:ifeq            131
			{
				Class class5 = (Class)iterator.next();
	//   28   71:aload           6
	//   29   73:invokeinterface #125 <Method Object Iterator.next()>
	//   30   78:checkcast       #127 <Class Class>
	//   31   81:astore          7
				((List) (arraylist)).add(((Object) (new DecodePath(class1, class4, class5, decoderRegistry.getDecoders(class1, class4), transcoderRegistry.get(class4, class5), exceptionListPool))));
	//   32   83:aload           4
	//   33   85:new             #132 <Class DecodePath>
	//   34   88:dup             
	//   35   89:aload_1         
	//   36   90:aload           5
	//   37   92:aload           7
	//   38   94:aload_0         
	//   39   95:getfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//   40   98:aload_1         
	//   41   99:aload           5
	//   42  101:invokevirtual   #135 <Method List ResourceDecoderRegistry.getDecoders(Class, Class)>
	//   43  104:aload_0         
	//   44  105:getfield        #94  <Field TranscoderRegistry transcoderRegistry>
	//   45  108:aload           5
	//   46  110:aload           7
	//   47  112:invokevirtual   #139 <Method ResourceTranscoder TranscoderRegistry.get(Class, Class)>
	//   48  115:aload_0         
	//   49  116:getfield        #62  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   50  119:invokespecial   #142 <Method void DecodePath(Class, Class, Class, List, ResourceTranscoder, android.support.v4.util.Pools$Pool)>
	//   51  122:invokeinterface #146 <Method boolean List.add(Object)>
	//   52  127:pop             
			}
		}

	//*  53  128:goto            61
	//*  54  131:goto            24
		return ((List) (arraylist));
	//   55  134:aload           4
	//   56  136:areturn         
	}

	public Registry append(Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		decoderRegistry.append(resourcedecoder, class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//    2    4:aload_3         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #153 <Method void ResourceDecoderRegistry.append(ResourceDecoder, Class, Class)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry append(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.append(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #158 <Method void ModelLoaderRegistry.append(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public List getImageHeaderParsers()
	{
		List list = imageHeaderParserRegistry.getParsers();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
	//    2    4:invokevirtual   #164 <Method List ImageHeaderParserRegistry.getParsers()>
	//    3    7:astore_1        
		if(list.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #167 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            25
			throw new NoImageHeaderParserException();
	//    7   17:new             #9   <Class Registry$NoImageHeaderParserException>
	//    8   20:dup             
	//    9   21:invokespecial   #168 <Method void Registry$NoImageHeaderParserException()>
	//   10   24:athrow          
		else
			return list;
	//   11   25:aload_1         
	//   12   26:areturn         
	}

	public LoadPath getLoadPath(Class class1, Class class2, Class class3)
	{
		LoadPath loadpath = loadPathCache.get(class1, class2, class3);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LoadPathCache loadPathCache>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #173 <Method LoadPath LoadPathCache.get(Class, Class, Class)>
	//    6   10:astore          5
		Object obj = ((Object) (loadpath));
	//    7   12:aload           5
	//    8   14:astore          4
		if(loadpath == null)
	//*   9   16:aload           5
	//*  10   18:ifnonnull       93
		{
			obj = ((Object) (loadpath));
	//   11   21:aload           5
	//   12   23:astore          4
			if(!loadPathCache.contains(class1, class2, class3))
	//*  13   25:aload_0         
	//*  14   26:getfield        #54  <Field LoadPathCache loadPathCache>
	//*  15   29:aload_1         
	//*  16   30:aload_2         
	//*  17   31:aload_3         
	//*  18   32:invokevirtual   #177 <Method boolean LoadPathCache.contains(Class, Class, Class)>
	//*  19   35:ifne            93
			{
				obj = ((Object) (getDecodePaths(class1, class2, class3)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:aload_3         
	//   24   42:invokespecial   #179 <Method List getDecodePaths(Class, Class, Class)>
	//   25   45:astore          4
				if(((List) (obj)).isEmpty())
	//*  26   47:aload           4
	//*  27   49:invokeinterface #167 <Method boolean List.isEmpty()>
	//*  28   54:ifeq            63
					obj = null;
	//   29   57:aconst_null     
	//   30   58:astore          4
				else
	//*  31   60:goto            81
					obj = ((Object) (new LoadPath(class1, class2, class3, ((List) (obj)), exceptionListPool)));
	//   32   63:new             #181 <Class LoadPath>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:aload_0         
	//   39   73:getfield        #62  <Field android.support.v4.util.Pools$Pool exceptionListPool>
	//   40   76:invokespecial   #184 <Method void LoadPath(Class, Class, Class, List, android.support.v4.util.Pools$Pool)>
	//   41   79:astore          4
				loadPathCache.put(class1, class2, class3, ((LoadPath) (obj)));
	//   42   81:aload_0         
	//   43   82:getfield        #54  <Field LoadPathCache loadPathCache>
	//   44   85:aload_1         
	//   45   86:aload_2         
	//   46   87:aload_3         
	//   47   88:aload           4
	//   48   90:invokevirtual   #188 <Method void LoadPathCache.put(Class, Class, Class, LoadPath)>
			}
		}
		return ((LoadPath) (obj));
	//   49   93:aload           4
	//   50   95:areturn         
	}

	public List getModelLoaders(Object obj)
	{
		List list = modelLoaderRegistry.getModelLoaders(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #193 <Method List ModelLoaderRegistry.getModelLoaders(Object)>
	//    4    8:astore_2        
		if(list.isEmpty())
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #167 <Method boolean List.isEmpty()>
	//*   7   15:ifeq            27
			throw new NoModelLoaderAvailableException(obj);
	//    8   18:new             #12  <Class Registry$NoModelLoaderAvailableException>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #196 <Method void Registry$NoModelLoaderAvailableException(Object)>
	//   12   26:athrow          
		else
			return list;
	//   13   27:aload_2         
	//   14   28:areturn         
	}

	public List getRegisteredResourceClasses(Class class1, Class class2, Class class3)
	{
		List list = modelToResourceClassCache.get(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ModelToResourceClassCache modelToResourceClassCache>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #200 <Method List ModelToResourceClassCache.get(Class, Class)>
	//    5    9:astore          5
		Object obj = ((Object) (list));
	//    6   11:aload           5
	//    7   13:astore          4
		if(list == null)
	//*   8   15:aload           5
	//*   9   17:ifnonnull       165
		{
			obj = ((Object) (new ArrayList()));
	//   10   20:new             #104 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #105 <Method void ArrayList()>
	//   13   27:astore          4
			for(Iterator iterator = modelLoaderRegistry.getDataClasses(class1).iterator(); iterator.hasNext();)
	//*  14   29:aload_0         
	//*  15   30:getfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #204 <Method List ModelLoaderRegistry.getDataClasses(Class)>
	//*  18   37:invokeinterface #115 <Method Iterator List.iterator()>
	//*  19   42:astore          5
	//*  20   44:aload           5
	//*  21   46:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  22   51:ifeq            151
			{
				Object obj1 = ((Object) ((Class)iterator.next()));
	//   23   54:aload           5
	//   24   56:invokeinterface #125 <Method Object Iterator.next()>
	//   25   61:checkcast       #127 <Class Class>
	//   26   64:astore          6
				obj1 = ((Object) (decoderRegistry.getResourceClasses(((Class) (obj1)), class2).iterator()));
	//   27   66:aload_0         
	//   28   67:getfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//   29   70:aload           6
	//   30   72:aload_2         
	//   31   73:invokevirtual   #109 <Method List ResourceDecoderRegistry.getResourceClasses(Class, Class)>
	//   32   76:invokeinterface #115 <Method Iterator List.iterator()>
	//   33   81:astore          6
				while(((Iterator) (obj1)).hasNext()) 
	//*  34   83:aload           6
	//*  35   85:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//*  36   90:ifeq            148
				{
					Class class4 = (Class)((Iterator) (obj1)).next();
	//   37   93:aload           6
	//   38   95:invokeinterface #125 <Method Object Iterator.next()>
	//   39  100:checkcast       #127 <Class Class>
	//   40  103:astore          7
					if(!transcoderRegistry.getTranscodeClasses(class4, class3).isEmpty() && !((List) (obj)).contains(((Object) (class4))))
	//*  41  105:aload_0         
	//*  42  106:getfield        #94  <Field TranscoderRegistry transcoderRegistry>
	//*  43  109:aload           7
	//*  44  111:aload_3         
	//*  45  112:invokevirtual   #130 <Method List TranscoderRegistry.getTranscodeClasses(Class, Class)>
	//*  46  115:invokeinterface #167 <Method boolean List.isEmpty()>
	//*  47  120:ifne            145
	//*  48  123:aload           4
	//*  49  125:aload           7
	//*  50  127:invokeinterface #206 <Method boolean List.contains(Object)>
	//*  51  132:ifne            145
						((List) (obj)).add(((Object) (class4)));
	//   52  135:aload           4
	//   53  137:aload           7
	//   54  139:invokeinterface #146 <Method boolean List.add(Object)>
	//   55  144:pop             
				}
			}

	//*  56  145:goto            83
	//*  57  148:goto            44
			modelToResourceClassCache.put(class1, class2, Collections.unmodifiableList(((List) (obj))));
	//   58  151:aload_0         
	//   59  152:getfield        #49  <Field ModelToResourceClassCache modelToResourceClassCache>
	//   60  155:aload_1         
	//   61  156:aload_2         
	//   62  157:aload           4
	//   63  159:invokestatic    #212 <Method List Collections.unmodifiableList(List)>
	//   64  162:invokevirtual   #215 <Method void ModelToResourceClassCache.put(Class, Class, List)>
		}
		return ((List) (obj));
	//   65  165:aload           4
	//   66  167:areturn         
	}

	public ResourceEncoder getResultEncoder(Resource resource)
		throws NoResultEncoderAvailableException
	{
		ResourceEncoder resourceencoder = resourceEncoderRegistry.get(resource.getResourceClass());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #224 <Method Class Resource.getResourceClass()>
	//    4   10:invokevirtual   #227 <Method ResourceEncoder ResourceEncoderRegistry.get(Class)>
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
	//   13   25:invokeinterface #224 <Method Class Resource.getResourceClass()>
	//   14   30:invokespecial   #230 <Method void Registry$NoResultEncoderAvailableException(Class)>
	//   15   33:athrow          
	}

	public DataRewinder getRewinder(Object obj)
	{
		return dataRewinderRegistry.build(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field DataRewinderRegistry dataRewinderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #237 <Method DataRewinder DataRewinderRegistry.build(Object)>
	//    4    8:areturn         
	}

	public Encoder getSourceEncoder(Object obj)
		throws NoSourceEncoderAvailableException
	{
		Encoder encoder = encoderRegistry.getEncoder(obj.getClass());
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field EncoderRegistry encoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #243 <Method Class Object.getClass()>
	//    4    8:invokevirtual   #247 <Method Encoder EncoderRegistry.getEncoder(Class)>
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
	//   13   23:invokevirtual   #243 <Method Class Object.getClass()>
	//   14   26:invokespecial   #248 <Method void Registry$NoSourceEncoderAvailableException(Class)>
	//   15   29:athrow          
	}

	public boolean isResourceEncoderAvailable(Resource resource)
	{
		return resourceEncoderRegistry.get(resource.getResourceClass()) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #224 <Method Class Resource.getResourceClass()>
	//    4   10:invokevirtual   #227 <Method ResourceEncoder ResourceEncoderRegistry.get(Class)>
	//    5   13:ifnull          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public Registry prepend(Class class1, Class class2, ResourceDecoder resourcedecoder)
	{
		decoderRegistry.prepend(resourcedecoder, class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ResourceDecoderRegistry decoderRegistry>
	//    2    4:aload_3         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #255 <Method void ResourceDecoderRegistry.prepend(ResourceDecoder, Class, Class)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry prepend(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.prepend(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #257 <Method void ModelLoaderRegistry.prepend(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry register(ImageHeaderParser imageheaderparser)
	{
		imageHeaderParserRegistry.add(imageheaderparser);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ImageHeaderParserRegistry imageHeaderParserRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #262 <Method void ImageHeaderParserRegistry.add(ImageHeaderParser)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Registry register(com.bumptech.glide.load.data.DataRewinder.Factory factory)
	{
		dataRewinderRegistry.register(factory);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field DataRewinderRegistry dataRewinderRegistry>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #266 <Method void DataRewinderRegistry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Registry register(Class class1, Encoder encoder)
	{
		encoderRegistry.add(class1, encoder);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field EncoderRegistry encoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #270 <Method void EncoderRegistry.add(Class, Encoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry register(Class class1, ResourceEncoder resourceencoder)
	{
		resourceEncoderRegistry.add(class1, resourceencoder);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ResourceEncoderRegistry resourceEncoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #275 <Method void ResourceEncoderRegistry.add(Class, ResourceEncoder)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Registry register(Class class1, Class class2, ResourceTranscoder resourcetranscoder)
	{
		transcoderRegistry.register(class1, class2, resourcetranscoder);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field TranscoderRegistry transcoderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #280 <Method void TranscoderRegistry.register(Class, Class, ResourceTranscoder)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Registry replace(Class class1, Class class2, ModelLoaderFactory modelloaderfactory)
	{
		modelLoaderRegistry.replace(class1, class2, modelloaderfactory);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field ModelLoaderRegistry modelLoaderRegistry>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #284 <Method void ModelLoaderRegistry.replace(Class, Class, ModelLoaderFactory)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private final DataRewinderRegistry dataRewinderRegistry = new DataRewinderRegistry();
	private final ResourceDecoderRegistry decoderRegistry = new ResourceDecoderRegistry();
	private final EncoderRegistry encoderRegistry = new EncoderRegistry();
	private final android.support.v4.util.Pools.Pool exceptionListPool = FactoryPools.threadSafeList();
	private final ImageHeaderParserRegistry imageHeaderParserRegistry = new ImageHeaderParserRegistry();
	private final LoadPathCache loadPathCache = new LoadPathCache();
	private final ModelLoaderRegistry modelLoaderRegistry;
	private final ModelToResourceClassCache modelToResourceClassCache = new ModelToResourceClassCache();
	private final ResourceEncoderRegistry resourceEncoderRegistry = new ResourceEncoderRegistry();
	private final TranscoderRegistry transcoderRegistry = new TranscoderRegistry();
}

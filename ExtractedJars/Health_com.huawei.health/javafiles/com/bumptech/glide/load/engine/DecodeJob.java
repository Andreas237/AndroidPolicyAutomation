// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.support.v4.os.TraceCompat;
import android.util.Log;
import com.bumptech.glide.*;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeHelper, GlideException, ResourceCacheGenerator, DataCacheGenerator, 
//			SourceGenerator, DiskCacheStrategy, Initializable, LockedResource, 
//			DataFetcherGenerator, LoadPath, EngineKey, Resource, 
//			DataCacheKey, ResourceCacheKey, DataCacheWriter

class DecodeJob
	implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	static interface Callback
	{

		public abstract void onLoadFailed(GlideException glideexception);

		public abstract void onResourceReady(Resource resource, DataSource datasource);

		public abstract void reschedule(DecodeJob decodejob);
	}

	final class DecodeCallback
		implements DecodePath.DecodeCallback
	{

		private Class getResourceClass(Resource resource)
		{
			return resource.get().getClass();
		//    0    0:aload_1         
		//    1    1:invokeinterface #32  <Method Object Resource.get()>
		//    2    6:invokevirtual   #36  <Method Class Object.getClass()>
		//    3    9:areturn         
		}

		public Resource onResourceDecoded(Resource resource)
		{
			Class class1 = getResourceClass(resource);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method Class getResourceClass(Resource)>
		//    3    5:astore          7
			Object obj = null;
		//    4    7:aconst_null     
		//    5    8:astore          4
			Resource resource1 = resource;
		//    6   10:aload_1         
		//    7   11:astore_3        
			if(dataSource != DataSource.RESOURCE_DISK_CACHE)
		//*   8   12:aload_0         
		//*   9   13:getfield        #23  <Field DataSource dataSource>
		//*  10   16:getstatic       #47  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
		//*  11   19:if_acmpeq       66
			{
				obj = ((Object) (decodeHelper.getTransformation(class1)));
		//   12   22:aload_0         
		//   13   23:getfield        #18  <Field DecodeJob this$0>
		//   14   26:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
		//   15   29:aload           7
		//   16   31:invokevirtual   #57  <Method Transformation DecodeHelper.getTransformation(Class)>
		//   17   34:astore          4
				resource1 = ((Transformation) (obj)).transform(((android.content.Context) (glideContext)), resource, width, height);
		//   18   36:aload           4
		//   19   38:aload_0         
		//   20   39:getfield        #18  <Field DecodeJob this$0>
		//   21   42:invokestatic    #61  <Method GlideContext DecodeJob.access$000(DecodeJob)>
		//   22   45:aload_1         
		//   23   46:aload_0         
		//   24   47:getfield        #18  <Field DecodeJob this$0>
		//   25   50:getfield        #65  <Field int DecodeJob.width>
		//   26   53:aload_0         
		//   27   54:getfield        #18  <Field DecodeJob this$0>
		//   28   57:getfield        #68  <Field int DecodeJob.height>
		//   29   60:invokeinterface #74  <Method Resource Transformation.transform(android.content.Context, Resource, int, int)>
		//   30   65:astore_3        
			}
			if(!((Object) (resource)).equals(((Object) (resource1))))
		//*  31   66:aload_1         
		//*  32   67:aload_3         
		//*  33   68:invokevirtual   #78  <Method boolean Object.equals(Object)>
		//*  34   71:ifne            80
				resource.recycle();
		//   35   74:aload_1         
		//   36   75:invokeinterface #81  <Method void Resource.recycle()>
			EncodeStrategy encodestrategy;
			if(decodeHelper.isResourceEncoderAvailable(resource1))
		//*  37   80:aload_0         
		//*  38   81:getfield        #18  <Field DecodeJob this$0>
		//*  39   84:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
		//*  40   87:aload_3         
		//*  41   88:invokevirtual   #85  <Method boolean DecodeHelper.isResourceEncoderAvailable(Resource)>
		//*  42   91:ifeq            124
			{
				resource = ((Resource) (decodeHelper.getResultEncoder(resource1)));
		//   43   94:aload_0         
		//   44   95:getfield        #18  <Field DecodeJob this$0>
		//   45   98:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
		//   46  101:aload_3         
		//   47  102:invokevirtual   #89  <Method ResourceEncoder DecodeHelper.getResultEncoder(Resource)>
		//   48  105:astore_1        
				encodestrategy = ((ResourceEncoder) (resource)).getEncodeStrategy(options);
		//   49  106:aload_1         
		//   50  107:aload_0         
		//   51  108:getfield        #18  <Field DecodeJob this$0>
		//   52  111:getfield        #93  <Field Options DecodeJob.options>
		//   53  114:invokeinterface #99  <Method EncodeStrategy ResourceEncoder.getEncodeStrategy(Options)>
		//   54  119:astore          5
			} else
		//*  55  121:goto            131
			{
				resource = null;
		//   56  124:aconst_null     
		//   57  125:astore_1        
				encodestrategy = EncodeStrategy.NONE;
		//   58  126:getstatic       #105 <Field EncodeStrategy EncodeStrategy.NONE>
		//   59  129:astore          5
			}
			Object obj1 = ((Object) (resource1));
		//   60  131:aload_3         
		//   61  132:astore          6
			boolean flag;
			if(!decodeHelper.isSourceKey(currentSourceKey))
		//*  62  134:aload_0         
		//*  63  135:getfield        #18  <Field DecodeJob this$0>
		//*  64  138:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
		//*  65  141:aload_0         
		//*  66  142:getfield        #18  <Field DecodeJob this$0>
		//*  67  145:getfield        #109 <Field Key DecodeJob.currentSourceKey>
		//*  68  148:invokevirtual   #113 <Method boolean DecodeHelper.isSourceKey(Key)>
		//*  69  151:ifne            159
				flag = true;
		//   70  154:iconst_1        
		//   71  155:istore_2        
			else
		//*  72  156:goto            161
				flag = false;
		//   73  159:iconst_0        
		//   74  160:istore_2        
			if(diskCacheStrategy.isResourceCacheable(flag, dataSource, encodestrategy))
		//*  75  161:aload_0         
		//*  76  162:getfield        #18  <Field DecodeJob this$0>
		//*  77  165:getfield        #117 <Field DiskCacheStrategy DecodeJob.diskCacheStrategy>
		//*  78  168:iload_2         
		//*  79  169:aload_0         
		//*  80  170:getfield        #23  <Field DataSource dataSource>
		//*  81  173:aload           5
		//*  82  175:invokevirtual   #123 <Method boolean DiskCacheStrategy.isResourceCacheable(boolean, DataSource, EncodeStrategy)>
		//*  83  178:ifeq            344
			{
				if(resource == null)
		//*  84  181:aload_1         
		//*  85  182:ifnonnull       202
					throw new com.bumptech.glide.Registry.NoResultEncoderAvailableException(resource1.get().getClass());
		//   86  185:new             #125 <Class com.bumptech.glide.Registry$NoResultEncoderAvailableException>
		//   87  188:dup             
		//   88  189:aload_3         
		//   89  190:invokeinterface #32  <Method Object Resource.get()>
		//   90  195:invokevirtual   #36  <Method Class Object.getClass()>
		//   91  198:invokespecial   #128 <Method void com.bumptech.glide.Registry$NoResultEncoderAvailableException(Class)>
		//   92  201:athrow          
				if(encodestrategy == EncodeStrategy.SOURCE)
		//*  93  202:aload           5
		//*  94  204:getstatic       #131 <Field EncodeStrategy EncodeStrategy.SOURCE>
		//*  95  207:if_acmpne       236
					obj = ((Object) (new DataCacheKey(currentSourceKey, signature)));
		//   96  210:new             #133 <Class DataCacheKey>
		//   97  213:dup             
		//   98  214:aload_0         
		//   99  215:getfield        #18  <Field DecodeJob this$0>
		//  100  218:getfield        #109 <Field Key DecodeJob.currentSourceKey>
		//  101  221:aload_0         
		//  102  222:getfield        #18  <Field DecodeJob this$0>
		//  103  225:getfield        #136 <Field Key DecodeJob.signature>
		//  104  228:invokespecial   #139 <Method void DataCacheKey(Key, Key)>
		//  105  231:astore          4
				else
		//* 106  233:goto            323
				if(encodestrategy == EncodeStrategy.TRANSFORMED)
		//* 107  236:aload           5
		//* 108  238:getstatic       #142 <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
		//* 109  241:if_acmpne       295
					obj = ((Object) (new ResourceCacheKey(currentSourceKey, signature, width, height, ((Transformation) (obj)), class1, options)));
		//  110  244:new             #144 <Class ResourceCacheKey>
		//  111  247:dup             
		//  112  248:aload_0         
		//  113  249:getfield        #18  <Field DecodeJob this$0>
		//  114  252:getfield        #109 <Field Key DecodeJob.currentSourceKey>
		//  115  255:aload_0         
		//  116  256:getfield        #18  <Field DecodeJob this$0>
		//  117  259:getfield        #136 <Field Key DecodeJob.signature>
		//  118  262:aload_0         
		//  119  263:getfield        #18  <Field DecodeJob this$0>
		//  120  266:getfield        #65  <Field int DecodeJob.width>
		//  121  269:aload_0         
		//  122  270:getfield        #18  <Field DecodeJob this$0>
		//  123  273:getfield        #68  <Field int DecodeJob.height>
		//  124  276:aload           4
		//  125  278:aload           7
		//  126  280:aload_0         
		//  127  281:getfield        #18  <Field DecodeJob this$0>
		//  128  284:getfield        #93  <Field Options DecodeJob.options>
		//  129  287:invokespecial   #147 <Method void ResourceCacheKey(Key, Key, int, int, Transformation, Class, Options)>
		//  130  290:astore          4
				else
		//* 131  292:goto            323
					throw new IllegalArgumentException((new StringBuilder()).append("Unknown strategy: ").append(((Object) (encodestrategy))).toString());
		//  132  295:new             #149 <Class IllegalArgumentException>
		//  133  298:dup             
		//  134  299:new             #151 <Class StringBuilder>
		//  135  302:dup             
		//  136  303:invokespecial   #152 <Method void StringBuilder()>
		//  137  306:ldc1            #154 <String "Unknown strategy: ">
		//  138  308:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
		//  139  311:aload           5
		//  140  313:invokevirtual   #161 <Method StringBuilder StringBuilder.append(Object)>
		//  141  316:invokevirtual   #165 <Method String StringBuilder.toString()>
		//  142  319:invokespecial   #168 <Method void IllegalArgumentException(String)>
		//  143  322:athrow          
				obj1 = ((Object) (LockedResource.obtain(resource1)));
		//  144  323:aload_3         
		//  145  324:invokestatic    #174 <Method LockedResource LockedResource.obtain(Resource)>
		//  146  327:astore          6
				deferredEncodeManager.init(((Key) (obj)), ((ResourceEncoder) (resource)), ((LockedResource) (obj1)));
		//  147  329:aload_0         
		//  148  330:getfield        #18  <Field DecodeJob this$0>
		//  149  333:getfield        #178 <Field DecodeJob$DeferredEncodeManager DecodeJob.deferredEncodeManager>
		//  150  336:aload           4
		//  151  338:aload_1         
		//  152  339:aload           6
		//  153  341:invokevirtual   #184 <Method void DecodeJob$DeferredEncodeManager.init(Key, ResourceEncoder, LockedResource)>
			}
			return ((Resource) (obj1));
		//  154  344:aload           6
		//  155  346:areturn         
		}

		private final DataSource dataSource;
		final DecodeJob this$0;

		DecodeCallback(DataSource datasource)
		{
			this$0 = DecodeJob.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field DecodeJob this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			dataSource = datasource;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field DataSource dataSource>
		//    8   14:return          
		}
	}

	static class DeferredEncodeManager
	{

		void clear()
		{
			key = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #24  <Field Key key>
			encoder = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #26  <Field ResourceEncoder encoder>
			toEncode = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #28  <Field LockedResource toEncode>
		//    9   15:return          
		}

		void encode(DiskCacheProvider diskcacheprovider, Options options1)
		{
			TraceCompat.beginSection("DecodeJob.encode");
		//    0    0:ldc1            #32  <String "DecodeJob.encode">
		//    1    2:invokestatic    #38  <Method void TraceCompat.beginSection(String)>
			diskcacheprovider.getDiskCache().put(key, ((com.bumptech.glide.load.engine.cache.DiskCache.Writer) (new DataCacheWriter(((com.bumptech.glide.load.Encoder) (encoder)), ((Object) (toEncode)), options1))));
		//    2    5:aload_1         
		//    3    6:invokeinterface #44  <Method DiskCache DecodeJob$DiskCacheProvider.getDiskCache()>
		//    4   11:aload_0         
		//    5   12:getfield        #24  <Field Key key>
		//    6   15:new             #46  <Class DataCacheWriter>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:getfield        #26  <Field ResourceEncoder encoder>
		//   10   23:aload_0         
		//   11   24:getfield        #28  <Field LockedResource toEncode>
		//   12   27:aload_2         
		//   13   28:invokespecial   #49  <Method void DataCacheWriter(com.bumptech.glide.load.Encoder, Object, Options)>
		//   14   31:invokeinterface #55  <Method void DiskCache.put(Key, com.bumptech.glide.load.engine.cache.DiskCache$Writer)>
			toEncode.unlock();
		//   15   36:aload_0         
		//   16   37:getfield        #28  <Field LockedResource toEncode>
		//   17   40:invokevirtual   #60  <Method void LockedResource.unlock()>
			TraceCompat.endSection();
		//   18   43:invokestatic    #63  <Method void TraceCompat.endSection()>
			return;
		//   19   46:return          
			diskcacheprovider;
		//   20   47:astore_1        
			toEncode.unlock();
		//   21   48:aload_0         
		//   22   49:getfield        #28  <Field LockedResource toEncode>
		//   23   52:invokevirtual   #60  <Method void LockedResource.unlock()>
			TraceCompat.endSection();
		//   24   55:invokestatic    #63  <Method void TraceCompat.endSection()>
			throw diskcacheprovider;
		//   25   58:aload_1         
		//   26   59:athrow          
		}

		boolean hasResourceToEncode()
		{
			return toEncode != null;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field LockedResource toEncode>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		void init(Key key1, ResourceEncoder resourceencoder, LockedResource lockedresource)
		{
			key = key1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field Key key>
			encoder = resourceencoder;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #26  <Field ResourceEncoder encoder>
			toEncode = lockedresource;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #28  <Field LockedResource toEncode>
		//    9   15:return          
		}

		private ResourceEncoder encoder;
		private Key key;
		private LockedResource toEncode;

		DeferredEncodeManager()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface DiskCacheProvider
	{

		public abstract DiskCache getDiskCache();
	}

	static class ReleaseManager
	{

		private boolean isComplete(boolean flag)
		{
			return (isFailed || flag || isEncodeComplete) && isReleased;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field boolean isFailed>
		//    2    4:ifne            18
		//    3    7:iload_1         
		//    4    8:ifne            18
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field boolean isEncodeComplete>
		//    7   15:ifeq            27
		//    8   18:aload_0         
		//    9   19:getfield        #24  <Field boolean isReleased>
		//   10   22:ifeq            27
		//   11   25:iconst_1        
		//   12   26:ireturn         
		//   13   27:iconst_0        
		//   14   28:ireturn         
		}

		boolean onEncodeComplete()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			boolean flag;
			isEncodeComplete = true;
		//    2    2:aload_0         
		//    3    3:iconst_1        
		//    4    4:putfield        #22  <Field boolean isEncodeComplete>
			flag = isComplete(false);
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
		//    8   12:istore_1        
			this;
		//    9   13:aload_0         
			JVM INSTR monitorexit ;
		//   10   14:monitorexit     
			return flag;
		//   11   15:iload_1         
		//   12   16:ireturn         
			Exception exception;
			exception;
		//   13   17:astore_2        
		//*  14   18:aload_0         
			throw exception;
		//   15   19:monitorexit     
		//   16   20:aload_2         
		//   17   21:athrow          
		}

		boolean onFailed()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			boolean flag;
			isFailed = true;
		//    2    2:aload_0         
		//    3    3:iconst_1        
		//    4    4:putfield        #20  <Field boolean isFailed>
			flag = isComplete(false);
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
		//    8   12:istore_1        
			this;
		//    9   13:aload_0         
			JVM INSTR monitorexit ;
		//   10   14:monitorexit     
			return flag;
		//   11   15:iload_1         
		//   12   16:ireturn         
			Exception exception;
			exception;
		//   13   17:astore_2        
		//*  14   18:aload_0         
			throw exception;
		//   15   19:monitorexit     
		//   16   20:aload_2         
		//   17   21:athrow          
		}

		boolean release(boolean flag)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			isReleased = true;
		//    2    2:aload_0         
		//    3    3:iconst_1        
		//    4    4:putfield        #24  <Field boolean isReleased>
			flag = isComplete(flag);
		//    5    7:aload_0         
		//    6    8:iload_1         
		//    7    9:invokespecial   #28  <Method boolean isComplete(boolean)>
		//    8   12:istore_1        
			this;
		//    9   13:aload_0         
			JVM INSTR monitorexit ;
		//   10   14:monitorexit     
			return flag;
		//   11   15:iload_1         
		//   12   16:ireturn         
			Exception exception;
			exception;
		//   13   17:astore_2        
		//*  14   18:aload_0         
			throw exception;
		//   15   19:monitorexit     
		//   16   20:aload_2         
		//   17   21:athrow          
		}

		void reset()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			isEncodeComplete = false;
		//    2    2:aload_0         
		//    3    3:iconst_0        
		//    4    4:putfield        #22  <Field boolean isEncodeComplete>
			isReleased = false;
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:putfield        #24  <Field boolean isReleased>
			isFailed = false;
		//    8   12:aload_0         
		//    9   13:iconst_0        
		//   10   14:putfield        #20  <Field boolean isFailed>
			this;
		//   11   17:aload_0         
			JVM INSTR monitorexit ;
		//   12   18:monitorexit     
			return;
		//   13   19:return          
			Exception exception;
			exception;
		//   14   20:astore_1        
		//*  15   21:aload_0         
			throw exception;
		//   16   22:monitorexit     
		//   17   23:aload_1         
		//   18   24:athrow          
		}

		private boolean isEncodeComplete;
		private boolean isFailed;
		private boolean isReleased;

		ReleaseManager()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	static final class RunReason extends Enum
	{

		public static RunReason valueOf(String s)
		{
			return (RunReason)Enum.valueOf(com/bumptech/glide/load/engine/DecodeJob$RunReason, s);
		//    0    0:ldc1            #2   <Class DecodeJob$RunReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DecodeJob$RunReason>
		//    4    9:areturn         
		}

		public static RunReason[] values()
		{
			return (RunReason[])((RunReason []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field DecodeJob$RunReason[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.bumptech.glide.load.engine.DecodeJob$RunReason_3B_.clone()>
		//    2    6:checkcast       #42  <Class DecodeJob$RunReason[]>
		//    3    9:areturn         
		}

		private static final RunReason $VALUES[];
		public static final RunReason DECODE_DATA;
		public static final RunReason INITIALIZE;
		public static final RunReason SWITCH_TO_SOURCE_SERVICE;

		static 
		{
			INITIALIZE = new RunReason("INITIALIZE", 0);
		//    0    0:new             #2   <Class DecodeJob$RunReason>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "INITIALIZE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
		//    5   10:putstatic       #23  <Field DecodeJob$RunReason INITIALIZE>
			SWITCH_TO_SOURCE_SERVICE = new RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
		//    6   13:new             #2   <Class DecodeJob$RunReason>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "SWITCH_TO_SOURCE_SERVICE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
		//   11   23:putstatic       #26  <Field DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE>
			DECODE_DATA = new RunReason("DECODE_DATA", 2);
		//   12   26:new             #2   <Class DecodeJob$RunReason>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DECODE_DATA">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
		//   17   36:putstatic       #29  <Field DecodeJob$RunReason DECODE_DATA>
			$VALUES = (new RunReason[] {
				INITIALIZE, SWITCH_TO_SOURCE_SERVICE, DECODE_DATA
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       RunReason[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field DecodeJob$RunReason INITIALIZE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field DecodeJob$RunReason DECODE_DATA>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field DecodeJob$RunReason[] $VALUES>
		//*  33   64:return          
		}

		private RunReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static final class Stage extends Enum
	{

		public static Stage valueOf(String s)
		{
			return (Stage)Enum.valueOf(com/bumptech/glide/load/engine/DecodeJob$Stage, s);
		//    0    0:ldc1            #2   <Class DecodeJob$Stage>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DecodeJob$Stage>
		//    4    9:areturn         
		}

		public static Stage[] values()
		{
			return (Stage[])((Stage []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field DecodeJob$Stage[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.bumptech.glide.load.engine.DecodeJob$Stage_3B_.clone()>
		//    2    6:checkcast       #54  <Class DecodeJob$Stage[]>
		//    3    9:areturn         
		}

		private static final Stage $VALUES[];
		public static final Stage DATA_CACHE;
		public static final Stage ENCODE;
		public static final Stage FINISHED;
		public static final Stage INITIALIZE;
		public static final Stage RESOURCE_CACHE;
		public static final Stage SOURCE;

		static 
		{
			INITIALIZE = new Stage("INITIALIZE", 0);
		//    0    0:new             #2   <Class DecodeJob$Stage>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "INITIALIZE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//    5   10:putstatic       #26  <Field DecodeJob$Stage INITIALIZE>
			RESOURCE_CACHE = new Stage("RESOURCE_CACHE", 1);
		//    6   13:new             #2   <Class DecodeJob$Stage>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "RESOURCE_CACHE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//   11   23:putstatic       #29  <Field DecodeJob$Stage RESOURCE_CACHE>
			DATA_CACHE = new Stage("DATA_CACHE", 2);
		//   12   26:new             #2   <Class DecodeJob$Stage>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "DATA_CACHE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//   17   36:putstatic       #32  <Field DecodeJob$Stage DATA_CACHE>
			SOURCE = new Stage("SOURCE", 3);
		//   18   39:new             #2   <Class DecodeJob$Stage>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "SOURCE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//   23   49:putstatic       #35  <Field DecodeJob$Stage SOURCE>
			ENCODE = new Stage("ENCODE", 4);
		//   24   52:new             #2   <Class DecodeJob$Stage>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "ENCODE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//   29   62:putstatic       #38  <Field DecodeJob$Stage ENCODE>
			FINISHED = new Stage("FINISHED", 5);
		//   30   65:new             #2   <Class DecodeJob$Stage>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "FINISHED">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
		//   35   75:putstatic       #41  <Field DecodeJob$Stage FINISHED>
			$VALUES = (new Stage[] {
				INITIALIZE, RESOURCE_CACHE, DATA_CACHE, SOURCE, ENCODE, FINISHED
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Stage[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field DecodeJob$Stage INITIALIZE>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field DecodeJob$Stage RESOURCE_CACHE>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field DecodeJob$Stage DATA_CACHE>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field DecodeJob$Stage SOURCE>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field DecodeJob$Stage ENCODE>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field DecodeJob$Stage FINISHED>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field DecodeJob$Stage[] $VALUES>
		//*  63  122:return          
		}

		private Stage(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	DecodeJob(DiskCacheProvider diskcacheprovider, android.support.v4.util.Pools.Pool pool1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #107 <Class DecodeHelper>
	//    4    8:dup             
	//    5    9:invokespecial   #108 <Method void DecodeHelper()>
	//    6   12:putfield        #110 <Field DecodeHelper decodeHelper>
	//    7   15:aload_0         
	//    8   16:new             #112 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #113 <Method void ArrayList()>
	//   11   23:putfield        #115 <Field List exceptions>
	//   12   26:aload_0         
	//   13   27:invokestatic    #121 <Method StateVerifier StateVerifier.newInstance()>
	//   14   30:putfield        #123 <Field StateVerifier stateVerifier>
	//   15   33:aload_0         
	//   16   34:new             #23  <Class DecodeJob$DeferredEncodeManager>
	//   17   37:dup             
	//   18   38:invokespecial   #124 <Method void DecodeJob$DeferredEncodeManager()>
	//   19   41:putfield        #126 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//   20   44:aload_0         
	//   21   45:new             #29  <Class DecodeJob$ReleaseManager>
	//   22   48:dup             
	//   23   49:invokespecial   #127 <Method void DecodeJob$ReleaseManager()>
	//   24   52:putfield        #129 <Field DecodeJob$ReleaseManager releaseManager>
		diskCacheProvider = diskcacheprovider;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #131 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
		pool = pool1;
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:putfield        #133 <Field android.support.v4.util.Pools$Pool pool>
	//   31   65:return          
	}

	private Resource decodeFromData(DataFetcher datafetcher, Object obj, DataSource datasource)
		throws GlideException
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			datafetcher.cleanup();
	//    2    4:aload_1         
	//    3    5:invokeinterface #149 <Method void DataFetcher.cleanup()>
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		}
		long l = LogTime.getLogTime();
	//    6   12:invokestatic    #155 <Method long LogTime.getLogTime()>
	//    7   15:lstore          4
		obj = ((Object) (decodeFromFetcher(obj, datasource)));
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #159 <Method Resource decodeFromFetcher(Object, DataSource)>
	//   12   23:astore_2        
		if(Log.isLoggable("DecodeJob", 2))
	//*  13   24:ldc1            #40  <String "DecodeJob">
	//*  14   26:iconst_2        
	//*  15   27:invokestatic    #165 <Method boolean Log.isLoggable(String, int)>
	//*  16   30:ifeq            58
			logWithTimeAndKey((new StringBuilder()).append("Decoded result ").append(obj).toString(), l);
	//   17   33:aload_0         
	//   18   34:new             #167 <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #168 <Method void StringBuilder()>
	//   21   41:ldc1            #170 <String "Decoded result ">
	//   22   43:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_2         
	//   24   47:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   25   50:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   26   53:lload           4
	//   27   55:invokespecial   #185 <Method void logWithTimeAndKey(String, long)>
		datafetcher.cleanup();
	//   28   58:aload_1         
	//   29   59:invokeinterface #149 <Method void DataFetcher.cleanup()>
		return ((Resource) (obj));
	//   30   64:aload_2         
	//   31   65:areturn         
		obj;
	//   32   66:astore_2        
		datafetcher.cleanup();
	//   33   67:aload_1         
	//   34   68:invokeinterface #149 <Method void DataFetcher.cleanup()>
		throw obj;
	//   35   73:aload_2         
	//   36   74:athrow          
	}

	private Resource decodeFromFetcher(Object obj, DataSource datasource)
		throws GlideException
	{
		return runLoadPath(obj, datasource, decodeHelper.getLoadPath(obj.getClass()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #110 <Field DecodeHelper decodeHelper>
	//    5    7:aload_1         
	//    6    8:invokevirtual   #191 <Method Class Object.getClass()>
	//    7   11:invokevirtual   #195 <Method LoadPath DecodeHelper.getLoadPath(Class)>
	//    8   14:invokespecial   #199 <Method Resource runLoadPath(Object, DataSource, LoadPath)>
	//    9   17:areturn         
	}

	private void decodeFromRetrievedData()
	{
		Resource resource;
		if(Log.isLoggable("DecodeJob", 2))
	//*   0    0:ldc1            #40  <String "DecodeJob">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #165 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            65
			logWithTimeAndKey("Retrieved data", startFetchTime, (new StringBuilder()).append("data: ").append(currentData).append(", cache key: ").append(((Object) (currentSourceKey))).append(", fetcher: ").append(((Object) (currentFetcher))).toString());
	//    4    9:aload_0         
	//    5   10:ldc1            #203 <String "Retrieved data">
	//    6   12:aload_0         
	//    7   13:getfield        #205 <Field long startFetchTime>
	//    8   16:new             #167 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #168 <Method void StringBuilder()>
	//   11   23:ldc1            #207 <String "data: ">
	//   12   25:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:getfield        #209 <Field Object currentData>
	//   15   32:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   16   35:ldc1            #211 <String ", cache key: ">
	//   17   37:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #213 <Field Key currentSourceKey>
	//   20   44:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   21   47:ldc1            #215 <String ", fetcher: ">
	//   22   49:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:aload_0         
	//   24   53:getfield        #217 <Field DataFetcher currentFetcher>
	//   25   56:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   26   59:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   27   62:invokespecial   #220 <Method void logWithTimeAndKey(String, long, String)>
		resource = null;
	//   28   65:aconst_null     
	//   29   66:astore_1        
		Resource resource1 = decodeFromData(currentFetcher, currentData, currentDataSource);
	//   30   67:aload_0         
	//   31   68:aload_0         
	//   32   69:getfield        #217 <Field DataFetcher currentFetcher>
	//   33   72:aload_0         
	//   34   73:getfield        #209 <Field Object currentData>
	//   35   76:aload_0         
	//   36   77:getfield        #222 <Field DataSource currentDataSource>
	//   37   80:invokespecial   #224 <Method Resource decodeFromData(DataFetcher, Object, DataSource)>
	//   38   83:astore_2        
		resource = resource1;
	//   39   84:aload_2         
	//   40   85:astore_1        
		break MISSING_BLOCK_LABEL_113;
	//   41   86:goto            113
		GlideException glideexception;
		glideexception;
	//   42   89:astore_2        
		glideexception.setLoggingDetails(currentAttemptingKey, currentDataSource);
	//   43   90:aload_2         
	//   44   91:aload_0         
	//   45   92:getfield        #226 <Field Key currentAttemptingKey>
	//   46   95:aload_0         
	//   47   96:getfield        #222 <Field DataSource currentDataSource>
	//   48   99:invokevirtual   #230 <Method void GlideException.setLoggingDetails(Key, DataSource)>
		exceptions.add(((Object) (glideexception)));
	//   49  102:aload_0         
	//   50  103:getfield        #115 <Field List exceptions>
	//   51  106:aload_2         
	//   52  107:invokeinterface #236 <Method boolean List.add(Object)>
	//   53  112:pop             
		if(resource != null)
	//*  54  113:aload_1         
	//*  55  114:ifnull          127
		{
			notifyEncodeAndRelease(resource, currentDataSource);
	//   56  117:aload_0         
	//   57  118:aload_1         
	//   58  119:aload_0         
	//   59  120:getfield        #222 <Field DataSource currentDataSource>
	//   60  123:invokespecial   #240 <Method void notifyEncodeAndRelease(Resource, DataSource)>
			return;
	//   61  126:return          
		} else
		{
			runGenerators();
	//   62  127:aload_0         
	//   63  128:invokespecial   #243 <Method void runGenerators()>
			return;
	//   64  131:return          
		}
	}

	private DataFetcherGenerator getNextGenerator()
	{
		static class _cls1
		{

			static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[];
			static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[];

			static 
			{
				$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = new int[Stage.values().length];
			//    0    0:invokestatic    #19  <Method DecodeJob$Stage[] DecodeJob$Stage.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.RESOURCE_CACHE.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//    5   12:getstatic       #25  <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
			//    6   15:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.DATA_CACHE.ordinal()] = 2;
			//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//   12   27:getstatic       #32  <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
			//   13   30:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.SOURCE.ordinal()] = 3;
			//   18   39:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//   19   42:getstatic       #35  <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
			//   20   45:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.FINISHED.ordinal()] = 4;
			//   25   54:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//   26   57:getstatic       #38  <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
			//   27   60:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
				}
			//*  30   65:goto            69
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   68:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.INITIALIZE.ordinal()] = 5;
			//   32   69:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//   33   72:getstatic       #41  <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
			//   34   75:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
			//   35   78:iconst_5        
			//   36   79:iastore         
				}
			//*  37   80:goto            84
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   83:astore_0        
				$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = new int[RunReason.values().length];
			//   39   84:invokestatic    #46  <Method DecodeJob$RunReason[] DecodeJob$RunReason.values()>
			//   40   87:arraylength     
			//   41   88:newarray        int[]
			//   42   90:putstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.INITIALIZE.ordinal()] = 1;
			//   43   93:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//   44   96:getstatic       #51  <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
			//   45   99:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
			//   46  102:iconst_1        
			//   47  103:iastore         
				}
			//*  48  104:goto            108
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   49  107:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
			//   50  108:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//   51  111:getstatic       #55  <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
			//   52  114:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
			//   53  117:iconst_2        
			//   54  118:iastore         
				}
			//*  55  119:goto            123
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   56  122:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.DECODE_DATA.ordinal()] = 3;
			//   57  123:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//   58  126:getstatic       #58  <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
			//   59  129:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
			//   60  132:iconst_3        
			//   61  133:iastore         
			//   62  134:return          
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   63  135:astore_0        
			//*  64  136:return          
			}
		}

		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.Stage[stage.ordinal()])
	//*   0    0:getstatic       #249 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*   1    3:aload_0         
	//*   2    4:getfield        #251 <Field DecodeJob$Stage stage>
	//*   3    7:invokevirtual   #255 <Method int DecodeJob$Stage.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 4: default 40
	//	               1 43
	//	               2 56
	//	               3 69
	//	               4 82
	//*   6   40:goto            84
		case 1: // '\001'
			return ((DataFetcherGenerator) (new ResourceCacheGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//    7   43:new             #257 <Class ResourceCacheGenerator>
	//    8   46:dup             
	//    9   47:aload_0         
	//   10   48:getfield        #110 <Field DecodeHelper decodeHelper>
	//   11   51:aload_0         
	//   12   52:invokespecial   #260 <Method void ResourceCacheGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   13   55:areturn         

		case 2: // '\002'
			return ((DataFetcherGenerator) (new DataCacheGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//   14   56:new             #262 <Class DataCacheGenerator>
	//   15   59:dup             
	//   16   60:aload_0         
	//   17   61:getfield        #110 <Field DecodeHelper decodeHelper>
	//   18   64:aload_0         
	//   19   65:invokespecial   #263 <Method void DataCacheGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   20   68:areturn         

		case 3: // '\003'
			return ((DataFetcherGenerator) (new SourceGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//   21   69:new             #265 <Class SourceGenerator>
	//   22   72:dup             
	//   23   73:aload_0         
	//   24   74:getfield        #110 <Field DecodeHelper decodeHelper>
	//   25   77:aload_0         
	//   26   78:invokespecial   #266 <Method void SourceGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   27   81:areturn         

		case 4: // '\004'
			return null;
	//   28   82:aconst_null     
	//   29   83:areturn         
		}
		throw new IllegalStateException((new StringBuilder()).append("Unrecognized stage: ").append(((Object) (stage))).toString());
	//   30   84:new             #268 <Class IllegalStateException>
	//   31   87:dup             
	//   32   88:new             #167 <Class StringBuilder>
	//   33   91:dup             
	//   34   92:invokespecial   #168 <Method void StringBuilder()>
	//   35   95:ldc2            #270 <String "Unrecognized stage: ">
	//   36   98:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37  101:aload_0         
	//   38  102:getfield        #251 <Field DecodeJob$Stage stage>
	//   39  105:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   40  108:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   41  111:invokespecial   #273 <Method void IllegalStateException(String)>
	//   42  114:athrow          
	}

	private Stage getNextStage(Stage stage1)
	{
		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.Stage[stage1.ordinal()])
	//*   0    0:getstatic       #249 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #255 <Method int DecodeJob$Stage.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 69
	//	               2 91
	//	               3 106
	//	               4 106
	//	               5 47
	//*   5   44:goto            110
		case 5: // '\005'
			if(diskCacheStrategy.decodeCachedResource())
	//*   6   47:aload_0         
	//*   7   48:getfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
	//*   8   51:invokevirtual   #283 <Method boolean DiskCacheStrategy.decodeCachedResource()>
	//*   9   54:ifeq            61
				return Stage.RESOURCE_CACHE;
	//   10   57:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//   11   60:areturn         
			else
				return getNextStage(Stage.RESOURCE_CACHE);
	//   12   61:aload_0         
	//   13   62:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//   14   65:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   15   68:areturn         

		case 1: // '\001'
			if(diskCacheStrategy.decodeCachedData())
	//*  16   69:aload_0         
	//*  17   70:getfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
	//*  18   73:invokevirtual   #291 <Method boolean DiskCacheStrategy.decodeCachedData()>
	//*  19   76:ifeq            83
				return Stage.DATA_CACHE;
	//   20   79:getstatic       #294 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//   21   82:areturn         
			else
				return getNextStage(Stage.DATA_CACHE);
	//   22   83:aload_0         
	//   23   84:getstatic       #294 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//   24   87:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   25   90:areturn         

		case 2: // '\002'
			if(onlyRetrieveFromCache)
	//*  26   91:aload_0         
	//*  27   92:getfield        #296 <Field boolean onlyRetrieveFromCache>
	//*  28   95:ifeq            102
				return Stage.FINISHED;
	//   29   98:getstatic       #299 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//   30  101:areturn         
			else
				return Stage.SOURCE;
	//   31  102:getstatic       #302 <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//   32  105:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return Stage.FINISHED;
	//   33  106:getstatic       #299 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//   34  109:areturn         
		}
		throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized stage: ").append(((Object) (stage1))).toString());
	//   35  110:new             #304 <Class IllegalArgumentException>
	//   36  113:dup             
	//   37  114:new             #167 <Class StringBuilder>
	//   38  117:dup             
	//   39  118:invokespecial   #168 <Method void StringBuilder()>
	//   40  121:ldc2            #270 <String "Unrecognized stage: ">
	//   41  124:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   42  127:aload_1         
	//   43  128:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   44  131:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   45  134:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   46  137:athrow          
	}

	private Options getOptionsWithHardwareConfig(DataSource datasource)
	{
label0:
		{
			Options options1 = options;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field Options options>
	//    2    4:astore_2        
			if(android.os.Build.VERSION.SDK_INT < 26)
	//*   3    5:getstatic       #314 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          26
	//*   5   10:icmpge          15
				return options1;
	//    6   13:aload_2         
	//    7   14:areturn         
			if(options1.get(Downsampler.ALLOW_HARDWARE_CONFIG) != null)
	//*   8   15:aload_2         
	//*   9   16:getstatic       #320 <Field com.bumptech.glide.load.Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//*  10   19:invokevirtual   #326 <Method Object Options.get(com.bumptech.glide.load.Option)>
	//*  11   22:ifnull          27
				return options1;
	//   12   25:aload_2         
	//   13   26:areturn         
			if(datasource != DataSource.RESOURCE_DISK_CACHE)
	//*  14   27:aload_1         
	//*  15   28:getstatic       #331 <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//*  16   31:if_acmpeq       46
			{
				datasource = ((DataSource) (options1));
	//   17   34:aload_2         
	//   18   35:astore_1        
				if(!decodeHelper.isScaleOnlyOrNoTransform())
					break label0;
	//   19   36:aload_0         
	//   20   37:getfield        #110 <Field DecodeHelper decodeHelper>
	//   21   40:invokevirtual   #334 <Method boolean DecodeHelper.isScaleOnlyOrNoTransform()>
	//   22   43:ifeq            74
			}
			datasource = ((DataSource) (new Options()));
	//   23   46:new             #322 <Class Options>
	//   24   49:dup             
	//   25   50:invokespecial   #335 <Method void Options()>
	//   26   53:astore_1        
			((Options) (datasource)).putAll(options);
	//   27   54:aload_1         
	//   28   55:aload_0         
	//   29   56:getfield        #309 <Field Options options>
	//   30   59:invokevirtual   #339 <Method void Options.putAll(Options)>
			((Options) (datasource)).set(Downsampler.ALLOW_HARDWARE_CONFIG, ((Object) (Boolean.valueOf(true))));
	//   31   62:aload_1         
	//   32   63:getstatic       #320 <Field com.bumptech.glide.load.Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//   33   66:iconst_1        
	//   34   67:invokestatic    #345 <Method Boolean Boolean.valueOf(boolean)>
	//   35   70:invokevirtual   #349 <Method Options Options.set(com.bumptech.glide.load.Option, Object)>
	//   36   73:pop             
		}
		return ((Options) (datasource));
	//   37   74:aload_1         
	//   38   75:areturn         
	}

	private int getPriority()
	{
		return priority.ordinal();
	//    0    0:aload_0         
	//    1    1:getfield        #352 <Field Priority priority>
	//    2    4:invokevirtual   #355 <Method int Priority.ordinal()>
	//    3    7:ireturn         
	}

	private void logWithTimeAndKey(String s, long l)
	{
		logWithTimeAndKey(s, l, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #220 <Method void logWithTimeAndKey(String, long, String)>
	//    5    7:return          
	}

	private void logWithTimeAndKey(String s, long l, String s1)
	{
		StringBuilder stringbuilder = (new StringBuilder()).append(s).append(" in ").append(LogTime.getElapsedMillis(l)).append(", load key: ").append(((Object) (loadKey)));
	//    0    0:new             #167 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc2            #357 <String " in ">
	//    6   14:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:lload_2         
	//    8   18:invokestatic    #361 <Method double LogTime.getElapsedMillis(long)>
	//    9   21:invokevirtual   #364 <Method StringBuilder StringBuilder.append(double)>
	//   10   24:ldc2            #366 <String ", load key: ">
	//   11   27:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:aload_0         
	//   13   31:getfield        #368 <Field EngineKey loadKey>
	//   14   34:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   15   37:astore          5
		if(s1 != null)
	//*  16   39:aload           4
	//*  17   41:ifnull          69
			s = (new StringBuilder()).append(", ").append(s1).toString();
	//   18   44:new             #167 <Class StringBuilder>
	//   19   47:dup             
	//   20   48:invokespecial   #168 <Method void StringBuilder()>
	//   21   51:ldc2            #370 <String ", ">
	//   22   54:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   23   57:aload           4
	//   24   59:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   25   62:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   26   65:astore_1        
		else
	//*  27   66:goto            73
			s = "";
	//   28   69:ldc2            #372 <String "">
	//   29   72:astore_1        
		Log.v("DecodeJob", stringbuilder.append(s).append(", thread: ").append(Thread.currentThread().getName()).toString());
	//   30   73:ldc1            #40  <String "DecodeJob">
	//   31   75:aload           5
	//   32   77:aload_1         
	//   33   78:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   34   81:ldc2            #374 <String ", thread: ">
	//   35   84:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   36   87:invokestatic    #379 <Method Thread Thread.currentThread()>
	//   37   90:invokevirtual   #382 <Method String Thread.getName()>
	//   38   93:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   39   96:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   40   99:invokestatic    #386 <Method int Log.v(String, String)>
	//   41  102:pop             
	//   42  103:return          
	}

	private void notifyComplete(Resource resource, DataSource datasource)
	{
		setNotifiedOrThrow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #390 <Method void setNotifiedOrThrow()>
		callback.onResourceReady(resource, datasource);
	//    2    4:aload_0         
	//    3    5:getfield        #392 <Field DecodeJob$Callback callback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #395 <Method void DecodeJob$Callback.onResourceReady(Resource, DataSource)>
	//    7   15:return          
	}

	private void notifyEncodeAndRelease(Resource resource, DataSource datasource)
	{
		LockedResource lockedresource;
		if(resource instanceof Initializable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #398 <Class Initializable>
	//*   2    4:ifeq            16
			((Initializable)resource).initialize();
	//    3    7:aload_1         
	//    4    8:checkcast       #398 <Class Initializable>
	//    5   11:invokeinterface #401 <Method void Initializable.initialize()>
		Object obj = ((Object) (resource));
	//    6   16:aload_1         
	//    7   17:astore          4
		lockedresource = null;
	//    8   19:aconst_null     
	//    9   20:astore_3        
		if(deferredEncodeManager.hasResourceToEncode())
	//*  10   21:aload_0         
	//*  11   22:getfield        #126 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//*  12   25:invokevirtual   #404 <Method boolean DecodeJob$DeferredEncodeManager.hasResourceToEncode()>
	//*  13   28:ifeq            39
		{
			lockedresource = LockedResource.obtain(resource);
	//   14   31:aload_1         
	//   15   32:invokestatic    #410 <Method LockedResource LockedResource.obtain(Resource)>
	//   16   35:astore_3        
			obj = ((Object) (lockedresource));
	//   17   36:aload_3         
	//   18   37:astore          4
		}
		notifyComplete(((Resource) (obj)), datasource);
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:aload_2         
	//   22   43:invokespecial   #412 <Method void notifyComplete(Resource, DataSource)>
		stage = Stage.ENCODE;
	//   23   46:aload_0         
	//   24   47:getstatic       #415 <Field DecodeJob$Stage DecodeJob$Stage.ENCODE>
	//   25   50:putfield        #251 <Field DecodeJob$Stage stage>
		if(deferredEncodeManager.hasResourceToEncode())
	//*  26   53:aload_0         
	//*  27   54:getfield        #126 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//*  28   57:invokevirtual   #404 <Method boolean DecodeJob$DeferredEncodeManager.hasResourceToEncode()>
	//*  29   60:ifeq            78
			deferredEncodeManager.encode(diskCacheProvider, options);
	//   30   63:aload_0         
	//   31   64:getfield        #126 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//   32   67:aload_0         
	//   33   68:getfield        #131 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//   34   71:aload_0         
	//   35   72:getfield        #309 <Field Options options>
	//   36   75:invokevirtual   #419 <Method void DecodeJob$DeferredEncodeManager.encode(DecodeJob$DiskCacheProvider, Options)>
		if(lockedresource != null)
	//*  37   78:aload_3         
	//*  38   79:ifnull          86
			lockedresource.unlock();
	//   39   82:aload_3         
	//   40   83:invokevirtual   #422 <Method void LockedResource.unlock()>
		onEncodeComplete();
	//   41   86:aload_0         
	//   42   87:invokespecial   #425 <Method void onEncodeComplete()>
		return;
	//   43   90:return          
		resource;
	//   44   91:astore_1        
		if(lockedresource != null)
	//*  45   92:aload_3         
	//*  46   93:ifnull          100
			lockedresource.unlock();
	//   47   96:aload_3         
	//   48   97:invokevirtual   #422 <Method void LockedResource.unlock()>
		onEncodeComplete();
	//   49  100:aload_0         
	//   50  101:invokespecial   #425 <Method void onEncodeComplete()>
		throw resource;
	//   51  104:aload_1         
	//   52  105:athrow          
	}

	private void notifyFailed()
	{
		setNotifiedOrThrow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #390 <Method void setNotifiedOrThrow()>
		GlideException glideexception = new GlideException("Failed to load resource", ((List) (new ArrayList(((java.util.Collection) (exceptions))))));
	//    2    4:new             #144 <Class GlideException>
	//    3    7:dup             
	//    4    8:ldc2            #428 <String "Failed to load resource">
	//    5   11:new             #112 <Class ArrayList>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #115 <Field List exceptions>
	//    9   19:invokespecial   #431 <Method void ArrayList(java.util.Collection)>
	//   10   22:invokespecial   #434 <Method void GlideException(String, List)>
	//   11   25:astore_1        
		callback.onLoadFailed(glideexception);
	//   12   26:aload_0         
	//   13   27:getfield        #392 <Field DecodeJob$Callback callback>
	//   14   30:aload_1         
	//   15   31:invokeinterface #438 <Method void DecodeJob$Callback.onLoadFailed(GlideException)>
		onLoadFailed();
	//   16   36:aload_0         
	//   17   37:invokespecial   #440 <Method void onLoadFailed()>
	//   18   40:return          
	}

	private void onEncodeComplete()
	{
		if(releaseManager.onEncodeComplete())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:invokevirtual   #442 <Method boolean DecodeJob$ReleaseManager.onEncodeComplete()>
	//*   3    7:ifeq            14
			releaseInternal();
	//    4   10:aload_0         
	//    5   11:invokespecial   #445 <Method void releaseInternal()>
	//    6   14:return          
	}

	private void onLoadFailed()
	{
		if(releaseManager.onFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:invokevirtual   #448 <Method boolean DecodeJob$ReleaseManager.onFailed()>
	//*   3    7:ifeq            14
			releaseInternal();
	//    4   10:aload_0         
	//    5   11:invokespecial   #445 <Method void releaseInternal()>
	//    6   14:return          
	}

	private void releaseInternal()
	{
		releaseManager.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field DecodeJob$ReleaseManager releaseManager>
	//    2    4:invokevirtual   #451 <Method void DecodeJob$ReleaseManager.reset()>
		deferredEncodeManager.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//    5   11:invokevirtual   #454 <Method void DecodeJob$DeferredEncodeManager.clear()>
		decodeHelper.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #110 <Field DecodeHelper decodeHelper>
	//    8   18:invokevirtual   #455 <Method void DecodeHelper.clear()>
		isCallbackNotified = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #457 <Field boolean isCallbackNotified>
		glideContext = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #140 <Field GlideContext glideContext>
		signature = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #459 <Field Key signature>
		options = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #309 <Field Options options>
		priority = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #352 <Field Priority priority>
		loadKey = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #368 <Field EngineKey loadKey>
		callback = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #392 <Field DecodeJob$Callback callback>
		stage = null;
	//   30   56:aload_0         
	//   31   57:aconst_null     
	//   32   58:putfield        #251 <Field DecodeJob$Stage stage>
		currentGenerator = null;
	//   33   61:aload_0         
	//   34   62:aconst_null     
	//   35   63:putfield        #461 <Field DataFetcherGenerator currentGenerator>
		currentThread = null;
	//   36   66:aload_0         
	//   37   67:aconst_null     
	//   38   68:putfield        #463 <Field Thread currentThread>
		currentSourceKey = null;
	//   39   71:aload_0         
	//   40   72:aconst_null     
	//   41   73:putfield        #213 <Field Key currentSourceKey>
		currentData = null;
	//   42   76:aload_0         
	//   43   77:aconst_null     
	//   44   78:putfield        #209 <Field Object currentData>
		currentDataSource = null;
	//   45   81:aload_0         
	//   46   82:aconst_null     
	//   47   83:putfield        #222 <Field DataSource currentDataSource>
		currentFetcher = null;
	//   48   86:aload_0         
	//   49   87:aconst_null     
	//   50   88:putfield        #217 <Field DataFetcher currentFetcher>
		startFetchTime = 0L;
	//   51   91:aload_0         
	//   52   92:lconst_0        
	//   53   93:putfield        #205 <Field long startFetchTime>
		isCancelled = false;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #465 <Field boolean isCancelled>
		exceptions.clear();
	//   57  101:aload_0         
	//   58  102:getfield        #115 <Field List exceptions>
	//   59  105:invokeinterface #466 <Method void List.clear()>
		pool.release(((Object) (this)));
	//   60  110:aload_0         
	//   61  111:getfield        #133 <Field android.support.v4.util.Pools$Pool pool>
	//   62  114:aload_0         
	//   63  115:invokeinterface #471 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   64  120:pop             
	//   65  121:return          
	}

	private void runGenerators()
	{
		currentThread = Thread.currentThread();
	//    0    0:aload_0         
	//    1    1:invokestatic    #379 <Method Thread Thread.currentThread()>
	//    2    4:putfield        #463 <Field Thread currentThread>
		startFetchTime = LogTime.getLogTime();
	//    3    7:aload_0         
	//    4    8:invokestatic    #155 <Method long LogTime.getLogTime()>
	//    5   11:putfield        #205 <Field long startFetchTime>
		boolean flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		boolean flag1;
		do
		{
			flag1 = flag;
	//    8   16:iload_1         
	//    9   17:istore_2        
			if(isCancelled)
				break;
	//   10   18:aload_0         
	//   11   19:getfield        #465 <Field boolean isCancelled>
	//   12   22:ifne            87
			flag1 = flag;
	//   13   25:iload_1         
	//   14   26:istore_2        
			if(currentGenerator == null)
				break;
	//   15   27:aload_0         
	//   16   28:getfield        #461 <Field DataFetcherGenerator currentGenerator>
	//   17   31:ifnull          87
			boolean flag2 = currentGenerator.startNext();
	//   18   34:aload_0         
	//   19   35:getfield        #461 <Field DataFetcherGenerator currentGenerator>
	//   20   38:invokeinterface #476 <Method boolean DataFetcherGenerator.startNext()>
	//   21   43:istore_3        
			flag = flag2;
	//   22   44:iload_3         
	//   23   45:istore_1        
			flag1 = flag;
	//   24   46:iload_1         
	//   25   47:istore_2        
			if(flag2)
				break;
	//   26   48:iload_3         
	//   27   49:ifne            87
			stage = getNextStage(stage);
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #251 <Field DecodeJob$Stage stage>
	//   32   58:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   33   61:putfield        #251 <Field DecodeJob$Stage stage>
			currentGenerator = getNextGenerator();
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:invokespecial   #478 <Method DataFetcherGenerator getNextGenerator()>
	//   37   69:putfield        #461 <Field DataFetcherGenerator currentGenerator>
			if(stage == Stage.SOURCE)
	//*  38   72:aload_0         
	//*  39   73:getfield        #251 <Field DecodeJob$Stage stage>
	//*  40   76:getstatic       #302 <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//*  41   79:if_acmpne       16
			{
				reschedule();
	//   42   82:aload_0         
	//   43   83:invokevirtual   #481 <Method void reschedule()>
				return;
	//   44   86:return          
			}
		} while(true);
		if((stage == Stage.FINISHED || isCancelled) && !flag1)
	//*  45   87:aload_0         
	//*  46   88:getfield        #251 <Field DecodeJob$Stage stage>
	//*  47   91:getstatic       #299 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//*  48   94:if_acmpeq       104
	//*  49   97:aload_0         
	//*  50   98:getfield        #465 <Field boolean isCancelled>
	//*  51  101:ifeq            112
	//*  52  104:iload_2         
	//*  53  105:ifne            112
			notifyFailed();
	//   54  108:aload_0         
	//   55  109:invokespecial   #483 <Method void notifyFailed()>
	//   56  112:return          
	}

	private Resource runLoadPath(Object obj, DataSource datasource, LoadPath loadpath)
		throws GlideException
	{
		Options options1;
		options1 = getOptionsWithHardwareConfig(datasource);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #485 <Method Options getOptionsWithHardwareConfig(DataSource)>
	//    3    5:astore          4
		obj = ((Object) (glideContext.getRegistry().getRewinder(obj)));
	//    4    7:aload_0         
	//    5    8:getfield        #140 <Field GlideContext glideContext>
	//    6   11:invokevirtual   #491 <Method Registry GlideContext.getRegistry()>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #497 <Method DataRewinder Registry.getRewinder(Object)>
	//    9   18:astore_1        
		datasource = ((DataSource) (loadpath.load(((DataRewinder) (obj)), options1, width, height, ((DecodePath.DecodeCallback) (new DecodeCallback(datasource))))));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:aload           4
	//   13   23:aload_0         
	//   14   24:getfield        #499 <Field int width>
	//   15   27:aload_0         
	//   16   28:getfield        #501 <Field int height>
	//   17   31:new             #20  <Class DecodeJob$DecodeCallback>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokespecial   #504 <Method void DecodeJob$DecodeCallback(DecodeJob, DataSource)>
	//   22   40:invokevirtual   #510 <Method Resource LoadPath.load(DataRewinder, Options, int, int, DecodePath$DecodeCallback)>
	//   23   43:astore_2        
		((DataRewinder) (obj)).cleanup();
	//   24   44:aload_1         
	//   25   45:invokeinterface #513 <Method void DataRewinder.cleanup()>
		return ((Resource) (datasource));
	//   26   50:aload_2         
	//   27   51:areturn         
		datasource;
	//   28   52:astore_2        
		((DataRewinder) (obj)).cleanup();
	//   29   53:aload_1         
	//   30   54:invokeinterface #513 <Method void DataRewinder.cleanup()>
		throw datasource;
	//   31   59:aload_2         
	//   32   60:athrow          
	}

	private void runWrapped()
	{
		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.RunReason[runReason.ordinal()])
	//*   0    0:getstatic       #518 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*   1    3:aload_0         
	//*   2    4:getfield        #520 <Field DecodeJob$RunReason runReason>
	//*   3    7:invokevirtual   #521 <Method int DecodeJob$RunReason.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 39
	//	               2 63
	//	               3 68
	//*   6   36:goto            73
		case 1: // '\001'
			stage = getNextStage(Stage.INITIALIZE);
	//    7   39:aload_0         
	//    8   40:aload_0         
	//    9   41:getstatic       #524 <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//   10   44:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   11   47:putfield        #251 <Field DecodeJob$Stage stage>
			currentGenerator = getNextGenerator();
	//   12   50:aload_0         
	//   13   51:aload_0         
	//   14   52:invokespecial   #478 <Method DataFetcherGenerator getNextGenerator()>
	//   15   55:putfield        #461 <Field DataFetcherGenerator currentGenerator>
			runGenerators();
	//   16   58:aload_0         
	//   17   59:invokespecial   #243 <Method void runGenerators()>
			return;
	//   18   62:return          

		case 2: // '\002'
			runGenerators();
	//   19   63:aload_0         
	//   20   64:invokespecial   #243 <Method void runGenerators()>
			return;
	//   21   67:return          

		case 3: // '\003'
			decodeFromRetrievedData();
	//   22   68:aload_0         
	//   23   69:invokespecial   #526 <Method void decodeFromRetrievedData()>
			return;
	//   24   72:return          
		}
		throw new IllegalStateException((new StringBuilder()).append("Unrecognized run reason: ").append(((Object) (runReason))).toString());
	//   25   73:new             #268 <Class IllegalStateException>
	//   26   76:dup             
	//   27   77:new             #167 <Class StringBuilder>
	//   28   80:dup             
	//   29   81:invokespecial   #168 <Method void StringBuilder()>
	//   30   84:ldc2            #528 <String "Unrecognized run reason: ">
	//   31   87:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   32   90:aload_0         
	//   33   91:getfield        #520 <Field DecodeJob$RunReason runReason>
	//   34   94:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   35   97:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   36  100:invokespecial   #273 <Method void IllegalStateException(String)>
	//   37  103:athrow          
	}

	private void setNotifiedOrThrow()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #531 <Method void StateVerifier.throwIfRecycled()>
		if(isCallbackNotified)
	//*   3    7:aload_0         
	//*   4    8:getfield        #457 <Field boolean isCallbackNotified>
	//*   5   11:ifeq            25
		{
			throw new IllegalStateException("Already notified");
	//    6   14:new             #268 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #533 <String "Already notified">
	//    9   21:invokespecial   #273 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			isCallbackNotified = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #457 <Field boolean isCallbackNotified>
			return;
	//   14   30:return          
		}
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #465 <Field boolean isCancelled>
		DataFetcherGenerator datafetchergenerator = currentGenerator;
	//    3    5:aload_0         
	//    4    6:getfield        #461 <Field DataFetcherGenerator currentGenerator>
	//    5    9:astore_1        
		if(datafetchergenerator != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			datafetchergenerator.cancel();
	//    8   14:aload_1         
	//    9   15:invokeinterface #536 <Method void DataFetcherGenerator.cancel()>
	//   10   20:return          
	}

	public int compareTo(DecodeJob decodejob)
	{
		int j = getPriority() - decodejob.getPriority();
	//    0    0:aload_0         
	//    1    1:invokespecial   #540 <Method int getPriority()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #540 <Method int getPriority()>
	//    4    8:isub            
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            26
			i = order - decodejob.order;
	//   10   16:aload_0         
	//   11   17:getfield        #542 <Field int order>
	//   12   20:aload_1         
	//   13   21:getfield        #542 <Field int order>
	//   14   24:isub            
	//   15   25:istore_2        
		return i;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((DecodeJob)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class DecodeJob>
	//    3    5:invokevirtual   #546 <Method int compareTo(DecodeJob)>
	//    4    8:ireturn         
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	DecodeJob init(GlideContext glidecontext, Object obj, EngineKey enginekey, Key key, int i, int j, Class class1, 
			Class class2, Priority priority1, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, boolean flag2, 
			Options options1, Callback callback1, int k)
	{
		decodeHelper.init(glidecontext, obj, key, i, j, diskcachestrategy, class1, class2, priority1, options1, map, flag, flag1, diskCacheProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field DecodeHelper decodeHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload           4
	//    5    8:iload           5
	//    6   10:iload           6
	//    7   12:aload           10
	//    8   14:aload           7
	//    9   16:aload           8
	//   10   18:aload           9
	//   11   20:aload           15
	//   12   22:aload           11
	//   13   24:iload           12
	//   14   26:iload           13
	//   15   28:aload_0         
	//   16   29:getfield        #131 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//   17   32:invokevirtual   #552 <Method DecodeHelper DecodeHelper.init(GlideContext, Object, Key, int, int, DiskCacheStrategy, Class, Class, Priority, Options, Map, boolean, boolean, DecodeJob$DiskCacheProvider)>
	//   18   35:pop             
		glideContext = glidecontext;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #140 <Field GlideContext glideContext>
		signature = key;
	//   22   41:aload_0         
	//   23   42:aload           4
	//   24   44:putfield        #459 <Field Key signature>
		priority = priority1;
	//   25   47:aload_0         
	//   26   48:aload           9
	//   27   50:putfield        #352 <Field Priority priority>
		loadKey = enginekey;
	//   28   53:aload_0         
	//   29   54:aload_3         
	//   30   55:putfield        #368 <Field EngineKey loadKey>
		width = i;
	//   31   58:aload_0         
	//   32   59:iload           5
	//   33   61:putfield        #499 <Field int width>
		height = j;
	//   34   64:aload_0         
	//   35   65:iload           6
	//   36   67:putfield        #501 <Field int height>
		diskCacheStrategy = diskcachestrategy;
	//   37   70:aload_0         
	//   38   71:aload           10
	//   39   73:putfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
		onlyRetrieveFromCache = flag2;
	//   40   76:aload_0         
	//   41   77:iload           14
	//   42   79:putfield        #296 <Field boolean onlyRetrieveFromCache>
		options = options1;
	//   43   82:aload_0         
	//   44   83:aload           15
	//   45   85:putfield        #309 <Field Options options>
		callback = callback1;
	//   46   88:aload_0         
	//   47   89:aload           16
	//   48   91:putfield        #392 <Field DecodeJob$Callback callback>
		order = k;
	//   49   94:aload_0         
	//   50   95:iload           17
	//   51   97:putfield        #542 <Field int order>
		runReason = RunReason.INITIALIZE;
	//   52  100:aload_0         
	//   53  101:getstatic       #554 <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
	//   54  104:putfield        #520 <Field DecodeJob$RunReason runReason>
		return this;
	//   55  107:aload_0         
	//   56  108:areturn         
	}

	public void onDataFetcherFailed(Key key, Exception exception, DataFetcher datafetcher, DataSource datasource)
	{
		datafetcher.cleanup();
	//    0    0:aload_3         
	//    1    1:invokeinterface #149 <Method void DataFetcher.cleanup()>
		exception = ((Exception) (new GlideException("Fetching data failed", exception)));
	//    2    6:new             #144 <Class GlideException>
	//    3    9:dup             
	//    4   10:ldc2            #559 <String "Fetching data failed">
	//    5   13:aload_2         
	//    6   14:invokespecial   #562 <Method void GlideException(String, Exception)>
	//    7   17:astore_2        
		((GlideException) (exception)).setLoggingDetails(key, datasource, datafetcher.getDataClass());
	//    8   18:aload_2         
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:aload_3         
	//   12   23:invokeinterface #565 <Method Class DataFetcher.getDataClass()>
	//   13   28:invokevirtual   #568 <Method void GlideException.setLoggingDetails(Key, DataSource, Class)>
		exceptions.add(((Object) (exception)));
	//   14   31:aload_0         
	//   15   32:getfield        #115 <Field List exceptions>
	//   16   35:aload_2         
	//   17   36:invokeinterface #236 <Method boolean List.add(Object)>
	//   18   41:pop             
		if(Thread.currentThread() != currentThread)
	//*  19   42:invokestatic    #379 <Method Thread Thread.currentThread()>
	//*  20   45:aload_0         
	//*  21   46:getfield        #463 <Field Thread currentThread>
	//*  22   49:if_acmpeq       70
		{
			runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
	//   23   52:aload_0         
	//   24   53:getstatic       #571 <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//   25   56:putfield        #520 <Field DecodeJob$RunReason runReason>
			callback.reschedule(this);
	//   26   59:aload_0         
	//   27   60:getfield        #392 <Field DecodeJob$Callback callback>
	//   28   63:aload_0         
	//   29   64:invokeinterface #574 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
			return;
	//   30   69:return          
		} else
		{
			runGenerators();
	//   31   70:aload_0         
	//   32   71:invokespecial   #243 <Method void runGenerators()>
			return;
	//   33   74:return          
		}
	}

	public void onDataFetcherReady(Key key, Object obj, DataFetcher datafetcher, DataSource datasource, Key key1)
	{
		currentSourceKey = key;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #213 <Field Key currentSourceKey>
		currentData = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #209 <Field Object currentData>
		currentFetcher = datafetcher;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #217 <Field DataFetcher currentFetcher>
		currentDataSource = datasource;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #222 <Field DataSource currentDataSource>
		currentAttemptingKey = key1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #226 <Field Key currentAttemptingKey>
		if(Thread.currentThread() != currentThread)
	//*  15   27:invokestatic    #379 <Method Thread Thread.currentThread()>
	//*  16   30:aload_0         
	//*  17   31:getfield        #463 <Field Thread currentThread>
	//*  18   34:if_acmpeq       55
		{
			runReason = RunReason.DECODE_DATA;
	//   19   37:aload_0         
	//   20   38:getstatic       #580 <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
	//   21   41:putfield        #520 <Field DecodeJob$RunReason runReason>
			callback.reschedule(this);
	//   22   44:aload_0         
	//   23   45:getfield        #392 <Field DecodeJob$Callback callback>
	//   24   48:aload_0         
	//   25   49:invokeinterface #574 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
			return;
	//   26   54:return          
		}
		TraceCompat.beginSection("DecodeJob.decodeFromRetrievedData");
	//   27   55:ldc2            #582 <String "DecodeJob.decodeFromRetrievedData">
	//   28   58:invokestatic    #587 <Method void TraceCompat.beginSection(String)>
		decodeFromRetrievedData();
	//   29   61:aload_0         
	//   30   62:invokespecial   #526 <Method void decodeFromRetrievedData()>
		TraceCompat.endSection();
	//   31   65:invokestatic    #590 <Method void TraceCompat.endSection()>
		return;
	//   32   68:return          
		key;
	//   33   69:astore_1        
		TraceCompat.endSection();
	//   34   70:invokestatic    #590 <Method void TraceCompat.endSection()>
		throw key;
	//   35   73:aload_1         
	//   36   74:athrow          
	}

	void release(boolean flag)
	{
		if(releaseManager.release(flag))
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #595 <Method boolean DecodeJob$ReleaseManager.release(boolean)>
	//*   4    8:ifeq            15
			releaseInternal();
	//    5   11:aload_0         
	//    6   12:invokespecial   #445 <Method void releaseInternal()>
	//    7   15:return          
	}

	public void reschedule()
	{
		runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
	//    0    0:aload_0         
	//    1    1:getstatic       #571 <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//    2    4:putfield        #520 <Field DecodeJob$RunReason runReason>
		callback.reschedule(this);
	//    3    7:aload_0         
	//    4    8:getfield        #392 <Field DecodeJob$Callback callback>
	//    5   11:aload_0         
	//    6   12:invokeinterface #574 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
	//    7   17:return          
	}

	public void run()
	{
		TraceCompat.beginSection("DecodeJob#run");
	//    0    0:ldc2            #600 <String "DecodeJob#run">
	//    1    3:invokestatic    #587 <Method void TraceCompat.beginSection(String)>
		if(!isCancelled)
			break MISSING_BLOCK_LABEL_37;
	//    2    6:aload_0         
	//    3    7:getfield        #465 <Field boolean isCancelled>
	//    4   10:ifeq            37
		notifyFailed();
	//    5   13:aload_0         
	//    6   14:invokespecial   #483 <Method void notifyFailed()>
		if(currentFetcher != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #217 <Field DataFetcher currentFetcher>
	//*   9   21:ifnull          33
			currentFetcher.cleanup();
	//   10   24:aload_0         
	//   11   25:getfield        #217 <Field DataFetcher currentFetcher>
	//   12   28:invokeinterface #149 <Method void DataFetcher.cleanup()>
		TraceCompat.endSection();
	//   13   33:invokestatic    #590 <Method void TraceCompat.endSection()>
		return;
	//   14   36:return          
		runWrapped();
	//   15   37:aload_0         
	//   16   38:invokespecial   #602 <Method void runWrapped()>
		if(currentFetcher != null)
	//*  17   41:aload_0         
	//*  18   42:getfield        #217 <Field DataFetcher currentFetcher>
	//*  19   45:ifnull          57
			currentFetcher.cleanup();
	//   20   48:aload_0         
	//   21   49:getfield        #217 <Field DataFetcher currentFetcher>
	//   22   52:invokeinterface #149 <Method void DataFetcher.cleanup()>
		TraceCompat.endSection();
	//   23   57:invokestatic    #590 <Method void TraceCompat.endSection()>
		return;
	//   24   60:return          
		Object obj;
		obj;
	//   25   61:astore_1        
		if(Log.isLoggable("DecodeJob", 3))
	//*  26   62:ldc1            #40  <String "DecodeJob">
	//*  27   64:iconst_3        
	//*  28   65:invokestatic    #165 <Method boolean Log.isLoggable(String, int)>
	//*  29   68:ifeq            114
			Log.d("DecodeJob", (new StringBuilder()).append("DecodeJob threw unexpectedly, isCancelled: ").append(isCancelled).append(", stage: ").append(((Object) (stage))).toString(), ((Throwable) (obj)));
	//   30   71:ldc1            #40  <String "DecodeJob">
	//   31   73:new             #167 <Class StringBuilder>
	//   32   76:dup             
	//   33   77:invokespecial   #168 <Method void StringBuilder()>
	//   34   80:ldc2            #604 <String "DecodeJob threw unexpectedly, isCancelled: ">
	//   35   83:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   36   86:aload_0         
	//   37   87:getfield        #465 <Field boolean isCancelled>
	//   38   90:invokevirtual   #607 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   93:ldc2            #609 <String ", stage: ">
	//   40   96:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   41   99:aload_0         
	//   42  100:getfield        #251 <Field DecodeJob$Stage stage>
	//   43  103:invokevirtual   #177 <Method StringBuilder StringBuilder.append(Object)>
	//   44  106:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   45  109:aload_1         
	//   46  110:invokestatic    #613 <Method int Log.d(String, String, Throwable)>
	//   47  113:pop             
		if(stage != Stage.ENCODE)
	//*  48  114:aload_0         
	//*  49  115:getfield        #251 <Field DecodeJob$Stage stage>
	//*  50  118:getstatic       #415 <Field DecodeJob$Stage DecodeJob$Stage.ENCODE>
	//*  51  121:if_acmpeq       128
			notifyFailed();
	//   52  124:aload_0         
	//   53  125:invokespecial   #483 <Method void notifyFailed()>
		if(!isCancelled)
	//*  54  128:aload_0         
	//*  55  129:getfield        #465 <Field boolean isCancelled>
	//*  56  132:ifne            137
			throw obj;
	//   57  135:aload_1         
	//   58  136:athrow          
		if(currentFetcher != null)
	//*  59  137:aload_0         
	//*  60  138:getfield        #217 <Field DataFetcher currentFetcher>
	//*  61  141:ifnull          153
			currentFetcher.cleanup();
	//   62  144:aload_0         
	//   63  145:getfield        #217 <Field DataFetcher currentFetcher>
	//   64  148:invokeinterface #149 <Method void DataFetcher.cleanup()>
		TraceCompat.endSection();
	//   65  153:invokestatic    #590 <Method void TraceCompat.endSection()>
		return;
	//   66  156:return          
		obj;
	//   67  157:astore_1        
		if(currentFetcher != null)
	//*  68  158:aload_0         
	//*  69  159:getfield        #217 <Field DataFetcher currentFetcher>
	//*  70  162:ifnull          174
			currentFetcher.cleanup();
	//   71  165:aload_0         
	//   72  166:getfield        #217 <Field DataFetcher currentFetcher>
	//   73  169:invokeinterface #149 <Method void DataFetcher.cleanup()>
		TraceCompat.endSection();
	//   74  174:invokestatic    #590 <Method void TraceCompat.endSection()>
		throw obj;
	//   75  177:aload_1         
	//   76  178:athrow          
	}

	boolean willDecodeFromCache()
	{
		Stage stage1 = getNextStage(Stage.INITIALIZE);
	//    0    0:aload_0         
	//    1    1:getstatic       #524 <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//    2    4:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//    3    7:astore_1        
		return stage1 == Stage.RESOURCE_CACHE || stage1 == Stage.DATA_CACHE;
	//    4    8:aload_1         
	//    5    9:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//    6   12:if_acmpeq       22
	//    7   15:aload_1         
	//    8   16:getstatic       #294 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//    9   19:if_acmpne       24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private static final String TAG = "DecodeJob";
	private Callback callback;
	private Key currentAttemptingKey;
	private Object currentData;
	private DataSource currentDataSource;
	private DataFetcher currentFetcher;
	private volatile DataFetcherGenerator currentGenerator;
	Key currentSourceKey;
	private Thread currentThread;
	final DecodeHelper decodeHelper = new DecodeHelper();
	final DeferredEncodeManager deferredEncodeManager = new DeferredEncodeManager();
	private final DiskCacheProvider diskCacheProvider;
	DiskCacheStrategy diskCacheStrategy;
	private final List exceptions = new ArrayList();
	private GlideContext glideContext;
	int height;
	private volatile boolean isCallbackNotified;
	private volatile boolean isCancelled;
	private EngineKey loadKey;
	private boolean onlyRetrieveFromCache;
	Options options;
	private int order;
	private final android.support.v4.util.Pools.Pool pool;
	private Priority priority;
	private final ReleaseManager releaseManager = new ReleaseManager();
	private RunReason runReason;
	Key signature;
	private Stage stage;
	private long startFetchTime;
	private final StateVerifier stateVerifier = StateVerifier.newInstance();
	int width;


/*
	static GlideContext access$000(DecodeJob decodejob)
	{
		return decodejob.glideContext;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field GlideContext glideContext>
	//    2    4:areturn         
	}

*/
}

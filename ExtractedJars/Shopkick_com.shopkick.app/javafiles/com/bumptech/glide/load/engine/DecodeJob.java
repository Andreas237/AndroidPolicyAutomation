// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.*;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeHelper, GlideException, SourceGenerator, DataCacheGenerator, 
//			ResourceCacheGenerator, DiskCacheStrategy, Initializable, LockedResource, 
//			DataFetcherGenerator, LoadPath, Resource, ResourceCacheKey, 
//			DataCacheKey, EngineKey, DataCacheWriter

class DecodeJob
	implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	static interface Callback
	{

		public abstract void onLoadFailed(GlideException glideexception);

		public abstract void onResourceReady(Resource resource, DataSource datasource);

		public abstract void reschedule(DecodeJob decodejob);
	}

	private final class DecodeCallback
		implements DecodePath.DecodeCallback
	{

		public Resource onResourceDecoded(Resource resource)
		{
			return DecodeJob.this.onResourceDecoded(dataSource, resource);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field DecodeJob this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field DataSource dataSource>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #30  <Method Resource DecodeJob.onResourceDecoded(DataSource, Resource)>
		//    6   12:areturn         
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

	private static class DeferredEncodeManager
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
			GlideTrace.beginSection("DecodeJob.encode");
		//    0    0:ldc1            #32  <String "DecodeJob.encode">
		//    1    2:invokestatic    #38  <Method void GlideTrace.beginSection(String)>
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
			GlideTrace.endSection();
		//   18   43:invokestatic    #63  <Method void GlideTrace.endSection()>
			return;
		//   19   46:return          
			diskcacheprovider;
		//   20   47:astore_1        
			toEncode.unlock();
		//   21   48:aload_0         
		//   22   49:getfield        #28  <Field LockedResource toEncode>
		//   23   52:invokevirtual   #60  <Method void LockedResource.unlock()>
			GlideTrace.endSection();
		//   24   55:invokestatic    #63  <Method void GlideTrace.endSection()>
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

	private static class ReleaseManager
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

	private static final class RunReason extends Enum
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

	private static final class Stage extends Enum
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
	//    1    1:invokespecial   #106 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #108 <Class DecodeHelper>
	//    4    8:dup             
	//    5    9:invokespecial   #109 <Method void DecodeHelper()>
	//    6   12:putfield        #111 <Field DecodeHelper decodeHelper>
	//    7   15:aload_0         
	//    8   16:new             #113 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #114 <Method void ArrayList()>
	//   11   23:putfield        #116 <Field List throwables>
	//   12   26:aload_0         
	//   13   27:invokestatic    #122 <Method StateVerifier StateVerifier.newInstance()>
	//   14   30:putfield        #124 <Field StateVerifier stateVerifier>
	//   15   33:aload_0         
	//   16   34:new             #23  <Class DecodeJob$DeferredEncodeManager>
	//   17   37:dup             
	//   18   38:invokespecial   #125 <Method void DecodeJob$DeferredEncodeManager()>
	//   19   41:putfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//   20   44:aload_0         
	//   21   45:new             #29  <Class DecodeJob$ReleaseManager>
	//   22   48:dup             
	//   23   49:invokespecial   #128 <Method void DecodeJob$ReleaseManager()>
	//   24   52:putfield        #130 <Field DecodeJob$ReleaseManager releaseManager>
		diskCacheProvider = diskcacheprovider;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #132 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
		pool = pool1;
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:putfield        #134 <Field android.support.v4.util.Pools$Pool pool>
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
	//    3    5:invokeinterface #146 <Method void DataFetcher.cleanup()>
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		}
		long l = LogTime.getLogTime();
	//    6   12:invokestatic    #152 <Method long LogTime.getLogTime()>
	//    7   15:lstore          4
		obj = ((Object) (decodeFromFetcher(obj, datasource)));
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #156 <Method Resource decodeFromFetcher(Object, DataSource)>
	//   12   23:astore_2        
		if(Log.isLoggable("DecodeJob", 2))
	//*  13   24:ldc1            #40  <String "DecodeJob">
	//*  14   26:iconst_2        
	//*  15   27:invokestatic    #162 <Method boolean Log.isLoggable(String, int)>
	//*  16   30:ifeq            64
		{
			datasource = ((DataSource) (new StringBuilder()));
	//   17   33:new             #164 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #165 <Method void StringBuilder()>
	//   20   40:astore_3        
			((StringBuilder) (datasource)).append("Decoded result ");
	//   21   41:aload_3         
	//   22   42:ldc1            #167 <String "Decoded result ">
	//   23   44:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (datasource)).append(obj);
	//   25   48:aload_3         
	//   26   49:aload_2         
	//   27   50:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   28   53:pop             
			logWithTimeAndKey(((StringBuilder) (datasource)).toString(), l);
	//   29   54:aload_0         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   32   59:lload           4
	//   33   61:invokespecial   #182 <Method void logWithTimeAndKey(String, long)>
		}
		datafetcher.cleanup();
	//   34   64:aload_1         
	//   35   65:invokeinterface #146 <Method void DataFetcher.cleanup()>
		return ((Resource) (obj));
	//   36   70:aload_2         
	//   37   71:areturn         
		obj;
	//   38   72:astore_2        
		datafetcher.cleanup();
	//   39   73:aload_1         
	//   40   74:invokeinterface #146 <Method void DataFetcher.cleanup()>
		throw obj;
	//   41   79:aload_2         
	//   42   80:athrow          
	}

	private Resource decodeFromFetcher(Object obj, DataSource datasource)
		throws GlideException
	{
		return runLoadPath(obj, datasource, decodeHelper.getLoadPath(obj.getClass()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #111 <Field DecodeHelper decodeHelper>
	//    5    7:aload_1         
	//    6    8:invokevirtual   #188 <Method Class Object.getClass()>
	//    7   11:invokevirtual   #192 <Method LoadPath DecodeHelper.getLoadPath(Class)>
	//    8   14:invokespecial   #196 <Method Resource runLoadPath(Object, DataSource, LoadPath)>
	//    9   17:areturn         
	}

	private void decodeFromRetrievedData()
	{
		Resource resource;
		if(Log.isLoggable("DecodeJob", 2))
	//*   0    0:ldc1            #40  <String "DecodeJob">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #162 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            81
		{
			long l = startFetchTime;
	//    4    9:aload_0         
	//    5   10:getfield        #200 <Field long startFetchTime>
	//    6   13:lstore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   14:new             #164 <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #165 <Method void StringBuilder()>
	//   10   21:astore_3        
			stringbuilder.append("data: ");
	//   11   22:aload_3         
	//   12   23:ldc1            #202 <String "data: ">
	//   13   25:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			stringbuilder.append(currentData);
	//   15   29:aload_3         
	//   16   30:aload_0         
	//   17   31:getfield        #204 <Field Object currentData>
	//   18   34:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   19   37:pop             
			stringbuilder.append(", cache key: ");
	//   20   38:aload_3         
	//   21   39:ldc1            #206 <String ", cache key: ">
	//   22   41:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(((Object) (currentSourceKey)));
	//   24   45:aload_3         
	//   25   46:aload_0         
	//   26   47:getfield        #208 <Field Key currentSourceKey>
	//   27   50:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   28   53:pop             
			stringbuilder.append(", fetcher: ");
	//   29   54:aload_3         
	//   30   55:ldc1            #210 <String ", fetcher: ">
	//   31   57:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			stringbuilder.append(((Object) (currentFetcher)));
	//   33   61:aload_3         
	//   34   62:aload_0         
	//   35   63:getfield        #212 <Field DataFetcher currentFetcher>
	//   36   66:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   37   69:pop             
			logWithTimeAndKey("Retrieved data", l, stringbuilder.toString());
	//   38   70:aload_0         
	//   39   71:ldc1            #214 <String "Retrieved data">
	//   40   73:lload_1         
	//   41   74:aload_3         
	//   42   75:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   43   78:invokespecial   #217 <Method void logWithTimeAndKey(String, long, String)>
		}
		resource = null;
	//   44   81:aconst_null     
	//   45   82:astore_3        
		Resource resource1 = decodeFromData(currentFetcher, currentData, currentDataSource);
	//   46   83:aload_0         
	//   47   84:aload_0         
	//   48   85:getfield        #212 <Field DataFetcher currentFetcher>
	//   49   88:aload_0         
	//   50   89:getfield        #204 <Field Object currentData>
	//   51   92:aload_0         
	//   52   93:getfield        #219 <Field DataSource currentDataSource>
	//   53   96:invokespecial   #221 <Method Resource decodeFromData(DataFetcher, Object, DataSource)>
	//   54   99:astore          4
		resource = resource1;
	//   55  101:aload           4
	//   56  103:astore_3        
		break MISSING_BLOCK_LABEL_134;
	//   57  104:goto            134
		GlideException glideexception;
		glideexception;
	//   58  107:astore          4
		glideexception.setLoggingDetails(currentAttemptingKey, currentDataSource);
	//   59  109:aload           4
	//   60  111:aload_0         
	//   61  112:getfield        #223 <Field Key currentAttemptingKey>
	//   62  115:aload_0         
	//   63  116:getfield        #219 <Field DataSource currentDataSource>
	//   64  119:invokevirtual   #227 <Method void GlideException.setLoggingDetails(Key, DataSource)>
		throwables.add(((Object) (glideexception)));
	//   65  122:aload_0         
	//   66  123:getfield        #116 <Field List throwables>
	//   67  126:aload           4
	//   68  128:invokeinterface #233 <Method boolean List.add(Object)>
	//   69  133:pop             
		if(resource != null)
	//*  70  134:aload_3         
	//*  71  135:ifnull          148
		{
			notifyEncodeAndRelease(resource, currentDataSource);
	//   72  138:aload_0         
	//   73  139:aload_3         
	//   74  140:aload_0         
	//   75  141:getfield        #219 <Field DataSource currentDataSource>
	//   76  144:invokespecial   #237 <Method void notifyEncodeAndRelease(Resource, DataSource)>
			return;
	//   77  147:return          
		} else
		{
			runGenerators();
	//   78  148:aload_0         
	//   79  149:invokespecial   #240 <Method void runGenerators()>
			return;
	//   80  152:return          
		}
	}

	private DataFetcherGenerator getNextGenerator()
	{
		static class _cls1
		{

			static final int $SwitchMap$com$bumptech$glide$load$EncodeStrategy[];
			static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[];
			static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[];

			static 
			{
				$SwitchMap$com$bumptech$glide$load$EncodeStrategy = new int[EncodeStrategy.values().length];
			//    0    0:invokestatic    #20  <Method EncodeStrategy[] EncodeStrategy.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
				try
				{
					$SwitchMap$com$bumptech$glide$load$EncodeStrategy[EncodeStrategy.SOURCE.ordinal()] = 1;
			//    4    9:getstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
			//    5   12:getstatic       #26  <Field EncodeStrategy EncodeStrategy.SOURCE>
			//    6   15:invokevirtual   #30  <Method int EncodeStrategy.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
			//*  10   23:getstatic       #33  <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
			//*  11   26:invokevirtual   #30  <Method int EncodeStrategy.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:invokestatic    #38  <Method DecodeJob$Stage[] DecodeJob$Stage.values()>
			//*  15   34:arraylength     
			//*  16   35:newarray        int[]
			//*  17   37:putstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  18   40:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  19   43:getstatic       #44  <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
			//*  20   46:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
			//*  21   49:iconst_1        
			//*  22   50:iastore         
			//*  23   51:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  24   54:getstatic       #48  <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
			//*  25   57:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
			//*  26   60:iconst_2        
			//*  27   61:iastore         
			//*  28   62:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  29   65:getstatic       #50  <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
			//*  30   68:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
			//*  31   71:iconst_3        
			//*  32   72:iastore         
			//*  33   73:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  34   76:getstatic       #53  <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
			//*  35   79:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
			//*  36   82:iconst_4        
			//*  37   83:iastore         
			//*  38   84:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
			//*  39   87:getstatic       #56  <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
			//*  40   90:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
			//*  41   93:iconst_5        
			//*  42   94:iastore         
			//*  43   95:invokestatic    #61  <Method DecodeJob$RunReason[] DecodeJob$RunReason.values()>
			//*  44   98:arraylength     
			//*  45   99:newarray        int[]
			//*  46  101:putstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//*  47  104:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//*  48  107:getstatic       #66  <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
			//*  49  110:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
			//*  50  113:iconst_1        
			//*  51  114:iastore         
			//*  52  115:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//*  53  118:getstatic       #70  <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
			//*  54  121:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
			//*  55  124:iconst_2        
			//*  56  125:iastore         
			//*  57  126:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
			//*  58  129:getstatic       #73  <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
			//*  59  132:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
			//*  60  135:iconst_3        
			//*  61  136:iastore         
			//*  62  137:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   63  138:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$EncodeStrategy[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
				}
			//*  64  139:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   65  142:astore_0        
				$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = new int[Stage.values().length];
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.RESOURCE_CACHE.ordinal()] = 1;
				}
			//*  66  143:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   67  146:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.DATA_CACHE.ordinal()] = 2;
				}
			//*  68  147:goto            51
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   69  150:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.SOURCE.ordinal()] = 3;
				}
			//*  70  151:goto            62
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   71  154:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.FINISHED.ordinal()] = 4;
				}
			//*  72  155:goto            73
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   73  158:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[Stage.INITIALIZE.ordinal()] = 5;
				}
			//*  74  159:goto            84
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   75  162:astore_0        
				$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = new int[RunReason.values().length];
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.INITIALIZE.ordinal()] = 1;
				}
			//*  76  163:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   77  166:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
				}
			//*  78  167:goto            115
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   79  170:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[RunReason.DECODE_DATA.ordinal()] = 3;
				}
			//*  80  171:goto            126
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   81  174:astore_0        
			//*  82  175:return          
			}
		}

		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.Stage[stage.ordinal()])
	//*   0    0:getstatic       #246 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*   1    3:aload_0         
	//*   2    4:getfield        #248 <Field DecodeJob$Stage stage>
	//*   3    7:invokevirtual   #252 <Method int DecodeJob$Stage.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 4: default 40
	//	               1 104
	//	               2 91
	//	               3 78
	//	               4 76
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    6   40:new             #164 <Class StringBuilder>
	//    7   43:dup             
	//    8   44:invokespecial   #165 <Method void StringBuilder()>
	//    9   47:astore_1        
			stringbuilder.append("Unrecognized stage: ");
	//   10   48:aload_1         
	//   11   49:ldc1            #254 <String "Unrecognized stage: ">
	//   12   51:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   13   54:pop             
			stringbuilder.append(((Object) (stage)));
	//   14   55:aload_1         
	//   15   56:aload_0         
	//   16   57:getfield        #248 <Field DecodeJob$Stage stage>
	//   17   60:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   18   63:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   19   64:new             #256 <Class IllegalStateException>
	//   20   67:dup             
	//   21   68:aload_1         
	//   22   69:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   23   72:invokespecial   #259 <Method void IllegalStateException(String)>
	//   24   75:athrow          

		case 4: // '\004'
			return null;
	//   25   76:aconst_null     
	//   26   77:areturn         

		case 3: // '\003'
			return ((DataFetcherGenerator) (new SourceGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//   27   78:new             #261 <Class SourceGenerator>
	//   28   81:dup             
	//   29   82:aload_0         
	//   30   83:getfield        #111 <Field DecodeHelper decodeHelper>
	//   31   86:aload_0         
	//   32   87:invokespecial   #264 <Method void SourceGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   33   90:areturn         

		case 2: // '\002'
			return ((DataFetcherGenerator) (new DataCacheGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//   34   91:new             #266 <Class DataCacheGenerator>
	//   35   94:dup             
	//   36   95:aload_0         
	//   37   96:getfield        #111 <Field DecodeHelper decodeHelper>
	//   38   99:aload_0         
	//   39  100:invokespecial   #267 <Method void DataCacheGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   40  103:areturn         

		case 1: // '\001'
			return ((DataFetcherGenerator) (new ResourceCacheGenerator(decodeHelper, ((DataFetcherGenerator.FetcherReadyCallback) (this)))));
	//   41  104:new             #269 <Class ResourceCacheGenerator>
	//   42  107:dup             
	//   43  108:aload_0         
	//   44  109:getfield        #111 <Field DecodeHelper decodeHelper>
	//   45  112:aload_0         
	//   46  113:invokespecial   #270 <Method void ResourceCacheGenerator(DecodeHelper, DataFetcherGenerator$FetcherReadyCallback)>
	//   47  116:areturn         
		}
	}

	private Stage getNextStage(Stage stage1)
	{
		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.Stage[stage1.ordinal()])
	//*   0    0:getstatic       #246 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #252 <Method int DecodeJob$Stage.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 118
	//	               2 103
	//	               3 99
	//	               4 99
	//	               5 77
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    5   44:new             #164 <Class StringBuilder>
	//    6   47:dup             
	//    7   48:invokespecial   #165 <Method void StringBuilder()>
	//    8   51:astore_2        
			stringbuilder.append("Unrecognized stage: ");
	//    9   52:aload_2         
	//   10   53:ldc1            #254 <String "Unrecognized stage: ">
	//   11   55:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   12   58:pop             
			stringbuilder.append(((Object) (stage1)));
	//   13   59:aload_2         
	//   14   60:aload_1         
	//   15   61:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   16   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   17   65:new             #274 <Class IllegalArgumentException>
	//   18   68:dup             
	//   19   69:aload_2         
	//   20   70:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   21   73:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//   22   76:athrow          

		case 5: // '\005'
			if(diskCacheStrategy.decodeCachedResource())
	//*  23   77:aload_0         
	//*  24   78:getfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
	//*  25   81:invokevirtual   #283 <Method boolean DiskCacheStrategy.decodeCachedResource()>
	//*  26   84:ifeq            91
				return Stage.RESOURCE_CACHE;
	//   27   87:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//   28   90:areturn         
			else
				return getNextStage(Stage.RESOURCE_CACHE);
	//   29   91:aload_0         
	//   30   92:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//   31   95:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   32   98:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return Stage.FINISHED;
	//   33   99:getstatic       #291 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//   34  102:areturn         

		case 2: // '\002'
			if(onlyRetrieveFromCache)
	//*  35  103:aload_0         
	//*  36  104:getfield        #293 <Field boolean onlyRetrieveFromCache>
	//*  37  107:ifeq            114
				return Stage.FINISHED;
	//   38  110:getstatic       #291 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//   39  113:areturn         
			else
				return Stage.SOURCE;
	//   40  114:getstatic       #296 <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//   41  117:areturn         

		case 1: // '\001'
			break;
		}
		if(diskCacheStrategy.decodeCachedData())
	//*  42  118:aload_0         
	//*  43  119:getfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
	//*  44  122:invokevirtual   #299 <Method boolean DiskCacheStrategy.decodeCachedData()>
	//*  45  125:ifeq            132
			return Stage.DATA_CACHE;
	//   46  128:getstatic       #302 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//   47  131:areturn         
		else
			return getNextStage(Stage.DATA_CACHE);
	//   48  132:aload_0         
	//   49  133:getstatic       #302 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//   50  136:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   51  139:areturn         
	}

	private Options getOptionsWithHardwareConfig(DataSource datasource)
	{
		Options options1 = options;
	//    0    0:aload_0         
	//    1    1:getfield        #307 <Field Options options>
	//    2    4:astore_3        
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   3    5:getstatic       #312 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          26
	//*   5   10:icmpge          15
			return options1;
	//    6   13:aload_3         
	//    7   14:areturn         
		boolean flag;
		if(datasource != DataSource.RESOURCE_DISK_CACHE && !decodeHelper.isScaleOnlyOrNoTransform())
	//*   8   15:aload_1         
	//*   9   16:getstatic       #317 <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//*  10   19:if_acmpeq       40
	//*  11   22:aload_0         
	//*  12   23:getfield        #111 <Field DecodeHelper decodeHelper>
	//*  13   26:invokevirtual   #320 <Method boolean DecodeHelper.isScaleOnlyOrNoTransform()>
	//*  14   29:ifeq            35
	//*  15   32:goto            40
			flag = false;
	//   16   35:iconst_0        
	//   17   36:istore_2        
		else
	//*  18   37:goto            42
			flag = true;
	//   19   40:iconst_1        
	//   20   41:istore_2        
		datasource = ((DataSource) ((Boolean)options1.get(Downsampler.ALLOW_HARDWARE_CONFIG)));
	//   21   42:aload_3         
	//   22   43:getstatic       #326 <Field com.bumptech.glide.load.Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//   23   46:invokevirtual   #332 <Method Object Options.get(com.bumptech.glide.load.Option)>
	//   24   49:checkcast       #334 <Class Boolean>
	//   25   52:astore_1        
		if(datasource != null && (!((Boolean) (datasource)).booleanValue() || flag))
	//*  26   53:aload_1         
	//*  27   54:ifnull          70
	//*  28   57:aload_1         
	//*  29   58:invokevirtual   #337 <Method boolean Boolean.booleanValue()>
	//*  30   61:ifeq            68
	//*  31   64:iload_2         
	//*  32   65:ifeq            70
		{
			return options1;
	//   33   68:aload_3         
	//   34   69:areturn         
		} else
		{
			datasource = ((DataSource) (new Options()));
	//   35   70:new             #328 <Class Options>
	//   36   73:dup             
	//   37   74:invokespecial   #338 <Method void Options()>
	//   38   77:astore_1        
			((Options) (datasource)).putAll(options);
	//   39   78:aload_1         
	//   40   79:aload_0         
	//   41   80:getfield        #307 <Field Options options>
	//   42   83:invokevirtual   #342 <Method void Options.putAll(Options)>
			((Options) (datasource)).set(Downsampler.ALLOW_HARDWARE_CONFIG, ((Object) (Boolean.valueOf(flag))));
	//   43   86:aload_1         
	//   44   87:getstatic       #326 <Field com.bumptech.glide.load.Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//   45   90:iload_2         
	//   46   91:invokestatic    #346 <Method Boolean Boolean.valueOf(boolean)>
	//   47   94:invokevirtual   #350 <Method Options Options.set(com.bumptech.glide.load.Option, Object)>
	//   48   97:pop             
			return ((Options) (datasource));
	//   49   98:aload_1         
	//   50   99:areturn         
		}
	}

	private int getPriority()
	{
		return priority.ordinal();
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field Priority priority>
	//    2    4:invokevirtual   #357 <Method int Priority.ordinal()>
	//    3    7:ireturn         
	}

	private void logWithTimeAndKey(String s, long l)
	{
		logWithTimeAndKey(s, l, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #217 <Method void logWithTimeAndKey(String, long, String)>
	//    5    7:return          
	}

	private void logWithTimeAndKey(String s, long l, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #164 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append(s);
	//    4    9:aload           5
	//    5   11:aload_1         
	//    6   12:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" in ");
	//    8   16:aload           5
	//    9   18:ldc2            #359 <String " in ">
	//   10   21:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(LogTime.getElapsedMillis(l));
	//   12   25:aload           5
	//   13   27:lload_2         
	//   14   28:invokestatic    #363 <Method double LogTime.getElapsedMillis(long)>
	//   15   31:invokevirtual   #366 <Method StringBuilder StringBuilder.append(double)>
	//   16   34:pop             
		stringbuilder.append(", load key: ");
	//   17   35:aload           5
	//   18   37:ldc2            #368 <String ", load key: ">
	//   19   40:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		stringbuilder.append(((Object) (loadKey)));
	//   21   44:aload           5
	//   22   46:aload_0         
	//   23   47:getfield        #370 <Field EngineKey loadKey>
	//   24   50:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   25   53:pop             
		if(s1 != null)
	//*  26   54:aload           4
	//*  27   56:ifnull          90
		{
			s = ((String) (new StringBuilder()));
	//   28   59:new             #164 <Class StringBuilder>
	//   29   62:dup             
	//   30   63:invokespecial   #165 <Method void StringBuilder()>
	//   31   66:astore_1        
			((StringBuilder) (s)).append(", ");
	//   32   67:aload_1         
	//   33   68:ldc2            #372 <String ", ">
	//   34   71:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			((StringBuilder) (s)).append(s1);
	//   36   75:aload_1         
	//   37   76:aload           4
	//   38   78:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			s = ((StringBuilder) (s)).toString();
	//   40   82:aload_1         
	//   41   83:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   42   86:astore_1        
		} else
	//*  43   87:goto            94
		{
			s = "";
	//   44   90:ldc2            #374 <String "">
	//   45   93:astore_1        
		}
		stringbuilder.append(s);
	//   46   94:aload           5
	//   47   96:aload_1         
	//   48   97:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		stringbuilder.append(", thread: ");
	//   50  101:aload           5
	//   51  103:ldc2            #376 <String ", thread: ">
	//   52  106:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   53  109:pop             
		stringbuilder.append(Thread.currentThread().getName());
	//   54  110:aload           5
	//   55  112:invokestatic    #381 <Method Thread Thread.currentThread()>
	//   56  115:invokevirtual   #384 <Method String Thread.getName()>
	//   57  118:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   58  121:pop             
		Log.v("DecodeJob", stringbuilder.toString());
	//   59  122:ldc1            #40  <String "DecodeJob">
	//   60  124:aload           5
	//   61  126:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   62  129:invokestatic    #388 <Method int Log.v(String, String)>
	//   63  132:pop             
	//   64  133:return          
	}

	private void notifyComplete(Resource resource, DataSource datasource)
	{
		setNotifiedOrThrow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #392 <Method void setNotifiedOrThrow()>
		callback.onResourceReady(resource, datasource);
	//    2    4:aload_0         
	//    3    5:getfield        #394 <Field DecodeJob$Callback callback>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #397 <Method void DecodeJob$Callback.onResourceReady(Resource, DataSource)>
	//    7   15:return          
	}

	private void notifyEncodeAndRelease(Resource resource, DataSource datasource)
	{
		Object obj;
		if(resource instanceof Initializable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #400 <Class Initializable>
	//*   2    4:ifeq            16
			((Initializable)resource).initialize();
	//    3    7:aload_1         
	//    4    8:checkcast       #400 <Class Initializable>
	//    5   11:invokeinterface #403 <Method void Initializable.initialize()>
		obj = null;
	//    6   16:aconst_null     
	//    7   17:astore_3        
		Object obj1 = ((Object) (resource));
	//    8   18:aload_1         
	//    9   19:astore          4
		if(deferredEncodeManager.hasResourceToEncode())
	//*  10   21:aload_0         
	//*  11   22:getfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//*  12   25:invokevirtual   #406 <Method boolean DecodeJob$DeferredEncodeManager.hasResourceToEncode()>
	//*  13   28:ifeq            40
		{
			obj1 = ((Object) (LockedResource.obtain(resource)));
	//   14   31:aload_1         
	//   15   32:invokestatic    #412 <Method LockedResource LockedResource.obtain(Resource)>
	//   16   35:astore          4
			obj = obj1;
	//   17   37:aload           4
	//   18   39:astore_3        
		}
		notifyComplete(((Resource) (obj1)), datasource);
	//   19   40:aload_0         
	//   20   41:aload           4
	//   21   43:aload_2         
	//   22   44:invokespecial   #414 <Method void notifyComplete(Resource, DataSource)>
		stage = Stage.ENCODE;
	//   23   47:aload_0         
	//   24   48:getstatic       #417 <Field DecodeJob$Stage DecodeJob$Stage.ENCODE>
	//   25   51:putfield        #248 <Field DecodeJob$Stage stage>
		if(deferredEncodeManager.hasResourceToEncode())
	//*  26   54:aload_0         
	//*  27   55:getfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//*  28   58:invokevirtual   #406 <Method boolean DecodeJob$DeferredEncodeManager.hasResourceToEncode()>
	//*  29   61:ifeq            79
			deferredEncodeManager.encode(diskCacheProvider, options);
	//   30   64:aload_0         
	//   31   65:getfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//   32   68:aload_0         
	//   33   69:getfield        #132 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//   34   72:aload_0         
	//   35   73:getfield        #307 <Field Options options>
	//   36   76:invokevirtual   #421 <Method void DecodeJob$DeferredEncodeManager.encode(DecodeJob$DiskCacheProvider, Options)>
		if(obj != null)
	//*  37   79:aload_3         
	//*  38   80:ifnull          87
			((LockedResource) (obj)).unlock();
	//   39   83:aload_3         
	//   40   84:invokevirtual   #424 <Method void LockedResource.unlock()>
		onEncodeComplete();
	//   41   87:aload_0         
	//   42   88:invokespecial   #427 <Method void onEncodeComplete()>
		return;
	//   43   91:return          
		resource;
	//   44   92:astore_1        
		if(obj != null)
	//*  45   93:aload_3         
	//*  46   94:ifnull          101
			((LockedResource) (obj)).unlock();
	//   47   97:aload_3         
	//   48   98:invokevirtual   #424 <Method void LockedResource.unlock()>
		throw resource;
	//   49  101:aload_1         
	//   50  102:athrow          
	}

	private void notifyFailed()
	{
		setNotifiedOrThrow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #392 <Method void setNotifiedOrThrow()>
		GlideException glideexception = new GlideException("Failed to load resource", ((List) (new ArrayList(((java.util.Collection) (throwables))))));
	//    2    4:new             #141 <Class GlideException>
	//    3    7:dup             
	//    4    8:ldc2            #430 <String "Failed to load resource">
	//    5   11:new             #113 <Class ArrayList>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #116 <Field List throwables>
	//    9   19:invokespecial   #433 <Method void ArrayList(java.util.Collection)>
	//   10   22:invokespecial   #436 <Method void GlideException(String, List)>
	//   11   25:astore_1        
		callback.onLoadFailed(glideexception);
	//   12   26:aload_0         
	//   13   27:getfield        #394 <Field DecodeJob$Callback callback>
	//   14   30:aload_1         
	//   15   31:invokeinterface #440 <Method void DecodeJob$Callback.onLoadFailed(GlideException)>
		onLoadFailed();
	//   16   36:aload_0         
	//   17   37:invokespecial   #442 <Method void onLoadFailed()>
	//   18   40:return          
	}

	private void onEncodeComplete()
	{
		if(releaseManager.onEncodeComplete())
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:invokevirtual   #444 <Method boolean DecodeJob$ReleaseManager.onEncodeComplete()>
	//*   3    7:ifeq            14
			releaseInternal();
	//    4   10:aload_0         
	//    5   11:invokespecial   #447 <Method void releaseInternal()>
	//    6   14:return          
	}

	private void onLoadFailed()
	{
		if(releaseManager.onFailed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:invokevirtual   #450 <Method boolean DecodeJob$ReleaseManager.onFailed()>
	//*   3    7:ifeq            14
			releaseInternal();
	//    4   10:aload_0         
	//    5   11:invokespecial   #447 <Method void releaseInternal()>
	//    6   14:return          
	}

	private void releaseInternal()
	{
		releaseManager.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field DecodeJob$ReleaseManager releaseManager>
	//    2    4:invokevirtual   #453 <Method void DecodeJob$ReleaseManager.reset()>
		deferredEncodeManager.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//    5   11:invokevirtual   #456 <Method void DecodeJob$DeferredEncodeManager.clear()>
		decodeHelper.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field DecodeHelper decodeHelper>
	//    8   18:invokevirtual   #457 <Method void DecodeHelper.clear()>
		isCallbackNotified = false;
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:putfield        #459 <Field boolean isCallbackNotified>
		glideContext = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #461 <Field GlideContext glideContext>
		signature = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #463 <Field Key signature>
		options = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #307 <Field Options options>
		priority = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #354 <Field Priority priority>
		loadKey = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #370 <Field EngineKey loadKey>
		callback = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #394 <Field DecodeJob$Callback callback>
		stage = null;
	//   30   56:aload_0         
	//   31   57:aconst_null     
	//   32   58:putfield        #248 <Field DecodeJob$Stage stage>
		currentGenerator = null;
	//   33   61:aload_0         
	//   34   62:aconst_null     
	//   35   63:putfield        #465 <Field DataFetcherGenerator currentGenerator>
		currentThread = null;
	//   36   66:aload_0         
	//   37   67:aconst_null     
	//   38   68:putfield        #467 <Field Thread currentThread>
		currentSourceKey = null;
	//   39   71:aload_0         
	//   40   72:aconst_null     
	//   41   73:putfield        #208 <Field Key currentSourceKey>
		currentData = null;
	//   42   76:aload_0         
	//   43   77:aconst_null     
	//   44   78:putfield        #204 <Field Object currentData>
		currentDataSource = null;
	//   45   81:aload_0         
	//   46   82:aconst_null     
	//   47   83:putfield        #219 <Field DataSource currentDataSource>
		currentFetcher = null;
	//   48   86:aload_0         
	//   49   87:aconst_null     
	//   50   88:putfield        #212 <Field DataFetcher currentFetcher>
		startFetchTime = 0L;
	//   51   91:aload_0         
	//   52   92:lconst_0        
	//   53   93:putfield        #200 <Field long startFetchTime>
		isCancelled = false;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #469 <Field boolean isCancelled>
		model = null;
	//   57  101:aload_0         
	//   58  102:aconst_null     
	//   59  103:putfield        #471 <Field Object model>
		throwables.clear();
	//   60  106:aload_0         
	//   61  107:getfield        #116 <Field List throwables>
	//   62  110:invokeinterface #472 <Method void List.clear()>
		pool.release(((Object) (this)));
	//   63  115:aload_0         
	//   64  116:getfield        #134 <Field android.support.v4.util.Pools$Pool pool>
	//   65  119:aload_0         
	//   66  120:invokeinterface #477 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   67  125:pop             
	//   68  126:return          
	}

	private void runGenerators()
	{
		currentThread = Thread.currentThread();
	//    0    0:aload_0         
	//    1    1:invokestatic    #381 <Method Thread Thread.currentThread()>
	//    2    4:putfield        #467 <Field Thread currentThread>
		startFetchTime = LogTime.getLogTime();
	//    3    7:aload_0         
	//    4    8:invokestatic    #152 <Method long LogTime.getLogTime()>
	//    5   11:putfield        #200 <Field long startFetchTime>
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
	//   11   19:getfield        #469 <Field boolean isCancelled>
	//   12   22:ifne            85
			flag1 = flag;
	//   13   25:iload_1         
	//   14   26:istore_2        
			if(currentGenerator == null)
				break;
	//   15   27:aload_0         
	//   16   28:getfield        #465 <Field DataFetcherGenerator currentGenerator>
	//   17   31:ifnull          85
			flag = currentGenerator.startNext();
	//   18   34:aload_0         
	//   19   35:getfield        #465 <Field DataFetcherGenerator currentGenerator>
	//   20   38:invokeinterface #482 <Method boolean DataFetcherGenerator.startNext()>
	//   21   43:istore_1        
			flag1 = flag;
	//   22   44:iload_1         
	//   23   45:istore_2        
			if(flag)
				break;
	//   24   46:iload_1         
	//   25   47:ifne            85
			stage = getNextStage(stage);
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #248 <Field DecodeJob$Stage stage>
	//   30   56:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   31   59:putfield        #248 <Field DecodeJob$Stage stage>
			currentGenerator = getNextGenerator();
	//   32   62:aload_0         
	//   33   63:aload_0         
	//   34   64:invokespecial   #484 <Method DataFetcherGenerator getNextGenerator()>
	//   35   67:putfield        #465 <Field DataFetcherGenerator currentGenerator>
			if(stage == Stage.SOURCE)
	//*  36   70:aload_0         
	//*  37   71:getfield        #248 <Field DecodeJob$Stage stage>
	//*  38   74:getstatic       #296 <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//*  39   77:if_acmpne       16
			{
				reschedule();
	//   40   80:aload_0         
	//   41   81:invokevirtual   #487 <Method void reschedule()>
				return;
	//   42   84:return          
			}
		} while(true);
		if((stage == Stage.FINISHED || isCancelled) && !flag1)
	//*  43   85:aload_0         
	//*  44   86:getfield        #248 <Field DecodeJob$Stage stage>
	//*  45   89:getstatic       #291 <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//*  46   92:if_acmpeq       102
	//*  47   95:aload_0         
	//*  48   96:getfield        #469 <Field boolean isCancelled>
	//*  49   99:ifeq            110
	//*  50  102:iload_2         
	//*  51  103:ifne            110
			notifyFailed();
	//   52  106:aload_0         
	//   53  107:invokespecial   #489 <Method void notifyFailed()>
	//   54  110:return          
	}

	private Resource runLoadPath(Object obj, DataSource datasource, LoadPath loadpath)
		throws GlideException
	{
		Options options1;
		options1 = getOptionsWithHardwareConfig(datasource);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #491 <Method Options getOptionsWithHardwareConfig(DataSource)>
	//    3    5:astore          4
		obj = ((Object) (glideContext.getRegistry().getRewinder(obj)));
	//    4    7:aload_0         
	//    5    8:getfield        #461 <Field GlideContext glideContext>
	//    6   11:invokevirtual   #497 <Method Registry GlideContext.getRegistry()>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #503 <Method DataRewinder Registry.getRewinder(Object)>
	//    9   18:astore_1        
		datasource = ((DataSource) (loadpath.load(((DataRewinder) (obj)), options1, width, height, ((DecodePath.DecodeCallback) (new DecodeCallback(datasource))))));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:aload           4
	//   13   23:aload_0         
	//   14   24:getfield        #505 <Field int width>
	//   15   27:aload_0         
	//   16   28:getfield        #507 <Field int height>
	//   17   31:new             #20  <Class DecodeJob$DecodeCallback>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokespecial   #510 <Method void DecodeJob$DecodeCallback(DecodeJob, DataSource)>
	//   22   40:invokevirtual   #516 <Method Resource LoadPath.load(DataRewinder, Options, int, int, DecodePath$DecodeCallback)>
	//   23   43:astore_2        
		((DataRewinder) (obj)).cleanup();
	//   24   44:aload_1         
	//   25   45:invokeinterface #519 <Method void DataRewinder.cleanup()>
		return ((Resource) (datasource));
	//   26   50:aload_2         
	//   27   51:areturn         
		datasource;
	//   28   52:astore_2        
		((DataRewinder) (obj)).cleanup();
	//   29   53:aload_1         
	//   30   54:invokeinterface #519 <Method void DataRewinder.cleanup()>
		throw datasource;
	//   31   59:aload_2         
	//   32   60:athrow          
	}

	private void runWrapped()
	{
		switch(_cls1..SwitchMap.com.bumptech.glide.load.engine.DecodeJob.RunReason[runReason.ordinal()])
	//*   0    0:getstatic       #524 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*   1    3:aload_0         
	//*   2    4:getfield        #526 <Field DecodeJob$RunReason runReason>
	//*   3    7:invokevirtual   #527 <Method int DecodeJob$RunReason.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 83
	//	               2 78
	//	               3 73
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    6   36:new             #164 <Class StringBuilder>
	//    7   39:dup             
	//    8   40:invokespecial   #165 <Method void StringBuilder()>
	//    9   43:astore_1        
			stringbuilder.append("Unrecognized run reason: ");
	//   10   44:aload_1         
	//   11   45:ldc2            #529 <String "Unrecognized run reason: ">
	//   12   48:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   13   51:pop             
			stringbuilder.append(((Object) (runReason)));
	//   14   52:aload_1         
	//   15   53:aload_0         
	//   16   54:getfield        #526 <Field DecodeJob$RunReason runReason>
	//   17   57:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   18   60:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   19   61:new             #256 <Class IllegalStateException>
	//   20   64:dup             
	//   21   65:aload_1         
	//   22   66:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   23   69:invokespecial   #259 <Method void IllegalStateException(String)>
	//   24   72:athrow          

		case 3: // '\003'
			decodeFromRetrievedData();
	//   25   73:aload_0         
	//   26   74:invokespecial   #531 <Method void decodeFromRetrievedData()>
			return;
	//   27   77:return          

		case 2: // '\002'
			runGenerators();
	//   28   78:aload_0         
	//   29   79:invokespecial   #240 <Method void runGenerators()>
			return;
	//   30   82:return          

		case 1: // '\001'
			stage = getNextStage(Stage.INITIALIZE);
	//   31   83:aload_0         
	//   32   84:aload_0         
	//   33   85:getstatic       #534 <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//   34   88:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//   35   91:putfield        #248 <Field DecodeJob$Stage stage>
			currentGenerator = getNextGenerator();
	//   36   94:aload_0         
	//   37   95:aload_0         
	//   38   96:invokespecial   #484 <Method DataFetcherGenerator getNextGenerator()>
	//   39   99:putfield        #465 <Field DataFetcherGenerator currentGenerator>
			runGenerators();
	//   40  102:aload_0         
	//   41  103:invokespecial   #240 <Method void runGenerators()>
			return;
	//   42  106:return          
		}
	}

	private void setNotifiedOrThrow()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #537 <Method void StateVerifier.throwIfRecycled()>
		if(!isCallbackNotified)
	//*   3    7:aload_0         
	//*   4    8:getfield        #459 <Field boolean isCallbackNotified>
	//*   5   11:ifne            20
		{
			isCallbackNotified = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #459 <Field boolean isCallbackNotified>
			return;
	//    9   19:return          
		} else
		{
			throw new IllegalStateException("Already notified");
	//   10   20:new             #256 <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc2            #539 <String "Already notified">
	//   13   27:invokespecial   #259 <Method void IllegalStateException(String)>
	//   14   30:athrow          
		}
	}

	public void cancel()
	{
		isCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #469 <Field boolean isCancelled>
		DataFetcherGenerator datafetchergenerator = currentGenerator;
	//    3    5:aload_0         
	//    4    6:getfield        #465 <Field DataFetcherGenerator currentGenerator>
	//    5    9:astore_1        
		if(datafetchergenerator != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			datafetchergenerator.cancel();
	//    8   14:aload_1         
	//    9   15:invokeinterface #542 <Method void DataFetcherGenerator.cancel()>
	//   10   20:return          
	}

	public int compareTo(DecodeJob decodejob)
	{
		int j = getPriority() - decodejob.getPriority();
	//    0    0:aload_0         
	//    1    1:invokespecial   #546 <Method int getPriority()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #546 <Method int getPriority()>
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
	//   11   17:getfield        #548 <Field int order>
	//   12   20:aload_1         
	//   13   21:getfield        #548 <Field int order>
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
	//    3    5:invokevirtual   #553 <Method int compareTo(DecodeJob)>
	//    4    8:ireturn         
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	DecodeJob init(GlideContext glidecontext, Object obj, EngineKey enginekey, Key key, int i, int j, Class class1, 
			Class class2, Priority priority1, DiskCacheStrategy diskcachestrategy, Map map, boolean flag, boolean flag1, boolean flag2, 
			Options options1, Callback callback1, int k)
	{
		decodeHelper.init(glidecontext, obj, key, i, j, diskcachestrategy, class1, class2, priority1, options1, map, flag, flag1, diskCacheProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DecodeHelper decodeHelper>
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
	//   16   29:getfield        #132 <Field DecodeJob$DiskCacheProvider diskCacheProvider>
	//   17   32:invokevirtual   #559 <Method void DecodeHelper.init(GlideContext, Object, Key, int, int, DiskCacheStrategy, Class, Class, Priority, Options, Map, boolean, boolean, DecodeJob$DiskCacheProvider)>
		glideContext = glidecontext;
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:putfield        #461 <Field GlideContext glideContext>
		signature = key;
	//   21   40:aload_0         
	//   22   41:aload           4
	//   23   43:putfield        #463 <Field Key signature>
		priority = priority1;
	//   24   46:aload_0         
	//   25   47:aload           9
	//   26   49:putfield        #354 <Field Priority priority>
		loadKey = enginekey;
	//   27   52:aload_0         
	//   28   53:aload_3         
	//   29   54:putfield        #370 <Field EngineKey loadKey>
		width = i;
	//   30   57:aload_0         
	//   31   58:iload           5
	//   32   60:putfield        #505 <Field int width>
		height = j;
	//   33   63:aload_0         
	//   34   64:iload           6
	//   35   66:putfield        #507 <Field int height>
		diskCacheStrategy = diskcachestrategy;
	//   36   69:aload_0         
	//   37   70:aload           10
	//   38   72:putfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
		onlyRetrieveFromCache = flag2;
	//   39   75:aload_0         
	//   40   76:iload           14
	//   41   78:putfield        #293 <Field boolean onlyRetrieveFromCache>
		options = options1;
	//   42   81:aload_0         
	//   43   82:aload           15
	//   44   84:putfield        #307 <Field Options options>
		callback = callback1;
	//   45   87:aload_0         
	//   46   88:aload           16
	//   47   90:putfield        #394 <Field DecodeJob$Callback callback>
		order = k;
	//   48   93:aload_0         
	//   49   94:iload           17
	//   50   96:putfield        #548 <Field int order>
		runReason = RunReason.INITIALIZE;
	//   51   99:aload_0         
	//   52  100:getstatic       #561 <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
	//   53  103:putfield        #526 <Field DecodeJob$RunReason runReason>
		model = obj;
	//   54  106:aload_0         
	//   55  107:aload_2         
	//   56  108:putfield        #471 <Field Object model>
		return this;
	//   57  111:aload_0         
	//   58  112:areturn         
	}

	public void onDataFetcherFailed(Key key, Exception exception, DataFetcher datafetcher, DataSource datasource)
	{
		datafetcher.cleanup();
	//    0    0:aload_3         
	//    1    1:invokeinterface #146 <Method void DataFetcher.cleanup()>
		exception = ((Exception) (new GlideException("Fetching data failed", ((Throwable) (exception)))));
	//    2    6:new             #141 <Class GlideException>
	//    3    9:dup             
	//    4   10:ldc2            #566 <String "Fetching data failed">
	//    5   13:aload_2         
	//    6   14:invokespecial   #569 <Method void GlideException(String, Throwable)>
	//    7   17:astore_2        
		((GlideException) (exception)).setLoggingDetails(key, datasource, datafetcher.getDataClass());
	//    8   18:aload_2         
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:aload_3         
	//   12   23:invokeinterface #572 <Method Class DataFetcher.getDataClass()>
	//   13   28:invokevirtual   #575 <Method void GlideException.setLoggingDetails(Key, DataSource, Class)>
		throwables.add(((Object) (exception)));
	//   14   31:aload_0         
	//   15   32:getfield        #116 <Field List throwables>
	//   16   35:aload_2         
	//   17   36:invokeinterface #233 <Method boolean List.add(Object)>
	//   18   41:pop             
		if(Thread.currentThread() != currentThread)
	//*  19   42:invokestatic    #381 <Method Thread Thread.currentThread()>
	//*  20   45:aload_0         
	//*  21   46:getfield        #467 <Field Thread currentThread>
	//*  22   49:if_acmpeq       70
		{
			runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
	//   23   52:aload_0         
	//   24   53:getstatic       #578 <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//   25   56:putfield        #526 <Field DecodeJob$RunReason runReason>
			callback.reschedule(this);
	//   26   59:aload_0         
	//   27   60:getfield        #394 <Field DecodeJob$Callback callback>
	//   28   63:aload_0         
	//   29   64:invokeinterface #581 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
			return;
	//   30   69:return          
		} else
		{
			runGenerators();
	//   31   70:aload_0         
	//   32   71:invokespecial   #240 <Method void runGenerators()>
			return;
	//   33   74:return          
		}
	}

	public void onDataFetcherReady(Key key, Object obj, DataFetcher datafetcher, DataSource datasource, Key key1)
	{
		currentSourceKey = key;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #208 <Field Key currentSourceKey>
		currentData = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #204 <Field Object currentData>
		currentFetcher = datafetcher;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #212 <Field DataFetcher currentFetcher>
		currentDataSource = datasource;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #219 <Field DataSource currentDataSource>
		currentAttemptingKey = key1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #223 <Field Key currentAttemptingKey>
		if(Thread.currentThread() != currentThread)
	//*  15   27:invokestatic    #381 <Method Thread Thread.currentThread()>
	//*  16   30:aload_0         
	//*  17   31:getfield        #467 <Field Thread currentThread>
	//*  18   34:if_acmpeq       55
		{
			runReason = RunReason.DECODE_DATA;
	//   19   37:aload_0         
	//   20   38:getstatic       #587 <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
	//   21   41:putfield        #526 <Field DecodeJob$RunReason runReason>
			callback.reschedule(this);
	//   22   44:aload_0         
	//   23   45:getfield        #394 <Field DecodeJob$Callback callback>
	//   24   48:aload_0         
	//   25   49:invokeinterface #581 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
			return;
	//   26   54:return          
		}
		GlideTrace.beginSection("DecodeJob.decodeFromRetrievedData");
	//   27   55:ldc2            #589 <String "DecodeJob.decodeFromRetrievedData">
	//   28   58:invokestatic    #594 <Method void GlideTrace.beginSection(String)>
		decodeFromRetrievedData();
	//   29   61:aload_0         
	//   30   62:invokespecial   #531 <Method void decodeFromRetrievedData()>
		GlideTrace.endSection();
	//   31   65:invokestatic    #597 <Method void GlideTrace.endSection()>
		return;
	//   32   68:return          
		key;
	//   33   69:astore_1        
		GlideTrace.endSection();
	//   34   70:invokestatic    #597 <Method void GlideTrace.endSection()>
		throw key;
	//   35   73:aload_1         
	//   36   74:athrow          
	}

	Resource onResourceDecoded(DataSource datasource, Resource resource)
	{
		Class class1 = resource.get().getClass();
	//    0    0:aload_2         
	//    1    1:invokeinterface #605 <Method Object Resource.get()>
	//    2    6:invokevirtual   #188 <Method Class Object.getClass()>
	//    3    9:astore          7
		Object obj;
		Transformation transformation;
		if(datasource != DataSource.RESOURCE_DISK_CACHE)
	//*   4   11:aload_1         
	//*   5   12:getstatic       #317 <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//*   6   15:if_acmpeq       54
		{
			transformation = decodeHelper.getTransformation(class1);
	//    7   18:aload_0         
	//    8   19:getfield        #111 <Field DecodeHelper decodeHelper>
	//    9   22:aload           7
	//   10   24:invokevirtual   #609 <Method Transformation DecodeHelper.getTransformation(Class)>
	//   11   27:astore          5
			obj = ((Object) (transformation.transform(((android.content.Context) (glideContext)), resource, width, height)));
	//   12   29:aload           5
	//   13   31:aload_0         
	//   14   32:getfield        #461 <Field GlideContext glideContext>
	//   15   35:aload_2         
	//   16   36:aload_0         
	//   17   37:getfield        #505 <Field int width>
	//   18   40:aload_0         
	//   19   41:getfield        #507 <Field int height>
	//   20   44:invokeinterface #615 <Method Resource Transformation.transform(android.content.Context, Resource, int, int)>
	//   21   49:astore          4
		} else
	//*  22   51:goto            60
		{
			obj = ((Object) (resource));
	//   23   54:aload_2         
	//   24   55:astore          4
			transformation = null;
	//   25   57:aconst_null     
	//   26   58:astore          5
		}
		if(!((Object) (resource)).equals(obj))
	//*  27   60:aload_2         
	//*  28   61:aload           4
	//*  29   63:invokevirtual   #618 <Method boolean Object.equals(Object)>
	//*  30   66:ifne            75
			resource.recycle();
	//   31   69:aload_2         
	//   32   70:invokeinterface #621 <Method void Resource.recycle()>
		EncodeStrategy encodestrategy;
		if(decodeHelper.isResourceEncoderAvailable(((Resource) (obj))))
	//*  33   75:aload_0         
	//*  34   76:getfield        #111 <Field DecodeHelper decodeHelper>
	//*  35   79:aload           4
	//*  36   81:invokevirtual   #625 <Method boolean DecodeHelper.isResourceEncoderAvailable(Resource)>
	//*  37   84:ifeq            112
		{
			resource = ((Resource) (decodeHelper.getResultEncoder(((Resource) (obj)))));
	//   38   87:aload_0         
	//   39   88:getfield        #111 <Field DecodeHelper decodeHelper>
	//   40   91:aload           4
	//   41   93:invokevirtual   #629 <Method ResourceEncoder DecodeHelper.getResultEncoder(Resource)>
	//   42   96:astore_2        
			encodestrategy = ((ResourceEncoder) (resource)).getEncodeStrategy(options);
	//   43   97:aload_2         
	//   44   98:aload_0         
	//   45   99:getfield        #307 <Field Options options>
	//   46  102:invokeinterface #635 <Method EncodeStrategy ResourceEncoder.getEncodeStrategy(Options)>
	//   47  107:astore          6
		} else
	//*  48  109:goto            119
		{
			encodestrategy = EncodeStrategy.NONE;
	//   49  112:getstatic       #641 <Field EncodeStrategy EncodeStrategy.NONE>
	//   50  115:astore          6
			resource = null;
	//   51  117:aconst_null     
	//   52  118:astore_2        
		}
		boolean flag = decodeHelper.isSourceKey(currentSourceKey);
	//   53  119:aload_0         
	//   54  120:getfield        #111 <Field DecodeHelper decodeHelper>
	//   55  123:aload_0         
	//   56  124:getfield        #208 <Field Key currentSourceKey>
	//   57  127:invokevirtual   #645 <Method boolean DecodeHelper.isSourceKey(Key)>
	//   58  130:istore_3        
		if(diskCacheStrategy.isResourceCacheable(flag ^ true, datasource, encodestrategy))
	//*  59  131:aload_0         
	//*  60  132:getfield        #277 <Field DiskCacheStrategy diskCacheStrategy>
	//*  61  135:iload_3         
	//*  62  136:iconst_1        
	//*  63  137:ixor            
	//*  64  138:aload_1         
	//*  65  139:aload           6
	//*  66  141:invokevirtual   #649 <Method boolean DiskCacheStrategy.isResourceCacheable(boolean, DataSource, EncodeStrategy)>
	//*  67  144:ifeq            316
		{
			if(resource != null)
	//*  68  147:aload_2         
	//*  69  148:ifnull          298
			{
				switch(_cls1..SwitchMap.com.bumptech.glide.load.EncodeStrategy[encodestrategy.ordinal()])
	//*  70  151:getstatic       #652 <Field int[] DecodeJob$1.$SwitchMap$com$bumptech$glide$load$EncodeStrategy>
	//*  71  154:aload           6
	//*  72  156:invokevirtual   #653 <Method int EncodeStrategy.ordinal()>
	//*  73  159:iaload          
				{
	//*  74  160:tableswitch     1 2: default 184
	//	               1 261
	//	               2 219
				default:
					datasource = ((DataSource) (new StringBuilder()));
	//   75  184:new             #164 <Class StringBuilder>
	//   76  187:dup             
	//   77  188:invokespecial   #165 <Method void StringBuilder()>
	//   78  191:astore_1        
					((StringBuilder) (datasource)).append("Unknown strategy: ");
	//   79  192:aload_1         
	//   80  193:ldc2            #655 <String "Unknown strategy: ">
	//   81  196:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   82  199:pop             
					((StringBuilder) (datasource)).append(((Object) (encodestrategy)));
	//   83  200:aload_1         
	//   84  201:aload           6
	//   85  203:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   86  206:pop             
					throw new IllegalArgumentException(((StringBuilder) (datasource)).toString());
	//   87  207:new             #274 <Class IllegalArgumentException>
	//   88  210:dup             
	//   89  211:aload_1         
	//   90  212:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   91  215:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//   92  218:athrow          

				case 2: // '\002'
					datasource = ((DataSource) (new ResourceCacheKey(decodeHelper.getArrayPool(), currentSourceKey, signature, width, height, transformation, class1, options)));
	//   93  219:new             #657 <Class ResourceCacheKey>
	//   94  222:dup             
	//   95  223:aload_0         
	//   96  224:getfield        #111 <Field DecodeHelper decodeHelper>
	//   97  227:invokevirtual   #661 <Method com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool DecodeHelper.getArrayPool()>
	//   98  230:aload_0         
	//   99  231:getfield        #208 <Field Key currentSourceKey>
	//  100  234:aload_0         
	//  101  235:getfield        #463 <Field Key signature>
	//  102  238:aload_0         
	//  103  239:getfield        #505 <Field int width>
	//  104  242:aload_0         
	//  105  243:getfield        #507 <Field int height>
	//  106  246:aload           5
	//  107  248:aload           7
	//  108  250:aload_0         
	//  109  251:getfield        #307 <Field Options options>
	//  110  254:invokespecial   #664 <Method void ResourceCacheKey(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool, Key, Key, int, int, Transformation, Class, Options)>
	//  111  257:astore_1        
					break;

	//* 112  258:goto            277
				case 1: // '\001'
					datasource = ((DataSource) (new DataCacheKey(currentSourceKey, signature)));
	//  113  261:new             #666 <Class DataCacheKey>
	//  114  264:dup             
	//  115  265:aload_0         
	//  116  266:getfield        #208 <Field Key currentSourceKey>
	//  117  269:aload_0         
	//  118  270:getfield        #463 <Field Key signature>
	//  119  273:invokespecial   #669 <Method void DataCacheKey(Key, Key)>
	//  120  276:astore_1        
					break;
				}
				obj = ((Object) (LockedResource.obtain(((Resource) (obj)))));
	//  121  277:aload           4
	//  122  279:invokestatic    #412 <Method LockedResource LockedResource.obtain(Resource)>
	//  123  282:astore          4
				deferredEncodeManager.init(((Key) (datasource)), ((ResourceEncoder) (resource)), ((LockedResource) (obj)));
	//  124  284:aload_0         
	//  125  285:getfield        #127 <Field DecodeJob$DeferredEncodeManager deferredEncodeManager>
	//  126  288:aload_1         
	//  127  289:aload_2         
	//  128  290:aload           4
	//  129  292:invokevirtual   #672 <Method void DecodeJob$DeferredEncodeManager.init(Key, ResourceEncoder, LockedResource)>
				return ((Resource) (obj));
	//  130  295:aload           4
	//  131  297:areturn         
			} else
			{
				throw new com.bumptech.glide.Registry.NoResultEncoderAvailableException(((Resource) (obj)).get().getClass());
	//  132  298:new             #674 <Class com.bumptech.glide.Registry$NoResultEncoderAvailableException>
	//  133  301:dup             
	//  134  302:aload           4
	//  135  304:invokeinterface #605 <Method Object Resource.get()>
	//  136  309:invokevirtual   #188 <Method Class Object.getClass()>
	//  137  312:invokespecial   #677 <Method void com.bumptech.glide.Registry$NoResultEncoderAvailableException(Class)>
	//  138  315:athrow          
			}
		} else
		{
			return ((Resource) (obj));
	//  139  316:aload           4
	//  140  318:areturn         
		}
	}

	void release(boolean flag)
	{
		if(releaseManager.release(flag))
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field DecodeJob$ReleaseManager releaseManager>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #682 <Method boolean DecodeJob$ReleaseManager.release(boolean)>
	//*   4    8:ifeq            15
			releaseInternal();
	//    5   11:aload_0         
	//    6   12:invokespecial   #447 <Method void releaseInternal()>
	//    7   15:return          
	}

	public void reschedule()
	{
		runReason = RunReason.SWITCH_TO_SOURCE_SERVICE;
	//    0    0:aload_0         
	//    1    1:getstatic       #578 <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//    2    4:putfield        #526 <Field DecodeJob$RunReason runReason>
		callback.reschedule(this);
	//    3    7:aload_0         
	//    4    8:getfield        #394 <Field DecodeJob$Callback callback>
	//    5   11:aload_0         
	//    6   12:invokeinterface #581 <Method void DecodeJob$Callback.reschedule(DecodeJob)>
	//    7   17:return          
	}

	public void run()
	{
		DataFetcher datafetcher;
		GlideTrace.beginSectionFormat("DecodeJob#run(model=%s)", model);
	//    0    0:ldc2            #687 <String "DecodeJob#run(model=%s)">
	//    1    3:aload_0         
	//    2    4:getfield        #471 <Field Object model>
	//    3    7:invokestatic    #691 <Method void GlideTrace.beginSectionFormat(String, Object)>
		datafetcher = currentFetcher;
	//    4   10:aload_0         
	//    5   11:getfield        #212 <Field DataFetcher currentFetcher>
	//    6   14:astore_1        
		if(!isCancelled)
			break MISSING_BLOCK_LABEL_40;
	//    7   15:aload_0         
	//    8   16:getfield        #469 <Field boolean isCancelled>
	//    9   19:ifeq            40
		notifyFailed();
	//   10   22:aload_0         
	//   11   23:invokespecial   #489 <Method void notifyFailed()>
		if(datafetcher != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          36
			datafetcher.cleanup();
	//   14   30:aload_1         
	//   15   31:invokeinterface #146 <Method void DataFetcher.cleanup()>
		GlideTrace.endSection();
	//   16   36:invokestatic    #597 <Method void GlideTrace.endSection()>
		return;
	//   17   39:return          
		runWrapped();
	//   18   40:aload_0         
	//   19   41:invokespecial   #693 <Method void runWrapped()>
		if(datafetcher == null) goto _L2; else goto _L1
	//   20   44:aload_1         
	//   21   45:ifnull          54
_L1:
		datafetcher.cleanup();
	//   22   48:aload_1         
	//   23   49:invokeinterface #146 <Method void DataFetcher.cleanup()>
_L2:
		GlideTrace.endSection();
	//   24   54:invokestatic    #597 <Method void GlideTrace.endSection()>
		return;
	//   25   57:return          
		Object obj;
		obj;
	//   26   58:astore_2        
		break MISSING_BLOCK_LABEL_166;
	//   27   59:goto            166
		obj;
	//   28   62:astore_2        
		if(Log.isLoggable("DecodeJob", 3))
	//*  29   63:ldc1            #40  <String "DecodeJob">
	//*  30   65:iconst_3        
	//*  31   66:invokestatic    #162 <Method boolean Log.isLoggable(String, int)>
	//*  32   69:ifeq            125
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   72:new             #164 <Class StringBuilder>
	//   34   75:dup             
	//   35   76:invokespecial   #165 <Method void StringBuilder()>
	//   36   79:astore_3        
			stringbuilder.append("DecodeJob threw unexpectedly, isCancelled: ");
	//   37   80:aload_3         
	//   38   81:ldc2            #695 <String "DecodeJob threw unexpectedly, isCancelled: ">
	//   39   84:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
			stringbuilder.append(isCancelled);
	//   41   88:aload_3         
	//   42   89:aload_0         
	//   43   90:getfield        #469 <Field boolean isCancelled>
	//   44   93:invokevirtual   #698 <Method StringBuilder StringBuilder.append(boolean)>
	//   45   96:pop             
			stringbuilder.append(", stage: ");
	//   46   97:aload_3         
	//   47   98:ldc2            #700 <String ", stage: ">
	//   48  101:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   49  104:pop             
			stringbuilder.append(((Object) (stage)));
	//   50  105:aload_3         
	//   51  106:aload_0         
	//   52  107:getfield        #248 <Field DecodeJob$Stage stage>
	//   53  110:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
	//   54  113:pop             
			Log.d("DecodeJob", stringbuilder.toString(), ((Throwable) (obj)));
	//   55  114:ldc1            #40  <String "DecodeJob">
	//   56  116:aload_3         
	//   57  117:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   58  120:aload_2         
	//   59  121:invokestatic    #704 <Method int Log.d(String, String, Throwable)>
	//   60  124:pop             
		}
		if(stage != Stage.ENCODE)
	//*  61  125:aload_0         
	//*  62  126:getfield        #248 <Field DecodeJob$Stage stage>
	//*  63  129:getstatic       #417 <Field DecodeJob$Stage DecodeJob$Stage.ENCODE>
	//*  64  132:if_acmpeq       150
		{
			throwables.add(obj);
	//   65  135:aload_0         
	//   66  136:getfield        #116 <Field List throwables>
	//   67  139:aload_2         
	//   68  140:invokeinterface #233 <Method boolean List.add(Object)>
	//   69  145:pop             
			notifyFailed();
	//   70  146:aload_0         
	//   71  147:invokespecial   #489 <Method void notifyFailed()>
		}
		if(!isCancelled) goto _L4; else goto _L3
	//   72  150:aload_0         
	//   73  151:getfield        #469 <Field boolean isCancelled>
	//   74  154:ifeq            164
_L3:
		if(datafetcher == null) goto _L2; else goto _L1
	//   75  157:aload_1         
	//   76  158:ifnull          54
	//*  77  161:goto            48
_L4:
		throw obj;
	//   78  164:aload_2         
	//   79  165:athrow          
		if(datafetcher != null)
	//*  80  166:aload_1         
	//*  81  167:ifnull          176
			datafetcher.cleanup();
	//   82  170:aload_1         
	//   83  171:invokeinterface #146 <Method void DataFetcher.cleanup()>
		GlideTrace.endSection();
	//   84  176:invokestatic    #597 <Method void GlideTrace.endSection()>
		throw obj;
	//   85  179:aload_2         
	//   86  180:athrow          
	}

	boolean willDecodeFromCache()
	{
		Stage stage1 = getNextStage(Stage.INITIALIZE);
	//    0    0:aload_0         
	//    1    1:getstatic       #534 <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//    2    4:invokespecial   #288 <Method DecodeJob$Stage getNextStage(DecodeJob$Stage)>
	//    3    7:astore_1        
		return stage1 == Stage.RESOURCE_CACHE || stage1 == Stage.DATA_CACHE;
	//    4    8:aload_1         
	//    5    9:getstatic       #286 <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//    6   12:if_acmpeq       27
	//    7   15:aload_1         
	//    8   16:getstatic       #302 <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//    9   19:if_acmpne       25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	private static final String TAG = "DecodeJob";
	private Callback callback;
	private Key currentAttemptingKey;
	private Object currentData;
	private DataSource currentDataSource;
	private DataFetcher currentFetcher;
	private volatile DataFetcherGenerator currentGenerator;
	private Key currentSourceKey;
	private Thread currentThread;
	private final DecodeHelper decodeHelper = new DecodeHelper();
	private final DeferredEncodeManager deferredEncodeManager = new DeferredEncodeManager();
	private final DiskCacheProvider diskCacheProvider;
	private DiskCacheStrategy diskCacheStrategy;
	private GlideContext glideContext;
	private int height;
	private volatile boolean isCallbackNotified;
	private volatile boolean isCancelled;
	private EngineKey loadKey;
	private Object model;
	private boolean onlyRetrieveFromCache;
	private Options options;
	private int order;
	private final android.support.v4.util.Pools.Pool pool;
	private Priority priority;
	private final ReleaseManager releaseManager = new ReleaseManager();
	private RunReason runReason;
	private Key signature;
	private Stage stage;
	private long startFetchTime;
	private final StateVerifier stateVerifier = StateVerifier.newInstance();
	private final List throwables = new ArrayList();
	private int width;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SafeKeyGenerator
{
	static final class PoolableDigestContainer
		implements com.bumptech.glide.util.pool.FactoryPools.Poolable
	{

		public StateVerifier getVerifier()
		{
			return stateVerifier;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field StateVerifier stateVerifier>
		//    2    4:areturn         
		}

		final MessageDigest messageDigest;
		private final StateVerifier stateVerifier = StateVerifier.newInstance();

		PoolableDigestContainer(MessageDigest messagedigest)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:invokestatic    #24  <Method StateVerifier StateVerifier.newInstance()>
		//    4    8:putfield        #26  <Field StateVerifier stateVerifier>
			messageDigest = messagedigest;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #28  <Field MessageDigest messageDigest>
		//    8   16:return          
		}
	}


	public SafeKeyGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class LruCache>
	//    4    8:dup             
	//    5    9:sipush          1000
	//    6   12:invokespecial   #24  <Method void LruCache(int)>
	//    7   15:putfield        #26  <Field LruCache loadIdToSafeHash>
	//    8   18:aload_0         
	//    9   19:bipush          10
	//   10   21:new             #6   <Class SafeKeyGenerator$1>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #29  <Method void SafeKeyGenerator$1(SafeKeyGenerator)>
	//   14   29:invokestatic    #35  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//   15   32:putfield        #37  <Field android.support.v4.util.Pools$Pool digestPool>
	//   16   35:return          
	}

	private String calculateHexStringDigest(Key key)
	{
		PoolableDigestContainer poolabledigestcontainer = (PoolableDigestContainer)digestPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field android.support.v4.util.Pools$Pool digestPool>
	//    2    4:invokeinterface #46  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #8   <Class SafeKeyGenerator$PoolableDigestContainer>
	//    4   12:astore_2        
		key.updateDiskCacheKey(poolabledigestcontainer.messageDigest);
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:getfield        #50  <Field MessageDigest SafeKeyGenerator$PoolableDigestContainer.messageDigest>
	//    8   18:invokeinterface #56  <Method void Key.updateDiskCacheKey(MessageDigest)>
		key = ((Key) (Util.sha256BytesToHex(poolabledigestcontainer.messageDigest.digest())));
	//    9   23:aload_2         
	//   10   24:getfield        #50  <Field MessageDigest SafeKeyGenerator$PoolableDigestContainer.messageDigest>
	//   11   27:invokevirtual   #62  <Method byte[] MessageDigest.digest()>
	//   12   30:invokestatic    #68  <Method String Util.sha256BytesToHex(byte[])>
	//   13   33:astore_1        
		digestPool.release(((Object) (poolabledigestcontainer)));
	//   14   34:aload_0         
	//   15   35:getfield        #37  <Field android.support.v4.util.Pools$Pool digestPool>
	//   16   38:aload_2         
	//   17   39:invokeinterface #72  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   44:pop             
		return ((String) (key));
	//   19   45:aload_1         
	//   20   46:areturn         
		key;
	//   21   47:astore_1        
		digestPool.release(((Object) (poolabledigestcontainer)));
	//   22   48:aload_0         
	//   23   49:getfield        #37  <Field android.support.v4.util.Pools$Pool digestPool>
	//   24   52:aload_2         
	//   25   53:invokeinterface #72  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   26   58:pop             
		throw key;
	//   27   59:aload_1         
	//   28   60:athrow          
	}

	public String getSafeKey(Key key)
	{
		Object obj = ((Object) (loadIdToSafeHash));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field LruCache loadIdToSafeHash>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) ((String)loadIdToSafeHash.get(((Object) (key)))));
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field LruCache loadIdToSafeHash>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #77  <Method Object LruCache.get(Object)>
	//    9   15:checkcast       #79  <Class String>
	//   10   18:astore_3        
		obj;
	//   11   19:aload_2         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		  goto _L1
	//*  13   21:goto            29
		key;
	//   14   24:astore_1        
	//*  15   25:aload_2         
		throw key;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
_L1:
		obj = obj1;
	//   19   29:aload_3         
	//   20   30:astore_2        
		if(obj1 == null)
	//*  21   31:aload_3         
	//*  22   32:ifnonnull       41
			obj = ((Object) (calculateHexStringDigest(key)));
	//   23   35:aload_0         
	//   24   36:aload_1         
	//   25   37:invokespecial   #81  <Method String calculateHexStringDigest(Key)>
	//   26   40:astore_2        
		obj1 = ((Object) (loadIdToSafeHash));
	//   27   41:aload_0         
	//   28   42:getfield        #26  <Field LruCache loadIdToSafeHash>
	//   29   45:astore_3        
		obj1;
	//   30   46:aload_3         
		JVM INSTR monitorenter ;
	//   31   47:monitorenter    
		loadIdToSafeHash.put(((Object) (key)), obj);
	//   32   48:aload_0         
	//   33   49:getfield        #26  <Field LruCache loadIdToSafeHash>
	//   34   52:aload_1         
	//   35   53:aload_2         
	//   36   54:invokevirtual   #85  <Method Object LruCache.put(Object, Object)>
	//   37   57:pop             
		obj1;
	//   38   58:aload_3         
		JVM INSTR monitorexit ;
	//   39   59:monitorexit     
		return ((String) (obj));
	//   40   60:aload_2         
	//   41   61:areturn         
		key;
	//   42   62:astore_1        
	//*  43   63:aload_3         
		throw key;
	//   44   64:monitorexit     
	//   45   65:aload_1         
	//   46   66:athrow          
	}

	private final android.support.v4.util.Pools.Pool digestPool = FactoryPools.threadSafe(10, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

		public PoolableDigestContainer create()
		{
			PoolableDigestContainer poolabledigestcontainer;
			try
			{
				poolabledigestcontainer = new PoolableDigestContainer(MessageDigest.getInstance("SHA-256"));
		//    0    0:new             #25  <Class SafeKeyGenerator$PoolableDigestContainer>
		//    1    3:dup             
		//    2    4:ldc1            #27  <String "SHA-256">
		//    3    6:invokestatic    #33  <Method MessageDigest MessageDigest.getInstance(String)>
		//    4    9:invokespecial   #36  <Method void SafeKeyGenerator$PoolableDigestContainer(MessageDigest)>
		//    5   12:astore_1        
			}
		//*   6   13:aload_1         
		//*   7   14:areturn         
			catch(NoSuchAlgorithmException nosuchalgorithmexception)
		//*   8   15:astore_1        
			{
				throw new RuntimeException(((Throwable) (nosuchalgorithmexception)));
		//    9   16:new             #38  <Class RuntimeException>
		//   10   19:dup             
		//   11   20:aload_1         
		//   12   21:invokespecial   #41  <Method void RuntimeException(Throwable)>
		//   13   24:athrow          
			}
			return poolabledigestcontainer;
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #44  <Method SafeKeyGenerator$PoolableDigestContainer create()>
		//    2    4:areturn         
		}

		final SafeKeyGenerator this$0;

			
			{
				this$0 = SafeKeyGenerator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SafeKeyGenerator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
);
	private final LruCache loadIdToSafeHash = new LruCache(1000);
}

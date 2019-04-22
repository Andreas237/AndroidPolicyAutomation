// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.*;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SafeKeyGenerator
{
	private static final class PoolableDigestContainer
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
	//    5    9:ldc2w           #22  <Long 1000L>
	//    6   12:invokespecial   #26  <Method void LruCache(long)>
	//    7   15:putfield        #28  <Field LruCache loadIdToSafeHash>
	//    8   18:aload_0         
	//    9   19:bipush          10
	//   10   21:new             #6   <Class SafeKeyGenerator$1>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #31  <Method void SafeKeyGenerator$1(SafeKeyGenerator)>
	//   14   29:invokestatic    #37  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//   15   32:putfield        #39  <Field android.support.v4.util.Pools$Pool digestPool>
	//   16   35:return          
	}

	private String calculateHexStringDigest(Key key)
	{
		PoolableDigestContainer poolabledigestcontainer = (PoolableDigestContainer)Preconditions.checkNotNull(digestPool.acquire());
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field android.support.v4.util.Pools$Pool digestPool>
	//    2    4:invokeinterface #48  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//    4   12:checkcast       #8   <Class SafeKeyGenerator$PoolableDigestContainer>
	//    5   15:astore_2        
		key.updateDiskCacheKey(poolabledigestcontainer.messageDigest);
	//    6   16:aload_1         
	//    7   17:aload_2         
	//    8   18:getfield        #58  <Field MessageDigest SafeKeyGenerator$PoolableDigestContainer.messageDigest>
	//    9   21:invokeinterface #64  <Method void Key.updateDiskCacheKey(MessageDigest)>
		key = ((Key) (Util.sha256BytesToHex(poolabledigestcontainer.messageDigest.digest())));
	//   10   26:aload_2         
	//   11   27:getfield        #58  <Field MessageDigest SafeKeyGenerator$PoolableDigestContainer.messageDigest>
	//   12   30:invokevirtual   #70  <Method byte[] MessageDigest.digest()>
	//   13   33:invokestatic    #76  <Method String Util.sha256BytesToHex(byte[])>
	//   14   36:astore_1        
		digestPool.release(((Object) (poolabledigestcontainer)));
	//   15   37:aload_0         
	//   16   38:getfield        #39  <Field android.support.v4.util.Pools$Pool digestPool>
	//   17   41:aload_2         
	//   18   42:invokeinterface #80  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   19   47:pop             
		return ((String) (key));
	//   20   48:aload_1         
	//   21   49:areturn         
		key;
	//   22   50:astore_1        
		digestPool.release(((Object) (poolabledigestcontainer)));
	//   23   51:aload_0         
	//   24   52:getfield        #39  <Field android.support.v4.util.Pools$Pool digestPool>
	//   25   55:aload_2         
	//   26   56:invokeinterface #80  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   27   61:pop             
		throw key;
	//   28   62:aload_1         
	//   29   63:athrow          
	}

	public String getSafeKey(Key key)
	{
		String s;
		synchronized(loadIdToSafeHash)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field LruCache loadIdToSafeHash>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			s = (String)loadIdToSafeHash.get(((Object) (key)));
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field LruCache loadIdToSafeHash>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #84  <Method Object LruCache.get(Object)>
	//    9   15:checkcast       #86  <Class String>
	//   10   18:astore_3        
		}
	//   11   19:aload_2         
	//   12   20:monitorexit     
		obj = ((Object) (s));
	//   13   21:aload_3         
	//   14   22:astore_2        
		if(s == null)
	//*  15   23:aload_3         
	//*  16   24:ifnonnull       33
			obj = ((Object) (calculateHexStringDigest(key)));
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:invokespecial   #88  <Method String calculateHexStringDigest(Key)>
	//   20   32:astore_2        
		synchronized(loadIdToSafeHash)
	//*  21   33:aload_0         
	//*  22   34:getfield        #28  <Field LruCache loadIdToSafeHash>
	//*  23   37:astore_3        
	//*  24   38:aload_3         
	//*  25   39:monitorenter    
		{
			loadIdToSafeHash.put(((Object) (key)), obj);
	//   26   40:aload_0         
	//   27   41:getfield        #28  <Field LruCache loadIdToSafeHash>
	//   28   44:aload_1         
	//   29   45:aload_2         
	//   30   46:invokevirtual   #92  <Method Object LruCache.put(Object, Object)>
	//   31   49:pop             
		}
	//   32   50:aload_3         
	//   33   51:monitorexit     
		return ((String) (obj));
	//   34   52:aload_2         
	//   35   53:areturn         
		key;
	//   36   54:astore_1        
		lrucache;
	//   37   55:aload_3         
		JVM INSTR monitorexit ;
	//   38   56:monitorexit     
		throw key;
	//   39   57:aload_1         
	//   40   58:athrow          
		key;
	//   41   59:astore_1        
		obj;
	//   42   60:aload_2         
		JVM INSTR monitorexit ;
	//   43   61:monitorexit     
		throw key;
	//   44   62:aload_1         
	//   45   63:athrow          
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
	private final LruCache loadIdToSafeHash = new LruCache(1000L);
}

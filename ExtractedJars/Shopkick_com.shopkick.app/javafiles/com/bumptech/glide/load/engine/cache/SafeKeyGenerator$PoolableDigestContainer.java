// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			SafeKeyGenerator

private static final class SafeKeyGenerator$PoolableDigestContainer
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

	SafeKeyGenerator$PoolableDigestContainer(MessageDigest messagedigest)
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

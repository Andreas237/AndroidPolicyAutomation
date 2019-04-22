// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			SafeKeyGenerator

class SafeKeyGenerator$1
	implements com.bumptech.glide.util.pool.y
{

	public olableDigestContainer create()
	{
		olableDigestContainer olabledigestcontainer;
		try
		{
			olabledigestcontainer = new olableDigestContainer(MessageDigest.getInstance("SHA-256"));
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
		return olabledigestcontainer;
	}

	public volatile Object create()
	{
		return ((Object) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method SafeKeyGenerator$PoolableDigestContainer create()>
	//    2    4:areturn         
	}

	final SafeKeyGenerator this$0;

	SafeKeyGenerator$1()
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

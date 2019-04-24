// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmSession, ExoMediaCrypto

public final class ErrorStateDrmSession
	implements DrmSession
{

	public ErrorStateDrmSession(DrmSession.DrmSessionException drmsessionexception)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		error = (DrmSession.DrmSessionException)Assertions.checkNotNull(((Object) (drmsessionexception)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #22  <Class DrmSession$DrmSessionException>
	//    6   12:putfield        #24  <Field DrmSession$DrmSessionException error>
	//    7   15:return          
	}

	public DrmSession.DrmSessionException getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DrmSession$DrmSessionException error>
	//    2    4:areturn         
	}

	public ExoMediaCrypto getMediaCrypto()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] getOfflineLicenseKeySetId()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getState()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Map queryKeyStatus()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final DrmSession.DrmSessionException error;
}

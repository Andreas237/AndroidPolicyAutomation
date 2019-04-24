// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			MediaDrmCallback

public final class LocalMediaDrmCallback
	implements MediaDrmCallback
{

	public LocalMediaDrmCallback(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		keyResponse = (byte[])Assertions.checkNotNull(((Object) (abyte0)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #20  <Class byte[]>
	//    6   12:putfield        #22  <Field byte[] keyResponse>
	//    7   15:return          
	}

	public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyrequest, String s)
		throws Exception
	{
		return keyResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] keyResponse>
	//    2    4:areturn         
	}

	public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionrequest)
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #36  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final byte keyResponse[];
}

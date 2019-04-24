// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaDrm

public static final class ExoMediaDrm$DefaultKeyStatus
	implements ExoMediaDrm.KeyStatus
{

	public byte[] getKeyId()
	{
		return keyId;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] keyId>
	//    2    4:areturn         
	}

	public int getStatusCode()
	{
		return statusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int statusCode>
	//    2    4:ireturn         
	}

	private final byte keyId[];
	private final int statusCode;

	ExoMediaDrm$DefaultKeyStatus(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int statusCode>
		keyId = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field byte[] keyId>
	//    8   14:return          
	}
}

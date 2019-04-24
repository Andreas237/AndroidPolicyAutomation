// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaDrm

public static final class ExoMediaDrm$DefaultProvisionRequest
	implements ExoMediaDrm.ProvisionRequest
{

	public byte[] getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] data>
	//    2    4:areturn         
	}

	public String getDefaultUrl()
	{
		return defaultUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String defaultUrl>
	//    2    4:areturn         
	}

	private final byte data[];
	private final String defaultUrl;

	public ExoMediaDrm$DefaultProvisionRequest(byte abyte0[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field byte[] data>
		defaultUrl = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String defaultUrl>
	//    8   14:return          
	}
}

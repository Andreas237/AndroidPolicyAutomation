// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest

public static class SmoothStreamingManifest$ProtectionElement
{

	public final byte data[];
	public final UUID uuid;

	public SmoothStreamingManifest$ProtectionElement(UUID uuid1, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		uuid = uuid1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field UUID uuid>
		data = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field byte[] data>
	//    8   14:return          
	}
}

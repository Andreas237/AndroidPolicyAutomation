// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			vx

final class wy extends ThreadLocal
{

	wy(vx vx)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ThreadLocal()>
	//    2    4:return          
	}

	protected final Object initialValue()
	{
		return ((Object) (ByteBuffer.allocate(32)));
	//    0    0:bipush          32
	//    1    2:invokestatic    #18  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    5:areturn         
	}
}

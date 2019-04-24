// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//			zzu

final class zzu$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return zza((byte[])obj, (byte[])obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class byte[]>
	//    5    9:invokevirtual   #22  <Method int zza(byte[], byte[])>
	//    6   12:ireturn         
	}

	public int zza(byte abyte0[], byte abyte1[])
	{
		return abyte0.length - abyte1.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:aload_2         
	//    3    3:arraylength     
	//    4    4:isub            
	//    5    5:ireturn         
	}

	zzu$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}

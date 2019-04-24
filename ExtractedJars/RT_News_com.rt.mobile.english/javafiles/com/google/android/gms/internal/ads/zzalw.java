// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzank, zzp, zzalz, zzalt

final class zzalw
	implements zzank
{

	zzalw(zzalt zzalt, zzalz zzalz1)
	{
		zzcti = zzalz1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field zzalz zzcti>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final Object apply(Object obj)
	{
		obj = ((Object) (new ByteArrayInputStream(((zzp)obj).data)));
	//    0    0:new             #21  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #23  <Class zzp>
	//    4    8:getfield        #27  <Field byte[] zzp.data>
	//    5   11:invokespecial   #30  <Method void ByteArrayInputStream(byte[])>
	//    6   14:astore_1        
		return zzcti.zze(((java.io.InputStream) (obj)));
	//    7   15:aload_0         
	//    8   16:getfield        #13  <Field zzalz zzcti>
	//    9   19:aload_1         
	//   10   20:invokeinterface #36  <Method Object zzalz.zze(java.io.InputStream)>
	//   11   25:areturn         
	}

	private final zzalz zzcti;
}

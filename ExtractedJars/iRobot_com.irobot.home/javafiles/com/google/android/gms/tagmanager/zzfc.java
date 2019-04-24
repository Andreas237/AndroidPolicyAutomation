// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.internal.measurement.zzyi;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzs, zzdz, zzfb

final class zzfc
	implements zzs
{

	zzfc(zzfb zzfb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final int sizeOf(Object obj, Object obj1)
	{
		return ((zzyi) ((zzp)((zzdz)obj1).getObject())).zzzh();
	//    0    0:aload_2         
	//    1    1:checkcast       #17  <Class zzdz>
	//    2    4:invokevirtual   #21  <Method Object zzdz.getObject()>
	//    3    7:checkcast       #23  <Class zzp>
	//    4   10:invokevirtual   #29  <Method int zzyi.zzzh()>
	//    5   13:ireturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import com.google.android.gms.internal.measurement.zzyi;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdz

final class zzfh
{

	public zzfh(zzdz zzdz1, zzp zzp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbfr = zzdz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzdz zzbfr>
		zzbfs = zzp1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field zzp zzbfs>
	//    8   14:return          
	}

	public final int getSize()
	{
		int j = ((zzyi) ((zzp)zzbfr.getObject())).zzzh();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzdz zzbfr>
	//    2    4:invokevirtual   #29  <Method Object zzdz.getObject()>
	//    3    7:checkcast       #31  <Class zzp>
	//    4   10:invokevirtual   #36  <Method int zzyi.zzzh()>
	//    5   13:istore_2        
		int i;
		if(zzbfs == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #18  <Field zzp zzbfs>
	//*   8   18:ifnonnull       26
			i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_1        
		else
	//*  11   23:goto            34
			i = ((zzyi) (zzbfs)).zzzh();
	//   12   26:aload_0         
	//   13   27:getfield        #18  <Field zzp zzbfs>
	//   14   30:invokevirtual   #36  <Method int zzyi.zzzh()>
	//   15   33:istore_1        
		return j + i;
	//   16   34:iload_2         
	//   17   35:iload_1         
	//   18   36:iadd            
	//   19   37:ireturn         
	}

	public final zzdz zzpv()
	{
		return zzbfr;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzdz zzbfr>
	//    2    4:areturn         
	}

	public final zzp zzpw()
	{
		return zzbfs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzp zzbfs>
	//    2    4:areturn         
	}

	private zzdz zzbfr;
	private zzp zzbfs;
}

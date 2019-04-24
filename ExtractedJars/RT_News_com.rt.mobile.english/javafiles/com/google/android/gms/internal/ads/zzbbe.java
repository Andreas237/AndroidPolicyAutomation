// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbd, zzbbb, zzbbg, zzbcu, 
//			zzbdl, zzbee, zzbah, zzbey

final class zzbbe extends zzbbd
{

	zzbbe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzbbd()>
	//    2    4:return          
	}

	final int zza(java.util.Map.Entry entry)
	{
		entry.getKey();
	//    0    0:aload_1         
	//    1    1:invokeinterface #18  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #20  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #21  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final Object zza(zzbbb zzbbb1, zzbcu zzbcu, int i)
	{
		return ((Object) (zzbbb1.zza(zzbcu, i)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #29  <Method zzbbo$zzd zzbbb.zza(zzbcu, int)>
	//    4    6:areturn         
	}

	final Object zza(zzbdl zzbdl, Object obj, zzbbb zzbbb1, zzbbg zzbbg1, Object obj1, zzbee zzbee)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #20  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzbah zzbah, Object obj, zzbbb zzbbb1, zzbbg zzbbg1)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #20  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzbdl zzbdl, Object obj, zzbbb zzbbb1, zzbbg zzbbg1)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #20  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzbey zzbey, java.util.Map.Entry entry)
		throws IOException
	{
		entry.getKey();
	//    0    0:aload_2         
	//    1    1:invokeinterface #18  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #20  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #21  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final void zza(Object obj, zzbbg zzbbg1)
	{
		((zzbbo.zzc)obj).zzdtz = zzbbg1;
	//    0    0:aload_1         
	//    1    1:checkcast       #43  <Class zzbbo$zzc>
	//    2    4:aload_2         
	//    3    5:putfield        #47  <Field zzbbg zzbbo$zzc.zzdtz>
	//    4    8:return          
	}

	final boolean zzh(zzbcu zzbcu)
	{
		return zzbcu instanceof zzbbo.zzc;
	//    0    0:aload_1         
	//    1    1:instanceof      #43  <Class zzbbo$zzc>
	//    2    4:ireturn         
	}

	final zzbbg zzm(Object obj)
	{
		return ((zzbbo.zzc)obj).zzdtz;
	//    0    0:aload_1         
	//    1    1:checkcast       #43  <Class zzbbo$zzc>
	//    2    4:getfield        #47  <Field zzbbg zzbbo$zzc.zzdtz>
	//    3    7:areturn         
	}

	final zzbbg zzn(Object obj)
	{
		zzbbg zzbbg2 = ((zzbbd)this).zzm(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method zzbbg zzbbd.zzm(Object)>
	//    3    5:astore_3        
		zzbbg zzbbg1 = zzbbg2;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(zzbbg2.isImmutable())
	//*   6    8:aload_3         
	//*   7    9:invokevirtual   #62  <Method boolean zzbbg.isImmutable()>
	//*   8   12:ifeq            29
		{
			zzbbg1 = (zzbbg)zzbbg2.clone();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #65  <Method Object zzbbg.clone()>
	//   11   19:checkcast       #58  <Class zzbbg>
	//   12   22:astore_2        
			((zzbbd)this).zza(obj, zzbbg1);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #67  <Method void zzbbd.zza(Object, zzbbg)>
		}
		return zzbbg1;
	//   17   29:aload_2         
	//   18   30:areturn         
	}

	final void zzo(Object obj)
	{
		((zzbbd)this).zzm(obj).zzaaz();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method zzbbg zzbbd.zzm(Object)>
	//    3    5:invokevirtual   #72  <Method void zzbbg.zzaaz()>
	//    4    8:return          
	}
}

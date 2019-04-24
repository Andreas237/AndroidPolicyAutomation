// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcp, zzbco, zzbcn

final class zzbcq
	implements zzbcp
{

	zzbcq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final int zzb(int i, Object obj, Object obj1)
	{
		obj = ((Object) ((zzbco)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:astore_2        
		if(((zzbco) (obj)).isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #19  <Method boolean zzbco.isEmpty()>
	//*   5    9:ifeq            14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		obj = ((Object) (((zzbco) (obj)).entrySet().iterator()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #23  <Method Set zzbco.entrySet()>
	//   10   18:invokeinterface #29  <Method Iterator Set.iterator()>
	//   11   23:astore_2        
		if(((Iterator) (obj)).hasNext())
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            65
		{
			obj = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//   15   33:aload_2         
	//   16   34:invokeinterface #38  <Method Object Iterator.next()>
	//   17   39:checkcast       #40  <Class java.util.Map$Entry>
	//   18   42:astore_2        
			((java.util.Map.Entry) (obj)).getKey();
	//   19   43:aload_2         
	//   20   44:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
	//   21   49:pop             
			((java.util.Map.Entry) (obj)).getValue();
	//   22   50:aload_2         
	//   23   51:invokeinterface #46  <Method Object java.util.Map$Entry.getValue()>
	//   24   56:pop             
			throw new NoSuchMethodError();
	//   25   57:new             #48  <Class NoSuchMethodError>
	//   26   60:dup             
	//   27   61:invokespecial   #49  <Method void NoSuchMethodError()>
	//   28   64:athrow          
		} else
		{
			return 0;
	//   29   65:iconst_0        
	//   30   66:ireturn         
		}
	}

	public final Object zzb(Object obj, Object obj1)
	{
		zzbco zzbco1 = (zzbco)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:astore_3        
		obj1 = ((Object) ((zzbco)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class zzbco>
	//    5    9:astore_2        
		obj = ((Object) (zzbco1));
	//    6   10:aload_3         
	//    7   11:astore_1        
		if(!((zzbco) (obj1)).isEmpty())
	//*   8   12:aload_2         
	//*   9   13:invokevirtual   #19  <Method boolean zzbco.isEmpty()>
	//*  10   16:ifne            38
		{
			obj = ((Object) (zzbco1));
	//   11   19:aload_3         
	//   12   20:astore_1        
			if(!zzbco1.isMutable())
	//*  13   21:aload_3         
	//*  14   22:invokevirtual   #53  <Method boolean zzbco.isMutable()>
	//*  15   25:ifne            33
				obj = ((Object) (zzbco1.zzaec()));
	//   16   28:aload_3         
	//   17   29:invokevirtual   #57  <Method zzbco zzbco.zzaec()>
	//   18   32:astore_1        
			((zzbco) (obj)).zza(((zzbco) (obj1)));
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #61  <Method void zzbco.zza(zzbco)>
		}
		return obj;
	//   22   38:aload_1         
	//   23   39:areturn         
	}

	public final Map zzs(Object obj)
	{
		return ((Map) ((zzbco)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:areturn         
	}

	public final Map zzt(Object obj)
	{
		return ((Map) ((zzbco)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:areturn         
	}

	public final boolean zzu(Object obj)
	{
		return !((zzbco)obj).isMutable();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:invokevirtual   #53  <Method boolean zzbco.isMutable()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final Object zzv(Object obj)
	{
		((zzbco)obj).zzaaz();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzbco>
	//    2    4:invokevirtual   #73  <Method void zzbco.zzaaz()>
		return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
	}

	public final Object zzw(Object obj)
	{
		return ((Object) (zzbco.zzaeb().zzaec()));
	//    0    0:invokestatic    #77  <Method zzbco zzbco.zzaeb()>
	//    1    3:invokevirtual   #57  <Method zzbco zzbco.zzaec()>
	//    2    6:areturn         
	}

	public final zzbcn zzx(Object obj)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #48  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}
}

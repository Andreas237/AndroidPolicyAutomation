// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvq, zzvp, zzvo

final class zzvr
	implements zzvq
{

	zzvr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Map zzac(Object obj)
	{
		return ((Map) ((zzvp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:areturn         
	}

	public final Map zzad(Object obj)
	{
		return ((Map) ((zzvp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:areturn         
	}

	public final boolean zzae(Object obj)
	{
		return !((zzvp)obj).isMutable();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:invokevirtual   #24  <Method boolean zzvp.isMutable()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final Object zzaf(Object obj)
	{
		((zzvp)obj).zzsw();
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:invokevirtual   #29  <Method void zzvp.zzsw()>
		return obj;
	//    3    7:aload_1         
	//    4    8:areturn         
	}

	public final Object zzag(Object obj)
	{
		return ((Object) (zzvp.zzxg().zzxh()));
	//    0    0:invokestatic    #34  <Method zzvp zzvp.zzxg()>
	//    1    3:invokevirtual   #37  <Method zzvp zzvp.zzxh()>
	//    2    6:areturn         
	}

	public final zzvo zzah(Object obj)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #41  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	public final int zzb(int i, Object obj, Object obj1)
	{
		obj = ((Object) ((zzvp)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:astore_2        
		if(((zzvp) (obj)).isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #48  <Method boolean zzvp.isEmpty()>
	//*   5    9:ifeq            14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		obj = ((Object) (((zzvp) (obj)).entrySet().iterator()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #52  <Method Set zzvp.entrySet()>
	//   10   18:invokeinterface #58  <Method Iterator Set.iterator()>
	//   11   23:astore_2        
		if(!((Iterator) (obj)).hasNext())
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  14   30:ifne            35
		{
			return 0;
	//   15   33:iconst_0        
	//   16   34:ireturn         
		} else
		{
			obj = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//   17   35:aload_2         
	//   18   36:invokeinterface #67  <Method Object Iterator.next()>
	//   19   41:checkcast       #69  <Class java.util.Map$Entry>
	//   20   44:astore_2        
			((java.util.Map.Entry) (obj)).getKey();
	//   21   45:aload_2         
	//   22   46:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
	//   23   51:pop             
			((java.util.Map.Entry) (obj)).getValue();
	//   24   52:aload_2         
	//   25   53:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   26   58:pop             
			throw new NoSuchMethodError();
	//   27   59:new             #41  <Class NoSuchMethodError>
	//   28   62:dup             
	//   29   63:invokespecial   #42  <Method void NoSuchMethodError()>
	//   30   66:athrow          
		}
	}

	public final Object zzc(Object obj, Object obj1)
	{
		zzvp zzvp1 = (zzvp)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #15  <Class zzvp>
	//    2    4:astore_3        
		obj1 = ((Object) ((zzvp)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class zzvp>
	//    5    9:astore_2        
		obj = ((Object) (zzvp1));
	//    6   10:aload_3         
	//    7   11:astore_1        
		if(!((zzvp) (obj1)).isEmpty())
	//*   8   12:aload_2         
	//*   9   13:invokevirtual   #48  <Method boolean zzvp.isEmpty()>
	//*  10   16:ifne            38
		{
			obj = ((Object) (zzvp1));
	//   11   19:aload_3         
	//   12   20:astore_1        
			if(!zzvp1.isMutable())
	//*  13   21:aload_3         
	//*  14   22:invokevirtual   #24  <Method boolean zzvp.isMutable()>
	//*  15   25:ifne            33
				obj = ((Object) (zzvp1.zzxh()));
	//   16   28:aload_3         
	//   17   29:invokevirtual   #37  <Method zzvp zzvp.zzxh()>
	//   18   32:astore_1        
			((zzvp) (obj)).zza(((zzvp) (obj1)));
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #81  <Method void zzvp.zza(zzvp)>
		}
		return obj;
	//   22   38:aload_1         
	//   23   39:areturn         
	}
}

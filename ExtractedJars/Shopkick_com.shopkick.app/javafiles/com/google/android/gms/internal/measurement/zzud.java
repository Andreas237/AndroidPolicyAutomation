// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuc, zzub, zzuf, zzvv, 
//			zzwk, zzxd, zzte, zzxy

final class zzud extends zzuc
{

	zzud()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void zzuc()>
	//    2    4:return          
	}

	final Object zza(zzub zzub1, zzvv zzvv, int i)
	{
		return ((Object) (zzub1.zza(zzvv, i)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #17  <Method zzuo$zzd zzub.zza(zzvv, int)>
	//    4    6:areturn         
	}

	final Object zza(zzwk zzwk, Object obj, zzub zzub1, zzuf zzuf1, Object obj1, zzxd zzxd)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #22  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzte zzte, Object obj, zzub zzub1, zzuf zzuf1)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #22  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzwk zzwk, Object obj, zzub zzub1, zzuf zzuf1)
		throws IOException
	{
		throw new NoSuchMethodError();
	//    0    0:new             #22  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	final void zza(zzxy zzxy, java.util.Map.Entry entry)
		throws IOException
	{
		entry.getKey();
	//    0    0:aload_2         
	//    1    1:invokeinterface #37  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #22  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #23  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final int zzb(java.util.Map.Entry entry)
	{
		entry.getKey();
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:pop             
		throw new NoSuchMethodError();
	//    3    7:new             #22  <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #23  <Method void NoSuchMethodError()>
	//    6   14:athrow          
	}

	final boolean zze(zzvv zzvv)
	{
		return zzvv instanceof zzuo.zzc;
	//    0    0:aload_1         
	//    1    1:instanceof      #45  <Class zzuo$zzc>
	//    2    4:ireturn         
	}

	final zzuf zzw(Object obj)
	{
		return ((zzuo.zzc)obj).zzbyj;
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class zzuo$zzc>
	//    2    4:getfield        #51  <Field zzuf zzuo$zzc.zzbyj>
	//    3    7:areturn         
	}

	final zzuf zzx(Object obj)
	{
		obj = ((Object) ((zzuo.zzc)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #45  <Class zzuo$zzc>
	//    2    4:astore_1        
		if(((zzuo.zzc) (obj)).zzbyj.isImmutable())
	//*   3    5:aload_1         
	//*   4    6:getfield        #51  <Field zzuf zzuo$zzc.zzbyj>
	//*   5    9:invokevirtual   #59  <Method boolean zzuf.isImmutable()>
	//*   6   12:ifeq            29
			obj.zzbyj = (zzuf)((zzuo.zzc) (obj)).zzbyj.clone();
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:getfield        #51  <Field zzuf zzuo$zzc.zzbyj>
	//   10   20:invokevirtual   #62  <Method Object zzuf.clone()>
	//   11   23:checkcast       #55  <Class zzuf>
	//   12   26:putfield        #51  <Field zzuf zzuo$zzc.zzbyj>
		return ((zzuo.zzc) (obj)).zzbyj;
	//   13   29:aload_1         
	//   14   30:getfield        #51  <Field zzuf zzuo$zzc.zzbyj>
	//   15   33:areturn         
	}

	final void zzy(Object obj)
	{
		((zzuc)this).zzw(obj).zzsw();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #66  <Method zzuf zzuc.zzw(Object)>
	//    3    5:invokevirtual   #69  <Method void zzuf.zzsw()>
	//    4    8:return          
	}
}

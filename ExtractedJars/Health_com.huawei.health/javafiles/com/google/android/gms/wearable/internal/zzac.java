// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzr, zzad

public final class zzac extends zzbt.zza
{

	public zzac()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzbt$zza()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Object()>
	//    6   12:putfield        #19  <Field Object zzrJ>
	//    7   15:return          
	}

	public void zzE(int i, int j)
	{
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object zzrJ>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1;
		zzr zzr1;
		obj1 = ((Object) (zzbUi));
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field zzad zzbUi>
	//    7   11:astore          4
		zzr1 = new zzr(i, j);
	//    8   13:new             #26  <Class zzr>
	//    9   16:dup             
	//   10   17:iload_1         
	//   11   18:iload_2         
	//   12   19:invokespecial   #28  <Method void zzr(int, int)>
	//   13   22:astore          5
		zzbUe = zzr1;
	//   14   24:aload_0         
	//   15   25:aload           5
	//   16   27:putfield        #30  <Field zzr zzbUe>
		obj;
	//   17   30:aload_3         
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		  goto _L1
	//*  19   32:goto            42
		obj1;
	//   20   35:astore          4
	//*  21   37:aload_3         
		throw obj1;
	//   22   38:monitorexit     
	//   23   39:aload           4
	//   24   41:athrow          
_L1:
		if(obj1 != null)
	//*  25   42:aload           4
	//*  26   44:ifnull          56
			((zzad) (obj1)).zzb(zzr1);
	//   27   47:aload           4
	//   28   49:aload           5
	//   29   51:invokeinterface #36  <Method void zzad.zzb(zzr)>
		return;
	//   30   56:return          
	}

	public void zza(zzad zzad1)
	{
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object zzrJ>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzr zzr1;
		zzbUi = (zzad)com.google.android.gms.common.internal.zzac.zzw(((Object) (zzad1)));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokestatic    #44  <Method Object com.google.android.gms.common.internal.zzac.zzw(Object)>
	//    8   12:checkcast       #32  <Class zzad>
	//    9   15:putfield        #24  <Field zzad zzbUi>
		zzr1 = zzbUe;
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field zzr zzbUe>
	//   12   22:astore_3        
		obj;
	//   13   23:aload_2         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		  goto _L1
	//*  15   25:goto            33
		zzad1;
	//   16   28:astore_1        
	//*  17   29:aload_2         
		throw zzad1;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
_L1:
		if(zzr1 != null)
	//*  21   33:aload_3         
	//*  22   34:ifnull          44
			zzad1.zzb(zzr1);
	//   23   37:aload_1         
	//   24   38:aload_3         
	//   25   39:invokeinterface #36  <Method void zzad.zzb(zzr)>
		return;
	//   26   44:return          
	}

	private zzr zzbUe;
	private zzad zzbUi;
	private final Object zzrJ = new Object();
}

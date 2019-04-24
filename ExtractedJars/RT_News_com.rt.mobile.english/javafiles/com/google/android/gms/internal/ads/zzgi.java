// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgh, zzakb, zzgj, zzane

final class zzgi
	implements Runnable
{

	zzgi(zzgh zzgh1)
	{
		zzahx = zzgh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzgh zzahx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		Object obj = zzgh.zza(zzahx);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzgh zzahx>
	//    2    4:invokestatic    #25  <Method Object zzgh.zza(zzgh)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		Iterator iterator;
		if(!zzgh.zzb(zzahx) || !zzgh.zzc(zzahx))
			break MISSING_BLOCK_LABEL_96;
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field zzgh zzahx>
	//    8   14:invokestatic    #29  <Method boolean zzgh.zzb(zzgh)>
	//    9   17:ifeq            96
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field zzgh zzahx>
	//   12   24:invokestatic    #32  <Method boolean zzgh.zzc(zzgh)>
	//   13   27:ifeq            96
		zzgh.zza(zzahx, false);
	//   14   30:aload_0         
	//   15   31:getfield        #12  <Field zzgh zzahx>
	//   16   34:iconst_0        
	//   17   35:invokestatic    #35  <Method boolean zzgh.zza(zzgh, boolean)>
	//   18   38:pop             
		zzakb.zzck("App went background");
	//   19   39:ldc1            #37  <String "App went background">
	//   20   41:invokestatic    #43  <Method void zzakb.zzck(String)>
		iterator = zzgh.zzd(zzahx).iterator();
	//   21   44:aload_0         
	//   22   45:getfield        #12  <Field zzgh zzahx>
	//   23   48:invokestatic    #47  <Method List zzgh.zzd(zzgh)>
	//   24   51:invokeinterface #53  <Method Iterator List.iterator()>
	//   25   56:astore_2        
_L1:
		zzgj zzgj1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_101;
	//   26   57:aload_2         
	//   27   58:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   28   63:ifeq            101
		zzgj1 = (zzgj)iterator.next();
	//   29   66:aload_2         
	//   30   67:invokeinterface #63  <Method Object Iterator.next()>
	//   31   72:checkcast       #65  <Class zzgj>
	//   32   75:astore_3        
		zzgj1.zzh(false);
	//   33   76:aload_3         
	//   34   77:iconst_0        
	//   35   78:invokeinterface #69  <Method void zzgj.zzh(boolean)>
		  goto _L1
	//*  36   83:goto            57
		Exception exception1;
		exception1;
	//   37   86:astore_3        
		zzane.zzb("", ((Throwable) (exception1)));
	//   38   87:ldc1            #71  <String "">
	//   39   89:aload_3         
	//   40   90:invokestatic    #76  <Method void zzane.zzb(String, Throwable)>
		  goto _L1
	//*  41   93:goto            57
		zzakb.zzck("App is still foreground");
	//   42   96:ldc1            #78  <String "App is still foreground">
	//   43   98:invokestatic    #43  <Method void zzakb.zzck(String)>
		obj;
	//   44  101:aload_1         
		JVM INSTR monitorexit ;
	//   45  102:monitorexit     
		return;
	//   46  103:return          
		Exception exception;
		exception;
	//   47  104:astore_2        
		obj;
	//   48  105:aload_1         
		JVM INSTR monitorexit ;
	//   49  106:monitorexit     
		throw exception;
	//   50  107:aload_2         
	//   51  108:athrow          
	}

	private final zzgh zzahx;
}

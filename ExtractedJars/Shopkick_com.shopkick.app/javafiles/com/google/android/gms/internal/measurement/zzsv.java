// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzss, zzst

final class zzsv extends zzss
{

	zzsv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void zzss()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class zzst>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void zzst()>
	//    6   12:putfield        #15  <Field zzst zzbsj>
	//    7   15:return          
	}

	public final void zza(Throwable throwable, PrintStream printstream)
	{
		throwable.printStackTrace(printstream);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #24  <Method void Throwable.printStackTrace(PrintStream)>
		throwable = ((Throwable) (zzbsj.zza(throwable, false)));
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field zzst zzbsj>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #27  <Method List zzst.zza(Throwable, boolean)>
	//    8   14:astore_1        
		if(throwable == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		throwable;
	//   12   20:aload_1         
		JVM INSTR monitorenter ;
	//   13   21:monitorenter    
		Throwable throwable1;
		for(Iterator iterator = ((List) (throwable)).iterator(); iterator.hasNext(); throwable1.printStackTrace(printstream))
	//*  14   22:aload_1         
	//*  15   23:invokeinterface #33  <Method Iterator List.iterator()>
	//*  16   28:astore_3        
	//*  17   29:aload_3         
	//*  18   30:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  19   35:ifeq            64
		{
			throwable1 = (Throwable)iterator.next();
	//   20   38:aload_3         
	//   21   39:invokeinterface #43  <Method Object Iterator.next()>
	//   22   44:checkcast       #20  <Class Throwable>
	//   23   47:astore          4
			printstream.print("Suppressed: ");
	//   24   49:aload_2         
	//   25   50:ldc1            #45  <String "Suppressed: ">
	//   26   52:invokevirtual   #51  <Method void PrintStream.print(String)>
		}

	//   27   55:aload           4
	//   28   57:aload_2         
	//   29   58:invokevirtual   #24  <Method void Throwable.printStackTrace(PrintStream)>
	//*  30   61:goto            29
		throwable;
	//   31   64:aload_1         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return;
	//   33   66:return          
		printstream;
	//   34   67:astore_2        
		throwable;
	//   35   68:aload_1         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		throw printstream;
	//   37   70:aload_2         
	//   38   71:athrow          
	}

	private final zzst zzbsj = new zzst();
}

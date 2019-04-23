// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzcu, zzcv

final class zzcx extends zzcu
{

	zzcx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void zzcu()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class zzcv>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void zzcv()>
	//    6   12:putfield        #15  <Field zzcv zzlw>
	//    7   15:return          
	}

	public final void zza(Throwable throwable)
	{
		throwable.printStackTrace();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method void Throwable.printStackTrace()>
		throwable = ((Throwable) (zzlw.zza(throwable, false)));
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field zzcv zzlw>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #26  <Method List zzcv.zza(Throwable, boolean)>
	//    7   13:astore_1        
		if(throwable == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
		throwable;
	//   11   19:aload_1         
		JVM INSTR monitorenter ;
	//   12   20:monitorenter    
		Throwable throwable1;
		for(Iterator iterator = ((List) (throwable)).iterator(); iterator.hasNext(); throwable1.printStackTrace())
	//*  13   21:aload_1         
	//*  14   22:invokeinterface #32  <Method Iterator List.iterator()>
	//*  15   27:astore_2        
	//*  16   28:aload_2         
	//*  17   29:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//*  18   34:ifeq            62
		{
			throwable1 = (Throwable)iterator.next();
	//   19   37:aload_2         
	//   20   38:invokeinterface #42  <Method Object Iterator.next()>
	//   21   43:checkcast       #20  <Class Throwable>
	//   22   46:astore_3        
			System.err.print("Suppressed: ");
	//   23   47:getstatic       #48  <Field PrintStream System.err>
	//   24   50:ldc1            #50  <String "Suppressed: ">
	//   25   52:invokevirtual   #56  <Method void PrintStream.print(String)>
		}

	//   26   55:aload_3         
	//   27   56:invokevirtual   #23  <Method void Throwable.printStackTrace()>
	//*  28   59:goto            28
		throwable;
	//   29   62:aload_1         
		JVM INSTR monitorexit ;
	//   30   63:monitorexit     
		return;
	//   31   64:return          
		Exception exception;
		exception;
	//   32   65:astore_2        
		throwable;
	//   33   66:aload_1         
		JVM INSTR monitorexit ;
	//   34   67:monitorexit     
		throw exception;
	//   35   68:aload_2         
	//   36   69:athrow          
	}

	private final zzcv zzlw = new zzcv();
}

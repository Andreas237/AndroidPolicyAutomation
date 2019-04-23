// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqb, aqc

final class aqe extends aqb
{

	aqe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void aqb()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class aqc>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void aqc()>
	//    6   12:putfield        #15  <Field aqc a>
	//    7   15:return          
	}

	public final void a(Throwable throwable)
	{
		throwable.printStackTrace();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void Throwable.printStackTrace()>
		throwable = ((Throwable) (a.a(throwable, false)));
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field aqc a>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #25  <Method List aqc.a(Throwable, boolean)>
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
	//*  14   22:invokeinterface #31  <Method Iterator List.iterator()>
	//*  15   27:astore_2        
	//*  16   28:aload_2         
	//*  17   29:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  18   34:ifeq            62
		{
			throwable1 = (Throwable)iterator.next();
	//   19   37:aload_2         
	//   20   38:invokeinterface #41  <Method Object Iterator.next()>
	//   21   43:checkcast       #19  <Class Throwable>
	//   22   46:astore_3        
			System.err.print("Suppressed: ");
	//   23   47:getstatic       #47  <Field PrintStream System.err>
	//   24   50:ldc1            #49  <String "Suppressed: ">
	//   25   52:invokevirtual   #55  <Method void PrintStream.print(String)>
		}

	//   26   55:aload_3         
	//   27   56:invokevirtual   #22  <Method void Throwable.printStackTrace()>
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

	public final void a(Throwable throwable, PrintWriter printwriter)
	{
		throwable.printStackTrace(printwriter);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #59  <Method void Throwable.printStackTrace(PrintWriter)>
		throwable = ((Throwable) (a.a(throwable, false)));
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field aqc a>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #25  <Method List aqc.a(Throwable, boolean)>
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
		for(Iterator iterator = ((List) (throwable)).iterator(); iterator.hasNext(); throwable1.printStackTrace(printwriter))
	//*  14   22:aload_1         
	//*  15   23:invokeinterface #31  <Method Iterator List.iterator()>
	//*  16   28:astore_3        
	//*  17   29:aload_3         
	//*  18   30:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  19   35:ifeq            64
		{
			throwable1 = (Throwable)iterator.next();
	//   20   38:aload_3         
	//   21   39:invokeinterface #41  <Method Object Iterator.next()>
	//   22   44:checkcast       #19  <Class Throwable>
	//   23   47:astore          4
			printwriter.print("Suppressed: ");
	//   24   49:aload_2         
	//   25   50:ldc1            #49  <String "Suppressed: ">
	//   26   52:invokevirtual   #62  <Method void PrintWriter.print(String)>
		}

	//   27   55:aload           4
	//   28   57:aload_2         
	//   29   58:invokevirtual   #59  <Method void Throwable.printStackTrace(PrintWriter)>
	//*  30   61:goto            29
		throwable;
	//   31   64:aload_1         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return;
	//   33   66:return          
		printwriter;
	//   34   67:astore_2        
		throwable;
	//   35   68:aload_1         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		throw printwriter;
	//   37   70:aload_2         
	//   38   71:athrow          
	}

	private final aqc a = new aqc();
}

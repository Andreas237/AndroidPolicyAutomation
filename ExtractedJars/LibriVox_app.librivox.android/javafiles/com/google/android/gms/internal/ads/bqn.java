// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqm, wx, bqo, aag

final class bqn
	implements Runnable
{

	bqn(bqm bqm1)
	{
		a = bqm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bqm a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		Object obj = bqm.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bqm a>
	//    2    4:invokestatic    #24  <Method Object bqm.a(bqm)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		Iterator iterator;
		if(!bqm.b(a) || !bqm.c(a))
			break MISSING_BLOCK_LABEL_96;
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field bqm a>
	//    8   14:invokestatic    #28  <Method boolean bqm.b(bqm)>
	//    9   17:ifeq            96
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field bqm a>
	//   12   24:invokestatic    #31  <Method boolean bqm.c(bqm)>
	//   13   27:ifeq            96
		bqm.a(a, false);
	//   14   30:aload_0         
	//   15   31:getfield        #12  <Field bqm a>
	//   16   34:iconst_0        
	//   17   35:invokestatic    #34  <Method boolean bqm.a(bqm, boolean)>
	//   18   38:pop             
		wx.b("App went background");
	//   19   39:ldc1            #36  <String "App went background">
	//   20   41:invokestatic    #41  <Method void wx.b(String)>
		iterator = bqm.d(a).iterator();
	//   21   44:aload_0         
	//   22   45:getfield        #12  <Field bqm a>
	//   23   48:invokestatic    #45  <Method List bqm.d(bqm)>
	//   24   51:invokeinterface #51  <Method Iterator List.iterator()>
	//   25   56:astore_2        
_L1:
		bqo bqo1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_101;
	//   26   57:aload_2         
	//   27   58:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   28   63:ifeq            101
		bqo1 = (bqo)iterator.next();
	//   29   66:aload_2         
	//   30   67:invokeinterface #61  <Method Object Iterator.next()>
	//   31   72:checkcast       #63  <Class bqo>
	//   32   75:astore_3        
		bqo1.a(false);
	//   33   76:aload_3         
	//   34   77:iconst_0        
	//   35   78:invokeinterface #66  <Method void bqo.a(boolean)>
		  goto _L1
	//*  36   83:goto            57
		Exception exception1;
		exception1;
	//   37   86:astore_3        
		aag.b("", ((Throwable) (exception1)));
	//   38   87:ldc1            #68  <String "">
	//   39   89:aload_3         
	//   40   90:invokestatic    #73  <Method void aag.b(String, Throwable)>
		  goto _L1
	//*  41   93:goto            57
		wx.b("App is still foreground");
	//   42   96:ldc1            #75  <String "App is still foreground">
	//   43   98:invokestatic    #41  <Method void wx.b(String)>
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

	private final bqm a;
}

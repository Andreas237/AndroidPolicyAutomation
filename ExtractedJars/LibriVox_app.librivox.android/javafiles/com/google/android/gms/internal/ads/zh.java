// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.common.internal.am;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx

public final class zh
{

	public zh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field HandlerThread a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Handler b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #23  <Field int c>
	//   11   19:aload_0         
	//   12   20:new             #4   <Class Object>
	//   13   23:dup             
	//   14   24:invokespecial   #17  <Method void Object()>
	//   15   27:putfield        #25  <Field Object d>
	//   16   30:return          
	}

	public final Looper a()
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object d>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(c != 0)
			break MISSING_BLOCK_LABEL_87;
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field int c>
	//    7   11:ifne            87
		if(a == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #19  <Field HandlerThread a>
	//*  10   18:ifnonnull       72
		{
			wx.a("Starting the looper thread.");
	//   11   21:ldc1            #29  <String "Starting the looper thread.">
	//   12   23:invokestatic    #34  <Method void wx.a(String)>
			a = new HandlerThread("LooperProvider");
	//   13   26:aload_0         
	//   14   27:new             #36  <Class HandlerThread>
	//   15   30:dup             
	//   16   31:ldc1            #38  <String "LooperProvider">
	//   17   33:invokespecial   #40  <Method void HandlerThread(String)>
	//   18   36:putfield        #19  <Field HandlerThread a>
			a.start();
	//   19   39:aload_0         
	//   20   40:getfield        #19  <Field HandlerThread a>
	//   21   43:invokevirtual   #43  <Method void HandlerThread.start()>
			b = new Handler(a.getLooper());
	//   22   46:aload_0         
	//   23   47:new             #45  <Class Handler>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #19  <Field HandlerThread a>
	//   27   55:invokevirtual   #48  <Method Looper HandlerThread.getLooper()>
	//   28   58:invokespecial   #51  <Method void Handler(Looper)>
	//   29   61:putfield        #21  <Field Handler b>
			wx.a("Looper thread started.");
	//   30   64:ldc1            #53  <String "Looper thread started.">
	//   31   66:invokestatic    #34  <Method void wx.a(String)>
			break MISSING_BLOCK_LABEL_97;
	//   32   69:goto            97
		}
		wx.a("Resuming the looper thread");
	//   33   72:ldc1            #55  <String "Resuming the looper thread">
	//   34   74:invokestatic    #34  <Method void wx.a(String)>
		d.notifyAll();
	//   35   77:aload_0         
	//   36   78:getfield        #25  <Field Object d>
	//   37   81:invokevirtual   #58  <Method void Object.notifyAll()>
		break MISSING_BLOCK_LABEL_97;
	//   38   84:goto            97
		am.a(((Object) (a)), "Invalid state: mHandlerThread should already been initialized.");
	//   39   87:aload_0         
	//   40   88:getfield        #19  <Field HandlerThread a>
	//   41   91:ldc1            #60  <String "Invalid state: mHandlerThread should already been initialized.">
	//   42   93:invokestatic    #65  <Method Object am.a(Object, Object)>
	//   43   96:pop             
		Looper looper;
		c = c + 1;
	//   44   97:aload_0         
	//   45   98:aload_0         
	//   46   99:getfield        #23  <Field int c>
	//   47  102:iconst_1        
	//   48  103:iadd            
	//   49  104:putfield        #23  <Field int c>
		looper = a.getLooper();
	//   50  107:aload_0         
	//   51  108:getfield        #19  <Field HandlerThread a>
	//   52  111:invokevirtual   #48  <Method Looper HandlerThread.getLooper()>
	//   53  114:astore_2        
		obj;
	//   54  115:aload_1         
		JVM INSTR monitorexit ;
	//   55  116:monitorexit     
		return looper;
	//   56  117:aload_2         
	//   57  118:areturn         
		Exception exception;
		exception;
	//   58  119:astore_2        
		obj;
	//   59  120:aload_1         
		JVM INSTR monitorexit ;
	//   60  121:monitorexit     
		throw exception;
	//   61  122:aload_2         
	//   62  123:athrow          
	}

	public final Handler b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Handler b>
	//    2    4:areturn         
	}

	private HandlerThread a;
	private Handler b;
	private int c;
	private final Object d = new Object();
}

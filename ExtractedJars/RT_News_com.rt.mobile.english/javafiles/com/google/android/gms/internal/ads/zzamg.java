// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb

public final class zzamg
{

	public zzamg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcts = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field HandlerThread zzcts>
		mHandler = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Handler mHandler>
		zzctt = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #23  <Field int zzctt>
	//   11   19:aload_0         
	//   12   20:new             #4   <Class Object>
	//   13   23:dup             
	//   14   24:invokespecial   #17  <Method void Object()>
	//   15   27:putfield        #25  <Field Object mLock>
	//   16   30:return          
	}

	public final Handler getHandler()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Handler mHandler>
	//    2    4:areturn         
	}

	public final Looper zzsa()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzctt != 0)
			break MISSING_BLOCK_LABEL_87;
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field int zzctt>
	//    7   11:ifne            87
		if(zzcts == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #19  <Field HandlerThread zzcts>
	//*  10   18:ifnonnull       72
		{
			zzakb.v("Starting the looper thread.");
	//   11   21:ldc1            #32  <String "Starting the looper thread.">
	//   12   23:invokestatic    #38  <Method void zzakb.v(String)>
			zzcts = new HandlerThread("LooperProvider");
	//   13   26:aload_0         
	//   14   27:new             #40  <Class HandlerThread>
	//   15   30:dup             
	//   16   31:ldc1            #42  <String "LooperProvider">
	//   17   33:invokespecial   #44  <Method void HandlerThread(String)>
	//   18   36:putfield        #19  <Field HandlerThread zzcts>
			zzcts.start();
	//   19   39:aload_0         
	//   20   40:getfield        #19  <Field HandlerThread zzcts>
	//   21   43:invokevirtual   #47  <Method void HandlerThread.start()>
			mHandler = new Handler(zzcts.getLooper());
	//   22   46:aload_0         
	//   23   47:new             #49  <Class Handler>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #19  <Field HandlerThread zzcts>
	//   27   55:invokevirtual   #52  <Method Looper HandlerThread.getLooper()>
	//   28   58:invokespecial   #55  <Method void Handler(Looper)>
	//   29   61:putfield        #21  <Field Handler mHandler>
			zzakb.v("Looper thread started.");
	//   30   64:ldc1            #57  <String "Looper thread started.">
	//   31   66:invokestatic    #38  <Method void zzakb.v(String)>
			break MISSING_BLOCK_LABEL_97;
	//   32   69:goto            97
		}
		zzakb.v("Resuming the looper thread");
	//   33   72:ldc1            #59  <String "Resuming the looper thread">
	//   34   74:invokestatic    #38  <Method void zzakb.v(String)>
		mLock.notifyAll();
	//   35   77:aload_0         
	//   36   78:getfield        #25  <Field Object mLock>
	//   37   81:invokevirtual   #62  <Method void Object.notifyAll()>
		break MISSING_BLOCK_LABEL_97;
	//   38   84:goto            97
		Preconditions.checkNotNull(((Object) (zzcts)), "Invalid state: mHandlerThread should already been initialized.");
	//   39   87:aload_0         
	//   40   88:getfield        #19  <Field HandlerThread zzcts>
	//   41   91:ldc1            #64  <String "Invalid state: mHandlerThread should already been initialized.">
	//   42   93:invokestatic    #70  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   43   96:pop             
		Looper looper;
		zzctt = zzctt + 1;
	//   44   97:aload_0         
	//   45   98:aload_0         
	//   46   99:getfield        #23  <Field int zzctt>
	//   47  102:iconst_1        
	//   48  103:iadd            
	//   49  104:putfield        #23  <Field int zzctt>
		looper = zzcts.getLooper();
	//   50  107:aload_0         
	//   51  108:getfield        #19  <Field HandlerThread zzcts>
	//   52  111:invokevirtual   #52  <Method Looper HandlerThread.getLooper()>
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

	private Handler mHandler;
	private final Object mLock = new Object();
	private HandlerThread zzcts;
	private int zzctt;
}
